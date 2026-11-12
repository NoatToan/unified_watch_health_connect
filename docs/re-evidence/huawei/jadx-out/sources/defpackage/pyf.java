package defpackage;

import com.huawei.haf.common.exception.ExceptionUtils;
import com.unicom.online.account.shield.ResultListener;
import com.unicom.online.account.shield.UniAccountHelper;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public class pyf extends pwj {
    @Override // defpackage.pwj, com.huawei.sim.esimhandler.EsimHandler
    public void handle(final pxp pxpVar) {
        setContext(pxpVar.f45946b);
        setMsgHandler(pxpVar.f);
        try {
            UniAccountHelper.getInstance().cuGetToken(10000, new ResultListener() { // from class: pyc
                @Override // com.unicom.online.account.shield.ResultListener
                public final void onResult(String str) {
                    this.d.b(pxpVar, str);
                }
            });
        } catch (Exception e) {
            ReleaseLogUtil.a("DEVMGR_CuccThirdGetTokenHandler", "cuGetToken Exception:", ExceptionUtils.c(e));
            this.mMsgHandler.sendEmptyMessage(100003);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void b(pxp pxpVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("resultCode");
            if (!"100".equals(strOptString)) {
                ReleaseLogUtil.a("DEVMGR_CuccThirdGetTokenHandler", "cuccGetTokenResult failed, resultCode = ", strOptString);
                this.mMsgHandler.sendEmptyMessage(100003);
            } else {
                JSONObject jSONObject2 = new JSONObject(jSONObject.optString("resultData"));
                pxpVar.d = jSONObject2.optString("accessCode");
                pxpVar.g = jSONObject2.optString("fakeMobile");
                super.handle(pxpVar);
            }
        } catch (JSONException e) {
            ReleaseLogUtil.a("DEVMGR_CuccThirdGetTokenHandler", "cuccUniAccountGetToken JSONException:", ExceptionUtils.c(e));
            this.mMsgHandler.sendEmptyMessage(100003);
        }
    }
}
