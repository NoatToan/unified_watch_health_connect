package com.huami.ai.koin.common;

import com.huami.ai.notify.DialogState;
import com.huami.ai.notify.VADSendState;
import com.huami.ai.notify.VoiceCaptureNotify;
import com.huami.ai.uitls.DeviceUtilsKt;
import com.huami.bluetooth.profile.channel.module.voice.command.ContinueCommand;
import com.huami.bluetooth.profile.channel.module.voice.command.VADCommand;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/huami/ai/koin/common/NewBleVoiceCaptureNotifyImpl;", "Lcom/huami/ai/notify/VoiceCaptureNotify;", "", "expectCapture", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopCapture", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "a", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "baseDevice", "Lcom/huami/ai/notify/DialogState;", "b", "Lcom/huami/ai/notify/DialogState;", "dialogState", "Lcom/huami/ai/notify/VADSendState;", "c", "Lcom/huami/ai/notify/VADSendState;", "vadSendState", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;Lcom/huami/ai/notify/DialogState;Lcom/huami/ai/notify/VADSendState;)V", "Companion", "speech-skill_release"}, k = 1, mv = {1, 5, 1})
public final class NewBleVoiceCaptureNotifyImpl implements VoiceCaptureNotify {
    private static final long d = 600;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HMBaseDevice baseDevice;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final DialogState dialogState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final VADSendState vadSendState;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.ai.koin.common.NewBleVoiceCaptureNotifyImpl", f = "NewBleVoiceCaptureNotifyImpl.kt", i = {0}, l = {29}, m = "expectCapture", n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return NewBleVoiceCaptureNotifyImpl.this.expectCapture(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("发送继续开始对话的指令：", Boolean.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Integer, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i) {
                super(0);
                this.a = i;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return Intrinsics.stringPlus("发送VAD指令 :", Integer.valueOf(this.a));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public static final b a = new b();

            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "Dispatcher finished.Set both Idle";
            }
        }

        public c() {
            super(1);
        }

        public final void a(int i) {
            HMLog.info("speech", new a(i));
            NewBleVoiceCaptureNotifyImpl.this.vadSendState.set(3);
            if (NewBleVoiceCaptureNotifyImpl.this.dialogState.compareAndSet(5, 0)) {
                NewBleVoiceCaptureNotifyImpl.this.vadSendState.set(1);
                HMLog.info("speech", b.a);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    public NewBleVoiceCaptureNotifyImpl(@NotNull HMBaseDevice hMBaseDevice, @NotNull DialogState dialogState, @NotNull VADSendState vADSendState) {
        this.baseDevice = hMBaseDevice;
        this.dialogState = dialogState;
        this.vadSendState = vADSendState;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.ai.notify.VoiceCaptureNotify
    @Nullable
    public Object expectCapture(@NotNull Continuation<? super Unit> continuation) {
        a aVar;
        NewBleVoiceCaptureNotifyImpl newBleVoiceCaptureNotifyImpl;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.d = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            aVar.a = this;
            aVar.d = 1;
            if (DelayKt.delay(600L, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            newBleVoiceCaptureNotifyImpl = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            newBleVoiceCaptureNotifyImpl = (NewBleVoiceCaptureNotifyImpl) aVar.a;
            ResultKt.throwOnFailure(obj);
        }
        HMLog.info("speech", new b(Boxing.boxBoolean(DeviceUtilsKt.sendCommand$default(newBleVoiceCaptureNotifyImpl.baseDevice, new ContinueCommand(), null, 2, null)).booleanValue()));
        return Unit.INSTANCE;
    }

    @Override // com.huami.ai.notify.VoiceCaptureNotify
    public void stopCapture() {
        DeviceUtilsKt.sendCommand(this.baseDevice, new VADCommand(), new c());
    }
}
