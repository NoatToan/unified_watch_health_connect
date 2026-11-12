package com.xiaomi.ai.api.intent;

import com.xiaomi.common.Optional;
import defpackage.zsd;

/* JADX INFO: loaded from: classes7.dex */
public class Resolution {
    private Optional<zsd> ext;
    private String raw_value;
    private Optional<String> skill_value;

    public Resolution() {
    }

    public Optional<zsd> getExt() {
        return this.ext;
    }

    public String getRaw_value() {
        return this.raw_value;
    }

    public Optional<String> getSkill_value() {
        return this.skill_value;
    }

    public void setExt(Optional<zsd> optional) {
        this.ext = optional;
    }

    public void setRaw_value(String str) {
        this.raw_value = str;
    }

    public void setSkill_value(Optional<String> optional) {
        this.skill_value = optional;
    }

    public Resolution(String str) {
        this.raw_value = str;
    }

    public Resolution(String str, Optional<String> optional) {
        this.raw_value = str;
        this.skill_value = optional;
    }

    public Resolution(String str, Optional<String> optional, Optional<zsd> optional2) {
        this.raw_value = str;
        this.skill_value = optional;
        this.ext = optional2;
    }
}
