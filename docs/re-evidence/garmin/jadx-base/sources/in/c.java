package in;

import am.j;
import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.gncs.NotificationConstants;
import f12.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lc.u0;
import ls.g;
import ns.g3;
import ns.p;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.x;
import p13.y;
import r1.q2;
import yc.l2;
import zd0.o;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lin/c;", "", "Lyz1/d;", "status", "Lo70/c;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "primaryMetricValue", "", "Lk70/b;", "secondaryMetricValue", "Li53/c;", "last7DaysPrimaryData", "", "daysSinceLastActivity", "Lin/f;", "streakData", "streakCount", "", "isPrompt", "", "Lin/e;", "quickActions", "Lzd0/o$a;", "singleStartActivityCapableDevice", "<init>", "(Lyz1/d;Lo70/c;DLjava/util/Map;Li53/c;Ljava/lang/Integer;Li53/c;IZLjava/util/List;Lzd0/o$a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz1.d f94393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o70.c f94394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f94395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<k70.b, Double> f94396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i53.c<Double> f94397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f94398f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i53.c<f> f94399g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f94400h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f94401i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<e> f94402j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o.a f94403k;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f94404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f94405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f94406c;

        static {
            int[] iArr = new int[o70.c.values().length];
            try {
                iArr[o70.c.ALL_ACTIVITIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o70.c.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o70.c.CYCLING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o70.c.SWIMMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[o70.c.WALKING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[o70.c.MULTI_SPORT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[o70.c.FITNESS_EQUIPMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[o70.c.PARA_SPORTS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f94404a = iArr;
            int[] iArr2 = new int[b.values().length];
            try {
                iArr2[b.Total.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            f94405b = iArr2;
            int[] iArr3 = new int[k70.b.values().length];
            try {
                iArr3[k70.b.Distance.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[k70.b.Duration.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            f94406c = iArr3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(yz1.d dVar, o70.c cVar, double d14, Map<k70.b, Double> map, i53.c<Double> cVar2, Integer num, i53.c<f> cVar3, int i14, boolean z14, List<? extends e> list, o.a aVar) {
        dVar.getClass();
        cVar.getClass();
        map.getClass();
        cVar2.getClass();
        cVar3.getClass();
        list.getClass();
        this.f94393a = dVar;
        this.f94394b = cVar;
        this.f94395c = d14;
        this.f94396d = map;
        this.f94397e = cVar2;
        this.f94398f = num;
        this.f94399g = cVar3;
        this.f94400h = i14;
        this.f94401i = z14;
        this.f94402j = list;
        this.f94403k = aVar;
    }

    public static String b(k70.b bVar, b bVar2, Context context) {
        int i14 = a.f94406c[bVar.ordinal()];
        if (i14 == 1) {
            if (a.f94405b[bVar2.ordinal()] != 1) {
                u0.r();
                return null;
            }
            String string = context.getString(R.string.lbl_total_distance);
            string.getClass();
            return string;
        }
        if (i14 != 2) {
            return "";
        }
        if (a.f94405b[bVar2.ordinal()] != 1) {
            u0.r();
            return null;
        }
        String string2 = context.getString(R.string.activity_stats_details_total_time_label);
        string2.getClass();
        return string2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String a(double d14, k70.b bVar, Context context, boolean z14) throws Exception {
        l22.a aVar = new l22.a(context);
        u00.c cVar = null;
        Object[] objArr = 0;
        boolean zY = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
        int i14 = z14 ? 4 : 9;
        int i15 = a.f94406c[bVar.ordinal()];
        int i16 = 2;
        if (i15 != 1) {
            if (i15 != 2) {
                q2.u("Unsupported metric type");
                return null;
            }
            String strC = u00.b.c(new g3(aVar, null, 2, null), Double.valueOf(d14), i14, 4);
            if (strC != null) {
                return strC;
            }
        } else if (this.f94394b == o70.c.SWIMMING) {
            String strC2 = u00.b.c(new ns.q2(aVar, cVar, i16, objArr == true ? 1 : 0), new g(zY, d14), i14, 4);
            if (strC2 != null) {
                return strC2;
            }
        } else {
            String strC3 = u00.b.c(new p(aVar, false, false, null, null, 30, null), Double.valueOf(d14), i14 | 256, 4);
            if (strC3 != null) {
                return strC3;
            }
        }
        return "";
    }

    public final String c(Context context, boolean z14) throws Exception {
        context.getClass();
        o70.c cVar = this.f94394b;
        String strA = a(this.f94395c, d.c(cVar), context, z14);
        return z14 ? oi0.c.P(x.k(strA, b(d.c(cVar), b.Total, context))) : strA;
    }

    public final i53.c<o13.p<String, String>> d(Context context, boolean z14) {
        context.getClass();
        i53.c<o13.p<k70.b, b>> cVarD = d.d(this.f94394b);
        ArrayList arrayList = new ArrayList(y.r(cVarD, 10));
        for (o13.p<k70.b, b> pVar : cVarD) {
            k70.b bVar = pVar.f128594a;
            b bVar2 = pVar.f128595b;
            Double d14 = this.f94396d.get(bVar);
            Context context2 = context;
            boolean z15 = z14;
            arrayList.add(new o13.p(a(d14 != null ? d14.doubleValue() : 0.0d, bVar, context2, z15), b(bVar, bVar2, context2)));
            context = context2;
            z14 = z15;
        }
        return i53.a.e(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f94393a, cVar.f94393a) && this.f94394b == cVar.f94394b && Double.compare(this.f94395c, cVar.f94395c) == 0 && s.g(this.f94396d, cVar.f94396d) && s.g(this.f94397e, cVar.f94397e) && s.g(this.f94398f, cVar.f94398f) && s.g(this.f94399g, cVar.f94399g) && this.f94400h == cVar.f94400h && this.f94401i == cVar.f94401i && s.g(this.f94402j, cVar.f94402j) && s.g(this.f94403k, cVar.f94403k);
    }

    public final int hashCode() {
        int iA = l2.a(this.f94397e, j.b(this.f94396d, org.apache.commons.lang3.e.b((this.f94394b.hashCode() + (this.f94393a.hashCode() * 31)) * 31, 31, this.f94395c), 31), 31);
        Integer num = this.f94398f;
        int iB = u0.b(q6.f.g(q2.d(this.f94400h, l2.a(this.f94399g, (iA + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31, this.f94401i), 31, this.f94402j);
        o.a aVar = this.f94403k;
        return iB + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "ActivityTrendsCardDisplayData(status=" + this.f94393a + ", type=" + this.f94394b + ", primaryMetricValue=" + this.f94395c + ", secondaryMetricValue=" + this.f94396d + ", last7DaysPrimaryData=" + this.f94397e + ", daysSinceLastActivity=" + this.f94398f + ", streakData=" + this.f94399g + ", streakCount=" + this.f94400h + ", isPrompt=" + this.f94401i + ", quickActions=" + this.f94402j + ", singleStartActivityCapableDevice=" + this.f94403k + ")";
    }

    public /* synthetic */ c(yz1.d dVar, o70.c cVar, double d14, Map map, i53.c cVar2, Integer num, i53.c cVar3, int i14, boolean z14, List list, o.a aVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this(dVar, cVar, d14, map, cVar2, num, cVar3, i14, z14, list, (i15 & 1024) != 0 ? null : aVar);
    }
}
