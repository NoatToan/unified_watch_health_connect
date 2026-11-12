package pn2;

import android.content.SharedPreferences;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.R;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p13.w;
import p13.x;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\r"}, d2 = {"Lpn2/a;", "", "<init>", "()V", "g", IntegerTokenConverter.CONVERTER_KEY, "f", "b", JWKParameterNames.RSA_EXPONENT, "c", "h", "a", "d", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f138690a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o13.t f138691b = o13.m.b(new pk0.m(1));

    /* JADX INFO: renamed from: pn2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpn2/a$a;", "", "", "hexString", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum EnumC2623a {
        CRS("A00000015143525300"),
        ISD("A000000151000000"),
        AMSD("A0000006800200007F00000000000000"),
        ENC_SD("A0000006800200007F01000000000000"),
        SSD("A0000006800200007F00000000010000"),
        MSI("A0000006800200000003000000000000"),
        INSTANCE0("A0000006800200000003000000000001"),
        INSTANCE1("A0000006800200000003000000000002");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f138701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o13.t f138702b = o13.m.b(new ov1.u(this, 15));

        EnumC2623a(String str) {
            this.f138701a = str;
        }

        public final byte[] a() {
            Object value = this.f138702b.getValue();
            value.getClass();
            return (byte[]) value;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lpn2/a$c;", "", "Lpn2/t;", "userInfo", "", "sfAmount", "paymentToken", "<init>", "(Lpn2/t;Ljava/lang/String;Ljava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t f138711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f138712b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f138713c;

        public c(t tVar, String str, String str2) {
            tVar.getClass();
            str.getClass();
            str2.getClass();
            this.f138711a = tVar;
            this.f138712b = str;
            this.f138713c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f138711a.equals(cVar.f138711a) && this.f138712b.equals(cVar.f138712b) && this.f138713c.equals(cVar.f138713c);
        }

        public final int hashCode() {
            return this.f138713c.hashCode() + wr.g.j(this.f138711a.hashCode() * 31, 31, this.f138712b);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("ExpertOptionParams(userInfo=");
            sb3.append(this.f138711a);
            sb3.append(", sfAmount=");
            sb3.append(this.f138712b);
            sb3.append(", paymentToken=");
            return am.j.o(this.f138713c, ")", sb3);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lpn2/a$d;", "Lun2/c;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements un2.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f138714a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f138715b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final List<String> f138716c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final List<String> f138717d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f138718e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f138719f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f138720g;

        static {
            a.f138690a.getClass();
            f138715b = a.b().f138727b;
            f138716c = x.k("AMEX", "DISCOVER", "JCB", "MASTERCARD", "VISA");
            f138717d = w.c("PAN_ONLY");
            f138718e = "JPY";
            f138719f = "sbps";
            f138720g = "72242001";
        }

        private d() {
        }

        @Override // un2.c
        public final List<String> a() {
            return f138717d;
        }

        @Override // un2.c
        public final String b() {
            return f138720g;
        }

        @Override // un2.c
        public final int c() {
            return f138715b;
        }

        @Override // un2.c
        public final String d() {
            return f138719f;
        }

        @Override // un2.c
        public final List<String> e() {
            return f138716c;
        }

        @Override // un2.c
        public final String getCurrencyCode() {
            return f138718e;
        }

        /* JADX INFO: renamed from: pn2.a$d$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lpn2/a$d$a;", "", "", "title", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public enum EnumC2625a {
            Test("Test", 3),
            Prod("Prod", 1);


            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C2626a f138721c = new C2626a(null);

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f138722d = R.string.felica_google_pay_server_environment;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f138726a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f138727b;

            EnumC2625a(String str, int i14) {
                this.f138726a = str;
                this.f138727b = i14;
            }

            /* JADX INFO: renamed from: pn2.a$d$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpn2/a$d$a$a;", "Lpn2/a$g;", "Lpn2/a$d$a;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class C2626a implements g<EnumC2625a> {
                public /* synthetic */ C2626a(p005kotlin.jvm.internal.j jVar) {
                    this();
                }

                @Override // pn2.a.g
                public final /* bridge */ EnumC2625a E() {
                    return (EnumC2625a) super.E();
                }

                @Override // pn2.a.g
                public final EnumC2625a a(String str) {
                    return EnumC2625a.valueOf(str);
                }

                @Override // pn2.a.g
                public final int b() {
                    return EnumC2625a.f138722d;
                }

                private C2626a() {
                }
            }
        }
    }

    public interface g<T> {
        default T E() {
            String string;
            wr2.p pVar = wr2.p.f186870a;
            int iB = b();
            pVar.getClass();
            SharedPreferences sharedPreferencesA = wr2.p.a("general_app");
            if (sharedPreferencesA != null) {
                String string2 = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(iB);
                string2.getClass();
                string = sharedPreferencesA.getString(string2, null);
            } else {
                string = null;
            }
            if (string != null) {
                return a(string);
            }
            return null;
        }

        T a(String str);

        int b();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpn2/a$h;", "", "", "title", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum h {
        PRODUCTION("Production Logic"),
        FORCE_PERMANENT_DELETE("Force Permanent Delete"),
        FORCE_DELETE_WITH_BALANCE("Force Delete With Balance"),
        FORCE_DELETE("Force Delete");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f138751a;

        h(String str) {
            this.f138751a = str;
        }
    }

    private a() {
    }

    public static b a() {
        b bVar = (b) b.f138703d.E();
        if (bVar != null) {
            return bVar;
        }
        kj0.b.f104940a.getClass();
        return kj0.b.a() == zi2.a.TEST ? b.SonyLab : b.Prod;
    }

    public static d.EnumC2625a b() {
        d.EnumC2625a enumC2625a = (d.EnumC2625a) d.EnumC2625a.f138721c.E();
        if (enumC2625a != null) {
            return enumC2625a;
        }
        kj0.b.f104940a.getClass();
        return kj0.b.a() == zi2.a.TEST ? d.EnumC2625a.Test : d.EnumC2625a.Prod;
    }

    public static e c() {
        e eVar = (e) e.f138728b.E();
        if (eVar != null) {
            return eVar;
        }
        kj0.b.f104940a.getClass();
        return kj0.b.a() == zi2.a.TEST ? e.Test : e.Prod;
    }

    public static f d() {
        f fVar = (f) f.f138734f.E();
        if (fVar != null) {
            return fVar;
        }
        kj0.b.f104940a.getClass();
        return kj0.b.a() == zi2.a.TEST ? f.SonyLab : f.Prod;
    }

    public static i e() {
        i iVar = (i) i.f138752e.E();
        if (iVar != null) {
            return iVar;
        }
        kj0.b.f104940a.getClass();
        return kj0.b.a() == zi2.a.TEST ? i.SonyLab : i.Prod;
    }

    public static String f() {
        kj0.b.f104940a.getClass();
        return yr2.g.b(kj0.b.a()).concat("/com.garmin.connect.mobile/garmin-pay/image/image_suica.png");
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lpn2/a$b;", "", "", "title", "dsId", "dpId", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        Prod("Production", "DSC00001", "DPC00001"),
        /* JADX INFO: Fake field, exist only in values array */
        ThreeWay("ThreeWay", "DS900001", "DP900001"),
        /* JADX INFO: Fake field, exist only in values array */
        Omiya("Omiya", "DSC00001", "DPC00001"),
        SonyLab("SonyLab", "DSC00001", "DPC00001");


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C2624a f138703d = new C2624a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f138704e = R.string.felica_dp_server_environment;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f138708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f138709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f138710c;

        b(String str, String str2, String str3) {
            this.f138708a = str;
            this.f138709b = str2;
            this.f138710c = str3;
        }

        @Override // java.lang.Enum
        public final String toString() {
            StringBuilder sbL = e5.l(this.f138708a, "\n{ dsId=", this.f138709b, ", dpId=", this.f138710c);
            sbL.append(" }\n");
            return sbL.toString();
        }

        /* JADX INFO: renamed from: pn2.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpn2/a$b$a;", "Lpn2/a$g;", "Lpn2/a$b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C2624a implements g<b> {
            public /* synthetic */ C2624a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            @Override // pn2.a.g
            public final /* bridge */ b E() {
                return (b) super.E();
            }

            @Override // pn2.a.g
            public final b a(String str) {
                return b.valueOf(str);
            }

            @Override // pn2.a.g
            public final int b() {
                return b.f138704e;
            }

            private C2624a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lpn2/a$e;", "", "", "sourceUrlPath", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum e {
        Prod("/garminpay/suica/suica-initial-charge-options.json"),
        Test("/garminpay/suica/suica-initial-charge-options-test.json");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C2627a f138728b = new C2627a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f138729c = R.string.felica_initial_charge_options_source;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f138733a;

        e(String str) {
            this.f138733a = str;
        }

        /* JADX INFO: renamed from: pn2.a$e$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpn2/a$e$a;", "Lpn2/a$g;", "Lpn2/a$e;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C2627a implements g<e> {
            public /* synthetic */ C2627a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            @Override // pn2.a.g
            public final /* bridge */ e E() {
                return (e) super.E();
            }

            @Override // pn2.a.g
            public final e a(String str) {
                return e.valueOf(str);
            }

            @Override // pn2.a.g
            public final int b() {
                return e.f138729c;
            }

            private C2627a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB1\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lpn2/a$f;", "", "", "title", "sepId", "platformType", "seType", "carrierId", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum f {
        Prod("Production", "100008", "0F", "10", "000078"),
        FnTest("FnTest", "100008", "0F", "10", "000078"),
        FnCertificate("FnCertificate", "100008", "0F", "10", "000078"),
        SonyLab("SonyLab", "100008", "0F", "10", "000078");


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final C2628a f138734f = new C2628a(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f138735g = R.string.felica_mfi_server_environment;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f138741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f138742b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f138743c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f138744d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f138745e;

        f(String str, String str2, String str3, String str4, String str5) {
            this.f138741a = str;
            this.f138742b = str2;
            this.f138743c = str3;
            this.f138744d = str4;
            this.f138745e = str5;
        }

        @Override // java.lang.Enum
        public final String toString() {
            StringBuilder sbL = e5.l(this.f138741a, "\n{ sepId=", this.f138742b, ", platformType=", this.f138743c);
            sn.a.t(sbL, ", seType=", this.f138744d, ", carrierId=", this.f138745e);
            sbL.append(" }\n");
            return sbL.toString();
        }

        /* JADX INFO: renamed from: pn2.a$f$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpn2/a$f$a;", "Lpn2/a$g;", "Lpn2/a$f;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C2628a implements g<f> {
            public /* synthetic */ C2628a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            @Override // pn2.a.g
            public final /* bridge */ f E() {
                return (f) super.E();
            }

            @Override // pn2.a.g
            public final f a(String str) {
                return f.valueOf(str);
            }

            @Override // pn2.a.g
            public final int b() {
                return f.f138735g;
            }

            private C2628a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lpn2/a$i;", "", "", "title", "serviceId", "spId", "spAdditionalInfoType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum i {
        Prod("Production", "SV000027", "CP002110", "SV0000270112"),
        JreSandbox("JreSandbox", "SV000027", "SPCHP007", "SV0000270112"),
        FnEmulated1SpServer("FnEmulated1SpServer", "SV900035", "SPT22001", "SV9000359999"),
        FnEmulated2SpServer("FnEmulated2SpServer", "SV900036", "SPT23001", "SV9000369999"),
        Omiya("Omiya", "SV000027", "SPCHP001", "SV0000270112"),
        SonyLab("SonyLab", "SV800041", "SPCFN900", "SV8000410001");


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final C2629a f138752e = new C2629a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f138753f = R.string.felica_sp_server_environment;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f138761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f138762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f138763c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f138764d;

        i(String str, String str2, String str3, String str4) {
            this.f138761a = str;
            this.f138762b = str2;
            this.f138763c = str3;
            this.f138764d = str4;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return e0.h(e5.l(this.f138761a, "\n{serviceId=", this.f138762b, ", spId=", this.f138763c), ", spAdditionalInfoType=", this.f138764d, " }\n");
        }

        /* JADX INFO: renamed from: pn2.a$i$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpn2/a$i$a;", "Lpn2/a$g;", "Lpn2/a$i;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C2629a implements g<i> {
            public /* synthetic */ C2629a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            @Override // pn2.a.g
            public final /* bridge */ i E() {
                return (i) super.E();
            }

            @Override // pn2.a.g
            public final i a(String str) {
                return i.valueOf(str);
            }

            @Override // pn2.a.g
            public final int b() {
                return i.f138753f;
            }

            private C2629a() {
            }
        }
    }
}
