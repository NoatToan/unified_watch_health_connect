package com.huami.watchfacesstore.ui.store.list;

import android.content.ComponentCallbacks;
import androidx.annotation.CallSuper;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.viewbinding.ViewBinding;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.arch.core.Fail;
import com.huami.arch.core.LiveDataExtensionKt;
import com.huami.arch.core.Loading;
import com.huami.arch.core.State;
import com.huami.arch.core.StateBuilder;
import com.huami.arch.core.Success;
import com.huami.sleepassistant.apilib.utils.WebConst;
import com.huami.view.basetitle.StatusBarUtil;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.activity.ActivityViewBindingsKt;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.bean.WatchData;
import com.huami.watchfacesstore.databinding.WfActivityCommonListBinding;
import com.huami.watchfacesstore.device.DeviceConfigManager;
import com.huami.watchfacesstore.ui.adapter.WatchFaceAdapter;
import com.huami.watchfacesstore.ui.base.BaseActivity;
import com.huami.watchfacesstore.ui.store.list.AbstractListActivity;
import com.huami.watchfacesstore.view.recycleview.BaseRVAdapter;
import com.huami.watchfacesstore.view.recycleview.LoadMoreRecyclerView;
import com.huami.watchfacesstore.view.recycleview.ViewHolder;
import com.huami.watchfacesstore.view.recycleview.e;
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
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0001=B\u0007¢\u0006\u0004\b;\u0010<J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0017J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u001d\u0010\n\u001a\u00020\u0005\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u000f\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H&J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016R\u001d\u0010\u001c\u001a\u00020\u00178F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010'\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R(\u0010/\u001a\b\u0012\u0004\u0012\u00020\r0(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001d\u00105\u001a\u0002008D@\u0004X\u0084\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001d\u0010:\u001a\u0002068F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\u0019\u001a\u0004\b8\u00109¨\u0006>"}, d2 = {"Lcom/huami/watchfacesstore/ui/store/list/AbstractListActivity;", "Lcom/huami/watchfacesstore/ui/base/BaseActivity;", "Lcom/huami/watchfacesstore/view/recycleview/LoadMoreRecyclerView$LoadingListener;", "", "needRegisterPurchase", "", "initView", "loadData", ExifInterface.GPS_DIRECTION_TRUE, "data", "setData", "(Ljava/lang/Object;)V", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "dataList", "setUiData", "", "position", "onListItemClick", "Landroidx/viewbinding/ViewBinding;", "getBinding", "", "getContainerIds", "Lcom/huami/watchfacesstore/ui/store/list/ListViewModel;", "g", "Lkotlin/Lazy;", "getListViewModel", "()Lcom/huami/watchfacesstore/ui/store/list/ListViewModel;", "listViewModel", "h", LogUtil.I, "getId", "()I", WebConst.QueryParam.SET_ID, "(I)V", "id", "i", "getPageMode", "setPageMode", "pageMode", "", z.j, "Ljava/util/List;", "getDataLists", "()Ljava/util/List;", "setDataLists", "(Ljava/util/List;)V", "dataLists", "Lcom/huami/watchfacesstore/databinding/WfActivityCommonListBinding;", hl.k, "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "getMBinding", "()Lcom/huami/watchfacesstore/databinding/WfActivityCommonListBinding;", "mBinding", "Lcom/huami/watchfacesstore/ui/adapter/WatchFaceAdapter;", "l", "getListAdapter", "()Lcom/huami/watchfacesstore/ui/adapter/WatchFaceAdapter;", "listAdapter", "<init>", "()V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public abstract class AbstractListActivity extends BaseActivity implements LoadMoreRecyclerView.LoadingListener {
    public static final int DEFAULT_ID = -1;

    @NotNull
    public static final String LIST_ID = "list_id";

    @NotNull
    public static final String PAGE_MODE = "page_mode";
    public static final /* synthetic */ KProperty<Object>[] m;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy listViewModel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int id;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int pageMode;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private List<WatchData> dataLists;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty mBinding;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Lazy listAdapter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/StateBuilder;", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<StateBuilder<List<? extends WatchData>>, Unit> {

        /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.store.list.AbstractListActivity$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Loading;", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0704a extends Lambda implements Function1<Loading<? extends List<? extends WatchData>>, Unit> {
            public final /* synthetic */ AbstractListActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0704a(AbstractListActivity abstractListActivity) {
                super(1);
                this.a = abstractListActivity;
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
            public final /* synthetic */ AbstractListActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(AbstractListActivity abstractListActivity) {
                super(1);
                this.a = abstractListActivity;
            }

            public final void a(@NotNull Success<? extends List<WatchData>> success) {
                List<WatchData> value = success.getValue();
                if (value == null) {
                    return;
                }
                this.a.setData(value);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Success<? extends List<? extends WatchData>> success) {
                a(success);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Fail;", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function1<Fail<? extends List<? extends WatchData>>, Unit> {
            public final /* synthetic */ AbstractListActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(AbstractListActivity abstractListActivity) {
                super(1);
                this.a = abstractListActivity;
            }

            public final void a(@NotNull Fail<? extends List<WatchData>> fail) {
                this.a.showDefaultError();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Fail<? extends List<? extends WatchData>> fail) {
                a(fail);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/State;", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function1<State<? extends List<? extends WatchData>>, Unit> {
            public final /* synthetic */ AbstractListActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(AbstractListActivity abstractListActivity) {
                super(1);
                this.a = abstractListActivity;
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

        public a() {
            super(1);
        }

        public final void a(@NotNull StateBuilder<List<WatchData>> stateBuilder) {
            stateBuilder.onLoading(new C0704a(AbstractListActivity.this));
            stateBuilder.onSuccess(new b(AbstractListActivity.this));
            stateBuilder.onFail(new c(AbstractListActivity.this));
            stateBuilder.onCompleted(new d(AbstractListActivity.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StateBuilder<List<? extends WatchData>> stateBuilder) {
            a(stateBuilder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watchfacesstore/ui/adapter/WatchFaceAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<WatchFaceAdapter> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WatchFaceAdapter getA() {
            AbstractListActivity abstractListActivity = AbstractListActivity.this;
            return new WatchFaceAdapter(abstractListActivity, R.layout.wf_item_new_watchface, DeviceConfigManager.DeviceSize.SIZE_TWO, abstractListActivity.needRegisterPurchase());
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[3];
        kPropertyArr[1] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(AbstractListActivity.class), "mBinding", "getMBinding()Lcom/huami/watchfacesstore/databinding/WfActivityCommonListBinding;"));
        m = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractListActivity() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.watchfacesstore.ui.store.list.AbstractListActivity$special$$inlined$viewModel$default$1
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
        this.listViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ListViewModel>() { // from class: com.huami.watchfacesstore.ui.store.list.AbstractListActivity$special$$inlined$viewModel$default$2
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
        this.id = -1;
        this.pageMode = -1;
        this.dataLists = new ArrayList();
        this.mBinding = ActivityViewBindingsKt.viewBinding(new AbstractListActivity$special$$inlined$viewBinding$1(new InflateViewBinder(WfActivityCommonListBinding.class)));
        this.listAdapter = LazyKt__LazyJVMKt.lazy(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(AbstractListActivity abstractListActivity, ViewHolder viewHolder, int i, int i2) {
        if (!abstractListActivity.getDataLists().isEmpty()) {
            abstractListActivity.onListItemClick(i2);
        }
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseActivity
    @NotNull
    public ViewBinding getBinding() {
        return getMBinding();
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseActivity
    @NotNull
    public int[] getContainerIds() {
        return new int[]{R.id.rl_list};
    }

    @NotNull
    public final List<WatchData> getDataLists() {
        return this.dataLists;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final WatchFaceAdapter getListAdapter() {
        return (WatchFaceAdapter) this.listAdapter.getValue();
    }

    @NotNull
    public final ListViewModel getListViewModel() {
        return (ListViewModel) this.listViewModel.getValue();
    }

    @NotNull
    public final WfActivityCommonListBinding getMBinding() {
        return (WfActivityCommonListBinding) this.mBinding.getValue(this, m[1]);
    }

    public final int getPageMode() {
        return this.pageMode;
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseActivity
    @CallSuper
    public void initView() {
        StatusBarUtil.setStatusBarColor(this, ContextCompat.getColor(this, R.color.wf_home_background_color));
        getListViewModel().setPageNum(1);
        this.id = getIntent().getIntExtra(LIST_ID, -1);
        this.pageMode = getIntent().getIntExtra(PAGE_MODE, -1);
        LoadMoreRecyclerView loadMoreRecyclerView = getMBinding().rlList;
        loadMoreRecyclerView.setAdapter(getListAdapter());
        loadMoreRecyclerView.setLoadingListener(this);
        getListAdapter().setOnItemClickListener(new BaseRVAdapter.OnItemClickListener() { // from class: a0
            @Override // com.huami.watchfacesstore.view.recycleview.BaseRVAdapter.OnItemClickListener
            public final void onItemClick(ViewHolder viewHolder, int i, int i2) {
                AbstractListActivity.h(this.a, viewHolder, i, i2);
            }
        });
        LiveDataExtensionKt.observeState$default(getListViewModel().getListLiveData(), this, null, new a(), 2, null);
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseActivity
    public void loadData() {
        getListViewModel().getDataLists(this.pageMode, this.id);
    }

    public boolean needRegisterPurchase() {
        return false;
    }

    public abstract void onListItemClick(int position);

    @Override // com.huami.watchfacesstore.view.recycleview.LoadMoreRecyclerView.LoadingListener
    public /* synthetic */ void onScroll(int i, int i2) {
        e.a(this, i, i2);
    }

    @Override // com.huami.watchfacesstore.view.recycleview.LoadMoreRecyclerView.LoadingListener
    public /* synthetic */ void onScrollDown() {
        e.b(this);
    }

    @Override // com.huami.watchfacesstore.view.recycleview.LoadMoreRecyclerView.LoadingListener
    public /* synthetic */ void onScrollUp() {
        e.c(this);
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseActivity
    public <T> void setData(T data) {
        super.setData(data);
        List<WatchData> list = data instanceof List ? (List) data : null;
        if (list == null) {
            return;
        }
        setUiData(list);
    }

    public final void setDataLists(@NotNull List<WatchData> list) {
        this.dataLists = list;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setPageMode(int i) {
        this.pageMode = i;
    }

    public abstract void setUiData(@NotNull List<WatchData> dataList);
}
