package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.ImageButton;
import androidx.media3.extractor.ts.TsExtractor;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.motiontrack.api.ILocationChangeListener;
import com.huawei.health.motiontrack.model.runningroute.HotPathCityInfo;
import com.huawei.health.trackprocess.model.GpsPoint;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.runningroute.data.RouteSiteDistanceSortDialog;
import com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteConstants;
import com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils;
import com.huawei.healthcloud.plugintrack.runningroute.view.IRouteDetail;
import com.huawei.healthcloud.plugintrack.ui.activity.ClockingRankActivity;
import com.huawei.healthcloud.plugintrack.ui.map.HiMapHolder;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapCallback;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapLoadedCallback;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapMarkerClickCallback;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapStatusChangeCallback;
import com.huawei.healthcloud.plugintrack.ui.map.SyncMapCallback;
import com.huawei.healthcloud.plugintrack.ui.view.RouteHintMvpView;
import com.huawei.healthcloud.plugintrack.ui.view.RouteHintView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.bubblelayout.HealthBubbleLayout;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class jtk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f39017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f39018c;
    private static final Pair<Float, Float> d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<ClockingRankActivity> f39019a;
    private List<gdr> aa;
    private RouteSiteDistanceSortDialog ac;
    private SharedPreferences ad;
    private ImageButton ae;
    private CustomTitleBar ag;
    private jrr ah;
    private HealthBubbleLayout ai;
    private HealthCardView g;
    private jpg i;
    private gdm k;
    private HiMapHolder l;
    private jpg o;
    private boolean r;
    private String u;
    private String v;
    private RouteHintMvpView w;
    private View x;
    private HealthCardView y;
    private InterfaceHiMap t = null;
    private List<String> f = new ArrayList();
    private float j = 14.5f;
    private Map<Integer, RouteHintView> z = new ConcurrentHashMap();
    private float p = 14.5f;
    private float h = 14.5f;
    private int ab = 0;
    private List<Bitmap> e = new ArrayList();
    private int s = -1;
    private int q = 0;
    private boolean n = true;
    private boolean m = true;

    static {
        Float fValueOf = Float.valueOf(0.5f);
        d = new Pair<>(fValueOf, fValueOf);
        f39017b = Color.rgb(251, 101, 34);
        f39018c = Color.rgb(TsExtractor.TS_STREAM_TYPE_AC4, TsExtractor.TS_STREAM_TYPE_AC4, TsExtractor.TS_STREAM_TYPE_AC4);
    }

    public jtk(View view, Context context, ClockingRankActivity clockingRankActivity) {
        LogUtil.a("RunningRouteViewHolder", "RunningRouteViewHolder");
        this.x = view;
        this.f39019a = new WeakReference<>(clockingRankActivity);
        this.l = (HiMapHolder) this.x.findViewById(R.id.running_route_map_holder);
        this.ae = (ImageButton) this.x.findViewById(R.id.sort_button);
        this.ag = (CustomTitleBar) this.x.findViewById(R.id.clocking_rank_place_title_bar);
        this.ac = new RouteSiteDistanceSortDialog(context);
        c(context);
        b(this.ac);
        e(context);
    }

    private void c(final Context context) {
        ImageButton imageButton = (ImageButton) this.x.findViewById(R.id.location_button);
        if (imageButton != null) {
            imageButton.setOnClickListener(new View.OnClickListener() { // from class: jtl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f39024c.c(context, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Context context, View view) {
        jdo.b();
        if (PermissionUtil.e(context, PermissionUtil.PermissionType.LOCATION) == PermissionUtil.PermissionResult.GRANTED) {
            d(RunningRouteUtils.a(), 14.5f);
        }
    }

    private void e(Context context) {
        if (m()) {
            HealthBubbleLayout healthBubbleLayout = (HealthBubbleLayout) this.x.findViewById(R.id.clocking_rank_switch_bubble);
            this.ai = healthBubbleLayout;
            healthBubbleLayout.setOnClickListener(new View.OnClickListener() { // from class: jtu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f39039c.d(view);
                }
            });
            this.g = (HealthCardView) this.x.findViewById(R.id.clocking_rank_draw_graph);
            this.y = (HealthCardView) this.x.findViewById(R.id.clocking_rank_draw_route);
            a(this.n, this.g);
            a(this.m, this.y);
            this.g.setOnClickListener(new View.OnClickListener() { // from class: jtw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f39041a.a(view);
                }
            });
            this.y.setOnClickListener(new View.OnClickListener() { // from class: jtx
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.b(view);
                }
            });
            SharedPreferences sharedPreferences = context.getSharedPreferences(Integer.toString(20002), 0);
            this.ad = sharedPreferences;
            if (sharedPreferences != null) {
                if (sharedPreferences.getBoolean("routeDetailSwitchBubble", false)) {
                    this.ai.setVisibility(8);
                } else {
                    this.ai.setVisibility(0);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        boolean z = this.n;
        if (z && !this.m) {
            LogUtil.j("RunningRouteViewHolder", "Can't uncheck both");
            return;
        }
        d(!z, this.g);
        o();
        d("m4");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        boolean z = this.m;
        if (z && !this.n) {
            LogUtil.j("RunningRouteViewHolder", "Can't uncheck both");
            return;
        }
        b(!z, this.y);
        o();
        d("m5");
    }

    private void o() {
        this.ai.setVisibility(8);
        SharedPreferences sharedPreferences = this.ad;
        if (sharedPreferences != null) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putBoolean("routeDetailSwitchBubble", true);
            editorEdit.apply();
        }
    }

    public void f() {
        RunningRouteUtils.b(this.f39019a.get(), new RunningRouteUtils.GuideDialogCallBack() { // from class: jtq
            @Override // com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils.GuideDialogCallBack
            public final void showRecommendedRoute() {
                this.e.t();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        d(false, this.g);
        b(true, this.y);
    }

    private void d(boolean z, HealthCardView healthCardView) {
        if (healthCardView == null) {
            LogUtil.j("RunningRouteViewHolder", "drawButton is null in clickDrawButton");
            return;
        }
        this.n = z;
        a(z, healthCardView);
        p();
        q();
    }

    private void b(boolean z, HealthCardView healthCardView) {
        if (healthCardView == null) {
            LogUtil.j("RunningRouteViewHolder", "routeButton is null in clickRouteButton");
            return;
        }
        this.m = z;
        a(z, healthCardView);
        s();
    }

    private void p() {
        if (njy.e(this.f)) {
            ReleaseLogUtil.a("RunningRouteViewHolder", "mCpLineIds is empty");
            return;
        }
        Iterator<String> it = this.f.iterator();
        while (it.hasNext()) {
            this.t.setLineVisible(it.next(), this.n);
        }
    }

    private void q() {
        this.t.setOverlayVisible(this.v, this.n);
    }

    private void s() {
        this.t.setLineVisible(this.u, this.m);
    }

    private void a(boolean z, HealthCardView healthCardView) {
        if (z) {
            healthCardView.setCardBackgroundColor(qre.e(R.color.health_inside_view_card_background_color));
        } else {
            healthCardView.setCardBackgroundColor(qre.e(R.color.route_draw_choose_bg_color));
        }
    }

    private boolean m() {
        WeakReference<ClockingRankActivity> weakReference = this.f39019a;
        return (weakReference == null || weakReference.get() == null || !this.f39019a.get().d()) ? false : true;
    }

    private void b(final RouteSiteDistanceSortDialog routeSiteDistanceSortDialog) {
        LogUtil.a("RunningRouteViewHolder", "initTypeSortButton");
        d();
        this.ae.setOnClickListener(new View.OnClickListener() { // from class: jtv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.b(routeSiteDistanceSortDialog, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(RouteSiteDistanceSortDialog routeSiteDistanceSortDialog, View view) {
        jdo.a();
        routeSiteDistanceSortDialog.e(n(), new RouteSiteDistanceSortDialog.OnDialogClickListener() { // from class: jty
            @Override // com.huawei.healthcloud.plugintrack.runningroute.data.RouteSiteDistanceSortDialog.OnDialogClickListener
            public final void onDialogClick(jct jctVar) {
                this.d.b(jctVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(jct jctVar) {
        a(jctVar);
        d();
        b(false);
    }

    public void a(Context context, jpg jpgVar) {
        int iA = jaa.a(context, jpgVar.d, jpgVar.f38787a);
        this.q = iA;
        LogUtil.a("RunningRouteViewHolder", "initView with mapType: ", Integer.valueOf(iA));
        if (this.l != null) {
            d(context, jpgVar);
        }
    }

    private void d(Context context, jpg jpgVar) {
        int i = this.q;
        if (i == 1) {
            ReleaseLogUtil.d("RunningRouteViewHolder", "init Gaode Map");
            this.t = this.l.e((Bundle) null, BaseApplication.getContext());
            e(context, jpgVar);
        } else if (i == 2) {
            ReleaseLogUtil.d("RunningRouteViewHolder", "init google Map");
            b(context, jpgVar);
        } else if (i == 3) {
            ReleaseLogUtil.d("RunningRouteViewHolder", "init hms  Map");
            c(context, jpgVar);
        } else {
            if (i == -1) {
                ReleaseLogUtil.d("RunningRouteViewHolder", "init empty Map");
                this.t = this.l.b(null, context);
                e(context, jpgVar);
                return;
            }
            ReleaseLogUtil.a("RunningRouteViewHolder", "map type not match");
        }
    }

    private void b(final Context context, final jpg jpgVar) {
        this.l.c(context, null, new SyncMapCallback() { // from class: jts
            @Override // com.huawei.healthcloud.plugintrack.ui.map.SyncMapCallback
            public final void onMapReady(InterfaceHiMap interfaceHiMap) {
                this.d.a(context, jpgVar, interfaceHiMap);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context, jpg jpgVar, InterfaceHiMap interfaceHiMap) {
        if (interfaceHiMap == null) {
            ReleaseLogUtil.a("RunningRouteViewHolder", "initGoogleMap onMapReady map is null");
            return;
        }
        ReleaseLogUtil.d("RunningRouteViewHolder", "initGoogleMap finish");
        this.t = interfaceHiMap;
        e(context, jpgVar);
    }

    private void c(final Context context, final jpg jpgVar) {
        this.l.e(context, new SyncMapCallback() { // from class: jtp
            @Override // com.huawei.healthcloud.plugintrack.ui.map.SyncMapCallback
            public final void onMapReady(InterfaceHiMap interfaceHiMap) {
                this.f39035c.c(context, jpgVar, interfaceHiMap);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Context context, jpg jpgVar, InterfaceHiMap interfaceHiMap) {
        if (interfaceHiMap == null) {
            ReleaseLogUtil.a("RunningRouteViewHolder", "initHmsMap onMapReady hiMap is null");
            return;
        }
        ReleaseLogUtil.d("RunningRouteViewHolder", "initHmsMap finish");
        this.t = interfaceHiMap;
        e(context, jpgVar);
    }

    public void a(jpg jpgVar) {
        this.i = jpgVar;
        d(jpgVar, 14.5f);
    }

    private void d(jpg jpgVar, float f) {
        LogUtil.a("RunningRouteViewHolder", "changeLocation, mMpaFirstLoadSuccess: ", Boolean.valueOf(this.r), ", zoom: ", Float.valueOf(f));
        if (jpgVar != null) {
            LogUtil.a("RunningRouteViewHolder", "lat: ", Double.valueOf(jpgVar.d), ", lng: ", Double.valueOf(jpgVar.f38787a));
        }
        d(jpgVar);
        this.p = f;
        if (this.r) {
            c(jpgVar, f);
        } else {
            this.o = jpgVar;
        }
    }

    public void c() {
        if (this.i == null) {
            LogUtil.a("RunningRouteViewHolder", "mCameraLocation is null");
        }
        b(this.i);
    }

    public void b(jpg jpgVar) {
        d(jpgVar, this.h);
    }

    private void c(jpg jpgVar, float f) {
        jrr jrrVar = new jrr();
        jrrVar.d(jpgVar).a(f).b(0.0f).c(0.0f);
        this.t.animateCamera(jrrVar, 0L, (InterfaceMapCallback) null);
    }

    public void e(jpg jpgVar) {
        if (!this.r) {
            ReleaseLogUtil.e("RunningRouteViewHolder", "addSearchLocationMarker mMpaFirstLoadSuccess false");
            return;
        }
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(BaseApplication.getContext().getResources(), R.drawable.ic_location_search);
        this.e.add(bitmapDecodeResource);
        jrv jrvVar = new jrv();
        jrvVar.d(d);
        jrvVar.d(jpgVar);
        jrvVar.c(bitmapDecodeResource);
        int i = this.ab;
        if (i == 0) {
            this.ab = this.t.addMarker(jrvVar, null);
        } else {
            this.t.moveMarker(i, jpgVar);
        }
    }

    private void d(jpg jpgVar) {
        if (jpgVar == null) {
            LogUtil.a("RunningRouteViewHolder", "refreshCityName: latLng is null");
        } else {
            gch.b().getCityInfoWithGps(new gcy.e().a(jpgVar.d).c(jpgVar.f38787a).e(), new d(this));
        }
    }

    public void b(boolean z) {
        jct jctVarN = n();
        if (jctVarN == null) {
            ReleaseLogUtil.a("RunningRouteViewHolder", "routeInfo is null in sortTypeHotPath");
            return;
        }
        int iE = jctVarN.e();
        int iA = jctVarN.a();
        boolean z2 = false;
        for (Integer num : new HashSet(this.z.keySet())) {
            int iIntValue = num.intValue();
            RouteHintView routeHintView = this.z.get(num);
            if (routeHintView != null && c(iE, routeHintView.getPathDistanceType()) && c(iA, routeHintView.getPathType())) {
                this.t.showMarker(iIntValue, null);
                z2 = true;
            } else {
                this.t.hideMarker(iIntValue, null);
            }
        }
        if (z) {
            jdo.e(z2, iA);
        }
    }

    private boolean c(int i, List<Integer> list) {
        if (i == 0) {
            return true;
        }
        if (!njy.b(list)) {
            return false;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            if (i == it.next().intValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(Context context, List<gdr> list) {
        LogUtil.a("RunningRouteViewHolder", "drawRouterMarkerInMap, sortHotPath size: ", list == null ? Constants.NULL : Integer.valueOf(list.size()));
        if (!this.r) {
            this.aa = list;
            return;
        }
        if (njy.e(list)) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            gdr gdrVar = list.get(i);
            if (gdrVar != null && gdrVar.f() != null) {
                LogUtil.a("RunningRouteViewHolder", "show path: ", gdrVar.toString());
                GpsPoint gpsPointF = gdrVar.f();
                RouteHintView routeHintView = new RouteHintView(context);
                if ((context instanceof IRouteDetail) && this.r) {
                    routeHintView.b(gdrVar, (IRouteDetail) context);
                    Bitmap bitmapE = e(routeHintView);
                    jrv jrvVar = new jrv();
                    jrvVar.d(d);
                    jrvVar.d(b(gpsPointF));
                    jrvVar.c(bitmapE);
                    int iAddMarker = this.t.addMarker(jrvVar, null);
                    this.t.addMarkerClickListener(new b(this));
                    this.z.put(Integer.valueOf(iAddMarker), routeHintView);
                }
            }
        }
    }

    public void c(RouteHintMvpView routeHintMvpView) {
        gdm gdmVar;
        e(routeHintMvpView);
        if (!this.r || (gdmVar = this.k) == null || this.w == null) {
            ReleaseLogUtil.e("RunningRouteViewHolder", "setMvpMark mMpaFirstLoadSuccess false or mHotPathDetailInfo is null");
            return;
        }
        List<GpsPoint> listP = gdmVar.p();
        if (njy.e(listP)) {
            ReleaseLogUtil.e("RunningRouteViewHolder", "pathPoints is empty in setMvpMark");
            return;
        }
        LogUtil.a("RunningRouteViewHolder", "begin to setMvpMark");
        Bitmap bitmapE = e((View) this.w);
        jrv jrvVar = new jrv();
        jrvVar.d(d);
        jrvVar.d(b(listP.get(0)));
        jrvVar.c(bitmapE);
        int i = this.s;
        if (i != -1) {
            LogUtil.a("RunningRouteViewHolder", "mMvpMarkId = ", Integer.valueOf(i), ", begin to delete empty marker");
            this.t.hideMarker(this.s, null);
        }
        this.s = this.t.addMarker(jrvVar, null);
        this.t.disableMarkerClick();
    }

    private void e(RouteHintMvpView routeHintMvpView) {
        if (routeHintMvpView != null) {
            this.w = routeHintMvpView;
        }
    }

    public boolean d(int i) {
        return this.z.size() != i || this.z.size() == 0;
    }

    private Bitmap e(View view) {
        view.setDrawingCacheEnabled(true);
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.buildDrawingCache();
        return view.getDrawingCache();
    }

    public void a(gdm gdmVar) {
        if (gdmVar == null) {
            ReleaseLogUtil.a("RunningRouteViewHolder", "pathDetail is null in drawPathDetailToMap");
            return;
        }
        this.k = gdmVar;
        i();
        d(b(this.k.k()));
    }

    private void i() {
        if (this.k == null || !this.r) {
            ReleaseLogUtil.e("RunningRouteViewHolder", "mHotPathDetailInfo is null or map is loading");
            return;
        }
        b();
        gcl gclVarA = this.k.a();
        if (gclVarA != null) {
            b(gclVarA);
            d(gclVarA);
        }
        c(jdn.i());
        g();
        h();
    }

    private void h() {
        List<GpsPoint> listP = this.k.p();
        if (njy.e(listP)) {
            ReleaseLogUtil.a("RunningRouteViewHolder", "no path points, error");
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<GpsPoint> it = listP.iterator();
        while (it.hasNext()) {
            arrayList.add(b(it.next()));
        }
        gcl gclVarA = this.k.a();
        int iD = qrs.d(BaseApplication.getContext(), 340.0f);
        jru jruVar = new jru();
        jruVar.a(iD).b(iD);
        if (gclVarA == null || gclVarA.e() == null) {
            jruVar.e(qrs.d(BaseApplication.getContext(), 50.0f));
        } else {
            gco gcoVarE = gclVarA.e();
            arrayList.addAll(izt.b(b(gcoVarE.a()), (int) gcoVarE.e()));
            jruVar.e((float) gcoVarE.d());
        }
        jruVar.e(arrayList);
        this.t.animateCamera(jruVar, 0);
        this.t.scrollBy(0.0f, qrs.m() * 0.12f);
    }

    private void g() {
        LogUtil.a("RunningRouteViewHolder", "drawPathLines");
        List<GpsPoint> listP = this.k.p();
        if (njy.e(listP)) {
            ReleaseLogUtil.e("RunningRouteViewHolder", "drawHotTrackPath list is null");
            return;
        }
        ArrayList arrayList = new ArrayList(listP.size());
        Iterator<GpsPoint> it = listP.iterator();
        while (it.hasNext()) {
            arrayList.add(b(it.next()));
        }
        jrs jrsVar = new jrs();
        jrsVar.a(arrayList);
        jrsVar.c(m() ? f39018c : f39017b);
        jrsVar.e(9.0f);
        jrsVar.d(false);
        jrsVar.b(jer.d(4.0f));
        this.u = this.t.drawLines(jrsVar);
        if (m()) {
            jpg jpgVarB = b(listP.get(0));
            jpg jpgVarB2 = b(listP.get(listP.size() - 1));
            this.t.addMarker(new jrv().d(jpgVarB).b(13).c(BitmapFactory.decodeResource(BaseApplication.getContext().getResources(), R.drawable.hw_show_map_tracking_start_run_img)), null);
            this.t.addMarker(new jrv().d(jpgVarB2).b(13).c(BitmapFactory.decodeResource(BaseApplication.getContext().getResources(), R.drawable.hw_show_map_ending)), null);
        }
    }

    private void a(List<GpsPoint> list) {
        Bitmap bitmapA = qqf.a(qre.c(R.drawable.route_point));
        Iterator<GpsPoint> it = list.iterator();
        while (it.hasNext()) {
            this.t.addMarker(new jrv().b(12).c(0.5f, 0.5f).d(b(it.next())).c(bitmapA), null);
        }
    }

    private void d(gcl gclVar) {
        List<GpsPoint> listC = gclVar.c();
        List<gcs> listD = gclVar.d();
        if (njy.e(listD) || njy.e(listC)) {
            ReleaseLogUtil.a("RunningRouteViewHolder", "no cp gpsPoints");
            return;
        }
        a(listC);
        for (gcs gcsVar : listD) {
            jrs jrsVar = new jrs();
            jrsVar.b(d(listC, gcsVar.d()));
            jrsVar.e(d(listC, gcsVar.b()));
            jrsVar.c(f39017b);
            jrsVar.e(11.0f);
            jrsVar.b(jer.d(8.0f));
            this.f.add(this.t.drawLines(jrsVar));
        }
    }

    private void b(gcl gclVar) {
        gdw gdwVarN = this.k.n();
        if (gdwVarN == null) {
            LogUtil.j("RunningRouteViewHolder", "no PathImageInfo");
            return;
        }
        String strD = gdwVarN.d();
        if (TextUtils.isEmpty(strD)) {
            LogUtil.j("RunningRouteViewHolder", "no ImageBackgroundUrl");
        } else if (gclVar.e() == null) {
            ReleaseLogUtil.e("RunningRouteViewHolder", "no drawDrawBoard");
        } else {
            qqf.a(strD, new AnonymousClass3(gclVar.e()));
        }
    }

    /* JADX INFO: renamed from: jtk$3, reason: invalid class name */
    class AnonymousClass3 extends CustomTarget<Bitmap> {
        final /* synthetic */ gco e;

        @Override // com.bumptech.glide.request.target.Target
        public void onLoadCleared(Drawable drawable) {
        }

        AnonymousClass3(gco gcoVar) {
            this.e = gcoVar;
        }

        @Override // com.bumptech.glide.request.target.Target
        public /* synthetic */ void onResourceReady(Object obj, Transition transition) {
            c((Bitmap) obj, (Transition<? super Bitmap>) transition);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(Bitmap bitmap, gco gcoVar) {
            jtk.this.c(bitmap, gcoVar);
        }

        public void c(final Bitmap bitmap, Transition<? super Bitmap> transition) {
            final gco gcoVar = this.e;
            HandlerExecutor.c(new Runnable() { // from class: jua
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.c(bitmap, gcoVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Bitmap bitmap, gco gcoVar) {
        this.v = this.t.addOverlay(new jrz().b(b(gcoVar.a())).a((float) gcoVar.e()).c(10.0f).e((float) gcoVar.d()).b(bitmap));
    }

    private jpg b(GpsPoint gpsPoint) {
        jpg jpgVarB = izt.b(gpsPoint);
        gdm gdmVar = this.k;
        return gdmVar != null ? izt.a(jpgVarB, gdmVar.c(), this.q) : jpgVarB;
    }

    private jpg d(List<GpsPoint> list, int i) {
        if (njy.c(list, i)) {
            GpsPoint gpsPoint = list.get(i);
            if (gpsPoint.getIndex() == i) {
                return b(gpsPoint);
            }
        }
        for (GpsPoint gpsPoint2 : list) {
            if (gpsPoint2.getIndex() == i) {
                return b(gpsPoint2);
            }
        }
        return new jpg(90.0d, 180.0d);
    }

    private boolean e(final Context context, jpg jpgVar) {
        if (this.t == null) {
            ReleaseLogUtil.e("RunningRouteViewHolder", "mMapInterface is null");
            ((ClockingRankActivity) context).finish();
            return true;
        }
        if (qqs.e(BaseApplication.getContext())) {
            this.t.setMapShowType(3);
        } else {
            this.t.setMapShowType(0);
        }
        this.t.onCreate(null, false, false);
        this.t.setIsStop(false);
        this.t.onMapLoaded(jpgVar, 14.5f);
        r();
        this.t.setOnMapLoadedListener(new InterfaceMapLoadedCallback() { // from class: jtr
            @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapLoadedCallback
            public final void onMapLoaded() {
                this.f39036a.a(context);
            }
        });
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final Context context) {
        LogUtil.a("RunningRouteViewHolder", "onMapLoaded");
        this.r = true;
        HandlerExecutor.b(new Runnable() { // from class: jtt
            @Override // java.lang.Runnable
            public final void run() {
                this.d.b(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Context context) {
        jpg jpgVar = this.o;
        if (jpgVar != null) {
            d(jpgVar, this.p);
        }
        i();
        e(context, this.aa);
        c(this.w);
    }

    private void r() {
        this.t.setCameraChangeCallback(new InterfaceMapStatusChangeCallback() { // from class: jtk.4
            @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapStatusChangeCallback
            public void onMapStatusChange(jrr jrrVar) {
            }

            @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapStatusChangeCallback
            public void onMapStatusChangeFinish(jrr jrrVar) {
                if (jtk.this.j < jrrVar.e() && !((ClockingRankActivity) jtk.this.f39019a.get()).f()) {
                    jdo.f();
                } else if (jtk.this.j <= jrrVar.e() || ((ClockingRankActivity) jtk.this.f39019a.get()).f()) {
                    LogUtil.a("RunningRouteViewHolder", "curZoom is equal with originZoom, no need to bi");
                } else {
                    if (!((ClockingRankActivity) jtk.this.f39019a.get()).b()) {
                        jdo.j();
                    }
                    if (((ClockingRankActivity) jtk.this.f39019a.get()).b()) {
                        ((ClockingRankActivity) jtk.this.f39019a.get()).b(false);
                    }
                }
                jtk.this.j = jrrVar.e();
                jtk.this.ah = jrrVar;
            }
        });
    }

    public void j() {
        jrr jrrVar = this.ah;
        if (jrrVar == null) {
            LogUtil.a("RunningRouteViewHolder", "mStatusChangDescription is null");
        } else {
            this.i = jrrVar.a();
            this.h = this.ah.e();
        }
    }

    public void c(jpg jpgVar) {
        if (PermissionUtil.e(this.f39019a.get(), PermissionUtil.PermissionType.LOCATION) != PermissionUtil.PermissionResult.GRANTED) {
            LogUtil.j("RunningRouteViewHolder", "location permission is denied, cannot display user location marker");
            return;
        }
        InterfaceHiMap interfaceHiMap = this.t;
        if (interfaceHiMap != null) {
            interfaceHiMap.setMarkerIconPath(k(), l());
            this.t.addEndMarker(jpgVar, true);
        }
    }

    public void e() {
        gch.b().requestLocationUpdates(new e(this));
    }

    public void d() {
        WeakReference<ClockingRankActivity> weakReference = this.f39019a;
        if (weakReference == null) {
            ReleaseLogUtil.a("RunningRouteViewHolder", "mActivityWeakRef is null in setRouteInfo");
            return;
        }
        ClockingRankActivity clockingRankActivity = weakReference.get();
        if (clockingRankActivity != null) {
            clockingRankActivity.a();
        }
    }

    private void a(jct jctVar) {
        WeakReference<ClockingRankActivity> weakReference = this.f39019a;
        if (weakReference == null) {
            ReleaseLogUtil.a("RunningRouteViewHolder", "mActivityWeakRef is null in setRouteInfo");
            return;
        }
        ClockingRankActivity clockingRankActivity = weakReference.get();
        if (clockingRankActivity != null) {
            clockingRankActivity.c(jctVar);
        }
    }

    private jct n() {
        jct jctVar = new jct();
        WeakReference<ClockingRankActivity> weakReference = this.f39019a;
        if (weakReference == null) {
            ReleaseLogUtil.a("RunningRouteViewHolder", "mActivityWeakRef is null in getRouteInfo");
            return jctVar;
        }
        ClockingRankActivity clockingRankActivity = weakReference.get();
        return clockingRankActivity != null ? clockingRankActivity.c() : jctVar;
    }

    public void b() {
        if (this.t != null) {
            LogUtil.j("RunningRouteViewHolder", "mMapInterface clear");
            this.t.clear();
        }
        this.ab = 0;
        this.z.clear();
    }

    public void a() {
        InterfaceHiMap interfaceHiMap = this.t;
        if (interfaceHiMap != null) {
            interfaceHiMap.clear();
            this.t.onDestroy();
            this.ab = 0;
        }
        Iterator<Bitmap> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().recycle();
        }
        gch.b().removeLocationUpdates();
    }

    private String k() {
        String strE;
        jbq jbqVarD = iws.d("SportAdSportingIconOutdoor");
        if (jbqVarD == null || TextUtils.isEmpty(jbqVarD.e())) {
            strE = null;
        } else {
            strE = jbqVarD.e();
            MarketingBiUtils.e(13002, iws.e(13002));
        }
        LogUtil.a("RunningRouteViewHolder", "getSportAdIconPath() iconPath: ", strE);
        return strE;
    }

    private String l() {
        jbq jbqVarD = iws.d("SportAdSportingIconBgOutdoor");
        String strB = (jbqVarD == null || TextUtils.isEmpty(jbqVarD.b())) ? null : jbqVarD.b();
        LogUtil.a("RunningRouteViewHolder", "getSportAdBgIconPath() bgIconPath: ", strB);
        return strB;
    }

    private void d(String str) {
        gdm gdmVar = this.k;
        if (gdmVar != null) {
            jdo.b(1, str, gdmVar.o(), this.k.l(), m());
        }
    }

    static class e implements ILocationChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<jtk> f39023b;

        public e(jtk jtkVar) {
            this.f39023b = new WeakReference<>(jtkVar);
        }

        @Override // com.huawei.health.motiontrack.api.ILocationChangeListener
        public void onLocationChange(jpg jpgVar) {
            WeakReference<jtk> weakReference = this.f39023b;
            if (weakReference == null || weakReference.get() == null || this.f39023b.get().t == null) {
                return;
            }
            this.f39023b.get().t.addEndMarker(jpgVar);
        }
    }

    static class b implements InterfaceMapMarkerClickCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<jtk> f39021c;

        public b(jtk jtkVar) {
            this.f39021c = new WeakReference<>(jtkVar);
        }

        @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapMarkerClickCallback
        public void onMarkerClick(int i) {
            RouteHintView routeHintView;
            WeakReference<jtk> weakReference = this.f39021c;
            if (weakReference == null || weakReference.get() == null) {
                LogUtil.a("RunningRouteViewHolder", "MapMarkerClickCallback weakRef is null");
                return;
            }
            jtk jtkVar = this.f39021c.get();
            if (jtkVar.f39019a == null || jtkVar.f39019a.get() == null) {
                LogUtil.a("RunningRouteViewHolder", "onMarkerClick: activity is destroy");
            } else {
                if (i == -1 || !jtkVar.z.containsKey(Integer.valueOf(i)) || (routeHintView = (RouteHintView) jtkVar.z.get(Integer.valueOf(i))) == null) {
                    return;
                }
                RunningRouteUtils.e((Context) jtkVar.f39019a.get(), routeHintView.getPathId(), RunningRouteConstants.BiFromActivity.FROM_MAP.getIndex());
            }
        }
    }

    static class d extends UiCallback<gdc> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<jtk> f39022a;

        public d(jtk jtkVar) {
            this.f39022a = new WeakReference<>(jtkVar);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            ReleaseLogUtil.a("RunningRouteViewHolder", "GetCityInfoCallBack errorInfo: ", str);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(gdc gdcVar) {
            if (gdcVar == null) {
                ReleaseLogUtil.a("RunningRouteViewHolder", "GetCityInfoCallBack data is null");
                return;
            }
            HotPathCityInfo hotPathCityInfoE = gdcVar.e();
            if (hotPathCityInfoE == null) {
                ReleaseLogUtil.a("RunningRouteViewHolder", "GetCityInfoCallBack cityInfo is null");
                return;
            }
            jtk jtkVar = this.f39022a.get();
            if (jtkVar == null || jtkVar.ag == null) {
                return;
            }
            String cityName = hotPathCityInfoE.getCityName();
            LogUtil.a("RunningRouteViewHolder", "GetCityInfoCallBack cityName is ", cityName);
            jtkVar.ag.setTitleText(cityName);
        }
    }
}
