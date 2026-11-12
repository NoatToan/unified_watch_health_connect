package defpackage;

import android.content.Context;
import com.huawei.hms.support.log.KitLog;
import com.huawei.openplatform.abl.log.util.d;
import com.huawei.openplatform.abl.log.util.g;

/* JADX INFO: loaded from: classes12.dex */
public class ohm {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f44330c = new byte[0];
    private static volatile ohm e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private KitLog f44332b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f44331a = false;
    private int d = 4;

    public void d(String str, String str2, Object... objArr) {
        if (this.f44332b != null) {
            c(str, g.a(str2, objArr));
        }
    }

    public void c(String str, String str2) {
        KitLog kitLog = this.f44332b;
        if (kitLog != null) {
            kitLog.w(str, str2);
        }
    }

    public void c(String str, String str2, Object... objArr) {
        if (this.f44332b != null) {
            b(str, g.a(str2, objArr));
        }
    }

    public void b(String str, String str2) {
        KitLog kitLog = this.f44332b;
        if (kitLog != null) {
            kitLog.i(str, str2);
        }
    }

    public void a(String str, String str2, Object... objArr) {
        if (this.f44332b != null) {
            a(str, g.a(str2, objArr));
        }
    }

    public void a(String str, String str2) {
        KitLog kitLog = this.f44332b;
        if (kitLog != null) {
            kitLog.e(str, str2);
        }
    }

    public boolean a(int i) {
        return this.f44331a && i >= this.d;
    }

    public void b(String str, String str2, Object... objArr) {
        if (this.f44332b != null) {
            e(str, g.a(str2, objArr));
        }
    }

    public void e(String str, String str2) {
        KitLog kitLog = this.f44332b;
        if (kitLog != null) {
            kitLog.d(str, str2);
        }
    }

    public void c(Context context, int i, String str) {
        KitLog kitLog = this.f44332b;
        if (kitLog != null && context != null) {
            kitLog.init(context.getApplicationContext(), i, str);
        }
        this.d = i;
        this.f44331a = true;
    }

    public static ohm d() {
        if (e == null) {
            synchronized (f44330c) {
                if (e == null) {
                    e = new ohm();
                }
            }
        }
        return e;
    }

    private ohm() {
        if (d.a("com.huawei.hms.support.log.KitLog")) {
            this.f44332b = new KitLog();
        }
    }
}
