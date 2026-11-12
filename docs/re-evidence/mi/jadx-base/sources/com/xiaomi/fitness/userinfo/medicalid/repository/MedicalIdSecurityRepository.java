package com.xiaomi.fitness.userinfo.medicalid.repository;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Pair;
import androidx.lifecycle.LiveData;
import androidx.security.crypto.EncryptedSharedPreferences;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.lifecycle.LiveSharedPreHelper;
import com.xiaomi.fitness.common.lifecycle.LiveSharedPreferences;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.user.info.export.MedicalIdPreference;
import com.xiaomi.fitness.user.info.export.MedicalIdSPContract;
import com.xiaomi.fitness.user.info.export.medicalid.IMedicalIdRepository;
import com.xiaomi.fitness.user.info.export.medicalid.MedicalIdRecord;
import com.xiaomi.fitness.userinfo.medicalid.util.BloodTypeConverter;
import com.xiaomi.fitness.userinfo.medicalid.util.GenderTypeConverter;
import defpackage.c7f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\tH\u0016J\u0018\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0007H\u0016J\u0018\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0012H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0007H\u0016J \u0010 \u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0012H\u0016J \u0010!\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u001bH\u0016J \u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J+\u0010#\u001a\n\u0012\u0004\u0012\u0002H$\u0018\u00010\u001f\"\u0004\b\u0000\u0010$2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u0002H$H\u0016¢\u0006\u0002\u0010%J\b\u0010&\u001a\u00020\u0017H\u0016J\u0010\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u0012H\u0016J\n\u0010)\u001a\u0004\u0018\u00010*H\u0002J%\u0010+\u001a\u0004\u0018\u0001H$\"\u0004\b\u0000\u0010$2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u0002H$H\u0016¢\u0006\u0002\u0010,R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/userinfo/medicalid/repository/MedicalIdSecurityRepository;", "Lcom/xiaomi/fitness/user/info/export/medicalid/IMedicalIdRepository;", "<init>", "()V", "mLiveSharedPreferences", "Lcom/xiaomi/fitness/common/lifecycle/LiveSharedPreferences;", "isFirstInitStatus", "", "createEncryptedSharedPreferences", "", "context", "Landroid/content/Context;", "saveOrUpdateRecord", "medicalIdRecord", "Lcom/xiaomi/fitness/user/info/export/medicalid/MedicalIdRecord;", "getMedicalIdRecord", "getBloodType", "Landroid/util/Pair;", "", "bloodType", "clearAllData", "getBooleanFromSP", "key", "", "defVal", "getIntFromSP", "getLongFromSP", "", "getStringFromSP", "setIsFirstInitStatus", "getBooleanLiveDataFromSP", "Landroidx/lifecycle/LiveData;", "getIntLiveDataFromSP", "getLongLiveDataFromSP", "getStringLiveDataFromSP", "getLiveData", "T", "(Ljava/lang/String;Ljava/lang/Object;)Landroidx/lifecycle/LiveData;", "getGenderString", "getBloodString", "type", "getEditor", "Landroid/content/SharedPreferences$Editor;", "getValueFromSP", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "Companion", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MedicalIdSecurityRepository implements IMedicalIdRepository {

    @NotNull
    public static final String PREF_FILE_NAME = "pref:aid";

    @NotNull
    public static final String PREF_FILE_NAME_NO_ENCRYPT = "pref:aid2";

    @Nullable
    private LiveSharedPreferences mLiveSharedPreferences;

    public MedicalIdSecurityRepository() {
        createEncryptedSharedPreferences(ApplicationExtKt.getApplication());
    }

    private final void createEncryptedSharedPreferences(Context context) {
        LiveSharedPreferences liveSharedPreferences;
        try {
            KeyGenParameterSpec AES256_GCM_SPEC = c7f.f5013a;
            Intrinsics.checkNotNullExpressionValue(AES256_GCM_SPEC, "AES256_GCM_SPEC");
            String strC = c7f.c(AES256_GCM_SPEC);
            Intrinsics.checkNotNullExpressionValue(strC, "getOrCreate(...)");
            SharedPreferences sharedPreferencesA = EncryptedSharedPreferences.a("pref:aid", strC, context, EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
            Intrinsics.checkNotNullExpressionValue(sharedPreferencesA, "create(...)");
            liveSharedPreferences = new LiveSharedPreferences(sharedPreferencesA);
        } catch (Exception e) {
            Logger.i("MiHealth", "MedicalIdSecurityRepository createEncryptedSharedPreferences exception:" + e);
            liveSharedPreferences = new LiveSharedPreferences(context, PREF_FILE_NAME_NO_ENCRYPT);
        }
        this.mLiveSharedPreferences = liveSharedPreferences;
    }

    private final SharedPreferences.Editor getEditor() {
        LiveSharedPreferences liveSharedPreferences = this.mLiveSharedPreferences;
        if (liveSharedPreferences != null) {
            return liveSharedPreferences.edit();
        }
        return null;
    }

    @Override // com.xiaomi.fitness.user.info.export.medicalid.IMedicalIdRepository
    public void clearAllData() {
        SharedPreferences.Editor editorPutBoolean;
        SharedPreferences.Editor editorClear;
        SharedPreferences.Editor editor = getEditor();
        if (editor != null && (editorClear = editor.clear()) != null) {
            editorClear.apply();
        }
        SharedPreferences.Editor editor2 = getEditor();
        if (editor2 != null && (editorPutBoolean = editor2.putBoolean(MedicalIdSPContract.PREF_FIRST, true)) != null) {
            editorPutBoolean.apply();
        }
        MedicalIdPreference medicalIdPreference = MedicalIdPreference.INSTANCE;
        medicalIdPreference.setMEDICAL_ID_INIT_STATUS(true);
        medicalIdPreference.setSHOW_WHEN_LOCK_SCREEN(false);
    }

    @Override // com.xiaomi.fitness.user.info.export.medicalid.IMedicalIdRepository
    @NotNull
    public String getBloodString(int type) {
        String strConvertBloodTypeToDisplayString = BloodTypeConverter.INSTANCE.convertBloodTypeToDisplayString(type);
        return strConvertBloodTypeToDisplayString == null ? "" : strConvertBloodTypeToDisplayString;
    }

    @Override // com.xiaomi.fitness.user.info.export.medicalid.IMedicalIdRepository
    @NotNull
    public Pair<Integer, Integer> getBloodType(int bloodType) {
        return BloodTypeConverter.INSTANCE.getPairBloodType(bloodType);
    }

    @Override // com.xiaomi.fitness.user.info.export.medicalid.IMedicalIdRepository
    public boolean getBooleanFromSP(@NotNull String key, boolean defVal) {
        Intrinsics.checkNotNullParameter(key, "key");
        LiveSharedPreferences liveSharedPreferences = this.mLiveSharedPreferences;
        if (liveSharedPreferences == null) {
            return false;
        }
        LiveSharedPreHelper liveSharedPreHelper = LiveSharedPreHelper.INSTANCE;
        Intrinsics.checkNotNull(liveSharedPreferences);
        return ((Boolean) liveSharedPreHelper.getPrefValue(liveSharedPreferences, key, Boolean.TRUE)).booleanValue();
    }

    @Override // com.xiaomi.fitness.user.info.export.medicalid.IMedicalIdRepository
    @Nullable
    public LiveData<Boolean> getBooleanLiveDataFromSP(@NotNull String key, boolean defVal) {
        Intrinsics.checkNotNullParameter(key, "key");
        LiveSharedPreferences liveSharedPreferences = this.mLiveSharedPreferences;
        if (liveSharedPreferences == null) {
            return null;
        }
        LiveSharedPreHelper liveSharedPreHelper = LiveSharedPreHelper.INSTANCE;
        Intrinsics.checkNotNull(liveSharedPreferences);
        return liveSharedPreHelper.getPrefLiveData(liveSharedPreferences, key, Boolean.valueOf(defVal));
    }

    @Override // com.xiaomi.fitness.user.info.export.medicalid.IMedicalIdRepository
    @NotNull
    public String getGenderString() {
        return GenderTypeConverter.INSTANCE.convertGenderTypeToDisplayString(UserInfoManager.getUserProfile$default(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE), false, 1, null).getSex());
    }

    @Override // com.xiaomi.fitness.user.info.export.medicalid.IMedicalIdRepository
    public int getIntFromSP(@NotNull String key, int defVal) {
        Intrinsics.checkNotNullParameter(key, "key");
        LiveSharedPreferences liveSharedPreferences = this.mLiveSharedPreferences;
        if (liveSharedPreferences == null) {
            return 0;
        }
        LiveSharedPreHelper liveSharedPreHelper = LiveSharedPreHelper.INSTANCE;
        Intrinsics.checkNotNull(liveSharedPreferences);
        return ((Number) liveSharedPreHelper.getPrefValue(liveSharedPreferences, key, Integer.valueOf(defVal))).intValue();
    }

    @Override // com.xiaomi.fitness.user.info.export.medicalid.IMedicalIdRepository
    @Nullable
    public LiveData<Integer> getIntLiveDataFromSP(@NotNull String key, int defVal) {
        Intrinsics.checkNotNullParameter(key, "key");
        LiveSharedPreferences liveSharedPreferences = this.mLiveSharedPreferences;
        if (liveSharedPreferences == null) {
            return null;
        }
        LiveSharedPreHelper liveSharedPreHelper = LiveSharedPreHelper.INSTANCE;
        Intrinsics.checkNotNull(liveSharedPreferences);
        return liveSharedPreHelper.getPrefLiveData(liveSharedPreferences, key, Integer.valueOf(defVal));
    }

    @Override // com.xiaomi.fitness.user.info.export.medicalid.IMedicalIdRepository
    @Nullable
    public <T> LiveData<T> getLiveData(@NotNull String key, T defVal) {
        Intrinsics.checkNotNullParameter(key, "key");
        LiveSharedPreferences liveSharedPreferences = this.mLiveSharedPreferences;
        if (liveSharedPreferences == null) {
            return null;
        }
        LiveSharedPreHelper liveSharedPreHelper = LiveSharedPreHelper.INSTANCE;
        Intrinsics.checkNotNull(liveSharedPreferences);
        return liveSharedPreHelper.getPrefLiveData(liveSharedPreferences, key, defVal);
    }

    @Override // com.xiaomi.fitness.user.info.export.medicalid.IMedicalIdRepository
    public long getLongFromSP(@NotNull String key, long defVal) {
        Intrinsics.checkNotNullParameter(key, "key");
        LiveSharedPreferences liveSharedPreferences = this.mLiveSharedPreferences;
        if (liveSharedPreferences == null) {
            return 0L;
        }
        LiveSharedPreHelper liveSharedPreHelper = LiveSharedPreHelper.INSTANCE;
        Intrinsics.checkNotNull(liveSharedPreferences);
        return ((Number) liveSharedPreHelper.getPrefValue(liveSharedPreferences, key, Long.valueOf(defVal))).longValue();
    }

    @Override // com.xiaomi.fitness.user.info.export.medicalid.IMedicalIdRepository
    @Nullable
    public LiveData<Long> getLongLiveDataFromSP(@NotNull String key, long defVal) {
        Intrinsics.checkNotNullParameter(key, "key");
        LiveSharedPreferences liveSharedPreferences = this.mLiveSharedPreferences;
        if (liveSharedPreferences == null) {
            return null;
        }
        LiveSharedPreHelper liveSharedPreHelper = LiveSharedPreHelper.INSTANCE;
        Intrinsics.checkNotNull(liveSharedPreferences);
        return liveSharedPreHelper.getPrefLiveData(liveSharedPreferences, key, Long.valueOf(defVal));
    }

    @Override // com.xiaomi.fitness.user.info.export.medicalid.IMedicalIdRepository
    @NotNull
    public MedicalIdRecord getMedicalIdRecord() {
        MedicalIdRecord medicalIdRecord = new MedicalIdRecord(0, 1, null);
        medicalIdRecord.setAvatarFilePath(getStringFromSP(MedicalIdSPContract.PREF_AVATAR_PATH, ""));
        medicalIdRecord.setName(getStringFromSP("name", ""));
        medicalIdRecord.setBirthday(Long.valueOf(getLongFromSP(MedicalIdSPContract.PREF_BIRTHDAY, 0L)));
        medicalIdRecord.setGender(getIntFromSP("gender", 0));
        medicalIdRecord.setBloodType(getIntFromSP(MedicalIdSPContract.PREF_BLOOD_TYPE, 0));
        medicalIdRecord.setAllergyDrugs(getStringFromSP(MedicalIdSPContract.PREF_ALLERGY_DRUGS, ""));
        medicalIdRecord.setChronic(getStringFromSP(MedicalIdSPContract.PREF_CHRONIC, ""));
        medicalIdRecord.setTreatment(getStringFromSP(MedicalIdSPContract.PREF_TREATMENT, ""));
        medicalIdRecord.setDonorType(getIntFromSP(MedicalIdSPContract.PREF_ORGAN_DONOR, 0));
        medicalIdRecord.setLockShowStatus(getIntFromSP(MedicalIdSPContract.PREF_LOCK_SCREEN_SHOW, -1));
        medicalIdRecord.setContactName(getStringFromSP(MedicalIdSPContract.PREF_EMERGENCY_CONTACT_NAME, ""));
        medicalIdRecord.setContactNumber(getStringFromSP(MedicalIdSPContract.PREF_EMERGENCY_CONTACT_NUMBER, ""));
        medicalIdRecord.setContactRelationType(getIntFromSP(MedicalIdSPContract.PREF_EMERGENCY_CONTACT_RELATION, 0));
        MedicalIdPreference.INSTANCE.getMedicalReport(medicalIdRecord);
        return medicalIdRecord;
    }

    @Override // com.xiaomi.fitness.user.info.export.medicalid.IMedicalIdRepository
    @NotNull
    public String getStringFromSP(@NotNull String key, @NotNull String defVal) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defVal, "defVal");
        LiveSharedPreferences liveSharedPreferences = this.mLiveSharedPreferences;
        if (liveSharedPreferences == null) {
            return "";
        }
        LiveSharedPreHelper liveSharedPreHelper = LiveSharedPreHelper.INSTANCE;
        Intrinsics.checkNotNull(liveSharedPreferences);
        return (String) liveSharedPreHelper.getPrefValue(liveSharedPreferences, key, defVal);
    }

    @Override // com.xiaomi.fitness.user.info.export.medicalid.IMedicalIdRepository
    @Nullable
    public LiveData<String> getStringLiveDataFromSP(@NotNull String key, @NotNull String defVal) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defVal, "defVal");
        LiveSharedPreferences liveSharedPreferences = this.mLiveSharedPreferences;
        if (liveSharedPreferences == null) {
            return null;
        }
        LiveSharedPreHelper liveSharedPreHelper = LiveSharedPreHelper.INSTANCE;
        Intrinsics.checkNotNull(liveSharedPreferences);
        return liveSharedPreHelper.getPrefLiveData(liveSharedPreferences, key, defVal);
    }

    @Override // com.xiaomi.fitness.user.info.export.medicalid.IMedicalIdRepository
    @Nullable
    public <T> T getValueFromSP(@NotNull String key, T defVal) {
        Intrinsics.checkNotNullParameter(key, "key");
        LiveSharedPreferences liveSharedPreferences = this.mLiveSharedPreferences;
        if (liveSharedPreferences == null) {
            return null;
        }
        LiveSharedPreHelper liveSharedPreHelper = LiveSharedPreHelper.INSTANCE;
        Intrinsics.checkNotNull(liveSharedPreferences);
        return (T) liveSharedPreHelper.getPrefValue(liveSharedPreferences, key, defVal);
    }

    @Override // com.xiaomi.fitness.user.info.export.medicalid.IMedicalIdRepository
    public boolean isFirstInitStatus() {
        return getBooleanFromSP(MedicalIdSPContract.PREF_FIRST, true);
    }

    @Override // com.xiaomi.fitness.user.info.export.medicalid.IMedicalIdRepository
    public void saveOrUpdateRecord(@NotNull MedicalIdRecord medicalIdRecord) {
        SharedPreferences.Editor editorPutBoolean;
        SharedPreferences.Editor editorPutString;
        SharedPreferences.Editor editorPutString2;
        SharedPreferences.Editor editorPutInt;
        SharedPreferences.Editor editorPutInt2;
        SharedPreferences.Editor editorPutString3;
        SharedPreferences.Editor editorPutString4;
        SharedPreferences.Editor editorPutString5;
        SharedPreferences.Editor editorPutInt3;
        SharedPreferences.Editor editorPutInt4;
        SharedPreferences.Editor editorPutString6;
        SharedPreferences.Editor editorPutString7;
        SharedPreferences.Editor editorPutInt5;
        Intrinsics.checkNotNullParameter(medicalIdRecord, "medicalIdRecord");
        SharedPreferences.Editor editor = getEditor();
        if (editor != null && (editorPutBoolean = editor.putBoolean(MedicalIdSPContract.PREF_FIRST, false)) != null && (editorPutString = editorPutBoolean.putString(MedicalIdSPContract.PREF_AVATAR_PATH, medicalIdRecord.getAvatarFilePath())) != null && (editorPutString2 = editorPutString.putString("name", medicalIdRecord.getName())) != null) {
            Long birthday = medicalIdRecord.getBirthday();
            Intrinsics.checkNotNull(birthday);
            SharedPreferences.Editor editorPutLong = editorPutString2.putLong(MedicalIdSPContract.PREF_BIRTHDAY, birthday.longValue());
            if (editorPutLong != null && (editorPutInt = editorPutLong.putInt("gender", medicalIdRecord.getGender())) != null && (editorPutInt2 = editorPutInt.putInt(MedicalIdSPContract.PREF_BLOOD_TYPE, medicalIdRecord.getBloodType())) != null && (editorPutString3 = editorPutInt2.putString(MedicalIdSPContract.PREF_ALLERGY_DRUGS, medicalIdRecord.getAllergyDrugs())) != null && (editorPutString4 = editorPutString3.putString(MedicalIdSPContract.PREF_CHRONIC, medicalIdRecord.getChronic())) != null && (editorPutString5 = editorPutString4.putString(MedicalIdSPContract.PREF_TREATMENT, medicalIdRecord.getTreatment())) != null && (editorPutInt3 = editorPutString5.putInt(MedicalIdSPContract.PREF_ORGAN_DONOR, medicalIdRecord.getDonorType())) != null && (editorPutInt4 = editorPutInt3.putInt(MedicalIdSPContract.PREF_LOCK_SCREEN_SHOW, medicalIdRecord.getLockShowStatus())) != null && (editorPutString6 = editorPutInt4.putString(MedicalIdSPContract.PREF_EMERGENCY_CONTACT_NAME, medicalIdRecord.getContactName())) != null && (editorPutString7 = editorPutString6.putString(MedicalIdSPContract.PREF_EMERGENCY_CONTACT_NUMBER, medicalIdRecord.getContactNumber())) != null && (editorPutInt5 = editorPutString7.putInt(MedicalIdSPContract.PREF_EMERGENCY_CONTACT_RELATION, medicalIdRecord.getContactRelationType())) != null) {
                editorPutInt5.apply();
            }
        }
        Logger.d("saveOrUpdateRecord avatar file path " + medicalIdRecord.getAvatarFilePath(), new Object[0]);
        MedicalIdPreference medicalIdPreference = MedicalIdPreference.INSTANCE;
        medicalIdPreference.setSHOW_WHEN_LOCK_SCREEN(medicalIdRecord.getLockShowStatus() == 1);
        medicalIdPreference.setMEDICAL_ID_INIT_STATUS(false);
        medicalIdPreference.setMedicalReport(medicalIdRecord);
    }

    @Override // com.xiaomi.fitness.user.info.export.medicalid.IMedicalIdRepository
    public void setIsFirstInitStatus(boolean isFirstInitStatus) {
        SharedPreferences.Editor editor = getEditor();
        if (editor != null) {
            editor.putBoolean(MedicalIdSPContract.PREF_FIRST, isFirstInitStatus);
        }
        MedicalIdPreference.INSTANCE.setMEDICAL_ID_INIT_STATUS(isFirstInitStatus);
    }
}
