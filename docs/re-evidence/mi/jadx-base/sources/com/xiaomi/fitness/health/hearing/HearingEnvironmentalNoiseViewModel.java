package com.xiaomi.fitness.health.hearing;

import com.xiaomi.fit.fitness.export.api.repository.IHearingRepository;
import com.xiaomi.fit.fitness.export.data.item.NoiseItem;
import com.xiaomi.fitness.base.BasicDataViewModel;
import com.xiaomi.fitness.health.hearing.HearingEnvironmentalNoiseViewModel;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/health/hearing/HearingEnvironmentalNoiseViewModel;", "Lcom/xiaomi/fitness/base/BasicDataViewModel;", "<init>", "()V", "mDataRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/IHearingRepository;", "getMDataRepo", "()Lcom/xiaomi/fit/fitness/export/api/repository/IHearingRepository;", "mDataRepo$delegate", "Lkotlin/Lazy;", "getNoiseItemList", "", "Lcom/xiaomi/fit/fitness/export/data/item/NoiseItem;", "timestamp", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HearingEnvironmentalNoiseViewModel extends BasicDataViewModel {

    /* JADX INFO: renamed from: mDataRepo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDataRepo = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: l4c
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HearingEnvironmentalNoiseViewModel.mDataRepo_delegate$lambda$0(this.f24631a);
        }
    });

    private final IHearingRepository getMDataRepo() {
        return (IHearingRepository) this.mDataRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IHearingRepository mDataRepo_delegate$lambda$0(HearingEnvironmentalNoiseViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (IHearingRepository) this$0.getRepo(IHearingRepository.class);
    }

    @NotNull
    public final List<NoiseItem> getNoiseItemList(long timestamp) {
        return getMDataRepo().getNoiseItemList(timestamp);
    }
}
