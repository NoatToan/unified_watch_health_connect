package com.huawei.hwsmartinteractmgr.interactors;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.ActivitySimple;
import com.huawei.hwsmartinteractmgr.data.ContentOrdinaryBgText;
import com.huawei.hwsmartinteractmgr.data.ContentRemindSteps;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import com.huawei.hwsmartinteractmgr.data.SmartMsgDbObject;
import com.huawei.login.ui.login.LoginInit;
import com.tencent.open.apireq.BaseResp;
import defpackage.ltb;
import defpackage.nsv;
import defpackage.ntl;
import health.compact.a.HiDateUtil;
import java.util.Date;

/* JADX INFO: loaded from: classes11.dex */
public class HealthcareInteractors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private nsv f17706a;
    private Context d;

    public HealthcareInteractors(Context context) {
        if (context == null) {
            this.d = BaseApplication.getContext();
        } else {
            this.d = context;
        }
        this.f17706a = nsv.e(this.d);
    }

    public void c(ActivitySimple activitySimple) {
        LogUtil.a("SMART_HealthcareInteractors", "createRemindReachStepsGoalSmartMsg");
        if (activitySimple == null) {
            return;
        }
        SmartMsgDbObject smartMsgDbObjectE = e("ai-walk-002", 10001);
        smartMsgDbObjectE.setMsgContentType(3);
        smartMsgDbObjectE.setMsgContent(HiJsonUtil.e(new ContentRemindSteps(activitySimple.getActivityName(), activitySimple.getTargetValue(), activitySimple.getActivityId(), activitySimple.getActivityStatus(), activitySimple.getLastModifyTime()), ContentRemindSteps.class));
        e(activitySimple, smartMsgDbObjectE);
        SmartMsgDbObject smartMsgDbObjectA = this.f17706a.a(10001);
        if (smartMsgDbObjectA == null) {
            boolean zE = this.f17706a.e(smartMsgDbObjectE);
            long jA = ltb.a();
            d("reach_steps_goal_check_interval", String.valueOf(jA), this.f17706a);
            LogUtil.a("SMART_HealthcareInteractors", "createRemindReachStepsGoalSmartMsg, oldSmartMsg is null, isInserted =", Boolean.valueOf(zE));
            return;
        }
        if (activitySimple.getActivityId() != null) {
            ContentRemindSteps contentRemindSteps = (ContentRemindSteps) HiJsonUtil.d(smartMsgDbObjectA.getMsgContent(), ContentRemindSteps.class);
            if (activitySimple.getActivityId().equals(contentRemindSteps.getActivityId())) {
                LogUtil.a("SMART_HealthcareInteractors", "createRemindReachStepsGoalSmartMsg, same activity");
                if (smartMsgDbObjectA.getStatus() == 3 || !contentRemindSteps.getLastModifyTime().equals(activitySimple.getLastModifyTime()) || d()) {
                    boolean zB = this.f17706a.b(smartMsgDbObjectA.getId(), smartMsgDbObjectE);
                    long jA2 = ltb.a();
                    d("reach_steps_goal_check_interval", String.valueOf(jA2), this.f17706a);
                    LogUtil.a("SMART_HealthcareInteractors", "createRemindReachStepsGoalSmartMsg, MSG_STATUS_EXPIRED, isUpdated=", Boolean.valueOf(zB));
                    return;
                }
                return;
            }
            int iD = this.f17706a.d(10001);
            boolean zE2 = this.f17706a.e(smartMsgDbObjectE);
            long jA3 = ltb.a();
            d("reach_steps_goal_check_interval", String.valueOf(jA3), this.f17706a);
            LogUtil.a("SMART_HealthcareInteractors", "createRemindReachStepsGoalSmartMsg, delResult=", Integer.valueOf(iD), ", isInserted=", Boolean.valueOf(zE2));
        }
    }

    private SmartMsgDbObject e(String str, int i) {
        int iD = ntl.d(30000, str);
        String strC = ntl.c(30000, str);
        SmartMsgDbObject smartMsgDbObject = new SmartMsgDbObject();
        smartMsgDbObject.setMsgType(i);
        smartMsgDbObject.setMsgSrc(1);
        smartMsgDbObject.setShowMethod(SmartMsgConstant.SHOW_METHOD_SMART_CARD_HI_BOARD);
        smartMsgDbObject.setMessagePriority(iD);
        smartMsgDbObject.setShowTime(strC);
        smartMsgDbObject.setStatus(1);
        return smartMsgDbObject;
    }

    public void d(ActivitySimple activitySimple) {
        LogUtil.a("SMART_HealthcareInteractors", "createReachGoalActivitySmartMsg");
        if (activitySimple == null || activitySimple.getActivityPosition() == 5) {
            LogUtil.a("SMART_HealthcareInteractors", "companyActivity no recommend");
            return;
        }
        SmartMsgDbObject smartMsgDbObjectE = e("ai-walk-001", 10000);
        smartMsgDbObjectE.setMsgContentType(2);
        smartMsgDbObjectE.setMsgContent(HiJsonUtil.e(e(activitySimple), ContentOrdinaryBgText.class));
        e(activitySimple, smartMsgDbObjectE);
        SmartMsgDbObject smartMsgDbObjectA = this.f17706a.a(10000);
        if (smartMsgDbObjectA == null) {
            LogUtil.a("SMART_HealthcareInteractors", "createReachGoalActivitySmartMsg, oldSmartMsg is null, isInserted =", Boolean.valueOf(this.f17706a.e(smartMsgDbObjectE)));
            return;
        }
        ContentOrdinaryBgText contentOrdinaryBgText = (ContentOrdinaryBgText) HiJsonUtil.d(smartMsgDbObjectA.getMsgContent(), ContentOrdinaryBgText.class);
        if (activitySimple.getActivityId() != null) {
            if (activitySimple.getActivityId().equals(contentOrdinaryBgText.getSubContent())) {
                if (smartMsgDbObjectA.getStatus() == 3 || !contentOrdinaryBgText.getLastModifyTime().equals(activitySimple.getLastModifyTime())) {
                    this.f17706a.b(smartMsgDbObjectA.getId(), smartMsgDbObjectE);
                    return;
                }
                return;
            }
            LogUtil.a("SMART_HealthcareInteractors", "createReachGoalActivitySmartMsg, delResult=", Integer.valueOf(this.f17706a.d(10000)), ", isInserted=", Boolean.valueOf(this.f17706a.e(smartMsgDbObjectE)));
        }
    }

    private ContentOrdinaryBgText e(ActivitySimple activitySimple) {
        ContentOrdinaryBgText contentOrdinaryBgText = new ContentOrdinaryBgText();
        contentOrdinaryBgText.setContent(activitySimple.getWordDesc());
        contentOrdinaryBgText.setSubContent(activitySimple.getActivityId());
        contentOrdinaryBgText.setMinContent(Integer.toString(activitySimple.getActivityStatus()));
        contentOrdinaryBgText.setLastModifyTime(activitySimple.getLastModifyTime());
        return contentOrdinaryBgText;
    }

    private void e(ActivitySimple activitySimple, SmartMsgDbObject smartMsgDbObject) {
        long jA = HiDateUtil.a(activitySimple.getEndDate());
        if (jA != -1) {
            smartMsgDbObject.setExpireTime(jA);
        }
    }

    private int d(String str, String str2, HwBaseManager hwBaseManager) {
        String accountInfo = LoginInit.getInstance(this.d).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            LogUtil.j("SMART_HealthcareInteractors", "get user failed!");
            return BaseResp.CODE_UNSUPPORTED_BRANCH;
        }
        return hwBaseManager.setSharedPreference(accountInfo + str, str2, null);
    }

    private String c(String str, HwBaseManager hwBaseManager) {
        String accountInfo = LoginInit.getInstance(this.d).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            LogUtil.j("SMART_HealthcareInteractors", "get user failed!");
            return null;
        }
        return hwBaseManager.getSharedPreference(accountInfo + str);
    }

    private boolean d() {
        long j;
        String strC = c("reach_steps_goal_check_interval", this.f17706a);
        if (TextUtils.isEmpty(strC)) {
            return true;
        }
        try {
            j = Long.parseLong(strC);
        } catch (NumberFormatException e) {
            LogUtil.e("SMART_HealthcareInteractors", "NumberFormatException:", e.getMessage());
            j = 0;
        }
        return !ltb.ac(new Date(j * 1000));
    }
}
