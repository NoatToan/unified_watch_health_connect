package com.xiaomi.hm.health.bt;

/* JADX INFO: loaded from: classes11.dex */
public interface ISBEListener {
    public static final int CLIENTIF_EXHAUST = 3;
    public static final int CONNECT_TIMEOUT = 1;
    public static final int DISCOVERY_TIMEOUT = 2;
    public static final int GATT_OPERATION_TIMEOUT = 5;
    public static final int NONE = 0;
    public static final int NO_GATT = 4;

    void onException(int i);
}
