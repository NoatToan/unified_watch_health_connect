package defpackage;

import android.content.Context;
import com.huawei.callback.BluetoothDataReceiveCallback;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lza extends HwBaseManager implements BluetoothDataReceiveCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static lza f41175c;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private lvb f41176a;
    private IBaseResponseCallback d;

    private lza(Context context) {
        super(context);
        lvb lvbVarE = lvb.e();
        this.f41176a = lvbVarE;
        if (lvbVarE != null) {
            lvbVarE.d(12, this);
        } else {
            LogUtil.j("HwDeviceFontManager", "HwDeviceFontManager(), mHwDeviceConfigManager is null");
        }
    }

    public static lza d() {
        lza lzaVar;
        synchronized (e) {
            if (f41175c == null) {
                LogUtil.a("HwDeviceFontManager", "getInstance()");
                f41175c = new lza(BaseApplication.getContext());
            }
            lzaVar = f41175c;
        }
        return lzaVar;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 12;
    }

    public void b(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("HwDeviceFontManager", "registerDataCallback");
        this.d = iBaseResponseCallback;
    }

    public void a() {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(12);
        deviceCommand.setCommandID(2);
        String strB = eeq.b(0);
        String strD = eeq.d(1);
        StringBuilder sb = new StringBuilder(16);
        sb.append(strD);
        sb.append(strB);
        deviceCommand.setDataLen(sb.length() / 2);
        deviceCommand.setDataContent(eeq.c(sb.toString()));
        LogUtil.a("HwDeviceFontManager", "getDeviceFontInfo deviceCommand :", deviceCommand.toString());
        this.f41176a.c(deviceCommand);
    }

    private String[] c(byte[] bArr) {
        LogUtil.a("HwDeviceFontManager", "Enter parseDeviceFontInfo");
        ees eesVarB = b(bArr);
        if (eesVarB == null) {
            return null;
        }
        try {
            List<eew> listE = eesVarB.e();
            if (listE == null) {
                LogUtil.j("HwDeviceFontManager", "parseDeviceFontInfo tlvList is null");
                return null;
            }
            for (eew eewVar : listE) {
                LogUtil.d("HwDeviceFontManager", "the case is", Integer.valueOf(Integer.parseInt(eewVar.e(), 16)));
                if (Integer.parseInt(eewVar.e(), 16) == 1) {
                    try {
                        String strD = eeq.d(eewVar.b());
                        LogUtil.d("HwDeviceFontManager", "DEVICE_FONT_STURCT TAG :", eewVar.e(), "value :", strD);
                        if (strD == null) {
                            LogUtil.j("HwDeviceFontManager", "language is null");
                            return null;
                        }
                        return strD.split(",");
                    } catch (Exception unused) {
                        LogUtil.e("HwDeviceFontManager", "parseDeviceFontInfo() Exception is null");
                    }
                } else {
                    LogUtil.j("HwDeviceFontManager", "DEVICE_FONT_STURCT TAG :", eewVar.e(), "value :", eewVar.b());
                }
            }
            return null;
        } catch (NumberFormatException unused2) {
            LogUtil.e("HwDeviceFontManager", "parseDeviceFontInfo NumberFormatException");
        }
    }

    private ees b(byte[] bArr) {
        LogUtil.a("HwDeviceFontManager", "Enter getTlvList");
        if (bArr == null) {
            LogUtil.j("HwDeviceFontManager", "dataContent is null");
            return null;
        }
        String strE = eeq.e(bArr);
        if (strE.length() > 4) {
            try {
                return new eet().b(strE.substring(4, strE.length()));
            } catch (eeu unused) {
                LogUtil.e("HwDeviceFontManager", "resloveWatchStatus TlvException");
            }
        }
        return null;
    }

    @Override // com.huawei.callback.BluetoothDataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, byte[] bArr) {
        if (i != 0) {
            LogUtil.j("HwDeviceFontManager", "onDataReceived errorCode is not SUCCESS, errorCode :", Integer.valueOf(i));
            return;
        }
        LogUtil.a("HwDeviceFontManager", "onDataReceived, errorCode :", Integer.valueOf(i), "value :", bArr);
        if (bArr == null) {
            LogUtil.j("HwDeviceFontManager", "onDataReceived, data is null");
            return;
        }
        IBaseResponseCallback iBaseResponseCallback = this.d;
        if (iBaseResponseCallback == null) {
            LogUtil.j("HwDeviceFontManager", "onDataReceived, mBaseResponseCallback is null");
            return;
        }
        if (bArr.length < 1) {
            LogUtil.j("HwDeviceFontManager", "onDataReceived responseData length less than 1");
        } else if (bArr[1] != 2) {
            LogUtil.j("HwDeviceFontManager", "onDataReceived, default");
        } else {
            iBaseResponseCallback.a(2, c(bArr));
        }
    }
}
