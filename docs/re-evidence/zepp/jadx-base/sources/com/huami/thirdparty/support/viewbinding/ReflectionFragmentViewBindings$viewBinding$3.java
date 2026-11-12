package com.huami.thirdparty.support.viewbinding;

import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
public /* synthetic */ class ReflectionFragmentViewBindings$viewBinding$3 extends FunctionReferenceImpl implements Function1<Fragment, View> {
    public static final ReflectionFragmentViewBindings$viewBinding$3 INSTANCE = new ReflectionFragmentViewBindings$viewBinding$3();

    public ReflectionFragmentViewBindings$viewBinding$3() {
        super(1, Fragment.class, "requireView", "requireView()Landroid/view/View;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final View invoke(@NotNull Fragment fragment) {
        return fragment.requireView();
    }
}
