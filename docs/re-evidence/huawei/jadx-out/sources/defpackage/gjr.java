package defpackage;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gjr implements IRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("bestRecords")
    private d f35304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("userBestRecords")
    private c f35305c;

    @SerializedName("planId")
    private String d;

    private gjr(a aVar) {
        this.d = aVar.e;
        this.f35304b = aVar.d;
        this.f35305c = aVar.f35306a;
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("4")
        private Integer f35312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("7")
        private Integer f35313b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("103")
        private Integer f35314c;

        @SerializedName("6")
        private Integer d;

        @SerializedName("3")
        private Integer e;

        @SerializedName("2")
        private Integer f;

        @SerializedName("11")
        private Float g;

        @SerializedName("8")
        private Integer h;

        @SerializedName("5")
        private Integer i;

        @SerializedName("1")
        private Integer j;

        @SerializedName("9")
        private Float k;

        @SerializedName(MessageConstant.CERTIFICATE)
        private String l;

        @SerializedName("10")
        private Integer m;

        private d(e eVar) {
            this.f35314c = eVar.d;
            this.j = eVar.h;
            this.f = eVar.f;
            this.e = eVar.f35315a;
            this.f35312a = eVar.e;
            this.i = eVar.j;
            this.d = eVar.f35316b;
            this.f35313b = eVar.f35317c;
            this.h = eVar.g;
            this.k = eVar.n;
            this.m = eVar.m;
            this.l = eVar.l;
            this.g = eVar.i;
        }

        public static final class e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Integer f35315a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Integer f35316b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Integer f35317c;
            private Integer d;
            private Integer e;
            private Integer f;
            private Integer g;
            private Integer h;
            private Float i;
            private Integer j;
            private String l;
            private Integer m;
            private Float n;

            public e c(Integer num) {
                if (num.intValue() > 0) {
                    this.d = num;
                }
                return this;
            }

            public e g(Integer num) {
                if (num.intValue() > 0) {
                    this.h = num;
                }
                return this;
            }

            public e h(Integer num) {
                if (num.intValue() > 0) {
                    this.f = num;
                }
                return this;
            }

            public e a(Integer num) {
                if (num.intValue() > 0) {
                    this.f35315a = num;
                }
                return this;
            }

            public e e(Integer num) {
                if (num.intValue() > 0) {
                    this.e = num;
                }
                return this;
            }

            public e i(Integer num) {
                if (num.intValue() > 0) {
                    this.j = num;
                }
                return this;
            }

            public e d(Integer num) {
                if (num.intValue() > 0) {
                    this.f35316b = num;
                }
                return this;
            }

            public e b(Integer num) {
                if (num.intValue() > 0) {
                    this.f35317c = num;
                }
                return this;
            }

            public e j(Integer num) {
                if (num.intValue() > 0) {
                    this.g = num;
                }
                return this;
            }

            public e d(Float f) {
                if (f.floatValue() > 0.0f) {
                    this.n = f;
                }
                return this;
            }

            public e f(Integer num) {
                if (num.intValue() > 0) {
                    this.m = num;
                }
                return this;
            }

            public e a(String str) {
                if (!TextUtils.isEmpty(str)) {
                    this.l = str;
                }
                return this;
            }

            public e b(Float f) {
                if (f.floatValue() > 0.0f) {
                    this.i = f;
                }
                return this;
            }

            public d e() {
                return new d(this);
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("206")
        private Integer f35307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("207")
        private Integer f35308b;

        @SerializedName("204")
        private Integer d;

        @SerializedName("205")
        private Integer e;

        private c(C0321c c0321c) {
            this.d = c0321c.f35311c;
            this.e = c0321c.f35310b;
            this.f35307a = c0321c.f35309a;
            this.f35308b = c0321c.e;
        }

        /* JADX INFO: renamed from: gjr$c$c, reason: collision with other inner class name */
        public static final class C0321c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Integer f35309a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Integer f35310b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Integer f35311c;
            private Integer e;

            public C0321c c(Integer num) {
                if (num.intValue() > 0) {
                    this.f35311c = num;
                }
                return this;
            }

            public C0321c e(Integer num) {
                if (num.intValue() > 0) {
                    this.f35310b = num;
                }
                return this;
            }

            public C0321c a(Integer num) {
                if (num.intValue() > 0) {
                    this.f35309a = num;
                }
                return this;
            }

            public C0321c b(Integer num) {
                if (num.intValue() > 0) {
                    this.e = num;
                }
                return this;
            }

            public c b() {
                return new c(this);
            }
        }
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.bf();
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c f35306a;
        private d d;
        private String e;

        public a e(String str) {
            this.e = str;
            return this;
        }

        public a a(d dVar) {
            this.d = dVar;
            return this;
        }

        public a c(c cVar) {
            this.f35306a = cVar;
            return this;
        }

        public gjr d() {
            return new gjr(this);
        }
    }
}
