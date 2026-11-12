package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes5.dex */
public final class dos {
    public static final pbt c = new pbt("PackageStateCache");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15767b = -1;

    public dos(Context context) {
        this.f15766a = context;
    }

    public final synchronized int a() {
        if (this.f15767b == -1) {
            try {
                this.f15767b = this.f15766a.getPackageManager().getPackageInfo(this.f15766a.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                c.b("The current version of the app could not be retrieved", new Object[0]);
            }
        }
        return this.f15767b;
    }
}
