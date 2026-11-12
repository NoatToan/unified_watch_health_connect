package com.xiaomi.ai.api.common;

import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes6.dex */
public class EventHeader extends MessageHeader<EventHeader> {
    private String id;
    private Optional<Boolean> is_passive;

    public EventHeader() {
    }

    public String getId() {
        return this.id;
    }

    public Optional<Boolean> getIsPassive() {
        return this.is_passive;
    }

    public EventHeader setId(String str) {
        this.id = str;
        return this;
    }

    public EventHeader setIsPassive(Boolean bool) {
        this.is_passive = Optional.e(bool);
        return this;
    }

    public EventHeader(String str, String str2) {
        super(str, str2);
    }
}
