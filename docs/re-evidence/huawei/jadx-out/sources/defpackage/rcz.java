package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.StatFs;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.manager.HwVersionManager;
import com.huawei.login.ui.login.util.SharedPreferenceUtil;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataContans;
import com.huawei.ui.device.R;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class rcz {
    private static rcz e;
    private Context f;
    private String g;
    private elh i;
    private Handler j;
    private boolean m;
    private String p;
    private String q;
    private int t;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f47166b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f47165a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f47167c = null;
    private String d = null;
    private int o = -1;
    private String h = null;
    private String s = "";
    private boolean l = false;
    private EventBus.ICallback k = new EventBus.ICallback() { // from class: rcz.2
        @Override // com.huawei.health.device.util.EventBus.ICallback
        public void onEvent(EventBus.d dVar) {
            if ("set_scale_version_code".equals(dVar.e()) && TextUtils.isEmpty(rcz.this.g)) {
                rcz.this.c(dVar.c());
            }
        }
    };
    private nuu n = nuu.a();

    private rcz(Context context) {
        this.t = 0;
        this.f = context;
        this.t = 0;
    }

    public boolean t() {
        return this.l;
    }

    public void d(Boolean bool) {
        this.l = bool.booleanValue();
    }

    public String n() {
        return this.g;
    }

    public void h(String str) {
        this.g = str;
    }

    public int r() {
        return this.t;
    }

    public void e(int i) {
        this.t = i;
    }

    public String p() {
        return this.s;
    }

    public int l() {
        return this.o;
    }

    public String i() {
        return this.d;
    }

    public void c(String str) {
        this.d = str;
    }

    public String o() {
        return this.f47167c;
    }

    public void j(String str) {
        this.f47167c = str;
    }

    public String g() {
        return this.f47165a;
    }

    public void a(String str) {
        this.f47165a = str;
    }

    public int h() {
        return this.f47166b;
    }

    public void a(int i) {
        this.f47166b = i;
    }

    public void g(String str) {
        this.q = str;
        this.s = m();
    }

    public void b(ContentValues contentValues) {
        String asString = contentValues.getAsString("uniqueId");
        boolean zF = nva.f(this.f, asString);
        LogUtil.a("WeightUpdateInteractors", "checkCurrentDeviceVersion isNewVersion:", Boolean.valueOf(zF));
        if (!zF) {
            LogUtil.j("WeightUpdateInteractors", " checkCurrentDeviceVersion have not NewVersion");
            return;
        }
        this.p = asString;
        this.q = contentValues.getAsString("productId");
        String strM = dxm.m(this.p);
        if (TextUtils.isEmpty(strM)) {
            strM = dxm.m(this.q);
        }
        String str = strM;
        if (TextUtils.isEmpty(str) || "0".equals(str)) {
            return;
        }
        if (this.n == null) {
            this.n = nuu.a();
        }
        HealthDevice healthDeviceB = drw.e().b(this.q);
        boolean zD = nva.d(nva.e(this.f, this.q));
        LogUtil.a("WeightUpdateInteractors", " isAlreadyCheck = ", Boolean.valueOf(zD));
        if (healthDeviceB == null || zD) {
            return;
        }
        if (dxm.ag(this.q)) {
            String strL = dxm.l(this.p);
            if (TextUtils.isEmpty(strL)) {
                strL = dxm.n(this.q);
            }
            this.n.b(this.q, str, strL, true, this.p);
            return;
        }
        this.n.b(this.q, str, healthDeviceB.getAddress(), true, this.p);
    }

    public void d() {
        for (ContentValues contentValues : drw.e().e(HealthDevice.HealthDeviceKind.HDK_WEIGHT)) {
            String asString = contentValues.getAsString("productId");
            if (!dxm.v(asString)) {
                LogUtil.j("WeightUpdateInteractors", "checkHagridNewDeviceVersion is not hagrid");
            } else {
                String asString2 = contentValues.getAsString("uniqueId");
                boolean zF = nva.f(this.f, asString2);
                LogUtil.a("WeightUpdateInteractors", "checkHagridNewDeviceVersion isNewVersion:", Boolean.valueOf(zF));
                if (zF) {
                    LogUtil.j("WeightUpdateInteractors", "checkHagridNewDeviceVersion have new version");
                } else {
                    String strE = nva.e(this.f, asString2);
                    if (!TextUtils.isEmpty(strE) && !m(strE)) {
                        LogUtil.j("WeightUpdateInteractors", "checkHagridNewDeviceVersion less than one day");
                    } else {
                        String strA = nva.a(this.f, asString2);
                        if (TextUtils.isEmpty(strA) || "0".equals(strA)) {
                            return;
                        }
                        if (this.n == null) {
                            this.n = nuu.a();
                        }
                        String strL = dxm.l(asString2);
                        if (TextUtils.isEmpty(strL)) {
                            strL = dxm.n(asString);
                        }
                        nva.a(nvd.b(), this.f, asString2);
                        this.n.b(asString, strA, strL, false, this.p);
                    }
                }
            }
        }
    }

    private boolean m(String str) {
        Date dateD;
        LogUtil.a("WeightUpdateInteractors", "isAlreadyOneDay: lastTime", str);
        if (TextUtils.isEmpty(str) || (dateD = nvd.d(str)) == null) {
            return false;
        }
        long time = dateD.getTime();
        LogUtil.a("WeightUpdateInteractors", "isAlreadyOneDay: System.currentTimeMillis() ", Long.valueOf(System.currentTimeMillis()), " last ", Long.valueOf(time));
        return Math.abs(System.currentTimeMillis() - time) > 86400000;
    }

    public static rcz c() {
        rcz rczVar;
        synchronized (rcz.class) {
            LogUtil.a("WeightUpdateInteractors", "getInstance, mInstance " + e);
            if (e == null) {
                LogUtil.a("WeightUpdateInteractors", "new WeightUpdateInteractors()");
                e = new rcz(BaseApplication.getContext());
            }
            rczVar = e;
        }
        return rczVar;
    }

    public void c(Handler handler) {
        this.j = handler;
    }

    public void e(boolean z, String str) {
        if (this.n == null) {
            this.n = nuu.a();
        }
        if (this.t == 0) {
            this.t = 1;
        }
        this.g = "";
        this.m = z;
        this.p = str;
        LogUtil.d("WeightUpdateInteractors", "doManualCheckDeviceNewVersion,deviceSoftVersion is null");
        EventBus.b(this.k, 0, "set_scale_version_code");
    }

    public void c(Intent intent) {
        if (intent != null) {
            if (dxm.ag(this.q)) {
                this.g = intent.getStringExtra("bleVersion");
                this.h = intent.getStringExtra(HealthEngineRequestManager.PARAMS_DEVICE_SN);
            } else {
                int intExtra = intent.getIntExtra("bleVersion", 65535);
                int intExtra2 = intent.getIntExtra("scaleVersion", 65535);
                this.g = d(intExtra2);
                LogUtil.d("WeightUpdateInteractors", "ble device version bleVersion = ", d(intExtra), ", scale = ", d(intExtra2));
            }
            v();
        }
    }

    public void v() {
        if (this.j != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 3;
            messageObtain.obj = this.g;
            this.j.sendMessage(messageObtain);
        }
        if (dxm.y(this.q) && !this.m && this.j != null) {
            LogUtil.a("WeightUpdateInteractors", "is not main user, send MSG_STOP_PROGRESS.");
            this.j.sendEmptyMessage(6);
        } else {
            if (this.n == null) {
                this.n = nuu.a();
            }
            this.n.b(this.q, this.g, this.h, false, this.p);
        }
    }

    private String d(int i) {
        return (i / 4096) + "." + ((i / 256) % 16) + "." + (i % 256);
    }

    public void j() {
        LogUtil.a("WeightUpdateInteractors", "doDownloadAppFile ");
        if (this.f != null) {
            nuu.a().a(this.q);
        }
    }

    public void b() {
        LogUtil.a("WeightUpdateInteractors", "cancelDownloadApp");
        if (this.f != null) {
            nuu.a().c(this.q);
        }
    }

    public String f() {
        LogUtil.a("WeightUpdateInteractors", "enter getBandCheckNewVersion");
        if (this.f != null) {
            return nuu.a().b(this.q);
        }
        return "";
    }

    public String k() {
        LogUtil.a("WeightUpdateInteractors", "enter getBandStorePath");
        if (this.f != null) {
            return nuu.a().g(this.q);
        }
        return "";
    }

    public boolean a(long j) {
        LogUtil.a("WeightUpdateInteractors", "checkMemory needSize = " + j);
        try {
            StatFs statFs = new StatFs(this.f.getFilesDir().getCanonicalPath());
            return ((long) (((double) (((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize()))) * 0.9d)) > j;
        } catch (IOException e2) {
            LogUtil.e("WeightUpdateInteractors", "checkMemory " + e2.getMessage());
            return false;
        }
    }

    public boolean u() {
        LogUtil.a("WeightUpdateInteractors", "isWifiConnected");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1;
    }

    public boolean q() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.getType() == 0;
    }

    public String f(String str) {
        Context context = this.f;
        if (context != null) {
            return HwVersionManager.b(context).t(str);
        }
        return "";
    }

    public elh e(String str) {
        elh elhVarD = ResourceManager.c().d(str);
        this.i = elhVarD;
        return elhVarD;
    }

    public void b(Bundle bundle) {
        LogUtil.a("WeightUpdateInteractors", "Enter initHagridNpsRequestDeviceInfo !");
        if (bundle == null) {
            return;
        }
        lrw.m(bundle.getString("deviceUniqueId"));
        String string = bundle.getString("deviceVersion");
        String string2 = bundle.getString("deviceModel");
        int i = bundle.getInt("productType");
        String string3 = bundle.getString(MatterDataContans.KEY_MAC_ADDRESS);
        String string4 = bundle.getString(HealthEngineRequestManager.PARAMS_DEVICE_SN);
        lrw.h(string);
        lrw.j(string2);
        String strC = nio.c(string3);
        lrw.i(strC);
        lrw.o(string4);
        LogUtil.a("WeightUpdateInteractors", "initWeightNpsRequestDeviceInfo deviceVersion: ", string, " deviceModel: ", string2, " productType: ", Integer.valueOf(i), " encoder: ", strC);
        lrw.n(string2);
        LogUtil.a("WeightUpdateInteractors", "initWeightNpsRequestDeviceInfo Name : ", string2);
        lsy.a(new Runnable() { // from class: rde
            @Override // java.lang.Runnable
            public final void run() {
                this.d.y();
            }
        });
    }

    /* synthetic */ void y() {
        lrw.a(GRSManager.c(this.f).getCommonCountryCode());
    }

    public boolean b(String str) {
        LogUtil.a("WeightUpdateInteractors", "isOtaFileExist(): path = " + str);
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("WeightUpdateInteractors", "isOtaFileExist() error, file path is empty...");
            return false;
        }
        boolean zExists = new File(str).exists();
        LogUtil.a("WeightUpdateInteractors", "isOtaFileExist: isExist = " + zExists);
        return zExists;
    }

    public void e(Boolean bool) {
        if (bool.booleanValue()) {
            b(1);
        }
    }

    public void d(String str) {
        if (drw.e().b(this.q) == null) {
            return;
        }
        this.p = str;
        b(3);
    }

    private void b(final int i) {
        final MessageCenterApi messageCenterApi = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
        messageCenterApi.getMessages(String.valueOf(19), "device_scale_ota", new IBaseResponseCallback() { // from class: rcz.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                List list;
                if (i2 != 0 || obj == null) {
                    return;
                }
                try {
                    list = (List) obj;
                } catch (ClassCastException e2) {
                    LogUtil.a("WeightUpdateInteractors", "ClassCastException :" + e2.getMessage());
                    list = null;
                }
                if (rcz.this.b((List<MessageObject>) list)) {
                    LogUtil.a("WeightUpdateInteractors", "has message donot makeMessage.");
                    if (i == 3) {
                        rcz.this.x();
                        return;
                    }
                    return;
                }
                messageCenterApi.getMessageId(String.valueOf(19), "device_scale_ota", new IBaseResponseCallback() { // from class: rcz.1.2
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i3, Object obj2) {
                        LogUtil.a("WeightUpdateInteractors", "getEventAlarm() err_code = " + i3);
                        if (i3 == 0 && obj2 != null && (obj2 instanceof String)) {
                            rcz.this.b(messageCenterApi, i, obj2);
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(MessageCenterApi messageCenterApi, int i, Object obj) {
        String str = (String) obj;
        LogUtil.a("WeightUpdateInteractors", "generateConnectedMessage messageId = " + str);
        MessageObject messageObject = new MessageObject();
        messageObject.setMsgId(str);
        messageObject.setModule(String.valueOf(19));
        messageObject.setType("device_scale_ota");
        messageObject.setMsgType(2);
        messageObject.setPosition(i);
        messageObject.setHuid(SharedPreferenceUtil.getInstance(this.f).getUserID());
        String string = this.f.getString(R.string.IDS_messagecenter_device_scale);
        messageObject.setMsgTitle(string);
        LogUtil.a("WeightUpdateInteractors", "generateConnectedMessage mstTitle = " + string);
        String str2 = String.format(Locale.ENGLISH, this.f.getString(R.string.IDS_messagecenter_device_need_upgrade_title), m());
        messageObject.setMsgContent(str2);
        messageObject.setReadFlag(0);
        LogUtil.a("WeightUpdateInteractors", "generateConnectedMessage mstContent = " + str2);
        messageObject.setCreateTime(System.currentTimeMillis());
        messageObject.setDetailUri("messagecenter://device_scale_ota?key=" + this.q + "&uniqueId=" + this.p);
        messageCenterApi.insertMessage(messageObject);
        if (i == 3) {
            x();
        }
        LogUtil.a("WeightUpdateInteractors", "generateConnectedMessage leave");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        MessageObject messageObject = new MessageObject();
        messageObject.setModule(String.valueOf(19));
        messageObject.setType("device_scale_ota");
        messageObject.setHuid(SharedPreferenceUtil.getInstance(this.f).getUserID());
        String string = this.f.getString(R.string.IDS_messagecenter_device_scale);
        messageObject.setMsgTitle(string);
        LogUtil.a("WeightUpdateInteractors", "generateConnectedMessage mstTitle = " + string);
        String str = String.format(Locale.ENGLISH, this.f.getString(R.string.IDS_messagecenter_device_need_upgrade_title), m());
        messageObject.setMsgContent(str);
        LogUtil.a("WeightUpdateInteractors", "generateConnectedMessage mstContent = " + str);
        messageObject.setCreateTime(System.currentTimeMillis());
        messageObject.setDetailUri("messagecenter://device_scale_ota?key=" + this.q + "&uniqueId=" + this.p);
        messageObject.setMsgId("D201809201048");
        messageObject.setWeight(1);
        messageObject.setPosition(3);
        LogUtil.a("WeightUpdateInteractors", "end_to_set_message");
        ((MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class)).updateMessageNotification(this.f, messageObject, 20180920L);
        LogUtil.a("WeightUpdateInteractors", "end_makeMessage");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(List<MessageObject> list) {
        LogUtil.a("WeightUpdateInteractors", "isScaleMessageExists enter");
        if (list == null) {
            LogUtil.j("WeightUpdateInteractors", "isScaleMessageExists messageList is null");
            return false;
        }
        Iterator<MessageObject> it = list.iterator();
        while (it.hasNext()) {
            if ("device_scale_ota".equals(Uri.parse(it.next().getDetailUri()).getHost())) {
                LogUtil.a("WeightUpdateInteractors", "isScaleMessageExists message exists");
                return true;
            }
        }
        LogUtil.a("WeightUpdateInteractors", "isScaleMessageExists message not exists");
        return false;
    }

    public String m() {
        LogUtil.a("WeightUpdateInteractors", "productId " + this.q);
        if (TextUtils.isEmpty(this.q)) {
            return "";
        }
        if ("34fa0346-d46c-439d-9cb0-2f696618846b".equals(this.q)) {
            return this.f.getResources().getString(R.string.IDS_device_huawei_body_fat_scale_name);
        }
        if ("ccd1f0f8-8c57-4bd7-a884-0ef38482f15f".equals(this.q)) {
            return this.f.getResources().getString(R.string.IDS_device_honor_smart_scale_name);
        }
        if ("33123f39-7fc1-420b-9882-a4b0d6c61100".equals(this.q)) {
            return this.f.getResources().getString(R.string.IDS_device_huawei_body_fat_scale_name);
        }
        if ("25c6df38-ca23-11e9-a32f-2a2ae2dbcce4".equals(this.q)) {
            return this.f.getResources().getString(R.string.IDS_device_honor_scale_name);
        }
        if ("8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4".equals(this.q)) {
            return this.f.getResources().getString(R.string.IDS_device_hygride_pro_name);
        }
        LogUtil.a("WeightUpdateInteractors", "get deviceName from ProductInfo");
        return dxm.o(this.q);
    }

    private void a(boolean z) {
        LogUtil.a("WeightUpdateInteractors", "enter deleteMessage");
        MessageCenterApi messageCenterApi = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
        List<MessageObject> messages = messageCenterApi.getMessages(String.valueOf(19), "device_scale_ota");
        LogUtil.a("WeightUpdateInteractors", "makeMessage, delete messageList, messageList.size() = " + messages.size());
        for (int i = 0; i < messages.size(); i++) {
            try {
                if (!z) {
                    messageCenterApi.deleteMessage(messages.get(i).getMsgId());
                }
                messageCenterApi.cancelNotification(20180920);
                LogUtil.a("WeightUpdateInteractors", "cancelNotification device ota");
            } catch (NumberFormatException e2) {
                LogUtil.a("WeightUpdateInteractors", "delete error" + e2.getMessage());
                return;
            }
        }
    }

    public void d(boolean z) {
        a(z);
        LogUtil.a("WeightUpdateInteractors", "enter deleteMessage ture");
    }

    public void e() {
        a(false);
        LogUtil.a("WeightUpdateInteractors", "enter deleteMessage false");
    }

    public void s() {
        LogUtil.a("WeightUpdateInteractors", "initUpdateInteractors");
        ThreadPoolManager.c().a("WeightUpdateInteractors", new Runnable() { // from class: rda
            @Override // java.lang.Runnable
            public final void run() {
                this.d.e();
            }
        });
        if (this.f != null) {
            nuu.a().d(this.q, this.p);
        }
        this.t = 0;
        this.f47166b = 0;
        this.f47165a = null;
        this.f47167c = null;
        this.d = "";
        this.o = -1;
        this.h = null;
        this.s = null;
        this.i = null;
        this.n = null;
    }

    public void a() {
        if (this.n == null) {
            this.n = nuu.a();
        }
        LogUtil.a("WeightUpdateInteractors", "enter deleteDfu");
        this.n.d(this.q);
    }

    public void w() {
        LogUtil.a("WeightUpdateInteractors", "enter release");
        this.n = null;
        this.g = null;
        EventBus.a(this.k, "set_scale_version_code");
    }

    public void b(Boolean bool) {
        if (this.f != null) {
            nuu.a().d(bool);
        }
    }

    public void i(String str) {
        this.h = str;
    }
}
