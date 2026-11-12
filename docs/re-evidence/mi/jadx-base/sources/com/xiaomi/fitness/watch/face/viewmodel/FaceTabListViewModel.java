package com.xiaomi.fitness.watch.face.viewmodel;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.mibi.sdk.component.Constants;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.baseui.recyclerview.view.Status;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WatchInfo;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.fitness.watch.face.data.DeviceFaceDeviceConfig;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.fitness.watch.face.export.exportview.FaceSizeConstant;
import com.xiaomi.fitness.watch.face.request.FaceApiRequestV2;
import com.xiaomi.fitness.watch.face.request.FaceOperationListResult;
import com.xiaomi.fitness.watch.face.viewmodel.FaceTabListViewModel;
import defpackage.eu6;
import defpackage.t5d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 82\u00020\u0001:\u000278B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u001d2\b\b\u0002\u0010.\u001a\u00020/J<\u00100\u001a\u00020+2\u0006\u00101\u001a\u0002022\u0006\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u001d2\b\u0010%\u001a\u0004\u0018\u00010\u001d2\u0006\u00103\u001a\u00020\u001d2\b\b\u0002\u0010.\u001a\u00020/H\u0002J\u0012\u00104\u001a\u00020+2\b\u00105\u001a\u0004\u0018\u000106H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001a\u0010\u0010R)\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u001d0\u001d0\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0012\u001a\u0004\b\u001f\u0010\u0010R!\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0012\u001a\u0004\b#\u0010\u0010R\u001c\u0010%\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u00069"}, d2 = {"Lcom/xiaomi/fitness/watch/face/viewmodel/FaceTabListViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "faceApiRequest", "Lcom/xiaomi/fitness/watch/face/request/FaceApiRequestV2;", "getFaceApiRequest", "()Lcom/xiaomi/fitness/watch/face/request/FaceApiRequestV2;", "setFaceApiRequest", "(Lcom/xiaomi/fitness/watch/face/request/FaceApiRequestV2;)V", "mPage", "", "pageLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData$Status;", "getPageLiveData", "()Landroidx/lifecycle/MutableLiveData;", "pageLiveData$delegate", "Lkotlin/Lazy;", "items", "", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "getItems", "()Ljava/util/List;", "loadStatus", "Lcom/xiaomi/fitness/baseui/recyclerview/view/Status;", "getLoadStatus", "loadStatus$delegate", "tabName", "", "kotlin.jvm.PlatformType", "getTabName", "tabName$delegate", "feedItems", "Lcom/xiaomi/fitness/watch/face/viewmodel/FaceTabListViewModel$TabListDataWrapper;", "getFeedItems", "feedItems$delegate", TSMAuthContants.PARAM_KEYWORD, "getKeyword", "()Ljava/lang/String;", "setKeyword", "(Ljava/lang/String;)V", Constants.KEY_REQUEST_DATA, "", "type", "tabId", "requestMore", "", "requestTabListData", "device", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "firmWareVersion", "attach", "savedInstanceState", "Landroid/os/Bundle;", "TabListDataWrapper", "Companion", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceTabListViewModel extends AbsViewModel {

    @NotNull
    private static final String TAG = "FaceTabListViewModel";
    public FaceApiRequestV2 faceApiRequest;

    @Nullable
    private String keyword;
    private int mPage = 1;

    /* JADX INFO: renamed from: pageLiveData$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy pageLiveData = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: g69
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceTabListViewModel.pageLiveData_delegate$lambda$0();
        }
    });

    @NotNull
    private final List<FaceData> items = new ArrayList();

    /* JADX INFO: renamed from: loadStatus$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy loadStatus = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: h69
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceTabListViewModel.loadStatus_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: tabName$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tabName = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: i69
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceTabListViewModel.tabName_delegate$lambda$2();
        }
    });

    /* JADX INFO: renamed from: feedItems$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy feedItems = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: j69
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceTabListViewModel.feedItems_delegate$lambda$3();
        }
    });

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/watch/face/viewmodel/FaceTabListViewModel$TabListDataWrapper;", "", "list", "", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", StatConstants.PARAM_START, "", "<init>", "(Ljava/util/List;I)V", "getList", "()Ljava/util/List;", "getStart", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TabListDataWrapper {

        @NotNull
        private final List<FaceData> list;
        private final int start;

        public TabListDataWrapper(@NotNull List<FaceData> list, int i) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.list = list;
            this.start = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TabListDataWrapper copy$default(TabListDataWrapper tabListDataWrapper, List list, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = tabListDataWrapper.list;
            }
            if ((i2 & 2) != 0) {
                i = tabListDataWrapper.start;
            }
            return tabListDataWrapper.copy(list, i);
        }

        @NotNull
        public final List<FaceData> component1() {
            return this.list;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        @NotNull
        public final TabListDataWrapper copy(@NotNull List<FaceData> list, int start) {
            Intrinsics.checkNotNullParameter(list, "list");
            return new TabListDataWrapper(list, start);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TabListDataWrapper)) {
                return false;
            }
            TabListDataWrapper tabListDataWrapper = (TabListDataWrapper) other;
            return Intrinsics.areEqual(this.list, tabListDataWrapper.list) && this.start == tabListDataWrapper.start;
        }

        @NotNull
        public final List<FaceData> getList() {
            return this.list;
        }

        public final int getStart() {
            return this.start;
        }

        public int hashCode() {
            return (this.list.hashCode() * 31) + Integer.hashCode(this.start);
        }

        @NotNull
        public String toString() {
            return "TabListDataWrapper(list=" + this.list + ", start=" + this.start + ")";
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.viewmodel.FaceTabListViewModel$requestTabListData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.viewmodel.FaceTabListViewModel$requestTabListData$1", f = "FaceTabListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C34291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WearableDeviceModel $device;
        final /* synthetic */ String $firmWareVersion;
        final /* synthetic */ String $keyword;
        final /* synthetic */ boolean $requestMore;
        final /* synthetic */ String $tabId;
        final /* synthetic */ int $type;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34291(int i, String str, String str2, WearableDeviceModel wearableDeviceModel, String str3, boolean z, Continuation<? super C34291> continuation) {
            super(2, continuation);
            this.$type = i;
            this.$tabId = str;
            this.$keyword = str2;
            this.$device = wearableDeviceModel;
            this.$firmWareVersion = str3;
            this.$requestMore = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(String str, FaceTabListViewModel faceTabListViewModel, boolean z, FaceOperationListResult faceOperationListResult) {
            int size;
            Logger.i(FaceTabListViewModel.TAG, "requestTabListData keyword " + str + " page " + faceTabListViewModel.mPage + " success: " + faceOperationListResult.getWatchface_list().size());
            FaceManager faceManager = FaceManager.INSTANCE;
            DeviceFaceDeviceConfig config = faceOperationListResult.getConfig();
            faceManager.setAlbumRepeatable(config != null ? config.getAlbumRepeatable() : false);
            FaceSizeConstant faceSizeConstant = FaceSizeConstant.INSTANCE;
            DeviceFaceDeviceConfig config2 = faceOperationListResult.getConfig();
            faceSizeConstant.setCurrentType(config2 != null ? config2.getShape() : 0);
            MutableLiveData<String> tabName = faceTabListViewModel.getTabName();
            String name = faceOperationListResult.getName();
            if (name == null) {
                name = "";
            }
            tabName.postValue(name);
            faceTabListViewModel.mPage++;
            if (z) {
                size = faceTabListViewModel.getItems().size();
            } else {
                faceTabListViewModel.getItems().clear();
                size = faceTabListViewModel.getItems().size();
            }
            List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) faceOperationListResult.getWatchface_list());
            CollectionsKt__MutableCollectionsKt.removeAll(mutableList, new Function1() { // from class: com.xiaomi.fitness.watch.face.viewmodel.h
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return Boolean.valueOf(FaceTabListViewModel.C34291.invokeSuspend$lambda$1$lambda$0((FaceData) obj));
                }
            });
            if (faceOperationListResult.getHasMore()) {
                faceTabListViewModel.getLoadStatus().postValue(Status.MORE);
            } else {
                faceTabListViewModel.getLoadStatus().postValue(Status.DONE);
            }
            faceTabListViewModel.getItems().addAll(mutableList);
            faceTabListViewModel.getFeedItems().postValue(new TabListDataWrapper(faceTabListViewModel.getItems(), size));
            if (faceTabListViewModel.getItems().isEmpty()) {
                faceTabListViewModel.getPageLiveData().postValue(StateData.Status.EMPTY);
            } else {
                faceTabListViewModel.getPageLiveData().postValue(StateData.Status.SUCCESS);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$1$lambda$0(FaceData faceData) {
            FaceData.BleExt ble_ext;
            return (t5d.w5(ApplicationExtKt.getApplication()) || (ble_ext = faceData.getBle_ext()) == null || !ble_ext.isPortraitFace()) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$2(FaceTabListViewModel faceTabListViewModel, ApiException apiException) {
            Logger.i(FaceTabListViewModel.TAG, "requestTabListData page: " + faceTabListViewModel.mPage + " onFail: " + apiException.getMessage());
            faceTabListViewModel.getPageLiveData().postValue(apiException.getErrorCode() == 606 ? StateData.Status.EMPTY : StateData.Status.ERROR);
            faceTabListViewModel.getLoadStatus().postValue(Status.DONE);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceTabListViewModel.this.new C34291(this.$type, this.$tabId, this.$keyword, this.$device, this.$firmWareVersion, this.$requestMore, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FaceApiRequestV2 faceApiRequest = FaceTabListViewModel.this.getFaceApiRequest();
            int i = this.$type;
            String str = this.$tabId;
            String str2 = this.$keyword;
            String model = DeviceModelExtKt.getModel(this.$device);
            String str3 = this.$firmWareVersion;
            int i2 = FaceTabListViewModel.this.mPage;
            final String str4 = this.$keyword;
            final FaceTabListViewModel faceTabListViewModel = FaceTabListViewModel.this;
            final boolean z = this.$requestMore;
            Function1<? super FaceOperationListResult, Unit> function1 = new Function1() { // from class: com.xiaomi.fitness.watch.face.viewmodel.i
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return FaceTabListViewModel.C34291.invokeSuspend$lambda$1(str4, faceTabListViewModel, z, (FaceOperationListResult) obj2);
                }
            };
            final FaceTabListViewModel faceTabListViewModel2 = FaceTabListViewModel.this;
            faceApiRequest.getFaceOperationList(i, str, str2, model, str3, i2, function1, new Function1() { // from class: com.xiaomi.fitness.watch.face.viewmodel.j
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return FaceTabListViewModel.C34291.invokeSuspend$lambda$2(faceTabListViewModel2, (ApiException) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C34291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData feedItems_delegate$lambda$3() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData loadStatus_delegate$lambda$1() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData pageLiveData_delegate$lambda$0() {
        return new MutableLiveData();
    }

    public static /* synthetic */ void requestData$default(FaceTabListViewModel faceTabListViewModel, int i, String str, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        faceTabListViewModel.requestData(i, str, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestTabListData(WearableDeviceModel device, int type, String tabId, String keyword, String firmWareVersion, boolean requestMore) {
        if (!requestMore) {
            this.mPage = 1;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C34291(type, tabId, keyword, device, firmWareVersion, requestMore, null), 3, null);
    }

    public static /* synthetic */ void requestTabListData$default(FaceTabListViewModel faceTabListViewModel, WearableDeviceModel wearableDeviceModel, int i, String str, String str2, String str3, boolean z, int i2, Object obj) {
        if ((i2 & 32) != 0) {
            z = true;
        }
        faceTabListViewModel.requestTabListData(wearableDeviceModel, i, str, str2, str3, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData tabName_delegate$lambda$2() {
        return new MutableLiveData("");
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @NotNull
    public final FaceApiRequestV2 getFaceApiRequest() {
        FaceApiRequestV2 faceApiRequestV2 = this.faceApiRequest;
        if (faceApiRequestV2 != null) {
            return faceApiRequestV2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("faceApiRequest");
        return null;
    }

    @NotNull
    public final MutableLiveData<TabListDataWrapper> getFeedItems() {
        return (MutableLiveData) this.feedItems.getValue();
    }

    @NotNull
    public final List<FaceData> getItems() {
        return this.items;
    }

    @Nullable
    public final String getKeyword() {
        return this.keyword;
    }

    @NotNull
    public final MutableLiveData<Status> getLoadStatus() {
        return (MutableLiveData) this.loadStatus.getValue();
    }

    @NotNull
    public final MutableLiveData<StateData.Status> getPageLiveData() {
        return (MutableLiveData) this.pageLiveData.getValue();
    }

    @NotNull
    public final MutableLiveData<String> getTabName() {
        return (MutableLiveData) this.tabName.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void requestData(final int type, @NotNull final String tabId, final boolean requestMore) {
        Intrinsics.checkNotNullParameter(tabId, "tabId");
        final WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        getLoadStatus().postValue(Status.LOADING);
        if (!requestMore) {
            getPageLiveData().postValue(StateData.Status.LOADING);
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        String firmwareVersion = DeviceModelExtKt.getFirmwareVersion(wearableDeviceModel);
        T t = firmwareVersion;
        if (firmwareVersion == null) {
            t = "";
        }
        objectRef.element = t;
        if (((CharSequence) t).length() > 0) {
            requestTabListData(wearableDeviceModel, type, tabId, this.keyword, (String) objectRef.element, requestMore);
        } else {
            Logger.i(TAG, "tryRequestTabListFace firmwareVersion null");
            wearableDeviceModel.readWatchInfo(new eu6<WatchInfo>() { // from class: com.xiaomi.fitness.watch.face.viewmodel.FaceTabListViewModel.requestData.1
                @Override // defpackage.eu6
                public void onError(int errorCode) {
                    Logger.i(FaceTabListViewModel.TAG, "tryRequestTabListFace firmwareVersion null again");
                    FaceTabListViewModel faceTabListViewModel = this;
                    faceTabListViewModel.requestTabListData(wearableDeviceModel, type, tabId, faceTabListViewModel.getKeyword(), objectRef.element, requestMore);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.eu6
                public void onResult(WatchInfo result) {
                    T t2;
                    String firmwareVersion2;
                    Ref.ObjectRef<String> objectRef2 = objectRef;
                    if (result == null || (firmwareVersion2 = result.getFirmwareVersion()) == null) {
                        t2 = firmwareVersion2;
                        t2 = "";
                    }
                    t2 = firmwareVersion2;
                    objectRef2.element = t2;
                    FaceTabListViewModel faceTabListViewModel = this;
                    faceTabListViewModel.requestTabListData(wearableDeviceModel, type, tabId, faceTabListViewModel.getKeyword(), objectRef.element, requestMore);
                }
            });
        }
    }

    public final void setFaceApiRequest(@NotNull FaceApiRequestV2 faceApiRequestV2) {
        Intrinsics.checkNotNullParameter(faceApiRequestV2, "<set-?>");
        this.faceApiRequest = faceApiRequestV2;
    }

    public final void setKeyword(@Nullable String str) {
        this.keyword = str;
    }
}
