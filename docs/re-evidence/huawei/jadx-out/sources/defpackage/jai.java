package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.fragment.SegmentHorizontalFrag;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsportmodel.CommonSegment;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class jai {
    public static int a(int i, int i2) {
        if (i == -1 && i2 == -1) {
            return -1;
        }
        if (i == -1) {
            return i2;
        }
        return i2 == -1 ? i : i + i2;
    }

    public static boolean a(int i) {
        return i == 258 || i == 280 || i == 227;
    }

    public static long b(long j, long j2) {
        if (j == -1 && j2 == -1) {
            return -1L;
        }
        if (j == -1) {
            return j2;
        }
        return j2 == -1 ? j : j + j2;
    }

    public static boolean c(int i) {
        return i == 259;
    }

    private static long d(long j, long j2) {
        if (j == -1 || j2 == -1) {
            return -1L;
        }
        return j + j2;
    }

    private static float e(float f, float f2) {
        if (f == -1.0f || f2 == -1.0f) {
            return -1.0f;
        }
        return f + f2;
    }

    private static float e(float f, long j) {
        if (f == -1.0f || j == -1) {
            return -1.0f;
        }
        return f * j;
    }

    private static long e(long j, long j2) {
        if (j == -1 || j2 == -1) {
            return -1L;
        }
        return j * j2;
    }

    private static long l(long j) {
        if (j < 40 || j > 220) {
            return -1L;
        }
        return j;
    }

    public static ntu e(List<ntu> list) {
        ntu ntuVar = new ntu();
        if (njy.e(list)) {
            ntuVar.y();
            return ntuVar;
        }
        if (list.size() == 1) {
            return new ntu(list.get(0));
        }
        ntuVar.u();
        long jD = 0;
        long jD2 = 0;
        long jD3 = 0;
        for (ntu ntuVar2 : list) {
            if (ntuVar2 != null) {
                ntuVar.e(d(ntuVar.r(), ntuVar2.r()));
                ntuVar.a(d(ntuVar.i(), ntuVar2.i()));
                ntuVar.c(d(ntuVar.v(), ntuVar2.v()));
                ntuVar.b(d(ntuVar.q(), ntuVar2.q()));
                jD2 = d(jD2, e(l(ntuVar2.m()), ntuVar2.r()));
                jD = d(jD, e(ntuVar2.g(), ntuVar2.r()));
                jD3 = d(jD3, e(ntuVar2.f(), ntuVar2.r()));
            }
        }
        ntuVar.i((int) a(e(ntuVar.r(), SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US), ntuVar.i()));
        ntuVar.b((int) a(jD, ntuVar.r()));
        ntuVar.j((int) l(a(jD2, ntuVar.r())));
        ntuVar.a((int) l(a(jD3, ntuVar.r())));
        c(list, ntuVar, jD);
        return ntuVar;
    }

    private static void c(List<ntu> list, ntu ntuVar, long j) {
        Iterator<ntu> it = list.iterator();
        long jD = 0;
        long jD2 = 0;
        long jD3 = 0;
        float fE = 0.0f;
        float fE2 = 0.0f;
        float fE3 = 0.0f;
        float fE4 = 0.0f;
        long jD4 = 0;
        while (it.hasNext()) {
            ntu next = it.next();
            if (next != null) {
                long jE = e(next.g(), next.r());
                jD = d(jD, e(next.n(), jE));
                jD3 = d(jD3, e(next.e(), jE));
                jD2 = d(jD2, e(next.k(), jE));
                jD4 = d(jD4, e(next.p(), jE));
                fE3 = e(fE3, e(next.h(), jE));
                fE4 = e(fE4, e(next.b(), jE));
                fE2 = e(fE2, e(next.d(), jE));
                fE = e(fE, e(next.a(), jE));
                it = it;
            }
        }
        int iA = (int) a(e(ntuVar.i(), 60L), j);
        ntuVar.g(iA);
        ntuVar.d((int) a(jD, j));
        ntuVar.f(-1);
        ntuVar.l((int) a(jD4, j));
        ntuVar.e((int) a(jD2, j));
        ntuVar.c((int) a(jD3, j));
        ntuVar.e(c(fE, j));
        float fC = c(fE2, j);
        ntuVar.c(fC);
        ntuVar.d(c(fC, iA));
        ntuVar.a(c(fE3, j));
        ntuVar.b(c(fE4, j));
    }

    public static ntp d(List<ntp> list) {
        ntp ntpVar = new ntp();
        if (njy.e(list)) {
            ntpVar.i();
            return ntpVar;
        }
        if (list.size() == 1) {
            return new ntp(list.get(0));
        }
        ntpVar.m();
        long jD = 0;
        long jD2 = 0;
        long jD3 = 0;
        for (ntp ntpVar2 : list) {
            if (ntpVar2 != null) {
                ntpVar.b(d(ntpVar.j(), ntpVar2.j()));
                ntpVar.e(d(ntpVar.d(), ntpVar2.d()));
                ntpVar.d(d(ntpVar.g(), ntpVar2.g()));
                ntpVar.a(d(ntpVar.f(), ntpVar2.f()));
                jD3 = d(jD3, e(l(ntpVar2.b()), ntpVar2.j()));
                jD2 = d(jD2, e(ntpVar2.a(), ntpVar2.j()));
                jD = d(jD, e(ntpVar2.c(), ntpVar2.j()));
            }
        }
        ntpVar.c((int) a(jD, ntpVar.j()));
        ntpVar.b((int) a(jD2, ntpVar.j()));
        ntpVar.d((int) a(l(jD3), ntpVar.j()));
        return ntpVar;
    }

    public static nts a(List<nts> list) {
        nts ntsVar = new nts();
        if (njy.e(list)) {
            ntsVar.x();
            return ntsVar;
        }
        if (list.size() == 1) {
            return new nts(list.get(0));
        }
        double d = -1.0d;
        for (nts ntsVar2 : list) {
            if (ntsVar2 != null) {
                ntsVar.i(b(ntsVar.y(), ntsVar2.y()));
                ntsVar.c(b(ntsVar.g(), ntsVar2.g()));
                ntsVar.h(c(ntsVar.m(), ntsVar2.m()));
                long jV = ntsVar2.v();
                if (jV != -1) {
                    ntsVar.g(b(ntsVar.v(), jV));
                }
                int iE = ntsVar2.e();
                if (iE != -1 && iE != 0 && jV != -1) {
                    d = d(d, (jV * 1000.0d) / ((double) iE));
                }
                a(ntsVar, ntsVar2);
            }
        }
        ntsVar.a((int) Math.round(UnitUtil.a((ntsVar.g() * 1.0d) / ntsVar.y()) * 100.0d));
        long jV2 = ntsVar.v();
        if (jV2 != -1 && Math.abs(1.0d + d) >= 9.999999974752427E-7d && Math.abs(d) >= 9.999999974752427E-7d) {
            double d2 = jV2 / d;
            ntsVar.d((int) Math.round(((Math.atan(d2) * 180.0d) / 3.141592653589793d) * 10.0d));
            ntsVar.b((int) Math.round(d2 * 1000.0d));
        }
        return ntsVar;
    }

    private static void a(nts ntsVar, nts ntsVar2) {
        int iU = ntsVar2.u();
        if (iU != -1) {
            ntsVar.o(a(ntsVar.u(), iU));
        }
        int iK = ntsVar2.k();
        if (iK != -1) {
            ntsVar.c(a(ntsVar.k(), iK));
        }
        int iP = ntsVar2.p();
        if (iP != -1) {
            ntsVar.g(a(ntsVar.p(), iP));
        }
        int iJ = ntsVar2.j();
        if (iJ != -1) {
            ntsVar.e(a(ntsVar.j(), iJ));
        }
        int iO = ntsVar2.o();
        if (iO != -1) {
            ntsVar.j(a(ntsVar.o(), iO));
        }
        int iS = ntsVar2.s();
        if (iS != -1) {
            ntsVar.f(a(ntsVar.s(), iS));
        }
        float fL = ntsVar2.l();
        if (Math.abs(1.0f + fL) >= 1.0E-6f) {
            ntsVar.d(b(ntsVar.l(), fL));
        }
    }

    public static void e(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, int i, SegmentHorizontalFrag.a aVar) {
        if (qpvVar == null) {
            LogUtil.j("Track_SegmentUtils", "addRunningSegmentTableTitle with error parameter tableDataSet is null, pls check");
            return;
        }
        Context context = BaseApplication.getContext();
        if (context == null) {
            LogUtil.j("Track_SegmentUtils", "addRunningSegmentTableTitle with context is null, pls check");
            qpvVar.putRowColumnHeaderData(0, 0, null);
            return;
        }
        qpvVar.putRowColumnHeaderData(0, 0, new jpn(aa(context)));
        ArrayList arrayList = new ArrayList();
        if (i == 0) {
            c(arrayList, context, qpvVar, aVar);
        } else {
            if (i != 1) {
                return;
            }
            a(arrayList, context, qpvVar, aVar);
        }
    }

    public static void a(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, int i) {
        e(qpvVar, i, new SegmentHorizontalFrag.a(false, false));
    }

    private static void c(List<jpj> list, Context context, qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, SegmentHorizontalFrag.a aVar) {
        list.add(new jpj(ae(context), null));
        list.add(new jpj(p(context), t(context)));
        list.add(new jpj(u(context), v(context)));
        list.add(new jpj(r(context), y(context)));
        list.add(new jpj(c(context), b(context)));
        list.add(new jpj(ad(context), ab(context)));
        list.add(new jpj(ag(context), af(context)));
        list.add(new jpj(al(context), aj(context)));
        if (aVar.f11078c) {
            list.add(new jpj(d(), a()));
        }
        list.add(new jpj(a(context), j(context)));
        list.add(new jpj(f(context), i(context)));
        list.add(new jpj(e(context), d(context)));
        list.add(new jpj(k(context), l(context)));
        list.add(new jpj(context.getResources().getString(R.string.IDS_aw_version2_average_jump_time), j(context)));
        list.add(new jpj(context.getResources().getString(R.string.IDS_bolt_balance_average_left_right_touches), null));
        list.add(new jpj(context.getResources().getString(R.string.IDS_bolt_average_vertical_amplitude), ab(context)));
        list.add(new jpj(context.getResources().getString(R.string.IDS_bolt_average_vertical_amplitude_rate), null));
        list.add(new jpj(h(context), o(context)));
        list.add(new jpj(context.getResources().getString(R.string.IDS_bolt_average_peak_impact_rate), g(context)));
        for (int i = 1; i < list.size() + 1; i++) {
            qpvVar.putColumnHeaderData(0, i, list.get(i - 1));
        }
    }

    private static void a(List<jpj> list, Context context, qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, SegmentHorizontalFrag.a aVar) {
        list.add(new jpj(am(context), null));
        c(list, context, qpvVar, aVar);
    }

    public static void a(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, ntu ntuVar, int i, SegmentHorizontalFrag.a aVar) {
        if (qpvVar == null || ntuVar == null) {
            LogUtil.j("Track_SegmentUtils", "addRunningSegmentToTableSet with error parameter tableDataSet:", qpvVar, " trackRunningSegment:", ntuVar);
        } else {
            b(qpvVar, qpvVar.getRowsCount(), ntuVar, i, aVar);
        }
    }

    public static void e(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, ntu ntuVar, int i, boolean z) {
        a(qpvVar, ntuVar, i, new SegmentHorizontalFrag.a(z, false));
    }

    public static int f(List<CommonSegment> list) {
        Iterator<CommonSegment> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getSportSegmentMode() == 1) {
                return 1;
            }
        }
        return 0;
    }

    public static void b(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, int i, ntu ntuVar, int i2, SegmentHorizontalFrag.a aVar) {
        if (qpvVar == null || ntuVar == null || i < 0) {
            LogUtil.j("Track_SegmentUtils", "putRunningSegmentToTableSet with error parameter tableDataSet:", qpvVar, " trackRunningSegment:", ntuVar, " rowIndex:", Integer.valueOf(i));
            return;
        }
        qpvVar.putRowHeaderData(i, 0, new jpn(l(ntuVar.l())));
        ArrayList arrayList = new ArrayList();
        if (i2 == 0) {
            e(qpvVar, i, ntuVar, arrayList, aVar);
        } else {
            if (i2 != 1) {
                return;
            }
            c(qpvVar, i, ntuVar, arrayList, aVar);
        }
    }

    private static void c(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, int i, ntu ntuVar, List<jpn> list, SegmentHorizontalFrag.a aVar) {
        list.add(new jpn(d(BaseApplication.getContext(), ntuVar.w(), 258)));
        e(qpvVar, i, ntuVar, list, aVar);
    }

    private static void e(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, int i, ntu ntuVar, List<jpn> list, SegmentHorizontalFrag.a aVar) {
        if (!aVar.f11077a) {
            list.add(new jpn(i(ntuVar.r())));
        } else {
            list.add(new jpn(UnitUtil.e((int) ntuVar.r())));
        }
        list.add(new jpn(e(ntuVar.i())));
        list.add(new jpn(a(ntuVar.s())));
        list.add(new jpn(i((int) l(ntuVar.m()))));
        list.add(new jpn(e(ntuVar.g())));
        list.add(new jpn(k(ntuVar.t())));
        list.add(new jpn(j(ntuVar.v())));
        list.add(new jpn(h(ntuVar.q())));
        if (aVar.f11078c) {
            list.add(new jpn(b(ntuVar.f())));
        }
        list.add(new jpn(b(ntuVar.n())));
        list.add(new jpn(d(ntuVar.o())));
        list.add(new jpn(d(ntuVar.k())));
        list.add(new jpn(g(ntuVar.p())));
        list.add(new jpn(i(ntuVar.e())));
        list.add(new jpn(a(ntuVar.a())));
        list.add(new jpn(c(ntuVar.d())));
        list.add(new jpn(d(ntuVar.j())));
        list.add(new jpn(c(ntuVar.h())));
        list.add(new jpn(c(ntuVar.b())));
        for (int i2 = 1; i2 < list.size() + 1; i2++) {
            qpvVar.putContentData(i, i2, list.get(i2 - 1));
        }
    }

    public static void d(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, ntu ntuVar, String str, int i, SegmentHorizontalFrag.a aVar) {
        c(qpvVar, qpvVar.getRowsCount(), ntuVar, str, i, aVar);
    }

    public static void e(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, ntu ntuVar, String str, int i, boolean z) {
        d(qpvVar, ntuVar, str, i, new SegmentHorizontalFrag.a(z, false));
    }

    public static void b(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, ntp ntpVar, String str) {
        if (qpvVar == null) {
            LogUtil.j("Track_SegmentUtils", "addBikeSegmentToTableSet with error parameter tableDataSet is null");
        } else {
            d(qpvVar, qpvVar.getRowsCount(), ntpVar, str);
        }
    }

    public static void a(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, nts ntsVar, String str, boolean z, int i) {
        if (qpvVar == null) {
            LogUtil.j("Track_SegmentUtils", "addSkiStatisticToTableSet with error parameter tableDataSet is null");
        } else {
            e(qpvVar, qpvVar.getRowsCount(), ntsVar, str, z, i);
        }
    }

    public static void d(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, int i, ntp ntpVar, String str) {
        if (qpvVar == null || i < 0) {
            LogUtil.j("Track_SegmentUtils", "addBikeSegmentToTableSet with error parameter tableDataSet:", qpvVar, " rowIndex", Integer.valueOf(i));
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            qpvVar.putStatisticHeaderData(i, 0, new jpn(str));
        }
        if (ntpVar == null) {
            LogUtil.j("Track_SegmentUtils", "addBikeSegmentToTableSet with null trackBikeSegment");
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new jpn(d(BaseApplication.getContext(), ntpVar.h(), 259)));
        arrayList.add(new jpn(i(ntpVar.j())));
        arrayList.add(new jpn(e(ntpVar.d())));
        arrayList.add(new jpn(f(ntpVar.a())));
        arrayList.add(new jpn(i((int) l(ntpVar.b()))));
        arrayList.add(new jpn(j(ntpVar.g())));
        arrayList.add(new jpn(h(ntpVar.f())));
        for (int i2 = 1; i2 < arrayList.size() + 1; i2++) {
            qpvVar.putStatisticData(i, i2, (jpn) arrayList.get(i2 - 1));
        }
    }

    public static void c(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, int i, ntu ntuVar, String str, int i2, SegmentHorizontalFrag.a aVar) {
        if (qpvVar == null || i < 0) {
            LogUtil.j("Track_SegmentUtils", "addRunningSegmentToTableSet with error parameter tableDataSet:", qpvVar, " rowIndex", Integer.valueOf(i));
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            qpvVar.putStatisticHeaderData(i, 0, new jpn(str));
        }
        if (ntuVar == null) {
            LogUtil.j("Track_SegmentUtils", "addRunningSegmentToTableSet with null trackRunningSegment");
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (i2 == 0) {
            b(qpvVar, i, ntuVar, arrayList, aVar);
        } else {
            if (i2 != 1) {
                return;
            }
            d(qpvVar, i, ntuVar, arrayList, aVar);
        }
    }

    public static void d(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, int i, ntu ntuVar, String str, int i2, boolean z) {
        c(qpvVar, i, ntuVar, str, i2, new SegmentHorizontalFrag.a(z, false));
    }

    public static void e(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, int i, nts ntsVar, String str, boolean z, int i2) {
        if (qpvVar == null || i < 0) {
            LogUtil.j("Track_SegmentUtils", "putSkiStatisticToTableSet with error parameter tableDataSet:", qpvVar, " rowIndex", Integer.valueOf(i));
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            qpvVar.putStatisticHeaderData(i, 0, new jpn(str));
        }
        if (ntsVar == null) {
            LogUtil.j("Track_SegmentUtils", "putSkiStatisticToTableSet with null trackSkiSegment");
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new jpn(i(ntsVar.y())));
        arrayList.add(new jpn(e(ntsVar.g())));
        arrayList.add(new jpn(f(ntsVar.m())));
        if (nub.a(i2)) {
            arrayList.add(new jpn(g(ntsVar.u())));
            if (z) {
                if (nub.b(i2)) {
                    arrayList.add(new jpn(g(ntsVar.o())));
                    arrayList.add(new jpn(g(ntsVar.s())));
                    arrayList.add(new jpn(g(ntsVar.j())));
                    arrayList.add(new jpn(e(ntsVar.l())));
                } else {
                    arrayList.add(new jpn(g(ntsVar.k())));
                    arrayList.add(new jpn(g(ntsVar.p())));
                    arrayList.add(new jpn(g(ntsVar.j())));
                }
                arrayList.add(new jpn(h(ntsVar.v())));
            }
        } else {
            arrayList.add(new jpn(f(ntsVar.d())));
            if (z) {
                arrayList.add(new jpn(e(ntsVar.a(), ntsVar.e())));
                arrayList.add(new jpn(h(ntsVar.v())));
            }
        }
        for (int i3 = 1; i3 < arrayList.size() + 1; i3++) {
            qpvVar.putStatisticData(i, i3, (jpn) arrayList.get(i3 - 1));
        }
    }

    private static void d(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, int i, ntu ntuVar, List<jpn> list, SegmentHorizontalFrag.a aVar) {
        list.add(new jpn(null));
        b(qpvVar, i, ntuVar, list, aVar);
    }

    private static void b(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, int i, ntu ntuVar, List<jpn> list, SegmentHorizontalFrag.a aVar) {
        if (!aVar.f11077a) {
            list.add(new jpn(i(ntuVar.r())));
        } else {
            list.add(new jpn(UnitUtil.e((int) ntuVar.r())));
        }
        list.add(new jpn(e(ntuVar.i())));
        list.add(new jpn(a(ntuVar.s())));
        list.add(new jpn(i((int) l(ntuVar.m()))));
        list.add(new jpn(e(ntuVar.g())));
        list.add(new jpn(k(ntuVar.t())));
        list.add(new jpn(j(ntuVar.v())));
        list.add(new jpn(h(ntuVar.q())));
        if (aVar.f11078c) {
            list.add(new jpn(b(ntuVar.f())));
        }
        list.add(new jpn(b(ntuVar.n())));
        list.add(new jpn(d(ntuVar.o())));
        list.add(new jpn(d(ntuVar.k())));
        list.add(new jpn(g(ntuVar.p())));
        list.add(new jpn(i(ntuVar.e())));
        list.add(new jpn(a(ntuVar.a())));
        list.add(new jpn(c(ntuVar.d())));
        list.add(new jpn(d(ntuVar.j())));
        list.add(new jpn(c(ntuVar.h())));
        list.add(new jpn(c(ntuVar.b())));
        for (int i2 = 1; i2 < list.size() + 1; i2++) {
            qpvVar.putStatisticData(i, i2, list.get(i2 - 1));
        }
    }

    public static void a(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, boolean z, int i) {
        if (qpvVar == null) {
            LogUtil.j("Track_SegmentUtils", "addSkiSegmentTableTitle with error parameter tableDataSet is null, pls check");
            return;
        }
        Context context = BaseApplication.getContext();
        if (context == null) {
            LogUtil.j("Track_SegmentUtils", "addSkiSegmentTableTitle with context is null, pls check");
            qpvVar.putRowColumnHeaderData(0, 0, null);
            return;
        }
        qpvVar.putRowColumnHeaderData(0, 0, new jpn(context.getString(R.string.IDS_motiontrack_show_detail_laps)));
        qpvVar.putColumnHeaderData(0, 1, new jpj(context.getString(R.string.IDS_motiontrack_show_detail_ski_time), null));
        qpvVar.putColumnHeaderData(0, 2, new jpj(context.getString(R.string.IDS_motiontrack_show_detail_ski_distance), t(context)));
        qpvVar.putColumnHeaderData(0, 3, new jpj(context.getString(R.string.IDS_track_max_speed), ac(context)));
        if (nub.a(i)) {
            e(qpvVar, z, i);
            return;
        }
        qpvVar.putColumnHeaderData(0, 4, new jpj(context.getString(R.string.IDS_motiontrack_show_detail_average_ski_speed), ac(context)));
        if (z) {
            qpvVar.putColumnHeaderData(0, 5, new jpj(context.getString(R.string.IDS_track_average_slope), null));
            qpvVar.putColumnHeaderData(0, 6, new jpj(context.getString(R.string.IDS_hwh_motiontrack_total_descent), aj(context)));
        }
    }

    private static void e(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, boolean z, int i) {
        Context context = BaseApplication.getContext();
        String string = context.getString(R.string.IDS_track_total_turn);
        String strB = b(context, string, context.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_sport_data_time, 0, ""));
        qpvVar.putColumnHeaderData(0, 4, new jpj(string, strB));
        if (z) {
            String string2 = context.getString(R.string.IDS_track_turn_frequency);
            String strB2 = b(context, string2, context.getString(R.string.IDS_track_turns_frequency_unit));
            if (nub.b(i)) {
                qpvVar.putColumnHeaderData(0, 5, new jpj(context.getString(R.string.IDS_track_long_radius_turn), strB));
                qpvVar.putColumnHeaderData(0, 6, new jpj(context.getString(R.string.IDS_track_short_radius_turn), strB));
                qpvVar.putColumnHeaderData(0, 7, new jpj(string2, strB2));
                qpvVar.putColumnHeaderData(0, 8, new jpj(context.getString(R.string.IDS_track_max_g_force), ""));
                qpvVar.putColumnHeaderData(0, 9, new jpj(context.getString(R.string.IDS_hwh_motiontrack_total_descent), aj(context)));
                return;
            }
            qpvVar.putColumnHeaderData(0, 5, new jpj(context.getString(R.string.IDS_track_left_turn_count), strB));
            qpvVar.putColumnHeaderData(0, 6, new jpj(context.getString(R.string.IDS_track_right_turn_count), strB));
            qpvVar.putColumnHeaderData(0, 7, new jpj(string2, strB2));
            qpvVar.putColumnHeaderData(0, 8, new jpj(context.getString(R.string.IDS_hwh_motiontrack_total_descent), aj(context)));
        }
    }

    private static String b(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str) && str2 != null && !TextUtils.isEmpty(str2.replaceAll("^\\s+|\\s+$", ""))) {
            return str.trim().equalsIgnoreCase(str2.trim()) ? "" : context.getResources().getString(R.string.IDS_motiontrack_show_chart_unit_string, str2);
        }
        LogUtil.a("Track_SegmentUtils", "title or unit is empty");
        return "";
    }

    public static void d(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar) {
        if (qpvVar == null) {
            LogUtil.j("Track_SegmentUtils", "addRowingMachineSegmentTableTitle with error parameter tableDataSet is null, pls check");
            return;
        }
        Context context = BaseApplication.getContext();
        if (context == null) {
            LogUtil.j("Track_SegmentUtils", "addRowingMachineSegmentTableTitle with context is null, pls check");
            qpvVar.putRowColumnHeaderData(0, 0, null);
            return;
        }
        qpvVar.putRowColumnHeaderData(0, 0, new jpn(context.getString(R.string.IDS_rowing_machine_grouping)));
        qpvVar.putColumnHeaderData(0, 1, new jpj(context.getString(R.string.IDS_hw_motiontrack_segment_use_time), null));
        qpvVar.putColumnHeaderData(0, 2, new jpj(context.getString(R.string.IDS_hw_show_sport_history_times_unit), null));
        qpvVar.putColumnHeaderData(0, 3, new jpj(context.getString(R.string.IDS_rowing_machine_peak_weight), x(context)));
        qpvVar.putColumnHeaderData(0, 4, new jpj(context.getString(R.string.IDS_rowing_machine_peak_power), w(context)));
        qpvVar.putColumnHeaderData(0, 5, new jpj(context.getString(R.string.IDS_motiontrack_detail_fm_heart_heartrate), y(context)));
    }

    public static void a(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, boolean z) {
        if (qpvVar == null) {
            LogUtil.j("Track_SegmentUtils", "addRopeSkippingSegmentTableTitle with error parameter tableDataSet is null, pls check");
            return;
        }
        Context context = BaseApplication.getContext();
        if (context == null) {
            LogUtil.j("Track_SegmentUtils", "addRopeSkippingSegmentTableTitle with context is null, pls check");
            qpvVar.putRowColumnHeaderData(0, 0, null);
            return;
        }
        qpvVar.putRowColumnHeaderData(0, 0, new jpn(context.getString(R.string.IDS_rowing_machine_grouping)));
        qpvVar.putColumnHeaderData(0, 1, new jpj(context.getString(R.string.IDS_hw_motiontrack_segment_use_time), null));
        qpvVar.putColumnHeaderData(0, 2, new jpj(context.getString(R.string.IDS_hw_show_sport_history_times_unit), null));
        qpvVar.putColumnHeaderData(0, 3, new jpj(context.getString(R.string.IDS_motiontrack_show_detail_averagespeed), y(context)));
        if (z) {
            qpvVar.putColumnHeaderData(0, 4, new jpj(context.getString(R.string.IDS_motiontrack_detail_fm_heart_heartrate), y(context)));
        } else {
            qpvVar.putColumnHeaderData(0, 4, new jpj(context.getString(R.string.IDS_indoor_skipper_stumbling_rope), null));
        }
    }

    public static void b(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar) {
        if (qpvVar == null) {
            LogUtil.j("Track_SegmentUtils", "addStrengthTrainingSegmentTableTitle with error parameter tableDataSet is null, pls check");
            return;
        }
        Context context = BaseApplication.getContext();
        if (context == null) {
            LogUtil.j("Track_SegmentUtils", "addStrengthTrainingSegmentTableTitle with context is null, pls check");
            qpvVar.putRowColumnHeaderData(0, 0, null);
            return;
        }
        qpvVar.putRowColumnHeaderData(0, 0, new jpn(context.getString(R.string.IDS_hwh_motiontrack_swim_segment)));
        qpvVar.putColumnHeaderData(0, 1, new jpj(context.getString(R.string.IDS_action_name), null));
        qpvVar.putColumnHeaderData(0, 2, new jpj(context.getString(R.string.IDS_training_volume), null));
        qpvVar.putColumnHeaderData(0, 3, new jpj(context.getString(R.string.IDS_group_count), null));
        qpvVar.putColumnHeaderData(0, 4, new jpj(context.getString(R.string.IDS_group_time), null));
        qpvVar.putColumnHeaderData(0, 5, new jpj(context.getString(R.string.IDS_group_rest_time), null));
    }

    public static boolean b(List<CommonSegment> list) {
        Iterator<CommonSegment> it = list.iterator();
        while (it.hasNext()) {
            if (((ntq) it.next()).a() > 0) {
                return true;
            }
        }
        return false;
    }

    public static void a(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar) {
        if (qpvVar == null) {
            LogUtil.j("Track_SegmentUtils", "addSkiSegmentTableTitle with error parameter tableDataSet is null, pls check");
            return;
        }
        Context context = BaseApplication.getContext();
        if (context == null) {
            LogUtil.j("Track_SegmentUtils", "addSkiSegmentTableTitle with context is null, pls check");
            qpvVar.putRowColumnHeaderData(0, 0, null);
            return;
        }
        qpvVar.putRowColumnHeaderData(0, 0, new jpn(aa(context)));
        qpvVar.putColumnHeaderData(0, 1, new jpj(am(context), null));
        qpvVar.putColumnHeaderData(0, 2, new jpj(ae(context), null));
        qpvVar.putColumnHeaderData(0, 3, new jpj(p(context), t(context)));
        qpvVar.putColumnHeaderData(0, 4, new jpj(context.getString(R.string.IDS_motiontrack_show_sport_tip_icon_text_pace), ac(context)));
        qpvVar.putColumnHeaderData(0, 5, new jpj(r(context), y(context)));
        qpvVar.putColumnHeaderData(0, 6, new jpj(ag(context), af(context)));
        qpvVar.putColumnHeaderData(0, 7, new jpj(al(context), aj(context)));
    }

    public static void c(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar) {
        if (qpvVar == null) {
            LogUtil.j("Track_SegmentUtils", "addOtherSegmentTableTitle with error parameter tableDataSet is null");
            return;
        }
        Context context = BaseApplication.getContext();
        if (context == null) {
            LogUtil.j("Track_SegmentUtils", "addOtherSegmentTableTitle with context is null, pls check");
            qpvVar.putRowColumnHeaderData(0, 0, null);
        } else {
            qpvVar.putRowColumnHeaderData(0, 0, new jpn(aa(context)));
            qpvVar.putColumnHeaderData(0, 1, new jpj(am(context), null));
            qpvVar.putColumnHeaderData(0, 2, new jpj(ae(context), null));
            qpvVar.putColumnHeaderData(0, 3, new jpj(r(context), y(context)));
        }
    }

    public static void c(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, ntp ntpVar) {
        if (qpvVar == null || ntpVar == null) {
            LogUtil.j("Track_SegmentUtils", "addBikeSegmentToTableSet with error parameter tableDataSet:", qpvVar, " bikeSegment:", ntpVar);
        } else {
            b(qpvVar, qpvVar.getRowsCount(), ntpVar);
        }
    }

    public static void e(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, nto ntoVar) {
        if (qpvVar == null || ntoVar == null) {
            LogUtil.j("Track_SegmentUtils", "addOtherSegmentToTableSet with error parameter tableDataSet:", qpvVar, " otherSportSegment:", ntoVar);
        } else {
            e(qpvVar, qpvVar.getRowsCount(), ntoVar);
        }
    }

    public static void c(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, nts ntsVar, boolean z, int i) {
        if (qpvVar == null || ntsVar == null) {
            LogUtil.j("Track_SegmentUtils", "addSkiSegmentToTableSet with error parameter tableDataSet:", qpvVar, " trackSkiSegment:", ntsVar);
        } else {
            b(qpvVar, qpvVar.getRowsCount(), ntsVar, z, i);
        }
    }

    public static void e(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, ntm ntmVar) {
        if (qpvVar == null || ntmVar == null) {
            LogUtil.j("Track_SegmentUtils", "addRowingMachineSegmentToTableSet with error parameter tableDataSet:", qpvVar, " rowingMachineSegment:", ntmVar);
        } else {
            a(qpvVar, qpvVar.getRowsCount(), ntmVar);
        }
    }

    public static void a(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, ntq ntqVar, boolean z) {
        if (qpvVar == null || ntqVar == null) {
            LogUtil.j("Track_SegmentUtils", "addRopeSkippingSegmentToTableSet with error parameter tableDataSet:", qpvVar, " trackJumpRopeSegment:", ntqVar);
        } else {
            c(qpvVar, qpvVar.getRowsCount(), ntqVar, z);
        }
    }

    public static void e(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, ntw ntwVar) {
        if (qpvVar == null || ntwVar == null) {
            LogUtil.j("Track_SegmentUtils", "addStrengthTrainingSegmentToTableSet with error parameter tableDataSet:", qpvVar, " StrengthTrainingSegment:", ntwVar);
        } else {
            c(qpvVar, qpvVar.getRowsCount(), ntwVar);
        }
    }

    private static void e(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, int i, nto ntoVar) {
        if (qpvVar == null || ntoVar == null || i < 0) {
            LogUtil.j("Track_SegmentUtils", "putOtherSegmentToTableSet with error parameter tableDataSet:", qpvVar, " otherSegment:", ntoVar, " rowIndex:", Integer.valueOf(i));
            return;
        }
        Context context = BaseApplication.getContext();
        qpvVar.putRowHeaderData(i, 0, new jpn(l(ntoVar.b())));
        qpvVar.putContentData(i, 1, new jpn(d(context, ntoVar.e(), OldToNewMotionPath.SPORT_TYPE_OTHER_SPORT)));
        qpvVar.putContentData(i, 2, new jpn(i(ntoVar.a())));
        qpvVar.putContentData(i, 3, new jpn(i((int) l(ntoVar.c()))));
    }

    private static void b(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, int i, ntp ntpVar) {
        if (qpvVar == null || ntpVar == null || i < 0) {
            LogUtil.j("Track_SegmentUtils", "putBikeSegmentToTableSet with error parameter tableDataSet:", qpvVar, " bikeSegment:", ntpVar, " rowIndex:", Integer.valueOf(i));
            return;
        }
        Context context = BaseApplication.getContext();
        qpvVar.putRowHeaderData(i, 0, new jpn(l(ntpVar.e())));
        qpvVar.putContentData(i, 1, new jpn(d(context, ntpVar.h(), 259)));
        qpvVar.putContentData(i, 2, new jpn(i(ntpVar.j())));
        qpvVar.putContentData(i, 3, new jpn(e(ntpVar.d())));
        qpvVar.putContentData(i, 4, new jpn(f(ntpVar.a())));
        qpvVar.putContentData(i, 5, new jpn(i((int) l(ntpVar.b()))));
        qpvVar.putContentData(i, 6, new jpn(j(ntpVar.g())));
        qpvVar.putContentData(i, 7, new jpn(h(ntpVar.f())));
    }

    private static void b(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, int i, nts ntsVar, boolean z, int i2) {
        if (qpvVar == null || ntsVar == null || i < 0) {
            LogUtil.j("Track_SegmentUtils", "putSkiSegmentToTableSet with error parameter tableDataSet:", qpvVar, " trackSkiSegment:", ntsVar, " rowIndex:", Integer.valueOf(i));
            return;
        }
        qpvVar.putRowHeaderData(i, 0, new jpn(l(ntsVar.n())));
        qpvVar.putContentData(i, 1, new jpn(i(ntsVar.y())));
        qpvVar.putContentData(i, 2, new jpn(c(ntsVar.g())));
        qpvVar.putContentData(i, 3, new jpn(f(ntsVar.m())));
        if (nub.a(i2)) {
            qpvVar.putContentData(i, 4, new jpn(g(ntsVar.u())));
            if (z) {
                if (nub.b(i2)) {
                    qpvVar.putContentData(i, 5, new jpn(g(ntsVar.o())));
                    qpvVar.putContentData(i, 6, new jpn(g(ntsVar.s())));
                    qpvVar.putContentData(i, 7, new jpn(g(ntsVar.j())));
                    qpvVar.putContentData(i, 8, new jpn(e(ntsVar.l())));
                    qpvVar.putContentData(i, 9, new jpn(h(ntsVar.v())));
                    return;
                }
                qpvVar.putContentData(i, 5, new jpn(g(ntsVar.k())));
                qpvVar.putContentData(i, 6, new jpn(g(ntsVar.p())));
                qpvVar.putContentData(i, 7, new jpn(g(ntsVar.j())));
                qpvVar.putContentData(i, 8, new jpn(h(ntsVar.v())));
                return;
            }
            return;
        }
        qpvVar.putContentData(i, 4, new jpn(f(ntsVar.d())));
        if (z) {
            qpvVar.putContentData(i, 5, new jpn(e(ntsVar.a(), ntsVar.e())));
            qpvVar.putContentData(i, 6, new jpn(h(ntsVar.v())));
        }
    }

    private static void a(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, int i, ntm ntmVar) {
        if (qpvVar == null || ntmVar == null || i < 0) {
            LogUtil.j("Track_SegmentUtils", "putRowMachineSegmentToTableSet with error parameter tableDataSet:", qpvVar, " rowingMachineSegment:", ntmVar, " rowIndex:", Integer.valueOf(i));
            return;
        }
        qpvVar.putRowHeaderData(i, 0, new jpn(l(ntmVar.d())));
        qpvVar.putContentData(i, 1, new jpn(i(ntmVar.j())));
        qpvVar.putContentData(i, 2, new jpn(String.valueOf(ntmVar.a())));
        int iE = ntmVar.e();
        if (UnitUtil.f()) {
            iE = (int) Math.round(UnitUtil.h(iE));
        }
        qpvVar.putContentData(i, 3, new jpn(String.valueOf(iE)));
        qpvVar.putContentData(i, 4, new jpn(String.valueOf(ntmVar.c())));
        qpvVar.putContentData(i, 5, new jpn(String.valueOf(ntmVar.b())));
    }

    private static void c(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, int i, ntq ntqVar, boolean z) {
        if (qpvVar == null || ntqVar == null || i < 0) {
            LogUtil.j("Track_SegmentUtils", "putRowMachineSegmentToTableSet with error parameter tableDataSet:", qpvVar, " rowingMachineSegment:", ntqVar, " rowIndex:", Integer.valueOf(i));
            return;
        }
        qpvVar.putRowHeaderData(i, 0, new jpn(l(ntqVar.e())));
        qpvVar.putContentData(i, 1, new jpn(i(ntqVar.i())));
        qpvVar.putContentData(i, 2, new jpn(String.valueOf(ntqVar.h())));
        qpvVar.putContentData(i, 3, new jpn(String.valueOf(ntqVar.c())));
        if (z) {
            qpvVar.putContentData(i, 4, new jpn(String.valueOf(ntqVar.a())));
        } else {
            qpvVar.putContentData(i, 4, new jpn(String.valueOf(ntqVar.b())));
        }
    }

    private static void c(qpv<jpj, jpn, jpn, jpn, jpn, jpn> qpvVar, int i, ntw ntwVar) {
        if (qpvVar == null || ntwVar == null || i < 0) {
            LogUtil.j("Track_SegmentUtils", "putStrengthTrainingSegmentToTableSet with error parameter tableDataSet:", qpvVar, " StrengthTrainingSegment:", ntwVar, " rowIndex:", Integer.valueOf(i));
            return;
        }
        long jA = ntwVar.a();
        long jD = ntwVar.d();
        qpvVar.putRowHeaderData(i, 0, new jpn(l(ntwVar.f())));
        qpvVar.putContentData(i, 1, new jpn(ntwVar.c()));
        qpvVar.putContentData(i, 2, new jpn(ntwVar.e()));
        qpvVar.putContentData(i, 3, new jpn(g(ntwVar.b())));
        if (jA <= 0) {
            jA = -1;
        }
        qpvVar.putContentData(i, 4, new jpn(i(jA)));
        if (jD <= 0) {
            jD = -1;
        }
        qpvVar.putContentData(i, 5, new jpn(i(jD)));
    }

    public static CommonSegment a(MotionPathSimplify motionPathSimplify) {
        if (motionPathSimplify == null) {
            LogUtil.j("Track_SegmentUtils", "convertSimplifyToSegment with null parameter, pls check");
            return null;
        }
        int iRequestSportType = motionPathSimplify.requestSportType();
        if (a(iRequestSportType)) {
            return e(motionPathSimplify);
        }
        if (c(iRequestSportType)) {
            return b(motionPathSimplify);
        }
        if (nub.e(iRequestSportType)) {
            return c(motionPathSimplify);
        }
        return null;
    }

    private static CommonSegment b(MotionPathSimplify motionPathSimplify) {
        ntp ntpVar = new ntp();
        ntpVar.b(TimeUnit.MILLISECONDS.toSeconds(motionPathSimplify.requestTotalTime()));
        ntpVar.e(motionPathSimplify.requestTotalDistance() * 100);
        ntpVar.d((int) l(motionPathSimplify.requestAvgHeartRate()));
        ntpVar.c(motionPathSimplify.getExtendDataInt("crossTrainerCadence", -1));
        ntpVar.b((int) (360000.0f / motionPathSimplify.requestAvgPace()));
        ntpVar.a(Math.round(motionPathSimplify.requestTotalDescent() * 10.0f));
        ntpVar.d(Math.round(motionPathSimplify.requestCreepingWave() * 10.0f));
        ntpVar.a(0);
        return ntpVar;
    }

    private static CommonSegment c(MotionPathSimplify motionPathSimplify) {
        nts ntsVar = new nts();
        ntsVar.i(TimeUnit.MILLISECONDS.toSeconds(motionPathSimplify.requestTotalTime()));
        ntsVar.c((long) (((double) motionPathSimplify.requestTotalDistance()) * 100.0d));
        ntsVar.g((long) (((double) motionPathSimplify.requestTotalDescent()) * 10.0d));
        return ntsVar;
    }

    private static CommonSegment e(MotionPathSimplify motionPathSimplify) {
        ntu ntuVar = new ntu();
        ntuVar.e(TimeUnit.MILLISECONDS.toSeconds(motionPathSimplify.requestTotalTime()));
        ntuVar.a(motionPathSimplify.requestTotalDistance() * 100);
        ntuVar.i(Math.round(motionPathSimplify.requestAvgPace()));
        ntuVar.j((int) l(motionPathSimplify.requestAvgHeartRate()));
        ntuVar.b(motionPathSimplify.requestAvgStepRate());
        ntuVar.g((int) Math.round((((double) motionPathSimplify.requestTotalDistance()) * 100.0d) / ((double) motionPathSimplify.requestTotalSteps())));
        ntuVar.b(Math.round(motionPathSimplify.requestTotalDescent() * 10.0f));
        ntuVar.c(Math.round(motionPathSimplify.requestCreepingWave() * 10.0f));
        ntuVar.d(motionPathSimplify.requestAvgGroundContactTime());
        ntuVar.f(motionPathSimplify.requestAvgGroundImpactAcceleration());
        ntuVar.e(motionPathSimplify.requestAvgEversionExcursion());
        ntuVar.l(motionPathSimplify.requestAvgSwingAngle());
        ntuVar.o(0);
        ntuVar.c(motionPathSimplify.requestAverageHangTime());
        ntuVar.e((float) UnitUtil.d(motionPathSimplify.getExtendDataFloat("avg_gc_tb"), 1));
        ntuVar.c((float) UnitUtil.d(motionPathSimplify.getExtendDataFloat("avg_v_osc"), 1));
        ntuVar.d((float) UnitUtil.d(motionPathSimplify.getExtendDataFloat("avg_v_s_r"), 1));
        ntuVar.a((float) UnitUtil.d(motionPathSimplify.getExtendDataFloat("avg_i_p"), 1));
        ntuVar.b((float) UnitUtil.d(motionPathSimplify.getExtendDataFloat("avg_v_i_r"), 1));
        ntuVar.a(motionPathSimplify.getExtendDataInt("avgAnalogPower"));
        return ntuVar;
    }

    public static void e(qpv qpvVar) {
        if (qpvVar == null) {
            LogUtil.j("Track_SegmentUtils", "addGolfSegmentTableTitle with error parameter tableDataSet is null, pls check");
            return;
        }
        Context context = BaseApplication.getContext();
        if (context == null) {
            qpvVar.putRowColumnHeaderData(0, 0, null);
            LogUtil.j("Track_SegmentUtils", "addGolfSegmentTableTitle with context is null, pls check");
            return;
        }
        qpvVar.putRowColumnHeaderData(0, 0, new jpn(null));
        qpvVar.putColumnHeaderData(0, 1, new jpj(z(context), null));
        qpvVar.putColumnHeaderData(0, 2, new jpj(n(context), m(context)));
        qpvVar.putColumnHeaderData(0, 3, new jpj(q(context), s(context)));
        qpvVar.putColumnHeaderData(0, 4, new jpj(ah(context), ai(context)));
    }

    public static void a(qpv qpvVar, ntr ntrVar) {
        if (qpvVar == null || ntrVar == null) {
            LogUtil.j("Track_SegmentUtils", "addGolfSegmentToTableSet with error parameter tableDataSet:", qpvVar, " trackGolfSegment:", ntrVar);
        } else {
            b(qpvVar, qpvVar.getRowsCount(), ntrVar);
        }
    }

    public static void b(qpv qpvVar, int i, ntr ntrVar) {
        if (qpvVar == null || ntrVar == null || i < 0) {
            LogUtil.j("Track_SegmentUtils", "putGolfSegmentToTableSet with error parameter tableDataSet:", qpvVar, " trackGolfSegment:", ntrVar, " rowIndex:", Integer.valueOf(i));
            return;
        }
        qpvVar.putRowHeaderData(i, 0, new jpn(j(ntrVar.f())));
        qpvVar.putContentData(i, 1, new jpn(n(ntrVar.j())));
        qpvVar.putContentData(i, 2, new jpn(h(ntrVar.d())));
        qpvVar.putContentData(i, 3, new jpn(f(ntrVar.b())));
        qpvVar.putContentData(i, 4, new jpn(o(ntrVar.i())));
    }

    private static String l(int i) {
        if (i == -1) {
            return qre.f(com.huawei.health.servicesui.R.string.IDS_motiontrack_show_invalid_data);
        }
        return UnitUtil.e(i, 1, 0);
    }

    private static String d(Context context, int i, int i2) {
        if (i == 1) {
            return context.getResources().getString(R.string.IDS_rate_zone_warmup_threshold);
        }
        if (i == 2) {
            return a(context, i2);
        }
        if (i == 3) {
            return context.getResources().getString(R.string.sug_rest_workout_name);
        }
        if (i == 4) {
            return context.getResources().getString(R.string.IDS_hw_pressure_relaxed);
        }
        if (i == 5) {
            return context.getResources().getString(R.string.IDS_device_setting_other);
        }
        return "";
    }

    private static String a(Context context, int i) {
        if (i == 258) {
            return context.getResources().getString(R.string.IDS_start_track_sport_type_run);
        }
        if (i == 259) {
            return context.getResources().getString(R.string.IDS_hwh_start_track_sport_type_cycle);
        }
        if (i == 279) {
            return context.getResources().getString(R.string.IDS_hwh_motiontrack_other);
        }
        return "";
    }

    private static String aa(Context context) {
        return context.getResources().getString(R.string.IDS_hwh_motiontrack_swim_segment);
    }

    private static String i(long j) {
        if (j == -1) {
            return qre.f(com.huawei.health.servicesui.R.string.IDS_motiontrack_show_invalid_data);
        }
        return jpq.b(TimeUnit.SECONDS.toMillis(j));
    }

    private static String g(long j) {
        if (j <= 0) {
            return qre.f(com.huawei.health.servicesui.R.string.IDS_motiontrack_show_invalid_data);
        }
        return UnitUtil.e(j, 1, 0);
    }

    private static String e(float f) {
        if (f <= 0.0f) {
            return qre.f(com.huawei.health.servicesui.R.string.IDS_motiontrack_show_invalid_data);
        }
        return UnitUtil.e(f, 1, 2);
    }

    private static String am(Context context) {
        return context.getResources().getString(R.string.IDS_start_track_type);
    }

    private static String ae(Context context) {
        return context.getResources().getString(R.string.IDS_hw_motiontrack_segment_use_time);
    }

    private static String e(long j) {
        if (j == -1) {
            return qre.f(com.huawei.health.servicesui.R.string.IDS_motiontrack_show_invalid_data);
        }
        return jpq.b(j / 100.0d);
    }

    private static String c(long j) {
        if (j == -1) {
            return qre.f(com.huawei.health.servicesui.R.string.IDS_motiontrack_show_invalid_data);
        }
        return jpq.b(Math.round(j / 100.0d));
    }

    private static String p(Context context) {
        return context.getResources().getString(R.string.IDS_sport_distance);
    }

    private static String t(Context context) {
        String string;
        if (UnitUtil.f()) {
            string = context.getResources().getString(R.string.IDS_motiontrack_show_sport_unit_mi);
        } else {
            string = context.getResources().getString(R.string.IDS_motiontrack_show_sport_unit_km);
        }
        return context.getResources().getString(R.string.IDS_motiontrack_show_chart_unit_string, string);
    }

    private static String ac(Context context) {
        String string;
        if (UnitUtil.f()) {
            string = context.getResources().getString(R.string.IDS_motiontrack_show_detail_average_speed_imp);
        } else {
            string = context.getResources().getString(R.string.IDS_motiontrack_show_detail_average_speed);
        }
        return context.getResources().getString(R.string.IDS_motiontrack_show_chart_unit_string, string);
    }

    private static String f(long j) {
        if (j == -1) {
            return qre.f(com.huawei.health.servicesui.R.string.IDS_motiontrack_show_invalid_data);
        }
        double d = j / 100.0d;
        if (UnitUtil.f()) {
            return UnitUtil.e(d * 0.6213712d, 1, 2);
        }
        return UnitUtil.e(d, 1, 2);
    }

    private static String e(int i, int i2) {
        String strE;
        String strF = qre.f(com.huawei.health.servicesui.R.string.IDS_motiontrack_show_invalid_data);
        if (i != -1) {
            int iRound = Math.round(i / 10.0f);
            strE = qre.e(R.plurals.IDS_degree_unit_with_value, iRound, Integer.valueOf(iRound));
        } else {
            strE = strF;
        }
        if (i2 != -1) {
            strF = UnitUtil.e(i2 / 10.0f, 2, 1);
        }
        return String.format(qre.f(R.string.IDS_motiontrack_separator), strE, strF);
    }

    private static String a(long j) {
        if (j == -1) {
            return "";
        }
        return jpq.e(j);
    }

    private static String u(Context context) {
        return context.getResources().getString(R.string.IDS_motiontrack_show_lock_screen_sport_pace);
    }

    private static String v(Context context) {
        String string;
        if (UnitUtil.f()) {
            string = context.getResources().getString(R.string.IDS_motiontrack_pace_unit_british);
        } else {
            string = context.getResources().getString(R.string.IDS_motiontrack_pace_unit);
        }
        return context.getResources().getString(R.string.IDS_motiontrack_show_chart_unit_string, string);
    }

    private static String i(int i) {
        if (i == -1) {
            return "";
        }
        return UnitUtil.e(i, 1, 0);
    }

    private static String c(float f) {
        if (f == -1.0f) {
            return "";
        }
        return UnitUtil.e(f, 1, 1);
    }

    private static String r(Context context) {
        return context.getResources().getString(R.string.IDS_motiontrack_detail_fm_heart_heartrate);
    }

    private static String y(Context context) {
        return context.getResources().getString(R.string.IDS_motiontrack_show_chart_unit_string, context.getResources().getString(R.string.IDS_main_watch_heart_rate_unit_string));
    }

    private static String k(int i) {
        if (i == -1) {
            return "";
        }
        return jpq.a(i);
    }

    private static String b(int i) {
        if (i == -1) {
            return "";
        }
        return UnitUtil.e(i, 1, 0);
    }

    private static String ad(Context context) {
        return context.getResources().getString(R.string.IDS_hwh_motiontrack_avg_stride_length);
    }

    private static String ab(Context context) {
        if (UnitUtil.f()) {
            return context.getResources().getString(R.string.IDS_motiontrack_show_chart_unit_string, context.getResources().getString(R.string.IDS_ins));
        }
        return context.getResources().getString(R.string.IDS_motiontrack_show_chart_unit_string, context.getResources().getString(R.string.IDS_cm));
    }

    private static String j(long j) {
        if (j < 0) {
            return "";
        }
        return jpq.c(j / 100.0d);
    }

    private static String ag(Context context) {
        return context.getResources().getString(R.string.IDS_hwh_motiontrack_total_climbed_simplified);
    }

    private static String af(Context context) {
        if (UnitUtil.f()) {
            return context.getResources().getString(R.string.IDS_motiontrack_show_chart_unit_string, context.getResources().getString(R.string.IDS_ft));
        }
        return context.getResources().getString(R.string.IDS_motiontrack_show_chart_unit_string, context.getResources().getString(R.string.IDS_fitness_data_list_activity_meter_unit));
    }

    private static String d() {
        return qre.f(R.string.IDS_indoor_equip_power_average);
    }

    private static String a() {
        return qre.a(R.string.IDS_motiontrack_show_chart_unit_string, qre.f(R.string.IDS_indoor_equip_power_unit_watt));
    }

    private static String h(long j) {
        if (j < 0) {
            return "";
        }
        return jpq.c(j / 100.0d);
    }

    private static String al(Context context) {
        return context.getResources().getString(R.string.IDS_hwh_motiontrack_total_descent);
    }

    private static String aj(Context context) {
        return af(context);
    }

    private static String b(long j) {
        if (j == -1) {
            return "";
        }
        return UnitUtil.e(j, 1, 0);
    }

    private static String a(Context context) {
        return context.getResources().getString(R.string.IDS_running_posture_avg_ground_contact_time);
    }

    private static String j(Context context) {
        return context.getResources().getString(R.string.IDS_motiontrack_show_chart_unit_string, context.getResources().getString(R.string.IDS_msec_unit));
    }

    private static String d(long j) {
        if (j == -1) {
            return "";
        }
        return UnitUtil.e(j, 1, 0);
    }

    private static String f(Context context) {
        return context.getResources().getString(R.string.IDS_running_posture_avg_ground_impact_acceleration_simplified);
    }

    private static String i(Context context) {
        return context.getResources().getString(R.string.IDS_motiontrack_show_chart_unit_string, context.getResources().getString(R.string.IDS_gravity_unit));
    }

    private static String d(int i) {
        if (i == -1) {
            return "";
        }
        return BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_degree_unit_with_value, i, Integer.valueOf(i));
    }

    private static String e(Context context) {
        return context.getResources().getString(R.string.IDS_running_posture_avg_eversion_excursion);
    }

    private static String d(Context context) {
        return context.getResources().getString(R.string.IDS_motiontrack_show_chart_unit_string, context.getResources().getString(R.string.IDS_degree_unit));
    }

    private static String g(int i) {
        return d(i);
    }

    private static String k(Context context) {
        return context.getResources().getString(R.string.IDS_running_posture_avg_swing_angle);
    }

    private static String l(Context context) {
        return context.getResources().getString(R.string.IDS_motiontrack_show_chart_unit_string, context.getResources().getString(R.string.IDS_degree_unit));
    }

    private static String h(Context context) {
        return context.getResources().getString(R.string.IDS_bolt_average_peak_impact);
    }

    private static String o(Context context) {
        return context.getResources().getString(R.string.IDS_motiontrack_show_chart_unit_string, context.getResources().getString(R.string.IDS_bolt_shock_peak_unit));
    }

    private static String g(Context context) {
        return context.getResources().getString(R.string.IDS_motiontrack_show_chart_unit_string, context.getResources().getQuantityString(R.plurals.IDS_bolt_average_peak_impact_unit, 1, ""));
    }

    private static String e(int i) {
        if (i == -1) {
            return "";
        }
        return jpq.b(i);
    }

    private static String c(Context context) {
        return context.getResources().getString(R.string.IDS_motiontrack_show_detail_averagestemps);
    }

    private static String b(Context context) {
        return context.getResources().getString(R.string.IDS_motiontrack_show_chart_unit_string, context.getResources().getString(R.string.IDS_motiontrack_show_detail_stempsmin));
    }

    private static String x(Context context) {
        return context.getResources().getString(R.string.IDS_motiontrack_show_chart_unit_string, context.getResources().getString(UnitUtil.f() ? R.string.IDS_weight_target_lbs : R.string.IDS_rowing_machine_unit_kg));
    }

    private static String w(Context context) {
        return context.getResources().getString(R.string.IDS_motiontrack_show_chart_unit_string, context.getResources().getString(R.string.IDS_indoor_equip_power_unit_watt));
    }

    private static String a(float f) {
        if (f == -1.0f) {
            return "";
        }
        return BaseApplication.getContext().getResources().getString(R.string.IDS_bolt_balance_rate_left_right_value, UnitUtil.e(f, 2, 1), UnitUtil.e(100.0f - f, 2, 1));
    }

    private static String d(float f) {
        if (f == -1.0f) {
            return "";
        }
        return UnitUtil.e(f, 2, 1);
    }

    public static double d(double d, double d2) {
        double d3 = d + 1.0d;
        if (Math.abs(d3) < 9.999999974752427E-7d && Math.abs(d2 + 1.0d) < 9.999999974752427E-7d) {
            return -1.0d;
        }
        if (Math.abs(d3) < 9.999999974752427E-7d) {
            return d2;
        }
        return Math.abs(1.0d + d2) < 9.999999974752427E-7d ? d : d + d2;
    }

    private static int c(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        return i2 == -1 ? i : Math.max(i, i2);
    }

    private static float b(float f, float f2) {
        if (Math.abs(f + 1.0f) < 1.0E-6f) {
            return f2;
        }
        return Math.abs(1.0f + f2) < 1.0E-6f ? f : Math.max(f, f2);
    }

    private static long a(long j, long j2) {
        if (j == -1 || j2 == -1 || j2 == 0) {
            return -1L;
        }
        return Math.round(j / j2);
    }

    private static float c(float f, long j) {
        if (f == -1.0f || j == -1 || j == 0) {
            return -1.0f;
        }
        return Math.round(((double) f) / j);
    }

    private static String j(int i) {
        return l(i);
    }

    private static String z(Context context) {
        return context.getResources().getString(R.string.IDS_pluginmotiontrack_detail_swing_rhythm);
    }

    private static String n(int i) {
        if (i == -1) {
            return "";
        }
        return UnitUtil.e(((double) i) / 100.0d, 1, 1);
    }

    private static String n(Context context) {
        return context.getResources().getString(R.string.IDS_pluginmotiontrack_detail_back_swing_time);
    }

    private static String m(Context context) {
        return context.getResources().getString(R.string.IDS_hwh_motiontrack_average_swing_time_unit);
    }

    private static String h(int i) {
        if (i == -1) {
            return "";
        }
        return UnitUtil.e(((double) i) / 1000.0d, 1, 2);
    }

    private static String q(Context context) {
        return context.getResources().getString(R.string.IDS_pluginmotiontrack_detail_down_swing_time);
    }

    private static String s(Context context) {
        return context.getResources().getString(R.string.IDS_hwh_motiontrack_average_swing_time_unit);
    }

    private static String f(int i) {
        return h(i);
    }

    private static String ah(Context context) {
        return context.getResources().getString(R.string.IDS_pluginmotiontrack_detail_swing_speed);
    }

    private static String ai(Context context) {
        String string;
        if (UnitUtil.f()) {
            string = context.getResources().getString(R.string.IDS_motiontrack_show_detail_average_speed_imp);
        } else {
            string = context.getResources().getString(R.string.IDS_aw_version2_meter_per_second);
        }
        return context.getResources().getString(R.string.IDS_motiontrack_show_chart_unit_string, string);
    }

    private static String o(int i) {
        if (i == -1) {
            return "";
        }
        if (UnitUtil.f()) {
            return UnitUtil.e(UnitUtil.e((((double) i) / 100.0d) * 3.5999999046325684d, 3), 1, 1);
        }
        return UnitUtil.e(((double) i) / 100.0d, 1, 1);
    }

    public static boolean d(List<ntu> list, CommonSegment commonSegment) {
        boolean z = commonSegment != null && ((ntu) commonSegment).r() >= 3600;
        long jR = 0;
        for (ntu ntuVar : list) {
            if (z) {
                break;
            }
            if (ntuVar.r() >= 3600) {
                return true;
            }
            jR += ntuVar.r();
            if (jR >= 3600) {
                return true;
            }
        }
        return z;
    }

    public static boolean c(List<ntu> list) {
        Iterator<ntu> it = list.iterator();
        int iF = 0;
        while (it.hasNext()) {
            iF += it.next().f();
            if (iF > 0) {
                return true;
            }
        }
        return false;
    }
}
