package com.huami.message.paging;

import android.content.Context;
import android.content.SharedPreferences;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/huami/message/paging/PagingKeyCache;", "", "Landroid/content/SharedPreferences;", "a", "", "pageId", "nextPageKey", "", "saveKey", "getKey", "clearKey", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Companion", "common-message_release"}, k = 1, mv = {1, 5, 1})
public final class PagingKeyCache {

    @NotNull
    private static final String b = "Message_PagingKey";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    public PagingKeyCache(@NotNull Context context) {
        this.context = context;
    }

    private final SharedPreferences a() {
        return this.context.getSharedPreferences(b, 0);
    }

    public final void clearKey(@NotNull String pageId) {
        a().edit().remove(pageId).apply();
    }

    @Nullable
    public final String getKey(@NotNull String pageId) {
        return a().getString(pageId, null);
    }

    public final void saveKey(@NotNull String pageId, @Nullable String nextPageKey) {
        a().edit().putString(pageId, nextPageKey).apply();
    }
}
