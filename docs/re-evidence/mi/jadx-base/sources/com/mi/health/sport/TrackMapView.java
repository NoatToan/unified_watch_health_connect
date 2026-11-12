package com.mi.health.sport;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.amap.api.maps.AMap;
import com.amap.api.maps.CameraUpdateFactory;
import com.amap.api.maps.MapView;
import com.amap.api.maps.UiSettings;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.CustomMapStyleOptions;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.PolylineOptions;
import com.mi.health.map.data.sportmodel.share.IShareMapLongView;
import com.mi.health.utils.MapUtilsKt;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.fitness.parser.sport.track.parser.CommonTrackData;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView;
import defpackage.ali;
import defpackage.lqi;
import defpackage.qti;
import defpackage.vmi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\fB\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\rJ\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u001cH\u0014J\b\u0010\"\u001a\u00020\u001cH\u0002J\u0012\u0010#\u001a\u00020\u001c2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020\u001cH\u0016J\u0010\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020%H\u0016J\b\u0010)\u001a\u00020\u001cH\u0016J\b\u0010*\u001a\u00020\u001cH\u0016J\b\u0010+\u001a\u00020\u001cH\u0016J\u0010\u0010.\u001a\u00020\u001c2\b\u0010/\u001a\u0004\u0018\u000100J\u000e\u00103\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\bJ\b\u0010<\u001a\u00020\u001cH\u0002J\u000e\u0010=\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020?J\u0006\u0010E\u001a\u00020\u001cJ\u0006\u0010F\u001a\u00020\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R4\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010,\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0010R\u0012\u00101\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u00102R\u0016\u00105\u001a\b\u0012\u0004\u0012\u00020706X\u0082\u0004¢\u0006\u0004\n\u0002\u00108R\u0018\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:06X\u0082\u0004¢\u0006\u0004\n\u0002\u0010;R\u001e\u0010@\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006G"}, d2 = {"Lcom/mi/health/sport/TrackMapView;", "Lcom/xiaomi/fitness/commonbase/data/sportmodel/view/BaseMapView;", "Lcom/amap/api/maps/MapView;", "mContext", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "context", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mMapView", "getMMapView", "()Lcom/amap/api/maps/MapView;", "setMMapView", "(Lcom/amap/api/maps/MapView;)V", "value", "", "Lcom/xiaomi/fit/fitness/parser/sport/track/parser/CommonTrackData;", "locationList", "getLocationList", "()Ljava/util/List;", "setLocationList", "(Ljava/util/List;)V", "drawLine", "", "setStartAndEndMarker", "marker", "latLng", "Lcom/amap/api/maps/model/LatLng;", "onFinishInflate", "configMap", "onCreate", SdkContants.KEY_BUNDLE, "Landroid/os/Bundle;", LifecycleConstantKt.ON_RESUME, "onSaveInstanceState", "outState", LifecycleConstantKt.ON_PAUSE, LifecycleConstantKt.ON_DESTROY, "onLowMemory", "mapView", "getMapView", "setIShareMapView", "iShareMapLongView", "Lcom/mi/health/map/data/sportmodel/share/IShareMapLongView;", "currentMapStyle", "Ljava/lang/Integer;", "loadMapStyle", "style", "styleIds", "", "", "[Ljava/lang/String;", "styles", "Lcom/amap/api/maps/model/CustomMapStyleOptions;", "[Lcom/amap/api/maps/model/CustomMapStyleOptions;", "initStyles", "setMapStyle", "normal", "", "mMapStyle", "getMMapStyle", "()Ljava/lang/Integer;", "setMMapStyle", "(Ljava/lang/Integer;)V", "saveMapStyle", "recoverMapSetting", "map-amap_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTrackMapView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrackMapView.kt\ncom/mi/health/sport/TrackMapView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,208:1\n1557#2:209\n1628#2,3:210\n*S KotlinDebug\n*F\n+ 1 TrackMapView.kt\ncom/mi/health/sport/TrackMapView\n*L\n58#1:209\n58#1:210,3\n*E\n"})
public final class TrackMapView extends BaseMapView<MapView> {

    @Nullable
    private Integer currentMapStyle;

    @Nullable
    private List<CommonTrackData> locationList;

    @NotNull
    private final Context mContext;

    @Nullable
    private Integer mMapStyle;

    @NotNull
    private MapView mMapView;

    @NotNull
    private final String[] styleIds;

    @NotNull
    private final CustomMapStyleOptions[] styles;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackMapView(@NotNull Context mContext, @Nullable AttributeSet attributeSet, int i) {
        super(mContext, attributeSet, i);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.mContext = mContext;
        this.mMapView = (MapView) LayoutInflater.from(getContext()).inflate(qti.h, this).findViewById(lqi.c);
        configMap();
        this.currentMapStyle = 1;
        String[] strArr = UIUtils.isNightMode(mContext) ? new String[]{"a5da16961586e01813ec1b9fb845ef55", ""} : new String[]{"", ""};
        this.styleIds = strArr;
        this.styles = new CustomMapStyleOptions[strArr.length];
        this.mMapStyle = 1;
    }

    private final void configMap() {
        AMap map = this.mMapView.getMap();
        map.setMapType(UIUtils.isNightMode(ApplicationExtKt.getApplication()) ? 3 : 1);
        UiSettings uiSettings = map.getUiSettings();
        uiSettings.setZoomControlsEnabled(false);
        uiSettings.setCompassEnabled(false);
        uiSettings.setCompassEnabled(false);
        uiSettings.setRotateGesturesEnabled(true);
        uiSettings.setTiltGesturesEnabled(false);
        map.moveCamera(CameraUpdateFactory.zoomTo(15.0f));
    }

    private final void drawLine() {
        List<CommonTrackData> list = this.locationList;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            if (list.isEmpty()) {
                return;
            }
            LatLngBounds.Builder builder = LatLngBounds.builder();
            List<CommonTrackData> list2 = this.locationList;
            IntRange indices = list2 != null ? CollectionsKt__CollectionsKt.getIndices(list2) : null;
            Intrinsics.checkNotNull(indices);
            int first = indices.getFirst();
            int last = indices.getLast();
            if (first <= last) {
                while (true) {
                    List<CommonTrackData> list3 = this.locationList;
                    Intrinsics.checkNotNull(list3);
                    double latitude = list3.get(first).getLatitude();
                    List<CommonTrackData> list4 = this.locationList;
                    Intrinsics.checkNotNull(list4);
                    builder.include(new LatLng(latitude, list4.get(first).getLongitude()));
                    if (first == last) {
                        break;
                    } else {
                        first++;
                    }
                }
            }
            this.mMapView.getMap().moveCamera(CameraUpdateFactory.newLatLngBounds(builder.build(), 150));
            List<CommonTrackData> list5 = this.locationList;
            Intrinsics.checkNotNull(list5);
            List<List<LatLng>> listConvertCommonTrackToLatLngs = MapUtilsKt.convertCommonTrackToLatLngs(list5);
            if (listConvertCommonTrackToLatLngs.isEmpty()) {
                return;
            }
            int color = ApplicationExtKt.getApplication().getResources().getColor(ali.f1175a, null);
            setStartAndEndMarker(vmi.g, (LatLng) CollectionsKt___CollectionsKt.first((List) CollectionsKt___CollectionsKt.first((List) listConvertCommonTrackToLatLngs)));
            setStartAndEndMarker(vmi.f, (LatLng) CollectionsKt___CollectionsKt.last((List) CollectionsKt___CollectionsKt.last((List) listConvertCommonTrackToLatLngs)));
            List<List<LatLng>> list6 = listConvertCommonTrackToLatLngs;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
            Iterator<T> it = list6.iterator();
            while (it.hasNext()) {
                List list7 = (List) it.next();
                if (!list7.isEmpty()) {
                    this.mMapView.getMap().addPolyline(new PolylineOptions().addAll(list7).width(ExtUtilsKt.getDp(3)).color(color));
                }
                arrayList.add(Unit.INSTANCE);
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

    private final void setStartAndEndMarker(int marker, LatLng latLng) {
        getMapView().getMap().addMarker(new MarkerOptions().position(latLng).icon(BitmapDescriptorFactory.fromBitmap(BitmapFactory.decodeResource(getResources(), marker))));
    }

    @Nullable
    public final List<CommonTrackData> getLocationList() {
        return this.locationList;
    }

    @Nullable
    public final Integer getMMapStyle() {
        return this.mMapStyle;
    }

    @NotNull
    public final MapView getMMapView() {
        return this.mMapView;
    }

    public final void loadMapStyle(int style) {
        if (style != 2) {
            if (style != 3) {
                AMap map = getMapView().getMap();
                if (map != null) {
                    map.showMapText(true);
                }
                getMapView().getMap().setMapType(UIUtils.isNightMode(ApplicationExtKt.getApplication()) ? 3 : 1);
                CustomMapStyleOptions customMapStyleOptions = new CustomMapStyleOptions();
                customMapStyleOptions.setEnable(false);
                AMap map2 = getMapView().getMap();
                if (map2 != null) {
                    map2.setCustomMapStyle(customMapStyleOptions);
                }
            } else {
                AMap map3 = getMapView().getMap();
                if (map3 != null) {
                    map3.showMapText(false);
                }
                getMapView().getMap().setMapType(UIUtils.isNightMode(ApplicationExtKt.getApplication()) ? 3 : 1);
                CustomMapStyleOptions customMapStyleOptions2 = new CustomMapStyleOptions();
                customMapStyleOptions2.setEnable(false);
                AMap map4 = getMapView().getMap();
                if (map4 != null) {
                    map4.setCustomMapStyle(customMapStyleOptions2);
                }
            }
        } else {
            AMap map5 = this.mMapView.getMap();
            Intrinsics.checkNotNull(map5);
            map5.setMapType(2);
        }
        this.currentMapStyle = Integer.valueOf(style);
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onCreate(@Nullable Bundle bundle) {
        this.mMapView.onCreate(bundle);
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onDestroy() {
        this.mMapView.onDestroy();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        initStyles();
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onLowMemory() {
        this.mMapView.onLowMemory();
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onPause() {
        this.mMapView.onPause();
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onResume() {
        this.mMapView.onResume();
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        this.mMapView.onSaveInstanceState(outState);
    }

    public final void recoverMapSetting() {
        Integer num = this.mMapStyle;
        loadMapStyle(num != null ? num.intValue() : 1);
    }

    public final void saveMapStyle() {
        this.mMapStyle = this.currentMapStyle;
    }

    public final void setIShareMapView(@Nullable IShareMapLongView iShareMapLongView) {
    }

    public final void setLocationList(@Nullable List<CommonTrackData> list) {
        this.locationList = list;
        drawLine();
    }

    public final void setMMapStyle(@Nullable Integer num) {
        this.mMapStyle = num;
    }

    public final void setMMapView(@NotNull MapView mapView) {
        Intrinsics.checkNotNullParameter(mapView, "<set-?>");
        this.mMapView = mapView;
    }

    public final void setMapStyle(boolean normal) {
        AMap map = getMapView().getMap();
        if (map != null) {
            map.setCustomMapStyle(this.styles[!normal ? 1 : 0]);
        }
    }

    @Override // com.xiaomi.fitness.commonbase.data.sportmodel.view.BaseMapView
    @NotNull
    public MapView getMapView() {
        return this.mMapView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrackMapView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrackMapView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
