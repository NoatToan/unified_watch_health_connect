package com.xiaomi.fitness.sport_eco.view.launch.gym.setting;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport_eco.utils.SportPreference;
import com.xiaomi.fitness.sport_eco_manager_export.SportConstants;
import com.xiaomi.fitness.sport_eco_manager_export.di.SportEcoManagerExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.listener.ISCMRepository;
import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import defpackage.mcn;
import kotlin.Metadata;
import kotlinx.coroutines.DebugKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0012\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0013\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0014\u0010\rJ\u0017\u0010\u0015\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0015\u0010\u000fJ\u0019\u0010\u0016\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingHelper;", "", "", "show", "", "setShowSportBgPermission", "(Z)V", "isShowSportBgPermission", "()Z", DebugKt.DEBUG_PROPERTY_VALUE_ON, "Lmcn;", "sportDB", "setVoiceSpeechSwitch", "(ZLmcn;)V", "isSettingVoiceSpeech", "(Lmcn;)Z", "setDistanceVoiceSpeechSwitch", "isSettingDistanceVoiceSpeech", "setScreenOnSwitch", "isSettingScreenOn", "setLockWithDataSwitch", "isSettingLockWithData", "saveSportModelFromDB", "(Lmcn;)V", "getSportModelFromDB", "()Lmcn;", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class LocalSportSettingHelper {

    @NotNull
    public static final LocalSportSettingHelper INSTANCE = new LocalSportSettingHelper();

    @NotNull
    public static final String TAG = "LocalSportSetting";

    private LocalSportSettingHelper() {
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033  */
    /* JADX WARN: Code duplicated, block: B:22:0x0047  */
    @NotNull
    public final mcn getSportModelFromDB() {
        String key_gym_local_sport_type = SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE();
        int i = 3;
        switch (key_gym_local_sport_type.hashCode()) {
            case -1798122615:
                if (key_gym_local_sport_type.equals("yesoul.exbike.jsc01y")) {
                    i = 7;
                }
                break;
            case -1454035281:
                if (key_gym_local_sport_type.equals("runmi.exbike.jscrm1")) {
                    i = 7;
                }
                break;
            case 405899618:
                if (key_gym_local_sport_type.equals("yunmai.jmprope.sr803")) {
                    i = 14;
                }
                break;
            case 405899619:
                if (key_gym_local_sport_type.equals("yunmai.jmprope.sr804")) {
                    i = 14;
                }
                break;
            case 405899620:
                if (key_gym_local_sport_type.equals(SportConstants.GYM_MODEL_YUN_MAI_JUMP_WINE_RED)) {
                    i = 14;
                }
                break;
            case 1396900280:
                key_gym_local_sport_type.equals("ksmb.treadmill.m1v1");
                break;
        }
        mcn mcnVar = new mcn();
        if (i != 14) {
            mcnVar.f26019b = false;
        }
        mcn sportConfigModel = SportEcoManagerExtKt.getInstance(ISCMRepository.INSTANCE).getScmDao().getSportConfigModel(i);
        return sportConfigModel == null ? mcnVar : sportConfigModel;
    }

    public final boolean isSettingDistanceVoiceSpeech(@Nullable mcn sportDB) {
        if (sportDB != null) {
            return sportDB.h;
        }
        return false;
    }

    public final boolean isSettingLockWithData(@Nullable mcn sportDB) {
        if ((sportDB != null ? Boolean.valueOf(sportDB.f26020k) : null) == null) {
            return false;
        }
        return sportDB.f26020k;
    }

    public final boolean isSettingScreenOn(@Nullable mcn sportDB) {
        if ((sportDB != null ? Boolean.valueOf(sportDB.f26019b) : null) == null) {
            return false;
        }
        return sportDB.f26019b;
    }

    public final boolean isSettingVoiceSpeech(@Nullable mcn sportDB) {
        if (sportDB != null) {
            return sportDB.m;
        }
        return false;
    }

    public final boolean isShowSportBgPermission() {
        return SportPreference.INSTANCE.getKEY_BG_PERMISSION();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        if (r0.equals("yesoul.exbike.jsc01y") != false) goto L28;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @android.annotation.SuppressLint({"WrongConstant"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void saveSportModelFromDB(@org.jetbrains.annotations.Nullable defpackage.mcn r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference r0 = com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference.INSTANCE
            java.lang.String r0 = r0.getKEY_GYM_LOCAL_SPORT_TYPE()
            com.xiaomi.fitness.sport_eco_manager_export.listener.ISCMRepository$Companion r1 = com.xiaomi.fitness.sport_eco_manager_export.listener.ISCMRepository.INSTANCE     // Catch: java.lang.Exception -> L31
            com.xiaomi.fitness.sport_eco_manager_export.listener.ISCMRepository r1 = com.xiaomi.fitness.sport_eco_manager_export.di.SportEcoManagerExtKt.getInstance(r1)     // Catch: java.lang.Exception -> L31
            com.xiaomi.fitness.sport_eco_manager_export.listener.SCMDao r1 = r1.getScmDao()     // Catch: java.lang.Exception -> L31
            r1.addOrUpdateSportConfigModel(r3)     // Catch: java.lang.Exception -> L31
            int r3 = r0.hashCode()     // Catch: java.lang.Exception -> L31
            r1 = -1798122615(0xffffffff94d2d389, float:-2.1288017E-26)
            if (r3 == r1) goto L5a
            r1 = -1454035281(0xffffffffa9552eaf, float:-4.7335992E-14)
            if (r3 == r1) goto L51
            switch(r3) {
                case 405899618: goto L3c;
                case 405899619: goto L33;
                case 405899620: goto L28;
                default: goto L27;
            }     // Catch: java.lang.Exception -> L31
        L27:
            goto L6d
        L28:
            java.lang.String r3 = "yunmai.jmprope.sr805"
            boolean r3 = r0.equals(r3)     // Catch: java.lang.Exception -> L31
            if (r3 != 0) goto L45
            goto L6d
        L31:
            r3 = move-exception
            goto L78
        L33:
            java.lang.String r3 = "yunmai.jmprope.sr804"
            boolean r3 = r0.equals(r3)     // Catch: java.lang.Exception -> L31
            if (r3 != 0) goto L45
            goto L6d
        L3c:
            java.lang.String r3 = "yunmai.jmprope.sr803"
            boolean r3 = r0.equals(r3)     // Catch: java.lang.Exception -> L31
            if (r3 != 0) goto L45
            goto L6d
        L45:
            com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState$Companion r3 = com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState.INSTANCE     // Catch: java.lang.Exception -> L31
            com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState r3 = com.xiaomi.fitness.sport_eco_manager_export.di.SportEcoManagerExtKt.getInstance(r3)     // Catch: java.lang.Exception -> L31
            r0 = 14
            r3.refreshSportRemind(r0)     // Catch: java.lang.Exception -> L31
            goto L7f
        L51:
            java.lang.String r3 = "runmi.exbike.jscrm1"
            boolean r3 = r0.equals(r3)     // Catch: java.lang.Exception -> L31
            if (r3 != 0) goto L62
            goto L6d
        L5a:
            java.lang.String r3 = "yesoul.exbike.jsc01y"
            boolean r3 = r0.equals(r3)     // Catch: java.lang.Exception -> L31
            if (r3 == 0) goto L6d
        L62:
            com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState$Companion r3 = com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState.INSTANCE     // Catch: java.lang.Exception -> L31
            com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState r3 = com.xiaomi.fitness.sport_eco_manager_export.di.SportEcoManagerExtKt.getInstance(r3)     // Catch: java.lang.Exception -> L31
            r0 = 7
            r3.refreshSportRemind(r0)     // Catch: java.lang.Exception -> L31
            goto L7f
        L6d:
            com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState$Companion r3 = com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState.INSTANCE     // Catch: java.lang.Exception -> L31
            com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState r3 = com.xiaomi.fitness.sport_eco_manager_export.di.SportEcoManagerExtKt.getInstance(r3)     // Catch: java.lang.Exception -> L31
            r0 = 3
            r3.refreshSportRemind(r0)     // Catch: java.lang.Exception -> L31
            goto L7f
        L78:
            java.lang.String r0 = "LocalSportSetting"
            java.lang.String r1 = "saveSportModelFromDB error:"
            com.xiaomi.fitness.common.log.Logger.e(r0, r1, r3)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalSportSettingHelper.saveSportModelFromDB(mcn):void");
    }

    public final void setDistanceVoiceSpeechSwitch(boolean on, @Nullable mcn sportDB) {
        Logger.d("LocalSportSetting", "setVoiceSpeechSwitch " + (sportDB == null) + " " + on);
        if (sportDB != null) {
            sportDB.h = on;
        }
    }

    public final void setLockWithDataSwitch(boolean on, @Nullable mcn sportDB) {
        Logger.d("LocalSportSetting", "setLockWithDataSwitch " + on);
        if (sportDB != null) {
            sportDB.f26020k = on;
        }
    }

    public final void setScreenOnSwitch(boolean on, @Nullable mcn sportDB) {
        Logger.d("LocalSportSetting", "setScreenOnSwitch " + on);
        if (sportDB != null) {
            sportDB.f26019b = on;
        }
    }

    public final void setShowSportBgPermission(boolean show) {
        SportPreference.INSTANCE.setKEY_BG_PERMISSION(show);
    }

    public final void setVoiceSpeechSwitch(boolean on, @Nullable mcn sportDB) {
        Logger.d("LocalSportSetting", "setVoiceSpeechSwitch " + (sportDB == null) + " " + on);
        if (sportDB != null) {
            sportDB.m = on;
        }
    }
}
