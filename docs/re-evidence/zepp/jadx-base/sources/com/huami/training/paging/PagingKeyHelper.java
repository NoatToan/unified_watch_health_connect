package com.huami.training.paging;

import com.huami.training.vo.FilterInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0004H&J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\n\u0010\u0006J\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u000b\u0010\bJ\b\u0010\f\u001a\u00020\u0004H&J!\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&¨\u0006\u0014"}, d2 = {"Lcom/huami/training/paging/PagingKeyHelper;", "", "", "key", "", "setPagingKey", "(Ljava/lang/Long;)V", "getPagingKey", "()Ljava/lang/Long;", "resetPagingKey", "setKanKanPagingKey", "getKanKanPagingKey", "resetKanKanPagingKey", "Lcom/huami/training/vo/FilterInfo;", "filterInfo", "setFilterPagingKey", "(Lcom/huami/training/vo/FilterInfo;Ljava/lang/Long;)V", "getFilterPagingKey", "(Lcom/huami/training/vo/FilterInfo;)Ljava/lang/Long;", "resetFilterPagingKey", "lib_release"}, k = 1, mv = {1, 5, 1})
public interface PagingKeyHelper {
    @Nullable
    Long getFilterPagingKey(@NotNull FilterInfo filterInfo);

    @Nullable
    Long getKanKanPagingKey();

    @Nullable
    Long getPagingKey();

    void resetFilterPagingKey(@NotNull FilterInfo filterInfo);

    void resetKanKanPagingKey();

    void resetPagingKey();

    void setFilterPagingKey(@NotNull FilterInfo filterInfo, @Nullable Long key);

    void setKanKanPagingKey(@Nullable Long key);

    void setPagingKey(@Nullable Long key);
}
