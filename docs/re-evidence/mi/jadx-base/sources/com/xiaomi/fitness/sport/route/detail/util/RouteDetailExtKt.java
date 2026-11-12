package com.xiaomi.fitness.sport.route.detail.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.target.Target;
import coil.transform.RoundedCornersTransformation;
import com.amap.api.maps.AMap;
import com.amap.api.maps.CameraUpdateFactory;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.Polyline;
import com.amap.api.maps.model.PolylineOptions;
import com.xiaomi.fit.fitness.parser.sport.track.parser.CommonTrackData;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport.SportConstants;
import com.xiaomi.fitness.sport.route.detail.model.RankInfo;
import com.xiaomi.fitness.sport.route.detail.model.RankingListItem;
import com.xiaomi.fitness.sport.route.detail.model.RouteType;
import com.xiaomi.fitness.sport.route.detail.util.RouteDetailExtKt;
import com.xiaomi.fitness.sport.utils.SportPermissionsUtil;
import com.xiaomi.fitness.sport.view.launch.LaunchSportModel;
import com.xiaomi.fitness.sport_export.data.RouteInfo;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import defpackage.aki;
import defpackage.bxa;
import defpackage.c1j;
import defpackage.eoi;
import defpackage.jrk;
import defpackage.mpi;
import defpackage.ne5;
import defpackage.ni4;
import defpackage.nuf;
import defpackage.opn;
import defpackage.zxi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b\u001a\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006\u001a\u001e\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011\u001a \u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u001a\u0006\u0010\u0013\u001a\u00020\u0014\u001a$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0014\u001a\n\u0010\u001a\u001a\u00020\u0001*\u00020\u001b\u001a:\u0010\u001c\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001d*\u00020\u001b2\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00160\u0016\u001a\u001c\u0010\"\u001a\u00020\u001f*\u00020\u001b2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020!H\u0002\u001a(\u0010%\u001a\u00020\u0001*\u00020\u001b2\u0012\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00160\u00162\b\b\u0002\u0010'\u001a\u00020\u0006\u001aW\u0010(\u001a\u00020\u0001*\u00020\u001b2\u0012\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00160\u00162\b\b\u0002\u0010*\u001a\u00020\u00062\b\b\u0002\u0010+\u001a\u00020\u00062\b\b\u0002\u0010,\u001a\u00020\u00062\b\b\u0002\u0010-\u001a\u00020\u00062\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/¢\u0006\u0002\u00100\u001as\u00101\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001d*\u00020\u001b2\u0012\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00160\u00162\b\b\u0002\u0010*\u001a\u00020\u00062\b\b\u0002\u0010+\u001a\u00020\u00062\b\b\u0002\u0010,\u001a\u00020\u00062\b\b\u0002\u0010-\u001a\u00020\u00062\n\b\u0002\u0010.\u001a\u0004\u0018\u00010/¢\u0006\u0002\u00102\u001a>\u00103\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001d*\u00020\u001b2\f\u00104\u001a\b\u0012\u0004\u0012\u0002050\u00162\b\b\u0002\u0010'\u001a\u00020\u0006\u001a \u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00160\u00162\f\u00104\u001a\b\u0012\u0004\u0012\u0002050\u0016\u001a\u0017\u00107\u001a\u00020\u00062\n\b\u0001\u00108\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u00109\u001a\u0010\u0010:\u001a\u00020\u00042\b\b\u0001\u00108\u001a\u00020\u0006\u001a\u0010\u0010;\u001a\u00020\u00062\b\b\u0001\u00108\u001a\u00020\u0006\u001a\u001f\u0010<\u001a\u00020\u00012\u0006\u0010=\u001a\u00020>2\n\b\u0001\u00108\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010?\u001a\u001e\u0010@\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u0006\u001a \u0010@\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010D\u001a\u0004\u0018\u00010\u00042\u0006\u0010C\u001a\u00020\u0006\u001a\u0010\u0010E\u001a\u00020\u00062\u0006\u0010F\u001a\u00020\u0006H\u0002\u001a\u0018\u0010G\u001a\u00020\u0001*\u00020H2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00010J\u001a \u0010K\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0010\b\u0002\u0010I\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010J\u001a\"\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0M2\u0006\u0010N\u001a\u00020\u000e2\u0006\u0010O\u001a\u00020\u000e\"\u000e\u0010P\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010Q\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006R"}, d2 = {"loadImageWithUrl", "", "Landroid/widget/ImageView;", "url", "", "iconWidth", "", "roundedCorner", "", "getRunTimesSpannableStr", "Landroid/text/SpannableString;", "runTimes", "showSelectMapDialogIfNeed", "marsLat", "", "marsLng", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "goToBaiduMapWithMarsCoordinates", "mockCreatorInfo", "Lcom/xiaomi/fitness/sport/route/detail/model/RankInfo;", "convertRankInfoListToRankListItemList", "", "Lcom/xiaomi/fitness/sport/route/detail/model/RankingListItem;", "rankInfoList", "userRankInfo", "configAMap", "Lcom/amap/api/maps/AMap;", "drawRouteTrace", "Lkotlin/Triple;", "Lcom/amap/api/maps/model/Polyline;", "Lcom/amap/api/maps/model/Marker;", "locationList", "Lcom/amap/api/maps/model/LatLng;", "addMarkerToEndpoint", "drawableResId", "latLng", "buildVisibleBounds", "list", "padding", "moveToPathArea", "routes", "paddingLeft", "paddingRight", "paddingTop", "paddingBottom", "bearing", "", "(Lcom/amap/api/maps/AMap;Ljava/util/List;IIIILjava/lang/Float;)V", "moveToPathAreaAndDrawTrace", "(Lcom/amap/api/maps/AMap;Ljava/util/List;IIIILjava/lang/Float;)Lkotlin/Triple;", "buildVisibleBoundsAndDrawTrace", "trackData", "Lcom/xiaomi/fit/fitness/parser/sport/track/parser/CommonTrackData;", "convertCommonTrackToLatLngs", "getRouteTypeTextColorResId", "routeType", "(Ljava/lang/Integer;)I", "getRouteTypeTagName", "getRouteTypeTagBgDrawableResId", "showRouteTypeTag", "tagTv", "Landroid/widget/TextView;", "(Landroid/widget/TextView;Ljava/lang/Integer;)V", "launchOutdoorRunning", "routeInfo", "Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "wearMode", "fileUrl", "getMedalResId", "ranking", "listenOnClickWithPressEffect", "Landroid/view/View;", "callback", "Lkotlin/Function0;", "checkGpsPermissionAndAvailability", "convertFromGps84ToMars", "Lkotlin/Pair;", "lat", "lng", "ROUTE_WIDE_TAG_ID", "MODULE_ID", "sport_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRouteDetailExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteDetailExt.kt\ncom/xiaomi/fitness/sport/route/detail/util/RouteDetailExtKt\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,526:1\n54#2,3:527\n24#2:530\n59#2,4:531\n63#2,2:544\n844#3,9:535\n1863#4,2:546\n1557#4:548\n1628#4,3:549\n1557#4:552\n1628#4,2:553\n1557#4:555\n1628#4,3:556\n1630#4:559\n1863#4:560\n1863#4,2:561\n1864#4:563\n1863#4:564\n1864#4:566\n1#5:565\n*S KotlinDebug\n*F\n+ 1 RouteDetailExt.kt\ncom/xiaomi/fitness/sport/route/detail/util/RouteDetailExtKt\n*L\n67#1:527,3\n67#1:530\n67#1:531,4\n67#1:544,2\n73#1:535,9\n227#1:546,2\n264#1:548\n264#1:549,3\n307#1:552\n307#1:553,2\n308#1:555\n308#1:556,3\n307#1:559\n330#1:560\n331#1:561,2\n330#1:563\n394#1:564\n394#1:566\n*E\n"})
public final class RouteDetailExtKt {
    public static final int MODULE_ID = 239;
    public static final int ROUTE_WIDE_TAG_ID = -30;

    private static final Marker addMarkerToEndpoint(AMap aMap, int i, LatLng latLng) {
        Marker markerAddMarker = aMap.addMarker(new MarkerOptions().position(latLng).anchor(0.5f, 1.0f).icon(BitmapDescriptorFactory.fromBitmap(BitmapFactory.decodeResource(ApplicationExtKt.getApplication().getResources(), i))));
        Intrinsics.checkNotNullExpressionValue(markerAddMarker, "addMarker(...)");
        return markerAddMarker;
    }

    public static final void buildVisibleBounds(@NotNull AMap aMap, @NotNull List<? extends List<LatLng>> list, int i) {
        Intrinsics.checkNotNullParameter(aMap, "<this>");
        Intrinsics.checkNotNullParameter(list, "list");
        LatLngBounds.Builder builder = LatLngBounds.builder();
        List<? extends List<LatLng>> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            List list3 = (List) it.next();
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(builder.include((LatLng) it2.next()));
            }
            arrayList.add(arrayList2);
        }
        aMap.animateCamera(CameraUpdateFactory.newLatLngBounds(builder.build(), i));
    }

    public static /* synthetic */ void buildVisibleBounds$default(AMap aMap, List list, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 150;
        }
        buildVisibleBounds(aMap, list, i);
    }

    @NotNull
    public static final Triple<List<Polyline>, Marker, Marker> buildVisibleBoundsAndDrawTrace(@NotNull AMap aMap, @NotNull List<CommonTrackData> trackData, int i) {
        Intrinsics.checkNotNullParameter(aMap, "<this>");
        Intrinsics.checkNotNullParameter(trackData, "trackData");
        if (trackData.isEmpty()) {
            return new Triple<>(CollectionsKt__CollectionsKt.emptyList(), null, null);
        }
        List<List<LatLng>> listConvertCommonTrackToLatLngs = convertCommonTrackToLatLngs(trackData);
        buildVisibleBounds(aMap, listConvertCommonTrackToLatLngs, i);
        return drawRouteTrace(aMap, listConvertCommonTrackToLatLngs);
    }

    public static /* synthetic */ Triple buildVisibleBoundsAndDrawTrace$default(AMap aMap, List list, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 150;
        }
        return buildVisibleBoundsAndDrawTrace(aMap, list, i);
    }

    public static final void checkGpsPermissionAndAvailability(@NotNull FragmentActivity fragmentActivity, @Nullable final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        SportPermissionsUtil.INSTANCE.getSportPermissions(fragmentActivity, 1, new Function0() { // from class: vyk
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RouteDetailExtKt.checkGpsPermissionAndAvailability$lambda$18(function0);
            }
        });
    }

    public static /* synthetic */ void checkGpsPermissionAndAvailability$default(FragmentActivity fragmentActivity, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        checkGpsPermissionAndAvailability(fragmentActivity, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkGpsPermissionAndAvailability$lambda$18(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final void configAMap(@NotNull AMap aMap) {
        Intrinsics.checkNotNullParameter(aMap, "<this>");
        aMap.setMapType(UIUtils.isNightMode(ApplicationExtKt.getApplication()) ? 3 : 1);
        aMap.getUiSettings().setZoomControlsEnabled(false);
        aMap.getUiSettings().setLogoBottomMargin(-50);
        aMap.getUiSettings().setCompassEnabled(false);
        aMap.getUiSettings().setMyLocationButtonEnabled(false);
        aMap.getUiSettings().setAllGesturesEnabled(true);
    }

    @NotNull
    public static final List<List<LatLng>> convertCommonTrackToLatLngs(@NotNull List<CommonTrackData> trackData) {
        Intrinsics.checkNotNullParameter(trackData, "trackData");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (CommonTrackData commonTrackData : trackData) {
            double[] dArrC = bxa.c(commonTrackData.getLatitude(), commonTrackData.getLongitude());
            arrayList2.add(new LatLng(dArrC[0], dArrC[1]));
            if (commonTrackData.getFlagSegment()) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(arrayList2);
                arrayList.add(arrayList3);
                Logger.i("convertCommonTrackToLatLngs", "current segment index:" + arrayList.size() + ",current segment size:" + arrayList2.size());
                arrayList2.clear();
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(arrayList2);
        }
        Logger.i("convertCommonTrackToLatLngs", "current segment index:" + arrayList.size() + ",current segment size:" + arrayList2.size());
        return arrayList;
    }

    @NotNull
    public static final Pair<Double, Double> convertFromGps84ToMars(double d, double d2) {
        double[] dArrC = bxa.c(d, d2);
        return new Pair<>(Double.valueOf(dArrC[0]), Double.valueOf(dArrC[1]));
    }

    @NotNull
    public static final List<RankingListItem> convertRankInfoListToRankListItemList(@NotNull List<RankInfo> rankInfoList, @Nullable RankInfo rankInfo) {
        Intrinsics.checkNotNullParameter(rankInfoList, "rankInfoList");
        ArrayList arrayList = new ArrayList();
        if (rankInfo != null && rankInfo.getRank() > rankInfoList.size()) {
            arrayList.add(new RankingListItem(rankInfo.getUid(), rankInfo.getRank(), rankInfo.getIcon(), rankInfo.getNickName(), rankInfo.getDevice(), rankInfo.getClock(), rankInfo.getScore(), true));
        }
        for (RankInfo rankInfo2 : rankInfoList) {
            arrayList.add(new RankingListItem(rankInfo2.getUid(), rankInfo2.getRank(), rankInfo2.getIcon(), rankInfo2.getNickName(), rankInfo2.getDevice(), rankInfo2.getClock(), rankInfo2.getScore(), false));
        }
        return CollectionsKt___CollectionsKt.toList(arrayList);
    }

    @NotNull
    public static final Triple<List<Polyline>, Marker, Marker> drawRouteTrace(@NotNull AMap aMap, @NotNull List<? extends List<LatLng>> locationList) {
        Intrinsics.checkNotNullParameter(aMap, "<this>");
        Intrinsics.checkNotNullParameter(locationList, "locationList");
        if (locationList.isEmpty()) {
            return new Triple<>(CollectionsKt__CollectionsKt.emptyList(), null, null);
        }
        ArrayList arrayList = new ArrayList();
        int color = ApplicationExtKt.getApplication().getResources().getColor(aki.c, null);
        Marker markerAddMarkerToEndpoint = addMarkerToEndpoint(aMap, eoi.b0, (LatLng) CollectionsKt___CollectionsKt.last((List) CollectionsKt___CollectionsKt.last((List) locationList)));
        Marker markerAddMarkerToEndpoint2 = addMarkerToEndpoint(aMap, eoi.c0, (LatLng) CollectionsKt___CollectionsKt.first((List) CollectionsKt___CollectionsKt.first((List) locationList)));
        List<? extends List<LatLng>> list = locationList;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List list2 = (List) it.next();
            if (!list2.isEmpty()) {
                List list3 = list2;
                Polyline polylineAddPolyline = aMap.addPolyline(new PolylineOptions().addAll(list3).width(15.0f).color(color));
                Intrinsics.checkNotNullExpressionValue(polylineAddPolyline, "addPolyline(...)");
                arrayList.add(polylineAddPolyline);
                if (locationList.size() == 1) {
                    Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(ApplicationExtKt.getApplication().getResources(), eoi.O1);
                    Polyline polylineAddPolyline2 = aMap.addPolyline(new PolylineOptions().addAll(list3).width(15.0f).setCustomTexture(BitmapDescriptorFactory.fromBitmap(bitmapDecodeResource)));
                    Intrinsics.checkNotNullExpressionValue(polylineAddPolyline2, "addPolyline(...)");
                    arrayList.add(polylineAddPolyline2);
                    bitmapDecodeResource.recycle();
                }
            }
            arrayList2.add(Unit.INSTANCE);
        }
        return new Triple<>(arrayList, markerAddMarkerToEndpoint2, markerAddMarkerToEndpoint);
    }

    private static final int getMedalResId(int i) {
        if (i != 1) {
            return i != 2 ? eoi.M1 : eoi.P1;
        }
        return eoi.N1;
    }

    public static final int getRouteTypeTagBgDrawableResId(@RouteType int i) {
        switch (i) {
            case 0:
                return eoi.T1;
            case 1:
                return eoi.V1;
            case 2:
                return eoi.R1;
            case 3:
                return eoi.U1;
            case 4:
                return eoi.T1;
            case 5:
                return eoi.S1;
            case 6:
                return eoi.Q1;
            default:
                return eoi.T1;
        }
    }

    @NotNull
    public static final String getRouteTypeTagName(@RouteType int i) {
        int i2;
        switch (i) {
            case 0:
                i2 = c1j.W3;
                break;
            case 1:
                i2 = c1j.Y3;
                break;
            case 2:
                i2 = c1j.U3;
                break;
            case 3:
                i2 = c1j.X3;
                break;
            case 4:
                i2 = c1j.V3;
                break;
            case 5:
                i2 = c1j.G3;
                break;
            case 6:
                i2 = c1j.T3;
                break;
            default:
                i2 = c1j.p;
                break;
        }
        return ResourceExtKt.getString(i2);
    }

    public static final int getRouteTypeTextColorResId(@RouteType @Nullable Integer num) {
        if (num != null && num.intValue() == 0) {
            return aki.u;
        }
        if (num != null && num.intValue() == 1) {
            return aki.w;
        }
        if (num != null && num.intValue() == 2) {
            return aki.s;
        }
        if (num != null && num.intValue() == 3) {
            return aki.v;
        }
        if (num != null && num.intValue() == 4) {
            return aki.u;
        }
        if (num != null && num.intValue() == 5) {
            return aki.t;
        }
        return (num != null && num.intValue() == 6) ? aki.f1137r : aki.u;
    }

    @NotNull
    public static final SpannableString getRunTimesSpannableStr(int i) {
        String quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(zxi.o, i, Integer.valueOf(i));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        String quantityString2 = ApplicationExtKt.getApplication().getResources().getQuantityString(zxi.common_unit_time, i);
        Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
        Logger.d("getRunTimesSpannableStr", "wholeStr=" + quantityString + " unitStr=" + quantityString2);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) quantityString, quantityString2, 0, false, 6, (Object) null);
        int length = quantityString2.length() + iIndexOf$default;
        Typeface typefaceH = jrk.h(ApplicationExtKt.getApplication(), mpi.f27070b);
        if (typefaceH == null) {
            typefaceH = Typeface.DEFAULT;
        }
        ne5 ne5Var = new ne5(typefaceH);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(ApplicationExtKt.getApplication().getResources().getColor(aki.E, null));
        SpannableString spannableString = new SpannableString(quantityString);
        if (iIndexOf$default >= 0 && length <= quantityString.length()) {
            spannableString.setSpan(new RelativeSizeSpan(0.72f), iIndexOf$default, length, 17);
            spannableString.setSpan(ne5Var, iIndexOf$default, length, 17);
            spannableString.setSpan(foregroundColorSpan, iIndexOf$default, length, 17);
        }
        return spannableString;
    }

    private static final void goToBaiduMapWithMarsCoordinates(FragmentActivity fragmentActivity, double d, double d2) {
        double[] dArrA = bxa.a(d, d2);
        MapAppLaunchExtKt.goToBaiduMapApp(fragmentActivity, dArrA[0], dArrA[1]);
    }

    public static final void launchOutdoorRunning(@NotNull FragmentActivity fragmentActivity, @NotNull RouteInfo routeInfo, int i) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Intrinsics.checkNotNullParameter(routeInfo, "routeInfo");
        Bundle bundle = new Bundle();
        bundle.putInt("KEY_SPORT_TYPE", 1);
        bundle.putSerializable("key_item_data", routeInfo);
        bundle.putInt("WEAR_MODE", i);
        new LaunchSportModel().launchSport(fragmentActivity, bundle, null, new Function0() { // from class: zyk
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RouteDetailExtKt.launchOutdoorRunning$lambda$15();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchOutdoorRunning$lambda$15() {
        SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).removeRecoverSport();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchOutdoorRunning$lambda$16() {
        SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).removeRecoverSport();
        return Unit.INSTANCE;
    }

    public static final void listenOnClickWithPressEffect(@NotNull View view, @NotNull final Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        nuf.f(view);
        ViewExtKt.clickWithTrigger$default(view, 0L, new Function1() { // from class: uyk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RouteDetailExtKt.listenOnClickWithPressEffect$lambda$17(callback, (View) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit listenOnClickWithPressEffect$lambda$17(Function0 callback, View it) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(it, "it");
        callback.invoke();
        return Unit.INSTANCE;
    }

    public static final void loadImageWithUrl(@NotNull final ImageView imageView, @Nullable String str, int i, boolean z) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        if (str == null || TextUtils.isEmpty(str)) {
            imageView.setImageResource(eoi.e);
            return;
        }
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(str).target(imageView);
        builderTarget.bitmapConfig(Bitmap.Config.ARGB_8888);
        builderTarget.size(i, i);
        if (z) {
            builderTarget.transformations(new RoundedCornersTransformation(ExtUtilsKt.getDp(Float.valueOf(16.0f))));
        }
        builderTarget.target(new Target() { // from class: com.xiaomi.fitness.sport.route.detail.util.RouteDetailExtKt$loadImageWithUrl$lambda$2$$inlined$target$default$1
            @Override // coil.target.Target
            public void onError(@Nullable Drawable error) {
                imageView.setImageResource(eoi.e);
            }

            @Override // coil.target.Target
            public void onStart(@Nullable Drawable placeholder) {
            }

            @Override // coil.target.Target
            public void onSuccess(@NotNull Drawable result) {
                Intrinsics.checkNotNull(result, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                imageView.setImageBitmap(((BitmapDrawable) result).getBitmap());
            }
        });
        builderTarget.placeholder(eoi.e);
        imageLoader.enqueue(builderTarget.build());
    }

    public static /* synthetic */ void loadImageWithUrl$default(ImageView imageView, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = ExtUtilsKt.getDp(46);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        loadImageWithUrl(imageView, str, i, z);
    }

    @NotNull
    public static final RankInfo mockCreatorInfo() {
        return new RankInfo(10000L, "狐妖小红娘", "https://apkmazon.com/wp-content/uploads/2023/01/sagon-circle-dark-icon-pack-100x100.jpg", 101, 3, 357, "");
    }

    public static final void moveToPathArea(@NotNull AMap aMap, @NotNull List<? extends List<LatLng>> routes, int i, int i2, int i3, int i4, @Nullable Float f) {
        Intrinsics.checkNotNullParameter(aMap, "<this>");
        Intrinsics.checkNotNullParameter(routes, "routes");
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        Iterator<T> it = routes.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                builder.include((LatLng) it2.next());
            }
        }
        aMap.moveCamera(CameraUpdateFactory.newLatLngBoundsRect(builder.build(), i, i2, i3, i4));
        if (f != null) {
            aMap.moveCamera(CameraUpdateFactory.changeBearing(f.floatValue()));
        }
    }

    @NotNull
    public static final Triple<List<Polyline>, Marker, Marker> moveToPathAreaAndDrawTrace(@NotNull AMap aMap, @NotNull List<? extends List<LatLng>> routes, int i, int i2, int i3, int i4, @Nullable Float f) {
        Intrinsics.checkNotNullParameter(aMap, "<this>");
        Intrinsics.checkNotNullParameter(routes, "routes");
        Triple<List<Polyline>, Marker, Marker> tripleDrawRouteTrace = drawRouteTrace(aMap, routes);
        moveToPathArea(aMap, routes, i, i2, i3, i4, f);
        return tripleDrawRouteTrace;
    }

    public static final void showRouteTypeTag(@NotNull TextView tagTv, @RouteType @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(tagTv, "tagTv");
        if (num == null) {
            ViewExtKt.gone(tagTv);
            return;
        }
        ViewExtKt.visible(tagTv);
        tagTv.setText(getRouteTypeTagName(num.intValue()));
        tagTv.setBackgroundResource(getRouteTypeTagBgDrawableResId(num.intValue()));
        tagTv.setTextColor(ni4.c(ApplicationExtKt.getApplication(), getRouteTypeTextColorResId(num)));
    }

    public static final void showSelectMapDialogIfNeed(final double d, final double d2, @NotNull final FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        boolean zIsBaiduMapInstalled = MapAppLaunchExtKt.isBaiduMapInstalled();
        boolean zIsAMapInstalled = MapAppLaunchExtKt.isAMapInstalled();
        boolean zIsTencentMapInstalled = MapAppLaunchExtKt.isTencentMapInstalled();
        if (!zIsBaiduMapInstalled && !zIsAMapInstalled && !zIsTencentMapInstalled) {
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), c1j.N3);
            return;
        }
        int i = zIsAMapInstalled ? (zIsBaiduMapInstalled ? 1 : 0) + 1 : zIsBaiduMapInstalled ? 1 : 0;
        if (zIsTencentMapInstalled) {
            i++;
        }
        if (i == 1) {
            if (zIsBaiduMapInstalled) {
                goToBaiduMapWithMarsCoordinates(fragmentActivity, d, d2);
            }
            if (zIsAMapInstalled) {
                MapAppLaunchExtKt.goToAMapApp(fragmentActivity, d, d2);
            }
            if (zIsTencentMapInstalled) {
                MapAppLaunchExtKt.goToTencentMapApp(fragmentActivity, d, d2);
                return;
            }
            return;
        }
        final opn opnVarA0 = opn.A0(fragmentActivity.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(opnVarA0, "inflate(...)");
        TextView mapBaidu = opnVarA0.A;
        Intrinsics.checkNotNullExpressionValue(mapBaidu, "mapBaidu");
        ViewExtKt.setVisible(mapBaidu, zIsBaiduMapInstalled);
        if (zIsBaiduMapInstalled) {
            nuf.f(opnVarA0.A);
            ViewExtKt.clickWithTrigger$default(opnVarA0.A, 0L, new Function1() { // from class: wyk
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return RouteDetailExtKt.showSelectMapDialogIfNeed$lambda$3(fragmentActivity, d, d2, (TextView) obj);
                }
            }, 1, null);
        }
        TextView mapGaode = opnVarA0.B;
        Intrinsics.checkNotNullExpressionValue(mapGaode, "mapGaode");
        ViewExtKt.setVisible(mapGaode, zIsAMapInstalled);
        if (zIsAMapInstalled) {
            nuf.f(opnVarA0.B);
            ViewExtKt.clickWithTrigger$default(opnVarA0.B, 0L, new Function1() { // from class: xyk
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return RouteDetailExtKt.showSelectMapDialogIfNeed$lambda$4(fragmentActivity, d, d2, (TextView) obj);
                }
            }, 1, null);
        }
        TextView mapTencent = opnVarA0.C;
        Intrinsics.checkNotNullExpressionValue(mapTencent, "mapTencent");
        ViewExtKt.setVisible(mapTencent, zIsTencentMapInstalled);
        if (zIsTencentMapInstalled) {
            ViewExtKt.clickWithTrigger$default(opnVarA0.C, 0L, new Function1() { // from class: yyk
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return RouteDetailExtKt.showSelectMapDialogIfNeed$lambda$5(opnVarA0, fragmentActivity, d, d2, (TextView) obj);
                }
            }, 1, null);
        }
        new CommonDialog.c("sportLayoutSelectMapDialog").setCustomView(opnVarA0.getRoot()).setDialogTitle(c1j.x4).setNegativeText(c1j.f).setCanceledOnTouchOutside(true).create().showIfNeed(fragmentActivity.getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showSelectMapDialogIfNeed$lambda$3(FragmentActivity fragmentActivity, double d, double d2, TextView it) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "$fragmentActivity");
        Intrinsics.checkNotNullParameter(it, "it");
        goToBaiduMapWithMarsCoordinates(fragmentActivity, d, d2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showSelectMapDialogIfNeed$lambda$4(FragmentActivity fragmentActivity, double d, double d2, TextView it) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "$fragmentActivity");
        Intrinsics.checkNotNullParameter(it, "it");
        MapAppLaunchExtKt.goToAMapApp(fragmentActivity, d, d2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showSelectMapDialogIfNeed$lambda$5(opn sportLayoutSelectMapDialog, FragmentActivity fragmentActivity, double d, double d2, TextView it) {
        Intrinsics.checkNotNullParameter(sportLayoutSelectMapDialog, "$sportLayoutSelectMapDialog");
        Intrinsics.checkNotNullParameter(fragmentActivity, "$fragmentActivity");
        Intrinsics.checkNotNullParameter(it, "it");
        nuf.f(sportLayoutSelectMapDialog.C);
        MapAppLaunchExtKt.goToTencentMapApp(fragmentActivity, d, d2);
        return Unit.INSTANCE;
    }

    public static final void launchOutdoorRunning(@NotNull FragmentActivity fragmentActivity, @Nullable String str, int i) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Bundle bundle = new Bundle();
        bundle.putInt("KEY_SPORT_TYPE", 1);
        bundle.putString(SportConstants.KEY_CREATE_ROUTE_DATA, str);
        bundle.putInt("WEAR_MODE", i);
        new LaunchSportModel().launchSport(fragmentActivity, bundle, null, new Function0() { // from class: tyk
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RouteDetailExtKt.launchOutdoorRunning$lambda$16();
            }
        });
    }
}
