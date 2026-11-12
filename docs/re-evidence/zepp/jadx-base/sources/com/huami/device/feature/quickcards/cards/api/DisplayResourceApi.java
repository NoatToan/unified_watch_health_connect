package com.huami.device.feature.quickcards.cards.api;

import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/huami/device/feature/quickcards/cards/api/DisplayResourceApi;", "", "", "id", "loadIconUrl", "Ljava/util/Locale;", "local", "loadDisplayName", "quick-card-api_release"}, k = 1, mv = {1, 5, 1})
public interface DisplayResourceApi {
    @Nullable
    String loadDisplayName(@NotNull String id, @NotNull Locale local);

    @Nullable
    String loadIconUrl(@NotNull String id);
}
