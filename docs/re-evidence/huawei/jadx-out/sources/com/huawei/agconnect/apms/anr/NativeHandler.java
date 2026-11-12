package com.huawei.agconnect.apms.anr;

import android.os.Build;
import com.huawei.agconnect.apms.Agent;
import com.huawei.agconnect.apms.bcd;
import com.huawei.agconnect.apms.klm;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public class NativeHandler extends klm {
    public static NativeHandler efg;

    public NativeHandler() {
        this.bcd = new HashSet();
    }

    public static void abc(boolean z) {
        if (Agent.isDisabled() || !z) {
            klm.def.warn("APMS agent or anr monitor is disabled, please enable.");
            return;
        }
        int i = Build.VERSION.SDK_INT;
        try {
            System.loadLibrary("apms_ndk_anr");
            try {
                int iInitNativeAnr = initNativeAnr(i);
                if (iInitNativeAnr != 0) {
                    klm.def.error("fail to init native anr, code: " + iInitNativeAnr);
                }
            } catch (Throwable th) {
                bcd.abc(th, com.huawei.agconnect.apms.abc.abc("fail to init native anr, "), klm.def);
            }
        } catch (Throwable th2) {
            bcd.abc(th2, com.huawei.agconnect.apms.abc.abc("fail to load apm anr so library, "), klm.def);
        }
    }

    private static void anrCallback() {
        if (Agent.isDisabled()) {
            return;
        }
        if (efg == null) {
            efg = new NativeHandler();
        }
        efg.abc();
    }

    private static native int initNativeAnr(int i);
}
