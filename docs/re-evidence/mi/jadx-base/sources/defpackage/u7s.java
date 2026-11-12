package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.b;
import com.xiaomi.push.g;
import com.xiaomi.push.ib;
import com.xiaomi.push.il;
import com.xiaomi.push.ja;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class u7s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f35505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f35506b;

    public u7s(Context context, boolean z) {
        this.f35505a = context;
        this.f35506b = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        x9s.o("do sync info");
        ja jaVar = new ja(gbs.a(), false);
        bas basVarC = bas.c(this.f35505a);
        jaVar.c(il.SyncInfo.f125a);
        jaVar.b(basVarC.d());
        jaVar.d(this.f35505a.getPackageName());
        HashMap map = new HashMap();
        jaVar.f264a = map;
        Context context = this.f35505a;
        a3t.c(map, "app_version", g.h(context, context.getPackageName()));
        Map<String, String> map2 = jaVar.f264a;
        Context context2 = this.f35505a;
        a3t.c(map2, "app_version_code", Integer.toString(g.b(context2, context2.getPackageName())));
        a3t.c(jaVar.f264a, "push_sdk_vn", "5_7_8-C");
        a3t.c(jaVar.f264a, "push_sdk_vc", Integer.toString(50708));
        a3t.c(jaVar.f264a, "token", basVarC.m());
        if (!y0t.t()) {
            String strB = qcs.b(lzs.t(this.f35505a));
            String strX = lzs.x(this.f35505a);
            if (!TextUtils.isEmpty(strX)) {
                strB = strB + "," + strX;
            }
            if (!TextUtils.isEmpty(strB)) {
                a3t.c(jaVar.f264a, "imei_md5", strB);
            }
        }
        k8s.a(this.f35505a).d(jaVar.f264a);
        a3t.c(jaVar.f264a, "reg_id", basVarC.q());
        a3t.c(jaVar.f264a, "reg_secret", basVarC.t());
        a3t.c(jaVar.f264a, "accept_time", b.t(this.f35505a).replace(",", "-"));
        if (this.f35506b) {
            a3t.c(jaVar.f264a, "aliases_md5", o7s.f(b.u(this.f35505a)));
            a3t.c(jaVar.f264a, "topics_md5", o7s.f(b.v(this.f35505a)));
            a3t.c(jaVar.f264a, "accounts_md5", o7s.f(b.w(this.f35505a)));
        } else {
            a3t.c(jaVar.f264a, "aliases", o7s.g(b.u(this.f35505a)));
            a3t.c(jaVar.f264a, "topics", o7s.g(b.v(this.f35505a)));
            a3t.c(jaVar.f264a, "user_accounts", o7s.g(b.w(this.f35505a)));
        }
        d6s.c(this.f35505a).y(jaVar, ib.Notification, false, null);
    }
}
