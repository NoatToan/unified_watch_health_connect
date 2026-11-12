package defpackage;

import android.content.Context;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import com.huawei.hwsmartinteractmgr.data.SmartMsgDbObject;
import com.huawei.hwsmartinteractmgr.smarter.BaseSmarter;
import com.huawei.hwsmartinteractmgr.smarter.BloodPressureSmarter;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class nsz extends BaseSmarter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private nsv f43632a;

    private nsz() {
        super(BaseApplication.getContext());
        this.f43632a = nsv.e(this.f17713c);
    }

    static class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final nsz f43635c = new nsz();
    }

    public static nsz e() {
        return e.f43635c;
    }

    @Override // com.huawei.hwsmartinteractmgr.smarter.BaseSmarter
    public void b() {
        super.b();
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, String str) {
        boolean zE;
        SmartMsgDbObject smartMsgDbObject = new SmartMsgDbObject();
        smartMsgDbObject.setMsgType(SmartMsgConstant.MSG_TYPE_TOLD_USER_MEASURE_BLOOD_SUGAR);
        smartMsgDbObject.setMsgSrc(7);
        a(smartMsgDbObject, str, i, SmartMsgConstant.SHOW_METHOD_SMART_CARD);
        smartMsgDbObject.setMessagePriority(ntl.d(30006, "ai-bloodsg-002"));
        SmartMsgDbObject smartMsgDbObjectA = this.f43632a.a(SmartMsgConstant.MSG_TYPE_TOLD_USER_MEASURE_BLOOD_SUGAR);
        if (smartMsgDbObjectA == null) {
            zE = this.f43632a.e(smartMsgDbObject);
        } else {
            long updateTime = smartMsgDbObjectA.getUpdateTime();
            LogUtil.a("SMART_BloodSugarSmarter", "setMeasureMsg createTime = ", new Date(updateTime));
            if (System.currentTimeMillis() - updateTime > ((long) i) * 86400000) {
                this.f43632a.d(SmartMsgConstant.MSG_TYPE_TOLD_USER_MEASURE_BLOOD_SUGAR);
                zE = this.f43632a.e(smartMsgDbObject);
            } else {
                zE = false;
            }
        }
        LogUtil.a("SMART_BloodSugarSmarter", "setMeasureMsg isInserted = ", Boolean.valueOf(zE));
    }

    public void d() {
        boolean zA = ntl.a(30006, "ai-bloodsg-002");
        LogUtil.a("SMART_BloodSugarSmarter", "setOrDeleteMeasureMsg isRuleOpen = ", Boolean.valueOf(zA));
        final int i = 3;
        if (zA && b(this.f17713c)) {
            String strC = ntl.c(30006, "ai-bloodsg-002", "recently_num_days_no_data");
            String strC2 = ntl.c(30006, "ai-bloodsg-002", "recommended_time");
            LogUtil.a("SMART_BloodSugarSmarter", "setOrDeleteMeasureMsg recommendTime = ", strC2, "dayStr", strC);
            final String strA = BloodPressureSmarter.a(strC2);
            try {
                i = Integer.parseInt(strC);
            } catch (NumberFormatException e2) {
                LogUtil.e("SMART_BloodSugarSmarter", "setOrDeleteMeasureMsg NumberFormatException exception = ", e2.getMessage());
            }
            LogUtil.a("SMART_BloodSugarSmarter", "setOrDeleteMeasureMsg day = ", Integer.valueOf(i));
            b(this.f17713c, i, new CommonUiBaseResponse() { // from class: nsz.2
                @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
                public void onResponse(int i2, Object obj) {
                    LogUtil.a("SMART_BloodSugarSmarter", "setOrDeleteMeasureMsg hasBloodSugarData errCode = ", Integer.valueOf(i2));
                    if (i2 == 100001) {
                        nsz.this.e(i, strA);
                    } else {
                        ntl.d(nsz.this.f17713c, SmartMsgConstant.MSG_TYPE_TOLD_USER_MEASURE_BLOOD_SUGAR, 3);
                    }
                }
            });
            return;
        }
        ntl.d(this.f17713c, SmartMsgConstant.MSG_TYPE_TOLD_USER_MEASURE_BLOOD_SUGAR, 3);
    }

    private void b(Context context, int i, final CommonUiBaseResponse commonUiBaseResponse) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        nkb.d().b(context, jCurrentTimeMillis - (((long) i) * 86400000), jCurrentTimeMillis, 1, new IBaseResponseCallback() { // from class: nsz.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                if (obj instanceof List) {
                    if (((List) obj).isEmpty()) {
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

    private static boolean b(Context context) {
        return ntl.a(context, "HDK_BLOOD_SUGAR") > 0;
    }
}
