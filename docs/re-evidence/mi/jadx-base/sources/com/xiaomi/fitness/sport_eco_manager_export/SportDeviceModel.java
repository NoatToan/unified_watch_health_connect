package com.xiaomi.fitness.sport_eco_manager_export;

import com.xiaomi.fitness.sport_eco_manager_export.utils.SportManagerExportPreference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager_export/SportDeviceModel;", "", "<init>", "()V", "isSupportFtpMachine", "", "isSupportModelSwitch", "isSupportLockMachine", "isSupportCheckUploadMachine", "isSupportEnvironmentalMachine", "isNotSupportLinkForWear", "isJump", "model", "", "isEcoDevice", "isEcoDeviceByPid", "pid", "", "sport-eco-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportDeviceModel {

    @NotNull
    public static final SportDeviceModel INSTANCE = new SportDeviceModel();

    private SportDeviceModel() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0040 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final boolean isEcoDevice(@Nullable String model) {
        if (model != null) {
            int iHashCode = model.hashCode();
            if (iHashCode != -1798122615) {
                if (iHashCode != -1454035281) {
                    switch (iHashCode) {
                        case 405899618:
                            if (model.equals("yunmai.jmprope.sr803")) {
                                return true;
                            }
                            break;
                        case 405899619:
                            if (model.equals("yunmai.jmprope.sr804")) {
                                return true;
                            }
                            break;
                        case 405899620:
                            if (model.equals(SportConstants.GYM_MODEL_YUN_MAI_JUMP_WINE_RED)) {
                                return true;
                            }
                            break;
                    }
                } else if (model.equals("runmi.exbike.jscrm1")) {
                    return true;
                }
            } else if (model.equals("yesoul.exbike.jsc01y")) {
                return true;
            }
        }
        return false;
    }

    public final boolean isEcoDeviceByPid(int pid) {
        return pid == 5533 || pid == 6891 || pid == 9050;
    }

    public final boolean isJump() {
        return StringsKt__StringsJVMKt.startsWith$default(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE(), SportConstants.GYM_MODEL_YUN_MAI_JUMP_PREFIX, false, 2, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final boolean isNotSupportLinkForWear() {
        String key_gym_local_sport_type = SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE();
        int iHashCode = key_gym_local_sport_type.hashCode();
        if (iHashCode != -1798122615) {
            switch (iHashCode) {
                case 405899618:
                    if (key_gym_local_sport_type.equals("yunmai.jmprope.sr803")) {
                        return true;
                    }
                    break;
                case 405899619:
                    if (key_gym_local_sport_type.equals("yunmai.jmprope.sr804")) {
                        return true;
                    }
                    break;
                case 405899620:
                    if (key_gym_local_sport_type.equals(SportConstants.GYM_MODEL_YUN_MAI_JUMP_WINE_RED)) {
                        return true;
                    }
                    break;
            }
        } else if (key_gym_local_sport_type.equals("yesoul.exbike.jsc01y")) {
            return true;
        }
        return false;
    }

    public final boolean isSupportCheckUploadMachine() {
        return Intrinsics.areEqual(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE(), "yesoul.exbike.jsc01y");
    }

    public final boolean isSupportEnvironmentalMachine() {
        return Intrinsics.areEqual(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE(), "yesoul.exbike.jsc01y");
    }

    public final boolean isSupportFtpMachine() {
        String key_gym_local_sport_type = SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE();
        return Intrinsics.areEqual(key_gym_local_sport_type, "runmi.exbike.jscrm1") || Intrinsics.areEqual(key_gym_local_sport_type, "yesoul.exbike.jsc01y");
    }

    public final boolean isSupportLockMachine() {
        return Intrinsics.areEqual(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE(), "ksmb.treadmill.m1v1");
    }

    public final boolean isSupportModelSwitch() {
        return Intrinsics.areEqual(SportManagerExportPreference.INSTANCE.getKEY_GYM_LOCAL_SPORT_TYPE(), "runmi.exbike.jscrm1");
    }

    public final boolean isJump(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return StringsKt__StringsJVMKt.startsWith$default(model, SportConstants.GYM_MODEL_YUN_MAI_JUMP_PREFIX, false, 2, null);
    }
}
