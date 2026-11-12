package com.xiaomi.uplink;

/* JADX INFO: loaded from: classes2.dex */
public enum SmsUplinkConfig$UplinkScene {
    LOGIN("LG"),
    REGISTER("RG");

    String sceneId;

    SmsUplinkConfig$UplinkScene(String str) {
        this.sceneId = str;
    }

    public String getSceneId() {
        return this.sceneId;
    }
}
