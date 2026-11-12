package com.xiaomi.fitness.account.user;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u0018\u0010\b\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\tH\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/account/user/StringJsonArrayCoverter;", "", "<init>", "()V", "stringToJsonArray", "", "", "dids", "JsonArrayToString", "", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StringJsonArrayCoverter {
    @NotNull
    public final String JsonArrayToString(@Nullable List<String> dids) {
        return dids == null ? toString() : CollectionsKt___CollectionsKt.joinToString$default(dids, null, null, null, 0, null, null, 63, null);
    }

    @NotNull
    public final List<String> stringToJsonArray(@Nullable String dids) {
        return dids == null ? new ArrayList() : CollectionsKt___CollectionsKt.toMutableList((Collection) StringsKt__StringsKt.split$default((CharSequence) dids, new String[]{", "}, false, 0, 6, (Object) null));
    }
}
