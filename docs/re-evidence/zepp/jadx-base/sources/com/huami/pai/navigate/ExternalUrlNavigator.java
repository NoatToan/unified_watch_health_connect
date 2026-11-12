package com.huami.pai.navigate;

import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\u0005"}, d2 = {"Lcom/huami/pai/navigate/ExternalUrlNavigator;", "Lcom/huami/pai/navigate/ExternalNavigator;", "Lkotlinx/coroutines/flow/Flow;", "", "getUrl", "lib_release"}, k = 1, mv = {1, 5, 1})
public interface ExternalUrlNavigator extends ExternalNavigator {
    @NotNull
    Flow<String> getUrl();
}
