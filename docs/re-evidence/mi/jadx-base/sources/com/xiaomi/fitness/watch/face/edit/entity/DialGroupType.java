package com.xiaomi.fitness.watch.face.edit.entity;

import com.xiaomi.wearable.hm.ChangeListenerImpl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0018\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/entity/DialGroupType;", "", "<init>", "()V", ChangeListenerImpl.SETTING_GROUP_TYPE_GENERAL, "", "ACTIVITY_STATISTICS", "STEP", "CALORIE", "STAND", "INTENSITY", "HEART_RATE", "OXYGEN_SATURATION", "PRESSURE", "BASE", "CARD_BAG", "WEATHER", "TOOLS", "WECHAT", "ALIPAY_PAYMENT_CODE", "SPORT_HEALTH", ChangeListenerImpl.SETTING_GROUP_TYPE_SPORT, "BLOOD_PRESSURE", "VITALITY_VALUE", "JS_APPLICATION", "LUA_APPLICATION", "TRAINING_STATUS", "SLEEP", "NONE", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DialGroupType {

    @NotNull
    public static final String ACTIVITY_STATISTICS = "activityStatistics";

    @NotNull
    public static final String ALIPAY_PAYMENT_CODE = "alipayPaymentCode";

    @NotNull
    public static final String BASE = "base";

    @NotNull
    public static final String BLOOD_PRESSURE = "bloodPressure";

    @NotNull
    public static final String CALORIE = "calorie";

    @NotNull
    public static final String CARD_BAG = "cardBag";

    @NotNull
    public static final String GENERAL = "general";

    @NotNull
    public static final String HEART_RATE = "heartRate";

    @NotNull
    public static final DialGroupType INSTANCE = new DialGroupType();

    @NotNull
    public static final String INTENSITY = "intensity";

    @NotNull
    public static final String JS_APPLICATION = "jsApplication";

    @NotNull
    public static final String LUA_APPLICATION = "luaApplication";

    @NotNull
    public static final String NONE = "none";

    @NotNull
    public static final String OXYGEN_SATURATION = "oxygenSaturation";

    @NotNull
    public static final String PRESSURE = "pressure";

    @NotNull
    public static final String SLEEP = "sleep";

    @NotNull
    public static final String SPORT = "sport";

    @NotNull
    public static final String SPORT_HEALTH = "sportHealth";

    @NotNull
    public static final String STAND = "stand";

    @NotNull
    public static final String STEP = "step";

    @NotNull
    public static final String TOOLS = "tools";

    @NotNull
    public static final String TRAINING_STATUS = "trainingStatus";

    @NotNull
    public static final String VITALITY_VALUE = "vitalityValue";

    @NotNull
    public static final String WEATHER = "weather";

    @NotNull
    public static final String WECHAT = "wechat";

    private DialGroupType() {
    }
}
