package com.huami.bluetooth.profile.heathdevice;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.huami.bluetooth.profile.cmdrequest.CmdRequest;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00072\u00020\u0001:\u0006\b\u0007\t\n\u000b\fB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/HealthECFExtendCommand;", "Lcom/huami/bluetooth/profile/cmdrequest/CmdRequest;", "", Constant.h, SessionDescription.p, "<init>", "(II)V", "Companion", "AuthEcg", "EnableSpoMonitor", "FallDownEventUpload", "FallDownRemind", "SetNbEndTime", "Lcom/huami/bluetooth/profile/heathdevice/HealthECFExtendCommand$SetNbEndTime;", "Lcom/huami/bluetooth/profile/heathdevice/HealthECFExtendCommand$EnableSpoMonitor;", "Lcom/huami/bluetooth/profile/heathdevice/HealthECFExtendCommand$FallDownRemind;", "Lcom/huami/bluetooth/profile/heathdevice/HealthECFExtendCommand$FallDownEventUpload;", "Lcom/huami/bluetooth/profile/heathdevice/HealthECFExtendCommand$AuthEcg;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class HealthECFExtendCommand extends CmdRequest {
    private static final int b = 6;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/HealthECFExtendCommand$AuthEcg;", "Lcom/huami/bluetooth/profile/heathdevice/HealthECFExtendCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class AuthEcg extends HealthECFExtendCommand {

        @NotNull
        public static final AuthEcg INSTANCE = new AuthEcg();

        private AuthEcg() {
            super(62, 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/HealthECFExtendCommand$EnableSpoMonitor;", "Lcom/huami/bluetooth/profile/heathdevice/HealthECFExtendCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class EnableSpoMonitor extends HealthECFExtendCommand {

        @NotNull
        public static final EnableSpoMonitor INSTANCE = new EnableSpoMonitor();

        private EnableSpoMonitor() {
            super(61, 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/HealthECFExtendCommand$FallDownEventUpload;", "Lcom/huami/bluetooth/profile/heathdevice/HealthECFExtendCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class FallDownEventUpload extends HealthECFExtendCommand {

        @NotNull
        public static final FallDownEventUpload INSTANCE = new FallDownEventUpload();

        private FallDownEventUpload() {
            super(57, 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/HealthECFExtendCommand$FallDownRemind;", "Lcom/huami/bluetooth/profile/heathdevice/HealthECFExtendCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class FallDownRemind extends HealthECFExtendCommand {

        @NotNull
        public static final FallDownRemind INSTANCE = new FallDownRemind();

        private FallDownRemind() {
            super(58, 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/heathdevice/HealthECFExtendCommand$SetNbEndTime;", "Lcom/huami/bluetooth/profile/heathdevice/HealthECFExtendCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class SetNbEndTime extends HealthECFExtendCommand {

        @NotNull
        public static final SetNbEndTime INSTANCE = new SetNbEndTime();

        private SetNbEndTime() {
            super(51, 2, null);
        }
    }

    private HealthECFExtendCommand(int i, int i2) {
        super(ArraysKt___ArraysJvmKt.plus(ByteUtilsKt.toByteArray(6, 1), ByteUtilsKt.toByteArray(i, i2)));
    }

    public /* synthetic */ HealthECFExtendCommand(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }
}
