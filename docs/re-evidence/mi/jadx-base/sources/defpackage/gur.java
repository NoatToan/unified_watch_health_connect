package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class gur {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f19353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f19354b;
    public int c;
    public String d;
    public k1d e;
    public h1d f;
    public g1d g;
    public s1d h;
    public r1d i;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f19355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f19356b;
        public int c;
        public String d = "production";
        public k1d e;
        public h1d f;
        public g1d g;
        public s1d h;
        public r1d i;

        public b a(String str) {
            this.f19355a = str;
            return this;
        }

        public gur b() {
            gur gurVar = new gur();
            gurVar.f19354b = this.f19356b;
            gurVar.e = this.e;
            gurVar.i = this.i;
            gurVar.d = this.d;
            gurVar.g = this.g;
            gurVar.f19353a = this.f19355a;
            gurVar.h = this.h;
            gurVar.c = this.c;
            gurVar.f = this.f;
            boolean z = true;
            sk1.b(!TextUtils.isEmpty(this.f19355a), "appName can not be Empty!");
            sk1.b(this.c > 0, "maxNativeApiLevel must be greater than 0 !");
            sk1.c(this.e);
            if (this.i == null && this.h == null) {
                z = false;
            }
            sk1.b(z, "For defaultNetFrameInfoProvider and customNetFrameProvider, you must implements one of Them.");
            return gurVar;
        }

        public b c(g1d g1dVar) {
            this.g = g1dVar;
            return this;
        }

        public b d(h1d h1dVar) {
            this.f = h1dVar;
            return this;
        }

        public b e(s1d s1dVar) {
            this.h = s1dVar;
            return this;
        }

        public b f(r1d r1dVar) {
            this.i = r1dVar;
            return this;
        }

        public b g(String str) {
            this.d = str;
            return this;
        }

        public b h(k1d k1dVar) {
            this.e = k1dVar;
            return this;
        }

        public b i(int i) {
            this.c = i;
            return this;
        }

        public b j(String str) {
            this.f19356b = str;
            return this;
        }
    }

    public String j() {
        return this.f19353a;
    }

    public g1d k() {
        return this.g;
    }

    public h1d l() {
        return this.f;
    }

    public s1d m() {
        return this.h;
    }

    public r1d n() {
        return this.i;
    }

    public String o() {
        return this.d;
    }

    public k1d p() {
        return this.e;
    }

    public int q() {
        return this.c;
    }

    public String r() {
        return this.f19354b;
    }

    public boolean s() {
        k1d k1dVar = this.e;
        return k1dVar != null && k1dVar.isEnableRN();
    }

    public boolean t() {
        k1d k1dVar = this.e;
        return k1dVar != null && k1dVar.isSingleFullBundle();
    }

    public gur() {
    }
}
