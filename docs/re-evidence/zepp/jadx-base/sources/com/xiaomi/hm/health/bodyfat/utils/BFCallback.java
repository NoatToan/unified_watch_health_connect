package com.xiaomi.hm.health.bodyfat.utils;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.huami.core.device.wifi_settings.WifiRouter;
import com.xiaomi.hm.health.bodyfat.share.WeightShare;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.AdEntity;
import com.xiaomi.hm.health.databases.model.HeartRate;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import com.xiaomi.hm.health.manager.UnitManager;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class BFCallback {
    private static IBFCallBack a;
    private static IHMDeviceManager b;
    private static IHMPersonInfo c;
    private static IHMLoginManager d;
    private static IHMPropertyUtil e;
    private static IAppUtils f;
    private static IHMAdManager g;

    public interface IAppUtils {
        int getRealHeight(Context context, float f);

        String getStoragePath(Context context);

        boolean isAdultByMonth(String str);

        void showDeleteAllMemberDataRequestDialog(AppCompatActivity appCompatActivity, WeightGrantRequestDialogLis weightGrantRequestDialogLis);

        void showGrantWeightDataRequestDialog(AppCompatActivity appCompatActivity, String str, WeightGrantRequestDialogLis weightGrantRequestDialogLis);
    }

    public interface IBFCallBack {
        String captureViewShare(View view);

        void deleteHeart(List<Long> list);

        void deleteStress(List<Long> list);

        boolean enableMiDongFlavor();

        void eventBusConnect(boolean z);

        void eventBusDevice(boolean z);

        void eventBusSyncData(boolean z);

        int getAgeByDate(String str);

        String getChannel();

        String getCropFilePath();

        int getCropImageSelectImgReqCode();

        int getCropImageTakePhotoReqCode();

        String getHMBirthday(String str);

        int getPersonInfoSettingBaseFragmentAddNewBabyCode();

        int getPersonInfoSettingBaseFragmentAddNewCode();

        int getPersonInfoSettingBaseFragmentAddNewGuestCode();

        void hmShare(Context context, WeightShare weightShare);

        boolean isForeground();

        boolean isInner();

        boolean isLoginValid(Context context);

        void launchAmazfitScaleHelp(Context context);

        void launchHeartRateDetail(Context context, HeartRate heartRate);

        void launchSingleStressDetail(Context context, WeightInfos weightInfos);

        void launchWeb(Context context, String str);

        void navigate(Context context, String str);

        void saveStressOfScale(WeightInfos weightInfos);

        void shareBodyFat(Context context, WeightShare weightShare, long j, long j2, String str);

        void showAddGuest(FragmentActivity fragmentActivity, OnAddGuestChangeListener onAddGuestChangeListener, int i);

        void showNewMemberPersonInfoEditFragment(FragmentActivity fragmentActivity, PersonInfoEnum personInfoEnum, OnNewUserDataChangeListener onNewUserDataChangeListener, long j);

        void showPersonInfoEditFragment(FragmentActivity fragmentActivity, PersonInfoEnum personInfoEnum, OnPersonInfoDataChangeListener onPersonInfoDataChangeListener, long j);

        void showSelectImageFragment(FragmentManager fragmentManager, String str);

        void startBodyIndexDetails(Context context, int i);

        Intent startPersonInfo(Context context);

        void updateAvatarUI(Context context, ImageView imageView, String str, String str2, Object... objArr);

        void updateAvatarUI(ImageView imageView, String str, String str2, Object... objArr);
    }

    public interface IHMAdManager {
        void addPrefixTitle(TextView textView, String str, String str2);

        void displayImage(ImageView imageView, String str);

        AdEntity getCurrentAd(String str);

        String getCurrentColor(AdEntity adEntity, String str, String str2);

        Map<String, String> getCurrentImage(AdEntity adEntity);

        void initBannerView(ImageView imageView, Integer num, String str, String str2);

        void saveAdLoaded(AdEntity adEntity, String str);
    }

    public interface IHMDeviceManager {
        HMBaseDevice createDevice(HMDeviceType hMDeviceType);

        void destroyDevice(HMDeviceType hMDeviceType);

        String getBoundDeviceAddress(HMDeviceType hMDeviceType);

        String getBoundDeviceId(HMDeviceType hMDeviceType);

        HMDeviceSource getBoundDeviceSource(HMDeviceType hMDeviceType);

        Calendar getBoundDeviceSyncTime(HMDeviceType hMDeviceType);

        int getBoundWeightDeviceSourceValue();

        HMBaseDevice getDevice(HMDeviceType hMDeviceType);

        boolean hasBound(HMDeviceSource hMDeviceSource);

        boolean hasBound(HMDeviceType hMDeviceType);

        boolean hasBoundBfs();

        boolean isBluetoothEnable();

        boolean isSupportOneFoot();

        boolean isSupportWifi(HMDeviceSource hMDeviceSource);

        void wifiConfig(HMDeviceSource hMDeviceSource, WifiRouter.WifiConfigCallBack wifiConfigCallBack);
    }

    public interface IHMLoginManager {
        long getValidUid();

        boolean isAdult();

        boolean isAdult(int i);

        boolean isInEU();

        boolean isInNonContinental();

        boolean isInUSA();
    }

    public interface IHMPersonInfo {
        Float getTargetWeight();

        int getUnit();

        String getUserid();

        float getWeight();

        boolean isWeightMergeResult();

        void saveWeight(float f);
    }

    public interface IHMPropertyUtil {
        String getProperty(String str, String str2);

        boolean getPropertyToWeightPermission(String str);

        boolean getSmartAnalysis(String str);
    }

    public interface IUnitManager {
        String convertKGByUnit(String str);

        String convertUnitByKg(String str);

        int getWeightUnit();

        String getWeightUnitString(int i);
    }

    public interface OnNewUserDataChangeListener {
        void onChange(HMUserInfo hMUserInfo);
    }

    public interface OnPersonInfoDataChangeListener {
        void onChange();
    }

    public enum PersonInfoEnum {
        NICKNAME,
        GENDER,
        BIRTH,
        HEIGHT
    }

    public static class b implements IUnitManager {
        private b() {
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IUnitManager
        public String convertKGByUnit(String str) {
            return UnitManager.getInstance().convertKGByUnit(str);
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IUnitManager
        public String convertUnitByKg(String str) {
            return UnitManager.getInstance().convertUnitByKg(str);
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IUnitManager
        public int getWeightUnit() {
            return UnitManager.getInstance().getWeightUnit();
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IUnitManager
        public String getWeightUnitString(int i) {
            return UnitManager.getInstance().getWeightUnitString(i);
        }
    }

    public static IAppUtils getAppUtils() {
        IAppUtils iAppUtils = f;
        if (iAppUtils != null) {
            return iAppUtils;
        }
        throw new IllegalArgumentException("IAppUtils must init");
    }

    public static IHMAdManager getHMAdManager() {
        IHMAdManager iHMAdManager = g;
        if (iHMAdManager != null) {
            return iHMAdManager;
        }
        throw new IllegalArgumentException("IHMAdManager must init");
    }

    public static IHMDeviceManager getHMDeviceManager() {
        IHMDeviceManager iHMDeviceManager = b;
        if (iHMDeviceManager != null) {
            return iHMDeviceManager;
        }
        throw new IllegalArgumentException("IHMDeviceManager must init");
    }

    public static IHMLoginManager getHMLoginManager() {
        IHMLoginManager iHMLoginManager = d;
        if (iHMLoginManager != null) {
            return iHMLoginManager;
        }
        throw new IllegalArgumentException("IHMLoginManager must init");
    }

    public static IHMPersonInfo getHMPersonInfo() {
        IHMPersonInfo iHMPersonInfo = c;
        if (iHMPersonInfo != null) {
            return iHMPersonInfo;
        }
        throw new IllegalArgumentException("IHMPersonInfo must init");
    }

    public static IHMPropertyUtil getHMPropertyUtil() {
        IHMPropertyUtil iHMPropertyUtil = e;
        if (iHMPropertyUtil != null) {
            return iHMPropertyUtil;
        }
        throw new IllegalArgumentException("IHMPropertyUtil must init");
    }

    public static IBFCallBack getInstance() {
        IBFCallBack iBFCallBack = a;
        if (iBFCallBack != null) {
            return iBFCallBack;
        }
        throw new IllegalArgumentException("BfCallbackInit must init");
    }

    public static IUnitManager getUnitManager() {
        return new b();
    }

    public static void setAppUtils(IAppUtils iAppUtils) {
        f = iAppUtils;
    }

    public static void setBfCallBack(IBFCallBack iBFCallBack) {
        a = iBFCallBack;
    }

    public static void setHMAdManager(IHMAdManager iHMAdManager) {
        g = iHMAdManager;
    }

    public static void setHMDeviceManager(IHMDeviceManager iHMDeviceManager) {
        b = iHMDeviceManager;
    }

    public static void setHMLoginManager(IHMLoginManager iHMLoginManager) {
        d = iHMLoginManager;
    }

    public static void setHMPersonInfo(IHMPersonInfo iHMPersonInfo) {
        c = iHMPersonInfo;
    }

    public static void setHMPropertyUtil(IHMPropertyUtil iHMPropertyUtil) {
        e = iHMPropertyUtil;
    }
}
