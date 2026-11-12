package com.xiaomi.fitness.baseui.extension;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a2\u0010\f\u001a\u00020\t\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00010\u0010*|\u0010\u0000\u001a\u0004\b\u0000\u0010\u0001\"8\u0012\u0004\u0012\u0002H\u0001\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u000228\u0012\u0004\u0012\u0002H\u0001\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0002*|\u0010\n\u001a\u0004\b\u0000\u0010\u0001\"8\u0012\u0004\u0012\u0002H\u0001\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u000b0\u000228\u0012\u0004\u0012\u0002H\u0001\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u000b0\u0002¨\u0006\u0011"}, d2 = {"OnItemListener", "T", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "position", "Landroid/view/View;", "itemView", "", "OnItemLongListener", "", "replaceAt", "", "index", "replace", "Lkotlin/Function1;", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RecycleViewExtKt {
    public static final <T> void replaceAt(@NotNull List<T> list, int i, @NotNull Function1<? super T, ? extends T> replace) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(replace, "replace");
        list.set(i, replace.invoke(list.get(i)));
    }
}
