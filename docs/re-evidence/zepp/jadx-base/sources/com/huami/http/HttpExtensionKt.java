package com.huami.http;

import com.huami.watch.transport.httpsupport.model.DataItem;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lokhttp3/Request;", "", "isPost", "httpkit_release"}, k = 2, mv = {1, 5, 1})
public final class HttpExtensionKt {
    public static final boolean isPost(@NotNull Request request) {
        String lowerCase = request.method().toLowerCase(Locale.ROOT);
        if (lowerCase != null) {
            return Intrinsics.areEqual(StringsKt__StringsKt.trim(lowerCase).toString(), DataItem.HTTP_METHOD_POST);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }
}
