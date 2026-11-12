package com.huami.step.ui;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.hmchartui.utils.Constant;
import com.huami.step.R;
import com.huami.step.utils.ConstantValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/step/ui/StepChartFragmentManager;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "<init>", "()V", "Companion", "step_release"}, k = 1, mv = {1, 5, 1})
public final class StepChartFragmentManager extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¨\u0006\r"}, d2 = {"Lcom/huami/step/ui/StepChartFragmentManager$Companion;", "", "", "userId", "", "time", "", "timeType", "pos", "Lcom/huami/step/ui/StepChartFragmentManager;", "newInstance", "<init>", "()V", "step_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final StepChartFragmentManager newInstance(@NotNull String userId, long time, int timeType, int pos) {
            StepChartFragmentManager stepChartFragmentManager = new StepChartFragmentManager();
            Bundle bundle = new Bundle();
            bundle.putString(Constant.USER_ID, userId);
            bundle.putLong(Constant.KEY_TIME, time);
            bundle.putInt(ConstantValue.KEY_POS, pos);
            bundle.putInt(Constant.KEY_TIME_TYPE, timeType);
            Unit unit = Unit.INSTANCE;
            stepChartFragmentManager.setArguments(bundle);
            return stepChartFragmentManager;
        }
    }

    public StepChartFragmentManager() {
        super(R.layout.step_chart_fragment_manager);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        String string;
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        String str = "";
        if (arguments != null && (string = arguments.getString(Constant.USER_ID)) != null) {
            str = string;
        }
        Bundle arguments2 = getArguments();
        Long lValueOf = arguments2 == null ? null : Long.valueOf(arguments2.getLong(Constant.KEY_TIME));
        long jCurrentTimeMillis = lValueOf == null ? System.currentTimeMillis() : lValueOf.longValue();
        Bundle arguments3 = getArguments();
        int i = arguments3 == null ? 16 : arguments3.getInt(Constant.KEY_TIME_TYPE);
        Bundle arguments4 = getArguments();
        int i2 = arguments4 == null ? 0 : arguments4.getInt(ConstantValue.KEY_POS);
        if (getChildFragmentManager().findFragmentByTag(StepChartFragment.class.getName()) == null) {
            getChildFragmentManager().beginTransaction().add(R.id.fragment_container_chart, StepChartFragment.INSTANCE.newInstance(str, jCurrentTimeMillis, i, i2), StepChartFragment.class.getName()).commit();
        }
        if (i == 16 && getChildFragmentManager().findFragmentByTag(StepChartCompareFragment.class.getName()) == null) {
            getChildFragmentManager().beginTransaction().add(R.id.fragment_container_other, StepChartCompareFragment.INSTANCE.newInstance(str, jCurrentTimeMillis), StepChartCompareFragment.class.getName()).commit();
        }
    }
}
