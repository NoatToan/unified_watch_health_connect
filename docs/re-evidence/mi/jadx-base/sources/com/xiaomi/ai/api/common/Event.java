package com.xiaomi.ai.api.common;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class Event<T> extends Message<EventHeader, T> {
    private List<Context> context;

    public Event() {
        this.context = null;
    }

    public Event addContext(Context context) {
        getContexts().add(context);
        return this;
    }

    public List<Context> getContexts() {
        if (this.context == null) {
            this.context = new ArrayList();
        }
        return this.context;
    }

    public String getId() {
        return getHeader().getId();
    }

    public void setContext(List<Context> list) {
        this.context = list;
    }

    public Event(EventHeader eventHeader, T t) {
        super(eventHeader, t);
        this.context = null;
    }

    public Event(List<Context> list, EventHeader eventHeader, T t) {
        super(eventHeader, t);
        this.context = list;
    }
}
