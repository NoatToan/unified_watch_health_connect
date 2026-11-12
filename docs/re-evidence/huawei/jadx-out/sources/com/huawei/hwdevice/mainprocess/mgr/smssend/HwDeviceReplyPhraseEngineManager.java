package com.huawei.hwdevice.mainprocess.mgr.smssend;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevicemgr.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.unitedevice.constant.ConnectState;
import com.huawei.unitedevice.constant.WearEngineModule;
import com.huawei.unitedevice.manager.EngineLogicBaseManager;
import defpackage.eeq;
import defpackage.ees;
import defpackage.eet;
import defpackage.eeu;
import defpackage.eew;
import defpackage.eey;
import defpackage.mgg;
import defpackage.xiu;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class HwDeviceReplyPhraseEngineManager extends EngineLogicBaseManager {
    private static HwDeviceReplyPhraseEngineManager d;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f17393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Callback f17394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f17395c;

    public interface Callback {
        void onResponse(List<String> list);
    }

    private HwDeviceReplyPhraseEngineManager(Context context) {
        super(context);
        this.f17393a = new Handler(Looper.getMainLooper());
        this.f17395c = new ArrayList(16);
        LogUtil.a("HwDeviceReplyPhraseEngineManager", "HwDeviceReplyPhraseEngineManager enter");
    }

    public static HwDeviceReplyPhraseEngineManager a() {
        HwDeviceReplyPhraseEngineManager hwDeviceReplyPhraseEngineManager;
        synchronized (e) {
            if (d == null) {
                d = new HwDeviceReplyPhraseEngineManager(BaseApplication.getContext());
            }
            hwDeviceReplyPhraseEngineManager = d;
        }
        return hwDeviceReplyPhraseEngineManager;
    }

    public void c() {
        super.onDestroy();
        g();
    }

    private static void g() {
        synchronized (e) {
            d = null;
        }
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onReceiveDeviceCommand(DeviceInfo deviceInfo, int i, xiu xiuVar) {
        LogUtil.a("HwDeviceReplyPhraseEngineManager", "onReceiveDeviceCommand errorCode:", Integer.valueOf(i));
        if (xiuVar == null) {
            LogUtil.j("HwDeviceReplyPhraseEngineManager", "onReceiveDeviceCommand message is null");
            return;
        }
        byte[] bArrB = xiuVar.b();
        LogUtil.a("HwDeviceReplyPhraseEngineManager", "onReceiveDeviceCommand messageData:", eeq.e(bArrB));
        if (bArrB == null || bArrB.length < 6) {
            LogUtil.j("HwDeviceReplyPhraseEngineManager", "onReceiveDeviceCommand messageData is invalid");
            return;
        }
        String strE = eeq.e(bArrB);
        int iV = CommonUtil.v(strE.substring(4, 12));
        LogUtil.a("HwDeviceReplyPhraseEngineManager", "onReceiveDeviceCommand msgType:", Integer.valueOf(iV));
        if (iV == 7003) {
            b(b());
        }
        if (iV == 7001) {
            e(strE);
        }
    }

    public List<String> b() {
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(BaseApplication.getContext().getResources().getString(R.string.IDS_sms_reply_text_ok));
        arrayList.add(BaseApplication.getContext().getResources().getString(R.string.IDS_sms_reply_text_yes));
        arrayList.add(BaseApplication.getContext().getResources().getString(R.string.IDS_sms_reply_text_thanks));
        arrayList.add(BaseApplication.getContext().getResources().getString(R.string.IDS_sms_reply_text_no_thanks));
        arrayList.add(BaseApplication.getContext().getResources().getString(R.string.IDS_sms_reply_text_great));
        arrayList.add(BaseApplication.getContext().getResources().getString(R.string.IDS_sms_reply_text_please));
        arrayList.add(BaseApplication.getContext().getResources().getString(R.string.IDS_sms_reply_text_see_you));
        arrayList.add(BaseApplication.getContext().getResources().getString(R.string.IDS_sms_reply_text_later));
        arrayList.add(BaseApplication.getContext().getResources().getString(R.string.IDS_sms_reply_text_busy));
        arrayList.add(BaseApplication.getContext().getResources().getString(R.string.IDS_sms_reply_text_no));
        return arrayList;
    }

    private void e(String str) {
        if (str.length() < 12) {
            LogUtil.j("HwDeviceReplyPhraseEngineManager", "handleQueryMessage resultDataHex less 12");
        } else {
            d(str);
        }
    }

    private void d(String str) {
        ees eesVarB;
        try {
            eesVarB = new eet().b(str);
        } catch (eeu unused) {
            LogUtil.e("HwDeviceReplyPhraseEngineManager", "parseSmsQueryResult TlvException");
            eesVarB = null;
        }
        if (eesVarB == null) {
            LogUtil.j("HwDeviceReplyPhraseEngineManager", "parseSmsQueryResult tlvFather is null");
            return;
        }
        List<ees> listB = eesVarB.b();
        this.f17395c.clear();
        if (listB == null || listB.isEmpty()) {
            LogUtil.j("HwDeviceReplyPhraseEngineManager", "parseSmsQueryResult tlvFatherList is null");
            Callback callback = this.f17394b;
            if (callback != null) {
                callback.onResponse(this.f17395c);
            }
            b(b());
            return;
        }
        ees eesVar = listB.get(0);
        if (eesVar == null) {
            LogUtil.j("HwDeviceReplyPhraseEngineManager", "parseSmsQueryResult tlvAppList is null");
            return;
        }
        Iterator<ees> it = eesVar.b().iterator();
        while (it.hasNext()) {
            for (eew eewVar : it.next().e()) {
                int iB = CommonUtil.b(eewVar.e(), 16);
                if (iB == 1) {
                    LogUtil.a("HwDeviceReplyPhraseEngineManager", "parseSmsQueryResult received 7001");
                } else if (iB != 4) {
                    LogUtil.j("HwDeviceReplyPhraseEngineManager", "parseSmsQueryResult default");
                } else {
                    String strD = eeq.d(eewVar.b());
                    this.f17395c.add(strD);
                    LogUtil.a("HwDeviceReplyPhraseEngineManager", "parseSmsQueryResult smsContent: ", strD);
                }
            }
        }
        LogUtil.a("HwDeviceReplyPhraseEngineManager", "mCallback is null:", Boolean.valueOf(this.f17394b == null));
        Callback callback2 = this.f17394b;
        if (callback2 != null) {
            callback2.onResponse(this.f17395c);
        }
    }

    public void j() {
        LogUtil.a("HwDeviceReplyPhraseEngineManager", "sendSmsQueryCommand enter");
        e(eeq.c(eeq.d(1) + eeq.d(4) + eeq.c(7001L)));
    }

    public void c(Callback callback) {
        LogUtil.a("HwDeviceReplyPhraseEngineManager", "addCallback");
        this.f17394b = callback;
    }

    public void i() {
        if (d()) {
            LogUtil.a("HwDeviceReplyPhraseEngineManager", "sendCommandConnected send");
            e(eeq.c(eeq.d(1) + eeq.d(4) + eeq.c(7003L)));
        }
    }

    public void b(List<String> list) {
        String str;
        if (list == null) {
            LogUtil.j("HwDeviceReplyPhraseEngineManager", "sendSmsSettingCommand smsList is null");
            return;
        }
        String str2 = eeq.d(1) + eeq.d(4) + eeq.c(7002L);
        StringBuffer stringBuffer = new StringBuffer(16);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String strA = eeq.a(it.next());
            String str3 = eeq.d(4) + eeq.b(strA.length() / 2) + strA;
            stringBuffer.append((eeq.d(131) + eeq.b(str3.length() / 2)) + str3);
        }
        if (stringBuffer.length() == 0) {
            str = eeq.d(2) + eeq.d(0);
        } else {
            str = eeq.d(130) + eeq.b(stringBuffer.length() / 2);
        }
        String str4 = str2 + str + stringBuffer.toString();
        LogUtil.a("HwDeviceReplyPhraseEngineManager", "sendSmsSettingCommand commandHex:", str4);
        e(eeq.c(str4));
    }

    public void e(byte[] bArr) {
        sendComand(new xiu.c().a(bArr).c(), new SendCallback() { // from class: com.huawei.hwdevice.mainprocess.mgr.smssend.HwDeviceReplyPhraseEngineManager.3
            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendProgress(long j) {
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onSendResult(int i) {
                LogUtil.a("HwDeviceReplyPhraseEngineManager", "sendCommand onSendResult: ", Integer.valueOf(i));
            }

            @Override // com.huawei.health.deviceconnect.callback.SendCallback
            public void onFileTransferReport(String str) {
                LogUtil.a("HwDeviceReplyPhraseEngineManager", "sendCommand onFileTransferReport transferWay: ", str);
            }
        });
    }

    public boolean d() {
        DeviceInfo deviceInfoD = mgg.d("HwDeviceReplyPhraseEngineManager");
        if (deviceInfoD == null) {
            LogUtil.j("HwDeviceReplyPhraseEngineManager", "isSupportEditSms deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfoD, 82);
    }

    public void e() {
        LogUtil.a("HwDeviceReplyPhraseEngineManager", "onChangeLanguage: ", CommonUtil.z());
        this.f17393a.postDelayed(new Runnable() { // from class: com.huawei.hwdevice.mainprocess.mgr.smssend.HwDeviceReplyPhraseEngineManager.2
            @Override // java.lang.Runnable
            public void run() {
                HwDeviceReplyPhraseEngineManager.this.j();
            }
        }, 2000L);
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public WearEngineModule getManagerModule() {
        return WearEngineModule.SMS_EDITABLE_APP_MODULE;
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearPkgName() {
        return "com.huawei.watch.home";
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public String getWearFingerprint() {
        return "603AC6A57E2023E00C9C93BB539CA653DF3003EBA4E92EA1904BA4AAA5D938F0";
    }

    @Override // com.huawei.unitedevice.manager.EngineLogicBaseManager
    public void onDeviceConnectionChange(ConnectState connectState, DeviceInfo deviceInfo) {
        LogUtil.a("HwDeviceReplyPhraseEngineManager", "onDeviceConnectionChange", connectState);
        if (ConnectState.CONNECTED.equals(connectState)) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.hwdevice.mainprocess.mgr.smssend.HwDeviceReplyPhraseEngineManager.1
                @Override // java.lang.Runnable
                public void run() {
                    HwDeviceReplyPhraseEngineManager.this.i();
                }
            });
        }
    }
}
