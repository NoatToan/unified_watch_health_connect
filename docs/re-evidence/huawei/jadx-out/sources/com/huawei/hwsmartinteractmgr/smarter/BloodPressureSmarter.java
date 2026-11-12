package com.huawei.hwsmartinteractmgr.smarter;

import android.content.Context;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import com.huawei.hwsmartinteractmgr.data.SmartMsgDbObject;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import defpackage.nkb;
import defpackage.nsv;
import defpackage.nsy;
import defpackage.ntl;
import health.compact.a.SharedPreferenceManager;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class BloodPressureSmarter extends BaseSmarter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private nsy f17714a;
    private nsv e;

    public BloodPressureSmarter(Context context) {
        super(context);
        this.f17714a = nsy.a(this.f17713c);
        this.e = nsv.e(this.f17713c);
    }

    @Override // com.huawei.hwsmartinteractmgr.smarter.BaseSmarter
    public void b() {
        LogUtil.a("SMART_BloodPressSmarter", "startTimerCheck");
        super.b();
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, String str) {
        boolean zE;
        SmartMsgDbObject smartMsgDbObject = new SmartMsgDbObject();
        smartMsgDbObject.setMsgType(30001);
        smartMsgDbObject.setMsgSrc(3);
        a(smartMsgDbObject, str, i, SmartMsgConstant.SHOW_METHOD_SMART_CARD_HI_BOARD);
        smartMsgDbObject.setMessagePriority(ntl.d(30002, "ai-bloodp-002"));
        SmartMsgDbObject smartMsgDbObjectA = this.e.a(30001);
        if (smartMsgDbObjectA == null) {
            zE = this.e.e(smartMsgDbObject);
        } else {
            long updateTime = smartMsgDbObjectA.getUpdateTime();
            LogUtil.a("SMART_BloodPressSmarter", "setMeasureMsg createTime = ", new Date(updateTime));
            if (System.currentTimeMillis() - updateTime > ((long) i) * 86400000) {
                this.e.d(30001);
                zE = this.e.e(smartMsgDbObject);
            } else {
                zE = false;
            }
        }
        LogUtil.a("SMART_BloodPressSmarter", "setMeasureMsg isInserted = ", Boolean.valueOf(zE));
    }

    private void a() {
        final int i;
        LogUtil.a("SMART_BloodPressSmarter", "setOrDeleteMeasureMsg");
        boolean zA = this.f17714a.a(6);
        String strE = SharedPreferenceManager.e(this.f17713c, Integer.toString(10021), "telled_user_measure_blood_pressure");
        boolean zA2 = ntl.a(30002, "ai-bloodp-002");
        LogUtil.d("SMART_BloodPressSmarter", "setOrDeleteMeasureMsg isRuleOpen = ", Boolean.valueOf(zA2), "isFollowBloodPress = ", Boolean.valueOf(zA));
        if (zA2 && !"1".equals(strE)) {
            if (c(this.f17713c)) {
                String strC = ntl.c(30002, "ai-bloodp-002", "recently_num_days_no_data");
                String strC2 = ntl.c(30002, "ai-bloodp-002", "recommended_time");
                LogUtil.a("SMART_BloodPressSmarter", "setOrDeleteMeasureMsg recommendTime = ", strC2);
                final String strA = a(strC2);
                try {
                    i = Integer.parseInt(strC);
                } catch (NumberFormatException e) {
                    LogUtil.e("SMART_BloodPressSmarter", "setOrDeleteMeasureMsg NumberFormatException = ", e.getMessage());
                    i = 0;
                }
                e(i, new CommonUiBaseResponse() { // from class: com.huawei.hwsmartinteractmgr.smarter.BloodPressureSmarter.1
                    @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
                    public void onResponse(int i2, Object obj) {
                        LogUtil.a("SMART_BloodPressSmarter", "setOrDeleteMeasureMsg hasBloodPressureData errCode = ", Integer.valueOf(i2));
                        if (i2 == 100001) {
                            BloodPressureSmarter.this.d(i, strA);
                        } else {
                            ntl.d(BloodPressureSmarter.this.f17713c, 30001, 3);
                        }
                    }
                });
                return;
            }
            ntl.d(this.f17713c, 30001, 3);
            return;
        }
        ntl.d(this.f17713c, 30001, 3);
    }

    private void e(int i, final CommonUiBaseResponse commonUiBaseResponse) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        nkb.d().d(jCurrentTimeMillis - (((long) i) * 86400000), jCurrentTimeMillis, 0, new IBaseResponseCallback() { // from class: com.huawei.hwsmartinteractmgr.smarter.BloodPressureSmarter.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                if (obj instanceof List) {
                    if (((List) obj).size() <= 0) {
                        commonUiBaseResponse.onResponse(100001, null);
                        return;
                    } else {
                        commonUiBaseResponse.onResponse(0, null);
                        return;
                    }
                }
                commonUiBaseResponse.onResponse(100001, null);
            }
        });
    }

    private static boolean c(Context context) {
        return context != null && ntl.a(context, "HDK_BLOOD_PRESSURE") > 0;
    }
}
