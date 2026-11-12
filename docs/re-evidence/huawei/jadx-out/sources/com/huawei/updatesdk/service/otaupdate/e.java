package com.huawei.updatesdk.service.otaupdate;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.appmgr.bean.Param;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class e extends AsyncTask<Void, Void, com.huawei.updatesdk.sdk.service.storekit.bean.d> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f29998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CheckUpdateCallBack f29999c;
    private final UpdateParams d;
    private Toast e;
    private com.huawei.updatesdk.sdk.service.storekit.b g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f29997a = new ArrayList();
    private boolean f = false;
    private boolean h = false;

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        super.onPreExecute();
        if (c()) {
            Context context = this.f29998b;
            Toast toastMakeText = Toast.makeText(context, com.huawei.updatesdk.service.util.c.c(context, "upsdk_checking_update_prompt"), 1);
            this.e = toastMakeText;
            toastMakeText.show();
        }
    }

    @Override // android.os.AsyncTask
    protected void onCancelled() {
        super.onCancelled();
        com.huawei.updatesdk.sdk.service.storekit.b bVar = this.g;
        if (bVar != null) {
            bVar.b();
        }
    }

    public void b(boolean z) {
        this.f = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(com.huawei.updatesdk.sdk.service.storekit.bean.d dVar) {
        ArrayList<ApkUpgradeInfo> arrayList;
        com.huawei.updatesdk.service.store.b.a().remove(this);
        a();
        if (this.f29999c == null) {
            com.huawei.updatesdk.sdk.foundation.a.c("UpdateSDKCheckTask", "UpdateSDK callback is null");
        }
        if (dVar == null) {
            if (this.f29999c != null) {
                Intent intent = new Intent();
                intent.putExtra("status", 3);
                this.f29999c.onUpdateInfo(intent);
                return;
            }
            return;
        }
        int iB = dVar.b();
        if (dVar.e()) {
            com.huawei.updatesdk.service.appmgr.bean.e eVar = (com.huawei.updatesdk.service.appmgr.bean.e) dVar;
            arrayList = eVar.list;
            if (!com.huawei.updatesdk.service.util.d.a(eVar.notRcmList)) {
                ApkUpgradeInfo apkUpgradeInfo = eVar.notRcmList.get(0);
                com.huawei.updatesdk.sdk.foundation.a.a("UpdateSDKCheckTask", "Updateinfo is not recommend, reason: " + apkUpgradeInfo.getNotRcmReason_() + " ,is same signature: " + apkUpgradeInfo.getSameS_());
            }
            a((List<ApkUpgradeInfo>) arrayList);
            if (com.huawei.updatesdk.service.util.d.a(arrayList) && this.f29999c != null) {
                com.huawei.updatesdk.sdk.foundation.a.b("UpdateSDKCheckTask", "no upgrade info");
                Intent intent2 = new Intent();
                intent2.putExtra("status", 3);
                intent2.putExtra(UpdateKey.RESPONSE_CODE, iB);
                this.f29999c.onUpdateInfo(intent2);
            }
        } else {
            a(dVar);
            com.huawei.updatesdk.sdk.foundation.a.a("UpdateSDKCheckTask", "get app update msg failed,responseCode is " + dVar.d() + ",failreason: " + dVar.c() + ",response: " + dVar);
            arrayList = null;
        }
        if (com.huawei.updatesdk.service.util.d.a(arrayList)) {
            if (c()) {
                com.huawei.updatesdk.sdk.foundation.a.b("UpdateSDKCheckTask", "show no upgrade info toast.");
                Context context = this.f29998b;
                Toast.makeText(context, com.huawei.updatesdk.service.util.c.c(context, "upsdk_update_check_no_new_version"), 0).show();
                return;
            } else {
                com.huawei.updatesdk.sdk.foundation.a.b("UpdateSDKCheckTask", "no upgrade info: " + this.f29997a.toString());
                return;
            }
        }
        ApkUpgradeInfo apkUpgradeInfo2 = arrayList.get(0);
        d.a().a(this.f29999c);
        if (this.f29999c != null) {
            Intent intent3 = new Intent();
            intent3.putExtra(UpdateKey.INFO, (Serializable) apkUpgradeInfo2);
            intent3.putParcelableArrayListExtra(UpdateKey.INFO_LIST, arrayList);
            intent3.putExtra("status", 7);
            intent3.putExtra(UpdateKey.RESPONSE_CODE, iB);
            this.f29999c.onUpdateInfo(intent3);
        }
        a(arrayList);
        if (this.d.isShowImmediate()) {
            a(this.f29998b, apkUpgradeInfo2);
        }
    }

    public void a(boolean z) {
        this.h = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.huawei.updatesdk.sdk.service.storekit.bean.d doInBackground(Void... voidArr) {
        com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.a("UpdateSDKCheckTask", "CheckOtaAndUpdataTask doInBackground");
        com.huawei.updatesdk.service.store.b.a(this);
        b();
        com.huawei.updatesdk.sdk.foundation.a.b("UpdateSDKCheckTask", "start check update and packageNames are: " + this.f29997a.toString());
        com.huawei.updatesdk.service.global.a aVarA = com.huawei.updatesdk.service.global.e.a(this.h);
        aVarA.a(this.f29997a);
        com.huawei.updatesdk.service.bean.a.c().d();
        com.huawei.updatesdk.sdk.service.storekit.bean.c.b(aVarA.d(this.f29998b));
        com.huawei.updatesdk.service.bean.a.c().c(f.c().a());
        return a(this.f29998b, this.f29997a);
    }

    private boolean c() {
        return !this.f && TextUtils.isEmpty(this.d.getTargetPkgName()) && com.huawei.updatesdk.service.util.d.a(this.d.getPackageList()) && com.huawei.updatesdk.service.util.d.a(this.d.getParamList());
    }

    private void b() {
        if (!com.huawei.updatesdk.service.util.d.a(this.d.getParamList())) {
            Iterator<Param> it = this.d.getParamList().iterator();
            while (it.hasNext()) {
                this.f29997a.add(it.next().getPackageName());
            }
            return;
        }
        if (!com.huawei.updatesdk.service.util.d.a(this.d.getPackageList())) {
            this.f29997a.addAll(this.d.getPackageList());
            return;
        }
        String targetPkgName = this.d.getTargetPkgName();
        if (TextUtils.isEmpty(targetPkgName)) {
            targetPkgName = this.f29998b.getPackageName();
        }
        if (TextUtils.isEmpty(targetPkgName)) {
            return;
        }
        this.f29997a.add(targetPkgName);
    }

    private void a(List<ApkUpgradeInfo> list) {
        if (com.huawei.updatesdk.service.util.d.a(list)) {
            return;
        }
        for (ApkUpgradeInfo apkUpgradeInfo : list) {
            if (apkUpgradeInfo != null && !TextUtils.isEmpty(apkUpgradeInfo.getFullDownUrl_())) {
                if (apkUpgradeInfo.getDiffSize_() > 0) {
                    apkUpgradeInfo.setDiffDownUrl_(apkUpgradeInfo.getDownurl_());
                }
                apkUpgradeInfo.setDownurl_(apkUpgradeInfo.getFullDownUrl_());
            }
        }
    }

    private void a(ArrayList<ApkUpgradeInfo> arrayList) {
        for (ApkUpgradeInfo apkUpgradeInfo : arrayList) {
            com.huawei.updatesdk.sdk.foundation.a.b("UpdateSDKCheckTask", "ApkUpgradeInfo, version=" + apkUpgradeInfo.getVersion_() + ", versionCode=" + apkUpgradeInfo.getVersionCode_() + ", detailId=" + apkUpgradeInfo.getDetailId_() + ", devType=" + apkUpgradeInfo.getDevType_() + ", packageName=" + apkUpgradeInfo.getPackage_() + ", oldVersionCode=" + apkUpgradeInfo.getOldVersionCode_());
        }
    }

    private void a(com.huawei.updatesdk.sdk.service.storekit.bean.d dVar) {
        if (this.f29999c != null) {
            Intent intent = new Intent();
            intent.putExtra("status", 6);
            if (dVar.a() != null) {
                intent.putExtra(UpdateKey.FAIL_CODE, dVar.a().ordinal());
            }
            intent.putExtra(UpdateKey.FAIL_REASON, dVar.c());
            intent.putExtra(UpdateKey.RESPONSE_CODE, dVar.b());
            this.f29999c.onUpdateInfo(intent);
            this.f29999c.onUpdateStoreError(dVar.d());
        }
    }

    private void a(Context context, ApkUpgradeInfo apkUpgradeInfo) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) AppUpdateActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("app_update_parm", apkUpgradeInfo);
        bundle.putBoolean("app_must_btn", this.d.isMustBtnOne());
        bundle.putBoolean("is_apptouch", this.h);
        intent.putExtras(bundle);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.b("UpdateSDKCheckTask", "go AppUpdateActivity error: " + e.getMessage());
        }
    }

    private void a() {
        Toast toast = this.e;
        if (toast != null) {
            toast.cancel();
        }
    }

    private com.huawei.updatesdk.sdk.service.storekit.bean.d a(Context context, List<String> list) {
        com.huawei.updatesdk.service.appmgr.bean.d dVarA;
        String string;
        if (com.huawei.updatesdk.service.util.d.a(this.d.getParamList())) {
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(com.huawei.updatesdk.service.util.b.e(context, it.next()));
            }
            dVarA = com.huawei.updatesdk.service.appmgr.bean.d.a(arrayList);
        } else {
            dVarA = new com.huawei.updatesdk.service.appmgr.bean.d(this.d.getParamList());
        }
        com.huawei.updatesdk.service.global.a aVarA = com.huawei.updatesdk.service.global.e.a(this.h);
        String strB = aVarA.b();
        dVarA.e(aVarA.a(context, strB));
        dVarA.b(0);
        dVarA.d(com.huawei.updatesdk.sdk.foundation.utils.device.c.b(context, strB));
        try {
            Context contextCreatePackageContext = this.f29998b.createPackageContext(aVarA.b(), 3);
            string = contextCreatePackageContext.getResources().getString(contextCreatePackageContext.getResources().getIdentifier("wd_cno", "string", aVarA.b()));
        } catch (Throwable th) {
            com.huawei.updatesdk.sdk.foundation.log.ecs.mtk.a.b("UpdateSDKCheckTask", "get cno error: " + th.getMessage());
            string = "";
        }
        dVarA.e(string);
        if (isCancelled()) {
            com.huawei.updatesdk.sdk.foundation.a.c("UpdateSDKCheckTask", "UpdateSDK task is canceled and return empty upgradeInfo");
            return null;
        }
        com.huawei.updatesdk.sdk.service.storekit.b bVar = new com.huawei.updatesdk.sdk.service.storekit.b(dVarA, null);
        this.g = bVar;
        return bVar.c();
    }

    public e(Context context, UpdateParams updateParams, CheckUpdateCallBack checkUpdateCallBack) {
        this.d = updateParams;
        this.f29998b = context;
        this.f29999c = checkUpdateCallBack;
        f.c().b(updateParams.getServiceZone());
    }
}
