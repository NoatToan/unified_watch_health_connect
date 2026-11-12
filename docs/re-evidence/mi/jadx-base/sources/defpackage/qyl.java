package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

/* JADX INFO: loaded from: classes4.dex */
public final class qyl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableMap<String, String> f31977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImmutableList<ijf> f31978b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final Uri g;
    public final String h;
    public final String i;
    public final String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f31979k;
    public final String l;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImmutableMap.b<String, String> f31980a = new ImmutableMap.b<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImmutableList.a<ijf> f31981b = new ImmutableList.a<>();
        public int c = -1;
        public String d;
        public String e;
        public String f;
        public Uri g;
        public String h;
        public String i;
        public String j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f31982k;
        public String l;

        public b m(String str, String str2) {
            this.f31980a.g(str, str2);
            return this;
        }

        public b n(ijf ijfVar) {
            this.f31981b.a(ijfVar);
            return this;
        }

        public qyl o() {
            if (this.d == null || this.e == null || this.f == null) {
                throw new IllegalStateException("One of more mandatory SDP fields are not set.");
            }
            return new qyl(this);
        }

        public b p(int i) {
            this.c = i;
            return this;
        }

        public b q(String str) {
            this.h = str;
            return this;
        }

        public b r(String str) {
            this.f31982k = str;
            return this;
        }

        public b s(String str) {
            this.i = str;
            return this;
        }

        public b t(String str) {
            this.e = str;
            return this;
        }

        public b u(String str) {
            this.l = str;
            return this;
        }

        public b v(String str) {
            this.j = str;
            return this;
        }

        public b w(String str) {
            this.d = str;
            return this;
        }

        public b x(String str) {
            this.f = str;
            return this;
        }

        public b y(Uri uri) {
            this.g = uri;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qyl.class != obj.getClass()) {
            return false;
        }
        qyl qylVar = (qyl) obj;
        return this.f == qylVar.f && this.f31977a.equals(qylVar.f31977a) && this.f31978b.equals(qylVar.f31978b) && this.d.equals(qylVar.d) && this.c.equals(qylVar.c) && this.e.equals(qylVar.e) && wlq.c(this.l, qylVar.l) && wlq.c(this.g, qylVar.g) && wlq.c(this.j, qylVar.j) && wlq.c(this.f31979k, qylVar.f31979k) && wlq.c(this.h, qylVar.h) && wlq.c(this.i, qylVar.i);
    }

    public int hashCode() {
        int iHashCode = (((((((((((217 + this.f31977a.hashCode()) * 31) + this.f31978b.hashCode()) * 31) + this.d.hashCode()) * 31) + this.c.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f) * 31;
        String str = this.l;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri = this.g;
        int iHashCode3 = (iHashCode2 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str2 = this.j;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f31979k;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.i;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public qyl(b bVar) {
        this.f31977a = bVar.f31980a.a();
        this.f31978b = bVar.f31981b.k();
        this.c = (String) wlq.j(bVar.d);
        this.d = (String) wlq.j(bVar.e);
        this.e = (String) wlq.j(bVar.f);
        this.g = bVar.g;
        this.h = bVar.h;
        this.f = bVar.c;
        this.i = bVar.i;
        this.j = bVar.f31982k;
        this.f31979k = bVar.l;
        this.l = bVar.j;
    }
}
