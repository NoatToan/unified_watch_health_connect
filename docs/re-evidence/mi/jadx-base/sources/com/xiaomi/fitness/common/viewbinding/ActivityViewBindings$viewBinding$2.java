package com.xiaomi.fitness.common.viewbinding;

import android.view.View;
import androidx.p004activity.ComponentActivity;
import defpackage.bsq;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Add missing generic type declarations: [A, T] */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
public final class ActivityViewBindings$viewBinding$2<A, T> implements Function1<A, T> {
    final /* synthetic */ Function1<View, T> $vbFactory;
    final /* synthetic */ Function1<A, View> $viewProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityViewBindings$viewBinding$2(Function1<? super View, ? extends T> function1, Function1<? super A, ? extends View> function2) {
        this.$vbFactory = function1;
        this.$viewProvider = function2;
    }

    /* JADX WARN: Incorrect return type in method signature: (TA;)TT; */
    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final bsq invoke2(ComponentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return (bsq) this.$vbFactory.invoke2(this.$viewProvider.invoke2(activity));
    }
}
