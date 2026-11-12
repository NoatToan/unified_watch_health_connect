package com.xiaomi.fitness.pay.order;

import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.utils.UIUtils;
import defpackage.tji;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"setUpBasicUi", "", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "pay_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TabFragmentUtilKt {
    public static final void setUpBasicUi(@NotNull BaseFragment baseFragment) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        baseFragment.setTitle("");
        baseFragment.setActionBarDisplayable(false);
        UIUtils uIUtils = UIUtils.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = baseFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        uIUtils.setNavigationBarColor(fragmentActivityRequireActivity, tji.f34766b);
        baseFragment.setTitleBackground(tji.f34766b);
    }
}
