package defpackage;

import android.text.TextUtils;
import cn.miao.health.bean.HeartInfo;
import cn.miao.health.bean.ManualInputInfo;
import cn.miao.health.bean.SleepInfo;

/* JADX INFO: loaded from: classes.dex */
public class ju3 {
    public static boolean a(int i) {
        return i >= 14 && i <= 150;
    }

    public static boolean b(HeartInfo heartInfo) {
        return (heartInfo == null || heartInfo.getAge() == null || heartInfo.getHeartRate() == null || heartInfo.getMeasureTime() == null) ? false : true;
    }

    public static boolean c(int i) {
        return i > 0 && i < 300;
    }

    public static boolean d(ManualInputInfo manualInputInfo) {
        return (manualInputInfo == null || manualInputInfo.getDuration() == null || manualInputInfo.getSportType() == null || manualInputInfo.getSex() == null) ? false : true;
    }

    public static boolean e(int i) {
        return i > 0 && i < 1440;
    }

    public static boolean f(int i, int i2) {
        return i >= 0 && i < i2;
    }

    public static boolean g(int i, int i2, int i3) {
        return i > 0 && i < 1440 && i < i2 - i3;
    }

    public static boolean h(SleepInfo sleepInfo) {
        return (sleepInfo == null || sleepInfo.getAge() == null) ? false : true;
    }

    public static boolean i(String str) {
        return (TextUtils.isEmpty(str) || sp5.a(str) == null) ? false : true;
    }

    public static boolean j(String str) {
        return !TextUtils.isEmpty(str);
    }
}
