package com.xiaomi.miio;

/* JADX INFO: loaded from: classes11.dex */
public enum MiioLocalAPI$WifiEnc {
    OPEN(1, ""),
    WEP_PSK(2, "[WEP]"),
    WEP_SHARED(3, "[WEP]"),
    WPA_TKIP_PSK(4, "[WPA-PSK-TKIP]"),
    WPA_AES_PSK(5, "[WPA-PSK-CCMP]"),
    WPA2_AES_PSK(6, "[WPA2-PSK-CCMP]"),
    WPA2_TKIP_PSK(7, "[WPA2-PSK-TKIP]"),
    WPA2_MIXED_PSK(8, "[WPA2-PSK-CCMP+TKIP]"),
    WPA2_MIXED_PSK1(8, "[WPA2-PSK-TKIP+CCMP]"),
    WPA_MIXED_PSK(9, "[WPA-PSK-CCMP+TKIP]"),
    WPA_MIXED_PSK1(9, "[WPA-PSK-TKIP+CCMP]");

    private String capability;
    private byte type;

    MiioLocalAPI$WifiEnc(int i, String str) {
        this.type = (byte) i;
        this.capability = str;
    }

    public String getCapability() {
        return this.capability;
    }

    public byte getType() {
        return this.type;
    }

    public void setCapability(String str) {
        this.capability = str;
    }

    public void setType(byte b2) {
        this.type = b2;
    }
}
