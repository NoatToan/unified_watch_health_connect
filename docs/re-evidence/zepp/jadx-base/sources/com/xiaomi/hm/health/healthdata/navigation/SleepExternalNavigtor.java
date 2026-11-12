package com.xiaomi.hm.health.healthdata.navigation;

import android.content.Intent;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;
import com.huami.sleep.statistic.dto.TimeMode;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import com.huami.sleepassistant.lib.ui.base.Navigator;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.HMIntentHandler;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.device.event.StatEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u001a\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\u001b\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000bJ\u0006\u0010\u0011\u001a\u00020\u0004J\u0006\u0010\u0012\u001a\u00020\u0004R\u001c\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0019\u001a\u00020\u000b8\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001c\u0010\u001c\u001a\u00020\u000b8\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u001c\u0010\u001f\u001a\u00020\u000b8\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u0015R\u001c\u0010\"\u001a\u00020\u000b8\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/navigation/SleepExternalNavigtor;", "", "Lcom/huami/sleep/statistic/dto/TimeMode;", SleepAnalysisFragment.TIME_MODE, "", "a", "jumpSleepDay", "jumpSleepWeek", "jumpSleepMonth", "jumpSleepYear", "", "", "arrayOf", "jumpToneDetails", "([Ljava/lang/String;)V", "type", "jumpToneList", "jumpPranayamaIntroduction", "jumpPranayamaDetails", "Ljava/lang/String;", "getSLEEP_KEY_1", "()Ljava/lang/String;", "SLEEP_KEY_1", "b", "getTAG_NAOP_LATEST", "TAG_NAOP_LATEST", "c", "getTAG_NAP_DAY", "TAG_NAP_DAY", GoogleApiAvailabilityLight.a, "getLIST_TYPE", "LIST_TYPE", "e", "getFAVORITE_TYPE", "FAVORITE_TYPE", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SleepExternalNavigtor {

    @NotNull
    public static final SleepExternalNavigtor INSTANCE = new SleepExternalNavigtor();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String SLEEP_KEY_1 = SleepHomeActivity.SLEEP_KEY_1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String TAG_NAOP_LATEST = HMIntentHandler.NAP_TYPE_LATEST;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String TAG_NAP_DAY = "day";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String LIST_TYPE = "list";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final String FAVORITE_TYPE = StatEvent.MINE_KINGKONG_C_FAVORITE_VALUE;

    private SleepExternalNavigtor() {
    }

    private final void a(TimeMode timeMode) {
        Intent intent = new Intent(BraceletApp.getContext(), (Class<?>) SleepHomeActivity.class);
        intent.putExtra(SLEEP_KEY_1, timeMode);
        intent.putExtra(SleepHomeActivity.SOURCE_FROM, 4);
        intent.setFlags(268435456);
        BraceletApp.getContext().startActivity(intent);
    }

    @NotNull
    public final String getFAVORITE_TYPE() {
        return FAVORITE_TYPE;
    }

    @NotNull
    public final String getLIST_TYPE() {
        return LIST_TYPE;
    }

    @NotNull
    public final String getSLEEP_KEY_1() {
        return SLEEP_KEY_1;
    }

    @NotNull
    public final String getTAG_NAOP_LATEST() {
        return TAG_NAOP_LATEST;
    }

    @NotNull
    public final String getTAG_NAP_DAY() {
        return TAG_NAP_DAY;
    }

    public final void jumpPranayamaDetails() {
        if (Language.isSimplifiedChinese()) {
            Navigator.INSTANCE.startTrainingBegins(BraceletApp.getContext());
        }
    }

    public final void jumpPranayamaIntroduction() {
        if (Language.isSimplifiedChinese()) {
            Navigator.INSTANCE.startBreatheTraining(BraceletApp.getContext());
        }
    }

    public final void jumpSleepDay() {
        a(TimeMode.DAY);
    }

    public final void jumpSleepMonth() {
        a(TimeMode.MONTH);
    }

    public final void jumpSleepWeek() {
        a(TimeMode.WEEK);
    }

    public final void jumpSleepYear() {
        a(TimeMode.YEAR);
    }

    public final void jumpToneDetails(@NotNull String[] arrayOf) {
    }

    public final void jumpToneList(@NotNull String type) {
    }
}
