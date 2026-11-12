package defpackage;

import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public class pyb extends pwj {
    @Override // defpackage.pwj, com.huawei.sim.esimhandler.EsimHandler
    public void handle(pxp pxpVar) {
        setContext(pxpVar.f45946b);
        setMsgHandler(pxpVar.f);
        b(pxpVar);
    }

    private void b(final pxp pxpVar) {
        LogUtil.a("CuccThirdGetMobileHandler", "startCuccThirdGetEncryptInfo");
        npz.b().b(pxpVar.j.d, pxpVar.d, new ResultCallback<String>() { // from class: pyb.3
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(String str) {
                if (TextUtils.isEmpty(str)) {
                    LogUtil.a("CuccThirdGetMobileHandler", "data is empty.");
                    xjt.q("data is empty.");
                } else {
                    LogUtil.a("CuccThirdGetMobileHandler", "getCuccMobile data = " + str);
                    pyb.this.c(pxpVar, str);
                }
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                ReleaseLogUtil.a("DEVMGR_CuccThirdGetMobileHandler", "getCuccMobile failed :", ExceptionUtils.c(th));
                pyb.this.mMsgHandler.sendEmptyMessage(100003);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(pxp pxpVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt("resultCode");
            LogUtil.a("CuccThirdGetMobileHandler", "resultCode = ", Integer.valueOf(i));
            if (i == 0) {
                oeg oegVarE = pxk.e(jSONObject.getString("encESimDeviceInfo"));
                LogUtil.d("CuccThirdGetMobileHandler", "eSimDeviceInfo = ", oegVarE);
                pxpVar.e = oegVarE.d();
                pxpVar.f45945a = oegVarE.e();
                super.handle(pxpVar);
                return;
            }
            ReleaseLogUtil.a("DEVMGR_CuccThirdGetMobileHandler", "get mobile failed, resultCode = ", Integer.valueOf(i));
            this.mMsgHandler.sendEmptyMessage(100003);
        } catch (JSONException e) {
            ReleaseLogUtil.a("DEVMGR_CuccThirdGetMobileHandler", "getCuccMobile,JSONException", ExceptionUtils.c(e));
            this.mMsgHandler.sendEmptyMessage(100003);
        }
    }
}
