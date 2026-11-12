package com.xiaomi.hm.health.smalltool;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.LifecycleObserver;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import androidx.recyclerview.widget.GridLayoutManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.I18nUtil;
import com.xiaomi.hm.health.databinding.FragmentMyToolBinding;
import com.xiaomi.hm.health.smalltool.MyToolFragment;
import com.xiaomi.hm.health.smalltool.model.Tool;
import com.xiaomi.hm.health.smalltool.util.ToolAnalytics;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001 B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ&\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016R\u001d\u0010\u0013\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0019\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001d\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/smalltool/MyToolFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/lifecycle/LifecycleObserver;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "", "onViewCreated", "Lcom/xiaomi/hm/health/databinding/FragmentMyToolBinding;", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "c", "()Lcom/xiaomi/hm/health/databinding/FragmentMyToolBinding;", "binding", "Lcom/xiaomi/hm/health/smalltool/ToolViewModel;", "b", "Lkotlin/Lazy;", "e", "()Lcom/xiaomi/hm/health/smalltool/ToolViewModel;", "toolViewModel", "Lcom/xiaomi/hm/health/smalltool/ToolMyToolsAdapter;", GoogleApiAvailabilityLight.a, "()Lcom/xiaomi/hm/health/smalltool/ToolMyToolsAdapter;", "mAdapter", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class MyToolFragment extends Fragment implements LifecycleObserver {
    public static final /* synthetic */ KProperty<Object>[] d;

    @NotNull
    private static final String e = "MyToolFragment";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding = FragmentViewBindingKt.viewBinding(new MyToolFragment$special$$inlined$viewBinding$1(new InflateViewBinder(FragmentMyToolBinding.class)));

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy toolViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(ToolViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.smalltool.MyToolFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelStore getA() {
            return this.requireActivity().getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.hm.health.smalltool.MyToolFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelProvider.Factory getA() {
            return this.requireActivity().getDefaultViewModelProviderFactory();
        }
    });

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy mAdapter = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/smalltool/ToolMyToolsAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ToolMyToolsAdapter> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ToolMyToolsAdapter getA() {
            return new ToolMyToolsAdapter(MyToolFragment.this.e());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ List<Tool> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<Tool> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "On MyTools Changed: " + ArraysUtil.toString(this.a);
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[3];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(MyToolFragment.class), "binding", "getBinding()Lcom/xiaomi/hm/health/databinding/FragmentMyToolBinding;"));
        d = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    private final FragmentMyToolBinding c() {
        return (FragmentMyToolBinding) this.binding.getValue(this, d[0]);
    }

    private final ToolMyToolsAdapter d() {
        return (ToolMyToolsAdapter) this.mAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ToolViewModel e() {
        return (ToolViewModel) this.toolViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(MyToolFragment myToolFragment, List list) {
        HMLog.info(e, new b(list));
        myToolFragment.d().update(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(MyToolFragment myToolFragment, View view) {
        FragmentActivity activity = myToolFragment.getActivity();
        if (activity == null) {
            return;
        }
        myToolFragment.startActivity(new Intent(activity, (Class<?>) ToolSortActivity.class));
        ToolAnalytics.recordEvent(ToolAnalytics.EventId.TOOLS_ALL_C);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return c().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        e().getMyTools().observe(getViewLifecycleOwner(), new Observer() { // from class: qb5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                MyToolFragment.f(this.a, (List) obj);
            }
        });
        c().recyclerView.setAdapter(d());
        c().recyclerView.setLayoutManager(new GridLayoutManager(getContext(), I18nUtil.isZh(requireContext()) ? 4 : 2));
        c().ivSort.setOnClickListener(new View.OnClickListener() { // from class: pb5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MyToolFragment.g(this.a, view2);
            }
        });
        e().loadTools();
    }
}
