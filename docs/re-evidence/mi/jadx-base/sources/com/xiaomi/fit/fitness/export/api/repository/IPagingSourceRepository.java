package com.xiaomi.fit.fitness.export.api.repository;

import androidx.paging.PagingSource;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lcom/xiaomi/fit/fitness/export/api/repository/IPagingSourceRepository;", "T", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "", "getAllRecordDetailPagingSource", "Landroidx/paging/PagingSource;", "", "params", "Lcom/xiaomi/fit/fitness/export/api/repository/PagingSourceParams;", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IPagingSourceRepository<T extends DailyRecordItem> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ PagingSource getAllRecordDetailPagingSource$default(IPagingSourceRepository iPagingSourceRepository, PagingSourceParams pagingSourceParams, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllRecordDetailPagingSource");
            }
            if ((i & 1) != 0) {
                pagingSourceParams = null;
            }
            return iPagingSourceRepository.getAllRecordDetailPagingSource(pagingSourceParams);
        }
    }

    @NotNull
    PagingSource<Long, T> getAllRecordDetailPagingSource(@Nullable PagingSourceParams params);
}
