package com.xiaomi.fitness.watch.face.edit.entity;

import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.wearable.hm.ChangeListenerImpl;
import defpackage.p1j;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B#\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/entity/WidgetGroupData;", "", "key", "", CardInfo.KEY_CARD_GROUP_NAME, "stringRes", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V", "getKey", "()Ljava/lang/String;", "getGroupName", "getStringRes", "()I", ChangeListenerImpl.SETTING_GROUP_TYPE_GENERAL, "ACTIVITY_STATISTICS", "STEP", "CALORIE", "STAND", "INTENSITY", "HEART_RATE", "OXYGEN_SATURATION", "PRESSURE", "BASE", "CARD_BAG", "WEATHER", "TOOLS", "WECHAT", "ALIPAY_PAYMENT_CODE", ChangeListenerImpl.SETTING_GROUP_TYPE_SPORT, "BLOOD_PRESSURE", "VITALITY_VALUE", "JS_APPLICATION", "LUA_APPLICATION", "TRAINING_STATUS", "SLEEP", "NONE", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum WidgetGroupData {
    GENERAL("general", "无", p1j.l1),
    ACTIVITY_STATISTICS(DialGroupType.ACTIVITY_STATISTICS, "活动统计", p1j.f1),
    STEP("step", "步数", p1j.w1),
    CALORIE("calorie", "卡路里", p1j.j1),
    STAND("stand", "站立", p1j.v1),
    INTENSITY("intensity", "中高强度训练", p1j.n1),
    HEART_RATE("heartRate", "心率", p1j.m1),
    OXYGEN_SATURATION("oxygenSaturation", "血氧饱和度", p1j.r1),
    PRESSURE("pressure", "压力", p1j.s1),
    BASE("base", "基础", p1j.h1),
    CARD_BAG(DialGroupType.CARD_BAG, "卡包", p1j.k1),
    WEATHER("weather", "天气", p1j.A1),
    TOOLS(DialGroupType.TOOLS, "工具", p1j.x1),
    WECHAT("wechat", "微信", p1j.B1),
    ALIPAY_PAYMENT_CODE("alipayPaymentCode", "支付宝付款码", p1j.g1),
    SPORT("sport", "运动", p1j.u1),
    BLOOD_PRESSURE("bloodPressure", "血压", p1j.i1),
    VITALITY_VALUE("vitalityValue", "元气值", p1j.z1),
    JS_APPLICATION("jsApplication", "JS应用", p1j.o1),
    LUA_APPLICATION("luaApplication", "Lua应用", p1j.p1),
    TRAINING_STATUS("trainingStatus", "训练状态", p1j.y1),
    SLEEP("sleep", "睡眠", p1j.t1),
    NONE("none", "无", p1j.q1);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    private final String groupName;

    @NotNull
    private final String key;
    private final int stringRes;

    WidgetGroupData(String str, String str2, int i) {
        this.key = str;
        this.groupName = str2;
        this.stringRes = i;
    }

    @NotNull
    public static EnumEntries<WidgetGroupData> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getGroupName() {
        return this.groupName;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public final int getStringRes() {
        return this.stringRes;
    }
}
