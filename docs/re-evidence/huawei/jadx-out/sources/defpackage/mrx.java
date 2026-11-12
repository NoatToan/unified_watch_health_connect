package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.common.base.Ascii;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwdevice.phoneprocess.binder.ParserInterface;
import com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.ContactsDataSender;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class mrx implements ParserInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static mrx f42324c;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private msu f42325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private msg f42326b;
    private Context d;
    private eet g;
    private BroadcastReceiver j = new BroadcastReceiver() { // from class: mrx.4
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("HwContactSyncMgr", "mDeviceStatusReceiver onReceive intent is null.");
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                LogUtil.j("HwContactSyncMgr", "mDeviceStatusReceiver onReceive action is null");
                return;
            }
            LogUtil.a("HwContactSyncMgr", "mDeviceListChangedReceiver onReceive action :", action);
            if ("com.huawei.bone.action.DEVICE_LIST_CHANGED".equals(action)) {
                mrx.this.f42325a.e();
            }
        }
    };

    private mrx() {
        LogUtil.a("HwContactSyncMgr", "constructor method");
        b();
    }

    private void b() {
        this.g = new eet();
        this.f42326b = new msg();
        this.f42325a = new msu();
        this.d = BaseApplication.getContext();
        e();
    }

    private void e() {
        BroadcastManagerUtil.c(this.d, this.j, new IntentFilter("com.huawei.bone.action.DEVICE_LIST_CHANGED"), LocalBroadcast.f36595c, null);
    }

    public static mrx d() {
        mrx mrxVar;
        synchronized (e) {
            if (f42324c == null) {
                f42324c = new mrx();
            }
            mrxVar = f42324c;
        }
        return mrxVar;
    }

    private static void a() {
        synchronized (e) {
            f42324c = null;
        }
    }

    private void d(byte[] bArr, DeviceInfo deviceInfo) {
        if (bArr == null || bArr.length < 5 || deviceInfo == null) {
            LogUtil.j("HwContactSyncMgr", "handleSyncContacts: byte array is null or invalid length.");
            return;
        }
        LogUtil.a("HwContactSyncMgr", "handleSyncContacts: start, bytes: ", Arrays.toString(bArr));
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(1, deviceInfo.getDeviceIdentify(), "HwContactSyncMgr");
        DeviceCapability deviceCapability = (mapQueryDeviceCapability == null || mapQueryDeviceCapability.isEmpty()) ? null : mapQueryDeviceCapability.get(deviceInfo.getDeviceIdentify());
        if (deviceCapability == null) {
            LogUtil.j("HwContactSyncMgr", "capability is null.");
            return;
        }
        if (!deviceCapability.isSupportSyncContacts()) {
            LogUtil.a("HwContactSyncMgr", "isSupportSyncContacts: the capability set is not supported.");
            return;
        }
        LogUtil.a("HwContactSyncMgr", "isSupportSyncContacts: the capability set is supported.");
        if (!mtk.d()) {
            c(deviceInfo);
            LogUtil.a("HwContactSyncMgr", "handleSyncContacts: has no read contacts permissions");
            return;
        }
        if (!deviceCapability.isSupportSyncHiCall()) {
            LogUtil.a("HwContactSyncMgr", "isNeedSyncExtras: the capability set is not supported.");
            return;
        }
        byte b2 = bArr[1];
        if (b2 == 4) {
            LogUtil.a("HwContactSyncMgr", "handleSyncContacts: response 5.3.4");
            c(bArr, deviceInfo);
        } else if (b2 == 3) {
            LogUtil.a("HwContactSyncMgr", "handleSyncContacts: response 5.3.3");
            e(bArr, deviceInfo);
        }
    }

    public void d(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("HwContactSyncMgr", "onDeviceConnected: deviceInfo is null");
        } else {
            this.f42326b.d(deviceInfo);
        }
    }

    public void a(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("HwContactSyncMgr", "onDeviceDisconnected: deviceInfo is null");
        } else {
            this.f42326b.c(deviceInfo);
        }
    }

    public void c() {
        msc.c().d(BaseApplication.getContext());
        msc.c().b();
        a();
    }

    private void c(byte[] bArr, DeviceInfo deviceInfo) {
        mrv mrvVarD = d(bArr);
        ReleaseLogUtil.d("R_HwContactSyncMgr", "responseContactsSyncState: errorCode/isNeedSync", Integer.valueOf(mrvVarD.d()), Boolean.valueOf(mrvVarD.e()));
        e(mrvVarD.d(), deviceInfo);
        msc mscVarC = msc.c();
        String strE = mtn.e();
        mti.c(strE, mrvVarD.e());
        if (mrvVarD.e()) {
            mscVarC.e(strE, 0);
            mscVarC.c(deviceInfo);
        }
        mscVarC.a(BaseApplication.getContext(), strE);
    }

    private void e(byte[] bArr, DeviceInfo deviceInfo) {
        int iC = c(bArr);
        ReleaseLogUtil.d("R_HwContactSyncMgr", "responseExtrasResult: errorCode:", Integer.valueOf(iC));
        if (iC == 400000) {
            msc.c().e();
        } else {
            msc.c().a(deviceInfo);
        }
    }

    private void c(DeviceInfo deviceInfo) {
        LogUtil.a("HwContactSyncMgr", "responseNoPermissions: report to device with no contacts permission");
        ContactsDataSender.d().c(4, c(100004), deviceInfo);
    }

    private mrv d(byte[] bArr) {
        if (bArr == null || bArr.length < 5) {
            return new mrv(100006, false);
        }
        if (bArr[1] != 4) {
            return new mrv(100003, false);
        }
        if (bArr[2] != 1) {
            return new mrv(WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007, false);
        }
        return new mrv(100000, bArr[4] == 1);
    }

    private int c(byte[] bArr) {
        LogUtil.a("HwContactSyncMgr", "parseExtraDataStateResult: start");
        int iB = b(bArr);
        if (iB != 0) {
            return iB;
        }
        try {
            List<eew> listE = this.g.b(eeq.e(Arrays.copyOfRange(bArr, 2, bArr.length))).e();
            if (listE != null && listE.size() >= 1) {
                eew eewVar = listE.get(0);
                int iE = CommonUtil.e(eewVar.e(), Integer.MIN_VALUE);
                if (iE == Integer.MIN_VALUE) {
                    return 100011;
                }
                if (iE != 127) {
                    return WatchFaceConstant.WATCH_FACE_SIGN_FAILED_ERROR_100007;
                }
                int iE2 = CommonUtil.e(eewVar.b(), Integer.MIN_VALUE);
                if (iE2 == Integer.MIN_VALUE) {
                    return 100011;
                }
                return iE2 == 100000 ? 400000 : 400001;
            }
            LogUtil.j("HwContactSyncMgr", "parseSyncHiCallStateResult: invalid tlv ");
            return 100006;
        } catch (eeu unused) {
            LogUtil.e("HwContactSyncMgr", "parseSyncHiCallStateResult: TlvException occurred.");
            xjt.k("parseSyncHiCallStateResult: TlvException occurred");
            return 100011;
        }
    }

    private int b(byte[] bArr) {
        if (bArr != null && bArr.length >= 6) {
            return bArr[1] != 7 ? 100003 : 0;
        }
        LogUtil.j("HwContactSyncMgr", "checkSyncResultByteArray: bytes is null or invalid.");
        return 100006;
    }

    private void e(int i, DeviceInfo deviceInfo) {
        ContactsDataSender.d().c(4, c(i), deviceInfo);
    }

    private byte[] c(int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        byteBufferAllocate.put(Ascii.DEL);
        byteBufferAllocate.put((byte) 4);
        byteBufferAllocate.putInt(i);
        return byteBufferAllocate.array();
    }

    @Override // com.huawei.hwdevice.phoneprocess.binder.ParserInterface
    public void getResult(DeviceInfo deviceInfo, byte[] bArr) {
        d(bArr, deviceInfo);
    }
}
