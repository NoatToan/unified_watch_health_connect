package com.huami.stress.domain.data.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.stress.domain.data.local.bean.AllDayStressDaoBean;
import com.huami.stress.domain.data.remote.bean.AllDayStressApiBean;
import com.huami.stress.domain.model.AllDayStress;
import com.huami.stress.domain.model.Stress;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000¨\u0006\u0005"}, d2 = {"Lcom/huami/stress/domain/data/local/bean/AllDayStressDaoBean;", "Lcom/huami/stress/domain/data/remote/bean/AllDayStressApiBean;", "toAllDayStressApiBean", "Lcom/huami/stress/domain/model/AllDayStress;", "toAllDayStress", "domain_release"}, k = 2, mv = {1, 5, 1})
public final class AllDayStressDaoBeanEXKt {
    @NotNull
    public static final AllDayStress toAllDayStress(@NotNull AllDayStressDaoBean allDayStressDaoBean) {
        Object objFromJson = new Gson().fromJson(allDayStressDaoBean.getData(), new TypeToken<ArrayList<Stress>>() { // from class: com.huami.stress.domain.data.converter.AllDayStressDaoBeanEXKt$toAllDayStress$stressListType$1
        }.getType());
        Objects.requireNonNull(objFromJson, "null cannot be cast to non-null type kotlin.collections.List<com.huami.stress.domain.model.Stress>");
        return new AllDayStress(allDayStressDaoBean.getTimestamp(), allDayStressDaoBean.getUserId(), allDayStressDaoBean.getMaxStress(), allDayStressDaoBean.getMinStress(), allDayStressDaoBean.getAvgStress(), allDayStressDaoBean.getRelaxProportion(), allDayStressDaoBean.getNormalProportion(), allDayStressDaoBean.getMediumProportion(), allDayStressDaoBean.getHighProportion(), allDayStressDaoBean.getDeviceSource(), allDayStressDaoBean.getDeviceType(), allDayStressDaoBean.getDeviceId(), allDayStressDaoBean.getDeviceMac(), allDayStressDaoBean.getDeviceSn(), CollectionsKt___CollectionsKt.sortedWith((List) objFromJson, new Comparator() { // from class: com.huami.stress.domain.data.converter.AllDayStressDaoBeanEXKt$toAllDayStress$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((Stress) t).getTime()), Long.valueOf(((Stress) t2).getTime()));
            }
        }));
    }

    @NotNull
    public static final AllDayStressApiBean toAllDayStressApiBean(@NotNull AllDayStressDaoBean allDayStressDaoBean) {
        return new AllDayStressApiBean(allDayStressDaoBean.getUserId(), allDayStressDaoBean.getTimestamp(), allDayStressDaoBean.getDeviceId(), allDayStressDaoBean.getDeviceType(), allDayStressDaoBean.getDeviceSource(), allDayStressDaoBean.getDeviceMac(), allDayStressDaoBean.getDeviceSn(), allDayStressDaoBean.getMaxStress(), allDayStressDaoBean.getMinStress(), allDayStressDaoBean.getAvgStress(), allDayStressDaoBean.getRelaxProportion(), allDayStressDaoBean.getNormalProportion(), allDayStressDaoBean.getMediumProportion(), allDayStressDaoBean.getHighProportion(), allDayStressDaoBean.getData());
    }
}
