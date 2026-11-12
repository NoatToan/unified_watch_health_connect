package com.huami.bluetooth.profile.gdsp;

import com.huami.bluetooth.profile.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/huami/bluetooth/profile/gdsp/GdspCommand;", "Lcom/huami/bluetooth/profile/Request$Command;", "", "b", "B", "getValue", "()B", "value", "<init>", "(B)V", "GetDataSize", "StartTransfer", "StopTransfer", "Lcom/huami/bluetooth/profile/gdsp/GdspCommand$GetDataSize;", "Lcom/huami/bluetooth/profile/gdsp/GdspCommand$StartTransfer;", "Lcom/huami/bluetooth/profile/gdsp/GdspCommand$StopTransfer;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class GdspCommand extends Request.Command {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final byte value;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/gdsp/GdspCommand$GetDataSize;", "Lcom/huami/bluetooth/profile/gdsp/GdspCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class GetDataSize extends GdspCommand {

        @NotNull
        public static final GetDataSize INSTANCE = new GetDataSize();

        private GetDataSize() {
            super((byte) 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/gdsp/GdspCommand$StartTransfer;", "Lcom/huami/bluetooth/profile/gdsp/GdspCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class StartTransfer extends GdspCommand {

        @NotNull
        public static final StartTransfer INSTANCE = new StartTransfer();

        private StartTransfer() {
            super((byte) 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/gdsp/GdspCommand$StopTransfer;", "Lcom/huami/bluetooth/profile/gdsp/GdspCommand;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class StopTransfer extends GdspCommand {

        @NotNull
        public static final StopTransfer INSTANCE = new StopTransfer();

        private StopTransfer() {
            super((byte) 3, null);
        }
    }

    private GdspCommand(byte b) {
        super(new byte[]{b});
        this.value = b;
    }

    public /* synthetic */ GdspCommand(byte b, DefaultConstructorMarker defaultConstructorMarker) {
        this(b);
    }

    public final byte getValue() {
        return this.value;
    }
}
