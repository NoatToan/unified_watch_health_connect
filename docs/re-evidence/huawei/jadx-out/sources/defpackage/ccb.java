package defpackage;

import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.ui.commonui.R;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public class ccb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile ccb f1447c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ResponseCallback<String> f1448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f1449b;
    private CountDownLatch d;
    private List<String> e;
    private int f;
    private List<String> g;
    private String i;
    private int j;
    private SparseArray<HealthLifeBean> k;
    private String l;
    private List<String> m;
    private SparseArray<HealthLifeBean> n;
    private String o;
    private ArrayList<HealthLifeBean> h = new ArrayList<>(16);
    private int r = -1;
    private int q = 0;

    public static ccb d() {
        if (f1447c == null) {
            synchronized (ccb.class) {
                if (f1447c == null) {
                    f1447c = new ccb();
                }
            }
        }
        return f1447c;
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void d(final List<String> list, final List<String> list2, final List<String> list3, final int i, final ResponseCallback<String> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("HL_ChallengeH5Utils", "addHealthLifeConfig callback is null");
            return;
        }
        if (njy.e(list) || njy.e(list2) || njy.e(list3)) {
            LogUtil.j("HL_ChallengeH5Utils", "addHealthLifeConfig params is error");
            responseCallback.onResponse(-1, "");
            return;
        }
        if (!CommonUtil.ab(BaseApplication.b())) {
            ReleaseLogUtil.d("HL_ChallengeH5Utils", "addHealthConfig isNetworkConnected false");
            responseCallback.onResponse(-1, qre.f(R.string.IDS_no_notwork_tip_content));
            return;
        }
        if (HandlerExecutor.c()) {
            cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: cci
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1459c.d(list, list2, list3, i, responseCallback);
                }
            });
            return;
        }
        if (LoginInit.getInstance(BaseApplication.b()).isMinorAccount() || !CommonUtil.bg()) {
            LogUtil.a("HL_ChallengeH5Utils", "addHealthConfig remove mindfulness");
            list.remove(String.valueOf(9));
        }
        this.m = list;
        this.e = list2;
        this.j = i;
        this.f1448a = responseCallback;
        this.g = list3;
        this.r = cbg.ac() ? -1 : 0;
        this.q = cbg.w();
        this.d = new CountDownLatch(2);
        this.f1449b = System.currentTimeMillis();
        String strQ = cbg.q();
        d(strQ, DateFormatUtil.a(this.f1449b));
        d(strQ, DateFormatUtil.a(lsl.w(this.f1449b)));
        try {
            this.d.await();
        } catch (InterruptedException e) {
            LogUtil.e("HL_ChallengeH5Utils", "getSubscriptionTask exception ", LogAnonymous.b(e));
        }
        e(this.f, this.n);
    }

    private void d(String str, final int i) {
        byu.c().a(str, i, new ResponseCallback() { // from class: cce
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i2, Object obj) {
                this.f1454b.d(i, i2, (SparseArray) obj);
            }
        });
    }

    /* synthetic */ void d(int i, int i2, SparseArray sparseArray) {
        LogUtil.a("HL_ChallengeH5Utils", "date = ", Integer.valueOf(i), ", resultCode = ", Integer.valueOf(i2));
        if (i != DateFormatUtil.a(System.currentTimeMillis())) {
            this.f = i2;
            this.n = sparseArray;
        } else if (i2 == 0) {
            this.k = sparseArray;
            this.h = cdf.c((SparseArray<HealthLifeBean>) sparseArray);
        }
        this.d.countDown();
    }

    private void e(int i, SparseArray<HealthLifeBean> sparseArray) {
        SparseArray<HealthLifeBean> sparseArray2;
        if (i == 0 && sparseArray != null) {
            HealthLifeBean healthLifeBean = sparseArray.get(1);
            if (healthLifeBean != null) {
                this.o = healthLifeBean.getTarget();
            }
            if (njy.e(this.h) || (sparseArray2 = this.k) == null) {
                LogUtil.j("HL_ChallengeH5Utils", "mTaskList or mTodayTaskList is null");
                this.f1448a.onResponse(-1, "");
                return;
            }
            HealthLifeBean healthLifeBean2 = sparseArray2.get(1);
            if (healthLifeBean2 == null) {
                LogUtil.j("HL_ChallengeH5Utils", "todayDbBean is null");
                this.f1448a.onResponse(-1, "");
                return;
            }
            String target = healthLifeBean2.getTarget();
            if (TextUtils.isEmpty(this.o)) {
                this.o = target;
            }
            LogUtil.a("HL_ChallengeH5Utils", "todayTarget ", target, "mTargetList ", this.o);
            c(target);
            return;
        }
        LogUtil.j("HL_ChallengeH5Utils", "setTomorrowConfigData resultCode code:", Integer.valueOf(i));
        this.f1448a.onResponse(i, "");
    }

    private void c(String str) {
        ArrayList<String> arrayList = new ArrayList<>(16);
        ArrayList<String> arrayList2 = new ArrayList<>(16);
        if (!cbg.ac()) {
            b(this.h, "");
            b(arrayList2, arrayList);
            return;
        }
        List<String> listB = b();
        if (njy.b(listB)) {
            for (String str2 : listB) {
                if (!this.m.contains(str2)) {
                    this.m.add(str2);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList(Arrays.asList(this.o.split(",")));
        for (String str3 : this.m) {
            if (!arrayList3.contains(str3)) {
                arrayList2.add(str3);
            }
        }
        String[] strArrSplit = this.o.split(",");
        arrayList.addAll(this.m);
        for (String str4 : strArrSplit) {
            if (!arrayList.contains(str4)) {
                arrayList.add(str4);
            }
        }
        if (!str.equals(this.o)) {
            str = this.o;
        }
        b(this.h, str);
        b(arrayList2, arrayList);
    }

    private List<String> b() {
        int id;
        ArrayList arrayList = new ArrayList(10);
        if (TextUtils.isEmpty(this.o)) {
            return arrayList;
        }
        LogUtil.a("HL_ChallengeH5Utils", "reservedTaskList mTargetList= ", this.o);
        ArrayList arrayList2 = new ArrayList(Arrays.asList(this.o.split(",")));
        for (HealthLifeBean healthLifeBean : this.h) {
            if (healthLifeBean != null && (id = healthLifeBean.getId()) != 1 && id != 100001 && healthLifeBean.getDataSource() != 1) {
                int challengeId = healthLifeBean.getChallengeId();
                LogUtil.a("HL_ChallengeH5Utils", "reservedTaskList challengeId= ", Integer.valueOf(challengeId));
                if (!cda.a(challengeId)) {
                    if (cda.b()) {
                        int iA = qrs.a(ccy.c("health_model_challenge_id"));
                        boolean zC = ccg.c(iA, id);
                        LogUtil.a("HL_ChallengeH5Utils", "reservedTaskList taskId= ", Integer.valueOf(id), ",isPlanTaskId= ", Boolean.valueOf(zC));
                        if (!zC || iA == 200001) {
                        }
                    }
                    if (arrayList2.contains(String.valueOf(id))) {
                        arrayList.add(String.valueOf(id));
                    }
                }
            }
        }
        LogUtil.a("HL_ChallengeH5Utils", "reservedTaskList reservedTaskList= ", arrayList.toString());
        return arrayList;
    }

    private void b(ArrayList<HealthLifeBean> arrayList, String str) {
        for (HealthLifeBean healthLifeBean : arrayList) {
            if (healthLifeBean != null) {
                int id = healthLifeBean.getId();
                if (id == 1) {
                    healthLifeBean.setLastTarget(str);
                    healthLifeBean.setChallengeId(this.j);
                    healthLifeBean.setDataSource(0);
                    c(healthLifeBean);
                    a(healthLifeBean);
                } else {
                    a(healthLifeBean);
                    healthLifeBean.setChallengeId(this.g.contains(String.valueOf(id)) ? this.j : 0);
                    healthLifeBean.setTaskType(this.e.contains(String.valueOf(id)) ? 1 : 0);
                    healthLifeBean.setDataSource(0);
                }
            }
        }
    }

    private void a(HealthLifeBean healthLifeBean) {
        if (healthLifeBean.getRecordDay() != DateFormatUtil.a(this.f1449b)) {
            healthLifeBean.setRecordDay(DateFormatUtil.a(this.f1449b));
        }
    }

    private void c(HealthLifeBean healthLifeBean) {
        ArrayList arrayList = new ArrayList(this.m.size());
        Iterator<String> it = this.m.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(CommonUtil.j(it.next())));
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            int iIntValue = ((Integer) arrayList.get(i)).intValue();
            if (iIntValue == 4) {
                LogUtil.a("HL_ChallengeH5Utils", "updateTarget taskId = 4");
            } else {
                sb.append(iIntValue);
                if (i != size - 1) {
                    sb.append(",");
                }
            }
        }
        String string = sb.toString();
        this.l = string;
        healthLifeBean.setTarget(string);
    }

    private void b(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        if (!cbg.ac() || !cbg.ah() || cbg.h(DateFormatUtil.a(System.currentTimeMillis()))) {
            this.i = this.l;
        } else {
            d(arrayList);
        }
        byu.c().a(!cbg.ah(), "", b(arrayList2), new b());
    }

    private void d(ArrayList<String> arrayList) {
        if (njy.e(arrayList)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : arrayList) {
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
                sb.append(",");
            }
        }
        int length = sb.length();
        if (length > 1) {
            this.i = sb.substring(0, length - 1);
        }
        LogUtil.a("HL_ChallengeH5Utils", "setNewTaskId rewardTaskIds = ", this.i);
    }

    private ArrayList<HealthLifeBean> b(ArrayList<String> arrayList) {
        if (njy.e(arrayList)) {
            return this.h;
        }
        ArrayList<HealthLifeBean> arrayList2 = new ArrayList<>(this.h);
        HealthLifeBean healthLifeBean = this.k.get(1);
        if (healthLifeBean != null) {
            healthLifeBean.setLastTarget(this.l);
            healthLifeBean.setTarget(this.l);
            healthLifeBean.setChallengeId(this.j);
            healthLifeBean.setDataSource(0);
            healthLifeBean.setRecordDay(DateFormatUtil.a(lsl.w(this.f1449b)));
            arrayList2.add(healthLifeBean);
        }
        for (String str : arrayList) {
            HealthLifeBean healthLifeBean2 = this.k.get(CommonUtil.j(str));
            if (healthLifeBean2 != null) {
                healthLifeBean2.setRecordDay(DateFormatUtil.a(lsl.w(this.f1449b)));
                healthLifeBean2.setChallengeId(this.g.contains(str) ? this.j : 0);
                healthLifeBean2.setTaskType(this.e.contains(str) ? 1 : 0);
                healthLifeBean2.setDataSource(0);
                SparseArray<HealthLifeBean> sparseArray = this.n;
                if (sparseArray != null && sparseArray.get(CommonUtil.j(str)) != null) {
                    healthLifeBean2.setTarget(this.n.get(CommonUtil.j(str)).getTarget());
                }
                arrayList2.add(healthLifeBean2);
            }
        }
        LogUtil.a("HL_ChallengeH5Utils", "updateList tomorrowList ", arrayList2.toString());
        return arrayList2;
    }

    /* JADX INFO: loaded from: classes23.dex */
    static class b implements ResponseCallback<SparseArray<HealthLifeBean>> {
        private final WeakReference<ccb> e;

        private b(ccb ccbVar) {
            this.e = new WeakReference<>(ccbVar);
        }

        @Override // com.huawei.hwbasemgr.ResponseCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, SparseArray<HealthLifeBean> sparseArray) {
            ccb ccbVar = this.e.get();
            if (ccbVar != null) {
                ccbVar.b(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    public void b(int i) {
        int i2;
        LogUtil.a("HL_ChallengeH5Utils", "taskSubscriptionHandler error code:", Integer.valueOf(i));
        if (i == 0) {
            e();
            i2 = 0;
        } else if (i == 1003) {
            i2 = com.huawei.basichealthmodel.R.string.IDS_health_model_edit_error_time;
        } else {
            switch (i) {
                case 12030008:
                    i2 = com.huawei.basichealthmodel.R.string.IDS_health_model_user_status_out;
                    break;
                case 12030009:
                    e();
                    i2 = 0;
                    break;
                case 12030010:
                    i2 = com.huawei.basichealthmodel.R.string.IDS_health_model_edit_error_time;
                    break;
                default:
                    i2 = com.huawei.basichealthmodel.R.string.IDS_health_model_edit_error;
                    break;
            }
        }
        if (i2 != 0) {
            this.f1448a.onResponse(i, BaseApplication.b().getResources().getString(i2));
        }
    }

    private void e() {
        final boolean z = true;
        if (njy.b(this.m) && this.m.contains(String.valueOf(12))) {
            byu.c().c(true);
        }
        if (TextUtils.isEmpty(this.i)) {
            b(this.j, this.f1448a);
            return;
        }
        cbg.an();
        a();
        if (cbg.ah() && !cbg.h(DateFormatUtil.a(System.currentTimeMillis()))) {
            z = false;
        }
        byu.c().b(z, this.i, new ResponseCallback() { // from class: ccj
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f1461c.e(z, i, obj);
            }
        });
    }

    /* synthetic */ void e(boolean z, int i, Object obj) {
        LogUtil.a("HL_ChallengeH5Utils", "onSuccessCallback resultCode = ", Integer.valueOf(i), ",mNewTaskId = ", this.i, ",isNeedRewardClover = ", Boolean.valueOf(z));
        if (i == 0) {
            b(this.j, this.f1448a);
        }
    }

    private void a() {
        if (this.r == 0) {
            ccy.c(DateFormatUtil.a(System.currentTimeMillis()), false);
        }
        if (this.q <= 0) {
            ccy.a(DateFormatUtil.a(System.currentTimeMillis()), false);
        }
        int iE = CommonUtil.e(com.huawei.hwcommonmodel.application.BaseApplication.getContext());
        if (iE <= 0) {
            LogUtil.j("HL_ChallengeH5Utils", "upgradeUserStatus appVersion less than or equal to zero");
        } else {
            ccy.d("health_model_update_guide_version_code", String.valueOf(iE));
            LogUtil.a("HL_ChallengeH5Utils", "upgradeUserStatus");
        }
    }

    public void b(final int i, final ResponseCallback<String> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("HL_ChallengeH5Utils", "updateChallenge callback is null");
            return;
        }
        boolean zH = Utils.h();
        LogUtil.a("HL_ChallengeH5Utils", "updateChallenge planId ", Integer.valueOf(i), " ifAllowLogin ", Boolean.valueOf(zH));
        if (!zH) {
            d(i, responseCallback);
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: ccd
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.a(i, responseCallback);
                }
            });
        }
    }

    /* synthetic */ void a(final int i, final ResponseCallback responseCallback) {
        bwk.d().c(i, 1, new IBaseResponseCallback() { // from class: ccf
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i2, Object obj) {
                this.e.d(responseCallback, i, i2, obj);
            }
        });
    }

    /* synthetic */ void d(ResponseCallback responseCallback, int i, int i2, Object obj) {
        LogUtil.a("HL_ChallengeH5Utils", "updateChallenge errorCode ", Integer.valueOf(i2), " objData ", obj);
        if (i2 == -1 || ((obj instanceof bwi) && ((bwi) obj).b() != 0)) {
            responseCallback.onResponse(i2, BaseApplication.b().getResources().getString(com.huawei.basichealthmodel.R.string.IDS_health_model_edit_error));
        } else {
            d(i, (ResponseCallback<String>) responseCallback);
        }
    }

    private void d(int i, ResponseCallback<String> responseCallback) {
        String strValueOf;
        String strC = ccy.c("health_model_challenge_id");
        int iJ = CommonUtil.j(ccy.c("health_model_current_challenge_join_time"));
        ccy.d("health_model_challenge_id", String.valueOf(i));
        ccy.d("health_model_challenge_join", String.valueOf(1));
        ccy.d("health_model_first_join_challenge", String.valueOf(1));
        ccy.d("health_model_current_challenge_join_time", String.valueOf(DateFormatUtil.a(this.f1449b)));
        responseCallback.onResponse(0, "");
        if (cbg.z()) {
            bzr.b();
            strC = String.valueOf(1);
            cbg.m(0);
            iJ = 0;
        }
        if (iJ <= 0) {
            strValueOf = "";
        } else {
            strValueOf = String.valueOf(lsl.a(DateFormatUtil.d(iJ), this.f1449b));
        }
        cbk.c("", strValueOf, strC, this.m);
    }
}
