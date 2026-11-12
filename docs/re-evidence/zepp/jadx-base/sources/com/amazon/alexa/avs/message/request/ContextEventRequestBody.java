package com.amazon.alexa.avs.message.request;

import com.amazon.alexa.avs.message.request.context.ComponentState;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ContextEventRequestBody extends RequestBody {
    private final List<ComponentState> context;

    public ContextEventRequestBody(List<ComponentState> list, Event event) {
        super(event);
        this.context = list;
    }

    public final List<ComponentState> getContext() {
        return this.context;
    }
}
