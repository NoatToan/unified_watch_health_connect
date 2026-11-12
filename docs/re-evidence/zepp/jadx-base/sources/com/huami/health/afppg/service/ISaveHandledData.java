package com.huami.health.afppg.service;

import com.huami.health.afppg.data.local.bean.AFibData;
import com.huami.health.afppg.data.local.bean.HREventData;
import com.huami.health.afppg.data.local.bean.RRPeak;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0016\u0010\t\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H&J\u0016\u0010\f\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002H&¨\u0006\r"}, d2 = {"Lcom/huami/health/afppg/service/ISaveHandledData;", "", "", "Lcom/huami/health/afppg/data/local/bean/AFibData;", "aFibList", "", "onHandleAFibFinished", "Lcom/huami/health/afppg/data/local/bean/RRPeak;", "rrPeakList", "onHandleRRFinished", "Lcom/huami/health/afppg/data/local/bean/HREventData;", "hrEventList", "onHandleHRFinished", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public interface ISaveHandledData {
    void onHandleAFibFinished(@NotNull List<AFibData> aFibList);

    void onHandleHRFinished(@NotNull List<HREventData> hrEventList);

    void onHandleRRFinished(@NotNull List<RRPeak> rrPeakList);
}
