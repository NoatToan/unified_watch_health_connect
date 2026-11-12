package defpackage;

import com.huawei.pluginfitnessadvice.RoadBook;
import health.compact.a.util.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class hjr {
    private static RoadBook[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f36814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f36816c = 1.0f;

    public static void a(List<RoadBook> list) {
        if (list == null) {
            return;
        }
        int iD = d(list) + 1;
        LogUtil.a("Suggestion_CourseEquipmentSpeedSmoothHelper", "setRoadBooks:", Integer.valueOf(list.size()), " arrayNum:", Integer.valueOf(iD));
        e = new RoadBook[iD];
        for (RoadBook roadBook : list) {
            if (roadBook != null && roadBook.getDuration() >= 0) {
                e[roadBook.getDuration()] = roadBook;
            }
        }
    }

    public static RoadBook[] b() {
        return e;
    }

    public static void d() {
        e = null;
    }

    private static int d(List<RoadBook> list) {
        int duration = 0;
        if (njy.e(list)) {
            return 0;
        }
        for (RoadBook roadBook : list) {
            if (roadBook.getDuration() > duration) {
                duration = roadBook.getDuration();
            }
        }
        return duration;
    }

    public float a(int i, int i2) {
        c(i);
        d(i2);
        return a(this.f36816c);
    }

    private void c(int i) {
        RoadBook roadBookA = a(i);
        if (roadBookA != null) {
            this.f36815b = roadBookA.getSpeed();
        }
        if (this.f36814a == 0.0f) {
            this.f36814a = this.f36815b;
        }
        int i2 = this.f36815b;
        if (i2 != 0) {
            this.f36814a = (this.f36814a * 0.9f) + (i2 * 0.1f);
        } else {
            this.f36814a = 0.0f;
        }
        LogUtil.a("Suggestion_CourseEquipmentSpeedSmoothHelper", "currentSecond:", Integer.valueOf(i), " currentRoadBook speed:", Integer.valueOf(i2));
    }

    private void d(int i) {
        float f = this.f36814a;
        if (f == 0.0f) {
            this.f36816c = 1.0f;
            LogUtil.a("Suggestion_CourseEquipmentSpeedSmoothHelper", "mSmoothSpeed:", Float.valueOf(f), " currentSpeed:", Integer.valueOf(i), " mPlaySpeedLevel:", Float.valueOf(1.0f));
        } else {
            float f2 = i / f;
            float f3 = (this.f36816c * 0.7f) + (0.3f * f2);
            this.f36816c = f3;
            LogUtil.a("Suggestion_CourseEquipmentSpeedSmoothHelper", "mSmoothSpeed:", Float.valueOf(f), " currentSpeed:", Integer.valueOf(i), " tempPlaySpeedLevel:", Float.valueOf(f2), " mPlaySpeedLevel:", Float.valueOf(f3));
        }
    }

    private RoadBook a(int i) {
        RoadBook roadBook = null;
        if (e.length <= i) {
            return null;
        }
        while (i >= 0) {
            roadBook = e[i];
            if (roadBook != null) {
                return roadBook;
            }
            i--;
        }
        return roadBook;
    }

    private float a(float f) {
        if (f < 0.2f) {
            return 0.0f;
        }
        if (f <= 0.5f) {
            return 0.5f;
        }
        if (f <= 2.0f) {
            return Math.round(f * 10.0f) / 10.0f;
        }
        return 2.0f;
    }
}
