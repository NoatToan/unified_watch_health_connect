package com.xiaomi.hm.health.bodyfat.slimming.view;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.databinding.ActivityLoseWeightPlanEnterBinding;
import com.xiaomi.hm.health.bodyfat.slimming.repo.LoseWeightPlan;
import com.xiaomi.hm.health.bodyfat.slimming.view.LoseWeightPlanEnterActivity;
import com.xiaomi.hm.health.bodyfat.slimming.viewmodel.LoseWeightPlanEnterViewModel;
import com.xiaomi.hm.health.bodyfat.utils.BFTitleStyleKt;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\b\u0010\t\u001a\u00020\u0004H\u0016J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\r\u001a\u00020\u0004H\u0016R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/slimming/view/LoseWeightPlanEnterActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "showGoalFragment", "showSportTypeFragment", "showResultFragment", "onLeftClicked", "Landroid/view/View$OnClickListener;", "onRightImageClick", "setRightMenuClick", "onBackPressed", "Lcom/xiaomi/hm/health/bodyfat/databinding/ActivityLoseWeightPlanEnterBinding;", "x", "Lcom/xiaomi/hm/health/bodyfat/databinding/ActivityLoseWeightPlanEnterBinding;", "binding", "Lcom/xiaomi/hm/health/bodyfat/slimming/viewmodel/LoseWeightPlanEnterViewModel;", "y", "Lkotlin/Lazy;", "m", "()Lcom/xiaomi/hm/health/bodyfat/slimming/viewmodel/LoseWeightPlanEnterViewModel;", "viewModel", "<init>", "()V", "Companion", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class LoseWeightPlanEnterActivity extends BaseTitleActivity {

    @NotNull
    public static final String GOAL_PAGE = "goalPage";

    @NotNull
    public static final String RESULT_PAGE = "resultPage";

    @NotNull
    public static final String SPORT_TYPE_PAGE = "sportTypePage";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private ActivityLoseWeightPlanEnterBinding binding;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX WARN: Multi-variable type inference failed */
    public LoseWeightPlanEnterActivity() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.bodyfat.slimming.view.LoseWeightPlanEnterActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<LoseWeightPlanEnterViewModel>() { // from class: com.xiaomi.hm.health.bodyfat.slimming.view.LoseWeightPlanEnterActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.xiaomi.hm.health.bodyfat.slimming.viewmodel.LoseWeightPlanEnterViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final LoseWeightPlanEnterViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(LoseWeightPlanEnterViewModel.class), function0, objArr);
            }
        });
    }

    private final LoseWeightPlanEnterViewModel m() {
        return (LoseWeightPlanEnterViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(LoseWeightPlanEnterActivity loseWeightPlanEnterActivity, LoseWeightPlan loseWeightPlan) {
        if (loseWeightPlan == null) {
            ActivityLoseWeightPlanEnterBinding activityLoseWeightPlanEnterBinding = loseWeightPlanEnterActivity.binding;
            Objects.requireNonNull(activityLoseWeightPlanEnterBinding);
            activityLoseWeightPlanEnterBinding.loading.setVisibility(8);
            loseWeightPlanEnterActivity.showGoalFragment();
            return;
        }
        ActivityLoseWeightPlanEnterBinding activityLoseWeightPlanEnterBinding2 = loseWeightPlanEnterActivity.binding;
        Objects.requireNonNull(activityLoseWeightPlanEnterBinding2);
        activityLoseWeightPlanEnterBinding2.loading.setVisibility(8);
        loseWeightPlanEnterActivity.m().setCurrentLoseWeightPlan(loseWeightPlan);
        loseWeightPlanEnterActivity.showResultFragment();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        if (fragments.size() == 0 || fragments.size() == 1) {
            finish();
            return;
        }
        super.onBackPressed();
        if (getSupportFragmentManager().getFragments().size() != 1 || getSupportFragmentManager().findFragmentByTag(RESULT_PAGE) == null) {
            return;
        }
        BFTitleStyleKt.setUnifyTitleStyle$default(this, getString(R.string.lose_weight_mine), null, 2, null);
        setRightImageRes(R.drawable.icon_more, R.color.black);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        BFTitleStyleKt.setDefaultTheme(this);
        super.onCreate(savedInstanceState);
        ActivityLoseWeightPlanEnterBinding activityLoseWeightPlanEnterBindingInflate = ActivityLoseWeightPlanEnterBinding.inflate(getLayoutInflater());
        this.binding = activityLoseWeightPlanEnterBindingInflate;
        Objects.requireNonNull(activityLoseWeightPlanEnterBindingInflate);
        setContentView(activityLoseWeightPlanEnterBindingInflate.getRoot());
        getTitleTextView().setTextSize(17.0f);
        m().loadLoseWeightSetting();
        m().getLoseWeightPlan().observe(this, new Observer() { // from class: it4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                LoseWeightPlanEnterActivity.n(this.a, (LoseWeightPlan) obj);
            }
        });
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onLeftClicked() {
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        if (fragments.size() == 1 || fragments.size() == 0) {
            finish();
            return;
        }
        getSupportFragmentManager().popBackStackImmediate();
        if (getSupportFragmentManager().getFragments().size() != 1 || getSupportFragmentManager().findFragmentByTag(RESULT_PAGE) == null) {
            return;
        }
        BFTitleStyleKt.setUnifyTitleStyle$default(this, getString(R.string.lose_weight_mine), null, 2, null);
        setRightImageRes(R.drawable.icon_more, R.color.black);
    }

    public final void setRightMenuClick(@NotNull View.OnClickListener onRightImageClick) {
        getRightImage().setOnClickListener(onRightImageClick);
    }

    public final void showGoalFragment() {
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.addToBackStack(GOAL_PAGE);
        fragmentTransactionBeginTransaction.add(R.id.slimming_fragment_container, new LoseWeightPlanGoalFragment(), GOAL_PAGE);
        fragmentTransactionBeginTransaction.commit();
        BFTitleStyleKt.setUnifyTitleStyle$default(this, getString(R.string.lose_weight_plan_title), null, 2, null);
    }

    public final void showResultFragment() {
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.replace(R.id.slimming_fragment_container, new MyLoseWeightPlanFragment(), RESULT_PAGE);
        fragmentTransactionBeginTransaction.commit();
        BFTitleStyleKt.setUnifyTitleStyle$default(this, getString(R.string.lose_weight_mine), null, 2, null);
        setRightImageRes(R.drawable.icon_more, R.color.black);
    }

    public final void showSportTypeFragment() {
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.addToBackStack(SPORT_TYPE_PAGE);
        fragmentTransactionBeginTransaction.add(R.id.slimming_fragment_container, new LoseWeightSelectSportFragment(), SPORT_TYPE_PAGE);
        fragmentTransactionBeginTransaction.commit();
        BFTitleStyleKt.setUnifyTitleStyle$default(this, getString(R.string.lose_weight_plan_title), null, 2, null);
    }
}
