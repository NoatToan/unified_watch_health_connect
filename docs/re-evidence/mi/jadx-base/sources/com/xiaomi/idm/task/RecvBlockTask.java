package com.xiaomi.idm.task;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.idm.constant.ResponseCode;
import com.xiaomi.idm.util.ResettableTimerTask;
import com.xiaomi.onetrack.api.b;
import defpackage.gpe;
import defpackage.pa3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u001f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u0017¨\u0006$"}, d2 = {"Lcom/xiaomi/idm/task/RecvBlockTask;", "Lpa3;", "", "", "recordTimeConsumed", "()V", "", "offset", "len", "fragment", "receive", "(II[B)V", b.I, "setDone", "([B)Lpa3;", "", PluginDeviceInfo.FICONOFFLINE, "setFailed", "(Ljava/lang/Throwable;)Lpa3;", "", "hostId", "Ljava/lang/String;", "blockId", "I", "", "initTime", "J", "data", "[B", "Lcom/xiaomi/idm/util/ResettableTimerTask;", "timeoutTimer", "Lcom/xiaomi/idm/util/ResettableTimerTask;", "received", "<init>", "(Ljava/lang/String;II)V", "Companion", "IDMSdk_release"}, k = 1, mv = {1, 5, 1})
public final class RecvBlockTask extends pa3<byte[]> {

    @NotNull
    private static final String TAG = "RecvBlockTask";
    private final int blockId;

    @NotNull
    private final byte[] data;

    @NotNull
    private final String hostId;
    private final long initTime;
    private int received;

    @NotNull
    private final ResettableTimerTask timeoutTimer;

    public RecvBlockTask(@NotNull String hostId, int i, int i2) {
        Intrinsics.checkNotNullParameter(hostId, "hostId");
        this.hostId = hostId;
        this.blockId = i;
        this.initTime = System.currentTimeMillis();
        this.data = new byte[i2];
        this.timeoutTimer = new ResettableTimerTask(new Function0<Unit>() { // from class: com.xiaomi.idm.task.RecvBlockTask.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                gpe.c(RecvBlockTask.TAG, "time out: hostId=" + RecvBlockTask.this.hostId + " blockId=" + RecvBlockTask.this.blockId + " data.len=" + RecvBlockTask.this.data.length + " received=" + RecvBlockTask.this.received, new Object[0]);
                RecvBlockTask.this.setFailed(ResponseCode.SendBlockCode.SEND_BLOCK_ERR_TIMEOUT.createException());
            }
        });
    }

    private final void recordTimeConsumed() {
        gpe.h(TAG, "recordTimeConsumed: hostId=" + this.hostId + " blockId=" + this.blockId + " timeConsumed=" + (System.currentTimeMillis() - this.initTime), new Object[0]);
    }

    public final synchronized void receive(int offset, int len, @NotNull byte[] fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (fragment.length != len) {
            gpe.c(TAG, "receive: blockId[" + this.blockId + "] fragment len validate failed,offset=" + offset + " len=" + len + " real=" + fragment.length, new Object[0]);
            setFailed(ResponseCode.SendBlockCode.SEND_BLOCK_ERR_PARAM_ILLEGAL.createException());
            return;
        }
        int i = this.received;
        byte[] bArr = this.data;
        if (i > bArr.length) {
            gpe.c(TAG, "receive:[" + this.blockId + "] received=" + this.received + " is over total len=" + this.data.length, new Object[0]);
            setFailed(ResponseCode.SendBlockCode.SEND_BLOCK_ERR_PARAM_ILLEGAL.createException());
            return;
        }
        System.arraycopy(fragment, 0, bArr, offset, len);
        int i2 = this.received + len;
        this.received = i2;
        byte[] bArr2 = this.data;
        if (i2 == bArr2.length) {
            setDone(bArr2);
            this.timeoutTimer.cancel();
            return;
        }
        if (i2 > bArr2.length) {
            gpe.c(TAG, "receive:[" + this.blockId + "] received=" + this.received + " is over total len=" + this.data.length, new Object[0]);
            setFailed(ResponseCode.SendBlockCode.SEND_BLOCK_ERR_PARAM_ILLEGAL.createException());
        }
        this.timeoutTimer.reschedule();
    }

    @Override // defpackage.pa3
    @NotNull
    public pa3<byte[]> setFailed(@Nullable Throwable e) {
        recordTimeConsumed();
        pa3<byte[]> failed = super.setFailed(e);
        Intrinsics.checkNotNullExpressionValue(failed, "super.setFailed(e)");
        return failed;
    }

    @Override // defpackage.pa3
    @NotNull
    public pa3<byte[]> setDone(@Nullable byte[] response) {
        recordTimeConsumed();
        pa3<byte[]> done = super.setDone(response);
        Intrinsics.checkNotNullExpressionValue(done, "super.setDone(response)");
        return done;
    }
}
