package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public class zrn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f54552c;
    public final String d;
    public final Set<String> e;

    public zrn(PackageInfo packageInfo, boolean z) {
        this(packageInfo.packageName, c(packageInfo.signatures), packageInfo.versionName, z);
    }

    public zrn(String str, Set<String> set, String str2, boolean z) {
        this.f54551b = str;
        this.e = set;
        this.d = str2;
        this.f54552c = Boolean.valueOf(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zrn)) {
            return false;
        }
        zrn zrnVar = (zrn) obj;
        return this.f54551b.equals(zrnVar.f54551b) && this.d.equals(zrnVar.d) && this.f54552c == zrnVar.f54552c && this.e.equals(zrnVar.e);
    }

    public int hashCode() {
        int iHashCode = (((this.f54551b.hashCode() * 92821) + this.d.hashCode()) * 92821) + (this.f54552c.booleanValue() ? 1 : 0);
        Iterator<String> it = this.e.iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 92821) + it.next().hashCode();
        }
        return iHashCode;
    }

    public static String e(Signature signature) {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-512").digest(signature.toByteArray()), 10);
        } catch (NoSuchAlgorithmException unused) {
            throw new IllegalStateException("Platform does not supportSHA-512 hashing");
        }
    }

    public static Set<String> c(Signature[] signatureArr) {
        HashSet hashSet = new HashSet();
        for (Signature signature : signatureArr) {
            hashSet.add(e(signature));
        }
        return hashSet;
    }
}
