package defpackage;

import android.content.Context;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes16.dex */
public class rdc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile rdc f47172b;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f47173a;

    private rdc(Context context) {
        this.f47173a = context;
    }

    public static rdc b(Context context) {
        if (f47172b == null) {
            synchronized (e) {
                if (f47172b == null) {
                    f47172b = new rdc(BaseApplication.getContext());
                }
            }
        }
        return f47172b;
    }

    public static String b(Context context, int i) {
        return rdb.d(context, i);
    }

    public String d(int i) {
        Context context = this.f47173a;
        if (context == null) {
            return "";
        }
        return rdb.d(i, context.getApplicationContext());
    }

    public int e(boolean[] zArr) {
        LogUtil.a("AlarmInteractor", "getRemindWeek()");
        int i = zArr[0] ? 64 : 0;
        if (zArr[6]) {
            i += 32;
        }
        if (zArr[5]) {
            i += 16;
        }
        if (zArr[4]) {
            i += 8;
        }
        if (zArr[3]) {
            i += 4;
        }
        if (zArr[2]) {
            i += 2;
        }
        if (zArr[1]) {
            i++;
        }
        LogUtil.a("AlarmInteractor", "getRemindWeek() week ", Integer.valueOf(i));
        return i;
    }

    public String e(String str, int i) {
        while (str.length() < i) {
            str = "0" + str;
        }
        return str;
    }

    public int c(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 <= 0) {
            i = (i + 23) % 24;
            i4 += 60;
        }
        return (i * 100) + i4;
    }
}
