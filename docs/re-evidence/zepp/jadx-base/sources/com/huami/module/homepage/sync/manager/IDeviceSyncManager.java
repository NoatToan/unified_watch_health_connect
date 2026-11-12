package com.huami.module.homepage.sync.manager;

import com.huami.module.homepage.sync.status.SyncEvent;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0002H&J\b\u0010\n\u001a\u00020\u0002H&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¨\u0006\u0012"}, d2 = {"Lcom/huami/module/homepage/sync/manager/IDeviceSyncManager;", "", "", "startSyncDeviceData", "updatePrimaryDeviceType", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "", "immediatelySyncDevice", "initDeviceSyncManager", "releaseDeviceSyncManager", "", "", "getBoundAndActivateDeviceSource", "deviceIsConnected", "Lcom/huami/module/homepage/sync/status/SyncEvent;", "syncEvent", "notify", "homePage_release"}, k = 1, mv = {1, 5, 1})
public interface IDeviceSyncManager {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.module.homepage.sync.manager.IDeviceSyncManager$notify$1", f = "IDeviceSyncManager.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ SyncEvent b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SyncEvent syncEvent, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = syncEvent;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel channel = IDeviceSyncManagerKt.a;
                    SyncEvent syncEvent = this.b;
                    this.a = 1;
                    if (channel.send(syncEvent, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public static void notify(@NotNull IDeviceSyncManager iDeviceSyncManager, @NotNull SyncEvent syncEvent) {
            e.f(GlobalScope.INSTANCE, null, null, new a(syncEvent, null), 3, null);
        }
    }

    boolean deviceIsConnected(@NotNull HMDeviceType type);

    @NotNull
    List<String> getBoundAndActivateDeviceSource();

    boolean immediatelySyncDevice(@NotNull HMDeviceType type);

    void initDeviceSyncManager();

    void notify(@NotNull SyncEvent syncEvent);

    void releaseDeviceSyncManager();

    void startSyncDeviceData();

    void updatePrimaryDeviceType();
}
