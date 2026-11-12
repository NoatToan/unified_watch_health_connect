package com.xiaomi.fitness.devicesettings.common.offlinemap;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.common.offlinemap.MapManagerListFragment;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.eui;
import defpackage.uh6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001*B\u0007¢\u0006\u0004\b)\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R(\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00110\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/offlinemap/MapManagerListFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/common/offlinemap/OfflineMapManagerViewModel;", "Luh6;", "", "handleInstalledMapFile", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "Lcom/xiaomi/fitness/devicesettings/common/offlinemap/DistrictData;", "downloadingList", "Ljava/util/List;", "", "districtDataList", "Lcom/xiaomi/fitness/devicesettings/common/offlinemap/ADCodeItem;", "adCode2FileList", "", "", "adCode2FileListMap", "Ljava/util/Map;", "fileNameAdCodeMap", "Lcom/xiaomi/fitness/devicesettings/common/offlinemap/DistrictAdapter;", "installedAdapter", "Lcom/xiaomi/fitness/devicesettings/common/offlinemap/DistrictAdapter;", "", "prevInstalledMapSize", "Ljava/lang/Integer;", "viewModel", "Lcom/xiaomi/fitness/devicesettings/common/offlinemap/OfflineMapManagerViewModel;", "getViewModel", "()Lcom/xiaomi/fitness/devicesettings/common/offlinemap/OfflineMapManagerViewModel;", "setViewModel", "(Lcom/xiaomi/fitness/devicesettings/common/offlinemap/OfflineMapManagerViewModel;)V", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMapManagerListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapManagerListFragment.kt\ncom/xiaomi/fitness/devicesettings/common/offlinemap/MapManagerListFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,139:1\n1863#2,2:140\n216#3,2:142\n216#3,2:144\n*S KotlinDebug\n*F\n+ 1 MapManagerListFragment.kt\ncom/xiaomi/fitness/devicesettings/common/offlinemap/MapManagerListFragment\n*L\n70#1:140,2\n59#1:142,2\n86#1:144,2\n*E\n"})
public final class MapManagerListFragment extends BaseBindingFragment<OfflineMapManagerViewModel, uh6> {

    @NotNull
    public static final String TAG = "MapManagerListFragment";

    @Nullable
    private List<ADCodeItem> adCode2FileList;

    @Nullable
    private List<DistrictData> districtDataList;
    private DistrictAdapter installedAdapter;

    @Nullable
    private Integer prevInstalledMapSize;
    public OfflineMapManagerViewModel viewModel;

    @NotNull
    private final List<DistrictData> downloadingList = new ArrayList();

    @NotNull
    private Map<String, List<ADCodeItem>> adCode2FileListMap = new LinkedHashMap();

    @NotNull
    private Map<String, String> fileNameAdCodeMap = new LinkedHashMap();

    private final void handleInstalledMapFile() {
        getViewModel().getInstalledDownloadStatusMediatorLiveData().observe(requireActivity(), new MapManagerListFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: o4f
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MapManagerListFragment.handleInstalledMapFile$lambda$6(this.f28729a, (Pair) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleInstalledMapFile$lambda$6(MapManagerListFragment this$0, Pair pair) {
        DistrictData districtData;
        Collection collectionValues;
        Collection collectionValues2;
        Object next;
        DistrictData districtData2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) pair.getFirst();
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) pair.getSecond();
        Logger.i(TAG, "installedDownloadStatusMediatorLiveData installedHashMap size=" + (concurrentHashMap != null ? Integer.valueOf(concurrentHashMap.size()) : null) + " downloadDistricts=" + (concurrentHashMap2 != null ? concurrentHashMap2.values() : null));
        if ((concurrentHashMap == null || concurrentHashMap.isEmpty()) && (concurrentHashMap2 == null || concurrentHashMap2.isEmpty())) {
            TextView installedMapTitle = this$0.getMBinding().F;
            Intrinsics.checkNotNullExpressionValue(installedMapTitle, "installedMapTitle");
            ViewExtKt.gone(installedMapTitle);
            RecyclerView installedList = this$0.getMBinding().E;
            Intrinsics.checkNotNullExpressionValue(installedList, "installedList");
            ViewExtKt.gone(installedList);
            LinearLayout emptyView = this$0.getMBinding().C;
            Intrinsics.checkNotNullExpressionValue(emptyView, "emptyView");
            ViewExtKt.visible(emptyView);
        } else {
            LinearLayout emptyView2 = this$0.getMBinding().C;
            Intrinsics.checkNotNullExpressionValue(emptyView2, "emptyView");
            ViewExtKt.gone(emptyView2);
            boolean z = !(concurrentHashMap == null || concurrentHashMap.isEmpty());
            TextView installedMapTitle2 = this$0.getMBinding().F;
            Intrinsics.checkNotNullExpressionValue(installedMapTitle2, "installedMapTitle");
            ViewExtKt.setVisible(installedMapTitle2, z);
            RecyclerView installedList2 = this$0.getMBinding().E;
            Intrinsics.checkNotNullExpressionValue(installedList2, "installedList");
            ViewExtKt.setVisible(installedList2, z);
            if (concurrentHashMap2 == null || (collectionValues2 = concurrentHashMap2.values()) == null) {
                districtData = null;
            } else {
                Iterator it = collectionValues2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    districtData2 = (DistrictData) next;
                    if (districtData2.getDownloadStatus() == DownloadStatus.STATUS_DOWNLOADING || districtData2.getDownloadStatus() == DownloadStatus.STATUS_PENDING) {
                        break;
                    }
                } while (districtData2.getDownloadStatus() != DownloadStatus.STATUS_INSTALLING);
                districtData = (DistrictData) next;
            }
            boolean z2 = districtData != null;
            RecyclerView downloadingList = this$0.getMBinding().B;
            Intrinsics.checkNotNullExpressionValue(downloadingList, "downloadingList");
            ViewExtKt.setVisible(downloadingList, z2);
            TextView downloadingAndInstallingTitle = this$0.getMBinding().A;
            Intrinsics.checkNotNullExpressionValue(downloadingAndInstallingTitle, "downloadingAndInstallingTitle");
            ViewExtKt.setVisible(downloadingAndInstallingTitle, z2);
            if (!Intrinsics.areEqual(this$0.prevInstalledMapSize, concurrentHashMap != null ? Integer.valueOf(concurrentHashMap.size()) : null)) {
                DistrictAdapter districtAdapter = this$0.installedAdapter;
                if (districtAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("installedAdapter");
                    districtAdapter = null;
                }
                districtAdapter.refreshData((concurrentHashMap == null || (collectionValues = concurrentHashMap.values()) == null) ? null : CollectionsKt___CollectionsKt.toList(collectionValues));
            }
        }
        this$0.prevInstalledMapSize = concurrentHashMap != null ? Integer.valueOf(concurrentHashMap.size()) : null;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), Dispatchers.getIO(), null, new MapManagerListFragment$handleInstalledMapFile$1$1(this$0, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(MapManagerListFragment this$0, DistrictDownloadingAdapter downloadAdapter, ConcurrentHashMap concurrentHashMap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(downloadAdapter, "$downloadAdapter");
        FitnessLogUtils.i(TAG, "下载数据监听：" + concurrentHashMap.values());
        ArrayList arrayList = new ArrayList();
        Intrinsics.checkNotNull(concurrentHashMap);
        Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            DistrictData districtData = (DistrictData) ((Map.Entry) it.next()).getValue();
            if (OfflineMapExKt.isProcessingStatus(districtData.getDownloadStatus())) {
                arrayList.add(districtData);
            }
        }
        this$0.downloadingList.clear();
        this$0.downloadingList.addAll(arrayList);
        downloadAdapter.notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(MapManagerListFragment this$0, String adCode) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adCode, "adCode");
        ConcurrentHashMap<String, DistrictData> value = this$0.getViewModel().getInstalledDistrictMapDataLiveData().getValue();
        if (value != null) {
            Iterator<Map.Entry<String, DistrictData>> it = value.entrySet().iterator();
            while (it.hasNext()) {
                Logger.i(TAG, "deleteCallback currentMap entry=" + it.next());
            }
        }
        Logger.i(TAG, "deleteCallback currentMap size=" + (value != null ? Integer.valueOf(value.size()) : null));
        if (value != null) {
            value.remove(adCode);
        }
        this$0.getViewModel().getInstalledDistrictMapDataLiveData().postValue(value);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.q0;
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
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.view.BaseActivity");
        final DistrictDownloadingAdapter districtDownloadingAdapter = new DistrictDownloadingAdapter((BaseActivity) fragmentActivityRequireActivity, this.downloadingList);
        getMBinding().B.setAdapter(districtDownloadingAdapter);
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "requireActivity(...)");
        setViewModel((OfflineMapManagerViewModel) new ViewModelProvider(fragmentActivityRequireActivity2).get(OfflineMapManagerViewModel.class));
        FitnessLogUtils.i(TAG, "initViewModel onViewCreated,viewModel:" + getViewModel());
        getViewModel().getDownloadDistrictLiveData().observe(requireActivity(), new MapManagerListFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: m4f
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MapManagerListFragment.onViewCreated$lambda$1(this.f25741a, districtDownloadingAdapter, (ConcurrentHashMap) obj);
            }
        }));
        List<DistrictData> listLoadDistrictLib = OfflineMapExKt.loadDistrictLib();
        this.districtDataList = listLoadDistrictLib;
        if (listLoadDistrictLib != null) {
            Iterator<T> it = listLoadDistrictLib.iterator();
            while (it.hasNext()) {
                Logger.i(TAG, "districtDataList districtData=" + ((DistrictData) it.next()));
            }
        }
        List<ADCodeItem> listLoadADCode2File = OfflineMapExKt.loadADCode2File();
        this.adCode2FileList = listLoadADCode2File;
        this.adCode2FileListMap = OfflineMapExKt.convertAdCode2FileListToMap(listLoadADCode2File);
        this.fileNameAdCodeMap = OfflineMapExKt.convertAdCodeToFileListToFileNameAdCodeMap(this.adCode2FileList);
        FragmentActivity fragmentActivityRequireActivity3 = requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity3, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.view.BaseActivity");
        BaseActivity baseActivity = (BaseActivity) fragmentActivityRequireActivity3;
        Map<String, String> map = this.fileNameAdCodeMap;
        Map<String, List<ADCodeItem>> map2 = this.adCode2FileListMap;
        MutableLiveData<ConcurrentHashMap<Long, DistrictData>> downloadDistrictLiveData = getViewModel().getDownloadDistrictLiveData();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.installedAdapter = new DistrictAdapter(baseActivity, map2, map, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), 2, downloadDistrictLiveData, new Function1() { // from class: n4f
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MapManagerListFragment.onViewCreated$lambda$4(this.f27533a, (String) obj);
            }
        });
        RecyclerView recyclerView = getMBinding().E;
        DistrictAdapter districtAdapter = this.installedAdapter;
        if (districtAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("installedAdapter");
            districtAdapter = null;
        }
        recyclerView.setAdapter(districtAdapter);
        handleInstalledMapFile();
        OfflineMapDownloadManager.INSTANCE.startQuery();
    }

    public final void setViewModel(@NotNull OfflineMapManagerViewModel offlineMapManagerViewModel) {
        Intrinsics.checkNotNullParameter(offlineMapManagerViewModel, "<set-?>");
        this.viewModel = offlineMapManagerViewModel;
    }
}
