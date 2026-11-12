package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes19.dex */
public class ttj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("accumPerfectGoalAchievedDays")
    private e f49637b;

    public e d() {
        return this.f49637b;
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("latestPerfect")
        private int f49638a;

        @SerializedName("latestDate")
        private int d;

        @SerializedName("value")
        private int e;

        public int d() {
            return this.e;
        }

        public int b() {
            return this.d;
        }

        public int c() {
            return this.f49638a;
        }

        public String toString() {
            return "PD{value=" + this.e + ", lD=" + this.d + ", lP=" + this.f49638a + '}';
        }
    }
}
