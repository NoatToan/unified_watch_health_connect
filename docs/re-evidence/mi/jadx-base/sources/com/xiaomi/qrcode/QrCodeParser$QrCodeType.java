package com.xiaomi.qrcode;

/* JADX INFO: loaded from: classes11.dex */
public enum QrCodeParser$QrCodeType {
    WIFI("W"),
    NBIOT("N"),
    ZIGBEE_30("Z");

    public final String type;

    QrCodeParser$QrCodeType(String str) {
        this.type = str;
    }
}
