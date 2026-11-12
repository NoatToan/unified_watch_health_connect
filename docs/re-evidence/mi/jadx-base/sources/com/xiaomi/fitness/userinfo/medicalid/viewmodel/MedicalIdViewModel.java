package com.xiaomi.fitness.userinfo.medicalid.viewmodel;

import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.account.api.AccountRequest;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.common.lifecycle.DataHolder;
import com.xiaomi.fitness.common.lifecycle.IDataHandler;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import com.xiaomi.fitness.user.info.export.UserInformationManager;
import com.xiaomi.fitness.user.info.export.UserInformationManagerExtKt;
import com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack;
import com.xiaomi.fitness.user.info.export.medicalid.IMedicalIdRepository;
import com.xiaomi.fitness.user.info.export.medicalid.MedicalIdRecord;
import com.xiaomi.fitness.userinfo.medicalid.entity.MedicalIdModel;
import com.xiaomi.fitness.userinfo.medicalid.util.AvatarUtil;
import com.xiaomi.fitness.userinfo.medicalid.util.BirthdateConverter;
import com.xiaomi.fitness.userinfo.medicalid.util.EmergencyContactConverter;
import com.xiaomi.fitness.userinfo.medicalid.view.MedicalIdAddEmergencyContactActivity;
import com.xiaomi.fitness.userinfo.utils.UserInfoConfigUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001AB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010$\u001a\u00020\u0019J\u0006\u0010%\u001a\u00020&J\b\u0010'\u001a\u00020&H\u0002J\u000e\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0013J\u0006\u0010+\u001a\u00020)J\u000e\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020.J\u0006\u0010/\u001a\u00020.J\u0006\u00100\u001a\u000201J\"\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u00192\b\u00104\u001a\u0004\u0018\u0001012\b\u00105\u001a\u0004\u0018\u000101J\u0006\u00106\u001a\u00020\u0013J\u001e\u00107\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u00122\u0006\u00108\u001a\u0002012\u0006\u00109\u001a\u00020.J\u0016\u0010:\u001a\u00020&2\u0006\u00108\u001a\u0002012\u0006\u00109\u001a\u00020&J\u0016\u0010;\u001a\u00020\u00192\u0006\u00108\u001a\u0002012\u0006\u00109\u001a\u00020\u0019J'\u0010<\u001a\b\u0012\u0004\u0012\u0002H=0\u0012\"\u0004\b\u0000\u0010=2\u0006\u00108\u001a\u0002012\u0006\u00109\u001a\u0002H=¢\u0006\u0002\u0010>J\u000e\u0010?\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012J\u0006\u0010@\u001a\u00020.R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006B"}, d2 = {"Lcom/xiaomi/fitness/userinfo/medicalid/viewmodel/MedicalIdViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/userinfo/medicalid/entity/MedicalIdModel;", "<init>", "()V", "medicalIdRepository", "Lcom/xiaomi/fitness/user/info/export/medicalid/IMedicalIdRepository;", "getMedicalIdRepository", "()Lcom/xiaomi/fitness/user/info/export/medicalid/IMedicalIdRepository;", "setMedicalIdRepository", "(Lcom/xiaomi/fitness/user/info/export/medicalid/IMedicalIdRepository;)V", "mUserInfoManager", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "getMUserInfoManager", "()Lcom/xiaomi/fitness/account/user/UserInfoManager;", "setMUserInfoManager", "(Lcom/xiaomi/fitness/account/user/UserInfoManager;)V", "mMedicalIdRecordLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/fitness/user/info/export/medicalid/MedicalIdRecord;", "getMMedicalIdRecordLiveData", "()Landroidx/lifecycle/LiveData;", "setMMedicalIdRecordLiveData", "(Landroidx/lifecycle/LiveData;)V", "mSelectedRelation", "", "getMSelectedRelation", "()I", "setMSelectedRelation", "(I)V", "mAccountRequest", "Lcom/xiaomi/fitness/account/api/AccountRequest;", "getMAccountRequest", "()Lcom/xiaomi/fitness/account/api/AccountRequest;", "setMAccountRequest", "(Lcom/xiaomi/fitness/account/api/AccountRequest;)V", "getGenderFromSpOrUserProfile", "getBirthdayLongFromUserProfileOrSp", "", "getBirthdayLongFromUserInfoManager", "saveOrUpdateRecord", "", "medicalIdRecord", "deleteRecord", "setFirstInitStatus", "isFirstInitStatus", "", "getInitStatus", "getAvatarFilePathString", "", "constructEmergencyContactRemindText", MedicalIdAddEmergencyContactActivity.KEY_CONTACT_RELATION_TYPE_ID, MedicalIdAddEmergencyContactActivity.KEY_CONTACT_NUMBER, MedicalIdAddEmergencyContactActivity.KEY_CONTACT_NAME, "getMedicalIdRecordFromSP", "getBooleanLiveDataFromSP", "key", "defVal", "getLongFromSP", "getIntFromSP", "getLiveData", "T", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/lifecycle/LiveData;", "getMedicalIdRecordLiveData", "deletePersistentAvatarFile", "MedicalIdRecordDataHandler", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MedicalIdViewModel extends BaseViewModel<MedicalIdModel> {
    public AccountRequest mAccountRequest;

    @Nullable
    private LiveData<MedicalIdRecord> mMedicalIdRecordLiveData;
    private int mSelectedRelation;

    @NotNull
    private UserInfoManager mUserInfoManager = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE);
    public IMedicalIdRepository medicalIdRepository;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/userinfo/medicalid/viewmodel/MedicalIdViewModel$MedicalIdRecordDataHandler;", "Lcom/xiaomi/fitness/common/lifecycle/IDataHandler;", "Lcom/xiaomi/fitness/user/info/export/medicalid/MedicalIdRecord;", "<init>", "()V", "onDataReady", "dataSet", "Lcom/xiaomi/fitness/common/lifecycle/IDataHandler$DataSet;", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MedicalIdRecordDataHandler implements IDataHandler<MedicalIdRecord> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xiaomi.fitness.common.lifecycle.IDataHandler
        @NotNull
        public MedicalIdRecord onDataReady(@NotNull IDataHandler.DataSet dataSet) {
            Intrinsics.checkNotNullParameter(dataSet, "dataSet");
            String str = (String) dataSet.get(MedicalIdSPContract.PREF_EMERGENCY_CONTACT_NAME);
            String str2 = (String) dataSet.get(MedicalIdSPContract.PREF_EMERGENCY_CONTACT_NUMBER);
            Object obj = dataSet.get(MedicalIdSPContract.PREF_EMERGENCY_CONTACT_RELATION);
            Intrinsics.checkNotNull(obj);
            int iIntValue = ((Number) obj).intValue();
            MedicalIdRecord medicalIdRecord = new MedicalIdRecord(0, 1, null);
            medicalIdRecord.setAvatarFilePath((String) dataSet.get(MedicalIdSPContract.PREF_AVATAR_PATH));
            medicalIdRecord.setName((String) dataSet.get("name"));
            Object obj2 = dataSet.get("gender");
            Intrinsics.checkNotNull(obj2);
            medicalIdRecord.setGender(((Number) obj2).intValue());
            medicalIdRecord.setBirthday((Long) dataSet.get(MedicalIdSPContract.PREF_BIRTHDAY));
            Object obj3 = dataSet.get(MedicalIdSPContract.PREF_BLOOD_TYPE);
            Intrinsics.checkNotNull(obj3);
            medicalIdRecord.setBloodType(((Number) obj3).intValue());
            Object obj4 = dataSet.get(MedicalIdSPContract.PREF_ORGAN_DONOR);
            Intrinsics.checkNotNull(obj4);
            medicalIdRecord.setDonorType(((Number) obj4).intValue());
            medicalIdRecord.setAllergyDrugs((String) dataSet.get(MedicalIdSPContract.PREF_ALLERGY_DRUGS));
            medicalIdRecord.setChronic((String) dataSet.get(MedicalIdSPContract.PREF_CHRONIC));
            medicalIdRecord.setTreatment((String) dataSet.get(MedicalIdSPContract.PREF_TREATMENT));
            medicalIdRecord.setContactName(str);
            medicalIdRecord.setContactNumber(str2);
            medicalIdRecord.setContactRelationType(iIntValue);
            return medicalIdRecord;
        }
    }

    private final long getBirthdayLongFromUserInfoManager() {
        return BirthdateConverter.INSTANCE.getBirthdateLongFromUserProfile();
    }

    @NotNull
    public final String constructEmergencyContactRemindText(int contactRelationType, @Nullable String contactNumber, @Nullable String contactName) {
        return EmergencyContactConverter.INSTANCE.constructEmergencyContactDisplayText(contactRelationType, contactNumber, contactName);
    }

    public final boolean deletePersistentAvatarFile() {
        return AvatarUtil.INSTANCE.deletePersistentCroppedAvatar();
    }

    public final void deleteRecord() {
        getMedicalIdRepository().clearAllData();
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        UserInfoConfigUtil.syncUserInfoToSportDevice$default(UserInfoConfigUtil.INSTANCE, UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null), wearableDeviceModel, null, null, 12, null);
    }

    @NotNull
    public final String getAvatarFilePathString() {
        String stringFromSP = getMedicalIdRepository().getStringFromSP(MedicalIdSPContract.PREF_AVATAR_PATH, "");
        return (TextUtils.isEmpty(stringFromSP) || !FileUtils.isExists(stringFromSP)) ? "" : String.valueOf(stringFromSP);
    }

    public final long getBirthdayLongFromUserProfileOrSp() {
        long birthdayLongFromUserInfoManager = getBirthdayLongFromUserInfoManager();
        Logger.d("DEBUG-birthdayLiveData  " + birthdayLongFromUserInfoManager, new Object[0]);
        return birthdayLongFromUserInfoManager;
    }

    @Nullable
    public final LiveData<Boolean> getBooleanLiveDataFromSP(@NotNull String key, boolean defVal) {
        Intrinsics.checkNotNullParameter(key, "key");
        return getMedicalIdRepository().getBooleanLiveDataFromSP(key, defVal);
    }

    public final int getGenderFromSpOrUserProfile() {
        String sex = UserInfoManager.getUserProfile$default(this.mUserInfoManager, false, 1, null).getSex();
        if (Intrinsics.areEqual(sex, "male")) {
            return 1;
        }
        return Intrinsics.areEqual(sex, "female") ? 2 : 0;
    }

    public final boolean getInitStatus() {
        return getMedicalIdRepository().getBooleanFromSP(MedicalIdSPContract.PREF_FIRST, true);
    }

    public final int getIntFromSP(@NotNull String key, int defVal) {
        Intrinsics.checkNotNullParameter(key, "key");
        return getMedicalIdRepository().getIntFromSP(key, defVal);
    }

    @NotNull
    public final <T> LiveData<T> getLiveData(@NotNull String key, T defVal) {
        Intrinsics.checkNotNullParameter(key, "key");
        LiveData<T> liveData = getMedicalIdRepository().getLiveData(key, defVal);
        return liveData == null ? new MutableLiveData() : liveData;
    }

    public final long getLongFromSP(@NotNull String key, long defVal) {
        Intrinsics.checkNotNullParameter(key, "key");
        return getMedicalIdRepository().getLongFromSP(key, defVal);
    }

    @NotNull
    public final AccountRequest getMAccountRequest() {
        AccountRequest accountRequest = this.mAccountRequest;
        if (accountRequest != null) {
            return accountRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAccountRequest");
        return null;
    }

    @Nullable
    public final LiveData<MedicalIdRecord> getMMedicalIdRecordLiveData() {
        return this.mMedicalIdRecordLiveData;
    }

    public final int getMSelectedRelation() {
        return this.mSelectedRelation;
    }

    @NotNull
    public final UserInfoManager getMUserInfoManager() {
        return this.mUserInfoManager;
    }

    @NotNull
    public final MedicalIdRecord getMedicalIdRecordFromSP() {
        MedicalIdRecord medicalIdRecord = new MedicalIdRecord(0, 1, null);
        medicalIdRecord.setName(getMedicalIdRepository().getStringFromSP("name", ""));
        medicalIdRecord.setGender(getMedicalIdRepository().getIntFromSP("gender", 0));
        medicalIdRecord.setBirthday(Long.valueOf(getMedicalIdRepository().getLongFromSP(MedicalIdSPContract.PREF_BIRTHDAY, 0L)));
        medicalIdRecord.setBloodType(getMedicalIdRepository().getIntFromSP(MedicalIdSPContract.PREF_BLOOD_TYPE, 0));
        medicalIdRecord.setDonorType(getMedicalIdRepository().getIntFromSP(MedicalIdSPContract.PREF_ORGAN_DONOR, 0));
        medicalIdRecord.setContactName(getMedicalIdRepository().getStringFromSP(MedicalIdSPContract.PREF_EMERGENCY_CONTACT_NAME, ""));
        medicalIdRecord.setContactNumber(getMedicalIdRepository().getStringFromSP(MedicalIdSPContract.PREF_EMERGENCY_CONTACT_NUMBER, ""));
        medicalIdRecord.setContactRelationType(getMedicalIdRepository().getIntFromSP(MedicalIdSPContract.PREF_EMERGENCY_CONTACT_RELATION, 0));
        medicalIdRecord.setAllergyDrugs(getMedicalIdRepository().getStringFromSP(MedicalIdSPContract.PREF_ALLERGY_DRUGS, ""));
        medicalIdRecord.setChronic(getMedicalIdRepository().getStringFromSP(MedicalIdSPContract.PREF_CHRONIC, ""));
        medicalIdRecord.setTreatment(getMedicalIdRepository().getStringFromSP(MedicalIdSPContract.PREF_TREATMENT, ""));
        medicalIdRecord.setRemark(getMedicalIdRepository().getStringFromSP("remark", ""));
        medicalIdRecord.setAvatarFilePath(getMedicalIdRepository().getStringFromSP(MedicalIdSPContract.PREF_AVATAR_PATH, ""));
        medicalIdRecord.setLockShowStatus(getMedicalIdRepository().getIntFromSP(MedicalIdSPContract.PREF_LOCK_SCREEN_SHOW, -1));
        return medicalIdRecord;
    }

    @Nullable
    public final LiveData<MedicalIdRecord> getMedicalIdRecordLiveData() {
        if (this.mMedicalIdRecordLiveData == null) {
            DataHolder dataHolderAddSource = new DataHolder(new MedicalIdRecordDataHandler(), false, 2, null).addSource(MedicalIdSPContract.PREF_AVATAR_PATH, String.class, getLiveData(MedicalIdSPContract.PREF_AVATAR_PATH, "")).addSource("name", String.class, getLiveData("name", "")).addSource(MedicalIdSPContract.PREF_BIRTHDAY, Long.TYPE, getLiveData(MedicalIdSPContract.PREF_BIRTHDAY, Long.MIN_VALUE));
            Class cls = Integer.TYPE;
            this.mMedicalIdRecordLiveData = DataHolder.asLiveData$default(dataHolderAddSource.addSource("gender", cls, getLiveData("gender", 0)).addSource(MedicalIdSPContract.PREF_BLOOD_TYPE, cls, getLiveData(MedicalIdSPContract.PREF_BLOOD_TYPE, 0)).addSource(MedicalIdSPContract.PREF_ORGAN_DONOR, cls, getLiveData(MedicalIdSPContract.PREF_ORGAN_DONOR, 0)).addSource(MedicalIdSPContract.PREF_ALLERGY_DRUGS, String.class, getLiveData(MedicalIdSPContract.PREF_ALLERGY_DRUGS, "")).addSource(MedicalIdSPContract.PREF_CHRONIC, String.class, getLiveData(MedicalIdSPContract.PREF_CHRONIC, "")).addSource(MedicalIdSPContract.PREF_TREATMENT, String.class, getLiveData(MedicalIdSPContract.PREF_TREATMENT, "")).addSource("remark", String.class, getLiveData("remark", "")).addSource(MedicalIdSPContract.PREF_EMERGENCY_CONTACT_NAME, String.class, getLiveData(MedicalIdSPContract.PREF_EMERGENCY_CONTACT_NAME, "")).addSource(MedicalIdSPContract.PREF_EMERGENCY_CONTACT_NUMBER, String.class, getLiveData(MedicalIdSPContract.PREF_EMERGENCY_CONTACT_NUMBER, "")).addSource(MedicalIdSPContract.PREF_EMERGENCY_CONTACT_RELATION, cls, getLiveData(MedicalIdSPContract.PREF_EMERGENCY_CONTACT_RELATION, 0)), null, 1, null);
        }
        return this.mMedicalIdRecordLiveData;
    }

    @NotNull
    public final IMedicalIdRepository getMedicalIdRepository() {
        IMedicalIdRepository iMedicalIdRepository = this.medicalIdRepository;
        if (iMedicalIdRepository != null) {
            return iMedicalIdRepository;
        }
        Intrinsics.throwUninitializedPropertyAccessException("medicalIdRepository");
        return null;
    }

    public final void saveOrUpdateRecord(@NotNull MedicalIdRecord medicalIdRecord) {
        Intrinsics.checkNotNullParameter(medicalIdRecord, "medicalIdRecord");
        getMedicalIdRepository().saveOrUpdateRecord(medicalIdRecord);
        final WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        final UserProfile userProfile$default = UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null);
        userProfile$default.setSex(medicalIdRecord.getGender() == 2 ? "female" : "male");
        Long birthday = medicalIdRecord.getBirthday();
        userProfile$default.setBirth(TimeDateUtil.getDateYYYYMMdd(birthday != null ? birthday.longValue() : 0L));
        UserInformationManager.DefaultImpls.sendAllProfile$default(UserInformationManagerExtKt.getInstance(UserInformationManager.INSTANCE), null, userProfile$default, getMAccountRequest(), new SendProfileCallBack() { // from class: com.xiaomi.fitness.userinfo.medicalid.viewmodel.MedicalIdViewModel.saveOrUpdateRecord.1
            @Override // com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack
            public void onProfileToDBSuccess(boolean result) {
            }

            @Override // com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack
            public void onSendError(int i) {
                SendProfileCallBack.DefaultImpls.onSendError(this, i);
            }

            @Override // com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack
            public void onSendSuccess(UserProfile profile) {
                UserInfoConfigUtil.syncUserInfoToSportDevice$default(UserInfoConfigUtil.INSTANCE, userProfile$default, wearableDeviceModel, null, null, 12, null);
            }

            @Override // com.xiaomi.fitness.user.info.export.callback.SendProfileCallBack
            public void onSendError() {
                UserInfoConfigUtil.syncUserInfoToSportDevice$default(UserInfoConfigUtil.INSTANCE, userProfile$default, wearableDeviceModel, null, null, 12, null);
            }
        }, 1, null);
    }

    public final void setFirstInitStatus(boolean isFirstInitStatus) {
        getMedicalIdRepository().setIsFirstInitStatus(isFirstInitStatus);
    }

    public final void setMAccountRequest(@NotNull AccountRequest accountRequest) {
        Intrinsics.checkNotNullParameter(accountRequest, "<set-?>");
        this.mAccountRequest = accountRequest;
    }

    public final void setMMedicalIdRecordLiveData(@Nullable LiveData<MedicalIdRecord> liveData) {
        this.mMedicalIdRecordLiveData = liveData;
    }

    public final void setMSelectedRelation(int i) {
        this.mSelectedRelation = i;
    }

    public final void setMUserInfoManager(@NotNull UserInfoManager userInfoManager) {
        Intrinsics.checkNotNullParameter(userInfoManager, "<set-?>");
        this.mUserInfoManager = userInfoManager;
    }

    public final void setMedicalIdRepository(@NotNull IMedicalIdRepository iMedicalIdRepository) {
        Intrinsics.checkNotNullParameter(iMedicalIdRepository, "<set-?>");
        this.medicalIdRepository = iMedicalIdRepository;
    }
}
