package zb0;

import android.app.Activity;
import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.device.pairing.devices.PrimaryApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class k {
    public static final String a(String str) {
        if (str != null && str.length() == 4) {
            return str;
        }
        List listX = str != null ? d53.w.X(str, new char[]{'-'}) : null;
        if (listX != null && listX.size() == 3) {
            String str2 = (String) listX.get(1);
            if (str2.length() > 1 && Character.isLetter(d53.y.p0(str2))) {
                return d53.y.n0(1, str2);
            }
        }
        return null;
    }

    public static final Object b(Class cls, long j8) {
        da2.b bVar = da2.d.b().f58886a.f111646e;
        DeviceProfile deviceProfile = (DeviceProfile) p13.u.H(bVar.a(j8));
        if (deviceProfile == null) {
            return null;
        }
        String macAddress = deviceProfile.getMacAddress();
        macAddress.getClass();
        return bVar.getCapability(macAddress, cls);
    }

    public static final String c(sd2.f fVar) {
        fVar.getClass();
        if (oa2.a.c(fVar.d0())) {
            return fVar.d0();
        }
        if (oa2.a.c(fVar.Q())) {
            return fVar.Q();
        }
        return null;
    }

    public static final void d(Context context, String str, String[] strArr, e23.a<Unit> aVar) {
        if (context != null) {
            Activity activity = context instanceof Activity ? (Activity) context : null;
            boolean z14 = true;
            if (activity == null || !activity.isFinishing()) {
                j22.b.f96736a.getClass();
                if (j22.b.b(context)) {
                    int length = strArr.length;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= length) {
                            z14 = false;
                            break;
                        } else if (oa2.a.c(strArr[i14])) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                } else {
                    a2 a2Var = a2.GENERAL;
                    String strM = am.j.m("showDeviceRemovedAlert device[", str, "] BLUETOOTH permission not granted");
                    i2.f36769a.getClass();
                    i2.a.a(a2Var, strM);
                }
                a2 a2Var2 = a2.GENERAL;
                String strG = n23.j.g("showDeviceRemovedAlert device[", str, "] isDeviceCurrentlyBonded[", z14, "]");
                i2.f36769a.getClass();
                i2.a.a(a2Var2, strG);
                if (!z14) {
                    aVar.invoke();
                    return;
                }
                if (str == null) {
                    str = context.getString(R.string.lbl_device);
                    str.getClass();
                }
                androidx.appcompat.app.e eVarCreate = new androidx.appcompat.app.e.a(context).setTitle(context.getString(R.string.lbl_item_removed, str)).setMessage(context.getString(R.string.msg_remove_device_alert_caution, str)).setPositiveButton(R.string.lbl_settings, new wq.c(10, aVar, context)).setNegativeButton(R.string.lbl_close, new c32.a(aVar, 18)).setCancelable(false).create();
                eVarCreate.setCanceledOnTouchOutside(false);
                eVarCreate.show();
            }
        }
    }

    public static final void e(Context context, sd2.f fVar, e23.a<Unit> aVar) {
        fVar.getClass();
        String displayName = fVar.getDisplayName();
        if (displayName == null) {
            displayName = fVar.getProductDisplayName();
            displayName.getClass();
        }
        ArrayList arrayList = new ArrayList();
        String strD0 = fVar.d0();
        if (strD0 != null) {
            arrayList.add(strD0);
        }
        String strQ = fVar.Q();
        if (strQ != null) {
            arrayList.add(strQ);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        d(context, displayName, (String[]) Arrays.copyOf(strArr, strArr.length), aVar);
    }

    public static final com.garmin.android.apps.connectmobile.devices.model.l f(bm2.c cVar) {
        Integer numValueOf;
        cVar.getClass();
        long j8 = cVar.f18942x;
        String productDisplayName = cVar.getProductDisplayName();
        String str = cVar.f18903d;
        String str2 = cVar.f18909g;
        String str3 = cVar.f18897a;
        boolean z14 = cVar.f18922m;
        boolean z15 = cVar.f18924n;
        String[] strArr = cVar.f18932r;
        int i14 = cVar.f18930q;
        String str4 = cVar.f18899b;
        String productDisplayName2 = cVar.getProductDisplayName();
        String str5 = cVar.f18935t;
        String str6 = cVar.f18938v;
        boolean z16 = cVar.f18916j1;
        boolean z17 = cVar.f18946z;
        boolean z18 = cVar.A;
        boolean z19 = cVar.U0;
        boolean z24 = cVar.f18923m1;
        boolean z25 = cVar.f18925n1;
        PrimaryApp primaryApp = cVar.f18931q1;
        ArrayList arrayList = cVar.f18933r1;
        long j14 = cVar.f18939v1;
        try {
            String str7 = cVar.f18907f;
            numValueOf = str7 != null ? Integer.valueOf(Integer.parseInt(d53.u.v(str7, ".", "", false))) : null;
        } catch (NumberFormatException e4) {
            a2 a2Var = a2.GENERAL;
            String strN = fb1.c.n("Failed to parse software version for device: ", cVar.getProductDisplayName());
            i2.f36769a.getClass();
            i2.a.g(a2Var, strN, e4);
        }
        return new com.garmin.android.apps.connectmobile.devices.model.l(j8, productDisplayName, null, str, str2, str3, z14, z15, strArr, null, i14, str4, productDisplayName2, str5, str6, z19, Long.valueOf(j14), null, z24, z25, z16, primaryApp, arrayList, Integer.valueOf(numValueOf != null ? numValueOf.intValue() : 0), z17, z18);
    }

    public static final com.garmin.android.apps.connectmobile.devices.model.l g(sd2.f fVar) {
        fVar.getClass();
        long unitID = fVar.getUnitID();
        String displayName = fVar.getDisplayName();
        String productNumber = fVar.getProductNumber();
        String imageURL = fVar.getImageURL();
        String applicationKey = fVar.getApplicationKey();
        boolean z14 = true;
        if (fVar.Q() == null) {
            z14 = false;
        }
        return new com.garmin.android.apps.connectmobile.devices.model.l(unitID, displayName, null, productNumber, imageURL, applicationKey, z14, fVar.d0() != null, fVar.B(), null, fVar.C2(), fVar.getPartNumber(), fVar.getProductDisplayName(), null, null, false, null, null, false, false, false, null, null, null, false, false, 57704448, null);
    }
}
