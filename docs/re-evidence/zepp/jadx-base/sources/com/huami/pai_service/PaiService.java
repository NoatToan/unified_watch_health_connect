package com.huami.pai_service;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J8\u0010\u000b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H&J*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0010"}, d2 = {"Lcom/huami/pai_service/PaiService;", "", "", GoogleApiAvailabilityLight.b, "defaultCount", "Ljava/util/Date;", "nowDate", "Lkotlinx/coroutines/flow/Flow;", "", "", "", "loadRecentPaiList", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/pai_service/PaiInfo;", "loadTodayPaiStatu", "pai-service_release"}, k = 1, mv = {1, 5, 1})
public interface PaiService {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ Flow loadRecentPaiList$default(PaiService paiService, int i, int i2, Date date, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadRecentPaiList");
            }
            if ((i3 & 2) != 0) {
                i2 = 15;
            }
            if ((i3 & 4) != 0) {
                date = new Date();
            }
            return paiService.loadRecentPaiList(i, i2, date);
        }

        public static /* synthetic */ Flow loadTodayPaiStatu$default(PaiService paiService, Context context, int i, Date date, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadTodayPaiStatu");
            }
            if ((i2 & 2) != 0) {
                i = 15;
            }
            if ((i2 & 4) != 0) {
                date = new Date();
            }
            return paiService.loadTodayPaiStatu(context, i, date);
        }
    }

    @NotNull
    Flow<Map<Long, Float>> loadRecentPaiList(int n, int defaultCount, @NotNull Date nowDate);

    @NotNull
    Flow<PaiInfo> loadTodayPaiStatu(@NotNull Context context, int defaultCount, @NotNull Date nowDate);
}
