package com.huawei.healthcloud.plugintrack.ui.fragmentutils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.huawei.health.health.constants.ObserveLabels;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.view.DetailItemContainer;
import com.huawei.healthcloud.plugintrack.ui.view.SportDetailItem;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.jsoperation.JsUtil;
import com.huawei.operation.view.CustomWebView$$ExternalSyntheticBackport0;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.divider.HealthDivider;
import defpackage.gzr;
import defpackage.izn;
import defpackage.izv;
import defpackage.jaa;
import defpackage.jbt;
import defpackage.jpq;
import defpackage.jqq;
import defpackage.jry;
import defpackage.njy;
import defpackage.nub;
import defpackage.qnj;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class TrackDetailItemDrawer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f11202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TrackDetailItemDrawHelper f11203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<SportDetailItem.a> f11204c;
    private List<SportDetailItem.a> d;
    private String e;
    private MotionPathSimplify f;
    private boolean g;
    private boolean h;
    private boolean i;
    private MotionPath j;
    private int k;
    private Resources l;
    private jbt m;
    private Map<String, Integer> n;
    private final Map<Integer, Integer> o;

    public TrackDetailItemDrawer(MotionPathSimplify motionPathSimplify, MotionPath motionPath, Context context, int i) {
        this.f = null;
        this.j = null;
        this.m = null;
        this.f11204c = new ArrayList(16);
        this.d = new ArrayList(16);
        this.e = izn.e(BaseApplication.getContext());
        this.k = Color.parseColor("#ffffff");
        this.i = false;
        this.h = false;
        this.g = false;
        this.o = CustomWebView$$ExternalSyntheticBackport0.m(new Map.Entry[]{CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 0, (Object) Integer.valueOf(R.string.IDS_left_forward)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 1, (Object) Integer.valueOf(R.string.IDS_attacking_midfielder)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 2, (Object) Integer.valueOf(R.string.IDS_ball_boy)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 3, (Object) Integer.valueOf(R.string.IDS_midfielder)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 4, (Object) Integer.valueOf(R.string.IDS_center_back)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 5, (Object) Integer.valueOf(R.string.IDS_center_forward)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 6, (Object) Integer.valueOf(R.string.IDS_defensive_midfielder)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 7, (Object) Integer.valueOf(R.string.IDS_goalkeeper)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 8, (Object) Integer.valueOf(R.string.IDS_left_back)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 9, (Object) Integer.valueOf(R.string.IDS_left_wing_back)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 10, (Object) Integer.valueOf(R.string.IDS_left_midfielder)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 11, (Object) Integer.valueOf(R.string.IDS_left_winger)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 12, (Object) Integer.valueOf(R.string.IDS_photographer)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 13, (Object) Integer.valueOf(R.string.IDS_referee)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 14, (Object) Integer.valueOf(R.string.IDS_right_back)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 15, (Object) Integer.valueOf(R.string.IDS_right_wing_back)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 16, (Object) Integer.valueOf(R.string.IDS_right_midfielder)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 17, (Object) Integer.valueOf(R.string.IDS_right_forward)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 18, (Object) Integer.valueOf(R.string.IDS_right_winger)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 19, (Object) Integer.valueOf(R.string.IDS_shadow_striker)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 20, (Object) Integer.valueOf(R.string.IDS_substitute)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 21, (Object) Integer.valueOf(R.string.IDS_sweeper))});
        if (motionPathSimplify == null || context == null) {
            throw new RuntimeException("TrackDetailItemDrawer invalid params in constructor");
        }
        this.f = motionPathSimplify;
        this.j = motionPath;
        this.f11202a = context;
        this.l = context.getResources();
        this.n = this.f.requestSportData();
        this.f11203b = new TrackDetailItemDrawHelper(context);
        if (i == 101) {
            this.k = this.l.getColor(R.color.color_normal_titlebar_title);
        } else {
            this.k = this.l.getColor(R.color.textColorPrimary);
        }
    }

    public TrackDetailItemDrawer(jbt jbtVar, Context context, int i) {
        this.f = null;
        this.j = null;
        this.m = null;
        this.f11204c = new ArrayList(16);
        this.d = new ArrayList(16);
        this.e = izn.e(BaseApplication.getContext());
        this.k = Color.parseColor("#ffffff");
        this.i = false;
        this.h = false;
        this.g = false;
        this.o = CustomWebView$$ExternalSyntheticBackport0.m(new Map.Entry[]{CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 0, (Object) Integer.valueOf(R.string.IDS_left_forward)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 1, (Object) Integer.valueOf(R.string.IDS_attacking_midfielder)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 2, (Object) Integer.valueOf(R.string.IDS_ball_boy)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 3, (Object) Integer.valueOf(R.string.IDS_midfielder)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 4, (Object) Integer.valueOf(R.string.IDS_center_back)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 5, (Object) Integer.valueOf(R.string.IDS_center_forward)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 6, (Object) Integer.valueOf(R.string.IDS_defensive_midfielder)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 7, (Object) Integer.valueOf(R.string.IDS_goalkeeper)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 8, (Object) Integer.valueOf(R.string.IDS_left_back)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 9, (Object) Integer.valueOf(R.string.IDS_left_wing_back)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 10, (Object) Integer.valueOf(R.string.IDS_left_midfielder)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 11, (Object) Integer.valueOf(R.string.IDS_left_winger)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 12, (Object) Integer.valueOf(R.string.IDS_photographer)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 13, (Object) Integer.valueOf(R.string.IDS_referee)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 14, (Object) Integer.valueOf(R.string.IDS_right_back)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 15, (Object) Integer.valueOf(R.string.IDS_right_wing_back)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 16, (Object) Integer.valueOf(R.string.IDS_right_midfielder)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 17, (Object) Integer.valueOf(R.string.IDS_right_forward)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 18, (Object) Integer.valueOf(R.string.IDS_right_winger)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 19, (Object) Integer.valueOf(R.string.IDS_shadow_striker)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 20, (Object) Integer.valueOf(R.string.IDS_substitute)), CustomWebView$$ExternalSyntheticBackport0.m1629m((Object) 21, (Object) Integer.valueOf(R.string.IDS_sweeper))});
        if (context == null) {
            throw new RuntimeException("TrackDetailItemDrawer invalid params in constructor");
        }
        this.m = jbtVar;
        this.f11202a = context;
        this.l = context.getResources();
        this.f11203b = new TrackDetailItemDrawHelper(context);
        if (i == 101) {
            this.k = this.l.getColor(R.color.color_normal_titlebar_title);
        } else {
            this.k = this.l.getColor(R.color.textColorPrimary);
        }
    }

    public void d(DetailItemContainer detailItemContainer, boolean z, int i, int i2) {
        boolean z2;
        this.i = z;
        if (this.f == null) {
            LogUtil.j("Track_TrackDetailItemDrawer", "drawDetailTable() mTrackDetailDataManager is null");
            return;
        }
        List<SportDetailItem.a> list = this.f11204c;
        if (list == null) {
            this.f11204c = new ArrayList(16);
        } else {
            list.clear();
        }
        List<SportDetailItem.a> list2 = this.d;
        if (list2 == null) {
            this.d = new ArrayList(16);
        } else {
            list2.clear();
        }
        int iRequestSportType = this.f.requestSportType();
        if (this.f.requestSportDataSource() == 2) {
            p(iRequestSportType);
        } else if (jaa.d(this.f)) {
            by();
        } else if (i == 1) {
            dt();
        } else if (i == 2) {
            ah();
        } else {
            bx();
        }
        if (iRequestSportType == 283 || iRequestSportType == 290) {
            this.f11203b.b(true);
        }
        if (i == 3 && !(z2 = this.i)) {
            this.f11203b.e(detailItemContainer, i2, this.d, z2, this.k);
        } else {
            this.f11203b.e(detailItemContainer, i2, this.f11204c, this.i, this.k);
        }
    }

    public void e(DetailItemContainer detailItemContainer, boolean z, int i) {
        this.i = z;
        jbt jbtVar = this.m;
        if (jbtVar == null || jbtVar.e() == null) {
            LogUtil.j("Track_TrackDetailItemDrawer", "drawTableWithoutDetail() mTrackDetailDataManager is null");
            return;
        }
        List<SportDetailItem.a> list = this.f11204c;
        if (list == null) {
            this.f11204c = new ArrayList(16);
        } else {
            list.clear();
        }
        bf();
        this.f11203b.e(detailItemContainer, i, this.f11204c, this.i, this.k);
    }

    public static class TrackDetailItemDrawHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f11205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f11206b = false;

        public TrackDetailItemDrawHelper(Context context) {
            this.f11205a = context;
        }

        public void e(ViewGroup viewGroup, int i, List<SportDetailItem.a> list, boolean z, int i2) {
            if (njy.e(list)) {
                LogUtil.j("Track_TrackDetailItemDrawer", "fillDetailContainer dataList is null");
                return;
            }
            if (viewGroup == null) {
                LogUtil.j("Track_TrackDetailItemDrawer", "fillDetailContainer container is null");
                return;
            }
            Object systemService = this.f11205a.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
            if (!(systemService instanceof WindowManager)) {
                LogUtil.e("Track_TrackDetailItemDrawer", "object is not instanceof WindowManager");
                return;
            }
            WindowManager windowManager = (WindowManager) systemService;
            int i3 = qrs.i(this.f11205a) - (i * 2);
            int size = list.size();
            if (size == 0) {
                return;
            }
            int dimensionPixelOffset = (z || !this.f11206b) ? i3 : i3 - (this.f11205a.getResources().getDimensionPixelOffset(R.dimen.cardMarginStart) * 2);
            if (z) {
                dimensionPixelOffset = i3 - qrs.d(this.f11205a, 50.0f);
            }
            for (int i4 = 0; i4 < size; i4++) {
                SportDetailItem sportDetailItem = new SportDetailItem(this.f11205a);
                sportDetailItem.setGroupSize((dimensionPixelOffset / 2) - ((Integer) BaseActivity.getSafeRegionWidth().first).intValue());
                if (i4 % 2 != 0 && qrs.af(this.f11205a)) {
                    sportDetailItem.e(this.f11205a);
                }
                SportDetailItem.a aVar = list.get(i4);
                d(sportDetailItem, aVar);
                e(sportDetailItem);
                sportDetailItem.setItemView(aVar);
                sportDetailItem.setTextColor(i2);
                sportDetailItem.setUnitTextColor(aVar.d());
                sportDetailItem.setUnitTextAlpha(aVar.a());
                b(sportDetailItem, aVar.j());
                viewGroup.addView(sportDetailItem);
                if (c(i4)) {
                    viewGroup.addView(c(windowManager));
                }
            }
        }

        private void d(SportDetailItem sportDetailItem, SportDetailItem.a aVar) {
            if (qrs.af(this.f11205a)) {
                LogUtil.a("Track_TrackDetailItemDrawer", "IS TAHITI DISPLAY");
                return;
            }
            if (LanguageUtil.ax(this.f11205a)) {
                sportDetailItem.b(0, qrs.d(this.f11205a, 18.0f), qrs.d(this.f11205a, 10.0f));
            }
            if (LanguageUtil.u(this.f11205a) || LanguageUtil.g(this.f11205a) || LanguageUtil.az(this.f11205a) || LanguageUtil.ai(this.f11205a) || LanguageUtil.bb(this.f11205a)) {
                sportDetailItem.b(qrs.d(this.f11205a, 9.0f), qrs.d(this.f11205a, 18.0f), qrs.d(this.f11205a, 10.0f));
            }
            if ((aVar.c().equals(this.f11205a.getResources().getString(R.string.IDS_lactate_threshold_pace)) || aVar.c().equals(this.f11205a.getResources().getString(R.string.IDS_lactate_threshold_heart_rate))) && LanguageUtil.q(this.f11205a)) {
                sportDetailItem.b(qrs.d(this.f11205a, 13.0f), 0, 0);
            }
            if (aVar.c().equals(this.f11205a.getResources().getString(R.string.IDS_motiontrack_show_detail_averagespeed))) {
                try {
                    if (Float.parseFloat(aVar.j()) > 10.0f) {
                        sportDetailItem.b((int) this.f11205a.getResources().getDimension(R.dimen.hw_show_font_size_13_sp), (int) this.f11205a.getResources().getDimension(R.dimen.textSizeHeadline8), qrs.d(this.f11205a, 10.0f));
                    }
                } catch (NumberFormatException unused) {
                    LogUtil.e("Track_TrackDetailItemDrawer", "NumberFormatException");
                }
            }
            boolean z = LanguageUtil.ar(this.f11205a) || LanguageUtil.h(this.f11205a) || LanguageUtil.ae(this.f11205a) || LanguageUtil.af(this.f11205a);
            boolean z2 = LanguageUtil.ao(this.f11205a) || LanguageUtil.bi(this.f11205a) || LanguageUtil.k(this.f11205a) || LanguageUtil.p(this.f11205a);
            if (z || z2) {
                sportDetailItem.b(qrs.d(this.f11205a, 10.0f), qrs.d(this.f11205a, 18.0f), qrs.d(this.f11205a, 9.0f));
            }
        }

        private void e(SportDetailItem sportDetailItem) {
            if (qrs.af(this.f11205a)) {
                LogUtil.a("Track_TrackDetailItemDrawer", "IS TAHITI DISPLAY");
            }
        }

        private LinearLayout c(WindowManager windowManager) {
            HealthDivider healthDivider = new HealthDivider(this.f11205a);
            healthDivider.setVisibility(8);
            healthDivider.setLayoutParams(new ViewGroup.LayoutParams(windowManager.getDefaultDisplay().getWidth(), this.f11205a.getResources().getDimensionPixelSize(R.dimen.sport_data_cut_line_height)));
            LinearLayout linearLayout = new LinearLayout(this.f11205a);
            linearLayout.addView(healthDivider);
            return linearLayout;
        }

        private boolean c(int i) {
            return i % 2 != 0;
        }

        private void b(SportDetailItem sportDetailItem, String str) {
            if (sportDetailItem == null || str == null || str.isEmpty() || str.equals(izn.e(BaseApplication.getContext())) || str.matches("[0-9]+")) {
                return;
            }
            if (this.f11205a.getResources().getString(R.string.IDS_lactate_threshold_measurement_failure).equals(str)) {
                sportDetailItem.setValueTextSize(this.f11205a.getResources().getDimension(R.dimen.health_common_15sp));
            } else {
                sportDetailItem.setValueTextSize(this.f11205a.getResources().getDimension(R.dimen.textSizeHeadline8));
            }
        }

        public void b(boolean z) {
            this.f11206b = z;
        }
    }

    private void dt() {
        int iRequestSportType = this.f.requestSportType();
        if (iRequestSportType == 258) {
            dq();
            return;
        }
        if (iRequestSportType == 259) {
            ds();
        } else if (iRequestSportType == 262 || iRequestSportType == 266) {
            dv();
        }
    }

    private void ah() {
        bh();
        bj();
        ed();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:64:0x00f4  */
    private void bx() {
        ArrayList<String> detailFieldWear;
        int iRequestSportType = this.f.requestSportType();
        jry jryVarA = jry.a(this.f11202a);
        if (jryVarA.b(iRequestSportType) == null || jryVarA.b(iRequestSportType).getSportDetail() == null) {
            LogUtil.e("Track_TrackDetailItemDrawer", "can not find sport type in json");
            al();
            return;
        }
        if (ej()) {
            detailFieldWear = jryVarA.b(iRequestSportType).getSportDetail().getDetailOtherField();
        } else if (jpq.f(this.f.requestSportDataSource())) {
            detailFieldWear = jryVarA.b(iRequestSportType).getSportDetail().getDetailFieldIndoor();
        } else {
            detailFieldWear = jryVarA.b(iRequestSportType).getSportDetail().getDetailFieldWear();
        }
        for (String str : detailFieldWear) {
            str.hashCode();
            switch (str) {
                case "HEART_RATE":
                    be();
                    break;
                case "AVERAGE_PACE":
                    m();
                    break;
                case "AVERAGE_POWER":
                    o();
                    break;
                case "AVERAGE_SPEED":
                    p();
                    break;
                case "TIME":
                    cz();
                    break;
                case "CALORIES":
                    aj();
                    break;
                case "AVERAGE_PACE_500":
                    l();
                    break;
                case "RUNNING_ABILITY":
                    cl();
                    break;
                case "DISTANCE":
                    cx();
                    break;
                case "ACTIVE_TIME":
                    e();
                    f();
                    break;
                case "ACTIVE_CALORIES":
                    b();
                    break;
                default:
                    g(str);
                    break;
            }
        }
    }

    private void cl() {
        String strF;
        String strF2;
        int i;
        String str;
        String strF3;
        float extendDataFloat = this.f.getExtendDataFloat("runningAbility", -1.0f);
        float extendDataFloat2 = this.f.getExtendDataFloat("runningAbilityDiff", -1.0f);
        LogUtil.a("Track_TrackDetailItemDrawer", "Running power: " + extendDataFloat + ", power diff: " + extendDataFloat2);
        if (extendDataFloat <= 0.0f) {
            LogUtil.a("Track_TrackDetailItemDrawer", "Running power data is invalid");
            return;
        }
        String strF4 = qre.f(R.string.IDS_single_running_power);
        String strE = UnitUtil.e(extendDataFloat, 1, 1);
        if (extendDataFloat2 > 1.0f) {
            strF = qre.f(R.string.IDS_single_running_power_excellent);
            strF2 = qre.f(R.string.IDS_single_running_power_excellent_share);
            i = R.color.run_power_excellent;
        } else if (extendDataFloat2 < -2.0f) {
            strF = qre.f(R.string.IDS_single_running_power_subpar);
            strF2 = qre.f(R.string.IDS_single_running_power_subpar_share);
            i = R.color.pie_sector_running_level_color_s;
        } else {
            strF = qre.f(R.string.IDS_single_running_power_normal);
            strF2 = qre.f(R.string.IDS_single_running_power_normal_share);
            i = R.color.color_64bb5c;
        }
        int i2 = i;
        if (qnj.a(extendDataFloat, extendDataFloat2)) {
            strF3 = qre.f(R.string.IDS_single_running_power);
            str = "";
        } else {
            str = strF;
            strF3 = strF2;
        }
        SportDetailItem.a aVar = new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_single_running_power), "RUNNING_ABILITY", strF4, strE, str, strF3);
        aVar.b(qre.e(i2));
        aVar.d(1.0f);
        this.f11204c.add(aVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:61:0x00b8  */
    private void g(String str) {
        str.hashCode();
        switch (str) {
            case "TOTAL_DESCENT":
                dl();
                break;
            case "TOTAL_CREEP":
                an();
                break;
            case "TOTAL_STEPS":
                m1332do();
                break;
            case "POOL_LENGTH":
                ch();
                break;
            case "STROKE_TIMES":
                db();
                break;
            case "AVERAGE_CADENCE":
                h();
                break;
            case "AVERAGE_STROKE_RATE":
                y();
                break;
            case "AVERAGE_SWOLF":
                v();
                break;
            case "STROKE_TYPE":
                dd();
                break;
            case "LAPS":
                bi();
                break;
            case "STRIDE_ITEM":
                de();
                break;
            case "AVERAGE_STEP_RATE":
                s();
                break;
            case "TOTAL_PADDLE":
                dm();
                break;
            case "PADDLE_FREQUENCY":
                cg();
                break;
            default:
                f(str);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    private void f(String str) {
        str.hashCode();
        switch (str) {
            case "AVERAGE_SKI_SPEED":
                cr();
                break;
            case "RIDE_TIME":
                ck();
                break;
            case "SKI_LAPS":
                cs();
                break;
            case "SKI_TIME":
                cu();
                break;
            case "MAX_SWING_SPEED":
                bz();
                break;
            case "MAX_SLOPE":
                cb();
                break;
            case "SWING_DOWN_TIME":
                am();
                break;
            case "SWING_BACK_TIME":
                z();
                break;
            case "BASKETBALL_JUMP":
                bh();
                bj();
                ed();
                break;
            case "GOAL_DETAIL":
                bb();
                break;
            case "AVERAGE_SWING_SPEED":
                u();
                break;
            case "AVERAGE_SWING_TEMPO":
                w();
                break;
            default:
                j(str);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:61:0x00b8  */
    private void j(String str) {
        str.hashCode();
        switch (str) {
            case "FINISHED_GROUPS":
                dp();
                break;
            case "SKIPPING_ROPE_INTERRUPT_TIMES":
                dg();
                break;
            case "PEAK_WEIGHT":
                cd();
                break;
            case "GRADE_EVALUATION":
                co();
                break;
            case "SKIPPING_ROPE_AVERAGE_SPEED":
                cv();
                break;
            case "EXP_DISTANCE":
                aq();
                break;
            case "AVERAGE_SLOPE":
                k();
                break;
            case "TOTAL_ACTION_GROUP":
                dn();
                break;
            case "AVERAGE_POWER_ANALOG":
                j();
                break;
            case "SCORE":
                cm();
                break;
            case "EXP_AVERAGE_SPEED":
                ar();
                break;
            case "SKIPPING_ROPE_MAX_JUMPS":
                bs();
                break;
            case "TRAINING_ACTION_COUNT":
                d();
                break;
            case "SKIPPING_ROPE_MODE":
                cf();
                break;
            default:
                e(str);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4  */
    private void e(String str) {
        str.hashCode();
        switch (str) {
            case "FOREHAND_STROKE":
                av();
                break;
            case "AVERAGE_ANALOG_CADENCE":
                i();
                break;
            case "TENNIS_MAX_CONTINUOUS_RALLY":
            case "BADMINTON_MAX_CONTINUOUS_RALLY":
            case "PICKLE_BALL_MAX_CONTINUOUS_RALLY":
                bn();
                break;
            case "AVG_SHOT_SPEED":
                x();
                break;
            case "AVERAGE_DRIVE_DISTANCE":
                n();
                break;
            case "DRIVE_TIMES":
                as();
                break;
            case "UNDERHAND_STROKE":
                dx();
                break;
            case "SLOPE_RANGE":
                cw();
                break;
            case "LOAD_PEAK":
                bq();
                break;
            case "SHOTS":
                ct();
                break;
            case "BACKHAND_STROKE":
                ai();
                break;
            case "OVERHAND_STROKE":
                cc();
                break;
            case "DRIVE_RATE":
                ak();
                break;
            case "MAX_SHOT_SPEED":
                bu();
                break;
            default:
                a(str);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:61:0x00b8  */
    private void a(String str) {
        str.hashCode();
        switch (str) {
            case "MAX_JUMP_HEIGHT":
                bw();
                break;
            case "TOTAL_ACTION_GROUPS":
                dp();
                break;
            case "RPE":
                ci();
                break;
            case "SMASH":
                da();
                break;
            case "AVG_FLOORS_SPEED":
                q();
                break;
            case "ACTION_COUNT":
                d();
                break;
            case "SPRINT_TIMES":
                df();
                break;
            case "JUMP_TIMES":
                bl();
                break;
            case "MAX_ACCELERATION":
                bo();
                break;
            case "HIGH_CLEAR":
                bd();
                break;
            case "SWERVE_SPEEDUP_TIMES":
                di();
                break;
            case "TOTAL_TRAINING_VOLUME":
                dr();
                break;
            case "FLOORS":
                ao();
                break;
            case "TURN_SPEEDUP_TIMES":
                dw();
                break;
            default:
                i(str);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:77:0x00f0  */
    private void i(String str) {
        str.hashCode();
        switch (str) {
            case "TENNIS_FOREHAND_BACKSPIN":
            case "PICKLE_BALL_FOREHAND_BACKSPIN":
                ap();
                break;
            case "PICKLE_BALL_FOREHAND":
            case "FOREHAND":
                aw();
                break;
            case "BACKHAND":
            case "PICKLE_BALL_BACKHAND":
                aa();
                break;
            case "FOREHAND_FLAT":
                at();
                break;
            case "SAVES_TIMES":
                cp();
                break;
            case "TENNIS_BACKHAND_BACKSPIN":
            case "PICKLE_BALL_BACKHAND_BACKSPIN":
                ab();
                break;
            case "ASSISTS_TIMES":
                g();
                break;
            case "GOALS_TIMES":
                ay();
                break;
            case "SERVE":
                cq();
                break;
            case "PLAYER_POSITION":
                ce();
                break;
            case "BACKHAND_TOPSPIN":
                af();
                break;
            case "FOREHAND_TOPSPIN":
                bc();
                break;
            case "TENNIS_FOREHAND_VOLLEY":
            case "PICKLE_BALL_FOREHAND_VOLLEY":
                az();
                break;
            default:
                h(str);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4  */
    private void h(String str) {
        str.hashCode();
        switch (str) {
            case "SWING_SPEED":
                dk();
                break;
            case "AVG_DOWN_SLOPE":
                r();
                break;
            case "BACKHAND_DROP":
                ae();
                break;
            case "SHORT_RADIUS_TURN":
                cn();
                break;
            case "FOREHAND_DRIVE":
                au();
                break;
            case "TENNIS_BACKHAND_VOLLEY":
            case "PICKLE_BALL_BACKHAND_VOLLEY":
                ag();
                break;
            case "FOREHAND_DROP":
                ax();
                break;
            case "MAX_SPEED":
                ca();
                break;
            case "TOTAL_TURN_NUMBER":
                du();
                break;
            case "PICKLE_BALL_SWING_TIMES":
            case "TENNIS_SWING_TIMES":
                dh();
                break;
            case "BACKHAND_DRIVE":
                ad();
                break;
            case "LONG_RADIUS_TURN":
                br();
                break;
            case "AVG_UP_SLOPE":
                ac();
                break;
            case "TURN_FREQUENCY":
                dz();
                break;
            default:
                b(str);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    private void b(String str) {
        byte b2;
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != -1518620456) {
            if (iHashCode != -841361200) {
                if (iHashCode == -101620251 && str.equals("LEFT_TURN_COUNT")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("RIGHT_TURN_COUNT")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("MAX_G_FORCE")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            bt();
        } else if (b2 == 1) {
            cj();
        } else {
            if (b2 != 2) {
                return;
            }
            bp();
        }
    }

    private void ca() {
        String strF;
        String strF2;
        double extendDataDouble = this.f.getExtendDataDouble("bestSpeed", -1.0d);
        if (extendDataDouble > 0.0d) {
            if (UnitUtil.f()) {
                extendDataDouble = UnitUtil.e(extendDataDouble, 3);
                strF = qre.f(R.string.IDS_motiontrack_show_detail_average_speed_imp);
                strF2 = qre.f(R.string.IDS_track_max_speed_mi_with_unit);
            } else {
                strF = qre.f(R.string.IDS_motiontrack_show_detail_average_speed);
                strF2 = qre.f(R.string.IDS_track_max_speed_km_with_unit);
            }
            String str = strF2;
            String strE = UnitUtil.e(extendDataDouble, 1, 2);
            this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_max_speed), "MAX_SPEED", qre.f(R.string.IDS_track_max_speed), strE, strF, str));
        }
    }

    private String a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return str.trim().equals(str2.trim()) ? "" : str2;
        }
        LogUtil.a("Track_TrackDetailItemDrawer", "name or unit is empty");
        return "";
    }

    private void du() {
        int extendDataInt = this.f.getExtendDataInt("totalTurnNumber", -1);
        if (extendDataInt >= 0) {
            String strF = qre.f(R.string.IDS_track_total_turn);
            this.f11204c.add(new SportDetailItem.a(w(R.drawable.ic_total_turn_number), "TOTAL_TURN_NUMBER", strF, UnitUtil.e(extendDataInt, 1, 0), a(strF, qre.e(R.plurals.IDS_hwh_motiontrack_sport_data_time, extendDataInt, "")), qre.f(R.string.IDS_track_total_turn_with_unit)));
        }
    }

    private void dz() {
        int extendDataInt = this.f.getExtendDataInt("turnFrequency", -1);
        if (extendDataInt > 0) {
            String strF = qre.f(R.string.IDS_track_avg_turn_frequency);
            this.f11204c.add(new SportDetailItem.a(w(R.drawable.ic_turn_frequency), "TURN_FREQUENCY", strF, UnitUtil.e(extendDataInt, 1, 0), a(strF, qre.f(R.string.IDS_track_turns_frequency_unit)), qre.f(R.string.IDS_track_avg_turn_frequency_with_unit)));
        }
    }

    private void br() {
        int extendDataInt = this.f.getExtendDataInt("longRadiusTurn", -1);
        if (extendDataInt >= 0) {
            String strF = qre.f(R.string.IDS_track_long_radius_turn);
            this.f11204c.add(new SportDetailItem.a(w(R.drawable.ic_long_radius_turn), "LONG_RADIUS_TURN", strF, UnitUtil.e(extendDataInt, 1, 0), a(strF, qre.e(R.plurals.IDS_hwh_motiontrack_sport_data_time, extendDataInt, "")), qre.f(R.string.IDS_track_long_radius_turn_with_unit)));
        }
    }

    private void cn() {
        int extendDataInt = this.f.getExtendDataInt("shortRadiusTurn", -1);
        if (extendDataInt >= 0) {
            String strF = qre.f(R.string.IDS_track_short_radius_turn);
            this.f11204c.add(new SportDetailItem.a(w(R.drawable.ic_short_radius_turn), "SHORT_RADIUS_TURN", strF, UnitUtil.e(extendDataInt, 1, 0), a(strF, qre.e(R.plurals.IDS_hwh_motiontrack_sport_data_time, extendDataInt, "")), qre.f(R.string.IDS_track_short_radius_turn_with_unit)));
        }
    }

    private void bt() {
        float extendDataFloat = this.f.getExtendDataFloat("maxGForce", -1.0f);
        if (extendDataFloat >= 0.0f) {
            this.f11204c.add(new SportDetailItem.a(qre.c(R.drawable.ic_max_g_force), "MAX_G_FORCE", qre.f(R.string.IDS_track_max_g_force), UnitUtil.e(extendDataFloat, 1, 2), "", qre.f(R.string.IDS_track_max_g_force)));
        }
    }

    private void bp() {
        int extendDataInt = this.f.getExtendDataInt("leftTurnCount", -1);
        if (extendDataInt >= 0) {
            this.f11204c.add(new SportDetailItem.a(qre.c(R.drawable.ic_left_turn_count), "LEFT_TURN_COUNT", qre.f(R.string.IDS_track_left_turn_count), UnitUtil.e(extendDataInt, 1, 0), qre.e(R.plurals.IDS_hwh_motiontrack_sport_data_time, extendDataInt, ""), qre.f(R.string.IDS_track_left_turn_count_with_unit)));
        }
    }

    private void cj() {
        int extendDataInt = this.f.getExtendDataInt("rightTurnCount", -1);
        if (extendDataInt >= 0) {
            this.f11204c.add(new SportDetailItem.a(qre.c(R.drawable.ic_right_turn_count), "RIGHT_TURN_COUNT", qre.f(R.string.IDS_track_right_turn_count), UnitUtil.e(extendDataInt, 1, 0), qre.e(R.plurals.IDS_hwh_motiontrack_sport_data_time, extendDataInt, ""), qre.f(R.string.IDS_track_right_turn_count_with_unit)));
        }
    }

    private void n() {
        String strA;
        int extendDataInt = this.f.getExtendDataInt("avgPushDistance", -1);
        if (extendDataInt == -1) {
            LogUtil.a("Track_TrackDetailItemDrawer", "count is invalid in buildAverageDriveDistanceItem");
            return;
        }
        if (extendDataInt == 0) {
            strA = qre.f(R.string.IDS_motiontrack_show_invalid_data);
        } else {
            strA = jpq.a(extendDataInt);
        }
        String str = strA;
        String strF = qre.f(R.string.IDS_motiontrack_show_detail_paces);
        String strF2 = qre.f(R.string.IDS_track_average_drive_distance_with_unit);
        if (UnitUtil.f()) {
            strF = qre.f(R.string.IDS_motiontrack_show_detail_paces_imp);
            strF2 = qre.f(R.string.IDS_track_average_drive_distance_in_with_unit);
        }
        this.f11204c.add(new SportDetailItem.a(w(R.drawable.ic_wheel_chair_average_drive_distance), "AVERAGE_DRIVE_DISTANCE", qre.f(R.string.IDS_motiontrack_show_detail_average_drive_distance), str, strF, strF2));
    }

    private void as() {
        int extendDataInt = this.f.getExtendDataInt("totalPushes", -1);
        if (extendDataInt == -1) {
            LogUtil.a("Track_TrackDetailItemDrawer", "count is invalid in buildDriveTimesItem");
        } else {
            this.f11204c.add(new SportDetailItem.a(w(R.drawable.ic_wheel_chair_drive_times), "DRIVE_TIMES", qre.f(R.string.IDS_motiontrack_show_detail_drive_times), UnitUtil.e(extendDataInt, 1, 0), qre.e(R.plurals.IDS_hwh_motiontrack_swim_stroke, extendDataInt, ""), qre.f(R.string.IDS_track_drive_times_with_unit)));
        }
    }

    private void ak() {
        int extendDataInt = this.f.getExtendDataInt("avgPushFrequency", -1);
        if (extendDataInt == -1) {
            LogUtil.a("Track_TrackDetailItemDrawer", "count is invalid in buildDriveRateItem");
        } else {
            this.f11204c.add(new SportDetailItem.a(w(R.drawable.ic_wheel_chair_drive_rate), "DRIVE_RATE", qre.f(R.string.IDS_motiontrack_show_detail_drive_rate), UnitUtil.e(extendDataInt, 1, 0), qre.f(R.string.IDS_indoor_equip_paddle_unit_times_minute), qre.f(R.string.IDS_track_drive_rate_with_unit)));
        }
    }

    private void j() {
        if (this.h) {
            LogUtil.a("Track_TrackDetailItemDrawer", "already show avgPower");
            return;
        }
        int extendDataInt = this.f.getExtendDataInt("avgAnalogPower", -1);
        if (extendDataInt > 0) {
            if (jpq.j(this.f.requestSportType())) {
                this.f11204c.add(a(extendDataInt));
                return;
            }
            this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_analog_power), "AVERAGE_POWER_ANALOG", qre.f(R.string.IDS_track_average_power_analog), UnitUtil.e(extendDataInt, 1, 0), qre.f(R.string.IDS_indoor_equip_power_unit_watt), qre.f(R.string.IDS_track_average_analog_power_with_unit)));
        }
    }

    private void k() {
        int extendDataFloat = (int) this.f.getExtendDataFloat("avgUpSlope", 101.0f);
        int extendDataFloat2 = (int) this.f.getExtendDataFloat("avgDownSlope", -101.0f);
        if (extendDataFloat >= 0 && extendDataFloat <= 100 && extendDataFloat2 <= 0 && extendDataFloat2 >= -100) {
            LogUtil.a("Track_TrackDetailItemDrawer", "avgUpSlope and avgDownSlope is valid");
            return;
        }
        int extendDataInt = this.f.getExtendDataInt("avgSlope", -1010) / 10;
        if (extendDataInt <= -101 || extendDataInt >= 101) {
            return;
        }
        this.f11204c.add(new SportDetailItem.a(w(R.drawable.ic_slope), "AVERAGE_SLOPE", qre.f(R.string.IDS_track_average_slope), UnitUtil.e(extendDataInt, 2, 0), null, qre.f(R.string.IDS_track_average_slope)));
    }

    private void ac() {
        int extendDataFloat = (int) this.f.getExtendDataFloat("avgUpSlope", 101.0f);
        if (extendDataFloat < 0 || extendDataFloat > 100) {
            return;
        }
        this.f11204c.add(new SportDetailItem.a(w(R.drawable.ic_avg_up_slope), "AVG_UP_SLOPE", qre.f(R.string.IDS_track_average_up_slope), UnitUtil.e(extendDataFloat, 2, 0), null, qre.f(R.string.IDS_track_average_up_slope)));
    }

    private void r() {
        int extendDataFloat = (int) this.f.getExtendDataFloat("avgDownSlope", -101.0f);
        if (extendDataFloat > 0 || extendDataFloat < -100) {
            return;
        }
        this.f11204c.add(new SportDetailItem.a(w(R.drawable.ic_avg_down_slope), "AVG_DOWN_SLOPE", qre.f(R.string.IDS_track_average_down_slope), UnitUtil.e(extendDataFloat, 2, 0), null, qre.f(R.string.IDS_track_average_down_slope)));
    }

    private void cw() {
        int extendDataInt = this.f.getExtendDataInt("maxSlope", -1010) / 10;
        int extendDataInt2 = this.f.getExtendDataInt("minSlope", -1010) / 10;
        if (extendDataInt2 <= -101 || extendDataInt >= 101 || extendDataInt < extendDataInt2) {
            return;
        }
        String strE = UnitUtil.e(Math.abs(extendDataInt), 2, 0);
        String strE2 = UnitUtil.e(Math.abs(extendDataInt2), 2, 0);
        if (extendDataInt < 0) {
            strE = qre.a(R.string.IDS_track_slope_negative, strE);
        }
        if (extendDataInt2 < 0) {
            strE2 = qre.a(R.string.IDS_track_slope_negative, strE2);
        }
        this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_slope_range), "SLOPE_RANGE", qre.f(R.string.IDS_track_slope_range), qre.a(R.string.IDS_track_slope_range_with_value, strE2, strE), null, qre.f(R.string.IDS_track_slope_range)));
    }

    private void ar() {
        String strD = jpq.d(this.f.getExtendDataInt("wayPointDistance"), TimeUnit.MILLISECONDS.toSeconds(this.f.requestTotalTime()));
        if (izn.e(BaseApplication.getContext()).equals(strD)) {
            LogUtil.a("Track_TrackDetailItemDrawer", "buildAverageSpeedItem is 0");
            return;
        }
        String strF = qre.f(R.string.IDS_motiontrack_show_detail_average_speed);
        String strF2 = qre.f(R.string.IDS_track_waypoint_average_speed_km_with_unit);
        if (UnitUtil.f()) {
            strF = qre.f(R.string.IDS_motiontrack_show_detail_average_speed_imp);
            strF2 = qre.f(R.string.IDS_track_waypoint_average_speed_mi_with_unit);
        }
        this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_avg_speed), "EXP_AVERAGE_SPEED", qre.f(R.string.IDS_hw_sport_waypoint_averagespeed), strD, strF, strF2));
    }

    private void aq() {
        String strB;
        String string;
        int extendDataInt = this.f.getExtendDataInt("wayPointDistance");
        if (extendDataInt == 0) {
            strB = this.f11202a.getString(R.string.IDS_motiontrack_show_invalid_data);
        } else {
            strB = jpq.b(extendDataInt);
        }
        String str = strB;
        if (UnitUtil.f()) {
            string = this.l.getString(R.string.IDS_band_data_sport_distance_unit_en);
        } else {
            string = this.l.getString(R.string.IDS_band_data_sport_distance_unit);
        }
        SportDetailItem.a aVar = new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_waypoint_mileage), "EXP_DISTANCE", qre.f(R.string.IDS_hw_sport_waypoint_mileage), str, string, qre.f(UnitUtil.f() ? R.string.IDS_track_waypoint_mileage_mi_with_unit : R.string.IDS_track_waypoint_mileage_km_with_unit));
        if (!this.i) {
            aVar.e("ADVENTURE_WAYPOINT");
        }
        this.f11204c.add(aVar);
    }

    private void cm() {
        int extendDataInt = this.f.getExtendDataInt(JsUtil.SCORE);
        String string = this.f11202a.getResources().getString(R.string.IDS_bundle_dependency_none);
        String quantityString = "";
        if (extendDataInt > 0) {
            string = UnitUtil.e(extendDataInt, 1, 0);
            quantityString = this.f11202a.getResources().getQuantityString(R.plurals.IDS_sport_score_unit, extendDataInt, "");
        }
        this.f11204c.add(new SportDetailItem.a(w(R.drawable.ic_score), "SCORE", qre.f(R.string.IDS_pace_range_achievement), string, quantityString, qre.f(R.string.IDS_track_score_with_unit)));
    }

    private void co() {
        this.f11204c.add(new SportDetailItem.a(w(R.drawable.ic_grade_evaluation), "GRADE_EVALUATION", qre.f(R.string.IDS_somatosensory_movement_grade_evaluation), jqq.a(this.f11202a, this.f.getExtendDataInt("gradeEvaluation")), "", qre.f(R.string.IDS_somatosensory_movement_grade_evaluation)));
    }

    private void bf() {
        cy();
        dc();
    }

    private void al() {
        cz();
        aj();
        b();
        m();
        p();
        s();
        de();
        m1332do();
        be();
        bq();
        an();
        dl();
        bb();
    }

    private void by() {
        cz();
        if (this.i) {
            return;
        }
        aj();
    }

    private void dy() {
        cz();
        aj();
        if (this.f.requestSportType() != 259) {
            m();
        }
        p();
    }

    private void ee() {
        cz();
        aj();
    }

    private void ds() {
        cx();
        cz();
        aj();
        b();
        be();
        bq();
        an();
        dl();
    }

    private void dq() {
        cx();
        cz();
        aj();
        b();
        m();
        p();
        s();
        de();
        an();
        dl();
    }

    private void dv() {
        cx();
        cz();
        aj();
        b();
        dd();
        if (this.f.requestSportType() == 262) {
            ch();
            bi();
        }
        y();
        v();
        be();
        bq();
    }

    private void f() {
        if (this.f.requestSportData() == null || !this.f.requestSportData().containsKey("active_time") || this.f.requestSportData().get("active_time") == null) {
            return;
        }
        Integer num = this.f.requestSportData().get("active_time");
        int iIntValue = num.intValue();
        LogUtil.a("Track_TrackDetailItemDrawer", "activeTime", num);
        long jRequestTotalTime = this.f.requestTotalTime();
        if (iIntValue > 0) {
            this.f11204c.add(d(jRequestTotalTime, iIntValue));
        }
    }

    private void o() {
        int iA;
        if (ej()) {
            iA = this.f.getExtendDataInt("peak_power");
        } else if (this.f.requestSportType() == 259 && this.f.getExtendDataInt("avgPower") > 0) {
            iA = this.f.getExtendDataInt("avgPower");
        } else {
            MotionPath motionPath = this.j;
            iA = motionPath != null ? jpq.a(motionPath.requestPowerList()) : 0;
        }
        if (iA > 0) {
            this.h = true;
            this.f11204c.add(a(iA));
        }
    }

    private void x() {
        String strE;
        String strF;
        float extendDataFloat = this.f.getExtendDataFloat("avgShotSpeed", -1.0f);
        if (extendDataFloat > 0.0f) {
            if (UnitUtil.f()) {
                extendDataFloat = (float) (((double) extendDataFloat) * 0.6213712d);
                strE = qre.e(R.plurals.ie_motiontrack_show_sport_unit_mi_per_h, (int) extendDataFloat, "");
                strF = qre.f(R.string.IDS_avg_shot_speed_fullunit_imp);
            } else {
                strE = qre.e(R.plurals.IDS_motiontrack_detail_average_speed, (int) extendDataFloat, "");
                strF = qre.f(R.string.IDS_avg_shot_speed_fullunit);
            }
            this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_avg_shot_speed), "AVG_SHOT_SPEED", qre.f(R.string.IDS_avg_shot_speed), UnitUtil.e(extendDataFloat, 1, 2), strE, strF));
        }
    }

    private void bu() {
        String strE;
        String strF;
        float extendDataFloat = this.f.getExtendDataFloat("maxShotSpeed", -1.0f);
        if (extendDataFloat > 0.0f) {
            if (UnitUtil.f()) {
                extendDataFloat = (float) (((double) extendDataFloat) * 0.6213712d);
                strE = qre.e(R.plurals.ie_motiontrack_show_sport_unit_mi_per_h, (int) extendDataFloat, "");
                strF = qre.f(R.string.IDS_max_shot_speed_fullunit_imp);
            } else {
                strE = qre.e(R.plurals.IDS_motiontrack_detail_average_speed, (int) extendDataFloat, "");
                strF = qre.f(R.string.IDS_max_shot_speed_fullunit);
            }
            this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_max_shot_speed), "MAX_SHOT_SPEED", qre.f(R.string.IDS_max_shot_speed), UnitUtil.e(extendDataFloat, 1, 2), strE, strF));
        }
    }

    private void ct() {
        int extendDataInt = this.f.getExtendDataInt("shots", -1);
        if (extendDataInt > 0) {
            this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_shots), "SHOTS", qre.f(R.string.IDS_shots), UnitUtil.e(extendDataInt, 1, 0), qre.e(R.plurals.IDS_hwh_motiontrack_sport_data_time, extendDataInt, ""), qre.f(R.string.IDS_shots_fullunit)));
        }
    }

    private void bn() {
        Drawable drawable;
        String str;
        int extendDataInt = this.f.getExtendDataInt("maxContinuousRally", -1);
        if (extendDataInt > 0) {
            int iRequestSportType = this.f.requestSportType();
            String strF = qre.f(R.string.IDS_maximum_consecutive_swings_fullunit);
            String strF2 = qre.f(R.string.IDS_maximum_consecutive_swings);
            if (iRequestSportType == 129) {
                drawable = ContextCompat.getDrawable(this.f11202a, R.drawable.ic_max_continuous_rally_badminton);
                strF2 = qre.f(R.string.IDS_max_continuous_rally);
                strF = qre.f(R.string.IDS_max_continuous_rally_fullunit);
                str = "BADMINTON_MAX_CONTINUOUS_RALLY";
            } else if (iRequestSportType == 130) {
                drawable = ContextCompat.getDrawable(this.f11202a, R.drawable.ic_max_continuous_rally_tennis);
                str = "TENNIS_MAX_CONTINUOUS_RALLY";
            } else {
                drawable = ContextCompat.getDrawable(this.f11202a, R.drawable.ic_max_continuous_rally_pickleball);
                str = "PICKLE_BALL_MAX_CONTINUOUS_RALLY";
            }
            this.f11204c.add(new SportDetailItem.a(drawable, str, strF2, UnitUtil.e(extendDataInt, 1, 0), qre.e(R.plurals.IDS_hwh_motiontrack_sport_data_time, extendDataInt, ""), strF));
        }
    }

    private void av() {
        int extendDataInt = this.f.getExtendDataInt("forehandStroke", -1);
        if (extendDataInt > 0) {
            this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_forehand_stroke), "FOREHAND_STROKE", qre.f(R.string.IDS_forehand_stroke), UnitUtil.e(extendDataInt, 1, 0), qre.e(R.plurals.IDS_hwh_motiontrack_sport_data_time, extendDataInt, ""), qre.f(R.string.IDS_forehand_stroke_fullunit)));
        }
    }

    private void ai() {
        int extendDataInt = this.f.getExtendDataInt("backhandStroke", -1);
        if (extendDataInt > 0) {
            this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_backhand_stroke), "BACKHAND_STROKE", qre.f(R.string.IDS_backhand_stroke), UnitUtil.e(extendDataInt, 1, 0), qre.e(R.plurals.IDS_hwh_motiontrack_sport_data_time, extendDataInt, ""), qre.f(R.string.IDS_backhand_stroke_fullunit)));
        }
    }

    private void cc() {
        int extendDataInt = this.f.getExtendDataInt("overhandStroke", -1);
        if (extendDataInt > 0) {
            this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_overhand_stroke), "OVERHAND_STROKE", qre.f(R.string.IDS_overhand_stroke), UnitUtil.e(extendDataInt, 1, 0), qre.e(R.plurals.IDS_hwh_motiontrack_sport_data_time, extendDataInt, ""), qre.f(R.string.IDS_overhand_stroke_fullunit)));
        }
    }

    private void dx() {
        int extendDataInt = this.f.getExtendDataInt("underhandStroke", -1);
        if (extendDataInt > 0) {
            this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_underhand_stroke), "UNDERHAND_STROKE", qre.f(R.string.IDS_underhand_stroke), UnitUtil.e(extendDataInt, 1, 0), qre.e(R.plurals.IDS_hwh_motiontrack_sport_data_time, extendDataInt, ""), qre.f(R.string.IDS_underhand_stroke_fullunit)));
        }
    }

    private void da() {
        int extendDataInt = this.f.getExtendDataInt("smash", -1);
        if (extendDataInt > 0) {
            this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_smash), "SMASH", qre.f(R.string.IDS_smash), UnitUtil.e(extendDataInt, 1, 0), qre.e(R.plurals.IDS_hwh_motiontrack_sport_data_time, extendDataInt, ""), qre.f(R.string.IDS_smash_fullunit)));
        }
    }

    private void bd() {
        int extendDataInt = this.f.getExtendDataInt("highClear", -1);
        if (extendDataInt > 0) {
            this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_high_clear), "HIGH_CLEAR", qre.f(R.string.IDS_high_clear), UnitUtil.e(extendDataInt, 1, 0), qre.e(R.plurals.IDS_hwh_motiontrack_sport_data_time, extendDataInt, ""), qre.f(R.string.IDS_high_clear_fullunit)));
        }
    }

    private void d() {
        int extendDataInt = this.f.getExtendDataInt("trainingActionCount", -1);
        if (extendDataInt > 0) {
            this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_action_count), "ACTION_COUNT", qre.f(R.string.IDS_action_count), UnitUtil.e(extendDataInt, 1, 0), qre.e(R.plurals.IDS_action_count_unit, extendDataInt, ""), qre.f(R.string.IDS_action_count_fullunit)));
        }
    }

    private void dr() {
        int extendDataInt = this.f.getExtendDataInt("totalTrainingVolume", -1);
        if (extendDataInt > 0) {
            this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_total_training_volume), "TOTAL_TRAINING_VOLUME", qre.f(R.string.IDS_total_training_volume), UnitUtil.e(extendDataInt, 1, 0), qre.e(R.plurals.IDS_training_volume_unit, extendDataInt, ""), qre.f(R.string.IDS_total_training_volume_fullunit)));
        }
    }

    private void ci() {
        int extendDataInt = this.f.getExtendDataInt("rpe", -1);
        if (extendDataInt < 1 || extendDataInt > 10) {
            return;
        }
        this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_rpe), "RPE", qre.f(R.string.IDS_rating_perceived_exertion), UnitUtil.e(extendDataInt, 1, 0), "", qre.f(R.string.IDS_rating_perceived_exertion)));
    }

    private void dp() {
        int extendDataInt = this.f.getExtendDataInt("finishedGroups", -1);
        if (extendDataInt > 0) {
            this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_total_action_groups), "TOTAL_ACTION_GROUPS", qre.f(R.string.IDS_total_action_groups), UnitUtil.e(extendDataInt, 1, 0), qre.e(R.plurals.IDS_action_groups_unit, extendDataInt, ""), qre.f(R.string.IDS_total_action_groups_fullunit)));
        }
    }

    private void ao() {
        int extendDataInt = this.f.getExtendDataInt("floors", -1);
        if (extendDataInt > 0) {
            this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_floors), "FLOORS", qre.f(R.string.IDS_floors_climbed), UnitUtil.e(extendDataInt, 1, 0), qre.e(R.plurals.IDS_floors_climbed_unit, extendDataInt, ""), qre.f(R.string.IDS_floors_climbed_fullunit)));
        }
    }

    private void q() {
        float extendDataFloat = this.f.getExtendDataFloat("avgFloorSpeed", -1.0f);
        if (extendDataFloat > 0.0f) {
            this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_avg_floor_speed), "AVG_FLOORS_SPEED", qre.f(R.string.IDS_average_floors_per_minute), UnitUtil.e(extendDataFloat, 1, 1), qre.e(R.plurals.IDS_average_floors_per_minute_unit, (int) extendDataFloat, ""), qre.f(R.string.IDS_average_floors_per_minute_fullunit)));
        }
    }

    private void bl() {
        int extendDataInt = this.f.getExtendDataInt("jumpTimes", -1);
        if (extendDataInt > 0) {
            this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_jump_times_football), "JUMP_TIMES", qre.f(R.string.IDS_number_of_jumps), UnitUtil.e(extendDataInt, 1, 0), qre.e(R.plurals.IDS_hwh_motiontrack_sport_data_time, extendDataInt, ""), qre.f(R.string.IDS_number_of_jumps_fullunit)));
        }
    }

    private void bw() {
        String strE;
        String strF;
        double extendDataFloat = this.f.getExtendDataFloat("maxJumpHeight", -1.0f);
        if (extendDataFloat > 0.0d) {
            if (UnitUtil.f()) {
                extendDataFloat = UnitUtil.e(extendDataFloat, 1);
                strE = qre.e(R.plurals.IDS_hwh_motiontrack_ft_string, (int) extendDataFloat, "");
                strF = qre.f(R.string.IDS_maximum_jump_height_fullunit_imp);
            } else {
                strE = qre.e(R.plurals.IDS_altitude_meter, (int) extendDataFloat, "");
                strF = qre.f(R.string.IDS_maximum_jump_height_fullunit);
            }
            this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_max_jump_height), "MAX_JUMP_HEIGHT", qre.f(R.string.IDS_maximum_jump_height), UnitUtil.e(extendDataFloat, 1, 2), strE, strF));
        }
    }

    private void df() {
        int extendDataInt = this.f.getExtendDataInt("sprintTimes", -1);
        if (extendDataInt > 0) {
            this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_sprint_times), "SPRINT_TIMES", qre.f(R.string.IDS_sprint_count), UnitUtil.e(extendDataInt, 1, 0), qre.e(R.plurals.IDS_hwh_motiontrack_sport_data_time, extendDataInt, ""), qre.f(R.string.IDS_sprint_count_fullunit)));
        }
    }

    private void bo() {
        String strE;
        String strF;
        float extendDataFloat = this.f.getExtendDataFloat("maxAcceleration", -1.0f);
        if (extendDataFloat > 0.0f) {
            if (UnitUtil.f()) {
                extendDataFloat = (float) UnitUtil.e(extendDataFloat, 1);
                strE = qre.e(R.plurals.IDS_maximum_acceleration_imperial_unit, (int) extendDataFloat, "");
                strF = qre.f(R.string.IDS_maximum_acceleration_imperial_fullunit);
            } else {
                strE = qre.e(R.plurals.IDS_maximum_acceleration_metric_unit, (int) extendDataFloat, "");
                strF = qre.f(R.string.IDS_maximum_acceleration_metric_fullunit);
            }
            this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_max_acceleration), "MAX_ACCELERATION", qre.f(R.string.IDS_maximum_acceleration), UnitUtil.e(extendDataFloat, 1, 2), strE, strF));
        }
    }

    private void dw() {
        int extendDataInt = this.f.getExtendDataInt("turnSpeedUpTimes", -1);
        if (extendDataInt > 0) {
            this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_turn_speed_up_times), "TURN_SPEEDUP_TIMES", qre.f(R.string.IDS_turn_acceleration_count), UnitUtil.e(extendDataInt, 1, 0), qre.e(R.plurals.IDS_hwh_motiontrack_sport_data_time, extendDataInt, ""), qre.f(R.string.IDS_turn_acceleration_count_fullunit)));
        }
    }

    private void di() {
        int extendDataInt = this.f.getExtendDataInt("swerveSpeedUpTimes", -1);
        if (extendDataInt > 0) {
            this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_swerve_speed_up_times), "SWERVE_SPEEDUP_TIMES", qre.f(R.string.IDS_change_of_direction_acceleration_count), UnitUtil.e(extendDataInt, 1, 0), qre.e(R.plurals.IDS_hwh_motiontrack_sport_data_time, extendDataInt, ""), qre.f(R.string.IDS_change_of_direction_acceleration_count_fullunit)));
        }
    }

    private void ce() {
        int iIntValue = this.o.getOrDefault(Integer.valueOf(this.f.getExtendDataInt("playerPosition", -1)), -1).intValue();
        if (iIntValue != -1) {
            this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_player_position), "PLAYER_POSITION", qre.f(R.string.IDS_player_position), qre.f(iIntValue), "", qre.f(R.string.IDS_player_position)));
        }
    }

    private void ay() {
        int extendDataInt = this.f.getExtendDataInt("goalsTimes", -1);
        if (extendDataInt > 0) {
            this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_goals_times), "GOALS_TIMES", qre.f(R.string.IDS_goals), UnitUtil.e(extendDataInt, 1, 0), qre.e(R.plurals.IDS_hwh_motiontrack_sport_data_time, extendDataInt, ""), qre.f(R.string.IDS_goals_fullunit)));
        }
    }

    private void g() {
        int extendDataInt = this.f.getExtendDataInt("assistsTimes", -1);
        if (extendDataInt > 0) {
            this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_assists_times), "ASSISTS_TIMES", qre.f(R.string.IDS_assists), UnitUtil.e(extendDataInt, 1, 0), qre.e(R.plurals.IDS_hwh_motiontrack_sport_data_time, extendDataInt, ""), qre.f(R.string.IDS_assists_fullunit)));
        }
    }

    private void cp() {
        int extendDataInt = this.f.getExtendDataInt("savesTimes", -1);
        if (extendDataInt > 0) {
            this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_saves_times), "SAVES_TIMES", qre.f(R.string.IDS_saves), UnitUtil.e(extendDataInt, 1, 0), qre.e(R.plurals.IDS_hwh_motiontrack_sport_data_time, extendDataInt, ""), qre.f(R.string.IDS_saves_fullunit)));
        }
    }

    private void cq() {
        int extendDataInt = this.f.getExtendDataInt("serve", -1);
        if (extendDataInt > 0) {
            this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_serve), "SERVE", qre.f(R.string.IDS_serve), UnitUtil.e(extendDataInt, 1, 0), qre.e(R.plurals.IDS_hwh_motiontrack_sport_data_time, extendDataInt, ""), qre.f(R.string.IDS_serve_fullunit)));
        }
    }

    private void aw() {
        Drawable drawable;
        String str;
        int extendDataInt = this.f.getExtendDataInt("forehand", -1);
        if (extendDataInt > 0) {
            String strE = UnitUtil.e(extendDataInt, 1, 0);
            String strE2 = qre.e(R.plurals.IDS_hwh_motiontrack_sport_data_time, extendDataInt, "");
            if (this.f.requestSportType() == 130) {
                drawable = ContextCompat.getDrawable(this.f11202a, R.drawable.ic_forehand);
                str = "FOREHAND";
            } else {
                drawable = ContextCompat.getDrawable(this.f11202a, R.drawable.ic_forehand_pickleball);
                str = "PICKLE_BALL_FOREHAND";
            }
            this.f11204c.add(new SportDetailItem.a(drawable, str, qre.f(R.string.IDS_forehand), strE, strE2, qre.f(R.string.IDS_forehand_fullunit)));
        }
    }

    private void bc() {
        int extendDataInt = this.f.getExtendDataInt("forehandTopspin", -1);
        if (extendDataInt > 0) {
            this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_forehand_topspin), "FOREHAND_TOPSPIN", qre.f(R.string.IDS_forehand_topspin), UnitUtil.e(extendDataInt, 1, 0), qre.e(R.plurals.IDS_hwh_motiontrack_sport_data_time, extendDataInt, ""), qre.f(R.string.IDS_forehand_topspin_fullunit)));
        }
    }

    private void at() {
        int extendDataInt = this.f.getExtendDataInt("forehandFlat", -1);
        if (extendDataInt > 0) {
            this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_forehand_flat), "FOREHAND_FLAT", qre.f(R.string.IDS_forehand_flat), UnitUtil.e(extendDataInt, 1, 0), qre.e(R.plurals.IDS_hwh_motiontrack_sport_data_time, extendDataInt, ""), qre.f(R.string.IDS_forehand_flat_fullunit)));
        }
    }

    private void ap() {
        Drawable drawable;
        String str;
        int extendDataInt = this.f.getExtendDataInt("forehandBackspin", -1);
        if (extendDataInt > 0) {
            if (this.f.requestSportType() == 130) {
                drawable = ContextCompat.getDrawable(this.f11202a, R.drawable.ic_forehand_backspin_tennis);
                str = "TENNIS_FOREHAND_BACKSPIN";
            } else {
                drawable = ContextCompat.getDrawable(this.f11202a, R.drawable.ic_forehand_backspin_pickleball);
                str = "PICKLE_BALL_FOREHAND_BACKSPIN";
            }
            this.f11204c.add(new SportDetailItem.a(drawable, str, qre.f(R.string.IDS_forehand_backspin), UnitUtil.e(extendDataInt, 1, 0), qre.e(R.plurals.IDS_hwh_motiontrack_sport_data_time, extendDataInt, ""), qre.f(R.string.IDS_forehand_backspin_fullunit)));
        }
    }

    private void az() {
        Drawable drawable;
        String str;
        int extendDataInt = this.f.getExtendDataInt("forehandVolley", -1);
        if (extendDataInt > 0) {
            if (this.f.requestSportType() == 130) {
                drawable = ContextCompat.getDrawable(this.f11202a, R.drawable.ic_forehand_volley_tennis);
                str = "TENNIS_FOREHAND_VOLLEY";
            } else {
                drawable = ContextCompat.getDrawable(this.f11202a, R.drawable.ic_forehand_volley_pickleball);
                str = "PICKLE_BALL_FOREHAND_VOLLEY";
            }
            this.f11204c.add(new SportDetailItem.a(drawable, str, qre.f(R.string.IDS_forehand_volley), UnitUtil.e(extendDataInt, 1, 0), qre.e(R.plurals.IDS_hwh_motiontrack_sport_data_time, extendDataInt, ""), qre.f(R.string.IDS_forehand_volley_fullunit)));
        }
    }

    private void aa() {
        Drawable drawable;
        String str;
        int extendDataInt = this.f.getExtendDataInt("backhand", -1);
        if (extendDataInt > 0) {
            String strE = UnitUtil.e(extendDataInt, 1, 0);
            String strE2 = qre.e(R.plurals.IDS_hwh_motiontrack_sport_data_time, extendDataInt, "");
            if (this.f.requestSportType() == 130) {
                drawable = ContextCompat.getDrawable(this.f11202a, R.drawable.ic_backhand);
                str = "BACKHAND";
            } else {
                drawable = ContextCompat.getDrawable(this.f11202a, R.drawable.ic_bachand_pickleball);
                str = "PICKLE_BALL_BACKHAND";
            }
            this.f11204c.add(new SportDetailItem.a(drawable, str, qre.f(R.string.IDS_backhand), strE, strE2, qre.f(R.string.IDS_backhand_fullunit)));
        }
    }

    private void af() {
        int extendDataInt = this.f.getExtendDataInt("backhandTopspin", -1);
        if (extendDataInt > 0) {
            this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_backhand_topspin), "BACKHAND_TOPSPIN", qre.f(R.string.IDS_backhand_topspin), UnitUtil.e(extendDataInt, 1, 0), qre.e(R.plurals.IDS_hwh_motiontrack_sport_data_time, extendDataInt, ""), qre.f(R.string.IDS_backhand_topspin_fullunit)));
        }
    }

    private void ab() {
        Drawable drawable;
        String str;
        int extendDataInt = this.f.getExtendDataInt("backhandBackspin", -1);
        if (extendDataInt > 0) {
            if (this.f.requestSportType() == 130) {
                drawable = ContextCompat.getDrawable(this.f11202a, R.drawable.ic_backhand_backspin_tennis);
                str = "TENNIS_BACKHAND_BACKSPIN";
            } else {
                drawable = ContextCompat.getDrawable(this.f11202a, R.drawable.ic_backhand_backspin_pickleball);
                str = "PICKLE_BALL_BACKHAND_BACKSPIN";
            }
            this.f11204c.add(new SportDetailItem.a(drawable, str, qre.f(R.string.IDS_backhand_backspin), UnitUtil.e(extendDataInt, 1, 0), qre.e(R.plurals.IDS_hwh_motiontrack_sport_data_time, extendDataInt, ""), qre.f(R.string.IDS_backhand_backspin_fullunit)));
        }
    }

    private void ag() {
        Drawable drawable;
        String str;
        int extendDataInt = this.f.getExtendDataInt("backhandVolley", -1);
        if (extendDataInt > 0) {
            if (this.f.requestSportType() == 130) {
                drawable = ContextCompat.getDrawable(this.f11202a, R.drawable.ic_backhand_volley_tennis);
                str = "TENNIS_BACKHAND_VOLLEY";
            } else {
                drawable = ContextCompat.getDrawable(this.f11202a, R.drawable.ic_backhand_volley_pickleball);
                str = "PICKLE_BALL_BACKHAND_VOLLEY";
            }
            this.f11204c.add(new SportDetailItem.a(drawable, str, qre.f(R.string.IDS_backhand_volley), UnitUtil.e(extendDataInt, 1, 0), qre.e(R.plurals.IDS_hwh_motiontrack_sport_data_time, extendDataInt, ""), qre.f(R.string.IDS_backhand_volley_fullunit)));
        }
    }

    private void dh() {
        Drawable drawable;
        String str;
        int extendDataInt = this.f.getExtendDataInt("swingTimes", -1);
        if (extendDataInt > 0) {
            if (this.f.requestSportType() == 130) {
                drawable = ContextCompat.getDrawable(this.f11202a, R.drawable.ic_swing_times_tennis);
                str = "TENNIS_SWING_TIMES";
            } else {
                drawable = ContextCompat.getDrawable(this.f11202a, R.drawable.ic_swing_times_pickleball);
                str = "PICKLE_BALL_SWING_TIMES";
            }
            this.f11204c.add(new SportDetailItem.a(drawable, str, qre.f(R.string.IDS_swing_times), UnitUtil.e(extendDataInt, 1, 0), qre.e(R.plurals.IDS_hwh_motiontrack_sport_data_time, extendDataInt, ""), qre.f(R.string.IDS_swing_times_fullunit)));
        }
    }

    private void ax() {
        int extendDataInt = this.f.getExtendDataInt("forehandDrop", -1);
        if (extendDataInt > 0) {
            this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_forehand_drop), "FOREHAND_DROP", qre.f(R.string.IDS_forehand_drop), UnitUtil.e(extendDataInt, 1, 0), qre.e(R.plurals.IDS_hwh_motiontrack_sport_data_time, extendDataInt, ""), qre.f(R.string.IDS_forehand_drop_fullunit)));
        }
    }

    private void au() {
        int extendDataInt = this.f.getExtendDataInt("forehandDrive", -1);
        if (extendDataInt > 0) {
            this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_forehand_drive), "FOREHAND_DRIVE", qre.f(R.string.IDS_forehand_drive), UnitUtil.e(extendDataInt, 1, 0), qre.e(R.plurals.IDS_hwh_motiontrack_sport_data_time, extendDataInt, ""), qre.f(R.string.IDS_forehand_drive_fullunit)));
        }
    }

    private void ae() {
        int extendDataInt = this.f.getExtendDataInt("backhandDrop", -1);
        if (extendDataInt > 0) {
            this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_backhand_drop), "BACKHAND_DROP", qre.f(R.string.IDS_backhand_drop), UnitUtil.e(extendDataInt, 1, 0), qre.e(R.plurals.IDS_hwh_motiontrack_sport_data_time, extendDataInt, ""), qre.f(R.string.IDS_backhand_drop_fullunit)));
        }
    }

    private void ad() {
        int extendDataInt = this.f.getExtendDataInt("backhandDrive", -1);
        if (extendDataInt > 0) {
            this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_backhand_drive), "BACKHAND_DRIVE", qre.f(R.string.IDS_backhand_drive), UnitUtil.e(extendDataInt, 1, 0), qre.e(R.plurals.IDS_hwh_motiontrack_sport_data_time, extendDataInt, ""), qre.f(R.string.IDS_backhand_drive_fullunit)));
        }
    }

    private void dk() {
        String strE;
        String strF;
        float extendDataFloat = this.f.getExtendDataFloat("swingSpeed", -1.0f);
        if (extendDataFloat > 0.0f) {
            if (UnitUtil.f()) {
                extendDataFloat *= 0.6213712f;
                strE = qre.e(R.plurals.ie_motiontrack_show_sport_unit_mi_per_h, (int) extendDataFloat, "");
                strF = qre.f(R.string.IDS_swing_speeds_fullunit_imp);
            } else {
                strE = qre.e(R.plurals.IDS_motiontrack_detail_average_speed, (int) extendDataFloat, "");
                strF = qre.f(R.string.IDS_swing_speeds_fullunit);
            }
            this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_swing_speed), "SWING_SPEED", qre.f(R.string.IDS_swing_speeds), UnitUtil.e(extendDataFloat, 1, 2), strE, strF));
        }
    }

    private void bq() {
        MotionPathSimplify motionPathSimplify = this.f;
        if (motionPathSimplify == null || this.l == null || this.f11202a == null || this.n == null) {
            LogUtil.e("Track_TrackDetailItemDrawer", "buildLoadPeakData mMotionPathSimplify or mRes or mContext or mSportData is null");
            return;
        }
        String extendDataString = motionPathSimplify.getExtendDataString("aerobicLoadPeak");
        String extendDataString2 = this.f.getExtendDataString("anaerobicLoadPeak");
        int iE = izv.e(this.f);
        if (TextUtils.isEmpty(extendDataString) || TextUtils.isEmpty(extendDataString2)) {
            LogUtil.a("Track_TrackDetailItemDrawer", "aerobicLoadPeakStr or anaerobicLoadPeakStr is null");
            return;
        }
        int iE2 = izn.e(this.n.get("load_peak"));
        int extendDataInt = this.f.getExtendDataInt("loadPeakLevel");
        String strB = izv.b(extendDataInt);
        int iE3 = izv.e(extendDataInt);
        if (iE <= 0 || iE2 <= 0 || TextUtils.isEmpty(strB)) {
            LogUtil.e("Track_TrackDetailItemDrawer", "buildLoadPeakData totalLoadPeak: ", Integer.valueOf(iE), ", loadPeakLevel: ", Integer.valueOf(extendDataInt), ", loadPeak: ", Integer.valueOf(iE2));
            return;
        }
        Drawable drawableD = qre.d(this.f11202a, R.mipmap.ic_peak_load);
        String strF = qre.f(R.string.IDS_hwh_health_load);
        SportDetailItem.a aVar = new SportDetailItem.a(drawableD, "LOAD_PEAK", strF, UnitUtil.e(iE2, 1, 0), strB, qre.a(R.string.IDS_motiontrack_history_all_unit, strF, strB));
        aVar.b(iE3);
        aVar.d(1.0f);
        this.f11204c.add(aVar);
    }

    private void i() {
        if (this.g) {
            LogUtil.a("Track_TrackDetailItemDrawer", "already show avgCadence");
            return;
        }
        int extendDataInt = this.f.getExtendDataInt("avgAnalogCadence", -1);
        if (extendDataInt > 0) {
            this.f11204c.add(new SportDetailItem.a(ContextCompat.getDrawable(this.f11202a, R.drawable.ic_analog_cadence), "AVERAGE_ANALOG_CADENCE", qre.f(R.string.IDS_track_average_analog_cadence), UnitUtil.e(extendDataInt, 1, 0), qre.e(R.plurals.IDS_indoor_equip_cadence_pre_unit_times, extendDataInt, ""), qre.f(R.string.IDS_track_avg_analog_cadence_unit)));
        }
    }

    private SportDetailItem.a a(int i) {
        return new SportDetailItem.a(w(R.drawable.ic_power), "AVERAGE_POWER", qre.f(ej() ? R.string.IDS_rowing_machine_peak_power : R.string.IDS_average_power_not_abbreviate), UnitUtil.e(i, 1, 0), qre.f(R.string.IDS_indoor_equip_power_unit_watt), ej() ? qre.f(R.string.IDS_track_peak_power_with_unit) : qre.f(R.string.IDS_track_average_power_with_unit));
    }

    private void p(int i) {
        if (jpq.o(i)) {
            ee();
        } else {
            dy();
        }
    }

    private void y() {
        int iIntValue = this.f.requestSportData().get("swim_pull_freq").intValue();
        if (iIntValue > 0) {
            this.f11204c.add(g(iIntValue));
        }
    }

    private SportDetailItem.a g(int i) {
        return new SportDetailItem.a(this.l.getDrawable(R.drawable.ic_swimming_frequency), "AVERAGE_STROKE_RATE", this.l.getString(R.string.IDS_hwh_motiontrack_avg_stroke_rate), UnitUtil.e(i, 1, 0), this.l.getQuantityString(R.plurals.IDS_hwh_motiontrack_stroke_rate_unit, i), qre.f(R.string.IDS_hwh_motiontrack_pull_frequence_with_unit));
    }

    private void v() {
        int iIntValue = this.f.requestSportData().get(HwExerciseConstants.JSON_NAME_SWIM_AVG_SWOLF).intValue();
        if (iIntValue > 0) {
            this.f11204c.add(h(iIntValue));
        }
    }

    private SportDetailItem.a h(int i) {
        return new SportDetailItem.a(this.l.getDrawable(R.drawable.ic_swimming_swolf), "AVERAGE_SWOLF", qre.f(R.string.IDS_hwh_motiontrack_avg_swolf), UnitUtil.e(i, 1, 0), "", qre.f(R.string.IDS_hwh_motiontrack_avg_swolf));
    }

    private void dc() {
        long duration = this.m.e().getDuration();
        if (duration >= 0) {
            this.f11204c.add(c(duration));
        }
    }

    private void cy() {
        int distance = this.m.e().getDistance();
        if (distance >= 0) {
            this.f11204c.add(m(distance));
        }
    }

    private SportDetailItem.a m(int i) {
        return b(i, this.m.e().getSportType() == 262 || this.m.e().getSportType() == 266);
    }

    private void cx() {
        int iRequestTotalDistance = this.f.requestTotalDistance();
        if (iRequestTotalDistance > 0) {
            this.f11204c.add(l(iRequestTotalDistance));
        }
    }

    private boolean ei() {
        return this.f.requestSportType() == 262 || this.f.requestSportType() == 266;
    }

    private SportDetailItem.a l(int i) {
        return b(i, ei());
    }

    private SportDetailItem.a b(int i, boolean z) {
        String strB;
        String strF;
        String strF2;
        String strF3;
        String strC;
        if (z) {
            if (i == 0) {
                strF = qre.f(R.string.IDS_motiontrack_show_invalid_data);
            } else {
                strF = jpq.f(i);
            }
            if (UnitUtil.f()) {
                strF2 = qre.e(R.plurals.IDS_hwh_motiontrack_unit_yd, (int) Math.round(UnitUtil.e(i, 2)), new Object[0]);
                strF3 = qre.f(R.string.IDS_track_distance_yd_with_unit);
            } else {
                strF2 = qre.f(R.string.IDS_fitness_data_list_activity_meter_unit);
                strF3 = qre.f(R.string.IDS_track_distance_meter_with_unit);
            }
        } else {
            MotionPathSimplify motionPathSimplify = this.f;
            if (motionPathSimplify != null && jpq.g(motionPathSimplify.requestSportType())) {
                if (i == 0) {
                    strC = qre.f(R.string.IDS_motiontrack_show_invalid_data);
                } else {
                    strC = UnitUtil.c(i, 1, 0, false);
                }
                strF = strC;
                strF2 = qre.f(R.string.IDS_fitness_data_list_activity_meter_unit);
                strF3 = qre.f(R.string.IDS_track_distance_meter_with_unit);
            } else {
                if (i == 0) {
                    strB = qre.f(R.string.IDS_motiontrack_show_invalid_data);
                } else {
                    strB = jpq.b(i);
                }
                strF = strB;
                if (UnitUtil.f()) {
                    strF2 = qre.f(R.string.IDS_band_data_sport_distance_unit_en);
                    strF3 = qre.f(R.string.IDS_track_distance_en_with_unit);
                } else {
                    strF2 = qre.f(R.string.IDS_band_data_sport_distance_unit);
                    strF3 = qre.f(R.string.IDS_track_distance_with_unit);
                }
            }
        }
        return new SportDetailItem.a(qre.c(R.drawable.ic_distance), "DISTANCE", qre.f(R.string.IDS_motiontrack_show_map_sport_distance), strF, strF2, strF3);
    }

    private void cz() {
        long jRequestTotalTime;
        int iRequestSportType = this.f.requestSportType();
        if (this.f.requestSportDataSource() != 2 && nub.e(iRequestSportType)) {
            jRequestTotalTime = this.f.getExtendDataInt("skiTotalTime");
            if (jRequestTotalTime == -1) {
                LogUtil.e("Track_TrackDetailItemDrawer", "ski total time is null");
                return;
            }
        } else {
            jRequestTotalTime = this.f.requestTotalTime();
        }
        if (jRequestTotalTime > 0) {
            if (iRequestSportType == 220 && !this.i) {
                this.d.add(c(jRequestTotalTime));
            } else {
                this.f11204c.add(c(jRequestTotalTime));
            }
        }
    }

    private SportDetailItem.a c(long j) {
        return new SportDetailItem.a(this.l.getDrawable(R.drawable.ic_sport_time), "TIME", qre.f(R.string.IDS_motiontrack_show_detail_sporttime), jpq.e(j), "", qre.f(R.string.IDS_motiontrack_show_detail_sporttime));
    }

    private void aj() {
        int iRequestTotalCalories;
        if (this.f.requestChiefSportDataType() == 1 || this.f.requestChiefSportDataType() == 2 || (iRequestTotalCalories = this.f.requestTotalCalories()) <= 0) {
            return;
        }
        if (this.f.requestSportType() == 220 && !this.i) {
            this.d.add(j(iRequestTotalCalories));
        } else {
            this.f11204c.add(j(iRequestTotalCalories));
        }
    }

    private void b() {
        int iRequestActiveCalories = this.f.requestActiveCalories();
        int iRequestTotalCalories = this.f.requestTotalCalories();
        if (iRequestActiveCalories <= 0 || iRequestActiveCalories >= iRequestTotalCalories) {
            return;
        }
        if (this.f.requestSportType() == 220 && !this.i) {
            this.d.add(c(iRequestActiveCalories));
        } else {
            this.f11204c.add(c(iRequestActiveCalories));
        }
    }

    private SportDetailItem.a c(int i) {
        return new SportDetailItem.a(qre.c(R.drawable.ic_track_active_calorie), "ACTIVE_CALORIES", this.l.getString(R.string.IDS_track_active_calories), jpq.d(i), this.l.getString(R.string.IDS_motiontrack_show_kcal), qre.f(R.string.IDS_track_active_calories_kcal));
    }

    private SportDetailItem.a j(int i) {
        String strD;
        if (i > 0) {
            strD = jpq.d(i);
        } else {
            strD = this.e;
        }
        return new SportDetailItem.a(qre.c(R.drawable.ic_track_total_calorie), "CALORIES", qre.f(R.string.IDS_track_total_calories), strD, qre.f(R.string.IDS_motiontrack_show_kcal), qre.f(R.string.IDS_track_total_calorie_kcal));
    }

    private void e() {
        int iIntValue;
        if (this.f.requestSportData() == null || !this.f.requestSportData().containsKey("active_time") || (iIntValue = this.f.requestSportData().get("active_time").intValue()) <= 0) {
            return;
        }
        this.f11204c.add(b(iIntValue));
    }

    private SportDetailItem.a b(int i) {
        String strE;
        if (i > 0) {
            strE = UnitUtil.e(i);
        } else {
            strE = this.e;
        }
        return new SportDetailItem.a(this.l.getDrawable(R.drawable.ic_active_time), "ACTIVE_TIME", qre.f(R.string.IDS_aw_version2_active_time), strE, "", qre.f(R.string.IDS_aw_version2_active_time));
    }

    private void ck() {
        MotionPath motionPath = this.j;
        if (motionPath == null || !motionPath.isValidCadenceData()) {
            return;
        }
        int iEc = ec();
        if (iEc == 0) {
            LogUtil.a("Track_TrackDetailItemDrawer", "buildRideTimeDetailItem rideTime is 0");
            return;
        }
        int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(this.f.requestTotalTime());
        if (iEc > seconds) {
            LogUtil.a("Track_TrackDetailItemDrawer", "rideTime is greater than totalTime");
            iEc = seconds;
        }
        this.f11204c.add(n(iEc));
    }

    private int ec() {
        Iterator<gzr> it = this.j.requestRidePostureDataList().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().c() > 0) {
                i++;
            }
        }
        return i * 5;
    }

    private SportDetailItem.a n(int i) {
        String strE;
        if (i > 0) {
            strE = UnitUtil.e(i);
        } else {
            strE = this.e;
        }
        return new SportDetailItem.a(this.l.getDrawable(R.drawable.ic_active_time), "RIDE_TIME", qre.f(R.string.IDS_aw_version2_ride_time), strE, "", qre.f(R.string.IDS_aw_version2_ride_time));
    }

    private SportDetailItem.a d(long j, int i) {
        String strA;
        if (j > 0 && i > 0) {
            strA = jpq.a(j, i);
        } else {
            strA = this.e;
        }
        return new SportDetailItem.a(this.l.getDrawable(R.drawable.ic_proportion), "ACTIVE_TIME_RATIO", qre.f(R.string.IDS_aw_version2_active_time_proportion), strA, "", qre.f(R.string.IDS_aw_version2_active_time_proportion));
    }

    private void m() {
        float fRequestAvgPace = this.f.requestAvgPace();
        if (ea()) {
            if (UnitUtil.f()) {
                fRequestAvgPace = ((float) UnitUtil.c(fRequestAvgPace, 2)) / 5.0f;
            }
        } else if (UnitUtil.f()) {
            fRequestAvgPace = (float) UnitUtil.c(fRequestAvgPace, 3);
        }
        double d = fRequestAvgPace;
        if (d > 360000.0d || d <= 3.6d || fRequestAvgPace <= 0.0f) {
            return;
        }
        this.f11204c.add(b(fRequestAvgPace));
    }

    private void l() {
        float fRequestAvgPace = this.f.requestAvgPace() / 2.0f;
        double d = fRequestAvgPace;
        if (d > 360000.0d || d <= 3.6d || fRequestAvgPace <= 0.0f) {
            return;
        }
        this.f11204c.add(a(fRequestAvgPace));
    }

    private boolean ea() {
        return this.f.requestSportType() == 274;
    }

    private SportDetailItem.a b(float f) {
        String strA;
        String strA2;
        if (f > 0.0f) {
            strA = izn.a(f);
        } else {
            strA = this.e;
        }
        String str = strA;
        if (ea()) {
            strA2 = a(this.f11202a);
        } else if (UnitUtil.f()) {
            strA2 = "/" + qre.f(R.string.IDS_motiontrack_show_sport_unit_mi);
        } else {
            strA2 = "/" + qre.f(R.string.IDS_motiontrack_show_sport_unit_km);
        }
        String str2 = strA2;
        return new SportDetailItem.a(qre.c(R.drawable.ic_avg_pace), "AVERAGE_PACE", this.l.getString(R.string.IDS_motiontrack_show_detail_avragepace), str, str2, qre.a(R.string.IDS_track_average_pace_half_with_unit, str2));
    }

    private SportDetailItem.a a(float f) {
        String strA = this.e;
        if (f > 0.0f) {
            strA = izn.a(f);
        }
        String str = strA;
        String strE = qre.e(R.plurals.IDS_hwh_motiontrack_swim_pace_unit, 500, 500);
        return new SportDetailItem.a(this.l.getDrawable(R.drawable.ic_avg_pace), "AVERAGE_PACE_500", qre.f(R.string.IDS_motiontrack_show_detail_avragepace), str, strE, qre.a(R.string.IDS_track_average_pace_half_with_unit, strE));
    }

    private String a(Context context) {
        if (context == null) {
            LogUtil.j("Track_TrackDetailItemDrawer", "acquire Swim Unit and context is null");
            return "";
        }
        if (UnitUtil.f()) {
            return context.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit_mi, 100, 100);
        }
        return context.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit, 500, 500);
    }

    private void p() {
        float fRequestAvgPace;
        String strH;
        if (UnitUtil.f()) {
            fRequestAvgPace = this.f.requestAvgPace() * 1.609344f;
        } else {
            fRequestAvgPace = this.f.requestAvgPace();
        }
        if (ea()) {
            strH = jpq.h(fRequestAvgPace * 2.0f);
        } else {
            strH = jpq.h(fRequestAvgPace);
        }
        if (izn.e(BaseApplication.getContext()).equals(strH)) {
            LogUtil.a("Track_TrackDetailItemDrawer", "buildAverageSpeedItem is 0");
        } else {
            this.f11204c.add(c(strH));
        }
    }

    private SportDetailItem.a c(String str) {
        String strF = qre.f(R.string.IDS_motiontrack_show_detail_average_speed);
        String strF2 = qre.f(R.string.IDS_motiontrack_show_avgspeed_km);
        if (UnitUtil.f()) {
            strF = qre.f(R.string.IDS_motiontrack_show_detail_average_speed_imp);
            strF2 = qre.f(R.string.IDS_motiontrack_show_avgspeed_mi);
        }
        return new SportDetailItem.a(this.l.getDrawable(R.drawable.ic_avg_speed), "AVERAGE_SPEED", qre.f(R.string.IDS_motiontrack_show_detail_averagespeed), str, strF, strF2);
    }

    private void h() {
        int extendDataInt;
        if (this.f.requestSportType() == 273 && this.f.getExtendDataInt("crossTrainerCadence") > 0) {
            extendDataInt = this.f.getExtendDataInt("crossTrainerCadence");
        } else if ((this.f.requestSportType() == 259 || this.f.requestSportType() == 265) && this.f.getExtendDataInt("avgCadence") > 0) {
            extendDataInt = this.f.getExtendDataInt("avgCadence");
        } else {
            extendDataInt = jpq.c(this.f, this.j);
        }
        if (extendDataInt > 0) {
            this.f11204c.add(e(extendDataInt));
            this.g = true;
        }
    }

    private SportDetailItem.a e(int i) {
        return new SportDetailItem.a(qre.c(R.drawable.ic_avg_cadence), "AVERAGE_CADENCE", qre.f(R.string.IDS_indoor_equip_detail_cadence_average), UnitUtil.e(i, 1, 0), qre.e(R.plurals.IDS_indoor_equip_cadence_pre_unit_times, i, ""), qre.f(R.string.IDS_track_average_cadence_with_unit));
    }

    private void cg() {
        int iA = jpq.a(this.f);
        if (iA > 1.0E-9d) {
            this.f11204c.add(d(iA));
        }
    }

    private SportDetailItem.a d(int i) {
        return new SportDetailItem.a(qre.c(R.drawable.ic_avg_paddle), "PADDLE_FREQUENCY", qre.f(R.string.IDS_indoor_equip_detail_paddle_average), UnitUtil.e(i, 1, 0), qre.f(R.string.IDS_indoor_equip_paddle_unit_times_minute), qre.f(R.string.IDS_track_average_paddle_with_unit));
    }

    private void s() {
        int iRequestAvgStepRate = this.f.requestAvgStepRate();
        if (iRequestAvgStepRate <= 0 || !jpq.n(this.f.requestSportType())) {
            return;
        }
        this.f11204c.add(f(iRequestAvgStepRate));
    }

    private SportDetailItem.a f(int i) {
        String strB;
        if (i > 0) {
            strB = jpq.b(i);
        } else {
            strB = this.e;
        }
        return new SportDetailItem.a(qre.c(R.drawable.ic_avg_step_rate), "AVERAGE_STEP_RATE", qre.f(R.string.IDS_motiontrack_show_detail_averagestemps), strB, qre.e(R.plurals.IDS_motiontrack_show_chart_stepsmin, 0, new Object[0]), qre.f(R.string.IDS_track_average_step_rate_with_unit));
    }

    private void de() {
        float fRequestAvgStepRate;
        MotionPath motionPath;
        int iRequestTotalSteps = this.f.requestTotalSteps();
        int iRequestTotalDistance = this.f.requestTotalDistance();
        if (iRequestTotalSteps <= 0 || iRequestTotalDistance <= 0 || !jpq.n(this.f.requestSportType())) {
            return;
        }
        if (this.f.requestSportDataSource() != 5 || (motionPath = this.j) == null || motionPath.requestStepRateList().size() <= 0 || this.j.requestStepRateList().get(0).acquireStepRate() != this.f.requestAvgStepRate()) {
            fRequestAvgStepRate = ((iRequestTotalDistance * 1.0f) / iRequestTotalSteps) * 100.0f;
        } else {
            fRequestAvgStepRate = (this.f.requestAvgStepRate() == 0 || this.f.requestTotalTime() == 0) ? 0.0f : ((iRequestTotalDistance * 1.0f) / (((long) this.f.requestAvgStepRate()) * TimeUnit.SECONDS.toMinutes(TimeUnit.MILLISECONDS.toSeconds(this.f.requestTotalTime())))) * 100.0f;
        }
        if (fRequestAvgStepRate <= 200.0f) {
            this.f11204c.add(c(fRequestAvgStepRate));
        }
    }

    private SportDetailItem.a c(float f) {
        String strF = qre.f(R.string.IDS_motiontrack_show_detail_paces);
        String strF2 = qre.f(R.string.IDS_track_average_stride_with_unit);
        String strA = jpq.a(f);
        if (UnitUtil.f()) {
            strF = qre.f(R.string.IDS_motiontrack_show_detail_paces_imp);
            strF2 = qre.f(R.string.IDS_track_average_stride_in_with_unit);
        }
        return new SportDetailItem.a(qre.c(R.drawable.ic_step_stride), "STRIDE_ITEM", qre.f(R.string.IDS_hwh_motiontrack_avg_stride_length), strA, strF, strF2);
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private void m1332do() {
        int iRequestTotalSteps = this.f.requestTotalSteps();
        if (iRequestTotalSteps > 0) {
            if (jpq.n(this.f.requestSportType()) || jpq.e(this.f.requestSportType(), this.j)) {
                this.f11204c.add(r(iRequestTotalSteps));
            }
        }
    }

    private SportDetailItem.a r(int i) {
        String strB;
        if (i > 0) {
            strB = jpq.b(i);
        } else {
            strB = this.e;
        }
        return new SportDetailItem.a(w(R.drawable.ic_total_steps), "TOTAL_STEPS", qre.f(R.string.IDS_motiontrack_show_detail_stemps), strB, qre.f(R.string.IDS_settings_steps_unit), qre.f(R.string.IDS_track_total_steps_with_unit));
    }

    private void dm() {
        int iRequestTotalSteps = this.f.requestTotalSteps();
        int iA = jpq.a(this.f);
        if (iRequestTotalSteps <= 0 || iA <= 1.0E-9d) {
            return;
        }
        this.f11204c.add(s(iRequestTotalSteps));
    }

    private SportDetailItem.a s(int i) {
        String strB;
        if (i > 0) {
            strB = jpq.b(i);
        } else {
            strB = this.e;
        }
        return new SportDetailItem.a(w(ej() ? R.drawable.ic_total_times : R.drawable.ic_total_paddles), "TOTAL_PADDLE", qre.f(ej() ? R.string.IDS_rowing_machine_total_action_count : R.string.IDS_indoor_equip_paddle_times), strB, qre.e(R.plurals.IDS_hwh_motiontrack_sport_data_time, i, new Object[0]), qre.f(ej() ? R.string.IDS_rowing_machine_total_action_count : R.string.IDS_track_paddle_times_with_unit));
    }

    private boolean ej() {
        return izn.b(this.f).equals("291");
    }

    private void be() {
        int iRequestAvgHeartRate = this.f.requestAvgHeartRate();
        if (iRequestAvgHeartRate > 0 && this.f11204c != null) {
            if (this.f.requestSportType() == 220 && !this.i) {
                this.d.add(i(iRequestAvgHeartRate));
                return;
            } else {
                this.f11204c.add(i(iRequestAvgHeartRate));
                return;
            }
        }
        LogUtil.a("Track_TrackDetailItemDrawer", "no buildHeartRateData");
    }

    private SportDetailItem.a i(int i) {
        String strE;
        if (i != 0) {
            strE = UnitUtil.e(i, 1, 0);
        } else {
            strE = this.e;
        }
        return new SportDetailItem.a(this.l.getDrawable(R.drawable.ic_heart_rate), ObserveLabels.HEART_RATE, qre.f(R.string.IDS_motiontrack_show_detail_avrageheartrate), strE, qre.f(R.string.IDS_main_watch_heart_rate_unit_string), qre.f(R.string.IDS_track_average_heart_rate_with_unit));
    }

    private boolean j(float f) {
        if (f > 1.0f) {
            return true;
        }
        MotionPath motionPath = this.j;
        return motionPath != null && motionPath.isValidAltitudeList() && f >= 0.0f;
    }

    private void an() {
        float fRequestCreepingWave = this.f.requestCreepingWave() / 10.0f;
        if (j(fRequestCreepingWave)) {
            this.f11204c.add(e(fRequestCreepingWave));
        }
    }

    private SportDetailItem.a e(float f) {
        String strE;
        String strF;
        String str;
        if (UnitUtil.f()) {
            double dE = UnitUtil.e(f, 1);
            String strE2 = qre.e(R.plurals.IDS_hwh_motiontrack_ft_string, (int) Math.round(dE), new Object[0]);
            String strF2 = qre.f(R.string.IDS_hwh_motiontrack_total_climbed_with_imperial_unit);
            strE = UnitUtil.e(dE, 1, 2);
            str = strE2;
            strF = strF2;
        } else {
            String strF3 = qre.f(R.string.IDS_fitness_data_list_activity_meter_unit);
            strE = UnitUtil.e(f, 1, 1);
            strF = qre.f(R.string.IDS_hwh_motiontrack_total_climbed_with_unit);
            str = strF3;
        }
        return new SportDetailItem.a(w(R.drawable.ic_creeping), "TOTAL_CREEP", qre.f(R.string.IDS_hwh_motiontrack_total_climbed), strE, str, strF);
    }

    private void dl() {
        float fRequestTotalDescent = this.f.requestTotalDescent() / 10.0f;
        if (fRequestTotalDescent <= 0.0f || !j(fRequestTotalDescent)) {
            return;
        }
        this.f11204c.add(d(fRequestTotalDescent));
    }

    private SportDetailItem.a d(float f) {
        String strE;
        String strE2;
        String strF;
        if (UnitUtil.f()) {
            double dE = UnitUtil.e(f, 1);
            strE = qre.e(R.plurals.IDS_hwh_motiontrack_ft_string, (int) Math.round(dE), new Object[0]);
            strF = qre.f(R.string.IDS_hwh_motiontrack_total_descent_with_imperial_unit);
            strE2 = UnitUtil.e(dE, 1, 2);
        } else {
            String strF2 = qre.f(R.string.IDS_fitness_data_list_activity_meter_unit);
            String strF3 = qre.f(R.string.IDS_hwh_motiontrack_total_descent_with_unit);
            strE = strF2;
            strE2 = UnitUtil.e(f, 1, 1);
            strF = strF3;
        }
        return new SportDetailItem.a(w(R.drawable.ic_descent), "TOTAL_DESCENT", qre.f(R.string.IDS_hwh_motiontrack_total_descent), strE2, strE, strF);
    }

    private void dd() {
        Map<String, Integer> map = this.n;
        if (map == null || map.get("swim_stroke") == null) {
            return;
        }
        this.f11204c.add(dj());
    }

    private SportDetailItem.a dj() {
        String string;
        SportDetailItem.a aVar = new SportDetailItem.a(w(R.drawable.ic_stroke_type), "STROKE_TYPE", qre.f(R.string.IDS_hwh_motiontrack_main_style), this.e, "", qre.f(R.string.IDS_hwh_motiontrack_main_style));
        int iIntValue = this.n.get("swim_stroke").intValue();
        if (iIntValue == 1) {
            string = this.l.getString(R.string.IDS_hwh_motiontrack_breaststroke);
        } else if (iIntValue == 2) {
            string = this.l.getString(R.string.IDS_hwh_motiontrack_freestyle);
        } else if (iIntValue == 3) {
            string = this.l.getString(R.string.IDS_hwh_motiontrack_butterfly_stroke);
        } else if (iIntValue == 4) {
            string = this.l.getString(R.string.IDS_hwh_motiontrack_backstroke);
        } else if (iIntValue == 5) {
            string = this.l.getString(R.string.IDS_hwh_motiontrack_medley);
        } else {
            string = this.l.getString(R.string.IDS_hwh_motiontrack_freestyle);
        }
        aVar.c(string);
        return aVar;
    }

    private void db() {
        int iIntValue;
        Map<String, Integer> map = this.n;
        if (map == null || map.get(HwExerciseConstants.JSON_NAME_SWIM_PULL_TIMES) == null || (iIntValue = this.n.get(HwExerciseConstants.JSON_NAME_SWIM_PULL_TIMES).intValue()) < 0) {
            return;
        }
        this.f11204c.add(q(iIntValue));
    }

    private SportDetailItem.a q(int i) {
        SportDetailItem.a aVar = new SportDetailItem.a(w(R.drawable.ic_stroke_times), "STROKE_TIMES", qre.f(R.string.IDS_hwh_motiontrack_pull_times), this.e, qre.e(R.plurals.IDS_hwh_motiontrack_swim_stroke, i, ""), qre.f(R.string.IDS_track_motiontrack_pull_with_unit));
        aVar.c(UnitUtil.e(i, 1, 0));
        return aVar;
    }

    private void ch() {
        Map<String, Integer> map = this.n;
        if (map == null || map.get(HwExerciseConstants.JSON_NAME_SWIM_POOL_LENGTH) == null) {
            return;
        }
        double dIntValue = this.n.get(HwExerciseConstants.JSON_NAME_SWIM_POOL_LENGTH).intValue();
        if (dIntValue >= 0.0d) {
            this.f11204c.add(j(dIntValue));
        }
    }

    private SportDetailItem.a j(double d) {
        String strF;
        String strF2;
        SportDetailItem.a aVar = new SportDetailItem.a(qre.c(R.drawable.ic_pool_length), "POOL_LENGTH", qre.f(R.string.IDS_hwh_motiontrack_pool_length), this.e, qre.f(R.string.IDS_fitness_data_list_activity_meter_unit), qre.f(R.string.IDS_track_poll_length_mi_with_unit));
        if (UnitUtil.f()) {
            strF = qre.e(R.plurals.IDS_hwh_motiontrack_unit_yd, (int) Math.round(d), new Object[0]);
            strF2 = qre.f(R.string.IDS_track_poll_length_yd_with_unit);
        } else {
            strF = qre.f(R.string.IDS_fitness_data_list_activity_meter_unit);
            strF2 = qre.f(R.string.IDS_track_poll_length_mi_with_unit);
        }
        aVar.a(strF);
        aVar.b(strF2);
        aVar.c(UnitUtil.e(jpq.e(d), 1, 0));
        return aVar;
    }

    private void bi() {
        Map<String, Integer> map = this.n;
        if (map == null || map.get("swim_laps") == null || this.n.get("swim_laps").intValue() < 0) {
            return;
        }
        this.f11204c.add(bm());
    }

    private SportDetailItem.a bm() {
        SportDetailItem.a aVar = new SportDetailItem.a(w(R.drawable.ic_laps), "LAPS", qre.f(R.string.IDS_hwh_motiontrack_laps), this.e, "", qre.f(R.string.IDS_hwh_motiontrack_laps));
        aVar.c(UnitUtil.e(this.n.get("swim_laps").intValue(), 1, 0));
        return aVar;
    }

    private void bb() {
        Map<String, Integer> map = this.n;
        if (map == null || map.get("achieve_percent") == null || this.n.get("achieve_percent").intValue() <= 0) {
            return;
        }
        this.f11204c.add(ba());
    }

    private SportDetailItem.a ba() {
        return new SportDetailItem.a(qre.c(R.drawable.ic_goal), "BASKETBALL_JUMP", qre.f(R.string.IDS_motiontrack_detail_goal), UnitUtil.e(this.n.get("achieve_percent").intValue(), 2, 1), "", qre.f(R.string.IDS_motiontrack_detail_goal));
    }

    private void bh() {
        MotionPath motionPath = this.j;
        if (motionPath == null || njy.e(motionPath.requestJumpDataList()) || jpq.c(this.j.requestJumpDataList()) <= 0) {
            return;
        }
        this.f11204c.add(bg());
    }

    private void cv() {
        if (this.f.getExtendDataInt("skipSpeed") > 0) {
            this.f11204c.add(t());
        }
    }

    private void dg() {
        if (this.j != null) {
            if (n("interruptTimes")) {
                d("interruptTimes");
            } else if (n("stumblingRope")) {
                d("stumblingRope");
            }
        }
    }

    private boolean n(String str) {
        return this.f.requestExtendDataMap().containsKey(str) && this.f.requestExtendDataMap().get(str) != null;
    }

    private void d(String str) {
        if (this.f.getExtendDataInt(str) != -1) {
            this.f11204c.add(l(str));
        }
    }

    private void bs() {
        if (this.j == null || !this.f.requestExtendDataMap().containsKey("maxSkippingTimes") || this.f.requestExtendDataMap().get("maxSkippingTimes") == null || this.f.getExtendDataInt("maxSkippingTimes") == -1) {
            return;
        }
        this.f11204c.add(bv());
    }

    private SportDetailItem.a bv() {
        int extendDataInt = this.f.getExtendDataInt("maxSkippingTimes");
        return new SportDetailItem.a(qre.c(R.drawable.ic_continuous_jump), "SKIPPING_ROPE_MAX_JUMPS", qre.f(R.string.IDS_indoor_skipper_max_jump), UnitUtil.e(extendDataInt, 1, 0), qre.e(R.plurals.IDS_indoor_skipper_number_unit_value, extendDataInt, ""), qre.f(R.string.IDS_track_max_jumps_with_unit));
    }

    private void cf() {
        if (n("skippingMode") && this.f.getExtendDataInt("skippingMode") == 3) {
            c("singleShakeNum", R.drawable.ic_single_shake, R.string.IDS_indoor_skipper_single_shaker, "SKIPPING_ROPE_SINGLE_MODE");
            c("doubleShakeNum", R.drawable.ic_double_shake, R.string.IDS_indoor_skipper_double_shaker, "SKIPPING_ROPE_DOUBLE_MODE");
        } else {
            LogUtil.a("Track_TrackDetailItemDrawer", "buildPatternShakeItem no skippingMode ");
        }
    }

    private void c(String str, int i, int i2, String str2) {
        int extendDataInt;
        if (this.j == null || !n(str) || (extendDataInt = this.f.getExtendDataInt(str)) == -1) {
            return;
        }
        this.f11204c.add(d(extendDataInt, i, i2, str2));
    }

    private SportDetailItem.a d(int i, int i2, int i3, String str) {
        return new SportDetailItem.a(this.l.getDrawable(i2), str, qre.f(i3), UnitUtil.e(i, 1, 0), qre.e(R.plurals.IDS_indoor_skipper_number_unit_value, i, ""), "");
    }

    private SportDetailItem.a bg() {
        String string;
        String strE;
        if (UnitUtil.f()) {
            string = this.l.getString(R.string.IDS_ins);
            strE = UnitUtil.e((int) UnitUtil.e(jpq.c(this.j.requestJumpDataList()), 0), 1, 0);
        } else {
            string = this.l.getString(R.string.IDS_cm);
            strE = UnitUtil.e(jpq.c(this.j.requestJumpDataList()), 1, 0);
        }
        return new SportDetailItem.a(qre.c(R.drawable.ic_height), "BASKETBALL_JUMP_HEIGHT", qre.f(R.string.IDS_aw_version2_average_jump_height_full), strE, string, "");
    }

    private SportDetailItem.a l(String str) {
        String strE = qre.e(R.plurals.IDS_details_sleep_latency_times, this.f.getExtendDataInt(str), "");
        return new SportDetailItem.a(qre.c(R.drawable.ic_stumbling), "SKIPPING_ROPE_INTERRUPT_TIMES", qre.f(R.string.IDS_indoor_skipper_stumbling_rope), UnitUtil.e(this.f.getExtendDataInt(str), 1, 0), strE, qre.f(R.string.IDS_track_interrupt_times_with_unit));
    }

    private void bj() {
        Map<String, Integer> map = this.n;
        if (map == null || map.get("jump_times") == null || this.n.get("jump_times").intValue() <= 0) {
            return;
        }
        this.f11204c.add(bk());
    }

    private SportDetailItem.a bk() {
        return new SportDetailItem.a(w(R.drawable.ic_jump_times), "BASKETBALL_JUMP_TIMES", qre.f(R.string.IDS_aw_version2_jump_times), UnitUtil.e(this.n.get("jump_times").intValue(), 1, 0), qre.e(R.plurals.IDS_hwh_motiontrack_sport_data_time, this.n.get("jump_times").intValue(), new Object[0]), "");
    }

    private SportDetailItem.a t() {
        return new SportDetailItem.a(w(R.drawable.ic_avg_speed), "SKIPPING_ROPE_AVERAGE_SPEED", qre.f(R.string.IDS_motiontrack_show_detail_averagespeed), UnitUtil.e(this.f.getExtendDataInt("skipSpeed"), 1, 0), qre.f(R.string.IDS_indoor_skipper_number_minute), qre.f(R.string.IDS_track_rope_average_speed_with_unit));
    }

    private void ed() {
        MotionPath motionPath = this.j;
        if (motionPath == null || njy.e(motionPath.requestJumpDataList()) || jpq.d(this.j.requestJumpDataList()) <= 0) {
            return;
        }
        this.f11204c.add(eb());
    }

    private SportDetailItem.a eb() {
        return new SportDetailItem.a(w(R.drawable.ic_dunk), "BASKETBALL_JUMP_TIME", qre.f(R.string.IDS_aw_version2_average_jump_time_full), UnitUtil.e(jpq.d(this.j.requestJumpDataList()), 1, 0), qre.f(R.string.IDS_msec_unit), "");
    }

    private void w() {
        double extendDataDouble = this.f.getExtendDataDouble("golfSwingTempo");
        if (extendDataDouble != -1.0d) {
            this.f11204c.add(a(extendDataDouble));
        }
    }

    private SportDetailItem.a a(double d) {
        SportDetailItem.a aVar = new SportDetailItem.a(w(R.drawable.ic_rhythm), "AVERAGE_SWING_TEMPO", qre.f(R.string.IDS_hwh_motiontrack_average_swing_rhythm), this.e, "", "");
        aVar.c(UnitUtil.e(d / 100.0d, 1, 1));
        return aVar;
    }

    private void z() {
        double extendDataDouble = this.f.getExtendDataDouble("golfBackSwingTime");
        if (extendDataDouble != -1.0d) {
            this.f11204c.add(d(extendDataDouble));
        }
    }

    private SportDetailItem.a d(double d) {
        return new SportDetailItem.a(w(R.drawable.ic_avg_pace), "SWING_BACK_TIME", qre.f(R.string.IDS_hwh_motiontrack_average_back_swing_time), UnitUtil.e(d / 1000.0d, 1, 2), qre.f(R.string.IDS_second), "");
    }

    private void am() {
        double extendDataDouble = this.f.getExtendDataDouble("golfDownSwingTime");
        if (extendDataDouble != -1.0d) {
            this.f11204c.add(e(extendDataDouble));
        }
    }

    private SportDetailItem.a e(double d) {
        return new SportDetailItem.a(w(R.drawable.ic_avg_pace), "SWING_DOWN_TIME", qre.f(R.string.IDS_hwh_motiontrack_average_down_swing_time), UnitUtil.e(d / 1000.0d, 1, 2), qre.f(R.string.IDS_second), "");
    }

    private void u() {
        double extendDataDouble = this.f.getExtendDataDouble("golfSwingSpeed");
        if (extendDataDouble != -1.0d) {
            this.f11204c.add(b(extendDataDouble));
        }
    }

    private SportDetailItem.a b(double d) {
        double dE;
        Drawable drawableW = w(R.drawable.ic_avg_speed);
        String strF = qre.f(R.string.IDS_aw_version2_meter_per_second);
        if (UnitUtil.f()) {
            dE = UnitUtil.e((d / 100.0d) * 3.5999999046325684d, 3);
            strF = qre.f(R.string.IDS_motiontrack_show_detail_average_speed_imp);
        } else {
            dE = d / 100.0d;
        }
        return new SportDetailItem.a(drawableW, "AVERAGE_SWING_SPEED", qre.f(R.string.IDS_hwh_motiontrack_average_swing_speed), UnitUtil.e(dE, 1, 1), strF, "");
    }

    private void bz() {
        double extendDataDouble = this.f.getExtendDataDouble("golfMaxSwingSpeed");
        if (extendDataDouble != -1.0d) {
            this.f11204c.add(c(extendDataDouble));
        }
    }

    private SportDetailItem.a c(double d) {
        double dE;
        Drawable drawableW = w(R.drawable.ic_avg_speed);
        String string = this.l.getString(R.string.IDS_aw_version2_meter_per_second);
        if (UnitUtil.f()) {
            dE = UnitUtil.e((d / 100.0d) * 3.5999999046325684d, 3);
            string = this.l.getString(R.string.IDS_motiontrack_show_detail_average_speed_imp);
        } else {
            dE = d / 100.0d;
        }
        return new SportDetailItem.a(drawableW, "MAX_SWING_SPEED", qre.f(R.string.IDS_hwh_motiontrack_max_swing_speed), UnitUtil.e(dE, 1, 1), string, "");
    }

    private void cs() {
        int extendDataInt = this.f.getExtendDataInt("skiTripTimes");
        if (extendDataInt == -1) {
            LogUtil.e("Track_TrackDetailItemDrawer", "ski trip times is null.");
        } else {
            this.f11204c.add(k(extendDataInt));
        }
    }

    private SportDetailItem.a k(int i) {
        SportDetailItem.a aVar = new SportDetailItem.a(w(R.drawable.ic_trips), "SKI_LAPS", qre.f(R.string.IDS_motiontrack_show_detail_laps), this.e, "", qre.f(R.string.IDS_motiontrack_show_detail_laps));
        aVar.c(UnitUtil.e(i, 1, 0));
        return aVar;
    }

    private void cu() {
        long jRequestTotalTime = this.f.requestTotalTime();
        if (jRequestTotalTime > 0) {
            this.f11204c.add(b(jRequestTotalTime));
        }
    }

    private SportDetailItem.a b(long j) {
        return new SportDetailItem.a(qre.c(R.drawable.ic_sport_time), "SKI_TIME", qre.f(R.string.IDS_motiontrack_show_detail_ski_time), jpq.e(j), "", qre.f(R.string.IDS_motiontrack_show_detail_ski_time));
    }

    private void cr() {
        int iRequestTotalDistance = this.f.requestTotalDistance();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.f.requestTotalTime());
        if (iRequestTotalDistance <= 0 || seconds <= 0) {
            return;
        }
        this.f11204c.add(a(iRequestTotalDistance, seconds));
    }

    private SportDetailItem.a a(int i, long j) {
        String strF = qre.f(R.string.IDS_motiontrack_show_detail_average_speed);
        String strF2 = qre.f(R.string.IDS_track_average_sky_speed_km_with_unit);
        if (UnitUtil.f()) {
            strF = qre.f(R.string.IDS_motiontrack_show_detail_average_speed_imp);
            strF2 = qre.f(R.string.IDS_track_average_sky_speed_mi_with_unit);
        }
        String strD = jpq.d(i, j);
        return new SportDetailItem.a(qre.c(R.drawable.ic_avg_speed), "AVERAGE_SKI_SPEED", qre.f(R.string.IDS_motiontrack_show_detail_average_ski_speed), strD, strF, strF2);
    }

    private void cb() {
        int extendDataInt = this.f.getExtendDataInt("skiMaxSlopeDegree");
        int extendDataInt2 = this.f.getExtendDataInt("skiMaxSlopePercent");
        if (extendDataInt == -1 || extendDataInt2 == -1) {
            LogUtil.e("Track_TrackDetailItemDrawer", "ski max slope is null.");
        } else {
            this.f11204c.add(a(extendDataInt / 10.0f, extendDataInt2 / 10.0f));
        }
    }

    private void dn() {
        int extendDataInt = this.f.getExtendDataInt("total_action_group");
        if (extendDataInt > 0) {
            this.f11204c.add(t(extendDataInt));
        }
    }

    private SportDetailItem.a t(int i) {
        return new SportDetailItem.a(w(R.drawable.ic_total_action_group), "TOTAL_ACTION_GROUP", qre.f(R.string.IDS_rowing_machine_total_action_group), UnitUtil.e(i, 1, 0), qre.e(R.plurals.sug_share_group, i, ""), qre.f(R.string.IDS_rowing_machine_total_action_group));
    }

    private void cd() {
        int extendDataInt = this.f.getExtendDataInt("peak_weight");
        if (extendDataInt > 0) {
            if (UnitUtil.f()) {
                extendDataInt = (int) Math.round(UnitUtil.h(extendDataInt));
            }
            this.f11204c.add(o(extendDataInt));
        }
    }

    private SportDetailItem.a o(int i) {
        return new SportDetailItem.a(w(R.drawable.ic_peak_weight), "PEAK_WEIGHT", qre.f(R.string.IDS_rowing_machine_peak_weight), UnitUtil.e(i, 1, 0), qre.e(UnitUtil.f() ? R.plurals.IDS_lb_no_space : R.plurals.IDS_rowing_machine_kg, i, ""), UnitUtil.f() ? qre.f(R.string.IDS_track_peak_weight_lb_with_unit) : qre.f(R.string.IDS_track_peak_weight_kg_with_unit));
    }

    private SportDetailItem.a a(float f, float f2) {
        Drawable drawableW = w(R.drawable.ic_slope);
        int iRound = Math.round(f);
        return new SportDetailItem.a(drawableW, "MAX_SLOPE", qre.f(R.string.IDS_motiontrack_show_detail_max_slope), String.format(this.l.getString(R.string.IDS_motiontrack_separator), qre.e(R.plurals.IDS_degree_unit_with_value, iRound, Integer.valueOf(iRound)), UnitUtil.e(f2, 2, 1)), "", qre.f(R.string.IDS_motiontrack_show_detail_max_slope));
    }

    private Drawable w(int i) {
        if (LanguageUtil.ba(this.f11202a)) {
            return qqz.e(this.f11202a, i);
        }
        return this.f11202a.getResources().getDrawable(i);
    }

    public int c() {
        List<SportDetailItem.a> list = this.f11204c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public List<SportDetailItem.a> a() {
        return this.f11204c;
    }
}
