package com.huami.step.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.huami.step.R;
import com.huami.step.databinding.StepFragmentChartInfoGoalBinding;
import com.huami.step.koin.IStepGoalData;
import com.huami.step.koin.IStepGoalNavigator;
import com.huami.step.koin.KoinExtKt;
import com.huami.step.model.StepGoalInfo;
import com.huami.step.ui.StepCompareGoalFragment;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/huami/step/ui/StepCompareGoalFragment;", "Landroidx/fragment/app/Fragment;", "", "initView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "Lcom/huami/step/databinding/StepFragmentChartInfoGoalBinding;", "a", "Lcom/huami/step/databinding/StepFragmentChartInfoGoalBinding;", "binding", "<init>", "()V", "Companion", "step_release"}, k = 1, mv = {1, 5, 1})
public final class StepCompareGoalFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private StepFragmentChartInfoGoalBinding binding;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/huami/step/ui/StepCompareGoalFragment$Companion;", "", "Lcom/huami/step/ui/StepCompareGoalFragment;", "newInstance", "<init>", "()V", "step_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final StepCompareGoalFragment newInstance() {
            return new StepCompareGoalFragment();
        }
    }

    public StepCompareGoalFragment() {
        super(R.layout.step_fragment_chart_info_goal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(StepCompareGoalFragment stepCompareGoalFragment, View view) {
        IStepGoalNavigator shareNavigator = KoinExtKt.getShareNavigator();
        if (shareNavigator == null) {
            return;
        }
        shareNavigator.navigatorShare(stepCompareGoalFragment.requireActivity());
    }

    private final void initView() {
        IStepGoalData goalInfo = KoinExtKt.getGoalInfo();
        StepGoalInfo goalInfo2 = goalInfo == null ? null : goalInfo.getGoalInfo();
        if (goalInfo2 == null) {
            return;
        }
        StepFragmentChartInfoGoalBinding stepFragmentChartInfoGoalBinding = this.binding;
        Objects.requireNonNull(stepFragmentChartInfoGoalBinding);
        TextView textView = stepFragmentChartInfoGoalBinding.stepGoalAllCountNum;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        int i = R.string.step_goal_num;
        textView.setText(String.format(getString(i), Arrays.copyOf(new Object[]{Integer.valueOf(goalInfo2.getMaxReachGoal())}, 1)));
        StepFragmentChartInfoGoalBinding stepFragmentChartInfoGoalBinding2 = this.binding;
        Objects.requireNonNull(stepFragmentChartInfoGoalBinding2);
        stepFragmentChartInfoGoalBinding2.stepGoalContinueCountNum.setText(String.format(getString(i), Arrays.copyOf(new Object[]{Integer.valueOf(goalInfo2.getCurReachGoal())}, 1)));
        StepFragmentChartInfoGoalBinding stepFragmentChartInfoGoalBinding3 = this.binding;
        Objects.requireNonNull(stepFragmentChartInfoGoalBinding3);
        stepFragmentChartInfoGoalBinding3.stepStageContent.setOnClickListener(new View.OnClickListener() { // from class: lg7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StepCompareGoalFragment.b(this.a, view);
            }
        });
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        this.binding = StepFragmentChartInfoGoalBinding.inflate(inflater, container, false);
        initView();
        StepFragmentChartInfoGoalBinding stepFragmentChartInfoGoalBinding = this.binding;
        Objects.requireNonNull(stepFragmentChartInfoGoalBinding);
        return stepFragmentChartInfoGoalBinding.getRoot();
    }
}
