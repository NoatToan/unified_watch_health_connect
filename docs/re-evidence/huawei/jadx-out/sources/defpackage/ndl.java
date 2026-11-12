package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.telephony.SmsManager;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.ReleaseLogUtil;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class ndl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ndl f42945a;
    private static final Object e = new Object();
    private BroadcastReceiver d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, ndi> f42947c = new HashMap(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f42946b = BaseApplication.getContext();

    private ndl() {
        b();
    }

    public static ndl d() {
        ndl ndlVar;
        synchronized (e) {
            if (f42945a == null) {
                f42945a = new ndl();
            }
            ndlVar = f42945a;
        }
        return ndlVar;
    }

    public void a(byte[] bArr) {
        ndi ndiVarE = e(bArr);
        if (ndiVarE == null) {
            return;
        }
        if (ndiVarE.e() == 2) {
            c(ndiVarE.b(), ndiVarE.d());
            return;
        }
        if (ndiVarE.e() != 1) {
            LogUtil.j("SmsSendManager", "parseSmsReply not support other sender");
            return;
        }
        ReleaseLogUtil.c("R_SmsSendManager", "deviceReplyClassify sms quick reply");
        int iC = ndiVarE.c();
        int iJ = ndiVarE.j();
        LogUtil.a("SmsSendManager", "deviceReplyClassify encodeFormat: ", Integer.valueOf(iC), ",subId: ", Integer.valueOf(iJ), ",senderNumber: ", ncp.e(ndiVarE.b()), ",attachmentId: ", ndiVarE.a(), ",smsContent: ", cop.e(ndiVarE.d()));
        if (!TextUtils.isEmpty(ndiVarE.a()) && !TextUtils.isEmpty(ndiVarE.b())) {
            this.f42947c.put(ndiVarE.a(), ndiVarE);
        }
        if (TextUtils.isEmpty(ndiVarE.b()) || TextUtils.isEmpty(ndiVarE.d())) {
            return;
        }
        if (!ltd.e().e(BaseApplication.getContext(), "android.permission.SEND_SMS")) {
            ReleaseLogUtil.c("R_SmsSendManager", "deviceReplyClassify HAS_NO_PERMISSION: SEND_SMS");
            ndj.c(127);
        } else {
            e(nfc.a(ndiVarE.j()), ndiVarE.b(), ndiVarE.d());
        }
    }

    private ndi e(byte[] bArr) {
        List<eew> listC = ndj.c(bArr);
        if (listC == null) {
            LogUtil.j("SmsSendManager", "generateSmsReceivedInfo tlvList is null");
            return null;
        }
        String strD = "";
        int iV = -1;
        int iV2 = 1;
        String strB = "";
        int iV3 = 2;
        String strD2 = strB;
        for (eew eewVar : listC) {
            switch (CommonUtil.v(eewVar.e())) {
                case 1:
                    iV2 = CommonUtil.v(eewVar.b());
                    break;
                case 2:
                    iV3 = CommonUtil.v(eewVar.b());
                    break;
                case 3:
                    iV = CommonUtil.v(eewVar.b());
                    break;
                case 4:
                    strD = eeq.d(eewVar.b());
                    break;
                case 5:
                    strD2 = eeq.d(eewVar.b());
                    break;
                case 6:
                    strB = eewVar.b();
                    break;
            }
        }
        ndi ndiVar = new ndi(strD, iV);
        ndiVar.d(iV2);
        ndiVar.b(iV3);
        ndiVar.e(strD2);
        if (!TextUtils.isEmpty(strB)) {
            ndiVar.b(b(iV3, strB));
        }
        return ndiVar;
    }

    private void e(SmsManager smsManager, String str, String str2) {
        ArrayList<String> arrayListDivideMessage = smsManager.divideMessage(str2);
        if (arrayListDivideMessage == null || arrayListDivideMessage.isEmpty()) {
            LogUtil.j("SmsSendManager", "sendSmsReply messages is null");
            return;
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(this.f42946b, 0, new Intent("action_device_reject_send_sms"), 201326592);
        ArrayList<PendingIntent> arrayList = new ArrayList<>();
        for (int i = 0; i < arrayListDivideMessage.size(); i++) {
            if (arrayListDivideMessage.get(i) == null || arrayListDivideMessage.get(i).trim().isEmpty()) {
                ReleaseLogUtil.d("R_SmsSendManager", "sendSmsReply messages is Blank");
                return;
            }
            arrayList.add(broadcast);
        }
        try {
            smsManager.sendMultipartTextMessage(str, null, arrayListDivideMessage, arrayList, null);
        } catch (SecurityException e2) {
            ReleaseLogUtil.b("R_SmsSendManager", "sendSms occur SecurityException ", ExceptionUtils.c(e2));
        }
        ReleaseLogUtil.c("R_SmsSendManager", "sendSmsReply messages finished");
    }

    private void b() {
        if (this.d != null) {
            LogUtil.j("SmsSendManager", "registerSmsSendReceiver mBroadcastReceiver already register");
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action_device_reject_send_sms");
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: ndl.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                int resultCode = getResultCode();
                ReleaseLogUtil.c("R_SmsSendManager", "SmsSendReceiver resultCode:", Integer.valueOf(resultCode));
                ndj.c(resultCode);
            }
        };
        this.d = broadcastReceiver;
        BroadcastManagerUtil.c(this.f42946b, broadcastReceiver, intentFilter, LocalBroadcast.f36595c, null);
    }

    private String b(int i, String str) {
        if (i == 3) {
            return new String(eeq.c(str), Charset.forName("utf16"));
        }
        return eeq.d(str);
    }

    private void c(String str, String str2) {
        Intent intent = new Intent();
        intent.setAction("com.huawei.health.action.ACTION_NOTIFICATION_PUSH");
        intent.putExtra("action_type", "key_replay");
        intent.putExtra("key_replay_destination", str);
        intent.putExtra("key_replay_content", str2);
        BroadcastManagerUtil.e(BaseApplication.getContext(), intent);
        LogUtil.a("SmsSendManager", "deviceReply sendBroadcastPackage finished!");
    }
}
