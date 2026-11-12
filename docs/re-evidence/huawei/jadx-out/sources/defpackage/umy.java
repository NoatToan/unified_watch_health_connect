package defpackage;

import android.text.TextUtils;
import com.github.mikephil.charting.data.Entry;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes19.dex */
public class umy extends qob {
    private static int d = 5;

    public umy(HwHealthBaseBarLineChart hwHealthBaseBarLineChart) {
        super(hwHealthBaseBarLineChart);
    }

    private long b() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10006), "heart_rate_lastTimes");
        if (TextUtils.isEmpty(strE) || "0".equals(strE)) {
            LogUtil.j("HealthHeartRate_HwHRDatasContainer", "lastTimes is empty or 0");
            return System.currentTimeMillis();
        }
        try {
            return Long.parseLong(strE);
        } catch (NumberFormatException unused) {
            LogUtil.j("HealthHeartRate_HwHRDatasContainer", "getLastTimestamp numberFormatException");
            return System.currentTimeMillis();
        }
    }

    @Override // defpackage.qob, com.huawei.ui.commonui.linechart.icommon.IHwHealthLineDatasContainer
    public void load(HwHealthLineDataSet hwHealthLineDataSet) {
        if (!(this.e instanceof HwHealthBaseScrollBarLineChart)) {
            super.load(hwHealthLineDataSet);
            return;
        }
        this.f46544a.c(this.e, hwHealthLineDataSet);
        this.f46545b = hwHealthLineDataSet;
        this.f46546c.clear();
        HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart = (HwHealthBaseScrollBarLineChart) this.e;
        long millis = TimeUnit.MINUTES.toMillis(qnh.f((int) hwHealthBaseScrollBarLineChart.getLowestVisibleX()) + qnh.f((int) hwHealthBaseScrollBarLineChart.getHighestVisibleX())) / 2;
        boolean z = qnh.e(millis) == qnh.e(b());
        d dVar = new d(qnh.h((int) TimeUnit.MILLISECONDS.toMinutes(qnh.a(millis))), Integer.MAX_VALUE, e(hwHealthLineDataSet));
        c cVar = new c(hwHealthLineDataSet, this.f46544a);
        e eVar = null;
        e eVar2 = null;
        int i = 0;
        e eVar3 = null;
        while (i < 10000) {
            e eVarB = b(cVar, dVar.d(), dVar.b());
            if (eVarB != null) {
                if (eVar3 == null || eVarB.r() > eVar3.r()) {
                    eVar3 = eVarB;
                }
                if (eVar == null || eVarB.s() < eVar.s()) {
                    eVar = eVarB;
                }
                if (z) {
                    eVar2 = eVarB;
                }
                eVarB.f();
            }
            if (!cVar.a() || !dVar.c()) {
                break;
            }
            i++;
            dVar.e();
        }
        d(eVar3, eVar, eVar2);
        a(this.f46546c);
    }

    private int e(HwHealthLineDataSet hwHealthLineDataSet) {
        int i = d;
        return Math.round(hwHealthLineDataSet.b()) <= i ? Math.round(hwHealthLineDataSet.b()) : i;
    }

    private void d(e eVar, e eVar2, e eVar3) {
        if (eVar2 != null) {
            eVar2.l();
        }
        if (eVar != null) {
            eVar.o();
        }
        if (eVar3 != null) {
            eVar3.k();
        }
    }

    private e b(c cVar, int i, int i2) {
        e eVar = null;
        while (cVar.a()) {
            Entry entryD = cVar.d();
            if (entryD == null) {
                LogUtil.j("HealthHeartRate_HwHRDatasContainer", "report error,is that OOM");
                return eVar;
            }
            if (entryD.getX() < i || entryD.getX() >= i2) {
                break;
            }
            cVar.b();
            if (eVar == null) {
                eVar = new e();
                this.f46546c.add(eVar);
            }
            eVar.d(entryD);
        }
        return eVar;
    }

    static class e extends qod {
        private List<Entry> e = new ArrayList();

        e() {
        }

        public void d(Entry entry) {
            this.e.add(entry);
        }

        public void f() {
            if (this.e.size() == 0) {
                LogUtil.j("HealthHeartRate_HwHRDatasContainer", "no data,genSamplingPoint failed");
            } else {
                Entry entry = this.e.get(0);
                d(entry.getX(), entry.getY(), entry);
            }
        }

        public Entry n() {
            if (this.e.size() == 0) {
                LogUtil.j("HealthHeartRate_HwHRDatasContainer", "no data,getLastEntry failed");
                return new Entry();
            }
            List<Entry> list = this.e;
            return list.get(list.size() - 1);
        }

        public Entry m() {
            if (this.e.size() == 0) {
                LogUtil.j("HealthHeartRate_HwHRDatasContainer", "no data,getFirstEntry failed");
                return new Entry();
            }
            return this.e.get(0);
        }

        public float r() {
            Entry entryP = p();
            if (entryP == null) {
                return -3.4028235E38f;
            }
            return entryP.getY();
        }

        public Entry p() {
            List<Entry> list = this.e;
            Entry entry = null;
            if (list != null && list.size() != 0) {
                float y = -3.4028235E38f;
                for (Entry entry2 : this.e) {
                    if (entry2.getY() > y) {
                        y = entry2.getY();
                        entry = entry2;
                    }
                }
            }
            return entry;
        }

        public float s() {
            Entry entryQ = q();
            if (entryQ == null) {
                return Float.MAX_VALUE;
            }
            return entryQ.getY();
        }

        public Entry q() {
            List<Entry> list = this.e;
            Entry entry = null;
            if (list != null && list.size() != 0) {
                float y = Float.MAX_VALUE;
                for (Entry entry2 : this.e) {
                    if (entry2.getY() < y) {
                        y = entry2.getY();
                        entry = entry2;
                    }
                }
            }
            return entry;
        }

        public void o() {
            Entry entryP = p();
            if (entryP == null) {
                LogUtil.j("HealthHeartRate_HwHRDatasContainer", "genSamplingPointAsMax null");
            } else {
                d(entryP.getX(), entryP.getY(), entryP);
            }
        }

        public void l() {
            Entry entryQ = q();
            if (entryQ == null) {
                LogUtil.j("HealthHeartRate_HwHRDatasContainer", "genSamplingPointAsMin null");
            } else {
                d(entryQ.getX(), entryQ.getY(), entryQ);
            }
        }

        public void k() {
            Entry entryN = n();
            if (entryN == null) {
                LogUtil.j("HealthHeartRate_HwHRDatasContainer", "genSamplingPointAsLast null");
            } else {
                d(entryN.getX(), entryN.getY(), entryN);
            }
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f50378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f50379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f50380c;
        private int e;

        d(int i, int i2, int i3) {
            this.f50378a = i;
            this.e = i2;
            this.f50380c = i3;
            this.f50379b = i;
        }

        public boolean c() {
            int i = this.f50379b;
            int i2 = this.f50380c;
            int i3 = this.e;
            return i + i2 <= i3 || i + (i2 * 2) <= i3;
        }

        public boolean e() {
            if (!c()) {
                return false;
            }
            this.f50379b += this.f50380c;
            return true;
        }

        public int d() {
            return this.f50379b;
        }

        public int b() {
            return this.f50379b + this.f50380c;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f50376a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HwHealthLineDataSet f50377c;
        private qob.c e;

        public c(HwHealthLineDataSet hwHealthLineDataSet, qob.c cVar) {
            this.f50377c = hwHealthLineDataSet;
            this.e = cVar;
            e();
        }

        public boolean a() {
            return this.f50376a + 1 < this.e.d();
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.github.mikephil.charting.data.Entry] */
        public Entry d() {
            if (a()) {
                return this.f50377c.getEntryForIndex(this.f50376a + 1);
            }
            return null;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.github.mikephil.charting.data.Entry] */
        public Entry b() {
            if (!a()) {
                return null;
            }
            int i = this.f50376a + 1;
            this.f50376a = i;
            return this.f50377c.getEntryForIndex(i);
        }

        private void e() {
            this.f50376a = this.e.a() - 1;
        }
    }

    private void a(List<qod> list) {
        int i = 0;
        while (i < list.size()) {
            int i2 = i - 1;
            e eVar = null;
            e eVar2 = (i2 < 0 || i2 >= list.size()) ? null : (e) list.get(i2);
            int i3 = i + 1;
            if (i3 >= 0 && i3 < list.size()) {
                eVar = (e) list.get(i3);
            }
            e eVar3 = (e) list.get(i);
            if (eVar2 != null) {
                eVar3.e(e(eVar2, eVar3));
            }
            if (eVar != null) {
                eVar3.b(e(eVar3, eVar));
            }
            i = i3;
        }
    }

    private boolean e(e eVar, e eVar2) {
        return Math.abs(((int) eVar.n().getX()) - ((int) eVar2.m().getX())) <= 35;
    }
}
