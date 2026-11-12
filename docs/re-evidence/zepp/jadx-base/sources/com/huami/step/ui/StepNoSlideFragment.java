package com.huami.step.ui;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.hmchartui.utils.Constant;
import com.huami.step.R;
import defpackage.UtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/step/ui/StepNoSlideFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "<init>", "()V", "Companion", "step_release"}, k = 1, mv = {1, 5, 1})
public final class StepNoSlideFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/step/ui/StepNoSlideFragment$Companion;", "", "", "userId", "Lcom/huami/step/ui/StepNoSlideFragment;", "newInstance", "<init>", "()V", "step_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final StepNoSlideFragment newInstance(@NotNull String userId) {
            StepNoSlideFragment stepNoSlideFragment = new StepNoSlideFragment();
            Bundle bundle = new Bundle();
            bundle.putString(Constant.USER_ID, userId);
            Unit unit = Unit.INSTANCE;
            stepNoSlideFragment.setArguments(bundle);
            return stepNoSlideFragment;
        }
    }

    public StepNoSlideFragment() {
        super(R.layout.step_fragement_no_slide);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        String string;
        super.onViewCreated(view, savedInstanceState);
        getChildFragmentManager().beginTransaction().add(R.id.frgStepGame, UtilsKt.isMifitApp() ? new MifitStepGameFragment() : new StepGameFragment()).commit();
        Bundle arguments = getArguments();
        String str = "";
        if (arguments != null && (string = arguments.getString(Constant.USER_ID)) != null) {
            str = string;
        }
        if (UtilsKt.isMifitApp()) {
            getChildFragmentManager().beginTransaction().add(R.id.fgv_step_compare_day, StepCompareDayFragment.INSTANCE.newInstance(str)).commit();
        }
        getChildFragmentManager().beginTransaction().add(R.id.fgv_step_goal, StepCompareGoalFragment.INSTANCE.newInstance()).commit();
        FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        int i = R.id.fgv_step_compare_week;
        StepCompareFragment.Companion companion = StepCompareFragment.INSTANCE;
        fragmentTransactionBeginTransaction.add(i, companion.newInstance(str, 17)).commit();
        getChildFragmentManager().beginTransaction().add(R.id.fgv_step_compare_month, companion.newInstance(str, 18)).commit();
    }
}
