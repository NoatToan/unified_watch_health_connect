package com.huami.bluetooth.profile.ecf;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0010\u0018\u00002\u00020\u0001:\u0007\u0006\u0007\b\t\n\u000b\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\r"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/TimexVendorCmd;", "Lcom/huami/bluetooth/profile/ecf/VendorCmd;", "", "value", "<init>", "(I)V", "GetHeartRate", "GetWatchSkinId", "SetCoach", "SetDisplaySetting", "SetHrZone", "SetLiftWristTouch", "SetTouchScreen", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class TimexVendorCmd extends VendorCmd {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/TimexVendorCmd$GetHeartRate;", "Lcom/huami/bluetooth/profile/ecf/TimexVendorCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class GetHeartRate extends TimexVendorCmd {

        @NotNull
        public static final GetHeartRate INSTANCE = new GetHeartRate();

        private GetHeartRate() {
            super(4);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/TimexVendorCmd$GetWatchSkinId;", "Lcom/huami/bluetooth/profile/ecf/TimexVendorCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class GetWatchSkinId extends TimexVendorCmd {

        @NotNull
        public static final GetWatchSkinId INSTANCE = new GetWatchSkinId();

        private GetWatchSkinId() {
            super(5);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/TimexVendorCmd$SetCoach;", "Lcom/huami/bluetooth/profile/ecf/TimexVendorCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SetCoach extends TimexVendorCmd {

        @NotNull
        public static final SetCoach INSTANCE = new SetCoach();

        private SetCoach() {
            super(3);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/TimexVendorCmd$SetDisplaySetting;", "Lcom/huami/bluetooth/profile/ecf/TimexVendorCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SetDisplaySetting extends TimexVendorCmd {

        @NotNull
        public static final SetDisplaySetting INSTANCE = new SetDisplaySetting();

        private SetDisplaySetting() {
            super(1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/TimexVendorCmd$SetHrZone;", "Lcom/huami/bluetooth/profile/ecf/TimexVendorCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SetHrZone extends TimexVendorCmd {

        @NotNull
        public static final SetHrZone INSTANCE = new SetHrZone();

        private SetHrZone() {
            super(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/TimexVendorCmd$SetLiftWristTouch;", "Lcom/huami/bluetooth/profile/ecf/TimexVendorCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SetLiftWristTouch extends TimexVendorCmd {

        @NotNull
        public static final SetLiftWristTouch INSTANCE = new SetLiftWristTouch();

        private SetLiftWristTouch() {
            super(7);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/TimexVendorCmd$SetTouchScreen;", "Lcom/huami/bluetooth/profile/ecf/TimexVendorCmd;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SetTouchScreen extends TimexVendorCmd {

        @NotNull
        public static final SetTouchScreen INSTANCE = new SetTouchScreen();

        private SetTouchScreen() {
            super(6);
        }
    }

    public TimexVendorCmd(int i) {
        super(0, i);
    }
}
