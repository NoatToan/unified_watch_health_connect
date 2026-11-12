package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.xiaomi.mipush.sdk.r;

/* JADX INFO: loaded from: classes11.dex */
public class cet implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f5264a;

    public cet(Context context) {
        this.f5264a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            PackageInfo packageInfo = this.f5264a.getPackageManager().getPackageInfo(this.f5264a.getPackageName(), 4612);
            r.j(this.f5264a);
            r.l(this.f5264a, packageInfo);
            r.k(this.f5264a, packageInfo);
        } catch (Throwable unused) {
        }
    }
}
