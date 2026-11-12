package com.huami.bluetooth.profile.heathdevice;

import com.huami.bluetooth.profile.cmdrequest.Operation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\n\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\n\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/RemindOperation;", "Lcom/huami/bluetooth/profile/cmdrequest/Operation;", "", "opCode", "<init>", "(I)V", "Disable", "Enable", "EnableFriday", "EnableMonday", "EnableSaturday", "EnableSunday", "EnableThursday", "EnableTuesday", "EnableWednesday", "OnOff", "Lcom/huami/bluetooth/profile/heathdevice/RemindOperation$Disable;", "Lcom/huami/bluetooth/profile/heathdevice/RemindOperation$Enable;", "Lcom/huami/bluetooth/profile/heathdevice/RemindOperation$OnOff;", "Lcom/huami/bluetooth/profile/heathdevice/RemindOperation$EnableSunday;", "Lcom/huami/bluetooth/profile/heathdevice/RemindOperation$EnableMonday;", "Lcom/huami/bluetooth/profile/heathdevice/RemindOperation$EnableTuesday;", "Lcom/huami/bluetooth/profile/heathdevice/RemindOperation$EnableWednesday;", "Lcom/huami/bluetooth/profile/heathdevice/RemindOperation$EnableThursday;", "Lcom/huami/bluetooth/profile/heathdevice/RemindOperation$EnableFriday;", "Lcom/huami/bluetooth/profile/heathdevice/RemindOperation$EnableSaturday;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class RemindOperation extends Operation {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/RemindOperation$Disable;", "Lcom/huami/bluetooth/profile/heathdevice/RemindOperation;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Disable extends RemindOperation {

        @NotNull
        public static final Disable INSTANCE = new Disable();

        private Disable() {
            super(0, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/RemindOperation$Enable;", "Lcom/huami/bluetooth/profile/heathdevice/RemindOperation;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Enable extends RemindOperation {

        @NotNull
        public static final Enable INSTANCE = new Enable();

        private Enable() {
            super(1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/RemindOperation$EnableFriday;", "Lcom/huami/bluetooth/profile/heathdevice/RemindOperation;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class EnableFriday extends RemindOperation {

        @NotNull
        public static final EnableFriday INSTANCE = new EnableFriday();

        private EnableFriday() {
            super(64, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/RemindOperation$EnableMonday;", "Lcom/huami/bluetooth/profile/heathdevice/RemindOperation;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class EnableMonday extends RemindOperation {

        @NotNull
        public static final EnableMonday INSTANCE = new EnableMonday();

        private EnableMonday() {
            super(4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/RemindOperation$EnableSaturday;", "Lcom/huami/bluetooth/profile/heathdevice/RemindOperation;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class EnableSaturday extends RemindOperation {

        @NotNull
        public static final EnableSaturday INSTANCE = new EnableSaturday();

        private EnableSaturday() {
            super(128, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/RemindOperation$EnableSunday;", "Lcom/huami/bluetooth/profile/heathdevice/RemindOperation;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class EnableSunday extends RemindOperation {

        @NotNull
        public static final EnableSunday INSTANCE = new EnableSunday();

        private EnableSunday() {
            super(1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/RemindOperation$EnableThursday;", "Lcom/huami/bluetooth/profile/heathdevice/RemindOperation;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class EnableThursday extends RemindOperation {

        @NotNull
        public static final EnableThursday INSTANCE = new EnableThursday();

        private EnableThursday() {
            super(32, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/RemindOperation$EnableTuesday;", "Lcom/huami/bluetooth/profile/heathdevice/RemindOperation;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class EnableTuesday extends RemindOperation {

        @NotNull
        public static final EnableTuesday INSTANCE = new EnableTuesday();

        private EnableTuesday() {
            super(8, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/RemindOperation$EnableWednesday;", "Lcom/huami/bluetooth/profile/heathdevice/RemindOperation;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class EnableWednesday extends RemindOperation {

        @NotNull
        public static final EnableWednesday INSTANCE = new EnableWednesday();

        private EnableWednesday() {
            super(16, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/RemindOperation$OnOff;", "Lcom/huami/bluetooth/profile/heathdevice/RemindOperation;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class OnOff extends RemindOperation {

        @NotNull
        public static final OnOff INSTANCE = new OnOff();

        private OnOff() {
            super(8, null);
        }
    }

    private RemindOperation(int i) {
        super(i, 0, 2, null);
    }

    public /* synthetic */ RemindOperation(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }
}
