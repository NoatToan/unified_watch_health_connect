package com.xiaomi.fitness.sport.view.route;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.transform.RoundedCornersTransformation;
import com.amap.api.maps.AMapUtils;
import com.amap.api.maps.model.LatLng;
import com.mi.health.sport.RunningRouteListMap;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport.route.detail.util.RouteDetailExtKt;
import com.xiaomi.fitness.sport.view.route.RunningRouteListAdapter;
import com.xiaomi.fitness.sport_export.RouteConstantsKt;
import com.xiaomi.fitness.sport_export.data.RouteInfo;
import com.xiaomi.fitness.sport_manager_export.SportRouterKt;
import defpackage.ip0;
import defpackage.nuf;
import defpackage.xr5;
import defpackage.zxi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u000f\u001a\u00020\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\u0006\u0010\u0012\u001a\u00020\u000eJ\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u001c\u0010\u0019\u001a\u00020\u00102\n\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0017H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/sport/view/route/RunningRouteListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/sport/view/route/RunningRouteListAdapter$Holder;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "setContext", "list", "", "Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "locationData", "Lcom/mi/health/sport/RunningRouteListMap$LocationData;", "setData", "", "", "curLocation", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "onBindViewHolder", "holder", "position", "Holder", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RunningRouteListAdapter extends RecyclerView.Adapter<Holder> {

    @NotNull
    private Context context;

    @NotNull
    private List<RouteInfo> list;

    @Nullable
    private RunningRouteListMap.LocationData locationData;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/sport/view/route/RunningRouteListAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "bean", "", "bindData", "(Lcom/xiaomi/fitness/sport_export/data/RouteInfo;)V", "Lip0;", "view", "Lip0;", "getView", "()Lip0;", "mData", "Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "getMData", "()Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "setMData", "<init>", "(Lcom/xiaomi/fitness/sport/view/route/RunningRouteListAdapter;Lip0;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nRunningRouteListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RunningRouteListAdapter.kt\ncom/xiaomi/fitness/sport/view/route/RunningRouteListAdapter$Holder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,105:1\n54#2,3:106\n24#2:109\n59#2,6:110\n*S KotlinDebug\n*F\n+ 1 RunningRouteListAdapter.kt\ncom/xiaomi/fitness/sport/view/route/RunningRouteListAdapter$Holder\n*L\n72#1:106,3\n72#1:109\n72#1:110,6\n*E\n"})
    public final class Holder extends RecyclerView.d0 {
        public RouteInfo mData;
        final /* synthetic */ RunningRouteListAdapter this$0;

        @NotNull
        private final ip0 view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Holder(@NotNull RunningRouteListAdapter runningRouteListAdapter, ip0 view) {
            super(view.getRoot());
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = runningRouteListAdapter;
            this.view = view;
            nuf.f(view.getRoot());
            view.getRoot().setOnClickListener(new View.OnClickListener() { // from class: p4l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    RunningRouteListAdapter.Holder._init_$lambda$1(this.f29997a, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$1(Holder this$0, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Bundle bundle = new Bundle();
            bundle.putSerializable("route_id", Integer.valueOf(this$0.getMData().getId()));
            bundle.putString(RouteConstantsKt.KEY_TRACE_FILE_URL, this$0.getMData().getFile());
            Logger.d("RunningRouteListAdapter", "mData=" + this$0.getMData());
            SportRouterKt.startRouteDetailActivity$default(null, bundle, 1, null);
        }

        public final void bindData(@NotNull RouteInfo bean) {
            Intrinsics.checkNotNullParameter(bean, "bean");
            setMData(bean);
            ImageView routeIcon = this.view.F;
            Intrinsics.checkNotNullExpressionValue(routeIcon, "routeIcon");
            String icon = bean.getIcon();
            ImageLoader imageLoader = Coil.imageLoader(routeIcon.getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(routeIcon.getContext()).data(icon).target(routeIcon);
            builderTarget.transformations(new RoundedCornersTransformation(ExtUtilsKt.getDp(15)));
            imageLoader.enqueue(builderTarget.build());
            this.view.B.setText(bean.getName());
            this.view.G.setText(ApplicationExtKt.getApplication().getResources().getQuantityString(zxi.i, (int) bean.getLength(), Double.valueOf(bean.getLength())));
            RunningRouteListMap.LocationData locationData = this.this$0.locationData;
            Intrinsics.checkNotNull(locationData);
            double latitude = locationData.getLatitude();
            RunningRouteListMap.LocationData locationData2 = this.this$0.locationData;
            Intrinsics.checkNotNull(locationData2);
            double dCalculateLineDistance = ((double) AMapUtils.calculateLineDistance(new LatLng(latitude, locationData2.getLongitude()), new LatLng(bean.getStartPoint().getLatitude(), bean.getStartPoint().getLongitude()))) / ((double) 1000);
            this.view.I.setText(AppUtil.getApp().getResources().getQuantityString(zxi.m, (int) dCalculateLineDistance, xr5.d(2, dCalculateLineDistance)));
            this.view.A.setText(" | " + AppUtil.getApp().getResources().getQuantityString(zxi.f41782k, bean.getHeat(), Integer.valueOf(bean.getHeat())));
            if (bean.isRecommend() == 1) {
                TextView recommendIcon = this.view.C;
                Intrinsics.checkNotNullExpressionValue(recommendIcon, "recommendIcon");
                ViewExtKt.setVisible(recommendIcon, true);
            } else {
                TextView recommendIcon2 = this.view.C;
                Intrinsics.checkNotNullExpressionValue(recommendIcon2, "recommendIcon");
                ViewExtKt.setVisible(recommendIcon2, false);
            }
            TextView routeType = this.view.H;
            Intrinsics.checkNotNullExpressionValue(routeType, "routeType");
            RouteDetailExtKt.showRouteTypeTag(routeType, Integer.valueOf(bean.getCategory()));
        }

        @NotNull
        public final RouteInfo getMData() {
            RouteInfo routeInfo = this.mData;
            if (routeInfo != null) {
                return routeInfo;
            }
            Intrinsics.throwUninitializedPropertyAccessException("mData");
            return null;
        }

        @NotNull
        public final ip0 getView() {
            return this.view;
        }

        public final void setMData(@NotNull RouteInfo routeInfo) {
            Intrinsics.checkNotNullParameter(routeInfo, "<set-?>");
            this.mData = routeInfo;
        }
    }

    public RunningRouteListAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.list = new ArrayList();
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.list.size();
    }

    public final void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final void setData(@NotNull List<RouteInfo> list, @NotNull RunningRouteListMap.LocationData curLocation) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(curLocation, "curLocation");
        this.list.clear();
        this.list.addAll(list);
        this.locationData = curLocation;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull Holder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindData(this.list.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ip0 ip0VarA0 = ip0.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(ip0VarA0, "inflate(...)");
        return new Holder(this, ip0VarA0);
    }
}
