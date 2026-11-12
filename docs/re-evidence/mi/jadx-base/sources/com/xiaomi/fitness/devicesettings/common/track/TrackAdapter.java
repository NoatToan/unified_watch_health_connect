package com.xiaomi.fitness.devicesettings.common.track;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.google.gson.Gson;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.route.export.track.File;
import com.xiaomi.fitness.route.export.track.Icon;
import com.xiaomi.fitness.route.export.track.Route;
import com.xiaomi.fitness.route.export.track.RouteValue;
import com.xiaomi.fitness.route.export.track.TrackDetailData;
import com.xiaomi.fitness.route.export.track.TrackNet;
import com.xiaomi.fitness.route.export.track.TrackNetManagerKt;
import defpackage.jni;
import defpackage.ni4;
import defpackage.qyi;
import defpackage.wk6;
import defpackage.wzi;
import defpackage.xr5;
import defpackage.zqi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 12\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u000212B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0011H\u0016J\u001c\u0010\u001b\u001a\u00020\u00052\n\u0010\u001c\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0011H\u0016J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u000bH\u0007J\u001a\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\u000bH\u0007J\u0006\u0010'\u001a\u00020\u0011J\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)J\u0006\u0010+\u001a\u00020\u0005J\u0018\u0010,\u001a\u00020\u00052\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010.H\u0007J\b\u0010/\u001a\u00020\u0011H\u0016J\u0006\u00100\u001a\u00020\u000bR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0!¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/track/TrackAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/devicesettings/common/track/TrackAdapter$Holder;", "onSelectChange", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "getOnSelectChange", "()Lkotlin/jvm/functions/Function0;", "isEditing", "", "()Z", "setEditing", "(Z)V", "states", "", "", "Lcom/xiaomi/fitness/route/export/track/Route;", "list", "", "sContext", "Landroid/app/Application;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "holder", "position", "selectAll", "selected", "editState", "Landroidx/lifecycle/MutableLiveData;", "getEditState", "()Landroidx/lifecycle/MutableLiveData;", "setEditMode", "edit", "clearState", "getSelectedCount", "getSelectIds", "", "", "resetSelectedIds", "addData", PluginDeviceInfo.FICONOFF, "", "getItemCount", "isAllChecked", "Companion", "Holder", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTrackAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackAdapter.kt\ncom/xiaomi/fitness/devicesettings/common/track/TrackAdapter\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,232:1\n205#2,4:233\n216#2,2:237\n*S KotlinDebug\n*F\n+ 1 TrackAdapter.kt\ncom/xiaomi/fitness/devicesettings/common/track/TrackAdapter\n*L\n70#1:233,4\n74#1:237,2\n*E\n"})
public final class TrackAdapter extends RecyclerView.Adapter<Holder> {

    @NotNull
    public static final String TAG = "TrackAdapter";

    @NotNull
    private final MutableLiveData<Boolean> editState;
    private boolean isEditing;

    @NotNull
    private final List<Route> list;

    @NotNull
    private final Function0<Unit> onSelectChange;

    @NotNull
    private final Application sContext;

    @NotNull
    private Map<Integer, Route> states;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b!\u0010\"J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/common/track/TrackAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View$OnClickListener;", "Landroid/view/View$OnLongClickListener;", "", "pos", "", "bind", "(I)V", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "", "onLongClick", "(Landroid/view/View;)Z", "Lwk6;", "binding", "Lwk6;", "Lcom/xiaomi/fitness/route/export/track/Route;", "route", "Lcom/xiaomi/fitness/route/export/track/Route;", "getRoute", "()Lcom/xiaomi/fitness/route/export/track/Route;", "setRoute", "(Lcom/xiaomi/fitness/route/export/track/Route;)V", "Lcom/xiaomi/fitness/route/export/track/RouteValue;", "routeValue", "Lcom/xiaomi/fitness/route/export/track/RouteValue;", "getRouteValue", "()Lcom/xiaomi/fitness/route/export/track/RouteValue;", "setRouteValue", "(Lcom/xiaomi/fitness/route/export/track/RouteValue;)V", "<init>", "(Lcom/xiaomi/fitness/devicesettings/common/track/TrackAdapter;Lwk6;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nTrackAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackAdapter.kt\ncom/xiaomi/fitness/devicesettings/common/track/TrackAdapter$Holder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Extensions.kt\ncoil/-SingletonExtensions\n+ 4 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,232:1\n1#2:233\n54#3,3:234\n24#3:237\n57#3,6:238\n63#3,2:245\n54#3,3:247\n24#3:250\n57#3,6:251\n63#3,2:258\n57#4:244\n57#4:257\n*S KotlinDebug\n*F\n+ 1 TrackAdapter.kt\ncom/xiaomi/fitness/devicesettings/common/track/TrackAdapter$Holder\n*L\n150#1:234,3\n150#1:237\n150#1:238,6\n150#1:245,2\n151#1:247,3\n151#1:250\n151#1:251,6\n151#1:258,2\n150#1:244\n151#1:257\n*E\n"})
    public final class Holder extends RecyclerView.d0 implements View.OnClickListener, View.OnLongClickListener {

        @NotNull
        private final wk6 binding;
        public Route route;
        public RouteValue routeValue;
        final /* synthetic */ TrackAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Holder(@NotNull TrackAdapter trackAdapter, wk6 binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = trackAdapter;
            this.binding = binding;
            this.itemView.setOnClickListener(this);
            this.itemView.setOnLongClickListener(this);
        }

        /* JADX WARN: Code duplicated, block: B:47:0x018e  */
        public final void bind(int pos) {
            RouteValue routeValue;
            Double doubleOrNull;
            this.itemView.setTag(zqi.B0, Integer.valueOf(pos));
            Route route = (Route) this.this$0.list.get(pos);
            setRoute(route);
            this.itemView.setTag(route);
            if (getRoute().getValue() != null) {
                Object objFromJson = new Gson().fromJson(getRoute().getValue(), (Class<Object>) RouteValue.class);
                Intrinsics.checkNotNull(objFromJson);
                routeValue = (RouteValue) objFromJson;
            } else {
                routeValue = new RouteValue(null, null, null, null, null);
            }
            setRouteValue(routeValue);
            boolean z = (getRoute().getDeleted() != null && Intrinsics.areEqual(getRoute().getDeleted(), Boolean.TRUE)) || getRoute().getValue() == null || getRoute().getMFile() == null;
            if (z) {
                this.binding.F.setBackground(ni4.e(this.this$0.sContext, jni.r1));
                this.binding.E.setBackground(ni4.e(this.this$0.sContext, jni.r1));
                this.binding.F.setText("");
                this.binding.E.setText("");
            } else {
                this.binding.F.setBackground(ni4.e(this.this$0.sContext, jni.s1));
                this.binding.E.setBackground(ni4.e(this.this$0.sContext, jni.s1));
                getRoute();
                this.binding.F.setText(getRouteValue().getAlias());
                TextView textView = this.binding.E;
                Resources resources = AppUtil.getApp().getResources();
                int i = qyi.n;
                String dis = getRouteValue().getDis();
                int iDoubleValue = (dis == null || (doubleOrNull = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(dis)) == null) ? 0 : (int) doubleOrNull.doubleValue();
                Object[] objArr = new Object[1];
                String dis2 = getRouteValue().getDis();
                objArr[0] = xr5.d(1, (dis2 != null ? Double.parseDouble(dis2) : 0.0d) / ((double) 1000));
                textView.setText(resources.getQuantityString(i, iDoubleValue, objArr));
            }
            Icon icon = getRoute().getIcon();
            String url = icon != null ? icon.getUrl() : null;
            String str = (url == null || url.length() == 0) ^ true ? url : null;
            if (str != null) {
                ImageView icon2 = this.binding.D;
                Intrinsics.checkNotNullExpressionValue(icon2, "icon");
                if (Coil.imageLoader(icon2.getContext()).enqueue(new ImageRequest.Builder(icon2.getContext()).data(str).target(icon2).build()) == null) {
                    ImageView icon3 = this.binding.D;
                    Intrinsics.checkNotNullExpressionValue(icon3, "icon");
                    Coil.imageLoader(icon3.getContext()).enqueue(new ImageRequest.Builder(icon3.getContext()).data(Integer.valueOf(jni.k1)).target(icon3).build());
                }
            } else {
                ImageView icon4 = this.binding.D;
                Intrinsics.checkNotNullExpressionValue(icon4, "icon");
                Coil.imageLoader(icon4.getContext()).enqueue(new ImageRequest.Builder(icon4.getContext()).data(Integer.valueOf(jni.k1)).target(icon4).build());
            }
            if (this.this$0.getIsEditing()) {
                View checkView = this.binding.A;
                Intrinsics.checkNotNullExpressionValue(checkView, "checkView");
                ViewExtKt.visible(checkView);
                ImageView rightArrow = this.binding.G;
                Intrinsics.checkNotNullExpressionValue(rightArrow, "rightArrow");
                ViewExtKt.gone(rightArrow);
                this.binding.A.setSelected(this.this$0.states.get(Integer.valueOf(pos)) != null);
                return;
            }
            View checkView2 = this.binding.A;
            Intrinsics.checkNotNullExpressionValue(checkView2, "checkView");
            ViewExtKt.gone(checkView2);
            if (z) {
                ImageView rightArrow2 = this.binding.G;
                Intrinsics.checkNotNullExpressionValue(rightArrow2, "rightArrow");
                ViewExtKt.gone(rightArrow2);
            } else {
                ImageView rightArrow3 = this.binding.G;
                Intrinsics.checkNotNullExpressionValue(rightArrow3, "rightArrow");
                ViewExtKt.visible(rightArrow3);
            }
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

        @Override // android.view.View.OnClickListener
        public void onClick(@NotNull View v) {
            String suffix;
            String dateStr;
            String url;
            File mFile;
            Intrinsics.checkNotNullParameter(v, "v");
            Logger.i(TrackAdapter.TAG, "device track item on click route_id is : " + getRoute().getRoute_id());
            String url2 = null;
            Route route = null;
            url2 = null;
            if (this.this$0.getIsEditing()) {
                boolean zIsSelected = this.binding.A.isSelected();
                this.binding.A.setSelected(!zIsSelected);
                Map map = this.this$0.states;
                Object tag = v.getTag(zqi.B0);
                Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
                Integer num = (Integer) tag;
                if (!zIsSelected) {
                    Object tag2 = v.getTag();
                    Intrinsics.checkNotNull(tag2, "null cannot be cast to non-null type com.xiaomi.fitness.route.export.track.Route");
                    route = (Route) tag2;
                }
                map.put(num, route);
                this.this$0.getOnSelectChange().invoke();
                return;
            }
            if (Intrinsics.areEqual(getRoute().getDeleted(), Boolean.TRUE)) {
                Logger.i(TrackAdapter.TAG, "文件只在设备上");
                return;
            }
            Route route2 = (Route) v.getTag();
            String value = route2 != null ? route2.getValue() : null;
            if (value != null) {
                try {
                    suffix = value.length() == 0 ? "" : ((RouteValue) new Gson().fromJson(value, RouteValue.class)).getSuffix();
                } catch (Exception unused) {
                }
            }
            Route route3 = (Route) v.getTag();
            if (route3 != null && (mFile = route3.getMFile()) != null) {
                url2 = mFile.getUrl();
            }
            Logger.i(TrackAdapter.TAG, "suffix: " + suffix + ",url:" + url2);
            if (suffix == null || suffix.length() == 0 || url2 == null || url2.length() == 0) {
                ToastUtil.INSTANCE.showToast(wzi.common_load_fail);
                return;
            }
            try {
                String uploadTime = getRouteValue().getUploadTime();
                dateStr = TimeDateUtil.getDateStr(uploadTime != null ? Long.parseLong(uploadTime) : 0L, AppUtil.getApp().getString(wzi.n));
            } catch (Exception e) {
                FitnessLogUtils.e(TrackAdapter.TAG, "exception:" + e);
                dateStr = "";
            }
            String suffix2 = getRouteValue().getSuffix();
            String str = suffix2 == null ? "" : suffix2;
            File mFile2 = getRoute().getMFile();
            String str2 = (mFile2 == null || (url = mFile2.getUrl()) == null) ? "" : url;
            String uploadTime2 = getRouteValue().getUploadTime();
            long j = uploadTime2 != null ? Long.parseLong(uploadTime2) : 0L;
            String source = getRouteValue().getSource();
            String str3 = source == null ? "" : source;
            String route_id = getRoute().getRoute_id();
            String alias = getRouteValue().getAlias();
            String str4 = alias == null ? "" : alias;
            String dis = getRouteValue().getDis();
            TrackNetManagerKt.getInstance(TrackNet.INSTANCE).goTrackDetailPage(suffix, url2, new TrackDetailData(str, str2, j, dateStr, str3, route_id, str4, dis == null ? "" : dis), 1);
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(@NotNull View v) {
            Intrinsics.checkNotNullParameter(v, "v");
            if (this.this$0.getIsEditing()) {
                return false;
            }
            this.this$0.states.clear();
            Map map = this.this$0.states;
            Object tag = v.getTag(zqi.B0);
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
            Object tag2 = v.getTag();
            Intrinsics.checkNotNull(tag2, "null cannot be cast to non-null type com.xiaomi.fitness.route.export.track.Route");
            map.put((Integer) tag, (Route) tag2);
            this.this$0.setEditMode(true, false);
            return true;
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

    public TrackAdapter(@NotNull Function0<Unit> onSelectChange) {
        Intrinsics.checkNotNullParameter(onSelectChange, "onSelectChange");
        this.onSelectChange = onSelectChange;
        this.states = new LinkedHashMap();
        this.list = new ArrayList();
        this.sContext = AppUtil.getApp();
        this.editState = new MutableLiveData<>();
    }

    public static /* synthetic */ void setEditMode$default(TrackAdapter trackAdapter, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        trackAdapter.setEditMode(z, z2);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void addData(@Nullable List<Route> d) {
        this.states.clear();
        this.list.clear();
        List<Route> list = d;
        if (list != null && !list.isEmpty()) {
            this.list.addAll(list);
        }
        notifyDataSetChanged();
    }

    @NotNull
    public final MutableLiveData<Boolean> getEditState() {
        return this.editState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.list.size();
    }

    @NotNull
    public final Function0<Unit> getOnSelectChange() {
        return this.onSelectChange;
    }

    @NotNull
    public final Set<String> getSelectIds() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<Map.Entry<Integer, Route>> it = this.states.entrySet().iterator();
        while (it.hasNext()) {
            Route value = it.next().getValue();
            String route_id = value != null ? value.getRoute_id() : null;
            if (route_id != null) {
                linkedHashSet.add(route_id);
            }
        }
        return linkedHashSet;
    }

    public final int getSelectedCount() {
        Map<Integer, Route> map = this.states;
        int i = 0;
        if (!map.isEmpty()) {
            Iterator<Map.Entry<Integer, Route>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue() != null) {
                    i++;
                }
            }
        }
        return i;
    }

    public final boolean isAllChecked() {
        return getSelectedCount() == this.list.size();
    }

    /* JADX INFO: renamed from: isEditing, reason: from getter */
    public final boolean getIsEditing() {
        return this.isEditing;
    }

    public final void resetSelectedIds() {
        this.states.clear();
        this.onSelectChange.invoke();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void selectAll(boolean selected) {
        int count = getCount();
        for (int i = 0; i < count; i++) {
            this.states.put(Integer.valueOf(i), selected ? this.list.get(i) : null);
        }
        notifyDataSetChanged();
        this.onSelectChange.invoke();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setEditMode(boolean edit, boolean clearState) {
        if (clearState) {
            this.states.clear();
        }
        this.isEditing = edit;
        this.editState.setValue(Boolean.valueOf(edit));
        notifyDataSetChanged();
    }

    public final void setEditing(boolean z) {
        this.isEditing = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull Holder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        wk6 wk6VarA0 = wk6.A0(ExtUtilsKt.getInflater(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(wk6VarA0, "inflate(...)");
        return new Holder(this, wk6VarA0);
    }
}
