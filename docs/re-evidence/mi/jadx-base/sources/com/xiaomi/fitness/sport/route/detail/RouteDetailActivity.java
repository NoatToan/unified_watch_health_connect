package com.xiaomi.fitness.sport.route.detail;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.c;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.maps.AMap;
import com.amap.api.maps.MapView;
import com.amap.api.maps.model.CustomMapStyleOptions;
import com.amap.api.maps.model.LatLng;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.divider.MaterialDivider;
import com.mi.health.sport.TrackShareRoutineView;
import com.mi.health.utils.MapUtilsKt;
import com.xiaomi.accountsdk.request.NetworkUtils;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.sport.track.parser.CommonTrackData;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport.route.detail.RouteDetailActivity;
import com.xiaomi.fitness.sport.route.detail.holder.BottomSheetHolder;
import com.xiaomi.fitness.sport.route.detail.holder.RouteInfoGroupHolder;
import com.xiaomi.fitness.sport.route.detail.holder.TabLayoutHolder;
import com.xiaomi.fitness.sport.route.detail.model.RankInfo;
import com.xiaomi.fitness.sport.route.detail.util.RouteDetailExtKt;
import com.xiaomi.fitness.sport.utils.SportBeanHelperExtKt;
import com.xiaomi.fitness.sport.view.viewmodel.RunningRouteDetailViewModel;
import com.xiaomi.fitness.sport_export.RouteConstantsKt;
import com.xiaomi.fitness.sport_export.data.RouteInfo;
import com.xiaomi.fitness.sport_export.data.StartPoint;
import com.xiaomi.fitness.sport_manager_export.SportRouterKt;
import defpackage.c1j;
import defpackage.dvi;
import defpackage.eoi;
import defpackage.o7h;
import defpackage.ozn;
import defpackage.rbd;
import defpackage.szn;
import defpackage.uzn;
import defpackage.yzn;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Route(path = SportRouterKt.ROUTE_DETAIL)
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 H2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001HB\t\b\u0007¢\u0006\u0004\bG\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J!\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0006J\u0019\u0010\u0017\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u0017\u0010\fJ\u000f\u0010\u0018\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0019\u0010\u0006J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001b\u0010\fJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001c\u0010\u0006R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00105\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00101R\u001e\u00106\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010.R\u001d\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0004098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00020\u0004098\u0006¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010=R\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020\u0004098\u0006¢\u0006\f\n\u0004\b@\u0010;\u001a\u0004\bA\u0010=R\u0014\u0010D\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010C¨\u0006I"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/RouteDetailActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/sport/view/viewmodel/RunningRouteDetailViewModel;", "Luzn;", "", "initParams", "()V", "setCustomMapStyle", "initRouteInfoGroupHolder", "Landroid/os/Bundle;", "savedInstanceState", "initMap", "(Landroid/os/Bundle;)V", "initTabLayoutHolder", "initBottomSheetHolder", "initBasicUi", "", "Lcom/xiaomi/fit/fitness/parser/sport/track/parser/CommonTrackData;", "tracks", "Landroid/graphics/Bitmap;", "buildBitmap", "(Ljava/util/List;)Landroid/graphics/Bitmap;", "initNavigateBtn", "onCreate", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_PAUSE, "outState", "onSaveInstanceState", LifecycleConstantKt.ON_DESTROY, "Lcom/xiaomi/fitness/sport/route/detail/holder/BottomSheetHolder;", "bottomSheetHolder", "Lcom/xiaomi/fitness/sport/route/detail/holder/BottomSheetHolder;", "Lcom/xiaomi/fitness/sport/route/detail/holder/TabLayoutHolder;", "tabLayoutHolder", "Lcom/xiaomi/fitness/sport/route/detail/holder/TabLayoutHolder;", "Lcom/xiaomi/fitness/sport/route/detail/holder/RouteInfoGroupHolder;", "routeInfoGroupHolder", "Lcom/xiaomi/fitness/sport/route/detail/holder/RouteInfoGroupHolder;", "Lcom/amap/api/maps/MapView;", "mapView", "Lcom/amap/api/maps/MapView;", "Lcom/amap/api/maps/AMap;", "aMapWidget", "Lcom/amap/api/maps/AMap;", "", "routeId", "I", "", "traceFileUrl", "Ljava/lang/String;", "", "isCollected", "Z", "traceRawFileUrl", "trackList", "Ljava/util/List;", "mapCount", "Lkotlin/Function0;", "feedbackCallback", "Lkotlin/jvm/functions/Function0;", "getFeedbackCallback", "()Lkotlin/jvm/functions/Function0;", "collectListener", "getCollectListener", "sendToDeviceCallback", "getSendToDeviceCallback", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nRouteDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteDetailActivity.kt\ncom/xiaomi/fitness/sport/route/detail/RouteDetailActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,435:1\n1863#2,2:436\n*S KotlinDebug\n*F\n+ 1 RouteDetailActivity.kt\ncom/xiaomi/fitness/sport/route/detail/RouteDetailActivity\n*L\n391#1:436,2\n*E\n"})
public final class RouteDetailActivity extends Hilt_RouteDetailActivity<RunningRouteDetailViewModel, uzn> {
    public static final float MENU_CHANGE_BASE_OFFSET = 0.85f;
    public static final int RANKING_LIST_LIMIT = 30;

    @NotNull
    public static final String TAG = "RouteDetailActivity";

    @Nullable
    private AMap aMapWidget;

    @Nullable
    private BottomSheetHolder bottomSheetHolder;
    private boolean isCollected;
    private int mapCount;

    @Nullable
    private MapView mapView;
    private int routeId;

    @Nullable
    private RouteInfoGroupHolder routeInfoGroupHolder;

    @Nullable
    private TabLayoutHolder tabLayoutHolder;

    @Nullable
    private String traceFileUrl;

    @Nullable
    private String traceRawFileUrl;

    @Nullable
    private List<CommonTrackData> trackList;

    @NotNull
    private final Function0<Unit> feedbackCallback = new Function0() { // from class: nyk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RouteDetailActivity.feedbackCallback$lambda$12(this.f28570a);
        }
    };

    @NotNull
    private final Function0<Unit> collectListener = new Function0() { // from class: oyk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RouteDetailActivity.collectListener$lambda$13(this.f29824a);
        }
    };

    @NotNull
    private final Function0<Unit> sendToDeviceCallback = new Function0() { // from class: pyk
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RouteDetailActivity.sendToDeviceCallback$lambda$14(this.f30902a);
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ uzn access$getMBinding(RouteDetailActivity routeDetailActivity) {
        return (uzn) routeDetailActivity.getMBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ RunningRouteDetailViewModel access$getMViewModel(RouteDetailActivity routeDetailActivity) {
        return (RunningRouteDetailViewModel) routeDetailActivity.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Bitmap buildBitmap(List<CommonTrackData> tracks) {
        if (tracks == null) {
            return null;
        }
        AMap map = ((uzn) getMBinding()).J.getMap();
        ArrayList arrayList = new ArrayList();
        for (CommonTrackData commonTrackData : tracks) {
            Point screenLocation = map.getProjection().toScreenLocation(new LatLng(commonTrackData.getLatitude(), commonTrackData.getLongitude()));
            Location location = new Location();
            location.longitude = screenLocation.x;
            location.latitude = screenLocation.y;
            location.flagSegment = commonTrackData.getFlagSegment();
            ListExtKt.add(arrayList, location);
        }
        Path path = new Path();
        int size = arrayList.size();
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            Location location2 = (Location) arrayList.get(i2);
            if (i2 == i + 1) {
                path.moveTo((float) location2.longitude, (float) location2.latitude);
            } else {
                path.lineTo((float) location2.longitude, (float) location2.latitude);
            }
            if (location2.flagSegment) {
                i = i2;
            }
        }
        ((uzn) getMBinding()).R.setPath(path);
        TrackShareRoutineView trackShareRoutineView = ((uzn) getMBinding()).R;
        TrackShareRoutineView routineView = ((uzn) getMBinding()).R;
        Intrinsics.checkNotNullExpressionValue(routineView, "routineView");
        return trackShareRoutineView.createBitmap(routineView, ((uzn) getMBinding()).R.getWidth(), ((uzn) getMBinding()).R.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit collectListener$lambda$13(RouteDetailActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        NetUtil netUtil = NetUtil.INSTANCE;
        Context applicationContext = this$0.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        if (netUtil.getNetWorkAvailable(applicationContext)) {
            ((RunningRouteDetailViewModel) this$0.getMViewModel()).collectRoute(this$0.routeId, this$0.isCollected);
        } else {
            ToastUtil.INSTANCE.showToast(c1j.common_hint_network_unavailable);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit feedbackCallback$lambda$12(RouteDetailActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        UserFeedbackActivity.INSTANCE.goToRunningRouteFeedbackPage(this$0, this$0.routeId);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00ae  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void initBasicUi() {
        String did;
        boolean z;
        String did2;
        setActionBarDisplayable(false);
        CardView icBack = ((uzn) getMBinding()).G;
        Intrinsics.checkNotNullExpressionValue(icBack, "icBack");
        RouteDetailExtKt.listenOnClickWithPressEffect(icBack, new Function0() { // from class: jyk
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RouteDetailActivity.initBasicUi$lambda$9(this.f23248a);
            }
        });
        TextView feedback = ((uzn) getMBinding()).Q.F;
        Intrinsics.checkNotNullExpressionValue(feedback, "feedback");
        RouteDetailExtKt.listenOnClickWithPressEffect(feedback, this.feedbackCallback);
        ImageView icRouteCollect = ((uzn) getMBinding()).H;
        Intrinsics.checkNotNullExpressionValue(icRouteCollect, "icRouteCollect");
        RouteDetailExtKt.listenOnClickWithPressEffect(icRouteCollect, this.collectListener);
        ImageView icSendToDevice = ((uzn) getMBinding()).I;
        Intrinsics.checkNotNullExpressionValue(icSendToDevice, "icSendToDevice");
        RouteDetailExtKt.listenOnClickWithPressEffect(icSendToDevice, this.sendToDeviceCallback);
        TextView startRunningBtn = ((uzn) getMBinding()).S;
        Intrinsics.checkNotNullExpressionValue(startRunningBtn, "startRunningBtn");
        RouteDetailExtKt.listenOnClickWithPressEffect(startRunningBtn, new Function0() { // from class: kyk
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RouteDetailActivity.initBasicUi$lambda$11(this.f24424a);
            }
        });
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(companion);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        String str = "";
        if (wearableDeviceModel == null || (did = wearableDeviceModel.getDid()) == null) {
            did = "";
        }
        if ((deviceManagerExtKt.getDeviceCapability(did) & 134217728) == 0) {
            WearableDeviceManager deviceManagerExtKt2 = DeviceManagerExtKt.getInstance(companion);
            WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
            if (wearableDeviceModel2 != null && (did2 = wearableDeviceModel2.getDid()) != null) {
                str = did2;
            }
            if ((deviceManagerExtKt2.getDeviceCapabilityV2(str) & 4) != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        FitnessLogUtils.i(TAG, "isShowTrack:" + z);
        if (AppUtil.INSTANCE.isPlayChannel() || !z) {
            ImageView icSendToDevice2 = ((uzn) getMBinding()).I;
            Intrinsics.checkNotNullExpressionValue(icSendToDevice2, "icSendToDevice");
            ViewExtKt.setVisible(icSendToDevice2, false);
            MaterialDivider menuDivider = ((uzn) getMBinding()).K;
            Intrinsics.checkNotNullExpressionValue(menuDivider, "menuDivider");
            ViewExtKt.setVisible(menuDivider, false);
            return;
        }
        ImageView icSendToDevice3 = ((uzn) getMBinding()).I;
        Intrinsics.checkNotNullExpressionValue(icSendToDevice3, "icSendToDevice");
        ViewExtKt.setVisible(icSendToDevice3, true);
        MaterialDivider menuDivider2 = ((uzn) getMBinding()).K;
        Intrinsics.checkNotNullExpressionValue(menuDivider2, "menuDivider");
        ViewExtKt.setVisible(menuDivider2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initBasicUi$lambda$11(RouteDetailActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (((RunningRouteDetailViewModel) this$0.getMViewModel()).getCurtRouteInfoLiveData().getValue() != null) {
            boolean supportsSportBean = SportBeanHelperExtKt.getSupportsSportBean();
            RouteInfo value = ((RunningRouteDetailViewModel) this$0.getMViewModel()).getCurtRouteInfoLiveData().getValue();
            Intrinsics.checkNotNull(value);
            RouteDetailExtKt.launchOutdoorRunning(this$0, value, supportsSportBean ? 1 : 0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initBasicUi$lambda$9(RouteDetailActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.lambda$onCreate$0();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initBottomSheetHolder() {
        AppBarLayout appBarLayout = ((uzn) getMBinding()).B;
        ConstraintLayout bottomSheetPanel = ((uzn) getMBinding()).D;
        Intrinsics.checkNotNullExpressionValue(bottomSheetPanel, "bottomSheetPanel");
        AppCompatTextView noDataTv = ((uzn) getMBinding()).P.C;
        Intrinsics.checkNotNullExpressionValue(noDataTv, "noDataTv");
        RelativeLayout dragHandle = ((uzn) getMBinding()).E;
        Intrinsics.checkNotNullExpressionValue(dragHandle, "dragHandle");
        RelativeLayout startRunningTab = ((uzn) getMBinding()).T;
        Intrinsics.checkNotNullExpressionValue(startRunningTab, "startRunningTab");
        BottomSheetHolder bottomSheetHolder = new BottomSheetHolder(appBarLayout, bottomSheetPanel, noDataTv, dragHandle, startRunningTab, this);
        this.bottomSheetHolder = bottomSheetHolder;
        bottomSheetHolder.initBottomSheet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initMap(Bundle savedInstanceState) {
        ViewGroup.LayoutParams layoutParams;
        MapView mapView = ((uzn) getMBinding()).J;
        this.mapView = mapView;
        if (mapView != null) {
            mapView.onCreate(savedInstanceState);
        }
        MapView mapView2 = this.mapView;
        if (mapView2 != null && (layoutParams = mapView2.getLayoutParams()) != null) {
            layoutParams.height = (UIUtils.INSTANCE.getScreenHeight(this) - ExtUtilsKt.getDp(433)) + ExtUtilsKt.getDp(130);
        }
        MapView mapView3 = this.mapView;
        if (mapView3 != null) {
            mapView3.requestLayout();
        }
        MapView mapView4 = this.mapView;
        AMap map = mapView4 != null ? mapView4.getMap() : null;
        this.aMapWidget = map;
        if (map != null) {
            RouteDetailExtKt.configAMap(map);
        }
        setCustomMapStyle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initNavigateBtn() {
        yzn routeInfoSection = ((uzn) getMBinding()).Q;
        Intrinsics.checkNotNullExpressionValue(routeInfoSection, "routeInfoSection");
        ViewExtKt.clickWithTrigger$default(routeInfoSection.H, 0L, new Function1() { // from class: hyk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RouteDetailActivity.initNavigateBtn$lambda$17(this.f20611a, (AppCompatTextView) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initNavigateBtn$lambda$17(RouteDetailActivity this$0, AppCompatTextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        RouteInfo value = ((RunningRouteDetailViewModel) this$0.getMViewModel()).getCurtRouteInfoLiveData().getValue();
        StartPoint startPoint = value != null ? value.getStartPoint() : null;
        if (startPoint == null) {
            return Unit.INSTANCE;
        }
        Pair<Double, Double> pairConvertFromGps84ToMars = RouteDetailExtKt.convertFromGps84ToMars(startPoint.getLatitude(), startPoint.getLongitude());
        RouteDetailExtKt.showSelectMapDialogIfNeed(pairConvertFromGps84ToMars.getFirst().doubleValue(), pairConvertFromGps84ToMars.getSecond().doubleValue(), this$0);
        return Unit.INSTANCE;
    }

    private final void initParams() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }
        this.routeId = extras.getInt("route_id", 0);
        String string = extras.getString(RouteConstantsKt.KEY_TRACE_FILE_URL, null);
        this.traceFileUrl = string;
        Logger.d(TAG, "initParams routeId=" + this.routeId + " traceFileUrl=" + string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initRouteInfoGroupHolder() {
        yzn routeInfoSection = ((uzn) getMBinding()).Q;
        Intrinsics.checkNotNullExpressionValue(routeInfoSection, "routeInfoSection");
        this.routeInfoGroupHolder = new RouteInfoGroupHolder(this, routeInfoSection);
        ((RunningRouteDetailViewModel) getMViewModel()).getRouteDetailLiveData(this.routeId).observe(this, new RouteDetailActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: qyk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RouteDetailActivity.initRouteInfoGroupHolder$lambda$4(this.f31976a, (Pair) obj);
            }
        }));
        ((RunningRouteDetailViewModel) getMViewModel()).getRouteTrackLiveData().observe(this, new RouteDetailActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: fyk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RouteDetailActivity.initRouteInfoGroupHolder$lambda$5(this.f18378a, (List) obj);
            }
        }));
        ((RunningRouteDetailViewModel) getMViewModel()).getCollectRouteLiveData().observe(this, new RouteDetailActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: gyk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RouteDetailActivity.initRouteInfoGroupHolder$lambda$6(this.f19468a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x00ae  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initRouteInfoGroupHolder$lambda$4(RouteDetailActivity this$0, Pair pair) {
        String did;
        boolean z;
        String did2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (pair == null) {
            return Unit.INSTANCE;
        }
        RouteInfo routeInfo = (RouteInfo) pair.getFirst();
        ((RunningRouteDetailViewModel) this$0.getMViewModel()).getCurtRouteInfoLiveData().setValue(routeInfo);
        this$0.traceRawFileUrl = routeInfo.getKmlFile();
        RunningRouteDetailViewModel runningRouteDetailViewModel = (RunningRouteDetailViewModel) this$0.getMViewModel();
        String str = this$0.traceRawFileUrl;
        Intrinsics.checkNotNull(str);
        runningRouteDetailViewModel.getTraceRawData(str, routeInfo.getName(), routeInfo.getFileSuffix());
        RankInfo rankInfo = (RankInfo) pair.getSecond();
        RouteInfoGroupHolder routeInfoGroupHolder = this$0.routeInfoGroupHolder;
        if (routeInfoGroupHolder != null) {
            routeInfoGroupHolder.bindRouteInfo(routeInfo, rankInfo);
        }
        this$0.isCollected = routeInfo.isFavorite() == 1;
        ((uzn) this$0.getMBinding()).H.setImageResource(this$0.isCollected ? eoi.t : eoi.u);
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(companion);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
        String str2 = "";
        if (wearableDeviceModel == null || (did = wearableDeviceModel.getDid()) == null) {
            did = "";
        }
        if ((deviceManagerExtKt.getDeviceCapability(did) & 134217728) == 0) {
            WearableDeviceManager deviceManagerExtKt2 = DeviceManagerExtKt.getInstance(companion);
            WearableDeviceModel wearableDeviceModel2 = (WearableDeviceModel) DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel();
            if (wearableDeviceModel2 != null && (did2 = wearableDeviceModel2.getDid()) != null) {
                str2 = did2;
            }
            if ((deviceManagerExtKt2.getDeviceCapabilityV2(str2) & 4) != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        if (!AppUtil.INSTANCE.isPlayChannel() && z) {
            if (TextUtils.isEmpty(this$0.traceRawFileUrl)) {
                ImageView icSendToDevice = ((uzn) this$0.getMBinding()).I;
                Intrinsics.checkNotNullExpressionValue(icSendToDevice, "icSendToDevice");
                ViewExtKt.setVisible(icSendToDevice, false);
                MaterialDivider menuDivider = ((uzn) this$0.getMBinding()).K;
                Intrinsics.checkNotNullExpressionValue(menuDivider, "menuDivider");
                ViewExtKt.setVisible(menuDivider, false);
            } else {
                ImageView icSendToDevice2 = ((uzn) this$0.getMBinding()).I;
                Intrinsics.checkNotNullExpressionValue(icSendToDevice2, "icSendToDevice");
                ViewExtKt.setVisible(icSendToDevice2, true);
                MaterialDivider menuDivider2 = ((uzn) this$0.getMBinding()).K;
                Intrinsics.checkNotNullExpressionValue(menuDivider2, "menuDivider");
                ViewExtKt.setVisible(menuDivider2, true);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initRouteInfoGroupHolder$lambda$5(RouteDetailActivity this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (list == null) {
            return Unit.INSTANCE;
        }
        this$0.trackList = list;
        AMap aMap = this$0.aMapWidget;
        if (aMap != null) {
            RouteDetailExtKt.buildVisibleBoundsAndDrawTrace(aMap, list, ExtUtilsKt.getDp(100));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit initRouteInfoGroupHolder$lambda$6(RouteDetailActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            ToastUtil.showLongToast(this$0.getString(this$0.isCollected ? c1j.I3 : c1j.K3));
            this$0.isCollected = !this$0.isCollected;
            ((uzn) this$0.getMBinding()).H.setImageResource(this$0.isCollected ? eoi.t : eoi.u);
        } else {
            ToastUtil.showLongToast(this$0.getString(this$0.isCollected ? c1j.H3 : c1j.J3));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initTabLayoutHolder() {
        szn tabLayout = ((uzn) getMBinding()).U;
        Intrinsics.checkNotNullExpressionValue(tabLayout, "tabLayout");
        ozn rankingListContainer = ((uzn) getMBinding()).P;
        Intrinsics.checkNotNullExpressionValue(rankingListContainer, "rankingListContainer");
        TabLayoutHolder tabLayoutHolder = new TabLayoutHolder(this, tabLayout, rankingListContainer);
        this.tabLayoutHolder = tabLayoutHolder;
        tabLayoutHolder.initHolder();
        ((RunningRouteDetailViewModel) getMViewModel()).getRankingListLiveData(2, this.routeId, 30).observe(this, new RouteDetailActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: eyk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RouteDetailActivity.initTabLayoutHolder$lambda$7(this.f17194a, (Pair) obj);
            }
        }));
        ((RunningRouteDetailViewModel) getMViewModel()).getRankingListLiveData(1, this.routeId, 30).observe(this, new RouteDetailActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: iyk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RouteDetailActivity.initTabLayoutHolder$lambda$8(this.f22229a, (Pair) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initTabLayoutHolder$lambda$7(RouteDetailActivity this$0, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (pair == null) {
            return Unit.INSTANCE;
        }
        TabLayoutHolder tabLayoutHolder = this$0.tabLayoutHolder;
        if (tabLayoutHolder != null) {
            tabLayoutHolder.updatePunchInRankingList((RankInfo) pair.getFirst(), (List) pair.getSecond());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initTabLayoutHolder$lambda$8(RouteDetailActivity this$0, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (pair == null) {
            return Unit.INSTANCE;
        }
        TabLayoutHolder tabLayoutHolder = this$0.tabLayoutHolder;
        if (tabLayoutHolder != null) {
            tabLayoutHolder.updateGradeRankingList((RankInfo) pair.getFirst(), (List) pair.getSecond());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final WindowInsetsCompat onCreate$lambda$1(RouteDetailActivity this$0, View view, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        rbd rbdVarF = insets.f(WindowInsetsCompat.m.g());
        Intrinsics.checkNotNullExpressionValue(rbdVarF, "getInsets(...)");
        ((uzn) this$0.getMBinding()).A.setPaddingRelative(0, rbdVarF.f32379b, 0, 0);
        return WindowInsetsCompat.f2098b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendToDeviceCallback$lambda$14(RouteDetailActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CommonDialog commonDialogAddDialogCallback = new CommonDialog.c("send_to_device_dialog").setDialogTitle(c1j.R3).setDialogDescription(c1j.Q3).setPositiveText(c1j.h).setNegativeText(c1j.f).create().addDialogCallback(new RouteDetailActivity$sendToDeviceCallback$1$sendToDeviceDialog$1(this$0));
        Intrinsics.checkNotNullExpressionValue(commonDialogAddDialogCallback, "addDialogCallback(...)");
        commonDialogAddDialogCallback.show(this$0.getSupportFragmentManager(), "");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setCustomMapStyle() {
        if ((UIUtils.isNightMode(this) ? MapUtilsKt.MAP_STYLE_RES_ID_DARK_STYLE : null) == null) {
            return;
        }
        final CustomMapStyleOptions customMapStyleOptions = new CustomMapStyleOptions();
        customMapStyleOptions.setEnable(true);
        customMapStyleOptions.setStyleId(customMapStyleOptions.getStyleId());
        AMap map = ((uzn) getMBinding()).J.getMap();
        if (map != null) {
            map.setOnMapLoadedListener(new AMap.OnMapLoadedListener() { // from class: myk
                @Override // com.amap.api.maps.AMap.OnMapLoadedListener
                public final void onMapLoaded() {
                    RouteDetailActivity.setCustomMapStyle$lambda$3(this.f27350a, customMapStyleOptions);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setCustomMapStyle$lambda$3(RouteDetailActivity this$0, CustomMapStyleOptions customMapStyleOptions) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(customMapStyleOptions, "$customMapStyleOptions");
        AMap map = ((uzn) this$0.getMBinding()).J.getMap();
        if (map != null) {
            map.setCustomMapStyle(customMapStyleOptions);
        }
    }

    @NotNull
    public final Function0<Unit> getCollectListener() {
        return this.collectListener;
    }

    @NotNull
    public final Function0<Unit> getFeedbackCallback() {
        return this.feedbackCallback;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return dvi.V0;
    }

    @NotNull
    public final Function0<Unit> getSendToDeviceCallback() {
        return this.sendToDeviceCallback;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport.route.detail.Hilt_RouteDetailActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setDecorFitsSystemWindows(false);
        } else {
            Window window = getWindow();
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            window.getDecorView().setSystemUiVisibility(1280);
        }
        c.H0(getWindow().getDecorView(), new o7h() { // from class: lyk
            @Override // defpackage.o7h
            public final WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
                return RouteDetailActivity.onCreate$lambda$1(this.f25559a, view, windowInsetsCompat);
            }
        });
        AMapLocationClient.updatePrivacyShow(AppUtil.getApp(), true, true);
        AMapLocationClient.updatePrivacyAgree(AppUtil.getApp(), true);
        initBasicUi();
        initParams();
        initMap(savedInstanceState);
        if (!NetworkUtils.isNetworkConnected(this)) {
            ConstraintLayout noNetworkPanel = ((uzn) getMBinding()).M;
            Intrinsics.checkNotNullExpressionValue(noNetworkPanel, "noNetworkPanel");
            ViewExtKt.visible(noNetworkPanel);
            AppBarLayout bottomSheet = ((uzn) getMBinding()).B;
            Intrinsics.checkNotNullExpressionValue(bottomSheet, "bottomSheet");
            ViewExtKt.gone(bottomSheet);
            RelativeLayout startRunningTab = ((uzn) getMBinding()).T;
            Intrinsics.checkNotNullExpressionValue(startRunningTab, "startRunningTab");
            ViewExtKt.gone(startRunningTab);
            return;
        }
        ConstraintLayout noNetworkPanel2 = ((uzn) getMBinding()).M;
        Intrinsics.checkNotNullExpressionValue(noNetworkPanel2, "noNetworkPanel");
        ViewExtKt.gone(noNetworkPanel2);
        AppBarLayout bottomSheet2 = ((uzn) getMBinding()).B;
        Intrinsics.checkNotNullExpressionValue(bottomSheet2, "bottomSheet");
        ViewExtKt.visible(bottomSheet2);
        RelativeLayout startRunningTab2 = ((uzn) getMBinding()).T;
        Intrinsics.checkNotNullExpressionValue(startRunningTab2, "startRunningTab");
        ViewExtKt.visible(startRunningTab2);
        initNavigateBtn();
        initBottomSheetHolder();
        initTabLayoutHolder();
        initRouteInfoGroupHolder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport.route.detail.Hilt_RouteDetailActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        MapView mapView = this.mapView;
        if (mapView != null) {
            mapView.onDestroy();
        }
        ((RunningRouteDetailViewModel) getMViewModel()).getRouteTrackLiveData().removeObservers(this);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        MapView mapView = this.mapView;
        if (mapView != null) {
            mapView.onPause();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        MapView mapView = this.mapView;
        if (mapView != null) {
            mapView.onResume();
        }
    }

    @Override // miuix.appcompat.app.AppCompatActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        MapView mapView = this.mapView;
        if (mapView != null) {
            mapView.onSaveInstanceState(outState);
        }
    }
}
