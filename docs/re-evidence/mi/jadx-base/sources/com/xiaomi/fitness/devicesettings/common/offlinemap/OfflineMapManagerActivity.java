package com.xiaomi.fitness.devicesettings.common.offlinemap;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.k;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.material.tabs.TabLayout;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.devicesettings.common.offlinemap.DistrictData;
import com.xiaomi.fitness.devicesettings.common.offlinemap.OfflineMapManagerActivity;
import com.xiaomi.fitness.devicesettings.export.SettingsPageUtilExtKt;
import com.xiaomi.fitness.devicesettings.utils.Constants;
import com.xiaomi.fitness.devicesettings.utils.ZipUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import defpackage.cji;
import defpackage.en0;
import defpackage.eui;
import defpackage.jni;
import defpackage.wzi;
import defpackage.xr5;
import defpackage.z07;
import defpackage.zqi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 .2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001.B\u0007¢\u0006\u0004\b-\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u0019\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0010R\u001e\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0016R(\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00130\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010)¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/offlinemap/OfflineMapManagerActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/devicesettings/common/offlinemap/OfflineMapManagerViewModel;", "Len0;", "", "addSourceToInstalledDownloadStatusMediatorLiveData", "()V", "addTabLayout", "", "position", "switchTab", "(I)V", "reloadInstalledMap", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "", "Ljava/lang/Class;", "mFragmentClassList", "Ljava/util/List;", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "currentFragment", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "Lcom/xiaomi/fitness/devicesettings/common/offlinemap/DistrictData;", "districtDataList", "Lcom/xiaomi/fitness/devicesettings/common/offlinemap/ADCodeItem;", "adCode2FileList", "", "", "adCode2FileListMap", "Ljava/util/Map;", "", "dataSourceMerged", "Z", "Lcom/google/android/material/tabs/TabLayout$d;", "tablayoutSelectListener", "Lcom/google/android/material/tabs/TabLayout$d;", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class OfflineMapManagerActivity extends BaseBindingActivity<OfflineMapManagerViewModel, en0> {

    @NotNull
    private static final String KEY_DATA_SOURCE_MERGED = "data_source_merge";

    @NotNull
    public static final String TAG = "OfflineMapManagerActivity";

    @Nullable
    private List<ADCodeItem> adCode2FileList;

    @Nullable
    private BaseFragment currentFragment;
    private boolean dataSourceMerged;

    @Nullable
    private List<DistrictData> districtDataList;

    @NotNull
    private final List<Class<?>> mFragmentClassList = new ArrayList();

    @NotNull
    private Map<String, List<ADCodeItem>> adCode2FileListMap = new LinkedHashMap();

    @NotNull
    private final TabLayout.d tablayoutSelectListener = new TabLayout.d() { // from class: com.xiaomi.fitness.devicesettings.common.offlinemap.OfflineMapManagerActivity$tablayoutSelectListener$1
        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabReselected(TabLayout.g tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabSelected(TabLayout.g tab) throws IllegalAccessException, InstantiationException {
            Intrinsics.checkNotNullParameter(tab, "tab");
            this.this$0.switchTab(tab.g());
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void onTabUnselected(TabLayout.g tab) {
        }
    };

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.common.offlinemap.OfflineMapManagerActivity$reloadInstalledMap$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.common.offlinemap.OfflineMapManagerActivity$reloadInstalledMap$1", f = "OfflineMapManagerActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nOfflineMapManagerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OfflineMapManagerActivity.kt\ncom/xiaomi/fitness/devicesettings/common/offlinemap/OfflineMapManagerActivity$reloadInstalledMap$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,236:1\n1863#2,2:237\n1863#2,2:239\n*S KotlinDebug\n*F\n+ 1 OfflineMapManagerActivity.kt\ncom/xiaomi/fitness/devicesettings/common/offlinemap/OfflineMapManagerActivity$reloadInstalledMap$1\n*L\n202#1:237,2\n210#1:239,2\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OfflineMapManagerActivity.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            OfflineMapManagerActivity.access$getMViewModel(OfflineMapManagerActivity.this).getLoadStatusLiveData().postValue(Boxing.boxInt(0));
            OfflineMapManagerActivity.access$getMViewModel(OfflineMapManagerActivity.this).getInstalledDistrictMapDataLiveData().postValue(new ConcurrentHashMap<>());
            List<String> listLoadInstalledMapFile = OfflineMapExKt.loadInstalledMapFile();
            Logger.d(OfflineMapManagerActivity.TAG, "reloadInstalledMap installedMapFileList size=" + listLoadInstalledMapFile.size());
            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
            Logger.i(OfflineMapManagerActivity.TAG, "reloadInstalledMap timeConsume installedMapFileList before");
            OfflineMapManagerActivity offlineMapManagerActivity = OfflineMapManagerActivity.this;
            Iterator<T> it = listLoadInstalledMapFile.iterator();
            while (it.hasNext()) {
                String adCodeFromFileName = OfflineMapExKt.getAdCodeFromFileName(offlineMapManagerActivity.adCode2FileList, (String) it.next());
                Logger.i(OfflineMapManagerActivity.TAG, "reloadInstalledMap getAdCodeFromFileName adCode=" + adCodeFromFileName);
                if (adCodeFromFileName != null) {
                    linkedHashSet.add(adCodeFromFileName);
                }
            }
            OfflineMapManagerActivity offlineMapManagerActivity2 = OfflineMapManagerActivity.this;
            for (String str : linkedHashSet) {
                boolean zCheckAllFileNameExistInZoom16 = OfflineMapExKt.checkAllFileNameExistInZoom16(OfflineMapExKt.getFileNameInZoom16FromAdCode(offlineMapManagerActivity2.adCode2FileListMap, str));
                List list = offlineMapManagerActivity2.districtDataList;
                Logger.i(OfflineMapManagerActivity.TAG, "reloadInstalledMap districtDataList size=" + (list != null ? Boxing.boxInt(list.size()) : null));
                ArrayList arrayList = new ArrayList();
                OfflineMapExKt.getDistrictDataFromAdCode(offlineMapManagerActivity2.districtDataList, str, arrayList);
                Logger.i(OfflineMapManagerActivity.TAG, "reloadInstalledMap adCodeStr=" + str + " allFileExit=" + zCheckAllFileNameExistInZoom16 + " districtData=" + CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) arrayList));
                if (zCheckAllFileNameExistInZoom16 && (true ^ arrayList.isEmpty())) {
                    ConcurrentHashMap<String, DistrictData> value = OfflineMapManagerActivity.access$getMViewModel(offlineMapManagerActivity2).getInstalledDistrictMapDataLiveData().getValue();
                    if (value == null) {
                        value = new ConcurrentHashMap<>();
                    }
                    DistrictData districtData = (DistrictData) CollectionsKt___CollectionsKt.firstOrNull((List) arrayList);
                    if (districtData != null) {
                        value.put(str, districtData);
                    }
                    OfflineMapManagerActivity.access$getMViewModel(offlineMapManagerActivity2).getInstalledDistrictMapDataLiveData().postValue(value);
                }
            }
            Logger.i(OfflineMapManagerActivity.TAG, "reloadInstalledMap post loading finish");
            OfflineMapManagerActivity.access$getMViewModel(OfflineMapManagerActivity.this).getLoadStatusLiveData().postValue(Boxing.boxInt(1));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ OfflineMapManagerViewModel access$getMViewModel(OfflineMapManagerActivity offlineMapManagerActivity) {
        return (OfflineMapManagerViewModel) offlineMapManagerActivity.getMViewModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addSourceToInstalledDownloadStatusMediatorLiveData() {
        ((OfflineMapManagerViewModel) getMViewModel()).getInstalledDownloadStatusMediatorLiveData().addSource(((OfflineMapManagerViewModel) getMViewModel()).getDownloadDistrictLiveData(), new OfflineMapManagerActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: o6h
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return OfflineMapManagerActivity.addSourceToInstalledDownloadStatusMediatorLiveData$lambda$8(this.f28793a, (ConcurrentHashMap) obj);
            }
        }));
        ((OfflineMapManagerViewModel) getMViewModel()).getInstalledDownloadStatusMediatorLiveData().addSource(((OfflineMapManagerViewModel) getMViewModel()).getInstalledDistrictMapDataLiveData(), new OfflineMapManagerActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: p6h
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return OfflineMapManagerActivity.addSourceToInstalledDownloadStatusMediatorLiveData$lambda$9(this.f30061a, (ConcurrentHashMap) obj);
            }
        }));
        this.dataSourceMerged = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit addSourceToInstalledDownloadStatusMediatorLiveData$lambda$8(OfflineMapManagerActivity this$0, ConcurrentHashMap downloadDistrictMap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(downloadDistrictMap, "downloadDistrictMap");
        ((OfflineMapManagerViewModel) this$0.getMViewModel()).getInstalledDownloadStatusMediatorLiveData().setValue(new Pair<>(((OfflineMapManagerViewModel) this$0.getMViewModel()).getInstalledDistrictMapDataLiveData().getValue(), downloadDistrictMap));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit addSourceToInstalledDownloadStatusMediatorLiveData$lambda$9(OfflineMapManagerActivity this$0, ConcurrentHashMap map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(map, "map");
        ((OfflineMapManagerViewModel) this$0.getMViewModel()).getInstalledDownloadStatusMediatorLiveData().setValue(new Pair<>(map, ((OfflineMapManagerViewModel) this$0.getMViewModel()).getDownloadDistrictLiveData().getValue()));
        return Unit.INSTANCE;
    }

    private final void addTabLayout() throws IllegalAccessException, InstantiationException {
        ListExtKt.add(this.mFragmentClassList, MapManagerListFragment.class);
        ListExtKt.add(this.mFragmentClassList, RegionListFragment.class);
        TabLayout.g gVarA = getMBinding().I.A();
        Intrinsics.checkNotNullExpressionValue(gVarA, "newTab(...)");
        gVarA.v(getApplication().getString(wzi.u5));
        gVarA.i.setPadding(0, 0, 0, 0);
        getMBinding().I.c(gVarA);
        TabLayout.g gVarA2 = getMBinding().I.A();
        Intrinsics.checkNotNullExpressionValue(gVarA2, "newTab(...)");
        gVarA2.v(getApplication().getString(wzi.z6));
        gVarA2.i.setPadding(ExtUtilsKt.getDp(40), 0, ExtUtilsKt.getDp(40), 0);
        getMBinding().I.c(gVarA2);
        getMBinding().I.addOnTabSelectedListener(this.tablayoutSelectListener);
        switchTab(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(View view) {
        Constants.INSTANCE.goOfflineMapActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(OfflineMapManagerActivity this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean z = num != null && num.intValue() == 0;
        Logger.i(TAG, "loadStatusLiveData isLoading=" + z);
        LinearLayoutCompat loadedContent = this$0.getMBinding().D;
        Intrinsics.checkNotNullExpressionValue(loadedContent, "loadedContent");
        ViewExtKt.setVisible(loadedContent, z ^ true);
        LinearLayout loadingGroup = this$0.getMBinding().E;
        Intrinsics.checkNotNullExpressionValue(loadingGroup, "loadingGroup");
        ViewExtKt.setVisible(loadingGroup, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$2(OfflineMapManagerActivity this$0, DistrictData districtData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FitnessLogUtils.i(TAG, "下载完成数据监听：" + districtData);
        ConcurrentHashMap<String, DistrictData> value = ((OfflineMapManagerViewModel) this$0.getMViewModel()).getInstalledDistrictMapDataLiveData().getValue();
        if (value == null) {
            value = new ConcurrentHashMap<>();
        }
        if (!value.contains(districtData.getAdcode())) {
            value.put(districtData.getAdcode(), districtData);
        }
        ((OfflineMapManagerViewModel) this$0.getMViewModel()).getInstalledDistrictMapDataLiveData().setValue(value);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(Unit unit) {
        ToastUtil.showToast("安装失败，请检查连接并重试");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$6(OfflineMapManagerActivity this$0, int i, Intent intent) {
        Uri data;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i == -1) {
            Logger.i(TAG, "select doc uri:" + (intent != null ? intent.getData() : null));
            if (intent != null && (data = intent.getData()) != null) {
                z07 z07VarH = z07.h(this$0.getApplication(), data);
                String strI = z07VarH != null ? z07VarH.i() : null;
                if (strI == null || !StringsKt__StringsKt.contains$default((CharSequence) strI, (CharSequence) "XiaoMi Watch S4", false, 2, (Object) null)) {
                    ToastExtKt.toastShort(this$0, wzi.Z5);
                    this$0.finish();
                } else {
                    ZipUtil.INSTANCE.setTargetUri(data);
                    SettingsPageUtilExtKt.setOffline_map_storage_dir_uri(data);
                    this$0.reloadInstalledMap();
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), Dispatchers.getIO(), null, new OfflineMapManagerActivity$onCreate$5$1$1$1(this$0, null), 2, null);
                    ToastExtKt.toastShort(this$0, wzi.common_auth_success);
                }
            }
        } else {
            Logger.i(TAG, "select doc failed. code=" + i);
            ToastExtKt.toastShort(this$0, wzi.common_auth_fail);
            this$0.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onCreate$lambda$7(OfflineMapManagerActivity this$0, Long l) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OfflineMapDownloadManager offlineMapDownloadManager = OfflineMapDownloadManager.INSTANCE;
        long supportSize = ((OfflineMapManagerViewModel) this$0.getMViewModel()).getSupportSize();
        Intrinsics.checkNotNull(l);
        offlineMapDownloadManager.setDeviceAvailableSize(supportSize - l.longValue());
        float fE = xr5.e(2, ((l.longValue() / 1024.0f) / 1024.0f) / 1024.0f);
        long j = 1024;
        long supportSize2 = ((((OfflineMapManagerViewModel) this$0.getMViewModel()).getSupportSize() / j) / j) / 1024;
        this$0.getMBinding().B.setText("手表已使用空间" + fE + "GB/总空间" + supportSize2 + ServerConstants.GB_COUNTRY_CODE);
        this$0.getMBinding().C.setProgress(MathKt__MathJVMKt.roundToInt((fE * ((float) 100)) / ((float) supportSize2)));
        return Unit.INSTANCE;
    }

    private final void reloadInstalledMap() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void switchTab(int position) throws IllegalAccessException, InstantiationException {
        if (position < 0 || position >= this.mFragmentClassList.size()) {
            Logger.i(TAG, "switchTab position exception " + position);
            return;
        }
        k kVarO = getSupportFragmentManager().o();
        Intrinsics.checkNotNullExpressionValue(kVarO, "beginTransaction(...)");
        String name = this.mFragmentClassList.get(position).getName();
        BaseFragment baseFragment = (BaseFragment) getSupportFragmentManager().l0(name);
        BaseFragment baseFragment2 = this.currentFragment;
        if (baseFragment2 != null) {
            Intrinsics.checkNotNull(baseFragment2);
            kVarO.t(baseFragment2);
        }
        if (baseFragment == null) {
            Object objNewInstance = this.mFragmentClassList.get(position).newInstance();
            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.view.BaseFragment");
            baseFragment = (BaseFragment) objNewInstance;
            kVarO.c(zqi.S0, baseFragment, name);
        } else {
            kVarO.F(baseFragment);
        }
        kVarO.m();
        this.currentFragment = baseFragment;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.c;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws IllegalAccessException, InstantiationException {
        super.onCreate(savedInstanceState);
        setTitle(wzi.Y5);
        IActionBar.DefaultImpls.setEndView$default(this, 0, jni.N0, null, new View.OnClickListener() { // from class: q6h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OfflineMapManagerActivity.onCreate$lambda$0(view);
            }
        }, 5, null);
        FitnessLogUtils.i(TAG, "initViewModel activity onCreate viewModel:" + getMViewModel());
        addTabLayout();
        this.districtDataList = OfflineMapExKt.loadDistrictLib();
        List<ADCodeItem> listLoadADCode2File = OfflineMapExKt.loadADCode2File();
        this.adCode2FileList = listLoadADCode2File;
        this.adCode2FileListMap = OfflineMapExKt.convertAdCode2FileListToMap(listLoadADCode2File);
        OfflineMapDownloadManager.INSTANCE.init((OfflineMapManagerViewModel) getMViewModel());
        setTitleBackground(cji.y);
        ((OfflineMapManagerViewModel) getMViewModel()).getLoadStatusLiveData().observe(this, new OfflineMapManagerActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: r6h
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return OfflineMapManagerActivity.onCreate$lambda$1(this.f32242a, (Integer) obj);
            }
        }));
        ((OfflineMapManagerViewModel) getMViewModel()).getDistrictInstallCompleteLiveData().observe(this, new OfflineMapManagerActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: s6h
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return OfflineMapManagerActivity.onCreate$lambda$2(this.f33347a, (DistrictData) obj);
            }
        }));
        ((OfflineMapManagerViewModel) getMViewModel()).getUnZipErrorLiveData().observe(this, new OfflineMapManagerActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: t6h
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return OfflineMapManagerActivity.onCreate$lambda$3((Unit) obj);
            }
        }));
        boolean z = savedInstanceState != null ? savedInstanceState.getBoolean(KEY_DATA_SOURCE_MERGED) : false;
        this.dataSourceMerged = z;
        if (!z) {
            addSourceToInstalledDownloadStatusMediatorLiveData();
        }
        startForActivityResult(new Intent("android.intent.action.OPEN_DOCUMENT_TREE"), new Function2() { // from class: u6h
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return OfflineMapManagerActivity.onCreate$lambda$6(this.f35465a, ((Integer) obj).intValue(), (Intent) obj2);
            }
        });
        ((OfflineMapManagerViewModel) getMViewModel()).getStorageSizeLiveData().observe(this, new OfflineMapManagerActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: v6h
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return OfflineMapManagerActivity.onCreate$lambda$7(this.f36542a, (Long) obj);
            }
        }));
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean(KEY_DATA_SOURCE_MERGED, this.dataSourceMerged);
    }
}
