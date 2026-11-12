package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;

/* JADX INFO: loaded from: classes13.dex */
public class ouq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(ParsedFieldTag.FIRST_TAB_DESC)
    private String f44813a;

    @SerializedName("timestamp")
    private long ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("endTime")
    private final String f44814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(ParsedFieldTag.FIRST_TAB_PRIORITY)
    private int f44815c;

    @SerializedName(ParsedFieldTag.ACTION_TYPE)
    private final int d;

    @SerializedName(ParsedFieldTag.GAIN_COUNT)
    private final int e;

    @SerializedName(ParsedFieldTag.GOAL)
    private int f;

    @SerializedName(ParsedFieldTag.GRAY_PRO_NAME)
    private String g;

    @SerializedName(ParsedFieldTag.LIGHT_DESC)
    private final String h;

    @SerializedName("gainTime")
    private final String i;

    @SerializedName(ParsedFieldTag.GRAY_DESC)
    private final String j;

    @SerializedName("medalLabel")
    private final int k;

    @SerializedName(ParsedFieldTag.MEDAL_LEVEL)
    private int l;

    @SerializedName("medalName")
    private final String m;

    @SerializedName(ParsedFieldTag.MEDAL_ID)
    private final String n;

    @SerializedName(ParsedFieldTag.LIGHT_PRO_NAME)
    private String o;

    @SerializedName(ParsedFieldTag.REPEATABLE)
    private int p;

    @SerializedName(ParsedFieldTag.MEDAL_TYPE)
    private final String q;

    @SerializedName("message")
    private final String r;

    @SerializedName(ParsedFieldTag.MEDAL_WEIGHT)
    private int s;

    @SerializedName("medalUnit")
    private final int t;

    @SerializedName("status")
    private int u;

    @SerializedName("startTime")
    private final String v;

    @SerializedName(ParsedFieldTag.SECOND_TAB_DESC)
    private String w;

    @SerializedName(ParsedFieldTag.TAKE_DATE)
    private final String x;

    @SerializedName(ParsedFieldTag.SECOND_TAB_PRIORITY)
    private int y;

    private ouq(c cVar) {
        this.n = cVar.m;
        this.m = cVar.k;
        this.r = cVar.s;
        this.h = cVar.f;
        this.j = cVar.i;
        this.e = cVar.d;
        this.i = cVar.h;
        this.t = cVar.t;
        this.q = cVar.q;
        this.k = cVar.o;
        this.d = cVar.f44816a;
        this.v = cVar.x;
        this.f44814b = cVar.f44818c;
        this.x = cVar.y;
        this.ad = cVar.ac;
        this.g = cVar.g;
        this.o = cVar.l;
        this.f = cVar.j;
        this.l = cVar.n;
        this.p = cVar.p;
        this.u = cVar.u;
        this.f44815c = cVar.e;
        this.f44813a = cVar.f44817b;
        this.y = cVar.w;
        this.w = cVar.v;
        this.s = cVar.r;
    }

    public String c() {
        return this.n;
    }

    public String e() {
        return this.m;
    }

    public String h() {
        return this.r;
    }

    public String a() {
        return this.h;
    }

    public String b() {
        return this.i;
    }

    public String d() {
        return this.q;
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f44816a;
        private long ac;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f44817b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f44818c;
        private int d;
        private int e;
        private String f;
        private String g;
        private String h;
        private String i;
        private int j;
        private String k;
        private String l;
        private final String m;
        private int n;
        private int o;
        private int p;
        private String q;
        private int r;
        private String s;
        private int t;
        private int u;
        private String v;
        private int w;
        private String x;
        private String y;

        public c(String str) {
            this.m = str;
        }

        public c i(String str) {
            this.k = str;
            return this;
        }

        public c h(String str) {
            this.s = str;
            return this;
        }

        public c f(String str) {
            this.f = str;
            return this;
        }

        public c j(String str) {
            this.i = str;
            return this;
        }

        public c a(int i) {
            this.d = i;
            return this;
        }

        public c a(String str) {
            this.h = str;
            return this;
        }

        public c m(String str) {
            this.q = str;
            return this;
        }

        public c a(long j) {
            this.ac = j;
            return this;
        }

        public c h(int i) {
            this.t = i;
            return this;
        }

        public c d(int i) {
            this.o = i;
            return this;
        }

        public c e(int i) {
            this.f44816a = i;
            return this;
        }

        public c g(String str) {
            this.x = str;
            return this;
        }

        public c c(String str) {
            this.f44818c = str;
            return this;
        }

        public c n(String str) {
            this.y = str;
            return this;
        }

        public c d(String str) {
            this.g = str;
            return this;
        }

        public c e(String str) {
            this.l = str;
            return this;
        }

        public c c(int i) {
            this.j = i;
            return this;
        }

        public c i(int i) {
            this.n = i;
            return this;
        }

        public c j(int i) {
            this.p = i;
            return this;
        }

        public c m(int i) {
            this.u = i;
            return this;
        }

        public c b(int i) {
            this.e = i;
            return this;
        }

        public c b(String str) {
            this.f44817b = str;
            return this;
        }

        public c f(int i) {
            this.w = i;
            return this;
        }

        public c o(String str) {
            this.v = str;
            return this;
        }

        public c g(int i) {
            this.r = i;
            return this;
        }

        public ouq a() {
            return new ouq(this);
        }
    }
}
