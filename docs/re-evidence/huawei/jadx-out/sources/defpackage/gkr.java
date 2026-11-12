package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.pluginfitnessadvice.TargetConfig;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class gkr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("name")
    private String f35425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("actionComposition")
    private List<e> f35426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID)
    private String f35427c;

    @SerializedName("userDefinedType")
    private int d;

    @SerializedName("description")
    private String e;

    private gkr(c cVar) {
        this.f35427c = cVar.e;
        this.e = cVar.f35434c;
        this.f35425a = cVar.f35432a;
        this.d = cVar.f35433b;
        this.f35426b = cVar.d;
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f35432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f35433b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f35434c;
        private List<e> d;
        private String e;

        public c d(String str) {
            this.e = str;
            return this;
        }

        public c a(String str) {
            this.f35434c = str;
            return this;
        }

        public c b(String str) {
            this.f35432a = str;
            return this;
        }

        public c c(int i) {
            this.f35433b = i;
            return this;
        }

        public c b(List<e> list) {
            this.d = list;
            return this;
        }

        public gkr e() {
            return new gkr(this);
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("actionList")
        private List<b> f35435a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("repeatTimes")
        private int f35436c;

        private e(c cVar) {
            this.f35436c = cVar.d;
            this.f35435a = cVar.f35437b;
        }

        public static final class c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private List<b> f35437b;
            private int d;

            public c c(int i) {
                this.d = i;
                return this;
            }

            public c a(List<b> list) {
                this.f35437b = list;
                return this;
            }

            public e e() {
                return new e(this);
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("name")
        private String f35428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("strength")
        private TargetConfig f35429c;

        @SerializedName("actionId")
        private String d;

        @SerializedName("target")
        private TargetConfig e;

        private b(a aVar) {
            this.d = aVar.d;
            this.f35428b = aVar.f35430b;
            this.e = aVar.e;
            this.f35429c = aVar.f35431c;
        }

        public static final class a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f35430b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private TargetConfig f35431c;
            private String d;
            private TargetConfig e;

            public a c(String str) {
                this.d = str;
                return this;
            }

            public a e(String str) {
                this.f35430b = str;
                return this;
            }

            public a a(TargetConfig targetConfig) {
                this.e = targetConfig;
                return this;
            }

            public a b(TargetConfig targetConfig) {
                this.f35431c = targetConfig;
                return this;
            }

            public b d() {
                return new b(this);
            }
        }
    }
}
