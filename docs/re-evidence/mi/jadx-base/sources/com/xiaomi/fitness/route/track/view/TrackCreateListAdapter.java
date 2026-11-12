package com.xiaomi.fitness.route.track.view;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.google.gson.Gson;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.route.export.track.Icon;
import com.xiaomi.fitness.route.export.track.Route;
import com.xiaomi.fitness.route.export.track.RouteValue;
import com.xiaomi.fitness.route.track.view.TrackCreateListAdapter;
import com.xiaomi.fitness.sport_export.IRunningRouteApi;
import com.xiaomi.fitness.sport_export.RunningRouteAccessExportExtKt;
import defpackage.b3g;
import defpackage.doi;
import defpackage.x0j;
import defpackage.xr5;
import defpackage.yxi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0011\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0013J\u0014\u0010\u0014\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u001c\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\u001c\u0010\u001c\u001a\u00020\f2\n\u0010\u001d\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001aH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/route/track/view/TrackCreateListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/route/track/view/TrackCreateListAdapter$TrackCreateListHolder;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "mList", "", "Lcom/xiaomi/fitness/route/export/track/Route;", "refreshSelect", "Lkotlin/Function0;", "", "getRefreshSelect", "()Lkotlin/jvm/functions/Function0;", "setRefreshSelect", "(Lkotlin/jvm/functions/Function0;)V", "setData", "list", "", "setRefreshSelectList", "refreshSelectList", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "onBindViewHolder", "holder", "position", "TrackCreateListHolder", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TrackCreateListAdapter extends RecyclerView.Adapter<TrackCreateListHolder> {

    @NotNull
    private final Context context;

    @NotNull
    private final List<Route> mList;
    public Function0<Unit> refreshSelect;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/route/track/view/TrackCreateListAdapter$TrackCreateListHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "position", "", "onBind", "(I)V", "Lb3g;", "binding", "Lb3g;", "<init>", "(Lcom/xiaomi/fitness/route/track/view/TrackCreateListAdapter;Lb3g;)V", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nTrackCreateListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackCreateListAdapter.kt\ncom/xiaomi/fitness/route/track/view/TrackCreateListAdapter$TrackCreateListHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,123:1\n54#2,3:124\n24#2:127\n57#2,6:128\n63#2,2:135\n54#2,3:137\n24#2:140\n57#2,6:141\n63#2,2:148\n57#3:134\n57#3:147\n*S KotlinDebug\n*F\n+ 1 TrackCreateListAdapter.kt\ncom/xiaomi/fitness/route/track/view/TrackCreateListAdapter$TrackCreateListHolder\n*L\n103#1:124,3\n103#1:127\n103#1:128,6\n103#1:135,2\n104#1:137,3\n104#1:140\n104#1:141,6\n104#1:148,2\n103#1:134\n104#1:147\n*E\n"})
    public final class TrackCreateListHolder extends RecyclerView.d0 {

        @NotNull
        private final b3g binding;
        final /* synthetic */ TrackCreateListAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TrackCreateListHolder(@NotNull TrackCreateListAdapter trackCreateListAdapter, b3g binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = trackCreateListAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onBind$lambda$0(TrackCreateListAdapter this$0, Route route, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(route, "$route");
            RunningRouteAccessExportExtKt.getINSTANCE(IRunningRouteApi.INSTANCE).gotoCreateRouteDetailActivity(this$0.context, route.getStrategyId());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onBind$lambda$1(Route route, TrackCreateListHolder this$0, TrackCreateListAdapter this$1, View view) {
            Intrinsics.checkNotNullParameter(route, "$route");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            route.setDelSelected(Boolean.valueOf(!this$0.binding.E.isSelected()));
            this$1.getRefreshSelect().invoke();
            TrackCreateListFragment.INSTANCE.setPageState(1);
            this$1.notifyDataSetChanged();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onBind$lambda$2(Route route, TrackCreateListHolder this$0, TrackCreateListAdapter this$1, View view) {
            Intrinsics.checkNotNullParameter(route, "$route");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            route.setDelSelected(Boolean.valueOf(!this$0.binding.E.isSelected()));
            this$1.getRefreshSelect().invoke();
            TrackCreateListFragment.INSTANCE.setPageState(1);
            this$1.notifyDataSetChanged();
        }

        public final void onBind(int position) {
            String alias;
            String url;
            String dis;
            String dis2;
            final Route route = (Route) this.this$0.mList.get(position);
            RouteValue routeValue = route.getValue() != null ? (RouteValue) new Gson().fromJson(route.getValue(), RouteValue.class) : new RouteValue(null, null, null, null, null);
            TextView textView = this.binding.G;
            if (routeValue == null || (alias = routeValue.getAlias()) == null) {
                alias = "";
            }
            textView.setText(alias);
            try {
                TextView textView2 = this.binding.C;
                Resources resources = AppUtil.getApp().getResources();
                int i = yxi.f40670b;
                int i2 = (routeValue == null || (dis2 = routeValue.getDis()) == null) ? 0 : (int) Double.parseDouble(dis2);
                Object[] objArr = new Object[1];
                objArr[0] = xr5.d(2, ((routeValue == null || (dis = routeValue.getDis()) == null) ? 0.0d : Double.parseDouble(dis)) / ((double) 1000));
                textView2.setText(resources.getQuantityString(i, i2, objArr));
            } catch (Exception e) {
                FitnessLogUtils.e(MyTrackLibraryAdapter.TAG, "e:" + e);
            }
            this.binding.B.setText(TimeDateUtil.getDateStr(route.getTime(), AppUtil.getApp().getString(x0j.c)));
            int pageState = TrackCreateListFragment.INSTANCE.getPageState();
            if (pageState == 0) {
                View selectImg = this.binding.E;
                Intrinsics.checkNotNullExpressionValue(selectImg, "selectImg");
                ViewExtKt.gone(selectImg);
                AppCompatImageView arrow = this.binding.A;
                Intrinsics.checkNotNullExpressionValue(arrow, "arrow");
                ViewExtKt.visible(arrow);
                View root = this.binding.getRoot();
                final TrackCreateListAdapter trackCreateListAdapter = this.this$0;
                root.setOnClickListener(new View.OnClickListener() { // from class: ykp
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TrackCreateListAdapter.TrackCreateListHolder.onBind$lambda$0(trackCreateListAdapter, route, view);
                    }
                });
            } else if (pageState == 1) {
                View selectImg2 = this.binding.E;
                Intrinsics.checkNotNullExpressionValue(selectImg2, "selectImg");
                ViewExtKt.visible(selectImg2);
                AppCompatImageView arrow2 = this.binding.A;
                Intrinsics.checkNotNullExpressionValue(arrow2, "arrow");
                ViewExtKt.gone(arrow2);
                View view = this.binding.E;
                Boolean boolIsDelSelected = route.isDelSelected();
                view.setSelected(boolIsDelSelected != null ? boolIsDelSelected.booleanValue() : false);
                View root2 = this.binding.getRoot();
                final TrackCreateListAdapter trackCreateListAdapter2 = this.this$0;
                root2.setOnClickListener(new View.OnClickListener() { // from class: zkp
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        TrackCreateListAdapter.TrackCreateListHolder.onBind$lambda$1(route, this, trackCreateListAdapter2, view2);
                    }
                });
            } else if (pageState == 3) {
                View selectImg3 = this.binding.E;
                Intrinsics.checkNotNullExpressionValue(selectImg3, "selectImg");
                ViewExtKt.visible(selectImg3);
                AppCompatImageView arrow3 = this.binding.A;
                Intrinsics.checkNotNullExpressionValue(arrow3, "arrow");
                ViewExtKt.gone(arrow3);
                View view2 = this.binding.E;
                Boolean boolIsDelSelected2 = route.isDelSelected();
                view2.setSelected(boolIsDelSelected2 != null ? boolIsDelSelected2.booleanValue() : false);
                View root3 = this.binding.getRoot();
                final TrackCreateListAdapter trackCreateListAdapter3 = this.this$0;
                root3.setOnClickListener(new View.OnClickListener() { // from class: alp
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        TrackCreateListAdapter.TrackCreateListHolder.onBind$lambda$2(route, this, trackCreateListAdapter3, view3);
                    }
                });
            }
            Icon icon = route.getIcon();
            if (icon != null && (url = icon.getUrl()) != null) {
                ImageView img = this.binding.D;
                Intrinsics.checkNotNullExpressionValue(img, "img");
                if (Coil.imageLoader(img.getContext()).enqueue(new ImageRequest.Builder(img.getContext()).data(url).target(img).build()) != null) {
                    return;
                }
            }
            ImageView img2 = this.binding.D;
            Intrinsics.checkNotNullExpressionValue(img2, "img");
            Coil.imageLoader(img2.getContext()).enqueue(new ImageRequest.Builder(img2.getContext()).data(Integer.valueOf(doi.e)).target(img2).build());
        }
    }

    public TrackCreateListAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.mList = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.mList.size();
    }

    @NotNull
    public final Function0<Unit> getRefreshSelect() {
        Function0<Unit> function0 = this.refreshSelect;
        if (function0 != null) {
            return function0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("refreshSelect");
        return null;
    }

    public final void setData(@NotNull List<Route> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.mList.clear();
        this.mList.addAll(list);
        notifyDataSetChanged();
    }

    public final void setRefreshSelect(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.refreshSelect = function0;
    }

    public final void setRefreshSelectList(@NotNull Function0<Unit> refreshSelectList) {
        Intrinsics.checkNotNullParameter(refreshSelectList, "refreshSelectList");
        setRefreshSelect(refreshSelectList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull TrackCreateListHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.onBind(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public TrackCreateListHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        b3g b3gVarA0 = b3g.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(b3gVarA0, "inflate(...)");
        return new TrackCreateListHolder(this, b3gVarA0);
    }
}
