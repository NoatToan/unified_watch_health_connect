package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;

/* JADX INFO: loaded from: classes8.dex */
public class gzl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("operationSchemeId")
    private String f36282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("lang")
    private String f36283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient boolean f36284c;

    @SerializedName("sex")
    private Integer d;

    @SerializedName("mediaType")
    private Integer e;

    @SerializedName("userDefinedType")
    private Integer f;

    @SerializedName(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID)
    private String g;

    @SerializedName("version")
    private String j;

    private gzl(a aVar) {
        this.g = aVar.j;
        this.d = aVar.d;
        this.j = aVar.h;
        this.f36283b = aVar.e;
        this.f36282a = aVar.f36286b;
        this.f = Integer.valueOf(aVar.f);
        this.e = Integer.valueOf(aVar.f36285a);
        this.f36284c = aVar.f36287c;
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f36285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f36286b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f36287c = true;
        private Integer d;
        private String e;
        private int f;
        private String h;
        private String j;

        public a(String str) {
            this.j = str;
        }

        public a d(Integer num) {
            this.d = num;
            return this;
        }

        public a d(String str) {
            this.h = str;
            return this;
        }

        public a a(String str) {
            this.e = str;
            return this;
        }

        public a b(String str) {
            this.f36286b = str;
            return this;
        }

        public a d(int i) {
            this.f = i;
            return this;
        }

        public a c(int i) {
            this.f36285a = i;
            return this;
        }

        public a a(boolean z) {
            this.f36287c = z;
            return this;
        }

        public gzl c() {
            return new gzl(this);
        }
    }

    public String g() {
        return this.g;
    }

    public Integer b() {
        return this.d;
    }

    public String i() {
        return this.j;
    }

    public String d() {
        return this.f36283b;
    }

    public String a() {
        return this.f36282a;
    }

    public int f() {
        return this.f.intValue();
    }

    public int c() {
        return this.e.intValue();
    }

    public boolean e() {
        return this.f36284c;
    }
}
