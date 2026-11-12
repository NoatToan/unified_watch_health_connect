package com.huami.bloodpressure_ui.analyse;

import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bloodpressure_core.di.KoinExKt;
import com.huami.bloodpressure_core.url.IBPResearchConfig;
import com.huami.bloodpressure_ui.R;
import com.huami.bloodpressure_ui.analyse.AnalyseFragment;
import com.huami.bloodpressure_ui.databinding.FragmentAnalyseBinding;
import com.huami.bloodpressure_ui.databinding.ItemAnalyseBinding;
import com.huami.bloodpressure_ui.ext.ViewExKt;
import com.huami.viewbindingx.BindViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.ViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.huami.viewbindingx.viewholder.ViewHolderBindingsKt;
import com.huami.widget.toast.CustomToast;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 !2\u00020\u0001:\u0003\"#!B\u0007¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017J\u0014\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001d\u0010\u0015\u001a\u00020\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001a\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001e\u001a\u00020\u001b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001c\u0010\u001d¨\u0006$"}, d2 = {"Lcom/huami/bloodpressure_ui/analyse/AnalyseFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "", "Lcom/huami/bloodpressure_ui/analyse/AnalyseItemEntity;", "list", "setDataList", "", "a", "Ljava/lang/String;", "ANALYSE_TITLE", "Lcom/huami/bloodpressure_ui/databinding/FragmentAnalyseBinding;", "b", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "c", "()Lcom/huami/bloodpressure_ui/databinding/FragmentAnalyseBinding;", "binding", "Lcom/huami/bloodpressure_ui/analyse/AnalyseViewModel;", "Lkotlin/Lazy;", "e", "()Lcom/huami/bloodpressure_ui/analyse/AnalyseViewModel;", "viewModel", "Lcom/huami/bloodpressure_core/url/IBPResearchConfig;", GoogleApiAvailabilityLight.a, "()Lcom/huami/bloodpressure_core/url/IBPResearchConfig;", "mResearchConfig", "<init>", "()V", "Companion", "AnalyseAdapter", "AnalyseViewHolder", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class AnalyseFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final /* synthetic */ KProperty<Object>[] e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String ANALYSE_TITLE;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy mResearchConfig;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\b\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\u001c\u0010\r\u001a\u00020\f2\n\u0010\n\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u0016R\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/huami/bloodpressure_ui/analyse/AnalyseFragment$AnalyseAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/bloodpressure_ui/analyse/AnalyseFragment$AnalyseViewHolder;", "Lcom/huami/bloodpressure_ui/analyse/AnalyseFragment;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "", "Lcom/huami/bloodpressure_ui/analyse/AnalyseItemEntity;", "a", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "items", "<init>", "(Lcom/huami/bloodpressure_ui/analyse/AnalyseFragment;Ljava/util/List;)V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
    public final class AnalyseAdapter extends RecyclerView.Adapter<AnalyseViewHolder> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final List<AnalyseItemEntity> items;

        public AnalyseAdapter(List<AnalyseItemEntity> list) {
            this.items = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getA() {
            return this.items.size();
        }

        @NotNull
        public final List<AnalyseItemEntity> getItems() {
            return this.items;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull AnalyseViewHolder holder, int position) {
            boolean z = false;
            if (position >= 0 && position < getA()) {
                z = true;
            }
            if (z) {
                holder.bind(this.items.get(position));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public AnalyseViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            return AnalyseFragment.this.new AnalyseViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_analyse, parent, false));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001d\u0010\n\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/huami/bloodpressure_ui/analyse/AnalyseFragment$AnalyseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/bloodpressure_ui/analyse/AnalyseItemEntity;", "analyseItemEntity", "", "bind", "Lcom/huami/bloodpressure_ui/databinding/ItemAnalyseBinding;", "a", "Lcom/huami/viewbindingx/ViewBindingProperty;", "()Lcom/huami/bloodpressure_ui/databinding/ItemAnalyseBinding;", "binding", "Landroid/view/View;", "itemView", "<init>", "(Lcom/huami/bloodpressure_ui/analyse/AnalyseFragment;Landroid/view/View;)V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
    public final class AnalyseViewHolder extends RecyclerView.ViewHolder {
        public static final /* synthetic */ KProperty<Object>[] c = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(AnalyseViewHolder.class), "binding", "getBinding()Lcom/huami/bloodpressure_ui/databinding/ItemAnalyseBinding;"))};

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final ViewBindingProperty binding;

        public AnalyseViewHolder(View view) {
            super(view);
            this.binding = ViewHolderBindingsKt.viewBinding(this, ItemAnalyseBinding.class);
        }

        private final ItemAnalyseBinding a() {
            return (ItemAnalyseBinding) this.binding.getValue(this, c[0]);
        }

        public final void bind(@NotNull AnalyseItemEntity analyseItemEntity) {
            ItemAnalyseBinding itemAnalyseBindingA = a();
            TextView textView = itemAnalyseBindingA.tvValue;
            String value = analyseItemEntity.getValue();
            if (value == null) {
                value = this.itemView.getContext().getResources().getString(R.string.blood_pressure_empty);
            }
            textView.setText(value);
            itemAnalyseBindingA.tvUnit.setText(analyseItemEntity.getUnit());
            itemAnalyseBindingA.tvDesc.setText(analyseItemEntity.getDesc());
            if (analyseItemEntity.getStatus() == 0) {
                ViewExKt.setGone(itemAnalyseBindingA.tvStatus, true);
            } else {
                ViewExKt.setGone(itemAnalyseBindingA.tvStatus, false);
                itemAnalyseBindingA.tvStatus.setImageResource(analyseItemEntity.getStatus() > 0 ? R.drawable.ic_bp_high : R.drawable.ic_bp_low);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/bloodpressure_ui/analyse/AnalyseFragment$Companion;", "", "", "title", "Lcom/huami/bloodpressure_ui/analyse/AnalyseFragment;", "newInstance", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AnalyseFragment newInstance(@NotNull String title) {
            AnalyseFragment analyseFragment = new AnalyseFragment();
            Bundle bundle = new Bundle();
            bundle.putString(analyseFragment.ANALYSE_TITLE, title);
            analyseFragment.setArguments(bundle);
            return analyseFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bloodpressure_core/url/IBPResearchConfig;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<IBPResearchConfig> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IBPResearchConfig getA() {
            return (IBPResearchConfig) KoinExKt.bloodPressureScope(KoinExKt.bloodPressureScope().getKoin()).get(Reflection.getOrCreateKotlinClass(IBPResearchConfig.class), null, null);
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[3];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(AnalyseFragment.class), "binding", "getBinding()Lcom/huami/bloodpressure_ui/databinding/FragmentAnalyseBinding;"));
        e = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnalyseFragment() {
        super(R.layout.fragment_analyse);
        this.ANALYSE_TITLE = "ANALYSE_TITLE";
        this.binding = FragmentViewBindingKt.viewBinding(new AnalyseFragment$special$$inlined$viewBindingByBind$1(new BindViewBinder(FragmentAnalyseBinding.class)));
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.bloodpressure_ui.analyse.AnalyseFragment$special$$inlined$viewModel$default$1
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
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<AnalyseViewModel>() { // from class: com.huami.bloodpressure_ui.analyse.AnalyseFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.bloodpressure_ui.analyse.AnalyseViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final AnalyseViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(AnalyseViewModel.class), function0, objArr);
            }
        });
        this.mResearchConfig = LazyKt__LazyJVMKt.lazy(a.a);
    }

    private final FragmentAnalyseBinding c() {
        return (FragmentAnalyseBinding) this.binding.getValue(this, e[0]);
    }

    private final IBPResearchConfig d() {
        return (IBPResearchConfig) this.mResearchConfig.getValue();
    }

    private final AnalyseViewModel e() {
        return (AnalyseViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(AnalyseFragment analyseFragment, List list) {
        analyseFragment.c().ryContent.setLayoutManager(new GridLayoutManager(analyseFragment.requireContext(), 2));
        analyseFragment.c().ryContent.setAdapter(analyseFragment.new AnalyseAdapter(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(AnalyseFragment analyseFragment, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            CustomToast.showToastAtY(analyseFragment.requireContext(), analyseFragment.getString(R.string.blood_pressure_research_detail), 0, (int) motionEvent.getRawY());
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"ClickableViewAccessibility"})
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        String string;
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString(this.ANALYSE_TITLE)) != null) {
            c().tvAnalyseTitle.setText(string);
        }
        e().getCurrentList().observe(getViewLifecycleOwner(), new Observer() { // from class: sc
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                AnalyseFragment.f(this.a, (List) obj);
            }
        });
        ViewExKt.setGone(c().ivResearchDetail, !d().researchEnable());
        c().ivResearchDetail.setOnTouchListener(new View.OnTouchListener() { // from class: rc
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return AnalyseFragment.g(this.a, view2, motionEvent);
            }
        });
    }

    public final void setDataList(@NotNull List<AnalyseItemEntity> list) {
        e().setList(list);
    }
}
