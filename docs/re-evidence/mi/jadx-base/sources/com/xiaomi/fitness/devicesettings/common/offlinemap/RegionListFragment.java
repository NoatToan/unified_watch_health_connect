package com.xiaomi.fitness.devicesettings.common.offlinemap;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.common.offlinemap.DistrictData;
import com.xiaomi.fitness.devicesettings.common.offlinemap.RegionListFragment;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.ei6;
import defpackage.eui;
import defpackage.zqi;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 .2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001.B\u0007¢\u0006\u0004\b-\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00140%8\u0006¢\u0006\f\n\u0004\b&\u0010\u0016\u001a\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/offlinemap/RegionListFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/common/offlinemap/OfflineMapManagerViewModel;", "Lei6;", "", "initData", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "viewModel", "Lcom/xiaomi/fitness/devicesettings/common/offlinemap/OfflineMapManagerViewModel;", "getViewModel", "()Lcom/xiaomi/fitness/devicesettings/common/offlinemap/OfflineMapManagerViewModel;", "setViewModel", "(Lcom/xiaomi/fitness/devicesettings/common/offlinemap/OfflineMapManagerViewModel;)V", "", "Lcom/xiaomi/fitness/devicesettings/common/offlinemap/DistrictData;", "districtList", "Ljava/util/List;", "Landroidx/recyclerview/widget/RecyclerView;", "regionListView", "Landroidx/recyclerview/widget/RecyclerView;", "getRegionListView", "()Landroidx/recyclerview/widget/RecyclerView;", "setRegionListView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lcom/xiaomi/fitness/devicesettings/common/offlinemap/DistrictAdapter;", "adapter", "Lcom/xiaomi/fitness/devicesettings/common/offlinemap/DistrictAdapter;", "getAdapter", "()Lcom/xiaomi/fitness/devicesettings/common/offlinemap/DistrictAdapter;", "setAdapter", "(Lcom/xiaomi/fitness/devicesettings/common/offlinemap/DistrictAdapter;)V", "", "preInstalledDistrictData", "getPreInstalledDistrictData", "()Ljava/util/List;", "", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nRegionListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RegionListFragment.kt\ncom/xiaomi/fitness/devicesettings/common/offlinemap/RegionListFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1#2:139\n*E\n"})
public final class RegionListFragment extends BaseBindingFragment<OfflineMapManagerViewModel, ei6> {

    @NotNull
    public static final String DISTRICTS_FILE = "districts.json";

    @NotNull
    public static final String TAG = "RegionListFragment";
    public DistrictAdapter adapter;
    private List<DistrictData> districtList;

    @NotNull
    private final List<DistrictData> preInstalledDistrictData = new ArrayList();
    public RecyclerView regionListView;
    public OfflineMapManagerViewModel viewModel;

    private final void initData() {
        BufferedReader bufferedReader;
        String text;
        AssetManager assets;
        InputStream inputStreamOpen;
        Context context = getContext();
        List<DistrictData> list = null;
        if (context == null || (assets = context.getAssets()) == null || (inputStreamOpen = assets.open("districts.json")) == null) {
            bufferedReader = null;
        } else {
            Reader inputStreamReader = new InputStreamReader(inputStreamOpen, Charsets.UTF_8);
            bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        }
        if (bufferedReader != null) {
            try {
                text = TextStreamsKt.readText(bufferedReader);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(bufferedReader, th);
                    throw th2;
                }
            }
        } else {
            text = null;
        }
        CloseableKt.closeFinally(bufferedReader, null);
        FitnessLogUtils.i(TAG, "assets jsonText:" + text);
        List<DistrictData> list2 = (List) new Gson().fromJson(text, new TypeToken<List<? extends DistrictData>>() { // from class: com.xiaomi.fitness.devicesettings.common.offlinemap.RegionListFragment.initData.1
        }.getType());
        this.districtList = list2;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("districtList");
            list2 = null;
        }
        OfflineMapExKt.foreachDistricts(list2, new Function1() { // from class: pbk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RegionListFragment.initData$lambda$5((DistrictData) obj);
            }
        });
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.view.BaseActivity");
        setAdapter(new DistrictAdapter((BaseActivity) fragmentActivityRequireActivity, null, null, LifecycleOwnerKt.getLifecycleScope(this), 0, null, null, 100, null));
        getRegionListView().setAdapter(getAdapter());
        List<DistrictData> list3 = this.districtList;
        if (list3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("districtList");
            list3 = null;
        }
        if (list3.isEmpty()) {
            ViewExtKt.setVisible(getRegionListView(), false);
            return;
        }
        ViewExtKt.setVisible(getRegionListView(), true);
        DistrictAdapter adapter = getAdapter();
        List<DistrictData> list4 = this.districtList;
        if (list4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("districtList");
        } else {
            list = list4;
        }
        adapter.refreshData(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initData$lambda$5(DistrictData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setDownloadStatus(DownloadStatus.STATUS_IDEL);
        it.setExpandable(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(RegionListFragment this$0, ConcurrentHashMap concurrentHashMap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(TAG, "installedDistrictMapDataLiveData size=" + concurrentHashMap.size() + " districtDataList=" + concurrentHashMap);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), Dispatchers.getIO(), null, new RegionListFragment$onViewCreated$1$1(this$0, concurrentHashMap, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(RegionListFragment this$0, ConcurrentHashMap concurrentHashMap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Collection collectionValues = concurrentHashMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new RegionListFragment$onViewCreated$2$1(collectionValues, this$0, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(RegionListFragment this$0, DistrictData districtData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String adcode = districtData.getAdcode();
        List<DistrictData> list = this$0.districtList;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("districtList");
            list = null;
        }
        List<Integer> listFindAdcodeIndex$default = OfflineMapExKt.findAdcodeIndex$default(adcode, list, null, 4, null);
        FitnessLogUtils.i(TAG, "cancelDownload findAdcodeIndex adcode:" + districtData.getAdcode() + ",list:" + listFindAdcodeIndex$default);
        if (!listFindAdcodeIndex$default.isEmpty()) {
            DistrictAdapter adapter = this$0.getAdapter();
            districtData.setDownloadStatus(DownloadStatus.STATUS_IDEL);
            districtData.setDownloadProgress(0);
            Unit unit = Unit.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(districtData, "apply(...)");
            adapter.notifyItemStatus(listFindAdcodeIndex$default, districtData);
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final DistrictAdapter getAdapter() {
        DistrictAdapter districtAdapter = this.adapter;
        if (districtAdapter != null) {
            return districtAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.v0;
    }

    @NotNull
    public final List<DistrictData> getPreInstalledDistrictData() {
        return this.preInstalledDistrictData;
    }

    @NotNull
    public final RecyclerView getRegionListView() {
        RecyclerView recyclerView = this.regionListView;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("regionListView");
        return null;
    }

    @NotNull
    public final OfflineMapManagerViewModel getViewModel() {
        OfflineMapManagerViewModel offlineMapManagerViewModel = this.viewModel;
        if (offlineMapManagerViewModel != null) {
            return offlineMapManagerViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        return null;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        setRegionListView((RecyclerView) view.findViewById(zqi.d2));
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        setViewModel((OfflineMapManagerViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(OfflineMapManagerViewModel.class));
        initData();
        getViewModel().getInstalledDistrictMapDataLiveData().observe(requireActivity(), new RegionListFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: qbk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RegionListFragment.onViewCreated$lambda$0(this.f31343a, (ConcurrentHashMap) obj);
            }
        }));
        getViewModel().getDownloadDistrictLiveData().observe(requireActivity(), new RegionListFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: rbk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RegionListFragment.onViewCreated$lambda$1(this.f32388a, (ConcurrentHashMap) obj);
            }
        }));
        getViewModel().getCancelDownloadDistrictLiveData().observe(requireActivity(), new RegionListFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: sbk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RegionListFragment.onViewCreated$lambda$3(this.f33489a, (DistrictData) obj);
            }
        }));
    }

    public final void setAdapter(@NotNull DistrictAdapter districtAdapter) {
        Intrinsics.checkNotNullParameter(districtAdapter, "<set-?>");
        this.adapter = districtAdapter;
    }

    public final void setRegionListView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.regionListView = recyclerView;
    }

    public final void setViewModel(@NotNull OfflineMapManagerViewModel offlineMapManagerViewModel) {
        Intrinsics.checkNotNullParameter(offlineMapManagerViewModel, "<set-?>");
        this.viewModel = offlineMapManagerViewModel;
    }
}
