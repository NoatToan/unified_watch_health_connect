package ez;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f67465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PackageManager f67466b;

    public d(e eVar, PackageManager packageManager) {
        this.f67465a = eVar;
        this.f67466b = packageManager;
    }

    public final a a(int i14) {
        PackageManager packageManager = this.f67466b;
        try {
            String[] packagesForUid = packageManager.getPackagesForUid(i14);
            if (packagesForUid == null) {
                throw new RuntimeException("PackageManager.getPackagesForUid should not return null here!");
            }
            if (packagesForUid.length > 1) {
                throw new RuntimeException("Shared UID is not allowed!");
            }
            Signature[] signatureArr = packageManager.getPackageInfo(packagesForUid[0], 64).signatures;
            if (signatureArr.length <= 1) {
                return new a(i14, packagesForUid[0], signatureArr[0].toByteArray());
            }
            throw new RuntimeException("packageInfo.signatures should contain only one signature.");
        } catch (PackageManager.NameNotFoundException e4) {
            q2.v("PackageManager.getPackagesForUid should throw a NameNotFoundException here!", e4);
            return null;
        }
    }
}
