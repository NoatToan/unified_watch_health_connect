package com.huami.treadmill.data;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.reminder.AdRemindParserKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\n\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/huami/treadmill/data/InMachineStatus;", "", "", AdRemindParserKt.KEY_OP, "B", "getOp", "()B", "setOp", "(B)V", "", "data", "[B", "getData", "()[B", "setData", "([B)V", "<init>", "()V", "Companion", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class InMachineStatus {

    @Nullable
    private byte[] data;
    private byte op = OP_START;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final byte OP_CTL = 2;
    private static final byte STOP = 1;
    private static final byte PAUSE = 2;
    private static final byte OP_STOP = 3;
    private static final byte OP_START = 4;
    private static final byte OP_SPEED = 1;
    private static final byte OP_ERROR = 2;
    private static final byte SPEED_INC = 1;
    private static final byte SPEED_DEC = 2;
    private static final int TREADMILL_ERROR_NONE = -1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001c\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u001c\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001c\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u001c\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R\u001c\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u001c\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R\u001c\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006R\u001c\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/huami/treadmill/data/InMachineStatus$Companion;", "", "", "OP_CTL", "B", "getOP_CTL", "()B", "STOP", "getSTOP", "PAUSE", "getPAUSE", "OP_STOP", "getOP_STOP", "OP_START", "getOP_START", "OP_SPEED", "getOP_SPEED", "OP_ERROR", "getOP_ERROR", "SPEED_INC", "getSPEED_INC", "SPEED_DEC", "getSPEED_DEC", "", "TREADMILL_ERROR_NONE", LogUtil.I, "getTREADMILL_ERROR_NONE", "()I", "<init>", "()V", "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final byte getOP_CTL() {
            return InMachineStatus.OP_CTL;
        }

        public final byte getOP_ERROR() {
            return InMachineStatus.OP_ERROR;
        }

        public final byte getOP_SPEED() {
            return InMachineStatus.OP_SPEED;
        }

        public final byte getOP_START() {
            return InMachineStatus.OP_START;
        }

        public final byte getOP_STOP() {
            return InMachineStatus.OP_STOP;
        }

        public final byte getPAUSE() {
            return InMachineStatus.PAUSE;
        }

        public final byte getSPEED_DEC() {
            return InMachineStatus.SPEED_DEC;
        }

        public final byte getSPEED_INC() {
            return InMachineStatus.SPEED_INC;
        }

        public final byte getSTOP() {
            return InMachineStatus.STOP;
        }

        public final int getTREADMILL_ERROR_NONE() {
            return InMachineStatus.TREADMILL_ERROR_NONE;
        }
    }

    @Nullable
    public final byte[] getData() {
        return this.data;
    }

    public final byte getOp() {
        return this.op;
    }

    public final void setData(@Nullable byte[] bArr) {
        this.data = bArr;
    }

    public final void setOp(byte b) {
        this.op = b;
    }
}
