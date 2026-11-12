package tq;

import am.x0;
import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;
import p13.u;
import p13.y;
import ps.x1;
import qs.w;
import qs.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Ltq/a;", "Landroidx/lifecycle/u1;", "", "activityId", "Lam/x0;", "activityType", "activityStartTimeMillis", "<init>", "(JLam/x0;J)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends u1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f165992k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f165993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f165994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f165995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vq.e f165996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<x1> f165997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<? extends x> f165998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<? extends x> f165999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x f166000h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f166001i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y0<List<x1>> f166002j;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f166003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f166004b;

        static {
            int[] iArr = new int[x0.values().length];
            try {
                iArr[x0.S0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x0.T0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x0.f4352y2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x0.f4356z2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[x0.O0.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f166003a = iArr;
            int[] iArr2 = new int[x.values().length];
            try {
                iArr2[x.DIVE_INTERVAL_DYN.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[x.DIVE_INTERVAL_STA.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[x.DIVE_INTERVAL_REST.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            f166004b = iArr2;
        }
    }

    static {
        new C3121a(null);
    }

    public a(long j8, x0 x0Var, long j14) {
        x0Var.getClass();
        this.f165993a = j8;
        this.f165994b = x0Var;
        this.f165995c = j14;
        this.f165996d = (vq.e) KoinJavaComponent.get$default(vq.e.class, null, null, 6, null);
        j0 j0Var = j0.f134944a;
        this.f165997e = j0Var;
        this.f165998f = k.h(x0Var);
        this.f165999g = k.g(x0Var);
        this.f166001i = j0Var;
        this.f166002j = new y0<>();
    }

    public final void x4(List<x1> list, List<? extends x> list2) {
        Iterable iterable;
        DateTime startDateTime;
        int[] iArr = b.f166003a;
        x0 x0Var = this.f165994b;
        int i14 = iArr[x0Var.ordinal()];
        if (i14 == 1 || i14 == 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                x1 x1Var = (x1) obj;
                Iterable iterableH = k.h(x0Var);
                if (iterableH == null) {
                    iterableH = j0.f134944a;
                }
                if (h0.R(iterableH, x1Var.a2())) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            x1 x1Var2 = (x1) h0.d0(arrayList2);
            x xVarA2 = x1Var2 != null ? x1Var2.a2() : null;
            x xVar = x.DESCENT;
            if (xVarA2 == xVar) {
                arrayList2.add(0, new x1(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, x.ASCENT.f147220a, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -530529, -1, 2097151, null));
            }
            x1 x1Var3 = (x1) h0.n0(arrayList2);
            iterable = arrayList2;
            if ((x1Var3 != null ? x1Var3.a2() : null) == x.ASCENT) {
                arrayList2.add(new x1(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, xVar.f147220a, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -530529, -1, 2097151, null));
                iterable = arrayList2;
            }
        } else {
            iterable = list;
        }
        ArrayList<x1> arrayList3 = new ArrayList();
        for (Object obj2 : iterable) {
            x1 x1Var4 = (x1) obj2;
            List<? extends x> list3 = this.f165998f;
            if (list3 != null && !list3.isEmpty()) {
                Iterable iterable2 = this.f165998f;
                if (iterable2 == null) {
                    iterable2 = j0.f134944a;
                }
                if (h0.R(iterable2, x1Var4.a2())) {
                }
            }
            arrayList3.add(obj2);
        }
        x1 x1Var5 = (x1) h0.d0(arrayList3);
        long millis = (x1Var5 == null || (startDateTime = x1Var5.getStartDateTime()) == null) ? this.f165995c : startDateTime.getMillis();
        double dDoubleValue = 0.0d;
        for (x1 x1Var6 : arrayList3) {
            DateTime startDateTime2 = x1Var6.getStartDateTime();
            double millis2 = ((startDateTime2 != null ? startDateTime2.getMillis() : 0L) - millis) / 1000.0d;
            x1Var6.f140407z1 = Double.valueOf(millis2);
            Double duration = x1Var6.getDuration();
            x1Var6.A1 = Double.valueOf(millis2 + (duration != null ? duration.doubleValue() : 0.0d));
            Double duration2 = x1Var6.getDuration();
            dDoubleValue += duration2 != null ? duration2.doubleValue() : 0.0d;
            x1Var6.f140403x1 = Double.valueOf(dDoubleValue);
        }
        int i15 = b.f166003a[x0Var.ordinal()];
        if (i15 == 3 || i15 == 4) {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : iterable) {
                if (((x1) obj3).getDifficulty() != null) {
                    arrayList4.add(obj3);
                }
            }
            ArrayList arrayList5 = new ArrayList();
            for (Object obj4 : arrayList4) {
                if (u.z(new w[]{w.CLIMB_ATTEMPTED, w.CLIMB_COMPLETED}, ((x1) obj4).G1())) {
                    arrayList5.add(obj4);
                }
            }
        } else if (i15 == 5) {
            ArrayList arrayList6 = new ArrayList();
            for (Object obj5 : iterable) {
                if (u.z(new x[]{x.RUN_ACTIVE, x.OBSTACLE}, ((x1) obj5).a2())) {
                    arrayList6.add(obj5);
                }
            }
        }
        ArrayList arrayList7 = new ArrayList(y.r(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList7.add(x1.b((x1) it.next(), null, -1));
        }
        ArrayList arrayList8 = new ArrayList();
        for (Object obj6 : arrayList7) {
            x1 x1Var7 = (x1) obj6;
            if (list2 == null || list2.isEmpty() || h0.R(list2, x1Var7.a2())) {
                arrayList8.add(obj6);
            }
        }
        this.f166001i = arrayList8;
        this.f166002j.m(arrayList8);
    }

    /* JADX INFO: renamed from: tq.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltq/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3121a {
        public /* synthetic */ C3121a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C3121a() {
        }
    }
}
