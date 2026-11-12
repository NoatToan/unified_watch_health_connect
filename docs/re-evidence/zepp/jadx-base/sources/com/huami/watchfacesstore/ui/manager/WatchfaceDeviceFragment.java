package com.huami.watchfacesstore.ui.manager;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.p008lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.arch.core.Fail;
import com.huami.arch.core.LiveDataExtensionKt;
import com.huami.arch.core.Loading;
import com.huami.arch.core.State;
import com.huami.arch.core.StateBuilder;
import com.huami.arch.core.Success;
import com.huami.tools.log.HMLog;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.analytic.WFAnalyticHelper;
import com.huami.watchfacesstore.analytic.WFStateEvent;
import com.huami.watchfacesstore.bean.MyWatchFaceBean;
import com.huami.watchfacesstore.databinding.WfItemMyWatchBinding;
import com.huami.watchfacesstore.device.DeviceConfigManager;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.huami.watchfacesstore.ext.KoinExtKt;
import com.huami.watchfacesstore.ui.LiveDataChannel;
import com.huami.watchfacesstore.ui.adapter.MyWatchAdapter;
import com.huami.watchfacesstore.ui.base.BaseFragment;
import com.huami.watchfacesstore.ui.decoration.DividerItemDecoration;
import com.huami.watchfacesstore.ui.manager.WatchfaceDeviceFragment;
import com.huami.watchfacesstore.ui.store.list.LocalWatchListActivity;
import com.huami.watchfacesstore.view.recycleview.BaseRVAdapter;
import com.huami.watchfacesstore.view.recycleview.ViewHolder;
import com.huami.widget.toast.CustomToast;
import com.loc.z;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0016\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u001d\u0010\u001b\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010 \u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010$\u001a\u00020!8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\"\u0010#R\u001d\u0010(\u001a\u00020%8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/huami/watchfacesstore/ui/manager/WatchfaceDeviceFragment;", "Lcom/huami/watchfacesstore/ui/base/BaseFragment;", "", "initObservers", hl.k, "", "Lcom/huami/watchfacesstore/bean/MyWatchFaceBean;", "lists", "l", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "initView", "Landroidx/viewbinding/ViewBinding;", "getViewBinding", "Lcom/huami/watchfacesstore/databinding/WfItemMyWatchBinding;", "f", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "g", "()Lcom/huami/watchfacesstore/databinding/WfItemMyWatchBinding;", "binding", "Lcom/huami/watchfacesstore/device/DeviceConfigManager;", "Lkotlin/Lazy;", "h", "()Lcom/huami/watchfacesstore/device/DeviceConfigManager;", "deviceConfigManager", "Lcom/huami/watchfacesstore/ui/manager/WatchManagerViewModel;", "i", "()Lcom/huami/watchfacesstore/ui/manager/WatchManagerViewModel;", "managerViewModel", "Lcom/huami/watchfacesstore/ui/adapter/MyWatchAdapter;", z.j, "()Lcom/huami/watchfacesstore/ui/adapter/MyWatchAdapter;", "watchFaceAdapter", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class WatchfaceDeviceFragment extends BaseFragment {
    public static final /* synthetic */ KProperty<Object>[] j;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding = FragmentViewBindingKt.viewBinding(new WatchfaceDeviceFragment$special$$inlined$viewBinding$1(new InflateViewBinder(WfItemMyWatchBinding.class)));

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceConfigManager;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy managerViewModel;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy watchFaceAdapter;

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
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
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
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "connectLiveData connect status " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/StateBuilder;", "", "Lcom/huami/watchfacesstore/bean/MyWatchFaceBean;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<StateBuilder<List<? extends MyWatchFaceBean>>, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Success;", "", "Lcom/huami/watchfacesstore/bean/MyWatchFaceBean;", "state", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Success<? extends List<? extends MyWatchFaceBean>>, Unit> {
            public final /* synthetic */ WatchfaceDeviceFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WatchfaceDeviceFragment watchfaceDeviceFragment) {
                super(1);
                this.a = watchfaceDeviceFragment;
            }

            public final void a(@NotNull Success<? extends List<MyWatchFaceBean>> success) {
                List<MyWatchFaceBean> value = success.getValue();
                List<MyWatchFaceBean> list = null;
                if (value != null) {
                    if (!((value.isEmpty() ^ true) && KoinExtKt.getDeviceManager().isConnected())) {
                        value = null;
                    }
                    if (value != null) {
                        WatchfaceDeviceFragment watchfaceDeviceFragment = this.a;
                        ExtensionsKt.showSelf(watchfaceDeviceFragment);
                        watchfaceDeviceFragment.l(value);
                        list = value;
                    }
                }
                if (list == null) {
                    ExtensionsKt.hideSelf(this.a);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Success<? extends List<? extends MyWatchFaceBean>> success) {
                a(success);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Fail;", "", "Lcom/huami/watchfacesstore/bean/MyWatchFaceBean;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<Fail<? extends List<? extends MyWatchFaceBean>>, Unit> {
            public final /* synthetic */ WatchfaceDeviceFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(WatchfaceDeviceFragment watchfaceDeviceFragment) {
                super(1);
                this.a = watchfaceDeviceFragment;
            }

            public final void a(@NotNull Fail<? extends List<MyWatchFaceBean>> fail) {
                ExtensionsKt.hideSelf(this.a);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Fail<? extends List<? extends MyWatchFaceBean>> fail) {
                a(fail);
                return Unit.INSTANCE;
            }
        }

        public c() {
            super(1);
        }

        public final void a(@NotNull StateBuilder<List<MyWatchFaceBean>> stateBuilder) {
            stateBuilder.onSuccess(new a(WatchfaceDeviceFragment.this));
            stateBuilder.onFail(new b(WatchfaceDeviceFragment.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StateBuilder<List<? extends MyWatchFaceBean>> stateBuilder) {
            a(stateBuilder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/StateBuilder;", "Lkotlin/Pair;", "", "Lcom/huami/watchfacesstore/bean/MyWatchFaceBean;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<StateBuilder<Pair<? extends Integer, ? extends MyWatchFaceBean>>, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Loading;", "Lkotlin/Pair;", "", "Lcom/huami/watchfacesstore/bean/MyWatchFaceBean;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Loading<? extends Pair<? extends Integer, ? extends MyWatchFaceBean>>, Unit> {
            public final /* synthetic */ WatchfaceDeviceFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WatchfaceDeviceFragment watchfaceDeviceFragment) {
                super(1);
                this.a = watchfaceDeviceFragment;
            }

            public final void a(@NotNull Loading<Pair<Integer, MyWatchFaceBean>> loading) {
                this.a.showLoadingDialog();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Loading<? extends Pair<? extends Integer, ? extends MyWatchFaceBean>> loading) {
                a(loading);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Success;", "Lkotlin/Pair;", "", "Lcom/huami/watchfacesstore/bean/MyWatchFaceBean;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<Success<? extends Pair<? extends Integer, ? extends MyWatchFaceBean>>, Unit> {
            public final /* synthetic */ WatchfaceDeviceFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(WatchfaceDeviceFragment watchfaceDeviceFragment) {
                super(1);
                this.a = watchfaceDeviceFragment;
            }

            public final void a(@NotNull Success<Pair<Integer, MyWatchFaceBean>> success) {
                Pair<Integer, MyWatchFaceBean> value = success.getValue();
                if (value == null) {
                    return;
                }
                this.a.j().setItemSelected(value.getFirst().intValue());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Success<? extends Pair<? extends Integer, ? extends MyWatchFaceBean>> success) {
                a(success);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Fail;", "Lkotlin/Pair;", "", "Lcom/huami/watchfacesstore/bean/MyWatchFaceBean;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function1<Fail<? extends Pair<? extends Integer, ? extends MyWatchFaceBean>>, Unit> {
            public final /* synthetic */ WatchfaceDeviceFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(WatchfaceDeviceFragment watchfaceDeviceFragment) {
                super(1);
                this.a = watchfaceDeviceFragment;
            }

            public final void a(@NotNull Fail<Pair<Integer, MyWatchFaceBean>> fail) {
                CustomToast.showShort(this.a.requireContext().getApplicationContext(), R.string.wf_sync_watch_face_fail);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Fail<? extends Pair<? extends Integer, ? extends MyWatchFaceBean>> fail) {
                a(fail);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.manager.WatchfaceDeviceFragment$d$d, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/State;", "Lkotlin/Pair;", "", "Lcom/huami/watchfacesstore/bean/MyWatchFaceBean;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0696d extends Lambda implements Function1<State<? extends Pair<? extends Integer, ? extends MyWatchFaceBean>>, Unit> {
            public final /* synthetic */ WatchfaceDeviceFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0696d(WatchfaceDeviceFragment watchfaceDeviceFragment) {
                super(1);
                this.a = watchfaceDeviceFragment;
            }

            public final void a(@NotNull State<Pair<Integer, MyWatchFaceBean>> state) {
                this.a.hideLoadingDialog();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(State<? extends Pair<? extends Integer, ? extends MyWatchFaceBean>> state) {
                a(state);
                return Unit.INSTANCE;
            }
        }

        public d() {
            super(1);
        }

        public final void a(@NotNull StateBuilder<Pair<Integer, MyWatchFaceBean>> stateBuilder) {
            stateBuilder.onLoading(new a(WatchfaceDeviceFragment.this));
            stateBuilder.onSuccess(new b(WatchfaceDeviceFragment.this));
            stateBuilder.onFail(new c(WatchfaceDeviceFragment.this));
            stateBuilder.onCompleted(new C0696d(WatchfaceDeviceFragment.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StateBuilder<Pair<? extends Integer, ? extends MyWatchFaceBean>> stateBuilder) {
            a(stateBuilder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Void a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Void r1) {
            super(0);
            this.a = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "localWatchLiveData observe " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watchfacesstore/ui/adapter/MyWatchAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<MyWatchAdapter> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MyWatchAdapter getA() {
            return new MyWatchAdapter(WatchfaceDeviceFragment.this.requireContext(), DeviceConfigManager.DeviceSize.SIZE_FOUR);
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[4];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(WatchfaceDeviceFragment.class), "binding", "getBinding()Lcom/huami/watchfacesstore/databinding/WfItemMyWatchBinding;"));
        j = kPropertyArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WatchfaceDeviceFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceConfigManager = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<DeviceConfigManager>() { // from class: com.huami.watchfacesstore.ui.manager.WatchfaceDeviceFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.watchfacesstore.device.DeviceConfigManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceConfigManager getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(DeviceConfigManager.class), qualifier, objArr);
            }
        });
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.watchfacesstore.ui.manager.WatchfaceDeviceFragment$special$$inlined$sharedViewModel$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.NONE;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.managerViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<WatchManagerViewModel>() { // from class: com.huami.watchfacesstore.ui.manager.WatchfaceDeviceFragment$special$$inlined$sharedViewModel$default$2
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
                return FragmentExtKt.getSharedViewModel(this, objArr2, Reflection.getOrCreateKotlinClass(WatchManagerViewModel.class), function0, objArr3);
            }
        });
        this.watchFaceAdapter = LazyKt__LazyJVMKt.lazy(new f());
    }

    private final WfItemMyWatchBinding g() {
        return (WfItemMyWatchBinding) this.binding.getValue(this, j[0]);
    }

    private final DeviceConfigManager h() {
        return (DeviceConfigManager) this.deviceConfigManager.getValue();
    }

    private final WatchManagerViewModel i() {
        return (WatchManagerViewModel) this.managerViewModel.getValue();
    }

    private final void initObservers() {
        k();
        LiveDataExtensionKt.observeState$default(i().getMyWatchFaceLiveData(), getViewLifecycleOwner(), null, new c(), 2, null);
        LiveDataExtensionKt.observeState$default(i().getChangeLiveData(), getViewLifecycleOwner(), null, new d(), 2, null);
        LiveDataChannel.INSTANCE.getOperateWatchLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: tl8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WatchfaceDeviceFragment.n(this.a, (Void) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MyWatchAdapter j() {
        return (MyWatchAdapter) this.watchFaceAdapter.getValue();
    }

    private final void k() {
        i().getBleOpenLiveData().observe(getViewLifecycleOwner(), new Observer<T>() { // from class: com.huami.watchfacesstore.ui.manager.WatchfaceDeviceFragment$initBleLiveData$$inlined$observeWithNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                if (t == 0) {
                    return;
                }
                Boolean bool = (Boolean) t;
                HMLog.info("WatchfaceDeviceFragment", new WatchfaceDeviceFragment.a(bool));
                if (bool.booleanValue()) {
                    return;
                }
                ExtensionsKt.hideSelf(this.a);
            }
        });
        i().getConnectLiveData().observe(getViewLifecycleOwner(), new Observer<T>() { // from class: com.huami.watchfacesstore.ui.manager.WatchfaceDeviceFragment$initBleLiveData$$inlined$observeWithNotNull$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                if (t == 0) {
                    return;
                }
                Integer num = (Integer) t;
                HMLog.info("WatchfaceDeviceFragment", new WatchfaceDeviceFragment.b(num));
                if (num.intValue() == 0) {
                    ExtensionsKt.showSelf(this.a);
                } else {
                    ExtensionsKt.hideSelf(this.a);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(List<MyWatchFaceBean> lists) {
        boolean z = false;
        if (!(lists instanceof Collection) || !lists.isEmpty()) {
            Iterator<T> it2 = lists.iterator();
            while (it2.hasNext()) {
                if (!((MyWatchFaceBean) it2.next()).getOfficialBuiltin()) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            ExtensionsKt.visible(g().title.tvHomeMore);
        }
        if (h().isZeepOs() && lists.size() <= 1) {
            ExtensionsKt.gone(g().title.tvHomeMore);
        }
        RecyclerView recyclerView = g().watchFaceRecyclerView;
        recyclerView.setAdapter(j());
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new DividerItemDecoration());
        }
        j().setOnItemClickListener(new BaseRVAdapter.OnItemClickListener() { // from class: ul8
            @Override // com.huami.watchfacesstore.view.recycleview.BaseRVAdapter.OnItemClickListener
            public final void onItemClick(ViewHolder viewHolder, int i, int i2) {
                WatchfaceDeviceFragment.m(this.a, viewHolder, i, i2);
            }
        });
        j().replaceAll(lists);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(WatchfaceDeviceFragment watchfaceDeviceFragment, ViewHolder viewHolder, int i, int i2) {
        MyWatchFaceBean item = watchfaceDeviceFragment.j().getItem(i2);
        if (item == null) {
            return;
        }
        WFAnalyticHelper.analyticCount$default(WFAnalyticHelper.INSTANCE, WFStateEvent.WF_MANAGE_DEVICE_CLICK_NUM, null, null, null, 14, null);
        watchfaceDeviceFragment.i().setWatchFaceById(i2, item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(WatchfaceDeviceFragment watchfaceDeviceFragment, Void r2) {
        HMLog.info("LiveDataChannel", new e(r2));
        watchfaceDeviceFragment.i().getMyWatchFaceList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(TextView textView, String str, View view) {
        LocalWatchListActivity.INSTANCE.actionStart(textView.getContext(), 7, str);
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseFragment
    @NotNull
    public ViewBinding getViewBinding() {
        return g();
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseFragment
    public void initView() {
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseFragment, androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return g().getRoot();
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        final String string = requireContext().getString(R.string.wf_manager_item_my_watch_title, KoinExtKt.getDeviceInfo().getDeviceName());
        WfItemMyWatchBinding wfItemMyWatchBindingG = g();
        wfItemMyWatchBindingG.title.tvHomeItemTitle.setText(string);
        final TextView textView = wfItemMyWatchBindingG.title.tvHomeMore;
        ExtensionsKt.gone(textView);
        textView.setText(R.string.wf_manager_item_delete);
        textView.setOnClickListener(new View.OnClickListener() { // from class: sl8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WatchfaceDeviceFragment.o(textView, string, view2);
            }
        });
        initObservers();
        i().getMyWatchFaceList();
    }
}
