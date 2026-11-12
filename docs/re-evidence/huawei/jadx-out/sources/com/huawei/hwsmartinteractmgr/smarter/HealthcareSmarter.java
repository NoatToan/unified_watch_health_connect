package com.huawei.hwsmartinteractmgr.smarter;

import android.content.Context;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.ActivitySimple;
import com.huawei.hwsmartinteractmgr.interactors.HealthcareInteractors;
import com.huawei.hwsmartinteractmgr.smarthttpmodel.SmartHttpCallback;
import com.huawei.hwsmartinteractmgr.userlabel.LabelObserver;
import com.huawei.operation.utils.PhoneInfoUtils;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;
import com.huawei.ui.thirdpartservice.syncdata.constants.SyncDataConstant;
import defpackage.nss;
import defpackage.ntc;
import defpackage.nti;
import defpackage.ntl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes11.dex */
public class HealthcareSmarter extends BaseSmarter implements LabelObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthcareInteractors f17719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ExecutorService f17720b;
    private final ntc e;

    public HealthcareSmarter(Context context) {
        super(context);
        this.f17720b = Executors.newCachedThreadPool();
        this.e = ntc.c();
        this.f17719a = new HealthcareInteractors(this.f17713c);
    }

    @Override // com.huawei.hwsmartinteractmgr.smarter.BaseSmarter
    public void b() {
        super.b();
        LogUtil.a("SMART_HealthcareSmarter", "startTimerCheck");
        if (!ntl.a(this.f17713c, "last_checktime_healthcare_by_timer", 86400000L)) {
            LogUtil.a("SMART_HealthcareSmarter", "startTimerCheck, checkInterval fail, return");
        } else {
            ntl.d(this.f17713c, "last_checktime_healthcare_by_timer", System.currentTimeMillis());
            e();
        }
    }

    public void d() {
        LogUtil.a("SMART_HealthcareSmarter", "startRuleByUser");
        if (!ntl.a(this.f17713c, "last_checktime_healthcare_by_user", 300000L)) {
            LogUtil.a("SMART_HealthcareSmarter", "startRuleByUser, checkInterval fail, return");
        } else {
            ntl.d(this.f17713c, "last_checktime_healthcare_by_user", System.currentTimeMillis());
            e();
        }
    }

    private void e() {
        this.f17720b.execute(new Runnable() { // from class: com.huawei.hwsmartinteractmgr.smarter.HealthcareSmarter.5
            @Override // java.lang.Runnable
            public void run() {
                HealthcareSmarter.this.c();
                HealthcareSmarter.this.a();
            }
        });
    }

    @Override // com.huawei.hwsmartinteractmgr.userlabel.LabelObserver
    public void onChange(final Map<Integer, List<String>> map) {
        if (map == null) {
            return;
        }
        this.f17720b.execute(new Runnable() { // from class: com.huawei.hwsmartinteractmgr.smarter.HealthcareSmarter.4
            @Override // java.lang.Runnable
            public void run() {
                List list = (List) map.get(1);
                List list2 = (List) map.get(2);
                boolean z = list != null && list.contains("SportStep_1");
                boolean z2 = list2 != null && list2.contains("SportStep_1");
                if (z || z2) {
                    HealthcareSmarter.this.c();
                    HealthcareSmarter.this.a();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        LogUtil.a("SMART_HealthcareSmarter", "recommendReachGoalActivity");
        if (!a("recommend_standard_activity", 30000, "ai-walk-001")) {
            ntl.d(this.f17713c, 10000, 3);
            LogUtil.a("SMART_HealthcareSmarter", "not recommend, return");
        } else if (!nss.j()) {
            ntl.d(this.f17713c, 10000, 3);
            LogUtil.a("SMART_HealthcareSmarter", "no sportStepLittle label, return");
        } else {
            c("0", new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        LogUtil.a("SMART_HealthcareSmarter", "remindReachStepsGoal");
        if (!a("standard_activity_steps_target", 30000, "ai-walk-002")) {
            ntl.d(this.f17713c, 10001, 3);
            LogUtil.a("SMART_HealthcareSmarter", "not recommend, return");
        } else {
            c("1", new e());
        }
    }

    private void c(String str, SmartHttpCallback<List<ActivitySimple>> smartHttpCallback) {
        LogUtil.a("SMART_HealthcareSmarter", "requestActivities, joinStatus=", str);
        HashMap map = new HashMap(8);
        map.put("joinStatus", str);
        map.put("finishFlag", "1");
        map.put(SyncDataConstant.BI_KEY_ACTIVITY_TYPE, "11");
        map.put("pageNo", "0");
        map.put(IAchieveDBMgr.PARAM_PAGE_SIZE, "50");
        map.put("phoneType", PhoneInfoUtils.getPhoneType());
        this.e.e(0, new nti(0));
        this.e.e(0, map, smartHttpCallback);
    }

    class b extends SmartHttpCallback<List<ActivitySimple>> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.hwsmartinteractmgr.smarthttpmodel.SmartHttpCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean shouldTrigger(List<ActivitySimple> list) {
            return true;
        }

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.hwsmartinteractmgr.smarthttpmodel.SmartHttpCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean isHandleResponse(int i, List<ActivitySimple> list) {
            return HealthcareSmarter.this.e(i, list);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.hwsmartinteractmgr.smarthttpmodel.SmartHttpCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void goTrigger(List<ActivitySimple> list) {
            if (list != null) {
                LogUtil.a("SMART_HealthcareSmarter", "RequestStepsGoalActivityCallback.goTrigger, activities.size()=", Integer.valueOf(list.size()));
                if (list.isEmpty()) {
                    ntl.d(HealthcareSmarter.this.f17713c, 10000, 3);
                } else {
                    HealthcareSmarter.this.f17719a.d(list.get(0));
                }
            }
        }
    }

    class e extends SmartHttpCallback<List<ActivitySimple>> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.hwsmartinteractmgr.smarthttpmodel.SmartHttpCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean shouldTrigger(List<ActivitySimple> list) {
            return true;
        }

        private e() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.hwsmartinteractmgr.smarthttpmodel.SmartHttpCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean isHandleResponse(int i, List<ActivitySimple> list) {
            return HealthcareSmarter.this.e(i, list);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.hwsmartinteractmgr.smarthttpmodel.SmartHttpCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void goTrigger(List<ActivitySimple> list) {
            if (list != null) {
                LogUtil.a("SMART_HealthcareSmarter", "RequestJoinActivityCallback, goTrigger, activities.size()=", Integer.valueOf(list.size()));
                if (list.isEmpty()) {
                    ntl.d(HealthcareSmarter.this.f17713c, 10001, 3);
                    return;
                }
                for (ActivitySimple activitySimple : list) {
                    if (activitySimple.getActivityStatus() == 0) {
                        LogUtil.d("SMART_HealthcareSmarter", "not completed activity");
                        HealthcareSmarter.this.f17719a.c(activitySimple);
                        return;
                    }
                }
                ntl.d(HealthcareSmarter.this.f17713c, 10001, 3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(int i, Object obj) {
        boolean z = obj == null;
        if (i != 0 && i != 8 && i != -1001) {
            z = true;
        }
        LogUtil.a("SMART_HealthcareSmarter", "errCode = ", Integer.valueOf(i), " isError is ", Boolean.valueOf(z));
        return !z;
    }
}
