package com.mibi.sdk.channel.alipay;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.chinaums.pppay.unify.UnifyPayListener;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.common.LocalBroadcastManager;
import com.mibi.sdk.common.utils.MibiLog;
import com.mibi.sdk.common.utils.UiUtil;
import com.miui.tsmclient.net.IAuthClient;

/* JADX INFO: loaded from: classes5.dex */
public class AlipayMiniProgramCallbackActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f10095a = "AlipayMiniProgramCallbackActivity";

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        String message;
        String queryParameter;
        super.onCreate(bundle);
        String str = f10095a;
        MibiLog.d(str, "onCreate");
        try {
            Uri data = getIntent().getData();
            queryParameter = data.getQueryParameter(IAuthClient.KEY_ERR_CODE);
            message = data.getQueryParameter("errStr");
            MibiLog.d(str, "ali mini program pay result code :  " + queryParameter + " ; desc : " + message);
        } catch (Exception e) {
            MibiLog.d(f10095a, "parse ali mini program pay result failed : " + e.getMessage());
            message = e.getMessage();
            queryParameter = UnifyPayListener.ERR_PAY_FAIL;
        }
        Intent intent = new Intent("com.mibi.sdk.action.RECEIVE_ALIPAY_RESULT");
        intent.putExtra(CommonConstants.KEY_ERR_CODE, queryParameter);
        intent.putExtra("errDesc", message);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        UiUtil.moveToFront(this, UiUtil.getTaskId());
        finish();
    }
}
