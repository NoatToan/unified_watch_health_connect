package com.xiaomi.idm.task;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.idm.constant.ResponseCode;
import com.xiaomi.idm.exception.IDMException;
import com.xiaomi.idm.internal.Connection;
import com.xiaomi.idm.task.SendBlockTask;
import com.xiaomi.onetrack.api.b;
import defpackage.gj8;
import defpackage.gpe;
import defpackage.ij8;
import defpackage.ovc;
import defpackage.pa3;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import net.jodah.expiringmap.ExpirationPolicy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 C2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001CB{\b\u0000\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012`\u0010$\u001a\\\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\"¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00030\u001d¢\u0006\u0004\bA\u0010BJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0005J\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cRn\u0010$\u001a\\\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\"¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00030\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0017\u0010'\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010(R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104Rl\u00108\u001aZ\u0012\f\u0012\n 7*\u0004\u0018\u00010\u00070\u0007\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000202 7*\n\u0012\u0004\u0012\u000202\u0018\u00010\u00010\u0001 7*,\u0012\f\u0012\n 7*\u0004\u0018\u00010\u00070\u0007\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000202 7*\n\u0012\u0004\u0012\u000202\u0018\u00010\u00010\u0001\u0018\u000106068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010*R\u0014\u0010=\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010*R\u0014\u0010@\u001a\u00020+8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006D"}, d2 = {"Lcom/xiaomi/idm/task/SendBlockTask;", "Lpa3;", "", "", "recordTimeConsumed", "()V", StatConstants.PARAM_START, "", "taskId", "setDoneSubTask", "(Ljava/lang/String;)V", "Lcom/xiaomi/idm/exception/IDMException;", PluginDeviceInfo.FICONOFFLINE, "setFailedSubTask", "(Ljava/lang/String;Lcom/xiaomi/idm/exception/IDMException;)V", "tryArrangeNextTask", b.I, "setDone", "([B)Lpa3;", "", "setFailed", "(Ljava/lang/Throwable;)Lpa3;", "data", "[B", "getData", "()[B", "Lcom/xiaomi/idm/internal/Connection;", "connection", "Lcom/xiaomi/idm/internal/Connection;", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "sendBlockTask", "fragmentData", "Lovc;", "blockFragment", "dispatcher", "Lkotlin/jvm/functions/Function4;", "", "blockId", "I", "getBlockId", "()I", "", "initTime", "J", "offset", "Ljava/util/concurrent/atomic/AtomicInteger;", "sentPackets", "Ljava/util/concurrent/atomic/AtomicInteger;", "", "started", "Z", "complete", "Lij8;", "kotlin.jvm.PlatformType", "taskMap", "Lij8;", "getSizePerPacket", "sizePerPacket", "getMaxParallelTaskNumber", "maxParallelTaskNumber", "getTimeout", "()J", "timeout", "<init>", "([BLcom/xiaomi/idm/internal/Connection;Lkotlin/jvm/functions/Function4;)V", "Companion", "IDMSdk_release"}, k = 1, mv = {1, 5, 1})
public final class SendBlockTask extends pa3<byte[]> {

    @NotNull
    private static final String TAG = "BlockTask";
    private final int blockId;
    private volatile boolean complete;

    @NotNull
    private final Connection connection;

    @NotNull
    private final byte[] data;

    @NotNull
    private final Function4<SendBlockTask, byte[], String, ovc, Unit> dispatcher;
    private final long initTime;
    private int offset;

    @NotNull
    private AtomicInteger sentPackets;
    private volatile boolean started;
    private final ij8<String, pa3<Boolean>> taskMap;

    @NotNull
    private static final AtomicInteger BLOCK_ID = new AtomicInteger(1000);

    /* JADX WARN: Multi-variable type inference failed */
    public SendBlockTask(@NotNull byte[] data, @NotNull Connection connection, @NotNull Function4<? super SendBlockTask, ? super byte[], ? super String, ? super ovc, Unit> dispatcher) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.data = data;
        this.connection = connection;
        this.dispatcher = dispatcher;
        this.blockId = BLOCK_ID.incrementAndGet();
        this.initTime = System.currentTimeMillis();
        this.sentPackets = new AtomicInteger();
        this.taskMap = ij8.d().k(getTimeout(), TimeUnit.MILLISECONDS).m(ExpirationPolicy.CREATED).l(new gj8() { // from class: nsl
            @Override // defpackage.gj8
            public final void a(Object obj, Object obj2) {
                SendBlockTask.m669taskMap$lambda0((String) obj, (pa3) obj2);
            }
        }).j();
    }

    private final int getMaxParallelTaskNumber() {
        return this.connection.getSendBlockMaxParallelTaskNumber();
    }

    private final int getSizePerPacket() {
        return this.connection.getSendBlockSizePerPacket();
    }

    private final long getTimeout() {
        return this.connection.getSendBlockTimeout();
    }

    private final void recordTimeConsumed() {
        gpe.h(TAG, "recordTimeConsumed: blockId=" + this.blockId + " timeConsumed=" + (System.currentTimeMillis() - this.initTime), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: taskMap$lambda-0, reason: not valid java name */
    public static final void m669taskMap$lambda0(String noName_0, pa3 value) {
        Intrinsics.checkNotNullParameter(noName_0, "$noName_0");
        Intrinsics.checkNotNullParameter(value, "value");
        value.setFailed(ResponseCode.SendBlockCode.SEND_BLOCK_ERR_TIMEOUT.createException());
    }

    public final int getBlockId() {
        return this.blockId;
    }

    @NotNull
    public final byte[] getData() {
        return this.data;
    }

    @Override // defpackage.pa3
    @NotNull
    public pa3<byte[]> setDone(@NotNull byte[] response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!this.complete) {
            gpe.h(TAG, "sendBlock success:\tblockId=" + this.blockId + " \tdata(size)=" + getSizePerPacket() + "\tsent=" + this.sentPackets + "\ttotal=" + this.data.length + " message=e.message", new Object[0]);
            recordTimeConsumed();
        }
        this.complete = true;
        pa3<byte[]> done = super.setDone(response);
        Intrinsics.checkNotNullExpressionValue(done, "super.setDone(response)");
        return done;
    }

    public final void setDoneSubTask(@NotNull String taskId) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        pa3<Boolean> pa3VarRemove = this.taskMap.remove(taskId);
        if (pa3VarRemove != null) {
            pa3VarRemove.setDone(Boolean.TRUE);
        } else {
            gpe.i(TAG, "setDone: could not find the task=" + taskId + " in block=" + this.blockId, new Object[0]);
        }
        int i = this.sentPackets.get();
        byte[] bArr = this.data;
        if (i == bArr.length) {
            setDone(bArr);
        } else {
            tryArrangeNextTask();
        }
    }

    @Override // defpackage.pa3
    @NotNull
    public pa3<byte[]> setFailed(@NotNull Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        if (!this.complete) {
            gpe.h(TAG, "sendBlock failed:\tblockId=" + this.blockId + " \tdata(size)=" + getSizePerPacket() + "\tsent=" + this.sentPackets + "\ttotal=" + this.data.length + " message=e.message", new Object[0]);
            recordTimeConsumed();
        }
        this.complete = true;
        pa3<byte[]> failed = super.setFailed(e);
        Intrinsics.checkNotNullExpressionValue(failed, "super.setFailed(e)");
        return failed;
    }

    public final void setFailedSubTask(@NotNull String taskId, @NotNull IDMException e) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(e, "e");
        pa3<Boolean> pa3VarRemove = this.taskMap.remove(taskId);
        if (pa3VarRemove != null) {
            pa3VarRemove.setFailed(e);
            return;
        }
        gpe.i(TAG, "setFailed: could not find the task=" + taskId + " in block=" + this.blockId, new Object[0]);
    }

    public final void start() {
        if (this.started) {
            return;
        }
        this.started = true;
        gpe.h(TAG, "run: \tblockId=" + this.blockId + "\tdata(len)=" + this.data.length, new Object[0]);
        tryArrangeNextTask();
    }

    public final synchronized void tryArrangeNextTask() {
        if (this.taskMap.size() >= getMaxParallelTaskNumber()) {
            return;
        }
        if (this.offset > this.data.length) {
            return;
        }
        final int iCoerceAtMost = RangesKt___RangesKt.coerceAtMost(getSizePerPacket(), this.data.length - this.offset);
        byte[] bArr = this.data;
        int i = this.offset;
        byte[] bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(bArr, i, i + iCoerceAtMost);
        pa3<Boolean> pa3Var = new pa3<>();
        String strValueOf = String.valueOf(this.offset);
        pa3Var.setCallBack(new pa3.a<Boolean>() { // from class: com.xiaomi.idm.task.SendBlockTask.tryArrangeNextTask.1
            @Override // pa3.a
            public void onFailed(@NotNull pa3<Boolean> callFuture, @NotNull Throwable exception) {
                Intrinsics.checkNotNullParameter(callFuture, "callFuture");
                Intrinsics.checkNotNullParameter(exception, "exception");
                SendBlockTask.this.setFailed(exception);
            }

            public void onResponse(@NotNull pa3<Boolean> callFuture, boolean response) {
                Intrinsics.checkNotNullParameter(callFuture, "callFuture");
                SendBlockTask.this.sentPackets.addAndGet(iCoerceAtMost);
            }

            @Override // pa3.a
            public /* bridge */ /* synthetic */ void onResponse(pa3<Boolean> pa3Var2, Boolean bool) {
                onResponse(pa3Var2, bool.booleanValue());
            }
        });
        ij8<String, pa3<Boolean>> taskMap = this.taskMap;
        Intrinsics.checkNotNullExpressionValue(taskMap, "taskMap");
        taskMap.put(strValueOf, pa3Var);
        ovc.a aVarF = ovc.f();
        aVarF.a(getBlockId());
        aVarF.b(getData().length);
        aVarF.c(this.offset);
        aVarF.d(iCoerceAtMost);
        Function4<SendBlockTask, byte[], String, ovc, Unit> function4 = this.dispatcher;
        ovc ovcVarBuild = aVarF.build();
        Intrinsics.checkNotNullExpressionValue(ovcVarBuild, "build()");
        function4.invoke(this, bArrCopyOfRange, strValueOf, ovcVarBuild);
        this.offset += getSizePerPacket();
        tryArrangeNextTask();
    }
}
