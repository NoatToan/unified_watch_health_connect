package com.huami.watchfacesstore.ui.manager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.huami.util.net.NetUtil;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.databinding.WfFragmentWatchfacesManagerBinding;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.huami.watchfacesstore.ui.LiveDataChannel;
import com.huami.watchfacesstore.ui.manager.WatchManagerFragment;
import com.loc.z;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b/\u00100J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016R\u001d\u0010\u0013\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0018\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001d\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010!\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001f\u0010 R\u001d\u0010#\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0015\u001a\u0004\b\u001a\u0010 R\u001d\u0010&\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0015\u001a\u0004\b%\u0010 R\u001d\u0010)\u001a\u00020'8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\"\u0010(R\u001d\u0010*\u001a\u00020'8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b$\u0010(R\u001d\u0010.\u001a\u00020+8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0015\u001a\u0004\b,\u0010-¨\u00061"}, d2 = {"Lcom/huami/watchfacesstore/ui/manager/WatchManagerFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "", "onViewCreated", "onDestroy", "Lcom/huami/watchfacesstore/databinding/WfFragmentWatchfacesManagerBinding;", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "b", "()Lcom/huami/watchfacesstore/databinding/WfFragmentWatchfacesManagerBinding;", "binding", "Lcom/huami/watchfacesstore/ui/manager/WatchFaceHeaderFragment;", "Lkotlin/Lazy;", "g", "()Lcom/huami/watchfacesstore/ui/manager/WatchFaceHeaderFragment;", "headerFragment", "Lcom/huami/watchfacesstore/ui/manager/WatchfaceDeviceFragment;", "c", GoogleApiAvailabilityLight.a, "()Lcom/huami/watchfacesstore/ui/manager/WatchfaceDeviceFragment;", "deviceFragment", "Lcom/huami/watchfacesstore/ui/manager/WatchFaceListFragment;", "h", "()Lcom/huami/watchfacesstore/ui/manager/WatchFaceListFragment;", "historyFragment", "e", "collectFragment", "f", "i", "localFragment", "Lcom/huami/watchfacesstore/ui/manager/EmptyOrErrorFragment;", "()Lcom/huami/watchfacesstore/ui/manager/EmptyOrErrorFragment;", "emptyFragment", "errorFragment", "Lcom/huami/watchfacesstore/ui/manager/WatchManagerViewModel;", z.j, "()Lcom/huami/watchfacesstore/ui/manager/WatchManagerViewModel;", "managerViewModel", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class WatchManagerFragment extends Fragment {
    public static final /* synthetic */ KProperty<Object>[] j;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding = FragmentViewBindingKt.viewBinding(new WatchManagerFragment$special$$inlined$viewBinding$1(new InflateViewBinder(WfFragmentWatchfacesManagerBinding.class)));

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy headerFragment = LazyKt__LazyJVMKt.lazy(e.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceFragment = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy historyFragment = LazyKt__LazyJVMKt.lazy(f.a);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy collectFragment = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy localFragment = LazyKt__LazyJVMKt.lazy(g.a);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy emptyFragment = LazyKt__LazyJVMKt.lazy(c.a);

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy errorFragment = LazyKt__LazyJVMKt.lazy(d.a);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy managerViewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watchfacesstore/ui/manager/WatchFaceListFragment;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<WatchFaceListFragment> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WatchFaceListFragment getA() {
            return WatchFaceListFragment.INSTANCE.newInstance(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watchfacesstore/ui/manager/WatchfaceDeviceFragment;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<WatchfaceDeviceFragment> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WatchfaceDeviceFragment getA() {
            return new WatchfaceDeviceFragment();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watchfacesstore/ui/manager/EmptyOrErrorFragment;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<EmptyOrErrorFragment> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EmptyOrErrorFragment getA() {
            return EmptyOrErrorFragment.INSTANCE.newInstance(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watchfacesstore/ui/manager/EmptyOrErrorFragment;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<EmptyOrErrorFragment> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EmptyOrErrorFragment getA() {
            return EmptyOrErrorFragment.INSTANCE.newInstance(1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watchfacesstore/ui/manager/WatchFaceHeaderFragment;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<WatchFaceHeaderFragment> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WatchFaceHeaderFragment getA() {
            return new WatchFaceHeaderFragment();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watchfacesstore/ui/manager/WatchFaceListFragment;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<WatchFaceListFragment> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WatchFaceListFragment getA() {
            return WatchFaceListFragment.INSTANCE.newInstance(2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watchfacesstore/ui/manager/WatchFaceListFragment;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<WatchFaceListFragment> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WatchFaceListFragment getA() {
            return WatchFaceListFragment.INSTANCE.newInstance(1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ Boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Boolean bool) {
            super(0);
            this.a = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "emptyLiveData observe " + this.a;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[9];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(WatchManagerFragment.class), "binding", "getBinding()Lcom/huami/watchfacesstore/databinding/WfFragmentWatchfacesManagerBinding;"));
        j = kPropertyArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WatchManagerFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.watchfacesstore.ui.manager.WatchManagerFragment$special$$inlined$sharedViewModel$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                return ViewModelOwner.INSTANCE.from(this.requireActivity(), this.requireActivity());
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.managerViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<WatchManagerViewModel>() { // from class: com.huami.watchfacesstore.ui.manager.WatchManagerFragment$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.watchfacesstore.ui.manager.WatchManagerViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final WatchManagerViewModel getA() {
                return FragmentExtKt.getSharedViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(WatchManagerViewModel.class), function0, objArr);
            }
        });
    }

    private final WfFragmentWatchfacesManagerBinding b() {
        return (WfFragmentWatchfacesManagerBinding) this.binding.getValue(this, j[0]);
    }

    private final WatchFaceListFragment c() {
        return (WatchFaceListFragment) this.collectFragment.getValue();
    }

    private final WatchfaceDeviceFragment d() {
        return (WatchfaceDeviceFragment) this.deviceFragment.getValue();
    }

    private final EmptyOrErrorFragment e() {
        return (EmptyOrErrorFragment) this.emptyFragment.getValue();
    }

    private final EmptyOrErrorFragment f() {
        return (EmptyOrErrorFragment) this.errorFragment.getValue();
    }

    private final WatchFaceHeaderFragment g() {
        return (WatchFaceHeaderFragment) this.headerFragment.getValue();
    }

    private final WatchFaceListFragment h() {
        return (WatchFaceListFragment) this.historyFragment.getValue();
    }

    private final WatchFaceListFragment i() {
        return (WatchFaceListFragment) this.localFragment.getValue();
    }

    private final WatchManagerViewModel j() {
        return (WatchManagerViewModel) this.managerViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(WatchManagerFragment watchManagerFragment, Boolean bool) {
        HMLog.info("WatchManagerFragment", new h(bool));
        if (bool.booleanValue()) {
            ExtensionsKt.showFragment(watchManagerFragment, watchManagerFragment.e());
        } else {
            ExtensionsKt.hideFragment(watchManagerFragment, watchManagerFragment.e());
        }
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return b().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        LiveDataChannel.INSTANCE.resetLiveData();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        ExtensionsKt.addFragment$default(this, g(), R.id.header, null, 4, null);
        ExtensionsKt.addFragment$default(this, d(), R.id.my_watch, null, 4, null);
        ExtensionsKt.addFragment$default(this, c(), R.id.collect, null, 4, null);
        ExtensionsKt.addFragment$default(this, e(), R.id.empty, null, 4, null);
        if (j().getIsSupportPay()) {
            ExtensionsKt.addFragment$default(this, h(), R.id.history, null, 4, null);
            ExtensionsKt.hideFragment(this, h());
        } else {
            ExtensionsKt.addFragment$default(this, i(), R.id.local, null, 4, null);
            ExtensionsKt.hideFragment(this, i());
        }
        ExtensionsKt.hideFragment(this, e());
        ExtensionsKt.hideFragment(this, c());
        if (!NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            ExtensionsKt.addFragment$default(this, f(), R.id.error, null, 4, null);
        }
        j().getEmptyLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: og8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WatchManagerFragment.k(this.a, (Boolean) obj);
            }
        });
        j().initHeaderViewStatus();
    }
}
