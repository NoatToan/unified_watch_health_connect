package com.huami.watchfacesstore.ui.store.list;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.viewbinding.ViewBinding;
import com.amap.api.mapcore.util.hl;
import com.huami.arch.core.LiveDataExtensionKt;
import com.huami.arch.core.Loading;
import com.huami.arch.core.State;
import com.huami.arch.core.StateBuilder;
import com.huami.arch.core.Success;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.StatusBarUtil;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.activity.ActivityViewBindingsKt;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.analytic.WFAnalyticHelper;
import com.huami.watchfacesstore.analytic.WFStateEvent;
import com.huami.watchfacesstore.bean.WatchData;
import com.huami.watchfacesstore.databinding.WfActivityRanklistBinding;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.huami.watchfacesstore.ui.adapter.RankHeaderAdapter;
import com.huami.watchfacesstore.ui.adapter.RankInnerAdapter;
import com.huami.watchfacesstore.ui.base.BaseActivity;
import com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailActivity;
import com.huami.watchfacesstore.ui.store.list.RankListActivity;
import com.huami.watchfacesstore.view.CommonTitleBar;
import com.huami.watchfacesstore.view.banner.ScaleInTransformer;
import com.huami.watchfacesstore.view.recycleview.BaseRVAdapter;
import com.huami.watchfacesstore.view.recycleview.LoadMoreRecyclerView;
import com.huami.watchfacesstore.view.recycleview.ViewHolder;
import com.loc.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
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

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\u0007¢\u0006\u0004\b(\u0010)J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016R\u001d\u0010\u0011\u001a\u00020\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001b\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001f\u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\"R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\"R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010&¨\u0006+"}, d2 = {"Lcom/huami/watchfacesstore/ui/store/list/RankListActivity;", "Lcom/huami/watchfacesstore/ui/base/BaseActivity;", "Lcom/huami/watchfacesstore/view/recycleview/LoadMoreRecyclerView$LoadingListener;", "", "m", "initView", "loadData", "Landroidx/viewbinding/ViewBinding;", "getBinding", "", "getContainerIds", "onLoadMore", "Lcom/huami/watchfacesstore/databinding/WfActivityRanklistBinding;", "g", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "i", "()Lcom/huami/watchfacesstore/databinding/WfActivityRanklistBinding;", "binding", "Lcom/huami/watchfacesstore/ui/adapter/RankHeaderAdapter;", "h", "Lkotlin/Lazy;", z.j, "()Lcom/huami/watchfacesstore/ui/adapter/RankHeaderAdapter;", "headerAdapter", "Lcom/huami/watchfacesstore/ui/adapter/RankInnerAdapter;", "l", "()Lcom/huami/watchfacesstore/ui/adapter/RankInnerAdapter;", "otherListAdapter", "Lcom/huami/watchfacesstore/ui/store/list/ListViewModel;", hl.k, "()Lcom/huami/watchfacesstore/ui/store/list/ListViewModel;", "mViewModel", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "Ljava/util/List;", "otherLists", "headerLists", "", "Ljava/lang/String;", "rankType", "<init>", "()V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class RankListActivity extends BaseActivity implements LoadMoreRecyclerView.LoadingListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final /* synthetic */ KProperty<Object>[] n;

    @NotNull
    private static final String o = "RankListActivity";

    @NotNull
    private static final String p = "rank_type";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding = ActivityViewBindingsKt.viewBinding(new RankListActivity$special$$inlined$viewBinding$1(new InflateViewBinder(WfActivityRanklistBinding.class)));

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy headerAdapter = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy otherListAdapter = LazyKt__LazyJVMKt.lazy(new e());

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private List<WatchData> otherLists;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private List<WatchData> headerLists;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private String rankType;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Lcom/huami/watchfacesstore/ui/store/list/RankListActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "rankType", "", "actionStart", "RANK_TYPE", "Ljava/lang/String;", "TAG", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void actionStart(@NotNull Context context, @NotNull String rankType) {
            context.startActivity(new Intent(context, (Class<?>) RankListActivity.class).putExtra("rank_type", rankType));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watchfacesstore/ui/adapter/RankHeaderAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<RankHeaderAdapter> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RankHeaderAdapter getA() {
            return new RankHeaderAdapter(RankListActivity.this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/StateBuilder;", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<StateBuilder<List<? extends WatchData>>, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Success;", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Success<? extends List<? extends WatchData>>, Unit> {
            public final /* synthetic */ RankListActivity a;

            /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.store.list.RankListActivity$b$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0707a extends Lambda implements Function0<String> {
                public final /* synthetic */ List<WatchData> a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0707a(List<WatchData> list) {
                    super(0);
                    this.a = list;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return this.a.toString();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(RankListActivity rankListActivity) {
                super(1);
                this.a = rankListActivity;
            }

            public final void a(@NotNull Success<? extends List<WatchData>> success) {
                this.a.resetViewStatus();
                List<WatchData> value = success.getValue();
                if (value == null) {
                    return;
                }
                RankListActivity rankListActivity = this.a;
                rankListActivity.headerLists.addAll(value);
                rankListActivity.j().addAll(value);
                HMLog.info(RankListActivity.o, new C0707a(value));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Success<? extends List<? extends WatchData>> success) {
                a(success);
                return Unit.INSTANCE;
            }
        }

        public b() {
            super(1);
        }

        public final void a(@NotNull StateBuilder<List<WatchData>> stateBuilder) {
            stateBuilder.onSuccess(new a(RankListActivity.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StateBuilder<List<? extends WatchData>> stateBuilder) {
            a(stateBuilder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/StateBuilder;", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<StateBuilder<List<? extends WatchData>>, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Loading;", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Loading<? extends List<? extends WatchData>>, Unit> {
            public final /* synthetic */ RankListActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(RankListActivity rankListActivity) {
                super(1);
                this.a = rankListActivity;
            }

            public final void a(@NotNull Loading<? extends List<WatchData>> loading) {
                this.a.showLoadingDialog();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Loading<? extends List<? extends WatchData>> loading) {
                a(loading);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Success;", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<Success<? extends List<? extends WatchData>>, Unit> {
            public final /* synthetic */ RankListActivity a;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ List<WatchData> a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(List<WatchData> list) {
                    super(0);
                    this.a = list;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return this.a.toString();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(RankListActivity rankListActivity) {
                super(1);
                this.a = rankListActivity;
            }

            public final void a(@NotNull Success<? extends List<WatchData>> success) {
                List<WatchData> value = success.getValue();
                if (value == null) {
                    return;
                }
                RankListActivity rankListActivity = this.a;
                if (value.isEmpty()) {
                    rankListActivity.i().rlOtherList.setNoMore(true);
                    return;
                }
                rankListActivity.otherLists.addAll(value);
                rankListActivity.l().addAll(value);
                rankListActivity.i().rlOtherList.loadMoreComplete();
                HMLog.info(RankListActivity.o, new a(value));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Success<? extends List<? extends WatchData>> success) {
                a(success);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.store.list.RankListActivity$c$c, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/State;", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0708c extends Lambda implements Function1<State<? extends List<? extends WatchData>>, Unit> {
            public final /* synthetic */ RankListActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0708c(RankListActivity rankListActivity) {
                super(1);
                this.a = rankListActivity;
            }

            public final void a(@NotNull State<? extends List<WatchData>> state) {
                this.a.hideLoadingDialog();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(State<? extends List<? extends WatchData>> state) {
                a(state);
                return Unit.INSTANCE;
            }
        }

        public c() {
            super(1);
        }

        public final void a(@NotNull StateBuilder<List<WatchData>> stateBuilder) {
            stateBuilder.onLoading(new a(RankListActivity.this));
            stateBuilder.onSuccess(new b(RankListActivity.this));
            stateBuilder.onCompleted(new C0708c(RankListActivity.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StateBuilder<List<? extends WatchData>> stateBuilder) {
            a(stateBuilder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Scroll Bottom, start to get rankList";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watchfacesstore/ui/adapter/RankInnerAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<RankInnerAdapter> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RankInnerAdapter getA() {
            return new RankInnerAdapter(RankListActivity.this, 1, null, 4, null);
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[4];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(RankListActivity.class), "binding", "getBinding()Lcom/huami/watchfacesstore/databinding/WfActivityRanklistBinding;"));
        n = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RankListActivity() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.watchfacesstore.ui.store.list.RankListActivity$special$$inlined$viewModel$default$1
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
        this.mViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ListViewModel>() { // from class: com.huami.watchfacesstore.ui.store.list.RankListActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.watchfacesstore.ui.store.list.ListViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ListViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(ListViewModel.class), function0, objArr);
            }
        });
        this.otherLists = new ArrayList();
        this.headerLists = new ArrayList();
        this.rankType = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WfActivityRanklistBinding i() {
        return (WfActivityRanklistBinding) this.binding.getValue(this, n[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RankHeaderAdapter j() {
        return (RankHeaderAdapter) this.headerAdapter.getValue();
    }

    private final ListViewModel k() {
        return (ListViewModel) this.mViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RankInnerAdapter l() {
        return (RankInnerAdapter) this.otherListAdapter.getValue();
    }

    private final void m() {
        LiveDataExtensionKt.observeState$default(k().getHeaderLiveData(), this, null, new b(), 2, null);
        LiveDataExtensionKt.observeState$default(k().getOtherListsLiveData(), this, null, new c(), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(RankListActivity rankListActivity, NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        LoadMoreRecyclerView loadMoreRecyclerView = rankListActivity.i().rlOtherList;
        if (i2 != nestedScrollView.getChildAt(0).getMeasuredHeight() - nestedScrollView.getMeasuredHeight() || loadMoreRecyclerView.isNoMore()) {
            return;
        }
        HMLog.info(o, d.a);
        rankListActivity.k().getRankLists(rankListActivity.rankType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(RankListActivity rankListActivity, ViewHolder viewHolder, int i, int i2) {
        WatchFaceDetailActivity.Companion.actionStart$default(WatchFaceDetailActivity.INSTANCE, rankListActivity, 0, rankListActivity.otherLists.get(i2).getId(), null, WatchFaceDetailActivity.FROM_RANK, 8, null);
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseActivity
    @NotNull
    public ViewBinding getBinding() {
        return i();
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseActivity
    @NotNull
    public int[] getContainerIds() {
        return new int[]{R.id.rank_banner, R.id.rl_other_list};
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseActivity
    public void initView() {
        StatusBarUtil.setStatusTranslate(this);
        k().setPageNum(1);
        String stringExtra = getIntent().getStringExtra("rank_type");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.rankType = stringExtra;
        WFAnalyticHelper.analyticCount$default(WFAnalyticHelper.INSTANCE, WFStateEvent.WF_RANKING_VIEW_NUM, null, q.mapOf(TuplesKt.to(WFStateEvent.WF_RANKING_SOURCE, stringExtra)), null, 10, null);
        CommonTitleBar commonTitleBar = i().commonTitleBar;
        ViewGroup.LayoutParams layoutParams = commonTitleBar.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = ExtensionsKt.getStatusBarHeight(this);
        Unit unit = Unit.INSTANCE;
        commonTitleBar.setLayoutParams(layoutParams2);
        i().rankBanner.setAutoPlay(false).setPageMargin(getResources().getDisplayMetrics().widthPixels / 4, 0).setPageTransformer(new ScaleInTransformer(0.9f)).setHolderRestLoader(j()).setAdapter(j());
        LoadMoreRecyclerView loadMoreRecyclerView = i().rlOtherList;
        loadMoreRecyclerView.setAdapter(l());
        loadMoreRecyclerView.setLoadingListener(this);
        loadMoreRecyclerView.setOverScrollMode(2);
        i().scrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() { // from class: s66
            @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
            public final void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                RankListActivity.n(this.a, nestedScrollView, i, i2, i3, i4);
            }
        });
        l().setOnItemClickListener(new BaseRVAdapter.OnItemClickListener() { // from class: t66
            @Override // com.huami.watchfacesstore.view.recycleview.BaseRVAdapter.OnItemClickListener
            public final void onItemClick(ViewHolder viewHolder, int i, int i2) {
                RankListActivity.o(this.a, viewHolder, i, i2);
            }
        });
        m();
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseActivity
    public void loadData() {
        k().getRankLists(this.rankType);
    }

    @Override // com.huami.watchfacesstore.view.recycleview.LoadMoreRecyclerView.LoadingListener
    public void onLoadMore() {
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
}
