package com.xiaomi.ai.api.intent;

import com.xiaomi.common.Optional;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class SlotInfo {
    private String name;
    private boolean required;
    private String type;
    private Optional<List<String>> values;

    public SlotInfo() {
        this.values = Optional.a();
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public Optional<List<String>> getValues() {
        return this.values;
    }

    public boolean isRequired() {
        return this.required;
    }

    public SlotInfo setName(String str) {
        this.name = str;
        return this;
    }

    public SlotInfo setRequired(boolean z) {
        this.required = z;
        return this;
    }

    public SlotInfo setType(String str) {
        this.type = str;
        return this;
    }

    public SlotInfo setValues(Optional<List<String>> optional) {
        this.values = optional;
        return this;
    }

    public SlotInfo(String str, boolean z, String str2) {
        this.values = Optional.a();
        this.name = str;
        this.required = z;
        this.type = str2;
    }

    public SlotInfo(String str, boolean z, String str2, Optional<List<String>> optional) {
        Optional.a();
        this.name = str;
        this.required = z;
        this.type = str2;
        this.values = optional;
    }
}
