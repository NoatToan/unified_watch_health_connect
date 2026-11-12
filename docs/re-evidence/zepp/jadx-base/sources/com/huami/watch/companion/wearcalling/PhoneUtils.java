package com.huami.watch.companion.wearcalling;

import android.telephony.TelephonyManager;
import com.android.internal.telephony.ITelephony;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes16.dex */
public class PhoneUtils {
    public static ITelephony getITelephony(TelephonyManager telephonyManager) throws Exception {
        Method declaredMethod = telephonyManager.getClass().getDeclaredMethod("getITelephony", new Class[0]);
        declaredMethod.setAccessible(true);
        return (ITelephony) declaredMethod.invoke(telephonyManager, new Object[0]);
    }
}
