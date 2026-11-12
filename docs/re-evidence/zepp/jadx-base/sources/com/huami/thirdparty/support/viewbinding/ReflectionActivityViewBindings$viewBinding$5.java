package com.huami.thirdparty.support.viewbinding;

import android.app.Activity;
import android.view.View;
import com.huami.thirdparty.support.viewbinding.internal.DefaultActivityViewBingingRootProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
public /* synthetic */ class ReflectionActivityViewBindings$viewBinding$5 extends FunctionReferenceImpl implements Function1<Activity, View> {
    public ReflectionActivityViewBindings$viewBinding$5(DefaultActivityViewBingingRootProvider defaultActivityViewBingingRootProvider) {
        super(1, defaultActivityViewBingingRootProvider, DefaultActivityViewBingingRootProvider.class, "findRootView", "findRootView(Landroid/app/Activity;)Landroid/view/View;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final View invoke(@NotNull Activity activity) {
        return ((DefaultActivityViewBingingRootProvider) this.receiver).findRootView(activity);
    }
}
