package com.huami.watch.companion.jsbridge;

import android.content.Context;
import com.google.gson.Gson;
import com.huami.assistant.dataexchange.ExchangeCenter;
import com.huami.midong.webview.event.JsNavigateEvent;
import com.huami.midong.webview.jsbridge.JsBridgeError;
import com.huami.midong.webview.nativejsapi.IJsBridgeCallback;
import com.huami.midong.webview.nativejsapi.apis.JsGetUserTokenFunc;
import com.huami.midong.webview.nativejsapi.apis.JsPushDeviceNoticeFunc;
import com.huami.midong.webview.nativejsapi.jsshare.JSShareCreator;
import com.huami.passport.AccountManager;
import com.huami.watch.companion.account.Account;
import com.huami.watch.companion.account.UserInfo;
import com.huami.watch.companion.account.UserInfoManager;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.initial.InitialState;
import com.huami.watch.companion.sync.SyncUtil;
import com.huami.watch.util.Log;
import com.huami.watch.util.RxBus;
import com.xiaomi.hm.health.relation.cloud.WebAPI;
import java.util.HashMap;

/* JADX INFO: loaded from: classes16.dex */
public class JsBridgeCallback implements IJsBridgeCallback {
    private static final String b = "JsBridgeCallback";
    private Context a;

    public JsBridgeCallback(Context context) {
        this.a = context;
    }

    @Override // com.huami.midong.webview.nativejsapi.IJsBridgeCallback
    public long cancelDeviceNotice(JsPushDeviceNoticeFunc.Reminders reminders) {
        if (!DeviceManager.getManager(this.a).isBoundDeviceConnected()) {
            return JsBridgeError.ERR_CODE_MISS_CONNECT;
        }
        if (!DeviceUtil.isRomSupportWorldCup(this.a)) {
            return JsBridgeError.ERR_CODE_ROM_VERSION_LOW;
        }
        if (ExchangeCenter.deleteEvent(String.valueOf(reminders.getId())).isSuccess()) {
            return 1L;
        }
        return JsBridgeError.ERR_CODE_MISS_CONNECT;
    }

    @Override // com.huami.midong.webview.nativejsapi.IJsBridgeCallback
    public void doShare(JSShareCreator.Content content) {
    }

    @Override // com.huami.midong.webview.nativejsapi.IJsBridgeCallback
    public void exitWeb(boolean z) {
        Log.d(b, "jsbridge web view exit with syncUserInfo:" + z, new Object[0]);
        if (z) {
            SyncUtil.syncUserInfoFromCloudAsync(this.a);
        }
    }

    @Override // com.huami.midong.webview.nativejsapi.IJsBridgeCallback
    public String getUserInfo(Context context) {
        if (InitialState.isNeedLogin()) {
            return "";
        }
        UserInfo userInfo = UserInfoManager.get();
        HashMap map = new HashMap();
        map.put("uid", Account.getUID(context));
        map.put("openType", AccountManager.getDefault(context).getProvider());
        map.put(WebAPI.PARAM_SHARE_INVITE_AVATAR, userInfo.getAvatar());
        map.put("nickname", userInfo.getNickname());
        map.put("gender", Integer.valueOf(userInfo.getGender()));
        map.put("birthday", userInfo.getBirthday().format());
        map.put("height", Integer.valueOf(userInfo.getHeight()));
        map.put("weight", Float.valueOf(userInfo.getWeight()));
        return new Gson().toJson(map);
    }

    @Override // com.huami.midong.webview.nativejsapi.IJsBridgeCallback
    public JsGetUserTokenFunc.LoginInfo getUserToken() {
        JsGetUserTokenFunc.LoginInfo loginInfo = new JsGetUserTokenFunc.LoginInfo();
        AccountManager accountManager = AccountManager.getDefault(this.a);
        loginInfo.setUid(accountManager.getToken().getUid());
        loginInfo.setType(JsGetUserTokenFunc.LoginInfo.convertType(null));
        loginInfo.setOpenId("");
        loginInfo.setToken(accountManager.getToken().getAccessToken());
        return loginInfo;
    }

    @Override // com.huami.midong.webview.nativejsapi.IJsBridgeCallback
    public String navigateTo(String str) {
        RxBus.get().post(new JsNavigateEvent(str));
        return "";
    }

    @Override // com.huami.midong.webview.nativejsapi.IJsBridgeCallback
    public long pushDeviceNotice(JsPushDeviceNoticeFunc.Notice notice, JsPushDeviceNoticeFunc.Reminders reminders, long j, long j2) {
        if (!DeviceManager.getManager(this.a).isBoundDeviceConnected()) {
            return JsBridgeError.ERR_CODE_MISS_CONNECT;
        }
        if (DeviceUtil.isRomSupportWorldCup(this.a)) {
            throw null;
        }
        return JsBridgeError.ERR_CODE_ROM_VERSION_LOW;
    }
}
