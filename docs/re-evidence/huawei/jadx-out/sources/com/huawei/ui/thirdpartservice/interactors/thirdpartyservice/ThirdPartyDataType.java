package com.huawei.ui.thirdpartservice.interactors.thirdpartyservice;

/* JADX INFO: loaded from: classes20.dex */
public class ThirdPartyDataType {

    public enum DataType {
        STEP,
        CALORIES,
        SLEEP,
        SPORT,
        NONE
    }

    public enum Platform {
        HEALTH_CONNECT
    }

    public static String b(Platform platform, DataType dataType) {
        return platform.name() + dataType.name();
    }
}
