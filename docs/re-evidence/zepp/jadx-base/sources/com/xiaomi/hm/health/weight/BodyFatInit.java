package com.xiaomi.hm.health.weight;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.huami.account.HMLoginManager;
import com.huami.core.device.wifi_settings.WifiRouter;
import com.huami.stress.domain.model.SingleStress;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.HMConfig;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bodyfat.share.WeightShare;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BFKeeper;
import com.xiaomi.hm.health.bodyfat.utils.OnAddGuestChangeListener;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.bodyfat.utils.WeightGrantRequestDialogLis;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.AdEntity;
import com.xiaomi.hm.health.databases.model.HeartRate;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import com.xiaomi.hm.health.device.BindWiFISettingHelper;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.di.koin.startup.UserInfoModuleInitializerKt;
import com.xiaomi.hm.health.discovery.WebHelper;
import com.xiaomi.hm.health.discovery.jsbridge.function.NavigateToHandler;
import com.xiaomi.hm.health.fragment.PersonInfoSettingBaseFragment;
import com.xiaomi.hm.health.fragment.PersonInfoSettingBirthdayFragment;
import com.xiaomi.hm.health.fragment.PersonInfoSettingGenderFragment;
import com.xiaomi.hm.health.fragment.PersonInfoSettingHeightFragment;
import com.xiaomi.hm.health.fragment.PersonInfoSettingNicknameFragment;
import com.xiaomi.hm.health.fragment.SelectImageFragment;
import com.xiaomi.hm.health.healthdata.dto.HealthDataType;
import com.xiaomi.hm.health.healthdata.ui.detail.stress.SingleStressDetailActivity;
import com.xiaomi.hm.health.healthdata.utils.HealthDataNavigator;
import com.xiaomi.hm.health.manager.AvatarManager;
import com.xiaomi.hm.health.manager.HMAdManager;
import com.xiaomi.hm.health.model.account.HMBirthday;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.model.account.HMUserInfo;
import com.xiaomi.hm.health.share.HMShareActivity;
import com.xiaomi.hm.health.share.HMShareBodyFatActivity;
import com.xiaomi.hm.health.share.ShareAdapter;
import com.xiaomi.hm.health.stress.StressUseCaseUtils;
import com.xiaomi.hm.health.ui.heartrate.HRDataManager;
import com.xiaomi.hm.health.ui.heartrate.HeartRateDetailActivity;
import com.xiaomi.hm.health.utils.BraceletForegroundCallBack;
import com.xiaomi.hm.health.utils.HMPropertyUtil;
import com.xiaomi.hm.health.utils.Utils;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes22.dex */
public class BodyFatInit {

    public class a implements BFCallback.IHMDeviceManager {
        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IHMDeviceManager
        public HMBaseDevice createDevice(HMDeviceType type) {
            return HMDeviceManager.getInstance().createDevice(type);
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IHMDeviceManager
        public void destroyDevice(HMDeviceType type) {
            HMDeviceManager.getInstance().destroyDevice(type);
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IHMDeviceManager
        public String getBoundDeviceAddress(HMDeviceType type) {
            return HMDeviceManager.getInstance().getBoundDeviceAddress(type);
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IHMDeviceManager
        public String getBoundDeviceId(HMDeviceType type) {
            return HMDeviceManager.getInstance().getBoundDeviceId(type);
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IHMDeviceManager
        public HMDeviceSource getBoundDeviceSource(HMDeviceType type) {
            return HMDeviceManager.getInstance().getBoundDeviceSource(type);
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IHMDeviceManager
        public Calendar getBoundDeviceSyncTime(HMDeviceType type) {
            return HMDeviceManager.getInstance().getBoundDeviceSyncTime(type);
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IHMDeviceManager
        public int getBoundWeightDeviceSourceValue() {
            return HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.WEIGHT).getValue();
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IHMDeviceManager
        public HMBaseDevice getDevice(HMDeviceType type) {
            return HMDeviceManager.getInstance().getDevice(type);
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IHMDeviceManager
        public boolean hasBound(HMDeviceSource source) {
            return HMDeviceManager.getInstance().hasBound(source);
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IHMDeviceManager
        public boolean hasBoundBfs() {
            return HMDeviceConfig.hasBoundBfs();
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IHMDeviceManager
        public boolean isBluetoothEnable() {
            return HMDeviceManager.getInstance().isBluetoothEnable();
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IHMDeviceManager
        public boolean isSupportOneFoot() {
            if (hasBound(HMDeviceType.WEIGHT)) {
                return HMDeviceManager.getInstance().hasBound(HMDeviceSource.WEIGHT_BFS) || HMDeviceManager.getInstance().hasBound(HMDeviceSource.WEIGHT_SCALE2);
            }
            return false;
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IHMDeviceManager
        public boolean isSupportWifi(HMDeviceSource source) {
            return source == HMDeviceSource.WEIGHT_AMAZFIT_SCALE;
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IHMDeviceManager
        public void wifiConfig(HMDeviceSource source, WifiRouter.WifiConfigCallBack callBack) {
            if (source == null || source.getType() == null) {
                HMLog.i("BodyFatInit", "wifi config device source is Empty!!!", new Object[0]);
                return;
            }
            HMBaseDevice device = getDevice(source.getType());
            if (device == null || !device.isConnected()) {
                HMLog.i("BodyFatInit", "wifi config device is disconnect!!!", new Object[0]);
            } else {
                BindWiFISettingHelper.INSTANCE.initIWiFiController(device);
                WifiRouter.INSTANCE.wifiConfigStatus(device.getMDeviceSource().getValue(), callBack);
            }
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IHMDeviceManager
        public boolean hasBound(HMDeviceType type) {
            return HMDeviceManager.getInstance().hasBound(type);
        }
    }

    public class b implements BFCallback.IHMPersonInfo {
        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IHMPersonInfo
        public Float getTargetWeight() {
            return Float.valueOf(HMPersonInfo.getInstance().getUserInfo().getTargetWeight());
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IHMPersonInfo
        public int getUnit() {
            return HMPersonInfo.getInstance().getMiliConfig().getUnit();
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IHMPersonInfo
        public String getUserid() {
            return HMPersonInfo.getInstance().getUserInfo().getUserid();
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IHMPersonInfo
        public float getWeight() {
            return HMPersonInfo.getInstance().getUserInfo().getWeight();
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IHMPersonInfo
        public boolean isWeightMergeResult() {
            return HMPersonInfo.getInstance().getMiliConfig().isWeightMergeResult();
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IHMPersonInfo
        public void saveWeight(float weight) {
            HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
            hMPersonInfo.getUserInfo().setWeight(weight);
            hMPersonInfo.saveInfo(2);
        }
    }

    public class c implements BFCallback.IHMLoginManager {
        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IHMLoginManager
        public long getValidUid() {
            return HMLoginManager.getValidUid();
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IHMLoginManager
        public boolean isAdult() {
            return HMLoginManager.isAdult();
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IHMLoginManager
        public boolean isInEU() {
            return HMLoginManager.isInEU();
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IHMLoginManager
        public boolean isInNonContinental() {
            return HMLoginManager.isInNonContinental();
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IHMLoginManager
        public boolean isInUSA() {
            return HMLoginManager.isInUSA();
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IHMLoginManager
        public boolean isAdult(int age) {
            return HMLoginManager.isAdult(age);
        }
    }

    public class d implements BFCallback.IHMPropertyUtil {
        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IHMPropertyUtil
        public String getProperty(String key, String defaultValue) {
            return HMPropertyUtil.getProperty(key, defaultValue);
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IHMPropertyUtil
        public boolean getPropertyToWeightPermission(String type) {
            return HMPropertyUtil.getPropertyToWeightPermission(type);
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IHMPropertyUtil
        public boolean getSmartAnalysis(String type) {
            return HMPropertyUtil.getSmartAnalysis(type);
        }
    }

    public class e implements BFCallback.IAppUtils {
        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IAppUtils
        public int getRealHeight(Context context, float dipValue) {
            return Utils.getRealHeight(context, dipValue);
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IAppUtils
        public String getStoragePath(Context context) {
            return Utils.getStoragePath(context);
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IAppUtils
        public boolean isAdultByMonth(String birth) {
            return Utils.isAdultByMonth(birth);
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IAppUtils
        public void showDeleteAllMemberDataRequestDialog(AppCompatActivity activity, WeightGrantRequestDialogLis lis) {
            Utils.showDeleteAllMemberDataRequestDialog(activity, lis);
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IAppUtils
        public void showGrantWeightDataRequestDialog(AppCompatActivity activity, String userId, WeightGrantRequestDialogLis lis) {
            Utils.showGrantWeightDataRequestDialog(activity, userId, lis);
        }
    }

    public class f implements BFCallback.IHMAdManager {
        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IHMAdManager
        public void addPrefixTitle(TextView textView, String prefix, String origin) {
            HMAdManager.addPrefixTitle(textView, prefix, origin);
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IHMAdManager
        public void displayImage(ImageView view, String url) {
            HMAdManager.displayImage(view, url);
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IHMAdManager
        public AdEntity getCurrentAd(String type) {
            return HMAdManager.getCurrentAd(type);
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IHMAdManager
        public String getCurrentColor(AdEntity entity, String key, String defColor) {
            return HMAdManager.getCurrentColor(entity, key, defColor);
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IHMAdManager
        public Map<String, String> getCurrentImage(AdEntity entity) {
            return HMAdManager.getCurrentImage(entity);
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IHMAdManager
        public void initBannerView(ImageView imageView, Integer mode, String imgUrl, String linkUrl) {
            HMAdManager.initBannerView(imageView, mode, imgUrl, linkUrl, StatEvent.EventId.STATUS_AD_BODY_FAT_BANNER, null);
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IHMAdManager
        public void saveAdLoaded(AdEntity entity, String type) {
            HMAdManager.saveAdLoaded(entity, type);
        }
    }

    public class g implements BFCallback.IBFCallBack {
        private final Lazy<DeviceXNavigator> a = KoinJavaComponent.inject(DeviceXNavigator.class);

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IBFCallBack
        public String captureViewShare(View view) {
            return Utils.captureViewShare(view, view.getContext());
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IBFCallBack
        public void deleteHeart(List<Long> timestamps) {
            HRDataManager.getInstance().deleteHeartRateByKeys(timestamps);
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IBFCallBack
        public void deleteStress(List<Long> timestamps) {
            Iterator<Long> it2 = timestamps.iterator();
            while (it2.hasNext()) {
                StressUseCaseUtils.INSTANCE.deleteSingleStressData(it2.next().longValue());
            }
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IBFCallBack
        public boolean enableMiDongFlavor() {
            return true;
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IBFCallBack
        public void eventBusConnect(boolean register) {
            Event2BFConnect event2BFConnect = new Event2BFConnect();
            if (register) {
                event2BFConnect.register();
            } else {
                event2BFConnect.unregister();
            }
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IBFCallBack
        public void eventBusDevice(boolean register) {
            Event2BFDevice event2BFDevice = new Event2BFDevice();
            if (register) {
                event2BFDevice.register();
            } else {
                event2BFDevice.unregister();
            }
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IBFCallBack
        public void eventBusSyncData(boolean register) {
            Event2BFSyncData event2BFSyncData = new Event2BFSyncData();
            if (register) {
                event2BFSyncData.register();
            } else {
                event2BFSyncData.unregister();
            }
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IBFCallBack
        public int getAgeByDate(String dateStr) {
            return HMUserInfo.getAgeByDate(dateStr);
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IBFCallBack
        public String getChannel() {
            return HMConfig.Channel.name();
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IBFCallBack
        public String getCropFilePath() {
            return "CROPPED_FILE_PATH";
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IBFCallBack
        public int getCropImageSelectImgReqCode() {
            return 18;
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IBFCallBack
        public int getCropImageTakePhotoReqCode() {
            return 19;
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IBFCallBack
        public String getHMBirthday(String birthday) {
            HMBirthday hMBirthdayFromStr = HMBirthday.fromStr(birthday);
            if (hMBirthdayFromStr.isValid()) {
                return hMBirthdayFromStr.toString();
            }
            return null;
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IBFCallBack
        public int getPersonInfoSettingBaseFragmentAddNewBabyCode() {
            return -200;
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IBFCallBack
        public int getPersonInfoSettingBaseFragmentAddNewCode() {
            return -100;
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IBFCallBack
        public int getPersonInfoSettingBaseFragmentAddNewGuestCode() {
            return PersonInfoSettingBaseFragment.CODE_ADD_GEUST;
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IBFCallBack
        public void hmShare(Context context, WeightShare mWeightShare) {
            HMShareActivity.launch(context, 8, 0, ShareAdapter.newInstance().parse2Weight(mWeightShare));
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IBFCallBack
        public boolean isForeground() {
            return BraceletForegroundCallBack.getInstance().isForeground();
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IBFCallBack
        public boolean isInner() {
            return GlobalConfig.get().isBuildInner();
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IBFCallBack
        public boolean isLoginValid(Context context) {
            return false;
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IBFCallBack
        public void launchAmazfitScaleHelp(Context context) {
            this.a.getValue().launchWeightDevicePlay(context, HMDeviceSource.WEIGHT_AMAZFIT_SCALE);
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IBFCallBack
        public void launchHeartRateDetail(Context context, HeartRate heartRate) {
            HeartRateDetailActivity.launch(context, heartRate);
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IBFCallBack
        public void launchSingleStressDetail(Context context, WeightInfos info) {
            HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
            HMDeviceType hMDeviceType = HMDeviceType.WEIGHT;
            HMBaseDevice device = hMDeviceManager.getDevice(hMDeviceType);
            SingleStressDetailActivity.INSTANCE.navigate(context, new SingleStress(info.getTimestamp().longValue(), HMPersonInfo.getInstance().getUserInfo().getUserid(), info.getPressure(), info.getSource().intValue(), hMDeviceType.getValue(), info.getDevice_id() != null ? info.getDevice_id() : "", HMDeviceManager.getInstance().getBoundDeviceAddress(hMDeviceType), (device == null || device.getDeviceInfo() == null) ? "" : device.getDeviceInfo().getSerialNumber()));
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IBFCallBack
        public void launchWeb(Context context, String url) {
            WebHelper.launch(url);
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IBFCallBack
        public void navigate(Context context, String url) {
            new NavigateToHandler().handleNavigateTo(context, url, null);
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IBFCallBack
        public void saveStressOfScale(WeightInfos info) {
            StringBuilder sb = new StringBuilder();
            sb.append(info.getPressure());
            String serialNumber = "";
            sb.append("");
            HMLog.v("saveStressOfScale", sb.toString(), new Object[0]);
            HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.WEIGHT);
            if (device != null && device.getDeviceInfo() != null) {
                serialNumber = device.getDeviceInfo().getSerialNumber();
            }
            BFKeeper.putValue(ParamKey.deviceSn, serialNumber);
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IBFCallBack
        public void shareBodyFat(Context context, WeightShare mWeightShare, long uid, long timeStamp, String changeTv) {
            HMShareBodyFatActivity.launch(context, 11, 0, ShareAdapter.newInstance().parse2BodyFat(mWeightShare), uid, timeStamp, changeTv);
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IBFCallBack
        public void showAddGuest(FragmentActivity activity, OnAddGuestChangeListener listener, int guestItemType) {
            if (guestItemType == 1) {
                PersonInfoSettingBaseFragment.showAddGuest(activity, new PersonInfoSettingGenderFragment(), listener, PersonInfoSettingBaseFragment.CODE_ADD_GEUST);
            } else if (guestItemType == 2) {
                PersonInfoSettingBaseFragment.showAddGuest(activity, new PersonInfoSettingHeightFragment(), listener, PersonInfoSettingBaseFragment.CODE_ADD_GEUST);
            } else if (guestItemType == 3) {
                PersonInfoSettingBaseFragment.showAddGuest(activity, new PersonInfoSettingBirthdayFragment(), listener, PersonInfoSettingBaseFragment.CODE_ADD_GEUST);
            }
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IBFCallBack
        public void showNewMemberPersonInfoEditFragment(FragmentActivity activity, BFCallback.PersonInfoEnum personInfoEnum, BFCallback.OnNewUserDataChangeListener onAddNewUserDataChangeListener, long uid) {
            PersonInfoSettingBaseFragment personInfoSettingHeightFragment;
            if (personInfoEnum.equals(BFCallback.PersonInfoEnum.NICKNAME)) {
                personInfoSettingHeightFragment = new PersonInfoSettingNicknameFragment();
            } else if (personInfoEnum.equals(BFCallback.PersonInfoEnum.GENDER)) {
                personInfoSettingHeightFragment = new PersonInfoSettingGenderFragment();
            } else if (personInfoEnum.equals(BFCallback.PersonInfoEnum.BIRTH)) {
                personInfoSettingHeightFragment = new PersonInfoSettingBirthdayFragment();
            } else {
                personInfoSettingHeightFragment = personInfoEnum.equals(BFCallback.PersonInfoEnum.HEIGHT) ? new PersonInfoSettingHeightFragment() : new PersonInfoSettingNicknameFragment();
            }
            PersonInfoSettingBaseFragment.showAddNewMember(activity, personInfoSettingHeightFragment, onAddNewUserDataChangeListener, uid);
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IBFCallBack
        public void showPersonInfoEditFragment(FragmentActivity activity, BFCallback.PersonInfoEnum personInfoEnum, BFCallback.OnPersonInfoDataChangeListener onDataChangeListener, long uid) {
            PersonInfoSettingBaseFragment personInfoSettingHeightFragment;
            if (personInfoEnum.equals(BFCallback.PersonInfoEnum.NICKNAME)) {
                personInfoSettingHeightFragment = new PersonInfoSettingNicknameFragment();
            } else if (personInfoEnum.equals(BFCallback.PersonInfoEnum.GENDER)) {
                personInfoSettingHeightFragment = new PersonInfoSettingGenderFragment();
            } else if (personInfoEnum.equals(BFCallback.PersonInfoEnum.BIRTH)) {
                personInfoSettingHeightFragment = new PersonInfoSettingBirthdayFragment();
            } else {
                personInfoSettingHeightFragment = personInfoEnum.equals(BFCallback.PersonInfoEnum.HEIGHT) ? new PersonInfoSettingHeightFragment() : new PersonInfoSettingNicknameFragment();
            }
            PersonInfoSettingBaseFragment.showMember(activity, personInfoSettingHeightFragment, onDataChangeListener, uid);
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IBFCallBack
        public void showSelectImageFragment(FragmentManager manager, String tag) {
            new SelectImageFragment().show(manager, (String) null);
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IBFCallBack
        public void startBodyIndexDetails(Context context, int type) {
            HealthDataType healthDataType;
            switch (type) {
                case 1:
                    healthDataType = HealthDataType.BASAL_METABOLISM;
                    break;
                case 2:
                    healthDataType = HealthDataType.BODY_FAT;
                    break;
                case 3:
                    healthDataType = HealthDataType.BONE;
                    break;
                case 4:
                    healthDataType = HealthDataType.VISCERAL_FAT;
                    break;
                case 5:
                    healthDataType = HealthDataType.WATER;
                    break;
                case 6:
                    healthDataType = HealthDataType.MUSCLE;
                    break;
                case 7:
                    healthDataType = HealthDataType.PROTEIN;
                    break;
                case 8:
                case 9:
                default:
                    healthDataType = HealthDataType.BMI;
                    break;
                case 10:
                    healthDataType = HealthDataType.SUBCUTANEOUS_FAT;
                    break;
                case 11:
                    healthDataType = HealthDataType.SKELETAL_MUSCLE;
                    break;
            }
            HealthDataNavigator.INSTANCE.navigateToHealthDataDetail(context, healthDataType);
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IBFCallBack
        public Intent startPersonInfo(Context context) {
            return UserInfoModuleInitializerKt.getUserInfoService().getNavigateToPersonInfoIntent(context);
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IBFCallBack
        public void updateAvatarUI(ImageView imageView, String localUrl, String remoteUrl, Object... other) {
            AvatarManager.updateAvatarUI(imageView, localUrl, remoteUrl, other);
        }

        @Override // com.xiaomi.hm.health.bodyfat.utils.BFCallback.IBFCallBack
        public void updateAvatarUI(Context context, ImageView imageView, String localUrl, String remoteUrl, Object... other) {
            AvatarManager.updateAvatarUI(context, imageView, localUrl, remoteUrl, other);
        }
    }

    public static void init() {
        BFCallback.setHMDeviceManager(new a());
        BFCallback.setHMPersonInfo(new b());
        BFCallback.setHMLoginManager(new c());
        BFCallback.setHMPropertyUtil(new d());
        BFCallback.setAppUtils(new e());
        BFCallback.setHMAdManager(new f());
        BFCallback.setBfCallBack(new g());
    }
}
