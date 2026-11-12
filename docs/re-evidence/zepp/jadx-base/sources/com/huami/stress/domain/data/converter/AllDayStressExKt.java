package com.huami.stress.domain.data.converter;

import com.huami.stress.domain.data.local.bean.AllDayStressDaoBean;
import com.huami.stress.domain.model.AllDayStress;
import com.huami.stress.domain.model.SingleStress;
import com.huami.stress.domain.model.Stress;
import com.huami.stress.domain.usecase.statistics.bean.StressPoint;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u0004\u0018\u00010\u0000\u001a\u0010\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\u0000\u001a\n\u0010\u0007\u001a\u00020\u0006*\u00020\u0000¨\u0006\b"}, d2 = {"Lcom/huami/stress/domain/model/AllDayStress;", "", "Lcom/huami/stress/domain/model/SingleStress;", "toSingleStressList", "Lcom/huami/stress/domain/usecase/statistics/bean/StressPoint;", "toStressPointList", "Lcom/huami/stress/domain/data/local/bean/AllDayStressDaoBean;", "toAllDayStressDaoBean", "domain_release"}, k = 2, mv = {1, 5, 1})
public final class AllDayStressExKt {
    @NotNull
    public static final AllDayStressDaoBean toAllDayStressDaoBean(@NotNull AllDayStress allDayStress) {
        return new AllDayStressDaoBean(allDayStress.getTimestamp(), allDayStress.getUserId(), allDayStress.getDeviceSource(), allDayStress.getDeviceType(), allDayStress.getDeviceId(), allDayStress.getDeviceMac(), allDayStress.getDeviceSn(), allDayStress.getMaxStress(), allDayStress.getMinStress(), allDayStress.getAvgStress(), allDayStress.getRelaxProportion(), allDayStress.getNormalProportion(), allDayStress.getMediumProportion(), allDayStress.getHighProportion(), "", false);
    }

    @NotNull
    public static final List<SingleStress> toSingleStressList(@Nullable AllDayStress allDayStress) {
        List<Stress> stressList;
        ArrayList arrayList = null;
        if (allDayStress != null && (stressList = allDayStress.getStressList()) != null) {
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(stressList, 10));
            for (Stress stress : stressList) {
                SingleStress singleStress = new SingleStress(stress.getTime(), allDayStress.getUserId(), stress.getValue(), allDayStress.getDeviceSource(), allDayStress.getDeviceType(), allDayStress.getDeviceId(), allDayStress.getDeviceMac(), allDayStress.getDeviceSn());
                singleStress.setRawSingle(false);
                arrayList.add(singleStress);
            }
        }
        return arrayList == null ? CollectionsKt__CollectionsKt.emptyList() : arrayList;
    }

    @NotNull
    public static final List<StressPoint> toStressPointList(@NotNull AllDayStress allDayStress) {
        List<Stress> stressList = allDayStress.getStressList();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(stressList, 10));
        for (Stress stress : stressList) {
            arrayList.add(new StressPoint(stress.getValue(), stress.getTime(), true));
        }
        return arrayList;
    }
}
