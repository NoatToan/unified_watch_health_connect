package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes7.dex */
public class exc {
    private static exc d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f33610a = BaseApplication.b();
    private volatile boolean e;

    private exc() {
    }

    public static exc d() {
        exc excVar;
        synchronized (exc.class) {
            if (d == null) {
                d = new exc();
            }
            excVar = d;
        }
        return excVar;
    }

    public boolean e() {
        return this.e;
    }

    public void e(boolean z) {
        this.e = z;
    }

    public void a() {
        long j;
        if (this.f33610a == null) {
            return;
        }
        String strE = lua.e(Integer.toString(11000), "last_closed_time", "");
        if (TextUtils.isEmpty(strE)) {
            LogUtil.e("ShowStatusUtil", "get SharedPreference failed");
            e(true);
            return;
        }
        try {
            j = Long.parseLong(strE);
        } catch (NumberFormatException e) {
            LogUtil.e("ShowStatusUtil", "exception is", e.getMessage());
            j = 0;
        }
        LogUtil.d("ShowStatusUtil", "lastClosedTime: " + j);
        e(c(j));
    }

    private boolean c(long j) {
        boolean zAa;
        String strE = lua.e(Integer.toString(11000), "total_closed_count", "");
        LogUtil.a("ShowStatusUtil", "totalClosedCount is:", strE, " lastClosedTime:", Long.valueOf(j));
        if (TextUtils.isEmpty(strE)) {
            zAa = lsl.aa(j);
        } else {
            int iN = CommonUtil.n(BaseApplication.b(), strE);
            int iB = lsl.b(lsl.r(j), lsl.r(System.currentTimeMillis()));
            if (iN >= 3 && iB <= 90) {
                return false;
            }
            zAa = lsl.aa(j);
        }
        return !zAa;
    }

    public void b() {
        lua.f(Integer.toString(11000), "last_closed_time", Long.toString(System.currentTimeMillis()));
        String strE = lua.e(Integer.toString(11000), "total_closed_count", "");
        int i = 1;
        if (strE == null || strE.isEmpty()) {
            LogUtil.e("ShowStatusUtil", "totalClosedCountPreference is invalid");
        } else {
            try {
                int i2 = Integer.parseInt(strE);
                if (i2 >= 0 && i2 < 3) {
                    i = 1 + i2;
                }
            } catch (NumberFormatException e) {
                LogUtil.e("ShowStatusUtil", "set count exception", e.getMessage());
                i = 0;
            }
        }
        lua.f(Integer.toString(11000), "total_closed_count", Integer.toString(i));
    }

    public static void c() {
        synchronized (exc.class) {
            if (d != null) {
                d = null;
            }
        }
    }
}
