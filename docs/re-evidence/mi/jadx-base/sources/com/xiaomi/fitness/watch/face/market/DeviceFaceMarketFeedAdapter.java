package com.xiaomi.fitness.watch.face.market;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.h;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.main.export.ConfigPreference;
import com.xiaomi.fitness.watch.face.adapter.FaceFeedAlbumItemViewHolder;
import com.xiaomi.fitness.watch.face.adapter.FaceFeedBannerItemViewHolder;
import com.xiaomi.fitness.watch.face.adapter.FaceFeedCommonItemViewHolder;
import com.xiaomi.fitness.watch.face.adapter.FaceFeedTabListItemViewHolder;
import com.xiaomi.fitness.watch.face.adapter.FaceMarketBasicTabItemViewHolder;
import com.xiaomi.fitness.watch.face.data.DeviceFaceMarketIndexItem;
import com.xiaomi.fitness.watch.face.data.DeviceFaceMarketListItemWrapper;
import com.xiaomi.fitness.watch.face.data.DeviceFaceRecommendListItem;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.fitness.watch.face.helper.FaceOneTrackUtil;
import com.xiaomi.fitness.watch.face.market.DeviceFaceMarketFeedAdapter;
import defpackage.h9e;
import defpackage.j39;
import defpackage.j9e;
import defpackage.n9e;
import defpackage.p9e;
import defpackage.r9e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002-.B3\b\u0007\u0012(\u0010\u001d\u001a$\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u001aj\u0002`\u001c¢\u0006\u0004\b+\u0010,J\u001b\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u0011R6\u0010\u001d\u001a$\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u001aj\u0002`\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001d\u0010&\u001a\u0004\u0018\u00010!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/watch/face/market/DeviceFaceMarketFeedAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "Lcom/xiaomi/fitness/watch/face/data/DeviceFaceMarketListItemWrapper;", "list", "", "setList", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "onViewAttachedToWindow", "(Landroidx/recyclerview/widget/RecyclerView$d0;)V", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemViewType", "(I)I", "getItemCount", "()I", "onViewRecycled", "Lkotlin/Function4;", "Landroid/view/View;", "Lcom/xiaomi/fitness/watch/face/market/OnFaceFeedItemClickListener;", "onFaceFeedItemClickListener", "Lkotlin/jvm/functions/Function4;", "mList", "Ljava/util/List;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel$delegate", "Lkotlin/Lazy;", "getDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "", "getShowWatchFacePrice", "()Z", "showWatchFacePrice", "<init>", "(Lkotlin/jvm/functions/Function4;)V", "Companion", "DiffCallback", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class DeviceFaceMarketFeedAdapter extends RecyclerView.Adapter<RecyclerView.d0> {
    public static final int ITEM_TYPE_BANNER = 2;
    public static final int ITEM_TYPE_DES = 1;
    public static final int ITEM_TYPE_FEED_WATCH_FACE = 6;
    public static final int ITEM_TYPE_RECOMMEND = 3;
    public static final int ITEM_TYPE_RESOURCE_POOL = 4;
    public static final int ITEM_TYPE_TAB_DATA = 5;
    public static final int ITEM_TYPE_UN = 0;

    @NotNull
    public static final String TAG = "DeviceFaceMarketFeedAdapter";

    /* JADX INFO: renamed from: deviceModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceModel;

    @NotNull
    private final List<DeviceFaceMarketListItemWrapper> mList;

    @NotNull
    private final Function4<View, Integer, DeviceFaceMarketListItemWrapper, Integer, Unit> onFaceFeedItemClickListener;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/watch/face/market/DeviceFaceMarketFeedAdapter$DiffCallback;", "Landroidx/recyclerview/widget/h$f;", "Lcom/xiaomi/fitness/watch/face/data/DeviceFaceMarketListItemWrapper;", "oldItem", "newItem", "", "areItemsTheSame", "(Lcom/xiaomi/fitness/watch/face/data/DeviceFaceMarketListItemWrapper;Lcom/xiaomi/fitness/watch/face/data/DeviceFaceMarketListItemWrapper;)Z", "areContentsTheSame", "<init>", "()V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class DiffCallback extends h.f<DeviceFaceMarketListItemWrapper> {
        @Override // androidx.recyclerview.widget.h.f
        public boolean areContentsTheSame(@NotNull DeviceFaceMarketListItemWrapper oldItem, @NotNull DeviceFaceMarketListItemWrapper newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if (oldItem.isBannerListType() && newItem.isBannerListType()) {
                return true;
            }
            if (oldItem.isRecommendListType() && newItem.isRecommendListType()) {
                List<DeviceFaceRecommendListItem> recommendList = oldItem.getRecommendList();
                Integer numValueOf = recommendList != null ? Integer.valueOf(recommendList.size()) : null;
                List<DeviceFaceRecommendListItem> recommendList2 = newItem.getRecommendList();
                if (Intrinsics.areEqual(numValueOf, recommendList2 != null ? Integer.valueOf(recommendList2.size()) : null)) {
                    return true;
                }
            }
            if (oldItem.isResourcePoolType() && newItem.isResourcePoolType()) {
                DeviceFaceMarketIndexItem resourcePoolListItem = oldItem.getResourcePoolListItem();
                String key = resourcePoolListItem != null ? resourcePoolListItem.getKey() : null;
                if (key != null && key.length() != 0) {
                    DeviceFaceMarketIndexItem resourcePoolListItem2 = newItem.getResourcePoolListItem();
                    String key2 = resourcePoolListItem2 != null ? resourcePoolListItem2.getKey() : null;
                    if (key2 != null && key2.length() != 0) {
                        DeviceFaceMarketIndexItem resourcePoolListItem3 = oldItem.getResourcePoolListItem();
                        String key3 = resourcePoolListItem3 != null ? resourcePoolListItem3.getKey() : null;
                        DeviceFaceMarketIndexItem resourcePoolListItem4 = newItem.getResourcePoolListItem();
                        if (Intrinsics.areEqual(key3, resourcePoolListItem4 != null ? resourcePoolListItem4.getKey() : null)) {
                            return true;
                        }
                    }
                }
            }
            if (oldItem.isFeedWatchFaceType() && newItem.isFeedWatchFaceType()) {
                FaceData feedWatchFaceListItem = oldItem.getFeedWatchFaceListItem();
                String id = feedWatchFaceListItem != null ? feedWatchFaceListItem.getId() : null;
                if (id != null && id.length() != 0) {
                    FaceData feedWatchFaceListItem2 = newItem.getFeedWatchFaceListItem();
                    String id2 = feedWatchFaceListItem2 != null ? feedWatchFaceListItem2.getId() : null;
                    if (id2 != null && id2.length() != 0) {
                        FaceData feedWatchFaceListItem3 = oldItem.getFeedWatchFaceListItem();
                        String id3 = feedWatchFaceListItem3 != null ? feedWatchFaceListItem3.getId() : null;
                        FaceData feedWatchFaceListItem4 = newItem.getFeedWatchFaceListItem();
                        if (Intrinsics.areEqual(id3, feedWatchFaceListItem4 != null ? feedWatchFaceListItem4.getId() : null)) {
                            return true;
                        }
                    }
                }
            }
            return oldItem.isDesItemType() && newItem.isDesItemType();
        }

        @Override // androidx.recyclerview.widget.h.f
        public boolean areItemsTheSame(@NotNull DeviceFaceMarketListItemWrapper oldItem, @NotNull DeviceFaceMarketListItemWrapper newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if (oldItem.isBannerListType() && newItem.isBannerListType()) {
                return true;
            }
            if (oldItem.isRecommendListType() && newItem.isRecommendListType()) {
                return true;
            }
            if (oldItem.isResourcePoolType() && newItem.isResourcePoolType()) {
                return true;
            }
            if (oldItem.isDesItemType() && newItem.isDesItemType()) {
                return true;
            }
            return oldItem.isFeedWatchFaceType() && newItem.isFeedWatchFaceType();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceFaceMarketFeedAdapter(@NotNull Function4<? super View, ? super Integer, ? super DeviceFaceMarketListItemWrapper, ? super Integer, Unit> onFaceFeedItemClickListener) {
        Intrinsics.checkNotNullParameter(onFaceFeedItemClickListener, "onFaceFeedItemClickListener");
        this.onFaceFeedItemClickListener = onFaceFeedItemClickListener;
        this.mList = new ArrayList();
        this.deviceModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: p46
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DeviceFaceMarketFeedAdapter.deviceModel_delegate$lambda$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearableDeviceModel deviceModel_delegate$lambda$0() {
        return (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    private final WearableDeviceModel getDeviceModel() {
        return (WearableDeviceModel) this.deviceModel.getValue();
    }

    private final boolean getShowWatchFacePrice() {
        return ConfigPreference.INSTANCE.getSHOW_WATCH_FACE_PRICE();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1(DeviceFaceMarketFeedAdapter this$0, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function4<View, Integer, DeviceFaceMarketListItemWrapper, Integer, Unit> function4 = this$0.onFaceFeedItemClickListener;
        Intrinsics.checkNotNull(view);
        function4.invoke(view, Integer.valueOf(i), this$0.mList.get(i), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$2(int i, DeviceFaceMarketFeedAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i2 = i + 1;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (this$0.mList.get(i4).isFeedWatchFaceType()) {
                i3++;
            }
        }
        Function4<View, Integer, DeviceFaceMarketListItemWrapper, Integer, Unit> function4 = this$0.onFaceFeedItemClickListener;
        Intrinsics.checkNotNull(view);
        function4.invoke(view, Integer.valueOf(i), this$0.mList.get(i), Integer.valueOf(i3));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.mList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (position >= this.mList.size()) {
            return 0;
        }
        if (this.mList.get(position).isBannerListType()) {
            return 2;
        }
        if (this.mList.get(position).isRecommendListType()) {
            return 3;
        }
        if (this.mList.get(position).isResourcePoolType()) {
            return 4;
        }
        if (this.mList.get(position).isTabData()) {
            return 5;
        }
        if (this.mList.get(position).isFeedWatchFaceType()) {
            return 6;
        }
        return this.mList.get(position).isDesItemType() ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof DeviceFaceDesItemViewHolder) {
            ((DeviceFaceDesItemViewHolder) holder).bindData(this.mList.get(position));
            return;
        }
        if (holder instanceof FaceFeedBannerItemViewHolder) {
            ((FaceFeedBannerItemViewHolder) holder).bindData(this.mList.get(position));
            return;
        }
        if (holder instanceof FaceFeedTabListItemViewHolder) {
            ((FaceFeedTabListItemViewHolder) holder).bindData(this.mList.get(position));
            return;
        }
        if (holder instanceof FaceMarketBasicTabItemViewHolder) {
            ((FaceMarketBasicTabItemViewHolder) holder).bindData(position, this.mList.get(position));
            return;
        }
        if (holder instanceof FaceFeedAlbumItemViewHolder) {
            ((FaceFeedAlbumItemViewHolder) holder).bindData(this.mList.get(position).getTabData());
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: n46
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DeviceFaceMarketFeedAdapter.onBindViewHolder$lambda$1(this.f27530a, position, view);
                }
            });
            return;
        }
        if (holder instanceof FaceFeedCommonItemViewHolder) {
            FaceOneTrackUtil faceOneTrackUtil = FaceOneTrackUtil.INSTANCE;
            Pair[] pairArr = new Pair[3];
            pairArr[0] = TuplesKt.to("tip", "56.82.1.1.35600");
            pairArr[1] = TuplesKt.to("name", "operation_feed_position");
            WearableDeviceModel deviceModel = getDeviceModel();
            pairArr[2] = TuplesKt.to("device_model", deviceModel != null ? DeviceModelExtKt.getModel(deviceModel) : null);
            holder.itemView.setTag(faceOneTrackUtil.buildTrackContent("56.82.1.1.35600", "expose_v3", MapsKt__MapsKt.mapOf(pairArr), 1.0f));
            ((FaceFeedCommonItemViewHolder) holder).bindData(position, this.mList.get(position));
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: o46
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DeviceFaceMarketFeedAdapter.onBindViewHolder$lambda$2(position, this, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        switch (viewType) {
            case 1:
                r9e r9eVarA0 = r9e.A0(LayoutInflater.from(parent.getContext()), parent, false);
                Intrinsics.checkNotNullExpressionValue(r9eVarA0, "inflate(...)");
                return new DeviceFaceDesItemViewHolder(r9eVarA0);
            case 2:
                j9e j9eVarA0 = j9e.A0(LayoutInflater.from(parent.getContext()), parent, false);
                Intrinsics.checkNotNullExpressionValue(j9eVarA0, "inflate(...)");
                return new FaceFeedBannerItemViewHolder(getDeviceModel(), j9eVarA0);
            case 3:
                n9e n9eVarA0 = n9e.A0(LayoutInflater.from(parent.getContext()), parent, false);
                Intrinsics.checkNotNullExpressionValue(n9eVarA0, "inflate(...)");
                return new FaceFeedTabListItemViewHolder(n9eVarA0);
            case 4:
                p9e p9eVarA0 = p9e.A0(LayoutInflater.from(parent.getContext()), parent, false);
                Intrinsics.checkNotNullExpressionValue(p9eVarA0, "inflate(...)");
                return new FaceMarketBasicTabItemViewHolder(getDeviceModel(), p9eVarA0, getShowWatchFacePrice());
            case 5:
                h9e h9eVarA0 = h9e.A0(LayoutInflater.from(parent.getContext()), parent, false);
                Intrinsics.checkNotNullExpressionValue(h9eVarA0, "inflate(...)");
                return new FaceFeedAlbumItemViewHolder(h9eVarA0);
            case 6:
                j39 j39VarA0 = j39.A0(LayoutInflater.from(parent.getContext()), parent, false);
                Intrinsics.checkNotNullExpressionValue(j39VarA0, "inflate(...)");
                return new FaceFeedCommonItemViewHolder(getShowWatchFacePrice(), j39VarA0);
            default:
                j39 j39VarA1 = j39.A0(LayoutInflater.from(parent.getContext()), parent, false);
                Intrinsics.checkNotNullExpressionValue(j39VarA1, "inflate(...)");
                return new FaceFeedCommonItemViewHolder(getShowWatchFacePrice(), j39VarA1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NotNull RecyclerView.d0 holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if (holder.getItemViewType() == 2 || holder.getItemViewType() == 3 || holder.getItemViewType() == 4 || holder.getItemViewType() == 1) {
            ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
            StaggeredGridLayoutManager.LayoutParams layoutParams2 = layoutParams instanceof StaggeredGridLayoutManager.LayoutParams ? (StaggeredGridLayoutManager.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.i(true);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(@NotNull RecyclerView.d0 holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewRecycled(holder);
        if (holder instanceof FaceFeedAlbumItemViewHolder) {
            ((FaceFeedAlbumItemViewHolder) holder).clear();
        } else if (holder instanceof FaceFeedCommonItemViewHolder) {
            ((FaceFeedCommonItemViewHolder) holder).clear();
        }
    }

    public final void setList(@NotNull List<DeviceFaceMarketListItemWrapper> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.mList.clear();
        this.mList.addAll(list);
    }
}
