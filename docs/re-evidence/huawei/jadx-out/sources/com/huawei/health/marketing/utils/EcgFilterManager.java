package com.huawei.health.marketing.utils;

import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.util.Pair;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.section.section.MeasureCardView;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import defpackage.ecu;
import defpackage.eej;
import defpackage.eey;
import defpackage.fdi;
import defpackage.fej;
import defpackage.fxd;
import defpackage.fxf;
import defpackage.fxn;
import defpackage.fyg;
import defpackage.gvl;
import defpackage.lmf;
import defpackage.lon;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class EcgFilterManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f8180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f8181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8182c;
    private final EcgDataInquirer d;
    private Pair<String, WeakReference<View>> e;
    private Pair<String, WeakReference<View>> f;
    private List<String> g;
    private boolean h;
    private EcgMode i;
    private Pair<String, WeakReference<View>> j;
    private final EcgDataInquirer l;
    private boolean m;
    private final EcgDataInquirer n;
    private boolean o;

    enum EcgMode {
        NONE,
        COLLECTION_CARD_DIAGRAM_ICON,
        COLLECTION_CARD_ONLY,
        DIAGRAM_CARD_COLLECTION_ICON,
        DIAGRAM_CARD_ONLY
    }

    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final EcgFilterManager f8186a = new EcgFilterManager();
    }

    public static EcgFilterManager b() {
        return e.f8186a;
    }

    private void ab() {
        if (this.f8181b.f8183a) {
            ThreadPoolManager.c().e(this.f8181b);
        }
        this.f8181b.e();
        ThreadPoolManager.c().execute(this.f8181b);
    }

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile boolean f8183a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile boolean f8185c;
        CountDownLatch d;
        private volatile boolean e;
        private volatile boolean j;

        private a() {
            this.f8183a = false;
            this.d = new CountDownLatch(3);
        }

        public void e() {
            this.f8183a = false;
            this.d = new CountDownLatch(3);
            this.f8185c = false;
            this.e = false;
            this.j = false;
        }

        public void b() {
            if (this.f8185c) {
                return;
            }
            this.d.countDown();
            this.f8185c = true;
        }

        public void d() {
            if (this.e) {
                return;
            }
            this.d.countDown();
            this.e = true;
        }

        public void c() {
            if (this.j) {
                return;
            }
            this.d.countDown();
            this.j = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8183a = true;
            try {
                if (this.d.await(5000L, TimeUnit.MILLISECONDS)) {
                    a();
                }
            } catch (InterruptedException e) {
                LogUtil.e("EcgFilterManager", "reportCardTypeBi failed, cause exception = ", e.getMessage(), ", cause = ", e.getCause());
            }
            this.f8183a = false;
        }

        private void a() {
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            gvl measureCardBean = EcgFilterManager.this.l.getMeasureCardBean();
            if (measureCardBean.f()) {
                if (measureCardBean.g()) {
                    arrayList.add(1);
                    arrayList2.add(Boolean.valueOf(measureCardBean.c() != null));
                } else {
                    arrayList.add(0);
                    arrayList2.add(Boolean.valueOf(measureCardBean.a() != null));
                }
            }
            gvl measureCardBean2 = EcgFilterManager.this.d.getMeasureCardBean();
            if (measureCardBean2.f()) {
                arrayList.add(3);
                arrayList2.add(Boolean.valueOf(measureCardBean2.a() != null));
            }
            gvl measureCardBean3 = EcgFilterManager.this.n.getMeasureCardBean();
            if (measureCardBean3.f()) {
                arrayList.add(2);
                arrayList2.add(Boolean.valueOf(measureCardBean3.a() != null));
            }
            map.put("click", 1);
            map.put("card_type", arrayList);
            map.put("banner_status", arrayList2);
            map.put("more_app", EcgFilterManager.this.g);
            lmf.d().c(BaseApplication.b(), "2190016", map, 0);
        }
    }

    public void l() {
        LogUtil.a("EcgFilterManager", "start queryEcgDataAsync");
        n();
        p();
        this.l.querySummary();
        this.d.querySummary();
        this.n.querySummary();
        ab();
    }

    public void f() {
        this.l.clearAndRefreshUI();
        this.d.clearAndRefreshUI();
        this.n.clearAndRefreshUI();
    }

    private boolean c(String str) {
        return !TextUtils.isEmpty(str) && str.contains("?");
    }

    public String e(View view, String str, String str2) {
        if (view != null && !TextUtils.isEmpty(str)) {
            if (!this.g.contains(str2)) {
                this.g.add(str2);
            }
            if (e(str)) {
                this.j = new Pair<>(str2, new WeakReference(view));
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(c(str) ? "?from=2" : "&from=2");
                String string = sb.toString();
                e(this.j, true);
                return string;
            }
            if (b(str)) {
                Pair<String, WeakReference<View>> pair = new Pair<>(str2, new WeakReference(view));
                this.f = pair;
                e(pair, true);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(c(str) ? "?from=2" : "&from=2");
                return sb2.toString();
            }
            if (a(str)) {
                Pair<String, WeakReference<View>> pair2 = new Pair<>(str2, new WeakReference(view));
                this.e = pair2;
                e(pair2, true);
                return str;
            }
            if (i(str)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(c(str) ? "?from=2" : "&from=2");
                return sb3.toString();
            }
        }
        return str;
    }

    private void e(Pair<String, WeakReference<View>> pair, boolean z) {
        View view;
        if (pair.second == null || (view = pair.second.get()) == null) {
            return;
        }
        if (z && view.getVisibility() == 8) {
            return;
        }
        if (z || view.getVisibility() != 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (z) {
                view.setTag(Integer.valueOf(layoutParams.width));
                layoutParams.width = 0;
                view.setVisibility(8);
                view.post(new Runnable() { // from class: fxg
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f34675c.r();
                    }
                });
                this.g.remove(pair.first);
            } else {
                if (view.getTag() instanceof Integer) {
                    layoutParams.width = ((Integer) view.getTag()).intValue();
                } else {
                    LogUtil.e("EcgFilterManager", "handleEcgIconVisibility failed, cause icon tag is ", view.getTag());
                }
                view.setVisibility(0);
                if (!this.g.contains(pair.first)) {
                    this.g.add(pair.first);
                }
            }
            view.setLayoutParams(layoutParams);
        }
    }

    private boolean e(String str) {
        return (str.contains("com.huawei.health.ecg.collection") || str.contains("com.huawei.ecgh5") || str.contains("com.huawei.health.h5.ecg")) && !b(str);
    }

    private boolean b(String str) {
        return str.contains("com.huawei.health.h5.ecgce");
    }

    private boolean a(String str) {
        return str.contains("com.huawei.health.h5.ppg");
    }

    private boolean i(String str) {
        return str.contains("com.huawei.health.h5.vascular-health");
    }

    public void e(final MeasureCardView measureCardView, final int i, final boolean z) {
        if (!Looper.getMainLooper().isCurrentThread()) {
            HandlerExecutor.c(new Runnable() { // from class: fxh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34676a.d(measureCardView, i, z);
                }
            });
        } else {
            d(measureCardView, i, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        boolean z = true;
        e(this.j, this.i != EcgMode.DIAGRAM_CARD_COLLECTION_ICON || EnvironmentInfo.m());
        e(this.f, this.i != EcgMode.COLLECTION_CARD_DIAGRAM_ICON || EnvironmentInfo.m());
        Pair<String, WeakReference<View>> pair = this.e;
        if (d() && d("support_arrhythmia") && !EnvironmentInfo.m()) {
            z = false;
        }
        e(pair, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void d(MeasureCardView measureCardView, int i, boolean z) {
        if ((i & 1) != 0) {
            e(measureCardView, z);
            r();
            this.f8181b.b();
        }
        if ((i & 4) != 0) {
            e(measureCardView);
            this.f8181b.d();
        }
        if ((i & 16) != 0) {
            d(measureCardView);
            this.f8181b.c();
        }
        if (measureCardView != null) {
            if (this.f8182c == 0 || EnvironmentInfo.m()) {
                measureCardView.d();
            } else {
                measureCardView.b();
            }
        }
    }

    public void a(final MeasureCardView measureCardView, final int i) {
        if (!Looper.getMainLooper().isCurrentThread()) {
            HandlerExecutor.c(new Runnable() { // from class: fxe
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34671a.c(measureCardView, i);
                }
            });
        } else {
            c(measureCardView, i);
        }
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void c(MeasureCardView measureCardView, int i) {
        if (measureCardView == null) {
            LogUtil.j("EcgFilterManager", "handleEcgNormalChartInternal failed cause measureCardView is null!");
            ReleaseLogUtil.e("EcgFilterManager", "handleEcgNormalChartInternal failed cause measureCardView is null!");
            return;
        }
        if ((i & 2) != 0) {
            measureCardView.a(this.l.getMeasureCardBean());
        }
        if ((i & 8) != 0) {
            measureCardView.a(this.d.getMeasureCardBean());
        }
    }

    private void d(MeasureCardView measureCardView) {
        if (measureCardView == null) {
            LogUtil.j("EcgFilterManager", "refreshVascularDesc failed cause measureCardView is null!");
            ReleaseLogUtil.e("EcgFilterManager", "refreshVascularDesc failed cause measureCardView is null!");
            return;
        }
        if (this.n.isQuerying()) {
            LogUtil.j("EcgFilterManager", "refreshVascularDesc failed while quering");
            ReleaseLogUtil.e("EcgFilterManager", "refreshVascularDesc failed while quering");
            return;
        }
        gvl measureCardBean = this.n.getMeasureCardBean();
        measureCardBean.c("com.huawei.health.h5.vascular-health", Constants.H5PRO_PAGE_PREFIX, "?from=1&support=1");
        if (!CommonUtil.ao() && !CommonUtil.cl() && (!a() || !d("support_vascular"))) {
            LogUtil.e("EcgFilterManager", "refreshVascularDesc failed, cause isSupportVascular is false!");
            measureCardBean.c(false);
            this.f8182c &= 6;
        } else {
            measureCardBean.c(true);
            this.f8182c |= -7;
        }
        if (EnvironmentInfo.m()) {
            measureCardBean.c(false);
        }
        measureCardView.c(measureCardBean);
    }

    private void e(MeasureCardView measureCardView) {
        if (measureCardView == null) {
            LogUtil.j("EcgFilterManager", "refreshEcgArrhythmiaDesc failed cause measureCardView is null!");
            ReleaseLogUtil.e("EcgFilterManager", "refreshEcgArrhythmiaDesc failed cause measureCardView is null!");
            return;
        }
        if (this.d.isQuerying()) {
            LogUtil.j("EcgFilterManager", "refreshEcgArrhythmiaDesc failed while quering");
            ReleaseLogUtil.e("EcgFilterManager", "refreshEcgArrhythmiaDesc failed while quering");
            return;
        }
        gvl measureCardBean = this.d.getMeasureCardBean();
        measureCardBean.c("com.huawei.health.h5.ppg", Constants.H5PRO_PAGE_PREFIX, "?from=1&support=1");
        if (!CommonUtil.ao() && !CommonUtil.cl() && (!d() || !d("support_arrhythmia"))) {
            LogUtil.e("EcgFilterManager", "refreshEcgArrhythmiaDesc failed, cause isSupportEcgArrhythmia is false!");
            measureCardBean.c(false);
            this.f8182c &= 5;
        } else {
            measureCardBean.c(true);
            this.f8182c |= -6;
        }
        if (EnvironmentInfo.m()) {
            measureCardBean.c(false);
        }
        measureCardView.c(measureCardBean);
    }

    private void e(MeasureCardView measureCardView, boolean z) {
        String str;
        boolean z2;
        if (measureCardView == null) {
            LogUtil.j("EcgFilterManager", "refreshEcgNormalDesc failed cause measureCardView is null!");
            ReleaseLogUtil.e("EcgFilterManager", "refreshEcgNormalDesc failed cause measureCardView is null!");
            return;
        }
        if (this.l.isQuerying()) {
            LogUtil.j("EcgFilterManager", "refreshEcgNormalDesc failed while quering");
            ReleaseLogUtil.e("EcgFilterManager", "refreshEcgNormalDesc failed while quering");
            return;
        }
        EcgMode ecgModeE = e(z);
        this.i = ecgModeE;
        boolean z3 = true;
        if (ecgModeE == EcgMode.DIAGRAM_CARD_ONLY || this.i == EcgMode.DIAGRAM_CARD_COLLECTION_ICON) {
            LogUtil.a("EcgFilterManager", "configMeasureCard shouldShowEcgDiagramInTwoGrid");
            str = "com.huawei.health.h5.ecgce";
            z2 = true;
        } else if (this.i == EcgMode.COLLECTION_CARD_ONLY || this.i == EcgMode.COLLECTION_CARD_DIAGRAM_ICON) {
            LogUtil.a("EcgFilterManager", "configMeasureCard shouldShowEcgCollectionInTwoGrid");
            str = "com.huawei.health.h5.ecg";
            z2 = true;
            z3 = false;
        } else {
            LogUtil.e("EcgFilterManager", "configMeasureCard failed, hide measure card");
            str = null;
            z2 = false;
            z3 = false;
        }
        boolean z4 = EnvironmentInfo.m() ? false : z2;
        gvl measureCardBean = this.l.getMeasureCardBean();
        measureCardBean.c(str, Constants.H5PRO_PAGE_PREFIX, "?from=1&support=1").c(z4).d(z3);
        if (!z4) {
            this.f8182c &= 3;
        } else {
            this.f8182c |= -4;
        }
        measureCardView.c(measureCardBean);
    }

    private Map q() {
        fdi fdiVarD = fej.d("com.huawei.health_deviceFeature_config", "txt", "com.huawei.health.h5.ecgce");
        if (fdiVarD == null) {
            ReleaseLogUtil.e("EcgFilterManager", "getExtInfo featureConfig is null");
            return null;
        }
        return fdiVarD.e();
    }

    private void n() {
        this.m = fxn.a("CE");
        this.o = fxn.a("PMDA");
        k();
    }

    private void k() {
        Map mapQ = q();
        if (mapQ == null) {
            return;
        }
        Object obj = mapQ.get("dia");
        if (obj instanceof Double) {
            this.f8180a = ((Double) obj).doubleValue();
        }
    }

    public boolean i() {
        return this.m;
    }

    public boolean m() {
        return this.o;
    }

    public boolean g() {
        return Double.compare(this.f8180a, 1.0d) == 0;
    }

    private void p() {
        Map mapQ = q();
        if (mapQ == null) {
            return;
        }
        Object obj = mapQ.get("prematureBeats");
        if (obj instanceof Double) {
            this.h = ((Double) obj).doubleValue() > 0.0d;
        } else {
            this.h = false;
        }
    }

    public boolean h() {
        return this.h;
    }

    private boolean u() {
        boolean z = false;
        if (!y()) {
            LogUtil.e("EcgFilterManager", "hasEcgCollectionDevice isDeviceConnected false!");
            return false;
        }
        DeviceCapability deviceCapabilityC = eej.c();
        if (deviceCapabilityC != null && deviceCapabilityC.isSupportEcgAuth()) {
            z = true;
        }
        LogUtil.a("EcgFilterManager", "hasEcgCollectionDevice: ", Boolean.valueOf(z));
        return z;
    }

    public boolean j() {
        DeviceInfo deviceInfoS = s();
        boolean z = d(deviceInfoS) && eey.d(deviceInfoS, 106);
        LogUtil.a("EcgFilterManager", "hasEcgDiagramDevice: ", Boolean.valueOf(z));
        return z;
    }

    private DeviceInfo s() {
        return ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "EcgFilterManager");
    }

    private boolean y() {
        return d(s());
    }

    private boolean d(DeviceInfo deviceInfo) {
        return deviceInfo != null && deviceInfo.getDeviceConnectState() == 2;
    }

    private static boolean g(String str) {
        return fej.a("com.huawei.health_deviceFeature_config", "txt", str);
    }

    public static boolean c() {
        return g("com.huawei.health.h5.ecgce") || fxn.d();
    }

    public static boolean a() {
        return g("com.huawei.health.h5.vascular-health");
    }

    public static boolean d() {
        return g("com.huawei.health.h5.ppg") || e();
    }

    public static boolean e() {
        fdi fdiVarD = fej.d("com.huawei.health_deviceFeature_config", "txt", "com.huawei.health.h5.ppg");
        if (fdiVarD == null || fdiVarD.e() == null) {
            LogUtil.e("EcgFilterManager", "isSupportPpg featureConfig or getExtInfo() is null");
            return false;
        }
        Map mapE = fdiVarD.e();
        if (mapE == null) {
            LogUtil.e("EcgFilterManager", "isSupportPpg extInfo is null");
            return false;
        }
        Object obj = mapE.get("support_ppg");
        LogUtil.a("EcgFilterManager", "isSupportPpg supportPpg:", obj);
        return (obj instanceof Double) && ((Double) obj).doubleValue() > 0.0d;
    }

    public boolean o() {
        return d("support_ecg_diagram");
    }

    private boolean d(String str) {
        String strD = lon.c().d(str);
        boolean zEquals = "true".equals(strD);
        boolean zBu = CommonUtil.bu();
        boolean zCa = CommonUtil.ca();
        ReleaseLogUtil.d("EcgFilterManager", "isSupportConfig supportKey = ", str, ", supportValue = ", strD, ", isReleaseVersion = ", Boolean.valueOf(zBu), ", isDemoVersion = ", Boolean.valueOf(zCa));
        return !(zBu || zCa) || zEquals;
    }

    private EcgFilterManager() {
        this.j = new Pair<>(null, null);
        this.f = new Pair<>(null, null);
        this.e = new Pair<>(null, null);
        this.g = new ArrayList();
        this.f8181b = new a();
        this.f8182c = 7;
        this.h = false;
        this.m = false;
        this.o = false;
        this.l = new fxf(new int[]{31002, DicDataTypeUtil.DataType.ELECTROCARDIOGRAM.value()});
        this.d = new fxd(new int[]{DicDataTypeUtil.DataType.ARRHYTHMIA_PPG_TYPE.value(), DicDataTypeUtil.DataType.PPG_IRREGULAR_HEARTBEAT.value()});
        this.n = new fyg(new int[]{DicDataTypeUtil.DataType.PULSE_WAVE_VELOCITY.value()});
    }

    private boolean aa() {
        if (j() && t()) {
            return true;
        }
        return !u() && v() && t();
    }

    private boolean ad() {
        if (!j() || t()) {
            return (j() || u() || t()) ? false : true;
        }
        return true;
    }

    private boolean w() {
        return !j() && u() && v();
    }

    private boolean x() {
        if (j() || v()) {
            return false;
        }
        return u() || t();
    }

    private boolean v() {
        gvl measureCardBean = this.l.getMeasureCardBean();
        return (measureCardBean == null || measureCardBean.c() == null) ? false : true;
    }

    private boolean t() {
        gvl measureCardBean = this.l.getMeasureCardBean();
        return (measureCardBean == null || measureCardBean.a() == null) ? false : true;
    }

    private EcgMode e(boolean z) {
        LogUtil.a("EcgFilterManager", "start to checkEcgMode");
        if (!Utils.o()) {
            if (Utils.i() || !z) {
                return EcgMode.DIAGRAM_CARD_COLLECTION_ICON;
            }
            if (!d("support_ecg_diagram")) {
                return EcgMode.COLLECTION_CARD_ONLY;
            }
        } else if (!d("support_ecg_diagram") && Utils.o()) {
            return EcgMode.NONE;
        }
        EcgMode ecgMode = EcgMode.NONE;
        if (aa()) {
            LogUtil.a("EcgFilterManager", "checkEcgMode DIAGRAM_CARD_COLLECTION_ICON");
            ecgMode = EcgMode.DIAGRAM_CARD_COLLECTION_ICON;
        }
        if (x()) {
            LogUtil.a("EcgFilterManager", "checkEcgMode COLLECTION_CARD_ONLY");
            ecgMode = EcgMode.COLLECTION_CARD_ONLY;
        }
        if (w()) {
            LogUtil.a("EcgFilterManager", "checkEcgMode COLLECTION_CARD_DIAGRAM_ICON");
            ecgMode = EcgMode.COLLECTION_CARD_DIAGRAM_ICON;
        }
        if (ad()) {
            LogUtil.a("EcgFilterManager", "checkEcgMode DIAGRAM_CARD_ONLY");
            ecgMode = EcgMode.DIAGRAM_CARD_ONLY;
        }
        if (Utils.o()) {
            if (ecgMode == EcgMode.COLLECTION_CARD_ONLY) {
                LogUtil.a("EcgFilterManager", "checkEcgMode is oversea, COLLECTION_CARD_ONLY to NONE");
                ecgMode = EcgMode.NONE;
            }
            if (ecgMode == EcgMode.COLLECTION_CARD_DIAGRAM_ICON) {
                LogUtil.a("EcgFilterManager", "checkEcgMode is oversea, COLLECTION_CARD_DIAGRAM_ICON to DIAGRAM_CARD_ONLY");
                ecgMode = EcgMode.DIAGRAM_CARD_ONLY;
            }
        }
        if ((ecgMode != EcgMode.DIAGRAM_CARD_COLLECTION_ICON && ecgMode != EcgMode.DIAGRAM_CARD_ONLY) || CommonUtil.ao() || CommonUtil.cl()) {
            return ecgMode;
        }
        if (c() && d("support_ecg_diagram")) {
            return ecgMode;
        }
        if (Utils.o()) {
            return EcgMode.NONE;
        }
        return EcgMode.COLLECTION_CARD_ONLY;
    }
}
