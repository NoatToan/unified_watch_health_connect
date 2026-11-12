package defpackage;

import android.content.Context;
import android.os.Handler;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.main.api.WeChatApi;
import com.huawei.hmf.annotation.ApiDefine;

/* JADX INFO: loaded from: classes43.dex */
@ApiDefine(uri = WeChatApi.class)
public class wsc implements WeChatApi {
    @Override // com.huawei.health.main.api.WeChatApi
    public void showSportPrivacySettingDialog(Context context, int i) {
        wss.d(context, i);
    }

    @Override // com.huawei.health.main.api.WeChatApi
    public boolean isUserBind(Context context) {
        return wss.d(context).b(context);
    }

    @Override // com.huawei.health.main.api.WeChatApi
    public void jumpWechatHelp(Context context) {
        wss.e(context);
    }

    @Override // com.huawei.health.main.api.WeChatApi
    public void showDeviceAlreadyBinded(Context context) {
        wss.d(context).i(context);
    }

    @Override // com.huawei.health.main.api.WeChatApi
    public void setWeChatHandler(Handler handler) {
        wss.d(BaseApplication.b()).a(handler);
    }

    @Override // com.huawei.health.main.api.WeChatApi
    public void go2WeChatHandle(Context context) {
        wss.d(BaseApplication.b()).a(context);
    }

    @Override // com.huawei.health.main.api.WeChatApi
    public String isUserBinded(Context context) {
        return wss.d(BaseApplication.b()).c(context);
    }

    @Override // com.huawei.health.main.api.WeChatApi
    public void dismissJumpToHwPublicDialog() {
        wss.d(BaseApplication.b()).a();
    }

    @Override // com.huawei.health.main.api.WeChatApi
    public void launchWxMiniProgram(String str, String str2, int i) {
        wss.d(BaseApplication.b()).a(str, str2, i);
    }
}
