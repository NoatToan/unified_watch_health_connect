package com.xiaomi.hm.health.smalltool.model;

import com.huami.watch.companion.ui.activity.FindWatchActivity;
import com.huami.watch.companion.ximalaya.XimaCategoryActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b*\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b*\u0010+R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0016\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0016\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0016\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0016\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0016\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0016\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0016\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0016\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0004R\u0016\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004R\u0016\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0004R\u0016\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0004R\u0016\u0010\u001f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0004R\u0016\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0004R\u0016\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0004R\u0016\u0010\"\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0004R\u0016\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0004R\u0016\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0004R\u0016\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0004R\u0016\u0010&\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0004R\u0016\u0010'\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0004R\u0016\u0010(\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0004R\u0016\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0004¨\u0006,"}, d2 = {"Lcom/xiaomi/hm/health/smalltool/model/ToolKey;", "", "", "TREADMILL", "Ljava/lang/String;", "SPORT_RUN", "SPORT_WALK", "SPORT_BIKE", "TRAINING_FITNESS", "ASSISTANT", "NFC_WALLET", "ALARM", "REMINDER", "TARGET_TRACK", "SCALE_BABY", "LOSE_WEIGHT_PLAN", "SCALE_BALANCE", FindWatchActivity.MAIN_MODULE_TOOL_KEY_NAME, "WATCHFACE_SETTING", "TRAINING_BREATHE", "STRESS_TRAINING_BREATH", "CALL_ALERT", "APP_ALERT", "CUSTOM_VIBRATE", "SPORT_HELP", "WIDGET_MANAGER", "UNLOCK_SCRENN", "FRIENT", "TARGET_SETTING", XimaCategoryActivity.MAIN_MODULE_TOOL_KEY_NAME, "SNORE_MONITOR", ToolKey.ZENBUDS, "FEMALE_HEALTH", "GUEST_MODE", "WORLD_CLOCK", "BAND_APPS_SETTING", "SHORTCUTS_SETTING", "TODO_LIST", "OFFLINE_VOICE_COMD", "EDIT_CARD", "EXERCISE_PLAN", "ATTEND_COURSE", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ToolKey {

    @NotNull
    public static final String ALARM = "NZ";

    @NotNull
    public static final String APP_ALERT = "TZTX";

    @NotNull
    public static final String ASSISTANT = "ZNZL";

    @NotNull
    public static final String ATTEND_COURSE = "CYKC";

    @NotNull
    public static final String BAND_APPS_SETTING = "SHYYSZ";

    @NotNull
    public static final String CALL_ALERT = "LDTX";

    @NotNull
    public static final String CUSTOM_VIBRATE = "ZDMS";

    @NotNull
    public static final String EDIT_CARD = "BJKP";

    @NotNull
    public static final String EXERCISE_PLAN = "XLJH";

    @NotNull
    public static final String FEMALE_HEALTH = "NXJK";

    @NotNull
    public static final String FIND_DEVICE = "CZSB";

    @NotNull
    public static final String FRIENT = "QY";

    @NotNull
    public static final String GUEST_MODE = "FKMS";

    @NotNull
    public static final ToolKey INSTANCE = new ToolKey();

    @NotNull
    public static final String LOSE_WEIGHT_PLAN = "SSJH";

    @NotNull
    public static final String NFC_WALLET = "NFCKB";

    @NotNull
    public static final String OFFLINE_VOICE_COMD = "LXYY";

    @NotNull
    public static final String REMINDER = "SJTX";

    @NotNull
    public static final String SCALE_BABY = "BYCZ";

    @NotNull
    public static final String SCALE_BALANCE = "DJPH";

    @NotNull
    public static final String SHORTCUTS_SETTING = "KJRKSZ";

    @NotNull
    public static final String SNORE_MONITOR = "HSJC";

    @NotNull
    public static final String SPORT_BIKE = "QX";

    @NotNull
    public static final String SPORT_HELP = "YDFZ";

    @NotNull
    public static final String SPORT_RUN = "PB";

    @NotNull
    public static final String SPORT_WALK = "JZ";

    @NotNull
    public static final String STRESS_TRAINING_BREATH = "JYTX";

    @NotNull
    public static final String TARGET_SETTING = "MBSZ";

    @NotNull
    public static final String TARGET_TRACK = "DBZZ";

    @NotNull
    public static final String TODO_LIST = "DBSX";

    @NotNull
    public static final String TRAINING_BREATHE = "HXXL";

    @NotNull
    public static final String TRAINING_FITNESS = "JS";

    @NotNull
    public static final String TREADMILL = "PBJ";

    @NotNull
    public static final String UNLOCK_SCRENN = "PMJX";

    @NotNull
    public static final String WATCHFACE_SETTING = "BPSZ";

    @NotNull
    public static final String WIDGET_MANAGER = "XBJGL";

    @NotNull
    public static final String WORLD_CLOCK = "SJSZ";

    @NotNull
    public static final String XIMALAYA = "XMLY";

    @NotNull
    public static final String ZENBUDS = "ZENBUDS";

    private ToolKey() {
    }
}
