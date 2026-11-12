package com.huami.bluetooth.profile.heathdevice;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.cmdrequest.Operation;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u0011\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\t\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/RemindType;", "Lcom/huami/bluetooth/profile/cmdrequest/Operation;", "", "c", LogUtil.I, "getCmd", "()I", Constant.h, "<init>", "(I)V", "BloodPressure", "DrinkWater", "EatBreakfast", "EatDinner", "EatLaunch", "GetUp", "SPO2Measure", "Sleep", "TakeMedicine", "Lcom/huami/bluetooth/profile/heathdevice/RemindType$BloodPressure;", "Lcom/huami/bluetooth/profile/heathdevice/RemindType$GetUp;", "Lcom/huami/bluetooth/profile/heathdevice/RemindType$Sleep;", "Lcom/huami/bluetooth/profile/heathdevice/RemindType$EatBreakfast;", "Lcom/huami/bluetooth/profile/heathdevice/RemindType$DrinkWater;", "Lcom/huami/bluetooth/profile/heathdevice/RemindType$TakeMedicine;", "Lcom/huami/bluetooth/profile/heathdevice/RemindType$EatLaunch;", "Lcom/huami/bluetooth/profile/heathdevice/RemindType$EatDinner;", "Lcom/huami/bluetooth/profile/heathdevice/RemindType$SPO2Measure;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class RemindType extends Operation {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int cmd;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/RemindType$BloodPressure;", "Lcom/huami/bluetooth/profile/heathdevice/RemindType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class BloodPressure extends RemindType {

        @NotNull
        public static final BloodPressure INSTANCE = new BloodPressure();

        private BloodPressure() {
            super(2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/RemindType$DrinkWater;", "Lcom/huami/bluetooth/profile/heathdevice/RemindType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class DrinkWater extends RemindType {

        @NotNull
        public static final DrinkWater INSTANCE = new DrinkWater();

        private DrinkWater() {
            super(6, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/RemindType$EatBreakfast;", "Lcom/huami/bluetooth/profile/heathdevice/RemindType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class EatBreakfast extends RemindType {

        @NotNull
        public static final EatBreakfast INSTANCE = new EatBreakfast();

        private EatBreakfast() {
            super(5, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/RemindType$EatDinner;", "Lcom/huami/bluetooth/profile/heathdevice/RemindType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class EatDinner extends RemindType {

        @NotNull
        public static final EatDinner INSTANCE = new EatDinner();

        private EatDinner() {
            super(9, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/RemindType$EatLaunch;", "Lcom/huami/bluetooth/profile/heathdevice/RemindType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class EatLaunch extends RemindType {

        @NotNull
        public static final EatLaunch INSTANCE = new EatLaunch();

        private EatLaunch() {
            super(8, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/RemindType$GetUp;", "Lcom/huami/bluetooth/profile/heathdevice/RemindType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class GetUp extends RemindType {

        @NotNull
        public static final GetUp INSTANCE = new GetUp();

        private GetUp() {
            super(3, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/RemindType$SPO2Measure;", "Lcom/huami/bluetooth/profile/heathdevice/RemindType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SPO2Measure extends RemindType {

        @NotNull
        public static final SPO2Measure INSTANCE = new SPO2Measure();

        private SPO2Measure() {
            super(10, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/RemindType$Sleep;", "Lcom/huami/bluetooth/profile/heathdevice/RemindType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Sleep extends RemindType {

        @NotNull
        public static final Sleep INSTANCE = new Sleep();

        private Sleep() {
            super(4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/RemindType$TakeMedicine;", "Lcom/huami/bluetooth/profile/heathdevice/RemindType;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class TakeMedicine extends RemindType {

        @NotNull
        public static final TakeMedicine INSTANCE = new TakeMedicine();

        private TakeMedicine() {
            super(7, null);
        }
    }

    private RemindType(int i) {
        super(i, 0, 2, null);
        this.cmd = i;
    }

    public /* synthetic */ RemindType(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public final int getCmd() {
        return this.cmd;
    }
}
