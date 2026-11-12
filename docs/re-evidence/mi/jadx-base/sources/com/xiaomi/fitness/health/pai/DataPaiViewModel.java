package com.xiaomi.fitness.health.pai;

import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.base.BasicDataViewModel;
import com.xiaomi.fitness.chart.entrys.PaiEntry;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/health/pai/DataPaiViewModel;", "Lcom/xiaomi/fitness/base/BasicDataViewModel;", "<init>", "()V", "paiEntry", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/chart/entrys/PaiEntry;", "getPaiEntry", "()Landroidx/lifecycle/MutableLiveData;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class DataPaiViewModel extends BasicDataViewModel {

    @NotNull
    private final MutableLiveData<PaiEntry> paiEntry = new MutableLiveData<>();

    @NotNull
    public final MutableLiveData<PaiEntry> getPaiEntry() {
        return this.paiEntry;
    }
}
