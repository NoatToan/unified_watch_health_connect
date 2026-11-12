package com.huami.wallet.ui.helper;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u001e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000¨\u0006\u0005"}, d2 = {"", "hostUrl", "userId", "aid", "getGoWebUrl", "core-ui_release"}, k = 2, mv = {1, 5, 1})
public final class InvoiceIntroduceHelperKt {
    @NotNull
    public static final String getGoWebUrl(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        return str + "t/posts/mifit?meta_key=aid&category=1&adcode=110100&userid=" + str2 + "&meta_value=" + str3;
    }
}
