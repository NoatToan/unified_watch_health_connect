package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ddt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("abilityName")
    private String f31679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("bundleName")
    private String f31680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("deviceModel")
    private String f31681c;

    @SerializedName("deviceCategory")
    private String d;

    @SerializedName("createTime")
    private long e;

    @SerializedName("featureName")
    private String f;

    @SerializedName("effectiveTime")
    private long g;

    @SerializedName("deviceName")
    private String h;

    @SerializedName("featureType")
    private int i;

    @SerializedName("expirationTime")
    private long j;

    @SerializedName("formName")
    private String k;

    @SerializedName("messageId")
    private String l;

    @SerializedName("moduleName")
    private String m;

    @SerializedName("messageName")
    private String n;

    @SerializedName("formDimension")
    private String o;

    @SerializedName("timeZone")
    private String p;

    @SerializedName("timePeriods")
    private List<b> t;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f31682a;
        private long d;

        public b(long j, long j2) {
            this.d = j;
            this.f31682a = j2;
            if (j2 - j > 5400000) {
                LogUtil.j("TimePeriod", "TimePeriod too large, startTime: ", Long.valueOf(j), ", endTime: ", Long.valueOf(j2));
                this.f31682a = this.d + 5400000;
            }
        }

        public void d(long j, long j2) {
            this.d = j;
            if (j2 - j > 5400000) {
                j2 = j + 5400000;
            }
            this.f31682a = j2;
        }

        public long b() {
            return this.d;
        }

        public long d() {
            return this.f31682a;
        }

        public String toString() {
            return "TimePeriod{mStartTime=" + this.d + ", mEndTime=" + this.f31682a + '}';
        }
    }

    public ddt(d dVar) {
        this.n = dVar.m;
        this.l = dVar.n;
        this.f31681c = dVar.f31683a;
        this.d = dVar.f31685c;
        this.h = dVar.i;
        this.i = dVar.h;
        this.p = dVar.q;
        this.e = dVar.f31684b;
        this.g = dVar.j;
        this.j = dVar.g;
        this.f31680b = dVar.d;
        this.m = dVar.k;
        this.f31679a = dVar.e;
        this.o = dVar.o;
        this.k = dVar.l;
        this.f = dVar.f;
        this.t = dVar.p;
    }

    public String l() {
        return this.n;
    }

    public String n() {
        return this.l;
    }

    public String a() {
        return this.f31681c;
    }

    public String e() {
        return this.d;
    }

    public String h() {
        return this.h;
    }

    public int i() {
        return this.i;
    }

    public String t() {
        return this.p;
    }

    public long d() {
        return this.e;
    }

    public long g() {
        return this.g;
    }

    public long j() {
        return this.j;
    }

    public String b() {
        return this.f31680b;
    }

    public String o() {
        return this.m;
    }

    public String c() {
        return this.f31679a;
    }

    public String k() {
        return this.o;
    }

    public String m() {
        return this.k;
    }

    public String f() {
        return this.f;
    }

    public List<b> r() {
        return this.t;
    }

    public String toString() {
        return "DonateBean{MessageName=" + this.n + ", MessageId=" + this.l + ", DeviceModel=" + this.f31681c + ", DeviceCategory=" + this.d + ", DeviceName=" + this.h + ", FeatureType=" + this.i + ", TimeZone=" + this.p + ", CreateTime=" + this.e + ", EffectiveTime=" + this.g + ", ExpirationTime=" + this.j + ", BundleName=" + this.f31680b + ", ModuleName=" + this.m + ", AbilityName=" + this.f31679a + ", FormDimension=" + this.o + ", FormName=" + this.k + ", FeatureName=" + this.f + ", TimePeriods=" + this.t;
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f31683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f31684b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f31685c;
        private String d;
        private String e;
        private String f;
        private long g;
        private int h;
        private String i;
        private long j;
        private String k;
        private String l;
        private String m;
        private String n;
        private String o;
        private List<b> p;
        private String q;

        public ddt a() {
            return new ddt(this);
        }

        public d g(String str) {
            this.m = str;
            return this;
        }

        public d f(String str) {
            this.n = str;
            return this;
        }

        public d e(String str) {
            this.f31683a = str;
            return this;
        }

        public d a(String str) {
            this.f31685c = str;
            return this;
        }

        public d d(String str) {
            this.i = str;
            return this;
        }

        public d e(int i) {
            this.h = i;
            return this;
        }

        public d n(String str) {
            this.q = str;
            return this;
        }

        public d d(long j) {
            this.f31684b = j;
            return this;
        }

        public d e(long j) {
            this.j = j;
            return this;
        }

        public d a(long j) {
            this.g = j;
            return this;
        }

        public d c(String str) {
            this.d = str;
            return this;
        }

        public d l(String str) {
            this.k = str;
            return this;
        }

        public d b(String str) {
            this.e = str;
            return this;
        }

        public d i(String str) {
            this.o = str;
            return this;
        }

        public d h(String str) {
            this.l = str;
            return this;
        }

        public d j(String str) {
            this.f = str;
            return this;
        }

        public d e(List<b> list) {
            this.p = list;
            return this;
        }
    }
}
