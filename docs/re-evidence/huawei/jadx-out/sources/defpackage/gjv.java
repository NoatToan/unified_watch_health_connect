package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.networkclient.IRequest;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class gjv implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("distance")
    private Integer f35331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("calorie")
    private Float f35332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("difficulty")
    private Integer f35333c;

    @SerializedName("endDate")
    private Long d;

    @SerializedName(ParsedFieldTag.BEGIN_DATE)
    private Long e;

    @SerializedName("movementTimes")
    private Integer f;

    @SerializedName("name")
    private String g;

    @SerializedName("picture")
    private String h;

    @SerializedName("excludedDate")
    private String i;

    @SerializedName(ParsedFieldTag.GOAL)
    private Integer j;

    @SerializedName("version")
    private String k;

    @SerializedName("weekCount")
    private Integer l;

    @SerializedName("remindTime")
    private Integer m;

    @SerializedName("planId")
    private String n;

    @SerializedName("type")
    private Integer o;

    @SerializedName("weekInfos")
    private List<a> s;

    private gjv(e eVar) {
        this.n = eVar.k;
        this.g = eVar.j;
        this.o = eVar.o;
        this.f35333c = eVar.e;
        this.l = eVar.l;
        this.f35332b = eVar.f35347b;
        this.f35331a = eVar.f35346a;
        this.h = eVar.f;
        this.k = eVar.n;
        this.e = eVar.f35348c;
        this.d = eVar.d;
        this.i = eVar.i;
        this.f = eVar.h;
        this.j = eVar.g;
        this.m = eVar.m;
        this.s = eVar.r;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("displayorder")
        private Integer f35334a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("stage")
        private String f35335b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("sentence")
        private String f35336c;

        @SerializedName("week_name")
        private String d;

        @SerializedName("courses")
        private List<c> e;

        private a(c cVar) {
            this.e = cVar.f35339c;
            this.f35334a = cVar.d;
            this.f35335b = cVar.f35337a;
            this.f35336c = cVar.f35338b;
            this.d = cVar.e;
        }

        public static final class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f35337a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f35338b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private List<c> f35339c;
            private Integer d;
            private String e;

            public c c(List<c> list) {
                this.f35339c = list;
                return this;
            }

            public c c(Integer num) {
                this.d = num;
                return this;
            }

            public c e(String str) {
                this.f35337a = str;
                return this;
            }

            public c a(String str) {
                this.f35338b = str;
                return this;
            }

            public c b(String str) {
                this.e = str;
                return this;
            }

            public a b() {
                return new a(this);
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("runningParas")
        private String f35340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("description")
        private String f35341b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("displayorder")
        private Integer f35342c;

        @SerializedName("duration")
        private Integer d;

        @SerializedName("name")
        private String e;

        @SerializedName("version")
        private String f;

        @SerializedName("trainingDate")
        private Long h;

        @SerializedName("type")
        private Integer i;

        @SerializedName(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID)
        private String j;

        private c(d dVar) {
            this.h = dVar.h;
            this.j = dVar.f;
            this.e = dVar.e;
            this.f35341b = dVar.f35344b;
            this.f35342c = dVar.f35345c;
            this.f35340a = dVar.d;
            this.f = dVar.i;
            this.d = dVar.f35343a;
            this.i = dVar.g;
        }

        public static final class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Integer f35343a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f35344b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Integer f35345c;
            private String d;
            private String e;
            private String f;
            private Integer g;
            private Long h;
            private String i;

            public d a(Long l) {
                this.h = l;
                return this;
            }

            public d b(String str) {
                this.f = str;
                return this;
            }

            public d d(String str) {
                this.e = str;
                return this;
            }

            public d c(String str) {
                this.f35344b = str;
                return this;
            }

            public d e(Integer num) {
                this.f35345c = num;
                return this;
            }

            public d e(String str) {
                this.d = str;
                return this;
            }

            public d a(String str) {
                this.i = str;
                return this;
            }

            public d b(Integer num) {
                this.f35343a = num;
                return this;
            }

            public d c(Integer num) {
                this.g = num;
                return this;
            }

            public c c() {
                return new c(this);
            }
        }
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.bd();
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f35346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Float f35347b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f35348c;
        private Long d;
        private Integer e;
        private String f;
        private Integer g;
        private Integer h;
        private String i;
        private String j;
        private String k;
        private Integer l;
        private Integer m;
        private String n;
        private Integer o;
        private List<a> r;

        public e e(String str) {
            this.k = str;
            return this;
        }

        public e a(String str) {
            this.j = str;
            return this;
        }

        public e g(Integer num) {
            this.o = num;
            return this;
        }

        public e a(Integer num) {
            this.e = num;
            return this;
        }

        public e f(Integer num) {
            this.l = num;
            return this;
        }

        public e a(Float f) {
            this.f35347b = f;
            return this;
        }

        public e b(Integer num) {
            this.f35346a = num;
            return this;
        }

        public e b(String str) {
            this.f = str;
            return this;
        }

        public e d(String str) {
            this.n = str;
            return this;
        }

        public e d(Long l) {
            this.f35348c = l;
            return this;
        }

        public e c(Long l) {
            this.d = l;
            return this;
        }

        public e c(String str) {
            this.i = str;
            return this;
        }

        public e e(Integer num) {
            this.h = num;
            return this;
        }

        public e d(Integer num) {
            this.g = num;
            return this;
        }

        public e c(Integer num) {
            this.m = num;
            return this;
        }

        public e e(List<a> list) {
            this.r = list;
            return this;
        }

        public gjv b() {
            return new gjv(this);
        }
    }
}
