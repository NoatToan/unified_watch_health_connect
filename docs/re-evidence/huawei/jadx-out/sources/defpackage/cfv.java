package defpackage;

import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.dfx.DfxUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.CommonUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes23.dex */
public class cfv {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile cfv f1554c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1555a = "2,5,6";
    private SparseArray<HealthLifeBean> e = new SparseArray<>();
    private SparseArray<HealthLifeBean> d = new SparseArray<>();

    private cfv() {
    }

    public static cfv e() {
        if (f1554c == null) {
            synchronized (cfv.class) {
                if (f1554c == null) {
                    f1554c = new cfv();
                }
            }
        }
        return f1554c;
    }

    public void a(final ResponseCallback<List<HealthLifeBean>> responseCallback, final String str) {
        if (Boolean.TRUE.toString().equals(ccy.c("health_model_is_join_future"))) {
            LogUtil.a("HL_TaskSubscriptionHelper", "joinHealthLife join future");
            return;
        }
        if (cbg.ac()) {
            if (cbg.ah()) {
                return;
            }
            LogUtil.a("HL_TaskSubscriptionHelper", "joinHealthLife not upgrade");
            e(str);
            return;
        }
        LogUtil.a("HL_TaskSubscriptionHelper", "joinHealthLife un joined");
        if (!CommonUtil.ab(BaseApplication.b())) {
            LogUtil.a("HL_TaskSubscriptionHelper", "joinHealthLife isNetworkConnected is false");
            return;
        }
        if (HandlerExecutor.c()) {
            cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: cfx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1562c.e(responseCallback, str);
                }
            });
            return;
        }
        if (!LoginInit.getInstance(BaseApplication.b()).getIsLogined() || !Utils.h()) {
            LogUtil.a("HL_TaskSubscriptionHelper", "joinHealthLife isLogin is false");
        } else if (ffv.t()) {
            ReleaseLogUtil.c("HL_TaskSubscriptionHelper", "joinHealthLife isSupportHealthLife is true");
        } else {
            qgm.c("900200006", new IBaseResponseCallback() { // from class: cfy
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f1564b.d(responseCallback, str, i, obj);
                }
            });
        }
    }

    /* synthetic */ void e(ResponseCallback responseCallback, String str) {
        a((ResponseCallback<List<HealthLifeBean>>) responseCallback, str);
    }

    /* synthetic */ void d(ResponseCallback responseCallback, String str, int i, Object obj) {
        a(responseCallback, str, obj instanceof Integer ? ((Integer) obj).intValue() : 0);
    }

    private void a(final ResponseCallback<List<HealthLifeBean>> responseCallback, final String str, final int i) {
        final ArrayList<Integer> arrayListC = cbg.c();
        final int iA = DateFormatUtil.a(System.currentTimeMillis());
        byu.c().a(cbg.q(), iA, new ResponseCallback() { // from class: cfw
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i2, Object obj) {
                this.f1560c.b(iA, i, responseCallback, arrayListC, str, i2, (SparseArray) obj);
            }
        });
    }

    /* synthetic */ void b(int i, int i2, ResponseCallback responseCallback, List list, String str, int i3, SparseArray sparseArray) {
        LogUtil.a("HL_TaskSubscriptionHelper", "join recordDay=", Integer.valueOf(i), ",resultCode=", Integer.valueOf(i3), ",stepGoal=", Integer.valueOf(i2));
        if (sparseArray == null || sparseArray.size() == 0) {
            LogUtil.j("HL_TaskSubscriptionHelper", "join array is empty");
            d((ResponseCallback<List<HealthLifeBean>>) responseCallback, -1, Collections.EMPTY_LIST);
            return;
        }
        ArrayList<HealthLifeBean> arrayList = new ArrayList<>();
        int size = sparseArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            HealthLifeBean healthLifeBean = (HealthLifeBean) sparseArray.valueAt(i4);
            if (healthLifeBean != null) {
                int iKeyAt = sparseArray.keyAt(i4);
                healthLifeBean.setRecordDay(i);
                if (iKeyAt == 1) {
                    healthLifeBean.setLastTarget("");
                    healthLifeBean.setTarget("2,5,6");
                    arrayList.add(healthLifeBean);
                } else {
                    if (iKeyAt == 2 && i2 > 0) {
                        healthLifeBean.setTarget(String.valueOf(i2));
                    }
                    if (list.contains(Integer.valueOf(iKeyAt))) {
                        healthLifeBean.setTaskType(1);
                        arrayList.add(healthLifeBean);
                    }
                }
            }
        }
        byu.c().a(true, str, arrayList, (ResponseCallback<SparseArray<HealthLifeBean>>) new b(this, responseCallback, str));
    }

    static class b implements ResponseCallback<SparseArray<HealthLifeBean>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<ResponseCallback<List<HealthLifeBean>>> f1556b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f1557c;
        private final WeakReference<cfv> e;

        b(cfv cfvVar, ResponseCallback<List<HealthLifeBean>> responseCallback, String str) {
            this.e = new WeakReference<>(cfvVar);
            this.f1556b = new WeakReference<>(responseCallback);
            this.f1557c = str;
        }

        @Override // com.huawei.hwbasemgr.ResponseCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, SparseArray<HealthLifeBean> sparseArray) {
            cfv cfvVar = this.e.get();
            if (cfvVar != null) {
                cfvVar.b(i, this.f1556b.get(), this.f1557c, sparseArray);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, ResponseCallback<List<HealthLifeBean>> responseCallback, String str, SparseArray<HealthLifeBean> sparseArray) {
        LogUtil.a("HL_TaskSubscriptionHelper", "taskSubscriptionHandler resultCode:", Integer.valueOf(i));
        c();
        ArrayList<HealthLifeBean> arrayListC = cdf.c(sparseArray);
        if (i == 0 || i == 12030009) {
            d(responseCallback, str, arrayListC);
        } else {
            d(responseCallback, i, arrayListC);
        }
    }

    private void d(ResponseCallback<List<HealthLifeBean>> responseCallback, String str, List<HealthLifeBean> list) {
        str.hashCode();
        if (str.equals("cloverLife")) {
            d();
            d(responseCallback, 0, list);
        } else {
            if (str.equals("EXIT_HEALTH_GOAL")) {
                a();
                cfb.e(list, cdf.c(list), cfb.a());
                d(responseCallback);
                return;
            }
            d(responseCallback, 0, list);
        }
    }

    private void a() {
        HiUserPreference hiUserPreference = new HiUserPreference();
        hiUserPreference.setKey("health_model_is_agree_protocol");
        hiUserPreference.setValue("");
        boolean userPreference = HiHealthManager.d(BaseApplication.b()).setUserPreference(hiUserPreference);
        ccy.d("health_model_is_agree_protocol", "");
        LogUtil.a("HL_TaskSubscriptionHelper", "clearProtocol isSuccess=", Boolean.valueOf(userPreference));
    }

    private void d(ResponseCallback<List<HealthLifeBean>> responseCallback, int i, List<HealthLifeBean> list) {
        if (responseCallback != null) {
            responseCallback.onResponse(i, list);
        }
    }

    private void d() {
        cbg.an();
        int iA = DateFormatUtil.a(System.currentTimeMillis());
        ccy.c(iA, false);
        ccy.a(iA, false);
        int iE = CommonUtil.e(com.huawei.hwcommonmodel.application.BaseApplication.getContext());
        if (iE <= 0) {
            LogUtil.j("HL_TaskSubscriptionHelper", "upgradeUserStatus appVersion less than or equal to zero");
        } else {
            ccy.d("health_model_update_guide_version_code", String.valueOf(iE));
            LogUtil.a("HL_TaskSubscriptionHelper", "upgradeUserStatus");
        }
    }

    public void c(final List<HealthLifeBean> list, final ResponseCallback<List<HealthLifeBean>> responseCallback, final String str) {
        boolean z = cbg.z() || Boolean.TRUE.toString().equals(ccy.c("health_model_is_join_future"));
        if (!cbg.ac() || njy.e(list) || z) {
            LogUtil.j("HL_TaskSubscriptionHelper", "syncUpdateHealthGoal not join health life or lifeBean is null");
            d(responseCallback, -1, Collections.EMPTY_LIST);
            return;
        }
        if (HandlerExecutor.c()) {
            cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: cfz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1566b.b(list, responseCallback, str);
                }
            });
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(2);
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iA = DateFormatUtil.a(jCurrentTimeMillis);
        int iA2 = DateFormatUtil.a(lsl.w(jCurrentTimeMillis));
        String strQ = cbg.q();
        b(countDownLatch, strQ, iA);
        b(countDownLatch, strQ, iA2);
        cbg.b(countDownLatch, "HL_TaskSubscriptionHelper");
        if (this.e.size() == 0 || this.d.size() == 0) {
            LogUtil.j("HL_TaskSubscriptionHelper", "syncUpdateHealthGoal data is empty");
            d(responseCallback, -1, Collections.EMPTY_LIST);
        } else {
            a(this.e, iA);
            a(this.d, iA2);
            e(cdf.c(list), this.e, this.d, responseCallback, str);
        }
    }

    /* synthetic */ void b(List list, ResponseCallback responseCallback, String str) {
        c((List<HealthLifeBean>) list, (ResponseCallback<List<HealthLifeBean>>) responseCallback, str);
    }

    private void b(final CountDownLatch countDownLatch, String str, final int i) {
        byu.c().a(str, i, new ResponseCallback() { // from class: cgd
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i2, Object obj) {
                this.f1571c.d(i, countDownLatch, i2, (SparseArray) obj);
            }
        });
    }

    /* synthetic */ void d(int i, CountDownLatch countDownLatch, int i2, SparseArray sparseArray) {
        LogUtil.a("HL_TaskSubscriptionHelper", "date ", Integer.valueOf(i), " resultCode ", Integer.valueOf(i2), " array ", sparseArray);
        if (sparseArray == null || sparseArray.size() <= 0) {
            countDownLatch.countDown();
            return;
        }
        if (i == DateFormatUtil.a(System.currentTimeMillis())) {
            this.e = sparseArray;
        } else {
            this.d = sparseArray;
        }
        countDownLatch.countDown();
    }

    private void e(SparseArray<HealthLifeBean> sparseArray, SparseArray<HealthLifeBean> sparseArray2, SparseArray<HealthLifeBean> sparseArray3, ResponseCallback<List<HealthLifeBean>> responseCallback, String str) {
        if (sparseArray2 == null || sparseArray2.size() <= 0 || sparseArray3 == null || sparseArray3.size() <= 0) {
            ReleaseLogUtil.d("HL_TaskSubscriptionHelper", "handleSubscriptionTask todayTaskArray ", sparseArray2, " tomorrowTaskArray ", sparseArray3, " stackTraceInfo ", DfxUtils.d(Thread.currentThread(), null));
            return;
        }
        HealthLifeBean healthLifeBean = sparseArray2.get(1);
        if (healthLifeBean == null) {
            LogUtil.j("HL_TaskSubscriptionHelper", "handleSubscriptionTask cloverBean is null");
            d(responseCallback, -1, Collections.EMPTY_LIST);
            c();
            return;
        }
        healthLifeBean.setLastTarget(healthLifeBean.getTarget());
        HealthLifeBean healthLifeBean2 = sparseArray3.get(1);
        if (healthLifeBean2 != null) {
            healthLifeBean2.setLastTarget(healthLifeBean.getTarget());
        }
        int size = sparseArray3.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray3.keyAt(i);
            HealthLifeBean healthLifeBean3 = sparseArray3.get(iKeyAt);
            HealthLifeBean healthLifeBean4 = sparseArray.get(iKeyAt);
            if (healthLifeBean4 != null && healthLifeBean3 != null) {
                String target = healthLifeBean3.getTarget();
                String target2 = healthLifeBean4.getTarget();
                if (!TextUtils.isEmpty(target) && target.equals(target2)) {
                    LogUtil.a("HL_TaskSubscriptionHelper", "handleSubscriptionTask target same taskId=", Integer.valueOf(iKeyAt));
                } else {
                    healthLifeBean3.setTarget(target2);
                    LogUtil.a("HL_TaskSubscriptionHelper", "handleSubscriptionTask modify taskId=", Integer.valueOf(iKeyAt));
                    z = true;
                }
            }
        }
        if (!z) {
            d(responseCallback, 0, Collections.EMPTY_LIST);
            c();
        } else {
            ArrayList<HealthLifeBean> arrayList = new ArrayList<>();
            arrayList.addAll(cdf.c(sparseArray2));
            arrayList.addAll(cdf.c(sparseArray3));
            byu.c().a(true, str, arrayList, (ResponseCallback<SparseArray<HealthLifeBean>>) new b(this, responseCallback, str));
        }
    }

    private void a(SparseArray<HealthLifeBean> sparseArray, int i) {
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            HealthLifeBean healthLifeBeanValueAt = sparseArray.valueAt(i2);
            if (healthLifeBeanValueAt != null) {
                healthLifeBeanValueAt.setRecordDay(i);
            }
        }
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void d(final ResponseCallback<List<HealthLifeBean>> responseCallback, final String str) {
        if (HandlerExecutor.c()) {
            cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: cge
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1573c.d(responseCallback, str);
                }
            });
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(2);
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iA = DateFormatUtil.a(jCurrentTimeMillis);
        int iA2 = DateFormatUtil.a(lsl.w(jCurrentTimeMillis));
        String strQ = cbg.q();
        b(countDownLatch, strQ, iA);
        b(countDownLatch, strQ, iA2);
        cbg.b(countDownLatch, "HL_TaskSubscriptionHelper");
        if (this.e.size() == 0 || this.d.size() == 0) {
            LogUtil.j("HL_TaskSubscriptionHelper", "updateHealthLifeTarget data is empty");
            d(responseCallback, -1, Collections.EMPTY_LIST);
            return;
        }
        a(this.e, iA);
        a(this.d, iA2);
        d(this.e);
        d(this.d);
        HealthLifeBean healthLifeBean = this.e.get(1);
        HealthLifeBean healthLifeBean2 = this.d.get(1);
        if (healthLifeBean == null || healthLifeBean2 == null) {
            LogUtil.j("HL_TaskSubscriptionHelper", "handleSubscriptionTask todayBean or tomorrowBean is null");
            d(responseCallback, -1, Collections.EMPTY_LIST);
            c();
            return;
        }
        healthLifeBean.setLastTarget(healthLifeBean2.getTarget());
        healthLifeBean.setTarget("2,5,6");
        healthLifeBean2.setLastTarget("2,5,6");
        healthLifeBean2.setTarget("2,5,6");
        ArrayList<HealthLifeBean> arrayList = new ArrayList<>();
        arrayList.addAll(cdf.c(this.e));
        arrayList.addAll(cdf.c(this.d));
        byu.c().a(true, str, arrayList, (ResponseCallback<SparseArray<HealthLifeBean>>) new b(this, responseCallback, str));
    }

    private void d(SparseArray<HealthLifeBean> sparseArray) {
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            HealthLifeBean healthLifeBeanValueAt = sparseArray.valueAt(i);
            if (healthLifeBeanValueAt != null) {
                healthLifeBeanValueAt.setChallengeId(0);
                healthLifeBeanValueAt.setDataSource(0);
                int id = healthLifeBeanValueAt.getId();
                int i2 = (id == 2 || id == 5 || id == 6) ? 1 : 0;
                healthLifeBeanValueAt.setAddStatus(i2);
                healthLifeBeanValueAt.setTaskType(i2);
            }
        }
    }

    public void d(final ResponseCallback<List<HealthLifeBean>> responseCallback) {
        ccq.a("HL_TaskSubscriptionHelper", (ResponseCallback<ffd>) new ResponseCallback() { // from class: cgb
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.d.c(responseCallback, i, (ffd) obj);
            }
        });
    }

    /* synthetic */ void c(final ResponseCallback responseCallback, int i, ffd ffdVar) {
        LogUtil.a("HL_TaskSubscriptionHelper", "exitChallenge errorCode ", Integer.valueOf(i), " object ", ffdVar);
        if (ffdVar == null) {
            d((ResponseCallback<List<HealthLifeBean>>) responseCallback, 0, Collections.EMPTY_LIST);
        } else {
            bwk.d().c(ffdVar.c(), 0, new IBaseResponseCallback() { // from class: cga
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i2, Object obj) {
                    this.f1568a.c(responseCallback, i2, obj);
                }
            });
        }
    }

    /* synthetic */ void c(ResponseCallback responseCallback, int i, Object obj) {
        LogUtil.a("HL_TaskSubscriptionHelper", "exitChallenge code ", Integer.valueOf(i), " updateObject ", obj);
        if (i == 0) {
            cda.a();
        }
        d((ResponseCallback<List<HealthLifeBean>>) responseCallback, i, Collections.EMPTY_LIST);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void e(final String str) {
        if (HandlerExecutor.c()) {
            cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: cgf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1575c.e(str);
                }
            });
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(2);
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iA = DateFormatUtil.a(jCurrentTimeMillis);
        int iA2 = DateFormatUtil.a(lsl.w(jCurrentTimeMillis));
        String strQ = cbg.q();
        b(countDownLatch, strQ, iA);
        b(countDownLatch, strQ, iA2);
        cbg.b(countDownLatch, "HL_TaskSubscriptionHelper");
        if (this.e.size() == 0 || this.d.size() == 0) {
            LogUtil.j("HL_TaskSubscriptionHelper", "updateHealthLifeTarget data is empty");
            return;
        }
        a(this.e, iA);
        a(this.d, iA2);
        d(this.e);
        d(this.d);
        ArrayList<HealthLifeBean> arrayList = new ArrayList<>();
        arrayList.addAll(cdf.c(this.e));
        arrayList.addAll(cdf.c(this.d));
        byu.c().a(true, str, arrayList, (ResponseCallback<SparseArray<HealthLifeBean>>) new b(this, null, ""));
    }

    private void c() {
        this.e.clear();
        this.d.clear();
    }
}
