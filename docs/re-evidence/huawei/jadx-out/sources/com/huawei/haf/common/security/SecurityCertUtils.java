package com.huawei.haf.common.security;

import android.content.Context;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import health.compact.a.EmuiBuild;
import health.compact.a.HarmonyBuild;
import health.compact.a.LogUtil;
import health.compact.a.ReflectionUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes2.dex */
public class SecurityCertUtils {
    private SecurityCertUtils() {
    }

    public static boolean e() {
        LogUtil.b("SecurityCertUtils", "initProvider() init");
        if ((!EmuiBuild.f36544b && !HarmonyBuild.e) || 21 > EmuiBuild.e) {
            LogUtil.c("SecurityCertUtils", "initKeyStoreProvider(), not support huks");
            return false;
        }
        try {
            ReflectionUtils.e(ReflectionUtils.e("com.huawei.security.keystore.HwUniversalKeyStoreProvider"), JsbMapKeyNames.H5_TEXT_DOWNLOAD_INSTALL, (Class<?>[]) new Class[0]).invoke(null, new Object[0]);
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            LogUtil.d("SecurityCertUtils", "initKeyStoreProvider() exception = ", LogUtil.c(e));
            return false;
        }
    }

    public static X509Certificate[] c(Context context, int[] iArr, byte[] bArr) {
        Throwable e;
        Object objInvoke;
        X509Certificate[] x509CertificateArr = null;
        if ((!EmuiBuild.f36544b && !HarmonyBuild.e) || 21 > EmuiBuild.e) {
            LogUtil.c("SecurityCertUtils", "getCertificateChains(),  not support huks");
            return null;
        }
        try {
            Method methodE = ReflectionUtils.e(ReflectionUtils.e("com.huawei.security.keystore.HwAttestationUtils"), "attestDeviceIds", (Class<?>[]) new Class[]{Context.class, int[].class, byte[].class});
            if (methodE == null || (objInvoke = methodE.invoke(null, context, iArr, bArr)) == null || !(objInvoke instanceof X509Certificate[])) {
                return null;
            }
            X509Certificate[] x509CertificateArr2 = (X509Certificate[]) objInvoke;
            try {
                LogUtil.c("SecurityCertUtils", "certs is", Integer.valueOf(x509CertificateArr2.length));
                return x509CertificateArr2;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                e = e2;
                x509CertificateArr = x509CertificateArr2;
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
            e = e3;
        }
        LogUtil.d("SecurityCertUtils", "getCertificateChain() exception = ", LogUtil.c(e));
        return x509CertificateArr;
    }
}
