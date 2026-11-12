package com.xiaomi.fitness.watch.face.market;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.fitness.banner.export.BannerExtKt;
import com.fitness.banner.export.BannerRequestParamV2;
import com.fitness.banner.export.IBanner;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.baseui.recyclerview.view.Status;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WatchInfo;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.fitness.watch.face.data.DeviceFaceIndexList;
import com.xiaomi.fitness.watch.face.data.DeviceFaceMarketIndexItem;
import com.xiaomi.fitness.watch.face.data.DeviceFaceMarketListItemWrapper;
import com.xiaomi.fitness.watch.face.data.DeviceFaceMarketOperation;
import com.xiaomi.fitness.watch.face.data.DeviceFaceRecommendListItem;
import com.xiaomi.fitness.watch.face.data.FaceListCommonTab;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.fitness.watch.face.export.exportview.FaceSizeConstant;
import com.xiaomi.fitness.watch.face.helper.FacePreference;
import com.xiaomi.fitness.watch.face.market.DeviceFaceMarketViewModel;
import com.xiaomi.fitness.watch.face.request.FaceApiRequestV2;
import defpackage.eu6;
import defpackage.p1j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 12\u00020\u0001:\u000201B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u001eJ\b\u0010 \u001a\u00020\u001eH\u0002J\b\u0010!\u001a\u00020\u001eH\u0002J\u0010\u0010\"\u001a\u00020\u001e2\b\b\u0002\u0010#\u001a\u00020$J\u0016\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020'2\u0006\u0010#\u001a\u00020$J\u0016\u0010(\u001a\u00020\u001e2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*H\u0002J\u0016\u0010,\u001a\u00020\u001e2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020-0*H\u0002J\u0018\u0010.\u001a\u00020\u001e2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010*H\u0002R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0010¨\u00062"}, d2 = {"Lcom/xiaomi/fitness/watch/face/market/DeviceFaceMarketViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "device", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getDevice", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mPage", "", "faceApiRequestV2", "Lcom/xiaomi/fitness/watch/face/request/FaceApiRequestV2;", "pageLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/baseui/recyclerview/StateData$Status;", "getPageLiveData", "()Landroidx/lifecycle/MutableLiveData;", "pageLiveData$delegate", "Lkotlin/Lazy;", "loadStatus", "Lcom/xiaomi/fitness/baseui/recyclerview/view/Status;", "getLoadStatus", "loadStatus$delegate", "indexItems", "", "Lcom/xiaomi/fitness/watch/face/data/DeviceFaceMarketListItemWrapper;", "indexItemsLiveData", "Lcom/xiaomi/fitness/watch/face/market/DeviceFaceMarketViewModel$FeedItemRefreshWrapper;", "getIndexItemsLiveData", "clearindexItems", "", Constants.KEY_REQUEST_DATA, "requestBanner", "requestBannerAndTabData", "requestTabIndex", "requestMore", "", "getDeviceFaceMarketIndex", "firmwareVersion", "", "trackRecommendTab", "list", "", "Lcom/xiaomi/fitness/watch/face/data/DeviceFaceRecommendListItem;", "trackResourcePool", "Lcom/xiaomi/fitness/watch/face/data/DeviceFaceMarketIndexItem;", "trackFeed", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "FeedItemRefreshWrapper", "Companion", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceFaceMarketViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceFaceMarketViewModel.kt\ncom/xiaomi/fitness/watch/face/market/DeviceFaceMarketViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,289:1\n1872#2,3:290\n1872#2,3:293\n1872#2,2:296\n1872#2,3:298\n1874#2:301\n1872#2,3:302\n*S KotlinDebug\n*F\n+ 1 DeviceFaceMarketViewModel.kt\ncom/xiaomi/fitness/watch/face/market/DeviceFaceMarketViewModel\n*L\n244#1:290,3\n259#1:293,3\n265#1:296,2\n266#1:298,3\n265#1:301\n279#1:302,3\n*E\n"})
public final class DeviceFaceMarketViewModel extends AbsViewModel {

    @NotNull
    private static final String TAG = "DeviceFaceMarketViewModel";
    private int mPage = 1;

    @NotNull
    private final FaceApiRequestV2 faceApiRequestV2 = new FaceApiRequestV2();

    /* JADX INFO: renamed from: pageLiveData$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy pageLiveData = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: y46
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceFaceMarketViewModel.pageLiveData_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: loadStatus$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy loadStatus = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: z46
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceFaceMarketViewModel.loadStatus_delegate$lambda$1();
        }
    });

    @NotNull
    private final List<DeviceFaceMarketListItemWrapper> indexItems = new ArrayList();

    @NotNull
    private final MutableLiveData<FeedItemRefreshWrapper> indexItemsLiveData = new MutableLiveData<>();

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/watch/face/market/DeviceFaceMarketViewModel$FeedItemRefreshWrapper;", "", StatConstants.PARAM_START, "", "items", "", "Lcom/xiaomi/fitness/watch/face/data/DeviceFaceMarketListItemWrapper;", "<init>", "(ILjava/util/List;)V", "getStart", "()I", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FeedItemRefreshWrapper {

        @NotNull
        private List<DeviceFaceMarketListItemWrapper> items;
        private final int start;

        public FeedItemRefreshWrapper(int i, @NotNull List<DeviceFaceMarketListItemWrapper> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.start = i;
            this.items = items;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FeedItemRefreshWrapper copy$default(FeedItemRefreshWrapper feedItemRefreshWrapper, int i, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = feedItemRefreshWrapper.start;
            }
            if ((i2 & 2) != 0) {
                list = feedItemRefreshWrapper.items;
            }
            return feedItemRefreshWrapper.copy(i, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        @NotNull
        public final List<DeviceFaceMarketListItemWrapper> component2() {
            return this.items;
        }

        @NotNull
        public final FeedItemRefreshWrapper copy(int start, @NotNull List<DeviceFaceMarketListItemWrapper> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            return new FeedItemRefreshWrapper(start, items);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FeedItemRefreshWrapper)) {
                return false;
            }
            FeedItemRefreshWrapper feedItemRefreshWrapper = (FeedItemRefreshWrapper) other;
            return this.start == feedItemRefreshWrapper.start && Intrinsics.areEqual(this.items, feedItemRefreshWrapper.items);
        }

        @NotNull
        public final List<DeviceFaceMarketListItemWrapper> getItems() {
            return this.items;
        }

        public final int getStart() {
            return this.start;
        }

        public int hashCode() {
            return (Integer.hashCode(this.start) * 31) + this.items.hashCode();
        }

        public final void setItems(@NotNull List<DeviceFaceMarketListItemWrapper> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.items = list;
        }

        @NotNull
        public String toString() {
            return "FeedItemRefreshWrapper(start=" + this.start + ", items=" + this.items + ")";
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.market.DeviceFaceMarketViewModel$getDeviceFaceMarketIndex$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.market.DeviceFaceMarketViewModel$getDeviceFaceMarketIndex$1", f = "DeviceFaceMarketViewModel.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $firmwareVersion;
        final /* synthetic */ boolean $requestMore;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.market.DeviceFaceMarketViewModel$getDeviceFaceMarketIndex$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0002`\u0001J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¨\u0006\u0007"}, d2 = {"com/xiaomi/fitness/watch/face/market/DeviceFaceMarketViewModel$getDeviceFaceMarketIndex$1$1", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "Lcom/xiaomi/fitness/watch/face/data/DeviceFaceIndexList;", "Lkotlin/Function1;", "", "invoke", "data", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nDeviceFaceMarketViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceFaceMarketViewModel.kt\ncom/xiaomi/fitness/watch/face/market/DeviceFaceMarketViewModel$getDeviceFaceMarketIndex$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,289:1\n1755#2,3:290\n1863#2,2:293\n1863#2,2:295\n37#3:297\n36#3,3:298\n*S KotlinDebug\n*F\n+ 1 DeviceFaceMarketViewModel.kt\ncom/xiaomi/fitness/watch/face/market/DeviceFaceMarketViewModel$getDeviceFaceMarketIndex$1$1\n*L\n168#1:290,3\n171#1:293,2\n200#1:295,2\n225#1:297\n225#1:298,3\n*E\n"})
        public static final class C08121 implements Function1<DeviceFaceIndexList, Unit> {
            final /* synthetic */ boolean $requestMore;
            final /* synthetic */ DeviceFaceMarketViewModel this$0;

            public C08121(DeviceFaceMarketViewModel deviceFaceMarketViewModel, boolean z) {
                this.this$0 = deviceFaceMarketViewModel;
                this.$requestMore = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final int invoke$lambda$3(FaceListCommonTab faceListCommonTab, FaceListCommonTab faceListCommonTab2) {
                return faceListCommonTab2.getPosition() - faceListCommonTab.getPosition();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final int invoke$lambda$4(Function2 tmp0, Object obj, Object obj2) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return ((Number) tmp0.invoke(obj, obj2)).intValue();
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(DeviceFaceIndexList deviceFaceIndexList) {
                invoke2(deviceFaceIndexList);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public void invoke2(DeviceFaceIndexList data) {
                int size;
                boolean z;
                Intrinsics.checkNotNullParameter(data, "data");
                Logger.i(DeviceFaceMarketViewModel.TAG, "getDeviceFaceMarketIndex whiteUser: " + data.getInWhiteList());
                FacePreference.INSTANCE.setFACE_USER_IN_WHITE_LIST(data.getInWhiteList());
                this.this$0.mPage = this.this$0.mPage + 1;
                FaceSizeConstant.INSTANCE.setCurrentType(data.getDevice_config().getShape());
                FaceManager.INSTANCE.setAlbumRepeatable(data.getDevice_config().getAlbumRepeatable());
                if (this.$requestMore) {
                    size = this.this$0.indexItems.size();
                } else {
                    for (int size2 = this.this$0.indexItems.size() - 1; -1 < size2; size2--) {
                        DeviceFaceMarketListItemWrapper deviceFaceMarketListItemWrapper = (DeviceFaceMarketListItemWrapper) this.this$0.indexItems.get(size2);
                        if (!deviceFaceMarketListItemWrapper.isBannerListType() && !deviceFaceMarketListItemWrapper.isRecommendListType() && !deviceFaceMarketListItemWrapper.isResourcePoolType()) {
                            this.this$0.indexItems.remove(size2);
                        }
                    }
                    size = 0;
                }
                List list = this.this$0.indexItems;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((DeviceFaceMarketListItemWrapper) it.next()).isResourcePoolType()) {
                                z = true;
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                } else {
                    z = false;
                    break;
                }
                List<DeviceFaceMarketIndexItem> resource_pool_list = data.getResource_pool_list();
                List<DeviceFaceMarketIndexItem> list2 = resource_pool_list;
                if (list2 != null && !list2.isEmpty() && !z) {
                    DeviceFaceMarketViewModel deviceFaceMarketViewModel = this.this$0;
                    Iterator<T> it2 = resource_pool_list.iterator();
                    while (it2.hasNext()) {
                        deviceFaceMarketViewModel.indexItems.add(new DeviceFaceMarketListItemWrapper(null, null, (DeviceFaceMarketIndexItem) it2.next(), null, null, null, 59, null));
                    }
                    this.this$0.trackResourcePool(resource_pool_list);
                }
                List<FaceData> feed_watchface_list = data.getFeed_watchface_list();
                List<FaceListCommonTab> tab_list = data.getTab_list();
                if (tab_list == null) {
                    tab_list = CollectionsKt__CollectionsKt.emptyList();
                }
                List<FaceData> list3 = feed_watchface_list;
                if (((list3 != null && !list3.isEmpty()) || (!tab_list.isEmpty())) && !this.$requestMore) {
                    this.this$0.indexItems.add(new DeviceFaceMarketListItemWrapper(null, null, null, null, null, ResourceExtKt.getString(p1j.i0), 31, null));
                }
                Logger.i(DeviceFaceMarketViewModel.TAG, "getDeviceFaceMarketIndex page: " + this.this$0.mPage + " success resourcePoolList = " + resource_pool_list + "feedWatchFaceList = " + feed_watchface_list);
                if (data.getHasMore()) {
                    this.this$0.getLoadStatus().postValue(Status.MORE);
                } else {
                    this.this$0.getLoadStatus().postValue(Status.DONE);
                }
                this.this$0.trackFeed(feed_watchface_list);
                if (feed_watchface_list != null) {
                    DeviceFaceMarketViewModel deviceFaceMarketViewModel2 = this.this$0;
                    Iterator<T> it3 = feed_watchface_list.iterator();
                    while (it3.hasNext()) {
                        deviceFaceMarketViewModel2.indexItems.add(new DeviceFaceMarketListItemWrapper(null, null, null, null, (FaceData) it3.next(), null, 47, null));
                    }
                }
                final Function2 function2 = new Function2() { // from class: a56
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Integer.valueOf(DeviceFaceMarketViewModel.AnonymousClass1.C08121.invoke$lambda$3((FaceListCommonTab) obj, (FaceListCommonTab) obj2));
                    }
                };
                CollectionsKt___CollectionsKt.sortedWith(tab_list, new Comparator() { // from class: b56
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return DeviceFaceMarketViewModel.AnonymousClass1.C08121.invoke$lambda$4(function2, obj, obj2);
                    }
                });
                for (Iterator<FaceListCommonTab> it4 = tab_list.iterator(); it4.hasNext(); it4 = it4) {
                    FaceListCommonTab next = it4.next();
                    this.this$0.indexItems.add((next.getPosition() <= (feed_watchface_list != null ? feed_watchface_list.size() : 0) ? next.getPosition() : feed_watchface_list != null ? feed_watchface_list.size() : 0) - 1, new DeviceFaceMarketListItemWrapper(null, null, null, next, null, null, 55, null));
                }
                if (this.this$0.indexItems.isEmpty()) {
                    this.this$0.getPageLiveData().postValue(StateData.Status.EMPTY);
                } else {
                    this.this$0.getPageLiveData().postValue(StateData.Status.SUCCESS);
                }
                String string = Arrays.toString(this.this$0.indexItems.toArray(new DeviceFaceMarketListItemWrapper[0]));
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                Logger.i(DeviceFaceMarketViewModel.TAG, "feedItems: " + string);
                this.this$0.getIndexItemsLiveData().postValue(new FeedItemRefreshWrapper(size, this.this$0.indexItems));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, boolean z, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$firmwareVersion = str;
            this.$requestMore = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceFaceMarketViewModel.this.new AnonymousClass1(this.$firmwareVersion, this.$requestMore, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String model;
            WearableDeviceInfo deviceInfo;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FaceApiRequestV2 faceApiRequestV2 = DeviceFaceMarketViewModel.this.faceApiRequestV2;
                WearableDeviceModel device = DeviceFaceMarketViewModel.this.getDevice();
                if (device == null || (deviceInfo = device.getDeviceInfo()) == null || (model = deviceInfo.getModel()) == null) {
                    model = "";
                }
                String str = model;
                String str2 = this.$firmwareVersion;
                Integer numBoxInt = Boxing.boxInt(DeviceFaceMarketViewModel.this.mPage);
                Integer numBoxInt2 = Boxing.boxInt(FaceManager.INSTANCE.getPAGE_SIZE());
                C08121 c08121 = new C08121(DeviceFaceMarketViewModel.this, this.$requestMore);
                final DeviceFaceMarketViewModel deviceFaceMarketViewModel = DeviceFaceMarketViewModel.this;
                Function1<ApiException, Unit> function1 = new Function1<ApiException, Unit>() { // from class: com.xiaomi.fitness.watch.face.market.DeviceFaceMarketViewModel.getDeviceFaceMarketIndex.1.2
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public /* bridge */ /* synthetic */ Unit invoke2(ApiException apiException) {
                        invoke2(apiException);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public void invoke2(ApiException p1) {
                        Intrinsics.checkNotNullParameter(p1, "p1");
                        Logger.i(DeviceFaceMarketViewModel.TAG, "getDeviceFaceMarketIndex OnFail " + p1.getMessage() + "  " + p1.getErrorCode());
                        deviceFaceMarketViewModel.getPageLiveData().postValue(p1.getErrorCode() == 606 ? StateData.Status.EMPTY : StateData.Status.ERROR);
                    }
                };
                this.label = 1;
                if (faceApiRequestV2.getDeviceFaceMarketIndex(str, str2, numBoxInt, numBoxInt2, c08121, function1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.market.DeviceFaceMarketViewModel$requestBanner$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.market.DeviceFaceMarketViewModel$requestBanner$1", f = "DeviceFaceMarketViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33811 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BannerRequestParamV2 $param;
        int label;
        final /* synthetic */ DeviceFaceMarketViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33811(BannerRequestParamV2 bannerRequestParamV2, DeviceFaceMarketViewModel deviceFaceMarketViewModel, Continuation<? super C33811> continuation) {
            super(2, continuation);
            this.$param = bannerRequestParamV2;
            this.this$0 = deviceFaceMarketViewModel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(DeviceFaceMarketViewModel deviceFaceMarketViewModel, List list) {
            deviceFaceMarketViewModel.indexItems.add(0, new DeviceFaceMarketListItemWrapper(list, null, null, null, null, null, 62, null));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(ApiException apiException) {
            Logger.i(DeviceFaceMarketViewModel.TAG, "get face banner fail: " + apiException.getErrorCode() + " " + apiException.getMessage());
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C33811(this.$param, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            IBanner instance = BannerExtKt.getINSTANCE(IBanner.INSTANCE);
            BannerRequestParamV2 bannerRequestParamV2 = this.$param;
            final DeviceFaceMarketViewModel deviceFaceMarketViewModel = this.this$0;
            instance.getBannerListAsyncV2(bannerRequestParamV2, new Function1() { // from class: com.xiaomi.fitness.watch.face.market.a
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return DeviceFaceMarketViewModel.C33811.invokeSuspend$lambda$0(deviceFaceMarketViewModel, (List) obj2);
                }
            }, new Function1() { // from class: com.xiaomi.fitness.watch.face.market.b
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return DeviceFaceMarketViewModel.C33811.invokeSuspend$lambda$1((ApiException) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.market.DeviceFaceMarketViewModel$requestBannerAndTabData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.market.DeviceFaceMarketViewModel$requestBannerAndTabData$1", f = "DeviceFaceMarketViewModel.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33821 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $model;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.market.DeviceFaceMarketViewModel$requestBannerAndTabData$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0002`\u0001J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¨\u0006\u0007"}, d2 = {"com/xiaomi/fitness/watch/face/market/DeviceFaceMarketViewModel$requestBannerAndTabData$1$1", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "Lcom/xiaomi/fitness/watch/face/data/DeviceFaceMarketOperation;", "Lkotlin/Function1;", "", "invoke", "data", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nDeviceFaceMarketViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceFaceMarketViewModel.kt\ncom/xiaomi/fitness/watch/face/market/DeviceFaceMarketViewModel$requestBannerAndTabData$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,289:1\n360#2,7:290\n*S KotlinDebug\n*F\n+ 1 DeviceFaceMarketViewModel.kt\ncom/xiaomi/fitness/watch/face/market/DeviceFaceMarketViewModel$requestBannerAndTabData$1$1\n*L\n102#1:290,7\n*E\n"})
        public static final class C08131 implements Function1<DeviceFaceMarketOperation, Unit> {
            final /* synthetic */ DeviceFaceMarketViewModel this$0;

            public C08131(DeviceFaceMarketViewModel deviceFaceMarketViewModel) {
                this.this$0 = deviceFaceMarketViewModel;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean invoke$lambda$0(DeviceFaceMarketListItemWrapper it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.isRecommendListType();
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit invoke2(DeviceFaceMarketOperation deviceFaceMarketOperation) {
                invoke2(deviceFaceMarketOperation);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public void invoke2(DeviceFaceMarketOperation data) {
                Intrinsics.checkNotNullParameter(data, "data");
                Logger.i(DeviceFaceMarketViewModel.TAG, "get face tab data success: " + data);
                CollectionsKt__MutableCollectionsKt.removeAll(this.this$0.indexItems, new Function1() { // from class: c56
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return Boolean.valueOf(DeviceFaceMarketViewModel.C33821.C08131.invoke$lambda$0((DeviceFaceMarketListItemWrapper) obj));
                    }
                });
                if (!data.getRecommend_list().isEmpty()) {
                    Iterator it = this.this$0.indexItems.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        if (((DeviceFaceMarketListItemWrapper) it.next()).isBannerListType()) {
                            this.this$0.indexItems.add(i + 1, new DeviceFaceMarketListItemWrapper(null, data.getRecommend_list(), null, null, null, null, 61, null));
                            this.this$0.trackRecommendTab(data.getRecommend_list());
                        }
                        i++;
                    }
                    i = -1;
                    this.this$0.indexItems.add(i + 1, new DeviceFaceMarketListItemWrapper(null, data.getRecommend_list(), null, null, null, null, 61, null));
                    this.this$0.trackRecommendTab(data.getRecommend_list());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33821(String str, Continuation<? super C33821> continuation) {
            super(2, continuation);
            this.$model = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceFaceMarketViewModel.this.new C33821(this.$model, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FaceApiRequestV2 faceApiRequestV2 = DeviceFaceMarketViewModel.this.faceApiRequestV2;
                String str = this.$model;
                C08131 c08131 = new C08131(DeviceFaceMarketViewModel.this);
                Function1<ApiException, Unit> function1 = new Function1<ApiException, Unit>() { // from class: com.xiaomi.fitness.watch.face.market.DeviceFaceMarketViewModel.requestBannerAndTabData.1.2
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public /* bridge */ /* synthetic */ Unit invoke2(ApiException apiException) {
                        invoke2(apiException);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public void invoke2(ApiException it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        Logger.i(DeviceFaceMarketViewModel.TAG, "get tab data fail: " + it.getErrorCode() + " " + it.getMessage());
                    }
                };
                this.label = 1;
                if (faceApiRequestV2.getDeviceFaceMarketOperation(str, c08131, function1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData loadStatus_delegate$lambda$1() {
        return new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData pageLiveData_delegate$lambda$0() {
        return new MutableLiveData();
    }

    private final void requestBanner() {
        List listListOf = CollectionsKt__CollectionsJVMKt.listOf(17);
        String lowerCase = RegionExtKt.getInstance(RegionManager.INSTANCE).getLocalCountry().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C33811(new BannerRequestParamV2(listListOf, lowerCase, null, null, 12, null), this, null), 3, null);
    }

    private final void requestBannerAndTabData() {
        String model;
        WearableDeviceInfo deviceInfo;
        WearableDeviceModel device = getDevice();
        if (device == null || (deviceInfo = device.getDeviceInfo()) == null || (model = deviceInfo.getModel()) == null) {
            model = "";
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C33821(model, null), 3, null);
    }

    public static /* synthetic */ void requestTabIndex$default(DeviceFaceMarketViewModel deviceFaceMarketViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        deviceFaceMarketViewModel.requestTabIndex(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackFeed(List<FaceData> list) {
        if (list == null) {
            return;
        }
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            int size = i + this.indexItems.size();
            String id = ((FaceData) obj).getId();
            StringBuilder sb = new StringBuilder();
            sb.append(size);
            sb.append("-");
            sb.append(id);
            list.size();
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackRecommendTab(List<DeviceFaceRecommendListItem> list) {
        String model;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            DeviceFaceRecommendListItem deviceFaceRecommendListItem = (DeviceFaceRecommendListItem) obj;
            sb.append(i + "-" + deviceFaceRecommendListItem.getTabIcon() + "-" + deviceFaceRecommendListItem.getTabName() + "-" + deviceFaceRecommendListItem.getConfig_value());
            if (i < list.size() - 1) {
                sb.append(",");
            }
            i = i2;
        }
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("expose_v3", "56.82.1.1.35599");
        Object[] objArr = new Object[6];
        objArr[0] = "name";
        objArr[1] = "important_position_show";
        objArr[2] = "detail";
        objArr[3] = sb.toString();
        objArr[4] = "device_model";
        WearableDeviceModel device = getDevice();
        if (device == null || (model = DeviceModelExtKt.getModel(device)) == null) {
            model = "";
        }
        objArr[5] = model;
        oneTrackExtKt.reportData(oneTrackStatBean, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackResourcePool(List<DeviceFaceMarketIndexItem> list) {
        List<DeviceFaceMarketIndexItem> list2 = list;
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String name = ((DeviceFaceMarketIndexItem) obj).getName();
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append("-");
            sb.append(name);
            list.size();
            i = i2;
        }
        int i3 = 0;
        for (Object obj2 : list2) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            DeviceFaceMarketIndexItem deviceFaceMarketIndexItem = (DeviceFaceMarketIndexItem) obj2;
            int i5 = 0;
            for (Object obj3 : deviceFaceMarketIndexItem.getWatchface_list()) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                String id = ((FaceData) obj3).getId();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i3);
                sb2.append("-");
                sb2.append(i5);
                sb2.append("-");
                sb2.append(id);
                if (i5 >= deviceFaceMarketIndexItem.getWatchface_list().size() - 1) {
                    int size = list.size() - 1;
                }
                i5 = i6;
            }
            i3 = i4;
        }
    }

    public final void clearindexItems() {
        this.indexItems.clear();
    }

    @Nullable
    public final WearableDeviceModel getDevice() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    public final void getDeviceFaceMarketIndex(@NotNull String firmwareVersion, boolean requestMore) {
        Intrinsics.checkNotNullParameter(firmwareVersion, "firmwareVersion");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(firmwareVersion, requestMore, null), 3, null);
    }

    @NotNull
    public final MutableLiveData<FeedItemRefreshWrapper> getIndexItemsLiveData() {
        return this.indexItemsLiveData;
    }

    @NotNull
    public final MutableLiveData<Status> getLoadStatus() {
        return (MutableLiveData) this.loadStatus.getValue();
    }

    @NotNull
    public final MutableLiveData<StateData.Status> getPageLiveData() {
        return (MutableLiveData) this.pageLiveData.getValue();
    }

    public final void requestData() {
        this.indexItems.clear();
        requestBannerAndTabData();
        requestTabIndex$default(this, false, 1, null);
    }

    public final void requestTabIndex(final boolean requestMore) {
        String firmwareVersion;
        Logger.i(TAG, "requestTabIndex requestMore = " + requestMore);
        getLoadStatus().postValue(Status.LOADING);
        if (!requestMore) {
            this.mPage = 1;
            getPageLiveData().postValue(StateData.Status.LOADING);
        }
        WearableDeviceModel device = getDevice();
        String firmwareVersion2 = device != null ? DeviceModelExtKt.getFirmwareVersion(device) : null;
        if (firmwareVersion2 == null || firmwareVersion2.length() == 0) {
            WearableDeviceModel device2 = getDevice();
            if (device2 != null) {
                device2.readWatchInfo(new eu6<WatchInfo>() { // from class: com.xiaomi.fitness.watch.face.market.DeviceFaceMarketViewModel.requestTabIndex.1
                    @Override // defpackage.eu6
                    public void onError(int errorCode) {
                    }

                    @Override // defpackage.eu6
                    public void onResult(WatchInfo result) {
                        String firmwareVersion3;
                        DeviceFaceMarketViewModel deviceFaceMarketViewModel = DeviceFaceMarketViewModel.this;
                        if (result == null || (firmwareVersion3 = result.getFirmwareVersion()) == null) {
                            firmwareVersion3 = "";
                        }
                        deviceFaceMarketViewModel.getDeviceFaceMarketIndex(firmwareVersion3, requestMore);
                    }
                });
                return;
            }
            return;
        }
        WearableDeviceModel device3 = getDevice();
        if (device3 == null || (firmwareVersion = DeviceModelExtKt.getFirmwareVersion(device3)) == null) {
            firmwareVersion = "";
        }
        getDeviceFaceMarketIndex(firmwareVersion, requestMore);
    }
}
