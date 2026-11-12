package com.huawei.hwsmartinteractmgr.smarter;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.ContentOrdinaryBgText;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import com.huawei.hwsmartinteractmgr.data.SmartMsgDbObject;
import com.huawei.login.ui.login.AccountConstants;
import com.huawei.login.ui.login.LoginInit;
import defpackage.lsy;
import defpackage.nsv;
import defpackage.ntl;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class AbnormalSmarter extends BaseSmarter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f17710a;
    private nsv d;
    private HiUserInfo e;

    public AbnormalSmarter(Context context) {
        super(context);
        this.f17710a = context;
        this.d = nsv.e(context);
    }

    @Override // com.huawei.hwsmartinteractmgr.smarter.BaseSmarter
    public void b() {
        long j;
        int i;
        super.b();
        String strE = SharedPreferenceManager.e(this.f17710a, Integer.toString(10021), "abnoral_information");
        boolean zA = ntl.a(30004, "ai-exception-001");
        String strE2 = SharedPreferenceManager.e(this.f17710a, Integer.toString(10000), "onboarding_skip");
        LogUtil.a("UIDV_AbnormalSmarter", "isNoLongerRecommend = ", strE, ", isEnable = ", Boolean.valueOf(zA), ", isSetOnBoarding = ", strE2);
        if ("1".equals(strE) || !zA || "1".equals(strE2)) {
            LogUtil.a("UIDV_AbnormalSmarter", "AbnormalSmarter no recommend delete");
            nsv.e(this.f17710a).d(60000);
            return;
        }
        String strE3 = SharedPreferenceManager.e(this.f17710a, Integer.toString(10000), "onboarding_skip_current_time");
        if (TextUtils.isEmpty(strE3)) {
            j = 0;
        } else {
            try {
                j = Long.parseLong(strE3);
            } catch (NumberFormatException e) {
                LogUtil.e("UIDV_AbnormalSmarter", "NumberFormatException = ", e.getMessage());
                j = 0;
            }
        }
        if (j != 0) {
            String strC = ntl.c(30004, "ai-exception-001", "after_num_date_generate_exception_prompt");
            if (TextUtils.isEmpty(strC)) {
                i = 7;
            } else {
                try {
                    i = Integer.parseInt(strC);
                } catch (NumberFormatException e2) {
                    LogUtil.e("UIDV_AbnormalSmarter", "NumberFormatException = ", e2.getMessage());
                    i = 7;
                }
            }
            LogUtil.a("UIDV_AbnormalSmarter", "day = ", strC, " skipDay = ", Integer.valueOf(i));
            if ((System.currentTimeMillis() - j) / 8.64E7f > i) {
                d();
                return;
            }
            return;
        }
        LogUtil.a("UIDV_AbnormalSmarter", "no onBoarding skipTime == 0");
    }

    private void d() {
        e();
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        LogUtil.a("UIDV_AbnormalSmarter", "setAbnormalInfo");
        lsy.a(new Runnable() { // from class: com.huawei.hwsmartinteractmgr.smarter.AbnormalSmarter.2
            @Override // java.lang.Runnable
            public void run() {
                if (nsv.e(AbnormalSmarter.this.f17710a).a(60000) != null) {
                    LogUtil.a("UIDV_AbnormalSmarter", "had AbnormalInfo");
                    return;
                }
                SmartMsgDbObject smartMsgDbObject = new SmartMsgDbObject();
                smartMsgDbObject.setMsgType(60000);
                smartMsgDbObject.setMsgSrc(6);
                smartMsgDbObject.setMsgContentType(2);
                smartMsgDbObject.setMsgContent(HiJsonUtil.e(new ContentOrdinaryBgText(), ContentOrdinaryBgText.class));
                smartMsgDbObject.setShowMethod(SmartMsgConstant.SHOW_METHOD_SMART_CARD_HI_BOARD);
                smartMsgDbObject.setShowTime(SmartMsgConstant.DEFAULT_SHOW_TIME);
                smartMsgDbObject.setStatus(1);
                smartMsgDbObject.setMessagePriority(2);
                AbnormalSmarter.this.d.e(smartMsgDbObject);
            }
        });
        SharedPreferenceManager.e(this.f17710a, Integer.toString(10000), "onboarding_skip_current_time", Integer.toString(0), new StorageParams());
    }

    private void e() {
        LogUtil.a("UIDV_AbnormalSmarter", "getAccountInfo");
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1006);
        String accountInfo2 = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1005);
        if (TextUtils.isEmpty(accountInfo)) {
            LogUtil.a("UIDV_AbnormalSmarter", "enter set by birthDate");
            a();
        }
        if ("0".equals(accountInfo2) || "1".equals(accountInfo2)) {
            return;
        }
        LogUtil.a("UIDV_AbnormalSmarter", "enter set by gender");
        a();
    }

    private void c() {
        HiHealthManager.d(this.f17710a).fetchUserData(new HiCommonListener() { // from class: com.huawei.hwsmartinteractmgr.smarter.AbnormalSmarter.3
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                if (obj instanceof List) {
                    List list = (List) obj;
                    if (list.isEmpty()) {
                        return;
                    }
                    LogUtil.a("UIDV_AbnormalSmarter", "fetchUserData onSuccess");
                    AbnormalSmarter.this.e = (HiUserInfo) list.get(0);
                    if (!AbnormalSmarter.this.e.isHeightValid() && !AbnormalSmarter.this.e.isWeightValid()) {
                        LogUtil.a("UIDV_AbnormalSmarter", "enter set by height & weight");
                        AbnormalSmarter.this.a();
                    }
                    if ("1".equals(SharedPreferenceManager.e(AbnormalSmarter.this.f17710a, Integer.toString(10000), AccountConstants.HEALTH_APP_THIRD_LOGIN))) {
                        LogUtil.a("UIDV_AbnormalSmarter", "third");
                        if (AbnormalSmarter.this.e.getGender() != 1 && AbnormalSmarter.this.e.getGender() != 0) {
                            LogUtil.a("UIDV_AbnormalSmarter", "enter set by gender");
                            AbnormalSmarter.this.a();
                        }
                        if (AbnormalSmarter.this.e.isBirthdayValid()) {
                            return;
                        }
                        LogUtil.a("UIDV_AbnormalSmarter", "enter set by birthday");
                        AbnormalSmarter.this.a();
                    }
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                LogUtil.e("UIDV_AbnormalSmarter", "fetchUserData onFailure");
            }
        });
    }
}
