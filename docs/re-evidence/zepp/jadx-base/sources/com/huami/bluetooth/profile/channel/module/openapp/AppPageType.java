package com.huami.bluetooth.profile.channel.module.openapp;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.lab.model.SensorRecordsEnity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B\u0019\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\u0082\u0001\n\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/openapp/AppPageType;", "", "", "a", LogUtil.I, "getType", "()I", "type", "", "b", "Ljava/lang/String;", "getDesc", "()Ljava/lang/String;", "desc", "<init>", "(ILjava/lang/String;)V", "Activity", "BloodPressure", SensorRecordsEnity.SensorType.SENSOR_ECG, "Hr", "Menstruation", "PAI", "Pressure", "Sleep", "Spo2", "Temperature", "Lcom/huami/bluetooth/profile/channel/module/openapp/AppPageType$Hr;", "Lcom/huami/bluetooth/profile/channel/module/openapp/AppPageType$Spo2;", "Lcom/huami/bluetooth/profile/channel/module/openapp/AppPageType$Pressure;", "Lcom/huami/bluetooth/profile/channel/module/openapp/AppPageType$Temperature;", "Lcom/huami/bluetooth/profile/channel/module/openapp/AppPageType$Sleep;", "Lcom/huami/bluetooth/profile/channel/module/openapp/AppPageType$PAI;", "Lcom/huami/bluetooth/profile/channel/module/openapp/AppPageType$Menstruation;", "Lcom/huami/bluetooth/profile/channel/module/openapp/AppPageType$Activity;", "Lcom/huami/bluetooth/profile/channel/module/openapp/AppPageType$ECG;", "Lcom/huami/bluetooth/profile/channel/module/openapp/AppPageType$BloodPressure;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class AppPageType {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String desc;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/openapp/AppPageType$Activity;", "Lcom/huami/bluetooth/profile/channel/module/openapp/AppPageType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Activity extends AppPageType {

        @NotNull
        public static final Activity INSTANCE = new Activity();

        private Activity() {
            super(8, "活动目标", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/openapp/AppPageType$BloodPressure;", "Lcom/huami/bluetooth/profile/channel/module/openapp/AppPageType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class BloodPressure extends AppPageType {

        @NotNull
        public static final BloodPressure INSTANCE = new BloodPressure();

        private BloodPressure() {
            super(10, "血压校准", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/openapp/AppPageType$ECG;", "Lcom/huami/bluetooth/profile/channel/module/openapp/AppPageType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class ECG extends AppPageType {

        @NotNull
        public static final ECG INSTANCE = new ECG();

        private ECG() {
            super(9, "心电图", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/openapp/AppPageType$Hr;", "Lcom/huami/bluetooth/profile/channel/module/openapp/AppPageType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Hr extends AppPageType {

        @NotNull
        public static final Hr INSTANCE = new Hr();

        private Hr() {
            super(1, "心率", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/openapp/AppPageType$Menstruation;", "Lcom/huami/bluetooth/profile/channel/module/openapp/AppPageType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Menstruation extends AppPageType {

        @NotNull
        public static final Menstruation INSTANCE = new Menstruation();

        private Menstruation() {
            super(7, "生理周期", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/openapp/AppPageType$PAI;", "Lcom/huami/bluetooth/profile/channel/module/openapp/AppPageType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class PAI extends AppPageType {

        @NotNull
        public static final PAI INSTANCE = new PAI();

        private PAI() {
            super(6, "pai", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/openapp/AppPageType$Pressure;", "Lcom/huami/bluetooth/profile/channel/module/openapp/AppPageType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Pressure extends AppPageType {

        @NotNull
        public static final Pressure INSTANCE = new Pressure();

        private Pressure() {
            super(3, "压力", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/openapp/AppPageType$Sleep;", "Lcom/huami/bluetooth/profile/channel/module/openapp/AppPageType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Sleep extends AppPageType {

        @NotNull
        public static final Sleep INSTANCE = new Sleep();

        private Sleep() {
            super(5, "睡眠", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/openapp/AppPageType$Spo2;", "Lcom/huami/bluetooth/profile/channel/module/openapp/AppPageType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Spo2 extends AppPageType {

        @NotNull
        public static final Spo2 INSTANCE = new Spo2();

        private Spo2() {
            super(2, "血氧", null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/openapp/AppPageType$Temperature;", "Lcom/huami/bluetooth/profile/channel/module/openapp/AppPageType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Temperature extends AppPageType {

        @NotNull
        public static final Temperature INSTANCE = new Temperature();

        private Temperature() {
            super(4, "温度", null);
        }
    }

    private AppPageType(int i, String str) {
        this.type = i;
        this.desc = str;
    }

    public /* synthetic */ AppPageType(int i, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str);
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    public final int getType() {
        return this.type;
    }
}
