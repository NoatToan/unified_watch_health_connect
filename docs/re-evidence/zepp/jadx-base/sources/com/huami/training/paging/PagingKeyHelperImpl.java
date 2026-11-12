package com.huami.training.paging;

import android.content.Context;
import android.content.SharedPreferences;
import com.huami.tools.analytics.DbUtils;
import com.huami.training.vo.FilterInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\r\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\nH\u0016J\u0019\u0010\u0010\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\b\u0010\u0012\u001a\u00020\nH\u0016J!\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/huami/training/paging/PagingKeyHelperImpl;", "Lcom/huami/training/paging/PagingKeyHelper;", "Landroid/content/SharedPreferences;", "b", "Lcom/huami/training/vo/FilterInfo;", "filterInfo", "", "a", "", "key", "", "setPagingKey", "(Ljava/lang/Long;)V", "getPagingKey", "()Ljava/lang/Long;", "resetPagingKey", "setKanKanPagingKey", "getKanKanPagingKey", "resetKanKanPagingKey", "setFilterPagingKey", "(Lcom/huami/training/vo/FilterInfo;Ljava/lang/Long;)V", "getFilterPagingKey", "(Lcom/huami/training/vo/FilterInfo;)Ljava/lang/Long;", "resetFilterPagingKey", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PagingKeyHelperImpl implements PagingKeyHelper {

    @NotNull
    private static final String b = "pagingKey";

    @NotNull
    private static final String c = "key";

    @NotNull
    private static final String d = "kankan_key";

    @NotNull
    private static final String e = "filter_key";
    private static final long f = -1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    public PagingKeyHelperImpl(@NotNull Context context) {
        this.context = context;
    }

    private final String a(FilterInfo filterInfo) {
        return "filter_key_" + filterInfo.getFilterMode() + '_' + filterInfo.getOrder();
    }

    private final SharedPreferences b() {
        return this.context.getSharedPreferences(b, 0);
    }

    @Override // com.huami.training.paging.PagingKeyHelper
    @Nullable
    public Long getFilterPagingKey(@NotNull FilterInfo filterInfo) {
        long j = b().getLong(a(filterInfo), -1L);
        if (j != -1) {
            return Long.valueOf(j);
        }
        return null;
    }

    @Override // com.huami.training.paging.PagingKeyHelper
    @Nullable
    public Long getKanKanPagingKey() {
        long j = b().getLong(d, -1L);
        if (j != -1) {
            return Long.valueOf(j);
        }
        return null;
    }

    @Override // com.huami.training.paging.PagingKeyHelper
    @Nullable
    public Long getPagingKey() {
        long j = b().getLong("key", -1L);
        if (j != -1) {
            return Long.valueOf(j);
        }
        return null;
    }

    @Override // com.huami.training.paging.PagingKeyHelper
    public void resetFilterPagingKey(@NotNull FilterInfo filterInfo) {
        setFilterPagingKey(filterInfo, -1L);
    }

    @Override // com.huami.training.paging.PagingKeyHelper
    public void resetKanKanPagingKey() {
        setKanKanPagingKey(-1L);
    }

    @Override // com.huami.training.paging.PagingKeyHelper
    public void resetPagingKey() {
        b().edit().putLong("key", -1L).apply();
    }

    @Override // com.huami.training.paging.PagingKeyHelper
    public void setFilterPagingKey(@NotNull FilterInfo filterInfo, @Nullable Long key) {
        b().edit().putLong(a(filterInfo), key == null ? -1L : key.longValue()).apply();
    }

    @Override // com.huami.training.paging.PagingKeyHelper
    public void setKanKanPagingKey(@Nullable Long key) {
        b().edit().putLong(d, key == null ? -1L : key.longValue()).apply();
    }

    @Override // com.huami.training.paging.PagingKeyHelper
    public void setPagingKey(@Nullable Long key) {
        b().edit().putLong("key", key == null ? -1L : key.longValue()).apply();
    }
}
