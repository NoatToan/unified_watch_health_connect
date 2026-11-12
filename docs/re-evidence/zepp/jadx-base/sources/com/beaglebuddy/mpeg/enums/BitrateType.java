package com.beaglebuddy.mpeg.enums;

/* JADX INFO: loaded from: classes2.dex */
public enum BitrateType {
    CBR("constant bit rate"),
    VBR("variable bit rate");

    private String description;

    BitrateType(String str) {
        this.description = str;
    }

    public String getDescription() {
        return this.description;
    }
}
