package ww0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p13.h0;
import p13.x;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v2 ww0.e[], still in use, count: 1, list:
  (r1v2 ww0.e[]) from 0x0063: CONSTRUCTOR (r1v2 ww0.e[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lww0/e;", "Lww0/f;", "", "<init>", "(Ljava/lang/String;I)V", "a", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements f {
    NO_DISCHARGE,
    CREAMY,
    EGG_WHITE,
    SPOTTING,
    STICKY,
    UNUSUAL,
    LIGHT,
    MEDIUM,
    HEAVY;


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f187542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<e> f187543b;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ w13.c f187554m;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f187555a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.CREAMY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.EGG_WHITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.HEAVY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.LIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e.MEDIUM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[e.NO_DISCHARGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[e.SPOTTING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[e.STICKY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[e.UNUSUAL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f187555a = iArr;
        }
    }

    static {
        e eVar = NO_DISCHARGE;
        e eVar2 = SPOTTING;
        e eVar3 = LIGHT;
        e eVar4 = MEDIUM;
        e eVar5 = HEAVY;
        f187554m = new w13.c(eVarArr);
        f187542a = new a(null);
        f187543b = x.k(eVar, eVar3, eVar4, eVar5, eVar2);
    }

    private e() {
        super(str, i);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f187553l.clone();
    }

    @Override // ww0.f
    public final String a(Context context) {
        int i14;
        context.getClass();
        switch (b.f187555a[ordinal()]) {
            case 1:
                i14 = R.string.mct_creamy;
                break;
            case 2:
                i14 = R.string.mct_egg_white;
                break;
            case 3:
                i14 = R.string.mct_heavy;
                break;
            case 4:
                i14 = R.string.mct_light;
                break;
            case 5:
                i14 = R.string.mct_medium;
                break;
            case 6:
                i14 = R.string.mct_no_discharge;
                break;
            case 7:
                i14 = R.string.mct_spotting;
                break;
            case 8:
                i14 = R.string.mct_sticky;
                break;
            case 9:
                i14 = R.string.mct_unusual;
                break;
            default:
                u0.r();
                return null;
        }
        String string = context.getString(i14);
        string.getClass();
        return string;
    }

    @Override // ww0.f
    public final int b() {
        switch (b.f187555a[ordinal()]) {
            case 1:
                return R.raw.icon_mct_discharge_creamy;
            case 2:
                return R.raw.icon_mct_discharge_egg_white;
            case 3:
                return R.raw.icon_mct_discharge_flow_3;
            case 4:
                return R.raw.icon_mct_discharge_flow_1;
            case 5:
                return R.raw.icon_mct_discharge_flow_2;
            case 6:
                return R.raw.icon_mct_discharge_flow_none;
            case 7:
                return R.raw.icon_mct_discharge_spotting;
            case 8:
                return R.raw.icon_mct_discharge_sticky;
            case 9:
                return R.raw.icon_mct_discharge_unusual;
            default:
                u0.r();
                return 0;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lww0/e$a;", "", "<init>", "()V", "", "Lww0/e;", "pregnancyDischargeList", "Ljava/util/List;", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v3, types: [java.util.Collection, java.util.List] */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
        public static List a(Context context, List list) {
            Collator collator = Collator.getInstance();
            collator.setStrength(1);
            ?? N0 = h0.N0(list, new d(new pk0.l(collator, 1), 0));
            ArrayList arrayList = new ArrayList((Collection) N0);
            tb1.c.a aVar = tb1.c.f163744a;
            i52.a.f91796a.getClass();
            ww0.a aVarL = i52.a.l();
            aVar.getClass();
            if (!tb1.c.a.a(aVarL)) {
                N0 = new ArrayList();
                for (Object obj : arrayList) {
                    if (!x.k(e.LIGHT, e.MEDIUM, e.HEAVY).contains((e) obj)) {
                        N0.add(obj);
                    }
                }
            }
            return N0;
        }

        private a() {
        }
    }
}
