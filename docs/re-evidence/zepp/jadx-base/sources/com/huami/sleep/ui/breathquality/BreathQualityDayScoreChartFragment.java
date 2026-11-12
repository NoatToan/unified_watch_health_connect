package com.huami.sleep.ui.breathquality;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleep.R;
import com.huami.sleep.model.BreathQualityRiskLevel;
import com.huami.sleep.ui.breathquality.BreathQualityDayScoreChartFragment;
import com.huami.sleep.viewmodel.breathquality.BreathQualityDayScoreViewModel;
import com.huami.sleep.vo.BreathQualityDayScoreVo;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u001d\u0010\u000e\u001a\u00020\t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/huami/sleep/ui/breathquality/BreathQualityDayScoreChartFragment;", "Landroidx/fragment/app/Fragment;", "", "b", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Lcom/huami/sleep/viewmodel/breathquality/BreathQualityDayScoreViewModel;", "a", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lcom/huami/sleep/viewmodel/breathquality/BreathQualityDayScoreViewModel;", "mViewModel", "<init>", "()V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class BreathQualityDayScoreChartFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String b = "user_id";

    @NotNull
    private static final String c = "time";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Lcom/huami/sleep/ui/breathquality/BreathQualityDayScoreChartFragment$Companion;", "", "", "userId", "", "time", "Lcom/huami/sleep/ui/breathquality/BreathQualityDayScoreChartFragment;", "newInstance", "ARGS_TIME", "Ljava/lang/String;", "ARGS_USER_ID", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BreathQualityDayScoreChartFragment newInstance(@NotNull String userId, long time) {
            BreathQualityDayScoreChartFragment breathQualityDayScoreChartFragment = new BreathQualityDayScoreChartFragment();
            Bundle bundle = new Bundle();
            bundle.putLong("time", time);
            bundle.putString("user_id", userId);
            Unit unit = Unit.INSTANCE;
            breathQualityDayScoreChartFragment.setArguments(bundle);
            return breathQualityDayScoreChartFragment;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BreathQualityDayScoreChartFragment() {
        super(R.layout.fragment_breath_quality_score_day);
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.sleep.ui.breathquality.BreathQualityDayScoreChartFragment$special$$inlined$viewModel$default$1
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
        this.mViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<BreathQualityDayScoreViewModel>() { // from class: com.huami.sleep.ui.breathquality.BreathQualityDayScoreChartFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.sleep.viewmodel.breathquality.BreathQualityDayScoreViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final BreathQualityDayScoreViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(BreathQualityDayScoreViewModel.class), function0, objArr);
            }
        });
    }

    private final void b() {
        BreathQualityDayScoreViewModel breathQualityDayScoreViewModelD = d();
        breathQualityDayScoreViewModelD.getScoreShowLifeData().observe(getViewLifecycleOwner(), new Observer() { // from class: f70
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BreathQualityDayScoreChartFragment.c(this.a, (BreathQualityDayScoreVo) obj);
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
        breathQualityDayScoreViewModelD.getScoreShowData(string, arguments.getLong("time"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(BreathQualityDayScoreChartFragment breathQualityDayScoreChartFragment, BreathQualityDayScoreVo breathQualityDayScoreVo) {
        View view = breathQualityDayScoreChartFragment.getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.titleTV))).setText(breathQualityDayScoreVo.getTitle());
        View view2 = breathQualityDayScoreChartFragment.getView();
        ((TextView) (view2 == null ? null : view2.findViewById(R.id.titleTV))).setTextColor(breathQualityDayScoreVo.getTitleColor());
        View view3 = breathQualityDayScoreChartFragment.getView();
        ((TextView) (view3 == null ? null : view3.findViewById(R.id.tipTV))).setText(breathQualityDayScoreVo.getTipStr());
        Context context = breathQualityDayScoreChartFragment.getContext();
        if (context == null) {
            return;
        }
        View view4 = breathQualityDayScoreChartFragment.getView();
        ((TextView) (view4 != null ? view4.findViewById(R.id.titleTV) : null)).setTextColor(BreathQualityRiskLevel.INSTANCE.getTitleColor(context, breathQualityDayScoreVo.getEnumLevel()));
    }

    private final BreathQualityDayScoreViewModel d() {
        return (BreathQualityDayScoreViewModel) this.mViewModel.getValue();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        b();
    }
}
