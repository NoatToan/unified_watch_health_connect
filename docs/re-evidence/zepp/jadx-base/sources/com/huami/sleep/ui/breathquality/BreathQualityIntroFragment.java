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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.sleep.R;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.sleepintrodetail.adapter.SleepBreathQualityIntroAdapter;
import com.huami.sleep.sleepintrodetail.viewmodel.SleepBreathQualityIntroViewModel;
import com.huami.sleep.ui.breathquality.BreathQualityIntroFragment;
import com.huami.sleep.util.SleepStatusAnalytics;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/huami/sleep/ui/breathquality/BreathQualityIntroFragment;", "Landroidx/fragment/app/Fragment;", "", "initView", "c", "loadData", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Lcom/huami/sleep/sleepintrodetail/adapter/SleepBreathQualityIntroAdapter;", "a", "Lkotlin/Lazy;", "e", "()Lcom/huami/sleep/sleepintrodetail/adapter/SleepBreathQualityIntroAdapter;", "mIntroAdapter", "Lcom/huami/sleep/sleepintrodetail/viewmodel/SleepBreathQualityIntroViewModel;", "b", "f", "()Lcom/huami/sleep/sleepintrodetail/viewmodel/SleepBreathQualityIntroViewModel;", "viewModel", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public class BreathQualityIntroFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mIntroAdapter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sleep/sleepintrodetail/adapter/SleepBreathQualityIntroAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<SleepBreathQualityIntroAdapter> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SleepBreathQualityIntroAdapter invoke() {
            return new SleepBreathQualityIntroAdapter();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BreathQualityIntroFragment() {
        super(R.layout.fragment_breath_quality_intro);
        this.mIntroAdapter = LazyKt__LazyJVMKt.lazy(a.a);
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.sleep.ui.breathquality.BreathQualityIntroFragment$special$$inlined$viewModel$default$1
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
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SleepBreathQualityIntroViewModel>() { // from class: com.huami.sleep.ui.breathquality.BreathQualityIntroFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.sleep.sleepintrodetail.viewmodel.SleepBreathQualityIntroViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SleepBreathQualityIntroViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(SleepBreathQualityIntroViewModel.class), function0, objArr);
            }
        });
    }

    private final void c() {
        f().getIntroData().observe(getViewLifecycleOwner(), new Observer() { // from class: h70
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BreathQualityIntroFragment.d(this.a, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(BreathQualityIntroFragment breathQualityIntroFragment, List list) {
        breathQualityIntroFragment.e().addNewData(list);
    }

    private final SleepBreathQualityIntroAdapter e() {
        return (SleepBreathQualityIntroAdapter) this.mIntroAdapter.getValue();
    }

    private final SleepBreathQualityIntroViewModel f() {
        return (SleepBreathQualityIntroViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(BreathQualityIntroFragment breathQualityIntroFragment, View view) {
        KoinExtKt.getPageNavigate().navigateToFeedBack(breathQualityIntroFragment.requireContext(), breathQualityIntroFragment.getChildFragmentManager());
        SleepStatusAnalytics.recordEvent(SleepStatusAnalytics.EventId.SLP_BREATH_FEED_BACK);
    }

    private final void initView() {
        View view = getView();
        RecyclerView recyclerView = (RecyclerView) (view == null ? null : view.findViewById(R.id.funcListView));
        recyclerView.setAdapter(e());
        final Context context = recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(context) { // from class: com.huami.sleep.ui.breathquality.BreathQualityIntroFragment$initView$1$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        View view2 = getView();
        ((TextView) (view2 != null ? view2.findViewById(R.id.feed_back) : null)).setOnClickListener(new View.OnClickListener() { // from class: g70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                BreathQualityIntroFragment.g(this.a, view3);
            }
        });
    }

    private final void loadData() {
        f().getIntroData(requireContext());
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        c();
        loadData();
    }
}
