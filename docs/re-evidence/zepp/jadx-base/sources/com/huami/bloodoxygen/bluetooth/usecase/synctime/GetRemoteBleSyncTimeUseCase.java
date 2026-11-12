package com.huami.bloodoxygen.bluetooth.usecase.synctime;

import com.huami.bigdata.statistics.core.resource.Resource;
import com.huami.bigdata.statistics.core.resource.ResourceKt;
import com.huami.bloodoxygen.bluetooth.synctime.remote.api.property.BloodOxygenSyncTime;
import com.huami.bloodoxygen.bluetooth.synctime.repository.BloodOxygenSyncTimeRepo;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/huami/bloodoxygen/bluetooth/usecase/synctime/GetRemoteBleSyncTimeUseCase;", "", "Lcom/huami/bigdata/statistics/core/resource/Resource;", "Lcom/huami/bloodoxygen/bluetooth/synctime/remote/api/property/BloodOxygenSyncTime;", Constant.METHOD_EXECUTE, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bloodoxygen/bluetooth/synctime/repository/BloodOxygenSyncTimeRepo;", "a", "Lcom/huami/bloodoxygen/bluetooth/synctime/repository/BloodOxygenSyncTimeRepo;", "syncTimeRepo", "<init>", "(Lcom/huami/bloodoxygen/bluetooth/synctime/repository/BloodOxygenSyncTimeRepo;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class GetRemoteBleSyncTimeUseCase {

    @NotNull
    private static final String b = "GetRemoteBleSyncTimeUseCase";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BloodOxygenSyncTimeRepo syncTimeRepo;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/bloodoxygen/bluetooth/synctime/remote/api/property/BloodOxygenSyncTime;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bloodoxygen.bluetooth.usecase.synctime.GetRemoteBleSyncTimeUseCase$execute$2", f = "GetRemoteBleSyncTimeUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function1<Continuation<? super BloodOxygenSyncTime>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return GetRemoteBleSyncTimeUseCase.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Continuation<? super BloodOxygenSyncTime> continuation) {
            return ((a) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return GetRemoteBleSyncTimeUseCase.this.syncTimeRepo.getRemoteBleSyncTime();
        }
    }

    public GetRemoteBleSyncTimeUseCase(@NotNull BloodOxygenSyncTimeRepo bloodOxygenSyncTimeRepo) {
        this.syncTimeRepo = bloodOxygenSyncTimeRepo;
    }

    @Nullable
    public final Object execute(@NotNull Continuation<? super Resource<BloodOxygenSyncTime>> continuation) {
        return ResourceKt.mapToResource(new a(null), continuation);
    }
}
