package com.mapbox.common.experimental.wss_backend;

import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public class Data {
    private Type type;
    private Object value;

    public enum Type {
        BYTE_ARRAY,
        STRING
    }

    public Data(byte[] bArr) {
        this.type = Type.BYTE_ARRAY;
        this.value = bArr;
    }

    public static Data valueOf(byte[] bArr) {
        return new Data(bArr);
    }

    public byte[] getByteArray() {
        if (isByteArray()) {
            return (byte[]) this.value;
        }
        h.z("The content of the variant does not have type (byte[])");
        return null;
    }

    public String getString() {
        if (isString()) {
            return (String) this.value;
        }
        h.z("The content of the variant does not have type (String)");
        return null;
    }

    public Type getTypeInfo() {
        return this.type;
    }

    public boolean isByteArray() {
        return this.type == Type.BYTE_ARRAY;
    }

    public boolean isString() {
        return this.type == Type.STRING;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public static Data valueOf(String str) {
        return new Data(str);
    }

    public Data(String str) {
        this.type = Type.STRING;
        this.value = str;
    }
}
