package defpackage;

import com.miui.circulate.api.bean.ExtraBundle;
import com.miui.circulate.api.service.CirculateDeviceInfo;
import com.miui.circulate.api.service.CirculateServiceInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class c52 extends a72 implements dqc {
    public void i(zw3 zw3Var, int i, int i2, CirculateDeviceInfo... circulateDeviceInfoArr) {
        CirculateDeviceInfo circulateDeviceInfo;
        if (zw3Var == null) {
            tpe.i("ClientInterface", "circulateResult error, null callback");
            return;
        }
        CirculateServiceInfo circulateServiceInfoA = null;
        CirculateDeviceInfo circulateDeviceInfo2 = null;
        if (circulateDeviceInfoArr == null || circulateDeviceInfoArr.length <= 0) {
            circulateDeviceInfo = null;
        } else {
            CirculateServiceInfo circulateServiceInfo = null;
            for (CirculateDeviceInfo circulateDeviceInfo3 : circulateDeviceInfoArr) {
                if (circulateDeviceInfo3 != null) {
                    CirculateServiceInfo circulateServiceInfoC = circulateDeviceInfo3.c(i);
                    if (circulateServiceInfoC != null) {
                        tpe.f("ClientInterface", "circulateResult: code=" + i2 + ", connectState=" + circulateServiceInfoC.d);
                        if (i2 > -1) {
                            circulateServiceInfoC.d = i2;
                        } else if (circulateServiceInfoC.d == 3) {
                            circulateServiceInfoC.d = 0;
                        }
                        if (circulateDeviceInfo2 == null) {
                            circulateDeviceInfo2 = circulateDeviceInfo3;
                            circulateServiceInfo = circulateServiceInfoC;
                        }
                    } else {
                        ExtraBundle extraBundle = circulateDeviceInfo3.h;
                        if (extraBundle != null && extraBundle.a(CirculateDeviceInfo.IS_NFC_CIRCULATE) && circulateDeviceInfo3.h.d(CirculateDeviceInfo.IS_NFC_CIRCULATE, false)) {
                            CirculateServiceInfo circulateServiceInfoA2 = i == 196609 ? CirculateServiceInfo.a(fx3.a(i)) : CirculateServiceInfo.a(i);
                            if (i2 > -1) {
                                circulateServiceInfoA2.d = i2;
                            } else {
                                circulateServiceInfoA2.d = 0;
                            }
                            circulateServiceInfo = circulateServiceInfoA2;
                            circulateDeviceInfo2 = circulateDeviceInfo3;
                        }
                    }
                }
            }
            circulateDeviceInfo = circulateDeviceInfo2;
            circulateServiceInfoA = circulateServiceInfo;
        }
        if (circulateServiceInfoA == null) {
            circulateServiceInfoA = CirculateServiceInfo.a(i);
        }
        zw3Var.onConnectStateChange(i2, circulateDeviceInfo, circulateServiceInfoA);
    }
}
