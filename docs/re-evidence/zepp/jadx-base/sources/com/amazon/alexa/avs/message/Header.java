package com.amazon.alexa.avs.message;

/* JADX INFO: loaded from: classes2.dex */
public class Header {
    private String name;
    private String namespace;

    public Header() {
    }

    public final String getName() {
        return this.name;
    }

    public final String getNamespace() {
        return this.namespace;
    }

    public final void setName(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Header name must not be null");
        }
        this.name = str;
    }

    public final void setNamespace(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Header namespace must not be null");
        }
        this.namespace = str;
    }

    public String toString() {
        return String.format("%1$s:%2$s", this.namespace, this.name);
    }

    public Header(String str, String str2) {
        setNamespace(str);
        setName(str2);
    }
}
