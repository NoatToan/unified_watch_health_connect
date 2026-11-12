package com.xiaomi.hm.health.device.health.recover;

import com.huami.bluetooth.profile.channel.module.syncable.DeviceDataRecover;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/health/recover/HealthRecover;", "Lcom/huami/bluetooth/profile/channel/module/syncable/DeviceDataRecover;", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "device", "", "recover", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HealthRecover implements DeviceDataRecover {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.health.recover.HealthRecover$recover$1", f = "HealthRecover.kt", i = {}, l = {16}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0031  */
        /* JADX WARN: Code duplicated, block: B:16:0x0048 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:17:0x0049  */
        /* JADX WARN: Code duplicated, block: B:22:0x003e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:24:? A[LOOP:0: B:9:0x002b->B:24:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0049 -> B:18:0x004e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.b
                r2 = 1
                if (r1 == 0) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r1 = r5.a
                java.util.Iterator r1 = (java.util.Iterator) r1
                kotlin.ResultKt.throwOnFailure(r6)
                r3 = r1
                r1 = r0
                r0 = r5
                goto L4e
            L16:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1e:
                kotlin.ResultKt.throwOnFailure(r6)
                java.util.List r6 = com.huami.device.feature.health.device.HealthFuncKt.getAllFuncList()
                java.util.Iterator r6 = r6.iterator()
                r1 = r6
                r6 = r5
            L2b:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L54
                java.lang.Object r3 = r1.next()
                com.huami.device.feature.health.device.HealthFunc r3 = (com.huami.device.feature.health.device.HealthFunc) r3
                com.huami.device.feature.health.settings.BaseSetting r3 = r3.getService()
                if (r3 != 0) goto L3e
                goto L2b
            L3e:
                r6.a = r1
                r6.b = r2
                java.lang.Object r3 = r3.syncUserConfigToDevice(r6)
                if (r3 != r0) goto L49
                return r0
            L49:
                r4 = r0
                r0 = r6
                r6 = r3
                r3 = r1
                r1 = r4
            L4e:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                r6 = r0
                r0 = r1
                r1 = r3
                goto L2b
            L54:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.hm.health.device.health.recover.HealthRecover.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.huami.bluetooth.profile.channel.module.syncable.DeviceDataRecover
    public boolean recover(@NotNull HMMiLiProDevice device) throws InterruptedException {
        d.b(null, new a(null), 1, null);
        return true;
    }
}
