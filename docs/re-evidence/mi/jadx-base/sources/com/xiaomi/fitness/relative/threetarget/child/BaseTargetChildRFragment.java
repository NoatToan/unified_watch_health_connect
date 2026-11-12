package com.xiaomi.fitness.relative.threetarget.child;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import androidx.lifecycle.ViewModelProvider;
import com.mibi.sdk.component.params.SdkContants;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.relative.threetarget.child.BaseTargetChildRFragment;
import com.xiaomi.fitness.relative.threetarget.viewmodel.DataRegularTargetViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J\u0012\u0010\r\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H&R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/relative/threetarget/child/BaseTargetChildRFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "<init>", "()V", "mRegularTargetViewModel", "Lcom/xiaomi/fitness/relative/threetarget/viewmodel/DataRegularTargetViewModel;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", LifecycleConstantKt.ON_START, "initView", "bindReport", "targetReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseTargetChildRFragment extends BaseFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private DataRegularTargetViewModel mRegularTargetViewModel;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/relative/threetarget/child/BaseTargetChildRFragment$Companion;", "", "<init>", "()V", Constants.EXTRA_FROM_SWITCH_FRAGMENT, "", "containerId", "", "clz", "Ljava/lang/Class;", "Lcom/xiaomi/fitness/relative/threetarget/child/BaseTargetChildRFragment;", "tag", "", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void switchFragment(int containerId, @NotNull Class<? extends BaseTargetChildRFragment> clz, @NotNull String tag, @NotNull Bundle bundle, @NotNull FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(clz, "clz");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            k kVarO = fragmentManager.o();
            Intrinsics.checkNotNullExpressionValue(kVarO, "beginTransaction(...)");
            BaseTargetChildRFragment baseTargetChildRFragment = (BaseTargetChildRFragment) fragmentManager.l0(tag);
            if (baseTargetChildRFragment != null) {
                kVarO.F(baseTargetChildRFragment);
                baseTargetChildRFragment.setArguments(bundle);
                kVarO.m();
                return;
            }
            try {
                BaseTargetChildRFragment baseTargetChildRFragmentNewInstance = clz.newInstance();
                Intrinsics.checkNotNull(baseTargetChildRFragmentNewInstance, "null cannot be cast to non-null type com.xiaomi.fitness.relative.threetarget.child.BaseTargetChildRFragment");
                BaseTargetChildRFragment baseTargetChildRFragment2 = baseTargetChildRFragmentNewInstance;
                baseTargetChildRFragment2.setArguments(bundle);
                kVarO.x(containerId, baseTargetChildRFragment2, tag);
            } catch (Fragment.InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            }
            kVarO.m();
        }
    }

    public BaseTargetChildRFragment() {
        super(0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(BaseTargetChildRFragment this$0, DailyGoalReport dailyGoalReport) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.isInvalid()) {
            Intrinsics.checkNotNull(dailyGoalReport);
            this$0.bindReport(dailyGoalReport);
        }
        return Unit.INSTANCE;
    }

    public abstract void bindReport(@NotNull DailyGoalReport targetReport);

    public void initView(@Nullable View view) {
        setStatusBarFontBlack(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        DataRegularTargetViewModel dataRegularTargetViewModel = (DataRegularTargetViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(DataRegularTargetViewModel.class);
        this.mRegularTargetViewModel = dataRegularTargetViewModel;
        Intrinsics.checkNotNull(dataRegularTargetViewModel);
        dataRegularTargetViewModel.getRegularTargetReport().observe(requireActivity(), new BaseTargetChildRFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: me2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseTargetChildRFragment.onStart$lambda$0(this.f26052a, (DailyGoalReport) obj);
            }
        }));
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
    }
}
