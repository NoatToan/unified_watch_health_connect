package com.xiaomi.fitness.watch.face.edit.entity;

import com.xiaomi.wearable.hm.ChangeListenerImpl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b$\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/entity/DialWidgetType;", "", "<init>", "()V", ChangeListenerImpl.SETTING_GROUP_TYPE_SPORT, "", "ACTIVITY_INDEX", "STEP", "CALORIE", "STAND", "INTENSITY", "HEART_RATE", "OXYGEN", "PRESSURE", "ENERGY", "BATTERY_LEVEL", "DATE", "CARD_BAG", "WEATHER_CONDITION", DialWidgetType.UVI, DialWidgetType.AQI, "HUMIDITY", "WIND_LEVEL", "ALARM", "STOP_WATCH", "COUNT_DOWN", "COMPASS", "PHOTO_GRAPH", "MUSIC_CONTROLLER", "WECHAT_PAYMENT", "ALIPAY_PAYMENT_CODE", "BLOOD_PRESSURE", "VITALITY_VALUE", "JS_APPLICATION", "LUA_APPLICATION", "TRAINING_STATUS", "SLEEP", "CURRENT_TEMPERATURE", "PRECIPITATION_PROBABILITY", DialWidgetType.ECG, "NONE", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DialWidgetType {

    @NotNull
    public static final String ACTIVITY_INDEX = "activityIndex";

    @NotNull
    public static final String ALARM = "alarm";

    @NotNull
    public static final String ALIPAY_PAYMENT_CODE = "alipayPaymentCode";

    @NotNull
    public static final String AQI = "AQI";

    @NotNull
    public static final String BATTERY_LEVEL = "batteryLevel";

    @NotNull
    public static final String BLOOD_PRESSURE = "bloodPressure";

    @NotNull
    public static final String CALORIE = "calorie";

    @NotNull
    public static final String CARD_BAG = "card_bag";

    @NotNull
    public static final String COMPASS = "compass";

    @NotNull
    public static final String COUNT_DOWN = "countdown";

    @NotNull
    public static final String CURRENT_TEMPERATURE = "currentTemperature";

    @NotNull
    public static final String DATE = "date";

    @NotNull
    public static final String ECG = "ECG";

    @NotNull
    public static final String ENERGY = "energy";

    @NotNull
    public static final String HEART_RATE = "heartRate";

    @NotNull
    public static final String HUMIDITY = "humidity";

    @NotNull
    public static final DialWidgetType INSTANCE = new DialWidgetType();

    @NotNull
    public static final String INTENSITY = "intensity";

    @NotNull
    public static final String JS_APPLICATION = "jsApplication";

    @NotNull
    public static final String LUA_APPLICATION = "luaApplication";

    @NotNull
    public static final String MUSIC_CONTROLLER = "musicController";

    @NotNull
    public static final String NONE = "none";

    @NotNull
    public static final String OXYGEN = "oxygen";

    @NotNull
    public static final String PHOTO_GRAPH = "photograph";

    @NotNull
    public static final String PRECIPITATION_PROBABILITY = "precipitationProbability";

    @NotNull
    public static final String PRESSURE = "pressure";

    @NotNull
    public static final String SLEEP = "sleep";

    @NotNull
    public static final String SPORT = "sport";

    @NotNull
    public static final String STAND = "stand";

    @NotNull
    public static final String STEP = "step";

    @NotNull
    public static final String STOP_WATCH = "stopwatch";

    @NotNull
    public static final String TRAINING_STATUS = "trainingStatus";

    @NotNull
    public static final String UVI = "UVI";

    @NotNull
    public static final String VITALITY_VALUE = "vitalityValue";

    @NotNull
    public static final String WEATHER_CONDITION = "weatherCondition";

    @NotNull
    public static final String WECHAT_PAYMENT = "wechatPayment";

    @NotNull
    public static final String WIND_LEVEL = "windLevel";

    private DialWidgetType() {
    }
}
