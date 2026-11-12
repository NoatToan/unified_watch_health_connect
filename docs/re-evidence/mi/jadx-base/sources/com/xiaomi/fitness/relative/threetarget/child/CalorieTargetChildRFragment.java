package com.xiaomi.fitness.relative.threetarget.child;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fit.fitness.export.data.aggregation.GoalItem;
import com.xiaomi.fitness.relative.view.TargetRItemView;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jka;
import defpackage.pni;
import defpackage.qxi;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 <2\u00020\u0001:\u0001<B\u0007¢\u0006\u0004\b;\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0014\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR$\u0010!\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010(\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010/\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u00105\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00100\u001a\u0004\b6\u00102\"\u0004\b7\u00104R\u0011\u0010:\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006="}, d2 = {"Lcom/xiaomi/fitness/relative/threetarget/child/CalorieTargetChildRFragment;", "Lcom/xiaomi/fitness/relative/threetarget/child/BaseTargetChildRFragment;", "", "initView", "()V", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "initParamsFromBundle", "(Landroid/os/Bundle;)V", "", "realValue", "targetValue", "createDetailModelList", "(II)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "targetReport", "bindReport", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;)V", "Ljka;", "_binding", "Ljka;", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "titleView", "Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "getTitleView", "()Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;", "setTitleView", "(Lcom/xiaomi/fitness/widget/view/DataTitleSimpleView;)V", "Landroid/widget/LinearLayout;", "itemViewContainer", "Landroid/widget/LinearLayout;", "getItemViewContainer", "()Landroid/widget/LinearLayout;", "setItemViewContainer", "(Landroid/widget/LinearLayout;)V", "Lcom/xiaomi/fitness/relative/view/TargetRItemView;", "itemView1", "Lcom/xiaomi/fitness/relative/view/TargetRItemView;", "getItemView1", "()Lcom/xiaomi/fitness/relative/view/TargetRItemView;", "setItemView1", "(Lcom/xiaomi/fitness/relative/view/TargetRItemView;)V", "itemView2", "getItemView2", "setItemView2", "getBinding", "()Ljka;", "binding", "<init>", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class CalorieTargetChildRFragment extends BaseTargetChildRFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private jka _binding;

    @Nullable
    private TargetRItemView itemView1;

    @Nullable
    private TargetRItemView itemView2;

    @Nullable
    private LinearLayout itemViewContainer;

    @Nullable
    private DataTitleSimpleView titleView;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/relative/threetarget/child/CalorieTargetChildRFragment$Companion;", "", "<init>", "()V", "switchDetailFragment", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void switchDetailFragment(@NotNull FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            BaseTargetChildRFragment.INSTANCE.switchFragment(eri.l1, CalorieTargetChildRFragment.class, "CalorieTargetChildFragment", new Bundle(), fragmentManager);
        }
    }

    private final void createDetailModelList(int realValue, int targetValue) {
        String strValueOf = realValue <= 0 ? "" : String.valueOf(realValue);
        String string = realValue <= 0 ? getString(c0j.kq) : getResources().getQuantityString(qxi.w1, realValue);
        Intrinsics.checkNotNull(string);
        String string2 = getString(c0j.Yl);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        TargetRItemView targetRItemView = this.itemView1;
        if (targetRItemView != null) {
            targetRItemView.bindData(strValueOf, string, string2);
        }
        String strValueOf2 = targetValue > 0 ? String.valueOf(targetValue) : "";
        String string3 = targetValue <= 0 ? getString(c0j.kq) : getResources().getQuantityString(qxi.w1, targetValue);
        Intrinsics.checkNotNull(string3);
        String string4 = getString(c0j.Xl);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        TargetRItemView targetRItemView2 = this.itemView2;
        if (targetRItemView2 != null) {
            targetRItemView2.bindData(strValueOf2, string3, string4);
        }
    }

    private final void initParamsFromBundle(Bundle bundle) {
    }

    private final void initView() {
        initParamsFromBundle(getArguments());
        DataTitleSimpleView dataTitleSimpleView = this.titleView;
        if (dataTitleSimpleView != null) {
            dataTitleSimpleView.bindData(pni.L, getString(c0j.C4));
        }
    }

    @JvmStatic
    public static final void switchDetailFragment(@NotNull FragmentManager fragmentManager) {
        INSTANCE.switchDetailFragment(fragmentManager);
    }

    @Override // com.xiaomi.fitness.relative.threetarget.child.BaseTargetChildRFragment
    public void bindReport(@NotNull DailyGoalReport targetReport) {
        Intrinsics.checkNotNullParameter(targetReport, "targetReport");
        int achievedValue = 0;
        int goalValue = 0;
        for (GoalItem goalItem : targetReport.goalList()) {
            if (goalItem.getType() == 2) {
                achievedValue = goalItem.getAchievedValue();
                goalValue = goalItem.getGoalValue();
            }
        }
        createDetailModelList(achievedValue, goalValue);
    }

    @NotNull
    public final jka getBinding() {
        jka jkaVar = this._binding;
        Intrinsics.checkNotNull(jkaVar);
        return jkaVar;
    }

    @Nullable
    public final TargetRItemView getItemView1() {
        return this.itemView1;
    }

    @Nullable
    public final TargetRItemView getItemView2() {
        return this.itemView2;
    }

    @Nullable
    public final LinearLayout getItemViewContainer() {
        return this.itemViewContainer;
    }

    @Nullable
    public final DataTitleSimpleView getTitleView() {
        return this.titleView;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        this._binding = jka.A0(inflater, container, false);
        this.titleView = getBinding().A;
        this.itemViewContainer = getBinding().B;
        this.itemView1 = getBinding().C;
        this.itemView2 = getBinding().D;
        View root = getBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.xiaomi.fitness.relative.threetarget.child.BaseTargetChildRFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
    }

    public final void setItemView1(@Nullable TargetRItemView targetRItemView) {
        this.itemView1 = targetRItemView;
    }

    public final void setItemView2(@Nullable TargetRItemView targetRItemView) {
        this.itemView2 = targetRItemView;
    }

    public final void setItemViewContainer(@Nullable LinearLayout linearLayout) {
        this.itemViewContainer = linearLayout;
    }

    public final void setTitleView(@Nullable DataTitleSimpleView dataTitleSimpleView) {
        this.titleView = dataTitleSimpleView;
    }
}
