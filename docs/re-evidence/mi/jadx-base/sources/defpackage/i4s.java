package defpackage;

import android.content.Context;
import com.xiaomi.push.i;
import com.xiaomi.push.ib;
import com.xiaomi.push.ih;
import com.xiaomi.push.il;
import com.xiaomi.push.it;
import com.xiaomi.push.ja;

/* JADX INFO: loaded from: classes11.dex */
public class i4s extends k5s.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f20789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20790b = false;

    public i4s(Context context) {
        this.f20789a = context;
    }

    @Override // k5s.a
    public String a() {
        return "2";
    }

    @Override // java.lang.Runnable
    public void run() {
        vas vasVarD = vas.d(this.f20789a);
        it itVar = new it();
        if (this.f20790b) {
            itVar.a(0);
            itVar.b(0);
        } else {
            itVar.a(yas.a(vasVarD, ih.MISC_CONFIG));
            itVar.b(yas.a(vasVarD, ih.PLUGIN_CONFIG));
        }
        ja jaVar = new ja("-1", false);
        jaVar.c(il.DailyCheckClientConfig.f125a);
        jaVar.a(i.e(itVar));
        x9s.A("OcVersionCheckJob", "-->check version: checkMessage=", itVar);
        d6s.c(this.f20789a).w(jaVar, ib.Notification, null);
    }
}
