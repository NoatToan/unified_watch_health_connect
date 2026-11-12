package androidx.media3.common;

import android.net.Uri;
import com.google.android.exoplayer2.C;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final t f8437g = new c().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f8439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f8440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f8441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f8442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f8443f;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f8444a;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Uri f8445a;

            public a(Uri uri) {
                this.f8445a = uri;
            }
        }

        static {
            fa.z.H(0);
        }

        private b(a aVar) {
            this.f8444a = aVar.f8445a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f8444a.equals(((b) obj).f8444a);
        }

        public final int hashCode() {
            return this.f8444a.hashCode() * 31;
        }
    }

    @Deprecated
    public static final class e extends d {
        static {
            new e(new d.a());
        }

        private e(d.a aVar) {
            super(aVar);
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f8482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f8483b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f f8484c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f8485d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<b0> f8486e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f8487f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ImmutableList<k> f8488g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Object f8489h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f8490i;

        static {
            fa.z.H(0);
            fa.z.H(1);
            fa.z.H(2);
            fa.z.H(3);
            fa.z.H(4);
            fa.z.H(5);
            fa.z.H(6);
            fa.z.H(7);
        }

        private h(Uri uri, String str, f fVar, b bVar, List<b0> list, String str2, ImmutableList<k> immutableList, Object obj, long j8) {
            this.f8482a = uri;
            this.f8483b = x.n(str);
            this.f8484c = fVar;
            this.f8485d = bVar;
            this.f8486e = list;
            this.f8487f = str2;
            this.f8488g = immutableList;
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i14 = 0; i14 < immutableList.size(); i14++) {
                k kVar = immutableList.get(i14);
                kVar.getClass();
                builder.add(new j(new k.a()));
            }
            builder.build();
            this.f8489h = obj;
            this.f8490i = j8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f8482a.equals(hVar.f8482a) && Objects.equals(this.f8483b, hVar.f8483b) && Objects.equals(this.f8484c, hVar.f8484c) && Objects.equals(this.f8485d, hVar.f8485d) && this.f8486e.equals(hVar.f8486e) && Objects.equals(this.f8487f, hVar.f8487f) && this.f8488g.equals(hVar.f8488g) && Objects.equals(this.f8489h, hVar.f8489h) && Long.valueOf(this.f8490i).equals(Long.valueOf(hVar.f8490i));
        }

        public final int hashCode() {
            int iHashCode = this.f8482a.hashCode() * 31;
            String str = this.f8483b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f8484c;
            int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            b bVar = this.f8485d;
            int iHashCode4 = (this.f8486e.hashCode() + ((iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
            String str2 = this.f8487f;
            int iHashCode5 = (this.f8488g.hashCode() + ((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            Object obj = this.f8489h;
            return (int) ((((long) (iHashCode5 + (obj != null ? obj.hashCode() : 0))) * 31) + this.f8490i);
        }
    }

    static {
        fa.z.H(0);
        fa.z.H(1);
        fa.z.H(2);
        fa.z.H(3);
        fa.z.H(4);
        fa.z.H(5);
    }

    private t(String str, e eVar, h hVar, g gVar, v vVar, i iVar) {
        this.f8438a = str;
        this.f8439b = hVar;
        this.f8440c = gVar;
        this.f8441d = vVar;
        this.f8442e = eVar;
        this.f8443f = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        String str = tVar.f8438a;
        int i14 = fa.z.f70071a;
        return Objects.equals(this.f8438a, str) && this.f8442e.equals(tVar.f8442e) && Objects.equals(this.f8439b, tVar.f8439b) && Objects.equals(this.f8440c, tVar.f8440c) && Objects.equals(this.f8441d, tVar.f8441d) && Objects.equals(this.f8443f, tVar.f8443f);
    }

    public final int hashCode() {
        int iHashCode = this.f8438a.hashCode() * 31;
        h hVar = this.f8439b;
        int iHashCode2 = (this.f8441d.hashCode() + ((this.f8442e.hashCode() + ((this.f8440c.hashCode() + ((iHashCode + (hVar != null ? hVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f8443f.getClass();
        return iHashCode2;
    }

    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f8491a = new i(new a());

        static {
            fa.z.H(0);
            fa.z.H(1);
            fa.z.H(2);
        }

        private i(a aVar) {
            aVar.getClass();
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 0;
        }

        public static final class a {
            private a(i iVar) {
                iVar.getClass();
            }

            public a() {
            }
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f8460a;

        static {
            new d(new a());
            fa.z.H(0);
            fa.z.H(1);
            fa.z.H(2);
            fa.z.H(3);
            fa.z.H(4);
            fa.z.H(5);
            fa.z.H(6);
        }

        private d(a aVar) {
            aVar.getClass();
            int i14 = fa.z.f70071a;
            this.f8460a = aVar.f8461a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f8460a == ((d) obj).f8460a;
        }

        public final int hashCode() {
            long j8 = this.f8460a;
            return ((((int) 0) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 29791;
        }

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f8461a;

            private a(d dVar) {
                dVar.getClass();
                this.f8461a = dVar.f8460a;
            }

            public a() {
                this.f8461a = Long.MIN_VALUE;
            }
        }
    }

    @Deprecated
    public static final class j extends k {
        @Deprecated
        public j(Uri uri, String str, String str2, int i14, int i15, String str3) {
            super(uri, str, str2, i14, i15, str3, null);
        }

        @Deprecated
        public j(Uri uri, String str, String str2) {
            this(uri, str, str2, 0);
        }

        @Deprecated
        public j(Uri uri, String str, String str2, int i14) {
            this(uri, str, str2, i14, 0, null);
        }

        private j(k.a aVar) {
            super(aVar);
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f8472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f8473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f8474c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f8475d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f8476e;

        static {
            new g(new a());
            fa.z.H(0);
            fa.z.H(1);
            fa.z.H(2);
            fa.z.H(3);
            fa.z.H(4);
        }

        private g(a aVar) {
            this(aVar.f8477a, aVar.f8478b, aVar.f8479c, aVar.f8480d, aVar.f8481e);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f8472a == gVar.f8472a && this.f8473b == gVar.f8473b && this.f8474c == gVar.f8474c && this.f8475d == gVar.f8475d && this.f8476e == gVar.f8476e;
        }

        public final int hashCode() {
            long j8 = this.f8472a;
            long j14 = this.f8473b;
            int i14 = ((((int) (j8 ^ (j8 >>> 32))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31;
            long j15 = this.f8474c;
            int i15 = (i14 + ((int) ((j15 >>> 32) ^ j15))) * 31;
            float f14 = this.f8475d;
            int iFloatToIntBits = (i15 + (f14 != 0.0f ? Float.floatToIntBits(f14) : 0)) * 31;
            float f15 = this.f8476e;
            return iFloatToIntBits + (f15 != 0.0f ? Float.floatToIntBits(f15) : 0);
        }

        @Deprecated
        public g(long j8, long j14, long j15, float f14, float f15) {
            this.f8472a = j8;
            this.f8473b = j14;
            this.f8474c = j15;
            this.f8475d = f14;
            this.f8476e = f15;
        }

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public long f8477a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public long f8478b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public long f8479c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public float f8480d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public float f8481e;

            private a(g gVar) {
                this.f8477a = gVar.f8472a;
                this.f8478b = gVar.f8473b;
                this.f8479c = gVar.f8474c;
                this.f8480d = gVar.f8475d;
                this.f8481e = gVar.f8476e;
            }

            public a() {
                this.f8477a = C.TIME_UNSET;
                this.f8478b = C.TIME_UNSET;
                this.f8479c = C.TIME_UNSET;
                this.f8480d = -3.4028235E38f;
                this.f8481e = -3.4028235E38f;
            }
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f8462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImmutableMap<String, String> f8463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f8464c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ImmutableList<Integer> f8465d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f8466e;

        static {
            fa.z.H(0);
            fa.z.H(1);
            fa.z.H(2);
            fa.z.H(3);
            fa.z.H(4);
            fa.z.H(5);
            fa.z.H(6);
            fa.z.H(7);
        }

        private f(a aVar) {
            aVar.getClass();
            UUID uuid = aVar.f8467a;
            uuid.getClass();
            this.f8462a = uuid;
            this.f8463b = aVar.f8468b;
            this.f8464c = aVar.f8469c;
            this.f8465d = aVar.f8470d;
            byte[] bArr = aVar.f8471e;
            this.f8466e = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f8462a.equals(fVar.f8462a) && Objects.equals(this.f8463b, fVar.f8463b) && this.f8464c == fVar.f8464c && this.f8465d.equals(fVar.f8465d) && Arrays.equals(this.f8466e, fVar.f8466e);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f8466e) + ((this.f8465d.hashCode() + ((((this.f8463b.hashCode() + (this.f8462a.hashCode() * 961)) * 29791) + (this.f8464c ? 1 : 0)) * 31)) * 31);
        }

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UUID f8467a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ImmutableMap<String, String> f8468b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f8469c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final ImmutableList<Integer> f8470d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final byte[] f8471e;

            private a(f fVar) {
                this.f8467a = fVar.f8462a;
                this.f8468b = fVar.f8463b;
                this.f8469c = fVar.f8464c;
                this.f8470d = fVar.f8465d;
                this.f8471e = fVar.f8466e;
            }

            public a(UUID uuid) {
                this();
                this.f8467a = uuid;
            }

            @Deprecated
            private a() {
                this.f8468b = ImmutableMap.of();
                this.f8469c = true;
                this.f8470d = ImmutableList.of();
            }
        }
    }

    public static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f8492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f8493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f8494c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f8495d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f8496e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f8497f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f8498g;

        static {
            fa.z.H(0);
            fa.z.H(1);
            fa.z.H(2);
            fa.z.H(3);
            fa.z.H(4);
            fa.z.H(5);
            fa.z.H(6);
        }

        private k(a aVar) {
            this.f8492a = aVar.f8499a;
            this.f8493b = aVar.f8500b;
            this.f8494c = aVar.f8501c;
            this.f8495d = aVar.f8502d;
            this.f8496e = aVar.f8503e;
            this.f8497f = aVar.f8504f;
            this.f8498g = aVar.f8505g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            if (this.f8492a.equals(kVar.f8492a)) {
                String str = kVar.f8493b;
                int i14 = fa.z.f70071a;
                if (Objects.equals(this.f8493b, str) && Objects.equals(this.f8494c, kVar.f8494c) && this.f8495d == kVar.f8495d && this.f8496e == kVar.f8496e && Objects.equals(this.f8497f, kVar.f8497f) && Objects.equals(this.f8498g, kVar.f8498g)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int iHashCode = this.f8492a.hashCode() * 31;
            String str = this.f8493b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f8494c;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f8495d) * 31) + this.f8496e) * 31;
            String str3 = this.f8497f;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f8498g;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Uri f8499a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public String f8500b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public String f8501c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f8502d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final int f8503e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final String f8504f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final String f8505g;

            private a(k kVar) {
                this.f8499a = kVar.f8492a;
                this.f8500b = kVar.f8493b;
                this.f8501c = kVar.f8494c;
                this.f8502d = kVar.f8495d;
                this.f8503e = kVar.f8496e;
                this.f8504f = kVar.f8497f;
                this.f8505g = kVar.f8498g;
            }

            public a(Uri uri) {
                this.f8499a = uri;
            }
        }

        private k(Uri uri, String str, String str2, int i14, int i15, String str3, String str4) {
            this.f8492a = uri;
            this.f8493b = x.n(str);
            this.f8494c = str2;
            this.f8495d = i14;
            this.f8496e = i15;
            this.f8497f = str3;
            this.f8498g = str4;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f8446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Uri f8447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f8448c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final d.a f8449d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public f.a f8450e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<b0> f8451f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f8452g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ImmutableList<k> f8453h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final b f8454i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f8455j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final long f8456k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final v f8457l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public g.a f8458m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final i f8459n;

        private c(t tVar) {
            this();
            e eVar = tVar.f8442e;
            eVar.getClass();
            this.f8449d = new d.a();
            this.f8446a = tVar.f8438a;
            this.f8457l = tVar.f8441d;
            g gVar = tVar.f8440c;
            gVar.getClass();
            this.f8458m = new g.a();
            this.f8459n = tVar.f8443f;
            h hVar = tVar.f8439b;
            if (hVar != null) {
                this.f8452g = hVar.f8487f;
                this.f8448c = hVar.f8483b;
                this.f8447b = hVar.f8482a;
                this.f8451f = hVar.f8486e;
                this.f8453h = hVar.f8488g;
                this.f8455j = hVar.f8489h;
                f fVar = hVar.f8484c;
                this.f8450e = fVar != null ? new f.a() : new f.a();
                this.f8454i = hVar.f8485d;
                this.f8456k = hVar.f8490i;
            }
        }

        public final t a() {
            h hVar;
            this.f8450e.getClass();
            Uri uri = this.f8447b;
            if (uri != null) {
                String str = this.f8448c;
                f.a aVar = this.f8450e;
                hVar = new h(uri, str, aVar.f8467a != null ? new f(aVar) : null, this.f8454i, this.f8451f, this.f8452g, this.f8453h, this.f8455j, this.f8456k);
            } else {
                hVar = null;
            }
            String str2 = this.f8446a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            d.a aVar2 = this.f8449d;
            aVar2.getClass();
            e eVar = new e(aVar2);
            g.a aVar3 = this.f8458m;
            aVar3.getClass();
            g gVar = new g(aVar3);
            v vVar = this.f8457l;
            if (vVar == null) {
                vVar = v.B;
            }
            return new t(str3, eVar, hVar, gVar, vVar, this.f8459n);
        }

        public c() {
            this.f8449d = new d.a();
            this.f8450e = new f.a();
            this.f8451f = Collections.EMPTY_LIST;
            this.f8453h = ImmutableList.of();
            this.f8458m = new g.a();
            this.f8459n = i.f8491a;
            this.f8456k = C.TIME_UNSET;
        }
    }
}
