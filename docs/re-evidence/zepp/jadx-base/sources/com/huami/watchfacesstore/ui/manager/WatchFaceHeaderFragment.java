package com.huami.watchfacesstore.ui.manager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.arch.core.LiveDataExtensionKt;
import com.huami.arch.core.StateBuilder;
import com.huami.arch.core.Success;
import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.bean.MyWatchFaceBean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0002J$\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u001d\u0010\u0013\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0017\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/watchfacesstore/ui/manager/WatchFaceHeaderFragment;", "Landroidx/fragment/app/Fragment;", "", GoogleApiAvailabilityLight.a, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/huami/watchfacesstore/ui/manager/WatchManagerViewModel;", "a", "Lkotlin/Lazy;", "b", "()Lcom/huami/watchfacesstore/ui/manager/WatchManagerViewModel;", "managerViewModel", "Lcom/huami/watchfacesstore/ui/manager/WatchFaceHeaderView;", "c", "()Lcom/huami/watchfacesstore/ui/manager/WatchFaceHeaderView;", "watchFaceHeaderView", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class WatchFaceHeaderFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy managerViewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy watchFaceHeaderView;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Boolean bool) {
            super(0);
            this.a = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "bleOpenLiveData isOpen " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Integer a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Integer num) {
            super(0);
            this.a = num;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "connectLiveData connect status " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Boolean bool) {
            super(0);
            this.a = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "batteryLiveData isCharging " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/StateBuilder;", "Lcom/huami/watchfacesstore/bean/MyWatchFaceBean;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<StateBuilder<MyWatchFaceBean>, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Success;", "Lcom/huami/watchfacesstore/bean/MyWatchFaceBean;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Success<? extends MyWatchFaceBean>, Unit> {
            public final /* synthetic */ WatchFaceHeaderFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WatchFaceHeaderFragment watchFaceHeaderFragment) {
                super(1);
                this.a = watchFaceHeaderFragment;
            }

            public final void a(@NotNull Success<MyWatchFaceBean> success) {
                MyWatchFaceBean value = success.getValue();
                if (value == null) {
                    return;
                }
                WatchFaceHeaderView watchFaceHeaderViewC = this.a.c();
                String deviceImage = value.getDeviceImage();
                String gif = value.getGif();
                if (gif == null) {
                    gif = value.getImage();
                }
                watchFaceHeaderViewC.setWatchFaceImage(deviceImage, gif, value.getTransparentBackground(), value.getColor());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Success<? extends MyWatchFaceBean> success) {
                a(success);
                return Unit.INSTANCE;
            }
        }

        public d() {
            super(1);
        }

        public final void a(@NotNull StateBuilder<MyWatchFaceBean> stateBuilder) {
            stateBuilder.onSuccess(new a(WatchFaceHeaderFragment.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StateBuilder<MyWatchFaceBean> stateBuilder) {
            a(stateBuilder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/StateBuilder;", "Lkotlin/Pair;", "", "Lcom/huami/watchfacesstore/bean/MyWatchFaceBean;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<StateBuilder<Pair<? extends Integer, ? extends MyWatchFaceBean>>, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Success;", "Lkotlin/Pair;", "", "Lcom/huami/watchfacesstore/bean/MyWatchFaceBean;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Success<? extends Pair<? extends Integer, ? extends MyWatchFaceBean>>, Unit> {
            public final /* synthetic */ WatchFaceHeaderFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WatchFaceHeaderFragment watchFaceHeaderFragment) {
                super(1);
                this.a = watchFaceHeaderFragment;
            }

            public final void a(@NotNull Success<Pair<Integer, MyWatchFaceBean>> success) {
                MyWatchFaceBean second;
                Pair<Integer, MyWatchFaceBean> value = success.getValue();
                if (value == null || (second = value.getSecond()) == null) {
                    return;
                }
                WatchFaceHeaderView watchFaceHeaderViewC = this.a.c();
                String deviceImage = second.getDeviceImage();
                String gif = second.getGif();
                if (gif == null) {
                    gif = second.getImage();
                }
                watchFaceHeaderViewC.setWatchFaceImage(deviceImage, gif, second.getTransparentBackground(), second.getColor());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Success<? extends Pair<? extends Integer, ? extends MyWatchFaceBean>> success) {
                a(success);
                return Unit.INSTANCE;
            }
        }

        public e() {
            super(1);
        }

        public final void a(@NotNull StateBuilder<Pair<Integer, MyWatchFaceBean>> stateBuilder) {
            stateBuilder.onSuccess(new a(WatchFaceHeaderFragment.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StateBuilder<Pair<? extends Integer, ? extends MyWatchFaceBean>> stateBuilder) {
            a(stateBuilder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watchfacesstore/ui/manager/WatchFaceHeaderView;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<WatchFaceHeaderView> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WatchFaceHeaderView invoke() {
            return new WatchFaceHeaderView(WatchFaceHeaderFragment.this.requireContext(), null, 0, 6, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WatchFaceHeaderFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.watchfacesstore.ui.manager.WatchFaceHeaderFragment$special$$inlined$sharedViewModel$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                return ViewModelOwner.INSTANCE.from(this.requireActivity(), this.requireActivity());
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.managerViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<WatchManagerViewModel>() { // from class: com.huami.watchfacesstore.ui.manager.WatchFaceHeaderFragment$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.watchfacesstore.ui.manager.WatchManagerViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final WatchManagerViewModel invoke() {
                return FragmentExtKt.getSharedViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(WatchManagerViewModel.class), function0, objArr);
            }
        });
        this.watchFaceHeaderView = LazyKt__LazyJVMKt.lazy(new f());
    }

    private final WatchManagerViewModel b() {
        return (WatchManagerViewModel) this.managerViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WatchFaceHeaderView c() {
        return (WatchFaceHeaderView) this.watchFaceHeaderView.getValue();
    }

    private final void d() {
        b().getBleOpenLiveData().observe(this, new Observer<T>() { // from class: com.huami.watchfacesstore.ui.manager.WatchFaceHeaderFragment$initBleLiveData$$inlined$observeWithNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                if (t == 0) {
                    return;
                }
                Boolean bool = (Boolean) t;
                HMLog.info("WatchManagerFragment", new WatchFaceHeaderFragment.a(bool));
                if (bool.booleanValue()) {
                    return;
                }
                this.a.c().setConnectState(WatchFaceHeaderView.DeviceConnStatus.BLUETOOTH_NOT_OPEN);
            }
        });
        b().getConnectLiveData().observe(this, new Observer<T>() { // from class: com.huami.watchfacesstore.ui.manager.WatchFaceHeaderFragment$initBleLiveData$$inlined$observeWithNotNull$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                if (t == 0) {
                    return;
                }
                Integer num = (Integer) t;
                HMLog.info("WatchManagerFragment", new WatchFaceHeaderFragment.b(num));
                if (num.intValue() == 0) {
                    this.a.c().setConnectState(WatchFaceHeaderView.DeviceConnStatus.CONNECT_SUCCESS);
                } else if (num.intValue() == 1) {
                    this.a.c().setConnectState(WatchFaceHeaderView.DeviceConnStatus.CONNECTING);
                } else if (num.intValue() == 2) {
                    this.a.c().setConnectState(WatchFaceHeaderView.DeviceConnStatus.CONNECT_FAIL);
                }
            }
        });
        b().getBatteryLiveData().observe(this, new Observer<T>() { // from class: com.huami.watchfacesstore.ui.manager.WatchFaceHeaderFragment$initBleLiveData$$inlined$observeWithNotNull$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                if (t == 0) {
                    return;
                }
                Boolean bool = (Boolean) t;
                HMLog.info("WatchManagerFragment", new WatchFaceHeaderFragment.c(bool));
                if (bool.booleanValue()) {
                    this.a.c().setConnectState(WatchFaceHeaderView.DeviceConnStatus.CHARGING);
                } else {
                    this.a.c().setConnectState(WatchFaceHeaderView.DeviceConnStatus.CONNECT_SUCCESS);
                }
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        d();
        LiveDataExtensionKt.observeState$default(b().getHeaderLiveData(), this, null, new d(), 2, null);
        LiveDataExtensionKt.observeState$default(b().getChangeLiveData(), getViewLifecycleOwner(), null, new e(), 2, null);
    }
}
