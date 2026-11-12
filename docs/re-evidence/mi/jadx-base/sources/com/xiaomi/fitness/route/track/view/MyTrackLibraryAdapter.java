package com.xiaomi.fitness.route.track.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.google.gson.Gson;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.map.export.MapDynamicUtils;
import com.xiaomi.fitness.route.export.track.File;
import com.xiaomi.fitness.route.export.track.Icon;
import com.xiaomi.fitness.route.export.track.Route;
import com.xiaomi.fitness.route.export.track.RouteValue;
import com.xiaomi.fitness.route.export.track.TrackDetailData;
import com.xiaomi.fitness.route.track.view.MyTrackLibraryAdapter;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 12\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u000212B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010$\u001a\u00020\u001f2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0016\u0010&\u001a\u00020\u001f2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019J\u0014\u0010'\u001a\u00020\u001f2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eJ\u001c\u0010)\u001a\u00060\u0002R\u00020\u00002\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0013H\u0016J\u001c\u0010-\u001a\u00020\u001f2\n\u0010.\u001a\u00060\u0002R\u00020\u00002\u0006\u0010/\u001a\u00020\u0013H\u0016J\b\u00100\u001a\u00020\u0013H\u0016R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0006R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\rR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/route/track/view/MyTrackLibraryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/route/track/view/MyTrackLibraryAdapter$Holder;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "mList", "", "Lcom/xiaomi/fitness/route/export/track/Route;", "getMList", "()Ljava/util/List;", "setMList", "(Ljava/util/List;)V", "mContext", "getMContext", "()Landroid/content/Context;", "setMContext", "goDetailPosition", "", "getGoDetailPosition", "()I", "setGoDetailPosition", "(I)V", "deviceTrackList", "", "", "getDeviceTrackList", "setDeviceTrackList", "refreshSelect", "Lkotlin/Function0;", "", "getRefreshSelect", "()Lkotlin/jvm/functions/Function0;", "setRefreshSelect", "(Lkotlin/jvm/functions/Function0;)V", "setData", "list", "setDeviceTrack", "setRefreshSelectList", "refreshSelectList", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "holder", "position", "getItemCount", "Companion", "Holder", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MyTrackLibraryAdapter extends RecyclerView.Adapter<Holder> {

    @NotNull
    public static final String TAG = "MyTrackLibraryAdapter";

    @Nullable
    private List<String> deviceTrackList;
    private int goDetailPosition;

    @NotNull
    private Context mContext;

    @NotNull
    private List<Route> mList;
    public Function0<Unit> refreshSelect;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u00020\t8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\fR\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/route/track/view/MyTrackLibraryAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "deviceHasTheRoutes", "()V", "", "uploadTime", "startToTrackDetailActivity", "(Ljava/lang/String;)V", "Lcom/xiaomi/fitness/route/export/track/Route;", "data", "bindData", "(Lcom/xiaomi/fitness/route/export/track/Route;)V", "Lb3g;", "view", "Lb3g;", "getView", "()Lb3g;", "route", "Lcom/xiaomi/fitness/route/export/track/Route;", "getRoute", "()Lcom/xiaomi/fitness/route/export/track/Route;", "setRoute", "Lcom/xiaomi/fitness/route/export/track/RouteValue;", "routeValue", "Lcom/xiaomi/fitness/route/export/track/RouteValue;", "getRouteValue", "()Lcom/xiaomi/fitness/route/export/track/RouteValue;", "setRouteValue", "(Lcom/xiaomi/fitness/route/export/track/RouteValue;)V", "<init>", "(Lcom/xiaomi/fitness/route/track/view/MyTrackLibraryAdapter;Lb3g;)V", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nMyTrackLibraryAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyTrackLibraryAdapter.kt\ncom/xiaomi/fitness/route/track/view/MyTrackLibraryAdapter$Holder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Extensions.kt\ncoil/-SingletonExtensions\n+ 4 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,229:1\n1#2:230\n54#3,3:231\n24#3:234\n57#3,6:235\n63#3,2:242\n54#3,3:244\n24#3:247\n57#3,6:248\n63#3,2:255\n57#4:241\n57#4:254\n*S KotlinDebug\n*F\n+ 1 MyTrackLibraryAdapter.kt\ncom/xiaomi/fitness/route/track/view/MyTrackLibraryAdapter$Holder\n*L\n168#1:231,3\n168#1:234\n168#1:235,6\n168#1:242,2\n169#1:244,3\n169#1:247\n169#1:248,6\n169#1:255,2\n168#1:241\n169#1:254\n*E\n"})
    public final class Holder extends RecyclerView.d0 {
        public Route route;
        public RouteValue routeValue;
        final /* synthetic */ MyTrackLibraryAdapter this$0;

        @NotNull
        private final b3g view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Holder(@NotNull MyTrackLibraryAdapter myTrackLibraryAdapter, b3g view) {
            super(view.getRoot());
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = myTrackLibraryAdapter;
            this.view = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void bindData$lambda$0(MyTrackLibraryAdapter this$0, Holder this$1, Ref.ObjectRef uploadTime, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(uploadTime, "$uploadTime");
            this$0.setGoDetailPosition(this$1.getAbsoluteAdapterPosition());
            MyTrackLibraryActivityKt.startToTrackDetailActivity((String) uploadTime.element, this$1.getRoute(), this$1.getRouteValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindData$lambda$1(Holder this$0, MyTrackLibraryAdapter this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            this$0.getRoute().setDelSelected(Boolean.valueOf(!this$0.view.E.isSelected()));
            this$1.getRefreshSelect().invoke();
            this$1.notifyDataSetChanged();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindData$lambda$2(Holder this$0, MyTrackLibraryAdapter this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            this$0.getRoute().setDelSelected(Boolean.valueOf(!this$0.view.E.isSelected()));
            this$1.getRefreshSelect().invoke();
            TrackImportListFragment.INSTANCE.setPageState(1);
            this$1.notifyDataSetChanged();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void bindData$lambda$3(MyTrackLibraryAdapter this$0, Holder this$1, Ref.ObjectRef uploadTime, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(uploadTime, "$uploadTime");
            FitnessLogUtils.d(MyTrackLibraryAdapter.TAG, "item click");
            this$0.setGoDetailPosition(this$1.getAbsoluteAdapterPosition());
            MyTrackLibraryActivityKt.startToTrackDetailActivity((String) uploadTime.element, this$1.getRoute(), this$1.getRouteValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindData$lambda$4(Holder this$0, MyTrackLibraryAdapter this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            FitnessLogUtils.d(MyTrackLibraryAdapter.TAG, "img click");
            this$0.getRoute().setToDeviceSelected(!this$0.view.E.isSelected());
            this$1.notifyDataSetChanged();
        }

        private final void deviceHasTheRoutes() {
            List<String> deviceTrackList = this.this$0.getDeviceTrackList();
            if (deviceTrackList == null || !deviceTrackList.contains(getRoute().getRoute_id())) {
                TextView trackTag = this.view.H;
                Intrinsics.checkNotNullExpressionValue(trackTag, "trackTag");
                ViewExtKt.gone(trackTag);
                View selectImg = this.view.E;
                Intrinsics.checkNotNullExpressionValue(selectImg, "selectImg");
                ViewExtKt.visible(selectImg);
                return;
            }
            TextView trackTag2 = this.view.H;
            Intrinsics.checkNotNullExpressionValue(trackTag2, "trackTag");
            ViewExtKt.visible(trackTag2);
            View selectImg2 = this.view.E;
            Intrinsics.checkNotNullExpressionValue(selectImg2, "selectImg");
            ViewExtKt.gone(selectImg2);
        }

        private final void startToTrackDetailActivity(String uploadTime) {
            String url;
            if (!NetUtil.INSTANCE.getNetWorkAvailable(AppUtil.getApp())) {
                ToastUtil.INSTANCE.showToast(x0j.y);
                return;
            }
            this.this$0.setGoDetailPosition(getAbsoluteAdapterPosition());
            FitnessLogUtils.i(MyTrackLibraryAdapter.TAG, "goDetailPosition:" + this.this$0.getGoDetailPosition());
            final Intent intent = new Intent(this.this$0.getMContext(), (Class<?>) TrackDetailActivity.class);
            Bundle bundle = new Bundle();
            String suffix = getRouteValue().getSuffix();
            String str = suffix == null ? "" : suffix;
            File mFile = getRoute().getMFile();
            String str2 = (mFile == null || (url = mFile.getUrl()) == null) ? "" : url;
            String uploadTime2 = getRouteValue().getUploadTime();
            long j = uploadTime2 != null ? Long.parseLong(uploadTime2) : 0L;
            String source = getRouteValue().getSource();
            String str3 = source == null ? "" : source;
            String route_id = getRoute().getRoute_id();
            String alias = getRouteValue().getAlias();
            String str4 = alias == null ? "" : alias;
            String dis = getRouteValue().getDis();
            bundle.putSerializable(TrackDetailActivity.ROUTE_DETAIL, new TrackDetailData(str, str2, j, uploadTime, str3, route_id, str4, dis == null ? "" : dis));
            intent.putExtras(bundle);
            MapDynamicUtils mapDynamicUtils = MapDynamicUtils.INSTANCE;
            Context mContext = this.this$0.getMContext();
            MyTrackLibraryActivity myTrackLibraryActivity = mContext instanceof MyTrackLibraryActivity ? (MyTrackLibraryActivity) mContext : null;
            final MyTrackLibraryAdapter myTrackLibraryAdapter = this.this$0;
            mapDynamicUtils.checkSoLoaded(myTrackLibraryActivity, new Function2() { // from class: nfg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MyTrackLibraryAdapter.Holder.startToTrackDetailActivity$lambda$9(myTrackLibraryAdapter, intent, ((Boolean) obj).booleanValue(), (Exception) obj2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit startToTrackDetailActivity$lambda$9(MyTrackLibraryAdapter this$0, Intent intent, boolean z, Exception exc) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(intent, "$intent");
            if (z) {
                AnyExtKt.main$default(null, new MyTrackLibraryAdapter$Holder$startToTrackDetailActivity$1$1(this$0, intent, null), 1, null);
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r5v9, types: [T, java.lang.String] */
        @SuppressLint({"RestrictedApi"})
        public final void bindData(@NotNull Route data) {
            RouteValue routeValue;
            String string;
            Intrinsics.checkNotNullParameter(data, "data");
            setRoute(data);
            if (getRoute().getValue() != null) {
                Object objFromJson = new Gson().fromJson(getRoute().getValue(), (Class<Object>) RouteValue.class);
                Intrinsics.checkNotNull(objFromJson);
                routeValue = (RouteValue) objFromJson;
            } else {
                routeValue = new RouteValue(null, null, null, null, null);
            }
            setRouteValue(routeValue);
            this.view.G.setText(getRouteValue().getAlias());
            this.view.C.setText(getRouteValue().getDis());
            try {
                TextView textView = this.view.C;
                Resources resources = AppUtil.getApp().getResources();
                int i = yxi.f40670b;
                String dis = getRouteValue().getDis();
                int i2 = dis != null ? (int) Double.parseDouble(dis) : 0;
                Object[] objArr = new Object[1];
                String dis2 = getRouteValue().getDis();
                objArr[0] = xr5.d(2, (dis2 != null ? Double.parseDouble(dis2) : 0.0d) / ((double) 1000));
                textView.setText(resources.getQuantityString(i, i2, objArr));
            } catch (Exception e) {
                FitnessLogUtils.e(MyTrackLibraryAdapter.TAG, "e:" + e);
            }
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            try {
                String uploadTime = getRouteValue().getUploadTime();
                objectRef.element = TimeDateUtil.getDateStr(uploadTime != null ? Long.parseLong(uploadTime) : 0L, AppUtil.getApp().getString(x0j.c));
                String source = getRouteValue().getSource();
                if (source == null || Integer.parseInt(source) != 2) {
                    String source2 = getRouteValue().getSource();
                    string = (source2 == null || Integer.parseInt(source2) != 3) ? AppUtil.getApp().getString(x0j.G) : AppUtil.getApp().getString(x0j.F);
                } else {
                    string = AppUtil.getApp().getString(x0j.H);
                }
                Intrinsics.checkNotNull(string);
                this.view.B.setText(objectRef.element + " | " + string);
            } catch (Exception e2) {
                FitnessLogUtils.e(MyTrackLibraryAdapter.TAG, "exception:" + e2);
            }
            deviceHasTheRoutes();
            int pageState = TrackImportListFragment.INSTANCE.getPageState();
            if (pageState == 0) {
                View selectImg = this.view.E;
                Intrinsics.checkNotNullExpressionValue(selectImg, "selectImg");
                ViewExtKt.gone(selectImg);
                AppCompatImageView arrow = this.view.A;
                Intrinsics.checkNotNullExpressionValue(arrow, "arrow");
                ViewExtKt.visible(arrow);
                View root = this.view.getRoot();
                final MyTrackLibraryAdapter myTrackLibraryAdapter = this.this$0;
                root.setOnClickListener(new View.OnClickListener() { // from class: ifg
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MyTrackLibraryAdapter.Holder.bindData$lambda$0(myTrackLibraryAdapter, this, objectRef, view);
                    }
                });
            } else if (pageState == 1) {
                View selectImg2 = this.view.E;
                Intrinsics.checkNotNullExpressionValue(selectImg2, "selectImg");
                ViewExtKt.visible(selectImg2);
                AppCompatImageView arrow2 = this.view.A;
                Intrinsics.checkNotNullExpressionValue(arrow2, "arrow");
                ViewExtKt.gone(arrow2);
                View view = this.view.E;
                Boolean boolIsDelSelected = getRoute().isDelSelected();
                view.setSelected(boolIsDelSelected != null ? boolIsDelSelected.booleanValue() : false);
                View root2 = this.view.getRoot();
                final MyTrackLibraryAdapter myTrackLibraryAdapter2 = this.this$0;
                root2.setOnClickListener(new View.OnClickListener() { // from class: jfg
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        MyTrackLibraryAdapter.Holder.bindData$lambda$1(this.f22738a, myTrackLibraryAdapter2, view2);
                    }
                });
            } else if (pageState == 2) {
                View root3 = this.view.getRoot();
                final MyTrackLibraryAdapter myTrackLibraryAdapter3 = this.this$0;
                root3.setOnClickListener(new View.OnClickListener() { // from class: lfg
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        MyTrackLibraryAdapter.Holder.bindData$lambda$3(myTrackLibraryAdapter3, this, objectRef, view2);
                    }
                });
                this.view.E.setSelected(getRoute().isToDeviceSelected());
                FrameLayout frameLayout = this.view.F;
                final MyTrackLibraryAdapter myTrackLibraryAdapter4 = this.this$0;
                frameLayout.setOnClickListener(new View.OnClickListener() { // from class: mfg
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        MyTrackLibraryAdapter.Holder.bindData$lambda$4(this.f26102a, myTrackLibraryAdapter4, view2);
                    }
                });
            } else if (pageState == 3) {
                View selectImg3 = this.view.E;
                Intrinsics.checkNotNullExpressionValue(selectImg3, "selectImg");
                ViewExtKt.visible(selectImg3);
                AppCompatImageView arrow3 = this.view.A;
                Intrinsics.checkNotNullExpressionValue(arrow3, "arrow");
                ViewExtKt.gone(arrow3);
                View view2 = this.view.E;
                Boolean boolIsDelSelected2 = getRoute().isDelSelected();
                view2.setSelected(boolIsDelSelected2 != null ? boolIsDelSelected2.booleanValue() : false);
                View root4 = this.view.getRoot();
                final MyTrackLibraryAdapter myTrackLibraryAdapter5 = this.this$0;
                root4.setOnClickListener(new View.OnClickListener() { // from class: kfg
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        MyTrackLibraryAdapter.Holder.bindData$lambda$2(this.f23802a, myTrackLibraryAdapter5, view3);
                    }
                });
            }
            Icon icon = getRoute().getIcon();
            String url = icon != null ? icon.getUrl() : null;
            String str = true ^ (url == null || url.length() == 0) ? url : null;
            if (str != null) {
                ImageView img = this.view.D;
                Intrinsics.checkNotNullExpressionValue(img, "img");
                if (Coil.imageLoader(img.getContext()).enqueue(new ImageRequest.Builder(img.getContext()).data(str).target(img).build()) != null) {
                    return;
                }
            }
            ImageView img2 = this.view.D;
            Intrinsics.checkNotNullExpressionValue(img2, "img");
            Coil.imageLoader(img2.getContext()).enqueue(new ImageRequest.Builder(img2.getContext()).data(Integer.valueOf(doi.e)).target(img2).build());
        }

        @NotNull
        public final Route getRoute() {
            Route route = this.route;
            if (route != null) {
                return route;
            }
            Intrinsics.throwUninitializedPropertyAccessException("route");
            return null;
        }

        @NotNull
        public final RouteValue getRouteValue() {
            RouteValue routeValue = this.routeValue;
            if (routeValue != null) {
                return routeValue;
            }
            Intrinsics.throwUninitializedPropertyAccessException("routeValue");
            return null;
        }

        @NotNull
        public final b3g getView() {
            return this.view;
        }

        public final void setRoute(@NotNull Route route) {
            Intrinsics.checkNotNullParameter(route, "<set-?>");
            this.route = route;
        }

        public final void setRouteValue(@NotNull RouteValue routeValue) {
            Intrinsics.checkNotNullParameter(routeValue, "<set-?>");
            this.routeValue = routeValue;
        }
    }

    public MyTrackLibraryAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.mList = new ArrayList();
        this.mContext = context;
        this.goDetailPosition = -1;
    }

    @Nullable
    public final List<String> getDeviceTrackList() {
        return this.deviceTrackList;
    }

    public final int getGoDetailPosition() {
        return this.goDetailPosition;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.mList.size();
    }

    @NotNull
    public final Context getMContext() {
        return this.mContext;
    }

    @NotNull
    public final List<Route> getMList() {
        return this.mList;
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
        this.mList = list;
        notifyDataSetChanged();
    }

    public final void setDeviceTrack(@Nullable List<String> list) {
        this.deviceTrackList = list;
        notifyDataSetChanged();
    }

    public final void setDeviceTrackList(@Nullable List<String> list) {
        this.deviceTrackList = list;
    }

    public final void setGoDetailPosition(int i) {
        this.goDetailPosition = i;
    }

    public final void setMContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.mContext = context;
    }

    public final void setMList(@NotNull List<Route> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.mList = list;
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
    public void onBindViewHolder(@NotNull Holder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindData(this.mList.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        b3g b3gVarA0 = b3g.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(b3gVarA0, "inflate(...)");
        return new Holder(this, b3gVarA0);
    }
}
