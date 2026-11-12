package com.huawei.healthcloud.plugintrack.runningroute.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Base64;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.amap.api.location.AMapLocation;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.google.gson.reflect.TypeToken;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.motiontrack.api.ILocationChangeListener;
import com.huawei.health.motiontrack.model.runningroute.HotPathCityInfo;
import com.huawei.health.trackprocess.model.GpsPoint;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.golf.bean.GolfGetLocation;
import com.huawei.healthcloud.plugintrack.runningroute.bean.RouteCloudFactory;
import com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcloudmodel.healthdatacloud.HealthDataCloudFactory;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.unite.RouteData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.utils.Constants;
import com.huawei.operation.view.CustomWebView$$ExternalSyntheticBackport0;
import com.huawei.pluginfitnessadvice.Attribute;
import com.huawei.route.GetRouteDetailReq;
import com.huawei.route.GetSingleRouteDetailRsp;
import com.huawei.route.RouteMarkerPoint;
import com.huawei.route.RouteTrackInfo;
import com.huawei.route.RouteTrackPoint;
import com.huawei.route.RouteType;
import com.huawei.route.SceneType;
import com.huawei.route.utils.RouteSourceUtils;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.HealthButtonBarLayout;
import com.huawei.ui.commonui.edittext.HealthEditText;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.buh;
import defpackage.ddv;
import defpackage.ecu;
import defpackage.gch;
import defpackage.gck;
import defpackage.gcl;
import defpackage.gcp;
import defpackage.gcq;
import defpackage.gcr;
import defpackage.gcv;
import defpackage.gcw;
import defpackage.gcx;
import defpackage.gcy;
import defpackage.gcz;
import defpackage.gda;
import defpackage.gdb;
import defpackage.gdc;
import defpackage.gdd;
import defpackage.gde;
import defpackage.gdf;
import defpackage.gdg;
import defpackage.gdh;
import defpackage.gdi;
import defpackage.gdj;
import defpackage.gdk;
import defpackage.gdm;
import defpackage.gdp;
import defpackage.gzx;
import defpackage.iwh;
import defpackage.izy;
import defpackage.jcv;
import defpackage.jdn;
import defpackage.jfn;
import defpackage.jpg;
import defpackage.lmf;
import defpackage.lsj;
import defpackage.njy;
import defpackage.npn;
import defpackage.oet;
import defpackage.ofe;
import defpackage.qqt;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.xjl;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes10.dex */
public class RunningRouteUtils {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static jpg f10600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static RunningRouteUtils f10601c;
    private final RouteCloudFactory h = new RouteCloudFactory(BaseApplication.getContext());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f10599a = new Object();
    private static final String[] e = {"M0DV", "M0DY", "M0DZ", "M0E1", "M0E2", "M0E6", "M0E9", "M0EA"};
    private static final Map<Integer, Integer> d = CustomWebView$$ExternalSyntheticBackport0.m(new Map.Entry[]{new AbstractMap.SimpleEntry(0, Integer.valueOf(SceneType.WR.sceneType())), new AbstractMap.SimpleEntry(1, Integer.valueOf(SceneType.BIKE.sceneType())), new AbstractMap.SimpleEntry(3, Integer.valueOf(SceneType.EXP.sceneType()))});

    public interface GuideDialogCallBack {
        void showRecommendedRoute();
    }

    public static boolean a(int i) {
        return i == 258 || i == 259 || i == 257;
    }

    public static /* synthetic */ String e(String str, String str2) {
        return str2;
    }

    private RunningRouteUtils() {
    }

    public static RunningRouteUtils b(Context context) {
        if (f10601c == null) {
            synchronized (f10599a) {
                RunningRouteUtils runningRouteUtils = new RunningRouteUtils();
                f10601c = runningRouteUtils;
                LogUtil.a("Track_RunningRouteUtils", "RunningRouteUtils instance hashcode: ", Integer.valueOf(runningRouteUtils.hashCode()));
            }
        }
        return f10601c;
    }

    public void e(gcw gcwVar, ResultCallback<gda> resultCallback) {
        oet.d().c(gcwVar.getUrl(), this.h.getHeaders(), ofe.c(this.h.getBody(gcwVar)), gda.class, resultCallback);
    }

    public void d(gcv gcvVar, ResultCallback<gcx> resultCallback) {
        oet.d().c(gcvVar.getUrl(), this.h.getHeaders(), ofe.c(this.h.getBody(gcvVar)), gcx.class, resultCallback);
    }

    public void d(gcy gcyVar, ResultCallback<gdc> resultCallback) {
        oet.d().c(gcyVar.getUrl(), this.h.getHeaders(), ofe.c(this.h.getBody(gcyVar)), gdc.class, resultCallback);
    }

    public void b(gcr gcrVar, ResultCallback<CloudCommonReponse> resultCallback) {
        oet.d().c(gcrVar.getUrl(), this.h.getHeaders(), ofe.c(this.h.getBody(gcrVar)), CloudCommonReponse.class, resultCallback);
    }

    public void b(gcz gczVar, ResultCallback<gdb> resultCallback) {
        oet.d().c(gczVar.getUrl(), this.h.getHeaders(), ofe.c(this.h.getBody(gczVar)), gdb.class, resultCallback);
    }

    public void a(gcq gcqVar, ResultCallback<CloudCommonReponse> resultCallback) {
        oet.d().c(gcqVar.getUrl(), this.h.getHeaders(), ofe.c(this.h.getBody(gcqVar)), CloudCommonReponse.class, resultCallback);
    }

    public void d(gcp gcpVar, ResultCallback<CloudCommonReponse> resultCallback) {
        oet.d().c(gcpVar.getUrl(), this.h.getHeaders(), ofe.c(this.h.getBody(gcpVar)), CloudCommonReponse.class, resultCallback);
    }

    public void b(gck gckVar, ResultCallback<CloudCommonReponse> resultCallback) {
        oet.d().c(gckVar.getUrl(), this.h.getHeaders(), ofe.c(this.h.getBody(gckVar)), CloudCommonReponse.class, resultCallback);
    }

    public void d(gdg gdgVar, ResultCallback<gdi> resultCallback) {
        oet.d().c(gdgVar.getUrl(), this.h.getHeaders(), ofe.c(this.h.getBody(gdgVar)), gdi.class, resultCallback);
    }

    public void e(gdk gdkVar, ResultCallback<gdj> resultCallback) {
        oet.d().c(gdkVar.getUrl(), this.h.getHeaders(), ofe.c(this.h.getBody(gdkVar)), gdj.class, resultCallback);
    }

    public void b(gdd gddVar, ResultCallback<gdf> resultCallback) {
        oet.d().c(gddVar.getUrl(), this.h.getHeaders(), ofe.c(this.h.getBody(gddVar)), gdf.class, resultCallback);
    }

    public void b(gdh gdhVar, ResultCallback<gde> resultCallback) {
        oet.d().c(gdhVar.getUrl(), this.h.getHeaders(), ofe.c(this.h.getBody(gdhVar)), gde.class, resultCallback);
    }

    public static jpg c(final GolfGetLocation.GetLocationCallback getLocationCallback) {
        if (getLocationCallback != null) {
            GolfGetLocation.getInstance().getLocation(new GolfGetLocation.GetLocationCallback() { // from class: com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils.5
                @Override // com.huawei.healthcloud.plugintrack.golf.bean.GolfGetLocation.GetLocationCallback
                public void onSuccess(jpg jpgVar) {
                    if (jpgVar == null) {
                        getLocationCallback.onFailure(-1, "");
                        return;
                    }
                    LogUtil.a("Track_RunningRouteUtils", "result lat: ", Double.valueOf(jpgVar.d), ", lng: " + jpgVar.f38787a);
                    RunningRouteUtils.f10600b = jpgVar;
                    SharedPreferenceManager.e(BaseApplication.getContext(), "USER_LOCATION_LAT_LNG", "USER_LOCATION_LAT_LNG", qqt.b(RunningRouteUtils.f10600b), null);
                    getLocationCallback.onSuccess(jpgVar);
                }

                @Override // com.huawei.healthcloud.plugintrack.golf.bean.GolfGetLocation.GetLocationCallback
                public void onFailure(int i, String str) {
                    getLocationCallback.onFailure(i, str);
                }
            });
        }
        return a();
    }

    public static jpg a() {
        jpg jpgVarB = b();
        if (!b(jpgVarB)) {
            LogUtil.a("Track_RunningRouteUtils", "get location by gps failed, use location in sp");
            String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "USER_LOCATION_LAT_LNG", "USER_LOCATION_LAT_LNG");
            LogUtil.a("Track_RunningRouteUtils", "get location from sp = ", strE);
            if (!TextUtils.isEmpty(strE)) {
                try {
                    return (jpg) qqt.e(strE, jpg.class);
                } catch (Exception unused) {
                    LogUtil.a("Track_RunningRouteUtils", "parse location fail");
                }
            }
            if (b(f10600b)) {
                LogUtil.a("Track_RunningRouteUtils", "use gaode, sCurLatLng = (", Double.valueOf(f10600b.d), ", ", Double.valueOf(f10600b.f38787a), Constants.RIGHT_BRACKET_ONLY);
                SharedPreferenceManager.e(BaseApplication.getContext(), "USER_LOCATION_LAT_LNG", "USER_LOCATION_LAT_LNG", qqt.b(f10600b), null);
                return f10600b;
            }
            LogUtil.a("Track_RunningRouteUtils", "use location in default");
            return RunningRouteConstants.f10567a;
        }
        f10600b = jpgVarB;
        LogUtil.a("Track_RunningRouteUtils", "get location success, sCurLatLng = (", Double.valueOf(jpgVarB.d), ", ", Double.valueOf(f10600b.f38787a), Constants.RIGHT_BRACKET_ONLY);
        return f10600b;
    }

    public static jpg b() {
        if (ActivityCompat.checkSelfPermission(BaseApplication.getContext(), "android.permission.ACCESS_FINE_LOCATION") != 0 && ActivityCompat.checkSelfPermission(BaseApplication.getContext(), "android.permission.ACCESS_COARSE_LOCATION") != 0) {
            LogUtil.a("Track_RunningRouteUtils", "no location permission, request...");
            return null;
        }
        LocationManager locationManager = (LocationManager) BaseApplication.getContext().getSystemService("location");
        LogUtil.a("Track_RunningRouteUtils", "begin to use gps provider");
        Location lastKnownLocation = locationManager.getLastKnownLocation(GeocodeSearch.GPS);
        if (lastKnownLocation == null) {
            LogUtil.a("Track_RunningRouteUtils", "gps provider location is null, begin to use network provider");
            lastKnownLocation = locationManager.getLastKnownLocation("network");
        }
        jpg jpgVarB = new iwh(BaseApplication.getContext(), 0).b(lastKnownLocation);
        LogUtil.a("Track_RunningRouteUtils", "curLocation gotten by Android: (lat: ", jpgVarB.d + ", lon: ", jpgVarB.f38787a + Constants.RIGHT_BRACKET_ONLY);
        return jpgVarB;
    }

    private static boolean b(jpg jpgVar) {
        return jpgVar != null && Math.abs(jpgVar.d) > 1.0E-6d && Math.abs(jpgVar.f38787a) > 1.0E-6d;
    }

    public static void a(String str, final ResultCallback<jpg> resultCallback) {
        LogUtil.a("Track_RunningRouteUtils", "getLocation enter:", str);
        gch.b().requestLocationUpdates(new ILocationChangeListener() { // from class: jdy
            @Override // com.huawei.health.motiontrack.api.ILocationChangeListener
            public final void onLocationChange(jpg jpgVar) {
                RunningRouteUtils.d(resultCallback, jpgVar);
            }
        }, AMapLocation.COORD_TYPE_GCJ02.equals(str) ? 1 : 2);
    }

    public static /* synthetic */ void d(ResultCallback resultCallback, jpg jpgVar) {
        if (resultCallback != null) {
            resultCallback.onSuccess(jpgVar);
        }
        gch.b().removeLocationUpdates();
    }

    public static void d(Context context, GpsPoint gpsPoint) {
        LogUtil.a("Track_RunningRouteUtils", "showFirstPopularRoutesDialog enter");
        jpg jpgVarA = a();
        if (gpsPoint == null && jpgVarA == null) {
            LogUtil.e("Track_RunningRouteUtils", "no latlng jump");
            return;
        }
        if (gpsPoint == null) {
            gpsPoint = new GpsPoint(jpgVarA.d, jpgVarA.f38787a);
        }
        boolean zC = lsj.c(context, "com.baidu.BaiduMap");
        boolean zC2 = lsj.c(context, "com.autonavi.minimap");
        boolean zC3 = lsj.c(context, "com.tencent.map");
        if (!zC && !zC2 && !zC3) {
            LogUtil.a("Track_RunningRouteUtils", "no map install");
            Toast.makeText(context, context.getString(R.string.IDS_clock_rank_please_install_map), 0).show();
            return;
        }
        if (zC && !zC2 && !zC3) {
            e(0, 1);
            b(context, gpsPoint);
            return;
        }
        if (!zC && zC2 && !zC3) {
            e(0, 0);
            c(context, gpsPoint);
        } else if (!zC && !zC2 && zC3) {
            e(0, 2);
            e(context, gpsPoint);
        } else {
            d(context, gpsPoint, zC, zC2, zC3);
        }
    }

    public static List<jcv> c(Context context) {
        ArrayList arrayList = new ArrayList();
        for (MapInfoEnum mapInfoEnum : MapInfoEnum.values()) {
            if (lsj.c(context, mapInfoEnum.getMapPackage())) {
                arrayList.add(new jcv(mapInfoEnum.getId(), context.getString(mapInfoEnum.getNameId())));
            }
        }
        return arrayList;
    }

    public static void b(Context context, int i, HotPathCityInfo hotPathCityInfo) {
        LogUtil.a("Track_RunningRouteUtils", "Enter jumpToRouteList");
        if (context == null) {
            LogUtil.j("Track_RunningRouteUtils", "jumpToRouteList fail: context is null");
            return;
        }
        H5ProLaunchOption.Builder builderH = h();
        String str = "#/route-query-list?sportType=" + i;
        if (hotPathCityInfo != null) {
            str = str + "&cityId=" + hotPathCityInfo.getCityId() + "&cityName=" + hotPathCityInfo.getCityName();
            GpsPoint cityCenter = hotPathCityInfo.getCityCenter();
            if (cityCenter != null) {
                str = str + "&latitude=" + cityCenter.getLatitude() + "&longitude=" + cityCenter.getLongitude();
            }
        }
        builderH.addPath(str);
        ddv.b().loadH5ProApp(context, "com.huawei.health.h5.sports-path", builderH);
    }

    public static void e(Context context, String str, int i) {
        if (context == null) {
            LogUtil.j("Track_RunningRouteUtils", "jumpToRouteDetail fail: context is null");
            return;
        }
        try {
            str = URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            LogUtil.j("Track_RunningRouteUtils", "encode path fail: " + e2.getMessage());
        }
        String str2 = "#/route-detail?pathId=" + str + "&entranceActivity=" + i;
        H5ProLaunchOption.Builder builderH = h();
        builderH.addPath(str2);
        ddv.b().loadH5ProApp(context, "com.huawei.health.h5.sports-path", builderH);
    }

    public static void a(Context context, String str) {
        if (context == null) {
            LogUtil.j("Track_RunningRouteUtils", "jumpToRouteDetail fail: context is null");
            return;
        }
        H5ProLaunchOption.Builder builderH = h();
        builderH.addPath("#/my-route-detail?grantId=" + str + "&mode=add");
        ddv.b().loadH5ProApp(context, "com.huawei.health.h5.sports-path", builderH);
    }

    public static void e(Context context, String str) {
        if (context == null) {
            LogUtil.j("Track_RunningRouteUtils", "jumpToMyRoute fail: context is null");
            return;
        }
        H5ProLaunchOption.Builder builderH = h();
        builderH.addPath("#/my-path?loadingType=2&tabId=" + str);
        ddv.b().loadH5ProApp(context, "com.huawei.health.h5.sports-path", builderH);
    }

    public static void d(final Context context, String str, final RouteData routeData) {
        if (context == null) {
            LogUtil.j("Track_RunningRouteUtils", "jumpToEditRoute fail: context is null");
            return;
        }
        if (routeData == null) {
            LogUtil.j("Track_RunningRouteUtils", "jumpToEditRoute fail: routeData is null");
            return;
        }
        final String str2 = context.getFilesDir().getPath() + File.separator + RouteSourceUtils.MY_ROUTE_PATH + File.separator + "motionPath.json";
        final H5ProLaunchOption.Builder builderH = h();
        builderH.addPath("#/my-route-edit?from=" + str);
        builderH.addCustomizeArg("filePath", str2);
        ThreadPoolManager.c().execute(new Runnable() { // from class: jdz
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                RunningRouteUtils.b(str2, routeData, context, builderH);
            }
        });
    }

    public static /* synthetic */ void b(String str, RouteData routeData, Context context, H5ProLaunchOption.Builder builder) throws Throwable {
        a(str, routeData);
        ddv.b().loadH5ProApp(context, "com.huawei.health.h5.sports-path", builder);
    }

    private static void a(String str, RouteData routeData) throws Throwable {
        IOException e2;
        Throwable th;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                String strD = HiJsonUtil.d(routeData);
                File file = new File(str);
                File parentFile = file.getParentFile();
                if (parentFile != null && !parentFile.exists()) {
                    parentFile.mkdirs();
                }
                if (xjl.d(file)) {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        fileOutputStream.write(strD.getBytes(StandardCharsets.UTF_8));
                        fileOutputStream.close();
                        fileOutputStream2 = fileOutputStream;
                    } catch (IOException e3) {
                        e2 = e3;
                        fileOutputStream2 = fileOutputStream;
                        LogUtil.e("Track_RunningRouteUtils", "write routeData to file failed: " + e2.getMessage());
                        FileUtils.a(fileOutputStream2);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        FileUtils.a(fileOutputStream);
                        throw th;
                    }
                }
                FileUtils.a(fileOutputStream2);
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (IOException e4) {
            e2 = e4;
        }
    }

    private static H5ProLaunchOption.Builder h() {
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("SportRouteService", ddv.b().getCommonJsModule("SportRouteService")).addCustomizeJsModule("device", ddv.b().getCommonJsModule("device")).addCustomizeJsModule("storage", ddv.b().getCommonJsModule("storage"));
        builder.setImmerse();
        builder.showStatusBar();
        return builder;
    }

    private static void d(final Context context, final GpsPoint gpsPoint, boolean z, boolean z2, boolean z3) {
        View viewInflate = View.inflate(context, R.layout.dialog_map_choose, null);
        CustomAlertDialog.Builder builderC = new CustomAlertDialog.Builder(context).a(viewInflate).c(R.string.IDS_device_release_user_profile_log_collect_cancel, 0, new DialogInterface.OnClickListener() { // from class: jdr
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                LogUtil.a("Track_RunningRouteUtils", "showMapChooseDialog click cancel");
            }
        }, false);
        View viewFindViewById = viewInflate.findViewById(R.id.baidu_map_layout);
        View viewFindViewById2 = viewInflate.findViewById(R.id.gaode_map_layout);
        View viewFindViewById3 = viewInflate.findViewById(R.id.tencent_map_layout);
        final CustomAlertDialog customAlertDialogB = builderC.b();
        customAlertDialogB.setCancelable(false);
        if (z) {
            qsp.c(viewFindViewById, 0);
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: jds
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RunningRouteUtils.a(context, gpsPoint, customAlertDialogB, view);
                }
            });
        }
        if (z2) {
            qsp.c(viewFindViewById2, 0);
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: jdq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RunningRouteUtils.d(context, gpsPoint, customAlertDialogB, view);
                }
            });
        }
        if (z3) {
            qsp.c(viewFindViewById3, 0);
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: jdt
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RunningRouteUtils.e(context, gpsPoint, customAlertDialogB, view);
                }
            });
        }
        if (customAlertDialogB.isShowing()) {
            return;
        }
        customAlertDialogB.show();
        customAlertDialogB.setCanceledOnTouchOutside(true);
    }

    public static /* synthetic */ void a(Context context, GpsPoint gpsPoint, CustomAlertDialog customAlertDialog, View view) {
        e(1, 1);
        b(context, gpsPoint);
        customAlertDialog.cancel();
    }

    public static /* synthetic */ void d(Context context, GpsPoint gpsPoint, CustomAlertDialog customAlertDialog, View view) {
        e(1, 0);
        c(context, gpsPoint);
        customAlertDialog.cancel();
    }

    public static /* synthetic */ void e(Context context, GpsPoint gpsPoint, CustomAlertDialog customAlertDialog, View view) {
        e(1, 2);
        e(context, gpsPoint);
        customAlertDialog.cancel();
    }

    public static void c(final Context context, final String str, final String str2) {
        a(str, str2, 1);
        View viewInflate = View.inflate(context, R.layout.dialog_feedback_text, null);
        final boolean[] zArr = {false};
        final HealthEditText healthEditText = (HealthEditText) viewInflate.findViewById(R.id.edit_desc);
        final CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(context).a(viewInflate).d(R.string.IDS_clock_wrong_route_feed_back).a(R.string.IDS_device_release_user_profile_log_collect_cancel, new DialogInterface.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils.6
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                RunningRouteUtils.a(str, str2, 3);
                LogUtil.a("Track_RunningRouteUtils", "showFeedBackDialog click cancel");
            }
        }).d(R.string.IDS_contact_confirm, new DialogInterface.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                LogUtil.a("Track_RunningRouteUtils", "showFeedBackDialog click agree");
                RunningRouteUtils.a(str, str2, 2);
                if (zArr[0]) {
                    RunningRouteUtils.a(context, healthEditText.getText().toString(), str);
                }
            }
        }).b();
        final HealthButton healthButton = (HealthButton) customAlertDialogB.findViewById(R.id.dialog_btn_positive);
        healthButton.setTextColor(context.getColor(R.color.common_colorAccent_disabled));
        healthButton.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Track_RunningRouteUtils", "showFeedBackDialog click agree");
                RunningRouteUtils.a(str, str2, 2);
                if (zArr[0]) {
                    RunningRouteUtils.a(context, healthEditText.getText().toString(), str);
                    customAlertDialogB.dismiss();
                }
            }
        });
        ((HealthButtonBarLayout) customAlertDialogB.findViewById(R.id.button_bar)).setDividerDrawable(ContextCompat.getDrawable(context, R.drawable.custom_dialog_divider_vertical));
        healthEditText.addTextChangedListener(new TextWatcher() { // from class: com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils.9
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (!TextUtils.isEmpty(charSequence)) {
                    zArr[0] = true;
                    healthButton.setTextColor(context.getColor(R.color.health_commonui_healthbutton_text_normal));
                } else {
                    zArr[0] = false;
                    healthButton.setTextColor(context.getColor(R.color.common_colorAccent_disabled));
                }
            }
        });
        customAlertDialogB.setCancelable(false);
        if (customAlertDialogB.isShowing()) {
            return;
        }
        customAlertDialogB.show();
        customAlertDialogB.setCanceledOnTouchOutside(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(String str, String str2, int i) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("event", Integer.valueOf(i));
        map.put("routeID", str);
        map.put("routeIName", str2);
        lmf.d().c(com.huawei.haf.application.BaseApplication.b(), "1040089", map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(final Context context, String str, String str2) {
        gch.b().feedbackHotPathInfo(new gcr.e().b(str).d(str2).a(), new UiCallback<CloudCommonReponse>() { // from class: com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils.10
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str3) {
                LogUtil.a("Track_RunningRouteUtils", "feedBackRouteInfo fail");
                Context context2 = context;
                Toast.makeText(context2, context2.getString(R.string.IDS_network_connect_error), 0).show();
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(CloudCommonReponse cloudCommonReponse) {
                LogUtil.a("Track_RunningRouteUtils", "feedBackRouteInfo success");
                Context context2 = context;
                Toast.makeText(context2, context2.getString(R.string.IDS_clock_wrong_route_feed_back_toast), 0).show();
            }
        });
    }

    public static void e(Context context, int i, GpsPoint gpsPoint) {
        if (i == MapInfoEnum.MAP_GAODE.getId()) {
            c(context, gpsPoint);
        } else if (i == MapInfoEnum.MAP_BAIDU.getId()) {
            b(context, gpsPoint);
        } else if (i == MapInfoEnum.MAP_TENCENT.getId()) {
            e(context, gpsPoint);
        }
    }

    public static void c(Context context, GpsPoint gpsPoint) {
        if (!lsj.c(context, "com.autonavi.minimap")) {
            Toast.makeText(context, "please install map", 1).show();
            return;
        }
        if (!(context instanceof Activity)) {
            LogUtil.e("Track_RunningRouteUtils", "not activity");
            return;
        }
        if (a() == null) {
            LogUtil.a("Track_RunningRouteUtils", "latLng is null");
            return;
        }
        StringBuffer stringBuffer = new StringBuffer("androidamap://viewReGeo?sourceApplication=amap&lat=");
        stringBuffer.append(gpsPoint.getLatitude()).append("&lon=").append(gpsPoint.getLongitude()).append("&keywords=&dev=0&style=2");
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(stringBuffer.toString()));
        intent.setPackage("com.autonavi.minimap");
        qrs.c(intent, "com.autonavi.minimap", context, context.getResources().getString(R.string.IDS_hw_show_data_tarck_map_type_setting_gaode));
    }

    public static void b(Context context, GpsPoint gpsPoint) {
        if (!lsj.c(context, "com.baidu.BaiduMap")) {
            Toast.makeText(context, "please install map", 1).show();
            return;
        }
        if (!(context instanceof Activity)) {
            LogUtil.e("Track_RunningRouteUtils", "not activity");
            return;
        }
        if (a() == null) {
            LogUtil.a("Track_RunningRouteUtils", "latLng is null");
            return;
        }
        jpg jpgVarD = d(gpsPoint);
        qrs.c(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("baidumap://map/geocoder?location=" + jpgVarD.d + "," + jpgVarD.f38787a)), "com.baidu.BaiduMap", context, context.getResources().getString(R.string.IDS_clock_rank_baidu_map));
    }

    public static void e(Context context, GpsPoint gpsPoint) {
        if (!lsj.c(context, "com.tencent.map")) {
            Toast.makeText(context, "please install map", 1).show();
            return;
        }
        if (!(context instanceof Activity)) {
            LogUtil.e("Track_RunningRouteUtils", "not activity");
            return;
        }
        if (a() == null) {
            LogUtil.a("Track_RunningRouteUtils", "latLng is null");
            return;
        }
        qrs.c(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("qqmap://map/routeplan?type=drive&from=&fromcoord=&to=目的地&tocoord=" + gpsPoint.getLatitude() + "," + gpsPoint.getLongitude() + "&policy=0&referer=appName")), "com.tencent.map", context, context.getResources().getString(R.string.IDS_clock_rank_tencent_map));
    }

    private static void e(int i, int i2) {
        HashMap map = new HashMap();
        map.put("click", 1);
        if (i2 == 0) {
            map.put("mapType", "高德");
        } else if (i2 == 1) {
            map.put("mapType", "百度");
        } else if (i2 == 2) {
            map.put("mapType", "腾讯");
        }
        map.put("event", Integer.valueOf(i));
        lmf.d().c(com.huawei.haf.application.BaseApplication.b(), "1040086", map, 0);
    }

    public static jpg d(GpsPoint gpsPoint) {
        double longitude = gpsPoint.getLongitude();
        double latitude = gpsPoint.getLatitude();
        double dSqrt = Math.sqrt((longitude * longitude) + (latitude * latitude)) + (Math.sin(latitude * 52.35987755982988d) * 2.0E-5d);
        double dAtan2 = Math.atan2(latitude, longitude) + (Math.cos(longitude * 52.35987755982988d) * 3.0E-6d);
        return new jpg((Math.sin(dAtan2) * dSqrt) + 0.006d, (Math.cos(dAtan2) * dSqrt) + 0.0065d);
    }

    public static void c(final HealthTextView healthTextView, String str) {
        if (healthTextView == null) {
            LogUtil.a("Track_RunningRouteUtils", "setUserNameAnonymization, textView is null");
            return;
        }
        if (str == null) {
            healthTextView.setText("*");
            return;
        }
        if (str.length() == 0 || str.length() == 1) {
            healthTextView.setText("*");
            return;
        }
        if (str.length() == 2) {
            healthTextView.setText(str.charAt(0) + "*");
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for (int i = 1; i < str.length() - 1; i++) {
            sb.append("*");
        }
        sb.append(str.charAt(str.length() - 1));
        healthTextView.setText(sb.toString());
        healthTextView.post(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils.14
            @Override // java.lang.Runnable
            public void run() {
                while (RunningRouteUtils.b(healthTextView, sb.toString())) {
                    sb.replace(2, 3, "");
                }
                healthTextView.setText(sb.toString());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(TextView textView, String str) {
        if (textView == null) {
            LogUtil.e("Track_RunningRouteUtils", "textView is null");
            return false;
        }
        TextPaint paint = textView.getPaint();
        paint.setTextSize(textView.getTextSize());
        return ((int) paint.measureText(str)) > textView.getWidth();
    }

    public static List<Attribute> d(Context context) {
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(new Attribute(1, context.getString(R.string.IDS_track_runing_route_mecca)));
        arrayList.add(new Attribute(2, context.getString(R.string.IDS_track_runing_route_popularity)));
        arrayList.add(new Attribute(3, context.getString(R.string.IDS_track_runing_route_recommended)));
        arrayList.add(new Attribute(4, context.getString(R.string.IDS_track_runing_route_label_hot)));
        return arrayList;
    }

    /* JADX INFO: renamed from: com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils$8, reason: invalid class name */
    class AnonymousClass8 extends TypeToken<Map<String, gde>> {
        AnonymousClass8() {
        }
    }

    public static double a(jpg jpgVar, jpg jpgVar2) {
        if (jpgVar == null || jpgVar2 == null) {
            LogUtil.a("Track_RunningRouteUtils", "latLng is null");
            return 0.0d;
        }
        LogUtil.d("Track_RunningRouteUtils", "latLng1 = (", Double.valueOf(jpgVar.d), ",", Double.valueOf(jpgVar.f38787a), "), latLng2 = (", Double.valueOf(jpgVar2.d), ",", Double.valueOf(jpgVar2.f38787a), Constants.RIGHT_BRACKET_ONLY);
        double d2 = (jpgVar.d * 3.141592653589793d) / 180.0d;
        double d3 = (jpgVar2.d * 3.141592653589793d) / 180.0d;
        return Math.round(((Math.asin(Math.sqrt(Math.pow(Math.sin((d2 - d3) / 2.0d), 2.0d) + ((Math.cos(d2) * Math.cos(d3)) * Math.pow(Math.sin((((jpgVar.f38787a * 3.141592653589793d) / 180.0d) - ((jpgVar2.f38787a * 3.141592653589793d) / 180.0d)) / 2.0d), 2.0d)))) * 2.0d) * 6378137.0d) * 10000.0d) / 10000.0d;
    }

    public static jpg c(GpsPoint gpsPoint) {
        if (gpsPoint == null) {
            LogUtil.a("Track_RunningRouteUtils", "gpsPoint is null");
            return null;
        }
        return new jpg(gpsPoint.getLatitude(), gpsPoint.getLongitude());
    }

    public static String e() {
        return buh.e("COUNTRY_ID");
    }

    public static void b(String str) {
        buh.d("COUNTRY_ID", str);
    }

    public static String c(int i, int i2, double d2) {
        return a(i, i2, d2, 2);
    }

    public static String a(int i, int i2, double d2, int i3) {
        boolean zF = UnitUtil.f();
        double d3 = d2 / 1000.0d;
        double dE = UnitUtil.e(d3, 3);
        if (zF) {
            d3 = dE;
        }
        if (zF) {
            i = i2;
        }
        return gzx.d(i, (int) d3, UnitUtil.e(d3, 1, i3));
    }

    public static String c(long j) {
        return (j / 60) + "'" + (j % 60) + "''";
    }

    public static Bitmap a(String str) {
        byte[] bArrDecode = Base64.decode(str, 0);
        return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
    }

    public static void c(Bitmap bitmap, Context context) {
        final Dialog dialog = new Dialog(context);
        ImageView imageView = new ImageView(context);
        imageView.setImageBitmap(bitmap);
        dialog.setContentView(imageView);
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        dialog.show();
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                dialog.cancel();
            }
        });
    }

    public static void a(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "true";
        }
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("result", str);
        map.put("from", Integer.valueOf(i));
        lmf.d().c(com.huawei.haf.application.BaseApplication.b(), "1040084", map, 0);
    }

    public static boolean i() {
        return SharedPreferenceManager.b(Integer.toString(20002), "routeAutoRedPointShow", true);
    }

    public static void j() {
        SharedPreferenceManager.a(Integer.toString(20002), "routeAutoRedPointShow", false);
    }

    public static void d() {
        jpg jpgVarA = a();
        if ((!npn.c(BaseApplication.getContext()) && jpgVarA == null) || k()) {
            LogUtil.a("Track_RunningRouteUtils", "location is invalid");
            a(0, "PositioningFailed");
            jpgVarA = RunningRouteConstants.f10567a;
        }
        jdn.d(jpgVarA);
        f();
    }

    private static void f() {
        if (TextUtils.isEmpty(e())) {
            gch.b().getCityInfoWithGps(new gcy.e().a(jdn.i().d).c(jdn.i().f38787a).e(), new UiCallback<gdc>() { // from class: com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils.4
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.j("Track_RunningRouteUtils", "initCountryIdWithGps failed, errorCode = ", Integer.valueOf(i), ", errorInfo = ", str);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(gdc gdcVar) {
                    String strC = gdcVar.c();
                    RunningRouteUtils.b(strC);
                    LogUtil.a("Track_RunningRouteUtils", "countryId = ", strC);
                }
            });
        }
    }

    private static boolean k() {
        jpg jpgVarI = jdn.i();
        return jpgVarI != null && jfn.b(jpgVarI.d, jpgVarI.f38787a);
    }

    public static RouteData d(long j) {
        HealthDataCloudFactory healthDataCloudFactory = new HealthDataCloudFactory(com.huawei.haf.application.BaseApplication.b());
        GetRouteDetailReq getRouteDetailReq = new GetRouteDetailReq();
        getRouteDetailReq.setType(1);
        getRouteDetailReq.setVersion(j);
        GetSingleRouteDetailRsp getSingleRouteDetailRsp = (GetSingleRouteDetailRsp) oet.d().e(getRouteDetailReq.getSingleRouteUrl(), healthDataCloudFactory.getHeaders(), ofe.c(healthDataCloudFactory.getBody(getRouteDetailReq)), GetSingleRouteDetailRsp.class);
        if (getSingleRouteDetailRsp != null && getSingleRouteDetailRsp.getResultCode().intValue() == 0 && getSingleRouteDetailRsp.getRouteData() != null) {
            return getSingleRouteDetailRsp.getRouteData();
        }
        LogUtil.j("Track_RunningRouteUtils", "sendLocalRouteData fail");
        return null;
    }

    public static RouteTrackInfo d(gdm gdmVar) {
        RouteTrackInfo routeTrackInfo = new RouteTrackInfo();
        if (gdmVar == null) {
            LogUtil.e("Track_RunningRouteUtils", "detailInfo is null");
            return routeTrackInfo;
        }
        routeTrackInfo.setTrackId(gdmVar.o());
        routeTrackInfo.setTrackType((gdmVar.g() == 1 ? RouteType.DRAW : RouteType.DEFAULT).routeType());
        routeTrackInfo.setTrackName(gdmVar.l());
        if (gdmVar.m() == 3 && gdmVar.e() >= 0) {
            routeTrackInfo.setTotalTime(gdmVar.e());
        } else {
            routeTrackInfo.setTotalTime((long) ((gdmVar.y() / 1000.0d) * 420.0d));
        }
        routeTrackInfo.setSceneType(d.getOrDefault(Integer.valueOf(gdmVar.m()), Integer.valueOf(SceneType.WR.sceneType())).intValue());
        boolean z = !TextUtils.equals(AMapLocation.COORD_TYPE_WGS84, gdmVar.c());
        d(gdmVar.p(), z, routeTrackInfo);
        c(gdmVar.a(), z, routeTrackInfo);
        if (gdmVar.m() == 1) {
            routeTrackInfo.setShowAltitude(true);
            routeTrackInfo.setSupportClimb(true);
        }
        return routeTrackInfo;
    }

    private static void d(List<GpsPoint> list, boolean z, RouteTrackInfo routeTrackInfo) {
        if (njy.e(list)) {
            ReleaseLogUtil.a("Track_RunningRouteUtils", "TrackPoint is empty");
            routeTrackInfo.setPoints(new ArrayList());
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (GpsPoint gpsPoint : list) {
            if (gpsPoint == null) {
                ReleaseLogUtil.a("Track_RunningRouteUtils", "gpsPoint is null in setTrackPoint");
            } else {
                RouteTrackPoint routeTrackPoint = new RouteTrackPoint();
                jpg jpgVarA = a(z, gpsPoint);
                routeTrackPoint.setLatitude(jpgVarA.d);
                routeTrackPoint.setLongitude(jpgVarA.f38787a);
                routeTrackPoint.setAltitude(gpsPoint.getAltitude());
                arrayList.add(routeTrackPoint);
            }
        }
        routeTrackInfo.setPoints(arrayList);
        routeTrackInfo.setPointsNum(arrayList.size());
    }

    private static void c(gcl gclVar, boolean z, RouteTrackInfo routeTrackInfo) {
        if (gclVar == null || njy.e(gclVar.c())) {
            LogUtil.j("Track_RunningRouteUtils", "no cpPoint");
            routeTrackInfo.setMarkerPoints(new ArrayList());
            return;
        }
        List<GpsPoint> listC = gclVar.c();
        ArrayList arrayList = new ArrayList(listC.size());
        for (GpsPoint gpsPoint : listC) {
            if (gpsPoint == null) {
                ReleaseLogUtil.a("Track_RunningRouteUtils", "cpGps is null in setMarkerPoint");
            } else {
                RouteMarkerPoint routeMarkerPoint = new RouteMarkerPoint();
                jpg jpgVarA = a(z, gpsPoint);
                routeMarkerPoint.setLatitude(jpgVarA.d);
                routeMarkerPoint.setLongitude(jpgVarA.f38787a);
                routeMarkerPoint.setAltitude(gpsPoint.getAltitude());
                routeMarkerPoint.setSerial(gpsPoint.getIndex());
                routeMarkerPoint.setIndexOfTrackPoint(gpsPoint.getPathIndex());
                arrayList.add(routeMarkerPoint);
            }
        }
        routeTrackInfo.setTargetNum(gclVar.b());
        routeTrackInfo.setMarkerPoints(arrayList);
        routeTrackInfo.setMarkerPointsNum(arrayList.size());
    }

    private static jpg a(boolean z, GpsPoint gpsPoint) {
        return z ? izy.e(new double[]{gpsPoint.getLatitude(), gpsPoint.getLongitude()}) : new jpg(gpsPoint.getLatitude(), gpsPoint.getLongitude());
    }

    public static List<String> c(List<gdp> list, List<Integer> list2) {
        if (njy.e(list) || njy.e(list2)) {
            LogUtil.e("Track_RunningRouteUtils", "pathAttributes or attributeIds is empty");
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list2.size());
        Map map = (Map) list.stream().collect(Collectors.toMap(new Function() { // from class: jdm
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((gdp) obj).b());
            }
        }, new Function() { // from class: jdl
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((gdp) obj).d();
            }
        }, new BinaryOperator() { // from class: jdu
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return RunningRouteUtils.e((String) obj, (String) obj2);
            }
        }));
        for (Integer num : list2) {
            if (num.intValue() == 0) {
                LogUtil.j("Track_RunningRouteUtils", "attributeId == 0 means all");
            } else if (map.containsKey(num)) {
                arrayList.add((String) map.get(num));
            }
        }
        return arrayList;
    }

    public static boolean g() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "Track_RunningRouteUtils");
        if (deviceInfo == null) {
            ReleaseLogUtil.e("Track_RunningRouteUtils", "deviceInfo is null");
            return false;
        }
        String hiLinkDeviceId = deviceInfo.getHiLinkDeviceId();
        if (TextUtils.isEmpty(hiLinkDeviceId)) {
            ReleaseLogUtil.e("Track_RunningRouteUtils", "hiLinkDeviceId is null");
            return false;
        }
        for (String str : e) {
            if (hiLinkDeviceId.contains(str)) {
                return true;
            }
        }
        return false;
    }

    private static boolean m() {
        return SharedPreferenceManager.b(Integer.toString(20002), "displayed_guide_dialog", false);
    }

    private static void l() {
        SharedPreferenceManager.a(Integer.toString(20002), "displayed_guide_dialog", true);
    }

    public static void b(Context context, final GuideDialogCallBack guideDialogCallBack) {
        if (context == null) {
            LogUtil.a("Track_RunningRouteUtils", "context is null in showRouteDrawGuideDialog");
        } else {
            if (m()) {
                LogUtil.a("Track_RunningRouteUtils", "isDisplayedGuideDialog is true");
                return;
            }
            new CustomAlertDialog.Builder(context).a(View.inflate(context, R.layout.dialog_route_draw_guide, null)).d(R.string.IDS_track_route_draw_view_recommended_routes, new DialogInterface.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils.3
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    GuideDialogCallBack guideDialogCallBack2 = guideDialogCallBack;
                    if (guideDialogCallBack2 != null) {
                        guideDialogCallBack2.showRecommendedRoute();
                    }
                }
            }).d(R.string.IDS_track_route_draw_title_graffiti_guides).e(true).b().show();
            l();
        }
    }

    public static void e(final int i, final long j) {
        if (j < 1000) {
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: jdx
            @Override // java.lang.Runnable
            public final void run() {
                RunningRouteUtils.d(i, j);
            }
        });
    }

    public static /* synthetic */ void d(int i, long j) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(2);
        linkedHashMap.put("errorCode", String.valueOf(i));
        linkedHashMap.put(WiseOpenHianalyticsData.UNION_COSTTIME, String.valueOf(j));
        OpAnalyticsUtil.getInstance().setKeyProcessEvent(OperationKey.HEALTH_APP_RUN_ROUTE_COST_TIME_2129017.value(), linkedHashMap);
    }
}
