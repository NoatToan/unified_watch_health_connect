package com.huawei.ui.main.stories.route.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import com.amap.api.location.AMapLocation;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.featureuserprofile.route.navigationparser.NavigationFileParser;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.router.AppRouterUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.userprofilemgr.api.RouteApi;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.userprofilemgr.model.RouteResultCallBack;
import com.huawei.healthcloud.plugintrack.trackanimation.gpsutil.LatLong;
import com.huawei.healthcloud.plugintrack.ui.map.HiMapHolder;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapLoadedCallback;
import com.huawei.healthcloud.plugintrack.ui.map.SyncMapCallback;
import com.huawei.healthcloud.plugintrack.util.RouteTransferDataHolder;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.healthdatacloud.HealthDataCloudFactory;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.unite.RouteData;
import com.huawei.hwcloudmodel.model.unite.RouteExtendData;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwfoundationmodel.trackmodel.MarkPoint;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.route.CorrectTrackPoint;
import com.huawei.route.GetRouteDetailReq;
import com.huawei.route.GetSingleRouteDetailRsp;
import com.huawei.route.Point;
import com.huawei.route.RouteMarkerPoint;
import com.huawei.route.RouteOutputForApp;
import com.huawei.route.RouteTrackPoint;
import com.huawei.route.RouteType;
import com.huawei.route.SegmentInfo;
import com.huawei.route.TrackInfoModel;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;
import com.huawei.ui.commonui.linechart.view.HwHealthLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import com.huawei.ui.commonui.linechart.view.IHwHealthLineDataSet;
import com.huawei.ui.commonui.popupview.PopViewList;
import com.huawei.ui.commonui.scrollview.HealthNestedScrollView;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.route.activity.MyRouteDetailActivity;
import com.huawei.ui.main.stories.route.view.MapContainer;
import defpackage.izt;
import defpackage.jaa;
import defpackage.jer;
import defpackage.jfk;
import defpackage.jpg;
import defpackage.jpk;
import defpackage.jrm;
import defpackage.jrs;
import defpackage.jrv;
import defpackage.lmf;
import defpackage.lrd;
import defpackage.njm;
import defpackage.njy;
import defpackage.oet;
import defpackage.ofe;
import defpackage.qnt;
import defpackage.qpx;
import defpackage.qqp;
import defpackage.qqs;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qrt;
import defpackage.qsp;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class MyRouteDetailActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomTextAlertDialog f28784a;
    private LinearLayout ab;
    private double ae;
    private HealthTextView af;
    private double ag;
    private boolean ah;
    private RouteData aj;
    private RelativeLayout ak;
    private HealthTextView al;
    private HealthTextView am;
    private RouteTransferDataHolder ao;
    private HealthButton ap;
    private HealthScrollView aq;
    private int ar;
    private HealthTextView at;
    private HealthTextView au;
    private View av;
    private HealthButton aw;
    private HealthTextView ax;
    private HealthTextView ay;
    private HealthTextView az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HwHealthLineChart f28785b;
    private HealthTextView ba;
    private LinearLayout bb;
    private View bd;
    private HealthTextView be;
    private HealthTextView bf;
    private HealthTextView bg;
    private HealthTextView bh;
    private View bj;
    private CustomTextAlertDialog bm;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f28786c;
    private ImageButton e;
    private ImageButton g;
    private HealthImageView h;
    private HealthImageView i;
    private int k;
    private List<IHwHealthLineDataSet> l;
    private HealthDivider n;
    private CustomTitleBar o;
    private String p;
    private View q;
    private String r;
    private int s;
    private View t;
    private boolean u;
    private String v;
    private HiMapHolder w;
    private HealthNestedScrollView x;
    private LinearLayout y;
    private MapContainer z;
    private final int bc = Color.rgb(66, 150, 248);
    private int ac = 0;
    private Context f = null;
    private final List<Point> ai = new ArrayList();
    private InterfaceHiMap aa = null;
    private final a d = new a(this);
    private final List<jpg> an = new ArrayList();
    private final List<MarkPoint> ad = new ArrayList();
    private final List<Integer> m = new ArrayList();
    private List<SegmentInfo> as = new ArrayList();
    private final jfk j = new jfk();

    public static /* synthetic */ boolean b(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_my_route_detail);
        clearBackgroundDrawable();
        this.f = this;
        this.ao = new RouteTransferDataHolder(this);
        u();
        a(getIntent());
        o();
        ReleaseLogUtil.c("Track_MyTrackDetailActivity", "onCreate end");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.ak.setVisibility(0);
        HiMapHolder hiMapHolder = this.w;
        if (hiMapHolder != null) {
            hiMapHolder.e();
        }
        a(intent);
    }

    private void a(final Intent intent) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: wlk
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.d.b(intent);
            }
        });
    }

    public /* synthetic */ void b(Intent intent) throws Throwable {
        this.ai.clear();
        this.an.clear();
        this.ad.clear();
        e(intent);
        RouteData routeData = this.aj;
        if (routeData == null || njy.e(routeData.getRoutePoints())) {
            LogUtil.a("Track_MyTrackDetailActivity", "mRouteData is error");
            finish();
        } else {
            w();
            ad();
            b();
        }
    }

    private void w() {
        String routeName = this.aj.getRouteName();
        this.p = routeName;
        this.ao.d(routeName, this.aj);
        this.ao.m();
        if (this.ao.i() != null && this.aj.getRouteDistance() <= 0.0d) {
            this.aj.setRouteDistance(this.ao.i().getTotalDist());
        }
        if (this.ao.i() != null && njy.b(this.ao.i().getCaliPoints())) {
            for (CorrectTrackPoint correctTrackPoint : this.ao.i().getCaliPoints()) {
                if (correctTrackPoint != null) {
                    this.ai.add(new Point(correctTrackPoint.getLon(), correctTrackPoint.getLat(), correctTrackPoint.getAlt(), 0L));
                }
            }
        } else {
            this.ai.addAll(this.aj.getRoutePoints());
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 11;
        this.d.sendMessage(messageObtain);
    }

    private void ad() {
        r();
        x();
        q();
        this.ag = this.ao.h().getMaxAltitude();
        this.ae = this.ao.h().getMinAltitude();
        if (njy.e(this.ad) && Math.abs(this.ag - this.ae) <= Double.MIN_VALUE) {
            HandlerExecutor.b(new Runnable() { // from class: wkx
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.a();
                }
            });
        }
        if (njy.e(this.an) || this.ao.i() == null || this.p == null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 8;
            this.d.sendMessage(messageObtain);
        } else {
            Message messageObtain2 = Message.obtain();
            messageObtain2.what = 7;
            this.d.sendMessage(messageObtain2);
            Message messageObtain3 = Message.obtain();
            messageObtain3.what = 13;
            this.d.sendMessage(messageObtain3);
        }
    }

    public /* synthetic */ void a() {
        this.x.setNestedScrollingEnabled(false);
        this.bd.setVisibility(0);
        this.bj.setVisibility(8);
        ViewGroup.LayoutParams layoutParams = this.bd.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.height = (int) ((qrs.g(this) / 2.0f) - qre.a(R.dimen.health_common_40dp));
        this.bd.setLayoutParams(layoutParams);
        this.bd.setOnClickListener(new View.OnClickListener() { // from class: wlm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("Track_MyTrackDetailActivity", "mMarkPoints and altitude gone");
            }
        });
    }

    private void r() {
        List<RouteTrackPoint> points = this.ao.h().getPoints();
        if (njy.e(points)) {
            ReleaseLogUtil.c("Track_MyTrackDetailActivity", "initMapType points == null ");
        } else {
            RouteTrackPoint routeTrackPoint = points.get(0);
            this.ac = jaa.a(this.f, routeTrackPoint.getLatitude(), routeTrackPoint.getLongitude());
        }
    }

    private void x() {
        List<RouteTrackPoint> points = this.ao.h().getPoints();
        if (njy.e(points)) {
            ReleaseLogUtil.c("Track_MyTrackDetailActivity", "initTrackPoint points == null ");
            return;
        }
        int size = points.size();
        d(size);
        ReleaseLogUtil.c("Track_MyTrackDetailActivity", "initTrackPoint points size ", Integer.valueOf(size));
        ArrayList arrayList = new ArrayList(size);
        for (RouteTrackPoint routeTrackPoint : points) {
            arrayList.add(new jpg(routeTrackPoint.getLatitude(), routeTrackPoint.getLongitude()));
        }
        this.an.addAll(izt.d(arrayList, AMapLocation.COORD_TYPE_WGS84, this.ac));
    }

    private void q() {
        if (this.aj.getRouteType() == RouteType.EXP.routeType()) {
            List<RouteMarkerPoint> markerPoints = this.ao.h().getMarkerPoints();
            if (njy.e(markerPoints)) {
                ReleaseLogUtil.c("Track_MyTrackDetailActivity", "markerPoints == null ");
                return;
            }
            ReleaseLogUtil.c("Track_MyTrackDetailActivity", "initMarkPoint markPoint size = ", Integer.valueOf(markerPoints.size()));
            for (RouteMarkerPoint routeMarkerPoint : markerPoints) {
                jpg jpgVarA = izt.a(new jpg(routeMarkerPoint.getLatitude(), routeMarkerPoint.getLongitude()), AMapLocation.COORD_TYPE_WGS84, this.ac);
                MarkPoint markPoint = new MarkPoint();
                markPoint.c(routeMarkerPoint.getIndexOfTrackPoint());
                markPoint.d(routeMarkerPoint.getType());
                markPoint.a(routeMarkerPoint.getColor());
                markPoint.a(jpgVarA.f38787a);
                markPoint.c(jpgVarA.d);
                markPoint.b(1);
                this.ad.add(markPoint);
            }
            return;
        }
        j();
        if (njy.e(this.as)) {
            LogUtil.j("Track_MyTrackDetailActivity", "initMarkPoint mSegmentInfoList is empty or outOfBounds");
            return;
        }
        for (int i = 0; i < this.as.size() - 1; i++) {
            SegmentInfo segmentInfo = this.as.get(i);
            jpg jpgVarA2 = izt.a(new jpg(segmentInfo.getLat(), segmentInfo.getLon()), AMapLocation.COORD_TYPE_WGS84, this.ac);
            MarkPoint markPoint2 = new MarkPoint();
            markPoint2.c(segmentInfo.getSerial());
            markPoint2.d(segmentInfo.getType());
            markPoint2.a(segmentInfo.getColor());
            markPoint2.a(jpgVarA2.f38787a);
            markPoint2.c(jpgVarA2.d);
            markPoint2.b(1);
            this.ad.add(markPoint2);
        }
    }

    private void d(int i) {
        HashMap map = new HashMap(1);
        map.put("click", "1");
        map.put("ROUTE_DETAIL_POINT_SIZE", Integer.valueOf(i));
        lmf.d().c(this, AnalyticsValue.MY_ROUTE_DETAIL_ACTIVITY_EVENT.value(), map, 0);
    }

    private void e(Intent intent) throws Throwable {
        if (intent != null) {
            this.v = intent.getStringExtra("fromFlag");
            Uri uriB = AppRouterUtils.b(intent);
            if (TextUtils.isEmpty(this.v) && uriB != null) {
                this.v = uriB.getQueryParameter("fromFlag");
            }
            if ("route_flag".equals(this.v)) {
                this.aj = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getRouteData();
                Message messageObtain = Message.obtain();
                messageObtain.what = 6;
                this.d.sendMessage(messageObtain);
            } else if ("file_flag".equals(this.v)) {
                c(intent);
            } else if ("cloud_flag".equals(this.v)) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 6;
                this.d.sendMessage(messageObtain2);
                c(d(intent, uriB));
            } else {
                LogUtil.a("Track_MyTrackDetailActivity", "obtainIntent = ", this.v);
            }
            String stringExtra = intent.getStringExtra("from");
            LogUtil.a("Track_MyTrackDetailActivity", "from: ", stringExtra);
            if (!TextUtils.isEmpty(stringExtra) && stringExtra.startsWith("com.tencent.mm")) {
                this.s = 1;
            }
        }
    }

    private void c(Intent intent) throws Throwable {
        String stringExtra = intent.getStringExtra("filePath");
        Message messageObtain = Message.obtain();
        messageObtain.what = 6;
        if (b(stringExtra)) {
            if (this.r.equals(NavigationFileParser.KMZ)) {
                stringExtra = qrt.a(stringExtra, NavigationFileParser.KML);
                this.r = NavigationFileParser.KML;
            }
            d(stringExtra);
            messageObtain.obj = true;
        } else {
            LogUtil.a("Track_MyTrackDetailActivity", "obtainIntent file is error");
            messageObtain.obj = false;
        }
        this.d.sendMessage(messageObtain);
    }

    private boolean b(String str) {
        if (str == null) {
            LogUtil.j("Track_MyTrackDetailActivity", "isMatchGpsFile filePath is null");
            return false;
        }
        if (str.contains("gpx")) {
            this.r = "gpx";
            return true;
        }
        if (str.contains(NavigationFileParser.KML)) {
            this.r = NavigationFileParser.KML;
            return true;
        }
        if (str.contains(NavigationFileParser.TCX)) {
            this.r = NavigationFileParser.TCX;
            return true;
        }
        if (str.contains(NavigationFileParser.KMZ)) {
            this.r = NavigationFileParser.KMZ;
            return true;
        }
        this.r = "unknown";
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private void d(String str) throws Throwable {
        Exception e;
        Throwable th;
        FileInputStream fileInputStream;
        RouteApi routeApi = (RouteApi) Services.d("module_route", RouteApi.class);
        FileInputStream fileInputStream2 = null;
        int iStartParser = 0;
        try {
            try {
                File file = new File(str);
                if (file.exists()) {
                    long jI = FileUtils.i(file);
                    if (jI >= 83886080) {
                        LogUtil.e("Track_MyTrackDetailActivity", "file size : ", Double.valueOf(jI / 1048576.0d), " MB", " is too large");
                        qpx.b(BaseApplication.b(), R.string.IDS_my_route_parse_error);
                        return;
                    }
                    String name = file.getName();
                    if (name.contains(".")) {
                        name = name.substring(0, name.indexOf("."));
                    }
                    this.p = name;
                    fileInputStream = new FileInputStream(file.getPath());
                    try {
                        iStartParser = routeApi.startParser(fileInputStream, this.r);
                        fileInputStream2 = fileInputStream;
                    } catch (IOException e2) {
                        e = e2;
                        fileInputStream2 = fileInputStream;
                        LogUtil.e("Track_MyTrackDetailActivity", "RuntimeException | IOException | XmlPullParserException = ", e.getMessage());
                        qpx.b(BaseApplication.b(), R.string.IDS_my_route_parse_error);
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (IOException unused) {
                                LogUtil.e("Track_MyTrackDetailActivity", "inputStream close is error");
                            }
                        }
                    } catch (RuntimeException e3) {
                        e = e3;
                        fileInputStream2 = fileInputStream;
                        LogUtil.e("Track_MyTrackDetailActivity", "RuntimeException | IOException | XmlPullParserException = ", e.getMessage());
                        qpx.b(BaseApplication.b(), R.string.IDS_my_route_parse_error);
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                    } catch (XmlPullParserException e4) {
                        e = e4;
                        fileInputStream2 = fileInputStream;
                        LogUtil.e("Track_MyTrackDetailActivity", "RuntimeException | IOException | XmlPullParserException = ", e.getMessage());
                        qpx.b(BaseApplication.b(), R.string.IDS_my_route_parse_error);
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused2) {
                                LogUtil.e("Track_MyTrackDetailActivity", "inputStream close is error");
                            }
                        }
                        throw th;
                    }
                }
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused3) {
                        LogUtil.e("Track_MyTrackDetailActivity", "inputStream close is error");
                    }
                }
                if (iStartParser == 1) {
                    RouteData routeData = new RouteData();
                    this.aj = routeData;
                    routeData.setRouteName(this.p);
                    this.aj.setSportType(routeApi.getSportType());
                    this.aj.setRoutePoints(routeApi.getPoints());
                    this.aj.setRouteDistance(routeApi.getSportTotalDistance());
                    this.aj.setRouteTime(routeApi.getSportTotalTime());
                    RouteExtendData routeExtendData = new RouteExtendData();
                    routeExtendData.setCumulativeClimb(routeApi.getCumulativeClimb());
                    routeExtendData.setCumulativeDecrease(routeApi.getCumulativeDecrease());
                    routeExtendData.setRouteType(routeApi.getRouteType());
                    this.aj.setExtendData(new Gson().toJson(routeExtendData));
                    this.aj.setType(1);
                    this.aj.convertSceneType();
                    LogUtil.j("Track_MyTrackDetailActivity", "mRouteData json=", new Gson().toJson(this.aj));
                    return;
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
            }
        } catch (IOException | RuntimeException | XmlPullParserException e5) {
            e = e5;
        }
        LogUtil.j("Track_MyTrackDetailActivity", "parser is error");
        qpx.b(BaseApplication.b(), R.string.IDS_my_route_parse_error);
    }

    private void c(long j) {
        if (j == 0) {
            LogUtil.e("Track_MyTrackDetailActivity", "routeId is incorrect.");
            finish();
            return;
        }
        if (!CommonUtil.ab(this)) {
            qrs.e((Context) this, MyRouteDetailActivity.class.getName(), getString(R.string.IDS_my_track_detail), false);
            finish();
            return;
        }
        HealthDataCloudFactory healthDataCloudFactory = new HealthDataCloudFactory(BaseApplication.b());
        GetRouteDetailReq getRouteDetailReq = new GetRouteDetailReq();
        getRouteDetailReq.setType(1);
        getRouteDetailReq.setVersion(j);
        GetSingleRouteDetailRsp getSingleRouteDetailRsp = (GetSingleRouteDetailRsp) oet.d().e(getRouteDetailReq.getSingleRouteUrl(), healthDataCloudFactory.getHeaders(), ofe.c(healthDataCloudFactory.getBody(getRouteDetailReq)), GetSingleRouteDetailRsp.class);
        if (getSingleRouteDetailRsp == null || getSingleRouteDetailRsp.getResultCode().intValue() != 0 || getSingleRouteDetailRsp.getRouteData() == null) {
            LogUtil.j("Track_MyTrackDetailActivity", "query single route error.");
        } else {
            this.aj = getSingleRouteDetailRsp.getRouteData();
        }
    }

    private long d(Intent intent, Uri uri) {
        long longExtra = intent.getLongExtra("routeId", 0L);
        if (longExtra != 0 || uri == null) {
            return longExtra;
        }
        try {
            return Long.parseLong(uri.getQueryParameter("routeId"));
        } catch (NumberFormatException unused) {
            LogUtil.j("Track_MyTrackDetailActivity", "there is no routeId in query params");
            return 0L;
        }
    }

    private void u() {
        this.o = (CustomTitleBar) findViewById(R.id.track_detail_title_bar);
        this.ak = (RelativeLayout) findViewById(R.id.route_loading);
        this.aq = (HealthScrollView) findViewById(R.id.scroll_view);
        this.z = (MapContainer) findViewById(R.id.map_container);
        this.w = (HiMapHolder) findViewById(R.id.track_map);
        this.af = (HealthTextView) findViewById(R.id.my_track_detail_name);
        this.au = (HealthTextView) findViewById(R.id.track_distance);
        this.ba = (HealthTextView) findViewById(R.id.track_distance_title);
        this.ay = (HealthTextView) findViewById(R.id.track_time);
        this.ab = (LinearLayout) findViewById(R.id.lin_climb);
        this.bg = (HealthTextView) findViewById(R.id.tv_elevation_gain);
        this.bh = (HealthTextView) findViewById(R.id.tv_total_descent);
        this.am = (HealthTextView) findViewById(R.id.route_lowest_altitude);
        this.al = (HealthTextView) findViewById(R.id.route_highest_altitude);
        HwHealthLineChart hwHealthLineChart = (HwHealthLineChart) findViewById(R.id.altitude_chart);
        this.f28785b = hwHealthLineChart;
        hwHealthLineChart.setTouchEnabled(false);
        this.ap = (HealthButton) findViewById(R.id.save_route);
        this.aw = (HealthButton) findViewById(R.id.my_award_send_to_device_btn);
        this.ak.setVisibility(0);
        this.o.setTitleText(getString(R.string.IDS_my_track_detail));
        this.o.setRightButtonDrawable(getResources().getDrawable(R.drawable.ic_more_normal_black), qre.f(R.string.accessibility_more_item));
        this.o.setRightButtonClickable(true);
        this.o.setRightButtonVisibility(8);
        this.t = findViewById(R.id.lin_track_distance_tip);
        this.av = findViewById(R.id.lin_total_time_tip);
        this.z.setScrollView(this.aq);
        this.y = (LinearLayout) findViewById(R.id.lin_root_view_altitude);
        this.az = (HealthTextView) findViewById(R.id.tv_altitude_unit);
        ((LinearLayout) findViewById(R.id.root_distance)).setOnTouchListener(new View.OnTouchListener() { // from class: wky
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return MyRouteDetailActivity.b(view, motionEvent);
            }
        });
        y();
        ImageButton imageButton = (ImageButton) findViewById(R.id.track_btn_show_map_type_satellite);
        this.e = imageButton;
        imageButton.setVisibility(8);
        if (LanguageUtil.ba(this)) {
            this.o.setRightSoftkeyBackground(getResources().getDrawable(R.drawable.ic_health_nav_share_black_rt), qre.f(R.string.accessibility_share));
        } else {
            this.o.setRightSoftkeyBackground(getResources().getDrawable(R.drawable.ic_health_nav_share_black), qre.f(R.string.accessibility_share));
        }
    }

    private void y() {
        this.bb = (LinearLayout) findViewById(R.id.root_distance_cp);
        this.be = (HealthTextView) findViewById(R.id.tv_elevation_gain_cp);
        this.bf = (HealthTextView) findViewById(R.id.tv_total_descent_cp);
        this.at = (HealthTextView) findViewById(R.id.track_distance_cp);
        this.ax = (HealthTextView) findViewById(R.id.track_cp_card_name);
        this.q = findViewById(R.id.lin_track_distance_tip_cp);
        this.g = (ImageButton) findViewById(R.id.track_btn_show_or_hide_cp);
        this.i = (HealthImageView) findViewById(R.id.cp_arrow_left);
        this.h = (HealthImageView) findViewById(R.id.cp_arrow_right);
        this.n = (HealthDivider) findViewById(R.id.route_detail_divider);
        this.x = (HealthNestedScrollView) findViewById(R.id.data_scrollview);
        this.bd = findViewById(R.id.view_bg);
        this.bj = findViewById(R.id.view_bg_other);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        int i = this.ac;
        if (i == 1) {
            s();
            this.e.setVisibility(0);
        } else {
            if (i == 2) {
                k();
                return;
            }
            if (i == 3) {
                m();
            } else if (i == -1) {
                h();
            } else {
                LogUtil.j("Track_MyTrackDetailActivity", "map type not match");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        Message messageObtain = Message.obtain();
        messageObtain.what = 9;
        this.d.sendMessage(messageObtain);
        g();
        Message messageObtain2 = Message.obtain();
        messageObtain2.what = 10;
        this.d.sendMessage(messageObtain2);
    }

    private void g() {
        ArrayList arrayList = new ArrayList();
        List<njm> altitudeList = this.ao.h().getAltitudeList();
        for (int i = 0; i < altitudeList.size(); i++) {
            njm njmVar = altitudeList.get(i);
            double dA = njmVar.a();
            if (UnitUtil.f()) {
                dA = UnitUtil.e(njmVar.a(), 1);
            }
            if (i == 0) {
                arrayList.add(new HwHealthBaseEntry(0.0f, (float) dA));
            } else {
                arrayList.add(new HwHealthBaseEntry((float) ((this.aj.getRouteDistance() * ((double) i)) / ((double) altitudeList.size())), (float) dA));
            }
        }
        LogUtil.a("Track_MyTrackDetailActivity", "initLineChart valueSize ", Integer.valueOf(arrayList.size()));
        HwHealthLineDataSet hwHealthLineDataSetE = e(arrayList);
        ArrayList arrayList2 = new ArrayList();
        this.l = arrayList2;
        arrayList2.add(hwHealthLineDataSetE);
        Message messageObtain = Message.obtain();
        messageObtain.what = 5;
        this.d.sendMessage(messageObtain);
    }

    private HwHealthLineDataSet e(List<HwHealthBaseEntry> list) {
        float fE;
        double dE;
        HwHealthLineDataSet hwHealthLineDataSet = new HwHealthLineDataSet(this.f, list, "line brief", "line label", "line unit");
        hwHealthLineDataSet.c(1);
        hwHealthLineDataSet.setColor(ContextCompat.getColor(this.f, R.color.blood_oxygen_altitude_blue_color));
        hwHealthLineDataSet.a(ContextCompat.getColor(this.f, R.color.blood_oxygen_altitude_blue_color), ContextCompat.getColor(this.f, R.color.colorCardPanelBg), true);
        hwHealthLineDataSet.setAxisDependency(HwHealthYAxis.HwHealthAxisDependency.FIRST_PARTY);
        if (UnitUtil.f()) {
            fE = (float) UnitUtil.e(this.ag, 1);
            dE = UnitUtil.e(this.ae, 1);
        } else {
            fE = (float) this.ag;
            dE = this.ae;
        }
        float f = (float) dE;
        float f2 = ((fE - f) + 20.0f) / 4.0f;
        float f3 = f - 10.0f;
        float f4 = f3 + f2;
        float f5 = f4 + f2;
        float f6 = f5 + f2;
        hwHealthLineDataSet.setForcedLabels(new float[]{f3, f4, f5, f6, f2 + f6});
        Description description = new Description();
        description.setTextColor(getResources().getColor(R.color.textColorSecondary));
        if (UnitUtil.f()) {
            description.setText(getString(R.string.IDS_route_distance_miles));
        } else {
            description.setText(getString(R.string.IDS_route_distance_km));
        }
        this.f28785b.setDescription(description);
        HwHealthYAxis axisFirstParty = this.f28785b.getAxisFirstParty();
        axisFirstParty.enableGridDashedLine(qqp.a(this.f, 2.0f), qqp.a(this.f, 1.0f), 0.0f);
        axisFirstParty.setAxisMinimum(hwHealthLineDataSet.getYMin() - 10.0f);
        axisFirstParty.setAxisMaximum(hwHealthLineDataSet.getYMax() + 10.0f);
        XAxis xAxis = this.f28785b.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setAxisLineColor(getResources().getColor(R.color.transparent));
        xAxis.setDrawAxisLine(true);
        xAxis.setAvoidFirstLastClipping(true);
        b(xAxis);
        return hwHealthLineDataSet;
    }

    private void b(XAxis xAxis) {
        xAxis.setValueFormatter(new IAxisValueFormatter() { // from class: com.huawei.ui.main.stories.route.activity.MyRouteDetailActivity.4
            @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
            public String getFormattedValue(float f, AxisBase axisBase) {
                DecimalFormat decimalFormat;
                double d = f;
                if (d > 1000.0d) {
                    decimalFormat = new DecimalFormat("#.#");
                } else {
                    decimalFormat = new DecimalFormat("#.##");
                }
                if (UnitUtil.f()) {
                    return decimalFormat.format(UnitUtil.e(new BigDecimal(d).divide(BigDecimal.valueOf(1000.0d), 2, 4).floatValue(), 3));
                }
                return decimalFormat.format(new BigDecimal(d).divide(BigDecimal.valueOf(1000.0d), 2, 4).floatValue());
            }
        });
    }

    private void k() {
        this.w.c(this.f, null, new SyncMapCallback() { // from class: wlf
            @Override // com.huawei.healthcloud.plugintrack.ui.map.SyncMapCallback
            public final void onMapReady(InterfaceHiMap interfaceHiMap) {
                this.f52152a.c(interfaceHiMap);
            }
        });
    }

    public /* synthetic */ void c(InterfaceHiMap interfaceHiMap) {
        if (interfaceHiMap == null) {
            LogUtil.e("Track_MyTrackDetailActivity", "initGoogleMap onMapReady map is null");
            finish();
        } else {
            this.aa = interfaceHiMap;
            s();
            this.e.setVisibility(0);
        }
    }

    private void m() {
        this.w.e(this.f, new SyncMapCallback() { // from class: wlb
            @Override // com.huawei.healthcloud.plugintrack.ui.map.SyncMapCallback
            public final void onMapReady(InterfaceHiMap interfaceHiMap) {
                this.d.b(interfaceHiMap);
            }
        });
    }

    public /* synthetic */ void b(InterfaceHiMap interfaceHiMap) {
        if (interfaceHiMap == null) {
            LogUtil.j("Track_MyTrackDetailActivity", "initHmsMap onMapReady hiMap is null");
            finish();
        } else {
            this.aa = interfaceHiMap;
            s();
        }
    }

    private void h() {
        this.aa = this.w.b(null, this.f);
        s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        this.j.d();
        for (jpg jpgVar : this.an) {
            this.j.a(new LatLong(jpgVar.d, jpgVar.f38787a));
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 12;
        this.d.sendMessage(messageObtain);
    }

    private void s() {
        ReleaseLogUtil.c("Track_MyTrackDetailActivity", "markPoint size is", Integer.valueOf(this.ad.size()));
        if (njy.e(this.ad) && !njy.e(this.an)) {
            b(this.an.get(0));
            List<jpg> list = this.an;
            d(list.get(list.size() - 1));
        } else {
            if (this.aj.getRouteType() == RouteType.DEFAULT.routeType() && !njy.e(this.an)) {
                c(this.an.get(0));
                List<jpg> list2 = this.an;
                e(list2.get(list2.size() - 1));
            }
            if (this.aj.getRouteType() == RouteType.EXP.routeType()) {
                this.aa.addHiHealthMarkers(izt.d(this.ad, false));
            } else {
                i();
            }
        }
        if (qqs.e(this.f)) {
            this.aa.setMapShowType(3);
        } else {
            this.aa.setMapShowType(0);
        }
        this.aa.setZoomControlsEnabled(false);
        jrs jrsVar = new jrs();
        jrsVar.a(this.an);
        jrsVar.c(this.bc);
        jrsVar.d(false);
        jrsVar.b(jer.d(4.0f));
        this.aa.drawLines(jrsVar);
        LogUtil.a("Track_MyTrackDetailActivity", "init drawLines ", Long.valueOf(System.currentTimeMillis()));
        if (this.ah) {
            LogUtil.a("Track_MyTrackDetailActivity", "onSecond load new Map");
            e(R.dimen.health_common_70dp, R.dimen.health_common_70dp, R.dimen.health_common_64dp, R.dimen.health_common_204dp);
        }
        this.aa.setOnMapLoadedListener(new InterfaceMapLoadedCallback() { // from class: wll
            @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapLoadedCallback
            public final void onMapLoaded() {
                this.d.d();
            }
        });
    }

    public /* synthetic */ void d() {
        LogUtil.a("Track_MyTrackDetailActivity", "onMapLoaded");
        e(R.dimen.health_common_70dp, R.dimen.health_common_70dp, R.dimen.health_common_64dp, R.dimen.health_common_204dp);
        this.ah = true;
    }

    private void i() {
        ArrayList<jpk> arrayListD = izt.d(this.ad, false);
        for (int i = 0; i < arrayListD.size(); i++) {
            if (i != 0 && i != arrayListD.size() - 1) {
                arrayListD.get(i).a(izt.e("CP" + i, qre.e(R.color.equity_activate_text_color), qrs.d(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), 9.0f)));
            }
        }
        this.m.clear();
        this.m.addAll(this.aa.addHiHealthMarkers(arrayListD));
    }

    private void e(jpg jpgVar) {
        MarkPoint markPoint = new MarkPoint();
        markPoint.a(jpgVar.f38787a);
        markPoint.c(jpgVar.d);
        markPoint.d(MarkPoint.MarkType.END.type());
        this.ad.add(markPoint);
    }

    private void c(jpg jpgVar) {
        MarkPoint markPoint = new MarkPoint();
        markPoint.a(jpgVar.f38787a);
        markPoint.c(jpgVar.d);
        markPoint.d(MarkPoint.MarkType.START.type());
        this.ad.add(0, markPoint);
    }

    private void e(int i, int i2, int i3, int i4) {
        this.aa.setPreviewStatus(new jrm(this.j.e().getLatLng(), this.j.c().getLatLng()), (int) getResources().getDimension(i), (int) getResources().getDimension(i2), (int) getResources().getDimension(i3), (int) getResources().getDimension(i4));
        if (this.ac == 3) {
            this.aa.scrollBy(0.0f, (int) getResources().getDimension(R.dimen.health_common_76dp));
        }
        this.ak.setVisibility(8);
    }

    private void b(jpg jpgVar) {
        jrv jrvVar = new jrv();
        jrvVar.d(jpgVar);
        jrvVar.d(new Pair<>(Float.valueOf(0.5f), Float.valueOf(0.9f)));
        jrvVar.c(BitmapFactory.decodeResource(this.f.getResources(), R.drawable.ic_route_start));
        this.aa.addMarker(jrvVar, null);
    }

    private void d(jpg jpgVar) {
        jrv jrvVar = new jrv();
        jrvVar.d(jpgVar);
        jrvVar.d(new Pair<>(Float.valueOf(0.5f), Float.valueOf(0.9f)));
        jrvVar.c(BitmapFactory.decodeResource(this.f.getResources(), R.drawable.ic_route_end));
        this.aa.addMarker(jrvVar, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SpannableString a(double d) {
        String string;
        String quantityString;
        double d2 = d / 1000.0d;
        if (UnitUtil.f()) {
            string = getString(R.string.IDS_hwh_motiontrack_show_speed_pace_mi);
            double dE = UnitUtil.e(d2, 3);
            quantityString = getResources().getQuantityString(R.plurals.IDS_distance_mi, (int) dE, UnitUtil.e(dE, 1, 2));
        } else {
            string = getString(R.string.IDS_hwh_motiontrack_show_speed_pace_km);
            quantityString = getResources().getQuantityString(R.plurals.IDS_distance_km, (int) d2, UnitUtil.e(d2, 1, 2));
        }
        SpannableString spannableString = new SpannableString(quantityString);
        c(spannableString, string);
        return spannableString;
    }

    private void c(SpannableString spannableString, String str) {
        int iIndexOf;
        if (spannableString == null || TextUtils.isEmpty(str) || (iIndexOf = spannableString.toString().indexOf(str)) == -1) {
            return;
        }
        spannableString.setSpan(new AbsoluteSizeSpan(getResources().getDimensionPixelSize(com.huawei.ui.commonui.R.dimen.textSizeBody3)), iIndexOf, str.length() + iIndexOf, 33);
        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(BaseApplication.b(), R.color.textColorSecondary)), iIndexOf, str.length() + iIndexOf, 33);
    }

    private void af() {
        if (!this.i.isEnabled()) {
            this.i.setBackgroundResource(R.drawable.track_detail_cp_left_not_click);
        } else if (this.k == this.ar - 1) {
            this.h.setBackgroundResource(R.drawable.track_detail_cp_right_not_click);
        } else {
            this.h.setBackgroundResource(R.drawable.track_detail_cp_right_click);
        }
    }

    private void ai() {
        if (!this.h.isEnabled()) {
            this.h.setBackgroundResource(R.drawable.track_detail_cp_right_not_click);
        } else if (this.k == 0) {
            this.i.setBackgroundResource(R.drawable.track_detail_cp_left_not_click);
        } else {
            this.i.setBackgroundResource(R.drawable.track_detail_cp_left_click);
        }
    }

    private void o() {
        t();
        z();
        this.t.setOnClickListener(new View.OnClickListener() { // from class: wlc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52150b.c(view);
            }
        });
        this.av.setOnClickListener(new View.OnClickListener() { // from class: wlg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.b(view);
            }
        });
        this.e.setOnClickListener(new View.OnClickListener() { // from class: wlj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.e(view);
            }
        });
        l();
        this.o.setRightSoftkeyOnClickListener(new View.OnClickListener() { // from class: wkv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52146c.d(view);
            }
        });
    }

    public /* synthetic */ void c(View view) {
        a(getString(this.aj.getRouteType() == RouteType.EXP.routeType() ? R.string.IDS_my_track_detail_distance_exp_tip : R.string.IDS_my_track_detail_distance_tip));
    }

    public /* synthetic */ void b(View view) {
        a(getString(R.string.IDS_my_track_detail_totaltime_tip));
    }

    public /* synthetic */ void e(View view) {
        int i;
        boolean z = !this.f28786c;
        this.f28786c = z;
        InterfaceHiMap interfaceHiMap = this.aa;
        if (interfaceHiMap != null) {
            interfaceHiMap.showSatelLiteState(true, z, qqs.e(this.f) ? 3 : 0);
        }
        ImageButton imageButton = this.e;
        if (this.f28786c) {
            i = com.huawei.healthcloud.plugintrack.R.drawable.track_show_map_traking_show_satellite_map;
        } else {
            i = com.huawei.healthcloud.plugintrack.R.drawable.track_show_map_traking_show_normal_map;
        }
        imageButton.setBackgroundResource(i);
        lrd.b(this.e, qre.f(this.f28786c ? R.string.accessibility_show_2d_map : R.string.accessibility_show_real_map));
    }

    public /* synthetic */ void d(View view) {
        if (qrs.e(view) || this.aj == null) {
            return;
        }
        LogUtil.a("Track_MyTrackDetailActivity", "to RouteExportActivity");
        TrackInfoModel.Builder builderRouteType = new TrackInfoModel.Builder().routeName(this.p).sportType(this.aj.getSportType()).sportTotalTime(this.aj.getRouteTime()).sportTotalDistance(this.aj.getRouteDistance()).points(this.aj.getRoutePoints()).routeType(this.aj.getRouteType());
        if (!TextUtils.isEmpty(this.aj.getExtendData())) {
            RouteExtendData routeExtendData = (RouteExtendData) new Gson().fromJson(this.aj.getExtendData(), RouteExtendData.class);
            builderRouteType.cumulativeClimb(routeExtendData.getCumulativeClimb()).cumulativeDecrease(routeExtendData.getCumulativeDecrease()).routeType(routeExtendData.getRouteType());
        }
        ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).setTrackInfoModel(builderRouteType.build());
        ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).setRouteData(this.aj);
        AppRouter.c("/HWUserProfileMgr/RouteExportActivity").e("IS_NEED_CHANGE_POINT", false).b(this);
    }

    private void l() {
        this.q.setOnClickListener(new View.OnClickListener() { // from class: wku
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.i(view);
            }
        });
        this.g.setOnClickListener(new View.OnClickListener() { // from class: wla
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52149a.f(view);
            }
        });
    }

    public /* synthetic */ void i(View view) {
        a(getString(this.aj.getRouteType() == RouteType.EXP.routeType() ? R.string.IDS_my_track_detail_distance_exp_tip : R.string.IDS_my_track_detail_distance_tip));
    }

    public /* synthetic */ void f(View view) {
        if (qrs.c(1500)) {
            LogUtil.j("Track_MyTrackDetailActivity", "onClick too fast");
            return;
        }
        boolean z = this.u;
        this.u = !z;
        this.g.setBackgroundResource(!z ? R.drawable.track_detail_hide_cp : R.drawable.track_detail_show_cp);
        lrd.b(this.g, qre.f(this.u ? R.string.accessibility_my_route_show_cp : R.string.accessibility_my_route_hide_cp));
        for (int i = 0; i < this.m.size(); i++) {
            MarkPoint markPoint = this.ad.get(i);
            if (markPoint == null) {
                LogUtil.a("Track_MyTrackDetailActivity", "initListenerCp markPoint == null");
                return;
            }
            if (markPoint.c() == 1) {
                if (this.u) {
                    this.aa.hideMarker(this.m.get(i).intValue(), null);
                } else {
                    this.aa.showMarker(this.m.get(i).intValue(), null);
                }
            }
        }
        this.i.setEnabled(!this.u);
        this.i.setBackgroundResource(this.u ? R.drawable.track_detail_cp_left_not_click : R.drawable.track_detail_cp_left_click);
        this.h.setEnabled(!this.u);
        this.h.setBackgroundResource(this.u ? R.drawable.track_detail_cp_right_not_click : R.drawable.track_detail_cp_right_click);
        ai();
        af();
    }

    private void z() {
        qsp.b((HealthButton) findViewById(R.id.my_award_send_to_device_btn), new View.OnClickListener() { // from class: wlh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52153c.k(view);
            }
        });
    }

    public /* synthetic */ void k(View view) {
        if (qrs.e(view)) {
            return;
        }
        aa();
    }

    private void t() {
        this.o.setRightButtonOnClickListener(new View.OnClickListener() { // from class: wli
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.g(view);
            }
        });
    }

    public /* synthetic */ void g(View view) {
        ArrayList arrayList = new ArrayList();
        if (!EnvironmentInfo.m()) {
            arrayList.add(getString(R.string.IDS_track_detail_trans_device));
        }
        arrayList.add(getString(R.string.IDS_track_detail_edit));
        arrayList.add(getString(R.string.IDS_track_detail_delete_route));
        new PopViewList(this.f, this.o, arrayList).b(new PopViewList.PopViewClickListener() { // from class: wlp
            @Override // com.huawei.ui.commonui.popupview.PopViewList.PopViewClickListener
            public final void setOnClick(int i) {
                this.e.b(i);
            }
        });
    }

    public /* synthetic */ void b(int i) {
        if (EnvironmentInfo.m()) {
            i++;
        }
        if (i == 0) {
            aa();
        } else if (i == 1) {
            ac();
        } else {
            if (i != 2) {
                return;
            }
            c(2);
        }
    }

    private void ac() {
        ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).setRouteData(this.aj);
        AppRouter.c("/HWUserProfileMgr/EditRouteActivity").e("is_add", false).a(RouteData.SCENE_TYPE, this.aj.getSceneType()).b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aa() {
        RouteTransferDataHolder routeTransferDataHolder = this.ao;
        if (routeTransferDataHolder == null || routeTransferDataHolder.h() == null || this.p == null) {
            qpx.e(BaseApplication.b(), getString(R.string.IDS_track_detail_parse_error));
        } else {
            this.ao.q();
        }
    }

    private void a(String str) {
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.f);
        builder.a(str).a(getResources().getString(R.string.IDS_my_track_detail_i_go_it), new View.OnClickListener() { // from class: wkz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52148a.n(view);
            }
        }).b();
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        this.f28784a = customTextAlertDialogB;
        customTextAlertDialogB.findViewById(R.id.custom_dialog_title_layout).setPadding(0, 0, 0, 0);
        this.f28784a.setCancelable(false);
        if (isFinishing()) {
            return;
        }
        this.f28784a.show();
    }

    public /* synthetic */ void n(View view) {
        this.f28784a.dismiss();
    }

    private void e() {
        CustomTextAlertDialog customTextAlertDialog = this.f28784a;
        if (customTextAlertDialog == null || !customTextAlertDialog.isShowing()) {
            return;
        }
        this.f28784a.dismiss();
    }

    private void c(final int i) {
        String string;
        String string2;
        String string3;
        e();
        if (i == 1) {
            string = getString(R.string.IDS_track_detail_route_exists);
            string2 = getString(R.string.IDS_track_detail_rename_try);
            string3 = getResources().getString(R.string.IDS_my_track_detail_rename);
        } else if (i != 2) {
            string = null;
            string2 = null;
            string3 = null;
        } else {
            string = getString(R.string.IDS_my_route_confirm_delete);
            string2 = getString(R.string.IDS_route_confirm_delete_line);
            string3 = getString(R.string.hiad_calender_delete);
        }
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.f);
        builder.e(string).a(string2).a(getResources().getString(R.string.IDS_motiontrack_show_cancel), new View.OnClickListener() { // from class: wlq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52157b.m(view);
            }
        }).b(string3, new View.OnClickListener() { // from class: wlo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f52156c.d(i, view);
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        this.bm = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        if (isFinishing()) {
            return;
        }
        this.bm.show();
    }

    public /* synthetic */ void m(View view) {
        this.bm.dismiss();
    }

    public /* synthetic */ void d(int i, View view) {
        e(i);
    }

    private void e(int i) {
        if (i == 1) {
            ac();
        } else if (i == 2) {
            c();
        }
        CustomTextAlertDialog customTextAlertDialog = this.bm;
        if (customTextAlertDialog != null) {
            customTextAlertDialog.dismiss();
        }
    }

    private void c() {
        if (!CommonUtil.ab(this)) {
            qpx.e(this, com.huawei.health.servicesui.R.string.IDS_hw_show_set_about_privacy_connectting_error);
        } else {
            if (this.aj == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf(this.aj.getRouteVersion()));
            ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).deleteRoutes(arrayList, new RouteResultCallBack<CloudCommonReponse>() { // from class: com.huawei.ui.main.stories.route.activity.MyRouteDetailActivity.5
                @Override // com.huawei.health.userprofilemgr.model.RouteResultCallBack
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(CloudCommonReponse cloudCommonReponse) {
                    if (cloudCommonReponse.getResultCode().intValue() == 0) {
                        LogUtil.a("Track_MyTrackDetailActivity", "delete success");
                        MyRouteDetailActivity myRouteDetailActivity = MyRouteDetailActivity.this;
                        myRouteDetailActivity.setResult(-1, myRouteDetailActivity.getIntent());
                        MyRouteDetailActivity.this.finish();
                        return;
                    }
                    qpx.b(MyRouteDetailActivity.this, R.string.IDS_watchface_delete_failed);
                    LogUtil.d("Track_MyTrackDetailActivity", "delete resp resultCode:", cloudCommonReponse.getResultCode(), ",resp resultDesc:", cloudCommonReponse.getResultDesc());
                }

                @Override // com.huawei.health.userprofilemgr.model.RouteResultCallBack
                public void onFailure(Throwable th) {
                    qpx.b(MyRouteDetailActivity.this, R.string.IDS_watchface_delete_failed);
                    LogUtil.e("Track_MyTrackDetailActivity", "delete onFailure:", th.getMessage());
                }
            });
        }
    }

    private void b() {
        if ("cloud_flag".equals(this.v)) {
            LogUtil.a("Track_MyTrackDetailActivity", "auto routeToDevice start.");
            Message messageObtain = Message.obtain();
            messageObtain.what = 14;
            this.d.sendMessage(messageObtain);
        }
    }

    private void j() {
        RouteOutputForApp routeOutputForAppI = this.ao.i();
        if (routeOutputForAppI == null) {
            ReleaseLogUtil.c("Track_MyTrackDetailActivity", "trackOutPut is null");
            return;
        }
        List<SegmentInfo> segmentInfo = routeOutputForAppI.getSegmentInfo();
        this.as = segmentInfo;
        this.ar = segmentInfo != null ? segmentInfo.size() : 0;
    }

    private void v() {
        String strA;
        if (njy.e(this.as, this.k)) {
            LogUtil.j("Track_MyTrackDetailActivity", "mSegmentInfoList is empty or outOfBounds");
            return;
        }
        int i = this.k;
        if (i == 0) {
            strA = qre.a(R.string.IDS_hw_route_detail_cp_start, "CP" + (this.k + 1));
        } else if (i == this.ar - 1) {
            strA = qre.a(R.string.IDS_hw_route_detail_cp_end, "CP" + this.k);
        } else {
            strA = qre.a(R.string.IDS_hw_route_detail_cp_between, "CP" + this.k, "CP" + (this.k + 1));
        }
        this.ax.setText(strA);
        SegmentInfo segmentInfo = this.as.get(this.k);
        double ascent = segmentInfo.getAscent();
        double descent = segmentInfo.getDescent();
        double dist = segmentInfo.getDist();
        c(this.be, ascent);
        c(this.bf, descent);
        this.at.setText(a(dist));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ab() {
        if (this.i.isEnabled()) {
            this.i.setOnClickListener(new View.OnClickListener() { // from class: wle
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f52151c.h(view);
                }
            });
        }
        if (this.h.isEnabled()) {
            this.h.setOnClickListener(new View.OnClickListener() { // from class: wld
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.j(view);
                }
            });
        }
        v();
    }

    public /* synthetic */ void h(View view) {
        int i = this.k - 1;
        this.k = i;
        if (i < 0 || i > this.ar - 1) {
            this.k = 0;
            return;
        }
        v();
        if (this.k == 0) {
            this.i.setBackgroundResource(R.drawable.track_detail_cp_left_not_click);
            this.h.setBackgroundResource(R.drawable.track_detail_cp_right_click);
            lrd.b(this.i, qre.f(R.string.accessibility_my_route_start_cp));
            lrd.b(this.h, qre.f(R.string.accessibility_my_route_next_cp));
            return;
        }
        this.i.setBackgroundResource(R.drawable.track_detail_cp_left_click);
        this.h.setBackgroundResource(R.drawable.track_detail_cp_right_click);
        lrd.b(this.i, qre.f(R.string.accessibility_my_route_previous_cp));
        lrd.b(this.h, qre.f(R.string.accessibility_my_route_next_cp));
    }

    public /* synthetic */ void j(View view) {
        int i = this.k + 1;
        this.k = i;
        if (i < 0 || i > this.ar - 1) {
            this.k = this.ar - 1;
            return;
        }
        v();
        if (this.k == this.ar - 1) {
            this.i.setBackgroundResource(R.drawable.track_detail_cp_left_click);
            this.h.setBackgroundResource(R.drawable.track_detail_cp_right_not_click);
            lrd.b(this.i, qre.f(R.string.accessibility_my_route_previous_cp));
            lrd.b(this.h, qre.f(R.string.accessibility_my_route_end_cp));
            return;
        }
        this.i.setBackgroundResource(R.drawable.track_detail_cp_left_click);
        this.h.setBackgroundResource(R.drawable.track_detail_cp_right_click);
        lrd.b(this.i, qre.f(R.string.accessibility_my_route_previous_cp));
        lrd.b(this.h, qre.f(R.string.accessibility_my_route_next_cp));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(HealthTextView healthTextView, double d) {
        String string;
        String quantityString;
        double d2 = UnitUtil.d(d, 0);
        if (UnitUtil.f()) {
            double d3 = UnitUtil.d(UnitUtil.e(d2, 1), 0);
            string = getResources().getQuantityString(com.huawei.healthcloud.plugintrack.R.plurals.IDS_hwh_motiontrack_ft_string, (int) Math.round(d3));
            quantityString = getResources().getQuantityString(R.plurals.IDS_altitude_ft, (int) d3, UnitUtil.e(d3, 1, 0));
        } else {
            string = getResources().getString(com.huawei.healthcloud.plugintrack.R.string.IDS_fitness_data_list_activity_meter_unit);
            quantityString = getResources().getQuantityString(R.plurals.IDS_altitude_meter, (int) d2, UnitUtil.e(d2, 1, 0));
        }
        SpannableString spannableString = new SpannableString(quantityString);
        c(spannableString, string);
        healthTextView.setText(spannableString);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        e();
        a aVar = this.d;
        if (aVar != null) {
            aVar.removeMessages(5);
            this.d.removeMessages(6);
            this.d.removeMessages(7);
            this.d.removeMessages(8);
            this.d.removeMessages(9);
            this.d.removeMessages(10);
            this.d.removeMessages(11);
            this.d.removeMessages(12);
            this.d.removeMessages(13);
            this.d.removeMessages(14);
        }
        this.w.e();
        ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).clearRouteData();
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static class a extends BaseHandler<MyRouteDetailActivity> {
        a(MyRouteDetailActivity myRouteDetailActivity) {
            super(myRouteDetailActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(MyRouteDetailActivity myRouteDetailActivity, Message message) {
            switch (message.what) {
                case 5:
                    myRouteDetailActivity.f28785b.setData(new qnt(myRouteDetailActivity.l));
                    myRouteDetailActivity.f28785b.refresh();
                    break;
                case 6:
                    a(myRouteDetailActivity, message);
                    break;
                case 7:
                    a(myRouteDetailActivity);
                    break;
                case 8:
                    qpx.b(BaseApplication.b(), R.string.IDS_my_route_parse_error);
                    break;
                case 9:
                    d(myRouteDetailActivity);
                    h(myRouteDetailActivity);
                    break;
                case 10:
                    myRouteDetailActivity.aq.setVisibility(0);
                    myRouteDetailActivity.ak.setVisibility(8);
                    break;
                case 11:
                    i(myRouteDetailActivity);
                    break;
                case 12:
                    myRouteDetailActivity.n();
                    break;
                case 13:
                    b(myRouteDetailActivity);
                    break;
                case 14:
                    myRouteDetailActivity.aa();
                    break;
            }
        }

        private void b(final MyRouteDetailActivity myRouteDetailActivity) {
            if (myRouteDetailActivity.ac == 1) {
                myRouteDetailActivity.aa = myRouteDetailActivity.w.e((Bundle) null, myRouteDetailActivity);
            }
            if (njy.e(myRouteDetailActivity.an)) {
                LogUtil.a("Track_MyTrackDetailActivity", "mPointList is empty");
                myRouteDetailActivity.finish();
            } else {
                ThreadPoolManager.c().execute(new Runnable() { // from class: wls
                    @Override // java.lang.Runnable
                    public final void run() {
                        MyRouteDetailActivity.a.e(myRouteDetailActivity);
                    }
                });
            }
        }

        public static /* synthetic */ void e(MyRouteDetailActivity myRouteDetailActivity) {
            myRouteDetailActivity.p();
            myRouteDetailActivity.f();
        }

        private void i(final MyRouteDetailActivity myRouteDetailActivity) {
            myRouteDetailActivity.ap.setOnClickListener(new View.OnClickListener() { // from class: wln
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.b(myRouteDetailActivity, view);
                }
            });
        }

        public /* synthetic */ void b(final MyRouteDetailActivity myRouteDetailActivity, View view) {
            if (LoginInit.getInstance(myRouteDetailActivity).isBrowseMode()) {
                LoginInit.getInstance(BaseApplication.b()).browsingToLogin(new IBaseResponseCallback() { // from class: wlr
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i, Object obj) {
                        this.f52158a.c(myRouteDetailActivity, i, obj);
                    }
                }, "");
            } else if (Utils.k()) {
                LogUtil.a("Track_MyTrackDetailActivity", "is oversea no cloud version");
                qpx.b(BaseApplication.b(), R.string.wallet_unenable_country);
            } else {
                c(myRouteDetailActivity);
            }
        }

        public /* synthetic */ void c(MyRouteDetailActivity myRouteDetailActivity, int i, Object obj) {
            if (i == 0) {
                c(myRouteDetailActivity);
            } else {
                LogUtil.j("Track_MyTrackDetailActivity", "browsingToLogin not login errorCode is ", Integer.valueOf(i));
            }
        }

        private void c(MyRouteDetailActivity myRouteDetailActivity) {
            ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).setRouteData(myRouteDetailActivity.aj);
            AppRouter.c("/HWUserProfileMgr/EditRouteActivity").e("is_add", true).a("from", myRouteDetailActivity.s).a(RouteData.SCENE_TYPE, myRouteDetailActivity.aj.getSceneType()).b(myRouteDetailActivity);
            myRouteDetailActivity.finish();
        }

        private void a(MyRouteDetailActivity myRouteDetailActivity) {
            RouteData routeData = myRouteDetailActivity.aj;
            myRouteDetailActivity.af.setText(routeData.getRouteName());
            myRouteDetailActivity.au.setText(myRouteDetailActivity.a(routeData.getRouteDistance()));
            if (routeData.getRouteType() == RouteType.EXP.routeType()) {
                myRouteDetailActivity.ba.setText(R.string.IDS_hw_sport_waypoint_mileage);
            }
            if (routeData.getRouteTime() <= 0.0d) {
                myRouteDetailActivity.ay.setText(R.string.IDS_motiontrack_detail_heartrate_default);
            } else {
                myRouteDetailActivity.ay.setText(UnitUtil.e((int) routeData.getRouteTime()));
            }
        }

        private void d(MyRouteDetailActivity myRouteDetailActivity) {
            if (Math.abs(myRouteDetailActivity.ag - myRouteDetailActivity.ae) > Double.MIN_VALUE) {
                myRouteDetailActivity.y.setVisibility(0);
                myRouteDetailActivity.az.setText(myRouteDetailActivity.getString(R.string.IDS_fitness_data_list_activity_meter_unit));
                double dE = CommonUtil.e(myRouteDetailActivity.ae, 1);
                double dE2 = CommonUtil.e(myRouteDetailActivity.ag, 1);
                if (UnitUtil.f()) {
                    dE = CommonUtil.e(UnitUtil.e(myRouteDetailActivity.ae, 1), 1);
                    dE2 = CommonUtil.e(UnitUtil.e(myRouteDetailActivity.ag, 1), 1);
                    myRouteDetailActivity.az.setText(myRouteDetailActivity.getString(R.string.IDS_ft));
                }
                NumberFormat numberFormat = NumberFormat.getInstance();
                String str = numberFormat.format(dE);
                String str2 = numberFormat.format(dE2);
                myRouteDetailActivity.am.setText(str);
                myRouteDetailActivity.al.setText(str2);
                return;
            }
            myRouteDetailActivity.y.setVisibility(8);
        }

        private void h(MyRouteDetailActivity myRouteDetailActivity) {
            RouteOutputForApp routeOutputForAppI = myRouteDetailActivity.ao.i();
            if (routeOutputForAppI != null && !myRouteDetailActivity.ad.isEmpty() && myRouteDetailActivity.aj.getRouteType() != RouteType.EXP.routeType()) {
                myRouteDetailActivity.bb.setVisibility(0);
                myRouteDetailActivity.g.setVisibility(0);
                myRouteDetailActivity.n.setVisibility(0);
                myRouteDetailActivity.ab();
            }
            if (routeOutputForAppI == null || !routeOutputForAppI.getIsShowAltitude()) {
                myRouteDetailActivity.ab.setVisibility(8);
                return;
            }
            RouteData routeData = myRouteDetailActivity.aj;
            double totalAscent = routeOutputForAppI.getTotalAscent();
            double totalDescent = routeOutputForAppI.getTotalDescent();
            if (!TextUtils.isEmpty(routeData.getExtendData())) {
                try {
                    RouteExtendData routeExtendData = (RouteExtendData) new Gson().fromJson(routeData.getExtendData(), RouteExtendData.class);
                    if (Double.compare(routeExtendData.getCumulativeClimb(), 0.0d) > 0 || Double.compare(routeExtendData.getCumulativeDecrease(), 0.0d) > 0) {
                        totalAscent = routeExtendData.getCumulativeClimb();
                        totalDescent = routeExtendData.getCumulativeDecrease();
                    }
                } catch (JsonSyntaxException e) {
                    LogUtil.a("Track_MyTrackDetailActivity", "showClimbAndDecrease error:" + ExceptionUtils.c(e));
                }
            }
            if (Double.compare(totalAscent, 0.0d) > 0 || Double.compare(totalDescent, 0.0d) > 0) {
                myRouteDetailActivity.ab.setVisibility(0);
                myRouteDetailActivity.c(myRouteDetailActivity.bg, totalAscent);
                myRouteDetailActivity.c(myRouteDetailActivity.bh, totalDescent);
                return;
            }
            myRouteDetailActivity.ab.setVisibility(8);
        }

        private void a(MyRouteDetailActivity myRouteDetailActivity, Message message) {
            if ("route_flag".equals(myRouteDetailActivity.v) || "cloud_flag".equals(myRouteDetailActivity.v)) {
                myRouteDetailActivity.ap.setVisibility(8);
                myRouteDetailActivity.o.setRightButtonVisibility(0);
                myRouteDetailActivity.o.setRightSoftkeyVisibility(0);
                if (EnvironmentInfo.m()) {
                    return;
                }
                myRouteDetailActivity.aw.setVisibility(0);
                return;
            }
            myRouteDetailActivity.o.setRightButtonVisibility(8);
            myRouteDetailActivity.o.setRightSoftkeyVisibility(8);
            myRouteDetailActivity.aw.setVisibility(8);
            if (((Boolean) message.obj).booleanValue()) {
                myRouteDetailActivity.ap.setVisibility(0);
            } else {
                qpx.b(BaseApplication.b(), R.string.IDS_my_route_parse_error);
            }
            if (myRouteDetailActivity.aq.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) myRouteDetailActivity.aq.getLayoutParams()).bottomMargin = myRouteDetailActivity.getResources().getDimensionPixelOffset(R.dimen.health_common_90dp);
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
