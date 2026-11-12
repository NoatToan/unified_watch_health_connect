package defpackage;

import com.huawei.health.sportservice.utils.SmoothDataParser;

/* JADX INFO: loaded from: classes31.dex */
public class hby {
    private static SmoothDataParser d = new hbx();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static SmoothDataParser f36379b = new hbu();

    public static float e(float f, int i) {
        SmoothDataParser smoothDataParser;
        if (i == 0) {
            smoothDataParser = d;
        } else {
            smoothDataParser = f36379b;
        }
        return smoothDataParser.getAverage(f);
    }

    public static void e(int i) {
        if (i == 0) {
            d.clear();
        } else {
            f36379b.clear();
        }
    }
}
