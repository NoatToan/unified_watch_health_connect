package com.sensetime.senseid.sdk.liveness.silent;

/* JADX INFO: loaded from: classes18.dex */
enum NativeStaticInfoKey {
    DEVICE(0),
    OS(1),
    SDK_VERSION(2),
    SYS_VERSION(3),
    IS_ROOT(4),
    IDFA(5),
    CONTROL_SEQ(6),
    CUSTOMER_ID(7);

    private int mValue;

    NativeStaticInfoKey(int i) {
        this.mValue = -1;
        this.mValue = i;
    }

    public final int getKeyValue() {
        return this.mValue;
    }
}
