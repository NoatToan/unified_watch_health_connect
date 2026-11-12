package com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.touchtransfer.operator;

import android.content.Context;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.mcy;
import defpackage.mdb;
import defpackage.mde;
import defpackage.mdg;
import defpackage.mdi;
import defpackage.mdj;
import defpackage.mdk;
import defpackage.mdm;
import defpackage.mdn;
import defpackage.mdq;
import defpackage.mdr;
import defpackage.mdu;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class HwTagCardOperator extends BaseOperator {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private mdb f17390c;

    public HwTagCardOperator(Context context) {
        super(context);
        this.f17390c = new mdb();
        c();
    }

    public int a() {
        this.f17389b = this.f17388a.e();
        mde mdeVarB = b();
        if (mdeVarB.e() != 0) {
            d();
            LogUtil.a("R_HwTagCardOperator", "download InstallApplet fail errorCode:", Integer.valueOf(mdeVarB.e()));
            if (mdeVarB.e() != -2) {
                return -6;
            }
            return mdeVarB.e();
        }
        mde mdeVarG = g();
        if (mdeVarG.e() != 0) {
            d();
            LogUtil.a("R_HwTagCardOperator", "PrePersonalize Applet fail errorCode:", Integer.valueOf(mdeVarG.e()));
            if (mdeVarG.e() != -2) {
                return -7;
            }
            return mdeVarG.e();
        }
        d();
        return 0;
    }

    public mde b() {
        LogUtil.a("HwTagCardOperator", "downloadAndInstallAppletWithRetry Applet Begin.");
        mde mdeVarE = e();
        if (mdeVarE.e() != 0) {
            LogUtil.a("HwTagCardOperator", "Retry downloadAndInstall Begin.");
            if (mdeVarE.e() == -8) {
                LogUtil.a("HwTagCardOperator", "Retry downloadAndInstall End initEseInfoErrorCode:", Integer.valueOf(j().e()));
            }
            mdeVarE = e();
        }
        if (mdeVarE.e() != 0) {
            LogUtil.a("HwTagCardOperator", "Download And Install Applet Failed.");
            return mdeVarE;
        }
        LogUtil.a("HwTagCardOperator", "Download And Install Applet Success.");
        return mdeVarE;
    }

    public mde e() {
        mde mdeVar = new mde();
        mdq mdqVarDownloadAndInstallApplet = this.d.downloadAndInstallApplet(new mdj("HwSportHealth", this.f17389b, "D2760000850101"));
        if (mdqVarDownloadAndInstallApplet.e() != 0) {
            LogUtil.a("HwTagCardOperator", "downloadAndInstall fail:", Integer.valueOf(mdqVarDownloadAndInstallApplet.e()));
            mdeVar.e(mdqVarDownloadAndInstallApplet.e());
            return mdeVar;
        }
        LogUtil.a("HwTagCardOperator", "downloadAndInstallApplet success");
        String strA = mdqVarDownloadAndInstallApplet.a();
        List<mdg> listD = mdqVarDownloadAndInstallApplet.d();
        if (listD == null || listD.isEmpty()) {
            LogUtil.a("HwTagCardOperator", "downloadAndInstallApplet apduList success");
            mdeVar.e(mdqVarDownloadAndInstallApplet.e());
            return mdeVar;
        }
        LogUtil.a("HwTagCardOperator", "downloadAndInstallApplet: executeCommand start");
        mde mdeVarE = e(a(strA, "download.install.app"), listD, mdqVarDownloadAndInstallApplet.b());
        LogUtil.a("HwTagCardOperator", "downloadAndInstallApplet: executeCommand : result:", Integer.valueOf(mdeVarE.e()));
        return mdeVarE;
    }

    public mde g() {
        LogUtil.a("HwTagCardOperator", "prePersonalizeWithRetry Applet Begin.");
        mde mdeVarF = f();
        if (mdeVarF.e() != 0) {
            LogUtil.a("HwTagCardOperator", "prePersonalizeWithRetry install Applet Begin.");
            mde mdeVarB = b();
            if (mdeVarB.e() != 0) {
                LogUtil.a("HwTagCardOperator", "prePersonalizeWithRetry install Applet Failed.");
                return mdeVarB;
            }
            LogUtil.a("HwTagCardOperator", "prePersonalizeWithRetry prePersonalizeWithDeleteWhenError Begin.");
            mdeVarF = f();
            LogUtil.a("HwTagCardOperator", "prePersonalizeWithRetry prePersonalizeWithDeleteWhenError End.");
        }
        if (mdeVarF.e() != 0) {
            LogUtil.a("HwTagCardOperator", "prePersonalizeWithRetry Applet Failed.");
            return mdeVarF;
        }
        LogUtil.a("HwTagCardOperator", "prePersonalizeWithRetry Applet Success:", Integer.valueOf(mdeVarF.e()));
        return mdeVarF;
    }

    public mde f() {
        mde mdeVarH = h();
        if (mdeVarH.e() != 0) {
            LogUtil.a("HwTagCardOperator", "prePersonalizeWithDeleteWhenError Failed Delete it.");
            LogUtil.a("HwTagCardOperator", "prePersonalizeWithDeleteWhenError Delete Applet success:", Boolean.valueOf(i()));
            if (mdeVarH.e() == -8) {
                LogUtil.a("HwTagCardOperator", "prePersonalizeWithDeleteWhenError initEseInfoErrorCode:", Integer.valueOf(j().e()));
            }
            return mdeVarH;
        }
        LogUtil.a("HwTagCardOperator", "prePersonalizeWithDeleteWhenError Applet Success:", Integer.valueOf(mdeVarH.e()));
        return mdeVarH;
    }

    public mde h() {
        LogUtil.a("HwTagCardOperator", " PrePersonalize Begin.");
        mde mdeVar = new mde();
        mdr mdrVarPersonalizeApplet = this.d.personalizeApplet(new mdk("HwSportHealth", this.f17389b, "D2760000850101"));
        if (mdrVarPersonalizeApplet.e() != 0) {
            LogUtil.a("HwTagCardOperator", "PrePersonalize fail detail:", Integer.valueOf(mdrVarPersonalizeApplet.e()));
            mdeVar.e(mdrVarPersonalizeApplet.e());
            return mdeVar;
        }
        LogUtil.a("HwTagCardOperator", " Get prePersonalize Applet: success");
        String strA = mdrVarPersonalizeApplet.a();
        List<mdg> listD = mdrVarPersonalizeApplet.d();
        if (listD == null || listD.isEmpty()) {
            LogUtil.a("HwTagCardOperator", "PrePersonalize Empty mean success");
            mdeVar.e(mdrVarPersonalizeApplet.e());
            return mdeVar;
        }
        mde mdeVarE = e(a(strA, "pass.mod.param"), listD, mdrVarPersonalizeApplet.c());
        LogUtil.a("HwTagCardOperator", "PrePersonalize: executeCommand : result:", Integer.valueOf(mdeVarE.e()));
        return mdeVarE;
    }

    private Map<String, String> a(String str, String str2) {
        HashMap map = new HashMap(16);
        map.put("appletId", "D2760000850101");
        map.put("issuerid", "HwSportHealth");
        map.put("cplc", this.f17389b);
        map.put("transactionId", str);
        map.put("commandId", str2);
        return map;
    }

    private boolean i() {
        boolean z;
        mdn mdnVarDeleteApplet = this.d.deleteApplet(new mdm("HwSportHealth", this.f17389b, "D2760000850101"));
        if (mdnVarDeleteApplet.e() != 0) {
            LogUtil.a("HwTagCardOperator", "deleteApplet download fail");
        } else {
            LogUtil.a("HwTagCardOperator", "deleteApplet download success");
            String strA = mdnVarDeleteApplet.a();
            List<mdg> listD = mdnVarDeleteApplet.d();
            if (listD != null && !listD.isEmpty()) {
                LogUtil.a("HwTagCardOperator", "deleteApplet: executeCommand");
                mde mdeVarE = e(a(strA, "delete.app"), listD, mdnVarDeleteApplet.c());
                LogUtil.a("HwTagCardOperator", "deleteApplet: executeCommand : result:", Integer.valueOf(mdeVarE.e()));
                if (mdeVarE.e() == 0) {
                }
                LogUtil.a("HwTagCardOperator", "deleteApplet executeCommand success deleteSuccess:", Boolean.valueOf(z));
                return z;
            }
            z = true;
            LogUtil.a("HwTagCardOperator", "deleteApplet executeCommand success deleteSuccess:", Boolean.valueOf(z));
            return z;
        }
        z = false;
        LogUtil.a("HwTagCardOperator", "deleteApplet executeCommand success deleteSuccess:", Boolean.valueOf(z));
        return z;
    }

    private mde j() {
        mde mdeVar = new mde();
        mdi mdiVar = new mdi(this.f17389b);
        LogUtil.a("HwTagCardOperator", "create paramQueryRequest");
        mdu mduVarQueryInfoInitTsmParam = this.d.queryInfoInitTsmParam(mdiVar);
        if (mduVarQueryInfoInitTsmParam.e() != 0) {
            LogUtil.a("HwTagCardOperator", "initEse fail detail:", Integer.valueOf(mduVarQueryInfoInitTsmParam.e()));
            mdeVar.e(mduVarQueryInfoInitTsmParam.e());
            return mdeVar;
        }
        mcy mcyVar = new mcy();
        mcyVar.e(this.f17389b);
        mcyVar.c(mduVarQueryInfoInitTsmParam.c());
        mcyVar.b(mduVarQueryInfoInitTsmParam.b());
        int iExecuteTsmCommand = this.f17390c.executeTsmCommand(mcyVar);
        LogUtil.a("HwTagCardOperator", "tsm return executeTsmCommand:", Integer.valueOf(iExecuteTsmCommand));
        if (iExecuteTsmCommand == 100000) {
            mdeVar.e(0);
            return mdeVar;
        }
        mdeVar.e(-1);
        return mdeVar;
    }
}
