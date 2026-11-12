package defpackage;

import android.content.Context;
import android.os.Message;
import com.huawei.multisimsdk.multidevicemanager.common.AbsPairedDevice;
import com.huawei.multisimsdk.multidevicemanager.common.AbsPrimaryDevice;
import com.huawei.multisimsdk.multidevicemanager.common.AuthParam;

/* JADX INFO: loaded from: classes12.dex */
public class ocr {
    private static String d = "HwMultiDeviceManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AuthParam f44155b;
    private Context e;

    public void e(Context context) {
        if (context == null) {
            ocq.e(d, "HwMultiDeviceManager init failed, context is null");
        } else {
            c(context, (String) null, (String) null);
        }
    }

    public void c(Context context, String str, String str2) {
        a(context, null, str, str2);
    }

    public void a(Context context, AuthParam authParam, String str, String str2) {
        if (context == null) {
            ocq.e(d, "HwMultiDeviceManager init failed, context is null");
            return;
        }
        this.e = context;
        ock.c(context, authParam);
        obi.c().b(context);
        ocj.e(str, str2);
        ocm.c().d(context);
        AuthParam authParam2 = this.f44155b;
        int authType = authParam2 != null ? authParam2.getAuthType() : 3;
        ocq.e(d, "init authType=" + authType);
        if ("1".equals(ock.e())) {
            if (authParam == null) {
                ocq.e(d, "init(), authParam is null");
                ocf.a().c(context);
            } else {
                this.f44155b = authParam;
                ocf.a().e(context, authParam);
            }
        } else if (authParam == null) {
            ocq.c(d, "init(), es authParam is null");
            return;
        } else {
            this.f44155b = authParam;
            odd.d().b(context, authParam);
        }
        ocq.e(d, "Start init HwMultiSIMSdk");
    }

    public void d() {
        ocf.a().e();
        odd.d().a();
        obi.c().j();
        ock.b();
        ocq.e(d, "Finish HwMultiSIMSdk exit");
    }

    public void a(AbsPrimaryDevice absPrimaryDevice, AbsPairedDevice absPairedDevice, Message message) {
        if ("1".equals(ock.e())) {
            c(absPrimaryDevice, absPairedDevice, message, null, 100);
        } else {
            odd.d().e(absPrimaryDevice, absPairedDevice, message);
        }
    }

    public void c(AbsPrimaryDevice absPrimaryDevice, AbsPairedDevice absPairedDevice, Message message) {
        ocq.e(d, "acquireStatusByPolling start.");
        odd.d().b(absPrimaryDevice, absPairedDevice, message, 5);
    }

    public void b(AbsPrimaryDevice absPrimaryDevice, AbsPairedDevice absPairedDevice, Message message) {
        odd.d().b(absPrimaryDevice, absPairedDevice, message);
    }

    public void e(AbsPrimaryDevice absPrimaryDevice, AbsPairedDevice absPairedDevice, Message message) {
        if ("1".equals(ock.e())) {
            c(absPrimaryDevice, absPairedDevice, message, null, 102);
        } else {
            odd.d().c(absPrimaryDevice, absPairedDevice, message);
        }
    }

    public boolean d(Context context, AuthParam authParam, Message message) {
        return d(context, authParam, null, null, message);
    }

    public boolean d(Context context, AuthParam authParam, AbsPrimaryDevice absPrimaryDevice, AbsPairedDevice absPairedDevice, Message message) {
        if ("1".equals(ock.e())) {
            return ocj.a(context, authParam, message);
        }
        return odd.d().c(context, authParam, absPrimaryDevice, absPairedDevice, message);
    }

    private void c(AbsPrimaryDevice absPrimaryDevice, AbsPairedDevice absPairedDevice, Message message, Message message2, int i) {
        ocf.d dVarI = ocf.a().i();
        obo oboVar = new obo();
        if (absPrimaryDevice != null) {
            String strE = e(absPrimaryDevice.getService());
            String primaryID = absPrimaryDevice.getPrimaryID();
            String strD = d(absPrimaryDevice.getPrimaryIDType());
            oboVar.a(primaryID);
            oboVar.c(strD);
            oboVar.i(strE);
            if (ocq.f44154c.booleanValue()) {
                ocq.e(d, "progressData.getPrimary():" + oboVar.j());
                ocq.e(d, "progressData.primarytype:" + strD);
            }
        }
        if (absPairedDevice != null) {
            oboVar.d(absPairedDevice.getPairedID());
            oboVar.j(d(absPairedDevice.getPairedIDType()));
            oboVar.e(absPairedDevice.getPairedDeviceName());
            oboVar.b(absPairedDevice.getDeviceID());
            oboVar.b(absPairedDevice.getSecondaryDeviceId());
            oboVar.b(absPairedDevice.getLiveIdSupported());
            oboVar.d(absPairedDevice.getEuiccPairing());
            if (ocq.f44154c.booleanValue()) {
                ocq.e(d, "SecondaryType:" + oboVar.m());
                ocq.e(d, "SecondaryID:" + oboVar.g());
            }
        }
        if (message != null) {
            oboVar.d(message);
        }
        if (message2 != null) {
            oboVar.e(message2);
        }
        oboVar.e(i);
        if (dVarI != null) {
            dVarI.sendMessage(dVarI.obtainMessage(i, oboVar));
        }
    }

    private String d(int i) {
        if (i == 0) {
            return "IMSI";
        }
        if (i == 1) {
            return "MSISDN";
        }
        if (i == 2) {
            return "ICCID";
        }
        if (i != 3) {
            return null;
        }
        return "EID";
    }

    private String e(int i) {
        if (i == 0 || i != 1) {
            return "Multi-SIM";
        }
        return "eSIM Profile";
    }
}
