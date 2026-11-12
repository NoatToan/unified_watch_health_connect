package com.huami.watchfacesstore.ui.store;

import android.content.ComponentCallbacks;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.arch.core.Fail;
import com.huami.arch.core.LiveDataExtensionKt;
import com.huami.arch.core.Loading;
import com.huami.arch.core.State;
import com.huami.arch.core.StateBuilder;
import com.huami.arch.core.Success;
import com.huami.tools.log.HMLog;
import com.huami.util.net.NetUtil;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.analytic.WFAnalyticHelper;
import com.huami.watchfacesstore.bean.HomeListBean;
import com.huami.watchfacesstore.bean.WatchData;
import com.huami.watchfacesstore.databinding.WfFragmentWatchfacesStoreBinding;
import com.huami.watchfacesstore.device.DeviceConfigManager;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.huami.watchfacesstore.ui.adapter.HomeAdapter;
import com.huami.watchfacesstore.ui.adapter.WatchFaceAdapter;
import com.huami.watchfacesstore.ui.base.BaseFragment;
import com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity;
import com.huami.watchfacesstore.view.recycleview.BaseRVAdapter;
import com.huami.watchfacesstore.view.recycleview.LoadMoreRecyclerView;
import com.huami.watchfacesstore.view.recycleview.ViewHolder;
import com.loc.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 62\u00020\u00012\u00020\u0002:\u00016B\u0007¢\u0006\u0004\b4\u00105J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016R\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010#\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0013\u001a\u0004\b\f\u0010\"R#\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00180$8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0013\u001a\u0004\b\u0012\u0010&R+\u0010,\u001a\u00020(2\u0006\u0010)\u001a\u00020(8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001d\u00103\u001a\u0002008B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u0013\u001a\u0004\b\u0019\u00102¨\u00067"}, d2 = {"Lcom/huami/watchfacesstore/ui/store/WatchFaceStoreFragment;", "Lcom/huami/watchfacesstore/ui/base/BaseFragment;", "Lcom/huami/watchfacesstore/view/recycleview/LoadMoreRecyclerView$LoadingListener;", "Landroidx/viewbinding/ViewBinding;", "getViewBinding", "", "getContainerIds", "", "initView", "loadData", "onLoadMore", "Lcom/huami/watchfacesstore/databinding/WfFragmentWatchfacesStoreBinding;", "f", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", GoogleApiAvailabilityLight.a, "()Lcom/huami/watchfacesstore/databinding/WfFragmentWatchfacesStoreBinding;", "binding", "Lcom/huami/watchfacesstore/device/DeviceConfigManager;", "g", "Lkotlin/Lazy;", "e", "()Lcom/huami/watchfacesstore/device/DeviceConfigManager;", "deviceConfigManager", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "h", "Ljava/util/List;", "watchFaceList", "", "i", LogUtil.I, "pageNum", "Lcom/huami/watchfacesstore/ui/adapter/HomeAdapter;", z.j, "()Lcom/huami/watchfacesstore/ui/adapter/HomeAdapter;", "homeAdapter", "Lcom/huami/watchfacesstore/view/recycleview/BaseRVAdapter;", hl.k, "()Lcom/huami/watchfacesstore/view/recycleview/BaseRVAdapter;", "listAdapter", "", "<set-?>", "l", "Lkotlin/properties/ReadWriteProperty;", "isListMode", "()Z", "setListMode", "(Z)V", "Lcom/huami/watchfacesstore/ui/store/WatchStoreViewModel;", "m", "()Lcom/huami/watchfacesstore/ui/store/WatchStoreViewModel;", "watchViewModel", "<init>", "()V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class WatchFaceStoreFragment extends BaseFragment implements LoadMoreRecyclerView.LoadingListener {
    public static final /* synthetic */ KProperty<Object>[] n;

    @NotNull
    private static final String o = "WatchFaceStoreFragment";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding = FragmentViewBindingKt.viewBinding(new WatchFaceStoreFragment$special$$inlined$viewBinding$1(new InflateViewBinder(WfFragmentWatchfacesStoreBinding.class)));

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceConfigManager;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private List<WatchData> watchFaceList;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int pageNum;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy homeAdapter;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy listAdapter;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty isListMode;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final Lazy watchViewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watchfacesstore/ui/adapter/HomeAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<HomeAdapter> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HomeAdapter getA() {
            return new HomeAdapter(WatchFaceStoreFragment.this.requireContext(), 0, 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/StateBuilder;", "", "Lcom/huami/watchfacesstore/bean/HomeListBean;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<StateBuilder<List<? extends HomeListBean>>, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Loading;", "", "Lcom/huami/watchfacesstore/bean/HomeListBean;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Loading<? extends List<? extends HomeListBean>>, Unit> {
            public final /* synthetic */ WatchFaceStoreFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WatchFaceStoreFragment watchFaceStoreFragment) {
                super(1);
                this.a = watchFaceStoreFragment;
            }

            public final void a(@NotNull Loading<? extends List<HomeListBean>> loading) {
                this.a.showLoadingDialog();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Loading<? extends List<? extends HomeListBean>> loading) {
                a(loading);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.store.WatchFaceStoreFragment$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Success;", "", "Lcom/huami/watchfacesstore/bean/HomeListBean;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0697b extends Lambda implements Function1<Success<? extends List<? extends HomeListBean>>, Unit> {
            public final /* synthetic */ WatchFaceStoreFragment a;

            /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.store.WatchFaceStoreFragment$b$b$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ Success<List<HomeListBean>> a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public a(Success<? extends List<HomeListBean>> success) {
                    super(0);
                    this.a = success;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return String.valueOf(this.a.getValue());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0697b(WatchFaceStoreFragment watchFaceStoreFragment) {
                super(1);
                this.a = watchFaceStoreFragment;
            }

            public final void a(@NotNull Success<? extends List<HomeListBean>> success) {
                this.a.resetViewStatus();
                HMLog.info(WatchFaceStoreFragment.o, new a(success));
                List<HomeListBean> value = success.getValue();
                if (value == null) {
                    return;
                }
                WatchFaceStoreFragment watchFaceStoreFragment = this.a;
                WFAnalyticHelper.analyticCount$default(WFAnalyticHelper.INSTANCE, "WF_Store_ViewNum", null, null, null, 14, null);
                watchFaceStoreFragment.f().addAll(value);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Success<? extends List<? extends HomeListBean>> success) {
                a(success);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Fail;", "", "Lcom/huami/watchfacesstore/bean/HomeListBean;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function1<Fail<? extends List<? extends HomeListBean>>, Unit> {
            public final /* synthetic */ WatchFaceStoreFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(WatchFaceStoreFragment watchFaceStoreFragment) {
                super(1);
                this.a = watchFaceStoreFragment;
            }

            public final void a(@NotNull Fail<? extends List<HomeListBean>> fail) {
                this.a.showDefaultError();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Fail<? extends List<? extends HomeListBean>> fail) {
                a(fail);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/State;", "", "Lcom/huami/watchfacesstore/bean/HomeListBean;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function1<State<? extends List<? extends HomeListBean>>, Unit> {
            public final /* synthetic */ WatchFaceStoreFragment a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(WatchFaceStoreFragment watchFaceStoreFragment) {
                super(1);
                this.a = watchFaceStoreFragment;
            }

            public final void a(@NotNull State<? extends List<HomeListBean>> state) {
                this.a.hideLoadingDialog();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(State<? extends List<? extends HomeListBean>> state) {
                a(state);
                return Unit.INSTANCE;
            }
        }

        public b() {
            super(1);
        }

        public final void a(@NotNull StateBuilder<List<HomeListBean>> stateBuilder) {
            stateBuilder.onLoading(new a(WatchFaceStoreFragment.this));
            stateBuilder.onSuccess(new C0697b(WatchFaceStoreFragment.this));
            stateBuilder.onFail(new c(WatchFaceStoreFragment.this));
            stateBuilder.onCompleted(new d(WatchFaceStoreFragment.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StateBuilder<List<? extends HomeListBean>> stateBuilder) {
            a(stateBuilder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/StateBuilder;", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<StateBuilder<List<? extends WatchData>>, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Success;", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Success<? extends List<? extends WatchData>>, Unit> {
            public final /* synthetic */ WatchFaceStoreFragment a;

            /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.store.WatchFaceStoreFragment$c$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0698a extends Lambda implements Function0<String> {
                public final /* synthetic */ Success<List<WatchData>> a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0698a(Success<? extends List<WatchData>> success) {
                    super(0);
                    this.a = success;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return String.valueOf(this.a.getValue());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WatchFaceStoreFragment watchFaceStoreFragment) {
                super(1);
                this.a = watchFaceStoreFragment;
            }

            public final void a(@NotNull Success<? extends List<WatchData>> success) {
                this.a.resetViewStatus();
                HMLog.info(WatchFaceStoreFragment.o, new C0698a(success));
                List<WatchData> value = success.getValue();
                if (value == null) {
                    return;
                }
                WatchFaceStoreFragment watchFaceStoreFragment = this.a;
                if (value.size() == 0) {
                    watchFaceStoreFragment.d().homeRecyclerView.setNoMore(true);
                    return;
                }
                watchFaceStoreFragment.pageNum++;
                watchFaceStoreFragment.watchFaceList.addAll(value);
                watchFaceStoreFragment.g().addAll(value);
                if (watchFaceStoreFragment.isListMode()) {
                    watchFaceStoreFragment.d().homeRecyclerView.loadMoreComplete();
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Success<? extends List<? extends WatchData>> success) {
                a(success);
                return Unit.INSTANCE;
            }
        }

        public c() {
            super(1);
        }

        public final void a(@NotNull StateBuilder<List<WatchData>> stateBuilder) {
            stateBuilder.onSuccess(new a(WatchFaceStoreFragment.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StateBuilder<List<? extends WatchData>> stateBuilder) {
            a(stateBuilder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"Lcom/huami/watchfacesstore/view/recycleview/ViewHolder;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "position", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d implements BaseRVAdapter.OnItemClickListener {
        public final /* synthetic */ LoadMoreRecyclerView a;
        public final /* synthetic */ WatchFaceStoreFragment b;

        public d(LoadMoreRecyclerView loadMoreRecyclerView, WatchFaceStoreFragment watchFaceStoreFragment) {
            this.a = loadMoreRecyclerView;
            this.b = watchFaceStoreFragment;
        }

        @Override // com.huami.watchfacesstore.view.recycleview.BaseRVAdapter.OnItemClickListener
        public final void onItemClick(ViewHolder viewHolder, int i, int i2) {
            WatchFaceDetailActivity.Companion.actionStart$default(WatchFaceDetailActivity.INSTANCE, this.a.getContext(), 0, ((WatchData) this.b.watchFaceList.get(i2)).getId(), null, null, 24, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watchfacesstore/ui/adapter/WatchFaceAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<WatchFaceAdapter> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WatchFaceAdapter getA() {
            return new WatchFaceAdapter(WatchFaceStoreFragment.this.requireContext(), R.layout.wf_item_new_watchface, DeviceConfigManager.DeviceSize.SIZE_TWO, true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "onLoadMore";
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[6];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(WatchFaceStoreFragment.class), "binding", "getBinding()Lcom/huami/watchfacesstore/databinding/WfFragmentWatchfacesStoreBinding;"));
        kPropertyArr[4] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(WatchFaceStoreFragment.class), "isListMode", "isListMode()Z"));
        n = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WatchFaceStoreFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceConfigManager = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<DeviceConfigManager>() { // from class: com.huami.watchfacesstore.ui.store.WatchFaceStoreFragment$special$$inlined$inject$default$1
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
        this.watchFaceList = new ArrayList();
        this.pageNum = 1;
        this.homeAdapter = LazyKt__LazyJVMKt.lazy(new a());
        this.listAdapter = LazyKt__LazyJVMKt.lazy(new e());
        Delegates delegates = Delegates.INSTANCE;
        final Boolean bool = Boolean.FALSE;
        this.isListMode = new ObservableProperty<Boolean>(bool) { // from class: com.huami.watchfacesstore.ui.store.WatchFaceStoreFragment$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, Boolean oldValue, Boolean newValue) {
                boolean zBooleanValue = newValue.booleanValue();
                oldValue.booleanValue();
                this.d().homeRecyclerView.reset();
                if (zBooleanValue) {
                    LoadMoreRecyclerView loadMoreRecyclerView = this.d().homeRecyclerView;
                    loadMoreRecyclerView.setPadding(ExtensionsKt.getDp(15), ExtensionsKt.getDp(15), ExtensionsKt.getDp(5), ExtensionsKt.getDp(5));
                    loadMoreRecyclerView.setLayoutManager(new GridLayoutManager(this.requireContext(), 2));
                    loadMoreRecyclerView.setAdapter(this.g());
                    this.g().setOnItemClickListener(new WatchFaceStoreFragment.d(loadMoreRecyclerView, this));
                    loadMoreRecyclerView.setLoadingListener(this);
                    loadMoreRecyclerView.loadMoreComplete();
                    return;
                }
                LoadMoreRecyclerView loadMoreRecyclerView2 = this.d().homeRecyclerView;
                loadMoreRecyclerView2.setPadding(0, 0, 0, 0);
                loadMoreRecyclerView2.getRecycledViewPool().setMaxRecycledViews(R.layout.wf_home_item_cool_special, 0);
                loadMoreRecyclerView2.setViewCacheExtension(this.f().getViewCache());
                loadMoreRecyclerView2.setLayoutManager(new LinearLayoutManager(this.requireContext(), 1, false));
                loadMoreRecyclerView2.setAdapter(this.f());
                loadMoreRecyclerView2.setLoadingListener(this);
                loadMoreRecyclerView2.setNoMore(true);
            }
        };
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.watchfacesstore.ui.store.WatchFaceStoreFragment$special$$inlined$viewModel$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.NONE;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.watchViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<WatchStoreViewModel>() { // from class: com.huami.watchfacesstore.ui.store.WatchFaceStoreFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.watchfacesstore.ui.store.WatchStoreViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final WatchStoreViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, objArr2, Reflection.getOrCreateKotlinClass(WatchStoreViewModel.class), function0, objArr3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WfFragmentWatchfacesStoreBinding d() {
        return (WfFragmentWatchfacesStoreBinding) this.binding.getValue(this, n[0]);
    }

    private final DeviceConfigManager e() {
        return (DeviceConfigManager) this.deviceConfigManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HomeAdapter f() {
        return (HomeAdapter) this.homeAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseRVAdapter<WatchData> g() {
        return (BaseRVAdapter) this.listAdapter.getValue();
    }

    private final WatchStoreViewModel h() {
        return (WatchStoreViewModel) this.watchViewModel.getValue();
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseFragment
    @NotNull
    public int[] getContainerIds() {
        return new int[]{R.id.home_recyclerView};
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseFragment
    @NotNull
    public ViewBinding getViewBinding() {
        return d();
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseFragment
    public void initView() {
        setListMode(false);
        LiveDataExtensionKt.observeState$default(h().getHomeLiveData(), getViewLifecycleOwner(), null, new b(), 2, null);
        LiveDataExtensionKt.observeState$default(h().getWatchListLiveData(), getViewLifecycleOwner(), null, new c(), 2, null);
        if (NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            loadData();
        } else {
            showNetworkError();
        }
    }

    public final boolean isListMode() {
        return ((Boolean) this.isListMode.getValue(this, n[4])).booleanValue();
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseFragment
    public void loadData() {
        h().getHomeList(e().getDeviceInfo().getDeviceId());
        h().getWatchFaceList(e().getDeviceInfo().getDeviceId(), this.pageNum);
    }

    @Override // com.huami.watchfacesstore.view.recycleview.LoadMoreRecyclerView.LoadingListener
    public void onLoadMore() {
        HMLog.info(o, f.a);
        h().getWatchFaceList(e().getDeviceInfo().getDeviceId(), this.pageNum);
    }

    @Override // com.huami.watchfacesstore.view.recycleview.LoadMoreRecyclerView.LoadingListener
    public /* synthetic */ void onScroll(int i, int i2) {
        com.huami.watchfacesstore.view.recycleview.e.a(this, i, i2);
    }

    @Override // com.huami.watchfacesstore.view.recycleview.LoadMoreRecyclerView.LoadingListener
    public /* synthetic */ void onScrollDown() {
        com.huami.watchfacesstore.view.recycleview.e.b(this);
    }

    @Override // com.huami.watchfacesstore.view.recycleview.LoadMoreRecyclerView.LoadingListener
    public /* synthetic */ void onScrollUp() {
        com.huami.watchfacesstore.view.recycleview.e.c(this);
    }

    public final void setListMode(boolean z) {
        this.isListMode.setValue(this, n[4], Boolean.valueOf(z));
    }
}
