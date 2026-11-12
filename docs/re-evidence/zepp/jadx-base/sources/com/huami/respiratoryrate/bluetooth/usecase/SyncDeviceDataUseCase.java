package com.huami.respiratoryrate.bluetooth.usecase;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.respiratoryrate.bluetooth.device.IDeviceApi;
import com.huami.respiratoryrate.core.RespRateCoroutineScope;
import com.huami.respiratoryrate.core.data.local.entity.RespRateEntity;
import com.huami.respiratoryrate.core.koin.RespRateKoinScopeKt;
import com.huami.respiratoryrate.core.usecase.PostDataUseCase;
import com.huami.respiratoryrate.core.usecase.SaveDataUseCase;
import com.huami.respiratoryrate.core.usecase.SaveSyncTimeUseCase;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/huami/respiratoryrate/bluetooth/usecase/SyncDeviceDataUseCase;", "", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", Constant.METHOD_EXECUTE, "Lcom/huami/respiratoryrate/bluetooth/device/IDeviceApi;", "Lcom/huami/respiratoryrate/core/data/local/entity/RespRateEntity;", "a", "Lcom/huami/respiratoryrate/bluetooth/device/IDeviceApi;", "deviceApi", "Lcom/huami/respiratoryrate/core/usecase/SaveDataUseCase;", "b", "Lcom/huami/respiratoryrate/core/usecase/SaveDataUseCase;", "saveDataUseCase", "Lcom/huami/respiratoryrate/core/usecase/PostDataUseCase;", "c", "Lcom/huami/respiratoryrate/core/usecase/PostDataUseCase;", "postDataUseCase", "Lcom/huami/respiratoryrate/core/usecase/SaveSyncTimeUseCase;", GoogleApiAvailabilityLight.a, "Lcom/huami/respiratoryrate/core/usecase/SaveSyncTimeUseCase;", "saveSyncTime", "<init>", "(Lcom/huami/respiratoryrate/bluetooth/device/IDeviceApi;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class SyncDeviceDataUseCase {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IDeviceApi<RespRateEntity> deviceApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SaveDataUseCase saveDataUseCase = (SaveDataUseCase) RespRateKoinScopeKt.getRespRateKoinScope().get(Reflection.getOrCreateKotlinClass(SaveDataUseCase.class), null, null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final PostDataUseCase postDataUseCase = (PostDataUseCase) RespRateKoinScopeKt.getRespRateKoinScope().get(Reflection.getOrCreateKotlinClass(PostDataUseCase.class), null, null);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final SaveSyncTimeUseCase saveSyncTime = (SaveSyncTimeUseCase) RespRateKoinScopeKt.getRespRateKoinScope().get(Reflection.getOrCreateKotlinClass(SaveSyncTimeUseCase.class), null, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.respiratoryrate.bluetooth.usecase.SyncDeviceDataUseCase$execute$1", f = "SyncDeviceDataUseCase.kt", i = {}, l = {29, 32}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public Object b;
        public int c;
        public final /* synthetic */ HMBaseDevice e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HMBaseDevice hMBaseDevice, Continuation<? super a> continuation) {
            super(2, continuation);
            this.e = hMBaseDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SyncDeviceDataUseCase.this.new a(this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0063  */
        /* JADX WARN: Code duplicated, block: B:24:0x006f  */
        /* JADX WARN: Code duplicated, block: B:25:0x0071  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            SyncDeviceDataUseCase syncDeviceDataUseCase;
            Pair pair;
            Long l;
            Long lBoxLong;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pair = (Pair) this.b;
                    syncDeviceDataUseCase = (SyncDeviceDataUseCase) this.a;
                    ResultKt.throwOnFailure(obj);
                }
                if (syncDeviceDataUseCase.postDataUseCase.execute()) {
                    SaveSyncTimeUseCase saveSyncTimeUseCase = syncDeviceDataUseCase.saveSyncTime;
                    l = (Long) pair.getFirst();
                    if (l == null) {
                        lBoxLong = null;
                    } else {
                        lBoxLong = Boxing.boxLong(l.longValue() + 1000);
                    }
                    saveSyncTimeUseCase.execute(lBoxLong);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            IDeviceApi iDeviceApi = SyncDeviceDataUseCase.this.deviceApi;
            HMBaseDevice hMBaseDevice = this.e;
            this.c = 1;
            obj = iDeviceApi.syncRespRateFromDevice(hMBaseDevice, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            syncDeviceDataUseCase = SyncDeviceDataUseCase.this;
            Pair pair2 = (Pair) obj;
            List<RespRateEntity> list = (List) pair2.getSecond();
            if (list != null) {
                SaveDataUseCase saveDataUseCase = syncDeviceDataUseCase.saveDataUseCase;
                this.a = syncDeviceDataUseCase;
                this.b = pair2;
                this.c = 2;
                if (saveDataUseCase.execute(list, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                pair = pair2;
                if (syncDeviceDataUseCase.postDataUseCase.execute()) {
                    SaveSyncTimeUseCase saveSyncTimeUseCase2 = syncDeviceDataUseCase.saveSyncTime;
                    l = (Long) pair.getFirst();
                    if (l == null) {
                        lBoxLong = null;
                    } else {
                        lBoxLong = Boxing.boxLong(l.longValue() + 1000);
                    }
                    saveSyncTimeUseCase2.execute(lBoxLong);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public SyncDeviceDataUseCase(@NotNull IDeviceApi<RespRateEntity> iDeviceApi) {
        this.deviceApi = iDeviceApi;
    }

    public final void execute(@Nullable HMBaseDevice device) {
        RespRateCoroutineScope respRateCoroutineScope = (RespRateCoroutineScope) RespRateKoinScopeKt.getRespRateKoinScope().getOrNull(Reflection.getOrCreateKotlinClass(RespRateCoroutineScope.class), null, null);
        if (respRateCoroutineScope == null) {
            return;
        }
        e.f(respRateCoroutineScope, null, null, new a(device, null), 3, null);
    }
}
