package com.huawei.health.impl;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import com.huawei.btsportdevice.callback.MessageOrStateCallback;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.api.DeviceManagerApi;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.datatype.SkippingTargetMode;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.fatscale.multiusers.WeightDataManager;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.model.MeasureResult;
import com.huawei.health.device.ui.measure.fragment.HagridDeviceBindResultFragment;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.device.wifi.control.claim.ClaimWeightDataManager;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.up.model.UserInfomation;
import defpackage.dmd;
import defpackage.dmp;
import defpackage.dnb;
import defpackage.dnj;
import defpackage.doq;
import defpackage.drw;
import defpackage.dxi;
import defpackage.dxk;
import defpackage.dxm;
import defpackage.dxx;
import defpackage.eam;
import defpackage.ean;
import defpackage.eby;
import defpackage.ecf;
import defpackage.elg;
import defpackage.emh;
import defpackage.eqm;
import defpackage.etn;
import defpackage.njy;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
@ApiDefine(uri = DeviceManagerApi.class)
public class DeviceManagerImpl implements DeviceManagerApi {
    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void destroyResourceDownloadTool() {
    }

    @Override // com.huawei.health.device.base.BaseDeviceManagerApi
    public void init() {
        dmd.b().init(BaseApplication.getContext());
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void startMeasureBackground(Context context, int i, HealthDevice.HealthDeviceKind healthDeviceKind, MeasureResult.MeasureResultListener measureResultListener) {
        dmd.b().e(healthDeviceKind, measureResultListener);
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void stopMeasureBackground(String str, String str2) {
        dmd.b().e(str, str2);
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public ArrayList<String> getBondedProductsForDeviceOnly(HealthDevice.HealthDeviceKind healthDeviceKind) {
        return drw.e().a(healthDeviceKind);
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public com.huawei.hihealth.device.open.HealthDevice getBondedDeviceUniversal(String str, String str2) {
        return drw.e().a(str, str2);
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void syncDevice() {
        eam.d().c();
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public boolean isRopeDeviceBtConnected() {
        return emh.b().g();
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void setSkippingTargetMode(SkippingTargetMode skippingTargetMode) {
        emh.b().c(skippingTargetMode);
    }

    @Override // com.huawei.health.device.base.BaseDeviceManagerApi
    public void setFitnessMachineControl(int i, int[] iArr) {
        emh.b().e(i, iArr);
    }

    @Override // com.huawei.health.device.base.BaseDeviceManagerApi
    public void setFitnessMachineControl(int i, int i2, int[] iArr) {
        emh.b().c(i, i2, iArr);
    }

    @Override // com.huawei.health.device.base.BaseDeviceManagerApi
    public void setMessageOrStateCallback(String str, MessageOrStateCallback messageOrStateCallback, boolean z) {
        emh.b().b(str, messageOrStateCallback, z);
    }

    @Override // com.huawei.health.device.base.BaseDeviceManagerApi
    public void removeMessageOrStateCallback(String str, boolean z) {
        emh.b().a(str, z);
    }

    @Override // com.huawei.health.device.base.BaseDeviceManagerApi
    public void releaseResource() {
        emh.b().h();
    }

    @Override // com.huawei.health.device.base.BaseDeviceManagerApi
    public String getCurrentMacAddress() {
        return emh.b().d();
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void requestDeviceInfoAndState(String str) {
        emh.b().e(str);
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public String getProductId() {
        return emh.b().i();
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void setUserWeight(int i) {
        MultiUsersManager.INSTANCE.getMainUser().c(i);
        setHeightIsNotSet(false);
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public String getUserName(String str) {
        for (dnj dnjVar : MultiUsersManager.INSTANCE.getAllUser()) {
            if (dnjVar == null || dnjVar.i() == null) {
                LogUtil.j("DeviceManagerImpl", "user or getUUIDOfUser() is null");
            } else if (dnjVar.i().equalsIgnoreCase(str)) {
                return dnjVar.h();
            }
        }
        return "";
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public String getMainUserUuid() {
        return MultiUsersManager.INSTANCE.getMainUser().i();
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void initUserIfEmpty() {
        MultiUsersManager.INSTANCE.initUserIfEmpty();
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void startSync() {
        ClaimWeightDataManager.INSTANCE.startSync();
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void sendEventToKaKa(int i) {
        ean.d(i);
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void setUserCollectionSwitch(boolean z) {
        ean.e(z);
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void confirmDevUserInfo() {
        ean.d();
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public ArrayList<Long> getDeviceCodeFromWiFiDevice() {
        ArrayList<eby> arrayListA = ecf.a();
        ArrayList<Long> arrayList = new ArrayList<>();
        if (!njy.e(arrayListA)) {
            Iterator<eby> it = arrayListA.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(it.next().b()));
            }
            return arrayList;
        }
        return new ArrayList<>();
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public MeasurableDevice getBondedDeviceByBroadcastName(String str, String str2) {
        return dmp.d().c(str, str2);
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public ContentValues getDeviceInfoByUniqueId(String str) {
        return dmp.d().j(str);
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public ArrayList<ContentValues> getBondedDeviceByProductId(String str) {
        return dmp.d().c(str);
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public ArrayList<MeasurableDevice> getBondedDevices(String str, boolean z) {
        return dmp.d().d(str, z);
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public boolean isMiniScaleDevice(String str) {
        return dxm.ai(str);
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public boolean getResetWifi() {
        return doq.e().m();
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void deliveringUserInformation(String str, String str2, HiUserInfo hiUserInfo) throws Throwable {
        dxx.b(str, str2, hiUserInfo);
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void uploadDeviceToCloud(String str, String str2) {
        dxi.e(str, str2);
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void setUserGender(int i, HiUserInfo hiUserInfo) {
        dxx.b(i, hiUserInfo);
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public ArrayList<String> getBondedWiFiDevices() {
        return drw.e().a();
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public boolean isBondHuaweiBleScaleDevice() {
        return dxm.g();
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public boolean showConfirmUserInfo(String str, boolean z) {
        return dxx.d(str, z);
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void sendUserInfo(String str) {
        ean.b(str, ean.i(str));
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public boolean isHonourWeightDevice(String str) {
        return dxm.ab(str);
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void sendUserInfo(Bundle bundle) {
        EventBus.a(new EventBus.d("weight_measure_set_user", bundle));
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public boolean isHagridWiFiDevice(String str, String str2) {
        return dxm.e(str, str2);
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void setBindStatus(int i) {
        HagridDeviceBindResultFragment.setBindStatus(8);
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public boolean isHonourScaleDevice(String str) {
        return dxm.z(str);
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public String getH5Path(String str) {
        return elg.e().e(str);
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public String getSubProductId(String str) {
        return etn.d(str);
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void downloadBloodSugarDeviceResource(Activity activity) {
        if (activity == null) {
            return;
        }
        new eqm(activity, null, null, "167P").c("HDK_BLOOD_SUGAR", true);
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void setBeginMeasureBiAnalytics(String str) {
        etn.o(str);
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void setUserGoalWeight(float f) {
        MultiUsersManager.INSTANCE.getMainUser().c(f);
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public float getLastestWeight() {
        float fAv;
        UserInfomation userInfo;
        List<dnb> singleUserWeightData = WeightDataManager.INSTANCE.getSingleUserWeightData(MultiUsersManager.INSTANCE.getMainUser().i(), true);
        if (njy.b(singleUserWeightData)) {
            Iterator<dnb> it = singleUserWeightData.iterator();
            while (true) {
                if (it.hasNext()) {
                    dnb next = it.next();
                    if (next.ax() <= System.currentTimeMillis()) {
                        fAv = (float) next.av();
                        break;
                    }
                }
            }
            return (fAv > 0.0f || (userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo()) == null) ? fAv : userInfo.getWeight();
        }
        LogUtil.j("DeviceManagerImpl", "getLastestWeight weightList is Empty");
        fAv = 0.0f;
        if (fAv > 0.0f) {
            return fAv;
        }
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public boolean getHeightIsNotSet() {
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("height_is_not_set");
        if (userPreference != null) {
            return "true".equals(userPreference.getValue());
        }
        health.compact.a.util.LogUtil.d("DeviceManagerImpl", "getHeightIsNotSet userPreference is null");
        SharedPreferences sharedPreferences = BaseApplication.getContext().getSharedPreferences("sleep_shared_pref_smart_msg", 0);
        if (sharedPreferences == null) {
            health.compact.a.util.LogUtil.d("DeviceManagerImpl", "getHeightIsNotSet mSharedPreferences is null");
            return false;
        }
        boolean z = sharedPreferences.getBoolean("height_is_not_set", true);
        setHeightIsNotSet(z);
        return z;
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void setHeightIsNotSet(final boolean z) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().a("setHeightIsNotSet", new Runnable() { // from class: com.huawei.health.impl.DeviceManagerImpl.4
                @Override // java.lang.Runnable
                public void run() {
                    DeviceManagerImpl.this.setHeightIsNotSet(z);
                }
            });
            return;
        }
        HiUserPreference hiUserPreference = new HiUserPreference();
        hiUserPreference.setKey("height_is_not_set");
        hiUserPreference.setValue(String.valueOf(z));
        HiHealthManager.d(BaseApplication.getContext()).setUserPreference(hiUserPreference);
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void scaleUpdateJump(Context context, Uri uri) {
        dxk.b(context, uri);
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public MeasurableDevice getBondedDeviceByUniqueId(String str) {
        return dmp.d().b(str, false);
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public MeasurableDevice getBondedDeviceByUniqueId(String str, boolean z) {
        return dmp.d().b(str, z);
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public boolean isBondedDevice(String str) {
        return dmp.d().g(str);
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public int updateBondedDevice(ContentValues contentValues, String str, String[] strArr) {
        return dmp.d().a(contentValues, str, strArr);
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void setFitnessRopeConfig(int i, int i2, int[] iArr) {
        emh.b().b(i, i2, iArr);
    }

    @Override // com.huawei.health.device.api.DeviceManagerApi
    public void registerDeviceInfo(String str, HealthDevice healthDevice, String str2) {
        dmp.d().a(str, healthDevice, str2);
    }
}
