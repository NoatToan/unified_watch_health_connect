package defpackage;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class mff {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static mff f41603c;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f41604a = false;

    private mff() {
    }

    public static mff a() {
        mff mffVar;
        LogUtil.a("HwHeartRateInfo", "HwHeartRateInfo Constructor");
        synchronized (e) {
            if (f41603c == null) {
                f41603c = new mff();
            }
            mffVar = f41603c;
        }
        return mffVar;
    }

    public void e(boolean z) {
        this.f41604a = z;
    }

    public int d(String str) {
        int i = BaseApplication.getContext().getSharedPreferences("heartRateRemindSP", 0).getInt(str, -1);
        LogUtil.a("HwHeartRateInfo", "heart rate remind default open flag is ", Integer.valueOf(i));
        return i;
    }
}
