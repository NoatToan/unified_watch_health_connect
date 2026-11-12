package com.huami.bluetooth.profile.heathdevice;

import com.huami.bluetooth.profile.cmdrequest.CmdRequest;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/HealthECFCommand;", "Lcom/huami/bluetooth/profile/cmdrequest/CmdRequest;", "", Constant.h, "<init>", "(I)V", "LockScreenConfig", "SetMotorConfig", "Lcom/huami/bluetooth/profile/heathdevice/HealthECFCommand$LockScreenConfig;", "Lcom/huami/bluetooth/profile/heathdevice/HealthECFCommand$SetMotorConfig;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class HealthECFCommand extends CmdRequest {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/HealthECFCommand$LockScreenConfig;", "Lcom/huami/bluetooth/profile/heathdevice/HealthECFCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class LockScreenConfig extends HealthECFCommand {

        @NotNull
        public static final LockScreenConfig INSTANCE = new LockScreenConfig();

        private LockScreenConfig() {
            super(15, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/HealthECFCommand$SetMotorConfig;", "Lcom/huami/bluetooth/profile/heathdevice/HealthECFCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SetMotorConfig extends HealthECFCommand {

        @NotNull
        public static final SetMotorConfig INSTANCE = new SetMotorConfig();

        private SetMotorConfig() {
            super(23, null);
        }
    }

    private HealthECFCommand(int i) {
        super(i, 0, 2, null);
    }

    public /* synthetic */ HealthECFCommand(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }
}
