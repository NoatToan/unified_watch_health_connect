package com.huawei.healthcloud.plugintrack.ui.activity;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.media3.common.C;
import com.google.gson.Gson;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.socialshare.api.SocialShareCenterApi;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.callback.CommonSingleCallback;
import com.huawei.healthcloud.plugintrack.trackanimation.download.DynamicTrackDownloadUtils;
import com.huawei.healthcloud.plugintrack.trackanimation.dynamiccurve.DynamicCurve;
import com.huawei.healthcloud.plugintrack.trackanimation.gpsutil.LatLong;
import com.huawei.healthcloud.plugintrack.trackanimation.gpsutil.LenLatLong;
import com.huawei.healthcloud.plugintrack.trackanimation.gpsutil.ReTrackSimplify;
import com.huawei.healthcloud.plugintrack.trackanimation.recorder.MusicManager;
import com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.InterfaceReTrack;
import com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackDisplay;
import com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.ReTrackEngine;
import com.huawei.healthcloud.plugintrack.trackanimation.retrackengine.auxiliary.TrackAnimationControl;
import com.huawei.healthcloud.plugintrack.trackanimation.shareselector.ShareSelector;
import com.huawei.healthcloud.plugintrack.trackanimation.shareselector.ShareSelectorClickCallback;
import com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.utils.PhotoModel;
import com.huawei.healthcloud.plugintrack.ui.activity.interactor.MapInteractor;
import com.huawei.healthcloud.plugintrack.ui.adapter.CustomMapStyleAdapter;
import com.huawei.healthcloud.plugintrack.ui.adapter.CustomMusicStyleAdapter;
import com.huawei.healthcloud.plugintrack.ui.constraints.DynamicTrackContract;
import com.huawei.healthcloud.plugintrack.ui.fragment.PersonalizedTrackFragment;
import com.huawei.healthcloud.plugintrack.ui.map.HiMapHolder;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap;
import com.huawei.healthcloud.plugintrack.ui.map.SyncMapCallback;
import com.huawei.healthcloud.plugintrack.ui.map.mapdescription.MapTypeDescription;
import com.huawei.healthcloud.plugintrack.ui.presenters.DynamicTrackPresenter;
import com.huawei.healthcloud.plugintrack.ui.viewholder.TrackDialogViewHolder;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.agreement.AgrConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.profile.profile.ProfileExtendConstants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import defpackage.een;
import defpackage.ezo;
import defpackage.jaa;
import defpackage.jeq;
import defpackage.jes;
import defpackage.jew;
import defpackage.jfu;
import defpackage.jfz;
import defpackage.jgx;
import defpackage.jhd;
import defpackage.jhh;
import defpackage.jhj;
import defpackage.jhn;
import defpackage.jho;
import defpackage.jlx;
import defpackage.jly;
import defpackage.jpq;
import defpackage.jre;
import defpackage.njy;
import defpackage.npr;
import defpackage.qpx;
import defpackage.qqf;
import defpackage.qqz;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.LanguageUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class DynamicTrackActivity extends BaseActivity implements DynamicTrackContract.Iview, CommonSingleCallback<Boolean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f10802b = false;
    private LinearLayout aa;
    private HealthRecycleView ab;
    private HealthRecycleView ac;
    private HealthTextView ad;
    private CustomTextAlertDialog af;
    private HealthTextView ag;
    private jlx ah;
    private ConstraintLayout ai;
    private HealthTextView aj;
    private HealthTextView ak;
    private HealthTextView al;
    private HealthTextView am;
    private HealthTextView an;
    private HealthTextView ao;
    private HealthTextView ap;
    private HealthTextView aq;
    private HealthRadioButton ar;
    private RelativeLayout as;
    private HealthTextView au;
    private HealthRadioButton av;
    private RelativeLayout aw;
    private ImageView ax;
    private jre az;
    private boolean bb;
    private boolean bf;
    private RelativeLayout bn;
    private HealthTextView bp;
    private HealthTextView bq;
    private jes bs;
    private jeq bv;
    private CommonDialog21 bx;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private jhd f10804c;
    private RelativeLayout ca;
    private MapInteractor cc;
    private HealthTextView cd;
    private LinearLayout cg;
    private LinearLayout ch;
    private HealthTextView ci;
    private HealthTextView cj;
    private ImageView ck;
    private List<jes> cl;
    private List<jeq> cn;
    private CustomMapStyleAdapter cq;
    private ImageView cr;
    private HealthTextView ct;
    private FrameLayout cu;
    private LinearLayout cv;
    private ImageView cw;
    private FrameLayout cx;
    private LinearLayout cy;
    private HealthTextView cz;
    private HealthTextView d;
    private LinearLayout da;
    private ImageView db;
    private HealthTextView dc;
    private FrameLayout dd;
    private ImageView de;
    private LinearLayout df;
    private HealthTextView dg;
    private ImageView dh;
    private FrameLayout di;
    private LinearLayout dj;
    private HealthTextView dk;
    private FrameLayout dl;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private HealthTextView f2do;
    private LinearLayout dp;
    private MusicManager dq;
    private HealthRadioButton dr;
    private RelativeLayout ds;
    private jly dt;
    private RelativeLayout du;
    private RelativeLayout dv;
    private HealthTextView dw;
    private PersonalizedTrackFragment dx;
    private HealthTextView dy;
    private HealthButton dz;
    private HealthCheckBox e;
    private int ea;
    private HealthTextView eb;
    private DynamicTrackContract.Ipresenter ee;
    private View eh;
    private int ej;
    private RelativeLayout ek;
    private HealthTextView el;
    private ShareSelector em;
    private String en;
    private RelativeLayout eo;
    private LinearLayout ep;
    private LinearLayout eq;
    private HealthRadioButton er;
    private RelativeLayout es;
    private ImageView et;
    private ImageView eu;
    private TrackDialogViewHolder ev;
    private HealthTextView ew;
    private HealthTextView ex;
    private RelativeLayout ey;
    private ImageView ez;
    private LinearLayout f;
    private ImageView fb;
    private VideoView fc;
    private FrameLayout fd;
    private HealthTextView fe;
    private ImageView ff;
    private CustomViewDialog fg;
    private Bitmap fh;
    private String fi;
    private ImageView fj;
    private HealthTextView fk;
    private LinearLayout fl;
    private View fn;
    private LinearLayout g;
    private LinearLayout h;
    private HealthDivider i;
    private HealthTextView j;
    private ImageButton l;
    private ImageView m;
    private HealthTextView n;
    private ImageView o;
    private MapTypeDescription.MapType p;
    private String q;
    private Context r;
    private String s;
    private jes t;
    private RelativeLayout u;
    private String v;
    private jeq w;
    private LinearLayout x;
    private HealthTextView y;
    private LinearLayout z;
    private boolean bj = false;
    private HiMapHolder ay = null;
    private int cm = -1;
    private InterfaceHiMap cf = null;
    private ReTrackSimplify ec = null;
    private ArrayList<LatLong> eg = null;
    private ArrayList<LenLatLong> by = null;
    private jfz ei = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f10803a = null;
    private InterfaceReTrack ce = null;
    private DynamicCurve ae = null;
    private boolean bk = false;
    private boolean bl = false;
    private boolean bc = false;
    private MapTypeDescription.MapType bt = MapTypeDescription.MapType.MAP_TYPE_SATELLITE;
    private int cb = 0;
    private int bu = 0;
    private boolean be = true;
    private int ef = 0;
    private String fa = "retrack_mode_complex";
    private boolean ba = false;
    private boolean bi = true;
    private boolean br = false;
    private boolean bd = false;
    private boolean bh = false;
    private boolean bg = false;
    private int bo = -1;
    private int bw = -1;
    private HashMap<Integer, List<PhotoModel>> cs = null;
    private Map<PhotoModel, Bitmap> ed = new HashMap();
    private HashMap<Integer, ArrayList<PhotoModel>> dm = new HashMap<>();
    private HashMap<Integer, List<Bitmap>> cp = new HashMap<>();
    private Runnable bz = null;
    private boolean bm = false;
    private IBaseResponseCallback co = new IBaseResponseCallback() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.DynamicTrackActivity.4
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (i == 1) {
                DynamicTrackActivity dynamicTrackActivity = DynamicTrackActivity.this;
                dynamicTrackActivity.t = dynamicTrackActivity.bs;
                DynamicTrackActivity dynamicTrackActivity2 = DynamicTrackActivity.this;
                dynamicTrackActivity2.p = dynamicTrackActivity2.bt;
                DynamicTrackActivity dynamicTrackActivity3 = DynamicTrackActivity.this;
                dynamicTrackActivity3.bo = dynamicTrackActivity3.bu;
                DynamicTrackActivity dynamicTrackActivity4 = DynamicTrackActivity.this;
                dynamicTrackActivity4.bw = dynamicTrackActivity4.cb;
                DynamicTrackActivity dynamicTrackActivity5 = DynamicTrackActivity.this;
                dynamicTrackActivity5.w = dynamicTrackActivity5.bv;
                if (DynamicTrackActivity.this.cm != DynamicTrackActivity.this.ea) {
                    DynamicTrackActivity dynamicTrackActivity6 = DynamicTrackActivity.this;
                    dynamicTrackActivity6.cm = dynamicTrackActivity6.ea;
                    DynamicTrackActivity.this.b((Bundle) null);
                }
                DynamicTrackActivity dynamicTrackActivity7 = DynamicTrackActivity.this;
                dynamicTrackActivity7.a(dynamicTrackActivity7.bt, DynamicTrackActivity.this.t);
                DynamicTrackActivity.this.ce.setCustomMarkInfo(DynamicTrackActivity.this.w);
                DynamicTrackActivity.this.ce.resetLine();
                return;
            }
            if (!(obj instanceof List)) {
                LogUtil.e("Track_DynamicTrackActivity", "data exception");
                DynamicTrackActivity.this.bg();
                DynamicTrackActivity.this.an();
                return;
            }
            List list = (List) obj;
            if (njy.b(list.get(0), jes.class)) {
                DynamicTrackActivity.this.cl = (List) list.get(0);
                if (!DynamicTrackActivity.this.bj && DynamicTrackActivity.this.cl != null && DynamicTrackActivity.this.cl.size() >= 9) {
                    DynamicTrackActivity.this.cl.remove(2);
                }
                if (DynamicTrackActivity.this.bj && DynamicTrackActivity.this.cl != null && DynamicTrackActivity.this.cl.size() == 8) {
                    DynamicTrackActivity.this.l();
                }
            }
            if (njy.b(list.get(1), jeq.class)) {
                DynamicTrackActivity.this.cn = (List) list.get(1);
            }
            if (njy.e(DynamicTrackActivity.this.cl)) {
                DynamicTrackActivity.this.bg();
            }
            if (DynamicTrackActivity.this.bj && DynamicTrackActivity.this.cl.size() == 2) {
                DynamicTrackActivity.this.l();
            }
            if (!DynamicTrackActivity.this.bj && DynamicTrackActivity.this.cl.size() == 3) {
                DynamicTrackActivity.this.cl.remove(2);
            }
            DynamicTrackActivity.this.an();
        }
    };
    private Handler dn = new b(Looper.getMainLooper(), this);
    private View.OnClickListener k = new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.DynamicTrackActivity.14
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view == null) {
                LogUtil.e("Track_DynamicTrackActivity", "view is null");
                return;
            }
            if (qrs.c(500)) {
                return;
            }
            if (view.getId() != R.id.retrack_start_retrack) {
                if (view.getId() != R.id.retrack_back_btn) {
                    if (view.getId() != R.id.track_edit_ok_btn) {
                        if (view.getId() != R.id.retrack_normal_video_rl) {
                            if (view.getId() != R.id.retrack_fast_video_rl) {
                                if (view.getId() != R.id.track_personalized_btn) {
                                    if (view.getId() != R.id.switch_layout) {
                                        LogUtil.e("Track_DynamicTrackActivity", "error view id.");
                                        return;
                                    } else {
                                        DynamicTrackActivity.this.bn();
                                        jhh.a(DynamicTrackActivity.this.r, DynamicTrackActivity.this.ec.getSportType(), DynamicTrackActivity.this.bb, 1);
                                        return;
                                    }
                                }
                                DynamicTrackActivity.this.bp();
                                return;
                            }
                            DynamicTrackActivity.this.h(true);
                            return;
                        }
                        DynamicTrackActivity.this.h(false);
                        return;
                    }
                    DynamicTrackActivity.this.ba();
                    DynamicTrackActivity.this.c(true);
                    return;
                }
                DynamicTrackActivity.this.y();
                return;
            }
            DynamicTrackActivity.this.bb();
        }
    };
    private IBaseResponseCallback at = new IBaseResponseCallback() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.DynamicTrackActivity.15
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (i == 1 && obj != null && (obj instanceof jhn)) {
                jhn jhnVar = (jhn) obj;
                jhnVar.a(DynamicTrackActivity.this.v);
                jhnVar.b(DynamicTrackActivity.this.en);
                jhnVar.c(DynamicTrackActivity.this.q);
                jhnVar.a(!"retrack_mode_complex".equals(DynamicTrackActivity.this.fa) ? 1 : 0);
                jhnVar.c(DynamicTrackActivity.this.bb);
                jhnVar.e(DynamicTrackActivity.this.ec.getSportType());
                jhh.c(DynamicTrackActivity.this.r, jhnVar);
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        jes jesVar = new jes();
        jesVar.a("true");
        jesVar.b(5);
        jesVar.d(true);
        jesVar.b(false);
        this.cl.add(2, jesVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bb() {
        npr.a(1);
        if (this.ef == 4 || qrs.ab(this.r)) {
            br();
            this.bl = true;
        } else {
            bf();
            this.bl = false;
        }
        jhh.c(this.r, this.ec.getSportType(), this.bb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bn() {
        DynamicTrackContract.Ipresenter ipresenter = this.ee;
        if (ipresenter != null) {
            ipresenter.switchPremiumEdition(this.bj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(boolean z) {
        if (this.br && !this.bj) {
            i(z);
        } else {
            f(z);
        }
    }

    public void initAlbumView(View view) {
        jhd jhdVar = this.f10804c;
        if (jhdVar != null) {
            jhdVar.b(view);
            this.f10804c.b(this.bb);
            this.f10804c.c(this.dm, this.ed, this.cp);
            this.f10804c.i();
        }
    }

    public void f() {
        jhd jhdVar = this.f10804c;
        if (jhdVar != null) {
            jhdVar.h();
        }
    }

    public void h() {
        InterfaceReTrack interfaceReTrack = this.ce;
        if (interfaceReTrack != null) {
            interfaceReTrack.resetLine();
        }
    }

    public void j() {
        MusicManager musicManager = this.dq;
        if (musicManager != null) {
            musicManager.a();
        }
    }

    public void g() {
        jly jlyVar = this.dt;
        if (jlyVar != null) {
            jlyVar.e();
        }
    }

    public void d(boolean z) {
        this.f10804c.d(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bp() {
        if (this.dx == null) {
            this.dx = new PersonalizedTrackFragment();
        }
        this.dx.b(this.ej);
        this.dx.e(this.bj);
        this.f10804c.a(this.bj);
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        if (!this.dx.isAdded()) {
            fragmentTransactionBeginTransaction.add(R.id.track_retrack_root, this.dx);
        }
        fragmentTransactionBeginTransaction.show(this.dx);
        fragmentTransactionBeginTransaction.commit();
        ae();
        InterfaceReTrack interfaceReTrack = this.ce;
        if (interfaceReTrack != null) {
            interfaceReTrack.changeEditStatus(true);
        }
        jhh.b(this.r, this.ec.getSportType(), this.bb);
    }

    private void ae() {
        this.ch.setVisibility(8);
        this.dz.setVisibility(8);
        this.ep.setVisibility(8);
        this.em.setVisibility(8);
        this.x.setVisibility(8);
        this.du.setVisibility(8);
        this.z.setVisibility(8);
        this.g.setVisibility(8);
        this.m.setVisibility(0);
        this.ai.setClickable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        if (this.dx == null) {
            LogUtil.j("Track_DynamicTrackActivity", "[hidePersonalizedView] mPersonalizedTrackFragment is null.");
            return;
        }
        if (!z) {
            jhd jhdVar = this.f10804c;
            if (jhdVar != null && jhdVar.d()) {
                this.f10804c.b();
                return;
            }
            jhd jhdVar2 = this.f10804c;
            if (jhdVar2 != null && jhdVar2.e()) {
                this.f10804c.c();
                return;
            }
        }
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        if (!this.dx.isAdded()) {
            LogUtil.j("Track_DynamicTrackActivity", "[hidePersonalizedView] mPersonalizedTrackFragment is not added.");
            return;
        }
        fragmentTransactionBeginTransaction.hide(this.dx);
        fragmentTransactionBeginTransaction.commit();
        s();
        jly jlyVar = this.dt;
        if (jlyVar != null) {
            jlyVar.c(z);
        }
        a(z);
        b(z);
    }

    private void a(boolean z) {
        HealthRadioButton healthRadioButton = this.dr;
        if (healthRadioButton == null || this.e == null || !z || this.av == null || this.ce == null) {
            return;
        }
        d(healthRadioButton.isChecked(), this.av.isChecked());
        this.fa = this.dr.isChecked() ? "retrack_mode_simple" : "retrack_mode_complex";
        this.bi = this.e.isChecked();
        bd();
        this.ce.setIsSupportArea(this.bi);
    }

    private void b(boolean z) {
        jhd jhdVar = this.f10804c;
        if (jhdVar != null) {
            jhdVar.e(this.at);
        }
        if (!z) {
            this.co.a(1, null);
        }
        InterfaceReTrack interfaceReTrack = this.ce;
        if (interfaceReTrack != null) {
            interfaceReTrack.changeEditStatus(false);
        }
    }

    private void s() {
        this.ch.setVisibility(0);
        am();
        this.dz.setVisibility(0);
        qsp.c((View) this.ep, 8);
        this.du.setVisibility(0);
        this.z.setVisibility(0);
        this.g.setVisibility(0);
        this.m.setVisibility(8);
        this.ai.setClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg() {
        this.cl = new ArrayList();
        LogUtil.e("Track_DynamicTrackActivity", "mMapStyleInfo data is null ");
        if (this.cm == 1) {
            for (int i = 1; i < 5; i++) {
                jes jesVar = new jes();
                jesVar.a("true");
                jesVar.b(i);
                this.cl.add(jesVar);
            }
            return;
        }
        jes jesVar2 = new jes();
        jesVar2.a("true");
        jesVar2.b(1);
        this.cl.add(jesVar2);
        jes jesVar3 = new jes();
        jesVar3.a("true");
        jesVar3.b(3);
        this.cl.add(jesVar3);
        if (this.bj) {
            l();
        }
    }

    public void chooseMusic(View view) {
        if (view == null) {
            LogUtil.e("Track_DynamicTrackActivity", "[chooseMusic] view is null");
            return;
        }
        if (CommonUtil.ab(this.r) || !DynamicTrackDownloadUtils.b().g()) {
            this.dt.b(view);
        } else if (DynamicTrackDownloadUtils.b().g()) {
            qpx.e(BaseApplication.getContext(), getString(R.string.IDS_connect_error));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        if (this.em.getVisibility() == 0) {
            LogUtil.a("Track_DynamicTrackActivity", "setPreviewStatus by exitCurrentAct");
            bk();
            InterfaceReTrack interfaceReTrack = this.ce;
            if (interfaceReTrack != null) {
                interfaceReTrack.reset();
                return;
            }
            return;
        }
        if (this.m.getVisibility() == 0) {
            c(false);
        } else if (this.f10804c.a()) {
            bm();
        } else {
            finish();
        }
    }

    public void b() {
        if (this.ce.getTotalDuration() >= C.DEFAULT_SEEK_FORWARD_INCREMENT_MS) {
            bq();
        } else if (this.br) {
            e();
        } else {
            f(false);
        }
    }

    private void f(final boolean z) {
        TrackDialogViewHolder trackDialogViewHolder;
        if (this.ev == null) {
            this.ev = new TrackDialogViewHolder(this.r).b(new CommonSingleCallback() { // from class: jjc
                @Override // com.huawei.healthcloud.plugintrack.callback.CommonSingleCallback
                public final void callback(Object obj) {
                    this.f38670c.a((Boolean) obj);
                }
            }).c(new CommonSingleCallback() { // from class: jjh
                @Override // com.huawei.healthcloud.plugintrack.callback.CommonSingleCallback
                public final void callback(Object obj) {
                    this.f38672b.b((Boolean) obj);
                }
            }).d(new CommonSingleCallback() { // from class: jjf
                @Override // com.huawei.healthcloud.plugintrack.callback.CommonSingleCallback
                public final void callback(Object obj) {
                    this.e.b(z, (Boolean) obj);
                }
            });
        }
        CustomViewDialog customViewDialog = this.fg;
        if (customViewDialog != null) {
            customViewDialog.dismiss();
        }
        if (this.bj && !this.br && (trackDialogViewHolder = this.ev) != null) {
            trackDialogViewHolder.e(this.ba);
        } else {
            i(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.ba = bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Boolean bool) {
        this.br = bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(boolean z, Boolean bool) {
        if (bool.booleanValue()) {
            be();
            i(z);
        }
    }

    private void be() {
        SharedPreferences.Editor editorEdit = this.r.getSharedPreferences("retrack_file", 0).edit();
        editorEdit.putBoolean("retrack_play_mode_tip_key", this.br);
        editorEdit.putBoolean("retrack_play_mode_key", this.ba);
        editorEdit.commit();
    }

    private void bq() {
        if (this.fg == null) {
            this.fg = new CustomViewDialog.Builder(this.r).a(this.r.getString(R.string.IDS_retrack_video_select_title)).d(this.fn).c(this.r.getString(R.string.IDS_settings_button_cancal).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.DynamicTrackActivity.16
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    DynamicTrackActivity.this.fg.dismiss();
                }
            }).d();
        }
        this.fg.show();
    }

    private void bf() {
        PermissionUtil.d(this.r, PermissionUtil.PermissionType.MEDIA_VIDEO_IMAGES, new CustomPermissionAction(this.r) { // from class: com.huawei.healthcloud.plugintrack.ui.activity.DynamicTrackActivity.19
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                if (DynamicTrackActivity.this.ei == null) {
                    DynamicTrackActivity dynamicTrackActivity = DynamicTrackActivity.this;
                    dynamicTrackActivity.ei = new jfz(dynamicTrackActivity, dynamicTrackActivity);
                }
                DynamicTrackActivity.this.ei.a(DynamicTrackActivity.this.ce.getTotalDuration());
                DynamicTrackActivity.this.b();
            }
        });
    }

    private void i(boolean z) {
        CustomViewDialog customViewDialog = this.fg;
        if (customViewDialog != null) {
            customViewDialog.dismiss();
        }
        jfz jfzVar = this.ei;
        if (jfzVar != null) {
            jfzVar.c(z);
            e();
        }
    }

    public void e() {
        PermissionUtil.d(this, PermissionUtil.PermissionType.MEDIA_VIDEO_IMAGES, new CustomPermissionAction(this.r) { // from class: com.huawei.healthcloud.plugintrack.ui.activity.DynamicTrackActivity.17
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                if (DynamicTrackActivity.this.ei == null) {
                    ReleaseLogUtil.a("Track_DynamicTrackActivity", "mRecorderManager is null");
                    return;
                }
                jfu.f38557a.e().d(DynamicTrackActivity.this.getWindow(), DynamicTrackActivity.this.eh, DynamicTrackActivity.this.eh.getWidth());
                if (jho.b()) {
                    DynamicTrackActivity.this.ei.b(-1, new Intent(), DynamicTrackActivity.this.bj ? DynamicTrackActivity.this.ba : false);
                    DynamicTrackActivity.this.bc = true;
                    jhh.a(DynamicTrackActivity.this.r, DynamicTrackActivity.this.ec.getSportType(), DynamicTrackActivity.this.bb, DynamicTrackActivity.this.ei.c(), DynamicTrackActivity.this.ba ? 1 : 0);
                    DynamicTrackActivity.this.br();
                    return;
                }
                DynamicTrackActivity.this.ei.g();
            }
        });
        this.ef = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        this.bk = false;
        jfz jfzVar = this.ei;
        if (jfzVar != null) {
            jfzVar.h();
            this.ei.j();
        }
        this.dq.a();
        n();
        ac();
        c(this.ec.getValidTotalDistance());
        getWindow().clearFlags(128);
        ReleaseLogUtil.d("Track_DynamicTrackActivity", "handleEndRetrack.");
        npr.d(1);
    }

    private void n() {
        e eVar = this.f10803a;
        if (eVar != null) {
            eVar.c();
            this.f10803a = null;
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        LogUtil.a("Track_DynamicTrackActivity", "onCreate.");
        requestWindowFeature(1);
        super.onCreate(bundle);
        if (!f10802b) {
            LogUtil.j("Track_DynamicTrackActivity", "is not from track detail activity");
            finish();
        }
        cancelAdaptRingRegion();
        this.r = this;
        getWindow().setFlags(1024, 1024);
        setContentView(R.layout.track_retrack);
        int iE = jaa.e(this.r);
        this.cm = iE;
        this.ea = iE;
        if (!ay()) {
            ReleaseLogUtil.a("Track_DynamicTrackActivity", "init data fail, finish.");
            finish();
            return;
        }
        this.ee = new DynamicTrackPresenter(this);
        getLifecycle().addObserver(this.ee);
        ak();
        at();
        au();
        MusicManager musicManager = new MusicManager(this);
        this.dq = musicManager;
        musicManager.b();
        this.ce = new ReTrackDisplay(this.dn, this.eg, this.by, this.ec).c(true).setContext(this.r).setTrackPhoto(this.eu, this.ez, this.fb).setTrackVideo(this.fc).setTrackPhotoBackground(this.fd);
        HiMapHolder hiMapHolder = (HiMapHolder) findViewById(R.id.sport_track_map);
        this.ay = hiMapHolder;
        hiMapHolder.setRadius(0.0f);
        d(bundle);
        this.ah = new jlx(this);
        aj();
        a();
        m();
        jhh.a(this.r, this.ec.getSportType(), this.bb, 0);
        jhd jhdVar = new jhd(this.r, this.ce);
        this.f10804c = jhdVar;
        jhdVar.b(this.dn);
        this.ce.setScreenWidth(getResources().getDisplayMetrics().widthPixels);
        this.ce.setScreenHeight(getResources().getDisplayMetrics().heightPixels);
        this.ce.setIsHideKmMarker(this.ec.getSportType() == 222);
        k();
        DynamicTrackContract.Ipresenter ipresenter = this.ee;
        if (ipresenter != null) {
            ipresenter.judgeVipStatus();
        }
    }

    private void aj() {
        jew.d();
        this.dt = new jly(this);
        this.cc = new MapInteractor(this, this.r, this.cm);
        this.dt.a(new CustomMusicStyleAdapter.MusicItemClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.DynamicTrackActivity.20
            @Override // com.huawei.healthcloud.plugintrack.ui.adapter.CustomMusicStyleAdapter.MusicItemClickListener
            public void onClickListener(String str, String str2) {
                DynamicTrackActivity.this.en = str2;
            }

            @Override // com.huawei.healthcloud.plugintrack.ui.adapter.CustomMusicStyleAdapter.MusicItemClickListener
            public void onMuteClick() {
                DynamicTrackActivity.this.en = null;
            }
        });
        this.cc.b(new MapInteractor.MarkResetListener() { // from class: jjd
            @Override // com.huawei.healthcloud.plugintrack.ui.activity.interactor.MapInteractor.MarkResetListener
            public final void onResetMarker(jeq jeqVar, int i) {
                this.e.e(jeqVar, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(jeq jeqVar, int i) {
        this.bw = i;
        this.w = jeqVar;
        this.cb = i;
        this.bv = jeqVar;
        InterfaceReTrack interfaceReTrack = this.ce;
        if (interfaceReTrack != null) {
            interfaceReTrack.setCustomMarkInfo(jeqVar);
            this.ce.reset();
        }
        ba();
    }

    /* JADX INFO: renamed from: com.huawei.healthcloud.plugintrack.ui.activity.DynamicTrackActivity$18, reason: invalid class name */
    class AnonymousClass18 implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Bundle f10810a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f10811c;

        AnonymousClass18(View view, Bundle bundle) {
            this.f10811c = view;
            this.f10810a = bundle;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f10811c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (DynamicTrackActivity.this.isFinishing()) {
                return;
            }
            DynamicTrackActivity.this.dn.postDelayed(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.DynamicTrackActivity.18.2
                @Override // java.lang.Runnable
                public void run() {
                    if (DynamicTrackActivity.this.isFinishing() || DynamicTrackActivity.this.bd) {
                        return;
                    }
                    NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(DynamicTrackActivity.this.r);
                    builder.b(R.string.IDS_connect_error).c(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.DynamicTrackActivity.18.2.4
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            DynamicTrackActivity.this.finish();
                        }
                    });
                    NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
                    noTitleCustomAlertDialogC.setCanceledOnTouchOutside(false);
                    noTitleCustomAlertDialogC.show();
                }
            }, C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
            DynamicTrackActivity.this.b(this.f10810a);
        }
    }

    private void d(Bundle bundle) {
        View decorView = getWindow().getDecorView();
        decorView.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass18(decorView, bundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final Bundle bundle) {
        int i = this.cm;
        if (i == 1) {
            this.ay.e((Bundle) null, this.r);
            c(bundle);
        } else {
            if (i == 2) {
                this.ay.c(this.r, null, new SyncMapCallback() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.DynamicTrackActivity.21
                    @Override // com.huawei.healthcloud.plugintrack.ui.map.SyncMapCallback
                    public void onMapReady(InterfaceHiMap interfaceHiMap) {
                        DynamicTrackActivity.this.c(bundle);
                    }
                });
                return;
            }
            if (i == 3) {
                this.cj.setVisibility(8);
                this.cj.setText(this.r.getResources().getString(R.string.IDS_hw_petal_maps));
                this.ay.e(this.r, new SyncMapCallback() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.DynamicTrackActivity.2
                    @Override // com.huawei.healthcloud.plugintrack.ui.map.SyncMapCallback
                    public void onMapReady(InterfaceHiMap interfaceHiMap) {
                        DynamicTrackActivity.this.c(bundle);
                    }
                });
            } else {
                this.ay.b(null, this.r);
                c(bundle);
            }
        }
    }

    private void bl() {
        if (this.bm) {
            LinearLayout linearLayout = this.h;
            if (linearLayout != null) {
                linearLayout.setClickable(false);
            }
            ConstraintLayout constraintLayout = this.ai;
            if (constraintLayout != null) {
                constraintLayout.setClickable(false);
            }
            InterfaceHiMap interfaceHiMap = this.cf;
            if (interfaceHiMap != null) {
                interfaceHiMap.setAllGesturesEnabled(true);
            }
            InterfaceReTrack interfaceReTrack = this.ce;
            if (interfaceReTrack != null) {
                interfaceReTrack.setCustomMarkInfo(null);
                this.ce.resetLine();
            }
            LogUtil.a("Track_DynamicTrackActivity", "setMapGesturesEnabled: ", this.p);
            this.bm = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Bundle bundle) {
        ReleaseLogUtil.d("Track_DynamicTrackActivity", "initMapDisplayEngine with ", Integer.valueOf(this.cm));
        InterfaceHiMap hiMap = this.ay.getHiMap();
        this.cf = hiMap;
        InterfaceReTrack interfaceReTrack = this.ce;
        if (interfaceReTrack instanceof ReTrackEngine) {
            ((ReTrackEngine) interfaceReTrack).setMapEngine(hiMap);
            this.ce.onCreate(bundle);
            this.ce.onResume();
            this.ce.reset();
        }
        aq();
        bl();
    }

    private void m() {
        if (this.r == null) {
            LogUtil.a("Track_DynamicTrackActivity", "showAbnormalTrackDialog mContext is null");
        } else {
            if (this.ec.getIsCompleteTrack()) {
                return;
            }
            ReleaseLogUtil.d("Track_DynamicTrackActivity", "gps exist abnormal data.");
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.r);
            builder.a(this.r.getString(R.string.IDS_retrack_abnormal_tip)).a(R.string.IDS_common_notification_know_tips, new View.OnClickListener(this) { // from class: com.huawei.healthcloud.plugintrack.ui.activity.DynamicTrackActivity.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            });
            builder.c().show();
        }
    }

    public void i() {
        if (this.ds != null && this.as != null && this.e != null) {
            this.dr.setChecked(!"retrack_mode_complex".equals(this.fa));
            this.ar.setChecked("retrack_mode_complex".equals(this.fa));
            this.e.setChecked(this.bi);
        }
        HealthRadioButton healthRadioButton = this.av;
        if (healthRadioButton != null && this.er != null) {
            if (this.ba && this.bj) {
                healthRadioButton.setChecked(true);
                this.er.setChecked(false);
            } else {
                healthRadioButton.setChecked(false);
                this.er.setChecked(true);
            }
        }
        qsp.c((View) this.fl, this.bj ? 0 : 8);
        qsp.c((View) this.fk, this.bj ? 0 : 8);
    }

    private void d(boolean z, boolean z2) {
        SharedPreferences.Editor editorEdit = this.r.getSharedPreferences("retrack_file", 0).edit();
        if (z) {
            this.ce.setAlgorithmStrength(TrackAnimationControl.Strength.LOW);
            editorEdit.putString("retrack_mode_key", "retrack_mode_simple");
        } else {
            this.ce.setAlgorithmStrength(TrackAnimationControl.Strength.HIGH);
            editorEdit.putString("retrack_mode_key", "retrack_mode_complex");
        }
        editorEdit.putBoolean("retrack_play_mode_key", z2);
        editorEdit.commit();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        LogUtil.a("Track_DynamicTrackActivity", "onDestroy.");
        super.onDestroy();
        ba();
        this.bk = false;
        Handler handler = this.dn;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        InterfaceReTrack interfaceReTrack = this.ce;
        if (interfaceReTrack != null) {
            interfaceReTrack.onDestroy();
        }
        MusicManager musicManager = this.dq;
        if (musicManager != null) {
            musicManager.a();
        }
        jfz jfzVar = this.ei;
        if (jfzVar != null) {
            jfzVar.j();
            this.ei.e();
        }
        jfu.f38557a.e().b();
        if (jew.d().b()) {
            ReleaseLogUtil.d("Track_DynamicTrackActivity", "Abnormal end");
            jew.d().c();
            jew.e();
        }
        DynamicTrackDownloadUtils.d();
        n();
        HiMapHolder hiMapHolder = this.ay;
        if (hiMapHolder != null) {
            hiMapHolder.e();
        }
        if (this.bz != null) {
            ThreadPoolManager.c().e(this.bz);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        PersonalizedTrackFragment personalizedTrackFragment;
        LogUtil.a("Track_DynamicTrackActivity", "onStart.");
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        if (this.dx == null && fragments.size() > 0) {
            FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
            Iterator<Fragment> it = fragments.iterator();
            while (true) {
                if (!it.hasNext()) {
                    personalizedTrackFragment = null;
                    break;
                }
                Fragment next = it.next();
                if (next instanceof PersonalizedTrackFragment) {
                    personalizedTrackFragment = (PersonalizedTrackFragment) next;
                    break;
                }
            }
            if (personalizedTrackFragment != null) {
                fragmentTransactionBeginTransaction.hide(personalizedTrackFragment);
                fragmentTransactionBeginTransaction.remove(personalizedTrackFragment);
                fragmentTransactionBeginTransaction.commit();
            }
        }
        super.onStart();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        ReleaseLogUtil.d("Track_DynamicTrackActivity", "onResume.");
        super.onResume();
        InterfaceReTrack interfaceReTrack = this.ce;
        if (interfaceReTrack != null) {
            interfaceReTrack.onResume();
        }
        if (this.em.getVisibility() == 0) {
            return;
        }
        if (this.bk && this.bc) {
            LogUtil.a("Track_DynamicTrackActivity", "is authorizeProcess return");
            return;
        }
        if (this.ce != null) {
            LogUtil.a("Track_DynamicTrackActivity", "setPreviewStatus by onResume");
            this.ce.reset();
            PersonalizedTrackFragment personalizedTrackFragment = this.dx;
            if (personalizedTrackFragment == null || personalizedTrackFragment.isHidden()) {
                bk();
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        ReleaseLogUtil.d("Track_DynamicTrackActivity", "onPause.");
        super.onPause();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        ReleaseLogUtil.d("Track_DynamicTrackActivity", "onStop.");
        super.onStop();
        this.bk = false;
        InterfaceReTrack interfaceReTrack = this.ce;
        if (interfaceReTrack != null) {
            interfaceReTrack.onPause();
        }
        MusicManager musicManager = this.dq;
        if (musicManager != null) {
            musicManager.a();
        }
        jfz jfzVar = this.ei;
        if (jfzVar != null) {
            jfzVar.j();
        }
        n();
        q();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        LogUtil.a("Track_DynamicTrackActivity", "onBackPressed.");
        if (this.bk || this.em.getVisibility() == 0) {
            ReleaseLogUtil.d("Track_DynamicTrackActivity", "setPreviewStatus by onBackPressed");
            this.bk = false;
            bk();
            InterfaceReTrack interfaceReTrack = this.ce;
            if (interfaceReTrack != null) {
                interfaceReTrack.reset();
                return;
            }
            return;
        }
        PersonalizedTrackFragment personalizedTrackFragment = this.dx;
        if (personalizedTrackFragment != null && !personalizedTrackFragment.isHidden()) {
            c(false);
            return;
        }
        jhd jhdVar = this.f10804c;
        if (jhdVar != null && jhdVar.a()) {
            bm();
        } else {
            super.onBackPressed();
        }
    }

    private boolean ay() {
        Intent intent = getIntent();
        if (intent == null) {
            ReleaseLogUtil.a("Track_DynamicTrackActivity", "intent is null");
            return false;
        }
        Bundle bundleExtra = intent.getBundleExtra("track_detail_data_bundle");
        if (bundleExtra == null) {
            ReleaseLogUtil.a("Track_DynamicTrackActivity", "bundle is null.");
            return false;
        }
        if (!(bundleExtra.getSerializable("simplify_data") instanceof ReTrackSimplify)) {
            ReleaseLogUtil.a("Track_DynamicTrackActivity", "mReTrackSy is null, finish this activity.");
            return false;
        }
        this.ec = (ReTrackSimplify) bundleExtra.getSerializable("simplify_data");
        if (!jgx.b(bundleExtra.getSerializable("lens_data"), LenLatLong.class)) {
            ReleaseLogUtil.a("Track_DynamicTrackActivity", "mLensData is null, finish this activity.");
            return false;
        }
        this.by = (ArrayList) bundleExtra.getSerializable("lens_data");
        if (!jgx.b(bundleExtra.getSerializable("retrack_data"), LatLong.class)) {
            ReleaseLogUtil.a("Track_DynamicTrackActivity", "mRetrackData is null, finish this activity.");
            return false;
        }
        this.eg = (ArrayList) bundleExtra.getSerializable("retrack_data");
        if (jgx.d(bundleExtra.getSerializable("matched_photos"), Integer.class, PhotoModel.class)) {
            this.cs = (HashMap) bundleExtra.getSerializable("matched_photos");
        }
        this.az = new jre(0.0f, 0.2f, 0.2f, 1.0f);
        return true;
    }

    private void au() {
        this.fi = jho.d();
        this.fh = jho.e(this.r);
        if (!TextUtils.isEmpty(this.fi)) {
            this.fe.setText(this.fi);
        }
        Bitmap bitmap = this.fh;
        if (bitmap != null) {
            this.ff.setImageBitmap(bitmap);
        }
        this.ae.b(this.ec, this.eg);
        this.ew.setText(UnitUtil.d("yyyy/M/d", this.ec.getStartTimeStamp()));
        c(this.ec.getValidTotalDistance());
        o();
        bh();
        if (this.ec.getDeviceId() <= 0 && TextUtils.isEmpty(this.ec.getProductId())) {
            this.aq.setText(this.r.getString(R.string.IDS_app_name_health));
        } else {
            int deviceId = this.ec.getDeviceId();
            Context context = this.r;
            String strE = een.e(deviceId, context, context.getPackageName(), this.ec.getProductId(), this.ec.getSubProductId());
            HealthTextView healthTextView = this.aq;
            if (TextUtils.isEmpty(strE)) {
                strE = this.r.getString(R.string.IDS_app_name_health);
            }
            healthTextView.setText(strE);
        }
        if (LanguageUtil.ba(this.r)) {
            this.o.setBackground(qqz.e(this.r, R.drawable.retrack_ic_back));
            this.l.setBackgroundResource(R.drawable.track_goto_retrack_btn_ar_selector);
            this.ae.setRotationY(180.0f);
            this.et.setRotationY(180.0f);
        } else {
            this.o.setBackgroundResource(R.drawable.retrack_ic_back);
            this.l.setBackgroundResource(R.drawable.track_goto_retrack_btn_selector);
        }
        bi();
        cr(this);
    }

    private void o() {
        if (this.ec.getSportType() == 222) {
            this.ex.setVisibility(8);
            this.ey.setVisibility(8);
            this.eq.setVisibility(0);
            int[] iArrA = ezo.a(this.ec.getTotalTime());
            int i = iArrA[0];
            int i2 = iArrA[1];
            int i3 = iArrA[2];
            if (i != 0) {
                this.al.setText(UnitUtil.e(i, 1, 0));
                this.ak.setText(this.r.getResources().getQuantityString(R.plurals.IDS_physiology_day, i, ""));
            }
            this.ap.setText(UnitUtil.e(i3, 1, 0));
            if (i == 0 && i2 == 0) {
                this.aj.setText(this.r.getResources().getQuantityString(R.plurals.IDS_min_insert_unit, i3, ""));
            } else {
                this.an.setText(UnitUtil.e(i2, 1, 0));
                this.am.setText(this.r.getResources().getQuantityString(R.plurals.IDS_hour_single_unit, i2, ""));
                this.aj.setText(this.r.getResources().getQuantityString(R.plurals.IDS_min_single_unit, i3, ""));
            }
            this.bp.setText(jho.d(this.ec.getAvgSpeedType(), (float) this.ec.getAvgSpeedField()));
            this.bq.setText(jho.c(this.r, this.ec.getAvgSpeedType()));
            this.bq.setMaxWidth(R.dimen.hw_group_icon_64dp);
            ah();
            return;
        }
        if (this.ec.getSportType() == 233) {
            p();
            return;
        }
        this.ex.setText(jpq.e(this.ec.getTotalTime()));
        this.dw.setText(jho.d(this.ec.getAvgSpeedType(), (float) this.ec.getAvgSpeedField()));
        this.dy.setText(jho.c(this.r, this.ec.getAvgSpeedType()));
        this.bp.setText(jpq.d((int) this.ec.getTotalCalories()));
    }

    private void ah() {
        this.dw.setVisibility(8);
        this.dy.setVisibility(8);
    }

    private void p() {
        this.ex.setText(jpq.e(this.ec.getTotalTime()));
        String strB = jho.b(this.ec.getAvgUpSlope());
        String strD = jho.d(this.ec.getCreepingWave());
        String strB2 = jho.b(this.ec.getCreepingWave());
        if (TextUtils.isEmpty(strB)) {
            this.bp.setText(strD);
            this.bq.setText(strB2);
            ah();
        } else if (TextUtils.isEmpty(strD)) {
            this.bp.setText(strB);
            this.bq.setVisibility(8);
            ah();
        } else {
            this.dw.setText(strB);
            this.dy.setVisibility(8);
            this.bp.setText(strD);
            this.bq.setText(strB2);
        }
    }

    private void bi() {
        if (this.r.getSharedPreferences("retrack_file", 0).getBoolean("has_use_personalized_map", false)) {
            return;
        }
        this.x.setVisibility(0);
    }

    private void aq() {
        SharedPreferences sharedPreferences = this.r.getSharedPreferences("retrack_file", 0);
        String string = sharedPreferences.getString(jho.d(this.cm), jho.a(this.cm));
        if (this.p == null) {
            this.p = jho.d(string);
        }
        int i = this.cm;
        if (i == 1) {
            this.t = (jes) new Gson().fromJson(sharedPreferences.getString("track_gaode_custom_map_69", null), jes.class);
            this.bo = sharedPreferences.getInt("track_mode_custom_map_position_69", -1);
        } else if (i == 2) {
            this.t = (jes) new Gson().fromJson(sharedPreferences.getString("new_track_google_custom_map", null), jes.class);
            this.bo = sharedPreferences.getInt("new_track_goolge_custom_map_position", -1);
        } else if (i == 3) {
            this.t = (jes) new Gson().fromJson(sharedPreferences.getString("new_track_hms_custom_map", null), jes.class);
            this.bo = sharedPreferences.getInt("new_track_hms_custom_map_position", -1);
        }
        this.ce.changeMapType(this.p, this.t);
        String string2 = sharedPreferences.getString("new_track_mode_custom_mark", null);
        this.bw = sharedPreferences.getInt("new_track_mode_custom_mark_position", -1);
        jeq jeqVar = (jeq) new Gson().fromJson(string2, jeq.class);
        this.w = jeqVar;
        this.ce.setCustomMarkInfo(jeqVar);
        this.bu = this.bo;
        this.bs = this.t;
        this.bt = this.p;
        this.cb = this.bw;
        this.bv = this.w;
        this.ce.reset();
        e(this.p, this.t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ba() {
        SharedPreferences.Editor editorEdit = this.r.getSharedPreferences("retrack_file", 0).edit();
        int i = this.cm;
        if (i == 1) {
            editorEdit.putString("track_gaode_custom_map_69", new Gson().toJson(this.t));
            editorEdit.putInt("track_mode_custom_map_position_69", this.bo);
        } else if (i == 2) {
            editorEdit.putString("new_track_google_custom_map", new Gson().toJson(this.t));
            editorEdit.putInt("new_track_goolge_custom_map_position", this.bo);
        } else if (i == 3) {
            editorEdit.putString("new_track_hms_custom_map", new Gson().toJson(this.t));
            editorEdit.putInt("new_track_hms_custom_map_position", this.bo);
        }
        editorEdit.putString("new_track_mode_custom_mark", new Gson().toJson(this.w));
        editorEdit.putInt("new_track_mode_custom_mark_position", this.bw);
        editorEdit.commit();
        this.bu = this.bo;
        this.bt = this.p;
        this.bs = this.t;
        this.bv = this.w;
        this.cb = this.bw;
    }

    private void a(int i) {
        LogUtil.a("Track_DynamicTrackActivity", "TextColor is ", Integer.valueOf(i));
        this.fe.setTextColor(i);
        this.aq.setTextColor(i);
        this.ew.setTextColor(i);
        this.ag.setTextColor(i);
        this.ad.setTextColor(i);
        this.ex.setTextColor(i);
        this.al.setTextColor(i);
        this.ak.setTextColor(i);
        this.an.setTextColor(i);
        this.am.setTextColor(i);
        this.ap.setTextColor(i);
        this.aj.setTextColor(i);
        this.dw.setTextColor(i);
        this.dy.setTextColor(i);
        this.bp.setTextColor(i);
        this.bq.setTextColor(i);
        this.ct.setTextColor(i);
        this.cz.setTextColor(i);
        this.dg.setTextColor(i);
        this.f2do.setTextColor(i);
        this.dc.setTextColor(i);
        this.au.setTextColor(i);
        this.dk.setTextColor(i);
        this.el.setTextColor(i);
        this.n.setTextColor(i);
        this.d.setTextColor(i);
        this.et.setBackground(qqf.c(this.r.getResources().getDrawable(jho.h(this.ec.getSportType())), i));
        this.cj.setTextColor(i);
        if (i == -1) {
            this.y.setTextColor(this.r.getResources().getColor(R.color.common_white_60alpha));
            this.cd.setTextColor(this.r.getResources().getColor(R.color.common_white_60alpha));
            this.ax.setImageDrawable(this.r.getResources().getDrawable(R.drawable.healthlogo_retrack_dark));
        } else {
            this.y.setTextColor(i);
            this.cd.setTextColor(i);
            this.ax.setImageDrawable(this.r.getResources().getDrawable(R.drawable.healthlogo_retrack_light));
        }
    }

    private void c(double d) {
        this.ag.setText(jho.b(d, this.r));
        this.ad.setText(jho.d(this.r));
    }

    private void ak() {
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
            final View decorView = getWindow().getDecorView();
            if (decorView == null) {
                LogUtil.e("Track_DynamicTrackActivity", "decorView is null.");
            } else {
                decorView.setSystemUiVisibility(1280);
                decorView.post(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.DynamicTrackActivity.3
                    @Override // java.lang.Runnable
                    public void run() {
                        WindowInsets rootWindowInsets = decorView.getRootWindowInsets();
                        if (rootWindowInsets == null) {
                            LogUtil.e("Track_DynamicTrackActivity", "windowInsets is null");
                            return;
                        }
                        DisplayCutout displayCutout = rootWindowInsets.getDisplayCutout();
                        if (displayCutout == null) {
                            LogUtil.e("Track_DynamicTrackActivity", "displayCutout is null.");
                            return;
                        }
                        DynamicTrackActivity.this.ej = displayCutout.getSafeInsetTop();
                        DynamicTrackActivity dynamicTrackActivity = DynamicTrackActivity.this;
                        dynamicTrackActivity.ai = (ConstraintLayout) dynamicTrackActivity.findViewById(R.id.retrack_content);
                        if (DynamicTrackActivity.this.ai.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) DynamicTrackActivity.this.ai.getLayoutParams();
                            layoutParams.topMargin = DynamicTrackActivity.this.ej;
                            DynamicTrackActivity.this.ai.setLayoutParams(layoutParams);
                        }
                        LogUtil.a("Track_DynamicTrackActivity", "current notch screen height is: ", Integer.valueOf(DynamicTrackActivity.this.ej));
                    }
                });
            }
        }
    }

    private void at() {
        ag();
        af();
        aw();
        av();
        ai();
        ao();
        ap();
        ax();
        al();
        as();
        ar();
    }

    private void ap() {
        this.eu = (ImageView) findViewById(R.id.track_photo1);
        this.ez = (ImageView) findViewById(R.id.track_photo2);
        this.fb = (ImageView) findViewById(R.id.track_photo3);
        this.fc = (VideoView) findViewById(R.id.track_video);
        this.fd = (FrameLayout) findViewById(R.id.track_photo_background);
    }

    private void ag() {
        this.eh = findViewById(R.id.root_view);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.retrack_content);
        this.ai = constraintLayout;
        constraintLayout.setVisibility(8);
        this.h = (LinearLayout) findViewById(R.id.dynamic_track_background_layout);
        this.g = (LinearLayout) findViewById(R.id.dynamic_track_bottom_mask);
        this.ca = (RelativeLayout) findViewById(R.id.retrack_detail_map_londing_rl);
        ImageView imageView = (ImageView) findViewById(R.id.sport_track_map_mask);
        this.ck = imageView;
        if (this.cm == 2) {
            imageView.setVisibility(8);
        }
        this.cj = (HealthTextView) findViewById(R.id.retrack_map_logo);
    }

    private void af() {
        this.cg = (LinearLayout) findViewById(R.id.retrack_health_logo_ll);
        this.cd = (HealthTextView) findViewById(R.id.retrack_logo_text);
        this.ax = (ImageView) findViewById(R.id.retrack_logo);
    }

    private void av() {
        ImageButton imageButton = (ImageButton) findViewById(R.id.retrack_start_retrack);
        this.l = imageButton;
        imageButton.setOnClickListener(this.k);
        this.ch = (LinearLayout) findViewById(R.id.map_play_guide_layout);
        this.ci = (HealthTextView) findViewById(R.id.map_play_guide);
        am();
        ImageView imageView = (ImageView) findViewById(R.id.retrack_back_btn);
        this.o = imageView;
        imageView.setOnClickListener(this.k);
        ImageView imageView2 = (ImageView) findViewById(R.id.track_edit_ok_btn);
        this.m = imageView2;
        imageView2.setImageDrawable(this.r.getResources().getDrawable(R.drawable.trackalbum_ic_ok));
        this.m.setOnClickListener(this.k);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.map_style_guide_layout);
        this.x = linearLayout;
        linearLayout.setOnClickListener(this.k);
        HealthButton healthButton = (HealthButton) findViewById(R.id.track_personalized_btn);
        this.dz = healthButton;
        healthButton.setOnClickListener(this.k);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.switch_layout);
        this.ep = linearLayout2;
        qsp.c((View) linearLayout2, 8);
        this.eb = (HealthTextView) findViewById(R.id.premium_edition_text);
        this.j = (HealthTextView) findViewById(R.id.basic_edition_text);
        this.fj = (ImageView) findViewById(R.id.vip_mark);
        this.ep.setOnClickListener(this.k);
    }

    private void ai() {
        this.ae = (DynamicCurve) findViewById(R.id.dynamicCurve);
        this.u = (RelativeLayout) findViewById(R.id.retrack_curve_title_rl);
        this.y = (HealthTextView) findViewById(R.id.retrack_curve_title);
    }

    private void ao() {
        this.ag = (HealthTextView) findViewById(R.id.retrack_distance_value);
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(this.r.getAssets(), "fonts/hw-italic.ttf");
        this.ex = (HealthTextView) findViewById(R.id.retrack_time_value);
        this.al = (HealthTextView) findViewById(R.id.retrack_day_value_exp);
        this.ak = (HealthTextView) findViewById(R.id.retrack_day_unit_exp);
        this.an = (HealthTextView) findViewById(R.id.retrack_hour_value_exp);
        this.am = (HealthTextView) findViewById(R.id.retrack_hour_unit_exp);
        this.ap = (HealthTextView) findViewById(R.id.retrack_min_value_exp);
        this.aj = (HealthTextView) findViewById(R.id.retrack_min_unit_exp);
        this.dw = (HealthTextView) findViewById(R.id.retrack_pace_value);
        this.bp = (HealthTextView) findViewById(R.id.retrack_kcal_value);
        this.ad = (HealthTextView) findViewById(R.id.retrack_distance_unit);
        this.ey = (RelativeLayout) findViewById(R.id.retrack_time_rl);
        this.eq = (LinearLayout) findViewById(R.id.retrack_time_rl_exp);
        this.dv = (RelativeLayout) findViewById(R.id.retrack_pace_rl);
        this.bn = (RelativeLayout) findViewById(R.id.retrack_kcal_rl);
        this.cy = (LinearLayout) findViewById(R.id.retrack_max_data_ll);
        this.f = (LinearLayout) findViewById(R.id.retrack_barrage_ll);
        this.et = (ImageView) findViewById(R.id.retrack_sport_type);
        this.du = (RelativeLayout) findViewById(R.id.retrack_other_data_rl);
        this.z = (LinearLayout) findViewById(R.id.retrack_distance_ll);
        this.et.setBackground(this.r.getResources().getDrawable(jho.h(this.ec.getSportType())));
        this.dy = (HealthTextView) findViewById(R.id.retrack_pace_unit);
        this.bq = (HealthTextView) findViewById(R.id.retrack_kcal_unit);
        if (BaseActivity.isSumsung()) {
            this.ag.setTypeface(typefaceCreateFromAsset, 1);
            this.ex.setTypeface(typefaceCreateFromAsset, 1);
            this.al.setTypeface(typefaceCreateFromAsset, 1);
            this.an.setTypeface(typefaceCreateFromAsset, 1);
            this.ap.setTypeface(typefaceCreateFromAsset, 1);
            this.dw.setTypeface(typefaceCreateFromAsset, 1);
            this.bp.setTypeface(typefaceCreateFromAsset, 1);
            return;
        }
        this.ag.setTypeface(typefaceCreateFromAsset);
        this.ex.setTypeface(typefaceCreateFromAsset);
        this.al.setTypeface(typefaceCreateFromAsset);
        this.an.setTypeface(typefaceCreateFromAsset);
        this.ap.setTypeface(typefaceCreateFromAsset);
        this.dw.setTypeface(typefaceCreateFromAsset);
        this.bp.setTypeface(typefaceCreateFromAsset);
    }

    private void aw() {
        this.ff = (ImageView) findViewById(R.id.retrack_user_header);
        this.fe = (HealthTextView) findViewById(R.id.retrack_user_name);
        this.ew = (HealthTextView) findViewById(R.id.retrack_track_date);
        this.aq = (HealthTextView) findViewById(R.id.retrack_gps_source);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        this.fe.setTextColor(i);
        this.ew.setTextColor(i);
        this.aq.setTextColor(i);
    }

    public void initViewSelectLayout(View view) {
        if (view == null) {
            LogUtil.e("Track_DynamicTrackActivity", "[initViewSelectLayout] view is null");
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.retrack_view_north_up);
        this.ds = relativeLayout;
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: jjj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f38674a.d(view2);
            }
        });
        RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(R.id.retrack_view_follow_route);
        this.as = relativeLayout2;
        relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: jjg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.e.e(view2);
            }
        });
        this.fl = (LinearLayout) view.findViewById(R.id.retrack_play_video_type_layout);
        this.fk = (HealthTextView) view.findViewById(R.id.track_save_video_title);
        HealthTextView healthTextView = (HealthTextView) this.fl.findViewById(R.id.one_type);
        HealthTextView healthTextView2 = (HealthTextView) this.fl.findViewById(R.id.other_type);
        healthTextView.setText(getString(R.string.IDS_track_video_play_standard, new Object[]{720}));
        healthTextView2.setText(getString(R.string.IDS_track_video_play_hd, new Object[]{1080}));
        RelativeLayout relativeLayout3 = (RelativeLayout) this.fl.findViewById(R.id.standard_video);
        this.es = relativeLayout3;
        relativeLayout3.setOnClickListener(new View.OnClickListener() { // from class: jji
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f38673c.b(view2);
            }
        });
        RelativeLayout relativeLayout4 = (RelativeLayout) this.fl.findViewById(R.id.hd_video);
        this.aw = relativeLayout4;
        relativeLayout4.setOnClickListener(new View.OnClickListener() { // from class: jjm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f38676c.g(view2);
            }
        });
        HealthRadioButton healthRadioButton = (HealthRadioButton) view.findViewById(R.id.retrack_view_north_up_radioButton);
        this.dr = healthRadioButton;
        healthRadioButton.setClickable(false);
        HealthRadioButton healthRadioButton2 = (HealthRadioButton) view.findViewById(R.id.retrack_view_follow_route_radioButton);
        this.ar = healthRadioButton2;
        healthRadioButton2.setClickable(false);
        HealthRadioButton healthRadioButton3 = (HealthRadioButton) this.fl.findViewById(R.id.save_to_my_route_radio_button);
        this.er = healthRadioButton3;
        healthRadioButton3.setClickable(false);
        this.av = (HealthRadioButton) this.fl.findViewById(R.id.rb_export_route);
        this.er.setChecked(false);
        this.av.setChecked(false);
        this.av.setClickable(false);
        HealthCheckBox healthCheckBox = (HealthCheckBox) view.findViewById(R.id.retrack_view_area_checkBox);
        this.e = healthCheckBox;
        healthCheckBox.setClickable(false);
        c(view);
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        b(this.dr, this.ar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        b(this.ar, this.dr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.ba = false;
        b(this.er, this.av);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(View view) {
        this.ba = true;
        b(this.av, this.er);
    }

    private void c(View view) {
        this.i = (HealthDivider) view.findViewById(R.id.retrack_view_area_divider);
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.retrack_view_area);
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: jja
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f38669a.a(view2);
            }
        });
        if (this.cm == 1) {
            this.i.setVisibility(8);
            relativeLayout.setVisibility(8);
            this.bi = false;
            InterfaceReTrack interfaceReTrack = this.ce;
            if (interfaceReTrack != null) {
                interfaceReTrack.setIsSupportArea(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        HealthCheckBox healthCheckBox = this.e;
        if (healthCheckBox != null) {
            healthCheckBox.setChecked(!healthCheckBox.isChecked());
        }
    }

    private void b(HealthRadioButton healthRadioButton, HealthRadioButton healthRadioButton2) {
        if (healthRadioButton != null) {
            healthRadioButton.setChecked(true);
        }
        if (healthRadioButton2 != null) {
            healthRadioButton2.setChecked(false);
        }
    }

    private void bd() {
        SharedPreferences.Editor editorEdit = this.r.getSharedPreferences("retrack_file", 0).edit();
        InterfaceReTrack interfaceReTrack = this.ce;
        if (interfaceReTrack != null) {
            interfaceReTrack.setIsSupportArea(this.bi);
        }
        editorEdit.putBoolean("retrack_area_key", this.bi);
        editorEdit.commit();
    }

    private void ar() {
        SharedPreferences sharedPreferences = this.r.getSharedPreferences("retrack_file", 0);
        this.fa = sharedPreferences.getString("retrack_mode_key", "retrack_mode_complex");
        this.bi = sharedPreferences.getBoolean("retrack_area_key", true);
        this.br = sharedPreferences.getBoolean("retrack_play_mode_tip_key", false);
        this.ba = sharedPreferences.getBoolean("retrack_play_mode_key", false);
    }

    private void as() {
        this.em = (ShareSelector) findViewById(R.id.share_selector);
        if (Utils.o()) {
            this.em.setShareWeChatFriendsVisibility(8);
            this.em.setShareWeChatVisibility(8);
            this.em.setSinaVisibility(8);
            this.em.setFamilyVisibility(8);
            this.em.setLocalShareVisibility(8);
            this.em.setXHSShareVisibility(8);
            this.em.setDouYinShareVisibility(8);
        } else {
            this.em.setMoreVisibility(8);
        }
        this.em.setClickCallback(new ShareSelectorClickCallback() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.DynamicTrackActivity.1
            @Override // com.huawei.healthcloud.plugintrack.trackanimation.shareselector.ShareSelectorClickCallback
            public void onWeChatShare() {
                DynamicTrackActivity.this.e(1);
            }

            @Override // com.huawei.healthcloud.plugintrack.trackanimation.shareselector.ShareSelectorClickCallback
            public void onWeChatFriendShare() {
                DynamicTrackActivity.this.e(2);
            }

            @Override // com.huawei.healthcloud.plugintrack.trackanimation.shareselector.ShareSelectorClickCallback
            public void onSinaShare() {
                DynamicTrackActivity.this.e(3);
            }

            @Override // com.huawei.healthcloud.plugintrack.trackanimation.shareselector.ShareSelectorClickCallback
            public void onFamilyShare() {
                DynamicTrackActivity.this.e(11);
            }

            @Override // com.huawei.healthcloud.plugintrack.trackanimation.shareselector.ShareSelectorClickCallback
            public void onLocalShare() {
                DynamicTrackActivity.this.e(12);
            }

            @Override // com.huawei.healthcloud.plugintrack.trackanimation.shareselector.ShareSelectorClickCallback
            public void onXHSShare() {
                DynamicTrackActivity.this.e(13);
            }

            @Override // com.huawei.healthcloud.plugintrack.trackanimation.shareselector.ShareSelectorClickCallback
            public void onDouYinShare() {
                DynamicTrackActivity.this.e(14);
            }

            @Override // com.huawei.healthcloud.plugintrack.trackanimation.shareselector.ShareSelectorClickCallback
            public void onMoreShare() {
                DynamicTrackActivity.this.e(5);
            }
        });
    }

    private void bj() {
        if (this.bx == null) {
            this.bx = CommonDialog21.b(this.r);
        }
        this.bx.setCancelable(false);
        this.bx.b(this.r.getString(R.string.IDS_sns_waiting));
        this.bx.c();
    }

    private void q() {
        CommonDialog21 commonDialog21 = this.bx;
        if (commonDialog21 == null || !commonDialog21.isShowing()) {
            return;
        }
        this.bx.dismiss();
        this.bx = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        jhh.e(this.r, this.ec.getSportType(), this.bb, i);
        if (!CommonUtil.ab(this.r)) {
            qpx.e(BaseApplication.getContext(), getString(R.string.IDS_connect_error));
            return;
        }
        if (i == 12) {
            if (this.ei == null) {
                this.ei = new jfz(this, this);
            }
            this.ei.f();
            return;
        }
        if (i == 5) {
            this.ah.c(this.ei.a(), this.ec.getSportType(), "shareSystem", this.ei.d());
            return;
        }
        if (i == 11) {
            bj();
            this.ah.c(this.ei.a(), this.ec.getSportType(), "sharefamily", this.ei.d());
            return;
        }
        if (i == 13) {
            this.ah.c(this.ei.a(), this.ec.getSportType(), "shareXHS", this.ei.d());
            return;
        }
        if (i == 14) {
            this.ah.c(this.ei.a(), this.ec.getSportType(), "shareDouYin", this.ei.d());
            return;
        }
        if (Utils.b(this.r, d(i))) {
            if (i == 2 || i == 3) {
                b(i);
                return;
            } else {
                if (i == 1) {
                    this.ah.c(this.ei.a(), this.ec.getSportType(), "shareWeChat", this.ei.d());
                    return;
                }
                return;
            }
        }
        if (i == 1 || i == 2) {
            qpx.e(BaseApplication.getContext(), R.string.IDS_plugin_socialshare_install_wechat);
        } else if (i == 3) {
            qpx.e(BaseApplication.getContext(), R.string.IDS_plugin_socialshare_install_weibo);
        }
    }

    private void b(final int i) {
        String string;
        String string2;
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this);
        if (i == 3) {
            string = getString(R.string.IDS_goto_weibo);
            string2 = getString(R.string.IDS_dynamic_share_notification_weibo);
        } else if (i != 2) {
            string = "";
            string2 = "";
        } else {
            string = getString(R.string.IDS_goto_we_chat);
            string2 = getString(R.string.IDS_dynamic_share_notification);
        }
        if (TextUtils.isEmpty(string2)) {
            return;
        }
        builder.a(string2);
        builder.a(string, new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.DynamicTrackActivity.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int i2 = i;
                if (i2 == 3) {
                    DynamicTrackActivity.this.u();
                } else if (i2 == 2) {
                    DynamicTrackActivity.this.x();
                }
            }
        });
        builder.d(getString(R.string.IDS_user_permission_know), new View.OnClickListener(this) { // from class: com.huawei.healthcloud.plugintrack.ui.activity.DynamicTrackActivity.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    private String d(int i) {
        if (i == 1 || i == 2) {
            return "com.tencent.mm";
        }
        if (i == 3) {
            return "com.sina.weibo";
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        try {
            Intent intent = new Intent();
            ComponentName componentName = new ComponentName("com.tencent.mm", "com.tencent.mm.ui.LauncherUI");
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.addFlags(268435456);
            intent.setComponent(componentName);
            startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            LogUtil.e("Track_DynamicTrackActivity", LogAnonymous.b(e2));
            qpx.e(BaseApplication.getContext(), R.string.IDS_plugin_socialshare_install_wechat);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        try {
            Intent intent = new Intent();
            intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse("sinaweibo://splash"));
            intent.addFlags(268435456);
            startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            LogUtil.e("Track_DynamicTrackActivity", LogAnonymous.b(e2));
            qpx.e(BaseApplication.getContext(), R.string.IDS_plugin_socialshare_install_weibo);
        }
    }

    private void ax() {
        View viewInflate = View.inflate(this.r, R.layout.retrack_video_select, null);
        this.fn = viewInflate;
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.retrack_normal_video_rl);
        this.eo = relativeLayout;
        relativeLayout.setOnClickListener(this.k);
        RelativeLayout relativeLayout2 = (RelativeLayout) this.fn.findViewById(R.id.retrack_fast_video_rl);
        this.ek = relativeLayout2;
        relativeLayout2.setOnClickListener(this.k);
        this.ao = (HealthTextView) this.fn.findViewById(R.id.retrack_videotype_fast);
        if (CommonUtil.bv()) {
            this.ao.setText(this.r.getString(R.string.IDS_retrack_video_short_no_time));
        } else {
            this.ao.setText(this.r.getString(R.string.IDS_retrack_video_short, 15));
        }
    }

    public void initMapTypeLayout(View view) {
        this.ac = (HealthRecycleView) view.findViewById(R.id.map_custom_style_select);
        this.ab = (HealthRecycleView) view.findViewById(R.id.track_custom_style_select);
        this.aa = (LinearLayout) view.findViewById(R.id.custom_mark_title);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void an() {
        CustomMapStyleAdapter customMapStyleAdapterT = t();
        HealthLinearLayoutManager healthLinearLayoutManager = new HealthLinearLayoutManager(this);
        healthLinearLayoutManager.setOrientation(0);
        this.ac.setLayoutManager(healthLinearLayoutManager);
        this.ac.setAdapter(customMapStyleAdapterT);
        if (njy.e(this.cn)) {
            LogUtil.e("Track_DynamicTrackActivity", "mMarkInfo data is null ");
            this.ab.setVisibility(8);
            this.aa.setVisibility(8);
            return;
        }
        this.ab.setVisibility(0);
        this.aa.setVisibility(0);
        CustomMapStyleAdapter customMapStyleAdapterR = r();
        HealthLinearLayoutManager healthLinearLayoutManager2 = new HealthLinearLayoutManager(this);
        healthLinearLayoutManager2.setOrientation(0);
        this.ab.setLayoutManager(healthLinearLayoutManager2);
        this.ab.setAdapter(customMapStyleAdapterR);
    }

    private CustomMapStyleAdapter r() {
        CustomMapStyleAdapter customMapStyleAdapter = new CustomMapStyleAdapter(this.r, this.cn, this.bw, new MapInteractor.MapItemClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.DynamicTrackActivity.6
            @Override // com.huawei.healthcloud.plugintrack.ui.activity.interactor.MapInteractor.MapItemClickListener
            public void onClickListener(Object obj, int i) {
                if (!(obj instanceof jeq)) {
                    LogUtil.j("Track_DynamicTrackActivity", "object is not mark");
                    return;
                }
                jeq jeqVar = (jeq) obj;
                DynamicTrackActivity.this.bw = i;
                DynamicTrackActivity.this.v = "";
                if (!TextUtils.isEmpty(jeqVar.c())) {
                    DynamicTrackActivity.this.w = null;
                } else {
                    DynamicTrackActivity.this.w = jeqVar;
                    DynamicTrackActivity dynamicTrackActivity = DynamicTrackActivity.this;
                    dynamicTrackActivity.v = dynamicTrackActivity.w.e();
                }
                DynamicTrackActivity.this.ce.setCustomMarkInfo(DynamicTrackActivity.this.w);
                DynamicTrackActivity.this.ce.resetLine();
                jhh.d(DynamicTrackActivity.this.r, DynamicTrackActivity.this.v(), DynamicTrackActivity.this.s);
            }
        });
        this.cq = customMapStyleAdapter;
        return customMapStyleAdapter;
    }

    private CustomMapStyleAdapter t() {
        CustomMapStyleAdapter customMapStyleAdapter = new CustomMapStyleAdapter(this.r, this.cl, this.bo, this.p, this.cm, new MapInteractor.MapItemClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.DynamicTrackActivity.10
            @Override // com.huawei.healthcloud.plugintrack.ui.activity.interactor.MapInteractor.MapItemClickListener
            public void onClickListener(Object obj, int i) {
                if (!(obj instanceof jes)) {
                    LogUtil.j("Track_DynamicTrackActivity", "object is not map");
                } else if (DynamicTrackActivity.this.bo == i) {
                    LogUtil.j("Track_DynamicTrackActivity", "onClickListener: click repeated");
                } else {
                    DynamicTrackActivity.this.a(i, (jes) obj);
                }
            }
        });
        this.bo = customMapStyleAdapter.c();
        return customMapStyleAdapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, jes jesVar) {
        this.bm = true;
        this.bo = i;
        this.t = jesVar;
        if (!TextUtils.isEmpty(jesVar.a())) {
            this.p = jho.c(jesVar.b());
        } else {
            this.p = MapTypeDescription.MapType.MAP_TYPE_CUSTOM;
        }
        a(this.p, this.t);
        e(jesVar);
        InterfaceReTrack interfaceReTrack = this.ce;
        if (interfaceReTrack != null) {
            interfaceReTrack.reset();
        }
        b(jesVar);
    }

    private void e(jes jesVar) {
        InterfaceReTrack interfaceReTrack;
        this.bb = jesVar.n();
        CustomMapStyleAdapter customMapStyleAdapter = this.cq;
        int itemCount = customMapStyleAdapter != null ? customMapStyleAdapter.getItemCount() : 0;
        if (this.bb) {
            this.cm = 3;
            if (3 != this.ea) {
                b((Bundle) null);
            }
            if (njy.c(this.cn, 0) && this.cq != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.cn.get(0));
                this.cq.c(arrayList);
                this.w = null;
                this.bw = 0;
            }
        } else {
            if (this.cm != this.ea) {
                LogUtil.a("Track_DynamicTrackActivity", "onClickListener: loadMap mMapType = ", this.cm + " mPreMapType = ", Integer.valueOf(this.ea));
                this.cm = this.ea;
                b((Bundle) null);
            }
            CustomMapStyleAdapter customMapStyleAdapter2 = this.cq;
            if (customMapStyleAdapter2 != null) {
                customMapStyleAdapter2.c(this.cn);
            }
        }
        CustomMapStyleAdapter customMapStyleAdapter3 = this.cq;
        if (customMapStyleAdapter3 == null || itemCount == customMapStyleAdapter3.getItemCount() || (interfaceReTrack = this.ce) == null) {
            return;
        }
        interfaceReTrack.setCustomMarkInfo(this.w);
        this.ce.resetLine();
    }

    private void b(jes jesVar) {
        this.q = jesVar.j();
        this.s = String.valueOf(jesVar.b());
        jhh.d(this.r, v(), this.s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public jhn v() {
        jhn jhnVar = new jhn();
        jhnVar.e(this.ec.getSportType());
        jhnVar.a(!"retrack_mode_complex".equals(this.fa) ? 1 : 0);
        jhnVar.b(this.en);
        jhnVar.a(this.v);
        return jhnVar;
    }

    private void al() {
        View viewInflate = View.inflate(this.r, R.layout.retrack_max_heartrate, null);
        if (viewInflate instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) viewInflate;
            this.dd = frameLayout;
            this.de = (ImageView) frameLayout.findViewById(R.id.retrack_max_heartrate_frame);
            this.df = (LinearLayout) this.dd.findViewById(R.id.retrack_max_heartrate_text_ll);
            this.dc = (HealthTextView) this.dd.findViewById(R.id.retrack_max_heartrate_value);
            this.au = (HealthTextView) this.dd.findViewById(R.id.retrack_max_heartrate_unit);
            e(this.de, R.drawable.retrack_ic_max_heartrate);
        }
        View viewInflate2 = View.inflate(this.r, R.layout.retrack_max_pace, null);
        if (viewInflate2 instanceof FrameLayout) {
            FrameLayout frameLayout2 = (FrameLayout) viewInflate2;
            this.di = frameLayout2;
            this.db = (ImageView) frameLayout2.findViewById(R.id.retrack_max_pace_frame);
            this.dj = (LinearLayout) this.di.findViewById(R.id.retrack_max_pace_text_ll);
            this.dg = (HealthTextView) this.di.findViewById(R.id.retrack_max_pace_value);
            this.dk = (HealthTextView) this.di.findViewById(R.id.retrack_max_pace_unit);
            e(this.db, R.drawable.retrack_ic_max_pace);
        }
        View viewInflate3 = View.inflate(this.r, R.layout.retrack_max_speed, null);
        if (viewInflate3 instanceof FrameLayout) {
            FrameLayout frameLayout3 = (FrameLayout) viewInflate3;
            this.dl = frameLayout3;
            this.dh = (ImageView) frameLayout3.findViewById(R.id.retrack_max_speed_frame);
            this.dp = (LinearLayout) this.dl.findViewById(R.id.retrack_max_speed_text_ll);
            this.f2do = (HealthTextView) this.dl.findViewById(R.id.retrack_max_speed_value);
            this.el = (HealthTextView) this.dl.findViewById(R.id.retrack_max_speed_unit);
            e(this.dh, R.drawable.retrack_ic_max_speed);
        }
        View viewInflate4 = View.inflate(this.r, R.layout.retrack_max_cadence, null);
        if (viewInflate4 instanceof FrameLayout) {
            FrameLayout frameLayout4 = (FrameLayout) viewInflate4;
            this.cx = frameLayout4;
            this.cw = (ImageView) frameLayout4.findViewById(R.id.retrack_max_cadence_frame);
            this.da = (LinearLayout) this.cx.findViewById(R.id.retrack_max_cadence_text_ll);
            this.cz = (HealthTextView) this.cx.findViewById(R.id.retrack_max_cadence_value);
            this.n = (HealthTextView) this.cx.findViewById(R.id.retrack_max_cadence_unit);
            e(this.cw, R.drawable.retrack_ic_max_cadence);
        }
        View viewInflate5 = View.inflate(this.r, R.layout.retrack_max_altitude, null);
        if (viewInflate5 instanceof FrameLayout) {
            FrameLayout frameLayout5 = (FrameLayout) viewInflate5;
            this.cu = frameLayout5;
            this.cr = (ImageView) frameLayout5.findViewById(R.id.retrack_max_altitude_frame);
            this.cv = (LinearLayout) this.cu.findViewById(R.id.retrack_max_altitude_text_ll);
            this.ct = (HealthTextView) this.cu.findViewById(R.id.retrack_max_altitude_value);
            this.d = (HealthTextView) this.cu.findViewById(R.id.retrack_max_altitude_unit);
            e(this.cr, R.drawable.retrack_ic_max_altitude);
        }
    }

    private void e(ImageView imageView, int i) {
        if (LanguageUtil.ba(getApplicationContext())) {
            BitmapDrawable bitmapDrawableE = qqz.e(getApplicationContext(), i);
            if (bitmapDrawableE != null) {
                imageView.setImageDrawable(bitmapDrawableE);
                return;
            }
            return;
        }
        imageView.setImageResource(i);
    }

    private void g(boolean z) {
        if (!jho.b() && Build.VERSION.SDK_INT > 34) {
            LogUtil.a("Track_DynamicTrackActivity", "sendDynamicTrackBroadcast state:", Boolean.valueOf(z));
            Intent intent = new Intent();
            intent.setPackage(this.r.getPackageName());
            intent.setAction("com.huawei.health.dynamic_track");
            if (z) {
                intent.putExtra("DynamicTrackTime", this.ce.getTotalDuration());
            }
            intent.putExtra("DynamicTrackState", z);
            this.r.sendBroadcast(intent, LocalBroadcast.f36595c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void br() {
        ReleaseLogUtil.d("Track_DynamicTrackActivity", "startRetrack");
        getWindow().addFlags(128);
        if (this.bk) {
            LogUtil.a("Track_DynamicTrackActivity", "click too fast, return.");
            return;
        }
        this.f10803a = new e();
        this.bk = true;
        this.dn.sendEmptyMessage(1);
        this.dq.e();
        this.ce.startReTrack();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a("Track_DynamicTrackActivity", "onActivityResult.");
        if (i2 == -1) {
            if (i == 5) {
                if (intent != null) {
                    d(intent);
                    return;
                }
                return;
            }
            if (i != 6) {
                if (i == 101 && this.ei != null) {
                    g(true);
                    this.ei.b(i2, intent, this.bj ? this.ba : false);
                    this.bc = true;
                    jhh.a(this.r, this.ec.getSportType(), this.bb, this.ei.c(), this.ba ? 1 : 0);
                    br();
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            Message messageObtain = Message.obtain();
            messageObtain.what = 528;
            messageObtain.obj = arrayList;
            this.dn.sendMessage(messageObtain);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        LogUtil.a("Track_DynamicTrackActivity", "onWindowFocusChanged,isHasFocus= ", Boolean.valueOf(z), Boolean.valueOf(this.be));
        super.onWindowFocusChanged(z);
        if (z) {
            jho.c((Activity) this);
            if (this.be && CommonUtil.ab(this.r)) {
                this.dt.e(false);
                LogUtil.a("Track_DynamicTrackActivity", "download music");
                this.cc.b();
            }
            this.be = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        new AlphaAnimation(0.0f, 1.0f).setDuration(400L);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(400L);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.DynamicTrackActivity.8
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                LogUtil.a("Track_DynamicTrackActivity", "handleStartViewVisible animationEnd");
                if (!DynamicTrackActivity.this.bk) {
                    LogUtil.a("Track_DynamicTrackActivity", "mIsPlayingTrack is false");
                    return;
                }
                DynamicTrackActivity.this.ch.setVisibility(8);
                DynamicTrackActivity.this.dz.setVisibility(8);
                DynamicTrackActivity.this.ep.setVisibility(8);
                DynamicTrackActivity.this.o.setVisibility(8);
                DynamicTrackActivity.this.em.setVisibility(8);
                DynamicTrackActivity.this.x.setVisibility(8);
            }
        });
        this.ch.startAnimation(alphaAnimation);
        this.dz.startAnimation(alphaAnimation);
        this.o.startAnimation(alphaAnimation);
        if (this.x.getVisibility() == 0) {
            this.x.startAnimation(alphaAnimation);
        }
        this.h.setClickable(true);
    }

    private void ac() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(400L);
        new AlphaAnimation(1.0f, 0.0f).setDuration(400L);
        this.ch.setVisibility(0);
        am();
        if (this.bl) {
            b(alphaAnimation);
            e(alphaAnimation);
        }
        this.o.setVisibility(0);
        this.f.setVisibility(8);
        this.ch.startAnimation(alphaAnimation);
        this.o.startAnimation(alphaAnimation);
        this.h.setClickable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aa() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        this.ai.setVisibility(0);
        this.ai.startAnimation(alphaAnimation);
        this.ay.setVisibility(0);
        this.ae.setVisibility(8);
        this.u.setVisibility(8);
        this.cy.setVisibility(8);
        this.f.setVisibility(8);
        this.cg.setVisibility(8);
        this.ca.setVisibility(8);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(500L);
        alphaAnimation2.setAnimationListener(new Animation.AnimationListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.DynamicTrackActivity.13
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                DynamicTrackActivity.this.ck.setVisibility(8);
            }
        });
        this.ck.startAnimation(alphaAnimation2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ad() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(400L);
        alphaAnimation.setFillAfter(true);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(400L);
        alphaAnimation2.setFillAfter(true);
        this.eq.startAnimation(alphaAnimation2);
        this.ey.startAnimation(alphaAnimation2);
        this.dv.startAnimation(alphaAnimation2);
        this.bn.startAnimation(alphaAnimation2);
        this.ae.setVisibility(0);
        this.u.setVisibility(0);
        this.cg.setVisibility(0);
        this.cy.setVisibility(0);
        this.f.setVisibility(0);
        this.ae.startAnimation(alphaAnimation);
        this.u.startAnimation(alphaAnimation);
        this.cg.startAnimation(alphaAnimation);
        this.cy.startAnimation(alphaAnimation);
    }

    private void bm() {
        if (this.af == null) {
            this.af = new CustomTextAlertDialog.Builder(this.r).a(R.string.IDS_edit_title).b(R.string.IDS_exit_confirm).e(R.string.IDS_motiontrack_show_cancel, new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.DynamicTrackActivity.12
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    DynamicTrackActivity.this.af.dismiss();
                }
            }).a(R.string.IDS_determine, new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.DynamicTrackActivity.11
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    DynamicTrackActivity.this.finish();
                    DynamicTrackActivity.this.af.dismiss();
                }
            }).b();
        }
        this.af.show();
    }

    public void d() {
        if (CommonUtil.ab(this.r) || !jew.d().h()) {
            this.cc.d(this.co);
        } else if (jew.d().h()) {
            qpx.e(BaseApplication.getContext(), getString(R.string.IDS_connect_error));
        }
    }

    private void bh() {
        switch (this.ec.getCurveType()) {
            case 32:
                this.y.setText(R.string.IDS_retrack_curve_type_speed);
                break;
            case 33:
                this.y.setText(R.string.IDS_retrack_curve_type_altitude);
                break;
            case 34:
                this.y.setText(R.string.IDS_retrack_curve_type_cadence);
                break;
        }
    }

    public void a() {
        if (bc()) {
            return;
        }
        qpx.b(BaseApplication.getContext(), this.r.getString(R.string.IDS_connect_error));
        finish();
    }

    private boolean bc() {
        ConnectivityManager connectivityManagerN = CommonUtils.n();
        if (connectivityManagerN == null) {
            LogUtil.e("Track_DynamicTrackActivity", "connectivity is null.");
            return false;
        }
        NetworkInfo[] allNetworkInfo = connectivityManagerN.getAllNetworkInfo();
        if (allNetworkInfo == null) {
            return false;
        }
        for (NetworkInfo networkInfo : allNetworkInfo) {
            if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                return true;
            }
        }
        return false;
    }

    private void bk() {
        ab();
        jfz jfzVar = this.ei;
        if (jfzVar != null) {
            jfzVar.j();
        }
        n();
        this.dq.a();
        c(this.ec.getValidTotalDistance());
        this.h.setClickable(false);
        this.ef = 0;
    }

    private void ab() {
        this.o.setVisibility(0);
        this.ch.setVisibility(0);
        am();
        if (this.ec.getSportType() == 222) {
            this.eq.setVisibility(0);
        } else {
            this.ey.setVisibility(0);
        }
        this.eq.clearAnimation();
        this.ey.clearAnimation();
        this.dv.clearAnimation();
        this.dv.setVisibility(0);
        this.bn.clearAnimation();
        this.bn.setVisibility(0);
        this.dz.setVisibility(0);
        qsp.c((View) this.ep, 8);
        this.dz.clearAnimation();
        this.cg.clearAnimation();
        this.cg.setVisibility(8);
        this.ae.clearAnimation();
        this.u.clearAnimation();
        this.ae.setVisibility(8);
        this.u.setVisibility(8);
        this.em.setVisibility(8);
        this.cy.removeAllViews();
        this.f.removeAllViews();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MapTypeDescription.MapType mapType, jes jesVar) {
        if (jesVar == null) {
            this.ce.changeMapType(mapType, null);
            e(mapType, (jes) null);
        } else if (!TextUtils.isEmpty(jesVar.a())) {
            this.ce.changeMapType(mapType, null);
            e(mapType, (jes) null);
        } else {
            this.ce.changeMapType(mapType, jesVar);
            e(mapType, jesVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(MapTypeDescription.MapType mapType, jes jesVar) {
        LogUtil.a("Track_DynamicTrackActivity", "Current map style is ", this.p, "Current map type is ", Integer.valueOf(this.cm));
        this.bf = false;
        if (mapType == MapTypeDescription.MapType.MAP_TYPE_NORMAL || mapType == MapTypeDescription.MapType.DEFAULT_MAP_THREE_D) {
            a(-16777216);
            return;
        }
        if (mapType == MapTypeDescription.MapType.MAP_TYPE_NIGHT) {
            this.bf = true;
            a(-1);
        } else if (mapType == MapTypeDescription.MapType.MAP_TYPE_NAVI) {
            a(-16777216);
        } else if (mapType == MapTypeDescription.MapType.MAP_TYPE_CUSTOM && jesVar != null) {
            this.bf = "true".equals(jesVar.e());
            a("true".equals(jesVar.e()) ? -1 : -16777216);
        } else {
            a(-1);
        }
    }

    public static void e(boolean z) {
        f10802b = z;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.constraints.DynamicTrackContract.Iview
    public void judgeVipResult(boolean z) {
        this.bj = z;
        runOnUiThread(new Runnable() { // from class: jjb
            @Override // java.lang.Runnable
            public final void run() {
                this.d.az();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void az() {
        int i;
        int i2;
        if (this.bj) {
            qsp.c((View) this.j, 0);
            qsp.c((View) this.eb, 8);
            qsp.c((View) this.fj, 8);
            if (this.cm != 1 || (i2 = this.bo) < 2) {
                return;
            }
            this.bo = i2 + 1;
            return;
        }
        qsp.c((View) this.eb, 0);
        qsp.c((View) this.j, 8);
        qsp.c((View) this.fj, 0);
        if (this.bb) {
            a(0, this.cl.get(0));
        } else {
            if (this.cm != 1 || (i = this.bo) <= 2) {
                return;
            }
            this.bo = i - 1;
        }
    }

    public void c(String str) {
        jhh.c(this.r, this.ec.getSportType(), this.bb, str);
    }

    class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f10822a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<Integer> f10824c;
        private Pair<Integer, Double> d;
        private int e;
        private boolean j;

        private e() {
            this.f10824c = new ArrayList(10);
            this.f10822a = new a(Looper.getMainLooper(), this);
            this.j = false;
        }

        private void f() {
            if (((Integer) this.d.first).intValue() == 1) {
                this.e = 1;
                return;
            }
            if (((Integer) this.d.first).intValue() != 3) {
                if (((Integer) this.d.first).intValue() == 2) {
                    this.e = 2;
                    return;
                } else {
                    LogUtil.e("Track_DynamicTrackActivity", "dataType error.");
                    return;
                }
            }
            if (DynamicTrackActivity.this.ec.getMaxSpeedType() == 18) {
                this.e = 4;
            } else if (DynamicTrackActivity.this.ec.getMaxSpeedType() == 17) {
                this.e = 3;
            } else {
                this.e = 5;
            }
        }

        public void d(Pair<Integer, Double> pair) {
            if (pair == null) {
                LogUtil.e("Track_DynamicTrackActivity", "animateKeyDataAppear pair is null.");
                return;
            }
            this.d = pair;
            f();
            jho.d(1, 0, this.f10822a);
            jho.d(2, 300, this.f10822a);
            this.f10824c.add(Integer.valueOf(this.e));
        }

        public void c(String str) {
            DynamicTrackActivity.this.f.setVisibility(0);
            if (!this.j) {
                jho.a(DynamicTrackActivity.this.f, DynamicTrackActivity.this.bf);
                this.j = true;
            }
            jho.e(5, 0, this.f10822a, str);
        }

        public void e() {
            int i = 0;
            for (int i2 = 0; i2 < this.f10824c.size(); i2++) {
                i += 100;
                List<Integer> list = this.f10824c;
                jho.a(3, list.get((list.size() - 1) - i2), i, this.f10822a);
            }
        }

        public void c() {
            this.e = -1;
            this.f10824c.clear();
            DynamicTrackActivity.this.cy.removeAllViews();
            DynamicTrackActivity.this.f.removeAllViews();
            i();
        }

        private void i() {
            DynamicTrackActivity.this.ct.setText("");
            DynamicTrackActivity.this.d.setText("");
            DynamicTrackActivity.this.cz.setText("");
            DynamicTrackActivity.this.n.setText("");
            DynamicTrackActivity.this.f2do.setText("");
            DynamicTrackActivity.this.el.setText("");
            DynamicTrackActivity.this.dg.setText("");
            DynamicTrackActivity.this.dk.setText("");
            DynamicTrackActivity.this.dc.setText("");
            DynamicTrackActivity.this.au.setText("");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public View b(int i) {
            View view = new View(DynamicTrackActivity.this.r);
            if (i == 1) {
                return DynamicTrackActivity.this.cu;
            }
            if (i == 2) {
                return DynamicTrackActivity.this.dd;
            }
            if (i == 3) {
                return DynamicTrackActivity.this.dl;
            }
            if (i == 4) {
                return DynamicTrackActivity.this.cx;
            }
            if (i != 5) {
                LogUtil.e("Track_DynamicTrackActivity", "getFrameLayout error type.");
                return view;
            }
            return DynamicTrackActivity.this.di;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public View e(int i) {
            View view = new View(DynamicTrackActivity.this.r);
            if (i == 1) {
                return DynamicTrackActivity.this.cr;
            }
            if (i == 2) {
                return DynamicTrackActivity.this.de;
            }
            if (i == 3) {
                return DynamicTrackActivity.this.dh;
            }
            if (i == 4) {
                return DynamicTrackActivity.this.cw;
            }
            if (i != 5) {
                LogUtil.e("Track_DynamicTrackActivity", "getImageView error type.");
                return view;
            }
            return DynamicTrackActivity.this.db;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public View d(int i) {
            View view = new View(DynamicTrackActivity.this.r);
            if (i == 1) {
                return DynamicTrackActivity.this.cv;
            }
            if (i == 2) {
                return DynamicTrackActivity.this.df;
            }
            if (i == 3) {
                return DynamicTrackActivity.this.dp;
            }
            if (i == 4) {
                return DynamicTrackActivity.this.da;
            }
            if (i != 5) {
                LogUtil.e("Track_DynamicTrackActivity", "getLinearLayout error type.");
                return view;
            }
            return DynamicTrackActivity.this.dj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            if (this.e == -1) {
                return;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.bottomMargin = 8;
            int i = this.e;
            if (i == 1) {
                DynamicTrackActivity.this.cy.addView(DynamicTrackActivity.this.cu, 0, layoutParams);
                return;
            }
            if (i == 2) {
                DynamicTrackActivity.this.cy.addView(DynamicTrackActivity.this.dd, 0, layoutParams);
                return;
            }
            if (i == 3) {
                DynamicTrackActivity.this.cy.addView(DynamicTrackActivity.this.dl, 0, layoutParams);
                return;
            }
            if (i == 4) {
                DynamicTrackActivity.this.cy.addView(DynamicTrackActivity.this.cx, 0, layoutParams);
            } else if (i != 5) {
                LogUtil.e("Track_DynamicTrackActivity", "error type.");
            } else {
                DynamicTrackActivity.this.cy.addView(DynamicTrackActivity.this.di, 0, layoutParams);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h() {
            int i = this.e;
            if (i == -1) {
                return;
            }
            if (i == 1) {
                DynamicTrackActivity.this.ct.setText(jho.c(((Double) this.d.second).doubleValue()));
                DynamicTrackActivity.this.d.setText(jho.b(DynamicTrackActivity.this.r));
                return;
            }
            if (i == 2) {
                DynamicTrackActivity.this.dc.setText(jho.e(((Double) this.d.second).doubleValue()));
                DynamicTrackActivity.this.au.setText(DynamicTrackActivity.this.r.getResources().getQuantityString(R.plurals.IDS_Plugin_motion_track_heart_rate_unit, 1, ""));
                return;
            }
            if (i == 3) {
                DynamicTrackActivity.this.f2do.setText(jho.a(((Double) this.d.second).doubleValue()));
                DynamicTrackActivity.this.el.setText(jho.a(DynamicTrackActivity.this.r));
            } else if (i == 4) {
                DynamicTrackActivity.this.cz.setText(jho.e(((Double) this.d.second).doubleValue()));
                DynamicTrackActivity.this.n.setText(DynamicTrackActivity.this.r.getString(R.string.IDS_motiontrack_show_detail_stempsmin));
            } else {
                if (i == 5) {
                    double dDoubleValue = ((Double) this.d.second).doubleValue();
                    DynamicTrackActivity.this.dk.setText(jho.c(DynamicTrackActivity.this.r));
                    DynamicTrackActivity.this.dg.setText(jpq.e((float) dDoubleValue));
                    return;
                }
                LogUtil.e("Track_DynamicTrackActivity", "error type.");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(String str) {
            View viewInflate = View.inflate(DynamicTrackActivity.this.r, R.layout.trackalbum_text_barrage, null);
            if (viewInflate instanceof LinearLayout) {
                HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.retrack_barrage_value);
                healthTextView.setText(jhj.e(DynamicTrackActivity.this.r, str, (int) healthTextView.getTextSize()));
                DynamicTrackActivity.this.f.addView(viewInflate, 0, new LinearLayout.LayoutParams(-2, -2));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            if (DynamicTrackActivity.this.f == null || DynamicTrackActivity.this.f.getChildCount() <= 0) {
                return;
            }
            DynamicTrackActivity.this.f.removeView(DynamicTrackActivity.this.f.getChildAt(DynamicTrackActivity.this.f.getChildCount() - 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i) {
            if (this.e == -1) {
                return;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(400.0f, 0.0f, 0.0f, 0.0f);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(translateAnimation);
            animationSet.addAnimation(alphaAnimation);
            animationSet.setDuration(350L);
            animationSet.setInterpolator(DynamicTrackActivity.this.az);
            animationSet.setFillAfter(true);
            if (i == 0) {
                DynamicTrackActivity.this.eq.startAnimation(animationSet);
                DynamicTrackActivity.this.ey.startAnimation(animationSet);
            } else if (i == 1) {
                DynamicTrackActivity.this.dv.startAnimation(animationSet);
            } else {
                DynamicTrackActivity.this.bn.startAnimation(animationSet);
            }
            LogUtil.a("Track_DynamicTrackActivity", "animateOtherDataAppear, index = ", Integer.valueOf(i));
        }

        private void g() {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(400L);
            alphaAnimation.setFillAfter(true);
            DynamicTrackActivity.this.ae.startAnimation(alphaAnimation);
            DynamicTrackActivity.this.u.startAnimation(alphaAnimation);
            DynamicTrackActivity.this.cg.startAnimation(alphaAnimation);
        }

        public void d() {
            g();
            e();
            jho.a(4, 0, (this.f10824c.size() * 400) + 1000, this.f10822a);
            jho.a(4, 1, (this.f10824c.size() * 400) + 1500, this.f10822a);
            jho.a(4, 2, (this.f10824c.size() * 400) + 2000, this.f10822a);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        ShareSelector shareSelector = this.em;
        if (shareSelector == null) {
            LogUtil.e("Track_DynamicTrackActivity", "mShareSelector == null");
            return;
        }
        if (this.bk || shareSelector.getVisibility() == 0) {
            LogUtil.a("Track_DynamicTrackActivity", "setPreviewStatus by onBackPressed");
            this.bk = false;
            bk();
            InterfaceReTrack interfaceReTrack = this.ce;
            if (interfaceReTrack != null) {
                interfaceReTrack.reset();
            }
        }
        am();
    }

    private void am() {
        if (qrs.ab(this.r)) {
            this.ci.setText(R.string.IDS_motiontrack_share_activity_detail_title);
        } else {
            this.ci.setText(R.string.IDS_save_pre_view_tip);
        }
    }

    private void k() {
        Handler handler = this.dn;
        if (handler != null) {
            handler.sendEmptyMessage(AgrConstant.HEALTH_AGREEMENT_CODE);
        }
        LogUtil.a("Track_DynamicTrackActivity", "asynLoadPhoto IS_IGNORE_MATCH_PHOTOS");
    }

    public boolean c() {
        return this.bd;
    }

    private void d(Intent intent) {
        ArrayList arrayList;
        ArrayList parcelableArrayListExtra;
        ArrayList parcelableArrayListExtra2 = null;
        try {
            parcelableArrayListExtra = intent.getParcelableArrayListExtra("selected_image_list");
            try {
                parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("selected_video_list");
                if (intent.getBooleanExtra("selected_video_duration_is_long", false)) {
                    qpx.e(BaseApplication.getContext(), this.r.getString(R.string.IDS_album_select_video_automatically_cut, 10));
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                e = e2;
                arrayList = parcelableArrayListExtra2;
                parcelableArrayListExtra2 = parcelableArrayListExtra;
                LogUtil.e("Track_DynamicTrackActivity", LogAnonymous.b(e));
                ArrayList arrayList2 = arrayList;
                parcelableArrayListExtra = parcelableArrayListExtra2;
                parcelableArrayListExtra2 = arrayList2;
            }
        } catch (ArrayIndexOutOfBoundsException e3) {
            e = e3;
            arrayList = null;
        }
        if ((parcelableArrayListExtra == null && parcelableArrayListExtra2 == null) || this.f10804c == null) {
            return;
        }
        Message messageObtain = Message.obtain();
        if (parcelableArrayListExtra != null) {
            messageObtain.what = 519;
            messageObtain.obj = parcelableArrayListExtra;
        } else {
            messageObtain.what = 528;
            messageObtain.obj = parcelableArrayListExtra2;
        }
        this.dn.sendMessage(messageObtain);
    }

    static class b extends BaseHandler<DynamicTrackActivity> {
        public b(Looper looper, DynamicTrackActivity dynamicTrackActivity) {
            super(looper, dynamicTrackActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(DynamicTrackActivity dynamicTrackActivity, Message message) {
            b(dynamicTrackActivity, message);
            dynamicTrackActivity.ce.messageHandle(message);
            if (dynamicTrackActivity.f10804c != null) {
                dynamicTrackActivity.f10804c.e(message);
            }
        }

        private void b(DynamicTrackActivity dynamicTrackActivity, Message message) {
            int i = message.what;
            if (i == 1) {
                dynamicTrackActivity.bc = false;
                dynamicTrackActivity.z();
                dynamicTrackActivity.ae.d();
                return;
            }
            if (i == 16) {
                c(dynamicTrackActivity);
                return;
            }
            if (i == 32) {
                sendEmptyMessageDelayed(2, ProfileExtendConstants.TIME_OUT);
                return;
            }
            if (i == 51) {
                if (dynamicTrackActivity.f10803a != null) {
                    dynamicTrackActivity.f10803a.d();
                }
            } else {
                if (i == 64) {
                    dynamicTrackActivity.ad();
                    return;
                }
                if (i == 96) {
                    f(dynamicTrackActivity, message);
                    return;
                }
                if (i == 118) {
                    e(dynamicTrackActivity);
                } else if (i != 131) {
                    e(dynamicTrackActivity, message);
                } else {
                    DynamicTrackActivity.cr(dynamicTrackActivity);
                }
            }
        }

        private void e(DynamicTrackActivity dynamicTrackActivity, Message message) {
            int i = message.what;
            if (i == 2) {
                dynamicTrackActivity.w();
                return;
            }
            if (i == 97) {
                a(dynamicTrackActivity, message);
                return;
            }
            if (i == 99) {
                dynamicTrackActivity.ae.c(((Integer) message.obj).intValue());
                return;
            }
            if (i == 117) {
                d(dynamicTrackActivity, message);
                return;
            }
            if (i == 152) {
                dynamicTrackActivity.aa();
                return;
            }
            if (i == 120) {
                a(dynamicTrackActivity);
                return;
            }
            if (i == 121) {
                dynamicTrackActivity.c(-1);
            } else if (i == 128) {
                dynamicTrackActivity.e(dynamicTrackActivity.p, dynamicTrackActivity.t);
            } else {
                if (i != 129) {
                    return;
                }
                g(dynamicTrackActivity, message);
            }
        }

        private void g(DynamicTrackActivity dynamicTrackActivity, Message message) {
            if (!(message.obj instanceof Integer) || dynamicTrackActivity.f10804c == null) {
                return;
            }
            dynamicTrackActivity.f10804c.e(((Integer) message.obj).intValue());
        }

        private void a(DynamicTrackActivity dynamicTrackActivity) {
            if (dynamicTrackActivity.f10803a != null) {
                dynamicTrackActivity.f10803a.a();
            }
        }

        private void d(DynamicTrackActivity dynamicTrackActivity, Message message) {
            if (dynamicTrackActivity.f10803a == null || !(message.obj instanceof String)) {
                return;
            }
            dynamicTrackActivity.f10803a.c((String) message.obj);
        }

        private void a(DynamicTrackActivity dynamicTrackActivity, Message message) {
            if (dynamicTrackActivity.f10803a == null || !jgx.e(message.obj, Integer.class, Double.class)) {
                return;
            }
            dynamicTrackActivity.f10803a.d((Pair<Integer, Double>) message.obj);
        }

        private void e(DynamicTrackActivity dynamicTrackActivity) {
            dynamicTrackActivity.bg = true;
            if (dynamicTrackActivity.bh) {
                dynamicTrackActivity.bd = true;
                sendEmptyMessageDelayed(152, 500L);
                dynamicTrackActivity.bh = false;
                dynamicTrackActivity.bg = false;
            }
        }

        private void c(DynamicTrackActivity dynamicTrackActivity) {
            dynamicTrackActivity.bh = true;
            if (dynamicTrackActivity.bg) {
                dynamicTrackActivity.bd = true;
                sendEmptyMessageDelayed(152, 500L);
                dynamicTrackActivity.bh = false;
                dynamicTrackActivity.bg = false;
            }
        }

        private void f(DynamicTrackActivity dynamicTrackActivity, Message message) {
            if ((message.obj instanceof String) && dynamicTrackActivity.bk) {
                dynamicTrackActivity.ag.setText(jho.e((String) message.obj, dynamicTrackActivity.ec.getValidTotalDistance()));
            }
        }
    }

    static class a extends BaseHandler<e> {
        public a(Looper looper, e eVar) {
            super(looper, eVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(e eVar, Message message) {
            int i = message.what;
            if (i == 1) {
                eVar.b();
                jho.a(eVar.e(eVar.e));
                return;
            }
            if (i == 2) {
                eVar.h();
                jho.e(eVar.d(eVar.e));
            } else {
                if (i == 3) {
                    jho.c(eVar.b(((Integer) message.obj).intValue()));
                    return;
                }
                if (i != 4) {
                    if (i == 5 && (message.obj instanceof String)) {
                        eVar.d((String) message.obj);
                        return;
                    }
                    return;
                }
                eVar.a(((Integer) message.obj).intValue());
            }
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.callback.CommonSingleCallback
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void callback(Boolean bool) {
        ReleaseLogUtil.d("Track_DynamicTrackActivity", "record result with ", bool);
        g(false);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(400L);
        if (bool.booleanValue()) {
            b(alphaAnimation);
        } else {
            this.ef = 0;
        }
        e(alphaAnimation);
    }

    private void b(AlphaAnimation alphaAnimation) {
        ShareSelector shareSelector = this.em;
        if (shareSelector != null && this.ef == 4) {
            shareSelector.e();
            if (alphaAnimation != null) {
                this.em.startAnimation(alphaAnimation);
            }
        }
    }

    private void e(Animation animation) {
        HealthButton healthButton = this.dz;
        if (healthButton == null || healthButton.getVisibility() == 0) {
            return;
        }
        this.dz.setVisibility(0);
        if (animation != null) {
            this.dz.startAnimation(animation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void cr(DynamicTrackActivity dynamicTrackActivity) {
        ((SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class)).updateShareUserView("Track_DynamicTrackActivity", 8, dynamicTrackActivity.fe, dynamicTrackActivity.ff);
    }
}
