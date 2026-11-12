package kx;

import android.content.Context;
import android.graphics.Shader;
import ch.qos.logback.core.CoreConstants;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import g22.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.Minutes;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import p13.d0;
import p13.h0;
import p13.j0;
import p13.y;
import zx0.m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lkx/a;", "Lqz/c;", "Ljx/d;", "Lcom/github/mikephil/charting/interfaces/datasets/IBarLineScatterCandleBubbleDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements qz.c<jx.d, IBarLineScatterCandleBubbleDataSet<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f107000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gt.c f107001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gt.c f107002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f107003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f107004e;

    static {
        new C2063a(null);
    }

    public a(Context context) {
        context.getClass();
        this.f107000a = context;
        this.f107001b = new gt.c(context, true, true, false, true);
        this.f107002c = new gt.c(context, true, false, true, true);
        this.f107003d = new f(context);
        this.f107004e = new ArrayList();
    }

    @Override // qz.c
    public final List<IBarLineScatterCandleBubbleDataSet<?>> a(jx.d dVar) {
        jx.d dVar2 = dVar;
        ArrayList arrayList = new ArrayList();
        jx.c cVar = jx.c.STRESS;
        ArrayList arrayList2 = this.f107004e;
        if (arrayList2.contains(cVar)) {
            List<BarDataSet> listA = this.f107001b.a(dVar2 != null ? dVar2.f101395b : null);
            listA.getClass();
            arrayList.addAll(listA);
        }
        if (arrayList2.contains(jx.c.REST)) {
            List<BarDataSet> listA2 = this.f107002c.a(dVar2 != null ? dVar2.f101395b : null);
            listA2.getClass();
            arrayList.addAll(listA2);
        }
        if (arrayList2.contains(jx.c.BODY_BATTERY)) {
            arrayList.addAll(this.f107003d.a(dVar2 != null ? dVar2.f101394a : null));
        }
        return arrayList;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final Integer c(jx.d dVar) {
        this.f107003d.getClass();
        return Integer.valueOf(MathKt.c(1440.0f));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(jx.d dVar) {
        return false;
    }

    @Override // qz.c
    public final float e(jx.d dVar) {
        Interval interval;
        List<gs1.e.a> list;
        gs1.e.a aVar;
        jx.d dVar2 = dVar;
        if (dVar2 == null || (interval = dVar2.f101396c) == null) {
            this.f107003d.getClass();
            return 0.0f;
        }
        jx.a aVar2 = dVar2.f101394a;
        DateTime dateTime = (aVar2 == null || (list = aVar2.f101386c) == null || (aVar = (gs1.e.a) h0.d0(list)) == null) ? null : aVar.f78729a;
        if (dateTime == null) {
            return 0.0f;
        }
        j00.g gVar = j00.g.f95975a;
        DateTime start = interval.getStart();
        start.getClass();
        gVar.getClass();
        return j00.g.a(1, start, dateTime) % 3;
    }

    @Override // qz.c
    public final List f(jx.d dVar) {
        return this.f107001b.y();
    }

    @Override // qz.c
    public final List g(jx.d dVar) {
        jx.d dVar2 = dVar;
        if ((dVar2 != null ? dVar2.f101396c : null) != null) {
            return null;
        }
        jx.a aVar = dVar2 != null ? dVar2.f101394a : null;
        return m.g(this.f107003d.f107019a, aVar != null ? aVar.f101384a : null, new zw.b(3));
    }

    @Override // qz.c
    public final float i(jx.d dVar) {
        this.f107001b.getClass();
        return 100.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(jx.d dVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(jx.d dVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final void n(Object... objArr) {
        ArrayList arrayList = this.f107004e;
        arrayList.clear();
        d0.w(arrayList, objArr);
    }

    @Override // qz.c
    public final List o(jx.d dVar) {
        Interval interval;
        String strA;
        jx.d dVar2 = dVar;
        if (dVar2 == null || (interval = dVar2.f101396c) == null) {
            return null;
        }
        DateTime start = interval.getStart();
        start.getClass();
        DateTime dateTimeB = k.B(start);
        DateTime end = interval.getEnd();
        end.getClass();
        DateTime dateTimeB2 = k.B(end);
        j00.f fVar = j00.f.f95974a;
        this.f107003d.getClass();
        ArrayList<DateTime> arrayListA = j00.f.a(fVar, dateTimeB, dateTimeB2, MathKt.c(1440.0f), 12);
        j00.e eVar = new j00.e(this.f107000a);
        int minutes = Minutes.minutesBetween(dateTimeB, dateTimeB2).getMinutes();
        float f14 = minutes >= 30 ? minutes / 4 : 0.0f;
        ArrayList arrayList = new ArrayList(3);
        int i14 = 0;
        while (i14 < 3) {
            i14++;
            arrayList.add(Integer.valueOf(MathKt.c(i14 * f14)));
        }
        ArrayList arrayList2 = new ArrayList(y.r(arrayListA, 10));
        for (DateTime dateTime : arrayListA) {
            if (s.g(dateTime, dateTimeB)) {
                strA = eVar.a(dateTime, j00.d.START);
            } else if (s.g(dateTime, dateTimeB2)) {
                strA = eVar.a(dateTime, j00.d.END);
            } else {
                strA = (dateTime == null || !arrayList.contains(Integer.valueOf(Minutes.minutesBetween(dateTimeB, dateTime).getMinutes()))) ? eVar.a(dateTime, j00.d.NOT_REQUIRED) : eVar.a(dateTime, j00.d.REQUIRED);
            }
            arrayList2.add(strA);
        }
        return arrayList2;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(jx.d dVar) {
        return null;
    }

    @Override // qz.c
    public final float q(jx.d dVar) {
        Interval interval;
        int iAbs;
        List<gs1.e.a> list;
        gs1.e.a aVar;
        jx.d dVar2 = dVar;
        if (dVar2 == null || (interval = dVar2.f101396c) == null) {
            this.f107003d.getClass();
            return 1440.0f;
        }
        jx.a aVar2 = dVar2.f101394a;
        DateTime dateTime = (aVar2 == null || (list = aVar2.f101386c) == null || (aVar = (gs1.e.a) h0.n0(list)) == null) ? null : aVar.f78729a;
        DateTime end = interval.getEnd();
        float f14 = 0.0f;
        if (dateTime != null) {
            j00.g gVar = j00.g.f95975a;
            end.getClass();
            gVar.getClass();
            int iA = j00.g.a(1, dateTime, end) % 3;
            if (iA >= 0) {
                int i14 = 3 - iA;
                Integer numValueOf = i14 > 1 ? Integer.valueOf(i14) : null;
                if (numValueOf != null) {
                    iAbs = numValueOf.intValue();
                }
            } else {
                iAbs = Math.abs(iA);
            }
            f14 = iAbs;
        }
        j00.g gVar2 = j00.g.f95975a;
        DateTime start = interval.getStart();
        start.getClass();
        end.getClass();
        gVar2.getClass();
        return j00.g.a(1, start, end) + f14;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(jx.d dVar) {
        return null;
    }

    @Override // qz.c
    public final float t(jx.d dVar) {
        this.f107001b.getClass();
        return -8.0f;
    }

    @Override // qz.c
    public final List u(jx.d dVar) {
        List<gs1.e.C1588e> list;
        boolean z14;
        jx.d dVar2 = dVar;
        ArrayList arrayList = new ArrayList();
        jx.a aVar = dVar2 != null ? dVar2.f101394a : null;
        RandomAccess randomAccessU = this.f107003d.u(aVar);
        jx.c cVar = jx.c.BODY_BATTERY;
        ArrayList arrayList2 = this.f107004e;
        if (!arrayList2.contains(cVar) || !jx.b.a(aVar)) {
            randomAccessU = j0.f134944a;
        }
        arrayList.addAll(randomAccessU);
        gt.a aVar2 = dVar2 != null ? dVar2.f101395b : null;
        boolean z15 = false;
        if ((arrayList2.contains(jx.c.STRESS) || arrayList2.contains(jx.c.REST)) && aVar2 != null && (list = aVar2.f78897c) != null && !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z14 = false;
                    break;
                }
                Integer num = ((gs1.e.C1588e) it.next()).f78747b;
                if (num != null && num.intValue() == -1) {
                    z14 = true;
                    break;
                }
            }
        } else {
            z14 = false;
            break;
        }
        jx.c cVar2 = jx.c.STRESS;
        boolean z16 = arrayList2.contains(cVar2) && gt.b.b(aVar2);
        boolean z17 = arrayList2.contains(jx.c.REST) && gt.b.a(aVar2);
        if (arrayList2.contains(cVar2) && gt.b.c(aVar2)) {
            z15 = true;
        }
        arrayList.addAll(hr1.a.a(this.f107000a, z14, z16, z17, z15));
        return arrayList;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(jx.d dVar) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(jx.d dVar) {
        return 0.0f;
    }

    /* JADX INFO: renamed from: kx.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkx/a$a;", "", "<init>", "()V", "", "DATA_INTERVAL", "I", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2063a {
        public /* synthetic */ C2063a(j jVar) {
            this();
        }

        private C2063a() {
        }
    }
}
