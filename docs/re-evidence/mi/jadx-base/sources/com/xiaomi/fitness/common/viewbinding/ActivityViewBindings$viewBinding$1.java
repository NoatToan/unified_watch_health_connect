package com.xiaomi.fitness.common.viewbinding;

import android.app.Activity;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
public /* synthetic */ class ActivityViewBindings$viewBinding$1 extends FunctionReferenceImpl implements Function1<Activity, View> {
    public static final ActivityViewBindings$viewBinding$1 INSTANCE = new ActivityViewBindings$viewBinding$1();

    public ActivityViewBindings$viewBinding$1() {
        super(1, ViewBindingUtilKt.class, "findRootView", "findRootView(Landroid/app/Activity;)Landroid/view/View;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final View invoke(Activity p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ViewBindingUtilKt.findRootView(p0);
    }
}
