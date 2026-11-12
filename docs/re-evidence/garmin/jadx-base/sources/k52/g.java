package k52;

import am.x0;
import c22.l3;
import c22.m3;
import c22.s3;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Set;
import m52.k;
import o13.m;
import o13.t;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import qs.y;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f102952a = m.b(new k01.a(27));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f102953b = m.b(new k01.a(28));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f102954c = m.b(new k01.a(29));

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f102956b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f102957c;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.f116762x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.f116761w.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.f116764z.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k.f116759t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[k.f116760v.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[k.f116763y.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[k.f116754n.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[k.f116757q.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[k.f116755o.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[k.f116758r.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[k.A.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[k.B.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[k.f116756p.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f102955a = iArr;
            int[] iArr2 = new int[y.values().length];
            try {
                iArr2[y.UNIT_DISTANCE_METER.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[y.UNIT_DISTANCE_MILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[y.UNIT_DISTANCE_FOOT.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[y.UNIT_DISTANCE_YARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[y.UNIT_DISTANCE_INCH.ordinal()] = 5;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[y.UNIT_DISTANCE_CENTIMETER.ordinal()] = 6;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[y.UNIT_DISTANCE_KILOMETER.ordinal()] = 7;
            } catch (NoSuchFieldError unused20) {
            }
            f102956b = iArr2;
            int[] iArr3 = new int[m52.d.values().length];
            try {
                iArr3[m52.d.INTERVAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[m52.d.OTHER.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            f102957c = iArr3;
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"k52/g$b", "Lcom/google/gson/reflect/TypeToken;", "", "", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends TypeToken<List<? extends String>> {
    }

    public static final double a(double d14, y yVar) {
        switch (yVar == null ? -1 : a.f102956b[yVar.ordinal()]) {
            case 2:
                l3.a aVar = l3.f23124b;
                m3 m3Var = m3.MILE;
                aVar.getClass();
                return l3.a.h(d14, m3Var);
            case 3:
                l3.a aVar2 = l3.f23124b;
                m3 m3Var2 = m3.FOOT;
                aVar2.getClass();
                return l3.a.h(d14, m3Var2);
            case 4:
                l3.a aVar3 = l3.f23124b;
                m3 m3Var3 = m3.YARD;
                aVar3.getClass();
                return l3.a.h(d14, m3Var3);
            case 5:
                l3.a aVar4 = l3.f23124b;
                m3 m3Var4 = m3.INCH;
                aVar4.getClass();
                return l3.a.h(d14, m3Var4);
            case 6:
                l3.a aVar5 = l3.f23124b;
                m3 m3Var5 = m3.CENTIMETER;
                aVar5.getClass();
                return l3.a.h(d14, m3Var5);
            case 7:
                l3.a aVar6 = l3.f23124b;
                m3 m3Var6 = m3.KILOMETER;
                aVar6.getClass();
                return l3.a.h(d14, m3Var6);
            default:
                return d14;
        }
    }

    public static final Set<k> b() {
        return (Set) f102952a.getValue();
    }

    public static final x0 c(k kVar) {
        switch (kVar == null ? -1 : a.f102955a[kVar.ordinal()]) {
            case 1:
                return x0.f4326r2;
            case 2:
                return x0.f4322q2;
            case 3:
                return x0.C2;
            case 4:
                return x0.f4309n1;
            case 5:
                return x0.f4293j1;
            case 6:
                return x0.f4329s2;
            default:
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0049  */
    public static final boolean d() {
        boolean z14;
        Object objFromJson = new Gson().fromJson(((c22.k) KoinJavaComponent.get$default(c22.k.class, null, null, 6, null)).e("workout_audio_prompts_enabled_roles"), new b().getType());
        objFromJson.getClass();
        List list = (List) objFromJson;
        if (list.contains("AnyUser")) {
            z14 = true;
        } else {
            if (list.contains("MBTester")) {
                s3.f23252a.getClass();
                if (s3.a("ROLE_MBTESTER")) {
                    z14 = true;
                }
            }
            z14 = false;
        }
        return bo1.a.a().c().S0() && z14;
    }

    public static final boolean e(k kVar) {
        kVar.getClass();
        return kVar == k.f116764z;
    }

    public static final boolean f(k kVar) {
        kVar.getClass();
        return b().contains(kVar);
    }
}
