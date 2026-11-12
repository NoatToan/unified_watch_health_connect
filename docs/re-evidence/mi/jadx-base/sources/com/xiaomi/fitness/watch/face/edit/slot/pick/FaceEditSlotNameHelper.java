package com.xiaomi.fitness.watch.face.edit.slot.pick;

import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.watch.face.edit.entity.WidgetGroupData;
import com.xiaomi.fitness.watch.face.edit.entity.WidgetTypeData;
import defpackage.p1j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/slot/pick/FaceEditSlotNameHelper;", "", "<init>", "()V", "getSlotName", "", "widgetName", "", "getGroupName", CardInfo.KEY_CARD_GROUP_NAME, "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceEditSlotNameHelper {

    @NotNull
    public static final FaceEditSlotNameHelper INSTANCE = new FaceEditSlotNameHelper();

    private FaceEditSlotNameHelper() {
    }

    public final int getGroupName(@NotNull String groupName) {
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        WidgetGroupData widgetGroupData = WidgetGroupData.GENERAL;
        if (Intrinsics.areEqual(groupName, widgetGroupData.getKey()) || Intrinsics.areEqual(groupName, widgetGroupData.getGroupName())) {
            return widgetGroupData.getStringRes();
        }
        WidgetGroupData widgetGroupData2 = WidgetGroupData.ACTIVITY_STATISTICS;
        if (Intrinsics.areEqual(groupName, widgetGroupData2.getKey()) || Intrinsics.areEqual(groupName, widgetGroupData2.getGroupName())) {
            return widgetGroupData2.getStringRes();
        }
        WidgetGroupData widgetGroupData3 = WidgetGroupData.STEP;
        if (Intrinsics.areEqual(groupName, widgetGroupData3.getKey()) || Intrinsics.areEqual(groupName, widgetGroupData3.getGroupName())) {
            return widgetGroupData3.getStringRes();
        }
        WidgetGroupData widgetGroupData4 = WidgetGroupData.CALORIE;
        if (Intrinsics.areEqual(groupName, widgetGroupData4.getKey()) || Intrinsics.areEqual(groupName, widgetGroupData4.getGroupName())) {
            return widgetGroupData4.getStringRes();
        }
        WidgetGroupData widgetGroupData5 = WidgetGroupData.STAND;
        if (Intrinsics.areEqual(groupName, widgetGroupData5.getKey()) || Intrinsics.areEqual(groupName, widgetGroupData5.getGroupName())) {
            return widgetGroupData5.getStringRes();
        }
        WidgetGroupData widgetGroupData6 = WidgetGroupData.INTENSITY;
        if (Intrinsics.areEqual(groupName, widgetGroupData6.getKey()) || Intrinsics.areEqual(groupName, widgetGroupData6.getGroupName())) {
            return widgetGroupData6.getStringRes();
        }
        WidgetGroupData widgetGroupData7 = WidgetGroupData.HEART_RATE;
        if (Intrinsics.areEqual(groupName, widgetGroupData7.getKey()) || Intrinsics.areEqual(groupName, widgetGroupData7.getGroupName())) {
            return widgetGroupData7.getStringRes();
        }
        WidgetGroupData widgetGroupData8 = WidgetGroupData.OXYGEN_SATURATION;
        if (Intrinsics.areEqual(groupName, widgetGroupData8.getKey()) || Intrinsics.areEqual(groupName, widgetGroupData8.getGroupName())) {
            return widgetGroupData8.getStringRes();
        }
        WidgetGroupData widgetGroupData9 = WidgetGroupData.PRESSURE;
        if (Intrinsics.areEqual(groupName, widgetGroupData9.getKey()) || Intrinsics.areEqual(groupName, widgetGroupData9.getGroupName())) {
            return widgetGroupData9.getStringRes();
        }
        WidgetGroupData widgetGroupData10 = WidgetGroupData.BASE;
        if (Intrinsics.areEqual(groupName, widgetGroupData10.getKey()) || Intrinsics.areEqual(groupName, widgetGroupData10.getGroupName())) {
            return widgetGroupData10.getStringRes();
        }
        WidgetGroupData widgetGroupData11 = WidgetGroupData.CARD_BAG;
        if (Intrinsics.areEqual(groupName, widgetGroupData11.getKey()) || Intrinsics.areEqual(groupName, widgetGroupData11.getGroupName())) {
            return widgetGroupData11.getStringRes();
        }
        WidgetGroupData widgetGroupData12 = WidgetGroupData.WEATHER;
        if (Intrinsics.areEqual(groupName, widgetGroupData12.getKey()) || Intrinsics.areEqual(groupName, widgetGroupData12.getGroupName())) {
            return widgetGroupData12.getStringRes();
        }
        WidgetGroupData widgetGroupData13 = WidgetGroupData.TOOLS;
        if (Intrinsics.areEqual(groupName, widgetGroupData13.getKey()) || Intrinsics.areEqual(groupName, widgetGroupData13.getGroupName())) {
            return widgetGroupData13.getStringRes();
        }
        WidgetGroupData widgetGroupData14 = WidgetGroupData.WECHAT;
        if (Intrinsics.areEqual(groupName, widgetGroupData14.getKey()) || Intrinsics.areEqual(groupName, widgetGroupData14.getGroupName())) {
            return widgetGroupData14.getStringRes();
        }
        WidgetGroupData widgetGroupData15 = WidgetGroupData.ALIPAY_PAYMENT_CODE;
        if (Intrinsics.areEqual(groupName, widgetGroupData15.getKey()) || Intrinsics.areEqual(groupName, widgetGroupData15.getGroupName())) {
            return widgetGroupData15.getStringRes();
        }
        WidgetGroupData widgetGroupData16 = WidgetGroupData.SPORT;
        if (Intrinsics.areEqual(groupName, widgetGroupData16.getKey()) || Intrinsics.areEqual(groupName, widgetGroupData16.getGroupName())) {
            return widgetGroupData16.getStringRes();
        }
        WidgetGroupData widgetGroupData17 = WidgetGroupData.BLOOD_PRESSURE;
        if (Intrinsics.areEqual(groupName, widgetGroupData17.getKey()) || Intrinsics.areEqual(groupName, widgetGroupData17.getGroupName())) {
            return widgetGroupData17.getStringRes();
        }
        WidgetGroupData widgetGroupData18 = WidgetGroupData.VITALITY_VALUE;
        if (Intrinsics.areEqual(groupName, widgetGroupData18.getKey()) || Intrinsics.areEqual(groupName, widgetGroupData18.getGroupName())) {
            return widgetGroupData18.getStringRes();
        }
        WidgetGroupData widgetGroupData19 = WidgetGroupData.JS_APPLICATION;
        if (Intrinsics.areEqual(groupName, widgetGroupData19.getKey()) || Intrinsics.areEqual(groupName, widgetGroupData19.getGroupName())) {
            return widgetGroupData19.getStringRes();
        }
        WidgetGroupData widgetGroupData20 = WidgetGroupData.LUA_APPLICATION;
        if (Intrinsics.areEqual(groupName, widgetGroupData20.getKey()) || Intrinsics.areEqual(groupName, widgetGroupData20.getGroupName())) {
            return widgetGroupData20.getStringRes();
        }
        WidgetGroupData widgetGroupData21 = WidgetGroupData.TRAINING_STATUS;
        if (Intrinsics.areEqual(groupName, widgetGroupData21.getKey()) || Intrinsics.areEqual(groupName, widgetGroupData21.getGroupName())) {
            return widgetGroupData21.getStringRes();
        }
        WidgetGroupData widgetGroupData22 = WidgetGroupData.SLEEP;
        return (Intrinsics.areEqual(groupName, widgetGroupData22.getKey()) || Intrinsics.areEqual(groupName, widgetGroupData22.getGroupName())) ? widgetGroupData22.getStringRes() : p1j.q1;
    }

    public final int getSlotName(@NotNull String widgetName) {
        Intrinsics.checkNotNullParameter(widgetName, "widgetName");
        WidgetTypeData widgetTypeData = WidgetTypeData.SPORT;
        if (Intrinsics.areEqual(widgetName, widgetTypeData.getKey()) || Intrinsics.areEqual(widgetName, widgetTypeData.getWidgetName())) {
            return widgetTypeData.getStringRes();
        }
        WidgetTypeData widgetTypeData2 = WidgetTypeData.ACTIVITY_INDEX;
        if (Intrinsics.areEqual(widgetName, widgetTypeData2.getKey()) || Intrinsics.areEqual(widgetName, widgetTypeData2.getWidgetName())) {
            return widgetTypeData2.getStringRes();
        }
        WidgetTypeData widgetTypeData3 = WidgetTypeData.STEP;
        if (Intrinsics.areEqual(widgetName, widgetTypeData3.getKey()) || Intrinsics.areEqual(widgetName, widgetTypeData3.getWidgetName())) {
            return widgetTypeData3.getStringRes();
        }
        WidgetTypeData widgetTypeData4 = WidgetTypeData.CALORIE;
        if (Intrinsics.areEqual(widgetName, widgetTypeData4.getKey()) || Intrinsics.areEqual(widgetName, widgetTypeData4.getWidgetName())) {
            return widgetTypeData4.getStringRes();
        }
        WidgetTypeData widgetTypeData5 = WidgetTypeData.STAND;
        if (Intrinsics.areEqual(widgetName, widgetTypeData5.getKey()) || Intrinsics.areEqual(widgetName, widgetTypeData5.getWidgetName())) {
            return widgetTypeData5.getStringRes();
        }
        WidgetTypeData widgetTypeData6 = WidgetTypeData.INTENSITY;
        if (Intrinsics.areEqual(widgetName, widgetTypeData6.getKey()) || Intrinsics.areEqual(widgetName, widgetTypeData6.getWidgetName())) {
            return widgetTypeData6.getStringRes();
        }
        WidgetTypeData widgetTypeData7 = WidgetTypeData.HEART_RATE;
        if (Intrinsics.areEqual(widgetName, widgetTypeData7.getKey()) || Intrinsics.areEqual(widgetName, widgetTypeData7.getWidgetName())) {
            return widgetTypeData7.getStringRes();
        }
        WidgetTypeData widgetTypeData8 = WidgetTypeData.OXYGEN;
        if (Intrinsics.areEqual(widgetName, widgetTypeData8.getKey()) || Intrinsics.areEqual(widgetName, widgetTypeData8.getWidgetName())) {
            return widgetTypeData8.getStringRes();
        }
        WidgetTypeData widgetTypeData9 = WidgetTypeData.PRESSURE;
        if (Intrinsics.areEqual(widgetName, widgetTypeData9.getKey()) || Intrinsics.areEqual(widgetName, widgetTypeData9.getWidgetName())) {
            return widgetTypeData9.getStringRes();
        }
        WidgetTypeData widgetTypeData10 = WidgetTypeData.ENERGY;
        if (Intrinsics.areEqual(widgetName, widgetTypeData10.getKey()) || Intrinsics.areEqual(widgetName, widgetTypeData10.getWidgetName())) {
            return widgetTypeData10.getStringRes();
        }
        WidgetTypeData widgetTypeData11 = WidgetTypeData.BATTERY_LEVEL;
        if (Intrinsics.areEqual(widgetName, widgetTypeData11.getKey()) || Intrinsics.areEqual(widgetName, widgetTypeData11.getWidgetName())) {
            return widgetTypeData11.getStringRes();
        }
        WidgetTypeData widgetTypeData12 = WidgetTypeData.DATE;
        if (Intrinsics.areEqual(widgetName, widgetTypeData12.getKey()) || Intrinsics.areEqual(widgetName, widgetTypeData12.getWidgetName())) {
            return widgetTypeData12.getStringRes();
        }
        WidgetTypeData widgetTypeData13 = WidgetTypeData.CARD_BAG;
        if (Intrinsics.areEqual(widgetName, widgetTypeData13.getKey()) || Intrinsics.areEqual(widgetName, widgetTypeData13.getWidgetName())) {
            return widgetTypeData13.getStringRes();
        }
        WidgetTypeData widgetTypeData14 = WidgetTypeData.WEATHER_CONDITION;
        if (Intrinsics.areEqual(widgetName, widgetTypeData14.getKey()) || Intrinsics.areEqual(widgetName, widgetTypeData14.getWidgetName())) {
            return widgetTypeData14.getStringRes();
        }
        WidgetTypeData widgetTypeData15 = WidgetTypeData.UVI;
        if (Intrinsics.areEqual(widgetName, widgetTypeData15.getKey()) || Intrinsics.areEqual(widgetName, widgetTypeData15.getWidgetName())) {
            return widgetTypeData15.getStringRes();
        }
        WidgetTypeData widgetTypeData16 = WidgetTypeData.AQI;
        if (Intrinsics.areEqual(widgetName, widgetTypeData16.getKey()) || Intrinsics.areEqual(widgetName, widgetTypeData16.getWidgetName())) {
            return widgetTypeData16.getStringRes();
        }
        WidgetTypeData widgetTypeData17 = WidgetTypeData.HUMIDITY;
        if (Intrinsics.areEqual(widgetName, widgetTypeData17.getKey()) || Intrinsics.areEqual(widgetName, widgetTypeData17.getWidgetName())) {
            return widgetTypeData17.getStringRes();
        }
        WidgetTypeData widgetTypeData18 = WidgetTypeData.WIND_LEVEL;
        if (Intrinsics.areEqual(widgetName, widgetTypeData18.getKey()) || Intrinsics.areEqual(widgetName, widgetTypeData18.getWidgetName())) {
            return widgetTypeData18.getStringRes();
        }
        WidgetTypeData widgetTypeData19 = WidgetTypeData.ALARM;
        if (Intrinsics.areEqual(widgetName, widgetTypeData19.getKey()) || Intrinsics.areEqual(widgetName, widgetTypeData19.getWidgetName())) {
            return widgetTypeData19.getStringRes();
        }
        WidgetTypeData widgetTypeData20 = WidgetTypeData.STOP_WATCH;
        if (Intrinsics.areEqual(widgetName, widgetTypeData20.getKey()) || Intrinsics.areEqual(widgetName, widgetTypeData20.getWidgetName())) {
            return widgetTypeData20.getStringRes();
        }
        WidgetTypeData widgetTypeData21 = WidgetTypeData.COUNT_DOWN;
        if (Intrinsics.areEqual(widgetName, widgetTypeData21.getKey()) || Intrinsics.areEqual(widgetName, widgetTypeData21.getWidgetName())) {
            return widgetTypeData21.getStringRes();
        }
        WidgetTypeData widgetTypeData22 = WidgetTypeData.COMPASS;
        if (Intrinsics.areEqual(widgetName, widgetTypeData22.getKey()) || Intrinsics.areEqual(widgetName, widgetTypeData22.getWidgetName())) {
            return widgetTypeData22.getStringRes();
        }
        WidgetTypeData widgetTypeData23 = WidgetTypeData.PHOTO_GRAPH;
        if (Intrinsics.areEqual(widgetName, widgetTypeData23.getKey()) || Intrinsics.areEqual(widgetName, widgetTypeData23.getWidgetName())) {
            return widgetTypeData23.getStringRes();
        }
        WidgetTypeData widgetTypeData24 = WidgetTypeData.MUSIC_CONTROLLER;
        if (Intrinsics.areEqual(widgetName, widgetTypeData24.getKey()) || Intrinsics.areEqual(widgetName, widgetTypeData24.getWidgetName())) {
            return widgetTypeData24.getStringRes();
        }
        WidgetTypeData widgetTypeData25 = WidgetTypeData.WECHAT_PAYMENT;
        if (Intrinsics.areEqual(widgetName, widgetTypeData25.getKey()) || Intrinsics.areEqual(widgetName, widgetTypeData25.getWidgetName())) {
            return widgetTypeData25.getStringRes();
        }
        WidgetTypeData widgetTypeData26 = WidgetTypeData.ALIPAY_PAYMENT_CODE;
        if (Intrinsics.areEqual(widgetName, widgetTypeData26.getKey()) || Intrinsics.areEqual(widgetName, widgetTypeData26.getWidgetName())) {
            return widgetTypeData26.getStringRes();
        }
        WidgetTypeData widgetTypeData27 = WidgetTypeData.BLOOD_PRESSURE;
        if (Intrinsics.areEqual(widgetName, widgetTypeData27.getKey()) || Intrinsics.areEqual(widgetName, widgetTypeData27.getWidgetName())) {
            return widgetTypeData27.getStringRes();
        }
        WidgetTypeData widgetTypeData28 = WidgetTypeData.VITALITY_VALUE;
        if (Intrinsics.areEqual(widgetName, widgetTypeData28.getKey()) || Intrinsics.areEqual(widgetName, widgetTypeData28.getWidgetName())) {
            return widgetTypeData28.getStringRes();
        }
        WidgetTypeData widgetTypeData29 = WidgetTypeData.JS_APPLICATION;
        if (Intrinsics.areEqual(widgetName, widgetTypeData29.getKey()) || Intrinsics.areEqual(widgetName, widgetTypeData29.getWidgetName())) {
            return widgetTypeData29.getStringRes();
        }
        WidgetTypeData widgetTypeData30 = WidgetTypeData.LUA_APPLICATION;
        if (Intrinsics.areEqual(widgetName, widgetTypeData30.getKey()) || Intrinsics.areEqual(widgetName, widgetTypeData30.getWidgetName())) {
            return widgetTypeData30.getStringRes();
        }
        WidgetTypeData widgetTypeData31 = WidgetTypeData.TRAINING_STATUS;
        if (Intrinsics.areEqual(widgetName, widgetTypeData31.getKey()) || Intrinsics.areEqual(widgetName, widgetTypeData31.getWidgetName())) {
            return widgetTypeData31.getStringRes();
        }
        WidgetTypeData widgetTypeData32 = WidgetTypeData.SLEEP;
        if (Intrinsics.areEqual(widgetName, widgetTypeData32.getKey()) || Intrinsics.areEqual(widgetName, widgetTypeData32.getWidgetName())) {
            return widgetTypeData32.getStringRes();
        }
        WidgetTypeData widgetTypeData33 = WidgetTypeData.ECG;
        if (Intrinsics.areEqual(widgetName, widgetTypeData33.getKey()) || Intrinsics.areEqual(widgetName, widgetTypeData33.getWidgetName())) {
            return widgetTypeData33.getStringRes();
        }
        WidgetTypeData widgetTypeData34 = WidgetTypeData.CURRENT_TEMPERATURE;
        if (Intrinsics.areEqual(widgetName, widgetTypeData34.getKey()) || Intrinsics.areEqual(widgetName, widgetTypeData34.getWidgetName())) {
            return widgetTypeData34.getStringRes();
        }
        WidgetTypeData widgetTypeData35 = WidgetTypeData.PRECIPITATION_PROBABILITY;
        if (Intrinsics.areEqual(widgetName, widgetTypeData35.getKey()) || Intrinsics.areEqual(widgetName, widgetTypeData35.getWidgetName())) {
            return widgetTypeData35.getStringRes();
        }
        WidgetTypeData widgetTypeData36 = WidgetTypeData.RUN_OUTDOOR;
        if (Intrinsics.areEqual(widgetName, widgetTypeData36.getWidgetName())) {
            return widgetTypeData36.getStringRes();
        }
        WidgetTypeData widgetTypeData37 = WidgetTypeData.WALK_OUTDOOR;
        if (Intrinsics.areEqual(widgetName, widgetTypeData37.getWidgetName())) {
            return widgetTypeData37.getStringRes();
        }
        WidgetTypeData widgetTypeData38 = WidgetTypeData.RUN_INDOOR;
        if (Intrinsics.areEqual(widgetName, widgetTypeData38.getWidgetName())) {
            return widgetTypeData38.getStringRes();
        }
        WidgetTypeData widgetTypeData39 = WidgetTypeData.MOUNTAIN_CLIMB;
        if (Intrinsics.areEqual(widgetName, widgetTypeData39.getWidgetName())) {
            return widgetTypeData39.getStringRes();
        }
        WidgetTypeData widgetTypeData40 = WidgetTypeData.CROSS_COUNTRY;
        if (Intrinsics.areEqual(widgetName, widgetTypeData40.getWidgetName())) {
            return widgetTypeData40.getStringRes();
        }
        WidgetTypeData widgetTypeData41 = WidgetTypeData.CYCLING_OUTDOOR;
        if (Intrinsics.areEqual(widgetName, widgetTypeData41.getWidgetName())) {
            return widgetTypeData41.getStringRes();
        }
        WidgetTypeData widgetTypeData42 = WidgetTypeData.CYCLING_INDOOR;
        if (Intrinsics.areEqual(widgetName, widgetTypeData42.getWidgetName())) {
            return widgetTypeData42.getStringRes();
        }
        WidgetTypeData widgetTypeData43 = WidgetTypeData.FREE_TRAINING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData43.getWidgetName())) {
            return widgetTypeData43.getStringRes();
        }
        WidgetTypeData widgetTypeData44 = WidgetTypeData.SWIM_INDOOR;
        if (Intrinsics.areEqual(widgetName, widgetTypeData44.getWidgetName())) {
            return widgetTypeData44.getStringRes();
        }
        WidgetTypeData widgetTypeData45 = WidgetTypeData.SWIM_OUTDOOR;
        if (Intrinsics.areEqual(widgetName, widgetTypeData45.getWidgetName())) {
            return widgetTypeData45.getStringRes();
        }
        WidgetTypeData widgetTypeData46 = WidgetTypeData.ELLIPTICAL_MACHINE;
        if (Intrinsics.areEqual(widgetName, widgetTypeData46.getWidgetName())) {
            return widgetTypeData46.getStringRes();
        }
        WidgetTypeData widgetTypeData47 = WidgetTypeData.YOGA;
        if (Intrinsics.areEqual(widgetName, widgetTypeData47.getWidgetName())) {
            return widgetTypeData47.getStringRes();
        }
        WidgetTypeData widgetTypeData48 = WidgetTypeData.ROWING_MACHINE;
        if (Intrinsics.areEqual(widgetName, widgetTypeData48.getWidgetName())) {
            return widgetTypeData48.getStringRes();
        }
        WidgetTypeData widgetTypeData49 = WidgetTypeData.ROPE_SKIPPING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData49.getWidgetName())) {
            return widgetTypeData49.getStringRes();
        }
        WidgetTypeData widgetTypeData50 = WidgetTypeData.ON_FOOT;
        if (Intrinsics.areEqual(widgetName, widgetTypeData50.getWidgetName())) {
            return widgetTypeData50.getStringRes();
        }
        WidgetTypeData widgetTypeData51 = WidgetTypeData.HIGH_INTENSITY_GAP_TRAINING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData51.getWidgetName())) {
            return widgetTypeData51.getStringRes();
        }
        WidgetTypeData widgetTypeData52 = WidgetTypeData.TRIATHLON;
        if (Intrinsics.areEqual(widgetName, widgetTypeData52.getWidgetName())) {
            return widgetTypeData52.getStringRes();
        }
        WidgetTypeData widgetTypeData53 = WidgetTypeData.SAILBOAT;
        if (Intrinsics.areEqual(widgetName, widgetTypeData53.getWidgetName())) {
            return widgetTypeData53.getStringRes();
        }
        WidgetTypeData widgetTypeData54 = WidgetTypeData.PADDLE_BOARD;
        if (Intrinsics.areEqual(widgetName, widgetTypeData54.getWidgetName())) {
            return widgetTypeData54.getStringRes();
        }
        WidgetTypeData widgetTypeData55 = WidgetTypeData.WATER_POLO;
        if (Intrinsics.areEqual(widgetName, widgetTypeData55.getWidgetName())) {
            return widgetTypeData55.getStringRes();
        }
        WidgetTypeData widgetTypeData56 = WidgetTypeData.AQUATIC_SPORT;
        if (Intrinsics.areEqual(widgetName, widgetTypeData56.getWidgetName())) {
            return widgetTypeData56.getStringRes();
        }
        WidgetTypeData widgetTypeData57 = WidgetTypeData.SURFING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData57.getWidgetName())) {
            return widgetTypeData57.getStringRes();
        }
        WidgetTypeData widgetTypeData58 = WidgetTypeData.CANOEING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData58.getWidgetName())) {
            return widgetTypeData58.getStringRes();
        }
        WidgetTypeData widgetTypeData59 = WidgetTypeData.KAYAK_RAFTING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData59.getWidgetName())) {
            return widgetTypeData59.getStringRes();
        }
        WidgetTypeData widgetTypeData60 = WidgetTypeData.ROWING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData60.getWidgetName())) {
            return widgetTypeData60.getStringRes();
        }
        WidgetTypeData widgetTypeData61 = WidgetTypeData.MOTORBOAT;
        if (Intrinsics.areEqual(widgetName, widgetTypeData61.getWidgetName())) {
            return widgetTypeData61.getStringRes();
        }
        WidgetTypeData widgetTypeData62 = WidgetTypeData.WEB_SWIMMING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData62.getWidgetName())) {
            return widgetTypeData62.getStringRes();
        }
        WidgetTypeData widgetTypeData63 = WidgetTypeData.DRIVING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData63.getWidgetName())) {
            return widgetTypeData63.getStringRes();
        }
        WidgetTypeData widgetTypeData64 = WidgetTypeData.FANCY_SWIMMING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData64.getWidgetName())) {
            return widgetTypeData64.getStringRes();
        }
        WidgetTypeData widgetTypeData65 = WidgetTypeData.SNORKELING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData65.getWidgetName())) {
            return widgetTypeData65.getStringRes();
        }
        WidgetTypeData widgetTypeData66 = WidgetTypeData.KITE_SURFING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData66.getWidgetName())) {
            return widgetTypeData66.getStringRes();
        }
        WidgetTypeData widgetTypeData67 = WidgetTypeData.INDOOR_SURFING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData67.getWidgetName())) {
            return widgetTypeData67.getStringRes();
        }
        WidgetTypeData widgetTypeData68 = WidgetTypeData.DRAGON_BOAT;
        if (Intrinsics.areEqual(widgetName, widgetTypeData68.getWidgetName())) {
            return widgetTypeData68.getStringRes();
        }
        WidgetTypeData widgetTypeData69 = WidgetTypeData.FREE_DIVING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData69.getWidgetName())) {
            return widgetTypeData69.getStringRes();
        }
        WidgetTypeData widgetTypeData70 = WidgetTypeData.RECREATIONAL_SCUBA_DIVING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData70.getWidgetName())) {
            return widgetTypeData70.getStringRes();
        }
        WidgetTypeData widgetTypeData71 = WidgetTypeData.INSTRUMENT_DIVING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData71.getWidgetName())) {
            return widgetTypeData71.getStringRes();
        }
        WidgetTypeData widgetTypeData72 = WidgetTypeData.ROCK_CLIMBING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData72.getWidgetName())) {
            return widgetTypeData72.getStringRes();
        }
        WidgetTypeData widgetTypeData73 = WidgetTypeData.SKATE;
        if (Intrinsics.areEqual(widgetName, widgetTypeData73.getWidgetName())) {
            return widgetTypeData73.getStringRes();
        }
        WidgetTypeData widgetTypeData74 = WidgetTypeData.ROLLER_SKATING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData74.getWidgetName())) {
            return widgetTypeData74.getStringRes();
        }
        WidgetTypeData widgetTypeData75 = WidgetTypeData.PARKOUR;
        if (Intrinsics.areEqual(widgetName, widgetTypeData75.getWidgetName())) {
            return widgetTypeData75.getStringRes();
        }
        WidgetTypeData widgetTypeData76 = WidgetTypeData.ATV;
        if (Intrinsics.areEqual(widgetName, widgetTypeData76.getWidgetName())) {
            return widgetTypeData76.getStringRes();
        }
        WidgetTypeData widgetTypeData77 = WidgetTypeData.PARAGLIDER;
        if (Intrinsics.areEqual(widgetName, widgetTypeData77.getWidgetName())) {
            return widgetTypeData77.getStringRes();
        }
        WidgetTypeData widgetTypeData78 = WidgetTypeData.BMX;
        if (Intrinsics.areEqual(widgetName, widgetTypeData78.getWidgetName())) {
            return widgetTypeData78.getStringRes();
        }
        WidgetTypeData widgetTypeData79 = WidgetTypeData.HEEL_TO_TOE_WALK;
        if (Intrinsics.areEqual(widgetName, widgetTypeData79.getWidgetName())) {
            return widgetTypeData79.getStringRes();
        }
        WidgetTypeData widgetTypeData80 = WidgetTypeData.CLIMBING_MACHINE;
        if (Intrinsics.areEqual(widgetName, widgetTypeData80.getWidgetName())) {
            return widgetTypeData80.getStringRes();
        }
        WidgetTypeData widgetTypeData81 = WidgetTypeData.CLIMB_STAIRS;
        if (Intrinsics.areEqual(widgetName, widgetTypeData81.getWidgetName())) {
            return widgetTypeData81.getStringRes();
        }
        WidgetTypeData widgetTypeData82 = WidgetTypeData.STEPPER;
        if (Intrinsics.areEqual(widgetName, widgetTypeData82.getWidgetName())) {
            return widgetTypeData82.getStringRes();
        }
        WidgetTypeData widgetTypeData83 = WidgetTypeData.CORE_TRAINING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData83.getWidgetName())) {
            return widgetTypeData83.getStringRes();
        }
        WidgetTypeData widgetTypeData84 = WidgetTypeData.FLEXIBILITY_TRAINING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData84.getWidgetName())) {
            return widgetTypeData84.getStringRes();
        }
        WidgetTypeData widgetTypeData85 = WidgetTypeData.PILATES;
        if (Intrinsics.areEqual(widgetName, widgetTypeData85.getWidgetName())) {
            return widgetTypeData85.getStringRes();
        }
        WidgetTypeData widgetTypeData86 = WidgetTypeData.GYMNASTICS;
        if (Intrinsics.areEqual(widgetName, widgetTypeData86.getWidgetName())) {
            return widgetTypeData86.getStringRes();
        }
        WidgetTypeData widgetTypeData87 = WidgetTypeData.STRETCH;
        if (Intrinsics.areEqual(widgetName, widgetTypeData87.getWidgetName())) {
            return widgetTypeData87.getStringRes();
        }
        WidgetTypeData widgetTypeData88 = WidgetTypeData.STRENGTH_TRAINING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData88.getWidgetName())) {
            return widgetTypeData88.getStringRes();
        }
        WidgetTypeData widgetTypeData89 = WidgetTypeData.CROOS_FIT;
        if (Intrinsics.areEqual(widgetName, widgetTypeData89.getWidgetName())) {
            return widgetTypeData89.getStringRes();
        }
        WidgetTypeData widgetTypeData90 = WidgetTypeData.AEROBICS;
        if (Intrinsics.areEqual(widgetName, widgetTypeData90.getWidgetName())) {
            return widgetTypeData90.getStringRes();
        }
        WidgetTypeData widgetTypeData91 = WidgetTypeData.PHYSICAL_TRAINING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData91.getWidgetName())) {
            return widgetTypeData91.getStringRes();
        }
        WidgetTypeData widgetTypeData92 = WidgetTypeData.WALL_BALL;
        if (Intrinsics.areEqual(widgetName, widgetTypeData92.getWidgetName())) {
            return widgetTypeData92.getStringRes();
        }
        WidgetTypeData widgetTypeData93 = WidgetTypeData.DUMBBELL_TRAINING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData93.getWidgetName())) {
            return widgetTypeData93.getStringRes();
        }
        WidgetTypeData widgetTypeData94 = WidgetTypeData.BARBELL_TRAINING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData94.getWidgetName())) {
            return widgetTypeData94.getStringRes();
        }
        WidgetTypeData widgetTypeData95 = WidgetTypeData.WEIGHT_LIFTING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData95.getWidgetName())) {
            return widgetTypeData95.getStringRes();
        }
        WidgetTypeData widgetTypeData96 = WidgetTypeData.DEAD_LIFT;
        if (Intrinsics.areEqual(widgetName, widgetTypeData96.getWidgetName())) {
            return widgetTypeData96.getStringRes();
        }
        WidgetTypeData widgetTypeData97 = WidgetTypeData.BOBBY_JUMP;
        if (Intrinsics.areEqual(widgetName, widgetTypeData97.getWidgetName())) {
            return widgetTypeData97.getStringRes();
        }
        WidgetTypeData widgetTypeData98 = WidgetTypeData.SIT_UPS;
        if (Intrinsics.areEqual(widgetName, widgetTypeData98.getWidgetName())) {
            return widgetTypeData98.getStringRes();
        }
        WidgetTypeData widgetTypeData99 = WidgetTypeData.FUNCTIONAL_TRAINING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData99.getWidgetName())) {
            return widgetTypeData99.getStringRes();
        }
        WidgetTypeData widgetTypeData100 = WidgetTypeData.UPPER_LIMB_TRAINING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData100.getWidgetName())) {
            return widgetTypeData100.getStringRes();
        }
        WidgetTypeData widgetTypeData101 = WidgetTypeData.LOWER_LIMB_TRAINING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData101.getWidgetName())) {
            return widgetTypeData101.getStringRes();
        }
        WidgetTypeData widgetTypeData102 = WidgetTypeData.WAIST_TRAINING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData102.getWidgetName())) {
            return widgetTypeData102.getStringRes();
        }
        WidgetTypeData widgetTypeData103 = WidgetTypeData.BACK_TRAINING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData103.getWidgetName())) {
            return widgetTypeData103.getStringRes();
        }
        WidgetTypeData widgetTypeData104 = WidgetTypeData.SPINNING_BIKE;
        if (Intrinsics.areEqual(widgetName, widgetTypeData104.getWidgetName())) {
            return widgetTypeData104.getStringRes();
        }
        WidgetTypeData widgetTypeData105 = WidgetTypeData.STROLLER;
        if (Intrinsics.areEqual(widgetName, widgetTypeData105.getWidgetName())) {
            return widgetTypeData105.getStringRes();
        }
        WidgetTypeData widgetTypeData106 = WidgetTypeData.STEP_TRAINING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData106.getWidgetName())) {
            return widgetTypeData106.getStringRes();
        }
        WidgetTypeData widgetTypeData107 = WidgetTypeData.HORIZONTAL_BAR;
        if (Intrinsics.areEqual(widgetName, widgetTypeData107.getWidgetName())) {
            return widgetTypeData107.getStringRes();
        }
        WidgetTypeData widgetTypeData108 = WidgetTypeData.PARALLEL_BARS;
        if (Intrinsics.areEqual(widgetName, widgetTypeData108.getWidgetName())) {
            return widgetTypeData108.getStringRes();
        }
        WidgetTypeData widgetTypeData109 = WidgetTypeData.GROUP_GYMNASTICS;
        if (Intrinsics.areEqual(widgetName, widgetTypeData109.getWidgetName())) {
            return widgetTypeData109.getStringRes();
        }
        WidgetTypeData widgetTypeData110 = WidgetTypeData.KICK_BOXING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData110.getWidgetName())) {
            return widgetTypeData110.getStringRes();
        }
        WidgetTypeData widgetTypeData111 = WidgetTypeData.BATTLE_ROPE;
        if (Intrinsics.areEqual(widgetName, widgetTypeData111.getWidgetName())) {
            return widgetTypeData111.getStringRes();
        }
        WidgetTypeData widgetTypeData112 = WidgetTypeData.MIXES_AEROBIC;
        if (Intrinsics.areEqual(widgetName, widgetTypeData112.getWidgetName())) {
            return widgetTypeData112.getStringRes();
        }
        WidgetTypeData widgetTypeData113 = WidgetTypeData.WALK_INDOOR;
        if (Intrinsics.areEqual(widgetName, widgetTypeData113.getWidgetName())) {
            return widgetTypeData113.getStringRes();
        }
        WidgetTypeData widgetTypeData114 = WidgetTypeData.INDOOR_FITNESS;
        if (Intrinsics.areEqual(widgetName, widgetTypeData114.getWidgetName())) {
            return widgetTypeData114.getStringRes();
        }
        WidgetTypeData widgetTypeData115 = WidgetTypeData.SQUARE_DANCE;
        if (Intrinsics.areEqual(widgetName, widgetTypeData115.getWidgetName())) {
            return widgetTypeData115.getStringRes();
        }
        WidgetTypeData widgetTypeData116 = WidgetTypeData.BELLY_DANCE;
        if (Intrinsics.areEqual(widgetName, widgetTypeData116.getWidgetName())) {
            return widgetTypeData116.getStringRes();
        }
        WidgetTypeData widgetTypeData117 = WidgetTypeData.BALLET;
        if (Intrinsics.areEqual(widgetName, widgetTypeData117.getWidgetName())) {
            return widgetTypeData117.getStringRes();
        }
        WidgetTypeData widgetTypeData118 = WidgetTypeData.STREET_DANCE;
        if (Intrinsics.areEqual(widgetName, widgetTypeData118.getWidgetName())) {
            return widgetTypeData118.getStringRes();
        }
        WidgetTypeData widgetTypeData119 = WidgetTypeData.FITNESS_ZUMBA;
        if (Intrinsics.areEqual(widgetName, widgetTypeData119.getWidgetName())) {
            return widgetTypeData119.getStringRes();
        }
        WidgetTypeData widgetTypeData120 = WidgetTypeData.NATIONAL_DANCE;
        if (Intrinsics.areEqual(widgetName, widgetTypeData120.getWidgetName())) {
            return widgetTypeData120.getStringRes();
        }
        WidgetTypeData widgetTypeData121 = WidgetTypeData.JAZZ;
        if (Intrinsics.areEqual(widgetName, widgetTypeData121.getWidgetName())) {
            return widgetTypeData121.getStringRes();
        }
        WidgetTypeData widgetTypeData122 = WidgetTypeData.LATIN_DANCE;
        if (Intrinsics.areEqual(widgetName, widgetTypeData122.getWidgetName())) {
            return widgetTypeData122.getStringRes();
        }
        WidgetTypeData widgetTypeData123 = WidgetTypeData.HIP_HOP_DANCE;
        if (Intrinsics.areEqual(widgetName, widgetTypeData123.getWidgetName())) {
            return widgetTypeData123.getStringRes();
        }
        WidgetTypeData widgetTypeData124 = WidgetTypeData.POLE_DANCING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData124.getWidgetName())) {
            return widgetTypeData124.getStringRes();
        }
        WidgetTypeData widgetTypeData125 = WidgetTypeData.BREAK_DANCE;
        if (Intrinsics.areEqual(widgetName, widgetTypeData125.getWidgetName())) {
            return widgetTypeData125.getStringRes();
        }
        WidgetTypeData widgetTypeData126 = WidgetTypeData.BALLROM_DANCING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData126.getWidgetName())) {
            return widgetTypeData126.getStringRes();
        }
        WidgetTypeData widgetTypeData127 = WidgetTypeData.MODEN_DANCE;
        if (Intrinsics.areEqual(widgetName, widgetTypeData127.getWidgetName())) {
            return widgetTypeData127.getStringRes();
        }
        WidgetTypeData widgetTypeData128 = WidgetTypeData.DANCE;
        if (Intrinsics.areEqual(widgetName, widgetTypeData128.getWidgetName())) {
            return widgetTypeData128.getStringRes();
        }
        WidgetTypeData widgetTypeData129 = WidgetTypeData.BOXING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData129.getWidgetName())) {
            return widgetTypeData129.getStringRes();
        }
        WidgetTypeData widgetTypeData130 = WidgetTypeData.WRESTLING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData130.getWidgetName())) {
            return widgetTypeData130.getStringRes();
        }
        WidgetTypeData widgetTypeData131 = WidgetTypeData.MARTIAL_ARTS;
        if (Intrinsics.areEqual(widgetName, widgetTypeData131.getWidgetName())) {
            return widgetTypeData131.getStringRes();
        }
        WidgetTypeData widgetTypeData132 = WidgetTypeData.TAICHI;
        if (Intrinsics.areEqual(widgetName, widgetTypeData132.getWidgetName())) {
            return widgetTypeData132.getStringRes();
        }
        WidgetTypeData widgetTypeData133 = WidgetTypeData.MUAY_THAI;
        if (Intrinsics.areEqual(widgetName, widgetTypeData133.getWidgetName())) {
            return widgetTypeData133.getStringRes();
        }
        WidgetTypeData widgetTypeData134 = WidgetTypeData.JUDO;
        if (Intrinsics.areEqual(widgetName, widgetTypeData134.getWidgetName())) {
            return widgetTypeData134.getStringRes();
        }
        WidgetTypeData widgetTypeData135 = WidgetTypeData.TAEKWONDO;
        if (Intrinsics.areEqual(widgetName, widgetTypeData135.getWidgetName())) {
            return widgetTypeData135.getStringRes();
        }
        WidgetTypeData widgetTypeData136 = WidgetTypeData.KARATE;
        if (Intrinsics.areEqual(widgetName, widgetTypeData136.getWidgetName())) {
            return widgetTypeData136.getStringRes();
        }
        WidgetTypeData widgetTypeData137 = WidgetTypeData.FREE_SPARRING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData137.getWidgetName())) {
            return widgetTypeData137.getStringRes();
        }
        WidgetTypeData widgetTypeData138 = WidgetTypeData.SWORDSMANSHIP;
        if (Intrinsics.areEqual(widgetName, widgetTypeData138.getWidgetName())) {
            return widgetTypeData138.getStringRes();
        }
        WidgetTypeData widgetTypeData139 = WidgetTypeData.FENCING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData139.getWidgetName())) {
            return widgetTypeData139.getStringRes();
        }
        WidgetTypeData widgetTypeData140 = WidgetTypeData.JUJITSU;
        if (Intrinsics.areEqual(widgetName, widgetTypeData140.getWidgetName())) {
            return widgetTypeData140.getStringRes();
        }
        WidgetTypeData widgetTypeData141 = WidgetTypeData.FOOTBALL;
        if (Intrinsics.areEqual(widgetName, widgetTypeData141.getWidgetName())) {
            return widgetTypeData141.getStringRes();
        }
        WidgetTypeData widgetTypeData142 = WidgetTypeData.BASKETBALL;
        if (Intrinsics.areEqual(widgetName, widgetTypeData142.getWidgetName())) {
            return widgetTypeData142.getStringRes();
        }
        WidgetTypeData widgetTypeData143 = WidgetTypeData.VOLLEYBALL;
        if (Intrinsics.areEqual(widgetName, widgetTypeData143.getWidgetName())) {
            return widgetTypeData143.getStringRes();
        }
        WidgetTypeData widgetTypeData144 = WidgetTypeData.BASEBALL;
        if (Intrinsics.areEqual(widgetName, widgetTypeData144.getWidgetName())) {
            return widgetTypeData144.getStringRes();
        }
        WidgetTypeData widgetTypeData145 = WidgetTypeData.SOFTBALL;
        if (Intrinsics.areEqual(widgetName, widgetTypeData145.getWidgetName())) {
            return widgetTypeData145.getStringRes();
        }
        WidgetTypeData widgetTypeData146 = WidgetTypeData.RUGBY;
        if (Intrinsics.areEqual(widgetName, widgetTypeData146.getWidgetName())) {
            return widgetTypeData146.getStringRes();
        }
        WidgetTypeData widgetTypeData147 = WidgetTypeData.HOCKEY;
        if (Intrinsics.areEqual(widgetName, widgetTypeData147.getWidgetName())) {
            return widgetTypeData147.getStringRes();
        }
        WidgetTypeData widgetTypeData148 = WidgetTypeData.PINGPONG;
        if (Intrinsics.areEqual(widgetName, widgetTypeData148.getWidgetName())) {
            return widgetTypeData148.getStringRes();
        }
        WidgetTypeData widgetTypeData149 = WidgetTypeData.BADMINTON;
        if (Intrinsics.areEqual(widgetName, widgetTypeData149.getWidgetName())) {
            return widgetTypeData149.getStringRes();
        }
        WidgetTypeData widgetTypeData150 = WidgetTypeData.TENNIS;
        if (Intrinsics.areEqual(widgetName, widgetTypeData150.getWidgetName())) {
            return widgetTypeData150.getStringRes();
        }
        WidgetTypeData widgetTypeData151 = WidgetTypeData.CRICKET;
        if (Intrinsics.areEqual(widgetName, widgetTypeData151.getWidgetName())) {
            return widgetTypeData151.getStringRes();
        }
        WidgetTypeData widgetTypeData152 = WidgetTypeData.HANDBALL;
        if (Intrinsics.areEqual(widgetName, widgetTypeData152.getWidgetName())) {
            return widgetTypeData152.getStringRes();
        }
        WidgetTypeData widgetTypeData153 = WidgetTypeData.BOWLING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData153.getWidgetName())) {
            return widgetTypeData153.getStringRes();
        }
        WidgetTypeData widgetTypeData154 = WidgetTypeData.SQUASH;
        if (Intrinsics.areEqual(widgetName, widgetTypeData154.getWidgetName())) {
            return widgetTypeData154.getStringRes();
        }
        WidgetTypeData widgetTypeData155 = WidgetTypeData.BILLIARDS;
        if (Intrinsics.areEqual(widgetName, widgetTypeData155.getWidgetName())) {
            return widgetTypeData155.getStringRes();
        }
        WidgetTypeData widgetTypeData156 = WidgetTypeData.BEACH_FOOTBALL;
        if (Intrinsics.areEqual(widgetName, widgetTypeData156.getWidgetName())) {
            return widgetTypeData156.getStringRes();
        }
        WidgetTypeData widgetTypeData157 = WidgetTypeData.BEACH_VOLLEYBALL;
        if (Intrinsics.areEqual(widgetName, widgetTypeData157.getWidgetName())) {
            return widgetTypeData157.getStringRes();
        }
        WidgetTypeData widgetTypeData158 = WidgetTypeData.SEPAK_TAKRAW;
        if (Intrinsics.areEqual(widgetName, widgetTypeData158.getWidgetName())) {
            return widgetTypeData158.getStringRes();
        }
        WidgetTypeData widgetTypeData159 = WidgetTypeData.GOLF;
        if (Intrinsics.areEqual(widgetName, widgetTypeData159.getWidgetName())) {
            return widgetTypeData159.getStringRes();
        }
        WidgetTypeData widgetTypeData160 = WidgetTypeData.TABLE_SOCCER;
        if (Intrinsics.areEqual(widgetName, widgetTypeData160.getWidgetName())) {
            return widgetTypeData160.getStringRes();
        }
        WidgetTypeData widgetTypeData161 = WidgetTypeData.INDOOR_SOCCER;
        if (Intrinsics.areEqual(widgetName, widgetTypeData161.getWidgetName())) {
            return widgetTypeData161.getStringRes();
        }
        WidgetTypeData widgetTypeData162 = WidgetTypeData.SANDBAG;
        if (Intrinsics.areEqual(widgetName, widgetTypeData162.getWidgetName())) {
            return widgetTypeData162.getStringRes();
        }
        WidgetTypeData widgetTypeData163 = WidgetTypeData.BOCCE;
        if (Intrinsics.areEqual(widgetName, widgetTypeData163.getWidgetName())) {
            return widgetTypeData163.getStringRes();
        }
        WidgetTypeData widgetTypeData164 = WidgetTypeData.JAI_BALL;
        if (Intrinsics.areEqual(widgetName, widgetTypeData164.getWidgetName())) {
            return widgetTypeData164.getStringRes();
        }
        WidgetTypeData widgetTypeData165 = WidgetTypeData.DOOR_KICK;
        if (Intrinsics.areEqual(widgetName, widgetTypeData165.getWidgetName())) {
            return widgetTypeData165.getStringRes();
        }
        WidgetTypeData widgetTypeData166 = WidgetTypeData.DODGE_BALL;
        if (Intrinsics.areEqual(widgetName, widgetTypeData166.getWidgetName())) {
            return widgetTypeData166.getStringRes();
        }
        WidgetTypeData widgetTypeData167 = WidgetTypeData.SHUFFLEBOARD;
        if (Intrinsics.areEqual(widgetName, widgetTypeData167.getWidgetName())) {
            return widgetTypeData167.getStringRes();
        }
        WidgetTypeData widgetTypeData168 = WidgetTypeData.OUTDOOR_SKATING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData168.getWidgetName())) {
            return widgetTypeData168.getStringRes();
        }
        WidgetTypeData widgetTypeData169 = WidgetTypeData.CURLING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData169.getWidgetName())) {
            return widgetTypeData169.getStringRes();
        }
        WidgetTypeData widgetTypeData170 = WidgetTypeData.SNOW_SPORTS;
        if (Intrinsics.areEqual(widgetName, widgetTypeData170.getWidgetName())) {
            return widgetTypeData170.getStringRes();
        }
        WidgetTypeData widgetTypeData171 = WidgetTypeData.SNOWMOBILE;
        if (Intrinsics.areEqual(widgetName, widgetTypeData171.getWidgetName())) {
            return widgetTypeData171.getStringRes();
        }
        WidgetTypeData widgetTypeData172 = WidgetTypeData.PUCK;
        if (Intrinsics.areEqual(widgetName, widgetTypeData172.getWidgetName())) {
            return widgetTypeData172.getStringRes();
        }
        WidgetTypeData widgetTypeData173 = WidgetTypeData.SNOW_CAR;
        if (Intrinsics.areEqual(widgetName, widgetTypeData173.getWidgetName())) {
            return widgetTypeData173.getStringRes();
        }
        WidgetTypeData widgetTypeData174 = WidgetTypeData.SLED;
        if (Intrinsics.areEqual(widgetName, widgetTypeData174.getWidgetName())) {
            return widgetTypeData174.getStringRes();
        }
        WidgetTypeData widgetTypeData175 = WidgetTypeData.INDOOR_SKATING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData175.getWidgetName())) {
            return widgetTypeData175.getStringRes();
        }
        WidgetTypeData widgetTypeData176 = WidgetTypeData.SNOW_BOARD;
        if (Intrinsics.areEqual(widgetName, widgetTypeData176.getWidgetName())) {
            return widgetTypeData176.getStringRes();
        }
        WidgetTypeData widgetTypeData177 = WidgetTypeData.SKIING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData177.getWidgetName())) {
            return widgetTypeData177.getStringRes();
        }
        WidgetTypeData widgetTypeData178 = WidgetTypeData.COUNTRY_SKIING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData178.getWidgetName())) {
            return widgetTypeData178.getStringRes();
        }
        WidgetTypeData widgetTypeData179 = WidgetTypeData.ARCHERY;
        if (Intrinsics.areEqual(widgetName, widgetTypeData179.getWidgetName())) {
            return widgetTypeData179.getStringRes();
        }
        WidgetTypeData widgetTypeData180 = WidgetTypeData.DARTS;
        if (Intrinsics.areEqual(widgetName, widgetTypeData180.getWidgetName())) {
            return widgetTypeData180.getStringRes();
        }
        WidgetTypeData widgetTypeData181 = WidgetTypeData.HORSE_RIDING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData181.getWidgetName())) {
            return widgetTypeData181.getStringRes();
        }
        WidgetTypeData widgetTypeData182 = WidgetTypeData.TUG_OF_WAR;
        if (Intrinsics.areEqual(widgetName, widgetTypeData182.getWidgetName())) {
            return widgetTypeData182.getStringRes();
        }
        WidgetTypeData widgetTypeData183 = WidgetTypeData.HULA_HOOP;
        if (Intrinsics.areEqual(widgetName, widgetTypeData183.getWidgetName())) {
            return widgetTypeData183.getStringRes();
        }
        WidgetTypeData widgetTypeData184 = WidgetTypeData.FLY_KITE;
        if (Intrinsics.areEqual(widgetName, widgetTypeData184.getWidgetName())) {
            return widgetTypeData184.getStringRes();
        }
        WidgetTypeData widgetTypeData185 = WidgetTypeData.FISHING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData185.getWidgetName())) {
            return widgetTypeData185.getStringRes();
        }
        WidgetTypeData widgetTypeData186 = WidgetTypeData.FRISBEE;
        if (Intrinsics.areEqual(widgetName, widgetTypeData186.getWidgetName())) {
            return widgetTypeData186.getStringRes();
        }
        WidgetTypeData widgetTypeData187 = WidgetTypeData.KICK_THE_SHUTTLECOCK;
        if (Intrinsics.areEqual(widgetName, widgetTypeData187.getWidgetName())) {
            return widgetTypeData187.getStringRes();
        }
        WidgetTypeData widgetTypeData188 = WidgetTypeData.SWING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData188.getWidgetName())) {
            return widgetTypeData188.getStringRes();
        }
        WidgetTypeData widgetTypeData189 = WidgetTypeData.SOMATOSENSORY_GAME;
        if (Intrinsics.areEqual(widgetName, widgetTypeData189.getWidgetName())) {
            return widgetTypeData189.getStringRes();
        }
        WidgetTypeData widgetTypeData190 = WidgetTypeData.ESPORTS;
        if (Intrinsics.areEqual(widgetName, widgetTypeData190.getWidgetName())) {
            return widgetTypeData190.getStringRes();
        }
        WidgetTypeData widgetTypeData191 = WidgetTypeData.INTERNATIONAL_CHESS;
        if (Intrinsics.areEqual(widgetName, widgetTypeData191.getWidgetName())) {
            return widgetTypeData191.getStringRes();
        }
        WidgetTypeData widgetTypeData192 = WidgetTypeData.CHECKERS;
        if (Intrinsics.areEqual(widgetName, widgetTypeData192.getWidgetName())) {
            return widgetTypeData192.getStringRes();
        }
        WidgetTypeData widgetTypeData193 = WidgetTypeData.GO;
        if (Intrinsics.areEqual(widgetName, widgetTypeData193.getWidgetName())) {
            return widgetTypeData193.getStringRes();
        }
        WidgetTypeData widgetTypeData194 = WidgetTypeData.BRIDGE;
        if (Intrinsics.areEqual(widgetName, widgetTypeData194.getWidgetName())) {
            return widgetTypeData194.getStringRes();
        }
        WidgetTypeData widgetTypeData195 = WidgetTypeData.BOARD_GAME;
        if (Intrinsics.areEqual(widgetName, widgetTypeData195.getWidgetName())) {
            return widgetTypeData195.getStringRes();
        }
        WidgetTypeData widgetTypeData196 = WidgetTypeData.INDOOR_ROCK_CLIMBING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData196.getWidgetName())) {
            return widgetTypeData196.getStringRes();
        }
        WidgetTypeData widgetTypeData197 = WidgetTypeData.OUTDOOR_ROCK_CLIMBING;
        if (Intrinsics.areEqual(widgetName, widgetTypeData197.getWidgetName())) {
            return widgetTypeData197.getStringRes();
        }
        WidgetTypeData widgetTypeData198 = WidgetTypeData.EQUESTRIAN;
        if (Intrinsics.areEqual(widgetName, widgetTypeData198.getWidgetName())) {
            return widgetTypeData198.getStringRes();
        }
        WidgetTypeData widgetTypeData199 = WidgetTypeData.TRACK_AND_FIELD;
        if (Intrinsics.areEqual(widgetName, widgetTypeData199.getWidgetName())) {
            return widgetTypeData199.getStringRes();
        }
        WidgetTypeData widgetTypeData200 = WidgetTypeData.RACING_CAR;
        return Intrinsics.areEqual(widgetName, widgetTypeData200.getWidgetName()) ? widgetTypeData200.getStringRes() : p1j.X1;
    }
}
