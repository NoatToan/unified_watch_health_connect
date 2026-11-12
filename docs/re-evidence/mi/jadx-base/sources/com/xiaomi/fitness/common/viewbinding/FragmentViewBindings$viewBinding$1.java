package com.xiaomi.fitness.common.viewbinding;

import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
public /* synthetic */ class FragmentViewBindings$viewBinding$1 extends FunctionReferenceImpl implements Function1<Fragment, View> {
    public static final FragmentViewBindings$viewBinding$1 INSTANCE = new FragmentViewBindings$viewBinding$1();

    public FragmentViewBindings$viewBinding$1() {
        super(1, Fragment.class, "requireView", "requireView()Landroid/view/View;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final View invoke2(Fragment p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return p0.requireView();
    }
}
