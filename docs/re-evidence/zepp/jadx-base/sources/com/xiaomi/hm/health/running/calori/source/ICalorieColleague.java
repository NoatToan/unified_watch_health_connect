package com.xiaomi.hm.health.running.calori.source;

import com.huami.sport.service.model.HistoryRecord;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ \u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/running/calori/source/ICalorieColleague;", "", "", "startTime", "endTime", "", "Lcom/huami/sport/service/model/HistoryRecord;", "getSportList", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public abstract class ICalorieColleague {
    @Nullable
    public abstract List<HistoryRecord> getSportList(long startTime, long endTime);
}
