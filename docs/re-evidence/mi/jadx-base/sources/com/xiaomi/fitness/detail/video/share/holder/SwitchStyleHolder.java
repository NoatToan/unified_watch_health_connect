package com.xiaomi.fitness.detail.video.share.holder;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.maps.AMap;
import com.mi.health.utils.MapUtilsKt;
import com.xiaomi.fitness.detail.video.share.adapter.PatternStyleAdapter;
import com.xiaomi.fitness.detail.video.share.holder.SwitchStyleHolder;
import com.xiaomi.fitness.detail.video.share.model.StyleItem;
import com.xiaomi.fitness.detail.video.share.util.SportTraceVideoShareUtilKt;
import com.xiaomi.fitness.detail.video.share.util.TraceStyleResModel;
import com.xiaomi.fitness.detail.video.share.util.TraceStyleResUtilExtKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.j1j;
import defpackage.okp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 82\u00020\u0001:\u00018BY\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 \u0012\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b6\u00107J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\u000b\u001a\u00020\u00022#\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R.\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\fR\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00069"}, d2 = {"Lcom/xiaomi/fitness/detail/video/share/holder/SwitchStyleHolder;", "", "", "initHolder", "()V", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "typeId", "callback", "initAdapterOnClickCallback", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/amap/api/maps/AMap;", "aMap", "Lcom/amap/api/maps/AMap;", "getAMap", "()Lcom/amap/api/maps/AMap;", "Landroid/widget/ImageView;", "doneBtn", "Landroid/widget/ImageView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "editPanel", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "isMapStyle", "Z", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/detail/video/share/util/TraceStyleResModel;", "traceStyleResModeLiveData", "Landroidx/lifecycle/MutableLiveData;", "getTraceStyleResModeLiveData", "()Landroidx/lifecycle/MutableLiveData;", "mapStyleChangeCallback", "Lkotlin/jvm/functions/Function1;", "getMapStyleChangeCallback", "()Lkotlin/jvm/functions/Function1;", "setMapStyleChangeCallback", "Landroidx/recyclerview/widget/RecyclerView;", "traceStyleRecycler", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/widget/TextView;", "titleTv", "Landroid/widget/TextView;", "Lcom/xiaomi/fitness/detail/video/share/adapter/PatternStyleAdapter;", "styleAdapter", "Lcom/xiaomi/fitness/detail/video/share/adapter/PatternStyleAdapter;", "Lokp;", "styleBinding", "<init>", "(Landroid/content/Context;Lcom/amap/api/maps/AMap;Lokp;Landroid/widget/ImageView;Landroidx/constraintlayout/widget/ConstraintLayout;ZLandroidx/lifecycle/MutableLiveData;Lkotlin/jvm/functions/Function1;)V", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SwitchStyleHolder {

    @NotNull
    public static final String TAG = "SwitchMapHolder";

    @NotNull
    private final AMap aMap;

    @NotNull
    private final Context context;

    @NotNull
    private final ImageView doneBtn;

    @NotNull
    private final ConstraintLayout editPanel;
    private final boolean isMapStyle;

    @NotNull
    private Function1<? super Boolean, Unit> mapStyleChangeCallback;

    @Nullable
    private PatternStyleAdapter styleAdapter;

    @NotNull
    private final TextView titleTv;

    @NotNull
    private final RecyclerView traceStyleRecycler;

    @NotNull
    private final MutableLiveData<TraceStyleResModel> traceStyleResModeLiveData;

    public SwitchStyleHolder(@NotNull Context context, @NotNull AMap aMap, @NotNull okp styleBinding, @NotNull ImageView doneBtn, @NotNull ConstraintLayout editPanel, boolean z, @NotNull MutableLiveData<TraceStyleResModel> traceStyleResModeLiveData, @NotNull Function1<? super Boolean, Unit> mapStyleChangeCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(aMap, "aMap");
        Intrinsics.checkNotNullParameter(styleBinding, "styleBinding");
        Intrinsics.checkNotNullParameter(doneBtn, "doneBtn");
        Intrinsics.checkNotNullParameter(editPanel, "editPanel");
        Intrinsics.checkNotNullParameter(traceStyleResModeLiveData, "traceStyleResModeLiveData");
        Intrinsics.checkNotNullParameter(mapStyleChangeCallback, "mapStyleChangeCallback");
        this.context = context;
        this.aMap = aMap;
        this.doneBtn = doneBtn;
        this.editPanel = editPanel;
        this.isMapStyle = z;
        this.traceStyleResModeLiveData = traceStyleResModeLiveData;
        this.mapStyleChangeCallback = mapStyleChangeCallback;
        RecyclerView traceStyleRecyclerView = styleBinding.B;
        Intrinsics.checkNotNullExpressionValue(traceStyleRecyclerView, "traceStyleRecyclerView");
        this.traceStyleRecycler = traceStyleRecyclerView;
        TextView titleTv = styleBinding.A;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        this.titleTv = titleTv;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initHolder$lambda$0(SwitchStyleHolder this$0, ImageView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        ViewExtKt.gone(this$0.editPanel);
        return Unit.INSTANCE;
    }

    @NotNull
    public final AMap getAMap() {
        return this.aMap;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final Function1<Boolean, Unit> getMapStyleChangeCallback() {
        return this.mapStyleChangeCallback;
    }

    @NotNull
    public final MutableLiveData<TraceStyleResModel> getTraceStyleResModeLiveData() {
        return this.traceStyleResModeLiveData;
    }

    public final void initAdapterOnClickCallback(@Nullable final Function1<? super Integer, Unit> callback) {
        PatternStyleAdapter patternStyleAdapter = this.styleAdapter;
        if (patternStyleAdapter != null) {
            patternStyleAdapter.setOnItemClickListener(new PatternStyleAdapter.OnItemClickListener() { // from class: com.xiaomi.fitness.detail.video.share.holder.SwitchStyleHolder.initAdapterOnClickCallback.1
                @Override // com.xiaomi.fitness.detail.video.share.adapter.PatternStyleAdapter.OnItemClickListener
                public void onItemClick(StyleItem styleItem) {
                    Intrinsics.checkNotNullParameter(styleItem, "styleItem");
                    if (SwitchStyleHolder.this.isMapStyle) {
                        MapUtilsKt.setCustomMapStyleWithOnlineStyleId(SwitchStyleHolder.this.getAMap(), styleItem.getStyleId(), styleItem.getNameStr());
                        return;
                    }
                    SwitchStyleHolder.this.getAMap().clear();
                    SwitchStyleHolder.this.getTraceStyleResModeLiveData().setValue(TraceStyleResUtilExtKt.getTraceStyleModel(styleItem.getTypeId()));
                    Function1<Integer, Unit> function1 = callback;
                    if (function1 != null) {
                        function1.invoke2(Integer.valueOf(styleItem.getTypeId()));
                    }
                }
            });
        }
        this.traceStyleRecycler.setAdapter(this.styleAdapter);
    }

    public final void initHolder() {
        this.titleTv.setText(this.isMapStyle ? j1j.j6 : j1j.k6);
        PatternStyleAdapter patternStyleAdapter = new PatternStyleAdapter(0, 1, null);
        this.styleAdapter = patternStyleAdapter;
        patternStyleAdapter.setRecyclerView(this.traceStyleRecycler);
        PatternStyleAdapter patternStyleAdapter2 = this.styleAdapter;
        if (patternStyleAdapter2 != null) {
            patternStyleAdapter2.bindListData(SportTraceVideoShareUtilKt.buildStyleItemList(this.isMapStyle));
        }
        ViewExtKt.clickWithTrigger$default(this.doneBtn, 0L, new Function1() { // from class: xro
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SwitchStyleHolder.initHolder$lambda$0(this.f39399a, (ImageView) obj);
            }
        }, 1, null);
    }

    public final void setMapStyleChangeCallback(@NotNull Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.mapStyleChangeCallback = function1;
    }
}
