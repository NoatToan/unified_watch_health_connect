package com.google.firebase.events;

import com.google.firebase.components.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public class Event<T> {
    private final Class<T> a;
    private final T b;

    public Event(Class<T> cls, T t) {
        this.a = (Class) Preconditions.checkNotNull(cls);
        this.b = (T) Preconditions.checkNotNull(t);
    }

    public T getPayload() {
        return this.b;
    }

    public Class<T> getType() {
        return this.a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.a, this.b);
    }
}
