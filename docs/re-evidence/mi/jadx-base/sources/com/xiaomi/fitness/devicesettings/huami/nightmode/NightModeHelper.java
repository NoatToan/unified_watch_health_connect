package com.xiaomi.fitness.devicesettings.huami.nightmode;

import com.huami.bluetooth.profile.channel.module.settings.entity.general.General;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.settingitem.settingitem.NightMode;
import com.xiaomi.hm.health.bt.model.HMAutoBacklightInfo;
import defpackage.exo;
import defpackage.t64;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 8\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020 8\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\"¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/nightmode/NightModeHelper;", "", "Lcom/xiaomi/fitness/settingitem/settingitem/NightMode;", "getDefaultNightMode", "()Lcom/xiaomi/fitness/settingitem/settingitem/NightMode;", "nightMode", "Lcom/xiaomi/hm/health/bt/model/HMAutoBacklightInfo;", "convertToAutoBackLightInfo", "(Lcom/xiaomi/fitness/settingitem/settingitem/NightMode;)Lcom/xiaomi/hm/health/bt/model/HMAutoBacklightInfo;", "hmAutoBacklightInfo", "convertToNightMode", "(Lcom/xiaomi/hm/health/bt/model/HMAutoBacklightInfo;)Lcom/xiaomi/fitness/settingitem/settingitem/NightMode;", "Lexo;", "mode", "convertProtosToNightMode", "(Lexo;)Lcom/xiaomi/fitness/settingitem/settingitem/NightMode;", "convertNightModeToProtos", "(Lcom/xiaomi/fitness/settingitem/settingitem/NightMode;)Lexo;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/general/General;", "general", "", "nightModelChangeByDevice", "(Lcom/huami/bluetooth/profile/channel/module/settings/entity/general/General;Lcom/xiaomi/fitness/settingitem/settingitem/NightMode;)Z", "convertGeneralToMode", "(Lcom/huami/bluetooth/profile/channel/module/settings/entity/general/General;)Lcom/xiaomi/fitness/settingitem/settingitem/NightMode;", "formatNightMode", "(Lcom/xiaomi/fitness/settingitem/settingitem/NightMode;)Lcom/xiaomi/fitness/settingitem/settingitem/NightMode;", "needFormatNightMode", "(Lcom/xiaomi/fitness/settingitem/settingitem/NightMode;)Z", "", "TAG", "Ljava/lang/String;", "", "NIGHT_MODE_CLOSE", "I", "NIGHT_MODE_SUNSET_ON", "NIGHT_MODE_TIMING_ON", "<init>", "()V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nNightModeHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NightModeHelper.kt\ncom/xiaomi/fitness/devicesettings/huami/nightmode/NightModeHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n1#2:140\n*E\n"})
public final class NightModeHelper {

    @NotNull
    public static final NightModeHelper INSTANCE = new NightModeHelper();
    public static final int NIGHT_MODE_CLOSE = 0;
    public static final int NIGHT_MODE_SUNSET_ON = 1;
    public static final int NIGHT_MODE_TIMING_ON = 2;

    @NotNull
    private static final String TAG = "NightModeHelper";

    private NightModeHelper() {
    }

    @NotNull
    public final NightMode convertGeneralToMode(@NotNull General general) {
        Intrinsics.checkNotNullParameter(general, "general");
        NightMode nightMode = new NightMode();
        EnumData nightMode2 = general.getNightMode();
        Intrinsics.checkNotNull(nightMode2);
        nightMode.setNightMode(nightMode2.getValue());
        Time nightModeStartTime = general.getNightModeStartTime();
        Intrinsics.checkNotNull(nightModeStartTime);
        int hour = nightModeStartTime.getHour() * 60;
        Time nightModeStartTime2 = general.getNightModeStartTime();
        Intrinsics.checkNotNull(nightModeStartTime2);
        nightMode.setStartMinute(hour + nightModeStartTime2.getMinute());
        Time nightModeStopTime = general.getNightModeStopTime();
        Intrinsics.checkNotNull(nightModeStopTime);
        int hour2 = nightModeStopTime.getHour() * 60;
        Time nightModeStopTime2 = general.getNightModeStopTime();
        Intrinsics.checkNotNull(nightModeStopTime2);
        nightMode.setEndMinute(hour2 + nightModeStopTime2.getMinute());
        return nightMode;
    }

    @NotNull
    public final exo convertNightModeToProtos(@NotNull NightMode nightMode) {
        Intrinsics.checkNotNullParameter(nightMode, "nightMode");
        exo exoVar = new exo();
        int nightMode2 = nightMode.getNightMode();
        int i = 2;
        if (nightMode2 != 1) {
            i = nightMode2 != 2 ? 1 : 3;
        }
        exoVar.c = i;
        t64 t64Var = new t64();
        t64Var.c = nightMode.getStartMinute() / 60;
        t64Var.d = nightMode.getStartMinute() % 60;
        exoVar.d = t64Var;
        t64 t64Var2 = new t64();
        t64Var2.c = nightMode.getEndMinute() / 60;
        t64Var2.d = nightMode.getEndMinute() % 60;
        exoVar.e = t64Var2;
        return exoVar;
    }

    @Nullable
    public final NightMode convertProtosToNightMode(@Nullable exo mode) {
        int i;
        int i2;
        NightMode nightMode = new NightMode();
        Integer numValueOf = mode != null ? Integer.valueOf(mode.c) : null;
        int i3 = 1;
        if (numValueOf == null || numValueOf.intValue() != 2) {
            i3 = (numValueOf != null && numValueOf.intValue() == 1) ? 0 : 2;
        }
        nightMode.setNightMode(i3);
        if ((mode != null ? mode.d : null) != null) {
            t64 t64Var = mode.d;
            i = (t64Var.c * 60) + t64Var.d;
        } else {
            i = (mode == null || mode.c != 2) ? 1320 : 1170;
        }
        nightMode.setStartMinute(i);
        if ((mode != null ? mode.e : null) != null) {
            t64 t64Var2 = mode.e;
            i2 = (t64Var2.c * 60) + t64Var2.d;
        } else {
            i2 = (mode == null || mode.c != 2) ? 420 : 390;
        }
        nightMode.setEndMinute(i2);
        return nightMode;
    }

    @NotNull
    public final HMAutoBacklightInfo convertToAutoBackLightInfo(@NotNull NightMode nightMode) {
        Intrinsics.checkNotNullParameter(nightMode, "nightMode");
        HMAutoBacklightInfo hMAutoBacklightInfo = new HMAutoBacklightInfo();
        int nightMode2 = nightMode.getNightMode();
        int i = 2;
        if (nightMode2 != 1) {
            i = nightMode2 != 2 ? 0 : 1;
        }
        hMAutoBacklightInfo.setMode(i);
        hMAutoBacklightInfo.setStartHour(nightMode.getStartMinute() / 60);
        hMAutoBacklightInfo.setStartMinute(nightMode.getStartMinute() % 60);
        hMAutoBacklightInfo.setStopHour(nightMode.getEndMinute() / 60);
        hMAutoBacklightInfo.setStopMinute(nightMode.getEndMinute() % 60);
        return hMAutoBacklightInfo;
    }

    @NotNull
    public final NightMode convertToNightMode(@NotNull HMAutoBacklightInfo hmAutoBacklightInfo) {
        Intrinsics.checkNotNullParameter(hmAutoBacklightInfo, "hmAutoBacklightInfo");
        NightMode nightMode = new NightMode();
        int mode = hmAutoBacklightInfo.getMode();
        int i = 2;
        if (mode != 1) {
            i = mode != 2 ? 0 : 1;
        }
        nightMode.setNightMode(i);
        nightMode.setStartMinute((hmAutoBacklightInfo.getStartHour() * 60) + hmAutoBacklightInfo.getStartMinute());
        nightMode.setEndMinute((hmAutoBacklightInfo.getStopMinute() * 60) + hmAutoBacklightInfo.getStopMinute());
        return nightMode;
    }

    @NotNull
    public final NightMode formatNightMode(@NotNull NightMode nightMode) {
        Intrinsics.checkNotNullParameter(nightMode, "nightMode");
        if (nightMode.getStartMinute() > 1440) {
            nightMode.setStartMinute(nightMode.getStartMinute() % 1440);
        }
        if (nightMode.getEndMinute() > 1440) {
            nightMode.setEndMinute(nightMode.getEndMinute() % 1440);
        }
        return nightMode;
    }

    @NotNull
    public final NightMode getDefaultNightMode() {
        NightMode nightMode = new NightMode();
        nightMode.setNightMode(2);
        nightMode.setStartMinute(1320);
        nightMode.setEndMinute(420);
        return nightMode;
    }

    public final boolean needFormatNightMode(@NotNull NightMode nightMode) {
        Intrinsics.checkNotNullParameter(nightMode, "nightMode");
        return nightMode.getStartMinute() > 1440 || nightMode.getEndMinute() > 1440;
    }

    public final boolean nightModelChangeByDevice(@Nullable General general, @Nullable NightMode nightMode) {
        if (general == null) {
            return false;
        }
        if (nightMode != null) {
            EnumData nightMode2 = general.getNightMode();
            Intrinsics.checkNotNull(nightMode2);
            if (nightMode2.getValue() != nightMode.getNightMode()) {
                EnumData nightMode3 = general.getNightMode();
                Intrinsics.checkNotNull(nightMode3);
                Logger.i(TAG, "nightModel ChangeByDevice: " + nightMode3.getValue());
            } else {
                Time nightModeStartTime = general.getNightModeStartTime();
                Intrinsics.checkNotNull(nightModeStartTime);
                int hour = nightModeStartTime.getHour() * 60;
                Time nightModeStartTime2 = general.getNightModeStartTime();
                Intrinsics.checkNotNull(nightModeStartTime2);
                if (hour + nightModeStartTime2.getMinute() != nightMode.getStartMinute()) {
                    Logger.i(TAG, "startTime ChangeByDevice: " + general.getNightModeStartTime());
                } else {
                    Time nightModeStopTime = general.getNightModeStopTime();
                    Intrinsics.checkNotNull(nightModeStopTime);
                    int hour2 = nightModeStopTime.getHour() * 60;
                    Time nightModeStopTime2 = general.getNightModeStopTime();
                    Intrinsics.checkNotNull(nightModeStopTime2);
                    if (hour2 + nightModeStopTime2.getMinute() == nightMode.getEndMinute()) {
                        Logger.i(TAG, "nightModelChangeByDevice false");
                        return false;
                    }
                    Logger.i(TAG, "startTime ChangeByDevice: " + general.getNightModeStopTime());
                }
            }
        }
        return true;
    }
}
