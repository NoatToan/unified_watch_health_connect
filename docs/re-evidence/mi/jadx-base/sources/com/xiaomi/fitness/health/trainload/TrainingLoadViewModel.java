package com.xiaomi.fitness.health.trainload;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import com.xiaomi.fit.fitness.export.api.repository.IDevicesListRepository;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.FitnessDeviceItem;
import com.xiaomi.fitness.base.BasicDataViewModel;
import com.xiaomi.fitness.health.trainload.TrainingLoadViewModel;
import com.xiaomi.fitness.statistics.StatConstants;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/health/trainload/TrainingLoadViewModel;", "Lcom/xiaomi/fitness/base/BasicDataViewModel;", "<init>", "()V", "mDeviceRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/IDevicesListRepository;", "getMDeviceRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/IDevicesListRepository;", "mDeviceRepo$delegate", "Lkotlin/Lazy;", "queryDeviceList", "Landroidx/lifecycle/LiveData;", "", "Lcom/xiaomi/fit/fitness/export/data/item/FitnessDeviceItem;", StatConstants.PARAM_START, "", StatConstants.PARAM_END, "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TrainingLoadViewModel extends BasicDataViewModel {

    /* JADX INFO: renamed from: mDeviceRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDeviceRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: utp
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TrainingLoadViewModel.mDeviceRepo_delegate$lambda$0(this.f36126a);
        }
    });

    private final IDevicesListRepository getMDeviceRepo() {
        return (IDevicesListRepository) this.mDeviceRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IDevicesListRepository mDeviceRepo_delegate$lambda$0(TrainingLoadViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.getRepoProvider().getDevicesListRepository();
    }

    @NotNull
    public final LiveData<List<FitnessDeviceItem>> queryDeviceList(long start, long end) {
        return FlowLiveDataConversions.asLiveData$default(getMDeviceRepo().getDevicesList(HomeDataType.TRAINING_LOAD, start, end), (CoroutineContext) null, 0L, 3, (Object) null);
    }
}
