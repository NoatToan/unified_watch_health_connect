package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Binder;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class t5s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pbt f34351a = new pbt("PhoneskyVerificationUtils");

    public static boolean a(Context context) {
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(Binder.getCallingUid());
        return packagesForUid != null && Arrays.asList(packagesForUid).contains("com.android.vending");
    }

    public static boolean b(Context context) {
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                    if (signatureArr == null || (signatureArr.length) == 0) {
                        f34351a.e("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (Signature signature : signatureArr) {
                            String strA = o5s.a(signature.toByteArray());
                            arrayList.add(strA);
                            if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strA)) {
                                String str = Build.TAGS;
                                if ((!str.contains("dev-keys") && !str.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strA)) {
                                }
                            }
                            return true;
                        }
                        pbt pbtVar = f34351a;
                        Object[] objArr = new Object[1];
                        StringBuilder sb = new StringBuilder();
                        Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            while (true) {
                                sb.append((CharSequence) it.next());
                                if (!it.hasNext()) {
                                    break;
                                }
                                sb.append((CharSequence) ", ");
                            }
                        }
                        objArr[0] = sb.toString();
                        pbtVar.e(String.format("Play Store package certs are not valid. Found these sha256 certs: [%s].", objArr), new Object[0]);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    f34351a.e("Play Store package is not found.", new Object[0]);
                }
            } else {
                f34351a.e("Play Store package is disabled.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            f34351a.e("Play Store package is not found.", new Object[0]);
        }
        return false;
    }
}
