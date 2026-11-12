package com.google.accompanist.insets;

import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000\"\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "Lcom/google/accompanist/insets/WindowInsets$Type;", "types", "derivedWindowInsetsTypeOf", "([Lcom/google/accompanist/insets/WindowInsets$Type;)Lcom/google/accompanist/insets/WindowInsets$Type;", "insets_release"}, k = 2, mv = {1, 5, 1})
public final class WindowInsetsTypeKt {
    @NotNull
    public static final WindowInsets.Type derivedWindowInsetsTypeOf(@NotNull WindowInsets.Type... typeArr) {
        return new a((WindowInsets.Type[]) Arrays.copyOf(typeArr, typeArr.length));
    }
}
