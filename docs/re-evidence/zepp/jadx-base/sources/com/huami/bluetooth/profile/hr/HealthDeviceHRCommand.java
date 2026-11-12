package com.huami.bluetooth.profile.hr;

import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u001b\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/huami/bluetooth/profile/hr/HealthDeviceHRCommand;", "Lcom/huami/bluetooth/profile/Request$Command;", "", Constant.h, "cmdLength", "<init>", "(II)V", "SetAtrialFibQinLing", "SetAtrialFibV1", "SetAtrialFibV2", "Lcom/huami/bluetooth/profile/hr/HealthDeviceHRCommand$SetAtrialFibV2;", "Lcom/huami/bluetooth/profile/hr/HealthDeviceHRCommand$SetAtrialFibV1;", "Lcom/huami/bluetooth/profile/hr/HealthDeviceHRCommand$SetAtrialFibQinLing;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class HealthDeviceHRCommand extends Request.Command {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/hr/HealthDeviceHRCommand$SetAtrialFibQinLing;", "Lcom/huami/bluetooth/profile/hr/HealthDeviceHRCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SetAtrialFibQinLing extends HealthDeviceHRCommand {

        @NotNull
        public static final SetAtrialFibQinLing INSTANCE = new SetAtrialFibQinLing();

        private SetAtrialFibQinLing() {
            super(22, 0, 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/hr/HealthDeviceHRCommand$SetAtrialFibV1;", "Lcom/huami/bluetooth/profile/hr/HealthDeviceHRCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SetAtrialFibV1 extends HealthDeviceHRCommand {

        @NotNull
        public static final SetAtrialFibV1 INSTANCE = new SetAtrialFibV1();

        private SetAtrialFibV1() {
            super(40, 0, 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/hr/HealthDeviceHRCommand$SetAtrialFibV2;", "Lcom/huami/bluetooth/profile/hr/HealthDeviceHRCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SetAtrialFibV2 extends HealthDeviceHRCommand {

        @NotNull
        public static final SetAtrialFibV2 INSTANCE = new SetAtrialFibV2();

        private SetAtrialFibV2() {
            super(48, 0, 2, null);
        }
    }

    public /* synthetic */ HealthDeviceHRCommand(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? 2 : i2, null);
    }

    public /* synthetic */ HealthDeviceHRCommand(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }

    private HealthDeviceHRCommand(int i, int i2) {
        super(ByteUtilsKt.toByteArray(i, i2));
    }
}
