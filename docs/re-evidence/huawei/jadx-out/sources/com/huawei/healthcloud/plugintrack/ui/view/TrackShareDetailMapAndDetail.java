package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.socialshare.api.SocialShareCenterApi;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.model.PostureJudgeBean;
import com.huawei.healthcloud.plugintrack.model.SportDetailChartDataType;
import com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.AverageHangTimeAdvice;
import com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.EversionExcursionAngleAdvice;
import com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.GroundContactTimeAdvice;
import com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.GroundHangTimeRateAdvice;
import com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.GroundImpactAccelerationAdvice;
import com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.GroundImpactLoadRateAdvice;
import com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.GroundShockPeakAdvice;
import com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.GroundTouchdownBalanceAdvice;
import com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.GroundVerticalAmplitudeAdvice;
import com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.GroundVerticalAmplitudeRatioAdvice;
import com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.SwingAngleAdvice;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.view.TotalDataRectView;
import com.huawei.up.model.UserInfomation;
import defpackage.edl;
import defpackage.gzv;
import defpackage.irz;
import defpackage.izn;
import defpackage.jaa;
import defpackage.jbr;
import defpackage.jqp;
import defpackage.jsi;
import defpackage.jst;
import defpackage.jxi;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qqp;
import defpackage.qqs;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class TrackShareDetailMapAndDetail extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f11349a;
    private HealthTextView aa;
    private HealthTextView ab;
    private HealthTextView ac;
    private ImageView ad;
    private HealthTextView ae;
    private HealthTextView af;
    private HealthTextView ag;
    private HealthTextView ah;
    private LinearLayout ai;
    private LinearLayout aj;
    private HealthTextView ak;
    private HealthTextView al;
    private HealthTextView am;
    private ImageView an;
    private HealthTextView ao;
    private HealthTextView ap;
    private ImageView aq;
    private HealthTextView ar;
    private LinearLayout as;
    private HealthTextView at;
    private HealthTextView au;
    private HealthTextView av;
    private LinearLayout aw;
    private HealthTextView ax;
    private HealthTextView ay;
    private ImageView az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TrackShareDetailCustomTitleLayout f11350b;
    private HealthTextView ba;
    private HealthTextView bb;
    private LinearLayout bc;
    private HealthTextView bd;
    private LinearLayout be;
    private ImageView bf;
    private ImageView bg;
    private HealthTextView bh;
    private HealthTextView bi;
    private HealthTextView bj;
    private HealthTextView bk;
    private HealthTextView bl;
    private HealthTextView bm;
    private HealthTextView bn;
    private ImageView bo;
    private ImageView bp;
    private HealthTextView bq;
    private HealthTextView br;
    private RelativeLayout bs;
    private ImageView bt;
    private TrackPaceColorGradientView bu;
    private ImageView bv;
    private ImageView bw;
    private RelativeLayout bx;
    private HealthTextView by;
    private int bz;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DetailItemContainer f11351c;
    private LinearLayout ca;
    private LinearLayout cb;
    private TotalDataRectView cc;
    private LinearLayout cd;
    private HealthTextView ce;
    private LinearLayout cf;
    private LinearLayout cg;
    private int ch;
    private LinearLayout ci;
    private HealthTextView cj;
    private ImageView ck;
    private LinearLayout cl;
    private HealthTextView cm;
    private HealthTextView cn;
    private HealthTextView co;
    private LinearLayout cp;
    private HealthTextView cq;
    private LinearLayout cr;
    private HealthTextView cs;
    private HealthTextView ct;
    private HealthTextView cu;
    private ImageView cv;
    private ImageView cw;
    private LinearLayout cx;
    private HealthTextView cy;
    private HealthTextView cz;
    private Context d;
    private HealthTextView da;
    private HealthTextView db;
    private HealthTextView dc;
    private HealthTextView dd;
    private HealthTextView de;
    private HealthTextView df;
    private RelativeLayout dg;
    private WeatherInfoView dh;
    private RelativeLayout di;
    private HealthTextView dj;
    private BasketballScoreView e;
    private ImageView f;
    private LinearLayout g;
    private DynamicTimelineView h;
    private LinearLayout i;
    private HealthTextView j;
    private HealthTextView k;
    private HealthTextView l;
    private ImageView m;
    private HealthTextView n;
    private HealthTextView o;
    private HealthTextView p;
    private HealthTextView q;
    private HealthTextView r;
    private HealthTextView s;
    private HealthTextView t;
    private HealthTextView u;
    private ImageView v;
    private HealthTextView w;
    private HealthTextView x;
    private HealthTextView y;
    private HealthTextView z;

    public TrackShareDetailMapAndDetail(Context context, int i) {
        super(context);
        this.d = null;
        this.bw = null;
        this.bo = null;
        this.bv = null;
        this.dd = null;
        this.dj = null;
        this.f11350b = null;
        this.f11351c = null;
        this.bt = null;
        this.bu = null;
        this.de = null;
        this.db = null;
        this.i = null;
        this.f11349a = null;
        this.bs = null;
        this.ch = 100;
        c(context, i);
    }

    public TrackShareDetailMapAndDetail(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = null;
        this.bw = null;
        this.bo = null;
        this.bv = null;
        this.dd = null;
        this.dj = null;
        this.f11350b = null;
        this.f11351c = null;
        this.bt = null;
        this.bu = null;
        this.de = null;
        this.db = null;
        this.i = null;
        this.f11349a = null;
        this.bs = null;
        this.ch = 100;
        c(context, 100);
    }

    private void c(Context context, int i) {
        this.d = context;
        this.ch = i;
        View.inflate(context, R.layout.track_share_map_and_detail_view_layout, this);
        this.i = (LinearLayout) findViewById(R.id.layout_title_and_detail);
        this.f11349a = (LinearLayout) findViewById(R.id.layout_title_and_detail_child);
        this.dh = (WeatherInfoView) findViewById(R.id.weather_info_view);
        this.bs = (RelativeLayout) findViewById(R.id.layout_top_map_device);
        this.by = (HealthTextView) findViewById(R.id.map_type);
        this.bx = (RelativeLayout) findViewById(R.id.map_type_group);
        this.dg = (RelativeLayout) findViewById(R.id.track_title_above);
        this.di = (RelativeLayout) findViewById(R.id.track_title_below);
        this.bw = (ImageView) findViewById(R.id.track_share_map);
        this.bo = (ImageView) findViewById(R.id.img_track_device_name);
        this.dd = (HealthTextView) findViewById(R.id.txt_track_device_name);
        this.bt = (ImageView) findViewById(R.id.img_track_share_user_img);
        this.dj = (HealthTextView) findViewById(R.id.track_share_detail_title_usrname);
        this.bu = (TrackPaceColorGradientView) findViewById(R.id.img_track_share_pace_gradient);
        if (LanguageUtil.ba(this.d)) {
            this.bu.setRotationY(180.0f);
        }
        this.f = (ImageView) findViewById(R.id.divide_line);
        this.de = (HealthTextView) findViewById(R.id.txt_track_share_map_max_pace_value);
        this.db = (HealthTextView) findViewById(R.id.txt_track_share_map_min_pace_value);
        this.f11350b = (TrackShareDetailCustomTitleLayout) findViewById(R.id.track_detail_title);
        this.f11351c = (DetailItemContainer) findViewById(R.id.track_detail_container);
        this.bv = (ImageView) findViewById(R.id.img_track_share_map_gradient);
        t();
        this.ci = (LinearLayout) findViewById(R.id.track_detail_show_swim);
        this.cl = (LinearLayout) findViewById(R.id.track_detail_swim_avg_pace_layout);
        this.cr = (LinearLayout) findViewById(R.id.track_detail_swim_avg_stroke_rate_layout);
        this.cp = (LinearLayout) findViewById(R.id.track_detail_swim_avg_swolf_layout);
        this.cz = (HealthTextView) findViewById(R.id.track_detail_show_swim_title_name);
        this.cj = (HealthTextView) findViewById(R.id.track_detail_swim_avg_pace_name);
        this.cq = (HealthTextView) findViewById(R.id.track_detail_swim_avg_pace);
        this.co = (HealthTextView) findViewById(R.id.track_detail_swim_avg_pace_unit);
        this.ck = (ImageView) findViewById(R.id.track_detail_swim_avg_pace_line);
        this.cs = (HealthTextView) findViewById(R.id.track_detail_swim_avg_stroke_rate_name);
        this.ct = (HealthTextView) findViewById(R.id.track_detail_swim_avg_stroke_rate);
        this.cu = (HealthTextView) findViewById(R.id.track_detail_swim_avg_stroke_rate_unit);
        this.cv = (ImageView) findViewById(R.id.track_detail_swim_avg_stroke_rate_line);
        this.cn = (HealthTextView) findViewById(R.id.track_detail_swim_avg_swolf_name);
        this.cm = (HealthTextView) findViewById(R.id.track_detail_swim_avg_swolf);
        this.e = (BasketballScoreView) findViewById(R.id.basketball_radar_view);
        this.h = (DynamicTimelineView) findViewById(R.id.share_ski_dynamic_timeline);
        p();
        v();
        y();
        q();
    }

    private void aa() {
        LogUtil.a("TrackShareDetailMapAndDetail", "queryMemberInfo");
        UserMemberInfo userMemberInfoA = irz.a();
        if (userMemberInfoA == null) {
            LogUtil.j("TrackShareDetailMapAndDetail", "userMemberInfo is null");
            return;
        }
        if (userMemberInfoA.getMemberFlag() != 1) {
            LogUtil.j("TrackShareDetailMapAndDetail", "TradeViewApi memberInfo == null or != VipConstants.MEMBER_FLAG_VIP");
            return;
        }
        if (irz.d(userMemberInfoA)) {
            LogUtil.a("TrackShareDetailMapAndDetail", "isVipExpired");
            return;
        }
        HealthImageView healthImageView = (HealthImageView) findViewById(R.id.member_card_vip_icon);
        if (healthImageView == null) {
            return;
        }
        healthImageView.setVisibility(0);
    }

    private void q() {
        int iE = jaa.e(this.d);
        this.bz = iE;
        if (iE == 1) {
            this.by.setVisibility(0);
            this.by.setText(this.d.getResources().getString(R.string.IDS_hw_show_data_tarck_map_type_setting_gaode));
        } else if (iE == 2) {
            this.by.setVisibility(0);
            this.by.setText(this.d.getResources().getString(R.string.IDS_hw_show_data_tarck_map_type_setting_google));
        } else if (iE == 3) {
            this.by.setVisibility(0);
            this.by.setText(this.d.getResources().getString(R.string.IDS_hw_petal_maps));
        } else {
            this.by.setVisibility(0);
        }
    }

    private void y() {
        if (jbr.c().a()) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.i.getLayoutParams();
        layoutParams.setMargins(this.d.getResources().getDimensionPixelOffset(R.dimen.hw_show_public_margin_8dp), this.d.getResources().getDimensionPixelOffset(R.dimen.defaultPaddingBottomFixed), this.d.getResources().getDimensionPixelOffset(R.dimen.hw_show_public_margin_8dp), 0);
        this.i.setLayoutParams(layoutParams);
    }

    public void i() {
        if (jbr.c().a()) {
            return;
        }
        this.dg.setVisibility(8);
        this.di.setVisibility(8);
    }

    private void p() {
        SocialShareCenterApi socialShareCenterApi = (SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class);
        if (!socialShareCenterApi.isShowUserInfo()) {
            l();
            return;
        }
        UserInfomation userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
        String shareNickName = socialShareCenterApi.getShareNickName();
        this.dj.setText(shareNickName);
        b(userInfo, shareNickName);
        aa();
    }

    private void b(UserInfomation userInfomation, String str) {
        if (Utils.o() && TextUtils.isEmpty(str)) {
            this.bt.setVisibility(8);
            return;
        }
        String picPath = userInfomation != null ? userInfomation.getPicPath() : null;
        if (!TextUtils.isEmpty(picPath)) {
            Bitmap bitmapA = qqf.a(this.d, picPath);
            if (bitmapA != null) {
                setUserImg(bitmapA);
                return;
            } else {
                LogUtil.j("TrackShareDetailMapAndDetail", "handleWhenGetUserInfoSuccess()bmp != null ");
                return;
            }
        }
        LogUtil.j("TrackShareDetailMapAndDetail", "handleWhenGetUserInfoSuccess()! headImgPath is null! ");
    }

    private void l() {
        this.dj.setVisibility(4);
        this.bt.setVisibility(8);
    }

    private void t() {
        this.ce = (HealthTextView) findViewById(R.id.track_detail_show_running_posture_title_name);
        m();
        o();
        k();
        r();
        w();
        ad();
        ab();
        u();
        s();
        n();
        x();
        ac();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.track_detail_running_posture_strike_pattern);
        this.cf = linearLayout;
        this.r = (HealthTextView) linearLayout.findViewById(R.id.track_detail_posture_item_name);
        this.cc = (TotalDataRectView) this.cf.findViewById(R.id.proportion_bar);
        this.o = (HealthTextView) this.cf.findViewById(R.id.running_posture_avg_foot_strike_pattern_fore_name);
        this.q = (HealthTextView) this.cf.findViewById(R.id.running_posture_avg_foot_strike_pattern_fore_value);
        this.s = (HealthTextView) this.cf.findViewById(R.id.running_posture_avg_foot_strike_pattern_whole_name);
        this.x = (HealthTextView) this.cf.findViewById(R.id.running_posture_avg_foot_strike_pattern_whole_value);
        this.p = (HealthTextView) this.cf.findViewById(R.id.running_posture_avg_foot_strike_pattern_hind_name);
        this.t = (HealthTextView) this.cf.findViewById(R.id.running_posture_avg_foot_strike_pattern_hind_value);
        this.cf.findViewById(R.id.track_detail_posture_item_more_arrow).setVisibility(8);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.track_show_running_posture);
        this.cd = linearLayout2;
        linearLayout2.setPadding(-16, qrs.d(this.d, 13.8f), -16, qrs.d(this.d, 16.0f));
    }

    private void x() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.track_detail_running_posture_swing_angle);
        this.cx = linearLayout;
        HealthTextView healthTextView = (HealthTextView) linearLayout.findViewById(R.id.track_detail_posture_item_name);
        this.da = healthTextView;
        healthTextView.setText(R.string.IDS_running_posture_avg_swing_angle);
        this.dc = (HealthTextView) this.cx.findViewById(R.id.track_detail_posture_item_value);
        this.cy = (HealthTextView) this.cx.findViewById(R.id.track_detail_posture_item_level);
        this.df = (HealthTextView) this.cx.findViewById(R.id.track_detail_posture_item_unit);
        this.cx.findViewById(R.id.track_detail_posture_item_more_arrow).setVisibility(8);
        this.cw = (ImageView) findViewById(R.id.track_detail_running_posture_swing_angle_line);
        d(this.dc, this.da);
    }

    private void n() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.track_detail_running_posture_eversion_excursion);
        this.g = linearLayout;
        HealthTextView healthTextView = (HealthTextView) linearLayout.findViewById(R.id.track_detail_posture_item_name);
        this.l = healthTextView;
        healthTextView.setText(R.string.IDS_running_posture_avg_eversion_excursion);
        this.k = (HealthTextView) this.g.findViewById(R.id.track_detail_posture_item_value);
        this.j = (HealthTextView) this.g.findViewById(R.id.track_detail_posture_item_level);
        this.n = (HealthTextView) this.g.findViewById(R.id.track_detail_posture_item_unit);
        this.g.findViewById(R.id.track_detail_posture_item_more_arrow).setVisibility(8);
        this.m = (ImageView) findViewById(R.id.track_detail_running_posture_eversion_excursion_line);
        d(this.k, this.l);
    }

    private void r() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.track_detail_running_posture_ground_impact_acceleration);
        this.ai = linearLayout;
        HealthTextView healthTextView = (HealthTextView) linearLayout.findViewById(R.id.track_detail_posture_item_name);
        this.ae = healthTextView;
        healthTextView.setText(R.string.IDS_running_posture_avg_ground_impact_acceleration);
        this.al = (HealthTextView) this.ai.findViewById(R.id.track_detail_posture_item_value);
        this.ah = (HealthTextView) this.ai.findViewById(R.id.track_detail_posture_item_level);
        HealthTextView healthTextView2 = (HealthTextView) this.ai.findViewById(R.id.track_detail_posture_item_unit);
        this.af = healthTextView2;
        healthTextView2.setText(R.string.IDS_gravity_unit);
        this.ai.findViewById(R.id.track_detail_posture_item_more_arrow).setVisibility(8);
        d(this.al, this.ae);
    }

    private void w() {
        this.aw = (LinearLayout) findViewById(R.id.track_detail_running_posture_ground_touchdown_balance);
        this.az = (ImageView) findViewById(R.id.track_detail_running_posture_ground_touchdown_balance_line);
        HealthTextView healthTextView = (HealthTextView) this.aw.findViewById(R.id.track_detail_posture_item_name);
        this.ay = healthTextView;
        healthTextView.setText(R.string.IDS_bolt_balance_average_left_right_touches);
        this.bb = (HealthTextView) this.aw.findViewById(R.id.track_detail_posture_item_value);
        this.ax = (HealthTextView) this.aw.findViewById(R.id.track_detail_posture_item_level);
        this.aw.findViewById(R.id.track_detail_posture_item_more_arrow).setVisibility(8);
        d(this.bb, this.ay);
    }

    private void ad() {
        this.bc = (LinearLayout) findViewById(R.id.track_detail_running_posture_ground_vertical_amplitude);
        this.bg = (ImageView) findViewById(R.id.track_detail_running_posture_ground_vertical_amplitude_line);
        HealthTextView healthTextView = (HealthTextView) this.bc.findViewById(R.id.track_detail_posture_item_name);
        this.bd = healthTextView;
        healthTextView.setText(R.string.IDS_bolt_average_vertical_amplitude);
        this.bm = (HealthTextView) this.bc.findViewById(R.id.track_detail_posture_item_value);
        this.ba = (HealthTextView) this.bc.findViewById(R.id.track_detail_posture_item_level);
        this.bi = (HealthTextView) this.bc.findViewById(R.id.track_detail_posture_item_unit);
        if (!UnitUtil.f()) {
            this.bi.setText(R.string.IDS_cm);
        } else {
            this.bi.setText(R.string.IDS_ins);
        }
        this.bc.findViewById(R.id.track_detail_posture_item_more_arrow).setVisibility(8);
        d(this.bm, this.bd);
    }

    private void ab() {
        this.be = (LinearLayout) findViewById(R.id.track_detail_running_posture_ground_vertical_amplitude_ratio);
        this.bf = (ImageView) findViewById(R.id.track_detail_running_posture_ground_vertical_amplitude_ratio_line);
        HealthTextView healthTextView = (HealthTextView) this.be.findViewById(R.id.track_detail_posture_item_name);
        this.bj = healthTextView;
        healthTextView.setText(R.string.IDS_bolt_average_vertical_amplitude_rate);
        this.bk = (HealthTextView) this.be.findViewById(R.id.track_detail_posture_item_value);
        this.bh = (HealthTextView) this.be.findViewById(R.id.track_detail_posture_item_level);
        this.be.findViewById(R.id.track_detail_posture_item_more_arrow).setVisibility(8);
        d(this.bk, this.bj);
    }

    private void u() {
        this.as = (LinearLayout) findViewById(R.id.track_detail_running_posture_ground_shock_peak);
        this.aq = (ImageView) findViewById(R.id.track_detail_running_posture_ground_shock_peak_line);
        HealthTextView healthTextView = (HealthTextView) this.as.findViewById(R.id.track_detail_posture_item_name);
        this.av = healthTextView;
        healthTextView.setText(R.string.IDS_bolt_average_peak_impact);
        this.au = (HealthTextView) this.as.findViewById(R.id.track_detail_posture_item_value);
        this.ar = (HealthTextView) this.as.findViewById(R.id.track_detail_posture_item_level);
        HealthTextView healthTextView2 = (HealthTextView) this.as.findViewById(R.id.track_detail_posture_item_unit);
        this.at = healthTextView2;
        healthTextView2.setText(R.string.IDS_bolt_shock_peak_unit);
        this.as.findViewById(R.id.track_detail_posture_item_more_arrow).setVisibility(8);
        d(this.au, this.av);
    }

    private void s() {
        this.aj = (LinearLayout) findViewById(R.id.track_detail_running_posture_ground_impact_load_rate);
        this.an = (ImageView) findViewById(R.id.track_detail_running_posture_ground_impact_load_rate_line);
        HealthTextView healthTextView = (HealthTextView) this.aj.findViewById(R.id.track_detail_posture_item_name);
        this.am = healthTextView;
        healthTextView.setText(R.string.IDS_bolt_average_peak_impact_rate);
        this.ao = (HealthTextView) this.aj.findViewById(R.id.track_detail_posture_item_value);
        this.ak = (HealthTextView) this.aj.findViewById(R.id.track_detail_posture_item_level);
        HealthTextView healthTextView2 = (HealthTextView) this.aj.findViewById(R.id.track_detail_posture_item_unit);
        this.ap = healthTextView2;
        healthTextView2.setAutoTextInfo(9, 1, 2);
        this.ap.setText(this.d.getResources().getQuantityString(R.plurals.IDS_bolt_average_peak_impact_unit, 1, ""));
        this.aj.findViewById(R.id.track_detail_posture_item_more_arrow).setVisibility(8);
        d(this.ao, this.am);
    }

    private void m() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.track_detail_running_posture_ground_contact_time);
        this.cb = linearLayout;
        HealthTextView healthTextView = (HealthTextView) linearLayout.findViewById(R.id.track_detail_posture_item_name);
        this.u = healthTextView;
        healthTextView.setText(R.string.IDS_running_posture_avg_ground_contact_time);
        this.z = (HealthTextView) this.cb.findViewById(R.id.track_detail_posture_item_value);
        this.y = (HealthTextView) this.cb.findViewById(R.id.track_detail_posture_item_level);
        HealthTextView healthTextView2 = (HealthTextView) this.cb.findViewById(R.id.track_detail_posture_item_unit);
        this.w = healthTextView2;
        healthTextView2.setText(R.string.IDS_msec_unit);
        this.cb.findViewById(R.id.track_detail_posture_item_more_arrow).setVisibility(8);
        this.v = (ImageView) findViewById(R.id.track_detail_running_posture_ground_contact_time_line);
        d(this.z, this.u);
    }

    private void o() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.track_detail_running_posture_hang_time);
        this.cg = linearLayout;
        HealthTextView healthTextView = (HealthTextView) linearLayout.findViewById(R.id.track_detail_posture_item_name);
        this.br = healthTextView;
        healthTextView.setText(R.string.IDS_aw_version2_average_jump_time_full);
        this.bq = (HealthTextView) this.cg.findViewById(R.id.track_detail_posture_item_value);
        this.bl = (HealthTextView) this.cg.findViewById(R.id.track_detail_posture_item_level);
        HealthTextView healthTextView2 = (HealthTextView) this.cg.findViewById(R.id.track_detail_posture_item_unit);
        this.bn = healthTextView2;
        healthTextView2.setText(R.string.IDS_msec_unit);
        this.cg.findViewById(R.id.track_detail_posture_item_more_arrow).setVisibility(8);
        this.bp = (ImageView) findViewById(R.id.track_detail_running_posture_hang_time_line);
        d(this.bq, this.br);
    }

    private void k() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.track_detail_running_posture_ground_hang_time_rate);
        this.ca = linearLayout;
        HealthTextView healthTextView = (HealthTextView) linearLayout.findViewById(R.id.track_detail_posture_item_name);
        this.aa = healthTextView;
        healthTextView.setText(R.string.IDS_motiontrack__average_ground_to_air_ratio);
        this.ag = (HealthTextView) this.ca.findViewById(R.id.track_detail_posture_item_value);
        this.ab = (HealthTextView) this.ca.findViewById(R.id.track_detail_posture_item_level);
        HealthTextView healthTextView2 = (HealthTextView) this.ca.findViewById(R.id.track_detail_posture_item_unit);
        this.ac = healthTextView2;
        healthTextView2.setVisibility(8);
        this.ca.findViewById(R.id.track_detail_posture_item_more_arrow).setVisibility(8);
        this.ad = (ImageView) findViewById(R.id.track_detail_running_posture_ground_hang_time_rate_line);
        d(this.ag, this.aa);
    }

    private void d(final HealthTextView healthTextView, final HealthTextView healthTextView2) {
        if (qrs.t()) {
            if (healthTextView2 != null && healthTextView != null && (healthTextView.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
                healthTextView2.post(new Runnable() { // from class: jsq
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f38980a.b(healthTextView2, healthTextView);
                    }
                });
            } else {
                LogUtil.e("TrackShareDetailMapAndDetail", "itemNameView or itemValueView is null, ", "or itemValueVeiw.LayoutParams isn't the instance of LinearLauout.LayoutParams");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(HealthTextView healthTextView, HealthTextView healthTextView2) {
        int width = healthTextView.getWidth();
        HealthColumnSystem healthColumnSystem = new HealthColumnSystem(this.d, 0);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) healthTextView2.getLayoutParams();
        if (qrs.af(this.d)) {
            int iA = (((int) healthColumnSystem.a(2)) + qqp.b(this.d)) - width;
            if (iA < 0) {
                iA = qrs.d(this.d, 12.0f);
            }
            layoutParams.setMarginStart(iA);
        } else {
            layoutParams.setMarginStart(qrs.d(this.d, 12.0f));
        }
        healthTextView2.setLayoutParams(layoutParams);
    }

    private void a(boolean z, LinearLayout linearLayout) {
        if (linearLayout == null) {
            return;
        }
        HealthTextView healthTextView = (HealthTextView) linearLayout.findViewById(R.id.track_detail_posture_item_level);
        if (z) {
            healthTextView.setMaxWidth(qrs.d(this.d, 242.0f));
        } else {
            healthTextView.setMaxWidth(qrs.d(this.d, 86.0f));
        }
    }

    private void ac() {
        boolean zAf = qrs.af(getContext());
        a(zAf, this.cb);
        a(zAf, this.ai);
        a(zAf, this.g);
        a(zAf, this.cx);
        a(zAf, this.cg);
        a(zAf, this.ca);
    }

    private void v() {
        if (this.d == null) {
            return;
        }
        if (this.ch == 101) {
            setTextColor(getResources().getColor(R.color.color_normal_titlebar_title));
            this.cf.setBackgroundColor(this.d.getResources().getColor(R.color.hw_health_group_gray_color));
            this.cc.setPaintBackgroundColor(false, this.d.getResources().getColor(R.color.common_color_black));
        } else {
            setTextColor(getResources().getColor(R.color.home_track_show_text_black_color));
            this.cf.setBackgroundColor(this.d.getResources().getColor(R.color.aw70_run_posture_background_color));
        }
    }

    public void setTextColor(int i) {
        this.f11350b.setTextColor(i);
        this.f11351c.setTextColor(i);
        setRunningPostureColor(i);
    }

    public void setImgMap(final Bitmap bitmap, final int i, final boolean z) {
        this.bw.post(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.ui.view.TrackShareDetailMapAndDetail.2
            @Override // java.lang.Runnable
            public void run() {
                Matrix matrix = new Matrix();
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                float width2 = TrackShareDetailMapAndDetail.this.bw.getWidth();
                float f = width;
                float f2 = width2 / f;
                float height2 = TrackShareDetailMapAndDetail.this.bw.getHeight();
                float f3 = height;
                float f4 = height2 / f3;
                if (f2 > f4) {
                    matrix.setScale(f2, f2);
                    if (!z) {
                        matrix.postTranslate(0.0f, -(((f3 * f2) - height2) / 4.0f));
                    }
                } else {
                    matrix.setScale(f4, f4);
                    if (!z) {
                        matrix.postTranslate(-(((f * f4) - width2) / 2.0f), 0.0f);
                    }
                }
                TrackShareDetailMapAndDetail.this.bw.setImageBitmap(bitmap);
                if (i == 271) {
                    TrackShareDetailMapAndDetail.this.bw.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    TrackShareDetailMapAndDetail trackShareDetailMapAndDetail = TrackShareDetailMapAndDetail.this;
                    trackShareDetailMapAndDetail.setMapLayoutMarginBottom(-qrs.d(trackShareDetailMapAndDetail.d, 100.0f));
                } else {
                    TrackShareDetailMapAndDetail.this.bw.setImageMatrix(matrix);
                }
                if (TrackShareDetailMapAndDetail.this.bv.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) TrackShareDetailMapAndDetail.this.bv.getLayoutParams();
                    layoutParams.height = TrackShareDetailMapAndDetail.this.bw.getHeight();
                    TrackShareDetailMapAndDetail.this.bv.setLayoutParams(layoutParams);
                }
            }
        });
    }

    public void g() {
        this.bw.setVisibility(8);
        this.by.setVisibility(8);
        this.bx.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMapLayoutMarginBottom(int i) {
        if (this.bs.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.bs.getLayoutParams();
            layoutParams.setMargins(0, 0, 0, i);
            this.bs.setLayoutParams(layoutParams);
        }
    }

    public void setImgDevice(int i) {
        this.bo.setBackgroundResource(i);
    }

    public int e(int i) {
        edl pluginInfoByHiType = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByHiType(i);
        if (pluginInfoByHiType == null || pluginInfoByHiType.i() == null || TextUtils.isEmpty(pluginInfoByHiType.i().bn())) {
            return 1;
        }
        this.bo.setBackground(new BitmapDrawable(((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).loadImageByImageName(pluginInfoByHiType, pluginInfoByHiType.i().bn())));
        return 0;
    }

    public void setTextDevice(String str) {
        this.dd.setText(str);
    }

    public void setTextDevice(int i, String str, int i2) {
        Context context = this.d;
        if (context == null) {
            return;
        }
        if (i != 0) {
            this.dd.setCompoundDrawablesRelativeWithIntrinsicBounds(context.getResources().getDrawable(i), (Drawable) null, (Drawable) null, (Drawable) null);
            this.dd.setCompoundDrawablePadding(this.d.getResources().getDimensionPixelSize(R.dimen.titlebar_number_text_margin));
        }
        this.dd.setText(str);
        if (i2 == 271) {
            if (!LanguageUtil.l(this.d) || Utils.o()) {
                this.dd.setTextColor(getResources().getColor(R.color.textColorPrimary));
                this.dj.setTextColor(getResources().getColor(R.color.textColorPrimary));
            } else {
                this.dd.setTextColor(getResources().getColor(R.color.color_normal_titlebar_title));
                this.dj.setTextColor(getResources().getColor(R.color.color_normal_titlebar_title));
            }
        }
    }

    public void setImgDeviceVisibility(int i) {
        this.bo.setVisibility(i);
    }

    public void setTextDeviceVisibility(int i) {
        this.dd.setVisibility(i);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        this.f11349a.setBackgroundResource(i);
        this.cd.setBackgroundResource(i);
        this.ci.setBackgroundResource(i);
    }

    public DetailItemContainer b() {
        return this.f11351c;
    }

    public TrackShareDetailCustomTitleLayout d() {
        return this.f11350b;
    }

    public void setUserImg(Bitmap bitmap) {
        this.bt.setImageBitmap(bitmap);
    }

    public void setShowPaceVisibility(int i) {
        this.de.setVisibility(i);
        this.db.setVisibility(i);
        this.bu.setVisibility(i);
    }

    public void setMaxAndMinPaceVisibility(int i) {
        this.de.setVisibility(i);
        this.db.setVisibility(i);
    }

    public void setImgPaceGradientColors(List<Integer> list) {
        if (njy.e(list)) {
            return;
        }
        this.bu.setColors(list);
        this.de.setTextColor(list.get(list.size() - 1).intValue());
        this.db.setTextColor(list.get(0).intValue());
    }

    public void setMaxAndMinPace(String str, String str2) {
        this.de.setText(((Object) this.de.getText()) + " " + str2);
        this.db.setText(((Object) this.db.getText()) + " " + str);
    }

    public void setDivideLineVisibility(int i) {
        int i2 = this.ch;
        if (i2 == 101) {
            this.f.setBackgroundColor(getResources().getColor(R.color.color_normal_titlebar_title));
        } else if (i2 == 100) {
            this.f.setBackgroundColor(getResources().getColor(R.color.home_track_show_text_black_color));
        } else {
            LogUtil.a("TrackShareDetailMapAndDetail", "don't deal that style", Integer.valueOf(i2));
        }
        this.f.setVisibility(i);
    }

    public void setLayoutStyle(int i, boolean z, int i2) {
        Context context = this.d;
        if (context == null) {
            return;
        }
        Resources resources = context.getResources();
        if (this.bs.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.bs.getLayoutParams();
            if (i == 101) {
                a(z, layoutParams);
            } else if (i == 102) {
                c(z, resources, layoutParams);
            } else {
                d(z, resources, layoutParams, i2);
            }
        }
    }

    private void d(boolean z, Resources resources, RelativeLayout.LayoutParams layoutParams, int i) {
        this.bv.setVisibility(8);
        if (z) {
            z();
            if (i == 271) {
                layoutParams.bottomMargin = -qrs.d(this.d, 105.0f);
            } else {
                layoutParams.bottomMargin = resources.getDimensionPixelOffset(R.dimen.hw_health_size_minus_45dp);
            }
            this.bs.setLayoutParams(layoutParams);
            if (qqs.e(this.d)) {
                return;
            }
            this.bv.setVisibility(0);
            this.bv.setBackgroundResource(R.drawable.bg_cover_white);
            return;
        }
        ah();
        layoutParams.bottomMargin = 0;
        this.bs.setLayoutParams(layoutParams);
        this.bv.setVisibility(8);
    }

    private void c(boolean z, Resources resources, RelativeLayout.LayoutParams layoutParams) {
        if (z) {
            z();
            layoutParams.bottomMargin = resources.getDimensionPixelOffset(R.dimen.hw_health_size_minus_45dp);
            this.bs.setLayoutParams(layoutParams);
            this.bv.setVisibility(0);
            this.bv.setBackgroundResource(R.drawable.track_share_gray_bg_cover);
            return;
        }
        ah();
        layoutParams.bottomMargin = 0;
        this.bs.setLayoutParams(layoutParams);
        this.bv.setVisibility(8);
    }

    private void a(boolean z, RelativeLayout.LayoutParams layoutParams) {
        z();
        if (z) {
            this.bv.setVisibility(0);
            this.bv.setBackgroundResource(R.drawable.track_share_gray_bg_cover);
        } else {
            layoutParams.bottomMargin = qrs.d(this.d, -60.0f);
            this.bs.setLayoutParams(layoutParams);
            this.bv.setVisibility(8);
        }
    }

    private void z() {
        Resources resources = this.d.getResources();
        if (this.dd.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.dd.getLayoutParams();
            layoutParams.removeRule(20);
            layoutParams.addRule(10);
            layoutParams.topMargin = resources.getDimensionPixelSize(R.dimen.hw_show_font_size_32);
            this.dd.setLayoutParams(layoutParams);
        }
    }

    private void ah() {
        Resources resources = this.d.getResources();
        if (this.dd.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.dd.getLayoutParams();
            layoutParams.removeRule(10);
            layoutParams.addRule(20);
            layoutParams.topMargin = resources.getDimensionPixelSize(R.dimen.activity_vertical_margin);
            layoutParams.bottomMargin = resources.getDimensionPixelSize(R.dimen.activity_vertical_margin);
            layoutParams.setMarginStart(resources.getDimensionPixelSize(R.dimen.hw_show_devide_line_margin_right_left));
            this.dd.setLayoutParams(layoutParams);
        }
    }

    public void a(MotionPathSimplify motionPathSimplify) {
        if (motionPathSimplify == null || motionPathSimplify.requestExtendDataMap() == null) {
            LogUtil.e("TrackShareDetailMapAndDetail", "initWeatherInfoView motionPathSimplify is null, return");
            this.dh.setVisibility(8);
            return;
        }
        boolean zC = jxi.c(motionPathSimplify);
        LogUtil.a("TrackShareDetailMapAndDetail", "initWeatherInfoView hashWeatherInfo:" + zC);
        if (zC) {
            this.dh.setVisibility(0);
            this.dh.a(motionPathSimplify);
        } else {
            this.dh.setVisibility(8);
        }
    }

    public void b(MotionPathSimplify motionPathSimplify) {
        if (motionPathSimplify == null) {
            return;
        }
        int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(motionPathSimplify.requestTotalTime());
        int extendDataInt = motionPathSimplify.getExtendDataInt("skiCableTime", -1);
        int extendDataInt2 = motionPathSimplify.getExtendDataInt("skiFreeTime", -1);
        if (seconds <= 0 || extendDataInt <= 0) {
            ReleaseLogUtil.d("TrackShareDetailMapAndDetail", "initSkiTimeline skiTime or skiCableTime invalid");
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new jst(qre.a(R.string.IDS_track_slide_format, UnitUtil.e(seconds)), Color.parseColor("#FB6522"), seconds));
        arrayList.add(new jst(qre.a(R.string.IDS_track_cable_format, UnitUtil.e(extendDataInt)), Color.parseColor("#13B2E7"), extendDataInt));
        if (extendDataInt2 > 0) {
            arrayList.add(new jst(qre.a(R.string.IDS_track_rest_format, UnitUtil.e(extendDataInt2)), Color.parseColor("#BCC4CF"), extendDataInt2));
        }
        this.h.setSegments(arrayList);
        this.h.setVisibility(0);
    }

    public void c(jsi jsiVar, List<PostureJudgeBean> list) {
        if (jsiVar == null || this.d == null) {
            LogUtil.j("TrackShareDetailMapAndDetail", "saveRunningPostureData invalid params.");
            return;
        }
        jqp jqpVarD = jbr.c().d();
        if (jqpVarD == null || jqpVarD.d() == null) {
            LogUtil.j("TrackShareDetailMapAndDetail", "saveRunningPostureData invalid detail data manager");
            return;
        }
        if (gzv.a(jqpVarD.d())) {
            this.cd.setVisibility(8);
            return;
        }
        this.cd.setVisibility(0);
        int iRound = Math.round(jqpVarD.d().requestAvgPace());
        int iRequestAverageHangTime = jqpVarD.d().requestAverageHangTime();
        float fRequestGroundHangTimeRate = jqpVarD.d().requestGroundHangTimeRate();
        c(iRequestAverageHangTime, iRound, list);
        b(fRequestGroundHangTimeRate, iRound, list);
        c(jsiVar, iRound, list);
        setGcTimeBalancePosture(jsiVar);
        setVerticalOscillationPosture(jsiVar);
        setVerticalRatioPosture(jsiVar);
        setImpactPeakPosture(jsiVar);
        setAvergeVerticalImpactRatePosture(jsiVar);
        b(jsiVar);
        c(jsiVar);
        setPatternStepLayout(jsiVar);
        setAvgGroundImpactAcceleration(jsiVar);
    }

    private void c(jsi jsiVar, int i, List<PostureJudgeBean> list) {
        if (jsiVar.a() <= 0) {
            this.cb.setVisibility(8);
            this.v.setVisibility(8);
        } else {
            GroundContactTimeAdvice groundContactTimeAdvice = new GroundContactTimeAdvice(jsiVar.a(), i, list, SportDetailChartDataType.GROUND_CONTACT_TIME);
            this.z.setText(UnitUtil.e(jsiVar.a(), 1, 0));
            this.y.setText(groundContactTimeAdvice.acquireLevelShortTip());
            this.y.setTextColor(getResources().getColor(izn.c(groundContactTimeAdvice.acquireLevel())));
        }
    }

    private void setPatternStepLayout(jsi jsiVar) {
        if (jsiVar.l() <= 0) {
            this.cf.setVisibility(8);
            return;
        }
        String strE = UnitUtil.e(jsiVar.d(), 2, 0);
        String strE2 = UnitUtil.e(jsiVar.i(), 2, 0);
        this.cc.setViewData(jsiVar.d(), jsiVar.i(), jsiVar.g());
        String strE3 = UnitUtil.e(jsiVar.g(), 2, 0);
        this.q.setText(UnitUtil.b(this.d, "\\d+.\\d+|\\d+", strE, R.style.strike_pattern_text_result_k, R.style.strike_pattern_text_result_n));
        this.x.setText(UnitUtil.b(this.d, "\\d+.\\d+|\\d+", strE2, R.style.strike_pattern_text_result_k, R.style.strike_pattern_text_result_n));
        this.t.setText(UnitUtil.b(this.d, "\\d+.\\d+|\\d+", strE3, R.style.strike_pattern_text_result_k, R.style.strike_pattern_text_result_n));
    }

    private void c(jsi jsiVar) {
        if (jsiVar.j() <= 0) {
            this.cx.setVisibility(8);
            this.cw.setVisibility(8);
        } else {
            this.dc.setText(getResources().getQuantityString(R.plurals.IDS_degree_unit_with_value, jsiVar.j(), Integer.valueOf(jsiVar.j())));
            SwingAngleAdvice swingAngleAdvice = new SwingAngleAdvice(jsiVar.j(), jsiVar.b());
            this.cy.setText(swingAngleAdvice.acquireLevelShortTip());
            this.cy.setTextColor(getResources().getColor(izn.c(swingAngleAdvice.acquireLevel())));
        }
    }

    private void b(jsi jsiVar) {
        if (jsiVar.e() <= -101) {
            this.g.setVisibility(8);
            this.m.setVisibility(8);
            LogUtil.j("TrackShareDetailMapAndDetail", "mEversionExcursionLayout is gone");
        } else {
            this.k.setText(getResources().getQuantityString(R.plurals.IDS_degree_unit_with_value, jsiVar.e(), Integer.valueOf(jsiVar.e())));
            EversionExcursionAngleAdvice eversionExcursionAngleAdvice = new EversionExcursionAngleAdvice(jsiVar.e());
            this.j.setText(eversionExcursionAngleAdvice.acquireLevelShortTip());
            this.j.setTextColor(getResources().getColor(izn.c(eversionExcursionAngleAdvice.acquireLevel())));
        }
    }

    private void setAvgGroundImpactAcceleration(jsi jsiVar) {
        if (jsiVar.c() <= 0) {
            this.ai.setVisibility(8);
            return;
        }
        this.ai.setVisibility(0);
        this.al.setText(UnitUtil.e(jsiVar.c(), 1, 0));
        GroundImpactAccelerationAdvice groundImpactAccelerationAdvice = new GroundImpactAccelerationAdvice(jsiVar.c());
        this.ah.setText(groundImpactAccelerationAdvice.acquireLevelShortTip());
        this.ah.setTextColor(getResources().getColor(izn.c(groundImpactAccelerationAdvice.acquireLevel())));
    }

    private void setAvergeVerticalImpactRatePosture(jsi jsiVar) {
        if (Float.compare(jsiVar.f(), 0.0f) <= 0) {
            this.an.setVisibility(8);
            this.aj.setVisibility(8);
            return;
        }
        this.an.setVisibility(0);
        this.aj.setVisibility(0);
        GroundImpactLoadRateAdvice groundImpactLoadRateAdvice = new GroundImpactLoadRateAdvice(jsiVar.f());
        this.ao.setText(UnitUtil.e(groundImpactLoadRateAdvice.getValue(), 1, 1));
        this.ak.setText(groundImpactLoadRateAdvice.acquireLevelShortTip());
        this.ak.setTextColor(getResources().getColor(izn.c(groundImpactLoadRateAdvice.acquireLevel())));
    }

    private void setImpactPeakPosture(jsi jsiVar) {
        if (Float.compare(jsiVar.o(), 0.0f) <= 0) {
            this.aq.setVisibility(8);
            this.as.setVisibility(8);
            return;
        }
        this.aq.setVisibility(0);
        this.as.setVisibility(0);
        GroundShockPeakAdvice groundShockPeakAdvice = new GroundShockPeakAdvice(jsiVar.o());
        this.au.setText(UnitUtil.e(groundShockPeakAdvice.getValue(), 1, 1));
        this.ar.setText(groundShockPeakAdvice.acquireLevelShortTip());
        this.ar.setTextColor(getResources().getColor(izn.c(groundShockPeakAdvice.acquireLevel())));
    }

    private void setVerticalRatioPosture(jsi jsiVar) {
        if (Float.compare(jsiVar.k(), 0.0f) <= 0) {
            this.bf.setVisibility(8);
            this.be.setVisibility(8);
            return;
        }
        this.bf.setVisibility(0);
        this.be.setVisibility(0);
        GroundVerticalAmplitudeRatioAdvice groundVerticalAmplitudeRatioAdvice = new GroundVerticalAmplitudeRatioAdvice(jsiVar.k());
        this.bk.setText(UnitUtil.e(groundVerticalAmplitudeRatioAdvice.getValue(), 2, 1));
        this.bh.setText(groundVerticalAmplitudeRatioAdvice.acquireLevelShortTip());
        this.bh.setTextColor(getResources().getColor(izn.c(groundVerticalAmplitudeRatioAdvice.acquireLevel())));
    }

    private void setVerticalOscillationPosture(jsi jsiVar) {
        if (Float.compare(jsiVar.m(), 0.0f) <= 0) {
            this.bg.setVisibility(8);
            this.bc.setVisibility(8);
            return;
        }
        this.bg.setVisibility(0);
        this.bc.setVisibility(0);
        GroundVerticalAmplitudeAdvice groundVerticalAmplitudeAdvice = new GroundVerticalAmplitudeAdvice(jsiVar.m());
        this.bm.setText(UnitUtil.e(c(groundVerticalAmplitudeAdvice.getValue()), 1, 1));
        this.ba.setText(groundVerticalAmplitudeAdvice.acquireLevelShortTip());
        this.ba.setTextColor(getResources().getColor(izn.c(groundVerticalAmplitudeAdvice.acquireLevel())));
    }

    private float c(float f) {
        return !UnitUtil.f() ? f : (float) UnitUtil.e(f, 0);
    }

    private void setGcTimeBalancePosture(jsi jsiVar) {
        int i;
        if (Float.compare(jsiVar.h(), 0.0f) <= 0) {
            this.az.setVisibility(8);
            this.aw.setVisibility(8);
            return;
        }
        this.az.setVisibility(0);
        this.aw.setVisibility(0);
        GroundTouchdownBalanceAdvice groundTouchdownBalanceAdvice = new GroundTouchdownBalanceAdvice(jsiVar.h());
        String strE = UnitUtil.e(groundTouchdownBalanceAdvice.getValue(), 2, 1);
        String strE2 = UnitUtil.e(100.0f - groundTouchdownBalanceAdvice.getValue(), 2, 1);
        if (LanguageUtil.f(this.d)) {
            i = R.string.IDS_bolt_balance_left_right;
        } else {
            i = R.string.IDS_bolt_balance_rate_left_right_value;
        }
        this.bb.setText(this.d.getResources().getString(i, strE, strE2));
        this.ax.setText(groundTouchdownBalanceAdvice.acquireLevelShortTip());
        this.ax.setTextColor(getResources().getColor(izn.c(groundTouchdownBalanceAdvice.acquireLevel())));
    }

    private void c(int i, int i2, List<PostureJudgeBean> list) {
        if (i <= 0) {
            this.cg.setVisibility(8);
            this.bp.setVisibility(8);
        } else {
            AverageHangTimeAdvice averageHangTimeAdvice = new AverageHangTimeAdvice(i, i2, list, SportDetailChartDataType.HANG_TIME);
            this.bq.setText(UnitUtil.e(i, 1, 0));
            this.bl.setText(averageHangTimeAdvice.acquireLevelShortTip());
            this.bl.setTextColor(getResources().getColor(izn.c(averageHangTimeAdvice.acquireLevel())));
        }
    }

    private void b(float f, int i, List<PostureJudgeBean> list) {
        if (f <= 0.0f) {
            this.ca.setVisibility(8);
            this.ad.setVisibility(8);
        } else {
            GroundHangTimeRateAdvice groundHangTimeRateAdvice = new GroundHangTimeRateAdvice((int) (100.0f * f), i, list, SportDetailChartDataType.GROUND_HANG_TIME_RATE);
            this.ag.setText(UnitUtil.e(f, 1, 1));
            this.ab.setText(groundHangTimeRateAdvice.acquireLevelShortTip());
            this.ab.setTextColor(getResources().getColor(izn.c(groundHangTimeRateAdvice.acquireLevel())));
        }
    }

    public void e() {
        this.cd.setVisibility(8);
    }

    public void b(int i) {
        this.v.setBackgroundColor(i);
        this.v.setAlpha(0.1f);
        this.bp.setBackgroundColor(i);
        this.bp.setAlpha(0.1f);
        this.ad.setBackgroundColor(i);
        this.ad.setAlpha(0.1f);
        this.m.setBackgroundColor(i);
        this.m.setAlpha(0.1f);
        this.cw.setBackgroundColor(i);
        this.cw.setAlpha(0.1f);
    }

    private void setRunningPostureColor(int i) {
        this.ce.setTextColor(i);
        this.ac.setTextColor(i);
        b(i, this.u, this.z, this.w);
        b(i, this.av, this.au, this.at);
        b(i, this.am, this.ao, this.ap);
        b(i, this.l, this.k, this.n);
        b(i, this.ae, this.al, this.af);
        b(i, this.bd, this.bm, this.bi);
        b(i, this.da, this.dc, this.df);
        b(i, this.br, this.bq, this.bn);
        a(i, this.aa, this.ag);
        a(i, this.ay, this.bb);
        a(i, this.bj, this.bk);
        this.cc.setColors(getResources().getColor(R.color.track_detail_running_posture_color_one), getResources().getColor(R.color.track_detail_running_posture_color_two), getResources().getColor(R.color.track_detail_running_posture_color_three));
        this.r.setTextColor(i);
        d(i, this.o, this.q);
        d(i, this.s, this.x);
        d(i, this.p, this.t);
        d(i);
        b(i);
    }

    private void d(int i, HealthTextView healthTextView, HealthTextView healthTextView2) {
        healthTextView.setTextColor(i);
        healthTextView.setAlpha(0.5f);
        healthTextView2.setAlpha(0.5f);
    }

    private void a(int i, HealthTextView healthTextView, HealthTextView healthTextView2) {
        healthTextView.setTextColor(i);
        healthTextView2.setTextColor(i);
        healthTextView2.setAlpha(0.5f);
    }

    private void b(int i, HealthTextView healthTextView, HealthTextView healthTextView2, HealthTextView healthTextView3) {
        healthTextView.setTextColor(i);
        healthTextView2.setTextColor(i);
        healthTextView3.setTextColor(i);
        healthTextView2.setAlpha(0.5f);
        healthTextView3.setAlpha(0.5f);
    }

    public void h() {
        this.ci.setVisibility(0);
    }

    public void a() {
        this.ci.setVisibility(8);
    }

    public void j() {
        this.cl.setVisibility(8);
    }

    public void c() {
        this.cr.setVisibility(8);
        this.ck.setVisibility(8);
    }

    public void f() {
        this.cp.setVisibility(8);
        this.cv.setVisibility(8);
    }

    public void e(String str, String str2) {
        this.cq.setText(str);
        this.co.setText(str2);
    }

    public void d(String str, String str2) {
        this.ct.setText(str);
        this.cu.setText(str2);
    }

    public void b(String str) {
        this.cm.setText(str);
    }

    public void d(int i) {
        this.cz.setTextColor(i);
        this.cj.setTextColor(i);
        this.cq.setTextColor(i);
        this.cq.setAlpha(0.5f);
        this.co.setTextColor(i);
        this.co.setAlpha(0.5f);
        this.cs.setTextColor(i);
        this.ct.setTextColor(i);
        this.ct.setAlpha(0.5f);
        this.cu.setTextColor(i);
        this.cu.setAlpha(0.5f);
        this.cn.setTextColor(i);
        this.cm.setTextColor(i);
        this.cm.setAlpha(0.5f);
        this.ck.setBackgroundColor(i);
        this.ck.setAlpha(0.1f);
        this.cv.setBackgroundColor(i);
        this.cv.setAlpha(0.1f);
    }

    public BasketballScoreView getBasketballRadarView() {
        return this.e;
    }

    public void setRadarViewVisibility(int i) {
        this.e.setVisibility(i);
    }

    public void a(Bitmap bitmap) {
        ImageView imageView = this.bw;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public void a(boolean z) {
        WeatherInfoView weatherInfoView = this.dh;
        if (weatherInfoView != null) {
            weatherInfoView.a(z);
        }
        HealthTextView healthTextView = this.by;
        if (healthTextView != null) {
            if (z) {
                healthTextView.setTextColor(ContextCompat.getColor(getContext(), R.color.font_dark_secondary));
            } else {
                healthTextView.setTextColor(ContextCompat.getColor(BaseApplication.b(), R.color.health_secondary_color));
            }
        }
    }
}
