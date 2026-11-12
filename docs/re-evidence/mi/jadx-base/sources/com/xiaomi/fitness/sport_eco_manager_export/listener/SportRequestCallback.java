package com.xiaomi.fitness.sport_eco_manager_export.listener;

import com.xiaomi.fitness.sport_eco_manager_export.data.SportResponseData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager_export/listener/SportRequestCallback;", "", "call", "", "sportState", "", "sportResponseData", "Lcom/xiaomi/fitness/sport_eco_manager_export/data/SportResponseData;", "sport-eco-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface SportRequestCallback {
    void call(int sportState, @NotNull SportResponseData sportResponseData);
}
