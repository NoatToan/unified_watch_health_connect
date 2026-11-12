package aq2;

import c22.s3;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.feature.garminpay.providers.gpay.ui.addcard.util.deserializer.FitPayCardTransactionsDeserializer;
import com.garmin.feature.garminpay.providers.gpay.ui.addcard.util.deserializer.FitPayCardTypeDeserializer;
import com.garmin.feature.garminpay.providers.gpay.ui.addcard.util.deserializer.FitPayCountriesDeserializer;
import com.garmin.feature.garminpay.providers.gpay.ui.addcard.util.deserializer.FitPayCredentialDeserializer;
import com.garmin.feature.garminpay.providers.gpay.ui.addcard.util.deserializer.FitPayCreditCardCollectionDeserializer;
import com.garmin.feature.garminpay.providers.gpay.ui.addcard.util.deserializer.FitPayCreditCardDeserializer;
import com.garmin.feature.garminpay.providers.gpay.ui.addcard.util.deserializer.FitPayPaymentCardDeserializer;
import com.garmin.feature.garminpay.providers.gpay.ui.addcard.util.deserializer.FitPayStateDeserializer;
import com.garmin.feature.garminpay.providers.gpay.ui.addcard.util.deserializer.FitPayVerificationMethodDeserializer;
import com.garmin.feature.garminpay.providers.gpay.ui.addcard.util.deserializer.FitPayVerificationMethodsCollectionDeserializer;
import com.garmin.feature.garminpay.providers.gpay.util.GarminPayEnumTypeAdapterFactory;
import com.garmin.feature.garminpay.providers.gpay.util.deserializers.CollectionDeserializer;
import com.garmin.feature.garminpay.providers.gpay.util.deserializers.DeviceCommitsDeserializer;
import com.garmin.feature.garminpay.providers.gpay.util.deserializers.FitPayDateTimeTypeAdapter;
import com.garmin.feature.garminpay.providers.gpay.util.deserializers.FitPayDeviceDeserializer;
import com.garmin.feature.garminpay.providers.gpay.util.deserializers.FitPayDevicesDeserializer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import fo2.s;
import fo2.v;
import lc.u0;
import o13.m;
import o13.t;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import wr2.p;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Laq2/j;", "", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f12491a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f12492b = m.b(new ak0.t(16));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f12493c = m.b(new ak0.t(17));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f12494d = m.b(new ak0.t(18));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f12495e = {"Remote Config", "Access Token", "OAuth 2"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f12496f = {-96, 0, 0, 1, 81, 0, 0};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Gson f12497g;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12511a;

        static {
            int[] iArr = new int[zi2.a.values().length];
            try {
                iArr[zi2.a.CHINA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zi2.a.TEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[zi2.a.TEST_SSO_CHINA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[zi2.a.PROD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[zi2.a.AQUA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[zi2.a.JADE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[zi2.a.STAGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[zi2.a.CHINA_TEST.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[zi2.a.DEMO.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[zi2.a.PINK.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[zi2.a.BLUE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[zi2.a.RED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[zi2.a.MANGO.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f12511a = iArr;
        }
    }

    private j() {
    }

    public static a a(zi2.a aVar) {
        switch (b.f12511a[aVar.ordinal()]) {
            case 1:
                return a.f12499b;
            case 2:
            case 4:
                return a.f12498a;
            case 3:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                a.C0172a c0172a = a.f12498a;
                i2.a aVar2 = i2.f36769a;
                aVar2.getClass();
                i2.a.o(a2.GENERAL, "Unsupported GC env " + aVar + ", wire up to FitPay prod");
                return c0172a;
            case 5:
                return a.f12500c;
            case 6:
                return a.f12501d;
            default:
                u0.r();
                return null;
        }
    }

    public static String b(zi2.a aVar) {
        aVar.getClass();
        int i14 = b.f12511a[aVar.ordinal()];
        if (i14 == 1) {
            return "55oXUxHgKPnZti9Jx4DLC9uDVHnF49du";
        }
        if (i14 == 2 || i14 == 3) {
            return "qfDXt9HhuIDK2AlRU8VrYJHtfSc0lUTI";
        }
        if (i14 != 5) {
            return i14 != 6 ? "cJCr5EbsbKJfD1ClB8VShVxtU6IFhMm1" : "fitpay";
        }
        return "garmin";
    }

    public static String c(zi2.a aVar) {
        aVar.getClass();
        int i14 = b.f12511a[aVar.ordinal()];
        if (i14 != 1) {
            return (i14 == 2 || i14 == 3) ? "https://connecttest.garmin.com/status/" : "https://connect.garmin.com/status/";
        }
        return "https://connect.garmin.cn/status/";
    }

    public static Gson d() {
        Gson gson = f12497g;
        if (gson != null) {
            return gson;
        }
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        gsonBuilder.registerTypeAdapterFactory(new GarminPayEnumTypeAdapterFactory());
        gsonBuilder.registerTypeAdapter(yo2.f.class, new FitPayCreditCardCollectionDeserializer());
        gsonBuilder.registerTypeAdapter(yo2.b.class, new FitPayCreditCardDeserializer());
        gsonBuilder.registerTypeAdapter(zo2.a.class, new FitPayPaymentCardDeserializer());
        gsonBuilder.registerTypeAdapter(ep2.d.class, new FitPayCredentialDeserializer());
        gsonBuilder.registerTypeAdapter(ep2.b.class, new FitPayCardTypeDeserializer());
        gsonBuilder.registerTypeAdapter(xo2.e.class, new DeviceCommitsDeserializer());
        gsonBuilder.registerTypeAdapter(v.class, new FitPayDevicesDeserializer());
        gsonBuilder.registerTypeAdapter(dq2.g.class, new FitPayVerificationMethodsCollectionDeserializer());
        gsonBuilder.registerTypeAdapter(dq2.f.class, new FitPayVerificationMethodDeserializer());
        gsonBuilder.registerTypeAdapter(c.class, new FitPayCountriesDeserializer());
        gsonBuilder.registerTypeAdapter(g.class, new FitPayStateDeserializer());
        gsonBuilder.registerTypeAdapter(vp2.d.class, new FitPayCardTransactionsDeserializer());
        gsonBuilder.registerTypeAdapter(DateTime.class, new FitPayDateTimeTypeAdapter());
        gsonBuilder.registerTypeAdapter(fo2.b.class, new CollectionDeserializer());
        gsonBuilder.registerTypeAdapter(s.class, new FitPayDeviceDeserializer());
        Gson gsonCreate = gsonBuilder.create();
        f12497g = gsonCreate;
        gsonCreate.getClass();
        return gsonCreate;
    }

    public static boolean e() {
        p.f186870a.getClass();
        return p.b("dynamic_feature_app", "SKIP_DEVICE_CHECK", false);
    }

    public static boolean f() {
        p pVar = p.f186870a;
        s3.f23252a.getClass();
        boolean zA = s3.a("ROLE_MBTESTER");
        pVar.getClass();
        return p.b("dynamic_feature_app", "INCLUDE_UNRELEASED", zA);
    }

    public static boolean g() {
        p pVar = p.f186870a;
        s3.f23252a.getClass();
        boolean zA = s3.a("ROLE_MBTESTER");
        pVar.getClass();
        return p.b("dynamic_feature_app", "SKIP_DELETABLE_CHECK", zA);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Laq2/j$a;", "", "<init>", "(Ljava/lang/String;I)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0172a f12498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f12499b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f12500c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f12501d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ a[] f12502e;

        /* JADX INFO: renamed from: aq2.j$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/util/NewFitPayConstants.FitPayServerUrls.PROD", "Laq2/j$a;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0172a extends a {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final String f12503f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final String f12504g;

            public C0172a(String str, int i14) {
                super(str, i14, null);
                this.f12503f = "https://api.fit-pay.com";
                this.f12504g = "https://webapp.fit-pay.com";
            }

            @Override // aq2.j.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF12509f() {
                return this.f12503f;
            }

            @Override // aq2.j.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getF12510g() {
                return this.f12504g;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/util/NewFitPayConstants.FitPayServerUrls.PROD_CN", "Laq2/j$a;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b extends a {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final String f12505f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final String f12506g;

            public b(String str, int i14) {
                super(str, i14, null);
                this.f12505f = "https://api.gp.garmin.cn";
                this.f12506g = "https://webapp.gp.garmin.cn";
            }

            @Override // aq2.j.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF12509f() {
                return this.f12505f;
            }

            @Override // aq2.j.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getF12510g() {
                return this.f12506g;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/util/NewFitPayConstants.FitPayServerUrls.QA", "Laq2/j$a;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class c extends a {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final String f12507f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final String f12508g;

            public c(String str, int i14) {
                super(str, i14, null);
                this.f12507f = "https://api.qa.fitpay.ninja";
                this.f12508g = "https://webapp.qa.fitpay.ninja";
            }

            @Override // aq2.j.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF12509f() {
                return this.f12507f;
            }

            @Override // aq2.j.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getF12510g() {
                return this.f12508g;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/util/NewFitPayConstants.FitPayServerUrls.QA_CN", "Laq2/j$a;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class d extends a {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final String f12509f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final String f12510g;

            public d(String str, int i14) {
                super(str, i14, null);
                this.f12509f = "https://api.qa.gp.garmin.cn";
                this.f12510g = "https://ext.qa.gp.garmin.cn";
            }

            @Override // aq2.j.a
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF12509f() {
                return this.f12509f;
            }

            @Override // aq2.j.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getF12510g() {
                return this.f12510g;
            }
        }

        static {
            C0172a c0172a = new C0172a("PROD", 0);
            f12498a = c0172a;
            b bVar = new b("PROD_CN", 1);
            f12499b = bVar;
            c cVar = new c("QA", 2);
            f12500c = cVar;
            d dVar = new d("QA_CN", 3);
            f12501d = dVar;
            f12502e = new a[]{c0172a, bVar, cVar, dVar};
        }

        public /* synthetic */ a(String str, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, i14);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f12502e.clone();
        }

        /* JADX INFO: renamed from: a */
        public abstract String getF12509f();

        /* JADX INFO: renamed from: b */
        public abstract String getF12510g();

        private a(String str, int i14) {
            super(str, i14);
        }
    }
}
