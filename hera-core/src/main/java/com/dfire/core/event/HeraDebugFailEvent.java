package com.dfire.core.event;

import com.dfire.common.entity.HeraDebugHistory;
import com.dfire.core.event.base.ApplicationEvent;
import com.dfire.core.event.base.Events;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import javax.annotation.security.DenyAll;

/**
 * @author: <a href="mailto:lingxiao@2dfire.com">凌霄</a>
 * @time: Created in 下午3:34 2018/4/19
 * @desc
 */
@Builder
public class HeraDebugFailEvent extends ApplicationEvent {

    @Getter
    private final HeraDebugHistory debugHistory;
    private final Integer fileId;
    private final Throwable throwable;

    public HeraDebugFailEvent(HeraDebugHistory history, Integer fileId, Throwable t) {
        super(Events.JobFailed);
        this.fileId = fileId;
        this.debugHistory = history;
        this.throwable = t;
    }
}
