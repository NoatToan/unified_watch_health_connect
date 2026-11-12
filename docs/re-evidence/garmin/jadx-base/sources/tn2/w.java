package tn2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.base.Ascii;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0006\n\u000b\f\r\u000e\u000fB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Ltn2/w;", "Las2/h;", "Las2/j;", "", "Lhs2/d;", "payDevice", "Lhs2/a;", TtmlNode.TAG_METADATA, "<init>", "(Lhs2/d;Lhs2/a;)V", "b", "c", "f", "a", JWKParameterNames.RSA_EXPONENT, "d", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w extends as2.h implements as2.j<Integer> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f165679d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hs2.d f165680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hs2.a f165681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f165682c;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ltn2/w$c;", "", "Ltn2/d;", "status", "", "Ltn2/c1;", "data", "<init>", "(Ltn2/d;Ljava/util/List;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final tn2.d f165692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<c1> f165693b;

        public c(tn2.d dVar, List<c1> list) {
            dVar.getClass();
            list.getClass();
            this.f165692a = dVar;
            this.f165693b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f165692a == cVar.f165692a && this.f165693b.equals(cVar.f165693b);
        }

        public final int hashCode() {
            return this.f165693b.hashCode() + (this.f165692a.hashCode() * 31);
        }

        public final String toString() {
            return "FNApduTransferResult(status=" + this.f165692a + ", data=" + this.f165693b + ")";
        }
    }

    public static final /* synthetic */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f165729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f165730b;

        static {
            int[] iArr = new int[pn2.a.f.values().length];
            try {
                iArr[pn2.a.f.FnTest.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pn2.a.f.FnCertificate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pn2.a.f.Prod.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[pn2.a.f.SonyLab.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f165729a = iArr;
            int[] iArr2 = new int[pn2.a.i.values().length];
            try {
                iArr2[pn2.a.i.JreSandbox.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[pn2.a.i.Omiya.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[pn2.a.i.Prod.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[pn2.a.i.FnEmulated1SpServer.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[pn2.a.i.FnEmulated2SpServer.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[pn2.a.i.SonyLab.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            f165730b = iArr2;
        }
    }

    static {
        new b(null);
        int i14 = gt2.c.f79010a;
        f165679d = gt2.b.f79005a.h("PAY#FN#FelicaDeviceService");
    }

    public w(hs2.d dVar, hs2.a aVar) {
        dVar.getClass();
        aVar.getClass();
        this.f165680a = dVar;
        this.f165681b = aVar;
        this.f165682c = dVar.getF99647a();
    }

    public static byte[] q(byte[] bArr) {
        tn2.f.f165551a.getClass();
        byte[] bArrA = hb2.d.a("80C20000");
        bArrA.getClass();
        byte length = (byte) bArr.length;
        int length2 = bArrA.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArrA, length2 + 1);
        bArrCopyOf[length2] = length;
        return p13.s.q(bArrCopyOf, bArr);
    }

    @Override // as2.j
    public final q03.r<Integer> getBalance() {
        e13.j jVarT = t(new d(false, false, false, false, false, false, false, true, false, false, 895, null));
        v vVar = new v(new m(7), 3);
        int i14 = w03.b.f181178a;
        return new e13.o(jVarT, vVar);
    }

    public final e13.k o() {
        e13.p pVarA = ks2.e.a(this.f165680a);
        v vVar = new v(new l(this, 2), 15);
        int i14 = w03.b.f181178a;
        return new e13.k(pVarA, vVar);
    }

    public final e13.o p(ul2.c cVar) {
        e13.o oVarM = as2.h.m(cVar, q(new byte[]{3, -56, Ascii.ETB}), "");
        r22.a aVar = new r22.a(new m(1), 29);
        int i14 = w03.b.f181178a;
        return new e13.o(oVarM, aVar);
    }

    public final e13.o r(ul2.c cVar, a.EnumC3112a enumC3112a) {
        e13.o oVarM = as2.h.m(cVar, wq2.a.b(enumC3112a.a().a()), "");
        v vVar = new v(new t(enumC3112a, 1), 7);
        int i14 = w03.b.f181178a;
        return new e13.o(oVarM, vVar);
    }

    public final e13.c s(ul2.c cVar, e.a aVar) {
        z03.j jVarN = as2.h.n(cVar, aVar.getF165717e().a());
        wq2.a.f186629a.getClass();
        e13.p pVarH = w13.b.h(cVar, wq2.a.a((byte) 0, (byte) -32));
        r22.a aVar2 = new r22.a(new rp.b(this, 26, cVar, aVar), 23);
        int i14 = w03.b.f181178a;
        return jVarN.c(new e13.j(pVarH, aVar2));
    }

    public final e13.j t(d dVar) {
        f165679d.trace("getSEData()");
        e13.p pVarA = ks2.e.a(this.f165680a);
        v vVar = new v(new sy.i(18, dVar, this), 5);
        int i14 = w03.b.f181178a;
        return new e13.j(pVarA, vVar);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000bB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Ltn2/w$a;", "", "Ltn2/w$a$a;", "appletType", "", "binaryVersion", "appletVersion", "packageKeyVersion", "applicationLifeCycleState", "<init>", "(Ltn2/w$a$a;[B[B[B[B)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EnumC3112a f165683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f165684b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f165685c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f165686d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f165687e;

        public a(EnumC3112a enumC3112a, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
            enumC3112a.getClass();
            bArr.getClass();
            bArr2.getClass();
            bArr3.getClass();
            bArr4.getClass();
            this.f165683a = enumC3112a;
            this.f165684b = bArr;
            this.f165685c = bArr2;
            this.f165686d = bArr3;
            this.f165687e = bArr4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!a.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            obj.getClass();
            a aVar = (a) obj;
            return Arrays.equals(this.f165684b, aVar.f165684b) && Arrays.equals(this.f165685c, aVar.f165685c) && Arrays.equals(this.f165686d, aVar.f165686d);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f165686d) + ((Arrays.hashCode(this.f165685c) + (Arrays.hashCode(this.f165684b) * 31)) * 31);
        }

        public final String toString() {
            String string = Arrays.toString(this.f165684b);
            String string2 = Arrays.toString(this.f165685c);
            String string3 = Arrays.toString(this.f165686d);
            String string4 = Arrays.toString(this.f165687e);
            StringBuilder sb3 = new StringBuilder("AppletInstanceInfo(appletType=");
            sb3.append(this.f165683a);
            sb3.append(", binaryVersion=");
            sb3.append(string);
            sb3.append(", appletVersion=");
            sn.a.t(sb3, string2, ", packageKeyVersion=", string3, ", applicationLifeCycleState=");
            return am.j.o(string4, ")", sb3);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: tn2.w$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltn2/w$a$a;", "", "<init>", "(Ljava/lang/String;I)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class EnumC3112a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C3113a f165688a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f165689b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final c f165690c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ EnumC3112a[] f165691d;

            /* JADX INFO: renamed from: tn2.w$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/felica/FelicaDeviceService.AppletInstanceInfo.Type.MANAGEMENT_SYSTEM", "Ltn2/w$a$a;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class C3113a extends EnumC3112a {
                public C3113a(String str, int i14) {
                    super(str, i14, null);
                }

                @Override // tn2.w.a.EnumC3112a
                public final pn2.a.EnumC2623a a() {
                    return pn2.a.EnumC2623a.MSI;
                }

                @Override // tn2.w.a.EnumC3112a
                public final int b() {
                    return 1;
                }
            }

            /* JADX INFO: renamed from: tn2.w$a$a$b */
            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/felica/FelicaDeviceService.AppletInstanceInfo.Type.SYSTEM_0", "Ltn2/w$a$a;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class b extends EnumC3112a {
                public b(String str, int i14) {
                    super(str, i14, null);
                }

                @Override // tn2.w.a.EnumC3112a
                public final pn2.a.EnumC2623a a() {
                    return pn2.a.EnumC2623a.INSTANCE0;
                }

                @Override // tn2.w.a.EnumC3112a
                public final int b() {
                    return 2;
                }
            }

            /* JADX INFO: renamed from: tn2.w$a$a$c */
            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/felica/FelicaDeviceService.AppletInstanceInfo.Type.SYSTEM_1", "Ltn2/w$a$a;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class c extends EnumC3112a {
                public c(String str, int i14) {
                    super(str, i14, null);
                }

                @Override // tn2.w.a.EnumC3112a
                public final pn2.a.EnumC2623a a() {
                    return pn2.a.EnumC2623a.INSTANCE1;
                }

                @Override // tn2.w.a.EnumC3112a
                public final int b() {
                    throw new RuntimeException("Raw value of SYSTEM_1 Should not be accessed");
                }
            }

            static {
                C3113a c3113a = new C3113a("MANAGEMENT_SYSTEM", 0);
                f165688a = c3113a;
                b bVar = new b("SYSTEM_0", 1);
                f165689b = bVar;
                c cVar = new c("SYSTEM_1", 2);
                f165690c = cVar;
                f165691d = new EnumC3112a[]{c3113a, bVar, cVar};
            }

            public /* synthetic */ EnumC3112a(String str, int i14, p005kotlin.jvm.internal.j jVar) {
                this(str, i14);
            }

            public static EnumC3112a valueOf(String str) {
                return (EnumC3112a) Enum.valueOf(EnumC3112a.class, str);
            }

            public static EnumC3112a[] values() {
                return (EnumC3112a[]) f165691d.clone();
            }

            public abstract pn2.a.EnumC2623a a();

            public abstract int b();

            private EnumC3112a(String str, int i14) {
                super(str, i14);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\tB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Ltn2/w$e;", "", "Ltn2/w$e$a;", "sdType", "", "keyVersion", "sequenceCounter", "<init>", "(Ltn2/w$e$a;[B[B)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f165704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f165705b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f165706c;

        public e(a aVar, byte[] bArr, byte[] bArr2) {
            aVar.getClass();
            bArr.getClass();
            bArr2.getClass();
            this.f165704a = aVar;
            this.f165705b = bArr;
            this.f165706c = bArr2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!e.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            obj.getClass();
            e eVar = (e) obj;
            return this.f165704a == eVar.f165704a && Arrays.equals(this.f165705b, eVar.f165705b) && Arrays.equals(this.f165706c, eVar.f165706c);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f165706c) + ((Arrays.hashCode(this.f165705b) + (this.f165704a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            String string = Arrays.toString(this.f165705b);
            String string2 = Arrays.toString(this.f165706c);
            StringBuilder sb3 = new StringBuilder("SDInfo(sdType=");
            sb3.append(this.f165704a);
            sb3.append(", keyVersion=");
            sb3.append(string);
            sb3.append(", sequenceCounter=");
            return am.j.o(string2, ")", sb3);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltn2/w$e$a;", "", "<init>", "(Ljava/lang/String;I)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C3114a f165707a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f165708b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final c f165709c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ a[] f165710d;

            /* JADX INFO: Fake field, exist only in values array */
            a EF0;

            /* JADX INFO: renamed from: tn2.w$e$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/felica/FelicaDeviceService.SDInfo.Type.AMSD", "Ltn2/w$e$a;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class C3114a extends a {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final pn2.a.EnumC2623a f165711e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final int f165712f;

                public C3114a(String str, int i14) {
                    super(str, i14, null);
                    this.f165711e = pn2.a.EnumC2623a.AMSD;
                    this.f165712f = 2;
                }

                @Override // tn2.w.e.a
                /* JADX INFO: renamed from: a, reason: from getter */
                public final pn2.a.EnumC2623a getF165717e() {
                    return this.f165711e;
                }

                @Override // tn2.w.e.a
                /* JADX INFO: renamed from: b, reason: from getter */
                public final int getF165718f() {
                    return this.f165712f;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/felica/FelicaDeviceService.SDInfo.Type.CLSD", "Ltn2/w$e$a;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class b extends a {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final pn2.a.EnumC2623a f165713e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final int f165714f;

                public b(String str, int i14) {
                    super(str, i14, null);
                    this.f165713e = pn2.a.EnumC2623a.ENC_SD;
                    this.f165714f = 3;
                }

                @Override // tn2.w.e.a
                /* JADX INFO: renamed from: a, reason: from getter */
                public final pn2.a.EnumC2623a getF165717e() {
                    return this.f165713e;
                }

                @Override // tn2.w.e.a
                /* JADX INFO: renamed from: b, reason: from getter */
                public final int getF165718f() {
                    return this.f165714f;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/felica/FelicaDeviceService.SDInfo.Type.FNSD", "Ltn2/w$e$a;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class c extends a {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final pn2.a.EnumC2623a f165715e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final int f165716f;

                public c(String str, int i14) {
                    super(str, i14, null);
                    this.f165715e = pn2.a.EnumC2623a.SSD;
                    this.f165716f = 4;
                }

                @Override // tn2.w.e.a
                /* JADX INFO: renamed from: a, reason: from getter */
                public final pn2.a.EnumC2623a getF165717e() {
                    return this.f165715e;
                }

                @Override // tn2.w.e.a
                /* JADX INFO: renamed from: b, reason: from getter */
                public final int getF165718f() {
                    return this.f165716f;
                }
            }

            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/felica/FelicaDeviceService.SDInfo.Type.ISD", "Ltn2/w$e$a;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class d extends a {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final pn2.a.EnumC2623a f165717e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final int f165718f;

                public d(String str, int i14) {
                    super(str, i14, null);
                    this.f165717e = pn2.a.EnumC2623a.ISD;
                    this.f165718f = 1;
                }

                @Override // tn2.w.e.a
                /* JADX INFO: renamed from: a, reason: from getter */
                public final pn2.a.EnumC2623a getF165717e() {
                    return this.f165717e;
                }

                @Override // tn2.w.e.a
                /* JADX INFO: renamed from: b, reason: from getter */
                public final int getF165718f() {
                    return this.f165718f;
                }
            }

            static {
                d dVar = new d("ISD", 0);
                C3114a c3114a = new C3114a("AMSD", 1);
                f165707a = c3114a;
                b bVar = new b("CLSD", 2);
                f165708b = bVar;
                c cVar = new c("FNSD", 3);
                f165709c = cVar;
                f165710d = new a[]{dVar, c3114a, bVar, cVar};
            }

            public /* synthetic */ a(String str, int i14, p005kotlin.jvm.internal.j jVar) {
                this(str, i14);
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f165710d.clone();
            }

            /* JADX INFO: renamed from: a */
            public abstract pn2.a.EnumC2623a getF165717e();

            /* JADX INFO: renamed from: b */
            public abstract int getF165718f();

            private a(String str, int i14) {
                super(str, i14);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ltn2/w$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ltn2/w$d;", "", "", "withSEId", "withTsmConfiguration", "withAppletInstanceInfo", "withAppletInfoList", "withSequenceCounter", "withSDInfoList", "withChipDestinationId", "withBalance", "withPunchingStatus", "withCid", "<init>", "(ZZZZZZZZZZ)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f165694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f165695b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f165696c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f165697d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f165698e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f165699f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f165700g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f165701h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f165702i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f165703j;

        public /* synthetic */ d(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, boolean z26, boolean z27, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16, (i14 & 8) != 0 ? false : z17, (i14 & 16) != 0 ? false : z18, (i14 & 32) != 0 ? false : z19, (i14 & 64) != 0 ? false : z24, (i14 & 128) != 0 ? false : z25, (i14 & 256) != 0 ? false : z26, (i14 & 512) != 0 ? false : z27);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f165694a == dVar.f165694a && this.f165695b == dVar.f165695b && this.f165696c == dVar.f165696c && this.f165697d == dVar.f165697d && this.f165698e == dVar.f165698e && this.f165699f == dVar.f165699f && this.f165700g == dVar.f165700g && this.f165701h == dVar.f165701h && this.f165702i == dVar.f165702i && this.f165703j == dVar.f165703j;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f165703j) + q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(Boolean.hashCode(this.f165694a) * 31, 31, this.f165695b), 31, this.f165696c), 31, this.f165697d), 31, this.f165698e), 31, this.f165699f), 31, this.f165700g), 31, this.f165701h), 31, this.f165702i);
        }

        public final String toString() {
            StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("GetSEDataConfig{ withSEId = ", ", withTsmConfiguration = ", ", withAppletInstanceInfo = ", this.f165694a, this.f165695b);
            kg.f.q(", withAppletInfoList = ", ", withSequenceCounter = ", sbM, this.f165696c, this.f165697d);
            kg.f.q(", withSDInfoList = ", ", withChipDestinationId = ", sbM, this.f165698e, this.f165699f);
            kg.f.q(", withBalance = ", ", withPunchingStatus = ", sbM, this.f165700g, this.f165701h);
            return com.airbnb.lottie.animation.keyframe.a.f(", withCid = ", " }", sbM, this.f165702i, this.f165703j);
        }

        public d(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, boolean z26, boolean z27) {
            this.f165694a = z14;
            this.f165695b = z15;
            this.f165696c = z16;
            this.f165697d = z17;
            this.f165698e = z18;
            this.f165699f = z19;
            this.f165700g = z24;
            this.f165701h = z25;
            this.f165702i = z26;
            this.f165703j = z27;
        }

        public d() {
            this(false, false, false, false, false, false, false, false, false, false, 1023, null);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ltn2/w$f;", "", "", "seId", "tsmConfiguration", "Ltn2/w$a;", "appletInstanceInfo", "", "appletInfoList", "sequenceCounterOfSSD", "Ltn2/w$e;", "sdInfoList", "", "chipDestinationId", "", "balance", "", "punchingStatus", "cid", "<init>", "([B[BLtn2/w$a;Ljava/util/List;[BLjava/util/List;Ljava/lang/Byte;Ljava/lang/Integer;Ljava/lang/Boolean;[B)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f165719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f165720b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a f165721c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List<a> f165722d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f165723e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List<e> f165724f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Byte f165725g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Integer f165726h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Boolean f165727i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public byte[] f165728j;

        public /* synthetic */ f(byte[] bArr, byte[] bArr2, a aVar, List list, byte[] bArr3, List list2, Byte b14, Integer num, Boolean bool, byte[] bArr4, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : bArr, (i14 & 2) != 0 ? null : bArr2, (i14 & 4) != 0 ? null : aVar, (i14 & 8) != 0 ? null : list, (i14 & 16) != 0 ? null : bArr3, (i14 & 32) != 0 ? null : list2, (i14 & 64) != 0 ? null : b14, (i14 & 128) != 0 ? null : num, (i14 & 256) != 0 ? null : bool, (i14 & 512) != 0 ? null : bArr4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return p005kotlin.jvm.internal.s.g(this.f165719a, fVar.f165719a) && p005kotlin.jvm.internal.s.g(this.f165720b, fVar.f165720b) && p005kotlin.jvm.internal.s.g(this.f165721c, fVar.f165721c) && p005kotlin.jvm.internal.s.g(this.f165722d, fVar.f165722d) && p005kotlin.jvm.internal.s.g(this.f165723e, fVar.f165723e) && p005kotlin.jvm.internal.s.g(this.f165724f, fVar.f165724f) && p005kotlin.jvm.internal.s.g(this.f165725g, fVar.f165725g) && p005kotlin.jvm.internal.s.g(this.f165726h, fVar.f165726h) && p005kotlin.jvm.internal.s.g(this.f165727i, fVar.f165727i) && p005kotlin.jvm.internal.s.g(this.f165728j, fVar.f165728j);
        }

        public final int hashCode() {
            byte[] bArr = this.f165719a;
            int iHashCode = (bArr == null ? 0 : Arrays.hashCode(bArr)) * 31;
            byte[] bArr2 = this.f165720b;
            int iHashCode2 = (iHashCode + (bArr2 == null ? 0 : Arrays.hashCode(bArr2))) * 31;
            a aVar = this.f165721c;
            int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            List<a> list = this.f165722d;
            int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            byte[] bArr3 = this.f165723e;
            int iHashCode5 = (iHashCode4 + (bArr3 == null ? 0 : Arrays.hashCode(bArr3))) * 31;
            List<e> list2 = this.f165724f;
            int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
            Byte b14 = this.f165725g;
            int iHashCode7 = (iHashCode6 + (b14 == null ? 0 : b14.hashCode())) * 31;
            Integer num = this.f165726h;
            int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool = this.f165727i;
            int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
            byte[] bArr4 = this.f165728j;
            return iHashCode9 + (bArr4 != null ? Arrays.hashCode(bArr4) : 0);
        }

        public final String toString() {
            String string = Arrays.toString(this.f165719a);
            String string2 = Arrays.toString(this.f165720b);
            a aVar = this.f165721c;
            List<a> list = this.f165722d;
            String string3 = Arrays.toString(this.f165723e);
            List<e> list2 = this.f165724f;
            Byte b14 = this.f165725g;
            Integer num = this.f165726h;
            Boolean bool = this.f165727i;
            String string4 = Arrays.toString(this.f165728j);
            StringBuilder sbI = p6.b.i("SEData(seId=", string, ", tsmConfiguration=", string2, ", appletInstanceInfo=");
            sbI.append(aVar);
            sbI.append(", appletInfoList=");
            sbI.append(list);
            sbI.append(", sequenceCounterOfSSD=");
            v.e0.o(string3, ", sdInfoList=", ", chipDestinationId=", sbI, list2);
            sbI.append(b14);
            sbI.append(", balance=");
            sbI.append(num);
            sbI.append(", punchingStatus=");
            sbI.append(bool);
            sbI.append(", cid=");
            sbI.append(string4);
            sbI.append(")");
            return sbI.toString();
        }

        public f(byte[] bArr, byte[] bArr2, a aVar, List<a> list, byte[] bArr3, List<e> list2, Byte b14, Integer num, Boolean bool, byte[] bArr4) {
            this.f165719a = bArr;
            this.f165720b = bArr2;
            this.f165721c = aVar;
            this.f165722d = list;
            this.f165723e = bArr3;
            this.f165724f = list2;
            this.f165725g = b14;
            this.f165726h = num;
            this.f165727i = bool;
            this.f165728j = bArr4;
        }

        public f() {
            this(null, null, null, null, null, null, null, null, null, null, 1023, null);
        }
    }
}
