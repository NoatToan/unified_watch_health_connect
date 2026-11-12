package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes7.dex */
public class ehp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("lightEffectSetting")
    private boolean f32983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("historyRecords")
    private boolean f32984b;

    @SerializedName("heartRateControl")
    private boolean d;

    @SerializedName("marketing")
    private boolean e;

    @SerializedName("uuid")
    private String f;

    @SerializedName("personalPerformance")
    private b g;

    @SerializedName("menuItems")
    private d h = new d();

    @SerializedName("modes")
    private c j = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("enhanceMode")
    private e f32985c = new e();

    public boolean c() {
        return this.d;
    }

    public boolean g() {
        return this.f32984b;
    }

    public boolean h() {
        return this.e;
    }

    public boolean f() {
        return this.f32983a;
    }

    public d b() {
        return this.h;
    }

    public c e() {
        return this.j;
    }

    public e a() {
        return this.f32985c;
    }

    public b d() {
        return this.g;
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("ota")
        private e f32990a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("deviceInfo")
        private boolean f32991c;

        @SerializedName("deleteDevice")
        private boolean d;

        @SerializedName("authorizeHeightWeight")
        private boolean e;

        public boolean d() {
            return this.d;
        }

        public e b() {
            return this.f32990a;
        }

        public boolean a() {
            return this.f32991c;
        }

        public boolean e() {
            return this.e;
        }

        public static class e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @SerializedName("otaRedPoint")
            private boolean f32992a;

            public boolean d() {
                return this.f32992a;
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("freeMode")
        private boolean f32987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("caloriesMode")
        private boolean f32988b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("distanceMode")
        private boolean f32989c;

        @SerializedName("fancyMode")
        private boolean d;

        @SerializedName("countingMode")
        private boolean e;

        @SerializedName("timingMode")
        private boolean h;

        public boolean d() {
            return this.f32987a;
        }

        public boolean h() {
            return this.h;
        }

        public boolean b() {
            return this.f32989c;
        }

        public boolean a() {
            return this.f32988b;
        }

        public boolean e() {
            return this.e;
        }

        public boolean c() {
            return this.d;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("musicJumpSetting")
        private boolean f32993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("courseJumpSetting")
        private boolean f32994b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("intervalTraining")
        private boolean f32995c;

        @SerializedName("multiplayer")
        private boolean d;

        @SerializedName("music")
        private boolean e;

        @SerializedName("ropeSetting")
        private boolean f;

        @SerializedName("warmUp")
        private boolean i;

        public boolean f() {
            return this.i;
        }

        public boolean b() {
            return this.e;
        }

        public boolean d() {
            return this.f32994b;
        }

        public boolean a() {
            return this.f32993a;
        }

        public boolean c() {
            return this.f32995c;
        }

        public boolean g() {
            return this.f;
        }

        public boolean e() {
            return this.d;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("ropePerformance ")
        private boolean f32986b;

        public boolean c() {
            return this.f32986b;
        }
    }
}
