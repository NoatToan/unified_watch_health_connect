package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.huawei.datatype.PayApduInfo;
import com.huawei.datatype.PayOpenChannelInfo;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwpaymgr.HwPayManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.nfc.PluginPayAdapter;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class mdt {
    private static mdt d;
    private String i;
    private String j;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f41480c = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f41479b = new Object();
    private Map<String, String> l = new HashMap(16);
    private HashMap<mdh, String> g = new HashMap<>(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<Integer, Object> f41481a = new HashMap(16);
    private int o = 2;
    private int m = 0;
    private IBaseResponseCallback h = new IBaseResponseCallback() { // from class: mdt.1
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("R_ApduServer", "send apdu onResponse, errorCode: ", Integer.valueOf(i));
            if (i != 0) {
                Iterator it = mdt.this.f41481a.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    LogUtil.d("ApduServer", "fail entry.getKey:", entry.getKey(), "entry.getValue:", entry.getValue());
                    mdt.this.i = null;
                    it.remove();
                }
                mdt.this.j();
                LogUtil.j("ApduServer", "fail, unlockAndRemoveAll, map.size: ", Integer.valueOf(mdt.this.f41481a.size()));
                return;
            }
            if (obj instanceof PayApduInfo) {
                PayApduInfo payApduInfo = (PayApduInfo) obj;
                mdt.this.i = payApduInfo.getApdu();
                mdt.this.j();
                mdt.this.f41481a.remove(Integer.valueOf(payApduInfo.getReqid()));
                int reqid = payApduInfo.getReqid();
                LogUtil.a("R_ApduServer", "success ,unlockAndRemove,reqId: ", Integer.valueOf(reqid), " lockObject: ", mdt.this.f41481a.get(Integer.valueOf(payApduInfo.getReqid())));
            }
        }
    };
    private BroadcastReceiver f = new BroadcastReceiver() { // from class: mdt.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            DeviceInfo deviceInfo;
            if (context == null) {
                LogUtil.j("ApduServer", "mConnectStateChangedReceiver, context is null");
                return;
            }
            if (intent == null) {
                LogUtil.j("ApduServer", "mConnectStateChangedReceiver, intent is null");
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                LogUtil.j("ApduServer", "mConnectStateChangedReceiver, intentAction is null.");
                return;
            }
            if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(action)) {
                try {
                    deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo");
                } catch (ClassCastException unused) {
                    LogUtil.e("ApduServer", "mConnectStateChangedReceiver, ClassCastException exception");
                    deviceInfo = null;
                }
                if (deviceInfo == null) {
                    LogUtil.j("ApduServer", "mConnectStateChangedReceiver, deviceInfo is null");
                    return;
                }
                if (deviceInfo.getRelationship() != null && "followed_relationship".equals(deviceInfo.getRelationship())) {
                    LogUtil.j("ApduServer", "This device does not have the correspond capability.");
                    return;
                }
                mdt.this.o = deviceInfo.getDeviceConnectState();
                LogUtil.a("ApduServer", "mConnectStateChangedReceiver, onConnectStateChange state:", Integer.valueOf(mdt.this.o));
                if (mdt.this.o != 2) {
                    mdt.this.i = null;
                } else {
                    LogUtil.a("ApduServer", "mConnectStateChangedReceiver, device is connect");
                }
            }
        }
    };

    private mdt() {
    }

    public static mdt d() {
        mdt mdtVar;
        synchronized (f41479b) {
            if (d == null) {
                d = new mdt();
            }
            mdtVar = d;
        }
        return mdtVar;
    }

    public void b() {
        this.o = mdy.e();
        BroadcastManagerUtil.c(BaseApplication.getContext(), this.f, new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED"), LocalBroadcast.f36595c, null);
    }

    public void h() {
        try {
            BaseApplication.getContext().unregisterReceiver(this.f);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("ApduServer", "unRegisterConnectStateChangeReceiver IllegalArgumentException");
        } catch (IllegalStateException unused2) {
            LogUtil.e("ApduServer", "unRegisterConnectStateChangeReceiver IllegalStateException");
        }
        this.i = null;
        this.j = null;
        this.m = 0;
        this.l.clear();
        this.g.clear();
        this.f41481a.clear();
    }

    private String d(String str) {
        int iV = (CommonUtil.v(str.length() >= 10 ? str.substring(8, 10) : "") * 2) + 10;
        return str.length() >= iV ? str.substring(10, iV) : "";
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public mdf<mdh> c(List<mda> list, mdh mdhVar) {
        String strE;
        mdf<mdh> mdfVar = new mdf<>();
        if (list == null || list.isEmpty()) {
            LogUtil.j("ApduServer", "apduList is isEmpty or is null");
            return a(mdfVar, mdhVar, 1004);
        }
        d(list);
        a(mdhVar.b(), 0);
        for (mda mdaVar : list) {
            LogUtil.d("ApduServer", "ApduCommand command:", mdaVar);
            mdfVar.b(mdaVar);
            if (TextUtils.isEmpty(mdaVar.a())) {
                return a(mdfVar, mdhVar, 1001);
            }
            if (mdaVar.a().toUpperCase(Locale.getDefault()).startsWith("00A40400")) {
                String strD = d(mdaVar.a());
                if (!TextUtils.isEmpty(this.g.get(mdhVar))) {
                    a();
                }
                mdhVar.d(strD);
                Map mapA = a(strD, mdhVar.c());
                if (mapA != null) {
                    c(mdhVar, mapA, mdaVar);
                } else {
                    try {
                        strE = e("00", mdaVar.a());
                        if (!TextUtils.isEmpty(strE) || strE.length() < 4) {
                            return a(mdfVar, mdhVar, 4001);
                        }
                        if (a(mdaVar.a(), strE)) {
                            LogUtil.a("ApduServer", "need init ese");
                            return a(mdfVar, mdhVar, 4003);
                        }
                        mdaVar.b(strE);
                        String upperCase = mdaVar.e().toUpperCase(Locale.getDefault());
                        if (mdaVar.b() != null && !upperCase.matches(mdaVar.b())) {
                            mdfVar.b(mdaVar);
                            LogUtil.d("ApduServer", "executeApduList fail sw:", mdaVar.e());
                            return a(mdfVar, mdhVar, 4002);
                        }
                    } catch (mdc e2) {
                        return a(mdfVar, mdhVar, e2.d());
                    }
                }
            } else {
                strE = e("00", mdaVar.a());
                if (!TextUtils.isEmpty(strE)) {
                }
                return a(mdfVar, mdhVar, 4001);
            }
        }
        mdfVar.a(mdhVar);
        return mdfVar;
    }

    private void c(mdh mdhVar, Map<String, String> map, mda mdaVar) {
        LogUtil.d("ApduServer", "ApduServer executeApduList selectResp:", map.get(PluginPayAdapter.KEY_OPEN_CHANNEL_ID));
        mdaVar.b(map.get(PluginPayAdapter.KEY_OPEN_CHANNEL_ID));
        this.g.put(mdhVar, map.get(PluginPayAdapter.KEY_OPEN_CHANNEL_APDU));
    }

    private boolean a(String str, String str2) {
        if (str.length() > 4) {
            int iV = CommonUtil.v(str.substring(0, 2));
            String strSubstring = str.substring(2, 4);
            if ((iV & 128) == 128 && strSubstring.equals("E6") && str.contains("D2760000850101") && str2.contains("6A88")) {
                return true;
            }
            if (strSubstring.equals("E0") && str.contains("D2760000850101") && str2.contains("6E00")) {
                return true;
            }
            LogUtil.j("ApduServer", "isNeedInitEse else branch");
        }
        return false;
    }

    private mdf<mdh> a(mdf<mdh> mdfVar, mdh mdhVar, int i) {
        mdfVar.a(mdhVar);
        mdfVar.c(i);
        LogUtil.a("ApduServer", "ApduServer setResult resultCode:", Integer.valueOf(i));
        return mdfVar;
    }

    private void d(List<mda> list) {
        for (mda mdaVar : list) {
            mdaVar.d("");
            mdaVar.c("");
        }
    }

    public String e(String str, String str2) throws mdc {
        LogUtil.a("ApduServer", "executeApdu channelId:", str, "responseApdu:", str2);
        this.i = null;
        if (str2 == null) {
            LogUtil.j("ApduServer", "executeApdu responseApdu is null");
            return this.i;
        }
        if (!c()) {
            LogUtil.j("ApduServer", "executeApdu disConnected");
            return this.i;
        }
        int iG = g();
        this.f41481a.put(Integer.valueOf(iG), new Object());
        PayApduInfo payApduInfo = new PayApduInfo();
        payApduInfo.setApdu(str2);
        payApduInfo.setReqid(iG);
        try {
            payApduInfo.setChannelId(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            LogUtil.e("ApduServer", "executeApdu channelId NumberFormatException");
        }
        LogUtil.a("ApduServer", "PayApduInfo:", payApduInfo.toString());
        HwPayManager.e().c(payApduInfo, this.h);
        i();
        LogUtil.a("ApduServer", "executeApdu mApduResponse:", this.i);
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        synchronized (this) {
            notifyAll();
        }
    }

    private void i() {
        synchronized (this) {
            try {
                wait();
            } catch (InterruptedException unused) {
                LogUtil.e("ApduServer", "lock InterruptedException");
            }
        }
    }

    private int g() {
        if (this.m == Integer.MAX_VALUE) {
            this.m = 1;
        }
        int i = this.m;
        this.m = i + 1;
        return i;
    }

    public boolean c() {
        return this.o == 2;
    }

    public Map a(String str, int i) {
        synchronized (e) {
            this.l = new HashMap(16);
            LogUtil.a("ApduServer", "openChannel channelType:", Integer.valueOf(i));
            if (!c()) {
                LogUtil.j("ApduServer", "is not connected");
                return this.l;
            }
            HwPayManager.e().c(str, i, new IBaseResponseCallback() { // from class: mdt.5
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    LogUtil.a("ApduServer", "openChannel response errorCode:", Integer.valueOf(i2));
                    if (i2 != 0 || !(obj instanceof PayOpenChannelInfo)) {
                        mdt.this.l.clear();
                    } else {
                        PayOpenChannelInfo payOpenChannelInfo = (PayOpenChannelInfo) obj;
                        mdt.this.l.put(PluginPayAdapter.KEY_OPEN_CHANNEL_APDU, payOpenChannelInfo.getApdu());
                        mdt.this.l.put(PluginPayAdapter.KEY_OPEN_CHANNEL_ID, payOpenChannelInfo.getChannelId() + "");
                    }
                    mdt.this.j();
                }
            });
            i();
            return this.l;
        }
    }

    public void a() {
        synchronized (f41480c) {
            LogUtil.a("ApduServer", "closeChannel enter");
            if (!c()) {
                LogUtil.j("ApduServer", "is not connected");
            } else {
                HwPayManager.e().e(new IBaseResponseCallback() { // from class: mdt.4
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i, Object obj) {
                        if (i == 0) {
                            LogUtil.a("ApduServer", "closeChannel success");
                        } else {
                            LogUtil.j("ApduServer", "closeChannel fail");
                        }
                    }
                });
            }
        }
    }

    public String e() {
        LogUtil.a("ApduServer", "getCplc enter");
        if (!TextUtils.isEmpty(this.j)) {
            return this.j;
        }
        if (!c()) {
            LogUtil.j("ApduServer", "get mCplc is not connected");
            return this.j;
        }
        HwPayManager.e().b(new IBaseResponseCallback() { // from class: mdt.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("ApduServer", "PluginPayAdapterImpl getCplc onResponse errorCode :", Integer.valueOf(i));
                if (i != 0 || !(obj instanceof String)) {
                    mdt.this.j = null;
                } else {
                    mdt.this.j = (String) obj;
                }
                mdt.this.j();
            }
        });
        if (TextUtils.isEmpty(this.j)) {
            i();
        }
        return this.j;
    }
}
