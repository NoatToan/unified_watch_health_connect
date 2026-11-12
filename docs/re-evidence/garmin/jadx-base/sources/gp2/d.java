package gp2;

import com.garmin.android.apps.connectmobile.R;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgp2/d;", "", "<init>", "(Ljava/lang/String;I)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f78472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1581d f78473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f78474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f78475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f78476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f78477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f78478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f78479h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ d[] f78480i;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/ui/addcard/util/enums/FitPayCardInfoError.CARD_NUMBER_EMPTY", "Lgp2/d;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends d {
        public a(String str, int i14) {
            super(str, i14, null);
        }

        @Override // gp2.d
        public final String a() {
            return kg.f.d((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null), R.string.number_required);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/ui/addcard/util/enums/FitPayCardInfoError.CARD_NUMBER_INVALID", "Lgp2/d;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends d {
        public b(String str, int i14) {
            super(str, i14, null);
        }

        @Override // gp2.d
        public final String a() {
            return kg.f.d((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null), R.string.pan_not_valid);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/ui/addcard/util/enums/FitPayCardInfoError.CARD_NUMBER_LUHN_CHECK_FAILED", "Lgp2/d;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends d {
        public c(String str, int i14) {
            super(str, i14, null);
        }

        @Override // gp2.d
        public final String a() {
            return kg.f.d((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null), R.string.pan_not_valid);
        }
    }

    /* JADX INFO: renamed from: gp2.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/ui/addcard/util/enums/FitPayCardInfoError.CARD_NUMBER_NOT_SUPPORTED", "Lgp2/d;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1581d extends d {
        public C1581d(String str, int i14) {
            super(str, i14, null);
        }

        @Override // gp2.d
        public final String a() {
            return kg.f.d((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null), R.string.card_type_not_supported);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/ui/addcard/util/enums/FitPayCardInfoError.EXPIRATION_MONTH_NOT_SELECTED", "Lgp2/d;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends d {
        public e(String str, int i14) {
            super(str, i14, null);
        }

        @Override // gp2.d
        public final String a() {
            return kg.f.d((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null), R.string.expiration_month_required);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/ui/addcard/util/enums/FitPayCardInfoError.EXPIRATION_YEAR_NOT_SELECTED", "Lgp2/d;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f extends d {
        public f(String str, int i14) {
            super(str, i14, null);
        }

        @Override // gp2.d
        public final String a() {
            return kg.f.d((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null), R.string.expiration_year_required);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/ui/addcard/util/enums/FitPayCardInfoError.NAME_ON_CARD_IS_EMPTY", "Lgp2/d;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g extends d {
        public g(String str, int i14) {
            super(str, i14, null);
        }

        @Override // gp2.d
        public final String a() {
            return kg.f.d((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null), R.string.name_on_card_required);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/feature/garminpay/providers/gpay/ui/addcard/util/enums/FitPayCardInfoError.SECURITY_CODE_INVALID", "Lgp2/d;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class h extends d {
        public h(String str, int i14) {
            super(str, i14, null);
        }

        @Override // gp2.d
        public final String a() {
            return kg.f.d((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null), R.string.cvv_not_valid);
        }
    }

    static {
        g gVar = new g("NAME_ON_CARD_IS_EMPTY", 0);
        f78472a = gVar;
        C1581d c1581d = new C1581d("CARD_NUMBER_NOT_SUPPORTED", 1);
        f78473b = c1581d;
        a aVar = new a("CARD_NUMBER_EMPTY", 2);
        f78474c = aVar;
        c cVar = new c("CARD_NUMBER_LUHN_CHECK_FAILED", 3);
        f78475d = cVar;
        b bVar = new b("CARD_NUMBER_INVALID", 4);
        f78476e = bVar;
        e eVar = new e("EXPIRATION_MONTH_NOT_SELECTED", 5);
        f78477f = eVar;
        f fVar = new f("EXPIRATION_YEAR_NOT_SELECTED", 6);
        f78478g = fVar;
        h hVar = new h("SECURITY_CODE_INVALID", 7);
        f78479h = hVar;
        f78480i = new d[]{gVar, c1581d, aVar, cVar, bVar, eVar, fVar, hVar};
    }

    public /* synthetic */ d(String str, int i14, j jVar) {
        this(str, i14);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f78480i.clone();
    }

    public abstract String a();

    private d(String str, int i14) {
        super(str, i14);
    }
}
