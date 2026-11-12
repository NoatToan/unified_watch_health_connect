package defpackage;

import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.haf.handler.BaseHandlerCallback;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.device.wifi.interfaces.CommBaseCallbackInterface;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.unite.AuthorizeSubUserInfo;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetAuthorizeSubUserReq;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetAuthorizeSubUserRsp;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public class eao {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile eao f32603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f32604c = new Object();
    private final ExtendHandler d = HandlerCenter.b(new d(this), "Inquire_Subuser");

    private eao() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Message message) {
        dyg.a(false, "InquireAuthUserHandler", "sendPushMsg in");
        Bundle data = message.getData();
        if (data == null) {
            LogUtil.e("InquireAuthUserHandler", "sendPushMsg data is null.");
            return;
        }
        String string = data.getString("deviceid");
        String string2 = data.getString("account");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            dyg.d(false, "InquireAuthUserHandler", "sendPushMsg device is null or account is null");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("pushType", "auth_success");
        bundle.putString("pushContent", string2);
        bundle.putString("deviceId", string);
        EventBus.a(new EventBus.d("multi_user_auto_cancle_dialog", bundle));
    }

    public static eao a() {
        if (f32603b == null) {
            synchronized (f32604c) {
                if (f32603b == null) {
                    f32603b = new eao();
                }
            }
        }
        return f32603b;
    }

    static class d extends BaseHandlerCallback<eao> {
        public d(eao eaoVar) {
            super(eaoVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandlerCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean handleMessageWhenReferenceNotNull(eao eaoVar, Message message) {
            LogUtil.a("InquireAuthUserHandler", "msg is ", message);
            switch (message.what) {
                case 1000:
                    eaoVar.b();
                    return true;
                case 1001:
                    if (message.obj != null && (message.obj instanceof String)) {
                        eaoVar.e((String) message.obj, message.arg1);
                        return true;
                    }
                    dyg.d(false, "InquireAuthUserHandler", " handleMessage deviceId is null");
                    return true;
                case 1002:
                default:
                    dyg.a(false, "InquireAuthUserHandler", "unknown Message");
                    return false;
                case 1003:
                    eaoVar.b(message);
                    return true;
                case 1004:
                    eaoVar.c();
                    return true;
            }
        }
    }

    private boolean c(eby ebyVar) {
        eby.d dVarA = ebyVar.a();
        if (dVarA != null) {
            return dVarA.m() == 2;
        }
        LogUtil.j("InquireAuthUserHandler", "isAuthorizedDevice deviceInfo is null:", ebyVar.getProductId());
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        ArrayList<eby> arrayListA = ecf.a();
        if (njy.e(arrayListA)) {
            LogUtil.j("InquireAuthUserHandler", "updateAllDeviceSubUser allDevices is null");
            return;
        }
        for (eby ebyVar : arrayListA) {
            if (!c(ebyVar)) {
                ean.a(ebyVar.e(), new CommBaseCallbackInterface() { // from class: eao.3
                    @Override // com.huawei.health.device.wifi.interfaces.CommBaseCallbackInterface
                    public void onResult(int i, String str, Object obj) {
                        LogUtil.a("InquireAuthUserHandler", "updateAllDeviceSubUser errorCode:", Integer.valueOf(i));
                    }
                });
            }
        }
    }

    public void a(String str) {
        dyg.a(false, "InquireAuthUserHandler", "start msg ", str);
        this.d.removeTasksAndMessages();
        this.d.sendEmptyMessage(1000);
    }

    public void d() {
        LogUtil.a("InquireAuthUserHandler", "updataDeviceSubUser in");
        this.d.sendEmptyMessage(1004);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        ArrayList<String> arrayListE = ecf.e();
        if (arrayListE != null && arrayListE.size() > 0) {
            Iterator<String> it = arrayListE.iterator();
            while (it.hasNext()) {
                d(it.next(), 0);
            }
            return;
        }
        dyg.c(false, "getAllDeviceSubUser local has not device", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final String str, final int i) {
        WifiDeviceGetAuthorizeSubUserReq wifiDeviceGetAuthorizeSubUserReq = new WifiDeviceGetAuthorizeSubUserReq();
        wifiDeviceGetAuthorizeSubUserReq.setDevId(str);
        lqo.b(dxw.d()).b(wifiDeviceGetAuthorizeSubUserReq, new ICloudOperationResult<WifiDeviceGetAuthorizeSubUserRsp>() { // from class: eao.2
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void operationResult(WifiDeviceGetAuthorizeSubUserRsp wifiDeviceGetAuthorizeSubUserRsp, String str2, boolean z) {
                int iIntValue;
                String resultDesc;
                if (!z) {
                    if (wifiDeviceGetAuthorizeSubUserRsp == null) {
                        iIntValue = Constants.CODE_UNKNOWN_ERROR;
                        resultDesc = "unknown error";
                    } else {
                        iIntValue = wifiDeviceGetAuthorizeSubUserRsp.getResultCode().intValue();
                        resultDesc = wifiDeviceGetAuthorizeSubUserRsp.getResultDesc();
                    }
                    eao.this.d(str, i);
                    dyg.d(false, "InquireAuthUserHandler", "getUserAllDevice() errCode = ", Integer.valueOf(iIntValue), ",resultDesc:", resultDesc);
                    return;
                }
                if (wifiDeviceGetAuthorizeSubUserRsp == null) {
                    dyg.a(false, "InquireAuthUserHandler", "getUserAllDevice rsp is null");
                    return;
                }
                dyg.a(false, "InquireAuthUserHandler", "getUserAllDevice reg subUser success :", wifiDeviceGetAuthorizeSubUserRsp.toString());
                List<AuthorizeSubUserInfo> authorizeSubUserList = wifiDeviceGetAuthorizeSubUserRsp.getAuthorizeSubUserList();
                dyg.a(false, "InquireAuthUserHandler", "getUserAllDevice reg subUser :", authorizeSubUserList == null ? Constants.NULL : Integer.valueOf(authorizeSubUserList.size()));
                if (eao.this.a(authorizeSubUserList, str)) {
                    return;
                }
                eao.this.d(str, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(List<AuthorizeSubUserInfo> list, String str) {
        if (list == null || list.size() <= 0) {
            return false;
        }
        return a(str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, int i) {
        dyg.a(false, "InquireAuthUserHandler", "sendQuerySubUserMsg queryNum:", Integer.valueOf(i));
        if (i <= 3) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = str;
            messageObtain.arg1 = i + 1;
            messageObtain.what = 1001;
            this.d.sendMessage(messageObtain);
            return;
        }
        dyg.c(false, "InquireAuthUserHandler", "sendQuerySubUserMsg is finish ");
    }

    private boolean a(String str, List<AuthorizeSubUserInfo> list) throws Throwable {
        eal ealVarA = ecf.a(str);
        boolean z = false;
        if (list == null) {
            dyg.a(false, "InquireAuthUserHandler", "compareSubUser subUserInfos is null");
            return false;
        }
        if (ealVarA != null && njy.b(ealVarA.e())) {
            ArrayList<eaj> arrayListE = ealVarA.e();
            for (AuthorizeSubUserInfo authorizeSubUserInfo : list) {
                if (c(str, authorizeSubUserInfo, arrayListE, authorizeSubUserInfo.getSubHuid())) {
                    z = true;
                }
            }
            return z;
        }
        for (AuthorizeSubUserInfo authorizeSubUserInfo2 : list) {
            if (!TextUtils.isEmpty(authorizeSubUserInfo2.getSubHuid())) {
                a(str, authorizeSubUserInfo2);
                z = true;
            }
        }
        return z;
    }

    private boolean c(String str, AuthorizeSubUserInfo authorizeSubUserInfo, ArrayList<eaj> arrayList, String str2) throws Throwable {
        if (TextUtils.isEmpty(str2) || c(arrayList, str2)) {
            return false;
        }
        a(str, authorizeSubUserInfo);
        return true;
    }

    private void a(String str, AuthorizeSubUserInfo authorizeSubUserInfo) throws Throwable {
        eaj eajVar = new eaj();
        eajVar.c(authorizeSubUserInfo.getSubHuid());
        eajVar.d(authorizeSubUserInfo.getUserAccount());
        eajVar.b(authorizeSubUserInfo.getNickName());
        ecf.c(str, eajVar);
        Bundle bundle = new Bundle();
        bundle.putString("deviceid", str);
        bundle.putString("account", eajVar.e());
        Message messageObtain = Message.obtain();
        messageObtain.setData(bundle);
        messageObtain.what = 1003;
        this.d.sendMessage(messageObtain);
    }

    private boolean c(ArrayList<eaj> arrayList, String str) {
        Iterator<eaj> it = arrayList.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next().a())) {
                return true;
            }
        }
        return false;
    }
}
