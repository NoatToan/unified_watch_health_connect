package defpackage;

import com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter;
import com.huawei.healthcloud.plugintrack.manager.inteface.IStepRateUpdater;
import com.huawei.healthcloud.plugintrack.model.IRealStepCallback;
import com.huawei.hwfoundationmodel.trackmodel.StepRateData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.LogAnonymous;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes10.dex */
public class ixr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private StepRateData f38173b;
    private StepRateData e;
    private PluginSportTrackAdapter f;
    private IStepRateUpdater o;
    private List<StepRateData> h = new CopyOnWriteArrayList();
    private List<StepRateData> m = new CopyOnWriteArrayList();
    private List<StepRateData> g = new CopyOnWriteArrayList();
    private List<StepRateData> l = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f38174c = false;
    private CopyOnWriteArrayList<Integer> i = new CopyOnWriteArrayList<>();
    private boolean d = false;
    private int k = 0;
    private int j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private izf f38172a = new izf();

    private int b(int i, int i2, long j) {
        if (j <= 0) {
            return 0;
        }
        float f = i / (j / 60000.0f);
        return f > ((float) i2) ? i2 : (int) f;
    }

    public ixr(PluginSportTrackAdapter pluginSportTrackAdapter, IStepRateUpdater iStepRateUpdater) {
        this.f = null;
        this.o = null;
        if (pluginSportTrackAdapter == null || iStepRateUpdater == null) {
            LogUtil.j("Track_StepRateUtils", "StepRateUtils adapter or updater is null");
        } else {
            this.f = pluginSportTrackAdapter;
            this.o = iStepRateUpdater;
        }
    }

    public void b(PluginSportTrackAdapter pluginSportTrackAdapter) {
        if (pluginSportTrackAdapter == null) {
            LogUtil.j("Track_StepRateUtils", "setAdapter adapter is null");
        } else {
            this.f = pluginSportTrackAdapter;
        }
    }

    public void a(List<StepRateData> list) {
        this.h.clear();
        this.m.clear();
        if (list == null) {
            LogUtil.e("Track_StepRateUtils", "stepRateList is null");
        } else {
            this.h.addAll(list);
        }
    }

    public void d(List<StepRateData> list) {
        this.h.clear();
        this.m.clear();
        if (list == null) {
            LogUtil.e("Track_StepRateUtils", "stepRateList is null");
        } else {
            this.h.addAll(list);
            this.m.addAll(list);
        }
    }

    public void a() {
        this.i.clear();
        this.j = 0;
    }

    public int c(int i, int i2) {
        h(i);
        if (q()) {
            return c(i2);
        }
        return 0;
    }

    public int i() {
        return this.i.size();
    }

    public int a(int i) {
        if (i() < i + 1) {
            return 0;
        }
        return this.i.get(i).intValue();
    }

    private void h(int i) {
        if (q()) {
            this.i.remove(0);
        }
        this.i.add(Integer.valueOf(i));
    }

    private boolean q() {
        return this.i.size() >= 12;
    }

    private int c(int i) {
        Integer num = this.i.get(0);
        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = this.i;
        if (num == copyOnWriteArrayList.get(copyOnWriteArrayList.size() - 1)) {
            this.d = true;
            this.k = this.i.get(0).intValue();
            this.j = 0;
            return 0;
        }
        if (!this.d) {
            CopyOnWriteArrayList<Integer> copyOnWriteArrayList2 = this.i;
            int iIntValue = (copyOnWriteArrayList2.get(copyOnWriteArrayList2.size() - 1).intValue() - this.i.get(0).intValue()) * i;
            if (iIntValue <= 250) {
                this.j = iIntValue;
            } else {
                this.j = 0;
            }
        } else if (this.i.get(0).intValue() != this.k) {
            this.d = false;
        }
        return this.j;
    }

    public void e(int i) {
        i(i);
    }

    public void n() {
        a(true);
        r();
    }

    public void l() {
        a(false);
    }

    public void k() {
        t();
        s();
    }

    public void c(boolean z) {
        this.f38174c = z;
    }

    public void d(int i) {
        this.f.setStepType(i);
    }

    private void i(int i) {
        PluginSportTrackAdapter pluginSportTrackAdapter = this.f;
        if (pluginSportTrackAdapter == null) {
            LogUtil.e("Track_StepRateUtils", "registerRealStepListener mPluginTrackAdapter is null!");
        } else {
            pluginSportTrackAdapter.registerRealStepListener(new IRealStepCallback() { // from class: ixr.2
                @Override // com.huawei.healthcloud.plugintrack.model.IRealStepCallback
                public void onChange(int i2, long j, long j2) {
                    if (ixr.this.h == null) {
                        LogUtil.j("Track_StepRateUtils", "The mStepRateList is null");
                        ixr.this.h = new CopyOnWriteArrayList();
                    }
                    StepRateData stepRateData = new StepRateData(j, i2);
                    LogUtil.a("Track_StepRateUtils", "registerRealStepListener onChange time : ", Long.valueOf(j), Constants.LINK, Long.valueOf(j2), " step : ", Integer.valueOf(i2));
                    if (j2 - j >= 60000 && jem.f()) {
                        jeh.e().c(i2);
                    }
                    if (ixr.this.f38174c) {
                        LogUtil.a("Track_StepRateUtils", "stop auto track, do not need steps");
                        return;
                    }
                    if (ixr.this.o != null) {
                        ixr.this.o.updateStepRate(stepRateData);
                    }
                    ixr.this.h.add(stepRateData);
                    ixr.this.m.add(stepRateData);
                    LogUtil.a("Track_StepRateUtils", "stepRatelist size:", Integer.valueOf(ixr.this.h.size()));
                }
            }, 60L, i);
        }
    }

    private void t() {
        PluginSportTrackAdapter pluginSportTrackAdapter = this.f;
        if (pluginSportTrackAdapter == null) {
            LogUtil.e("Track_StepRateUtils", "unregisterRealStepListener mPluginTrackAdapter is null!");
        } else {
            pluginSportTrackAdapter.unRegisterRealStepCallback();
        }
    }

    private void a(boolean z) {
        PluginSportTrackAdapter pluginSportTrackAdapter = this.f;
        if (pluginSportTrackAdapter == null) {
            LogUtil.e("Track_StepRateUtils", "pauseRealStepTick mPluginTrackAdapter is null!");
        } else {
            pluginSportTrackAdapter.pauseOrResumeStepRateRecord(z);
        }
    }

    public ArrayList<StepRateData> j() {
        ArrayList<StepRateData> arrayList = new ArrayList<>(16);
        arrayList.addAll(this.h);
        return arrayList;
    }

    public void c() {
        this.g.clear();
        this.l.clear();
        this.g.addAll(this.h);
        this.l.addAll(this.m);
    }

    public ArrayList<StepRateData> b(boolean z) {
        ArrayList<StepRateData> arrayList = new ArrayList<>(16);
        if (this.m.size() > 0) {
            arrayList.addAll(this.m);
            if (z) {
                this.m.clear();
            }
        }
        return arrayList;
    }

    public ArrayList<StepRateData> e(boolean z) {
        ArrayList<StepRateData> arrayList = new ArrayList<>(16);
        if (this.l.size() > 0) {
            arrayList.addAll(this.l);
            if (z) {
                this.l.clear();
            }
        }
        return arrayList;
    }

    public int c(long j) {
        return b(m(), g(), j);
    }

    public int d(long j) {
        return b(o(), h(), j);
    }

    public int g() {
        return c(this.h);
    }

    public int h() {
        return c(this.g);
    }

    private int c(List<StepRateData> list) {
        int iAcquireStepRate = 0;
        if (njy.b(list)) {
            for (StepRateData stepRateData : list) {
                if (stepRateData != null && stepRateData.acquireStepRate() > iAcquireStepRate) {
                    iAcquireStepRate = stepRateData.acquireStepRate();
                }
            }
        }
        return iAcquireStepRate;
    }

    public int m() {
        return e(this.h);
    }

    public int o() {
        return e(this.g);
    }

    private int e(List<StepRateData> list) {
        int iAcquireStepRate = 0;
        if (njy.b(list)) {
            for (StepRateData stepRateData : list) {
                if (stepRateData != null) {
                    iAcquireStepRate += stepRateData.acquireStepRate();
                }
            }
            return iAcquireStepRate;
        }
        LogUtil.a("Track_StepRateUtils", "getTotalSteps = ", LogAnonymous.d(0));
        return 0;
    }

    public void b(StepRateData stepRateData) {
        if (stepRateData == null || this.h.size() <= 0) {
            return;
        }
        long jAcquireTime = stepRateData.acquireTime();
        List<StepRateData> list = this.h;
        if (jAcquireTime > list.get(list.size() - 1).acquireTime()) {
            this.h.add(stepRateData);
            this.m.add(stepRateData);
        }
    }

    public void d(StepRateData stepRateData) {
        if (stepRateData == null || this.g.size() <= 0) {
            return;
        }
        long jAcquireTime = stepRateData.acquireTime();
        List<StepRateData> list = this.g;
        if (jAcquireTime > list.get(list.size() - 1).acquireTime()) {
            this.g.add(stepRateData);
            this.l.add(stepRateData);
        }
    }

    private void r() {
        PluginSportTrackAdapter pluginSportTrackAdapter = this.f;
        if (pluginSportTrackAdapter == null) {
            LogUtil.e("Track_StepRateUtils", "getCurrentStep() mPluginTrackAdapter is null!");
        } else {
            pluginSportTrackAdapter.reportCurrentStepCallback(new IRealStepCallback() { // from class: ixr.3
                @Override // com.huawei.healthcloud.plugintrack.model.IRealStepCallback
                public void onChange(int i, long j, long j2) {
                    StepRateData stepRateData = new StepRateData(j, i);
                    LogUtil.a("Track_StepRateUtils", "CurrentStep: ", Integer.valueOf(i), " time : ", Long.valueOf(j), Constants.LINK, Long.valueOf(j2));
                    ixr.this.f38173b = stepRateData;
                }
            });
        }
    }

    public void a(final CountDownLatch countDownLatch) {
        PluginSportTrackAdapter pluginSportTrackAdapter = this.f;
        if (pluginSportTrackAdapter == null) {
            LogUtil.e("Track_StepRateUtils", "getTargetCurrentStep() mPluginTrackAdapter is null!");
        } else {
            pluginSportTrackAdapter.reportCurrentStepCallback(new IRealStepCallback() { // from class: ixr.4
                @Override // com.huawei.healthcloud.plugintrack.model.IRealStepCallback
                public void onChange(int i, long j, long j2) {
                    StepRateData stepRateData = new StepRateData(j, i);
                    LogUtil.a("Track_StepRateUtils", "TargetCurrentStep: ", Integer.valueOf(i), " time : ", Long.valueOf(j), Constants.LINK, Long.valueOf(j2));
                    ixr.this.e = stepRateData;
                    ixr ixrVar = ixr.this;
                    ixrVar.d(ixrVar.e);
                    countDownLatch.countDown();
                }
            });
        }
    }

    private void s() {
        StepRateData stepRateData = this.f38173b;
        if (stepRateData != null) {
            this.h.add(stepRateData);
            this.m.add(this.f38173b);
        }
    }

    public int b() {
        StepRateData stepRateData = this.f38173b;
        if (stepRateData == null) {
            return 0;
        }
        return stepRateData.acquireStepRate();
    }

    public void a(IStepRateUpdater iStepRateUpdater) {
        this.o = iStepRateUpdater;
    }

    public void d() {
        this.l.clear();
        this.g.clear();
        this.e = null;
    }

    public void b(int i) {
        this.f38172a.a(i);
    }

    public int f() {
        return this.f38172a.d();
    }

    public void e() {
        this.f38172a.e();
    }
}
