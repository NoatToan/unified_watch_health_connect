package com.xiaomi.fitness.sport.route.detail.recycler;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport.route.detail.recycler.HistoricalRoutesAdapter;
import com.xiaomi.fitness.sport.route.detail.util.RouteDetailExtKt;
import com.xiaomi.fitness.sport_export.RouteConstantsKt;
import com.xiaomi.fitness.sport_export.data.RouteInfo;
import com.xiaomi.fitness.sport_manager_export.SportRouterKt;
import defpackage.gp0;
import defpackage.nuf;
import defpackage.zxi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0013\u0014B\u0015\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/recycler/HistoricalRoutesAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "Lcom/xiaomi/fitness/sport/route/detail/recycler/HistoricalRoutesAdapter$Holder;", "holder", "", "position", "", "onBindViewHolder", "(Lcom/xiaomi/fitness/sport/route/detail/recycler/HistoricalRoutesAdapter$Holder;I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/xiaomi/fitness/sport/route/detail/recycler/HistoricalRoutesAdapter$Holder;", "Landroidx/recyclerview/widget/h$f;", "diffCallback", "<init>", "(Landroidx/recyclerview/widget/h$f;)V", "Companion", "Holder", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HistoricalRoutesAdapter extends PagingDataAdapter<RouteInfo, Holder> {

    @NotNull
    public static final String TAG = "HistoricalRoutesAdapter";

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/recycler/HistoricalRoutesAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "dataItem", "", "bindData", "(Lcom/xiaomi/fitness/sport_export/data/RouteInfo;)V", "Lgp0;", "binding", "Lgp0;", "getBinding", "()Lgp0;", "<init>", "(Lcom/xiaomi/fitness/sport/route/detail/recycler/HistoricalRoutesAdapter;Lgp0;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class Holder extends RecyclerView.d0 {

        @NotNull
        private final gp0 binding;
        final /* synthetic */ HistoricalRoutesAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Holder(@NotNull HistoricalRoutesAdapter historicalRoutesAdapter, gp0 binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = historicalRoutesAdapter;
            this.binding = binding;
            nuf.f(binding.getRoot());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bindData$lambda$1(Holder this$0, RouteInfo dataItem, View it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(dataItem, "$dataItem");
            Intrinsics.checkNotNullParameter(it, "it");
            Bundle bundle = new Bundle();
            bundle.putInt("route_id", dataItem.getId());
            bundle.putString(RouteConstantsKt.KEY_TRACE_FILE_URL, dataItem.getFile());
            Logger.d(HistoricalRoutesAdapter.TAG, "bindData routeId=" + dataItem.getId() + " fileUrl=" + dataItem.getFile());
            SportRouterKt.startRouteDetailActivity(this$0.binding.getRoot().getContext(), bundle);
            return Unit.INSTANCE;
        }

        public final void bindData(@NotNull final RouteInfo dataItem) {
            Intrinsics.checkNotNullParameter(dataItem, "dataItem");
            this.binding.E.setText(dataItem.getName());
            ImageView routeIcon = this.binding.C;
            Intrinsics.checkNotNullExpressionValue(routeIcon, "routeIcon");
            RouteDetailExtKt.loadImageWithUrl(routeIcon, dataItem.getIcon(), ExtUtilsKt.getDp(72), true);
            this.binding.B.setText(ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), zxi.j, dataItem.getClockInTimes(), Integer.valueOf(dataItem.getClockInTimes())));
            this.binding.D.setText(ApplicationExtKt.getApplication().getResources().getQuantityString(zxi.i, (int) dataItem.getLength(), Double.valueOf(dataItem.getLength())));
            ViewExtKt.clickWithTrigger$default(this.binding.getRoot(), 0L, new Function1() { // from class: e8c
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return HistoricalRoutesAdapter.Holder.bindData$lambda$1(this.f16380a, dataItem, (View) obj);
                }
            }, 1, null);
        }

        @NotNull
        public final gp0 getBinding() {
            return this.binding;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoricalRoutesAdapter(@NotNull h.f<RouteInfo> diffCallback) {
        super(diffCallback, null, null, 6, null);
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull Holder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        RouteInfo item = getItem(position);
        if (item == null) {
            return;
        }
        holder.bindData(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        gp0 gp0VarA0 = gp0.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(gp0VarA0, "inflate(...)");
        return new Holder(this, gp0VarA0);
    }
}
