package defpackage;

import android.content.Context;
import com.xiaomi.passport.accountmanager.XiaomiAccountManager;

/* JADX INFO: loaded from: classes9.dex */
public class b8r implements nuc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public XiaomiAccountManager f3929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public na4 f3930b = new na4();

    public b8r(Context context) {
        this.f3929a = XiaomiAccountManager.get(context);
    }

    public void a() {
        this.f3930b.d();
    }
}
