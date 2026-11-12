package com.xiaomi.fitness.heartrate.ui;

import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fit.fitness.export.api.repository.IHeartRateRepository;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.data.item.HrItem;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.health.ecg.push.EcgSchemaHandler;
import com.xiaomi.fitness.heartrate.camera.BmpMonitorHelper;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u001f\u001a\u00020 R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u00020\u00178FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001b¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/heartrate/ui/HeartRateDetectViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "mRepository", "Lcom/xiaomi/fit/fitness/export/api/repository/IRepositoryProvider;", "getMRepository", "()Lcom/xiaomi/fit/fitness/export/api/repository/IRepositoryProvider;", "setMRepository", "(Lcom/xiaomi/fit/fitness/export/api/repository/IRepositoryProvider;)V", "mWearableDeviceManager", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceManager;", "getMWearableDeviceManager", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceManager;", "setMWearableDeviceManager", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceManager;)V", EcgSchemaHandler.PARAM_MEASURE_TIME, "", "getMeasureTime", "()J", "setMeasureTime", "(J)V", "avgHrm", "", "getAvgHrm", "()I", "setAvgHrm", "(I)V", "type", "getType", "setType", "insertDetectRecord", "", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HeartRateDetectViewModel extends AbsViewModel {
    private int avgHrm;
    public IRepositoryProvider mRepository;
    public WearableDeviceManager mWearableDeviceManager;
    private long measureTime;
    private int type = -1;

    /* JADX INFO: renamed from: com.xiaomi.fitness.heartrate.ui.HeartRateDetectViewModel$insertDetectRecord$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.heartrate.ui.HeartRateDetectViewModel$insertDetectRecord$1", f = "HeartRateDetectViewModel.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ HrItem $hrItem;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HrItem hrItem, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$hrItem = hrItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HeartRateDetectViewModel.this.new AnonymousClass1(this.$hrItem, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IHeartRateRepository iHeartRateRepository = (IHeartRateRepository) HeartRateDetectViewModel.this.getMRepository().getRepository(IHeartRateRepository.class);
                HrItem hrItem = this.$hrItem;
                this.label = 1;
                if (iHeartRateRepository.addRecord(hrItem, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final int getAvgHrm() {
        int i = this.avgHrm;
        return i > 0 ? i : BmpMonitorHelper.INSTANCE.getAvgCurBmp();
    }

    @NotNull
    public final IRepositoryProvider getMRepository() {
        IRepositoryProvider iRepositoryProvider = this.mRepository;
        if (iRepositoryProvider != null) {
            return iRepositoryProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRepository");
        return null;
    }

    @NotNull
    public final WearableDeviceManager getMWearableDeviceManager() {
        WearableDeviceManager wearableDeviceManager = this.mWearableDeviceManager;
        if (wearableDeviceManager != null) {
            return wearableDeviceManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mWearableDeviceManager");
        return null;
    }

    public final long getMeasureTime() {
        return this.measureTime;
    }

    public final int getType() {
        return this.type;
    }

    public final void insertDetectRecord() {
        HrItem hrItem = new HrItem(this.measureTime / ((long) 1000), getAvgHrm());
        hrItem.setSid(getMWearableDeviceManager().getCurrentPhoneSid());
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(hrItem, null), 3, null);
    }

    public final void setAvgHrm(int i) {
        this.avgHrm = i;
    }

    public final void setMRepository(@NotNull IRepositoryProvider iRepositoryProvider) {
        Intrinsics.checkNotNullParameter(iRepositoryProvider, "<set-?>");
        this.mRepository = iRepositoryProvider;
    }

    public final void setMWearableDeviceManager(@NotNull WearableDeviceManager wearableDeviceManager) {
        Intrinsics.checkNotNullParameter(wearableDeviceManager, "<set-?>");
        this.mWearableDeviceManager = wearableDeviceManager;
    }

    public final void setMeasureTime(long j) {
        this.measureTime = j;
    }

    public final void setType(int i) {
        this.type = i;
    }
}
