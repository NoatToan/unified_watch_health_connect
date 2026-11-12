package com.xiaomi.fitness.watch.face;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.NestRecyclerViewItemEffectiveExposeBiz;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.baseui.recyclerview.view.Status;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.main.export.ConfigPreference;
import com.xiaomi.fitness.watch.face.FaceTabListFragment;
import com.xiaomi.fitness.watch.face.adapter.FaceTabListAdapter;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.fitness.watch.face.export.exportview.FaceIcon;
import com.xiaomi.fitness.watch.face.market.DeviceFaceMarketPageManager;
import com.xiaomi.fitness.watch.face.view.FaceWaterMarkView;
import com.xiaomi.fitness.watch.face.viewmodel.FaceTabListViewModel;
import com.xiaomi.fitness.watch.face.widget.FaceMarketItemDecoration;
import com.xiaomi.fitness.watch.face.widget.StateLayout;
import defpackage.fka;
import defpackage.iki;
import defpackage.ovi;
import defpackage.tv1;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 /2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001/B\u0007¢\u0006\u0004\b.\u0010\u0011J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0011R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u0019R\u0016\u0010!\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001cR\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001b\u0010\b\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\u001fR\u0014\u0010-\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/xiaomi/fitness/watch/face/FaceTabListFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/watch/face/viewmodel/FaceTabListViewModel;", "Lfka;", "", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "list", "", "trackExpose", "(Ljava/util/List;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "loadData", "()V", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", LifecycleConstantKt.ON_DESTROY, "", "type", "I", "", "tabId", "Ljava/lang/String;", "", "inWhiteList", "Z", "tabSource", "source", "Lcom/xiaomi/fitness/watch/face/adapter/FaceTabListAdapter;", "mAdapter", "Lcom/xiaomi/fitness/watch/face/adapter/FaceTabListAdapter;", "Lcom/example/statistics/export/NestRecyclerViewItemEffectiveExposeBiz;", "trackExpose$delegate", "Lkotlin/Lazy;", "getTrackExpose", "()Lcom/example/statistics/export/NestRecyclerViewItemEffectiveExposeBiz;", "tracked", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FaceTabListFragment extends Hilt_FaceTabListFragment<FaceTabListViewModel, fka> {

    @NotNull
    public static final String BANNER = "banner";

    @NotNull
    public static final String SOURCE = "source";

    @NotNull
    public static final String TAB_ID = "tab_id";

    @NotNull
    public static final String TAB_NAME = "tab_name";

    @NotNull
    public static final String TAB_SOURCE = "tab_source";

    @NotNull
    public static final String TAB_TYPE = "tab_type";

    @NotNull
    private static final String TAG = "FaceTabListFragment";

    @NotNull
    public static final String WHITE_LIST = "white_list";
    private boolean inWhiteList;

    @Nullable
    private FaceTabListAdapter mAdapter;

    @NotNull
    private String source;

    @NotNull
    private String tabId;
    private int tabSource;

    /* JADX INFO: renamed from: trackExpose$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy trackExpose;
    private boolean tracked;
    private int type;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StateData.Status.values().length];
            try {
                iArr[StateData.Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StateData.Status.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StateData.Status.EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FaceTabListFragment() {
        super(ovi.l0, tv1.d);
        this.tabId = "";
        this.source = "";
        this.trackExpose = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: e69
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceTabListFragment.trackExpose_delegate$lambda$0();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FaceTabListViewModel access$getMViewModel(FaceTabListFragment faceTabListFragment) {
        return (FaceTabListViewModel) faceTabListFragment.getMViewModel();
    }

    private final NestRecyclerViewItemEffectiveExposeBiz getTrackExpose() {
        return (NestRecyclerViewItemEffectiveExposeBiz) this.trackExpose.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(FaceTabListFragment this$0, int i, FaceData faceData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(faceData, "faceData");
        DeviceFaceMarketPageManager deviceFaceMarketPageManager = DeviceFaceMarketPageManager.INSTANCE;
        Context contextRequireContext = this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        deviceFaceMarketPageManager.toFaceDetailPage(contextRequireContext, faceData, "search_result", "watchface_market_search_result", i + 1, this$0.source);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$2(FaceTabListFragment this$0, StateData.Status status) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = status == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i == 1) {
            ((fka) this$0.getMBinding()).D.showContent();
        } else if (i == 2) {
            StateLayout.showLoading$default(((fka) this$0.getMBinding()).D, 0, null, 3, null);
        } else if (i != 3) {
            StateLayout.showError$default(((fka) this$0.getMBinding()).D, null, 1, null);
        } else {
            StateLayout.showEmpty$default(((fka) this$0.getMBinding()).D, 0, null, 0, 7, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$3(FaceTabListFragment this$0, Status status) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MoreRecyclerView moreRecyclerView = ((fka) this$0.getMBinding()).E;
        Intrinsics.checkNotNull(status);
        MoreRecyclerView.setStatus$default(moreRecyclerView, status, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(FaceTabListFragment this$0, FaceTabListViewModel.TabListDataWrapper tabListDataWrapper) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FaceTabListAdapter faceTabListAdapter = this$0.mAdapter;
        if (faceTabListAdapter != null) {
            faceTabListAdapter.updateList(tabListDataWrapper.getList());
        }
        this$0.trackExpose(tabListDataWrapper.getList());
        if (tabListDataWrapper.getStart() > 0) {
            FaceTabListAdapter faceTabListAdapter2 = this$0.mAdapter;
            if (faceTabListAdapter2 != null) {
                faceTabListAdapter2.notifyItemRangeChanged(tabListDataWrapper.getStart(), tabListDataWrapper.getList().size());
            }
        } else {
            FaceTabListAdapter faceTabListAdapter3 = this$0.mAdapter;
            if (faceTabListAdapter3 != null) {
                faceTabListAdapter3.notifyDataSetChanged();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5(FaceTabListFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setTitle(str);
        FaceTabListAdapter faceTabListAdapter = this$0.mAdapter;
        if (faceTabListAdapter != null) {
            Intrinsics.checkNotNull(str);
            faceTabListAdapter.setTabName(str);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$6(FaceTabListFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((FaceTabListViewModel) this$0.getMViewModel()).setKeyword(((fka) this$0.getMBinding()).A.getText().toString());
        ((FaceTabListViewModel) this$0.getMViewModel()).requestData(this$0.type, this$0.tabId, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void trackExpose(List<FaceData> list) {
        String model;
        if (this.tracked || list.isEmpty()) {
            return;
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (model = DeviceModelExtKt.getModel(wearableDeviceModel)) == null) {
            model = "";
        }
        this.tracked = true;
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("expose_v3", "56.82.1.1.35077");
        Object[] objArr = new Object[8];
        objArr[0] = "name";
        objArr[1] = "watchface_2nd_page";
        objArr[2] = FaceDetailFragment.PAGE_NAME;
        String value = ((FaceTabListViewModel) getMViewModel()).getTabName().getValue();
        objArr[3] = value != null ? value : "";
        objArr[4] = "source";
        objArr[5] = String.valueOf(this.tabSource);
        objArr[6] = "device_model";
        objArr[7] = model;
        oneTrackExtKt.reportData(oneTrackStatBean, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestRecyclerViewItemEffectiveExposeBiz trackExpose_delegate$lambda$0() {
        return new NestRecyclerViewItemEffectiveExposeBiz();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return ovi.l0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void loadData() {
        ((FaceTabListViewModel) getMViewModel()).requestData(this.type, this.tabId, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        FaceIcon.syncConfiguration();
        ((fka) getMBinding()).E.invalidateItemDecorations();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        NestRecyclerViewItemEffectiveExposeBiz trackExpose = getTrackExpose();
        MoreRecyclerView tabListRv = ((fka) getMBinding()).E;
        Intrinsics.checkNotNullExpressionValue(tabListRv, "tabListRv");
        trackExpose.endTrackItemExpose(tabListRv);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        String string;
        String string2;
        String string3;
        String string4;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        setTitleBackground(iki.j);
        String str = "";
        if (arguments == null || (string = arguments.getString(TAB_ID)) == null) {
            string = "";
        }
        this.tabId = string;
        if (arguments == null || (string2 = arguments.getString(TAB_TYPE)) == null) {
            string2 = "0";
        }
        this.type = Integer.parseInt(string2);
        boolean z = false;
        this.tabSource = arguments != null ? arguments.getInt(TAB_SOURCE) : 0;
        if (arguments == null || (string3 = arguments.getString("source")) == null) {
            string3 = "";
        }
        this.source = string3;
        if (arguments != null && (string4 = arguments.getString(WHITE_LIST)) != null) {
            str = string4;
        }
        this.inWhiteList = Intrinsics.areEqual(str, "true");
        ((fka) getMBinding()).E.setLayoutManager(new StaggeredGridLayoutManager(FaceManager.INSTANCE.getMarketListCount(), 1));
        ((fka) getMBinding()).E.addItemDecoration(new FaceMarketItemDecoration());
        FaceTabListAdapter faceTabListAdapter = new FaceTabListAdapter(this.tabSource, ConfigPreference.INSTANCE.getSHOW_WATCH_FACE_PRICE());
        this.mAdapter = faceTabListAdapter;
        faceTabListAdapter.setOnItemClickListener(new Function2() { // from class: y59
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FaceTabListFragment.onViewCreated$lambda$1(this.f39804a, ((Integer) obj).intValue(), (FaceData) obj2);
            }
        });
        ((fka) getMBinding()).E.setAdapter(this.mAdapter);
        ((fka) getMBinding()).E.setLoadListener(new MoreRecyclerView.LoadListener() { // from class: com.xiaomi.fitness.watch.face.FaceTabListFragment.onViewCreated.2
            @Override // com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView.LoadListener
            public void loadMore() {
                FaceTabListViewModel.requestData$default(FaceTabListFragment.access$getMViewModel(FaceTabListFragment.this), FaceTabListFragment.this.type, FaceTabListFragment.this.tabId, false, 4, null);
            }
        });
        ((FaceTabListViewModel) getMViewModel()).getPageLiveData().observe(getViewLifecycleOwner(), new FaceTabListFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: z59
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceTabListFragment.onViewCreated$lambda$2(this.f40901a, (StateData.Status) obj);
            }
        }));
        ((FaceTabListViewModel) getMViewModel()).getLoadStatus().observe(getViewLifecycleOwner(), new FaceTabListFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: a69
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceTabListFragment.onViewCreated$lambda$3(this.f681a, (Status) obj);
            }
        }));
        ((FaceTabListViewModel) getMViewModel()).getFeedItems().observe(getViewLifecycleOwner(), new FaceTabListFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: b69
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceTabListFragment.onViewCreated$lambda$4(this.f3856a, (FaceTabListViewModel.TabListDataWrapper) obj);
            }
        }));
        ((FaceTabListViewModel) getMViewModel()).getTabName().observe(getViewLifecycleOwner(), new FaceTabListFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: c69
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceTabListFragment.onViewCreated$lambda$5(this.f4979a, (String) obj);
            }
        }));
        Group searchGroup = ((fka) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(searchGroup, "searchGroup");
        ViewExtKt.setVisible(searchGroup, this.inWhiteList && this.type == 5);
        FaceWaterMarkView faceWaterMarkView = ((fka) getMBinding()).F;
        if (this.inWhiteList && this.type == 5) {
            z = true;
        }
        faceWaterMarkView.setWaterMark(z);
        ((fka) getMBinding()).C.setOnClickListener(new View.OnClickListener() { // from class: d69
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FaceTabListFragment.onViewCreated$lambda$6(this.f15129a, view2);
            }
        });
        NestRecyclerViewItemEffectiveExposeBiz trackExpose = getTrackExpose();
        MoreRecyclerView tabListRv = ((fka) getMBinding()).E;
        Intrinsics.checkNotNullExpressionValue(tabListRv, "tabListRv");
        NestRecyclerViewItemEffectiveExposeBiz.startTrackItemExpose$default(trackExpose, tabListRv, 0, null, 6, null);
    }
}
