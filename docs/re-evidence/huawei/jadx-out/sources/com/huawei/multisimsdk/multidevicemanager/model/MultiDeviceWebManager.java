package com.huawei.multisimsdk.multidevicemanager.model;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.multisimsdk.multidevicemanager.common.AuthParam;
import com.huawei.multisimsdk.multidevicemanager.common.InProgressData;
import com.huawei.multisimsdk.multidevicemanager.util.ResponseHandler;
import defpackage.obf;
import defpackage.obk;
import defpackage.obq;
import defpackage.obt;
import defpackage.obu;
import defpackage.obv;
import defpackage.oby;
import defpackage.obz;
import defpackage.ocb;
import defpackage.ocd;
import defpackage.oce;
import defpackage.ocg;
import defpackage.ock;
import defpackage.oco;
import defpackage.ocp;
import defpackage.ocq;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class MultiDeviceWebManager {
    private static final String e = "MultiDeviceWebManager";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ResponseHandler f18037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AuthParam f18038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f18039c;
    private InProgressData d;

    public MultiDeviceWebManager(Context context) {
        this(context, null);
    }

    public MultiDeviceWebManager(Context context, AuthParam authParam) {
        this.f18038b = null;
        this.f18037a = new ResponseHandler() { // from class: com.huawei.multisimsdk.multidevicemanager.model.MultiDeviceWebManager.4
            @Override // com.huawei.multisimsdk.multidevicemanager.util.ResponseHandler
            public void onCallback(String str) {
                obz obzVarA;
                obk obkVarC;
                ArrayList<obq> arrayListB;
                String strC;
                ocb ocbVar = new ocb();
                ocbVar.d(str);
                oby obyVarD = ocbVar.d();
                oce oceVarC = ocbVar.c();
                String strA = ocbVar.d().a();
                ocq.e(MultiDeviceWebManager.e, "reqName=" + strA);
                if ("GetDevServInfo".equals(strA) && (obzVarA = ocbVar.a()) != null && (obkVarC = obzVarA.c()) != null && (arrayListB = obkVarC.b()) != null) {
                    int size = arrayListB.size();
                    for (int i = 0; i < size; i++) {
                        obq obqVar = arrayListB.get(i);
                        if (obqVar != null && (strC = obqVar.c()) != null) {
                            oco.b(MultiDeviceWebManager.this.f18039c, obf.b(MultiDeviceWebManager.this.f18039c, MultiDeviceWebManager.this.f18038b), "smdp_address", strC);
                        }
                    }
                }
                if (MultiDeviceWebManager.this.b(obyVarD).booleanValue()) {
                    MultiDeviceWebManager.this.c(oceVarC);
                }
            }
        };
        if (context != null) {
            this.f18039c = context.getApplicationContext();
        }
        this.f18038b = authParam;
    }

    public void b(InProgressData inProgressData) {
        this.d = inProgressData;
    }

    public void c() {
        InProgressData inProgressData = this.d;
        if (inProgressData != null) {
            if (100 == inProgressData.getType()) {
                b();
            } else {
                e();
            }
        }
    }

    public void b() {
        String strD = ock.d();
        String strA = a(1);
        ocp.d().d(strD, strA, null, oco.b(this.f18039c, obf.b(this.f18039c, this.f18038b), "authorization"), this.f18037a);
    }

    private String a(int i) {
        obu obuVar = new obu();
        obt obtVar = new obt();
        obuVar.e(oco.d());
        if (this.d != null) {
            if (1 == i) {
                obtVar.e("Binding");
                obtVar.c(this.d.getNikename());
            } else if (2 == i) {
                obtVar.e("Unbinding");
            }
            String primary = this.d.getPrimary();
            obtVar.a(this.d.getPrimaryIDtype());
            obtVar.b(primary);
            obtVar.i(this.d.getSecondarytype());
            obtVar.d(this.d.getSecondaryID());
            obtVar.e(this.d.getSecondaryDeviceId());
            obtVar.d(this.d.getLiveIdSupported());
            obtVar.e(this.d.getEuiccPairing());
            obuVar.a(primary);
            obuVar.e(this.d.getPrimaryIDtype());
            obuVar.b(this.d.getServiceType());
        }
        obuVar.c(obtVar);
        obv obvVar = new obv();
        obvVar.d(obuVar);
        obvVar.c(oco.e(this.f18039c, obf.b(this.f18039c, this.f18038b)));
        return obvVar.e();
    }

    public void e() {
        ocp.d().c(oco.c(this.d), a(2), this.f18037a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Boolean b(oby obyVar) {
        if (obyVar != null) {
            int iD = obyVar.d();
            InProgressData inProgressData = this.d;
            if (inProgressData != null) {
                inProgressData.setResultcode(iD);
            }
            String str = e;
            ocq.e(str, "Handler quick authenResult, resultCode=" + iD);
            if (1000 != iD) {
                if (1004 == iD) {
                    ocq.e(str, "TokenAuthen is invalid");
                    oco.c(107, this.d);
                    return false;
                }
                ocq.e(str, "TokenAuthen is fail");
                oco.c(106, this.d);
                return false;
            }
            ocq.e(str, "TokenAuthen is valid");
            String strB = obf.b(this.f18039c, this.f18038b);
            String strB2 = oco.b(this.f18039c, strB, "Tag");
            if (!TextUtils.isEmpty(strB)) {
                oco.b(this.f18039c, strB, "authen_Token", obyVar.c());
            }
            if (!TextUtils.isEmpty(strB2)) {
                oco.b(this.f18039c, strB2, "authen_Token", obyVar.c());
            }
            if (!TextUtils.isEmpty(strB) && !TextUtils.isEmpty(strB2)) {
                oco.a(this.f18039c, strB2, strB);
            }
            return true;
        }
        ocq.e(e, "ResponseAuthFirstInfo is null");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(oce oceVar) {
        if (oceVar != null) {
            int iE = oceVar.e();
            InProgressData inProgressData = this.d;
            if (inProgressData != null) {
                inProgressData.setResultcode(iE);
            }
            String str = e;
            ocq.e(str, "ResponseServiceProvisionInfo.getResultcode()=" + iE);
            if (2000 == iE) {
                ocd ocdVarC = oceVar.c();
                if (ocdVarC != null) {
                    String strD = ocdVarC.d();
                    String strB = ocdVarC.b();
                    if (ocq.f44154c.booleanValue()) {
                        ocq.e(str, "MultiServiceResponseHandler:url =" + strD + ", postdata=" + strB);
                    }
                    InProgressData inProgressData2 = this.d;
                    if (inProgressData2 != null) {
                        inProgressData2.setTime(ocdVarC.c());
                        this.d.setPostdata(strB);
                    }
                    ocg ocgVar = new ocg();
                    ocgVar.c(oceVar.d());
                    ocgVar.e(oceVar.a());
                    ocgVar.d(strD);
                    ocgVar.a(strB);
                    InProgressData inProgressData3 = this.d;
                    if (inProgressData3 != null) {
                        inProgressData3.setWebViewData(ocgVar);
                    }
                    oco.c(8890, this.d);
                    return;
                }
                ocq.e(str, "responseMultiSIMService is null");
                oco.c(115, this.d);
                return;
            }
            ocq.e(str, "responseServiceProvisionInfo.getResultcode() is no success");
            oco.c(115, this.d);
            return;
        }
        ocq.e(e, "responseServiceProvisionInfo is null");
        InProgressData inProgressData4 = this.d;
        if (inProgressData4 != null) {
            inProgressData4.setResultcode(99);
        }
        oco.c(115, this.d);
    }
}
