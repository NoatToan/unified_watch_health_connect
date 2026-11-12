package com.huawei.watchface;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes20.dex */
public abstract class i5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArray f30235a;

    static {
        SparseArray sparseArray = new SparseArray();
        f30235a = sparseArray;
        sparseArray.put(20001, "File info check fail");
        sparseArray.put(20002, "getDeviceInfoByBt() failed");
        sparseArray.put(20003, "Send watchface info to device failed");
        sparseArray.put(20004, "getSupportedClockCapability() failed -- exception msg");
        sparseArray.put(20005, "loadProperties() failed -- exception msg");
        sparseArray.put(20006, "updateWearStructListByXmlRes() failed -- exception msg");
        sparseArray.put(20007, "setBackgroundOptionalConfig() failed -- exception msg");
        sparseArray.put(20008, "createRoundedPngRes() failed -- exception msg");
    }

    public static String a(int i) {
        return (String) f30235a.get(i);
    }
}
