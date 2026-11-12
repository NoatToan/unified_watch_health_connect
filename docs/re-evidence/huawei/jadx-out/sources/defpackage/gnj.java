package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes8.dex */
public class gnj {

    @SerializedName("userInfoInit")
    private e e;

    public e c() {
        return this.e;
    }

    public String toString() {
        return "SmartWeightPlanMetaData{userInfoInit=" + this.e + '}';
    }

    public static class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("height")
        private int f35809c;

        @SerializedName("weight")
        private double d;

        public double a() {
            return this.d;
        }

        public String toString() {
            return "UserInfoInit{weight=" + this.d + ", height=" + this.f35809c + '}';
        }
    }
}
