package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.work.BackoffPolicy;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.PeriodicWorkRequest;
import androidx.work.multiprocess.RemoteWorkManager;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.datatypes.DataPromptData;
import com.huawei.hwcommonmodel.datatypes.MsgImage;
import com.huawei.hwcommonmodel.datatypes.MsgText;
import com.huawei.hwdevice.outofprocess.util.NotificationContentProviderUtil;
import com.huawei.hwdevice.phoneprocess.binder.ParserInterface;
import com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface;
import com.huawei.hwdevice.phoneprocess.mgr.notification.PushListenerWatchdogWorker;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.utils.Constants;
import com.huawei.up.model.UserInfomation;
import com.huawei.wearmgr.outofprocess.datatype.BluetoothType;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ncl implements ParserInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f42883a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ncl f42884b = null;
    private static int e = 127;
    private BTDeviceMgrUtil f;
    private boolean n;
    private long v;
    private long x;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f42885c = new Object();
    private DeviceCommand l = null;
    private int y = 0;
    private int j = 240;
    private boolean s = true;
    private boolean t = false;
    private int ad = 30;
    private int i = 30;
    private int o = 30;
    private boolean r = false;
    private boolean p = false;
    private boolean q = false;
    private int w = 2;
    private int g = 2;
    private int k = 2;
    private BroadcastReceiver h = new BroadcastReceiver() { // from class: ncl.4
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            DeviceInfo deviceInfo;
            if (intent == null) {
                LogUtil.j("NotifySendData", "mConnectStateChangedReceiver intent is null");
                return;
            }
            String str = (String) Objects.requireNonNull(intent.getAction());
            str.hashCode();
            if (str.equals("android.intent.action.LOCALE_CHANGED")) {
                LogUtil.a("NotifySendData", "ACTION_LOCALE_CHANGED");
                nby.a().d();
                return;
            }
            if (str.equals("com.huawei.bone.action.CONNECTION_STATE_CHANGED")) {
                ncl.this.n = true;
                try {
                    deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo");
                } catch (ClassCastException unused) {
                    LogUtil.e("NotifySendData", "ClassCastException");
                    deviceInfo = null;
                }
                if (deviceInfo == null) {
                    LogUtil.j("NotifySendData", "mConnectStateChangedReceiver deviceInfo is null");
                    return;
                }
                LogUtil.a("NotifySendData", "mConnectStateChangedReceiver ConnectState is: ", Integer.valueOf(deviceInfo.getDeviceConnectState()));
                int deviceConnectState = deviceInfo.getDeviceConnectState();
                if (deviceConnectState == 2) {
                    ncl.this.b(deviceInfo);
                } else if (deviceConnectState == 3) {
                    if (ncl.this.k() == null) {
                        LogUtil.a("NotifySendData", "connectedDevice is null, delete contact_wear");
                        NotificationContentProviderUtil.a("connect_wear", 0);
                    }
                    ncl.this.o();
                }
                NotificationContentProviderUtil.e(ncl.this.d());
            }
        }
    };
    private BroadcastReceiver u = new BroadcastReceiver() { // from class: ncl.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("NotifySendData", "mPackageAddReceiver intent is null");
            } else if ("android.intent.action.PACKAGE_ADDED".equals(intent.getAction())) {
                LogUtil.a("NotifySendData", "ACTION_PACKAGE_ADDED");
                nby.a().e(intent);
            }
        }
    };
    private HwDeviceMgrInterface m = mkf.e(BaseApplication.getContext());

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (!ncp.g()) {
            SharedPreferenceManager.b("NOTIFY_LIVE_LEVEL_VALUE", "NOTIFY_LIVE_LEVEL_VALUE");
            SharedPreferenceManager.b("SUPPORT_NOTIFY_LIVE_LEVEL_CAPABILITY", "SUPPORT_NOTIFY_LIVE_LEVEL_CAPABILITY");
        }
        if (!ncp.m()) {
            SharedPreferenceManager.b("SUPPORT_NOTIFY_LIVE_TYPE", "SUPPORT_NOTIFY_LIVE_TYPE");
        }
        if (!ncp.j()) {
            SharedPreferenceManager.b("SUPPORT_NOTIFY_ICON", "SUPPORT_NOTIFY_ICON");
        }
        LogUtil.a("NotifySendData", "disConnected reset level and capability");
    }

    private ncl() {
        this.n = true;
        this.f = null;
        this.f = BTDeviceMgrUtil.c();
        IntentFilter intentFilter = new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
        BroadcastManagerUtil.c(BaseApplication.getContext(), this.h, intentFilter, LocalBroadcast.f36595c, null);
        IntentFilter intentFilter2 = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter2.addDataScheme("package");
        BroadcastManagerUtil.c(BaseApplication.getContext(), this.u, intentFilter2, LocalBroadcast.f36595c, null);
        DeviceInfo deviceInfoK = k();
        if (deviceInfoK != null) {
            LogUtil.a("NotifySendData", "try constraint when device connected");
            this.n = true;
            DeviceCapability deviceCapabilityD = ncp.d(deviceInfoK);
            c(deviceCapabilityD, deviceInfoK);
            b(deviceCapabilityD, deviceInfoK);
        }
        v();
        LogUtil.a("NotifySendData", "start check notification service");
        n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(DeviceInfo deviceInfo) {
        c(ncp.d(deviceInfo), deviceInfo);
        SharedPreferenceManager.a("SUPPORT_NOTIFY_VOIP_TYPE", "SUPPORT_NOTIFY_VOIP_TYPE", ncp.p());
        SharedPreferenceManager.a("SUPPORT_NOTIFY_VOIP_SIGNAL_TYPE", "SUPPORT_NOTIFY_VOIP_SIGNAL_TYPE", ncp.r());
        ncg.b().f();
        if (nfc.i()) {
            nfc.e();
        }
        nby.a().c();
        nca.c().d(3);
    }

    private void n() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: ncl.1
            @Override // java.lang.Runnable
            public void run() {
                ncl.this.x = ncp.b(BaseApplication.getContext());
                ncl.this.v = ncp.a(BaseApplication.getContext());
                LogUtil.a("NotifySendData", "initUpdateAndReportTime mNotifyUpdateTime: ", Long.valueOf(ncl.this.x), " mNotifyReportBiTime: ", Long.valueOf(ncl.this.v));
                if (ncl.this.x == 0) {
                    ncl.this.x = System.currentTimeMillis();
                    ncp.a(BaseApplication.getContext(), ncl.this.x);
                }
                if (ncl.this.v == 0) {
                    ncl.this.v = System.currentTimeMillis();
                    ncp.e(BaseApplication.getContext(), ncl.this.v);
                }
            }
        });
    }

    public boolean b(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.x >= 3600000) {
            ncp.a(BaseApplication.getContext(), jCurrentTimeMillis);
            this.x = jCurrentTimeMillis;
            ncp.e(BaseApplication.getContext(), i);
        }
        if (jCurrentTimeMillis - this.v >= 86400000) {
            ncp.e(BaseApplication.getContext(), jCurrentTimeMillis);
            this.v = jCurrentTimeMillis;
            ncp.e(BaseApplication.getContext());
        }
        return jCurrentTimeMillis - this.x >= 3600000;
    }

    public static ncl d(Context context) {
        ncl nclVar;
        synchronized (d) {
            if (f42884b == null && context != null) {
                f42884b = new ncl();
            }
            nclVar = f42884b;
        }
        return nclVar;
    }

    private void c(DeviceCapability deviceCapability, DeviceInfo deviceInfo) {
        if (deviceCapability == null || deviceInfo == null) {
            LogUtil.j("NotifySendData", "sendCapabilityCommand parameter is null");
            return;
        }
        int iIsPromptPush = deviceCapability.isPromptPush();
        int iB = b();
        LogUtil.a("NotifySendData", "sendCapabilityCommand promptPush: ", Integer.valueOf(iIsPromptPush), " deviceProtocol: ", Integer.valueOf(iB));
        if (iIsPromptPush == -1 && iB == 2) {
            DeviceCommand deviceCommand = new DeviceCommand();
            deviceCommand.setServiceID(2);
            deviceCommand.setCommandID(5);
            String str = eeq.d(1) + eeq.d(0);
            deviceCommand.setDataContent(eeq.c(str));
            deviceCommand.setDataLen(eeq.c(str).length);
            deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
            this.m.sendDeviceData(deviceCommand);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    public void c(boolean z, boolean z2, boolean z3, boolean z4) {
        LogUtil.a("NotifySendData", "sendNegotiateMiddleWareCommand isAllStateSend: ", Boolean.valueOf(z4));
        if (z4) {
            LogUtil.a("NotifySendData", "sendNegotiateMiddleWareCommand isNotification: ", Boolean.valueOf(z), " isPrompt: ", Boolean.valueOf(z2), " isClockState: ", Boolean.valueOf(z3));
        } else {
            LogUtil.a("NotifySendData", "sendNegotiateMiddleWareCommand isClockState: ", Boolean.valueOf(z3));
        }
        StringBuilder sb = new StringBuilder(32);
        int i = 0;
        ?? r9 = z;
        if (!z4) {
            r9 = 0;
        } else if (z2) {
            i = 1;
            r9 = z;
        }
        if (z4) {
            sb.append(eeq.d(2));
            sb.append(eeq.d(2));
            sb.append(eeq.d(1));
            sb.append(eeq.d((int) r9));
            sb.append(eeq.d(2));
            sb.append(eeq.d(2));
            sb.append(eeq.d(2));
            sb.append(eeq.d(1));
            sb.append(eeq.d(2));
            sb.append(eeq.d(2));
            sb.append(eeq.d(3));
            sb.append(eeq.d(i));
            boolean zE = ncp.e();
            ReleaseLogUtil.d("R_NotifySendData", "sendNegotiateMiddleWareCommand isSupportClockStateDeal: ", Boolean.valueOf(zE));
            if (zE) {
                sb.append(eeq.d(2));
                sb.append(eeq.d(2));
                sb.append(eeq.d(4));
                sb.append(eeq.d(z3 ? 1 : 0));
            }
        } else {
            sb.append(eeq.d(2));
            sb.append(eeq.d(2));
            sb.append(eeq.d(4));
            sb.append(eeq.d(z3 ? 1 : 0));
        }
        String str = eeq.d(129) + eeq.d(sb.toString().length() / 2) + sb.toString();
        LogUtil.a("NotifySendData", "sendNegotiateMiddleWareCommand packageCommand: ", str);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(33);
        deviceCommand.setCommandID(1);
        deviceCommand.setDataLen(eeq.c(str).length);
        deviceCommand.setDataContent(eeq.c(str));
        this.m.sendDeviceData(deviceCommand);
    }

    public void d(byte[] bArr) {
        if (bArr == null || bArr.length < 5) {
            LogUtil.j("NotifySendData", "handleCapability dataInfos is null or length < NORMAL_CAPABILITY_LENGTH");
            return;
        }
        byte b2 = bArr[1];
        if (b2 == 5) {
            LogUtil.a("NotifySendData", "handleCapability supportValue: ", Byte.valueOf(bArr[4]));
            byte b3 = bArr[4];
            this.s = ((b3 >> 1) & 1) != 0;
            this.t = ((b3 >> 2) & 1) != 0;
            return;
        }
        if (b2 != 2) {
            LogUtil.d("NotifySendData", "handleCapability, need not deal");
            return;
        }
        try {
            int iC = e(bArr).c();
            LogUtil.a("NotifySendData", "handleCapability getContentLength: ", Integer.valueOf(iC));
            int i = (iC / 6) * 6;
            if (i > 0) {
                this.j = i;
            }
            LogUtil.a("NotifySendData", "handleCapability mContentLength: ", Integer.valueOf(this.j));
            SharedPreferenceManager.d("CONTENT_LENGTH", "CONTENT_LENGTH_SIZE", this.j);
            c(this.j);
            b(bArr);
        } catch (eeu unused) {
            LogUtil.e("NotifySendData", "handleCapability TlvException");
        }
    }

    private void c(int i) {
        Intent intent = new Intent();
        intent.setAction("com.huawei.health.action.ACTION_NOTIFICATION_PUSH");
        intent.putExtra("action_type", "CONTENT_LENGTH");
        intent.putExtra("CONTENT_LENGTH_SIZE", i);
        BroadcastManagerUtil.e(BaseApplication.getContext(), intent);
        LogUtil.a("NotifySendData", "contentLength sendBroadcastPackage finished!");
    }

    private ncj e(byte[] bArr) throws eeu {
        String strE;
        int i;
        cpl.d("NotifySendData", bArr, "unNotificationConstraint data: ");
        eet eetVar = new eet();
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < bArr.length; i4++) {
            try {
                if (bArr[i4] == 18) {
                    byte b2 = bArr[i4 + 1];
                    if (b2 == 1 && bArr[i4 + 2] == 1) {
                        i2 = i4;
                    }
                    if (b2 == 1 && bArr[i4 + 2] == 2) {
                        i3 = i4;
                    }
                }
            } catch (Exception unused) {
                LogUtil.e("NotifySendData", "unNotificationConstraint, Exception");
                strE = "";
            }
        }
        if (i2 != -1 && i3 != -1 && (i = i3 - i2) > 5) {
            int i5 = i - 2;
            byte[] bArr2 = new byte[i5];
            System.arraycopy(bArr, i2, bArr2, 0, i5);
            strE = eeq.e(bArr2);
        } else {
            byte[] bArr3 = new byte[9];
            System.arraycopy(bArr, i2, bArr3, 0, 9);
            strE = eeq.e(bArr3);
        }
        LogUtil.a("NotifySendData", "unGetOtaParametersV2 enter, tlvString: ", strE);
        return e(eetVar.b(strE));
    }

    private ncj e(ees eesVar) {
        ncj ncjVar = new ncj();
        List<eew> listE = eesVar.e();
        if (listE != null && !listE.isEmpty()) {
            for (eew eewVar : listE) {
                int iV = CommonUtil.v(eewVar.e());
                String strB = eewVar.b();
                if (iV != 20) {
                    LogUtil.j("NotifySendData", "unknown tlv type");
                } else {
                    ncjVar.d(CommonUtil.v(strB));
                    LogUtil.a("NotifySendData", "constraint.setContentLength: ", Long.valueOf(CommonUtil.x(strB)));
                }
            }
        }
        return ncjVar;
    }

    public void b(DeviceCapability deviceCapability, DeviceInfo deviceInfo) {
        q();
        if (deviceCapability == null || deviceInfo == null) {
            LogUtil.j("NotifySendData", "sendNotificationConstraint parameter is null");
            return;
        }
        boolean zIsMessageAlert = deviceCapability.isMessageAlert();
        LogUtil.a("NotifySendData", "sendNotificationConstraint isMessageAlert: ", Boolean.valueOf(zIsMessageAlert));
        if (zIsMessageAlert) {
            this.j = 240;
            if (b() == 2) {
                LogUtil.a("NotifySendData", "sendNotificationConstraint send");
                DeviceCommand deviceCommand = new DeviceCommand();
                deviceCommand.setServiceID(2);
                deviceCommand.setCommandID(2);
                String str = eeq.d(1) + eeq.d(0);
                deviceCommand.setDataContent(eeq.c(str));
                deviceCommand.setDataLen(eeq.c(str).length);
                deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
                this.m.sendDeviceData(deviceCommand);
            }
        }
    }

    private void q() {
        LogUtil.a("NotifySendData", " resetAbility() ");
        this.ad = 30;
        this.i = 30;
        this.o = 30;
        this.r = false;
        this.p = false;
        this.q = false;
        this.w = 2;
        this.g = 2;
        this.k = 2;
    }

    public void a() {
        try {
            BaseApplication.getContext().unregisterReceiver(this.h);
            BaseApplication.getContext().unregisterReceiver(this.u);
        } catch (RuntimeException unused) {
            LogUtil.e("NotifySendData", "destroy(), RuntimeException");
        } catch (Exception unused2) {
            LogUtil.e("NotifySendData", "destroy(), Exception");
        }
        l();
        u();
    }

    private static void l() {
        synchronized (d) {
            f42884b = null;
        }
    }

    private void u() {
        try {
            RemoteWorkManager.getInstance(BaseApplication.getContext()).cancelUniqueWork(PushListenerWatchdogWorker.class.getName());
        } catch (RuntimeException e2) {
            ReleaseLogUtil.a("NotifySendData", "work cancel failed:", ExceptionUtils.c(e2));
        }
    }

    private void i() {
        int i = f42883a + 1;
        f42883a = i;
        if (i == 256) {
            f42883a = 0;
        }
    }

    public DeviceCommand d(int i, boolean z, List<MsgImage> list, List<MsgText> list2, String str) {
        LogUtil.a("NotifySendData", "pushNotificationToDevice notificationMessageToTlv packageName: ", str, " msgType:", Integer.valueOf(i));
        lry lryVarE = e(i, z, list, list2, str);
        i();
        int iC = lryVarE.c();
        String str2 = eeq.d(1) + eeq.d(2) + eeq.e(f42883a);
        String str3 = eeq.d(2) + eeq.d(1) + eeq.d(iC);
        String str4 = eeq.d(3) + eeq.d(1) + eeq.d(lryVarE.d());
        LogUtil.a("NotifySendData", "pushNotificationToDevice notificationMessageToTlv messageIdTlv: ", str2, " messageTypeTlvHex:", str3, " motorEnableTlvHex: ", str4);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(2);
        deviceCommand.setCommandID(1);
        String strD = d(lryVarE, str, str2, str3, str4);
        deviceCommand.setDataContent(eeq.c(strD));
        deviceCommand.setDataLen(eeq.c(strD).length);
        return deviceCommand;
    }

    private String d(lry lryVar, String str, String str2, String str3, String str4) {
        String str5;
        String str6;
        ArrayList<lru> arrayListB = lryVar.b();
        s();
        r();
        StringBuilder sb = new StringBuilder(16);
        StringBuilder sb2 = new StringBuilder(16);
        String strD = ncp.d(sb2, arrayListB);
        String strB = eeq.b(("" + ((Object) sb) + strD + ((Object) sb2)).length() / 2);
        if (strB.length() > 0) {
            str5 = eeq.d(UserInfomation.WEIGHT_DEFAULT_ENGLISH) + strB;
        } else {
            str5 = eeq.d(4) + eeq.d(0);
        }
        LogUtil.a("NotifySendData", "pushNotificationToDevice getNotificationCommand messageContentStructTlvHex: ", str5);
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("NotifySendData", "pushNotificationToDevice getNotificationCommand packageName is null");
            str6 = str2 + str3 + str4 + str5 + "" + ((Object) sb) + strD + ((Object) sb2);
        } else {
            String strA = eeq.a(lryVar.a());
            int i = e;
            if (strA.length() / 2 > i) {
                strA = str3.substring(0, i * 2);
                LogUtil.a("NotifySendData", "pushNotificationToDevice getNotificationCommand substring messagePkgNameHex: ", strA);
            }
            String str7 = eeq.d(17) + eeq.d(strA.length() / 2) + strA;
            LogUtil.a("NotifySendData", "pushNotificationToDevice getNotificationCommand messagePkgNameHex: ", strA, " messagePkgNameTlv:", str7);
            str6 = str2 + str3 + str4 + str5 + "" + ((Object) sb) + strD + ((Object) sb2) + str7;
        }
        LogUtil.a("NotifySendData", "pushNotificationToDevice getNotificationCommand command: ", str6);
        return str6;
    }

    public DeviceCommand a(Bundle bundle, int i, DeviceCommand deviceCommand) {
        String string;
        String string2;
        String string3;
        String string4;
        long j;
        if (deviceCommand == null || bundle == null) {
            LogUtil.j("NotifySendData", "pushNotificationToDevice notificationMessageExtendToHex deviceCommand or bundle is null,so return");
            return deviceCommand;
        }
        try {
            string = bundle.getString("data_category");
            try {
                string2 = bundle.getString("text");
                try {
                    string3 = bundle.getString("title");
                    try {
                        string4 = bundle.getString("notification_key");
                        try {
                            j = bundle.getLong("data_extra_noty_when");
                        } catch (Exception unused) {
                            LogUtil.e("NotifySendData", "pushNotificationToDevice notificationMessageExtendToHex messageType error");
                            j = 0;
                        }
                    } catch (Exception unused2) {
                        string4 = "";
                    }
                } catch (Exception unused3) {
                    string3 = "";
                    string4 = string3;
                    LogUtil.e("NotifySendData", "pushNotificationToDevice notificationMessageExtendToHex messageType error");
                    j = 0;
                    long j2 = j;
                    StringBuffer stringBuffer = new StringBuffer(16);
                    String strD = d(string);
                    String strC = c(string3, string2, i, j2);
                    String strT = t();
                    String strB = b(string4);
                    String string5 = bundle.getString("data_extra_noty_key", "");
                    String strE = eeq.e(deviceCommand.getDataContent());
                    String strG = g(19, bundle);
                    LogUtil.a("NotifySendData", string5, " pushNotificationToDevice notificationMessageExtendToHex reminderTlv(1302000F=vibrate): ", strG, ",categoryTlv: ", strD, ",replyKeyTlv: ", strB);
                    stringBuffer.append(strE).append(strD).append(strG).append(strC).append(strT).append(strB).append(c(25, string5)).append(i(26, bundle)).append(b(27, bundle)).append(j(29, bundle)).append(f(41, bundle)).append(d(bundle)).append(c(bundle)).append(a(j2)).append(e(bundle));
                    byte[] bArrC = eeq.c(stringBuffer.toString());
                    LogUtil.a("NotifySendData", "pushNotificationToDevice notificationMessageExtendToHex command: ", stringBuffer.toString());
                    deviceCommand.setDataContent(bArrC);
                    deviceCommand.setDataLen(bArrC.length);
                    return deviceCommand;
                }
            } catch (Exception unused4) {
                string2 = "";
                string3 = "";
                string4 = string3;
                LogUtil.e("NotifySendData", "pushNotificationToDevice notificationMessageExtendToHex messageType error");
                j = 0;
                long j3 = j;
                StringBuffer stringBuffer2 = new StringBuffer(16);
                String strD2 = d(string);
                String strC2 = c(string3, string2, i, j3);
                String strT2 = t();
                String strB2 = b(string4);
                String string6 = bundle.getString("data_extra_noty_key", "");
                String strE2 = eeq.e(deviceCommand.getDataContent());
                String strG2 = g(19, bundle);
                LogUtil.a("NotifySendData", string6, " pushNotificationToDevice notificationMessageExtendToHex reminderTlv(1302000F=vibrate): ", strG2, ",categoryTlv: ", strD2, ",replyKeyTlv: ", strB2);
                stringBuffer2.append(strE2).append(strD2).append(strG2).append(strC2).append(strT2).append(strB2).append(c(25, string6)).append(i(26, bundle)).append(b(27, bundle)).append(j(29, bundle)).append(f(41, bundle)).append(d(bundle)).append(c(bundle)).append(a(j3)).append(e(bundle));
                byte[] bArrC2 = eeq.c(stringBuffer2.toString());
                LogUtil.a("NotifySendData", "pushNotificationToDevice notificationMessageExtendToHex command: ", stringBuffer2.toString());
                deviceCommand.setDataContent(bArrC2);
                deviceCommand.setDataLen(bArrC2.length);
                return deviceCommand;
            }
        } catch (Exception unused5) {
            string = "";
        }
        long j4 = j;
        StringBuffer stringBuffer3 = new StringBuffer(16);
        String strD3 = d(string);
        String strC3 = c(string3, string2, i, j4);
        String strT3 = t();
        String strB3 = b(string4);
        String string7 = bundle.getString("data_extra_noty_key", "");
        String strE3 = eeq.e(deviceCommand.getDataContent());
        String strG3 = g(19, bundle);
        LogUtil.a("NotifySendData", string7, " pushNotificationToDevice notificationMessageExtendToHex reminderTlv(1302000F=vibrate): ", strG3, ",categoryTlv: ", strD3, ",replyKeyTlv: ", strB3);
        stringBuffer3.append(strE3).append(strD3).append(strG3).append(strC3).append(strT3).append(strB3).append(c(25, string7)).append(i(26, bundle)).append(b(27, bundle)).append(j(29, bundle)).append(f(41, bundle)).append(d(bundle)).append(c(bundle)).append(a(j4)).append(e(bundle));
        byte[] bArrC3 = eeq.c(stringBuffer3.toString());
        LogUtil.a("NotifySendData", "pushNotificationToDevice notificationMessageExtendToHex command: ", stringBuffer3.toString());
        deviceCommand.setDataContent(bArrC3);
        deviceCommand.setDataLen(bArrC3.length);
        return deviceCommand;
    }

    private String c(Bundle bundle) {
        String str = "";
        if (!ncp.h()) {
            ReleaseLogUtil.e("R_NotifySendData", "packagingPingTlvHexByJson device not support add extra field");
            return "";
        }
        String string = bundle.getString(JsbMapKeyNames.H5_EXTRAS);
        LogUtil.a("NotifySendData", "packagingExtrasData extrasJsonValue=", string);
        if (!TextUtils.isEmpty(string)) {
            String strA = eeq.a(string);
            str = eeq.d(51) + ncp.b(strA.length() / 2) + strA;
        }
        LogUtil.a("NotifySendData", "packagingExtrasData extrasMsgTypeTlv=", str);
        return str;
    }

    private String e(Bundle bundle) {
        if (bundle == null) {
            ReleaseLogUtil.e("NotifySendData", "packagingNotificationImageName bundle is null");
            return "";
        }
        if (!ncp.n()) {
            ReleaseLogUtil.e("R_NotifySendData", "packagingNotificationImageName device not support notifyPicture");
            return "";
        }
        String string = bundle.getString("imageName");
        if (TextUtils.isEmpty(string)) {
            ReleaseLogUtil.e("NotifySendData", "packagingNotificationImageName imageName is empty");
            return "";
        }
        String strA = eeq.a(string);
        String str = eeq.d(52) + eeq.d(strA.length() / 2) + strA;
        LogUtil.a("NotifySendData", "packagingNotificationImageName imageNameTlv=", str);
        return str;
    }

    private String a(long j) {
        if (j == 0) {
            ReleaseLogUtil.e("NotifySendData", "packagingNotificationWhen receiveTime is null");
            return "";
        }
        String strB = eeq.b(j);
        return eeq.d(50) + eeq.d(strB.length() / 2) + strB;
    }

    private String d(Bundle bundle) {
        if (!ncp.b()) {
            ReleaseLogUtil.e("R_NotifySendData", "packagingPingTlvHexByJson device not support deepLink process");
            return "";
        }
        String string = bundle.getString("pingList");
        if (TextUtils.isEmpty(string)) {
            ReleaseLogUtil.e("R_NotifySendData", "packagingPingTlvHexByJson pingList is empty");
            return "";
        }
        LogUtil.a("NotifySendData", "packagingPingTlvHexByJson pingList=", string);
        cqj cqjVar = new cqj();
        cqjVar.a(42);
        try {
            JSONArray jSONArray = new JSONArray(string);
            for (int i = 0; i < jSONArray.length(); i++) {
                cqjVar.d(43);
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                boolean zHas = jSONObject.has("ping_open_remote");
                LogUtil.a("NotifySendData", "packagingPingTlvHexByJson isExistOpenRemote=", Boolean.valueOf(zHas));
                if (zHas) {
                    cqjVar.c(44, jSONObject.getInt("ping_open_remote"));
                }
                boolean zHas2 = jSONObject.has("ping_open_type");
                LogUtil.a("NotifySendData", "packagingPingTlvHexByJson isExistOpenType=", Boolean.valueOf(zHas2));
                if (zHas2) {
                    cqjVar.c(45, jSONObject.getInt("ping_open_type"));
                }
                boolean zHas3 = jSONObject.has("ping_package_name");
                LogUtil.a("NotifySendData", "packagingPingTlvHexByJson isExistPackageName=", Boolean.valueOf(zHas3));
                if (zHas3) {
                    String string2 = jSONObject.getString("ping_package_name");
                    if (!TextUtils.isEmpty(string2)) {
                        cqjVar.e(46, string2);
                    }
                }
                boolean zHas4 = jSONObject.has("ping_class_name");
                LogUtil.a("NotifySendData", "packagingPingTlvHexByJson isExistClassName=", Boolean.valueOf(zHas4));
                if (zHas4) {
                    String string3 = jSONObject.getString("ping_class_name");
                    if (!TextUtils.isEmpty(string3)) {
                        cqjVar.e(47, string3);
                    }
                }
                boolean zHas5 = jSONObject.has("ping_url");
                LogUtil.a("NotifySendData", "packagingPingTlvHexByJson isExistUrl=", Boolean.valueOf(zHas5));
                if (zHas5) {
                    String string4 = jSONObject.getString("ping_url");
                    if (!TextUtils.isEmpty(string4)) {
                        cqjVar.e(48, string4);
                    }
                }
                boolean zHas6 = jSONObject.has("button_content");
                LogUtil.a("NotifySendData", "packagingPingTlvHexByJson isExistButtonContent=", Boolean.valueOf(zHas6));
                if (zHas6) {
                    String string5 = jSONObject.getString("button_content");
                    if (!TextUtils.isEmpty(string5)) {
                        cqjVar.e(49, string5);
                    }
                }
                cqjVar.b(cqjVar.b());
            }
            String strE = eeq.e(cqjVar.a(cqjVar.d()).e());
            LogUtil.a("NotifySendData", "packagingPingTlvHexByJson allLinkCommand=", strE);
            return strE;
        } catch (JSONException unused) {
            LogUtil.e("NotifySendData", "packagingPingTlvHexByJson occur JSONException.");
            return "";
        }
    }

    private String f(int i, Bundle bundle) {
        int i2 = bundle.getInt("voip_type", 0);
        if (i2 == 0) {
            ReleaseLogUtil.e("R_NotifySendData", "pushNotificationToDevice voip type FAILED: it not is a voip call.");
            return "";
        }
        if (!ncp.p()) {
            return "";
        }
        String strD = eeq.d(i2);
        return eeq.d(i) + ncp.b(strD.length() / 2) + strD;
    }

    private String c(int i, String str) {
        if (!ncp.t() && !ncp.c()) {
            ReleaseLogUtil.e("R_NotifySendData", "packagingNotificationKeyTlv isSupportRepeatedNotifyProcess false");
            return "";
        }
        String strA = eeq.a(str);
        return eeq.d(i) + ncp.b(strA.length() / 2) + strA;
    }

    private String i(int i, Bundle bundle) {
        if (!ncp.t() && !ncp.c()) {
            ReleaseLogUtil.e("R_NotifySendData", "packagingNotificationKeyTlv isSupportRepeatedNotifyProcess false");
            return "";
        }
        String strC = eeq.c(bundle.getInt("data_noty_id", -1));
        return eeq.d(i) + ncp.b(strC.length() / 2) + strC;
    }

    private String b(int i, Bundle bundle) {
        if (!ncp.t() && !ncp.c()) {
            ReleaseLogUtil.e("R_NotifySendData", "packagingChannelIdHex isSupportRepeatedNotifyProcess false");
            return "";
        }
        String strA = eeq.a(bundle.getString("data_channel_id", ""));
        return eeq.d(i) + ncp.b(strA.length() / 2) + strA;
    }

    private String j(int i, Bundle bundle) {
        int i2 = bundle.getInt("liveType", 0);
        String string = bundle.getString("liveEvent", "OTHER");
        if (i2 == 0) {
            ReleaseLogUtil.e("R_NotifySendData", "pushNotificationToDevice packagingLiveInfoHex FAILED: LIVETYPE_NOT_MATCH!");
            return "";
        }
        if (!cis.e.contains(string.toUpperCase(Locale.ROOT))) {
            ReleaseLogUtil.e("R_NotifySendData", "pushNotificationToDevice packagingLiveInfoHex FAILED: LIVEEVENT_NOT_IN_WHITEFLAGS!");
            return "";
        }
        if (!ncp.m()) {
            ReleaseLogUtil.e("R_NotifySendData", "pushNotificationToDevice packagingLiveInfoHex FAILED: DEVICE_CAPABILITY_INCAPABLE!");
            return "";
        }
        int i3 = bundle.getInt("liveOperation", 0);
        int i4 = bundle.getInt("liveKeepTime", 0);
        String string2 = bundle.getString("featureTitleText", "");
        String string3 = bundle.getString("featureContentText", "");
        String string4 = bundle.getString("titleOverlay", "");
        String string5 = bundle.getString("contentOverlay", "");
        cqj cqjVar = new cqj();
        cqjVar.d(i).c(30, i3).c(32, i2).a(33, i4).e(31, string);
        b(string2, string3, string4, string5, cqjVar);
        boolean z = bundle.getBoolean("externalEnable", false);
        cqjVar.c(38, z ? 1 : 0);
        a(bundle, cqjVar, z);
        return eeq.e(cqjVar.a(cqjVar.b()).e());
    }

    private void b(String str, String str2, String str3, String str4, cqj cqjVar) {
        if (!str.isEmpty()) {
            cqjVar.e(36, str);
        }
        if (!str2.isEmpty()) {
            cqjVar.e(37, str2);
        }
        if (!str3.isEmpty()) {
            cqjVar.e(34, str3);
        }
        if (str4.isEmpty()) {
            return;
        }
        cqjVar.e(35, str4);
    }

    private void a(Bundle bundle, cqj cqjVar, boolean z) {
        if (z) {
            String string = bundle.getString("externalTitle", "");
            String string2 = bundle.getString("externalBody", "");
            if (!string.isEmpty()) {
                cqjVar.e(39, string);
            }
            if (string2.isEmpty()) {
                return;
            }
            cqjVar.e(40, string2);
        }
    }

    private String a(int i, Bundle bundle) {
        String string = bundle.getString("data_category");
        if (TextUtils.isEmpty(string)) {
            LogUtil.a("NotifySendData", "packagingCategoryHex category is empty");
            return "";
        }
        if (!ncp.c() && (!ncp.p() || !NotificationCompat.CATEGORY_CALL.equals(string))) {
            ReleaseLogUtil.e("R_NotifySendData", "packagingDeleteCategoryHex isSupportDeleteSingleNotification false");
            return "";
        }
        String strA = eeq.a(string);
        return eeq.d(i) + ncp.b(strA.length() / 2) + strA;
    }

    private String b(String str) {
        if (!ndj.c()) {
            ReleaseLogUtil.e("R_NotifySendData", "pushNotificationToDevice quickReply FAILED: DEVICE_INCAPABLE");
            return "";
        }
        String strA = eeq.a(str);
        return eeq.d(24) + ncp.b(strA.length() / 2) + strA;
    }

    private String t() {
        if (!nby.a().e()) {
            ReleaseLogUtil.e("R_NotifySendData", "packagingTimeHex device is not support timestamp.");
            return "";
        }
        return eeq.d(21) + eeq.d(4) + eeq.c(System.currentTimeMillis() / 1000);
    }

    private String d(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("NotifySendData", "pushNotificationToDevice WARNING: category is empty!");
            return "";
        }
        DeviceInfo deviceInfoM = m();
        if (deviceInfoM == null || deviceInfoM.getProductType() < 34) {
            LogUtil.j("NotifySendData", "pushNotificationToDevice WARNING: productType<34,don't push category: ", deviceInfoM);
            return "";
        }
        String strA = eeq.a(str);
        return eeq.d(18) + eeq.d(strA.length() / 2) + strA;
    }

    private String g(int i, Bundle bundle) {
        String strE;
        String string = bundle.getString("data_extra_noty_harmony_alert");
        int i2 = bundle.getInt("data_extra_reminder_status", 15);
        LogUtil.a("NotifySendData", "pushNotificationToDevice packagingReminderHex isReminderStatus(15=0x000F=vibrate): ", Integer.valueOf(i2));
        if (ncp.t() && i2 == 0) {
            String strE2 = eeq.e(0);
            LogUtil.j("NotifySendData", "pushNotificationToDevice packagingReminderHex reminder no value");
            return eeq.d(i) + eeq.d(2) + strE2;
        }
        ReleaseLogUtil.d("R_NotifySendData", "pushNotificationToDevice packagingReminderHex alertListenerPkg: ", string, " ,smartRemindSwitch: ", Boolean.valueOf(ncg.b().c()));
        if (ncg.b().e()) {
            ncg.b().h();
            if (!ncg.b().c() || BaseApplication.getContext().getPackageName().equals(string)) {
                strE = eeq.e(15);
            } else {
                strE = eeq.e(0);
            }
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(2);
            if (TextUtils.isEmpty(string)) {
                linkedHashMap.put("notificationReminderAlertPkg", Constants.NULL);
            } else {
                linkedHashMap.put("notificationReminderAlertPkg", string);
            }
            if (strE.toLowerCase(Locale.ROOT).equals("000f")) {
                linkedHashMap.put("notificationReminderState", "true");
            } else {
                linkedHashMap.put("notificationReminderState", "false");
            }
            OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_MESSAGE_PUSH_85070006.value(), linkedHashMap);
            return eeq.d(i) + eeq.d(2) + strE;
        }
        return a(i, bundle, i2);
    }

    private String a(int i, Bundle bundle, int i2) {
        if (!ncg.b().i()) {
            if (ncp.t()) {
                ReleaseLogUtil.d("R_NotifySendData", "pushNotificationToDevice packagingReminderHexOld isSupportRepeatedNotifyProcess true");
                LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(2);
                linkedHashMap.put("notificationReminderOldType", String.valueOf(i));
                linkedHashMap.put("notificationReminderOldValue", "");
                OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_MESSAGE_PUSH_85070006.value(), linkedHashMap);
                return eeq.d(i) + eeq.d(2) + eeq.e(i2);
            }
            LinkedHashMap<String, String> linkedHashMap2 = new LinkedHashMap<>(2);
            linkedHashMap2.put("notificationReminderOldType", String.valueOf(i));
            linkedHashMap2.put("notificationReminderOldValue", Constants.NULL);
            OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_MESSAGE_PUSH_85070006.value(), linkedHashMap2);
            ReleaseLogUtil.d("R_NotifySendData", "pushNotificationToDevice packagingReminderHexOld is not support");
            return "";
        }
        boolean zH = ncg.b().h();
        ReleaseLogUtil.d("R_NotifySendData", "pushNotificationToDevice packagingReminderHexOld isCategoryReminderStatus: ", Boolean.valueOf(zH), ",isReminderStatus(true-vibrate): ", Boolean.valueOf(i2 == 15));
        String strE = eeq.e(zH ? 15 : 0);
        LinkedHashMap<String, String> linkedHashMap3 = new LinkedHashMap<>(2);
        linkedHashMap3.put("notificationReminderOldTypeByPhone", String.valueOf(i));
        if (zH) {
            linkedHashMap3.put("notificationReminderOldResultByPhone", "true");
        } else {
            linkedHashMap3.put("notificationReminderOldResultByPhone", "false");
        }
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_MESSAGE_PUSH_85070006.value(), linkedHashMap3);
        return eeq.d(i) + eeq.d(2) + strE;
    }

    private String c(String str, String str2, int i, long j) {
        boolean zA = ncp.a();
        LogUtil.a("NotifySendData", "pushNotificationToDevice packagingSmsReplyHex messageType: ", Integer.valueOf(i), ",isDeviceSupportSmsReply: ", Boolean.valueOf(zA));
        String str3 = "";
        if (i == 2 && zA) {
            if (ltd.e().e(BaseApplication.getContext(), "android.permission.READ_SMS")) {
                LogUtil.a("NotifySendData", "pushNotificationToDevice packagingSmsReplyHex title: ", cop.c(str), " content:", cop.e(str2));
                ndi ndiVarA = a(str, str2, j);
                if (ndiVarA != null) {
                    int iJ = ndiVarA.j();
                    String strB = ndiVarA.b();
                    ReleaseLogUtil.d("R_NotifySendData", "pushNotificationToDevice packagingSmsReplyHex subId: ", Integer.valueOf(iJ), ",senderNumber: ", cpl.e(strB));
                    if (iJ == -1) {
                        ReleaseLogUtil.a("R_NotifySendData", "pushNotificationToDevice packagingSmsReplyHex subId is -1");
                        return "";
                    }
                    String str4 = eeq.d(20) + eeq.d(1) + eeq.d(iJ);
                    String strA = eeq.a(strB);
                    str3 = str4 + (eeq.d(23) + eeq.d(strA.length() / 2) + strA);
                }
                LogUtil.a("NotifySendData", "pushNotificationToDevice packagingSmsReplyHex smsReplyTlv(0x14,0x17): ", str3);
            } else {
                ReleaseLogUtil.e("R_NotifySendData", "pushNotificationToDevice packagingSmsReplyHex HAS_NO_PERMISSION READ_SMS!");
                return (eeq.d(20) + eeq.d(1) + eeq.d(-1)) + (eeq.d(23) + eeq.d(0));
            }
        }
        return str3;
    }

    private ndi a(String str, String str2, long j) {
        ndi ndiVar = new ndi();
        ndiVar.b(str2);
        ndiVar.b(j);
        ndi ndiVarA = ncp.a(ndiVar);
        if (ndiVarA != null) {
            return ndiVarA;
        }
        List<String> listC = ncp.c(str);
        LogUtil.a("NotifySendData", "pushNotificationToDevice packagingSmsReplyHex numberList size is ", Integer.valueOf(listC.size()));
        Iterator<String> it = listC.iterator();
        while (it.hasNext() && (ndiVarA = ncp.a(it.next())) == null) {
        }
        if (ndiVarA == null && !TextUtils.isEmpty(str2)) {
            LogUtil.a("NotifySendData", "pushNotificationToDevice packagingSmsReplyHex query sms contain subject");
            String[] strArrSplit = str2.split(System.lineSeparator());
            if (strArrSplit.length == 2) {
                return ncp.c(strArrSplit[0], strArrSplit[1]);
            }
        }
        return ndiVarA;
    }

    private lry e(int i, boolean z, List<MsgImage> list, List<MsgText> list2, String str) {
        ncr ncrVar = new ncr();
        ncrVar.d(i);
        ncrVar.a(this.w);
        ncrVar.e(this.g);
        ncrVar.c(this.k);
        return ncp.a(z, list, list2, str, ncrVar);
    }

    private void s() {
        ReleaseLogUtil.d("R_NotifySendData", "notificationMessageToTlv, IsSupportYellow: ", Boolean.valueOf(this.r), " ; YellowPagesLength : ", Integer.valueOf(this.ad), " ; YellowPagesFomat : ", Integer.valueOf(this.w), " ; IsSupportSign : ", Boolean.valueOf(this.p), " ; ContentSignLength : ", Integer.valueOf(this.i), " ; ContentSignFormat : ", Integer.valueOf(this.g), "; IsSupportIncoming : ", Boolean.valueOf(this.q), " ; IncomingNumberLength : ", Integer.valueOf(this.o), " ; IncomingNumberFormat : ", Integer.valueOf(this.k));
    }

    private void r() {
        nct nctVar = new nct();
        nctVar.d(this.r);
        nctVar.e(this.p);
        nctVar.a(this.q);
        nctVar.d(this.j);
        nctVar.b(this.ad);
        nctVar.c(this.i);
        nctVar.e(this.o);
        ncp.b(nctVar);
    }

    public DeviceCommand a(DataPromptData dataPromptData, lrv lrvVar) {
        String strD = ncp.d(lrvVar, dataPromptData);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(2);
        deviceCommand.setCommandID(1);
        deviceCommand.setDataContent(eeq.c(strD));
        deviceCommand.setDataLen(eeq.c(strD).length);
        return deviceCommand;
    }

    public boolean b(DeviceCommand deviceCommand, int i) {
        if (this.f.h() != 3) {
            ReleaseLogUtil.e("R_NotifySendData", "sendNotificationCommand error, Bluetooth switch is turn off");
            return false;
        }
        DeviceInfo deviceInfoM = m();
        ReleaseLogUtil.d("R_NotifySendData", "sendNotificationCommand ConnectState: ", deviceInfoM == null ? "deviceInfo is null" : Integer.valueOf(deviceInfoM.getDeviceConnectState()));
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(2);
        linkedHashMap.put("notificationPushCommandType", String.valueOf(i));
        if (deviceInfoM == null) {
            linkedHashMap.put("notificationPushCommandResult", "false");
        } else {
            linkedHashMap.put("notificationPushCommandResult", "true");
        }
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_MESSAGE_PUSH_85070006.value(), linkedHashMap);
        if (deviceInfoM == null) {
            return false;
        }
        if (deviceInfoM.getDeviceConnectState() != 2 && deviceInfoM.getDeviceConnectState() != 1 && deviceInfoM.getDeviceConnectState() != 5) {
            if (this.l == null) {
                this.l = deviceCommand;
                cpl.d("NotifySendData", deviceCommand.getDataContent(), "mDeviceCommand data: ");
            }
            LogUtil.a("NotifySendData", "sendNotificationCommand mIsForceConnect: ", Boolean.valueOf(this.n));
            if (this.n) {
                this.m.connectDevice(null, BluetoothType.BR.getValue() | BluetoothType.AW.getValue());
                this.n = false;
            }
            this.y = i;
            return false;
        }
        return e(i, deviceCommand, deviceInfoM);
    }

    private boolean e(int i, DeviceCommand deviceCommand, DeviceInfo deviceInfo) {
        this.y = i;
        LogUtil.a("NotifySendData", "sendNotificationCommand parsePromptAbility mMessageType: ", Integer.valueOf(i));
        if (this.y == 1) {
            DeviceCapability deviceCapabilityD = ncp.d(deviceInfo);
            if (deviceCapabilityD == null) {
                LogUtil.j("NotifySendData", "sendNotificationCommand parsePromptAbility, deviceCapability is null");
                return false;
            }
            LogUtil.a("NotifySendData", "sendNotificationCommand parsePromptAbility isPromptPush: ", Integer.valueOf(deviceCapabilityD.isPromptPush()), " mIsSupportPrompt: ", Boolean.valueOf(this.s));
            if (deviceCapabilityD.isPromptPush() == -1) {
                if (!this.s) {
                    return false;
                }
            } else {
                if (((deviceCapabilityD.isPromptPush() >> 1) & 1) != 1) {
                    LogUtil.j("NotifySendData", "sendNotificationCommand pushPromptToDevice, deviceCapability.isPromptPush() is false,device not support prompt");
                    return false;
                }
                LogUtil.j("NotifySendData", "sendNotificationCommand parsePromptAbility, do not need deal");
            }
        }
        lng.i();
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        this.m.sendDeviceData(deviceCommand);
        ReleaseLogUtil.d("R_NotifySendData", "sendNotificationCommand finished pushing tlv deviceCommand");
        return true;
    }

    private DeviceInfo m() {
        synchronized (f42885c) {
            DeviceInfo deviceInfo = null;
            try {
                try {
                    LogUtil.a("NotifySendData", "getCurrentDeviceInfo() enter...");
                    DeviceInfo deviceInfoK = k();
                    if (deviceInfoK == null) {
                        try {
                            List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_AW70_DEVICES, null, "NotifySendData");
                            if (!deviceList.isEmpty()) {
                                deviceInfoK = deviceList.get(0);
                            }
                        } catch (Exception unused) {
                            deviceInfo = deviceInfoK;
                            LogUtil.e("NotifySendData", "getCurrentDeviceInfo() error");
                            return deviceInfo;
                        }
                    }
                    return deviceInfoK;
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Exception unused2) {
            }
        }
    }

    public int b() {
        DeviceInfo deviceInfoM = m();
        if (deviceInfoM != null) {
            return deviceInfoM.getDeviceProtocol();
        }
        return -1;
    }

    public void e(String str) {
        LogUtil.a("NotifySendData", "sendThirdPartyCallingOnMessage phoneNumber is: ", Boolean.valueOf(TextUtils.isEmpty(str)));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(2);
        deviceCommand.setCommandID(1);
        byte[] bArrC = eeq.c(str);
        if (bArrC != null) {
            deviceCommand.setDataLen(bArrC.length);
            deviceCommand.setDataContent(bArrC);
        }
        this.m.sendDeviceData(deviceCommand);
    }

    public void f() {
        LogUtil.a("NotifySendData", "enter sendThirdPartyCallingOffMessage");
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(2);
        deviceCommand.setCommandID(1);
        deviceCommand.setDataLen(0);
        deviceCommand.setDataContent(null);
        this.m.sendDeviceData(deviceCommand);
    }

    private void c(byte[] bArr, int i) {
        try {
            String strE = eeq.e(bArr);
            LogUtil.a("NotifySendData", "parseSupportData tlvsString: ", strE);
            List<eew> listE = new eet().b(strE).e();
            if (listE != null && !listE.isEmpty()) {
                b(listE, i);
            }
        } catch (eeu unused) {
            LogUtil.e("NotifySendData", "parseSupportData TlvException");
        }
    }

    private void b(List<eew> list, int i) {
        for (eew eewVar : list) {
            try {
                e(i, Integer.parseInt(eewVar.e(), 16), eewVar.b());
            } catch (NumberFormatException unused) {
                LogUtil.e("NotifySendData", "valve is not number");
            }
        }
    }

    private void e(int i, int i2, String str) throws NumberFormatException {
        if (i2 != 19) {
            if (i2 != 20) {
                LogUtil.d("NotifySendData", "canNotFindLength");
                return;
            } else {
                b(str, i);
                return;
            }
        }
        if (i == 5) {
            int i3 = Integer.parseInt(str, 16);
            if (i3 == 3) {
                this.w = 2;
            } else {
                this.w = i3;
            }
            LogUtil.d("NotifySendData", "unNotificationContent mYellowPagesFormat: ", Integer.valueOf(this.w));
            return;
        }
        if (i == 6) {
            int i4 = Integer.parseInt(str, 16);
            if (i4 == 3) {
                this.g = 2;
            } else {
                this.g = i4;
            }
            LogUtil.d("NotifySendData", "unNotificationContent mContentSignFormat: ", Integer.valueOf(this.g));
            return;
        }
        if (i != 7) {
            LogUtil.d("NotifySendData", "canNotFindFormat");
            return;
        }
        int i5 = Integer.parseInt(str, 16);
        if (i5 == 3) {
            this.k = 2;
        } else {
            this.k = i5;
        }
        LogUtil.d("NotifySendData", "unNotificationContent mIncomingNumberFormat: ", Integer.valueOf(this.k));
    }

    private void b(byte[] bArr) {
        cpl.d("NotifySendData", bArr, "unNotificationContent enter, data: ");
        for (int i = 0; i < bArr.length; i++) {
            try {
                if (bArr[i] == 18) {
                    byte b2 = bArr[i + 2];
                    if (b2 == 5) {
                        byte[] bArr2 = new byte[9];
                        System.arraycopy(bArr, i, bArr2, 0, 9);
                        this.r = true;
                        LogUtil.a("NotifySendData", "unNotificationContent mIsSupportYellow is true");
                        c(bArr2, 5);
                    } else if (b2 == 6) {
                        byte[] bArr3 = new byte[9];
                        System.arraycopy(bArr, i, bArr3, 0, 9);
                        this.p = true;
                        LogUtil.a("NotifySendData", "unNotificationContent mIsSupportSign is true");
                        c(bArr3, 6);
                    } else if (b2 == 7) {
                        byte[] bArr4 = new byte[9];
                        System.arraycopy(bArr, i, bArr4, 0, 9);
                        this.q = true;
                        ReleaseLogUtil.d("R_NotifySendData", "unNotificationContent mIsSupportIncoming is true");
                        c(bArr4, 7);
                    } else {
                        LogUtil.d("NotifySendData", "can not find Content");
                    }
                }
            } catch (Exception unused) {
                LogUtil.e("NotifySendData", "unNotificationContent, Exception");
                return;
            }
        }
    }

    public DeviceCommand e(int i) {
        String strD = eeq.d(i);
        String str = eeq.d(1) + eeq.d(strD.length() / 2) + strD;
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(2);
        deviceCommand.setCommandID(6);
        deviceCommand.setDataContent(eeq.c(str));
        LogUtil.a("NotifySendData", "deleteMessageToTlv command: ", str);
        deviceCommand.setDataLen(eeq.c(str).length);
        return deviceCommand;
    }

    public DeviceCommand c(Bundle bundle, DeviceCommand deviceCommand) {
        if (deviceCommand == null || bundle == null) {
            LogUtil.j("NotifySendData", "deleteMessageExtendToHex deviceCommand or bundle is null");
            return deviceCommand;
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(eeq.e(deviceCommand.getDataContent())).append(a(bundle)).append(e(3, bundle)).append(c(4, bundle)).append(d(5, bundle)).append(a(6, bundle));
        byte[] bArrC = eeq.c(stringBuffer.toString());
        LogUtil.a("NotifySendData", "deleteMessageExtendToHex command: ", stringBuffer.toString());
        deviceCommand.setDataContent(bArrC);
        deviceCommand.setDataLen(bArrC.length);
        return deviceCommand;
    }

    private boolean b(Bundle bundle) {
        String string = bundle.getString("data_category");
        if (ncp.t() || ncp.c()) {
            return false;
        }
        return (ncp.p() && NotificationCompat.CATEGORY_CALL.equals(string)) ? false : true;
    }

    private String a(Bundle bundle) {
        if (b(bundle)) {
            LogUtil.a("NotifySendData", "packagingDeletePackageNameTlv isSupportRepeatedNotifyProcess false");
            return "";
        }
        String strA = eeq.a(bundle.getString("packagename", ""));
        return eeq.d(2) + ncp.b(strA.length() / 2) + strA;
    }

    private String e(int i, Bundle bundle) {
        if (b(bundle)) {
            LogUtil.a("NotifySendData", "packagingDeleteNotificationKeyTlv isSupportRepeatedNotifyProcess false");
            return "";
        }
        return eeq.e(new cqj().b(i, bundle.getString("data_extra_noty_key", "")).e());
    }

    private String c(int i, Bundle bundle) {
        if (b(bundle)) {
            LogUtil.a("NotifySendData", "packagingDeleteNotificationIdTlv isSupportRepeatedNotifyProcess false");
            return "";
        }
        String strC = eeq.c(bundle.getInt("data_noty_id", -1));
        return eeq.d(i) + ncp.b(strC.length() / 2) + strC;
    }

    private String d(int i, Bundle bundle) {
        if (b(bundle)) {
            LogUtil.a("NotifySendData", "packagingDeleteNotificationIdTlv isSupportRepeatedNotifyProcess false");
            return "";
        }
        String strA = eeq.a(bundle.getString("data_channel_id", ""));
        return eeq.d(i) + ncp.b(strA.length() / 2) + strA;
    }

    @Override // com.huawei.hwdevice.phoneprocess.binder.ParserInterface
    public void getResult(DeviceInfo deviceInfo, byte[] bArr) {
        byte b2 = bArr[0];
        if (b2 == 2) {
            d(bArr);
            a(bArr);
        } else if (b2 == 33) {
            mir.c(bArr, deviceInfo);
        } else {
            LogUtil.d("NotifySendData", "getResult else");
        }
    }

    public boolean c() {
        return this.s;
    }

    public boolean e() {
        return this.t;
    }

    private void b(String str, int i) {
        int iV = (CommonUtil.v(str) / 6) * 6;
        if (iV > 0) {
            if (i == 5) {
                this.ad = iV;
                LogUtil.a("NotifySendData", "unNotificationContent mYellowPagesLength: ", Integer.valueOf(iV));
            } else if (i == 6) {
                this.i = iV;
                LogUtil.a("NotifySendData", "unNotificationContent mContentSignLength: ", Integer.valueOf(iV));
            } else if (i != 7) {
                LogUtil.j("NotifySendData", "can not find length");
            } else {
                this.o = iV;
                LogUtil.a("NotifySendData", "unNotificationContent mIncomingNumberLength: ", Integer.valueOf(iV));
            }
        }
    }

    public void a(byte[] bArr) {
        byte b2 = bArr[1];
        if (b2 == 16) {
            if (ncp.a()) {
                ndl.d().a(bArr);
            }
        } else if (b2 == 11) {
            mlk.a().b(bArr);
        } else if (b2 == 17) {
            ndx.e(bArr);
        } else {
            nby.a().a(bArr);
        }
    }

    public void a(String str) {
        nby.a().c(str);
    }

    public void j() {
        nby.a().h();
    }

    public boolean d() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "NotifySendData");
        LogUtil.j("NotifySendData", "isMessageAlert getDeviceList: ", Integer.valueOf(deviceList.size()));
        if (deviceList.isEmpty()) {
            return false;
        }
        Iterator<DeviceInfo> it = deviceList.iterator();
        while (it.hasNext()) {
            if (ncp.c(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DeviceInfo k() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "NotifySendData");
        if (deviceList != null && deviceList.size() > 0) {
            for (DeviceInfo deviceInfo : deviceList) {
                if (!eel.d(deviceInfo.getProductType())) {
                    return deviceInfo;
                }
            }
        }
        return null;
    }

    public boolean g() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "NotifySendData");
        DeviceInfo deviceInfo = deviceList.size() > 0 ? deviceList.get(0) : null;
        if (deviceInfo == null) {
            LogUtil.j("NotifySendData", "isSplitAnswer deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfo, 74);
    }

    public DeviceCommand b(DeviceCommand deviceCommand) {
        if (deviceCommand == null) {
            LogUtil.j("NotifySendData", "incomingCallMessageExtendToHex deviceCommand is null");
            return deviceCommand;
        }
        try {
            List<BluetoothDevice> listI = BTDeviceMgrUtil.c().i();
            if (listI == null) {
                return deviceCommand;
            }
            StringBuffer stringBuffer = new StringBuffer();
            for (BluetoothDevice bluetoothDevice : listI) {
                stringBuffer.append("incomingCallMessageExtendToHex devicename: ").append(bluetoothDevice.getName()).append(", mac:").append(ncp.e(bluetoothDevice.toString()));
            }
            LogUtil.j("NotifySendData", stringBuffer.toString());
            StringBuffer stringBuffer2 = new StringBuffer(16);
            stringBuffer2.append(eeq.e(deviceCommand.getDataContent())).append(eeq.d(28)).append(eeq.d(1)).append(eeq.d(listI.size()));
            byte[] bArrC = eeq.c(stringBuffer2.toString());
            LogUtil.a("NotifySendData", "incomingCallMessageExtendToHex command: ", stringBuffer2.toString());
            deviceCommand.setDataContent(bArrC);
            deviceCommand.setDataLen(bArrC.length);
            return deviceCommand;
        } catch (SecurityException e2) {
            LogUtil.e("NotifySendData", "discoverClassicDevice SecurityException", ExceptionUtils.c(e2));
            return null;
        }
    }

    private void v() {
        if (!CommonUtil.bg()) {
            try {
                ReleaseLogUtil.d("NotifySendData", "startNotificationWorker");
                RemoteWorkManager.getInstance(BaseApplication.getContext()).enqueueUniquePeriodicWork(PushListenerWatchdogWorker.class.getName(), ExistingPeriodicWorkPolicy.UPDATE, new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) PushListenerWatchdogWorker.class, 15L, TimeUnit.MINUTES).build());
                return;
            } catch (Exception e2) {
                LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
                linkedHashMap.put("brand", String.valueOf(Build.BRAND));
                linkedHashMap.put("androidOS", String.valueOf(Build.VERSION.SDK_INT));
                linkedHashMap.put("devModel", Build.MODEL);
                OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_MESSAGE_PUSH_85070006.value(), linkedHashMap);
                ReleaseLogUtil.e("NotifySendData", "NotificationWorker Exception:", ExceptionUtils.c(e2));
                return;
            }
        }
        ReleaseLogUtil.d("R_NotifySendData", "NotificationWorker not init isHuaweiSystem");
    }

    private void p() {
        try {
            RemoteWorkManager.getInstance(BaseApplication.getContext()).enqueue(new OneTimeWorkRequest.Builder(PushListenerWatchdogWorker.class).setBackoffCriteria(BackoffPolicy.LINEAR, 10L, TimeUnit.SECONDS).build());
        } catch (RuntimeException e2) {
            ReleaseLogUtil.a("NotifySendData", "work enqueue failed:", ExceptionUtils.c(e2));
        }
    }

    public void h() {
        ReleaseLogUtil.d("NotifySendData", "onListenerDisconnected");
        p();
    }
}
