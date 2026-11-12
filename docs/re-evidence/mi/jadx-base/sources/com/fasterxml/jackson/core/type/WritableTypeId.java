package com.fasterxml.jackson.core.type;

import com.fasterxml.jackson.core.JsonToken;

/* JADX INFO: loaded from: classes4.dex */
public class WritableTypeId {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f7625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Class<?> f7626b;
    public Object c;
    public String d;
    public Inclusion e;
    public JsonToken f;
    public boolean g;

    public enum Inclusion {
        WRAPPER_ARRAY,
        WRAPPER_OBJECT,
        METADATA_PROPERTY,
        PAYLOAD_PROPERTY,
        PARENT_PROPERTY;

        public boolean requiresObjectContext() {
            return this == METADATA_PROPERTY || this == PAYLOAD_PROPERTY;
        }
    }

    public WritableTypeId(Object obj, JsonToken jsonToken) {
        this(obj, jsonToken, null);
    }

    public WritableTypeId(Object obj, JsonToken jsonToken, Object obj2) {
        this.f7625a = obj;
        this.c = obj2;
        this.f = jsonToken;
    }
}
