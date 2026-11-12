package com.xiaomi.digitalkey.wearable.utils;

import android.os.Build;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class ECDHFactory {
    public static IECDHAlgorithm getECDHGenerator() throws IOException {
        return Build.VERSION.SDK_INT > 31 ? new ECDHAlgorithm32Impl() : new ECDHAlgorithmDefaultImpl();
    }
}
