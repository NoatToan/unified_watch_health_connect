package com.xiaomi.hm.health.firstbeat;

import androidx.p008lifecycle.FlowLiveDataConversions;
import com.activeandroid.query.Select;
import com.huami.firstbeat.service.SportState;
import com.huami.firstbeat.service.SportStateService;
import com.huami.watch.companion.firstbeat.FirstBeatUtil;
import com.huami.watch.companion.util.NumberFormatter;
import com.huami.watch.dataflow.model.firstbeat.bean.SportLoadDataItem;
import com.huami.watch.dataflow.model.firstbeat.bean.VO2maxDataItem;
import com.xiaomi.hm.health.homepage.status.card.DataNotifiers;
import com.xiaomi.hm.health.homepage.status.card.InvalidateLiveData;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0016J\u0010\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0016¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/firstbeat/SportStateServiceImpl;", "Lcom/huami/firstbeat/service/SportStateService;", "Lcom/huami/watch/dataflow/model/firstbeat/bean/VO2maxDataItem;", "b", "Lcom/huami/watch/dataflow/model/firstbeat/bean/SportLoadDataItem;", "a", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/firstbeat/service/SportState;", "loadVo2maxState", "loadSportLoadState", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class SportStateServiceImpl implements SportStateService {
    /* JADX INFO: Access modifiers changed from: private */
    public final SportLoadDataItem a() {
        return (SportLoadDataItem) new Select().from(SportLoadDataItem.class).where("date <= ?", new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).format(new Date())).orderBy("date DESC").executeSingle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VO2maxDataItem b() {
        return (VO2maxDataItem) new Select().from(VO2maxDataItem.class).where("date <= ?", new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).format(new Date())).where("vo2_max_run > ?", 0).orderBy("date DESC").executeSingle();
    }

    @Override // com.huami.firstbeat.service.SportStateService
    @NotNull
    public Flow<SportState> loadSportLoadState() {
        return FlowLiveDataConversions.asFlow(new InvalidateLiveData<SportState>(DataNotifiers.INSTANCE.getSportLoadNotifier()) { // from class: com.xiaomi.hm.health.firstbeat.SportStateServiceImpl.loadSportLoadState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.xiaomi.hm.health.homepage.status.card.InvalidateLiveData
            @Nullable
            public SportState loadData() {
                SportLoadDataItem sportLoadDataItemA = SportStateServiceImpl.this.a();
                if (sportLoadDataItemA == null) {
                    return null;
                }
                if (!(sportLoadDataItemA.getWeeklyTLSum() > 0)) {
                    sportLoadDataItemA = null;
                }
                if (sportLoadDataItemA == null) {
                    return null;
                }
                return new SportState(sportLoadDataItemA.getDate(), sportLoadDataItemA.getWeeklyTLSum(), CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{0, Integer.valueOf(sportLoadDataItemA.getWeeklyTLSumOptimalMin()), Integer.valueOf(sportLoadDataItemA.getWeeklyTLSumOptimalMax()), Integer.valueOf(sportLoadDataItemA.getWeeklyTLSumOverreaching())}));
            }
        }.asLiveData());
    }

    @Override // com.huami.firstbeat.service.SportStateService
    @NotNull
    public Flow<SportState> loadVo2maxState() {
        return FlowLiveDataConversions.asFlow(new InvalidateLiveData<SportState>(DataNotifiers.INSTANCE.getVo2maxNotifier()) { // from class: com.xiaomi.hm.health.firstbeat.SportStateServiceImpl.loadVo2maxState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.xiaomi.hm.health.homepage.status.card.InvalidateLiveData
            @Nullable
            public SportState loadData() {
                VO2maxDataItem vO2maxDataItemB = SportStateServiceImpl.this.b();
                if (vO2maxDataItemB == null) {
                    return null;
                }
                if (!(vO2maxDataItemB.getVo2maxRun() > 0.0f)) {
                    vO2maxDataItemB = null;
                }
                if (vO2maxDataItemB == null) {
                    return null;
                }
                return new SportState(vO2maxDataItemB.getDate(), (int) NumberFormatter.format(vO2maxDataItemB.getVo2maxRun(), 0, 1), ArraysKt___ArraysKt.toList(FirstBeatUtil.getFitnessRange()));
            }
        }.asLiveData());
    }
}
