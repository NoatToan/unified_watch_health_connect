package com.huami.sleep.ui.breathquality;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.sleep.R;
import com.huami.sleep.ext.ViewExKt;
import com.huami.sleep.ui.breathquality.BreathQualityYearChartFragment;
import com.huami.sleep.util.ViewUtils;
import com.huami.sleep.view.SleepPosCircleView;
import com.huami.sleep.viewmodel.breathquality.BreathQualityYearScoreViewModel;
import com.huami.sleep.vo.BreathQualityYearScoreVo;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u001a\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016R\u001d\u0010\u0014\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/huami/sleep/ui/breathquality/BreathQualityYearChartFragment;", "Landroidx/fragment/app/Fragment;", "", "riskLevelDescRes", "value", "", "unit", "Landroid/text/SpannableString;", "h", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "Lcom/huami/sleep/viewmodel/breathquality/BreathQualityYearScoreViewModel;", "a", "Lkotlin/Lazy;", "g", "()Lcom/huami/sleep/viewmodel/breathquality/BreathQualityYearScoreViewModel;", "mViewModel", "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class BreathQualityYearChartFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String b = "time";

    @NotNull
    private static final String c = "user_id";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Lcom/huami/sleep/ui/breathquality/BreathQualityYearChartFragment$Companion;", "", "", "userId", "", "time", "Lcom/huami/sleep/ui/breathquality/BreathQualityYearChartFragment;", "getInstance", "ARGS_TIME", "Ljava/lang/String;", "ARGS_USER_ID", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BreathQualityYearChartFragment getInstance(@NotNull String userId, long time) {
            BreathQualityYearChartFragment breathQualityYearChartFragment = new BreathQualityYearChartFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("time", time);
            bundle.putString("user_id", userId);
            Unit unit = Unit.INSTANCE;
            breathQualityYearChartFragment.setArguments(bundle);
            return breathQualityYearChartFragment;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BreathQualityYearChartFragment() {
        super(R.layout.fragment_breath_quality_score_year);
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.sleep.ui.breathquality.BreathQualityYearChartFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.mViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<BreathQualityYearScoreViewModel>() { // from class: com.huami.sleep.ui.breathquality.BreathQualityYearChartFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.sleep.viewmodel.breathquality.BreathQualityYearScoreViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final BreathQualityYearScoreViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(BreathQualityYearScoreViewModel.class), function0, objArr);
            }
        });
    }

    private final BreathQualityYearScoreViewModel g() {
        return (BreathQualityYearScoreViewModel) this.mViewModel.getValue();
    }

    private final SpannableString h(@StringRes int riskLevelDescRes, int value, String unit) {
        String string = getString(riskLevelDescRes);
        String str = " " + value + " ";
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str2 = String.format("%1$s%2$s%3$s", Arrays.copyOf(new Object[]{string, str, unit}, 3));
        AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan((int) ViewUtils.sp2px(getContext(), 20.0f));
        SpannableString spannableString = new SpannableString(str2);
        spannableString.setSpan(absoluteSizeSpan, string.length(), string.length() + str.length(), 18);
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(BreathQualityYearChartFragment breathQualityYearChartFragment, BreathQualityYearScoreVo breathQualityYearScoreVo) {
        View view = breathQualityYearChartFragment.getView();
        ((SleepPosCircleView) (view == null ? null : view.findViewById(R.id.riskChart))).setData(breathQualityYearScoreVo.getData());
        View view2 = breathQualityYearChartFragment.getView();
        ((TextView) (view2 != null ? view2.findViewById(R.id.yearTv) : null)).setText(breathQualityYearScoreVo.getYearStr());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(BreathQualityYearChartFragment breathQualityYearChartFragment, Pair pair) {
        View view = breathQualityYearChartFragment.getView();
        ((AppCompatTextView) (view == null ? null : view.findViewById(R.id.normalDayTv))).setText(breathQualityYearChartFragment.h(R.string.risk_level_normal, ((Number) pair.getFirst()).intValue(), (String) pair.getSecond()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(BreathQualityYearChartFragment breathQualityYearChartFragment, Pair pair) {
        View view = breathQualityYearChartFragment.getView();
        ((AppCompatTextView) (view == null ? null : view.findViewById(R.id.lowDayTv))).setText(breathQualityYearChartFragment.h(R.string.risk_level_low, ((Number) pair.getFirst()).intValue(), (String) pair.getSecond()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(BreathQualityYearChartFragment breathQualityYearChartFragment, Pair pair) {
        View view = breathQualityYearChartFragment.getView();
        ((AppCompatTextView) (view == null ? null : view.findViewById(R.id.mediumDayTv))).setText(breathQualityYearChartFragment.h(R.string.risk_level_medium, ((Number) pair.getFirst()).intValue(), (String) pair.getSecond()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(BreathQualityYearChartFragment breathQualityYearChartFragment, Pair pair) {
        View view = breathQualityYearChartFragment.getView();
        ((AppCompatTextView) (view == null ? null : view.findViewById(R.id.highDayTv))).setText(breathQualityYearChartFragment.h(R.string.risk_level_high, ((Number) pair.getFirst()).intValue(), (String) pair.getSecond()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(BreathQualityYearChartFragment breathQualityYearChartFragment, Boolean bool) {
        View view = breathQualityYearChartFragment.getView();
        ViewExKt.setVisible(view == null ? null : view.findViewById(R.id.emptyTv), bool.booleanValue());
        View view2 = breathQualityYearChartFragment.getView();
        ViewExKt.setVisible(view2 != null ? view2.findViewById(R.id.chartRL) : null, !bool.booleanValue());
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        BreathQualityYearScoreViewModel breathQualityYearScoreViewModelG = g();
        breathQualityYearScoreViewModelG.getScoreStatisticLifeData().observe(getViewLifecycleOwner(), new Observer() { // from class: l70
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BreathQualityYearChartFragment.i(this.a, (BreathQualityYearScoreVo) obj);
            }
        });
        breathQualityYearScoreViewModelG.getNormalDays().observe(getViewLifecycleOwner(), new Observer() { // from class: n70
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BreathQualityYearChartFragment.j(this.a, (Pair) obj);
            }
        });
        breathQualityYearScoreViewModelG.getLowDays().observe(getViewLifecycleOwner(), new Observer() { // from class: o70
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BreathQualityYearChartFragment.k(this.a, (Pair) obj);
            }
        });
        breathQualityYearScoreViewModelG.getMediumDays().observe(getViewLifecycleOwner(), new Observer() { // from class: p70
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BreathQualityYearChartFragment.l(this.a, (Pair) obj);
            }
        });
        breathQualityYearScoreViewModelG.getHighDays().observe(getViewLifecycleOwner(), new Observer() { // from class: q70
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BreathQualityYearChartFragment.m(this.a, (Pair) obj);
            }
        });
        breathQualityYearScoreViewModelG.getNoData().observe(getViewLifecycleOwner(), new Observer() { // from class: m70
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BreathQualityYearChartFragment.n(this.a, (Boolean) obj);
            }
        });
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        String string = arguments.getString("user_id");
        if (string == null) {
            string = "";
        }
        breathQualityYearScoreViewModelG.getScoreStatisticData(string, arguments.getLong("time"));
    }
}
