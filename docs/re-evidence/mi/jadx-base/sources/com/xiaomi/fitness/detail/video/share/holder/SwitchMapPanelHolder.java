package com.xiaomi.fitness.detail.video.share.holder;

import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import com.amap.api.maps.AMap;
import com.google.android.material.tabs.TabLayout;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.detail.video.share.holder.SwitchMapPanelHolder;
import com.xiaomi.fitness.detail.video.share.model.SportTracePointDataModel;
import com.xiaomi.fitness.detail.video.share.util.KeyboardUtil;
import com.xiaomi.fitness.detail.video.share.util.TraceStyleResModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.share.view.SportTraceDataView;
import defpackage.hqp;
import defpackage.okp;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u001a\u0010\u001b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00180\u0017\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u0017\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0017¢\u0006\u0004\b2\u00103J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J0\u0010\u000b\u001a\u00020\u00022!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R(\u0010\u001b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010%R\"\u0010(\u001a\u00020'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*\"\u0004\b+\u0010,R.\u0010-\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u0010\f¨\u00064"}, d2 = {"Lcom/xiaomi/fitness/detail/video/share/holder/SwitchMapPanelHolder;", "", "", "initHolder", "()V", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "typeId", "callback", "setOnTraceStyleItemClickCallback", "(Lkotlin/jvm/functions/Function1;)V", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "context", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "getContext", "()Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "Lhqp;", "mBinding", "Lhqp;", "getMBinding", "()Lhqp;", "Landroidx/lifecycle/MutableLiveData;", "", "", "Lcom/xiaomi/fitness/detail/video/share/model/SportTracePointDataModel;", "traceDataMapLiveData", "Landroidx/lifecycle/MutableLiveData;", "curtProgressLiveData", "Lcom/xiaomi/fitness/detail/video/share/util/TraceStyleResModel;", "traceStyleResModeLiveData", "Landroid/widget/ImageView;", "backBtn", "Landroid/widget/ImageView;", "Lcom/xiaomi/fitness/detail/video/share/holder/SwitchStyleHolder;", "traceStyleHolder", "Lcom/xiaomi/fitness/detail/video/share/holder/SwitchStyleHolder;", "mapStyleHolder", "", "isDefaultMapStyle", "Z", "()Z", "setDefaultMapStyle", "(Z)V", "mapStyleChangeCallback", "Lkotlin/jvm/functions/Function1;", "getMapStyleChangeCallback", "()Lkotlin/jvm/functions/Function1;", "setMapStyleChangeCallback", "<init>", "(Lcom/xiaomi/fitness/baseui/view/BaseActivity;Lhqp;Landroidx/lifecycle/MutableLiveData;Landroidx/lifecycle/MutableLiveData;Landroidx/lifecycle/MutableLiveData;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SwitchMapPanelHolder {

    @Nullable
    private ImageView backBtn;

    @NotNull
    private final BaseActivity context;

    @NotNull
    private final MutableLiveData<Float> curtProgressLiveData;
    private boolean isDefaultMapStyle;

    @NotNull
    private final hqp mBinding;

    @NotNull
    private Function1<? super Boolean, Unit> mapStyleChangeCallback;
    private SwitchStyleHolder mapStyleHolder;

    @NotNull
    private final MutableLiveData<Map<Float, SportTracePointDataModel>> traceDataMapLiveData;
    private SwitchStyleHolder traceStyleHolder;

    @NotNull
    private final MutableLiveData<TraceStyleResModel> traceStyleResModeLiveData;

    public SwitchMapPanelHolder(@NotNull BaseActivity context, @NotNull hqp mBinding, @NotNull MutableLiveData<Map<Float, SportTracePointDataModel>> traceDataMapLiveData, @NotNull MutableLiveData<Float> curtProgressLiveData, @NotNull MutableLiveData<TraceStyleResModel> traceStyleResModeLiveData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mBinding, "mBinding");
        Intrinsics.checkNotNullParameter(traceDataMapLiveData, "traceDataMapLiveData");
        Intrinsics.checkNotNullParameter(curtProgressLiveData, "curtProgressLiveData");
        Intrinsics.checkNotNullParameter(traceStyleResModeLiveData, "traceStyleResModeLiveData");
        this.context = context;
        this.mBinding = mBinding;
        this.traceDataMapLiveData = traceDataMapLiveData;
        this.curtProgressLiveData = curtProgressLiveData;
        this.traceStyleResModeLiveData = traceStyleResModeLiveData;
        this.backBtn = mBinding.M.B;
        this.isDefaultMapStyle = true;
        this.mapStyleChangeCallback = new Function1() { // from class: lro
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SwitchMapPanelHolder.mapStyleChangeCallback$lambda$0(this.f25383a, ((Boolean) obj).booleanValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initHolder$lambda$1(SwitchMapPanelHolder this$0, ImageView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        TabLayout tabLayout = this$0.mBinding.O.A;
        tabLayout.F(tabLayout.x(0));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initHolder$lambda$2(SwitchMapPanelHolder this$0, ImageView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        TabLayout tabLayout = this$0.mBinding.O.A;
        tabLayout.F(tabLayout.x(0));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initHolder$lambda$3(SwitchMapPanelHolder this$0, ImageView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        ConstraintLayout editPanel = this$0.mBinding.B;
        Intrinsics.checkNotNullExpressionValue(editPanel, "editPanel");
        ViewExtKt.gone(editPanel);
        SportTraceDataView sportTrackDataView = this$0.mBinding.L;
        Intrinsics.checkNotNullExpressionValue(sportTrackDataView, "sportTrackDataView");
        ViewExtKt.visible(sportTrackDataView);
        this$0.mBinding.G.setVisibility(0);
        KeyboardUtil.INSTANCE.showSoftInputMethod(this$0.context, this$0.mBinding.B, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mapStyleChangeCallback$lambda$0(SwitchMapPanelHolder this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isDefaultMapStyle = z;
        return Unit.INSTANCE;
    }

    @NotNull
    public final BaseActivity getContext() {
        return this.context;
    }

    @NotNull
    public final hqp getMBinding() {
        return this.mBinding;
    }

    @NotNull
    public final Function1<Boolean, Unit> getMapStyleChangeCallback() {
        return this.mapStyleChangeCallback;
    }

    public final void initHolder() {
        BaseActivity baseActivity = this.context;
        AMap map = this.mBinding.D.getMap();
        Intrinsics.checkNotNullExpressionValue(map, "getMap(...)");
        okp mapStyle = this.mBinding.M.E;
        Intrinsics.checkNotNullExpressionValue(mapStyle, "mapStyle");
        ImageView done = this.mBinding.M.C;
        Intrinsics.checkNotNullExpressionValue(done, "done");
        ConstraintLayout editPanel = this.mBinding.B;
        Intrinsics.checkNotNullExpressionValue(editPanel, "editPanel");
        SwitchStyleHolder switchStyleHolder = new SwitchStyleHolder(baseActivity, map, mapStyle, done, editPanel, true, this.traceStyleResModeLiveData, this.mapStyleChangeCallback);
        this.mapStyleHolder = switchStyleHolder;
        switchStyleHolder.initHolder();
        SwitchStyleHolder switchStyleHolder2 = this.mapStyleHolder;
        if (switchStyleHolder2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mapStyleHolder");
            switchStyleHolder2 = null;
        }
        switchStyleHolder2.initAdapterOnClickCallback(null);
        BaseActivity baseActivity2 = this.context;
        AMap map2 = this.mBinding.D.getMap();
        Intrinsics.checkNotNullExpressionValue(map2, "getMap(...)");
        okp traceStyle = this.mBinding.M.G;
        Intrinsics.checkNotNullExpressionValue(traceStyle, "traceStyle");
        ImageView done2 = this.mBinding.M.C;
        Intrinsics.checkNotNullExpressionValue(done2, "done");
        ConstraintLayout editPanel2 = this.mBinding.B;
        Intrinsics.checkNotNullExpressionValue(editPanel2, "editPanel");
        SwitchStyleHolder switchStyleHolder3 = new SwitchStyleHolder(baseActivity2, map2, traceStyle, done2, editPanel2, false, this.traceStyleResModeLiveData, this.mapStyleChangeCallback);
        this.traceStyleHolder = switchStyleHolder3;
        switchStyleHolder3.initHolder();
        ImageView imageView = this.backBtn;
        if (imageView != null) {
            ViewExtKt.clickWithTrigger$default(imageView, 0L, new Function1() { // from class: mro
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SwitchMapPanelHolder.initHolder$lambda$1(this.f27139a, (ImageView) obj);
                }
            }, 1, null);
        }
        ImageView imageView2 = this.mBinding.M.C;
        if (imageView2 != null) {
            ViewExtKt.clickWithTrigger$default(imageView2, 0L, new Function1() { // from class: nro
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SwitchMapPanelHolder.initHolder$lambda$2(this.f28301a, (ImageView) obj);
                }
            }, 1, null);
        }
        ViewExtKt.clickWithTrigger$default(this.mBinding.M.C, 0L, new Function1() { // from class: oro
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SwitchMapPanelHolder.initHolder$lambda$3(this.f29634a, (ImageView) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: isDefaultMapStyle, reason: from getter */
    public final boolean getIsDefaultMapStyle() {
        return this.isDefaultMapStyle;
    }

    public final void setDefaultMapStyle(boolean z) {
        this.isDefaultMapStyle = z;
    }

    public final void setMapStyleChangeCallback(@NotNull Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.mapStyleChangeCallback = function1;
    }

    public final void setOnTraceStyleItemClickCallback(@NotNull Function1<? super Integer, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        SwitchStyleHolder switchStyleHolder = this.traceStyleHolder;
        if (switchStyleHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("traceStyleHolder");
            switchStyleHolder = null;
        }
        switchStyleHolder.initAdapterOnClickCallback(callback);
    }
}
