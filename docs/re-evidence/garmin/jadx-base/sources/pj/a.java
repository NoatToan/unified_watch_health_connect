package pj;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import qj.m;
import ui.e;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f137870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f137871c;

    private a(int i14, e eVar) {
        this.f137870b = i14;
        this.f137871c = eVar;
    }

    public static a c(Context context) {
        PackageInfo packageInfo;
        ConcurrentHashMap concurrentHashMap = b.f137872a;
        String packageName = context.getPackageName();
        ConcurrentHashMap concurrentHashMap2 = b.f137872a;
        e eVar = (e) concurrentHashMap2.get(packageName);
        if (eVar == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused) {
                context.getPackageName();
                packageInfo = null;
            }
            d dVar = new d(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
            e eVar2 = (e) concurrentHashMap2.putIfAbsent(packageName, dVar);
            eVar = eVar2 == null ? dVar : eVar2;
        }
        return new a(context.getResources().getConfiguration().uiMode & 48, eVar);
    }

    @Override // ui.e
    public final void b(MessageDigest messageDigest) {
        this.f137871c.b(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f137870b).array());
    }

    @Override // ui.e
    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f137870b == aVar.f137870b && this.f137871c.equals(aVar.f137871c)) {
                return true;
            }
        }
        return false;
    }

    @Override // ui.e
    public final int hashCode() {
        return m.h(this.f137870b, this.f137871c);
    }
}
