package com.xiaomi.hm.health.play.card.sport;

import androidx.p008lifecycle.LiveData;
import com.xiaomi.hm.health.play.bean.SportDataBean;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H&J\u0010\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H&J\u0010\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/play/card/sport/ISportDataManager;", "", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/hm/health/play/bean/SportDataBean;", "getRecentlyRunData", "getRecentlyWalkData", "getRecentlyBikeData", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public interface ISportDataManager {
    @NotNull
    LiveData<SportDataBean> getRecentlyBikeData();

    @NotNull
    LiveData<SportDataBean> getRecentlyRunData();

    @NotNull
    LiveData<SportDataBean> getRecentlyWalkData();
}
