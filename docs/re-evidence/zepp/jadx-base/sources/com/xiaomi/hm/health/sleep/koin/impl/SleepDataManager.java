package com.xiaomi.hm.health.sleep.koin.impl;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.Transformations;
import com.huami.sleep.daysleep.daydetail.vo.SleepCompareModel;
import com.huami.sleep.koin.ISleepDataManager;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.CompareModel;
import com.xiaomi.hm.health.dataprocess.DaySportData;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.hm.health.datautil.HMDataCacheCenter;
import com.xiaomi.hm.health.datautil.HmEarbudDateDataUtil;
import com.xiaomi.hm.health.jobcenter.job.HMDataAnalisisJob;
import com.xiaomi.hm.health.jobcenter.job.HmEarbudDataAnalysisJob;
import com.xiaomi.hm.health.manager.SportDataManager;
import com.xiaomi.hm.health.sleep.converter.DataTypeConverter;
import com.xiaomi.hm.health.sleep.eventbus.SleepDataNotifiers;
import com.xiaomi.hm.health.sleep.usercase.GetSleepTimeUseCase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J,\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/sleep/koin/impl/SleepDataManager;", "Lcom/huami/sleep/koin/ISleepDataManager;", "", "userId", "date", "", "startAnalysis", "Landroidx/lifecycle/LiveData;", "Lkotlin/Pair;", "", "getBandSleepTime", "getLastDataDate", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "getLatestSleepData", "", "Lcom/huami/sleep/daysleep/daydetail/vo/SleepCompareModel;", "getmCompareDpSlplist", "getmCompareIntoSlplist", "getmCompareScoreSlplist", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SleepDataManager implements ISleepDataManager {
    @Override // com.huami.sleep.koin.ISleepDataManager
    @NotNull
    public LiveData<Pair<Long, Long>> getBandSleepTime(@NotNull String userId, @NotNull final String date) {
        return Transformations.map(SleepDataNotifiers.INSTANCE.recentSleepInfoNotifiers(), new Function<Unit, Pair<? extends Long, ? extends Long>>() { // from class: com.xiaomi.hm.health.sleep.koin.impl.SleepDataManager$getBandSleepTime$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final Pair<? extends Long, ? extends Long> apply(Unit unit) {
                return new GetSleepTimeUseCase().execute(date);
            }
        });
    }

    @Override // com.huami.sleep.koin.ISleepDataManager
    @Nullable
    public Object getLastDataDate(@NotNull String str, @NotNull Continuation<? super String> continuation) {
        return SportDataManager.getInstance().getLastDataDate();
    }

    @Override // com.huami.sleep.koin.ISleepDataManager
    @NotNull
    public LiveData<SleepInfo> getLatestSleepData(@NotNull String userId) {
        return Transformations.map(SleepDataNotifiers.INSTANCE.recentSleepInfoNotifiers(), new Function<Unit, SleepInfo>() { // from class: com.xiaomi.hm.health.sleep.koin.impl.SleepDataManager$getLatestSleepData$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final SleepInfo apply(Unit unit) {
                SleepInfo sleepInfo;
                DaySportData latestSleepData = HMDataCacheCenter.getInstance().getLatestSleepData();
                if (latestSleepData != null && (sleepInfo = latestSleepData.getSleepInfo()) != null && sleepInfo.getHasSleep() && sleepInfo.getSleepCount() > 0) {
                    return sleepInfo;
                }
                return null;
            }
        });
    }

    @Override // com.huami.sleep.koin.ISleepDataManager
    @NotNull
    public List<SleepCompareModel> getmCompareDpSlplist() {
        ArrayList arrayList;
        List<CompareModel> list = SportDataManager.getInstance().getmCompareDpSlplist();
        if (list == null) {
            arrayList = null;
        } else {
            DataTypeConverter dataTypeConverter = DataTypeConverter.INSTANCE;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(dataTypeConverter.convertToSleepCompareModel((CompareModel) it2.next()));
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? CollectionsKt__CollectionsKt.emptyList() : arrayList;
    }

    @Override // com.huami.sleep.koin.ISleepDataManager
    @NotNull
    public List<SleepCompareModel> getmCompareIntoSlplist() {
        ArrayList arrayList;
        List<CompareModel> list = SportDataManager.getInstance().getmCompareIntoSlplist();
        if (list == null) {
            arrayList = null;
        } else {
            DataTypeConverter dataTypeConverter = DataTypeConverter.INSTANCE;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(dataTypeConverter.convertToSleepCompareModel((CompareModel) it2.next()));
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? CollectionsKt__CollectionsKt.emptyList() : arrayList;
    }

    @Override // com.huami.sleep.koin.ISleepDataManager
    @NotNull
    public List<SleepCompareModel> getmCompareScoreSlplist() {
        ArrayList arrayList;
        List<CompareModel> list = SportDataManager.getInstance().getmCompareScoreSlplist();
        if (list == null) {
            arrayList = null;
        } else {
            DataTypeConverter dataTypeConverter = DataTypeConverter.INSTANCE;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(dataTypeConverter.convertToSleepCompareModel((CompareModel) it2.next()));
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? CollectionsKt__CollectionsKt.emptyList() : arrayList;
    }

    @Override // com.huami.sleep.koin.ISleepDataManager
    public void startAnalysis(@NotNull String userId, @NotNull String date) {
        if (HmEarbudDateDataUtil.INSTANCE.getSelectData(date, true).getIsEarbud()) {
            new HmEarbudDataAnalysisJob(date, 0, HMDeviceType.EARBUD.getValue()).start();
        } else {
            new HMDataAnalisisJob(date, 0, HMDeviceType.MILI.getValue(), 1).start();
        }
    }
}
