package com.amap.api.mapcore.util;

import android.os.Build;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class le {
    private static long c;
    public lh a;
    public kx b;

    public final void a() {
        lh lhVar;
        Object obj;
        try {
            if (this.b == null || (lhVar = this.a) == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            List<CellInfo> allCellInfo = lhVar.d.getAllCellInfo();
            if (Build.VERSION.SDK_INT >= 17 && allCellInfo != null) {
                for (CellInfo cellInfo : allCellInfo) {
                    if (cellInfo instanceof CellInfoCdma) {
                        CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
                        CellIdentityCdma cellIdentity = cellInfoCdma.getCellIdentity();
                        kz kzVar = new kz(cellInfo.isRegistered(), true);
                        kzVar.m = cellIdentity.getLatitude();
                        kzVar.n = cellIdentity.getLongitude();
                        kzVar.j = cellIdentity.getSystemId();
                        kzVar.k = cellIdentity.getNetworkId();
                        kzVar.l = cellIdentity.getBasestationId();
                        kzVar.d = cellInfoCdma.getCellSignalStrength().getAsuLevel();
                        kzVar.c = cellInfoCdma.getCellSignalStrength().getCdmaDbm();
                        obj = kzVar;
                    } else if (cellInfo instanceof CellInfoGsm) {
                        CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
                        CellIdentityGsm cellIdentity2 = cellInfoGsm.getCellIdentity();
                        la laVar = new la(cellInfo.isRegistered(), true);
                        laVar.a = String.valueOf(cellIdentity2.getMcc());
                        laVar.b = String.valueOf(cellIdentity2.getMnc());
                        laVar.j = cellIdentity2.getLac();
                        laVar.k = cellIdentity2.getCid();
                        laVar.c = cellInfoGsm.getCellSignalStrength().getDbm();
                        laVar.d = cellInfoGsm.getCellSignalStrength().getAsuLevel();
                        if (Build.VERSION.SDK_INT >= 24) {
                            laVar.m = cellIdentity2.getArfcn();
                            laVar.n = cellIdentity2.getBsic();
                        }
                        arrayList.add(laVar);
                    } else if (cellInfo instanceof CellInfoLte) {
                        CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
                        CellIdentityLte cellIdentity3 = cellInfoLte.getCellIdentity();
                        lb lbVar = new lb(cellInfo.isRegistered());
                        lbVar.a = String.valueOf(cellIdentity3.getMcc());
                        lbVar.b = String.valueOf(cellIdentity3.getMnc());
                        lbVar.l = cellIdentity3.getPci();
                        lbVar.d = cellInfoLte.getCellSignalStrength().getAsuLevel();
                        lbVar.k = cellIdentity3.getCi();
                        lbVar.j = cellIdentity3.getTac();
                        lbVar.n = cellInfoLte.getCellSignalStrength().getTimingAdvance();
                        lbVar.c = cellInfoLte.getCellSignalStrength().getDbm();
                        obj = lbVar;
                        if (Build.VERSION.SDK_INT >= 24) {
                            lbVar.m = cellIdentity3.getEarfcn();
                            obj = lbVar;
                        }
                    } else {
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 18 && (cellInfo instanceof CellInfoWcdma)) {
                            CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
                            CellIdentityWcdma cellIdentity4 = cellInfoWcdma.getCellIdentity();
                            lc lcVar = new lc(cellInfo.isRegistered(), true);
                            lcVar.a = String.valueOf(cellIdentity4.getMcc());
                            lcVar.b = String.valueOf(cellIdentity4.getMnc());
                            lcVar.j = cellIdentity4.getLac();
                            lcVar.k = cellIdentity4.getCid();
                            lcVar.l = cellIdentity4.getPsc();
                            lcVar.d = cellInfoWcdma.getCellSignalStrength().getAsuLevel();
                            lcVar.c = cellInfoWcdma.getCellSignalStrength().getDbm();
                            if (i >= 24) {
                                lcVar.m = cellIdentity4.getUarfcn();
                            }
                            arrayList.add(lcVar);
                        }
                    }
                    arrayList.add(obj);
                }
            }
            kx.a(arrayList);
        } catch (Throwable th) {
            ke.a(th, "cl", "upc");
        }
    }
}
