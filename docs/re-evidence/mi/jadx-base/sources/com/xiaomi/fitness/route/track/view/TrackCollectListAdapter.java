package com.xiaomi.fitness.route.track.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.p;
import coil.Coil;
import coil.request.ImageRequest;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.route.track.view.TrackCollectListAdapter;
import com.xiaomi.fitness.sport_export.data.RouteInfo;
import defpackage.b3g;
import defpackage.x0j;
import defpackage.xr5;
import defpackage.yxi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0015\u0016B\u001f\u0012\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000fj\u0002`\u0010¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\n\u0010\n\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000fj\u0002`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/route/track/view/TrackCollectListAdapter;", "Landroidx/recyclerview/widget/p;", "Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "Lcom/xiaomi/fitness/route/track/view/TrackCollectListAdapter$TrackCollectListViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/xiaomi/fitness/route/track/view/TrackCollectListAdapter$TrackCollectListViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lcom/xiaomi/fitness/route/track/view/TrackCollectListAdapter$TrackCollectListViewHolder;I)V", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/route/track/view/OnTrackCollectListClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/jvm/functions/Function1;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "TrackCollectListViewHolder", "DiffCallback", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TrackCollectListAdapter extends p<RouteInfo, TrackCollectListViewHolder> {

    @NotNull
    private final Function1<RouteInfo, Unit> listener;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/route/track/view/TrackCollectListAdapter$DiffCallback;", "Landroidx/recyclerview/widget/h$f;", "Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "oldItem", "newItem", "", "areItemsTheSame", "(Lcom/xiaomi/fitness/sport_export/data/RouteInfo;Lcom/xiaomi/fitness/sport_export/data/RouteInfo;)Z", "areContentsTheSame", "<init>", "()V", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class DiffCallback extends h.f<RouteInfo> {
        @Override // androidx.recyclerview.widget.h.f
        public boolean areContentsTheSame(@NotNull RouteInfo oldItem, @NotNull RouteInfo newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.h.f
        public boolean areItemsTheSame(@NotNull RouteInfo oldItem, @NotNull RouteInfo newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.getId() == newItem.getId();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/route/track/view/TrackCollectListAdapter$TrackCollectListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "routeInfo", "", "onBind", "(Lcom/xiaomi/fitness/sport_export/data/RouteInfo;)V", "onClick", "Lb3g;", "binding", "Lb3g;", "<init>", "(Lcom/xiaomi/fitness/route/track/view/TrackCollectListAdapter;Lb3g;)V", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nTrackCollectListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackCollectListAdapter.kt\ncom/xiaomi/fitness/route/track/view/TrackCollectListAdapter$TrackCollectListViewHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,73:1\n54#2,3:74\n24#2:77\n57#2,6:78\n63#2,2:85\n57#3:84\n*S KotlinDebug\n*F\n+ 1 TrackCollectListAdapter.kt\ncom/xiaomi/fitness/route/track/view/TrackCollectListAdapter$TrackCollectListViewHolder\n*L\n40#1:74,3\n40#1:77\n40#1:78,6\n40#1:85,2\n40#1:84\n*E\n"})
    public final class TrackCollectListViewHolder extends RecyclerView.d0 {

        @NotNull
        private final b3g binding;
        final /* synthetic */ TrackCollectListAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackCollectListViewHolder(@NotNull TrackCollectListAdapter trackCollectListAdapter, b3g binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = trackCollectListAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onClick$lambda$0(TrackCollectListAdapter this$0, RouteInfo routeInfo, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(routeInfo, "$routeInfo");
            this$0.listener.invoke2(routeInfo);
        }

        public final void onBind(@NotNull RouteInfo routeInfo) {
            Intrinsics.checkNotNullParameter(routeInfo, "routeInfo");
            this.binding.G.setText(routeInfo.getName());
            try {
                this.binding.C.setText(AppUtil.getApp().getResources().getQuantityString(yxi.f40670b, ((int) routeInfo.getLength()) * 1000, xr5.d(2, routeInfo.getLength())));
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.binding.B.setText(TimeDateUtil.getDateStr(routeInfo.getCreateTimestamp(), AppUtil.getApp().getString(x0j.c)));
            ImageView img = this.binding.D;
            Intrinsics.checkNotNullExpressionValue(img, "img");
            Coil.imageLoader(img.getContext()).enqueue(new ImageRequest.Builder(img.getContext()).data(routeInfo.getIcon()).target(img).build());
        }

        public final void onClick(@NotNull final RouteInfo routeInfo) {
            Intrinsics.checkNotNullParameter(routeInfo, "routeInfo");
            View root = this.binding.getRoot();
            final TrackCollectListAdapter trackCollectListAdapter = this.this$0;
            root.setOnClickListener(new View.OnClickListener() { // from class: vkp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TrackCollectListAdapter.TrackCollectListViewHolder.onClick$lambda$0(trackCollectListAdapter, routeInfo, view);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TrackCollectListAdapter(@NotNull Function1<? super RouteInfo, Unit> listener) {
        super(new DiffCallback());
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull TrackCollectListViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        RouteInfo item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.onBind(item);
        RouteInfo item2 = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item2, "getItem(...)");
        holder.onClick(item2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public TrackCollectListViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        b3g b3gVarA0 = b3g.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(b3gVarA0, "inflate(...)");
        return new TrackCollectListViewHolder(this, b3gVarA0);
    }
}
