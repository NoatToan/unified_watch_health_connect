package mp2;

import com.garmin.android.apps.connectmobile.R;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmp2/a;", "", "<init>", "(Ljava/lang/String;I)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f120057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f120058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f120059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f120060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f120061e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f120062f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a[] f120063g;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/ui/cardverification/model/CardVerificationMethodType.CARDHOLDER_TO_CALL_AUTOMATED_NUMBER", "Lmp2/a;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends a {
        public b(String str, int i14) {
            super(str, i14, null);
        }

        @Override // mp2.a
        public final String a(String str) {
            str.getClass();
            String string = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.verification_call_bank, str);
            string.getClass();
            return string;
        }

        @Override // mp2.a
        public final String b(String str) {
            str.getClass();
            String string = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.verification_call_bank_result, str);
            string.getClass();
            return string;
        }

        @Override // mp2.a
        public final String c() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/ui/cardverification/model/CardVerificationMethodType.CARDHOLDER_TO_CALL_MANNED_NUMBER", "Lmp2/a;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends a {
        public d(String str, int i14) {
            super(str, i14, null);
        }

        @Override // mp2.a
        public final String a(String str) {
            str.getClass();
            String string = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.add_card_customer_service, str);
            string.getClass();
            return string;
        }

        @Override // mp2.a
        public final String b(String str) {
            str.getClass();
            String string = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.add_card_customer_service, str);
            string.getClass();
            return string;
        }

        @Override // mp2.a
        public final String c() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/ui/cardverification/model/CardVerificationMethodType.CARDHOLDER_TO_USE_MOBILE_APP", "Lmp2/a;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends a {
        public e(String str, int i14) {
            super(str, i14, null);
        }

        @Override // mp2.a
        public final String a(String str) {
            str.getClass();
            String string = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.add_card_app_to_app, str);
            string.getClass();
            return string;
        }

        @Override // mp2.a
        public final String b(String str) {
            str.getClass();
            return null;
        }

        @Override // mp2.a
        public final String c() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/ui/cardverification/model/CardVerificationMethodType.CARDHOLDER_TO_USE_WEB_APP", "Lmp2/a;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f extends a {
        public f(String str, int i14) {
            super(str, i14, null);
        }

        @Override // mp2.a
        public final String a(String str) {
            str.getClass();
            String string = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.verify_online_with_issuer, str);
            string.getClass();
            return string;
        }

        @Override // mp2.a
        public final String b(String str) {
            str.getClass();
            return null;
        }

        @Override // mp2.a
        public final String c() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/ui/cardverification/model/CardVerificationMethodType.CARDHOLDER_TO_VISIT_WEBSITE", "Lmp2/a;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g extends a {
        public g(String str, int i14) {
            super(str, i14, null);
        }

        @Override // mp2.a
        public final String a(String str) {
            str.getClass();
            String string = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.verify_online_with_issuer, str);
            string.getClass();
            return string;
        }

        @Override // mp2.a
        public final String b(String str) {
            str.getClass();
            String string = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.verify_online_with_issuer, str);
            string.getClass();
            return string;
        }

        @Override // mp2.a
        public final String c() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/ui/cardverification/model/CardVerificationMethodType.TEXT_TO_CARDHOLDER_NUMBER", "Lmp2/a;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class j extends a {
        public j(String str, int i14) {
            super(str, i14, null);
        }

        @Override // mp2.a
        public final String a(String str) {
            str.getClass();
            String string = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.verification_text, str);
            string.getClass();
            return string;
        }

        @Override // mp2.a
        public final String b(String str) {
            str.getClass();
            String string = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.verification_text_result, str);
            string.getClass();
            return string;
        }

        @Override // mp2.a
        public final String c() {
            return kg.f.d((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null), R.string.verification_text_consent);
        }
    }

    static {
        b bVar = new b("CARDHOLDER_TO_CALL_AUTOMATED_NUMBER", 0);
        f120057a = bVar;
        a aVar = new a("EMAIL_TO_CARDHOLDER_ADDRESS", 1) { // from class: mp2.a.h
            {
                p005kotlin.jvm.internal.j jVar = null;
            }

            @Override // mp2.a
            public final String a(String str) {
                str.getClass();
                String string = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.verification_email, str);
                string.getClass();
                return string;
            }

            @Override // mp2.a
            public final String b(String str) {
                str.getClass();
                String string = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.verification_email_result, str);
                string.getClass();
                return string;
            }

            @Override // mp2.a
            public final String c() {
                return null;
            }
        };
        g gVar = new g("CARDHOLDER_TO_VISIT_WEBSITE", 2);
        f120058b = gVar;
        a aVar2 = new a("CARDHOLDER_TO_CALL_FOR_AUTOMATED_OTP_CODE", 3) { // from class: mp2.a.c
            {
                p005kotlin.jvm.internal.j jVar = null;
            }

            @Override // mp2.a
            public final String a(String str) {
                str.getClass();
                String string = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.verification_call_for_otp, str);
                string.getClass();
                return string;
            }

            @Override // mp2.a
            public final String b(String str) {
                str.getClass();
                String string = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.verification_call_for_otp, str);
                string.getClass();
                return string;
            }

            @Override // mp2.a
            public final String c() {
                return null;
            }
        };
        j jVar = new j("TEXT_TO_CARDHOLDER_NUMBER", 4);
        f120059c = jVar;
        a aVar3 = new a("ISSUER_TO_CALL_CARDHOLDER_NUMBER", 5) { // from class: mp2.a.i
            {
                p005kotlin.jvm.internal.j jVar2 = null;
            }

            @Override // mp2.a
            public final String a(String str) {
                str.getClass();
                String string = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.verification_issuer_call_cardholder, str);
                string.getClass();
                return string;
            }

            @Override // mp2.a
            public final String b(String str) {
                str.getClass();
                String string = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.verification_issuer_call_cardholder_result, str);
                string.getClass();
                return string;
            }

            @Override // mp2.a
            public final String c() {
                return null;
            }
        };
        d dVar = new d("CARDHOLDER_TO_CALL_MANNED_NUMBER", 6);
        f120060d = dVar;
        a aVar4 = new a("AGENT_TO_CALL_CARDHOLDER_NUMBER", 7) { // from class: mp2.a.a
            {
                p005kotlin.jvm.internal.j jVar2 = null;
            }

            @Override // mp2.a
            public final String a(String str) {
                str.getClass();
                String string = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.verification_call_cardholder_with_card_number, str);
                string.getClass();
                return string;
            }

            @Override // mp2.a
            public final String b(String str) {
                str.getClass();
                String string = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.verification_call_cardholder_with_card_number, str);
                string.getClass();
                return string;
            }

            @Override // mp2.a
            public final String c() {
                return null;
            }
        };
        e eVar = new e("CARDHOLDER_TO_USE_MOBILE_APP", 8);
        f120061e = eVar;
        f fVar = new f("CARDHOLDER_TO_USE_WEB_APP", 9);
        f120062f = fVar;
        f120063g = new a[]{bVar, aVar, gVar, aVar2, jVar, aVar3, dVar, aVar4, eVar, fVar};
    }

    public /* synthetic */ a(String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, i14);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f120063g.clone();
    }

    public abstract String a(String str);

    public abstract String b(String str);

    public abstract String c();

    private a(String str, int i14) {
        super(str, i14);
    }
}
