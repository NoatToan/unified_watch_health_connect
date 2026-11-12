package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.telecom.TelecomManager;
import android.telephony.SmsManager;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.android.internal.telephony.ITelephony;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwdevice.phoneprocess.binder.ParserInterface;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ndn implements ParserInterface {
    private static ndn e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f42952b;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f42951c = {"android.permission.CALL_PHONE", "android.permission.READ_PHONE_STATE"};

    private ndn(Context context) {
        this.f42952b = context;
    }

    public static ndn b(Context context) {
        ndn ndnVar;
        synchronized (d) {
            if (e == null && context != null) {
                e = new ndn(context);
            }
            ndnVar = e;
        }
        return ndnVar;
    }

    private void e(byte[] bArr) {
        ReleaseLogUtil.d("Notify_HwRejectCallManager", "handleCallingOperationReport() enter");
        if (bArr == null || bArr.length < 5) {
            LogUtil.j("HwRejectCallManager", "handleCallingOperationReport, dataInfos is null or length less than 5, return");
            return;
        }
        if (nfc.i() && bArr[1] == 2) {
            b(bArr);
            return;
        }
        if (bArr[1] != 1) {
            LogUtil.j("HwRejectCallManager", "handleCallingOperationReport, commandId is not calling operation");
            return;
        }
        byte b2 = bArr[4];
        if (b2 != 1) {
            LogUtil.j("HwRejectCallManager", "handleCallingOperationReport, operation is not end call");
            return;
        }
        LogUtil.a("HwRejectCallManager", "operation :", Byte.valueOf(b2), ", end call");
        if (Build.VERSION.SDK_INT >= 28) {
            e();
        } else {
            d();
        }
    }

    private void e() {
        LogUtil.a("HwRejectCallManager", "executing API28 phone hang up");
        if (ContextCompat.checkSelfPermission(this.f42952b, "android.permission.ANSWER_PHONE_CALLS") != 0) {
            LogUtil.j("HwRejectCallManager", "API28 hangs up the phone is not enough permission, finish");
            return;
        }
        Object systemService = this.f42952b.getSystemService("telecom");
        TelecomManager telecomManager = systemService instanceof TelecomManager ? (TelecomManager) systemService : null;
        if (telecomManager == null) {
            LogUtil.j("HwRejectCallManager", "telephoneCommonManager is null, finish");
            return;
        }
        try {
            if (telecomManager.endCall()) {
                LogUtil.a("HwRejectCallManager", "executing API28 phone hang up finish");
                return;
            }
        } catch (SecurityException e2) {
            LogUtil.e("HwRejectCallManager", "SecurityException ", e2.getMessage());
        } catch (Exception e3) {
            LogUtil.e("HwRejectCallManager", "Exception ", e3.getMessage());
        }
        LogUtil.j("HwRejectCallManager", "hanging up is terminated, finish");
    }

    private void d() {
        try {
            Object systemService = this.f42952b.getSystemService("phone");
            TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
            if (telephonyManager == null) {
                LogUtil.j("HwRejectCallManager", "telephonyManager is null, finish");
                return;
            }
            Method declaredMethod = TelephonyManager.class.getDeclaredMethod("getITelephony", null);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(telephonyManager, null);
            ITelephony iTelephony = objInvoke instanceof ITelephony ? (ITelephony) objInvoke : null;
            if (iTelephony == null) {
                LogUtil.j("HwRejectCallManager", "telephoneAidl is null!");
                return;
            }
            LogUtil.a("HwRejectCallManager", "sdk level:", Integer.valueOf(Build.VERSION.SDK_INT));
            if (iTelephony.endCall()) {
                LogUtil.j("HwRejectCallManager", "ITelephony.endCall() Succeed");
            } else {
                e(iTelephony);
            }
        } catch (RuntimeException unused) {
            LogUtil.e("HwRejectCallManager", "endCall RuntimeException");
            a();
        } catch (Exception unused2) {
            LogUtil.e("HwRejectCallManager", "endCall Exception");
        }
    }

    private void e(ITelephony iTelephony) {
        try {
            Object systemService = this.f42952b.getSystemService("telephony_subscription_service");
            SubscriptionManager subscriptionManager = systemService instanceof SubscriptionManager ? (SubscriptionManager) systemService : null;
            if (subscriptionManager == null) {
                LogUtil.j("HwRejectCallManager", "subscriptionManager is null!");
                return;
            }
            List<SubscriptionInfo> activeSubscriptionInfoList = subscriptionManager.getActiveSubscriptionInfoList();
            if (activeSubscriptionInfoList != null && !activeSubscriptionInfoList.isEmpty()) {
                for (SubscriptionInfo subscriptionInfo : activeSubscriptionInfoList) {
                    if (subscriptionInfo != null) {
                        boolean zEndCallForSubscriber = iTelephony.endCallForSubscriber(subscriptionInfo.getSubscriptionId());
                        LogUtil.a("HwRejectCallManager", "endCallForSubscriber result:", Boolean.valueOf(zEndCallForSubscriber));
                        if (zEndCallForSubscriber) {
                            return;
                        }
                    }
                }
                a();
                return;
            }
            LogUtil.j("HwRejectCallManager", "endCallForSubscriber Get Active Subscription Info List Failed");
        } catch (RuntimeException unused) {
            LogUtil.e("HwRejectCallManager", "endCall RuntimeException");
            a();
        } catch (Exception unused2) {
            LogUtil.e("HwRejectCallManager", "endCall Exception");
        }
    }

    private void a() {
        boolean zD = lsg.d(this.f42952b, f42951c);
        LogUtil.a("HwRejectCallManager", "check call phone and read phone state permission result :", Boolean.valueOf(zD));
        if (zD) {
            return;
        }
        LogUtil.a("HwRejectCallManager", "no call reject permission, send broadcast");
        Intent intent = new Intent();
        intent.setAction("com.huawei.health.action.NO_CALL_REJECT_PERMISION");
        this.f42952b.sendBroadcast(intent, LocalBroadcast.f36595c);
    }

    private void b(byte[] bArr) {
        if (!lsg.d(this.f42952b, new String[]{"android.permission.SEND_SMS"})) {
            LogUtil.j("HwRejectCallManager", "handleSmsReject not send sms permission");
            return;
        }
        String strE = eeq.e(bArr);
        try {
            List<eew> listE = new eet().b(strE.substring(4, strE.length())).e();
            if (listE == null || listE.isEmpty()) {
                LogUtil.j("HwRejectCallManager", "handleSmsReject tlvList is empty");
                return;
            }
            String strD = "";
            String strD2 = "";
            for (eew eewVar : listE) {
                int iV = CommonUtil.v(eewVar.e());
                if (iV == 2) {
                    strD = eeq.d(eewVar.b());
                } else if (iV == 3) {
                    strD2 = eeq.d(eewVar.b());
                }
            }
            if (TextUtils.isEmpty(strD) || TextUtils.isEmpty(strD2)) {
                LogUtil.j("HwRejectCallManager", "handleSmsReject incomingNumber or smsContent is empty");
            } else {
                b(a(strD), strD, strD2);
            }
        } catch (eeu unused) {
            LogUtil.e("HwRejectCallManager", "handleSmsReject TlvException");
        }
    }

    private SmsManager a(String str) {
        if (!nfc.d()) {
            LogUtil.a("HwRejectCallManager", "getSmsManager send default smsManager");
            return SmsManager.getDefault();
        }
        int iE = nfc.e(str);
        nfc.d(str);
        LogUtil.a("HwRejectCallManager", "getSmsManager subscriptionId: ", Integer.valueOf(iE));
        if (iE != -1) {
            return SmsManager.getSmsManagerForSubscriptionId(iE);
        }
        return null;
    }

    private void b(SmsManager smsManager, String str, String str2) {
        if (smsManager == null) {
            LogUtil.j("HwRejectCallManager", "sendSms smsManager is null");
            xjt.am("sendSms smsManager is null");
            return;
        }
        ArrayList<String> arrayListDivideMessage = smsManager.divideMessage(str2);
        if (arrayListDivideMessage == null || arrayListDivideMessage.isEmpty()) {
            LogUtil.j("HwRejectCallManager", "sendSms messages is null");
            xjt.am("sendSms messages is null");
            return;
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(this.f42952b, 0, new Intent("device_reject_send_sms_action"), 201326592);
        ArrayList<PendingIntent> arrayList = new ArrayList<>();
        for (int i = 0; i < arrayListDivideMessage.size(); i++) {
            arrayList.add(broadcast);
        }
        try {
            smsManager.sendMultipartTextMessage(str, null, arrayListDivideMessage, arrayList, null);
        } catch (NullPointerException e2) {
            ReleaseLogUtil.a("HwRejectCallManager", "sendSms ", LogAnonymous.b(e2));
            xjt.s("sendSms NullPointerException");
        } catch (SecurityException unused) {
            LogUtil.e("HwRejectCallManager", "sendSms occur SecurityException");
            xjt.s("sendSms occur SecurityException");
        }
        c();
    }

    private void c() {
        byte[] bArrE = new cqj().j(127, 100000).e();
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(4);
        deviceCommand.setCommandID(2);
        deviceCommand.setDataContent(bArrE);
        deviceCommand.setDataLen(bArrE.length);
        mkf.e(this.f42952b).sendDeviceData(deviceCommand);
    }

    @Override // com.huawei.hwdevice.phoneprocess.binder.ParserInterface
    public void getResult(DeviceInfo deviceInfo, byte[] bArr) {
        e(bArr);
    }
}
