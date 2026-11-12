package com.xiaomi.wearable.yrn.components.amap;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.miui.tsmclient.entity.CardUIInfo;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzerAlpha;
import com.xiaomi.wearable.yrn.components.TextProps;
import com.xiaomi.wearable.yrn.components.YRNComponentsExtKt;
import com.xiaomi.wearable.yrn.components.YRNComponentsUtils;
import defpackage.g9p;
import defpackage.iej;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b0\u00101J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b \u0010\bJ\u001f\u0010!\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010\bJ\u001b\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020#0\"H\u0016¢\u0006\u0004\b$\u0010%J+\u0010(\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u00122\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0012H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,H\u0014¢\u0006\u0004\b.\u0010/¨\u00063"}, d2 = {"Lcom/xiaomi/wearable/yrn/components/amap/YRNAMapViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/xiaomi/wearable/yrn/components/amap/YRNAMapView;", "view", "Lcom/facebook/react/bridge/ReadableMap;", "map", "", "startLocation", "(Lcom/xiaomi/wearable/yrn/components/amap/YRNAMapView;Lcom/facebook/react/bridge/ReadableMap;)V", "Lcom/facebook/react/bridge/ReadableArray;", "args", "safeGetMap", "(Lcom/facebook/react/bridge/ReadableArray;)Lcom/facebook/react/bridge/ReadableMap;", "safeGetArray", "(Lcom/facebook/react/bridge/ReadableArray;)Lcom/facebook/react/bridge/ReadableArray;", "Lcom/xiaomi/wearable/yrn/components/amap/ClusterData;", "safeParseMarkers", "(Lcom/facebook/react/bridge/ReadableMap;)Lcom/xiaomi/wearable/yrn/components/amap/ClusterData;", "", "key", "Lcom/xiaomi/wearable/yrn/components/amap/Coordinate;", "safeParseCoordinate", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Lcom/xiaomi/wearable/yrn/components/amap/Coordinate;", "Lcom/xiaomi/wearable/yrn/components/amap/MarkerProps;", "safeParseMarker", "(Lcom/facebook/react/bridge/ReadableMap;)Lcom/xiaomi/wearable/yrn/components/amap/MarkerProps;", "Lcom/xiaomi/wearable/yrn/components/amap/MarkerIcon;", "safeParseMarkerIcon", "(Lcom/facebook/react/bridge/ReadableMap;)Lcom/xiaomi/wearable/yrn/components/amap/MarkerIcon;", "Lcom/xiaomi/wearable/yrn/components/amap/MarkerExtraProps;", "safeParseMarkerExtra", "(Lcom/facebook/react/bridge/ReadableMap;)Lcom/xiaomi/wearable/yrn/components/amap/MarkerExtraProps;", "setUiSettings", "setMyLocationStyle", "", "", "getCommandsMap", "()Ljava/util/Map;", "root", "commandId", "receiveCommand", "(Lcom/xiaomi/wearable/yrn/components/amap/YRNAMapView;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "getName", "()Ljava/lang/String;", "Lg9p;", "reactContext", "createViewInstance", "(Lg9p;)Lcom/xiaomi/wearable/yrn/components/amap/YRNAMapView;", "<init>", "()V", "Companion", "components_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class YRNAMapViewManager extends SimpleViewManager<YRNAMapView> {
    private static final int COMMAND_ADD_MARKER = 16;
    private static final int COMMAND_ADD_MARKERS = 17;
    private static final int COMMAND_ANIMATE_CAMERA = 3;
    private static final int COMMAND_CLEAR_MAP = 5;
    private static final int COMMAND_MOVE_CAMERA = 2;
    private static final int COMMAND_REMOVE_CAMERA_CHANGE_LISTENER = 13;
    private static final int COMMAND_REMOVE_LOCATION_LISTENER = 11;
    private static final int COMMAND_REMOVE_MAP_LOADED_LISTENER = 15;
    private static final int COMMAND_RUN_ON_DRAW_FRAME = 7;
    private static final int COMMAND_SET_CAMERA_CHANGE_LISTENER = 12;
    private static final int COMMAND_SET_LOCATION_LISTENER = 10;
    private static final int COMMAND_SET_MAP_LOADED_LISTENER = 14;
    private static final int COMMAND_SET_MAP_STATUS_LIMIT = 8;
    private static final int COMMAND_SET_MAP_TYPE = 6;
    private static final int COMMAND_SET_MARKER_CLICK_LISTENER = 18;
    private static final int COMMAND_SET_TOUCH_POI_ENABLE = 9;
    private static final int COMMAND_START_LOCATION = 1;
    private static final int COMMAND_STOP_CAMERA = 4;

    @NotNull
    private static final String REACT_CLASS = "YRNAMapView";

    @NotNull
    private static final String TAG = "YRNAMapViewManager";

    private final ReadableArray safeGetArray(ReadableArray args) {
        if (args == null) {
            return null;
        }
        try {
            return args.getArray(0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private final ReadableMap safeGetMap(ReadableArray args) {
        if (args == null) {
            return null;
        }
        try {
            return args.getMap(0);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private final Coordinate safeParseCoordinate(ReadableMap map, String key) {
        if (map == null) {
            return new Coordinate(0.0d, 0.0d);
        }
        ReadableMap map2 = map.hasKey(key) ? map.getMap(key) : null;
        return map2 == null ? new Coordinate(0.0d, 0.0d) : new Coordinate(YRNComponentsExtKt.safeGetDouble(map2, "latitude", 0.0d), YRNComponentsExtKt.safeGetDouble(map2, "longitude", 0.0d));
    }

    private final MarkerProps safeParseMarker(ReadableMap map) {
        if (map == null) {
            return null;
        }
        return new MarkerProps(YRNComponentsExtKt.safeGetInt(map, "id", 0), safeParseCoordinate(map, "position"), safeParseMarkerIcon(map), YRNComponentsExtKt.safeGetDouble(map, "anchorU", 0.5d), YRNComponentsExtKt.safeGetDouble(map, "anchorV", 1.0d), YRNComponentsExtKt.safeGetBoolean(map, "isDraggable", false), YRNComponentsExtKt.safeGetBoolean(map, "isVisible", true), YRNComponentsExtKt.safeGetInt(map, "period", 20), YRNComponentsExtKt.safeGetBoolean(map, "isGps", false), YRNComponentsExtKt.safeGetDouble(map, "zIndex", 0.0d), YRNComponentsExtKt.safeGetDouble(map, SleepAnalyzerAlpha.NAME_ALPHA, 1.0d), YRNComponentsExtKt.safeGetDouble(map, "rotateAngle", 0.0d));
    }

    private final MarkerExtraProps safeParseMarkerExtra(ReadableMap map) {
        ReadableMap readableMapSafeGetMap = YRNComponentsExtKt.safeGetMap(map, "extra");
        if (readableMapSafeGetMap == null) {
            return null;
        }
        return new MarkerExtraProps(YRNComponentsExtKt.safeGetBoolean$default(readableMapSafeGetMap, "joined", false, 2, null));
    }

    private final MarkerIcon safeParseMarkerIcon(ReadableMap map) {
        ReadableMap readableMapSafeGetMap = YRNComponentsExtKt.safeGetMap(map, "icon");
        if (readableMapSafeGetMap == null) {
            return null;
        }
        String strSafeGetString$default = YRNComponentsExtKt.safeGetString$default(readableMapSafeGetMap, "title", null, 2, null);
        String str = strSafeGetString$default == null ? "" : strSafeGetString$default;
        YRNComponentsUtils yRNComponentsUtils = YRNComponentsUtils.INSTANCE;
        TextProps textPropsSafeParseText = yRNComponentsUtils.safeParseText(readableMapSafeGetMap, "titleStyle");
        String strSafeGetString$default2 = YRNComponentsExtKt.safeGetString$default(readableMapSafeGetMap, CardUIInfo.KEY_SUBTITILE, null, 2, null);
        TextProps textPropsSafeParseText2 = yRNComponentsUtils.safeParseText(readableMapSafeGetMap, "subTitleStyle");
        String strSafeGetString$default3 = YRNComponentsExtKt.safeGetString$default(readableMapSafeGetMap, "icon", null, 2, null);
        if (strSafeGetString$default3 == null) {
            strSafeGetString$default3 = "";
        }
        return new MarkerIcon(str, textPropsSafeParseText, strSafeGetString$default2, textPropsSafeParseText2, strSafeGetString$default3, safeParseMarkerExtra(readableMapSafeGetMap));
    }

    private final ClusterData safeParseMarkers(ReadableMap map) {
        ReadableArray readableArraySafeGetArray = YRNComponentsExtKt.safeGetArray(map, "children");
        if (readableArraySafeGetArray == null) {
            return null;
        }
        Coordinate coordinateSafeParseCoordinate = safeParseCoordinate(map, "position");
        ArrayList arrayList = new ArrayList();
        int size = readableArraySafeGetArray.size();
        for (int i = 0; i < size; i++) {
            ReadableMap map2 = readableArraySafeGetArray.getMap(i);
            if (map2 != null) {
                MarkerProps markerPropsSafeParseMarker = safeParseMarker(map2);
                Intrinsics.checkNotNull(markerPropsSafeParseMarker);
                arrayList.add(markerPropsSafeParseMarker);
            }
        }
        return new ClusterData(coordinateSafeParseCoordinate, arrayList.size(), arrayList);
    }

    private final void startLocation(YRNAMapView view, ReadableMap map) {
        String strSafeGetString;
        String str = "highAccuracy";
        if (map != null && (strSafeGetString = YRNComponentsExtKt.safeGetString(map, "locationMode", "highAccuracy")) != null) {
            str = strSafeGetString;
        }
        view.startLocation(new LocationOption(str, map != null ? YRNComponentsExtKt.safeGetInt(map, "interval", 2000) : VibrateModeProgressBar.sLongToLong, map != null ? YRNComponentsExtKt.safeGetBoolean(map, "isOnceLocation", false) : false, map != null ? YRNComponentsExtKt.safeGetBoolean(map, "isLocationCacheEnable", false) : false, map != null ? YRNComponentsExtKt.safeGetBoolean(map, "isNeedAddress", false) : false, map != null ? YRNComponentsExtKt.safeGetBoolean(map, "isGpsFirst", false) : false, map != null ? YRNComponentsExtKt.safeGetInt(map, "gpsFirstTimeout", 30000) : 3000L, map != null ? YRNComponentsExtKt.safeGetBoolean(map, "isSensorEnable", false) : false, map != null ? (float) YRNComponentsExtKt.safeGetDouble(map, "deviceModeDistanceFilter", 0.0d) : 0.0f));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public YRNAMapView createViewInstance(@NotNull g9p reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new YRNAMapView(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Integer> getCommandsMap() {
        return MapsKt__MapsKt.mutableMapOf(TuplesKt.to("startLocation", 1), TuplesKt.to("moveCamera", 2), TuplesKt.to("animateCamera", 3), TuplesKt.to("stopAnimation", 4), TuplesKt.to(CervicalMucusRecord.Appearance.CLEAR, 5), TuplesKt.to("setMapType", 6), TuplesKt.to("runOnDrawFrame", 7), TuplesKt.to("setMapStatusLimits", 8), TuplesKt.to("setTouchPoiEnable", 9), TuplesKt.to("setLocationListener", 10), TuplesKt.to("removeLocationListener", 11), TuplesKt.to("setOnCameraChangeListener", 12), TuplesKt.to("removeOnCameraChangeListener", 13), TuplesKt.to("setMapLoadedListener", 14), TuplesKt.to("removeMapLoadedListener", 15), TuplesKt.to("addMarker", 16), TuplesKt.to("addMarkers", 17), TuplesKt.to("setOnMarkerClickListener", 18));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @iej(name = "myLocationStyle")
    public final void setMyLocationStyle(@NotNull YRNAMapView view, @NotNull ReadableMap map) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(map, "map");
        double dSafeGetDouble = YRNComponentsExtKt.safeGetDouble(map, "anchorU", 0.5d);
        double dSafeGetDouble2 = YRNComponentsExtKt.safeGetDouble(map, "anchorV", 0.5d);
        String strSafeGetString$default = YRNComponentsExtKt.safeGetString$default(map, "myLocationIcon", null, 2, null);
        YRNComponentsUtils yRNComponentsUtils = YRNComponentsUtils.INSTANCE;
        view.setMyLocationStyle(new MyLocationProps(dSafeGetDouble, dSafeGetDouble2, strSafeGetString$default, YRNComponentsUtils.safeParseColor$default(yRNComponentsUtils, map, "radiusFillColor", null, 4, null), YRNComponentsUtils.safeParseColor$default(yRNComponentsUtils, map, "strokeColor", null, 4, null), Double.valueOf(YRNComponentsExtKt.safeGetDouble(map, "strokeWidth", 0.0d)), YRNComponentsExtKt.safeGetInt(map, "myLocationType", 0), YRNComponentsExtKt.safeGetBoolean(map, "showMyLocation", true)));
    }

    @iej(name = "uiSettings")
    public final void setUiSettings(@NotNull YRNAMapView view, @NotNull ReadableMap map) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(map, "map");
        view.setUiSettings(new YRNAMapProps(YRNComponentsExtKt.safeGetBoolean(map, "isZoomControlsEnabled", true), YRNComponentsExtKt.safeGetBoolean(map, "isCompassEnabled", true), YRNComponentsExtKt.safeGetBoolean(map, "isRotateGesturesEnabled", true), YRNComponentsExtKt.safeGetBoolean(map, "isZoomGesturesEnabled", true), YRNComponentsExtKt.safeGetBoolean(map, "isScrollGesturesEnabled", true), YRNComponentsExtKt.safeGetBoolean(map, "isTiltGesturesEnabled", true), map.hasKey("isAllGesturesEnabled") ? Boolean.valueOf(map.getBoolean("isAllGesturesEnabled")) : null, YRNComponentsExtKt.safeGetBoolean(map, "isMyLocationButtonEnabled", true), YRNComponentsExtKt.safeGetBoolean(map, "isIndoorSwitchEnabled", true), YRNComponentsExtKt.safeGetBoolean(map, "isZoomInByScreenCenter", false), YRNComponentsExtKt.safeGetBoolean(map, "isCenterIconShow", false)));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NotNull YRNAMapView root, @Nullable String commandId, @Nullable ReadableArray args) {
        MarkerProps markerPropsSafeParseMarker;
        Intrinsics.checkNotNullParameter(root, "root");
        super.receiveCommand(root, commandId, args);
        Integer num = getCommandsMap().get(commandId);
        boolean z = false;
        z = false;
        int iIntValue = num != null ? num.intValue() : 0;
        Logger.i(TAG, "receiveCommand: " + iIntValue);
        switch (iIntValue) {
            case 1:
                startLocation(root, safeGetMap(args));
                break;
            case 2:
                ReadableMap readableMapSafeGetMap = safeGetMap(args);
                if (readableMapSafeGetMap != null) {
                    root.moveCamera(safeParseCoordinate(readableMapSafeGetMap, "coordinate"), YRNComponentsExtKt.safeGetDouble(readableMapSafeGetMap, "zoom", 15.0d));
                    break;
                }
                break;
            case 3:
                ReadableMap readableMapSafeGetMap2 = safeGetMap(args);
                if (readableMapSafeGetMap2 != null) {
                    root.animateCamera(safeParseCoordinate(readableMapSafeGetMap2, "coordinate"), YRNComponentsExtKt.safeGetDouble(readableMapSafeGetMap2, "zoom", 15.0d), YRNComponentsExtKt.safeGetInt(readableMapSafeGetMap2, "durationMs", 250));
                    break;
                }
                break;
            case 4:
                root.stopAnimation();
                break;
            case 5:
                root.clearMap();
                break;
            case 6:
                String str = "normal";
                if (args != null) {
                    try {
                        String string = args.getString(0);
                        if (string != null) {
                            str = string;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                root.setMapType(str);
                break;
            case 7:
                root.runOnDrawFrame();
                break;
            case 8:
                ReadableMap readableMapSafeGetMap3 = safeGetMap(args);
                if (readableMapSafeGetMap3 != null) {
                    root.setMapStatusLimit(safeParseCoordinate(readableMapSafeGetMap3, "northEast"), safeParseCoordinate(readableMapSafeGetMap3, "southwest"));
                    break;
                }
                break;
            case 9:
                if (args != null) {
                    try {
                        z = args.getBoolean(0);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                root.setTouchPoiEnable(z);
                break;
            case 10:
                root.setLocationListener();
                break;
            case 11:
                root.removeLocationListener();
                break;
            case 12:
                root.setOnCameraChangeListener();
                break;
            case 13:
                root.removeOnCameraChangeListener();
                break;
            case 14:
                root.setOnMapLoadedListener();
                break;
            case 15:
                root.removeOnMapLoadedListener();
                break;
            case 16:
                ReadableMap readableMapSafeGetMap4 = safeGetMap(args);
                if (readableMapSafeGetMap4 != null && (markerPropsSafeParseMarker = safeParseMarker(readableMapSafeGetMap4)) != null) {
                    root.addMarkers(CollectionsKt__CollectionsJVMKt.listOf(new ClusterData(markerPropsSafeParseMarker.getPosition(), 1, CollectionsKt__CollectionsJVMKt.listOf(markerPropsSafeParseMarker))));
                }
                break;
            case 17:
                ReadableArray readableArraySafeGetArray = safeGetArray(args);
                if (readableArraySafeGetArray != null) {
                    ArrayList arrayList = new ArrayList();
                    int size = readableArraySafeGetArray.size();
                    for (int i = 0; i < size; i++) {
                        ReadableMap map = readableArraySafeGetArray.getMap(i);
                        if (map != null) {
                            if (YRNComponentsExtKt.safeGetInt(map, "count", 1) > 1) {
                                ClusterData clusterDataSafeParseMarkers = safeParseMarkers(map);
                                if (clusterDataSafeParseMarkers != null) {
                                    arrayList.add(clusterDataSafeParseMarkers);
                                }
                            } else {
                                MarkerProps markerPropsSafeParseMarker2 = safeParseMarker(map);
                                if (markerPropsSafeParseMarker2 != null) {
                                    arrayList.add(new ClusterData(markerPropsSafeParseMarker2.getPosition(), 1, CollectionsKt__CollectionsJVMKt.listOf(markerPropsSafeParseMarker2)));
                                }
                            }
                        }
                    }
                    root.addMarkers(arrayList);
                    break;
                }
                break;
            case 18:
                root.setOnMarkerClickListener();
                break;
        }
    }
}
