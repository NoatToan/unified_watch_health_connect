package com.chinaums.pppay.unify;

import android.content.Context;
import com.miui.tsmclient.net.IAuthClient;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class WeixinPayHandler implements WXPayResultListener {
    private WeakReference<Context> mContext;

    public WeixinPayHandler(Context context) {
        this.mContext = new WeakReference<>(context);
    }

    private String getUnifyErrCode(int i) {
        if (i == -3) {
            return UnifyPayListener.ERR_SENT_FAILED;
        }
        if (i != -2) {
            return i != 0 ? UnifyPayListener.ERR_COMM : UnifyPayListener.ERR_OK;
        }
        return UnifyPayListener.ERR_USER_CANCEL;
    }

    public void detach() {
        this.mContext = null;
        System.gc();
    }

    @Override // com.chinaums.pppay.unify.WXPayResultListener
    public void onResponse(Context context, BaseResp baseResp) {
        String string;
        String string2;
        String json = UnifyUtils.toJson(baseResp, BaseResp.class);
        try {
            JSONObject jSONObject = new JSONObject(((WXLaunchMiniProgram.Resp) baseResp).extMsg);
            string = jSONObject.getString(IAuthClient.KEY_ERR_CODE);
            try {
                string2 = jSONObject.getString("errStr");
            } catch (JSONException e) {
                e = e;
                e.printStackTrace();
                string2 = null;
            }
        } catch (JSONException e2) {
            e = e2;
            string = null;
        }
        if (UnifyPayPlugin.getInstance(this.mContext.get()).getListener() != null) {
            UnifyPayPlugin.getInstance(this.mContext.get()).getListener().onResult(string, UnifyUtils.createResultInfo(string2, null, json));
        }
    }

    public void setListener(UnifyPayListener unifyPayListener) {
    }
}
