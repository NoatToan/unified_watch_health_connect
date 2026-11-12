package defpackage;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.rtsp.g;
import com.google.common.collect.ImmutableMap;

/* JADX INFO: loaded from: classes4.dex */
public final class ijf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21222b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;
    public final ImmutableMap<String, String> i;
    public final c j;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f21224b;
        public final String c;
        public final int d;
        public final ImmutableMap.b<String, String> e = new ImmutableMap.b<>();
        public int f = -1;
        public String g;
        public String h;
        public String i;

        public b(String str, int i, String str2, int i2) {
            this.f21223a = str;
            this.f21224b = i;
            this.c = str2;
            this.d = i2;
        }

        public b i(String str, String str2) {
            this.e.g(str, str2);
            return this;
        }

        public ijf j() {
            ImmutableMap<String, String> immutableMapA = this.e.a();
            try {
                rk1.g(immutableMapA.containsKey("rtpmap"));
                return new ijf(this, immutableMapA, c.a((String) wlq.j(immutableMapA.get("rtpmap"))));
            } catch (ParserException e) {
                throw new IllegalStateException(e);
            }
        }

        public b k(int i) {
            this.f = i;
            return this;
        }

        public b l(String str) {
            this.h = str;
            return this;
        }

        public b m(String str) {
            this.i = str;
            return this;
        }

        public b n(String str) {
            this.g = str;
            return this;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f21226b;
        public final int c;
        public final int d;

        public c(int i, String str, int i2, int i3) {
            this.f21225a = i;
            this.f21226b = str;
            this.c = i2;
            this.d = i3;
        }

        public static c a(String str) throws ParserException {
            String[] strArrM0 = wlq.M0(str, " ");
            rk1.a(strArrM0.length == 2);
            int iD = g.d(strArrM0[0]);
            String[] strArrM1 = wlq.M0(strArrM0[1], "/");
            rk1.a(strArrM1.length >= 2);
            return new c(iD, strArrM1[0], g.d(strArrM1[1]), strArrM1.length == 3 ? g.d(strArrM1[2]) : -1);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.f21225a == cVar.f21225a && this.f21226b.equals(cVar.f21226b) && this.c == cVar.c && this.d == cVar.d;
        }

        public int hashCode() {
            return ((((((217 + this.f21225a) * 31) + this.f21226b.hashCode()) * 31) + this.c) * 31) + this.d;
        }
    }

    public ImmutableMap<String, String> a() {
        String str = this.i.get("fmtp");
        if (str == null) {
            return ImmutableMap.of();
        }
        String[] strArrN0 = wlq.N0(str, " ");
        rk1.b(strArrN0.length == 2, str);
        String[] strArrM0 = wlq.M0(strArrN0[1], ";\\s?");
        ImmutableMap.b bVar = new ImmutableMap.b();
        for (String str2 : strArrM0) {
            String[] strArrN1 = wlq.N0(str2, "=");
            bVar.g(strArrN1[0], strArrN1[1]);
        }
        return bVar.a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ijf.class != obj.getClass()) {
            return false;
        }
        ijf ijfVar = (ijf) obj;
        return this.f21221a.equals(ijfVar.f21221a) && this.f21222b == ijfVar.f21222b && this.c.equals(ijfVar.c) && this.d == ijfVar.d && this.e == ijfVar.e && this.i.equals(ijfVar.i) && this.j.equals(ijfVar.j) && wlq.c(this.f, ijfVar.f) && wlq.c(this.g, ijfVar.g) && wlq.c(this.h, ijfVar.h);
    }

    public int hashCode() {
        int iHashCode = (((((((((((((217 + this.f21221a.hashCode()) * 31) + this.f21222b) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31;
        String str = this.f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public ijf(b bVar, ImmutableMap<String, String> immutableMap, c cVar) {
        this.f21221a = bVar.f21223a;
        this.f21222b = bVar.f21224b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.f = bVar.g;
        this.g = bVar.h;
        this.e = bVar.f;
        this.h = bVar.i;
        this.i = immutableMap;
        this.j = cVar;
    }
}
