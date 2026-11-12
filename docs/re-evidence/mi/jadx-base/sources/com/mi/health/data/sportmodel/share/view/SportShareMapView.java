package com.mi.health.data.sportmodel.share.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.Point;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import coil.request.Disposable;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.maps.AMap;
import com.amap.api.maps.Projection;
import com.amap.api.maps.TextureMapView;
import com.amap.api.maps.UiSettings;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.CustomMapStyleOptions;
import com.amap.api.maps.model.GroundOverlayOptions;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.PolylineOptions;
import com.mi.health.data.sportmodel.share.view.SportShareMapView;
import com.mi.health.map.data.GpsValues;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.commonbase.data.sportmodel.util.MarkerParamsUtilKt;
import com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView;
import defpackage.ali;
import defpackage.bmh;
import defpackage.emh;
import defpackage.l5;
import defpackage.lqi;
import defpackage.nyc;
import defpackage.qti;
import defpackage.vmi;
import defpackage.x44;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 _2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001_B!\u0012\u0006\u0010:\u001a\u000209\u0012\b\u0010X\u001a\u0004\u0018\u00010W\u0012\u0006\u0010Y\u001a\u000203¢\u0006\u0004\bZ\u0010[B\u0011\b\u0016\u0012\u0006\u0010\\\u001a\u000209¢\u0006\u0004\bZ\u0010]B\u001b\b\u0016\u0012\u0006\u0010\\\u001a\u000209\u0012\b\u0010X\u001a\u0004\u0018\u00010W¢\u0006\u0004\bZ\u0010^J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\u0005J\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0005J\u000f\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0005J-\u0010\u0017\u001a\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u001d\u0010\u0005J\u0019\u0010 \u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\"\u0010\u0005J\u0017\u0010$\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u001eH\u0016¢\u0006\u0004\b$\u0010!J\u000f\u0010%\u001a\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010\u0005J\u000f\u0010&\u001a\u00020\u0003H\u0016¢\u0006\u0004\b&\u0010\u0005J\u000f\u0010'\u001a\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010\u0005J\u0015\u0010)\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0015¢\u0006\u0004\b)\u0010*J)\u00100\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010/\u001a\u00020\u0015¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\u0003¢\u0006\u0004\b2\u0010\u0005J\u0015\u00105\u001a\u00020\u00032\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0003¢\u0006\u0004\b7\u0010\u0005J\r\u00108\u001a\u00020\u0003¢\u0006\u0004\b8\u0010\u0005R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010<\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00130A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\f0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010CR\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010ER\u0018\u0010F\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010/\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010HR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010IR\u0016\u0010K\u001a\u0004\u0018\u00010J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020N0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001c\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Q0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010V\u001a\u0004\u0018\u00010\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bT\u0010U¨\u0006`"}, d2 = {"Lcom/mi/health/data/sportmodel/share/view/SportShareMapView;", "Lcom/xiaomi/fitness/commonbase/data/sportmodel/view/BaseMapView;", "Lcom/amap/api/maps/TextureMapView;", "", "initView", "()V", "showPathMarker", "setGroundOverlay", "showPath", "createDataList", "initStyles", "initMapSetting", "Lbmh;", "pathRecord", "createOptimizePath", "(Lbmh;)V", "showStartMarker", "showEndMarker", "", "Lcom/amap/api/maps/model/LatLng;", "points", "", "dottedLine", "buildLine", "(Ljava/util/List;Lbmh;Z)V", "Lnyc;", "iShareMapView", "setIShareMapView", "(Lnyc;)V", "onFinishInflate", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "onCreate", "(Landroid/os/Bundle;)V", LifecycleConstantKt.ON_RESUME, "outState", "onSaveInstanceState", LifecycleConstantKt.ON_PAUSE, LifecycleConstantKt.ON_DESTROY, "onLowMemory", "normal", "setMapStyle", "(Z)V", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sportValues", "Lcom/mi/health/map/data/GpsValues;", "gpsValues", "isTriathlon", "bindData", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;Lcom/mi/health/map/data/GpsValues;Z)V", "saveSharePic", "", CommonConstants.KEY_SESSION, "shareToWX", "(I)V", "shareViaMore", "showEmptyView", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "mMapView", "Lcom/amap/api/maps/TextureMapView;", "Lcom/amap/api/maps/AMap;", "mAMap", "Lcom/amap/api/maps/AMap;", "", "mOriginalList", "Ljava/util/List;", "mPathRecordList", "Lcom/mi/health/map/data/GpsValues;", "mSportValues", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "Z", "Lnyc;", "Lcoil/request/Disposable;", "styleDisposable", "Lcoil/request/Disposable;", "", "", "styleIds", "[Ljava/lang/String;", "Lcom/amap/api/maps/model/CustomMapStyleOptions;", "styles", "[Lcom/amap/api/maps/model/CustomMapStyleOptions;", "getMapView", "()Lcom/amap/api/maps/TextureMapView;", "mapView", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "context", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "map-amap_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SportShareMapView extends BaseMapView<TextureMapView> {
    public static final int LATLNG_MARGINS = 200;

    @NotNull
    private static final String TAG = "SportShareMapView";
    public static final int TRACE_WIDTH = 6;

    @Nullable
    private GpsValues gpsValues;

    @Nullable
    private nyc iShareMapView;
    private boolean isTriathlon;

    @Nullable
    private AMap mAMap;

    @NotNull
    private final Context mContext;

    @Nullable
    private TextureMapView mMapView;

    @NotNull
    private final List<LatLng> mOriginalList;

    @NotNull
    private final List<bmh> mPathRecordList;

    @Nullable
    private SportBasicReport mSportValues;

    @Nullable
    private final Disposable styleDisposable;

    @NotNull
    private final String[] styleIds;

    @NotNull
    private final CustomMapStyleOptions[] styles;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportShareMapView(@NotNull Context mContext, @Nullable AttributeSet attributeSet, int i) {
        super(mContext, attributeSet, i);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.mContext = mContext;
        this.mOriginalList = new ArrayList();
        this.mPathRecordList = new ArrayList();
        String[] strArr = {"a5da16961586e01813ec1b9fb845ef55", ""};
        this.styleIds = strArr;
        this.styles = new CustomMapStyleOptions[strArr.length];
        AMapLocationClient.updatePrivacyShow(AppUtil.getApp(), true, true);
        AMapLocationClient.updatePrivacyAgree(AppUtil.getApp(), true);
        LayoutInflater.from(mContext).inflate(qti.d, this);
    }

    public static final /* synthetic */ nyc access$getIShareMapView$p(SportShareMapView sportShareMapView) {
        sportShareMapView.getClass();
        return null;
    }

    private final void buildLine(List<LatLng> points, bmh pathRecord, boolean dottedLine) {
        int iDip2px = DisplayUtil.dip2px(6.0f);
        int iA = this.isTriathlon ? pathRecord.e : x44.a(ali.n);
        if (dottedLine) {
            AMap aMap = this.mAMap;
            Intrinsics.checkNotNull(aMap);
            aMap.addPolyline(new PolylineOptions().addAll(points).width(iDip2px).setDottedLine(false).zIndex(2.0f).color(x44.a(ali.f1176b)));
        } else {
            AMap aMap2 = this.mAMap;
            Intrinsics.checkNotNull(aMap2);
            aMap2.addPolyline(new PolylineOptions().addAll(points).width(iDip2px).useGradient(false).zIndex(2.0f).color(iA));
        }
    }

    private final void createDataList() {
        if (this.gpsValues != null) {
            if (this.mOriginalList.size() > 0) {
                this.mOriginalList.clear();
            }
            List<LatLng> list = this.mOriginalList;
            GpsValues gpsValues = this.gpsValues;
            Intrinsics.checkNotNull(gpsValues);
            List<LatLng> listS = l5.s(gpsValues.locationList);
            Intrinsics.checkNotNullExpressionValue(listS, "createLatLngList(...)");
            list.addAll(listS);
            if (this.mPathRecordList.size() > 0) {
                this.mPathRecordList.clear();
            }
            List<bmh> list2 = this.mPathRecordList;
            List<bmh> listC = emh.c(this.mSportValues, this.gpsValues, true);
            Intrinsics.checkNotNullExpressionValue(listC, "createPathRecordList(...)");
            list2.addAll(listC);
        }
    }

    private final void createOptimizePath(bmh pathRecord) {
        List<LatLng> listM = l5.m(pathRecord.f4369b);
        boolean z = pathRecord.f4368a == 1;
        Intrinsics.checkNotNull(listM);
        buildLine(listM, pathRecord, z);
    }

    private final void initMapSetting() {
        if (this.mAMap == null) {
            TextureMapView textureMapView = this.mMapView;
            Intrinsics.checkNotNull(textureMapView);
            AMap map = textureMapView.getMap();
            this.mAMap = map;
            if (map != null) {
                map.setMyLocationEnabled(false);
            }
            AMap aMap = this.mAMap;
            UiSettings uiSettings = aMap != null ? aMap.getUiSettings() : null;
            if (uiSettings != null) {
                uiSettings.setMyLocationButtonEnabled(false);
            }
            if (uiSettings != null) {
                uiSettings.setZoomControlsEnabled(false);
            }
            if (uiSettings != null) {
                uiSettings.setAllGesturesEnabled(false);
            }
            if (uiSettings != null) {
                uiSettings.setLogoBottomMargin(-80);
            }
        }
    }

    private final void initStyles() {
        String[] strArr = this.styleIds;
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            CustomMapStyleOptions customMapStyleOptions = new CustomMapStyleOptions();
            customMapStyleOptions.setEnable(true ^ StringsKt__StringsKt.isBlank(str));
            customMapStyleOptions.setStyleId(str);
            this.styles[i] = customMapStyleOptions;
        }
        setMapStyle(true);
    }

    private final void initView() {
        this.mMapView = (TextureMapView) findViewById(lqi.f25355b);
        initMapSetting();
        initStyles();
    }

    private final void setGroundOverlay() {
        LatLng latLngX = l5.x(this.mOriginalList);
        AMap aMap = this.mAMap;
        Intrinsics.checkNotNull(aMap);
        aMap.addGroundOverlay(new GroundOverlayOptions().position(latLngX, 10000.0f, 10000.0f).image(BitmapDescriptorFactory.fromResource(vmi.f37030a)).zIndex(1.0f).transparency(0.9f));
    }

    private final void showEndMarker() {
        l5.C(this.mContext, this.mAMap, this.mOriginalList, null, MarkerParamsUtilKt.INSTANCE.createCircleEndMarkerParams(12, 12, 3));
    }

    private final void showPath() {
        if (this.mPathRecordList.size() <= 0) {
            showEmptyView();
            return;
        }
        int size = this.mPathRecordList.size();
        for (int i = 0; i < size; i++) {
            createOptimizePath(this.mPathRecordList.get(i));
        }
    }

    private final void showPathMarker() {
        l5.z(this.mAMap, this.mOriginalList, 200);
        setGroundOverlay();
        showStartMarker();
        showPath();
        showEndMarker();
        TextureMapView textureMapView = this.mMapView;
        Intrinsics.checkNotNull(textureMapView);
        textureMapView.postDelayed(new Runnable() { // from class: a1o
            @Override // java.lang.Runnable
            public final void run() {
                SportShareMapView.showPathMarker$lambda$0(this.f532a);
            }
        }, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPathMarker$lambda$0(SportShareMapView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AMap aMap = this$0.mAMap;
        Intrinsics.checkNotNull(aMap);
        Projection projection = aMap.getProjection();
        Path path = new Path();
        int size = this$0.mOriginalList.size();
        for (int i = 0; i < size; i++) {
            Point screenLocation = projection.toScreenLocation(this$0.mOriginalList.get(i));
            if (i == 0) {
                path.moveTo(screenLocation.x, screenLocation.y);
            } else {
                path.lineTo(screenLocation.x, screenLocation.y);
            }
        }
    }

    private final void showStartMarker() {
        l5.D(this.mContext, this.mAMap, this.mOriginalList, null, MarkerParamsUtilKt.INSTANCE.createCircleStartMarkerParams(12, 12, 3));
    }

    public final void bindData(@Nullable SportBasicReport sportValues, @Nullable GpsValues gpsValues, boolean isTriathlon) {
        this.mSportValues = sportValues;
        this.gpsValues = gpsValues;
        this.isTriathlon = isTriathlon;
        createDataList();
        showPathMarker();
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onCreate(@Nullable Bundle bundle) {
        Logger.d(TAG, "onCreate");
        TextureMapView mapView = getMapView();
        Intrinsics.checkNotNull(mapView);
        mapView.onCreate(bundle);
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onDestroy() {
        Logger.d(TAG, LifecycleConstantKt.ON_DESTROY);
        TextureMapView mapView = getMapView();
        Intrinsics.checkNotNull(mapView);
        mapView.onDestroy();
        Disposable disposable = this.styleDisposable;
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        this.styleDisposable.dispose();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        initView();
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onLowMemory() {
        Logger.d(TAG, "onLowMemory");
        TextureMapView mapView = getMapView();
        Intrinsics.checkNotNull(mapView);
        mapView.onLowMemory();
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onPause() {
        Logger.d(TAG, LifecycleConstantKt.ON_PAUSE);
        TextureMapView mapView = getMapView();
        Intrinsics.checkNotNull(mapView);
        mapView.onPause();
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onResume() {
        Logger.d(TAG, LifecycleConstantKt.ON_RESUME);
        TextureMapView mapView = getMapView();
        Intrinsics.checkNotNull(mapView);
        mapView.onResume();
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        TextureMapView mapView = getMapView();
        Intrinsics.checkNotNull(mapView);
        mapView.onSaveInstanceState(outState);
        Logger.d(TAG, "onSaveInstanceState");
    }

    public final void saveSharePic() {
        l5.z(this.mAMap, this.mOriginalList, 200);
        AMap aMap = this.mAMap;
        Intrinsics.checkNotNull(aMap);
        aMap.getMapScreenShot(new AMap.OnMapScreenShotListener() { // from class: com.mi.health.data.sportmodel.share.view.SportShareMapView.saveSharePic.1
            @Override // com.amap.api.maps.AMap.OnMapScreenShotListener
            public void onMapScreenShot(Bitmap bitmap) {
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            }

            @Override // com.amap.api.maps.AMap.OnMapScreenShotListener
            public void onMapScreenShot(Bitmap bitmap, int status) {
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                SportShareMapView.access$getIShareMapView$p(SportShareMapView.this);
            }
        });
    }

    public final void setIShareMapView(@Nullable nyc iShareMapView) {
    }

    public final void setMapStyle(boolean normal) {
        AMap aMap = this.mAMap;
        Intrinsics.checkNotNull(aMap);
        aMap.setCustomMapStyle(this.styles[!normal ? 1 : 0]);
    }

    public final void shareToWX(final int session) {
        l5.z(this.mAMap, this.mOriginalList, 200);
        AMap aMap = this.mAMap;
        Intrinsics.checkNotNull(aMap);
        aMap.getMapScreenShot(new AMap.OnMapScreenShotListener() { // from class: com.mi.health.data.sportmodel.share.view.SportShareMapView.shareToWX.1
            @Override // com.amap.api.maps.AMap.OnMapScreenShotListener
            public void onMapScreenShot(Bitmap bitmap) {
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            }

            @Override // com.amap.api.maps.AMap.OnMapScreenShotListener
            public void onMapScreenShot(Bitmap bitmap, int status) {
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                SportShareMapView.access$getIShareMapView$p(SportShareMapView.this);
            }
        });
    }

    public final void shareViaMore() {
        l5.z(this.mAMap, this.mOriginalList, 200);
        AMap aMap = this.mAMap;
        Intrinsics.checkNotNull(aMap);
        aMap.getMapScreenShot(new AMap.OnMapScreenShotListener() { // from class: com.mi.health.data.sportmodel.share.view.SportShareMapView.shareViaMore.1
            @Override // com.amap.api.maps.AMap.OnMapScreenShotListener
            public void onMapScreenShot(Bitmap bitmap) {
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            }

            @Override // com.amap.api.maps.AMap.OnMapScreenShotListener
            public void onMapScreenShot(Bitmap bitmap, int status) {
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                SportShareMapView.access$getIShareMapView$p(SportShareMapView.this);
            }
        });
    }

    public final void showEmptyView() {
        setMapStyle(false);
        AMap aMap = this.mAMap;
        Intrinsics.checkNotNull(aMap);
        aMap.getUiSettings().setAllGesturesEnabled(false);
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    @Nullable
    public TextureMapView getMapView() {
        if (this.mMapView == null) {
            Logger.d(TAG, "getMapView");
            initView();
        }
        return this.mMapView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SportShareMapView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SportShareMapView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
