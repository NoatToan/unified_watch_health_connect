package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.huawei.featureuserprofile.healthrecord.js.HealthRecordsJsApi;
import com.huawei.featureuserprofile.sos.manager.EmergencyInfoManager;
import com.huawei.featureuserprofile.target.cloud.ActiveTargetManager;
import com.huawei.featureuserprofile.target.js.ActiveTargetService;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.health.userprofilemgr.model.HealthRecordCbk;
import com.huawei.health.userprofilemgr.model.RouteResultCallBack;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.unite.RouteData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.route.Manger.MyRouteInfoManager;
import com.huawei.route.Manger.RouteDataStorageManager;
import com.huawei.route.TrackInfoModel;
import com.huawei.up.callback.CommonCallback;
import com.huawei.up.model.UserInfomation;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
@ApiDefine(uri = UserProfileMgrApi.class)
@Singleton
public class cwd implements UserProfileMgrApi {
    @Override // com.huawei.health.userprofilemgr.api.UserProfileMgrApi
    public void init(ioj iojVar) {
        cuq.a(btx.c()).a(iojVar);
    }

    @Override // com.huawei.health.userprofilemgr.api.UserProfileMgrApi
    public UserInfomation getUserInfo() {
        return cuq.a(btx.c()).c();
    }

    @Override // com.huawei.health.userprofilemgr.api.UserProfileMgrApi
    public void getUserInfo(BaseResponseCallback<UserInfomation> baseResponseCallback) {
        cuq.a(btx.c()).e(baseResponseCallback);
    }

    @Override // com.huawei.health.userprofilemgr.api.UserProfileMgrApi
    public void setPopOutWindowInfo(Context context, String str) {
        daa.a().a(context, str);
    }

    @Override // com.huawei.health.userprofilemgr.api.UserProfileMgrApi
    public iog getPopOutWindowInfo(Context context, String str) {
        return daa.a().d(context, str);
    }

    @Override // com.huawei.health.userprofilemgr.api.UserProfileMgrApi
    public UserInfomation getLocalUserInfo() {
        return cuq.d();
    }

    @Override // com.huawei.health.userprofilemgr.api.UserProfileMgrApi
    public void checkUserInfo(Context context, IBaseResponseCallback iBaseResponseCallback) {
        czt.d(context, iBaseResponseCallback);
    }

    @Override // com.huawei.health.userprofilemgr.api.UserProfileMgrApi
    public Bitmap getHeadBitmap(Context context) {
        return cuq.b(context);
    }

    @Override // com.huawei.health.userprofilemgr.api.UserProfileMgrApi
    public boolean isUserProfileMgrExist(Context context) {
        return cuq.a(context) != null;
    }

    @Override // com.huawei.health.userprofilemgr.api.UserProfileMgrApi
    public boolean waitInit() {
        return cuq.a(BaseApplication.getContext()).k();
    }

    @Override // com.huawei.health.userprofilemgr.api.UserProfileMgrApi
    public void setUserInfo(UserInfomation userInfomation, ICloudOperationResult<Boolean> iCloudOperationResult) {
        cuq.a(BaseApplication.getContext()).d(userInfomation, iCloudOperationResult);
    }

    @Override // com.huawei.health.userprofilemgr.api.UserProfileMgrApi
    public void sync(CommonCallback commonCallback) {
        cuq.a(BaseApplication.getContext()).d(commonCallback);
    }

    @Override // com.huawei.health.userprofilemgr.api.UserProfileMgrApi
    public void registerModifyCallback(IBaseResponseCallback iBaseResponseCallback) {
        cuq.a(BaseApplication.getContext()).e(iBaseResponseCallback);
    }

    @Override // com.huawei.health.userprofilemgr.api.UserProfileMgrApi
    public void unRegisterModifyCallback(IBaseResponseCallback iBaseResponseCallback) {
        cuq.a(BaseApplication.getContext()).d(iBaseResponseCallback);
    }

    @Override // com.huawei.health.userprofilemgr.api.UserProfileMgrApi
    public iof getEmergencyInfo() {
        return cuq.a(BaseApplication.getContext()).b();
    }

    @Override // com.huawei.health.userprofilemgr.api.UserProfileMgrApi
    public void registerContactChangeObserver() {
        EmergencyInfoManager.a().k();
    }

    @Override // com.huawei.health.userprofilemgr.api.UserProfileMgrApi
    public void unRegisterContactChangeObserver() {
        EmergencyInfoManager.a().o();
    }

    @Override // com.huawei.health.userprofilemgr.api.UserProfileMgrApi
    public boolean hasEmergencyInfoProvider() {
        return EmergencyInfoManager.a().j();
    }

    @Override // com.huawei.health.userprofilemgr.api.UserProfileMgrApi
    public void notifyCallback() {
        cuq.a(BaseApplication.getContext()).f();
    }

    @Override // com.huawei.health.userprofilemgr.api.UserProfileMgrApi
    public boolean saveAppEmergencyContacts(iod iodVar) {
        return EmergencyInfoManager.a().a(iodVar);
    }

    @Override // com.huawei.health.userprofilemgr.api.UserProfileMgrApi
    public List<String> getHarmonyEmergencyContactsUri() {
        return EmergencyInfoManager.a().g();
    }

    @Override // com.huawei.health.userprofilemgr.api.UserProfileMgrApi
    public List<iod> getEmergencyContact() {
        return EmergencyInfoManager.a().e();
    }

    @Override // com.huawei.health.userprofilemgr.api.UserProfileMgrApi
    public void deleteRoutes(List<Long> list, RouteResultCallBack<CloudCommonReponse> routeResultCallBack) {
        MyRouteInfoManager.deleteRoutes(list, routeResultCallBack);
    }

    @Override // com.huawei.health.userprofilemgr.api.UserProfileMgrApi
    public void setRouteData(RouteData routeData) {
        RouteDataStorageManager.setRouteData(routeData);
    }

    @Override // com.huawei.health.userprofilemgr.api.UserProfileMgrApi
    public RouteData getRouteData() {
        return RouteDataStorageManager.getRouteData();
    }

    @Override // com.huawei.health.userprofilemgr.api.UserProfileMgrApi
    public void setTrackInfoModel(TrackInfoModel trackInfoModel) {
        RouteDataStorageManager.setTrackInfoModel(trackInfoModel);
    }

    @Override // com.huawei.health.userprofilemgr.api.UserProfileMgrApi
    public void clearRouteData() {
        RouteDataStorageManager.clearRouteData();
    }

    @Override // com.huawei.health.userprofilemgr.api.UserProfileMgrApi
    public boolean isActiveTargetSwitchOpen() {
        return ActiveTargetManager.c().e();
    }

    @Override // com.huawei.health.userprofilemgr.api.UserProfileMgrApi
    public boolean isTargetRedNeedShow() {
        return ActiveTargetManager.c().d();
    }

    @Override // com.huawei.health.userprofilemgr.api.UserProfileMgrApi
    public void hideTargetRed() {
        ActiveTargetManager.c().b();
    }

    @Override // com.huawei.health.userprofilemgr.api.UserProfileMgrApi
    public void gotoH5ActiveTarget(Context context) {
        ActiveTargetManager.c().b(context);
    }

    @Override // com.huawei.health.userprofilemgr.api.UserProfileMgrApi
    public void getActiveTargetStatus(IBaseResponseCallback iBaseResponseCallback) {
        ActiveTargetManager.c().c(iBaseResponseCallback);
    }

    @Override // com.huawei.health.userprofilemgr.api.UserProfileMgrApi
    public Class<?> getActiveTargetService() {
        return ActiveTargetService.class;
    }

    @Override // com.huawei.health.userprofilemgr.api.UserProfileMgrApi
    public void gotoH5HealthRecord(Context context, String str, String str2) {
        cvn.c(context, str, str2);
    }

    @Override // com.huawei.health.userprofilemgr.api.UserProfileMgrApi
    public void queryHealthRecords(int i, int i2, HealthRecordCbk<List<ioe>> healthRecordCbk) {
        HealthRecordsJsApi.queryRecords(i, i2 + 1, healthRecordCbk);
    }

    @Override // com.huawei.health.userprofilemgr.api.UserProfileMgrApi
    public Class<?> getHealthRecordsJsApi() {
        return HealthRecordsJsApi.class;
    }
}
