package com.huami.watch.companion.watchface;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.lib.view.quickadapter.BaseQuickAdapter;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.R;
import com.huami.watch.companion.watchface.XiHuWatchFaceDiyFragment;
import com.huami.watch.companion.watchface.adapter.WatchFaceDiyAdapter;
import com.huami.watch.companion.watchface.bean.WatchSkinBean;
import com.huami.watch.companion.watchface.manager.XiHuDiyWatchFaceManager;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J&\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\u0010\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001d\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006!"}, d2 = {"Lcom/huami/watch/companion/watchface/XiHuWatchFaceDiyFragment;", "Landroidx/fragment/app/Fragment;", "", "initView", "initData", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "onAttach", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "onActivityCreated", "Lcom/huami/watch/companion/watchface/adapter/WatchFaceDiyAdapter;", "a", "Lcom/huami/watch/companion/watchface/adapter/WatchFaceDiyAdapter;", "watchFaceDiyAdapter", "Lcom/huami/watch/companion/watchface/manager/XiHuDiyWatchFaceManager;", "b", "Lcom/huami/watch/companion/watchface/manager/XiHuDiyWatchFaceManager;", "mManager", "Lcom/huami/watch/companion/watchface/XiHuWatchFaceDiyViewModule;", "c", "Lkotlin/Lazy;", "()Lcom/huami/watch/companion/watchface/XiHuWatchFaceDiyViewModule;", "vm", "<init>", "()V", "Companion", "companion_release"}, k = 1, mv = {1, 5, 1})
public final class XiHuWatchFaceDiyFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private WatchFaceDiyAdapter watchFaceDiyAdapter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private XiHuDiyWatchFaceManager mManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lcom/huami/watch/companion/watchface/XiHuWatchFaceDiyFragment$Companion;", "", "Lcom/huami/watch/companion/watchface/XiHuWatchFaceDiyFragment;", "newInstance", "<init>", "()V", "companion_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final XiHuWatchFaceDiyFragment newInstance() {
            return new XiHuWatchFaceDiyFragment();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watch/companion/watchface/XiHuWatchFaceDiyViewModule;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<XiHuWatchFaceDiyViewModule> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final XiHuWatchFaceDiyViewModule getA() {
            return (XiHuWatchFaceDiyViewModule) new ViewModelProvider(XiHuWatchFaceDiyFragment.this.getActivity()).get(XiHuWatchFaceDiyViewModule.class);
        }
    }

    private final XiHuWatchFaceDiyViewModule c() {
        return (XiHuWatchFaceDiyViewModule) this.vm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(XiHuWatchFaceDiyFragment xiHuWatchFaceDiyFragment, WatchSkinBean[] watchSkinBeanArr) {
        WatchFaceDiyAdapter watchFaceDiyAdapter = xiHuWatchFaceDiyFragment.watchFaceDiyAdapter;
        if (watchFaceDiyAdapter == null) {
            watchFaceDiyAdapter = null;
        }
        watchFaceDiyAdapter.setNewData(ArraysKt___ArraysJvmKt.asList(watchSkinBeanArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(XiHuWatchFaceDiyFragment xiHuWatchFaceDiyFragment, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        CostumeWatchFaceActivity.Companion companion = CostumeWatchFaceActivity.INSTANCE;
        Context context = xiHuWatchFaceDiyFragment.getContext();
        Object[] array = baseQuickAdapter.getData().toArray(new WatchSkinBean[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        companion.launchActivity(context, i, (WatchSkinBean[]) array);
    }

    private final void initData() {
        c().getDiyWatchSkinLiveData().observe(this, new Observer() { // from class: qx8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                XiHuWatchFaceDiyFragment.d(this.a, (WatchSkinBean[]) obj);
            }
        });
    }

    private final void initView() {
        this.watchFaceDiyAdapter = new WatchFaceDiyAdapter();
        View view = getView();
        RecyclerView recyclerView = (RecyclerView) (view == null ? null : view.findViewById(R.id.watch_diy_face_rv));
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
            WatchFaceDiyAdapter watchFaceDiyAdapter = this.watchFaceDiyAdapter;
            if (watchFaceDiyAdapter == null) {
                watchFaceDiyAdapter = null;
            }
            recyclerView.setAdapter(watchFaceDiyAdapter);
        }
        WatchFaceDiyAdapter watchFaceDiyAdapter2 = this.watchFaceDiyAdapter;
        (watchFaceDiyAdapter2 != null ? watchFaceDiyAdapter2 : null).setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: rx8
            @Override // com.huami.lib.view.quickadapter.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view2, int i) {
                XiHuWatchFaceDiyFragment.e(this.a, baseQuickAdapter, view2, i);
            }
        });
    }

    @JvmStatic
    @NotNull
    public static final XiHuWatchFaceDiyFragment newInstance() {
        return INSTANCE.newInstance();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        initData();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        super.onAttach(context);
        this.mManager = new XiHuDiyWatchFaceManager(context);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_xi_hu_watch_face_diy, container, false);
    }
}
