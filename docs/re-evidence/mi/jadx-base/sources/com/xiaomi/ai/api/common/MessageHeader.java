package com.xiaomi.ai.api.common;

import com.xiaomi.ai.api.common.MessageHeader;

/* JADX INFO: loaded from: classes6.dex */
public abstract class MessageHeader<T extends MessageHeader<?>> {
    private String name;
    private String namespace;

    public MessageHeader() {
    }

    public String getFullName() {
        return this.namespace + "." + this.name;
    }

    public String getName() {
        return this.name;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNamespace(String str) {
        this.namespace = str;
    }

    public String toString() {
        return String.format("%s(%s, %s)", getClass().getName(), this.namespace, this.name);
    }

    public MessageHeader(String str, String str2) {
        this.namespace = str;
        this.name = str2;
    }
}
