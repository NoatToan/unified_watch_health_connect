package com.huami.module.homepage.sync.manager;

import com.huami.module.homepage.sync.status.SyncEvent;
import com.huami.watch.notification.TransportUri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a$\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000\"\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlin/Function1;", "Lcom/huami/module/homepage/sync/status/SyncEvent;", "", TransportUri.ACTION_BLOCK, "deviceSyncListener", "Lkotlinx/coroutines/channels/Channel;", "a", "Lkotlinx/coroutines/channels/Channel;", "channel", "homePage_release"}, k = 2, mv = {1, 5, 1})
public final class IDeviceSyncManagerKt {

    @NotNull
    private static final Channel<SyncEvent> a = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.module.homepage.sync.manager.IDeviceSyncManagerKt$deviceSyncListener$1", f = "IDeviceSyncManager.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ Function1<SyncEvent, Unit> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super SyncEvent, Unit> function1, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0035 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:12:0x0036  */
        /* JADX WARN: Code duplicated, block: B:15:0x0043  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0036 -> B:13:0x003b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.b
                r2 = 1
                if (r1 == 0) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r1 = r6.a
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                kotlin.ResultKt.throwOnFailure(r7)
                r3 = r1
                r1 = r0
                r0 = r6
                goto L3b
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                kotlin.ResultKt.throwOnFailure(r7)
                kotlinx.coroutines.channels.Channel r7 = com.huami.module.homepage.sync.manager.IDeviceSyncManagerKt.access$getChannel$p()
                kotlinx.coroutines.channels.ChannelIterator r7 = r7.iterator()
                r1 = r7
                r7 = r6
            L2b:
                r7.a = r1
                r7.b = r2
                java.lang.Object r3 = r1.hasNext(r7)
                if (r3 != r0) goto L36
                return r0
            L36:
                r5 = r0
                r0 = r7
                r7 = r3
                r3 = r1
                r1 = r5
            L3b:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto L52
                java.lang.Object r7 = r3.next()
                com.huami.module.homepage.sync.status.SyncEvent r7 = (com.huami.module.homepage.sync.status.SyncEvent) r7
                kotlin.jvm.functions.Function1<com.huami.module.homepage.sync.status.SyncEvent, kotlin.Unit> r4 = r0.c
                r4.invoke(r7)
                r7 = r0
                r0 = r1
                r1 = r3
                goto L2b
            L52:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huami.module.homepage.sync.manager.IDeviceSyncManagerKt.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void deviceSyncListener(@NotNull CoroutineScope coroutineScope, @NotNull Function1<? super SyncEvent, Unit> function1) {
        e.f(coroutineScope, null, null, new a(function1, null), 3, null);
    }
}
