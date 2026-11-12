package com.huami.healthlabel.ui.custom;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\"*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lkotlin/Function0;", "", "a", "Lkotlin/jvm/functions/Function0;", "getLabelTextViewListener", "()Lkotlin/jvm/functions/Function0;", "setLabelTextViewListener", "(Lkotlin/jvm/functions/Function0;)V", "labelTextViewListener", "healthLabel_release"}, k = 2, mv = {1, 5, 1})
public final class LabelTextViewKt {

    @Nullable
    private static Function0<Unit> a;

    @Nullable
    public static final Function0<Unit> getLabelTextViewListener() {
        return a;
    }

    public static final void setLabelTextViewListener(@Nullable Function0<Unit> function0) {
        a = function0;
    }
}
