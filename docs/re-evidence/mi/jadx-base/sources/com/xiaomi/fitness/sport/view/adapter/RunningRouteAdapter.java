package com.xiaomi.fitness.sport.view.adapter;

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
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.sport.route.detail.util.RouteDetailExtKt;
import com.xiaomi.fitness.sport.view.adapter.RunningRouteAdapter;
import com.xiaomi.fitness.sport.view.route.CreateRouteDetailActivity;
import com.xiaomi.fitness.sport_export.RouteConstantsKt;
import com.xiaomi.fitness.sport_export.data.RouteInfo;
import com.xiaomi.fitness.sport_manager_export.SportRouterKt;
import defpackage.kp0;
import defpackage.zxi;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\b\u001a\u00020\t2\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\n¢\u0006\u0002\u0010\u000bJ\u001c\u0010\f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\t2\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/sport/view/adapter/RunningRouteAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/sport/view/adapter/RunningRouteAdapter$Holder;", "<init>", "()V", "list", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "setData", "", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "holder", "position", "getItemCount", "Holder", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RunningRouteAdapter extends RecyclerView.Adapter<Holder> {

    @NotNull
    private ArrayList<RouteInfo> list = new ArrayList<>();

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/sport/view/adapter/RunningRouteAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "v", "", "onClick", "(Landroid/view/View;)V", "Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "bean", "bindData", "(Lcom/xiaomi/fitness/sport_export/data/RouteInfo;)V", "Lkp0;", "view", "Lkp0;", "getView", "()Lkp0;", "mData", "Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "getMData", "()Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "setMData", "<init>", "(Lcom/xiaomi/fitness/sport/view/adapter/RunningRouteAdapter;Lkp0;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nRunningRouteAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RunningRouteAdapter.kt\ncom/xiaomi/fitness/sport/view/adapter/RunningRouteAdapter$Holder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,93:1\n54#2,3:94\n24#2:97\n59#2,6:98\n*S KotlinDebug\n*F\n+ 1 RunningRouteAdapter.kt\ncom/xiaomi/fitness/sport/view/adapter/RunningRouteAdapter$Holder\n*L\n81#1:94,3\n81#1:97\n81#1:98,6\n*E\n"})
    public final class Holder extends RecyclerView.d0 implements View.OnClickListener {
        public RouteInfo mData;
        final /* synthetic */ RunningRouteAdapter this$0;

        @NotNull
        private final kp0 view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Holder(@NotNull RunningRouteAdapter runningRouteAdapter, kp0 view) {
            super(view.getRoot());
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = runningRouteAdapter;
            this.view = view;
            view.getRoot().setOnClickListener(this);
        }

        public final void bindData(@NotNull RouteInfo bean) {
            Intrinsics.checkNotNullParameter(bean, "bean");
            setMData(bean);
            ImageView routeBg = this.view.E;
            Intrinsics.checkNotNullExpressionValue(routeBg, "routeBg");
            String icon = bean.getIcon();
            ImageLoader imageLoader = Coil.imageLoader(routeBg.getContext());
            ImageRequest.Builder builderTarget = new ImageRequest.Builder(routeBg.getContext()).data(icon).target(routeBg);
            builderTarget.transformations(new RoundedCornersTransformation(ExtUtilsKt.getDp(15)));
            imageLoader.enqueue(builderTarget.build());
            this.view.D.setText(bean.getName());
            this.view.G.setText(String.valueOf(bean.getLength()));
            this.view.I.setText(AppUtil.getApp().getResources().getQuantityString(zxi.p, (int) bean.getLength()));
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
        public final kp0 getView() {
            return this.view;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@Nullable View v) {
            Logger.i("RunningRouteListAdapter", "mData=" + getMData());
            if (getMData().getId() == 0) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putSerializable("route_id", Integer.valueOf(getMData().getId()));
            bundle.putString(RouteConstantsKt.KEY_TRACE_FILE_URL, getMData().getFile());
            Integer officialRouteType = getMData().getOfficialRouteType();
            if (officialRouteType == null || officialRouteType.intValue() != 1) {
                SportRouterKt.startRouteDetailActivity(v != null ? v.getContext() : null, bundle);
                return;
            }
            CreateRouteDetailActivity.Companion companion = CreateRouteDetailActivity.INSTANCE;
            Intrinsics.checkNotNull(v);
            Context context = v.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            CreateRouteDetailActivity.Companion.start$default(companion, context, getMData().getId(), null, true, 4, null);
        }

        public final void setMData(@NotNull RouteInfo routeInfo) {
            Intrinsics.checkNotNullParameter(routeInfo, "<set-?>");
            this.mData = routeInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateViewHolder$lambda$0(ViewGroup parent, kp0 view) {
        int width;
        Intrinsics.checkNotNullParameter(parent, "$parent");
        Intrinsics.checkNotNullParameter(view, "$view");
        if (UIUtils.INSTANCE.isTablet() || (width = parent.getWidth()) == 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getRoot().getLayoutParams();
        layoutParams.width = (width / 3) * 2;
        view.getRoot().setLayoutParams(layoutParams);
        view.getRoot().invalidate();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.list.size();
    }

    public final void setData(@NotNull ArrayList<RouteInfo> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.list = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull Holder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        RouteInfo routeInfo = this.list.get(position);
        Intrinsics.checkNotNullExpressionValue(routeInfo, "get(...)");
        holder.bindData(routeInfo);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public Holder onCreateViewHolder(@NotNull final ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        final kp0 kp0VarA0 = kp0.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(kp0VarA0, "inflate(...)");
        kp0VarA0.getRoot().post(new Runnable() { // from class: m2l
            @Override // java.lang.Runnable
            public final void run() {
                RunningRouteAdapter.onCreateViewHolder$lambda$0(parent, kp0VarA0);
            }
        });
        return new Holder(this, kp0VarA0);
    }
}
