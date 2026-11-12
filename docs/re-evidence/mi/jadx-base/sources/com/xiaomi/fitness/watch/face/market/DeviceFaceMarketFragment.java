package com.xiaomi.fitness.watch.face.market;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import coil.Coil;
import coil.memory.MemoryCache;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.NestRecyclerViewItemEffectiveExposeBiz;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.example.statistics.export.TrackContent;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.baseui.recyclerview.view.Status;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.component.StandardComponentEvent;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.watch.face.FaceTabListFragment;
import com.xiaomi.fitness.watch.face.data.DeviceFaceMarketListItemWrapper;
import com.xiaomi.fitness.watch.face.data.FaceListCommonTab;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.export.exportview.FaceIcon;
import com.xiaomi.fitness.watch.face.market.DeviceFaceMarketFragment;
import com.xiaomi.fitness.watch.face.market.DeviceFaceMarketViewModel;
import com.xiaomi.fitness.watch.face.widget.FaceMarketItemDecoration;
import com.xiaomi.fitness.watch.face.widget.StateLayout;
import defpackage.ovi;
import defpackage.r6a;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b/\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\u0006J!\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0006J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0006J\u000f\u0010\u0016\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0016\u0010\u0006R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\"\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Lcom/xiaomi/fitness/watch/face/market/DeviceFaceMarketFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/watch/face/market/DeviceFaceMarketViewModel;", "Lr6a;", "", "trackExpose", "()V", "onRefreshEnd", LifecycleConstantKt.ON_STOP, "onDestroyView", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setListener", "Landroid/content/res/Configuration;", StandardComponentEvent.KEY_NEW_CONFIG, "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onVisible", "onInvisible", "", "trackFeedFace", "Z", "Lcom/example/statistics/export/NestRecyclerViewItemEffectiveExposeBiz;", "trackExposeBiz$delegate", "Lkotlin/Lazy;", "getTrackExposeBiz", "()Lcom/example/statistics/export/NestRecyclerViewItemEffectiveExposeBiz;", "trackExposeBiz", "feedTrackExpose$delegate", "getFeedTrackExpose", "feedTrackExpose", "Lcom/xiaomi/fitness/watch/face/market/DeviceFaceMarketFeedAdapter;", "mDeviceFaceMarketFeedAdapter$delegate", "getMDeviceFaceMarketFeedAdapter", "()Lcom/xiaomi/fitness/watch/face/market/DeviceFaceMarketFeedAdapter;", "mDeviceFaceMarketFeedAdapter", "", "mFaceMarketVisibleTime", "J", "", "getLayoutId", "()I", "layoutId", "<init>", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DeviceFaceMarketFragment extends BaseBindingFragment<DeviceFaceMarketViewModel, r6a> {
    private long mFaceMarketVisibleTime;
    private boolean trackFeedFace;

    /* JADX INFO: renamed from: trackExposeBiz$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy trackExposeBiz = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: v46
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceFaceMarketFragment.trackExposeBiz_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: feedTrackExpose$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy feedTrackExpose = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: w46
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceFaceMarketFragment.feedTrackExpose_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: mDeviceFaceMarketFeedAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDeviceFaceMarketFeedAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: x46
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceFaceMarketFragment.mDeviceFaceMarketFeedAdapter_delegate$lambda$2(this.f38674a);
        }
    });

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

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ DeviceFaceMarketViewModel access$getMViewModel(DeviceFaceMarketFragment deviceFaceMarketFragment) {
        return (DeviceFaceMarketViewModel) deviceFaceMarketFragment.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestRecyclerViewItemEffectiveExposeBiz feedTrackExpose_delegate$lambda$1() {
        return new NestRecyclerViewItemEffectiveExposeBiz();
    }

    private final NestRecyclerViewItemEffectiveExposeBiz getFeedTrackExpose() {
        return (NestRecyclerViewItemEffectiveExposeBiz) this.feedTrackExpose.getValue();
    }

    private final DeviceFaceMarketFeedAdapter getMDeviceFaceMarketFeedAdapter() {
        return (DeviceFaceMarketFeedAdapter) this.mDeviceFaceMarketFeedAdapter.getValue();
    }

    private final NestRecyclerViewItemEffectiveExposeBiz getTrackExposeBiz() {
        return (NestRecyclerViewItemEffectiveExposeBiz) this.trackExposeBiz.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceFaceMarketFeedAdapter mDeviceFaceMarketFeedAdapter_delegate$lambda$2(final DeviceFaceMarketFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new DeviceFaceMarketFeedAdapter(new Function4<View, Integer, DeviceFaceMarketListItemWrapper, Integer, Unit>() { // from class: com.xiaomi.fitness.watch.face.market.DeviceFaceMarketFragment$mDeviceFaceMarketFeedAdapter$2$1
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(View view, Integer num, DeviceFaceMarketListItemWrapper deviceFaceMarketListItemWrapper, Integer num2) {
                invoke(view, num.intValue(), deviceFaceMarketListItemWrapper, num2.intValue());
                return Unit.INSTANCE;
            }

            public void invoke(View itemVew, int postion, DeviceFaceMarketListItemWrapper item, int feedPosition) {
                Intrinsics.checkNotNullParameter(itemVew, "itemVew");
                Intrinsics.checkNotNullParameter(item, "item");
                if (item.isFeedWatchFaceType() || !item.isTabData()) {
                    return;
                }
                FaceListCommonTab tabData = item.getTabData();
                Intrinsics.checkNotNull(tabData);
                Bundle bundle = new Bundle();
                bundle.putInt(FaceTabListFragment.TAB_TYPE, 2);
                bundle.putString(FaceTabListFragment.TAB_ID, String.valueOf(tabData.getTabId()));
                BaseFragmentExKt.gotoPage(this.this$0, FaceTabListFragment.class, bundle);
            }
        });
    }

    private final void onRefreshEnd() {
        getMBinding().B.setRefreshing(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(DeviceFaceMarketFragment this$0, StateData.Status status) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onRefreshEnd();
        int i = status == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i == 1 || i == 2) {
            this$0.getMBinding().C.showContent();
        } else if (i != 3) {
            StateLayout.showError$default(this$0.getMBinding().C, null, 1, null);
        } else {
            StateLayout.showEmpty$default(this$0.getMBinding().C, 0, null, 0, 7, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(DeviceFaceMarketFragment this$0, Status status) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MoreRecyclerView moreRecyclerView = this$0.getMBinding().A;
        Intrinsics.checkNotNull(status);
        MoreRecyclerView.setStatus$default(moreRecyclerView, status, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5(DeviceFaceMarketFragment this$0, DeviceFaceMarketViewModel.FeedItemRefreshWrapper feedItemRefreshWrapper) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getMDeviceFaceMarketFeedAdapter().setList(feedItemRefreshWrapper.getItems());
        if (feedItemRefreshWrapper.getStart() > 0) {
            this$0.getMDeviceFaceMarketFeedAdapter().notifyItemRangeChanged(feedItemRefreshWrapper.getStart(), feedItemRefreshWrapper.getItems().size());
        } else {
            this$0.getMDeviceFaceMarketFeedAdapter().notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setListener$lambda$7(DeviceFaceMarketFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        DeviceFaceMarketViewModel.requestTabIndex$default((DeviceFaceMarketViewModel) this$0.getMViewModel(), false, 1, null);
    }

    private final void trackExpose() {
        final String model;
        final Ref.IntRef intRef = new Ref.IntRef();
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (model = DeviceModelExtKt.getModel(wearableDeviceModel)) == null) {
            model = "";
        }
        NestRecyclerViewItemEffectiveExposeBiz trackExposeBiz = getTrackExposeBiz();
        MoreRecyclerView mRecyclerView = getMBinding().A;
        Intrinsics.checkNotNullExpressionValue(mRecyclerView, "mRecyclerView");
        NestRecyclerViewItemEffectiveExposeBiz.startTrackItemExpose$default(trackExposeBiz, mRecyclerView, 0, new Function1() { // from class: u46
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFaceMarketFragment.trackExpose$lambda$6(model, intRef, this, (TrackContent) obj);
            }
        }, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit trackExpose$lambda$6(String deviceModel, Ref.IntRef feedListExposed, DeviceFaceMarketFragment this$0, TrackContent trackContent) {
        Intrinsics.checkNotNullParameter(deviceModel, "$deviceModel");
        Intrinsics.checkNotNullParameter(feedListExposed, "$feedListExposed");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(trackContent, "trackContent");
        if (Intrinsics.areEqual(trackContent.getEventName(), "56.82.1.1.35072")) {
            IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
            OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("expose_v3", "56.82.1.1.35072");
            Object[] objArr = new Object[6];
            objArr[0] = "name";
            objArr[1] = "operation_position_01";
            objArr[2] = "detail";
            String key = trackContent.getKey();
            if (key == null) {
                key = "";
            }
            objArr[3] = key;
            objArr[4] = "device_model";
            objArr[5] = deviceModel;
            oneTrackExtKt.reportData(oneTrackStatBean, objArr);
        }
        if (Intrinsics.areEqual(trackContent.getEventName(), "56.82.1.1.35600")) {
            feedListExposed.element++;
        }
        if (feedListExposed.element == 1 && !this$0.trackFeedFace) {
            this$0.trackFeedFace = true;
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData(new OneTrackStatBean("expose_v3", "56.82.1.1.35600"), "name", "operation_position", "device_model", deviceModel);
        }
        if (this$0.trackFeedFace) {
            NestRecyclerViewItemEffectiveExposeBiz trackExposeBiz = this$0.getTrackExposeBiz();
            MoreRecyclerView mRecyclerView = this$0.getMBinding().A;
            Intrinsics.checkNotNullExpressionValue(mRecyclerView, "mRecyclerView");
            trackExposeBiz.endTrackItemExpose(mRecyclerView);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NestRecyclerViewItemEffectiveExposeBiz trackExposeBiz_delegate$lambda$0() {
        return new NestRecyclerViewItemEffectiveExposeBiz();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return ovi.h0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        FaceIcon.syncConfiguration();
        Logger.d("FaceIcon FaceMarketFragment ColumnSpaceChanged:" + FaceIcon.LIST_SPACE, new Object[0]);
        getMBinding().A.invalidateItemDecorations();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ((DeviceFaceMarketViewModel) getMViewModel()).getPageLiveData().removeObservers(getViewLifecycleOwner());
        ((DeviceFaceMarketViewModel) getMViewModel()).getLoadStatus().removeObservers(getViewLifecycleOwner());
        ((DeviceFaceMarketViewModel) getMViewModel()).getIndexItemsLiveData().removeObservers(getViewLifecycleOwner());
        ((DeviceFaceMarketViewModel) getMViewModel()).clearindexItems();
        getMBinding().A.setAdapter(null);
        NestRecyclerViewItemEffectiveExposeBiz feedTrackExpose = getFeedTrackExpose();
        MoreRecyclerView mRecyclerView = getMBinding().A;
        Intrinsics.checkNotNullExpressionValue(mRecyclerView, "mRecyclerView");
        feedTrackExpose.endTrackItemExpose(mRecyclerView);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        super.onInvisible();
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || this.mFaceMarketVisibleTime <= 0) {
            Logger.i("FaceMeFragment startTime <= 0", new Object[0]);
            return;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.mFaceMarketVisibleTime) / ((long) 1000);
        this.mFaceMarketVisibleTime = 0L;
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("c_pa_v3", "56.47.1.1.19538");
        Object[] objArr = new Object[8];
        objArr[0] = "name";
        objArr[1] = "watchface_market_page";
        objArr[2] = "duration_sec";
        objArr[3] = Long.valueOf(jCurrentTimeMillis);
        objArr[4] = "device_model";
        objArr[5] = wearableDeviceModel.getDeviceInfo().getModel();
        objArr[6] = "device_version";
        String firmwareVersion = wearableDeviceModel.getDeviceInfo().getFirmwareVersion();
        if (firmwareVersion == null) {
            firmwareVersion = "";
        }
        objArr[7] = firmwareVersion;
        oneTrackExtKt.reportData(oneTrackStatBean, objArr);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        try {
            MemoryCache memoryCache = Coil.imageLoader(ApplicationExtKt.getApplication()).getMemoryCache();
            if (memoryCache != null) {
                memoryCache.clear();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        getMBinding().A.setLayoutManager(new StaggeredGridLayoutManager(FaceManager.INSTANCE.getMarketListCount(), 1));
        getMBinding().A.addItemDecoration(new FaceMarketItemDecoration());
        getMBinding().A.setEnableMore(true);
        getMBinding().A.setAdapter(getMDeviceFaceMarketFeedAdapter());
        getMBinding().A.setLoadListener(new MoreRecyclerView.LoadListener() { // from class: com.xiaomi.fitness.watch.face.market.DeviceFaceMarketFragment.onViewCreated.1
            @Override // com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView.LoadListener
            public void loadMore() {
                DeviceFaceMarketFragment.access$getMViewModel(DeviceFaceMarketFragment.this).requestTabIndex(true);
            }
        });
        NestRecyclerViewItemEffectiveExposeBiz feedTrackExpose = getFeedTrackExpose();
        MoreRecyclerView mRecyclerView = getMBinding().A;
        Intrinsics.checkNotNullExpressionValue(mRecyclerView, "mRecyclerView");
        NestRecyclerViewItemEffectiveExposeBiz.startTrackItemExpose$default(feedTrackExpose, mRecyclerView, 0, null, 6, null);
        trackExpose();
        getMBinding().B.n(false, 0, ExtUtilsKt.getDp(40));
        ((DeviceFaceMarketViewModel) getMViewModel()).getPageLiveData().observe(getViewLifecycleOwner(), new DeviceFaceMarketFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: r46
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFaceMarketFragment.onViewCreated$lambda$3(this.f32169a, (StateData.Status) obj);
            }
        }));
        ((DeviceFaceMarketViewModel) getMViewModel()).getLoadStatus().observe(getViewLifecycleOwner(), new DeviceFaceMarketFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: s46
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFaceMarketFragment.onViewCreated$lambda$4(this.f33265a, (Status) obj);
            }
        }));
        ((DeviceFaceMarketViewModel) getMViewModel()).getIndexItemsLiveData().observe(getViewLifecycleOwner(), new DeviceFaceMarketFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: t46
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceFaceMarketFragment.onViewCreated$lambda$5(this.f34292a, (DeviceFaceMarketViewModel.FeedItemRefreshWrapper) obj);
            }
        }));
        ((DeviceFaceMarketViewModel) getMViewModel()).requestData();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        this.mFaceMarketVisibleTime = System.currentTimeMillis();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment
    public void setListener() {
        super.setListener();
        getMBinding().B.setOnRefreshListener(new SwipeRefreshLayout.j() { // from class: q46
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
            public final void onRefresh() {
                DeviceFaceMarketFragment.setListener$lambda$7(this.f31074a);
            }
        });
    }
}
