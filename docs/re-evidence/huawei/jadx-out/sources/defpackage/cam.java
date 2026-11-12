package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class cam {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("enabled")
    private final boolean f1395c;

    @SerializedName("alarmInfoList")
    private final List<d> d;

    public cam(boolean z, List<d> list) {
        this.f1395c = z;
        this.d = list;
    }

    public boolean c() {
        return this.f1395c;
    }

    public List<d> e() {
        return this.d;
    }

    public String toString() {
        return "HealthModeReminderCloudBean{mIsEnabled=" + this.f1395c + ", mCloudReminderBeanList=" + this.d + '}';
    }

    public static class d {

        @SerializedName("minute")
        private final int d;

        @SerializedName("hour")
        private final int e;

        public d(int i, int i2) {
            this.d = i2;
            this.e = i;
        }

        public int d() {
            return this.d;
        }

        public int c() {
            return this.e;
        }

        public String toString() {
            return "CloudReminderBean{mMinute=" + this.d + ", mHour=" + this.e + '}';
        }
    }
}
