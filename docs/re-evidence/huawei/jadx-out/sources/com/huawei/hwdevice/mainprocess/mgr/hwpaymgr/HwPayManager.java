package com.huawei.hwdevice.mainprocess.mgr.hwpaymgr;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.callback.BluetoothDataReceiveCallback;
import com.huawei.datatype.DeviceCommand;
import com.huawei.datatype.PayApduInfo;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.manager.powerkit.PowerKitManager;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.nfc.WalletResponseListener;
import com.huawei.operation.utils.Constants;
import defpackage.eeq;
import defpackage.ees;
import defpackage.eet;
import defpackage.eeu;
import defpackage.eew;
import defpackage.lvb;
import defpackage.mbf;
import defpackage.mbg;
import defpackage.mbh;
import defpackage.mbk;
import defpackage.mbl;
import defpackage.mbm;
import defpackage.mbn;
import defpackage.mbo;
import defpackage.mbp;
import defpackage.mih;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class HwPayManager extends HwBaseManager implements BluetoothDataReceiveCallback {
    private static HwPayManager d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConnectStateChangeCallback f17372a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f17373c;
    private final BroadcastReceiver f;
    private lvb g;
    private WalletResponseListener i;
    private eet j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<Integer, List<IBaseResponseCallback>> f17371b = new HashMap(0);
    private static List<Integer> e = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24));

    public interface ConnectStateChangeCallback {
        void onConnectStateChange(int i);
    }

    private HwPayManager(Context context) {
        super(context);
        this.f17372a = null;
        this.j = new eet();
        this.f = new BroadcastReceiver() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwpaymgr.HwPayManager.5
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (intent == null) {
                    LogUtil.j("HwPayManager", "mConnectStateChangedReceiver intent is null");
                    return;
                }
                LogUtil.a("HwPayManager", "HwPayManager connectedChanged mNonLocalBroadcastReceiver: intent : ", intent.getAction());
                String action = intent.getAction();
                if (action == null) {
                    return;
                }
                if (!"com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(action)) {
                    LogUtil.j("HwPayManager", "deviceInfo is null!");
                    return;
                }
                Parcelable parcelableExtra = intent.getParcelableExtra("deviceinfo");
                if (parcelableExtra == null || !(parcelableExtra instanceof DeviceInfo)) {
                    LogUtil.j("HwPayManager", "deviceInfo is null!");
                    return;
                }
                DeviceInfo deviceInfo = (DeviceInfo) parcelableExtra;
                if (!TextUtils.isEmpty(deviceInfo.getRelationship()) && !"main_relationship".equals(deviceInfo.getRelationship())) {
                    LogUtil.a("HwPayManager", "This device does not have the correspond capability.");
                    return;
                }
                int deviceConnectState = deviceInfo.getDeviceConnectState();
                LogUtil.d("HwPayManager", "connectedChanged: ", deviceInfo.getDeviceName(), ",state : ", Integer.valueOf(deviceConnectState));
                HwPayManager.this.c(deviceConnectState);
                if (HwPayManager.this.f17372a != null) {
                    HwPayManager.this.f17372a.onConnectStateChange(deviceConnectState);
                }
                WalletResponseListener walletResponseListener = HwPayManager.this.i;
                if (walletResponseListener == null || !mih.e(deviceInfo)) {
                    return;
                }
                LogUtil.a("HwPayManager", "connectedChanged response to aar,state:", Integer.valueOf(deviceConnectState));
                walletResponseListener.onResponse(2, deviceConnectState, Integer.valueOf(deviceInfo.getProductType()));
            }
        };
        this.f17373c = context;
        lvb lvbVarE = lvb.e();
        this.g = lvbVarE;
        LogUtil.a("HwPayManager", "HwPayManager(), mHwDeviceConfigManager : ", lvbVarE == null ? Constants.NULL : lvbVarE);
        if (this.g != null) {
            ReleaseLogUtil.d("R_HwPayManager", "registerIBaseResponseCallback ");
            this.g.d(27, this);
        } else {
            ReleaseLogUtil.e("R_HwPayManager", "HwPayManager mHwDeviceConfigManager is null");
        }
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        if (i != 2) {
            Iterator<Integer> it = e.iterator();
            while (it.hasNext()) {
                a(it.next().intValue(), 100001, (Object) (-1));
            }
        }
    }

    public static HwPayManager e() {
        HwPayManager hwPayManager;
        LogUtil.a("HwPayManager", "getInstance(), instance : ", d);
        synchronized (d()) {
            if (f17371b.size() == 0) {
                Iterator<Integer> it = e.iterator();
                while (it.hasNext()) {
                    f17371b.put(it.next(), new ArrayList(0));
                }
            }
            if (d == null) {
                d = new HwPayManager(BaseApplication.getContext());
            }
            hwPayManager = d;
        }
        return hwPayManager;
    }

    public void c(String str, int i, IBaseResponseCallback iBaseResponseCallback) {
        String str2;
        String str3;
        String strD;
        b();
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(27);
        deviceCommand.setCommandID(1);
        if (str == null) {
            str2 = "";
            str3 = "";
            strD = str3;
        } else {
            String strB = eeq.b(str.length() / 2);
            strD = eeq.d(1);
            str3 = strB;
            str2 = str;
        }
        String strD2 = eeq.d(i);
        String strB2 = eeq.b(strD2.length() / 2);
        String strD3 = eeq.d(2);
        int length = strD.length() / 2;
        int length2 = str3.length() / 2;
        int length3 = str2.length() / 2;
        int length4 = strD3.length() / 2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + length2 + length3 + length4 + (strB2.length() / 2) + (strD2.length() / 2));
        byteBufferAllocate.put(eeq.c(strD));
        byteBufferAllocate.put(eeq.c(str3));
        byteBufferAllocate.put(eeq.c(str2));
        byteBufferAllocate.put(eeq.c(strD3));
        byteBufferAllocate.put(eeq.c(strB2));
        byteBufferAllocate.put(eeq.c(strD2));
        a(deviceCommand, byteBufferAllocate, 1, iBaseResponseCallback);
    }

    public void c(PayApduInfo payApduInfo, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.d("HwPayManager", "executeApdu: ", payApduInfo.toString());
        b();
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(27);
        deviceCommand.setCommandID(2);
        String strC = eeq.c(payApduInfo.getReqid());
        String strB = eeq.b(strC.length() / 2);
        String strD = eeq.d(1);
        String apdu = payApduInfo.getApdu();
        String strB2 = eeq.b(apdu.length() / 2);
        String strD2 = eeq.d(2);
        String strD3 = eeq.d(payApduInfo.getChannelId());
        String strB3 = eeq.b(strD3.length() / 2);
        String strD4 = eeq.d(3);
        int length = strD.length() / 2;
        int length2 = strB.length() / 2;
        int length3 = strC.length() / 2;
        int length4 = strD2.length() / 2;
        int length5 = strB2.length() / 2;
        int length6 = apdu.length() / 2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + length2 + length3 + length4 + length5 + length6 + (strD4.length() / 2) + (strB3.length() / 2) + (strD3.length() / 2));
        byteBufferAllocate.put(eeq.c(strD));
        byteBufferAllocate.put(eeq.c(strB));
        byteBufferAllocate.put(eeq.c(strC));
        byteBufferAllocate.put(eeq.c(strD2));
        byteBufferAllocate.put(eeq.c(strB2));
        byteBufferAllocate.put(eeq.c(apdu));
        byteBufferAllocate.put(eeq.c(strD4));
        byteBufferAllocate.put(eeq.c(strB3));
        byteBufferAllocate.put(eeq.c(strD3));
        LogUtil.d("HwPayManager", "executeApdu byteBufferAll: ", eeq.e(byteBufferAllocate.array()));
        a(deviceCommand, byteBufferAllocate, 2, iBaseResponseCallback);
    }

    public void e(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.d("HwPayManager", "closeChannel callbacks : ", iBaseResponseCallback);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(27);
        deviceCommand.setCommandID(3);
        String strB = eeq.b(0);
        String strD = eeq.d(1);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((strD.length() / 2) + (strB.length() / 2));
        byteBufferAllocate.put(eeq.c(strD));
        byteBufferAllocate.put(eeq.c(strB));
        LogUtil.d("HwPayManager", "closeChannel byteBufferAll : ", eeq.e(byteBufferAllocate.array()));
        a(deviceCommand, byteBufferAllocate, 3, iBaseResponseCallback);
    }

    public void b(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("HwPayManager", "getCplc callbacks : ", iBaseResponseCallback);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(27);
        deviceCommand.setCommandID(4);
        String strB = eeq.b(0);
        String strD = eeq.d(1);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((strD.length() / 2) + (strB.length() / 2));
        byteBufferAllocate.put(eeq.c(strD));
        byteBufferAllocate.put(eeq.c(strB));
        LogUtil.d("HwPayManager", "getCplc byteBufferAll : ", eeq.e(byteBufferAllocate.array()));
        a(deviceCommand, byteBufferAllocate, 4, iBaseResponseCallback);
    }

    public void a(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.d("HwPayManager", "getBtcInfo callbacks : ", iBaseResponseCallback);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(27);
        deviceCommand.setCommandID(5);
        String strB = eeq.b(0);
        String strD = eeq.d(1);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((strD.length() / 2) + (strB.length() / 2));
        byteBufferAllocate.put(eeq.c(strD));
        byteBufferAllocate.put(eeq.c(strB));
        LogUtil.d("HwPayManager", "getBtcInfo byteBufferAll : ", eeq.e(byteBufferAllocate.array()));
        a(deviceCommand, byteBufferAllocate, 5, iBaseResponseCallback);
    }

    public void a(List<mbn> list, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.d("HwPayManager", "transmitFile callbacks : ", iBaseResponseCallback);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(27);
        deviceCommand.setCommandID(7);
        StringBuffer stringBuffer = new StringBuffer(0);
        for (int i = 1; i <= list.size(); i++) {
            int i2 = i - 1;
            String strA = list.get(i2).a();
            int iD = list.get(i2).d();
            String strA2 = eeq.a(strA);
            String strB = eeq.b(strA2.length() / 2);
            String strD = eeq.d(4);
            String strD2 = eeq.d(iD);
            String strB2 = eeq.b(strD2.length() / 2);
            String strD3 = eeq.d(3);
            String str = strD3 + strB2 + strD2 + strD + strB + strA2;
            String strB3 = eeq.b((((((strD3.length() + strB2.length()) + strD2.length()) + strD.length()) + strB.length()) + strA2.length()) / 2);
            stringBuffer = stringBuffer.append(eeq.d(130) + strB3 + str);
        }
        String string = stringBuffer.toString();
        String strB4 = eeq.b(string.length() / 2);
        String strD4 = eeq.d(129);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((strD4.length() / 2) + (strB4.length() / 2) + (string.length() / 2));
        byteBufferAllocate.put(eeq.c(strD4 + strB4 + string));
        LogUtil.d("HwPayManager", "transmitFile , byteBufferAll : ", eeq.e(byteBufferAllocate.array()));
        a(deviceCommand, byteBufferAllocate, 7, iBaseResponseCallback);
    }

    public void d(String str, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("HwPayManager", "addCard, payCardInfo: ", CommonUtil.n(str));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(27);
        deviceCommand.setCommandID(8);
        String strD = d(str);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(strD.length() / 2);
        byteBufferAllocate.put(eeq.c(strD));
        a(deviceCommand, byteBufferAllocate, 8, iBaseResponseCallback);
    }

    private String d(String str) {
        LogUtil.d("HwPayManager", "cardInfoTlv, payCardInfo: ", str);
        mbm mbmVar = new mbm(str);
        String strD = mbmVar.d();
        String str2 = "";
        if (!c(strD)) {
            String strA = eeq.a(strD);
            String strB = eeq.b(strA.length() / 2);
            str2 = "" + eeq.d(1) + strB + strA;
        } else {
            LogUtil.j("HwPayManager", "aid is null");
        }
        String strO = mbmVar.o();
        if (c(strO)) {
            strO = "productId";
        }
        String strA2 = eeq.a(strO);
        String strB2 = eeq.b(strA2.length() / 2);
        String str3 = str2 + eeq.d(2) + strB2 + strA2;
        String strL = mbmVar.l();
        LogUtil.d("HwPayManager", "cardInfoTlv, name: ", strL);
        String strA3 = eeq.a(strL);
        String strB3 = eeq.b(strA3.length() / 2);
        String str4 = str3 + eeq.d(3) + strB3 + strA3;
        String strK = mbmVar.k();
        if (c(strK)) {
            strK = "issuerId";
        }
        String strA4 = eeq.a(strK);
        String strB4 = eeq.b(strA4.length() / 2);
        String str5 = str4 + eeq.d(4) + strB4 + strA4;
        int iC = mbmVar.c();
        if (iC == 2) {
            iC = 0;
        }
        String strD2 = eeq.d(iC);
        String strB5 = eeq.b(strD2.length() / 2);
        return a(mbmVar, d(mbmVar, e(mbmVar, str5 + eeq.d(5) + strB5 + strD2)));
    }

    private String e(mbm mbmVar, String str) {
        String strD = eeq.d(mbmVar.t() ? 1 : 0);
        String strB = eeq.b(strD.length() / 2);
        String str2 = str + eeq.d(6) + strB + strD;
        String strG = mbmVar.g();
        if (c(strG)) {
            strG = "";
        }
        String strA = eeq.a(strG);
        String strB2 = eeq.b(strA.length() / 2);
        String str3 = str2 + eeq.d(7) + strB2 + strA;
        String strJ = mbmVar.j();
        if (c(strJ)) {
            strJ = "";
        }
        String strA2 = eeq.a(strJ);
        String strB3 = eeq.b(strA2.length() / 2);
        String str4 = str3 + eeq.d(8) + strB3 + strA2;
        String strH = mbmVar.h();
        LogUtil.d("HwPayManager", "cardInfoTlvNumber, dpanDigest: ", strH);
        if (c(strH)) {
            strH = mbmVar.d();
        }
        String strA3 = eeq.a(strH);
        String strB4 = eeq.b(strA3.length() / 2);
        String str5 = str4 + eeq.d(9) + strB4 + strA3;
        String strF = mbmVar.f();
        String strA4 = eeq.a(c(strF) ? "" : strF);
        String strB5 = eeq.b(strA4.length() / 2);
        return str5 + eeq.d(10) + strB5 + strA4;
    }

    private String d(mbm mbmVar, String str) {
        int i = mbmVar.i();
        String strD = eeq.d(mbmVar.b());
        String strB = eeq.b(strD.length() / 2);
        String str2 = str + eeq.d(11) + strB + strD;
        String strC = eeq.c(mbmVar.p());
        String strB2 = eeq.b(strC.length() / 2);
        String str3 = str2 + eeq.d(12) + strB2 + strC;
        String strD2 = eeq.d(i);
        String strB3 = eeq.b(strD2.length() / 2);
        String str4 = str3 + eeq.d(13) + strB3 + strD2;
        String strE = mbmVar.e();
        if (c(strE)) {
            strE = "background_file_name";
        }
        String strA = eeq.a(strE);
        String strB4 = eeq.b(strA.length() / 2);
        String str5 = str4 + eeq.d(14) + strB4 + strA;
        String strC2 = eeq.c(mbmVar.a());
        String strB5 = eeq.b(strC2.length() / 2);
        String str6 = str5 + eeq.d(15) + strB5 + strC2;
        String strN = mbmVar.n();
        if (c(strN)) {
            strN = "Rf_file_name";
        }
        String strA2 = eeq.a(strN);
        String strB6 = eeq.b(strA2.length() / 2);
        String str7 = str6 + eeq.d(16) + strB6 + strA2;
        String strC3 = eeq.c(mbmVar.m());
        String strB7 = eeq.b(strC3.length() / 2);
        return str7 + eeq.d(17) + strB7 + strC3;
    }

    private String a(mbm mbmVar, String str) {
        if (mbmVar.c() == 2) {
            String strQ = mbmVar.q();
            if (!c(strQ)) {
                String strA = eeq.a(strQ);
                String strB = eeq.b(strA.length() / 2);
                String str2 = str + eeq.d(18) + strB + strA;
                LogUtil.a("HwPayManager", "cardInfoTlv, Bluetooth command : ", str2);
                return str2;
            }
        }
        return str;
    }

    public void e(String str, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("HwPayManager", "updateCard, payCardInfo: ", CommonUtil.n(str));
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(27);
        deviceCommand.setCommandID(9);
        String strD = d(str);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(strD.length() / 2);
        byteBufferAllocate.put(eeq.c(strD));
        a(deviceCommand, byteBufferAllocate, 9, iBaseResponseCallback);
    }

    public void c(IBaseResponseCallback iBaseResponseCallback) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(27);
        deviceCommand.setCommandID(10);
        String strB = eeq.b(0);
        String strD = eeq.d(1);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((strB.length() / 2) + (strD.length() / 2));
        byteBufferAllocate.put(eeq.c(strD));
        byteBufferAllocate.put(eeq.c(strB));
        a(deviceCommand, byteBufferAllocate, 10, iBaseResponseCallback);
    }

    public void a(String str, IBaseResponseCallback iBaseResponseCallback) {
        String str2;
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(27);
        deviceCommand.setCommandID(11);
        mbm mbmVar = new mbm(str);
        String strD = mbmVar.d();
        if (mbmVar.c() == 1) {
            strD = mbmVar.h();
            LogUtil.j("HwPayManager", "bank card, refId : ", strD);
        }
        if (!c(strD)) {
            String strA = eeq.a(strD);
            String strB = eeq.b(strA.length() / 2);
            str2 = eeq.d(1) + strB + strA;
        } else {
            LogUtil.j("HwPayManager", "refId is null");
            str2 = "";
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(str2.length() / 2);
        byteBufferAllocate.put(eeq.c(str2));
        a(deviceCommand, byteBufferAllocate, 11, iBaseResponseCallback);
    }

    public void a(String str, int i, IBaseResponseCallback iBaseResponseCallback) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(27);
        deviceCommand.setCommandID(13);
        String strA = eeq.a(str);
        String strB = eeq.b(strA.length() / 2);
        String strD = eeq.d(1);
        String strD2 = eeq.d(i);
        String strB2 = eeq.b(strD2.length() / 2);
        String strD3 = eeq.d(2);
        int length = strA.length() / 2;
        int length2 = strB.length() / 2;
        int length3 = strD.length() / 2;
        int length4 = strD2.length() / 2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + length2 + length3 + length4 + (strB2.length() / 2) + (strD3.length() / 2));
        byteBufferAllocate.put(eeq.c(strD));
        byteBufferAllocate.put(eeq.c(strB));
        byteBufferAllocate.put(eeq.c(strA));
        byteBufferAllocate.put(eeq.c(strD3));
        byteBufferAllocate.put(eeq.c(strB2));
        byteBufferAllocate.put(eeq.c(strD2));
        a(deviceCommand, byteBufferAllocate, 13, iBaseResponseCallback);
    }

    public void e(String str, String str2, String str3, IBaseResponseCallback iBaseResponseCallback) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(27);
        deviceCommand.setCommandID(5);
        String strA = eeq.a(str);
        String strB = eeq.b(strA.length() / 2);
        String strD = eeq.d(3);
        String strA2 = eeq.a(str2);
        String strB2 = eeq.b(strA2.length() / 2);
        String strD2 = eeq.d(7);
        String strA3 = eeq.a(str3);
        String strB3 = eeq.b(strA3.length() / 2);
        String strD3 = eeq.d(8);
        int length = strD.length() / 2;
        int length2 = strB.length() / 2;
        int length3 = strA.length() / 2;
        int length4 = strD2.length() / 2;
        int length5 = strB2.length() / 2;
        int length6 = strA2.length() / 2;
        int length7 = strD3.length() / 2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + length2 + length3 + length4 + length5 + length6 + length7 + (strB3.length() / 2) + (strA3.length() / 2));
        byteBufferAllocate.put(eeq.c(strD));
        byteBufferAllocate.put(eeq.c(strB));
        byteBufferAllocate.put(eeq.c(strA));
        byteBufferAllocate.put(eeq.c(strD2));
        byteBufferAllocate.put(eeq.c(strB2));
        byteBufferAllocate.put(eeq.c(strA2));
        byteBufferAllocate.put(eeq.c(strD3));
        byteBufferAllocate.put(eeq.c(strB3));
        byteBufferAllocate.put(eeq.c(strA3));
        a(deviceCommand, byteBufferAllocate, 5, iBaseResponseCallback);
    }

    private void a(DeviceCommand deviceCommand, ByteBuffer byteBuffer, int i, IBaseResponseCallback iBaseResponseCallback) {
        synchronized (d()) {
            try {
                if (iBaseResponseCallback != null) {
                    List<IBaseResponseCallback> list = f17371b.get(Integer.valueOf(i));
                    if (list != null) {
                        ReleaseLogUtil.d("R_HwPayManager", "addToList, callbacks is not null");
                        list.add(iBaseResponseCallback);
                    } else {
                        ReleaseLogUtil.e("R_HwPayManager", "addToList callbacks is null");
                    }
                } else {
                    ReleaseLogUtil.e("R_HwPayManager", "addToList callback is null");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        deviceCommand.setDataLen(byteBuffer.array().length);
        deviceCommand.setDataContent(byteBuffer.array());
        this.g.c(deviceCommand);
    }

    private void d(byte[] bArr) {
        Object objE;
        Object objValueOf;
        int iA = a(bArr);
        int iD = iA == 100000 ? 0 : -1;
        ReleaseLogUtil.d("R_HwPayManager", "getResult id", Byte.valueOf(bArr[0]));
        if (bArr[1] == 3) {
            h();
        }
        switch (bArr[1]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 10:
            case 15:
                mbo mboVarC = c(iD, bArr, iA);
                iD = mboVarC.d();
                objE = mboVarC.e();
                int i = iD;
                objValueOf = objE;
                iA = i;
                break;
            case 6:
            case 17:
            case 18:
            default:
                objE = c(bArr, iA);
                int i2 = iD;
                objValueOf = objE;
                iA = i2;
                break;
            case 7:
            case 8:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
                objE = Integer.valueOf(iA);
                int i3 = iD;
                objValueOf = objE;
                iA = i3;
                break;
            case 12:
                objE = j(bArr);
                if (objE == null) {
                    int i4 = iD;
                    objValueOf = objE;
                    iA = i4;
                } else {
                    objValueOf = objE;
                    iA = 0;
                }
                break;
            case 19:
                objValueOf = Integer.valueOf(iA);
                break;
        }
        a(bArr[1], iA, objValueOf);
    }

    private mbo c(int i, byte[] bArr, int i2) {
        byte b2 = bArr[1];
        if (b2 == 1) {
            return new mbf().e(i, bArr, i2);
        }
        if (b2 == 2) {
            return new mbf().c(i, bArr, i2);
        }
        if (b2 == 3) {
            return new mbf().a(i, bArr, i2);
        }
        if (b2 == 4) {
            return a(i, bArr, i2);
        }
        if (b2 == 5) {
            return b(i, bArr, i2);
        }
        if (b2 == 10) {
            return e(i, bArr);
        }
        if (b2 == 15) {
            return a(i, bArr);
        }
        mbo mboVar = new mbo();
        mboVar.c(-1);
        mboVar.d("");
        return mboVar;
    }

    private mbo a(int i, byte[] bArr, int i2) {
        mbo mboVar = new mbo();
        mboVar.c(i);
        String strE = eeq.e(bArr);
        if (strE == null || strE.length() < 4) {
            LogUtil.j("HwPayManager", "parseGetCplc length is outOfIndex");
            return mboVar;
        }
        try {
            for (eew eewVar : this.j.b(strE.substring(4, strE.length())).e()) {
                int iB = CommonUtil.b(eewVar.e(), 16);
                if (iB == 1) {
                    mboVar.c(0);
                    mboVar.d(eewVar.b());
                } else if (iB != 127) {
                    LogUtil.j("HwPayManager", "parseGetCplc default.");
                } else {
                    mboVar.d(Integer.valueOf(i2));
                }
            }
        } catch (eeu e2) {
            LogUtil.e("HwPayManager", "parseGetCplc error : ", e2.getMessage());
        }
        return mboVar;
    }

    private mbo b(int i, byte[] bArr, int i2) {
        mbo mboVar = new mbo();
        mboVar.c(i);
        String strE = eeq.e(bArr);
        if (strE == null || strE.length() < 4) {
            LogUtil.j("HwPayManager", "parseGetBtc length is outOfIndex");
            return mboVar;
        }
        try {
            for (eew eewVar : this.j.b(strE.substring(4, strE.length())).e()) {
                int iB = CommonUtil.b(eewVar.e(), 16);
                if (iB == 1) {
                    mboVar.c(0);
                    mboVar.d(eewVar.b());
                } else if (iB != 127) {
                    LogUtil.j("HwPayManager", "parseGetBtc default.");
                } else {
                    mboVar.d(Integer.valueOf(i2));
                }
            }
        } catch (eeu e2) {
            LogUtil.e("HwPayManager", "parseGetBtc error : ", e2.getMessage());
        }
        return mboVar;
    }

    private mbo a(int i, byte[] bArr) {
        mbo mboVar = new mbo();
        mboVar.c(i);
        String strE = eeq.e(bArr);
        if (strE == null || strE.length() < 4) {
            LogUtil.j("HwPayManager", "parseGetTagStatus length is outOfIndex");
            return mboVar;
        }
        try {
            for (eew eewVar : this.j.b(strE.substring(4)).e()) {
                if (CommonUtil.b(eewVar.e(), 16) != 1) {
                    LogUtil.j("HwPayManager", "parseGetTagStatus status default");
                } else {
                    mboVar.c(0);
                    mboVar.d(eewVar.b());
                    LogUtil.a("HwPayManager", "parseGetTagStatus status : ", eewVar.b());
                }
            }
        } catch (eeu e2) {
            LogUtil.e("HwPayManager", "parseGetTagStatus error : ", e2.getMessage());
        }
        return mboVar;
    }

    private mbo e(int i, byte[] bArr) {
        mbo mboVar = new mbo();
        mboVar.c(i);
        String strE = eeq.e(bArr);
        LogUtil.d("HwPayManager", "List,messageHex : ", strE);
        if (strE != null && strE.length() > 4) {
            try {
                List<ees> listB = new eet().b(strE.substring(4, strE.length())).b();
                ArrayList arrayList = new ArrayList(0);
                mboVar.c(0);
                Iterator<ees> it = listB.iterator();
                while (it.hasNext()) {
                    Iterator<ees> it2 = it.next().b().iterator();
                    while (it2.hasNext()) {
                        List<eew> listE = it2.next().e();
                        LogUtil.d("HwPayManager", "List,childtlv : ", Integer.valueOf(listE.size()));
                        arrayList.add(c(listE).s());
                    }
                }
                mboVar.d(arrayList);
                return mboVar;
            } catch (eeu unused) {
                LogUtil.e("HwPayManager", "cardList TLV error");
            }
        }
        return mboVar;
    }

    private mbm c(List<eew> list) {
        mbm mbmVar = new mbm();
        for (eew eewVar : list) {
            LogUtil.d("HwPayManager", "List getTag : ", eewVar.e());
            switch (CommonUtil.b(eewVar.e(), 16)) {
                case 3:
                    mbmVar.d(eeq.d(eewVar.b()));
                    break;
                case 4:
                    mbmVar.f(eeq.d(eewVar.b()));
                    break;
                case 5:
                    mbmVar.g(eeq.d(eewVar.b()));
                    break;
                case 6:
                    mbmVar.j(eeq.d(eewVar.b()));
                    break;
                case 7:
                    mbmVar.b(CommonUtil.b(eewVar.b(), 16));
                    if (mbmVar.c() == 0) {
                        mbmVar.b(2);
                    }
                    break;
                case 8:
                    if (CommonUtil.b(eewVar.b(), 16) == 1) {
                        mbmVar.c(true);
                    } else {
                        mbmVar.c(false);
                    }
                    break;
                case 9:
                    mbmVar.e(eeq.d(eewVar.b()));
                    break;
                default:
                    c(eewVar, mbmVar);
                    break;
            }
        }
        return mbmVar;
    }

    private void c(eew eewVar, mbm mbmVar) {
        switch (CommonUtil.b(eewVar.e(), 16)) {
            case 10:
                mbmVar.h(eeq.d(eewVar.b()));
                break;
            case 11:
                mbmVar.c(eeq.d(eewVar.b()));
                break;
            case 12:
                mbmVar.b(eeq.d(eewVar.b()));
                break;
            case 13:
                mbmVar.d(CommonUtil.b(eewVar.b(), 16));
                break;
            case 14:
                mbmVar.c(CommonUtil.x(eewVar.b()));
                break;
            case 15:
                mbmVar.c(CommonUtil.b(eewVar.b(), 16));
                break;
            case 16:
                mbmVar.a(eeq.d(eewVar.b()));
                break;
            case 17:
                mbmVar.a(CommonUtil.a(eewVar.b(), 16L));
                break;
            case 18:
                mbmVar.i(eeq.d(eewVar.b()));
                break;
            case 19:
                mbmVar.e(CommonUtil.x(eewVar.b()));
                break;
            case 20:
                if (!mbh.e(eewVar)) {
                    mbmVar.k(eeq.d(eewVar.b()));
                    break;
                }
                break;
            default:
                LogUtil.j("HwPayManager", "parseOtherCardInfo default.");
                break;
        }
    }

    private void a(int i, int i2, Object obj) {
        synchronized (d()) {
            List<IBaseResponseCallback> list = f17371b.get(Integer.valueOf(i));
            if (list != null) {
                if (obj != null && list.size() != 0) {
                    ReleaseLogUtil.d("R_HwPayManager", "processCallback callback, commandID: ", Integer.valueOf(i));
                    list.get(0).a(i2, obj);
                    list.remove(0);
                } else if (list.size() != 0) {
                    list.get(0).a(100001, "UNKNOWN_ERROR");
                    list.remove(0);
                }
            } else {
                ReleaseLogUtil.d("R_HwPayManager", "processCallback callback, callbackList is null");
            }
        }
    }

    private int a(byte[] bArr) {
        String strE = eeq.e(bArr);
        if (strE == null || strE.length() < 8) {
            LogUtil.j("HwPayManager", "getInt length is outOfIndex");
            return 0;
        }
        try {
            return CommonUtil.b(strE.substring(8, strE.length()), 16);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 27;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public void onDestroy() {
        super.onDestroy();
        this.g.c(27);
        ReleaseLogUtil.d("R_HwPayManager", "onDestroy unRegisterManagerResponseCallback");
        synchronized (d()) {
            for (int i = 0; i < e.size(); i++) {
                if (f17371b.get(e.get(i)) != null) {
                    f17371b.get(e.get(i)).clear();
                }
            }
        }
        i();
        ReleaseLogUtil.d("R_HwPayManager", "onDestroy");
        this.f17372a = null;
        d = null;
        ReleaseLogUtil.d("R_HwPayManager", "onDestroy complete");
    }

    private static Object d() {
        Map<Integer, List<IBaseResponseCallback>> map;
        synchronized (HwPayManager.class) {
            map = f17371b;
        }
        return map;
    }

    public void g(IBaseResponseCallback iBaseResponseCallback) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(27);
        deviceCommand.setCommandID(12);
        String strD = eeq.d(1);
        String strB = eeq.b(0);
        String strD2 = eeq.d(1);
        String strB2 = eeq.b(strD2.length() / 2);
        String strD3 = eeq.d(7);
        int length = strB.length() / 2;
        int length2 = strD.length() / 2;
        int length3 = strD3.length() / 2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + length2 + length3 + (strB2.length() / 2) + (strD2.length() / 2));
        byteBufferAllocate.put(eeq.c(strD));
        byteBufferAllocate.put(eeq.c(strB));
        byteBufferAllocate.put(eeq.c(strD3));
        byteBufferAllocate.put(eeq.c(strB2));
        byteBufferAllocate.put(eeq.c(strD2));
        a(deviceCommand, byteBufferAllocate, 12, iBaseResponseCallback);
    }

    private boolean c(String str) {
        return TextUtils.isEmpty(str);
    }

    public void c(ConnectStateChangeCallback connectStateChangeCallback) {
        this.f17372a = connectStateChangeCallback;
    }

    @Override // com.huawei.callback.BluetoothDataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, byte[] bArr) {
        if (bArr == null) {
            ReleaseLogUtil.d("R_HwPayManager", "data is null");
            return;
        }
        ReleaseLogUtil.d("R_HwPayManager", "onDataReceived serviceId is,", Integer.valueOf(bArr[0]), "commandId is,", Integer.valueOf(bArr[1]));
        LogUtil.a("HwPayManager", "Pay manager receive data : ", eeq.e(bArr));
        ReleaseLogUtil.d("R_HwPayManager", "Pay manager receive data is ok");
        if (mih.e(deviceInfo) && mih.b(bArr)) {
            ReleaseLogUtil.d("R_HwPayManager", "isWalletOpenCard and isWalletAppIdCommand");
            a(i, (Object) bArr);
        } else {
            d(bArr);
        }
    }

    private void i() {
        try {
            LogUtil.a("HwPayManager", "Enter unregisterNonLocalBroadcast!");
            this.f17373c.unregisterReceiver(this.f);
        } catch (IllegalArgumentException e2) {
            LogUtil.e("HwPayManager", e2.getMessage());
        }
    }

    private void a() {
        BroadcastManagerUtil.c(this.f17373c, this.f, new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED"), LocalBroadcast.f36595c, null);
    }

    public void c(String str, Map<String, String> map, List<String> list, IBaseResponseCallback iBaseResponseCallback) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(27);
        deviceCommand.setCommandID(14);
        String str2 = a(str) + a(map) + b(list);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(str2.length() / 2);
        byteBufferAllocate.put(eeq.c(str2));
        a(deviceCommand, byteBufferAllocate, 14, iBaseResponseCallback);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x0082  */
    private String a(Map<String, String> map) {
        byte b2;
        String str = "";
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String strA = eeq.a(entry.getValue());
                String strB = eeq.b(strA.length() / 2);
                key.hashCode();
                switch (key) {
                    case "trans_type":
                        b2 = 0;
                        break;
                    case "terminal":
                        b2 = 1;
                        break;
                    case "balance":
                        b2 = 2;
                        break;
                    case "amt":
                        b2 = 3;
                        break;
                    case "version":
                        b2 = 4;
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                if (b2 == 0) {
                    str = str + (eeq.d(3) + strB + strA);
                } else if (b2 == 1) {
                    str = str + (eeq.d(6) + strB + strA);
                } else if (b2 == 2) {
                    str = str + (eeq.d(5) + strB + strA);
                } else if (b2 == 3) {
                    str = str + (eeq.d(4) + strB + strA);
                } else if (b2 == 4) {
                    str = str + (eeq.d(2) + strB + strA);
                } else {
                    LogUtil.j("hci does not have this field:", key);
                }
            }
        }
        return str;
    }

    private String a(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        String strA = eeq.a(str);
        String strB = eeq.b(strA.length() / 2);
        return eeq.d(1) + strB + strA;
    }

    private String b(List<String> list) {
        String str = "";
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(0);
        for (int i = 0; i < list.size() - 1; i++) {
            if (i == 0 || i == list.size() - 1) {
                stringBuffer.append(list.get(i));
            } else {
                stringBuffer.append("|");
                stringBuffer.append(list.get(i));
            }
        }
        String strA = eeq.a(stringBuffer.toString());
        String strB = eeq.b(strA.length() / 2);
        String str2 = eeq.d(7) + strB + strA;
        if (list.size() > 1) {
            String strA2 = eeq.a(list.get(list.size() - 1));
            String strB2 = eeq.b(strA2.length() / 2);
            str = eeq.d(8) + strB2 + strA2;
        }
        return str2 + str;
    }

    private String c(byte[] bArr) {
        String strE = eeq.e(bArr);
        if (strE == null || strE.length() < 4) {
            LogUtil.j("HwPayManager", "getParsePayAbilityMessage length is outOfIndex");
            return "";
        }
        return strE.substring(4, strE.length());
    }

    private Object j(byte[] bArr) {
        try {
            ees eesVarB = this.j.b(c(bArr));
            mbp mbpVar = new mbp();
            for (eew eewVar : eesVarB.e()) {
                switch (CommonUtil.b(eewVar.e(), 16)) {
                    case 1:
                        mbpVar.b(eeq.d(eewVar.b()));
                        break;
                    case 2:
                        mbpVar.a(eeq.d(eewVar.b()));
                        break;
                    case 3:
                        mbpVar.a(CommonUtil.b(eewVar.b(), 16));
                        break;
                    case 4:
                        mbpVar.e(CommonUtil.b(eewVar.b(), 16));
                        break;
                    case 5:
                        mbpVar.d(CommonUtil.b(eewVar.b(), 16));
                        break;
                    case 6:
                        mbpVar.c(CommonUtil.b(eewVar.b(), 16));
                        break;
                    case 7:
                    default:
                        Object[] objArr = new Object[1];
                        objArr[0] = "parsePayAbility default.";
                        LogUtil.j("HwPayManager", objArr);
                        break;
                    case 8:
                        mbpVar.e(eewVar.b());
                        break;
                    case 9:
                        mbpVar.d(eeq.d(eewVar.b()));
                        break;
                }
            }
            return mbpVar.c();
        } catch (eeu | NumberFormatException e2) {
            LogUtil.e("HwPayManager", "getResult COMMAND_ID_PAY_ABILITY error : ", e2.getMessage());
            return null;
        }
    }

    public void e(int i, IBaseResponseCallback iBaseResponseCallback) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(27);
        deviceCommand.setCommandID(16);
        a(deviceCommand, ByteBuffer.wrap(eeq.c(eeq.d(1) + eeq.d(1) + eeq.d(i))), 16, iBaseResponseCallback);
    }

    public void h(IBaseResponseCallback iBaseResponseCallback) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(27);
        deviceCommand.setCommandID(17);
        String strB = eeq.b(0);
        String strD = eeq.d(1);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((strD.length() / 2) + (strB.length() / 2));
        byteBufferAllocate.put(eeq.c(strD));
        byteBufferAllocate.put(eeq.c(strB));
        LogUtil.d("HwPayManager", "getNfcTagInfo byteBufferAll : ", eeq.e(byteBufferAllocate.array()));
        a(deviceCommand, byteBufferAllocate, 17, iBaseResponseCallback);
    }

    private Object c(byte[] bArr, int i) {
        byte b2 = bArr[1];
        switch (b2) {
            case 17:
                return g(bArr);
            case 18:
                return b(bArr);
            case 19:
            default:
                LogUtil.j("HwPayManager", "not support command Type:", Byte.valueOf(b2));
                return null;
            case 20:
                return e(bArr);
            case 21:
            case 22:
                return Integer.valueOf(i);
            case 23:
                return mbh.e(bArr);
            case 24:
                return mbh.c(bArr);
        }
    }

    private Object g(byte[] bArr) {
        String strE = eeq.e(bArr);
        if (strE == null || strE.length() < 4) {
            LogUtil.j("HwPayManager", "parseNfcTagInfo length is outOfIndex");
            return "";
        }
        try {
            ees eesVarB = this.j.b(strE.substring(4, strE.length()));
            mbk mbkVar = new mbk();
            for (eew eewVar : eesVarB.e()) {
                LogUtil.a("HwPayManager", "[parseNfcTagInfo]tlv:", eewVar.toString());
                a(CommonUtil.b(eewVar.e(), 16), mbkVar, eewVar);
            }
            return mbkVar.d();
        } catch (eeu | NumberFormatException e2) {
            LogUtil.e("HwPayManager", "parseNfcTagInfo errorMsg : ", e2.getMessage());
            return null;
        }
    }

    private void a(int i, mbk mbkVar, eew eewVar) {
        LogUtil.d("HwPayManager", "parseNfcTagResponse tlvType : ", Integer.valueOf(i), ", tlvValue:", eewVar.b());
        if (i != 127) {
            switch (i) {
                case 2:
                    mbkVar.c(eeq.d(eewVar.b()));
                    break;
                case 3:
                    mbkVar.a(CommonUtil.b(eewVar.b(), 16));
                    break;
                case 4:
                    mbkVar.c(CommonUtil.b(eewVar.b(), 16));
                    break;
                case 5:
                    mbkVar.e(CommonUtil.b(eewVar.b(), 16));
                    break;
                case 6:
                    mbkVar.f(eewVar.b());
                    break;
                case 7:
                    mbkVar.b(eewVar.b());
                    break;
                case 8:
                    mbkVar.d(CommonUtil.b(eewVar.b(), 16));
                    break;
                case 9:
                    mbkVar.a(eewVar.b());
                    break;
                case 10:
                    mbkVar.e(eewVar.b());
                    break;
                case 11:
                    mbkVar.d(eewVar.b());
                    break;
                default:
                    LogUtil.j("HwPayManager", "not support Type:", Integer.valueOf(i));
                    break;
            }
            return;
        }
        mbkVar.b(CommonUtil.b(eewVar.b(), 16));
    }

    public void b(int i, String str, IBaseResponseCallback iBaseResponseCallback) {
        if (str == null || str.isEmpty()) {
            LogUtil.j("HwPayManager", "sendNfcCommand command is null or empty");
            return;
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(27);
        deviceCommand.setCommandID(18);
        String strD = eeq.d(i);
        String strB = eeq.b(strD.length() / 2);
        String strD2 = eeq.d(1);
        String strB2 = eeq.b(str.length() / 2);
        String strD3 = eeq.d(2);
        int length = strD2.length() / 2;
        int length2 = strB.length() / 2;
        int length3 = strD.length() / 2;
        int length4 = strD3.length() / 2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + length2 + length3 + length4 + (strB2.length() / 2) + (str.length() / 2));
        byteBufferAllocate.put(eeq.c(strD2));
        byteBufferAllocate.put(eeq.c(strB));
        byteBufferAllocate.put(eeq.c(strD));
        byteBufferAllocate.put(eeq.c(strD3));
        byteBufferAllocate.put(eeq.c(strB2));
        byteBufferAllocate.put(eeq.c(str));
        LogUtil.d("HwPayManager", "sendNfcCommand byteBufferAll : ", eeq.e(byteBufferAllocate.array()));
        a(deviceCommand, byteBufferAllocate, 18, iBaseResponseCallback);
    }

    private Object b(byte[] bArr) {
        String strE = eeq.e(bArr);
        if (strE == null || strE.length() < 4) {
            LogUtil.j("HwPayManager", "parseNfcCommand length is outOfIndex");
            return null;
        }
        try {
            ees eesVarB = this.j.b(strE.substring(4, strE.length()));
            mbl mblVar = new mbl();
            for (eew eewVar : eesVarB.e()) {
                LogUtil.d("HwPayManager", "parseNfcCommand tlvType : ", Integer.valueOf(CommonUtil.b(eewVar.e(), 16)));
                int iB = CommonUtil.b(eewVar.e(), 16);
                if (iB == 3) {
                    mblVar.c(eewVar.b());
                } else if (iB == 127) {
                    mblVar.a(CommonUtil.b(eewVar.b(), 16));
                } else {
                    LogUtil.j("not support tlbType!", new Object[0]);
                }
            }
            return mblVar.a();
        } catch (eeu | NumberFormatException e2) {
            LogUtil.e("HwPayManager", "parseNfcCommand error : ", e2.getMessage());
            return null;
        }
    }

    public void c(byte[] bArr, int i, int i2, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.d("HwPayManager", "aulthenticateMifareSector callbacks : ", iBaseResponseCallback);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(27);
        deviceCommand.setCommandID(19);
        String strE = eeq.e(bArr);
        if (strE == null) {
            return;
        }
        String strB = eeq.b(strE.length() / 2);
        String strD = eeq.d(1);
        String strD2 = eeq.d(i);
        String strB2 = eeq.b(strD2.length() / 2);
        String strD3 = eeq.d(2);
        String strD4 = eeq.d(i2);
        String strB3 = eeq.b(strD4.length() / 2);
        String strD5 = eeq.d(3);
        int length = strD.length() / 2;
        int length2 = strB.length() / 2;
        int length3 = strE.length() / 2;
        int length4 = strD3.length() / 2;
        int length5 = strB2.length() / 2;
        int length6 = strD2.length() / 2;
        int length7 = strD5.length() / 2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + length2 + length3 + length4 + length5 + length6 + length7 + (strB3.length() / 2) + (strD4.length() / 2));
        byteBufferAllocate.put(eeq.c(strD));
        byteBufferAllocate.put(eeq.c(strB));
        byteBufferAllocate.put(eeq.c(strE));
        byteBufferAllocate.put(eeq.c(strD3));
        byteBufferAllocate.put(eeq.c(strB2));
        byteBufferAllocate.put(eeq.c(strD2));
        byteBufferAllocate.put(eeq.c(strD5));
        byteBufferAllocate.put(eeq.c(strB3));
        byteBufferAllocate.put(eeq.c(strD4));
        LogUtil.d("HwPayManager", "aulthenticateMifareSector byteBufferAll : ", eeq.e(byteBufferAllocate.array()));
        a(deviceCommand, byteBufferAllocate, 19, iBaseResponseCallback);
    }

    public void a(byte[] bArr, int i, int i2, IBaseResponseCallback iBaseResponseCallback) {
        String strE;
        String strB;
        String strD;
        LogUtil.d("HwPayManager", "getBlockData callbacks : ", iBaseResponseCallback);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(27);
        deviceCommand.setCommandID(20);
        if (bArr != null) {
            strE = eeq.e(bArr);
            strB = eeq.b(strE.length() / 2);
            strD = eeq.d(1);
        } else {
            strE = "";
            strB = "";
            strD = strB;
        }
        String strD2 = eeq.d(i);
        String strB2 = eeq.b(strD2.length() / 2);
        String strD3 = eeq.d(2);
        String strD4 = eeq.d(i2);
        String strB3 = eeq.b(strD4.length() / 2);
        String strD5 = eeq.d(3);
        int length = strD3.length() / 2;
        int length2 = strB2.length() / 2;
        int length3 = length + length2 + (strD2.length() / 2) + (strD5.length() / 2) + (strB3.length() / 2) + (strD4.length() / 2);
        if (bArr != null) {
            length3 = length3 + (strD.length() / 2) + (strB.length() / 2) + (strE.length() / 2);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length3);
        if (bArr != null) {
            byteBufferAllocate.put(eeq.c(strD));
            byteBufferAllocate.put(eeq.c(strB));
            byteBufferAllocate.put(eeq.c(strE));
        }
        byteBufferAllocate.put(eeq.c(strD3));
        byteBufferAllocate.put(eeq.c(strB2));
        byteBufferAllocate.put(eeq.c(strD2));
        byteBufferAllocate.put(eeq.c(strD5));
        byteBufferAllocate.put(eeq.c(strB3));
        byteBufferAllocate.put(eeq.c(strD4));
        LogUtil.d("HwPayManager", "getBlockData byteBufferAll : ", eeq.e(byteBufferAllocate.array()));
        a(deviceCommand, byteBufferAllocate, 20, iBaseResponseCallback);
    }

    private Object e(byte[] bArr) {
        String strE = eeq.e(bArr);
        if (strE == null || strE.length() < 4) {
            LogUtil.j("HwPayManager", "parseMiFareBlockInfo length is outOfIndex");
            return null;
        }
        String strSubstring = strE.substring(4, strE.length());
        try {
            mbg mbgVar = new mbg();
            ees eesVarB = this.j.b(strSubstring);
            mbgVar.d(e(eesVarB.e()));
            Iterator<ees> it = eesVarB.b().iterator();
            while (it.hasNext()) {
                for (eew eewVar : it.next().e()) {
                    LogUtil.d("HwPayManager", "parseMiFareBlockInfo tlvType : ", Integer.valueOf(CommonUtil.b(eewVar.e(), 16)));
                    if (CommonUtil.b(eewVar.e(), 16) == 5) {
                        mbgVar.a(eewVar.b());
                    } else {
                        LogUtil.j("not support tlbType!", new Object[0]);
                    }
                }
            }
            return mbgVar.d();
        } catch (eeu | NumberFormatException e2) {
            LogUtil.e("HwPayManager", "getResult parseMiFareBlockInfo error : ", e2.getMessage());
            return null;
        }
    }

    public void e(String str, String str2, IBaseResponseCallback iBaseResponseCallback) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(27);
        deviceCommand.setCommandID(21);
        if (str2 == null || str2.isEmpty()) {
            LogUtil.j("HwPayManager", "[sendAccessCardRfInfo] rfinfo is null or emtpy");
            return;
        }
        if (str == null || str.isEmpty()) {
            LogUtil.j("HwPayManager", "[sendAccessCardRfInfo] aid is null or emtpy");
            return;
        }
        String strA = eeq.a(str);
        String strB = eeq.b(strA.length() / 2);
        String strD = eeq.d(1);
        String strB2 = eeq.b(str2.length() / 2);
        String strD2 = eeq.d(2);
        int length = strD.length() / 2;
        int length2 = strB.length() / 2;
        int length3 = strA.length() / 2;
        int length4 = strD2.length() / 2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + length2 + length3 + length4 + (strB2.length() / 2) + (str2.length() / 2));
        byteBufferAllocate.put(eeq.c(strD));
        byteBufferAllocate.put(eeq.c(strB));
        byteBufferAllocate.put(eeq.c(strA));
        byteBufferAllocate.put(eeq.c(strD2));
        byteBufferAllocate.put(eeq.c(strB2));
        byteBufferAllocate.put(eeq.c(str2));
        LogUtil.d("HwPayManager", "sendAccessCardRfInfo byteBufferAll : ", eeq.e(byteBufferAllocate.array()));
        a(deviceCommand, byteBufferAllocate, 21, iBaseResponseCallback);
    }

    public void b(int i, IBaseResponseCallback iBaseResponseCallback) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(27);
        deviceCommand.setCommandID(22);
        String strD = eeq.d(i);
        String strB = eeq.b(strD.length() / 2);
        String str = eeq.d(1) + strB + strD;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(str.length() / 2);
        byteBufferAllocate.put(eeq.c(str));
        a(deviceCommand, byteBufferAllocate, 22, iBaseResponseCallback);
    }

    private int e(List<eew> list) {
        int iB = 0;
        if (list == null) {
            return 0;
        }
        for (eew eewVar : list) {
            if (CommonUtil.b(eewVar.e(), 16) == 127) {
                iB = CommonUtil.b(eewVar.b(), 16);
            }
        }
        return iB;
    }

    public static void b(int i, int i2, IBaseResponseCallback iBaseResponseCallback) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(27);
        deviceCommand.setCommandID(23);
        String strD = eeq.d(i);
        String strB = eeq.b(strD.length() / 2);
        String strD2 = eeq.d(2);
        String strD3 = eeq.d(i2);
        String strB2 = eeq.b(strD3.length() / 2);
        String strD4 = eeq.d(3);
        int length = strD2.length() / 2;
        int length2 = strB.length() / 2;
        int length3 = strD.length() / 2;
        int length4 = strD4.length() / 2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + length2 + length3 + length4 + (strB2.length() / 2) + (strD3.length() / 2));
        byteBufferAllocate.put(eeq.c(strD2));
        byteBufferAllocate.put(eeq.c(strB));
        byteBufferAllocate.put(eeq.c(strD));
        byteBufferAllocate.put(eeq.c(strD4));
        byteBufferAllocate.put(eeq.c(strB2));
        byteBufferAllocate.put(eeq.c(strD3));
        e().a(deviceCommand, byteBufferAllocate, 23, iBaseResponseCallback);
    }

    public void d(IBaseResponseCallback iBaseResponseCallback) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(27);
        deviceCommand.setCommandID(24);
        String strB = eeq.b(0);
        String strD = eeq.d(1);
        String strB2 = eeq.b(0);
        String strD2 = eeq.d(2);
        String strB3 = eeq.b(0);
        String strD3 = eeq.d(3);
        int length = strD.length() / 2;
        int length2 = strB.length() / 2;
        int length3 = strD2.length() / 2;
        int length4 = strB2.length() / 2;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + length2 + length3 + length4 + (strD3.length() / 2) + (strB3.length() / 2));
        byteBufferAllocate.put(eeq.c(strD));
        byteBufferAllocate.put(eeq.c(strB));
        byteBufferAllocate.put(eeq.c(strD2));
        byteBufferAllocate.put(eeq.c(strB2));
        byteBufferAllocate.put(eeq.c(strD3));
        byteBufferAllocate.put(eeq.c(strB3));
        a(deviceCommand, byteBufferAllocate, 24, iBaseResponseCallback);
    }

    public void e(int i, int i2, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            LogUtil.j("HwPayManager", "sendBluetoothCommand myByteBuffer is null");
            return;
        }
        ReleaseLogUtil.d("R_HwPayManager", "sendWalletTlv");
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(i);
        deviceCommand.setCommandID(i2);
        deviceCommand.setDataLen(byteBuffer.array().length);
        deviceCommand.setDataContent(byteBuffer.array());
        this.g.c(deviceCommand);
    }

    private void a(int i, Object obj) {
        WalletResponseListener walletResponseListener = this.i;
        if (walletResponseListener != null) {
            walletResponseListener.onResponse(1, i, obj);
        }
    }

    public void a(WalletResponseListener walletResponseListener) {
        ReleaseLogUtil.d("R_HwPayManager", "registerHealthResponseListener");
        this.i = walletResponseListener;
    }

    public void c() {
        LogUtil.a("HwPayManager", "unRegisterHealthResponseListener");
        this.i = null;
    }

    private void b() {
        if (Build.VERSION.SDK_INT > 30) {
            PowerKitManager.a().d("HwPayManager", 512, 600000L, "user-WalletEseManagement");
        }
    }

    private void h() {
        if (Build.VERSION.SDK_INT > 30) {
            PowerKitManager.a().a("HwPayManager", 512, "user-WalletEseManagement");
        }
    }
}
