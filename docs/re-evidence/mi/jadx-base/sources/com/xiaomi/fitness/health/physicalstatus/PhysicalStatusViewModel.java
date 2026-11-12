package com.xiaomi.fitness.health.physicalstatus;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fit.fitness.export.api.repository.IDevicesListRepository;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.FitnessDeviceItem;
import com.xiaomi.fitness.base.BasicDataViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.export.HealthMonitorManager;
import com.xiaomi.fitness.devicesettings.export.HrSettingHelperExtKt;
import com.xiaomi.fitness.health.physicalstatus.PhysicalStatusViewModel;
import com.xiaomi.fitness.statistics.StatConstants;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000eJ\u0006\u0010\u0015\u001a\u00020\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/health/physicalstatus/PhysicalStatusViewModel;", "Lcom/xiaomi/fitness/base/BasicDataViewModel;", "<init>", "()V", "mDeviceRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/IDevicesListRepository;", "getMDeviceRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/IDevicesListRepository;", "mDeviceRepo$delegate", "Lkotlin/Lazy;", "mShowOpenHrGuideLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "queryDeviceList", "Landroidx/lifecycle/LiveData;", "", "Lcom/xiaomi/fit/fitness/export/data/item/FitnessDeviceItem;", StatConstants.PARAM_START, "", StatConstants.PARAM_END, "queryShowHrOpenGuideLiveData", "requestShowHrOpenEnable", "", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PhysicalStatusViewModel extends BasicDataViewModel {
    public static final int DETECTION_MODE_ALL = 3;
    public static final int DETECTION_MODE_CLOSE = 0;
    public static final int DETECTION_MODE_HR = 2;
    public static final int DETECTION_MODE_SLEEP = 1;
    public static final int MODE_AUTO = 1;
    public static final int MODE_CLOSE = 0;
    public static final int MODE_FULL = 3;
    public static final int MODE_SLEEP = 2;

    @NotNull
    public static final String TAG = "VitalityViewModel";

    /* JADX INFO: renamed from: mDeviceRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDeviceRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: pvh
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PhysicalStatusViewModel.mDeviceRepo_delegate$lambda$0(this.f30828a);
        }
    });

    @Nullable
    private MutableLiveData<Boolean> mShowOpenHrGuideLiveData;

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.physicalstatus.PhysicalStatusViewModel$requestShowHrOpenEnable$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.physicalstatus.PhysicalStatusViewModel$requestShowHrOpenEnable$1", f = "PhysicalStatusViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2$lambda$0(PhysicalStatusViewModel physicalStatusViewModel, boolean z) {
            MutableLiveData mutableLiveData = physicalStatusViewModel.mShowOpenHrGuideLiveData;
            if (mutableLiveData != null) {
                mutableLiveData.postValue(Boolean.valueOf(!z));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2$lambda$1(int i) {
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PhysicalStatusViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            Logger.i("VitalityViewModel", "currentDeviceModel:" + wearableDeviceModel + "name:" + (wearableDeviceModel != null ? DeviceModelExtKt.getName(wearableDeviceModel) : null));
            if (wearableDeviceModel != null) {
                final PhysicalStatusViewModel physicalStatusViewModel = PhysicalStatusViewModel.this;
                HrSettingHelperExtKt.getInstance(HealthMonitorManager.INSTANCE).loadHrOpenContinuous(wearableDeviceModel.getDid(), new Function1() { // from class: com.xiaomi.fitness.health.physicalstatus.a
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return PhysicalStatusViewModel.AnonymousClass1.invokeSuspend$lambda$2$lambda$0(physicalStatusViewModel, ((Boolean) obj2).booleanValue());
                    }
                }, new Function1() { // from class: com.xiaomi.fitness.health.physicalstatus.b
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return PhysicalStatusViewModel.AnonymousClass1.invokeSuspend$lambda$2$lambda$1(((Integer) obj2).intValue());
                    }
                });
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final IDevicesListRepository getMDeviceRepo() {
        return (IDevicesListRepository) this.mDeviceRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IDevicesListRepository mDeviceRepo_delegate$lambda$0(PhysicalStatusViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getRepoProvider().getDevicesListRepository();
    }

    @NotNull
    public final LiveData<List<FitnessDeviceItem>> queryDeviceList(long start, long end) {
        return FlowLiveDataConversions.asLiveData$default(getMDeviceRepo().getDevicesList(HomeDataType.PHYSICAL_STATUS, start, end), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    @NotNull
    public final LiveData<Boolean> queryShowHrOpenGuideLiveData() {
        if (this.mShowOpenHrGuideLiveData == null) {
            this.mShowOpenHrGuideLiveData = new MutableLiveData<>();
        }
        requestShowHrOpenEnable();
        MutableLiveData<Boolean> mutableLiveData = this.mShowOpenHrGuideLiveData;
        Intrinsics.checkNotNull(mutableLiveData);
        return mutableLiveData;
    }

    public final void requestShowHrOpenEnable() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }
}
