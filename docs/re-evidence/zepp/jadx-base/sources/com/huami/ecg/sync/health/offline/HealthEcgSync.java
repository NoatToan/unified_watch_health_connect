package com.huami.ecg.sync.health.offline;

import com.huami.ecg.EcgDataRepo;
import com.huami.ecg.core.EcgCore;
import com.huami.ecg.sync.health.model.EcgInput;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/huami/ecg/sync/health/offline/HealthEcgSync;", "", "Ljava/util/Calendar;", "time", "Lcom/huami/ecg/sync/health/offline/HealthEcgSyncCallback;", "callback", "", "sync", "Lcom/huami/ecg/sync/health/offline/EcgOffLineDevice;", "a", "Lcom/huami/ecg/sync/health/offline/EcgOffLineDevice;", "getDevice", "()Lcom/huami/ecg/sync/health/offline/EcgOffLineDevice;", "device", "<init>", "(Lcom/huami/ecg/sync/health/offline/EcgOffLineDevice;)V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class HealthEcgSync {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final EcgOffLineDevice device;

    public HealthEcgSync(@NotNull EcgOffLineDevice ecgOffLineDevice) {
        this.device = ecgOffLineDevice;
    }

    @NotNull
    public final EcgOffLineDevice getDevice() {
        return this.device;
    }

    public final void sync(@NotNull Calendar time, @NotNull final HealthEcgSyncCallback callback) {
        if (this.device.isEcgUser()) {
            this.device.sync(time, new HealthEcgSyncCallback() { // from class: com.huami.ecg.sync.health.offline.HealthEcgSync.sync.1

                /* JADX INFO: renamed from: com.huami.ecg.sync.health.offline.HealthEcgSync$sync$1$a */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
                @DebugMetadata(c = "com.huami.ecg.sync.health.offline.HealthEcgSync$sync$1$onData$2", f = "HealthEcgSync.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    private CoroutineScope a;
                    public int b;
                    public final /* synthetic */ List d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(List list, Continuation continuation) {
                        super(2, continuation);
                        this.d = list;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        a aVar = AnonymousClass1.this.new a(this.d, continuation);
                        aVar.a = (CoroutineScope) obj;
                        return aVar;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                        kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                        if (this.b != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        List list = this.d;
                        if (list != null) {
                            if (!Boxing.boxBoolean(!list.isEmpty()).booleanValue()) {
                                list = null;
                            }
                            if (list != null) {
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    new EcgDataRepo().syncOfflineEcgData(HealthEcgSync.this.getDevice().deviceInfo(), EcgCore.INSTANCE.getEcgDevice().userProfile(), (EcgInput) it2.next());
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // com.huami.ecg.sync.health.offline.HealthEcgSyncCallback
                public void onData(@Nullable List<EcgInput> data) {
                    e.f(new CoroutineScope() { // from class: com.huami.ecg.sync.health.offline.HealthEcgSync$sync$1$onData$1
                        @Override // kotlinx.coroutines.CoroutineScope
                        @NotNull
                        public CoroutineContext getCoroutineContext() {
                            return Dispatchers.getIO().plus(JobKt__JobKt.d(null, 1, null));
                        }
                    }, null, null, new a(data, null), 3, null);
                    callback.onData(data);
                }

                @Override // com.huami.ecg.sync.health.offline.HealthEcgSyncCallback
                public void onFinish(boolean result) {
                    callback.onFinish(result);
                }

                @Override // com.huami.ecg.sync.health.offline.HealthEcgSyncCallback
                public void onProgress(int progress) {
                    callback.onProgress(progress);
                }

                @Override // com.huami.ecg.sync.health.offline.HealthEcgSyncCallback
                public void onStart() {
                    callback.onStart();
                }
            });
        } else {
            callback.onFinish(true);
        }
    }
}
