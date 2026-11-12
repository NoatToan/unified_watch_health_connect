package defpackage;

import android.content.Context;
import android.content.Intent;
import com.huawei.health.versionmgr.api.VersionMgrApi;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwversionmgr.manager.HwVersionManager;

/* JADX INFO: loaded from: classes40.dex */
@ApiDefine(uri = VersionMgrApi.class)
public class nuj implements VersionMgrApi {
    @Override // com.huawei.health.versionmgr.api.VersionMgrApi
    public boolean getBandOtaStatus(Context context) {
        return nvd.h(context);
    }

    @Override // com.huawei.health.versionmgr.api.VersionMgrApi
    public void autoCheckAppNewVersionService() {
        nuq.d().e();
    }

    @Override // com.huawei.health.versionmgr.api.VersionMgrApi
    public void showNewVersionDialog(Context context, Intent intent) {
        nuq.d().d(context, intent);
    }

    @Override // com.huawei.health.versionmgr.api.VersionMgrApi
    public void doManualCheckAppNewVersion() {
        nuq.d().g();
    }

    @Override // com.huawei.health.versionmgr.api.VersionMgrApi
    public void makeMessage(Context context) {
        nuq.d().c(context);
    }

    @Override // com.huawei.health.versionmgr.api.VersionMgrApi
    public void deleteMessage() {
        nuq.d().c();
    }

    @Override // com.huawei.health.versionmgr.api.VersionMgrApi
    public boolean haveNewAppVersion(Context context) {
        return HwVersionManager.b(context).i();
    }

    @Override // com.huawei.health.versionmgr.api.VersionMgrApi
    public boolean isDeviceOtaUpdating(String str) {
        return HwVersionManager.b(BaseApplication.getContext()).m(str);
    }

    @Override // com.huawei.health.versionmgr.api.VersionMgrApi
    public boolean isOtherDeviceOtaUpdating(String str) {
        return HwVersionManager.b(BaseApplication.getContext()).n(str);
    }

    @Override // com.huawei.health.versionmgr.api.VersionMgrApi
    public void resetBandUpdate(String str, String str2) {
        nuu.a().d(str, str2);
    }

    @Override // com.huawei.health.versionmgr.api.VersionMgrApi
    public void resetBandUpdate(String str) {
        HwVersionManager.b(BaseApplication.getContext()).k(str);
    }

    @Override // com.huawei.health.versionmgr.api.VersionMgrApi
    public void checkScaleNewVersionService(String str, String str2, String str3, boolean z, String str4) {
        nuu.a().b(str, str2, str3, Boolean.valueOf(z), str4);
    }

    @Override // com.huawei.health.versionmgr.api.VersionMgrApi
    public String getUpdateUrl(boolean z) {
        return nuw.b(false);
    }

    @Override // com.huawei.health.versionmgr.api.VersionMgrApi
    public void downloadAppPackage() {
        HwVersionManager.b(BaseApplication.getContext()).e();
    }

    @Override // com.huawei.health.versionmgr.api.VersionMgrApi
    public void installApk() {
        nuq.d().k();
    }

    @Override // com.huawei.health.versionmgr.api.VersionMgrApi
    public boolean isNewVersionFileExist() {
        HwVersionManager hwVersionManagerB = HwVersionManager.b(BaseApplication.getContext());
        return nvi.a(2, hwVersionManagerB) && nvi.e(hwVersionManagerB);
    }

    @Override // com.huawei.health.versionmgr.api.VersionMgrApi
    public boolean isCanAutoCheckNewVersion() {
        return nvb.b();
    }
}
