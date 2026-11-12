package com.miui.tsmclient.util;

import android.content.Context;
import com.miui.tsmclientsdk.UnSupportedException;

/* JADX INFO: loaded from: classes6.dex */
public class NfcConfig {
    private static final String SIMPLE_NAME = ".mitsmsdk.NfcConfigImpl";
    private static INfcConfig sNfcConfig;

    public interface INfcConfig {
        boolean setConfigByUrl(Context context, String str) throws UnSupportedException;
    }

    private static synchronized INfcConfig getNfcConfig(Context context) {
        try {
            if (sNfcConfig == null) {
                Object objNewInstance = ReflectUtil.newInstance(context.getPackageName() + SIMPLE_NAME, (Class<?>[]) new Class[0], new Object[0]);
                if (objNewInstance instanceof INfcConfig) {
                    sNfcConfig = (INfcConfig) objNewInstance;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return sNfcConfig;
    }

    public static boolean setConfigByUrl(Context context, String str) throws UnSupportedException {
        INfcConfig nfcConfig = getNfcConfig(context);
        if (nfcConfig != null) {
            return nfcConfig.setConfigByUrl(context, str);
        }
        throw new UnSupportedException();
    }
}
