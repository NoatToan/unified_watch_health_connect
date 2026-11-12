package com.huami.bluetooth.profile.heathdevice;

import com.huami.bluetooth.profile.cmdrequest.CmdRequest;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\b\u0006\u0007\b\t\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\b\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/RemindCommand;", "Lcom/huami/bluetooth/profile/cmdrequest/CmdRequest;", "", Constant.h, "<init>", "(I)V", "DrinkWater", "DrinkWaterV1", "DrinkWaterV2", "EcgMeasureRemind", "EcgMeasureRemindV1", "EcgMeasureRemindV2", "Reminder", "SedentaryRemind", "Lcom/huami/bluetooth/profile/heathdevice/RemindCommand$Reminder;", "Lcom/huami/bluetooth/profile/heathdevice/RemindCommand$DrinkWaterV1;", "Lcom/huami/bluetooth/profile/heathdevice/RemindCommand$DrinkWaterV2;", "Lcom/huami/bluetooth/profile/heathdevice/RemindCommand$DrinkWater;", "Lcom/huami/bluetooth/profile/heathdevice/RemindCommand$SedentaryRemind;", "Lcom/huami/bluetooth/profile/heathdevice/RemindCommand$EcgMeasureRemindV2;", "Lcom/huami/bluetooth/profile/heathdevice/RemindCommand$EcgMeasureRemindV1;", "Lcom/huami/bluetooth/profile/heathdevice/RemindCommand$EcgMeasureRemind;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class RemindCommand extends CmdRequest {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/RemindCommand$DrinkWater;", "Lcom/huami/bluetooth/profile/heathdevice/RemindCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class DrinkWater extends RemindCommand {

        @NotNull
        public static final DrinkWater INSTANCE = new DrinkWater();

        private DrinkWater() {
            super(19, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/RemindCommand$DrinkWaterV1;", "Lcom/huami/bluetooth/profile/heathdevice/RemindCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class DrinkWaterV1 extends RemindCommand {

        @NotNull
        public static final DrinkWaterV1 INSTANCE = new DrinkWaterV1();

        private DrinkWaterV1() {
            super(34, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/RemindCommand$DrinkWaterV2;", "Lcom/huami/bluetooth/profile/heathdevice/RemindCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class DrinkWaterV2 extends RemindCommand {

        @NotNull
        public static final DrinkWaterV2 INSTANCE = new DrinkWaterV2();

        private DrinkWaterV2() {
            super(18, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/RemindCommand$EcgMeasureRemind;", "Lcom/huami/bluetooth/profile/heathdevice/RemindCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class EcgMeasureRemind extends RemindCommand {

        @NotNull
        public static final EcgMeasureRemind INSTANCE = new EcgMeasureRemind();

        private EcgMeasureRemind() {
            super(17, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/RemindCommand$EcgMeasureRemindV1;", "Lcom/huami/bluetooth/profile/heathdevice/RemindCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class EcgMeasureRemindV1 extends RemindCommand {

        @NotNull
        public static final EcgMeasureRemindV1 INSTANCE = new EcgMeasureRemindV1();

        private EcgMeasureRemindV1() {
            super(40, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/RemindCommand$EcgMeasureRemindV2;", "Lcom/huami/bluetooth/profile/heathdevice/RemindCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class EcgMeasureRemindV2 extends RemindCommand {

        @NotNull
        public static final EcgMeasureRemindV2 INSTANCE = new EcgMeasureRemindV2();

        private EcgMeasureRemindV2() {
            super(41, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/RemindCommand$Reminder;", "Lcom/huami/bluetooth/profile/heathdevice/RemindCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Reminder extends RemindCommand {

        @NotNull
        public static final Reminder INSTANCE = new Reminder();

        private Reminder() {
            super(11, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/RemindCommand$SedentaryRemind;", "Lcom/huami/bluetooth/profile/heathdevice/RemindCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SedentaryRemind extends RemindCommand {

        @NotNull
        public static final SedentaryRemind INSTANCE = new SedentaryRemind();

        private SedentaryRemind() {
            super(8, null);
        }
    }

    private RemindCommand(int i) {
        super(i, 0, 2, null);
    }

    public /* synthetic */ RemindCommand(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }
}
