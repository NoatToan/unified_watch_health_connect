package com.xiaomi.fitness.sport.view.launch.gym.setting;

import android.annotation.SuppressLint;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport.utils.SportPreference;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import com.xiaomi.fitness.sport_manager_export.listener.ISCMRepository;
import defpackage.lcn;
import kotlin.Metadata;
import kotlinx.coroutines.DebugKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0012\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0013\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0014\u0010\rJ\u0017\u0010\u0015\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0015\u0010\u000fJ\u0019\u0010\u0016\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingHelper;", "", "", "show", "", "setShowSportBgPermission", "(Z)V", "isShowSportBgPermission", "()Z", DebugKt.DEBUG_PROPERTY_VALUE_ON, "Llcn;", "sportDB", "setVoiceSpeechSwitch", "(ZLlcn;)V", "isSettingVoiceSpeech", "(Llcn;)Z", "setDistanceVoiceSpeechSwitch", "isSettingDistanceVoiceSpeech", "setScreenOnSwitch", "isSettingScreenOn", "setLockWithDataSwitch", "isSettingLockWithData", "saveSportModelFromDB", "(Llcn;)V", "getSportModelFromDB", "()Llcn;", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class LocalSportSettingHelper {

    @NotNull
    public static final LocalSportSettingHelper INSTANCE = new LocalSportSettingHelper();

    @NotNull
    public static final String TAG = "LocalSportSetting";

    private LocalSportSettingHelper() {
    }

    @NotNull
    public final lcn getSportModelFromDB() {
        lcn sportConfigModel = SportManagerExtKt.getInstance(ISCMRepository.INSTANCE).getScmDao().getSportConfigModel(3);
        return sportConfigModel == null ? new lcn() : sportConfigModel;
    }

    public final boolean isSettingDistanceVoiceSpeech(@Nullable lcn sportDB) {
        if (sportDB != null) {
            return sportDB.h;
        }
        return false;
    }

    public final boolean isSettingLockWithData(@Nullable lcn sportDB) {
        if ((sportDB != null ? Boolean.valueOf(sportDB.f24910k) : null) == null) {
            return false;
        }
        return sportDB.f24910k;
    }

    public final boolean isSettingScreenOn(@Nullable lcn sportDB) {
        if ((sportDB != null ? Boolean.valueOf(sportDB.f24909b) : null) == null) {
            return false;
        }
        return sportDB.f24909b;
    }

    public final boolean isSettingVoiceSpeech(@Nullable lcn sportDB) {
        if (sportDB != null) {
            return sportDB.m;
        }
        return false;
    }

    public final boolean isShowSportBgPermission() {
        return SportPreference.INSTANCE.getKEY_BG_PERMISSION();
    }

    @SuppressLint({"WrongConstant"})
    public final void saveSportModelFromDB(@Nullable lcn sportDB) {
        if (sportDB == null) {
            return;
        }
        try {
            SportManagerExtKt.getInstance(ISCMRepository.INSTANCE).getScmDao().addOrUpdateSportConfigModel(sportDB);
            SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).refreshSportRemind(3);
        } catch (Exception e) {
            Logger.e("LocalSportSetting", "saveSportModelFromDB error:", e);
        }
    }

    public final void setDistanceVoiceSpeechSwitch(boolean on, @Nullable lcn sportDB) {
        FitnessLogUtils.i("LocalSportSetting", "setVoiceSpeechSwitch " + (sportDB == null) + " " + on);
        if (sportDB != null) {
            sportDB.h = on;
        }
    }

    public final void setLockWithDataSwitch(boolean on, @Nullable lcn sportDB) {
        FitnessLogUtils.i("LocalSportSetting", "setLockWithDataSwitch " + on);
        if (sportDB != null) {
            sportDB.f24910k = on;
        }
    }

    public final void setScreenOnSwitch(boolean on, @Nullable lcn sportDB) {
        FitnessLogUtils.i("LocalSportSetting", "setScreenOnSwitch " + on);
        if (sportDB != null) {
            sportDB.f24909b = on;
        }
    }

    public final void setShowSportBgPermission(boolean show) {
        SportPreference.INSTANCE.setKEY_BG_PERMISSION(show);
    }

    public final void setVoiceSpeechSwitch(boolean on, @Nullable lcn sportDB) {
        FitnessLogUtils.i("LocalSportSetting", "setVoiceSpeechSwitch " + (sportDB == null) + " " + on);
        if (sportDB != null) {
            sportDB.m = on;
        }
    }
}
