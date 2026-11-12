package com.huami.sleep.daysleep.sleepstagechart.viewmodel;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import com.huami.sleep.api.converter.DataTypeConverter;
import com.huami.sleep.daysleep.sleepstagechart.vo.SleepTagDataVo;
import com.huami.sleep.daysleep.sleepstagechart.vo.SleepTagInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/LiveData;", "", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepTagDataVo;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
public final class SleepStageChartViewModel$mTagList$2 extends Lambda implements Function0<LiveData<List<? extends SleepTagDataVo>>> {
    public final /* synthetic */ SleepStageChartViewModel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepStageChartViewModel$mTagList$2(SleepStageChartViewModel sleepStageChartViewModel) {
        super(0);
        this.a = sleepStageChartViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData c(SleepStageChartViewModel sleepStageChartViewModel, String str) {
        return Transformations.map(sleepStageChartViewModel.tagRepo.getAllTag(sleepStageChartViewModel.getUserId()), new Function<List<? extends SleepTagInfo>, List<? extends SleepTagDataVo>>() { // from class: com.huami.sleep.daysleep.sleepstagechart.viewmodel.SleepStageChartViewModel$mTagList$2$invoke$lambda-1$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final List<? extends SleepTagDataVo> apply(List<? extends SleepTagInfo> list) {
                List<? extends SleepTagInfo> list2 = list;
                DataTypeConverter dataTypeConverter = DataTypeConverter.INSTANCE;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(dataTypeConverter.convertToSleepTagDataVo((SleepTagInfo) it2.next()));
                }
                return arrayList;
            }
        });
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final LiveData<List<SleepTagDataVo>> invoke() {
        MutableLiveData mutableLiveDataR = this.a.r();
        final SleepStageChartViewModel sleepStageChartViewModel = this.a;
        return Transformations.switchMap(mutableLiveDataR, new Function() { // from class: com.huami.sleep.daysleep.sleepstagechart.viewmodel.a
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return SleepStageChartViewModel$mTagList$2.c(sleepStageChartViewModel, (String) obj);
            }
        });
    }
}
