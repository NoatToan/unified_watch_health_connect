package com.huawei.healthcloud.plugintrack.ui.fragment;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.common.C;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.common.os.SystemInfo;
import com.huawei.haf.common.utils.ScreenUtil;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.trackprocess.model.GpsPoint;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.manager.inteface.ViewHolderInterface;
import com.huawei.healthcloud.plugintrack.model.MotionData;
import com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.automatchphoto.TrackPhotosDownload;
import com.huawei.healthcloud.plugintrack.ui.activity.DynamicTrackActivity;
import com.huawei.healthcloud.plugintrack.ui.activity.ScreenListener;
import com.huawei.healthcloud.plugintrack.ui.activity.TrackDetailActivity;
import com.huawei.healthcloud.plugintrack.ui.fragment.TrackScreenFrag;
import com.huawei.healthcloud.plugintrack.ui.map.HiMapHolder;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapCallback;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapLoadedCallback;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceSnapshotCallback;
import com.huawei.healthcloud.plugintrack.ui.map.SyncMapCallback;
import com.huawei.healthcloud.plugintrack.ui.map.datapreprocess.MapDataPreprocessor;
import com.huawei.healthcloud.plugintrack.ui.view.DynamicTimelineView;
import com.huawei.healthcloud.plugintrack.ui.view.TrackPaceColorGradientView;
import com.huawei.healthcloud.plugintrack.ui.view.WeatherInfoView;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.data.model.RelativeSportData;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwcloudmodel.model.unite.RouteData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.ble.BleConstants;
import com.huawei.route.Manger.RouteDataStorageManager;
import com.huawei.route.SceneType;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.bubblelayout.HealthBubbleLayout;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.numberpicker.HealthNumberPicker;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import defpackage.cxq;
import defpackage.gch;
import defpackage.gdm;
import defpackage.izn;
import defpackage.izt;
import defpackage.jaa;
import defpackage.jfg;
import defpackage.jpg;
import defpackage.jpq;
import defpackage.jqj;
import defpackage.jqk;
import defpackage.jqp;
import defpackage.jrn;
import defpackage.jrp;
import defpackage.jst;
import defpackage.jtn;
import defpackage.jvv;
import defpackage.jwb;
import defpackage.jxi;
import defpackage.jxk;
import defpackage.lmf;
import defpackage.lrd;
import defpackage.lrt;
import defpackage.lua;
import defpackage.njj;
import defpackage.njv;
import defpackage.njy;
import defpackage.nub;
import defpackage.qpx;
import defpackage.qqf;
import defpackage.qqp;
import defpackage.qqs;
import defpackage.qre;
import defpackage.qrk;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public class TrackScreenFrag extends Fragment implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f11136a = BaseApplication.getContext().getColor(R.color.colorAccent);
    private AnimatorSet ae;
    private Animator af;
    private RelativeLayout ag;
    private TrackDetailActivity.LoadMapListener ah;
    private AnimatorSet ai;
    private ConstraintLayout aj;
    private TrackPhotosDownload al;
    private View ap;
    private jtn ar;
    private List<jpg> as;
    private SyncMapCallback at;
    private LinearLayout au;
    private LinearLayout aw;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageButton f11137b;
    private WeatherInfoView bc;
    private boolean d;
    private HealthBubbleLayout f;
    private ImageButton g;
    private int k;
    private HealthTextView l;
    private Bitmap m;
    private int o;
    private HiMapHolder s;
    private boolean u;
    private boolean v;
    private boolean y;
    private List<jpg> z;
    private Context i = null;
    private jqp av = null;
    private InterfaceHiMap ak = null;
    private a ax = null;
    private View ay = null;
    private Handler q = new b();
    private int am = 0;
    private ImageButton h = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageButton f11138c = null;
    private ImageButton j = null;
    private LinearLayout e = null;
    private boolean aa = false;
    private boolean n = true;
    private boolean ab = true;
    private boolean r = false;
    private boolean x = false;
    private jfg ao = new jfg();
    private ScreenListener aq = null;
    private boolean p = false;
    private Handler an = new d(Looper.getMainLooper(), this);
    private boolean ad = false;
    private final int[] t = {0, 1, 3, 5, 10, 20};
    private boolean ac = false;
    private boolean w = false;

    static class d extends BaseHandler<TrackScreenFrag> {
        public d(Looper looper, TrackScreenFrag trackScreenFrag) {
            super(looper, trackScreenFrag);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(TrackScreenFrag trackScreenFrag, Message message) {
            if (message.what == 6 && (message.obj instanceof Integer)) {
                trackScreenFrag.c(((Integer) message.obj).intValue());
            }
        }
    }

    static class e extends UiCallback<gdm> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<TrackScreenFrag> f11168b;

        e(TrackScreenFrag trackScreenFrag) {
            this.f11168b = new WeakReference<>(trackScreenFrag);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            if (this.f11168b.get() != null) {
                qpx.b(BaseApplication.getContext(), R.string.IDS_track_show_detail_run_route_network_error);
            } else {
                LogUtil.e("Track_TrackScreenFrag", "failed frag is null");
            }
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(gdm gdmVar) {
            if (gdmVar == null) {
                LogUtil.e("Track_TrackScreenFrag", "hot track path data is null, return");
                return;
            }
            TrackScreenFrag trackScreenFrag = this.f11168b.get();
            if (trackScreenFrag == null) {
                LogUtil.e("Track_TrackScreenFrag", "success frag is null");
            } else {
                trackScreenFrag.c(gdmVar.p(), gdmVar.c());
            }
        }
    }

    public void a(SyncMapCallback syncMapCallback) {
        if (syncMapCallback == null) {
            LogUtil.e("Track_TrackScreenFrag", "callback is null, return");
        } else if (this.ak != null) {
            LogUtil.a("Track_TrackScreenFrag", "mMap is not null, trigger callback");
            syncMapCallback.onMapReady(this.ak);
        } else {
            this.at = syncMapCallback;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        LogUtil.a("Track_TrackScreenFrag", "startMatchAlbum IS_IGNORE_MATCH_PHOTOS");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogUtil.a("Track_TrackScreenFrag", "onCreateView");
        this.i = getActivity();
        FragmentActivity activity = getActivity();
        if (!(activity instanceof TrackDetailActivity)) {
            LogUtil.e("Track_TrackScreenFrag", "object is not instanceof TrackDetailActivity");
            return null;
        }
        this.p = false;
        boolean zD = ScreenUtil.d();
        this.y = zD;
        LogUtil.a("Track_TrackScreenFrag", "screen on when create", Boolean.valueOf(zD));
        TrackDetailActivity trackDetailActivity = (TrackDetailActivity) activity;
        this.av = trackDetailActivity.c();
        this.ap = trackDetailActivity.d();
        if (ae() && !this.av.a(0)) {
            jaa.d(this.i);
            this.am = this.av.b(this.i);
            if (layoutInflater == null) {
                throw new AssertionError("LayoutInflater not found.");
            }
            this.ay = layoutInflater.inflate(R.layout.track_detail_map_fragment, viewGroup, false);
            this.r = qqs.e(this.i);
            x();
            aa();
            y();
            w();
            ab();
            z();
            ac();
            ad();
            r();
            af();
            i();
            return this.ay;
        }
        this.x = true;
        return new View(this.i);
    }

    private void af() {
        MotionPathSimplify motionPathSimplifyD = this.av.d();
        if (motionPathSimplifyD == null || motionPathSimplifyD.requestExtendDataMap() == null) {
            LogUtil.e("Track_TrackScreenFrag", "initWeatherInfoView motionPathSimplify is null, return");
            this.bc.setVisibility(8);
            return;
        }
        boolean zC = jxi.c(motionPathSimplifyD);
        LogUtil.a("Track_TrackScreenFrag", "initWeatherInfoView hashWeatherInfo:" + zC);
        if (zC) {
            this.bc.setVisibility(0);
            this.bc.a(motionPathSimplifyD);
        } else {
            this.bc.setVisibility(8);
        }
    }

    private void ab() {
        if (!ae()) {
            LogUtil.j("Track_TrackScreenFrag", "initTimeline simplify is null");
            return;
        }
        MotionPathSimplify motionPathSimplifyD = this.av.d();
        if (nub.b(motionPathSimplifyD.requestSportType())) {
            int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(motionPathSimplifyD.requestTotalTime());
            int extendDataInt = motionPathSimplifyD.getExtendDataInt("skiCableTime", -1);
            int extendDataInt2 = motionPathSimplifyD.getExtendDataInt("skiFreeTime", -1);
            if (seconds <= 0 || extendDataInt <= 0) {
                ReleaseLogUtil.d("Track_TrackScreenFrag", "initTimeline skiTime or skiCableTime invalid");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new jst(qre.a(R.string.IDS_track_slide_format, UnitUtil.e(seconds)), Color.parseColor("#FB6522"), seconds));
            arrayList.add(new jst(qre.a(R.string.IDS_track_cable_format, UnitUtil.e(extendDataInt)), Color.parseColor("#13B2E7"), extendDataInt));
            if (extendDataInt2 > 0) {
                arrayList.add(new jst(qre.a(R.string.IDS_track_rest_format, UnitUtil.e(extendDataInt2)), Color.parseColor("#BCC4CF"), extendDataInt2));
            }
            ((DynamicTimelineView) this.ay.findViewById(R.id.ski_dynamic_timeline)).setSegments(arrayList);
            this.ay.findViewById(R.id.ski_dynamic_timeline_layout).setVisibility(0);
        }
    }

    private void z() {
        this.ax = new a(this.ay);
        HealthTextView healthTextView = (HealthTextView) this.ay.findViewById(R.id.track_main_page_right_unit);
        TrackPaceColorGradientView trackPaceColorGradientView = (TrackPaceColorGradientView) this.ay.findViewById(R.id.pace_color_gradient);
        if (LanguageUtil.ba(this.i)) {
            trackPaceColorGradientView.setRotationY(180.0f);
            healthTextView.setMaxWidth(qrs.d((Context) getActivity(), 72.0f));
            ViewGroup.LayoutParams layoutParams = this.ax.n.getLayoutParams();
            if (!(layoutParams instanceof LinearLayout.LayoutParams)) {
                LogUtil.e("Track_TrackScreenFrag", "objectLayoutParams is not LinearLayout.LayoutParams");
                return;
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 17;
            this.ax.n.setLayoutParams(layoutParams2);
        }
    }

    private void ac() {
        jqp jqpVar = this.av;
        if (jqpVar == null) {
            ReleaseLogUtil.a("Track_TrackScreenFrag", "mTrackDetailDataManager is null in initMapMsg");
            e();
        } else if (jqpVar.az()) {
            ReleaseLogUtil.d("Track_TrackScreenFrag", "NeedAfterProcess, wait");
            this.q.sendEmptyMessageDelayed(7, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        } else {
            e();
        }
    }

    private void i() {
        this.l.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: joz
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f38781b.an();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void an() {
        int width = this.au.getWidth();
        int iD = qrs.d(this.i, 50.0f);
        int width2 = ((width - iD) - this.ax.j.getWidth()) - this.ax.n.getWidth();
        int width3 = this.l.getWidth();
        if (width2 <= 0 || width2 >= width3) {
            return;
        }
        float textSize = this.l.getTextSize();
        this.l.setMaxWidth(width2);
        this.l.setTextSize(0, textSize - 1.0f);
    }

    private void r() {
        MotionPathSimplify motionPathSimplifyD = this.av.d();
        if (motionPathSimplifyD == null || motionPathSimplifyD.requestExtendDataMap() == null) {
            LogUtil.e("Track_TrackScreenFrag", "motionPathSimplify is null, return");
            return;
        }
        Map<String, String> mapRequestExtendDataMap = motionPathSimplifyD.requestExtendDataMap();
        String str = mapRequestExtendDataMap.get("hotPathId");
        if (TextUtils.isEmpty(str)) {
            LogUtil.d("Track_TrackScreenFrag", "hotPathId is null, return");
        } else if (jqj.c(motionPathSimplifyD)) {
            d(mapRequestExtendDataMap);
        } else {
            gch.b().getHotPathDetail(str, new e(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final List<GpsPoint> list, final String str) {
        a(new SyncMapCallback() { // from class: jov
            @Override // com.huawei.healthcloud.plugintrack.ui.map.SyncMapCallback
            public final void onMapReady(InterfaceHiMap interfaceHiMap) {
                jxu.b(list, str, interfaceHiMap);
            }
        });
    }

    private void x() {
        this.au = (LinearLayout) this.ay.findViewById(R.id.track_detail_sport_data_layout);
        this.aw = (LinearLayout) this.ay.findViewById(R.id.triathlon_sport_detail_layout);
        ImageButton imageButton = (ImageButton) this.ay.findViewById(R.id.track_btn_showMap);
        this.h = imageButton;
        imageButton.setOnClickListener(this);
        ImageButton imageButton2 = (ImageButton) this.ay.findViewById(R.id.track_btn_move_to_center);
        this.f11138c = imageButton2;
        imageButton2.setOnClickListener(this);
        this.aj = (ConstraintLayout) this.ay.findViewById(R.id.track_layout_map_share_control);
        this.f11137b = (ImageButton) this.ay.findViewById(R.id.track_btn_save_route);
        this.ag = (RelativeLayout) this.ay.findViewById(R.id.track_detail_map_londing);
        this.e = (LinearLayout) this.ay.findViewById(R.id.track_goto_retrack_ll);
        this.l = (HealthTextView) this.ay.findViewById(R.id.dynamic_track_guide_content);
        this.bc = (WeatherInfoView) this.ay.findViewById(R.id.weather_info_view);
        this.l.setOnClickListener(this);
        Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.aj.getLayoutParams();
        layoutParams.setMarginEnd(layoutParams.getMarginEnd() + ((Integer) safeRegionWidth.second).intValue());
        this.aj.setLayoutParams(layoutParams);
        this.aw.setPadding(((Integer) safeRegionWidth.first).intValue(), 0, ((Integer) safeRegionWidth.second).intValue(), 0);
    }

    private void y() {
        this.j = (ImageButton) this.ay.findViewById(R.id.track_btn_show_km_mi_markers);
        ImageButton imageButton = (ImageButton) this.ay.findViewById(R.id.track_btn_show_map_type_satellite);
        this.g = imageButton;
        imageButton.setOnClickListener(this);
        this.j.setBackgroundResource(nub.e(this.av.d().requestSportType()) ? R.drawable.track_show_map_tracking_turn_show : R.drawable.track_show_map_traking_km_show);
        if (nub.e(this.av.d().requestSportType())) {
            this.j.setOnClickListener(this);
        } else {
            this.j.setOnClickListener(new View.OnClickListener() { // from class: jor
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f38776c.b(view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        al();
    }

    private void al() {
        int iE;
        MotionPathSimplify motionPathSimplifyD = this.av.d();
        final int iRequestSportType = motionPathSimplifyD.requestSportType();
        final long jRequestStartTime = motionPathSimplifyD.requestStartTime();
        int iRequestTotalDistance = motionPathSimplifyD.requestTotalDistance();
        View viewInflate = View.inflate(getActivity(), R.layout.track_mark_select, null);
        final jwb jwbVarC = jpq.c(jRequestStartTime, iRequestSportType);
        if (jwbVarC == null) {
            iE = jpq.d(jRequestStartTime, iRequestSportType, iRequestTotalDistance);
        } else {
            iE = jwbVarC.e();
        }
        final AtomicInteger atomicIntegerB = b(iE);
        HealthNumberPicker healthNumberPicker = (HealthNumberPicker) viewInflate.findViewById(R.id.goal_setting_number_picker);
        ArrayList<String> arrayListQ = q();
        healthNumberPicker.setDisplayedValues((String[]) arrayListQ.toArray(new String[0]));
        healthNumberPicker.setMinValue(0);
        healthNumberPicker.setMaxValue(arrayListQ.size() - 1);
        healthNumberPicker.setValue(atomicIntegerB.get());
        healthNumberPicker.setOnValuePickedListener(new HealthNumberPicker.OnPickedListener() { // from class: jpa
            @Override // com.huawei.ui.commonui.numberpicker.HealthNumberPicker.OnPickedListener
            public final void onValuePicked(int i, int i2) {
                TrackScreenFrag.b(atomicIntegerB, i, i2);
            }
        });
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(requireActivity());
        builder.a(viewInflate);
        builder.e(qre.c(R.drawable.activity_dialog_bg));
        HealthImageView healthImageView = (HealthImageView) viewInflate.findViewById(R.id.close_dialog);
        HealthButton healthButtonC = builder.d(R.string.IDS_settings_button_ok, new DialogInterface.OnClickListener() { // from class: joy
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                LogUtil.a("Track_TrackScreenFrag", "getAdjustDialog dialog ", dialogInterface, " which ", Integer.valueOf(i));
            }
        }).c();
        healthButtonC.setBackground(qre.c(R.drawable.button_background_emphasize));
        healthButtonC.setTextColor(-1);
        builder.d(R.string.IDS_settings_button_ok, new DialogInterface.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.TrackScreenFrag.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                TrackScreenFrag.this.ak.intervalTrackMarkers(-1);
                int i2 = TrackScreenFrag.this.t[atomicIntegerB.get()];
                TrackScreenFrag.this.ak.intervalTrackMarkers(i2);
                jwb jwbVar = jwbVarC;
                if (jwbVar == null) {
                    jpq.e(new jwb(jRequestStartTime + "_" + iRequestSportType, i2));
                    LogUtil.a("Track_TrackScreenFrag", "spIntervalBean is null");
                    return;
                }
                jwbVar.b(i2);
                jpq.e(jwbVarC);
                LogUtil.a("Track_TrackScreenFrag", "FragmentUtils.saveSpIntervalBean " + jwbVarC);
            }
        });
        final CustomAlertDialog customAlertDialogB = builder.b();
        customAlertDialogB.setHarmonyStyle(true);
        customAlertDialogB.show();
        healthImageView.setOnClickListener(new View.OnClickListener() { // from class: jop
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                customAlertDialogB.dismiss();
            }
        });
    }

    public static /* synthetic */ void b(AtomicInteger atomicInteger, int i, int i2) {
        atomicInteger.set(i2);
        LogUtil.a("Track_TrackScreenFrag", "oldValue: ", Integer.valueOf(i), " newValue: ", Integer.valueOf(i2));
    }

    private AtomicInteger b(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.t;
            if (i2 < iArr.length) {
                if (i == iArr[i2]) {
                    return new AtomicInteger(i2);
                }
                i2++;
            } else {
                return new AtomicInteger(-2);
            }
        }
    }

    private ArrayList<String> q() {
        ArrayList<String> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            int[] iArr = this.t;
            if (i >= iArr.length) {
                return arrayList;
            }
            if (i == 0) {
                arrayList.add(getResources().getString(R.string.IDS_hw_track_select_no_interval_km));
            } else {
                String strE = UnitUtil.e(iArr[i], 1, 0);
                arrayList.add(getResources().getQuantityString(R.plurals.IDS_hw_track_select_interval_km, Integer.parseInt(strE), strE));
            }
            i++;
        }
    }

    private void aa() {
        if (s()) {
            LogUtil.a("Track_TrackScreenFrag", "trackMarkTip has been displayed");
            return;
        }
        ax();
        ((HealthTextView) this.ay.findViewById(R.id.track_marker_bubble_text)).setTextColor(qre.e(this.i, R.color.share_color_bottom_sheet_tab_select_bg));
        HealthBubbleLayout healthBubbleLayout = (HealthBubbleLayout) this.ay.findViewById(R.id.track_marker_bubble);
        this.f = healthBubbleLayout;
        healthBubbleLayout.setVisibility(0);
        this.f.setBubbleColor(qre.e(this.i, R.color.health_bubble_color));
    }

    private void ax() {
        lua.d(Integer.toString(20002), "track_marker_tip", true);
    }

    private boolean s() {
        return lua.a(Integer.toString(20002), "track_marker_tip", false);
    }

    private void w() {
        MotionPathSimplify motionPathSimplifyD = this.av.d();
        if (motionPathSimplifyD == null) {
            LogUtil.e("Track_TrackScreenFrag", "motionPathSimplify is null error");
        } else if (jqk.e(motionPathSimplifyD.requestSportType()) && Utils.h() && !this.av.ay()) {
            this.f11137b.setOnClickListener(this);
            this.f11137b.setVisibility(0);
        }
    }

    public Bitmap f() {
        HiMapHolder hiMapHolder = this.s;
        if (hiMapHolder != null) {
            return Bitmap.createBitmap(hiMapHolder.getWidth(), this.s.getHeight(), Bitmap.Config.ALPHA_8);
        }
        return null;
    }

    public void e() {
        if (this.s != null) {
            ReleaseLogUtil.d("Track_TrackScreenFrag", "mHiMapHolder != null ", Integer.valueOf(this.am));
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity == null) {
            LogUtil.e("Track_TrackScreenFrag", "initMap parentActivity is null");
            return;
        }
        this.s = (HiMapHolder) this.ay.findViewById(R.id.sport_track_map);
        ReleaseLogUtil.d("Track_TrackScreenFrag", "mHiMapHolder.isSyncLoadMap()=", Integer.valueOf(this.am));
        int i = this.am;
        if (i == 1) {
            c(activity);
        } else if (i == 2) {
            e(activity);
        } else if (i == 3) {
            d(activity);
        } else if (i == -1) {
            b(activity);
        } else {
            LogUtil.j("Track_TrackScreenFrag", "map type not match");
        }
        ScreenListener screenListener = new ScreenListener(this.i);
        this.aq = screenListener;
        screenListener.b(new ScreenListener.ScreenStateListener() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.TrackScreenFrag.13
            @Override // com.huawei.healthcloud.plugintrack.ui.activity.ScreenListener.ScreenStateListener
            public void onScreenOff() {
            }

            @Override // com.huawei.healthcloud.plugintrack.ui.activity.ScreenListener.ScreenStateListener
            public void onUserPresent() {
            }

            @Override // com.huawei.healthcloud.plugintrack.ui.activity.ScreenListener.ScreenStateListener
            public void onScreenOn() {
                if (TrackScreenFrag.this.aq != null) {
                    TrackScreenFrag.this.aq.a();
                    TrackScreenFrag.this.aq = null;
                }
                if (TrackScreenFrag.this.y || TrackScreenFrag.this.ak == null) {
                    return;
                }
                TrackScreenFrag.this.ak();
            }
        });
        this.q.sendEmptyMessageDelayed(2, 600L);
    }

    private void c(final Activity activity) {
        this.au.setVisibility(8);
        this.aj.setVisibility(8);
        this.e.setVisibility(8);
        this.ak = this.s.e((Bundle) null, this.i);
        new Thread(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.TrackScreenFrag.12
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("Track_TrackScreenFrag", "start run initGaode thread");
                TrackScreenFrag.this.as();
                if (TrackScreenFrag.this.ak == null) {
                    LogUtil.e("Track_TrackScreenFrag", "mMap is null");
                    activity.finish();
                } else {
                    if (TrackScreenFrag.this.r) {
                        TrackScreenFrag.this.ak.setMapShowType(3);
                    } else {
                        TrackScreenFrag.this.ak.setMapShowType(0);
                    }
                    TrackScreenFrag.this.q.sendEmptyMessage(6);
                }
            }
        }).start();
    }

    private void e(final Activity activity) {
        v();
        ImageButton imageButton = this.g;
        if (imageButton != null) {
            imageButton.setVisibility(8);
        }
        aq();
        this.d = false;
        this.s.c(this.i, null, new SyncMapCallback() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.TrackScreenFrag.16
            @Override // com.huawei.healthcloud.plugintrack.ui.map.SyncMapCallback
            public void onMapReady(InterfaceHiMap interfaceHiMap) {
                Activity activity2 = activity;
                if (activity2 == null || activity2.isFinishing()) {
                    LogUtil.j("Track_TrackScreenFrag", "Activity is null or is finishing in onMapReady");
                    return;
                }
                if (interfaceHiMap == null) {
                    LogUtil.e("Track_TrackScreenFrag", "onMapReady map is null");
                    activity.finish();
                    return;
                }
                TrackScreenFrag.this.ak = interfaceHiMap;
                if (TrackScreenFrag.this.at != null) {
                    TrackScreenFrag.this.at.onMapReady(TrackScreenFrag.this.ak);
                }
                TrackScreenFrag.this.as();
                if (!TrackScreenFrag.this.ah()) {
                    LogUtil.j("Track_TrackScreenFrag", "onMapReady() mTrackDetailDataManager is null");
                    TrackScreenFrag.this.ag.setVisibility(8);
                    TrackScreenFrag.this.ap.setVisibility(0);
                    if (TrackScreenFrag.this.ah != null) {
                        TrackScreenFrag.this.ah.endLoadMap();
                        return;
                    }
                    return;
                }
                if (jaa.b(TrackScreenFrag.this.i)) {
                    TrackScreenFrag trackScreenFrag = TrackScreenFrag.this;
                    trackScreenFrag.b(trackScreenFrag.ak);
                } else {
                    TrackScreenFrag.this.ag.setVisibility(8);
                    TrackScreenFrag.this.ap.setVisibility(0);
                }
            }
        });
    }

    private void d(final Activity activity) {
        v();
        aq();
        ImageButton imageButton = this.g;
        if (imageButton != null) {
            imageButton.setVisibility(8);
        }
        this.d = false;
        this.s.e(this.i, new SyncMapCallback() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.TrackScreenFrag.20
            @Override // com.huawei.healthcloud.plugintrack.ui.map.SyncMapCallback
            public void onMapReady(InterfaceHiMap interfaceHiMap) {
                if (interfaceHiMap == null) {
                    LogUtil.j("Track_TrackScreenFrag", "onMapReady hiMap is null");
                    activity.finish();
                    return;
                }
                TrackScreenFrag.this.ak = interfaceHiMap;
                if (TrackScreenFrag.this.at != null) {
                    TrackScreenFrag.this.at.onMapReady(TrackScreenFrag.this.ak);
                }
                TrackScreenFrag.this.as();
                if (TrackScreenFrag.this.r) {
                    TrackScreenFrag.this.ak.setMapShowType(3);
                } else {
                    TrackScreenFrag.this.ak.setMapShowType(0);
                }
                if (!TrackScreenFrag.this.ah()) {
                    LogUtil.j("Track_TrackScreenFrag", "onMapReady() mTrackDetailDataManager is null");
                    TrackScreenFrag.this.ag.setVisibility(8);
                    TrackScreenFrag.this.ap.setVisibility(8);
                    if (TrackScreenFrag.this.ah != null) {
                        TrackScreenFrag.this.ah.endLoadMap();
                        return;
                    }
                    return;
                }
                TrackScreenFrag trackScreenFrag = TrackScreenFrag.this;
                trackScreenFrag.b(trackScreenFrag.ak);
            }
        });
    }

    private void b(final Activity activity) {
        this.au.setVisibility(8);
        this.aj.setVisibility(8);
        this.e.setVisibility(8);
        this.ak = this.s.b(null, this.i);
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.TrackScreenFrag.17
            @Override // java.lang.Runnable
            public void run() {
                TrackScreenFrag.this.as();
                if (TrackScreenFrag.this.ak == null) {
                    LogUtil.e("Track_TrackScreenFrag", "mMap is null");
                    activity.finish();
                } else {
                    if (TrackScreenFrag.this.r) {
                        TrackScreenFrag.this.ak.setMapShowType(3);
                    } else {
                        TrackScreenFrag.this.ak.setMapShowType(0);
                    }
                    TrackScreenFrag.this.q.sendEmptyMessage(6);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bb() {
        InterfaceHiMap interfaceHiMap = this.ak;
        if (interfaceHiMap == null) {
            LogUtil.e("Track_TrackScreenFrag", "syncLoadMap mMap is null");
            return;
        }
        interfaceHiMap.setIsStop(true);
        boolean zIsNewCoordinate = false;
        this.ak.onCreate(null, false, false);
        this.ak.setShowMapEnd(true);
        ReleaseLogUtil.d("Track_TrackScreenFrag", "onMapLoaded");
        MotionPathSimplify motionPathSimplifyD = this.av.d();
        if (motionPathSimplifyD != null && !(zIsNewCoordinate = motionPathSimplifyD.isNewCoordinate()) && motionPathSimplifyD.requestMapType() == 2) {
            zIsNewCoordinate = true;
        }
        List<MotionData> listA = this.av.a();
        if (zIsNewCoordinate) {
            listA = this.ak.convertCoordinate(listA);
        }
        List<jrp> listPreprocess = jrn.e(listA, this.av.d()).preprocess();
        this.ak.loadMapWithPreprocessData(listPreprocess);
        this.z = izt.a(listPreprocess);
        this.as = this.ak.requestSimplePoints();
        this.ac = true;
        ap();
        this.ak.showOrHide(true);
        ar();
        u();
        m();
        n();
        this.q.post(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.TrackScreenFrag.18
            @Override // java.lang.Runnable
            public void run() {
                if (!(TrackScreenFrag.this.i instanceof Activity)) {
                    LogUtil.e("Track_TrackScreenFrag", "runload context is not instanceof Activity");
                    return;
                }
                Activity activity = (Activity) TrackScreenFrag.this.i;
                if (activity.isDestroyed() || activity.isFinishing()) {
                    LogUtil.e("Track_TrackScreenFrag", "activity is isDestroyed or isFinishing return ");
                } else {
                    TrackScreenFrag.this.ai.start();
                }
            }
        });
    }

    private void ar() {
        this.ak.registerAnimationListener(new InterfaceMapCallback() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.TrackScreenFrag.19
            @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapCallback
            public void onFinish() {
                TrackScreenFrag.this.q.post(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.TrackScreenFrag.19.4
                    @Override // java.lang.Runnable
                    public void run() {
                        TrackScreenFrag.this.aj.setVisibility(0);
                        TrackScreenFrag.this.ap.setVisibility(0);
                        TrackScreenFrag.this.ac = false;
                        TrackScreenFrag.this.bc();
                        if (TrackScreenFrag.this.ah != null) {
                            TrackScreenFrag.this.ah.endLoadMap();
                        }
                        TrackScreenFrag.this.ae.start();
                        TrackScreenFrag.this.av();
                        TrackScreenFrag.this.at();
                    }
                });
            }

            @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapCallback
            public void onCancel() {
                TrackScreenFrag.this.v();
                TrackScreenFrag.this.ap.setVisibility(0);
                if (TrackScreenFrag.this.ah != null) {
                    TrackScreenFrag.this.ah.endLoadMap();
                }
                TrackScreenFrag.this.aq();
                TrackScreenFrag.this.aj.setVisibility(0);
                TrackScreenFrag.this.ac = false;
                TrackScreenFrag.this.bc();
                TrackScreenFrag.this.av();
                TrackScreenFrag.this.at();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void at() {
        HandlerExecutor.c(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.TrackScreenFrag.24
            @Override // java.lang.Runnable
            public void run() {
                if (TrackScreenFrag.this.f != null) {
                    TrackScreenFrag.this.f.setVisibility(8);
                }
            }
        }, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void av() {
        MotionPathSimplify motionPathSimplifyD = this.av.d();
        int iRequestSportType = motionPathSimplifyD.requestSportType();
        long jRequestStartTime = motionPathSimplifyD.requestStartTime();
        int iRequestTotalDistance = motionPathSimplifyD.requestTotalDistance();
        if (nub.e(this.av.d().requestSportType())) {
            this.ak.intervalTrackMarkers(1);
            return;
        }
        if (aj()) {
            this.ak.intervalTrackMarkers(-1);
            this.j.setVisibility(8);
        } else {
            if (UnitUtil.f()) {
                this.ak.intervalTrackMarkers(-1);
            } else {
                this.ak.intervalTrackMarkers(jpq.d(jRequestStartTime, iRequestSportType, iRequestTotalDistance));
            }
            l();
        }
    }

    private boolean aj() {
        return this.av.d().requestSportType() == 222;
    }

    private void u() {
        Animator animatorLoadAnimator;
        Animator animatorLoadAnimator2 = AnimatorInflater.loadAnimator(this.i, R.animator.track_history_fade_in);
        animatorLoadAnimator2.setTarget(this.au);
        Animator animatorLoadAnimator3 = AnimatorInflater.loadAnimator(this.i, R.animator.track_history_fade_in);
        animatorLoadAnimator3.setTarget(this.aj);
        if (am()) {
            animatorLoadAnimator = AnimatorInflater.loadAnimator(this.i, R.animator.track_history_fade_in);
            animatorLoadAnimator.setTarget(this.e);
        } else {
            animatorLoadAnimator = null;
        }
        Animator animatorLoadAnimator4 = AnimatorInflater.loadAnimator(this.i, R.animator.track_history_fade_in);
        animatorLoadAnimator4.setTarget(this.ap);
        this.ae = new AnimatorSet();
        this.ai = new AnimatorSet();
        AnimatorSet animatorSet = new AnimatorSet();
        if (animatorLoadAnimator == null) {
            animatorSet.play(animatorLoadAnimator2);
        } else {
            animatorSet.playTogether(animatorLoadAnimator2, animatorLoadAnimator);
        }
        this.ae.playTogether(animatorLoadAnimator3, animatorLoadAnimator4);
        Animator animatorLoadAnimator5 = AnimatorInflater.loadAnimator(this.i, R.animator.track_history_fade_out);
        this.af = animatorLoadAnimator5;
        animatorLoadAnimator5.setTarget(this.ag);
        this.ai.playSequentially(this.af, animatorSet);
    }

    private void m() {
        this.af.addListener(new Animator.AnimatorListener() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.TrackScreenFrag.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                TrackScreenFrag.this.q.removeMessages(2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                TrackScreenFrag.this.ag.setVisibility(8);
                TrackScreenFrag.this.v();
                TrackScreenFrag.this.aq();
                TrackScreenFrag.this.t();
                TrackScreenFrag.this.ap.setVisibility(0);
                if (TrackScreenFrag.this.ah != null) {
                    TrackScreenFrag.this.ah.endLoadMap();
                }
            }
        });
    }

    /* JADX INFO: renamed from: com.huawei.healthcloud.plugintrack.ui.fragment.TrackScreenFrag$4, reason: invalid class name */
    public class AnonymousClass4 implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        AnonymousClass4() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            FragmentActivity activity = TrackScreenFrag.this.getActivity();
            if (activity != null) {
                activity.runOnUiThread(new Runnable() { // from class: jpc
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.d();
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d() {
            if (TrackScreenFrag.this.p) {
                ReleaseLogUtil.d("Track_TrackScreenFrag", "LoadFadeOutBeforeDrawing animation end then fragment is destroying");
            } else if (TrackScreenFrag.this.ak == null) {
                ReleaseLogUtil.d("Track_TrackScreenFrag", "LoadFadeOutBeforeDrawing animation end mMap is null");
            } else {
                TrackScreenFrag.this.ak.startMapAnimation(TrackScreenFrag.this.k == 0);
            }
        }
    }

    private void n() {
        this.ai.addListener(new AnonymousClass4());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aq() {
        jqp jqpVar = this.av;
        if (jqpVar == null || jqpVar.d() == null) {
            return;
        }
        if (this.av.d().requestSportType() == 512) {
            this.au.setVisibility(8);
            this.aw.setVisibility(0);
        } else {
            this.au.setVisibility(0);
            this.aw.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        if (!ae()) {
            LogUtil.j("Track_TrackScreenFrag", "initData() mTrackDetailDataManager is null");
            return;
        }
        MotionPathSimplify motionPathSimplifyD = this.av.d();
        int iRequestSportType = motionPathSimplifyD.requestSportType();
        if (motionPathSimplifyD.requestTrackType() == 1) {
            this.ax.l.setVisibility(0);
        }
        b(motionPathSimplifyD);
        jxk.b(this.ax.j, this.ax.n, motionPathSimplifyD.requestTotalDistance(), iRequestSportType);
        jxk.b(this.ax.w, this.ax.u, motionPathSimplifyD.requestTotalDistance(), iRequestSportType);
        String strE = jpq.e(motionPathSimplifyD.requestAvgPace());
        this.ax.g.setText(strE);
        String strD = jpq.d(motionPathSimplifyD.requestTotalCalories());
        this.ax.f11167c.setText(strD);
        this.ax.x.setText(strD);
        if (this.av.ay()) {
            k();
        } else if (iRequestSportType == 260) {
            i(motionPathSimplifyD);
        } else if (iRequestSportType == 266 || iRequestSportType == 262) {
            this.ax.g.setText(jpq.j(motionPathSimplifyD.requestAvgPace()));
            this.ax.t.setVisibility(0);
            this.ax.t.setGravity(GravityCompat.START);
            if (UnitUtil.f()) {
                this.ax.t.setText(getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit_mi, 100, 100));
            } else {
                this.ax.t.setText(getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit, 100, 100));
            }
        } else if (jpq.g(iRequestSportType)) {
            e(motionPathSimplifyD);
        } else if (iRequestSportType == 233) {
            a(strD, motionPathSimplifyD);
        } else if (iRequestSportType == 259 || iRequestSportType == 219 || jpq.h(iRequestSportType)) {
            a(motionPathSimplifyD);
        } else if (nub.e(iRequestSportType)) {
            c(motionPathSimplifyD);
        } else if (iRequestSportType == 222) {
            d(motionPathSimplifyD);
        } else {
            this.ax.g.setText(strE);
        }
        this.ax.p.setAutoTextInfo(9, 1, 1);
        List<njj> listBg = this.av.bg();
        a(iRequestSportType, listBg);
        if (d(motionPathSimplifyD, listBg)) {
            this.j.setVisibility(8);
        }
        MotionPath motionPathB = this.av.b();
        if (motionPathB != null) {
            a(motionPathSimplifyD, motionPathB.requestPaceList());
        }
    }

    private void a(String str, MotionPathSimplify motionPathSimplify) {
        String strF;
        this.ax.f11165a.setVisibility(8);
        this.ax.p.setText(R.string.IDS_track_total_calorie);
        this.ax.g.setText(str);
        this.ax.t.setText(R.string.IDS_motiontrack_show_kcal);
        this.ax.t.setVisibility(0);
        this.ax.t.setGravity(GravityCompat.START);
        double extendDataDouble = motionPathSimplify.getExtendDataDouble("bestSpeed", -1.0d);
        if (extendDataDouble > 0.0d) {
            if (UnitUtil.f()) {
                extendDataDouble = UnitUtil.e(extendDataDouble, 3);
                strF = qre.f(R.string.IDS_motiontrack_show_detail_average_speed_imp);
            } else {
                strF = qre.f(R.string.IDS_motiontrack_show_detail_average_speed);
            }
            String strE = UnitUtil.e(extendDataDouble, 1, 2);
            this.ax.r.setText(R.string.IDS_track_max_speed);
            this.ax.f11167c.setText(strE);
            this.ax.s.setText(strF);
            return;
        }
        this.ax.r.setVisibility(8);
        this.ax.f11167c.setVisibility(8);
        this.ax.s.setVisibility(8);
    }

    private void b(MotionPathSimplify motionPathSimplify) {
        String strE = jpq.e(motionPathSimplify.requestTotalTime());
        this.ax.f.setText(strE);
        this.ax.v.setText(strE);
        long jRequestStartTime = motionPathSimplify.requestStartTime();
        if (this.av.ay()) {
            List<RelativeSportData> listRequestChildSportItems = motionPathSimplify.requestChildSportItems();
            if (njy.b(listRequestChildSportItems) && listRequestChildSportItems.get(0) != null) {
                jRequestStartTime = listRequestChildSportItems.get(0).getStartTime();
            }
        }
        if (LanguageUtil.bt(this.i)) {
            this.ax.m.setText(new SimpleDateFormat("dd/MM/yyyy HH:mm", Locale.ENGLISH).format(Long.valueOf(jRequestStartTime)));
        } else {
            this.ax.m.setText(qrk.a(this.i, jRequestStartTime, 21));
        }
    }

    private void e(MotionPathSimplify motionPathSimplify) {
        this.ax.g.setText(izn.a(motionPathSimplify.requestAvgPace() / 2.0f));
        if (SystemInfo.c() && LanguageUtil.l(this.i)) {
            this.ax.t.setSingleLine(true);
        }
        this.ax.t.setVisibility(0);
        this.ax.t.setGravity(GravityCompat.START);
        this.ax.t.setText(qre.e(R.plurals.IDS_hwh_motiontrack_swim_pace_unit, 500, 500));
    }

    private void ad() {
        int i = this.am;
        if (i == 1) {
            this.ax.d.setText(this.i.getResources().getString(R.string.IDS_hw_show_data_tarck_map_type_setting_gaode));
            this.ax.y.setText(this.i.getResources().getString(R.string.IDS_hw_show_data_tarck_map_type_setting_gaode));
        } else if (i == 2) {
            this.ax.d.setText(this.i.getResources().getString(R.string.IDS_hw_show_data_tarck_map_type_setting_google));
            this.ax.y.setText(this.i.getResources().getString(R.string.IDS_hw_show_data_tarck_map_type_setting_google));
        } else if (i == 3) {
            this.ax.d.setText(this.i.getResources().getString(R.string.IDS_hw_petal_maps));
            this.ax.y.setText(this.i.getResources().getString(R.string.IDS_hw_petal_maps));
        } else {
            LogUtil.j("Track_TrackScreenFrag", "initMapLogo is default");
        }
    }

    private void a(MotionPathSimplify motionPathSimplify, List<njj> list) {
        if (!d(list, motionPathSimplify.requestSportType())) {
            Float[] fArrB = njv.b(list);
            List<Integer> listA = izt.a(fArrB[1].floatValue(), fArrB[0].floatValue(), motionPathSimplify.requestSportType());
            if (njy.e(listA)) {
                return;
            }
            this.ax.f11165a.setColors(listA);
            this.ax.e.setTextColor(listA.get(listA.size() - 1).intValue());
            this.ax.h.setTextColor(listA.get(0).intValue());
            this.ax.f11166b.setTextColor(listA.get(listA.size() - 1).intValue());
            this.ax.i.setTextColor(listA.get(0).intValue());
            return;
        }
        this.ax.f11165a.setVisibility(8);
        this.ax.e.setVisibility(8);
        this.ax.h.setVisibility(8);
        this.ax.f11166b.setVisibility(8);
        this.ax.i.setVisibility(8);
    }

    private boolean d(List<njj> list, int i) {
        return d(list) || !this.av.c(this.i) || this.av.ay() || i == 233;
    }

    private boolean d(MotionPathSimplify motionPathSimplify, List<njj> list) {
        if (d(list) && j(motionPathSimplify)) {
            return true;
        }
        return (!nub.e(motionPathSimplify.requestSportType()) && UnitUtil.f()) || h(motionPathSimplify) || motionPathSimplify.requestSportType() == 512 || this.av.ay();
    }

    private void i(MotionPathSimplify motionPathSimplify) {
        String string;
        String strE;
        double dRequestCreepingWave = motionPathSimplify.requestCreepingWave() / 10.0f;
        if (dRequestCreepingWave <= 1.0E-6d) {
            a(motionPathSimplify);
            return;
        }
        this.ax.p.setText(R.string.IDS_hwh_motiontrack_total_climbed);
        if (UnitUtil.f()) {
            double dE = UnitUtil.e(dRequestCreepingWave, 1);
            string = this.i.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_ft_string, (int) Math.round(dE));
            strE = UnitUtil.e(dE, 1, 2);
        } else {
            string = this.i.getResources().getString(R.string.IDS_fitness_data_list_activity_meter_unit);
            strE = UnitUtil.e(dRequestCreepingWave, 1, 1);
        }
        this.ax.g.setText(strE);
        this.ax.t.setVisibility(0);
        this.ax.t.setGravity(GravityCompat.START);
        this.ax.t.setText(string);
    }

    private void a(int i, List<njj> list) {
        String strA;
        if (list == null) {
            LogUtil.e("Track_TrackScreenFrag", "constructPace paceList is null");
            return;
        }
        if (list.size() >= 2 && !this.av.ay() && i != 233) {
            Float[] fArrB = njv.b(list);
            String strA2 = a(fArrB[0], i, this.ax);
            String strA3 = a(fArrB[1], i, this.ax);
            if (!jpq.i(i) || !jpq.e(this.av)) {
                strA = strA3;
            } else if (jpq.d(this.av)) {
                strA = jpq.a(this.av, false);
                strA2 = jpq.e(this.av, false);
            } else {
                this.ax.e.setVisibility(8);
                this.ax.h.setVisibility(8);
                this.ax.f11166b.setVisibility(8);
                this.ax.i.setVisibility(8);
                strA = strA3;
            }
            this.ax.a(true, strA2, strA, i, this.i);
            return;
        }
        this.ax.a(false, null, null, i, this.i);
    }

    private void a(MotionPathSimplify motionPathSimplify) {
        String strI = jpq.i(motionPathSimplify.requestAvgPace());
        this.ax.p.setText(R.string.IDS_motiontrack_show_detail_averagespeed);
        this.ax.g.setText(strI);
        this.ax.t.setVisibility(0);
        this.ax.t.setGravity(GravityCompat.START);
        if (UnitUtil.f()) {
            this.ax.t.setText(this.i.getString(R.string.IDS_motiontrack_show_detail_average_speed_imp));
        } else {
            this.ax.t.setText(this.i.getString(R.string.IDS_motiontrack_show_detail_average_speed));
        }
    }

    private void d(MotionPathSimplify motionPathSimplify) {
        this.ax.j.setText(izn.c(motionPathSimplify.requestTotalTime(), R.style.sport_day_hour_min_num_50dp, R.style.sport_day_hour_min_unit_12dp));
        this.ax.u.setVisibility(8);
        this.ax.n.setVisibility(8);
        this.ax.w.setVisibility(8);
        View viewFindViewById = this.ay.findViewById(R.id.track_main_page_center_data_Layout);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        this.ax.o.setText(R.string.IDS_hw_sport_waypoint_mileage);
        int extendDataInt = motionPathSimplify.getExtendDataInt("wayPointDistance");
        this.ax.f.setText(extendDataInt == 0 ? this.i.getString(R.string.IDS_motiontrack_show_invalid_data) : jpq.b(extendDataInt));
        this.ax.k.setVisibility(0);
        this.ax.s.setMaxWidth(R.dimen.hw_group_icon_64dp);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(motionPathSimplify.requestTotalTime());
        this.ax.r.setText(R.string.IDS_hw_sport_waypoint_averagespeed);
        this.ax.f11167c.setText(jpq.d(extendDataInt, seconds));
        if (UnitUtil.f()) {
            this.ax.s.setText(this.i.getString(R.string.IDS_motiontrack_show_detail_average_speed_imp));
            this.ax.k.setText(R.string.IDS_motiontrack_show_sport_unit_mi);
        } else {
            this.ax.s.setText(this.i.getString(R.string.IDS_motiontrack_show_detail_average_speed));
            this.ax.k.setText(R.string.IDS_motiontrack_show_sport_unit_km);
        }
    }

    private void k() {
        this.ax.w.setVisibility(8);
        this.ax.u.setVisibility(8);
        this.ax.h.setVisibility(8);
        this.ax.i.setVisibility(8);
        this.ax.e.setVisibility(8);
        this.ax.f11166b.setVisibility(8);
        View viewFindViewById = this.ay.findViewById(R.id.track_main_page_center_data_Layout);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
    }

    private void c(MotionPathSimplify motionPathSimplify) {
        int iRequestTotalDistance = motionPathSimplify.requestTotalDistance();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(motionPathSimplify.requestTotalTime());
        this.ax.o.setText(R.string.IDS_motiontrack_show_detail_ski_time);
        this.ax.p.setText(R.string.IDS_motiontrack_show_detail_average_ski_speed);
        this.ax.g.setText(jpq.d(iRequestTotalDistance, seconds));
        this.ax.t.setVisibility(0);
        this.ax.t.setGravity(GravityCompat.START);
        if (UnitUtil.f()) {
            this.ax.t.setText(this.i.getString(R.string.IDS_motiontrack_show_detail_average_speed_imp));
        } else {
            this.ax.t.setText(this.i.getString(R.string.IDS_motiontrack_show_detail_average_speed));
        }
        this.ax.r.setText(R.string.IDS_motiontrack_show_detail_laps);
        this.ax.s.setVisibility(8);
        this.ax.s.setAutoTextInfo(9, 1, 2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.ax.q.getLayoutParams());
        layoutParams.gravity = 1;
        this.ax.q.setLayoutParams(layoutParams);
        this.ax.f11167c.setText(UnitUtil.e(motionPathSimplify.getExtendDataInt("skiTripTimes", 0), 1, 0));
        this.ax.f11165a.setVisibility(8);
    }

    private boolean h(MotionPathSimplify motionPathSimplify) {
        return motionPathSimplify.requestSportType() == 266 || motionPathSimplify.requestSportType() == 262;
    }

    private boolean d(List<njj> list) {
        return list == null || list.isEmpty();
    }

    private boolean j(MotionPathSimplify motionPathSimplify) {
        return motionPathSimplify.getExtendDataInt("skiTripTimes", 0) == 0;
    }

    private String a(Float f, int i, a aVar) {
        String strA = izn.a(f.floatValue());
        if (jpq.i(i) && this.i != null) {
            aVar.t.setVisibility(0);
            aVar.t.setGravity(GravityCompat.START);
            return jpq.h(f.floatValue());
        }
        if (i == 266 || i == 262) {
            aVar.t.setVisibility(0);
            aVar.t.setGravity(GravityCompat.START);
            return jpq.h(f.floatValue() / 10.0f);
        }
        aVar.t.setVisibility(8);
        aVar.t.setGravity(17);
        return strA;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        InterfaceHiMap interfaceHiMap = this.ak;
        if (interfaceHiMap != null) {
            interfaceHiMap.onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        InterfaceHiMap interfaceHiMap;
        super.onResume();
        if (this.x || (interfaceHiMap = this.ak) == null) {
            return;
        }
        interfaceHiMap.onResume();
        ak();
    }

    public void j() {
        HiMapHolder hiMapHolder = this.s;
        if (hiMapHolder == null || this.am != 1) {
            return;
        }
        hiMapHolder.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        InterfaceHiMap interfaceHiMap;
        super.onPause();
        if (this.x || (interfaceHiMap = this.ak) == null) {
            return;
        }
        interfaceHiMap.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        InterfaceHiMap interfaceHiMap = this.ak;
        if (interfaceHiMap != null) {
            interfaceHiMap.onStop();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.p = true;
        if (this.x) {
            return;
        }
        Handler handler = this.q;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        if (this.al != null) {
            LogUtil.a("Track_TrackScreenFrag", "TrackScreenFrag onDestroy TrackPhotosDownload goto destroy");
            this.al.b();
        }
        AnimatorSet animatorSet = this.ae;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.ae.cancel();
            this.ae = null;
        }
        AnimatorSet animatorSet2 = this.ai;
        if (animatorSet2 != null && animatorSet2.isRunning()) {
            this.ai.cancel();
            this.ai = null;
        }
        Bitmap bitmap = this.m;
        if (bitmap != null) {
            if (!bitmap.isRecycled()) {
                this.m.recycle();
            }
            this.m = null;
        }
        ScreenListener screenListener = this.aq;
        if (screenListener != null) {
            screenListener.a();
            this.aq = null;
        }
        InterfaceHiMap interfaceHiMap = this.ak;
        if (interfaceHiMap != null) {
            interfaceHiMap.onDestroy();
        }
        HiMapHolder hiMapHolder = this.s;
        if (hiMapHolder != null) {
            hiMapHolder.e();
            this.s = null;
        }
        jtn jtnVar = this.ar;
        if (jtnVar != null) {
            jtnVar.a();
            this.ar = null;
        }
        FileUtils.b(new File(lrt.f40735a));
    }

    public void e(final Handler handler) {
        if (handler == null) {
            LogUtil.e("Track_TrackScreenFrag", "handler is null");
            return;
        }
        if (!ah()) {
            LogUtil.j("Track_TrackScreenFrag", "shareSportData() mTrackDetailDataManager is null");
            return;
        }
        if (ai()) {
            if (!this.ak.isAnimationStart()) {
                handler.postDelayed(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.TrackScreenFrag.3
                    @Override // java.lang.Runnable
                    public void run() {
                        TrackScreenFrag.this.ak.cancelAnimation();
                        TrackScreenFrag.this.b(handler);
                    }
                }, 500L);
                return;
            } else {
                this.ak.cancelAnimation();
                this.ak.getMapScreenShot(handler, this.av.g());
                return;
            }
        }
        if (!ag()) {
            LogUtil.e("Track_TrackScreenFrag", "Map is all null,share data");
            return;
        }
        if (!this.w) {
            ReleaseLogUtil.a("Track_TrackScreenFrag", "googleMap is not finish");
            handler.sendEmptyMessageDelayed(1, 200L);
        } else if (this.o == 0) {
            this.ak.getMapScreenShot(handler, this.av.g());
        } else {
            d(handler);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final Handler handler) {
        if (this.av.q() || this.av.ay()) {
            handler.postDelayed(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.TrackScreenFrag.5
                @Override // java.lang.Runnable
                public void run() {
                    TrackScreenFrag.this.ak.getMapScreenShot(handler, TrackScreenFrag.this.av.g());
                }
            }, 200L);
        } else {
            this.ak.getMapScreenShot(handler, this.av.g());
        }
    }

    private void d(final Handler handler) {
        if (this.u) {
            if (this.v) {
                handler.sendEmptyMessageDelayed(1, 200L);
                return;
            } else {
                ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.TrackScreenFrag.9
                    @Override // java.lang.Runnable
                    public void run() {
                        Message messageObtain = Message.obtain(handler);
                        try {
                            messageObtain.obj = BitmapFactory.decodeFile(new File(TrackScreenFrag.this.i.getFilesDir(), "google_temp.png").getCanonicalPath());
                        } catch (IOException unused) {
                            LogUtil.j("Track_TrackScreenFrag", "decode google mIMap jpg error 1");
                            messageObtain.obj = null;
                        }
                        messageObtain.what = 1;
                        messageObtain.sendToTarget();
                    }
                });
                return;
            }
        }
        handler.postDelayed(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.TrackScreenFrag.10
            @Override // java.lang.Runnable
            public void run() {
                if (TrackScreenFrag.this.u && !TrackScreenFrag.this.v) {
                    ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.TrackScreenFrag.10.3
                        @Override // java.lang.Runnable
                        public void run() {
                            Message messageObtain = Message.obtain(handler);
                            try {
                                messageObtain.obj = BitmapFactory.decodeFile(new File(TrackScreenFrag.this.i.getFilesDir(), "google_temp.png").getCanonicalPath());
                            } catch (IOException unused) {
                                LogUtil.j("Track_TrackScreenFrag", "decode google mIMap jpg error 2");
                                messageObtain.obj = null;
                            }
                            messageObtain.what = 1;
                            messageObtain.sendToTarget();
                        }
                    });
                } else {
                    handler.sendEmptyMessage(1);
                }
            }
        }, 1000L);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i;
        if (view == null) {
            LogUtil.e("Track_TrackScreenFrag", "view is null");
            return;
        }
        if (this.ak == null) {
            LogUtil.e("Track_TrackScreenFrag", "onClick track_btn_showMap map not ready");
            return;
        }
        HashMap map = new HashMap(16);
        map.put("click", 1);
        if (view.getId() == R.id.track_btn_showMap) {
            boolean z = !this.ab;
            this.ab = z;
            this.ak.showOrHide(z);
            this.h.setBackgroundResource(this.ab ? R.drawable.track_ic_health_motionrecord_map_turnon : R.drawable.track_ic_health_motionrecord_map_turnoff);
            lrd.b(this.h, qre.f(this.ab ? R.string.accessibility_hide_map : R.string.accessibility_show_map));
            LogUtil.a("Track_TrackScreenFrag", "showOrHideMap click , show mIMap is ", Boolean.valueOf(this.ab), ",mIsShowTrackMapTypeSatellite=", Boolean.valueOf(this.aa));
            map.put("type", 1);
        } else {
            if (view.getId() == R.id.track_btn_move_to_center) {
                ak();
                LogUtil.a("Track_TrackScreenFrag", "moveMapToCenter click");
                map.put("type", 0);
            } else if (view.getId() == R.id.track_btn_show_km_mi_markers) {
                e(map);
            } else if (view.getId() == R.id.track_btn_show_map_type_satellite) {
                boolean z2 = !this.aa;
                this.aa = z2;
                this.ak.showSatelLiteState(this.ab, z2, this.r ? 3 : 0);
                ImageButton imageButton = this.g;
                if (this.aa) {
                    i = R.drawable.track_show_map_traking_show_satellite_map;
                } else {
                    i = R.drawable.track_show_map_traking_show_normal_map;
                }
                imageButton.setBackgroundResource(i);
                lrd.b(this.g, qre.f(this.aa ? R.string.accessibility_show_2d_map : R.string.accessibility_show_real_map));
            } else if (view.getId() == R.id.dynamic_track_guide_content) {
                LogUtil.a("Track_TrackScreenFrag", "enterDynamicTrackAct");
                c();
            } else if (view.getId() == R.id.track_btn_save_route) {
                au();
            } else if (view.getId() == R.id.route_draw_btn_track) {
                b(false);
            } else if (view.getId() != R.id.route_draw_btn_shape) {
                LogUtil.d("Track_TrackScreenFrag", "touch is not id");
            } else {
                b(true);
            }
        }
        b(map);
    }

    private void b(Map<String, Object> map) {
        int iRequestTrackType;
        MotionPathSimplify motionPathSimplifyD = this.av.d();
        if (motionPathSimplifyD != null) {
            map.put(BleConstants.SPORT_TYPE, Integer.valueOf(this.av.d().requestSportType()));
            iRequestTrackType = motionPathSimplifyD.requestTrackType();
            if (motionPathSimplifyD.requestSportDataSource() == 2) {
                iRequestTrackType = 6;
            }
        } else {
            iRequestTrackType = 0;
        }
        map.put("trackType", Integer.valueOf(iRequestTrackType));
        lmf.d().c(this.i, AnalyticsValue.MOTION_TRACK_1040022.value(), map, 0);
    }

    private void e(Map<String, Object> map) {
        boolean z = !this.n;
        this.n = z;
        d(z);
        map.put("type", 3);
    }

    private void d(boolean z) {
        MotionPathSimplify motionPathSimplifyD = this.av.d();
        int iRequestSportType = motionPathSimplifyD.requestSportType();
        long jRequestStartTime = motionPathSimplifyD.requestStartTime();
        int iRequestTotalDistance = motionPathSimplifyD.requestTotalDistance();
        this.n = z;
        if (nub.e(this.av.d().requestSportType())) {
            this.j.setBackgroundResource(this.n ? R.drawable.track_show_map_tracking_turn_show : R.drawable.track_show_map_tracking_turn_hide);
            if (this.n) {
                this.ak.intervalTrackMarkers(1);
            } else {
                this.ak.intervalTrackMarkers(-1);
            }
        } else {
            this.j.setBackgroundResource(R.drawable.track_show_map_traking_km_show);
            this.ak.intervalTrackMarkers(jpq.d(jRequestStartTime, iRequestSportType, iRequestTotalDistance));
        }
        lrd.b(this.j, qre.f(R.string.accessibility_show_distance));
    }

    private void aw() {
        if (this.ab) {
            if (this.aa) {
                this.ak.setMapShowType(1);
                return;
            } else if (this.r) {
                this.ak.setMapShowType(3);
                return;
            } else {
                this.ak.setMapShowType(0);
                return;
            }
        }
        this.ak.setMapShowType(2);
    }

    private boolean ai() {
        return (this.am == 2 || this.ak == null) ? false : true;
    }

    private boolean ag() {
        return this.am == 2 && this.ak != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ah() {
        jqp jqpVar = this.av;
        return jqpVar != null && njy.b(jqpVar.a());
    }

    private boolean ae() {
        jqp jqpVar = this.av;
        return (jqpVar == null || jqpVar.d() == null) ? false : true;
    }

    public void d(int i) {
        if (this.x) {
            return;
        }
        this.k = i;
        if (i == 0) {
            this.u = false;
        } else if (ai()) {
            this.ak.cancelAnimation();
        } else {
            LogUtil.d("Track_TrackScreenFrag", "is google mIMap save tab");
        }
        if (this.d) {
            if (ag() && this.o == 0 && this.w) {
                this.ak.screenShotToFile(new InterfaceSnapshotCallback() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.TrackScreenFrag.6
                    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceSnapshotCallback
                    public void onSnapshotReady(Bitmap bitmap) {
                        if (bitmap != null) {
                            TrackScreenFrag.this.b(bitmap);
                        } else {
                            TrackScreenFrag.this.v = true;
                            TrackScreenFrag.this.u = true;
                        }
                    }
                });
            }
            this.o = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Bitmap bitmap) {
        this.m = bitmap;
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.TrackScreenFrag.7
            @Override // java.lang.Runnable
            public void run() {
                TrackScreenFrag.this.v = false;
                FileOutputStream fileOutputStreamOpenOutputStream = null;
                try {
                    try {
                        fileOutputStreamOpenOutputStream = org.apache.commons.io.FileUtils.openOutputStream(new File(TrackScreenFrag.this.i.getFilesDir(), "google_temp.png"));
                        if (TrackScreenFrag.this.m != null) {
                            TrackScreenFrag.this.m.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStreamOpenOutputStream);
                        }
                        fileOutputStreamOpenOutputStream.flush();
                        if (fileOutputStreamOpenOutputStream != null) {
                            try {
                                fileOutputStreamOpenOutputStream.close();
                            } catch (IOException e2) {
                                LogUtil.j("Track_TrackScreenFrag", "close IOException ", e2.getMessage());
                            }
                        }
                    } catch (Throwable th) {
                        if (fileOutputStreamOpenOutputStream != null) {
                            try {
                                fileOutputStreamOpenOutputStream.close();
                            } catch (IOException e3) {
                                LogUtil.j("Track_TrackScreenFrag", "close IOException ", e3.getMessage());
                            }
                        }
                        throw th;
                    }
                } catch (IOException e4) {
                    TrackScreenFrag.this.v = true;
                    LogUtil.j("Track_TrackScreenFrag", "saveBmpToFile:IOException ", e4.getMessage());
                    if (fileOutputStreamOpenOutputStream != null) {
                        try {
                            fileOutputStreamOpenOutputStream.close();
                        } catch (IOException e5) {
                            LogUtil.j("Track_TrackScreenFrag", "close IOException ", e5.getMessage());
                        }
                    }
                } catch (IllegalArgumentException e6) {
                    TrackScreenFrag.this.v = true;
                    LogUtil.j("Track_TrackScreenFrag", "saveBmpToFile:IllegalArgumentException ", e6.getMessage());
                    if (fileOutputStreamOpenOutputStream != null) {
                        try {
                            fileOutputStreamOpenOutputStream.close();
                        } catch (IOException e7) {
                            LogUtil.j("Track_TrackScreenFrag", "close IOException ", e7.getMessage());
                        }
                    }
                }
                TrackScreenFrag.this.u = true;
            }
        });
    }

    public boolean a() {
        return this.am == 2;
    }

    public List<jpg> h() {
        return this.as;
    }

    public List<jpg> g() {
        return this.z;
    }

    public void e(TrackDetailActivity.LoadMapListener loadMapListener) {
        this.ah = loadMapListener;
    }

    static class b extends Handler {
        private WeakReference<TrackScreenFrag> d;

        private b(TrackScreenFrag trackScreenFrag) {
            this.d = null;
            this.d = new WeakReference<>(trackScreenFrag);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            super.handleMessage(message);
            TrackScreenFrag trackScreenFrag = this.d.get();
            if (trackScreenFrag == null) {
                LogUtil.e("Track_TrackScreenFrag", "TrackScreenFragHandler trackScreenFrag is null return");
            }
            ReleaseLogUtil.d("Track_TrackScreenFrag", "TrackScreenFragHandler received ", Integer.valueOf(message.what));
            switch (message.what) {
                case 2:
                    trackScreenFrag.ag.setVisibility(0);
                    break;
                case 3:
                    trackScreenFrag.ao();
                    break;
                case 4:
                    trackScreenFrag.ag.setVisibility(8);
                    trackScreenFrag.at();
                    trackScreenFrag.ap.setVisibility(0);
                    if (trackScreenFrag.ah != null) {
                        trackScreenFrag.ah.endLoadMap();
                    }
                    break;
                case 5:
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(300L);
                    trackScreenFrag.t();
                    trackScreenFrag.e.startAnimation(alphaAnimation);
                    break;
                case 6:
                    trackScreenFrag.bb();
                    break;
                case 7:
                    trackScreenFrag.e();
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ao() {
        MotionPathSimplify motionPathSimplifyD = this.av.d();
        int iRequestSportType = motionPathSimplifyD.requestSportType();
        long jRequestStartTime = motionPathSimplifyD.requestStartTime();
        int iRequestTotalDistance = motionPathSimplifyD.requestTotalDistance();
        this.ak.loadingEnd();
        aw();
        if (nub.e(this.av.d().requestSportType())) {
            this.ak.intervalTrackMarkers(1);
        } else {
            if (UnitUtil.f()) {
                this.ak.intervalTrackMarkers(-1);
            } else {
                this.ak.intervalTrackMarkers(jpq.d(jRequestStartTime, iRequestSportType, iRequestTotalDistance));
            }
            l();
        }
        this.as = this.ak.requestSimplePoints();
        this.ap.setVisibility(0);
        this.d = true;
        this.ai.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final InterfaceHiMap interfaceHiMap) {
        LogUtil.d("Track_TrackScreenFrag", "initAsyncMap");
        interfaceHiMap.onCreate(null, false, false);
        interfaceHiMap.setAllGesturesEnabled(true);
        interfaceHiMap.saveAddress(this.av.g());
        d(interfaceHiMap);
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.TrackScreenFrag.8
            @Override // java.lang.Runnable
            public void run() {
                TrackScreenFrag.this.ai = new AnimatorSet();
                TrackScreenFrag trackScreenFrag = TrackScreenFrag.this;
                trackScreenFrag.af = AnimatorInflater.loadAnimator(trackScreenFrag.i, R.animator.track_history_fade_out);
                TrackScreenFrag.this.af.setTarget(TrackScreenFrag.this.ag);
                Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(TrackScreenFrag.this.i, R.animator.track_history_fade_in);
                animatorLoadAnimator.setTarget(TrackScreenFrag.this.ap);
                TrackScreenFrag.this.ai.playTogether(animatorLoadAnimator, TrackScreenFrag.this.af);
                TrackScreenFrag.this.o();
                interfaceHiMap.registerLoadingListener(new InterfaceMapCallback() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.TrackScreenFrag.8.4
                    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapCallback
                    public void onFinish() {
                        LogUtil.a("Track_TrackScreenFrag", "onFinish send MSG_GOOGLE_LOADING_FINISH");
                        TrackScreenFrag.this.q.sendEmptyMessage(3);
                    }

                    @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapCallback
                    public void onCancel() {
                        LogUtil.a("Track_TrackScreenFrag", "onCancel send MSG_GOOGLE_LOADING_CANCEL");
                        TrackScreenFrag.this.q.sendEmptyMessage(4);
                    }
                });
                MapDataPreprocessor mapDataPreprocessorE = jrn.e(interfaceHiMap.convertCoordinate(TrackScreenFrag.this.av.a()), TrackScreenFrag.this.av.d());
                if (!TrackScreenFrag.this.p) {
                    List<jrp> listPreprocess = mapDataPreprocessorE.preprocess();
                    TrackScreenFrag.this.z = izt.a(listPreprocess);
                    interfaceHiMap.loadMapWithPreprocessData(listPreprocess);
                    TrackScreenFrag.this.ap();
                    return;
                }
                LogUtil.a("Track_TrackScreenFrag", "fragment is finshing");
            }
        });
    }

    private void d(InterfaceHiMap interfaceHiMap) {
        LogUtil.a("Track_TrackScreenFrag", "setDynamicEntryListener");
        interfaceHiMap.setOnMapLoadedListener(new InterfaceMapLoadedCallback() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.TrackScreenFrag.11
            @Override // com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapLoadedCallback
            public void onMapLoaded() {
                LogUtil.a("Track_TrackScreenFrag", "dynamicEntry onMaploaded");
                TrackScreenFrag.this.w = true;
                if (TrackScreenFrag.this.am()) {
                    LogUtil.a("Track_TrackScreenFrag", "show dynamicEntry");
                    TrackScreenFrag.this.q.sendEmptyMessage(5);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        this.ai.addListener(new Animator.AnimatorListener() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.TrackScreenFrag.15
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                TrackScreenFrag.this.q.removeMessages(2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                LogUtil.a("Track_TrackScreenFrag", "onAnimationEnd");
                TrackScreenFrag.this.ag.setVisibility(8);
                TrackScreenFrag.this.at();
            }
        });
    }

    static class a implements ViewHolderInterface {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private TrackPaceColorGradientView f11165a;
        private View ac;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HealthTextView f11166b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthTextView f11167c;
        private HealthTextView d;
        private HealthTextView e;
        private HealthTextView f;
        private HealthTextView g;
        private HealthTextView h;
        private HealthTextView i;
        private HealthTextView j;
        private HealthTextView k;
        private HealthTextView l;
        private HealthTextView m;
        private HealthTextView n;
        private HealthTextView o;
        private HealthTextView p;
        private LinearLayout q;
        private HealthTextView r;
        private HealthTextView s;
        private HealthTextView t;
        private HealthTextView u;
        private HealthTextView v;
        private HealthTextView w;
        private HealthTextView x;
        private HealthTextView y;

        @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ViewHolderInterface
        public jvv getViewCell() {
            return null;
        }

        @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ViewHolderInterface
        public void setEventListener() {
        }

        private a(View view) {
            this.q = null;
            this.m = null;
            this.l = null;
            this.j = null;
            this.f = null;
            this.k = null;
            this.o = null;
            this.p = null;
            this.r = null;
            this.g = null;
            this.t = null;
            this.s = null;
            this.f11167c = null;
            this.i = null;
            this.f11166b = null;
            this.h = null;
            this.e = null;
            this.n = null;
            this.w = null;
            this.u = null;
            this.v = null;
            this.x = null;
            this.f11165a = null;
            this.ac = view;
            a();
        }

        private void a() {
            View view = this.ac;
            if (view == null) {
                LogUtil.e("Track_TrackDetailFragViewHold", "initView mView is null!");
                return;
            }
            this.q = (LinearLayout) view.findViewById(R.id.layout_rightdata);
            this.m = (HealthTextView) this.ac.findViewById(R.id.track_detail_map_sport_time_new);
            this.l = (HealthTextView) this.ac.findViewById(R.id.track_detail_map_sport_record_source);
            this.j = (HealthTextView) this.ac.findViewById(R.id.track_detail_map_sport_distance_value);
            this.n = (HealthTextView) this.ac.findViewById(R.id.text_targetUnit);
            this.f = (HealthTextView) this.ac.findViewById(R.id.track_detail_map_sport_during_time);
            this.k = (HealthTextView) this.ac.findViewById(R.id.track_main_page_left_unit);
            this.o = (HealthTextView) this.ac.findViewById(R.id.track_main_page_left_datatype);
            this.p = (HealthTextView) this.ac.findViewById(R.id.track_main_page_mid_datatype);
            this.r = (HealthTextView) this.ac.findViewById(R.id.track_main_page_right_datatype);
            this.g = (HealthTextView) this.ac.findViewById(R.id.track_detail_map_speed_value);
            this.t = (HealthTextView) this.ac.findViewById(R.id.track_main_page_mid_unit);
            this.s = (HealthTextView) this.ac.findViewById(R.id.track_main_page_right_unit);
            this.f11167c = (HealthTextView) this.ac.findViewById(R.id.track_detail_map_calorie_value);
            this.h = (HealthTextView) this.ac.findViewById(R.id.track_detail_map_min_pace);
            this.e = (HealthTextView) this.ac.findViewById(R.id.track_detail_map_max_pace);
            this.i = (HealthTextView) this.ac.findViewById(R.id.track_detail_map_min_pace_value);
            this.f11166b = (HealthTextView) this.ac.findViewById(R.id.track_detail_map_max_pace_value);
            this.w = (HealthTextView) this.ac.findViewById(R.id.triathlon_map_targetValue);
            this.u = (HealthTextView) this.ac.findViewById(R.id.triathlon_map_targetUnit);
            this.v = (HealthTextView) this.ac.findViewById(R.id.triathlon_map_sport_during_time);
            this.x = (HealthTextView) this.ac.findViewById(R.id.triathlon_map_sport_calorie_value);
            this.f11165a = (TrackPaceColorGradientView) this.ac.findViewById(R.id.pace_color_gradient);
            this.d = (HealthTextView) this.ac.findViewById(R.id.map_type);
            this.y = (HealthTextView) this.ac.findViewById(R.id.triathlon_map_type);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(boolean z, String str, String str2, int i, Context context) {
            if (z) {
                d(str2, i, context, str, str2);
                return;
            }
            this.e.setVisibility(8);
            this.h.setVisibility(8);
            this.f11166b.setVisibility(8);
            this.i.setVisibility(8);
        }

        private void d(String str, int i, Context context, String str2, String str3) {
            if (jpq.i(i) && context != null && str2 != null && str3 != null) {
                StringBuffer stringBuffer = new StringBuffer(str2);
                StringBuffer stringBuffer2 = new StringBuffer(str3);
                stringBuffer.append(" ");
                stringBuffer2.append(" ");
                if (UnitUtil.f()) {
                    stringBuffer.append(context.getResources().getString(R.string.IDS_motiontrack_show_detail_average_speed_imp));
                    stringBuffer2.append(context.getResources().getString(R.string.IDS_motiontrack_show_detail_average_speed_imp));
                } else {
                    stringBuffer.append(context.getResources().getString(R.string.IDS_motiontrack_show_detail_average_speed));
                    stringBuffer2.append(context.getResources().getString(R.string.IDS_motiontrack_show_detail_average_speed));
                }
                String string = stringBuffer.toString();
                str3 = stringBuffer2.toString();
                str2 = string;
            }
            if (str2 != null) {
                this.f11166b.setText(str2);
            }
            if (str != null) {
                this.i.setText(str3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void as() {
        if (this.ak != null) {
            Context context = BaseApplication.getContext();
            Object systemService = context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
            if (!(systemService instanceof WindowManager)) {
                LogUtil.a("Track_TrackScreenFrag", "object is not instanceof WindowManager");
                return;
            }
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(new DisplayMetrics());
            this.ak.setLogoPadding(qrs.d(context, 16.0f), 0, 0, qrs.d(context, 48.0f));
        }
    }

    public void c() {
        if (!this.ao.d()) {
            LogUtil.e("Track_TrackScreenFrag", "data init not ready, please wait.");
        } else if (!this.ao.c()) {
            LogUtil.e("Track_TrackScreenFrag", "GPS data invalid, can not generate dynamic track animation.");
        } else {
            p();
        }
    }

    private void p() {
        startActivity(e(true));
    }

    private Intent e(boolean z) {
        Intent intent;
        Bundle bundle = new Bundle();
        bundle.putSerializable("simplify_data", this.ao.a());
        bundle.putSerializable("lens_data", this.ao.e());
        bundle.putSerializable("retrack_data", this.ao.b());
        TrackPhotosDownload trackPhotosDownload = this.al;
        if (trackPhotosDownload != null && trackPhotosDownload.a()) {
            LogUtil.a("Track_TrackScreenFrag", "TrackScreenFrag gotoDynamicTrack TrackPhotosDownload matched photos finish");
            bundle.putSerializable("matched_photos", this.al.c());
        }
        if (z) {
            intent = new Intent(getActivity(), (Class<?>) DynamicTrackActivity.class);
        } else {
            intent = new Intent();
            intent.setPackage(BaseApplication.getAppPackage());
            intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.healthcloud.plugintrack.ui.activity.DynamicTrackActivity");
        }
        intent.putExtra("track_detail_data_bundle", bundle);
        intent.addFlags(HiUserInfo.DATA_CLOUD);
        DynamicTrackActivity.e(true);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ap() {
        jfg jfgVarD = this.ao.e(257).e(258).e(259).e(260).e(OldToNewMotionPath.SPORT_TYPE_CROSS_COUNTRY_RACE).e(282).e(222).e(227).e(233).c(this.an).d(this.av.b()).a(this.av.d()).d(this.av.bg());
        jqp jqpVar = this.av;
        jfgVarD.b(jqpVar.b(jqpVar.d().requestSportType())).b(this.av.d().requestDeviceType()).c(this.am).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean am() {
        if (this.ak.getMapEngineType() == 3 && com.huawei.common.util.Utils.getHwidVersionCode(this.i) < 50003300) {
            ReleaseLogUtil.d("Track_TrackScreenFrag", "HMS Map version is earlier than 5.0.3.300");
            return false;
        }
        if (!this.ao.i()) {
            ReleaseLogUtil.d("Track_TrackScreenFrag", "Sport type is not supported");
            return false;
        }
        if (this.av.ay()) {
            return false;
        }
        if (200 > this.av.g().getTotalDistance()) {
            ReleaseLogUtil.d("Track_TrackScreenFrag", "Track distance is less than 200 m");
            return false;
        }
        ReleaseLogUtil.d("Track_TrackScreenFrag", "Map type is ", Integer.valueOf(this.am));
        int i = this.am;
        return i == 1 || i == 3 || i == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        int iA;
        int iB;
        if (am()) {
            HealthColumnSystem healthColumnSystem = new HealthColumnSystem(this.i, 0);
            if (this.l.getLayoutParams() instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.l.getLayoutParams();
                if (this.av.g().getTotalDistance() >= 100000) {
                    iA = ((int) healthColumnSystem.a(2)) + qqp.b(this.i);
                    iB = qrs.d(this.i, 12.0f);
                } else {
                    iA = (int) healthColumnSystem.a(2);
                    iB = qqp.b(this.i);
                }
                layoutParams.setMarginStart(iA + iB);
                this.l.setLayoutParams(layoutParams);
            }
            this.l.setAutoTextInfo(9, 1, 1);
            this.e.setVisibility(0);
            return;
        }
        this.e.setVisibility(8);
    }

    private void au() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.track_detail_route_operation_view, (ViewGroup) null);
        final HealthRadioButton healthRadioButton = (HealthRadioButton) viewInflate.findViewById(R.id.save_to_my_route_radio_button);
        final HealthRadioButton healthRadioButton2 = (HealthRadioButton) viewInflate.findViewById(R.id.rb_export_route);
        viewInflate.findViewById(R.id.rel_save_to_my_route).setOnClickListener(new View.OnClickListener() { // from class: jow
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrackScreenFrag.c(healthRadioButton, healthRadioButton2, view);
            }
        });
        viewInflate.findViewById(R.id.rel_export_route).setOnClickListener(new View.OnClickListener() { // from class: jou
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrackScreenFrag.a(healthRadioButton2, healthRadioButton, view);
            }
        });
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(getContext());
        builder.a(getString(R.string.IDS_hwh_my_route2)).b(viewInflate, 0, 0).c(R.string.IDS_hw_show_cancel, new View.OnClickListener() { // from class: jox
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("Track_TrackScreenFrag", "createRouteDialog onClick Negative view");
            }
        }).d(R.string.IDS_hw_common_ui_dialog_confirm, new View.OnClickListener() { // from class: jpd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.c(healthRadioButton, view);
            }
        });
        builder.d().show();
    }

    public static /* synthetic */ void c(HealthRadioButton healthRadioButton, HealthRadioButton healthRadioButton2, View view) {
        if (healthRadioButton.isChecked()) {
            return;
        }
        healthRadioButton.setChecked(true);
        healthRadioButton2.setChecked(false);
    }

    public static /* synthetic */ void a(HealthRadioButton healthRadioButton, HealthRadioButton healthRadioButton2, View view) {
        if (healthRadioButton.isChecked()) {
            return;
        }
        healthRadioButton.setChecked(true);
        healthRadioButton2.setChecked(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(HealthRadioButton healthRadioButton, View view) {
        LogUtil.a("Track_TrackScreenFrag", "createRouteDialog onClick positive view");
        jqk.d(healthRadioButton.isChecked(), this.av);
        e(healthRadioButton.isChecked(), this.av.g().getSportType());
    }

    private void e(boolean z, int i) {
        if (z) {
            e(i);
        } else {
            AppRouter.c("/HWUserProfileMgr/RouteExportActivity").e("IS_NEED_CHANGE_POINT", true).b(this.i);
        }
    }

    private void e(final int i) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: jpb
            @Override // java.lang.Runnable
            public final void run() {
                this.e.a(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i) {
        RouteData routeData = RouteDataStorageManager.getRouteData();
        if (routeData != null) {
            routeData.setSceneType(SceneType.getSceneTypeBySportType(i).sceneType());
            routeData.setRoutePoints(cxq.a(routeData.getRoutePoints()));
        }
        RunningRouteUtils.d(this.i, "motionTrack", routeData);
    }

    private void d(Map<String, String> map) {
        if (!"1".equals(map.get("finishState"))) {
            LogUtil.a("Track_TrackScreenFrag", "route not unfinished in initRouteDrawView");
            return;
        }
        jtn jtnVar = new jtn(this.i, this.ay, this);
        this.ar = jtnVar;
        jtnVar.c(map, new jtn.c(this), new jtn.a(this));
    }

    public void d() {
        a(new SyncMapCallback() { // from class: com.huawei.healthcloud.plugintrack.ui.fragment.TrackScreenFrag.14
            @Override // com.huawei.healthcloud.plugintrack.ui.map.SyncMapCallback
            public void onMapReady(InterfaceHiMap interfaceHiMap) {
                if (TrackScreenFrag.this.ar != null) {
                    TrackScreenFrag.this.ar.e(TrackScreenFrag.this.ak, !TrackScreenFrag.this.ac);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bc() {
        jtn jtnVar = this.ar;
        if (jtnVar == null) {
            LogUtil.e("Track_TrackScreenFrag", "mRouteDrawViewHolder is null in mRouteDrawViewHolder");
        } else {
            jtnVar.c();
        }
    }

    private void b(boolean z) {
        if (this.ar == null) {
            LogUtil.e("Track_TrackScreenFrag", "mRouteDrawViewHolder is null in showShapeTab");
            return;
        }
        this.ad = z;
        jqp jqpVar = this.av;
        if (jqpVar != null) {
            jqpVar.a(z);
        }
        this.ar.a(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ak() {
        jtn jtnVar;
        if (this.ad && (jtnVar = this.ar) != null) {
            jtnVar.d();
        } else {
            this.ak.moveToCenter();
        }
    }

    private void l() {
        jqp jqpVar = this.av;
        if (jqpVar == null) {
            LogUtil.e("Track_TrackScreenFrag", "mTrackDetailDataManager is null in closeKmButton");
        } else if (jqj.c(jqpVar.d())) {
            this.ak.intervalTrackMarkers(-1);
        }
    }

    public void e(Bitmap bitmap) {
        if (this.av == null) {
            LogUtil.j("Track_TrackScreenFrag", "mTrackDetailDataManager is null");
        } else {
            this.av.b(qqf.d(jqj.d(-1, bitmap), lrt.f40735a));
        }
    }

    public boolean b() {
        return this.aa;
    }
}
