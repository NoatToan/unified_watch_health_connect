package com.garmin.android.apps.connectmobile.connectiq;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Binder;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connectiq/o0;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0 f31930a = new o0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f31931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<String> f31932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f31933d;

    static {
        List<String> listK = p13.x.k("HEIr5yy3eXd1ynm5SueBb-3LsOp9aEYClzuRNXxJzFc", "OYfQQ9EK769ahxCzZxQY_lfg4ZtlPJ34JVj-tf_OXUQ");
        f31931b = listK;
        List<String> listC = p13.w.c("ZDGzxtZUafh0Nb_0KPUKscpcu4f1YBkHDwPA6OOeFik");
        f31932c = listC;
        f31933d = p13.u0.e(new o13.p("com.whatsapp", listK), new o13.p("com.garmin.android.apps.connectiq.sample.comm", listC));
    }

    private o0() {
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Map] */
    public static boolean a(Context context, String str) {
        List list;
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
            packageInfo.getClass();
            if (!p005kotlin.jvm.internal.s.g(str, packageInfo.packageName)) {
                com.garmin.proto.generated.a.h(androidx.room.a0.j("Package name mismatch: expected ", str, ", found ", packageInfo.packageName));
                return false;
            }
            SigningInfo signingInfo = packageInfo.signingInfo;
            Signature[] signingCertificateHistory = (signingInfo == null || signingInfo.hasMultipleSigners()) ? packageInfo.signatures : signingInfo.getSigningCertificateHistory();
            if (signingCertificateHistory == null || signingCertificateHistory.length == 0) {
                com.garmin.proto.generated.a.h(fb1.c.n("No signatures found for package: ", str));
                return false;
            }
            try {
                String strEncodeToString = Base64.encodeToString(MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256).digest(signingCertificateHistory[0].toByteArray()), 11);
                strEncodeToString.getClass();
                ?? r14 = f31933d;
                return r14.containsKey(str) && (list = (List) r14.get(str)) != null && list.contains(strEncodeToString);
            } catch (NoSuchAlgorithmException e4) {
                vb.h.q(e4);
                return false;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            com.garmin.proto.generated.a.h(fb1.c.n("Package not found: ", str));
            return false;
        }
    }

    public static void b(Context context) {
        context.getClass();
        int callingUid = Binder.getCallingUid();
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(callingUid);
        if (packagesForUid == null || packagesForUid.length == 0) {
            com.garmin.proto.generated.a.h(am.j.h(callingUid, "No packages found for UID: "));
            return;
        }
        if (packagesForUid.length > 1) {
            com.garmin.proto.generated.a.h(am.j.h(callingUid, "Multiple packages found for UID: "));
            return;
        }
        String str = packagesForUid[0];
        str.getClass();
        if (a(context, str)) {
            return;
        }
        com.garmin.proto.generated.a.h("Untrusted package: ".concat(str));
    }
}
