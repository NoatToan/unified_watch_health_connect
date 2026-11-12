package com.huawei.ui.homehealth.runcard;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.core.view.GravityCompat;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.healthcloud.plugintrack.model.SportBeat;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.CreativeType;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.numberpicker.HealthMultiNumberPicker;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.homehealth.R;
import com.zhangyue.iReader.sdk.scheme.ISchemeListener;
import defpackage.jae;
import defpackage.jwz;
import defpackage.lmf;
import defpackage.njy;
import defpackage.qpx;
import defpackage.qre;
import defpackage.qrs;
import defpackage.tfi;
import defpackage.yto;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class TrackVoiceSettingsView extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomViewDialog f25819a;
    private HealthTextView aa;
    private HealthDivider ab;
    private HealthImageView ac;
    private ImageView ad;
    private HealthTextView ae;
    private HealthImageView af;
    private HealthDivider ag;
    private HealthTextView ah;
    private ImageView ai;
    private HealthSwitchButton aj;
    private HealthTextView ak;
    private ImageView al;
    private Handler am;
    private jae an;
    private int ao;
    private LinearLayout ap;
    private HealthTextView aq;
    private int ar;
    private HealthTextView as;
    private HealthTextView at;
    private HealthTextView au;
    private int av;
    private HealthTextView aw;
    private HealthTextView ax;
    private int az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f25820b;
    private int[] bb;
    private HealthTextView bc;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Activity f25821c;
    private List<String> d;
    private HealthSwitchButton e;
    private Map<String, ArrayList<String>> f;
    private IBaseResponseCallback g;
    private ImageView h;
    private int[] i;
    private RelativeLayout j;
    private boolean k;
    private ImageView l;
    private HealthDivider m;
    private boolean n;
    private boolean o;
    private RelativeLayout p;
    private RelativeLayout q;
    private boolean r;
    private RelativeLayout s;
    private RelativeLayout t;
    private LinearLayout u;
    private LinearLayout v;
    private LinearLayout w;
    private LinearLayout x;
    private LinearLayout y;
    private HealthDivider z;

    /* JADX INFO: Access modifiers changed from: private */
    public int e(int i) {
        return i == 0 ? 2 : 1;
    }

    static class a implements HiDataReadResultListener {
        private WeakReference<TrackVoiceSettingsView> d;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        private a(TrackVoiceSettingsView trackVoiceSettingsView) {
            this.d = new WeakReference<>(trackVoiceSettingsView);
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            TrackVoiceSettingsView trackVoiceSettingsView = this.d.get();
            if (trackVoiceSettingsView == null) {
                LogUtil.j("Track_TrackVoiceSettingsView", "onResponse: activity or mTrackVoiceSettingsView is null");
                return;
            }
            if (!njy.b(obj, HiSampleConfig.class)) {
                LogUtil.j("Track_TrackVoiceSettingsView", "onResponse: objData is not instanceof HiSampleConfig");
                trackVoiceSettingsView.a();
                return;
            }
            List list = (List) obj;
            if (njy.e(list)) {
                LogUtil.j("Track_TrackVoiceSettingsView", "onResponse: list is empty");
                trackVoiceSettingsView.a();
                return;
            }
            SportBeat sportBeat = (SportBeat) HiJsonUtil.d(((HiSampleConfig) list.get(0)).getConfigData(), SportBeat.class);
            if (sportBeat != null) {
                trackVoiceSettingsView.c(sportBeat);
            } else {
                LogUtil.j("Track_TrackVoiceSettingsView", "onResponse: sportBeat is null, loading default value");
                trackVoiceSettingsView.a();
            }
        }
    }

    public static class b implements DownloadCallback<Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<TrackVoiceSettingsView> f25838c;

        @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
        public void onProgress(long j, long j2, boolean z, String str) {
        }

        private b(TrackVoiceSettingsView trackVoiceSettingsView) {
            this.f25838c = new WeakReference<>(trackVoiceSettingsView);
        }

        @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
        public void onFinish(Object obj) {
            final TrackVoiceSettingsView trackVoiceSettingsView = this.f25838c.get();
            LogUtil.a("Track_TrackVoiceSettingsView", "mDownloadIndexFileListener onFinish, data = ", obj.toString());
            if (trackVoiceSettingsView != null && trackVoiceSettingsView.an != null) {
                if (trackVoiceSettingsView.an.i()) {
                    if (trackVoiceSettingsView.g == null || !trackVoiceSettingsView.an.b()) {
                        boolean zG = trackVoiceSettingsView.an.g();
                        if (trackVoiceSettingsView.ap == null || !zG) {
                            return;
                        }
                        LogUtil.a("Track_TrackVoiceSettingsView", "showUpdateDialog");
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: sxg
                            @Override // java.lang.Runnable
                            public final void run() {
                                trackVoiceSettingsView.ap.setVisibility(0);
                            }
                        });
                        return;
                    }
                    trackVoiceSettingsView.an.d(trackVoiceSettingsView.g);
                    return;
                }
                LogUtil.j("Track_TrackVoiceSettingsView", "mDownloadIndexFileListener moveIndexFile failed.");
                return;
            }
            LogUtil.j("Track_TrackVoiceSettingsView", "mDownloadIndexFileListener mSmartCoachDownloadUtils is null.");
        }

        @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
        public void onFail(int i, Throwable th) {
            LogUtil.j("Track_TrackVoiceSettingsView", "mDownloadIndexFileListener downloadIndexFile failed.");
        }
    }

    public TrackVoiceSettingsView(Context context) {
        super(context);
        this.f25821c = null;
        this.r = true;
        this.k = true;
        this.az = 10;
        this.aj = null;
        this.m = null;
        this.p = null;
        this.y = null;
        this.aw = null;
        this.ax = null;
        this.l = null;
        this.t = null;
        this.w = null;
        this.ap = null;
        this.ak = null;
        this.aq = null;
        this.an = null;
        this.as = null;
        this.e = null;
        this.n = true;
        this.d = new ArrayList(10);
        this.f = new HashMap(10);
        this.s = null;
        this.at = null;
        this.au = null;
        this.x = null;
        this.ag = null;
        this.ar = 0;
        this.ao = 0;
        this.ah = null;
        this.h = null;
        this.ad = null;
        this.ai = null;
        this.al = null;
        this.u = null;
        this.q = null;
        this.ab = null;
        this.aa = null;
        this.am = new e(this);
        this.g = new IBaseResponseCallback() { // from class: com.huawei.ui.homehealth.runcard.TrackVoiceSettingsView.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == -1) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.huawei.ui.homehealth.runcard.TrackVoiceSettingsView.5.1
                        @Override // java.lang.Runnable
                        public void run() {
                            TrackVoiceSettingsView.this.j.setVisibility(0);
                        }
                    });
                }
            }
        };
    }

    public TrackVoiceSettingsView(Context context, int i, boolean z, Activity activity) {
        super(context);
        this.f25821c = null;
        this.r = true;
        this.k = true;
        this.az = 10;
        this.aj = null;
        this.m = null;
        this.p = null;
        this.y = null;
        this.aw = null;
        this.ax = null;
        this.l = null;
        this.t = null;
        this.w = null;
        this.ap = null;
        this.ak = null;
        this.aq = null;
        this.an = null;
        this.as = null;
        this.e = null;
        this.n = true;
        this.d = new ArrayList(10);
        this.f = new HashMap(10);
        this.s = null;
        this.at = null;
        this.au = null;
        this.x = null;
        this.ag = null;
        this.ar = 0;
        this.ao = 0;
        this.ah = null;
        this.h = null;
        this.ad = null;
        this.ai = null;
        this.al = null;
        this.u = null;
        this.q = null;
        this.ab = null;
        this.aa = null;
        this.am = new e(this);
        this.g = new IBaseResponseCallback() { // from class: com.huawei.ui.homehealth.runcard.TrackVoiceSettingsView.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                if (i2 == -1) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.huawei.ui.homehealth.runcard.TrackVoiceSettingsView.5.1
                        @Override // java.lang.Runnable
                        public void run() {
                            TrackVoiceSettingsView.this.j.setVisibility(0);
                        }
                    });
                }
            }
        };
        this.f25820b = context;
        this.av = i;
        this.o = z;
        this.f25821c = activity;
        h();
        q();
    }

    private void q() {
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            this.ac.setImageResource(R.drawable.common_ui_arrow_left);
            this.ad.setImageResource(R.drawable.common_ui_arrow_left);
            this.ai.setImageResource(R.drawable.common_ui_arrow_left);
            this.ah.setGravity(GravityCompat.START);
            this.al.setImageResource(R.drawable.common_ui_arrow_left);
        } else {
            this.ac.setImageResource(R.drawable.common_ui_arrow_right);
            this.ad.setImageResource(R.drawable.common_ui_arrow_right);
            this.ai.setImageResource(R.drawable.common_ui_arrow_right);
            this.ah.setGravity(GravityCompat.END);
            this.al.setImageResource(R.drawable.common_ui_arrow_right);
        }
        if (UnitUtil.f()) {
            this.u.setVisibility(8);
        }
        af();
        d();
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (!v() && ac() && !UnitUtil.f()) {
            this.m.setVisibility(0);
            this.x.setVisibility(0);
            this.ag.setVisibility(0);
            this.x.setOnClickListener(this);
            m();
            return;
        }
        this.x.setVisibility(8);
        this.ag.setVisibility(8);
        this.m.setVisibility(8);
    }

    private boolean ac() {
        if (x() || !this.r) {
            return x() && this.k;
        }
        return true;
    }

    private void af() {
        this.y.setVisibility(8);
        if (y() || w() || this.o) {
            this.u.setVisibility(8);
            this.p.setVisibility(8);
            this.f25821c.findViewById(R.id.divide_line_voice).setVisibility(8);
            this.f25821c.findViewById(R.id.layout_track_voice_heart_setting_top_line).setVisibility(8);
            return;
        }
        if (x()) {
            this.q.setVisibility(8);
            this.ab.setVisibility(8);
            this.u.setVisibility(0);
            this.y.setVisibility(0);
            this.p.setVisibility(8);
            this.t.setVisibility(8);
            this.f25821c.findViewById(R.id.divide_line_voice).setVisibility(8);
            this.f25821c.findViewById(R.id.img_auto_pause_bottom_line).setVisibility(8);
            this.w.setVisibility(8);
            l();
            return;
        }
        if (u()) {
            this.u.setVisibility(0);
            this.f25821c.findViewById(R.id.layout_audio_reminders).setVisibility(8);
            this.z.setVisibility(8);
            this.m.setVisibility(8);
            this.x.setVisibility(8);
            this.ag.setVisibility(8);
            this.y.setVisibility(8);
            this.p.setVisibility(8);
            this.t.setVisibility(8);
            this.f25821c.findViewById(R.id.divide_line_voice).setVisibility(8);
            this.w.setVisibility(8);
        }
    }

    private boolean u() {
        if (!UnitUtil.f()) {
            return false;
        }
        int i = this.av;
        return i == 258 || i == 264;
    }

    private void l() {
        String strE = SharedPreferenceManager.e(this.f25820b, String.valueOf(20002), "voice_rope_skpping");
        if (TextUtils.isEmpty(strE) || CommonUtil.j(strE) == 1) {
            this.k = true;
            this.aj.setChecked(true);
            this.y.setVisibility(0);
        } else {
            this.k = false;
            this.aj.setChecked(false);
            this.y.setVisibility(8);
        }
        d(SharedPreferenceManager.e(this.f25820b, Integer.toString(20002), "value_upper_voice_interval"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean x() {
        return this.av == 283;
    }

    private void d() {
        if (aa() && !y() && !w() && !this.o && !x()) {
            yto.a(BaseApplication.getContext(), "huaweisport", "q3@!DF5*&$9MrhCS", "tingshu", new ISchemeListener() { // from class: com.huawei.ui.homehealth.runcard.TrackVoiceSettingsView.12
                @Override // com.zhangyue.iReader.sdk.scheme.ISchemeListener
                public void onSuccess(Object obj) {
                    if (obj != null) {
                        LogUtil.a("Track_TrackVoiceSettingsView", "checkSupportListenBook");
                    } else {
                        LogUtil.j("Track_TrackVoiceSettingsView", "checkSupportListenBook obj is null");
                    }
                    if (TrackVoiceSettingsView.this.am != null) {
                        TrackVoiceSettingsView.this.am.sendEmptyMessage(112);
                    } else {
                        LogUtil.j("Track_TrackVoiceSettingsView", "checkSupportListenBook onSuccess and mHandler is null");
                    }
                }

                @Override // com.zhangyue.iReader.sdk.scheme.ISchemeListener
                public void onError(int i, String str) {
                    LogUtil.j("Track_TrackVoiceSettingsView", str, " errorCode ", Integer.valueOf(i));
                    if (TrackVoiceSettingsView.this.am != null) {
                        TrackVoiceSettingsView.this.am.sendEmptyMessage(CreativeType.WINDOW_IMAGE_WITH_DOWNLOAD_BUTTON);
                    } else {
                        LogUtil.j("Track_TrackVoiceSettingsView", "checkSupportListenBook ", str, " and mHandler is null");
                    }
                }
            });
        } else {
            this.q.setVisibility(8);
            this.ab.setVisibility(8);
        }
    }

    private boolean aa() {
        return CommonUtil.bg() && !Utils.o();
    }

    private void h() {
        this.ad = (ImageView) this.f25821c.findViewById(R.id.img_track_listenType_interval_value);
        this.q = (RelativeLayout) this.f25821c.findViewById(R.id.layout_track_listenType_setting);
        this.ab = (HealthDivider) this.f25821c.findViewById(R.id.img_track_listen_type_bottom_line);
        this.aa = (HealthTextView) this.f25821c.findViewById(R.id.txt_track_sport_type_interval_value);
        this.u = (LinearLayout) this.f25821c.findViewById(R.id.layout_track_voice_settings);
        this.aj = (HealthSwitchButton) this.f25821c.findViewById(R.id.switch_track_voice_setting);
        this.m = (HealthDivider) this.f25821c.findViewById(R.id.divide_line_interval_voice);
        this.z = (HealthDivider) this.f25821c.findViewById(R.id.metronome_divider);
        LinearLayout linearLayout = (LinearLayout) this.f25821c.findViewById(R.id.layout_track_metronome);
        this.v = linearLayout;
        linearLayout.setOnClickListener(this);
        this.ae = (HealthTextView) this.f25821c.findViewById(R.id.txt_metronome_frequency);
        this.af = (HealthImageView) this.f25821c.findViewById(R.id.metronome_red_point);
        this.ac = (HealthImageView) this.f25821c.findViewById(R.id.img_metronome_arrow_image);
        this.ai = (ImageView) this.f25821c.findViewById(R.id.img_track_music_control_interval_value);
        this.x = (LinearLayout) this.f25821c.findViewById(R.id.layout_track_music_control);
        this.ag = (HealthDivider) this.f25821c.findViewById(R.id.divide_line_music_control);
        this.ah = (HealthTextView) this.f25821c.findViewById(R.id.txt_track_music_control_interval_value);
        this.al = (ImageView) this.f25821c.findViewById(R.id.img_track_target_arrow_image);
        LinearLayout linearLayout2 = (LinearLayout) this.f25821c.findViewById(R.id.layout_track_voice_rate);
        this.y = linearLayout2;
        linearLayout2.setOnClickListener(this);
        this.bc = (HealthTextView) this.f25821c.findViewById(R.id.txt_track_rope_interval_unit);
        RelativeLayout relativeLayout = (RelativeLayout) this.f25821c.findViewById(R.id.layout_track_voice_interval_setting);
        this.p = relativeLayout;
        relativeLayout.setOnClickListener(this);
        this.aw = (HealthTextView) this.f25821c.findViewById(R.id.txt_track_voice_interval);
        this.ax = (HealthTextView) this.f25821c.findViewById(R.id.txt_track_voice_interval_value);
        this.l = (ImageView) this.f25821c.findViewById(R.id.img_track_voice_interval_value);
        this.t = (RelativeLayout) this.f25821c.findViewById(R.id.layout_base_voice_play);
        this.w = (LinearLayout) this.f25821c.findViewById(R.id.track_voice_smart_coach);
        if (LanguageUtil.l(this.f25820b) && !Utils.o() && !this.o) {
            o();
            this.p.setVisibility(8);
            this.m.setVisibility(8);
            this.t.setVisibility(0);
            this.w.setVisibility(0);
            SharedPreferenceManager.e(this.f25820b, Integer.toString(20002), "COLLECT_SMART_COACH_SET_TIPS", "true", new StorageParams());
            t();
        } else {
            r();
            this.p.setVisibility(0);
            this.m.setVisibility(0);
            this.t.setVisibility(8);
            this.w.setVisibility(8);
        }
        k();
        p();
        this.r = tfi.d(BaseApplication.getContext(), "voice_enable_type");
        ah();
        n();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            return;
        }
        if (qrs.c(500)) {
            LogUtil.e("Track_TrackVoiceSettingsView", "is click fast");
            return;
        }
        HashMap map = new HashMap(10);
        map.put("click", 1);
        if (view.getId() == R.id.layout_track_listenType_setting) {
            e(R.string.IDS_hwh_motiontrack_sport_music, false);
            map.put("type", 11);
        } else {
            if (view.getId() == R.id.layout_track_metronome) {
                ab();
                return;
            }
            if (view.getId() == R.id.layout_track_music_control) {
                e(R.string.IDS_motiontrack_music_control, true);
                map.put("type", 17);
            } else if (view.getId() == R.id.layout_track_voice_interval_setting) {
                ag();
                map.put("type", 2);
            } else if (view.getId() == R.id.layout_track_voice_rate) {
                j();
                map.put("type", 2);
            } else if (view.getId() == R.id.layout_base_voice_play) {
                LogUtil.a("Track_TrackVoiceSettingsView", "start SportAssistBaseVoiceSettingsActivity");
                try {
                    this.f25821c.startActivity(new Intent(this.f25820b, (Class<?>) SportAssistBaseVoiceSettingsActivity.class));
                } catch (ActivityNotFoundException e2) {
                    LogUtil.e("Track_TrackVoiceSettingsView", "onClick() exception: ", LogAnonymous.b(e2));
                }
            } else {
                LogUtil.j("Track_TrackVoiceSettingsView", "wrong view id");
            }
        }
        lmf.d().c(this.f25820b, AnalyticsValue.MOTION_TRACK_1040023.value(), map, 0);
    }

    private void ab() {
        Intent intent = new Intent(this.f25820b, (Class<?>) SportMetronomeActivity.class);
        intent.putExtra("jump_source", 1);
        intent.putExtra("is_support_metronome", true);
        this.f25820b.startActivity(intent);
    }

    private void j() {
        HealthMultiNumberPicker healthMultiNumberPicker = new HealthMultiNumberPicker(BaseApplication.getContext());
        healthMultiNumberPicker.setPickerCount(1, new boolean[]{false});
        healthMultiNumberPicker.setDisplayedValues(0, new String[]{this.f25820b.getResources().getQuantityString(R.plurals.IDS_track_skip_per, 10, 10), this.f25820b.getResources().getQuantityString(R.plurals.IDS_track_skip_per, 100, 100)}, CommonUtil.e(SharedPreferenceManager.e(this.f25820b, Integer.toString(20002), "value_upper_voice_interval"), 10) == 10 ? 0 : 1);
        healthMultiNumberPicker.setOnValueChangeListener(new HealthMultiNumberPicker.OnValueChangeListener() { // from class: com.huawei.ui.homehealth.runcard.TrackVoiceSettingsView.14
            @Override // com.huawei.ui.commonui.numberpicker.HealthMultiNumberPicker.OnValueChangeListener
            public void onValueChange(int i, HealthMultiNumberPicker healthMultiNumberPicker2, int i2, int i3) {
                if (i3 == 0) {
                    TrackVoiceSettingsView.this.az = 10;
                } else {
                    TrackVoiceSettingsView.this.az = 100;
                }
            }
        });
        a(healthMultiNumberPicker);
    }

    private void a(final HealthMultiNumberPicker healthMultiNumberPicker) {
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.f25820b);
        builder.b(R.string.IDS_hwh_motiontrack_voice_interval).d((View) healthMultiNumberPicker).d(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.TrackVoiceSettingsView.13
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (healthMultiNumberPicker.getSelectedLocations()[0] == 0) {
                    TrackVoiceSettingsView.this.az = 10;
                } else {
                    TrackVoiceSettingsView.this.az = 100;
                }
                TrackVoiceSettingsView.this.ak();
                TrackVoiceSettingsView trackVoiceSettingsView = TrackVoiceSettingsView.this;
                trackVoiceSettingsView.d(UnitUtil.e(trackVoiceSettingsView.az, 1, 0));
                HashMap map = new HashMap(2);
                map.put("click", 1);
                map.put("frequency", Integer.valueOf(TrackVoiceSettingsView.this.az));
                lmf.d().c(TrackVoiceSettingsView.this.f25820b, AnalyticsValue.HEALTH_SKIPPING_FREQUENCY_2040128.value(), map, 0);
            }
        }).c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.TrackVoiceSettingsView.11
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        this.f25819a = customViewDialogD;
        customViewDialogD.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ak() {
        SharedPreferenceManager.e(this.f25820b, Integer.toString(20002), "value_upper_voice_interval", UnitUtil.e(this.az, 1, 0), new StorageParams());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        int iE = CommonUtil.e(str, this.az);
        this.bc.setText(this.f25820b.getResources().getQuantityString(R.plurals.IDS_track_skip_per, iE, Integer.valueOf(iE)));
    }

    private void ag() {
        int iC = tfi.c(BaseApplication.getContext());
        int i = 0;
        int i2 = 1;
        if (iC == 1) {
            int iD = tfi.d(BaseApplication.getContext());
            while (true) {
                int[] iArr = this.bb;
                if (i >= iArr.length) {
                    i = 1;
                    break;
                } else if (iD == iArr[i]) {
                    break;
                } else {
                    i++;
                }
            }
            i2 = i;
            i = 1;
        } else if (iC == 2) {
            int iA = tfi.a(BaseApplication.getContext());
            int i3 = 0;
            while (true) {
                int[] iArr2 = this.i;
                if (i3 >= iArr2.length) {
                    break;
                }
                if (iA == iArr2[i3]) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
        }
        b(i, i2);
    }

    private void b(int i, int i2) {
        final HealthMultiNumberPicker healthMultiNumberPicker = new HealthMultiNumberPicker(BaseApplication.getContext());
        healthMultiNumberPicker.setPickerCount(2, new boolean[]{false, false});
        List<String> list = this.d;
        healthMultiNumberPicker.setDisplayedValues(0, (String[]) list.toArray(new String[list.size()]), 0);
        ArrayList<String> arrayList = this.f.get(this.d.get(i));
        healthMultiNumberPicker.setDisplayedValues(1, (String[]) arrayList.toArray(new String[arrayList.size()]), 1);
        healthMultiNumberPicker.c(new int[]{i, i2}, arrayList.size());
        healthMultiNumberPicker.setOnValueChangeListener(new HealthMultiNumberPicker.OnValueChangeListener() { // from class: com.huawei.ui.homehealth.runcard.TrackVoiceSettingsView.15
            @Override // com.huawei.ui.commonui.numberpicker.HealthMultiNumberPicker.OnValueChangeListener
            public void onValueChange(int i3, HealthMultiNumberPicker healthMultiNumberPicker2, int i4, int i5) {
                if (i3 == 0) {
                    if (i5 < TrackVoiceSettingsView.this.d.size() && TrackVoiceSettingsView.this.f.containsKey(TrackVoiceSettingsView.this.d.get(i5))) {
                        ArrayList arrayList2 = (ArrayList) TrackVoiceSettingsView.this.f.get(TrackVoiceSettingsView.this.d.get(i5));
                        healthMultiNumberPicker2.setDisplayedValues(1, (String[]) arrayList2.toArray(new String[arrayList2.size()]), 1);
                    } else {
                        LogUtil.j("Track_TrackVoiceSettingsView", "the voice type is not valid");
                    }
                }
            }
        });
        final CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.f25820b);
        builder.b(R.string.IDS_hwh_motiontrack_voice_interval).d((View) healthMultiNumberPicker).d(com.huawei.plugindevice.R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.TrackVoiceSettingsView.18
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int[] selectedLocations = healthMultiNumberPicker.getSelectedLocations();
                TrackVoiceSettingsView.this.c(TrackVoiceSettingsView.this.e(selectedLocations[0]), selectedLocations[1]);
            }
        }).c(com.huawei.plugindevice.R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.TrackVoiceSettingsView.19
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                builder.c(true);
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        this.f25819a = customViewDialogD;
        customViewDialogD.show();
    }

    private void e(int i, final boolean z) {
        String[] strArr;
        int sportMusicType;
        LogUtil.a("Track_TrackVoiceSettingsView", "showVoiceControlDialog");
        Context context = this.f25820b;
        if (context == null) {
            LogUtil.a("Track_TrackVoiceSettingsView", "showSportMusicControlDialog, mContext is null");
            return;
        }
        if (!(context.getSystemService("layout_inflater") instanceof LayoutInflater)) {
            LogUtil.j("Track_TrackVoiceSettingsView", "showVoiceControlDialog, inflater not instance of LayoutInflater");
            return;
        }
        View viewInflate = ((LayoutInflater) this.f25820b.getSystemService("layout_inflater")).inflate(R.layout.hw_show_muisc_type_view, (ViewGroup) null);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.f25820b);
        builder.b(i).b(viewInflate, 0, 0).c(R.string.IDS_hw_show_cancel, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.TrackVoiceSettingsView.16
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (TrackVoiceSettingsView.this.am != null) {
                    TrackVoiceSettingsView.this.am.sendEmptyMessage(z ? 115 : 111);
                } else {
                    LogUtil.j("Track_TrackVoiceSettingsView", "settingListenType mHandle is null");
                }
            }
        });
        this.f25819a = builder.d();
        if (viewInflate != null) {
            if (z) {
                strArr = new String[]{this.f25820b.getResources().getString(R.string.IDS_motiontrack_decrease_music), this.f25820b.getResources().getString(R.string.IDS_motiontrack_pause_music)};
                sportMusicType = getSportMusicControlType();
            } else {
                strArr = new String[]{this.f25820b.getResources().getString(R.string.IDS_hwh_motiontrack_music), this.f25820b.getResources().getString(R.string.IDS_hwh_motiontrack_listen_book)};
                sportMusicType = getSportMusicType();
            }
            d(viewInflate, strArr, sportMusicType, z);
            this.f25819a.show();
            return;
        }
        LogUtil.j("Track_TrackVoiceSettingsView", "showSettingListenTypeDialog() dialog layout fail");
        this.f25819a = null;
    }

    private void d(View view, String[] strArr, int i, final boolean z) {
        ListView listView = (ListView) view.findViewById(R.id.custom_listview_layout);
        final ListenTypeAdapter listenTypeAdapter = new ListenTypeAdapter(strArr, this.f25820b, i, z);
        listView.setDivider(null);
        listView.setAdapter((ListAdapter) listenTypeAdapter);
        listView.setItemsCanFocus(false);
        listView.setChoiceMode(1);
        listView.setOnTouchListener(new View.OnTouchListener() { // from class: com.huawei.ui.homehealth.runcard.TrackVoiceSettingsView.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                return motionEvent != null && motionEvent.getAction() == 2;
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.huawei.ui.homehealth.runcard.TrackVoiceSettingsView.4
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view2, int i2, long j) {
                if (z) {
                    TrackVoiceSettingsView.this.d(i2, listenTypeAdapter);
                } else {
                    TrackVoiceSettingsView.this.b(i2, listenTypeAdapter);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, ListenTypeAdapter listenTypeAdapter) {
        if (i == 0) {
            this.ao = 0;
        } else if (i == 1) {
            this.ao = 1;
        } else {
            LogUtil.a("Track_TrackVoiceSettingsView", "position = ", Integer.valueOf(i));
        }
        tfi.a(this.f25820b, this.ao);
        listenTypeAdapter.d(this.ao);
        ae();
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ae() {
        int sportMusicControlType = getSportMusicControlType();
        HashMap map = new HashMap(1);
        if (sportMusicControlType == 0) {
            this.ah.setText(R.string.IDS_motiontrack_decrease_music);
            map.put("type", 9);
        } else {
            this.ah.setText(R.string.IDS_motiontrack_pause_music);
            map.put("type", 10);
        }
        lmf.d().c(this.f25820b, AnalyticsValue.MOTION_TRACK_1040023.value(), map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, ListenTypeAdapter listenTypeAdapter) {
        if (i == 0) {
            this.ar = 0;
        } else if (i == 1) {
            this.ar = 1;
        } else {
            LogUtil.a("Track_TrackVoiceSettingsView", "position = ", Integer.valueOf(i));
        }
        tfi.b(this.f25820b, this.ar);
        listenTypeAdapter.d(this.ar);
        am();
        b();
    }

    private void b() {
        CustomViewDialog customViewDialog = this.f25819a;
        if (customViewDialog != null) {
            customViewDialog.cancel();
            this.f25819a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void am() {
        int sportMusicType = getSportMusicType();
        HashMap map = new HashMap(1);
        if (sportMusicType == 0) {
            this.aa.setText(R.string.IDS_hwh_motiontrack_music);
            map.put("type", 7);
        } else {
            this.aa.setText(R.string.IDS_hwh_motiontrack_listen_book);
            map.put("type", 8);
        }
        lmf.d().c(this.f25820b, AnalyticsValue.MOTION_TRACK_1040023.value(), map, 0);
    }

    private int getSportMusicType() {
        return tfi.e(this.f25820b);
    }

    private int getSportMusicControlType() {
        return tfi.b(this.f25820b);
    }

    private void n() {
        if (x()) {
            return;
        }
        boolean zD = tfi.d(BaseApplication.getContext(), "voice_enable_type");
        this.r = zD;
        this.aj.setChecked(zD);
        d(this.r);
    }

    private void p() {
        if (LanguageUtil.l(this.f25820b) && !Utils.o()) {
            s();
            return;
        }
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            this.l.setImageResource(R.drawable.common_ui_arrow_left);
        } else {
            this.l.setImageResource(R.drawable.common_ui_arrow_right);
        }
        if (y() || w()) {
            this.p.setVisibility(8);
            this.f25821c.findViewById(R.id.divide_line_voice).setVisibility(8);
        }
    }

    private void s() {
        RelativeLayout relativeLayout = (RelativeLayout) this.f25821c.findViewById(R.id.layout_base_voice_play);
        this.s = relativeLayout;
        relativeLayout.setOnClickListener(this);
        this.at = (HealthTextView) this.f25821c.findViewById(R.id.textview_base_voice_play);
        this.au = (HealthTextView) this.f25821c.findViewById(R.id.textview_base_voice_play_setting_tips);
        this.h = (ImageView) this.f25821c.findViewById(R.id.img_base_voice_play);
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            this.h.setImageResource(R.drawable.common_ui_arrow_left);
        } else {
            this.h.setImageResource(R.drawable.common_ui_arrow_right);
        }
        if (y() || w()) {
            this.s.setVisibility(8);
            this.f25821c.findViewById(R.id.divide_line_voice).setVisibility(8);
            this.w.setVisibility(8);
        }
    }

    private void k() {
        this.aj.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.homehealth.runcard.TrackVoiceSettingsView.2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (TrackVoiceSettingsView.this.x()) {
                    TrackVoiceSettingsView.this.k = z;
                    TrackVoiceSettingsView.this.ad();
                } else {
                    TrackVoiceSettingsView.this.r = z;
                    TrackVoiceSettingsView.this.ah();
                }
                TrackVoiceSettingsView.this.aj.setChecked(z);
                TrackVoiceSettingsView.this.f();
                if (compoundButton.isPressed()) {
                    HashMap map = new HashMap(2);
                    map.put("click", 1);
                    if (TrackVoiceSettingsView.this.r) {
                        map.put("type", 1);
                    } else {
                        map.put("type", 0);
                    }
                    lmf.d().c(TrackVoiceSettingsView.this.f25820b, AnalyticsValue.HEALTH_SKIPPING_SWITCH_2040127.value(), map, 0);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ad() {
        if (this.k) {
            this.y.setVisibility(0);
        } else {
            this.y.setVisibility(8);
        }
        setVoiceParams(this.k);
    }

    private void setVoiceParams(boolean z) {
        String string;
        if (z) {
            string = Integer.toString(1);
        } else {
            string = Integer.toString(0);
        }
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(20002), "voice_rope_skpping", string, new StorageParams());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ah() {
        if (this.r) {
            tfi.a(BaseApplication.getContext(), "voice_enable_type", true);
            d(true);
            if (LanguageUtil.l(this.f25820b) && !Utils.o() && !this.o) {
                this.f25821c.findViewById(R.id.divide_line_voice).setVisibility(0);
            } else {
                this.m.setVisibility(0);
                this.f25821c.findViewById(R.id.divide_line_voice).setVisibility(8);
            }
            if (z() && !Utils.o()) {
                this.w.setVisibility(0);
                this.t.setVisibility(0);
                this.m.setVisibility(0);
                return;
            }
            this.m.setVisibility(8);
            return;
        }
        tfi.a(BaseApplication.getContext(), "voice_enable_type", false);
        d(false);
        if (LanguageUtil.l(this.f25820b) && !Utils.o()) {
            this.w.setVisibility(8);
        }
        this.t.setVisibility(8);
        this.f25821c.findViewById(R.id.divide_line_voice).setVisibility(8);
    }

    private void m() {
        int iB = tfi.b(BaseApplication.getContext());
        this.ao = iB;
        if (iB == 0) {
            this.ah.setText(R.string.IDS_motiontrack_decrease_music);
        } else {
            this.ah.setText(R.string.IDS_motiontrack_pause_music);
        }
    }

    private boolean v() {
        return qrs.ah(this.f25820b) || y() || w() || this.o;
    }

    private void d(boolean z) {
        if (LanguageUtil.l(this.f25820b) && !Utils.o()) {
            a(z);
            return;
        }
        this.p.setClickable(z);
        if (z) {
            this.p.setVisibility(0);
            this.aw.setTextColor(getResources().getColor(R.color.textColorPrimary));
            this.ax.setTextColor(getResources().getColor(R.color.textColorSecondary));
        } else {
            this.p.setVisibility(8);
            this.aw.setTextColor(getResources().getColor(R.color.textColorTertiary));
            this.ax.setTextColor(getResources().getColor(R.color.textColorTertiary));
        }
    }

    private void a(boolean z) {
        this.s.setClickable(z);
        if (z) {
            this.at.setTextColor(getResources().getColor(R.color.textColorPrimary));
            this.au.setTextColor(getResources().getColor(R.color.textColorSecondary));
        } else {
            this.at.setTextColor(getResources().getColor(R.color.textColorTertiary));
            this.au.setTextColor(getResources().getColor(R.color.textColorTertiary));
        }
    }

    private void o() {
        i();
        this.as = (HealthTextView) this.f25821c.findViewById(R.id.textview_smart_coach_tips);
        this.e = (HealthSwitchButton) this.f25821c.findViewById(R.id.switch_smart_coach);
        g();
        this.e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.homehealth.runcard.TrackVoiceSettingsView.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                TrackVoiceSettingsView.this.n = z;
                TrackVoiceSettingsView.this.e.setChecked(TrackVoiceSettingsView.this.n);
                tfi.a(BaseApplication.getContext(), "smart_coach_enable_type", TrackVoiceSettingsView.this.n);
                LogUtil.a("Track_TrackVoiceSettingsView", "initSmartCoachData is ", Boolean.valueOf(TrackVoiceSettingsView.this.n));
                if (!TrackVoiceSettingsView.this.r) {
                    LogUtil.j("Track_TrackVoiceSettingsView", "initSmartCoach mIsVoiceEnable is false");
                    return;
                }
                if (!Utils.o() && TrackVoiceSettingsView.this.z() && z) {
                    TrackVoiceSettingsView.this.an = new jae();
                    TrackVoiceSettingsView.this.an.d(TrackVoiceSettingsView.this.f25821c, new b());
                }
                HashMap map = new HashMap(10);
                map.put("click", 1);
                if (TrackVoiceSettingsView.this.n) {
                    map.put("type", 0);
                } else {
                    map.put("type", 1);
                }
                lmf.d().c(TrackVoiceSettingsView.this.f25820b, AnalyticsValue.HEALTH_SMART_COACH_2010101.value(), map, 0);
            }
        });
    }

    private void t() {
        boolean zD = tfi.d(BaseApplication.getContext(), "smart_coach_enable_type");
        this.n = zD;
        this.e.setChecked(zD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean z() {
        return (!LanguageUtil.l(this.f25820b) || y() || w()) ? false : true;
    }

    private boolean y() {
        int i = this.av;
        return i == 10001 || i == 137;
    }

    private boolean w() {
        return this.av == 286;
    }

    private void i() {
        this.ap = (LinearLayout) this.f25821c.findViewById(R.id.smart_coach_update_tips_card);
        HealthTextView healthTextView = (HealthTextView) this.f25821c.findViewById(R.id.ignore_update);
        this.ak = healthTextView;
        healthTextView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.TrackVoiceSettingsView.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TrackVoiceSettingsView.this.ap.setVisibility(8);
                if (TrackVoiceSettingsView.this.an != null) {
                    TrackVoiceSettingsView.this.an.f();
                }
            }
        });
        HealthTextView healthTextView2 = (HealthTextView) this.f25821c.findViewById(R.id.update_text);
        this.aq = healthTextView2;
        healthTextView2.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.TrackVoiceSettingsView.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TrackVoiceSettingsView.this.ap.setVisibility(8);
                if (TrackVoiceSettingsView.this.an != null) {
                    TrackVoiceSettingsView.this.an.d(TrackVoiceSettingsView.this.g);
                }
            }
        });
        RelativeLayout relativeLayout = (RelativeLayout) this.f25821c.findViewById(R.id.update_error_layout);
        this.j = relativeLayout;
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.TrackVoiceSettingsView.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (CommonUtil.ab(BaseApplication.getContext())) {
                    TrackVoiceSettingsView.this.j.setVisibility(8);
                    if (TrackVoiceSettingsView.this.an != null) {
                        TrackVoiceSettingsView.this.an.d(TrackVoiceSettingsView.this.g);
                        return;
                    }
                    return;
                }
                LogUtil.a("Track_TrackVoiceSettingsView", "Network is not Connected ");
                qpx.e(BaseApplication.getContext(), R.string.IDS_connect_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.runcard.TrackVoiceSettingsView.9
                @Override // java.lang.Runnable
                public void run() {
                    TrackVoiceSettingsView.this.g();
                }
            });
        } else {
            final String url = GRSManager.c(BaseApplication.getContext()).getUrl("domainTipsResDbankcdn");
            new Handler(this.f25820b.getMainLooper()).post(new Runnable() { // from class: com.huawei.ui.homehealth.runcard.TrackVoiceSettingsView.6
                @Override // java.lang.Runnable
                public void run() {
                    StringBuilder sb = new StringBuilder(TrackVoiceSettingsView.this.f25820b.getResources().getString(R.string.IDS_hwh_motiontrack_smart_coach_tips));
                    if (!TextUtils.isEmpty(url)) {
                        String string = TrackVoiceSettingsView.this.f25820b.getResources().getString(R.string.IDS_unusual_stopped_message_more_new);
                        sb.append(string);
                        String string2 = sb.toString();
                        SpannableString spannableString = new SpannableString(string2);
                        int length = string2.length();
                        spannableString.setSpan(new UrlSpanNoUnderline(url + "/huawei_health_coach/EMUI10.0/C001B001/index.html"), length - string.length(), length, 33);
                        TrackVoiceSettingsView.this.as.setMovementMethod(LinkMovementMethod.getInstance());
                        TrackVoiceSettingsView.this.as.setText(spannableString);
                        return;
                    }
                    LogUtil.j("Track_TrackVoiceSettingsView", "configGrsUrl url is null");
                    TrackVoiceSettingsView.this.as.setText(sb.toString());
                }
            });
        }
    }

    public void e() {
        int i = this.av;
        if ((i == 258 || i == 264) && jwz.c() && (this.f25821c instanceof SportAssistSettingsActivity)) {
            LogUtil.a("Track_TrackVoiceSettingsView", "refresh, getSportBeatFromDb");
            SportMetronomeActivity.b(new a());
        } else {
            this.z.setVisibility(8);
            this.v.setVisibility(8);
        }
    }

    public void a() {
        c((SportBeat) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final SportBeat sportBeat) {
        HandlerExecutor.c(new Runnable() { // from class: sxf
            @Override // java.lang.Runnable
            public final void run() {
                this.f48784c.b(sportBeat);
            }
        });
    }

    public /* synthetic */ void b(SportBeat sportBeat) {
        if (this.f25821c == null) {
            LogUtil.j("Track_TrackVoiceSettingsView", "initMetronomeData, mActivity is null");
            return;
        }
        if (sportBeat != null && sportBeat.isOpen()) {
            int frequency = sportBeat.getFrequency();
            this.ae.setText(getResources().getQuantityString(R.plurals.IDS_steps_rate, frequency, UnitUtil.e(frequency, 1, 0)));
        } else {
            this.ae.setText(getResources().getString(R.string.IDS_startup_hms_disabled));
        }
        this.af.setVisibility(SharedPreferenceManager.b(Integer.toString(20002), "metronome_page_show", false) ? 8 : 0);
    }

    public static class UrlSpanNoUnderline extends URLSpan {
        UrlSpanNoUnderline(String str) {
            super(str);
        }

        @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
        public void onClick(View view) {
            Uri uri = Uri.parse(getURL());
            Context context = view.getContext();
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, uri);
            intent.putExtra("com.android.browser.application_id", context.getPackageName());
            try {
                qrs.c(intent, "com.android.browser.application_id", context, qre.f(R.string.IDS_browser_app_name));
            } catch (ActivityNotFoundException unused) {
                LogUtil.j("URLSpan", "Actvity was not found for intent, " + intent.toString());
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(Color.parseColor("#fb6522"));
            textPaint.setUnderlineText(false);
        }
    }

    private void r() {
        this.i = new int[]{500, 1000, 2000, 3000};
        this.bb = new int[]{5, 10, 15, 20};
        c();
        int iC = tfi.c(BaseApplication.getContext());
        if (iC == 0) {
            tfi.f(BaseApplication.getContext(), 2);
            tfi.c(BaseApplication.getContext(), 1000);
            c(2, 1);
            return;
        }
        c(tfi.c(BaseApplication.getContext()), a(iC));
    }

    private void c() {
        this.d.add(getResources().getString(R.string.IDS_hwh_motiontrack_voice_interval_distance));
        this.d.add(getResources().getString(R.string.IDS_hwh_motiontrack_voice_interval_time));
        ArrayList<String> arrayList = new ArrayList<>(10);
        ArrayList<String> arrayList2 = new ArrayList<>(10);
        try {
            int[] iArr = this.bb;
            if (iArr != null && iArr.length > 0) {
                for (int i : iArr) {
                    arrayList.add(getResources().getString(R.string.IDS_hw_show_set_target_sport_time_unit, UnitUtil.e(i, 1, 0)));
                }
            }
            int[] iArr2 = this.i;
            if (iArr2 != null && iArr2.length > 0) {
                for (int i2 = 0; i2 < this.i.length; i2++) {
                    if (i2 == 0) {
                        arrayList2.add(getResources().getString(R.string.IDS_hw_show_sport_kms_string, UnitUtil.e(((double) this.i[i2]) / 1000.0d, 1, 1)));
                    } else {
                        arrayList2.add(getResources().getString(R.string.IDS_hw_show_sport_kms_string, UnitUtil.e(((double) this.i[i2]) / 1000.0d, 1, 0)));
                    }
                }
            }
        } catch (IndexOutOfBoundsException e2) {
            LogUtil.j("Track_TrackVoiceSettingsView", "IndexOutOfBoundsException ", e2.getMessage());
        }
        this.f.put(this.d.get(0), arrayList2);
        this.f.put(this.d.get(1), arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, int i2) {
        tfi.f(BaseApplication.getContext(), i);
        try {
            if (i == 1) {
                int[] iArr = this.bb;
                if (iArr != null) {
                    if (iArr.length > i2) {
                        this.ax.setText(this.f.get(this.d.get(1)).get(i2));
                    }
                    if (i2 < this.bb.length && i2 >= 0) {
                        tfi.j(BaseApplication.getContext(), this.bb[i2]);
                        return;
                    }
                    tfi.j(BaseApplication.getContext(), this.bb[0]);
                    return;
                }
                return;
            }
            int[] iArr2 = this.i;
            if (iArr2 != null) {
                if (iArr2.length > i2) {
                    this.ax.setText(this.f.get(this.d.get(0)).get(i2));
                }
                if (i2 < this.i.length && i2 >= 0) {
                    tfi.c(BaseApplication.getContext(), this.i[i2]);
                    return;
                }
                tfi.c(BaseApplication.getContext(), this.i[0]);
            }
        } catch (IndexOutOfBoundsException e2) {
            LogUtil.e("Track_TrackVoiceSettingsView", "updateVoiceInterval IndexOutOfBoundsException ", e2.getMessage());
        }
    }

    private int a(int i) {
        int i2 = 0;
        if (i == 2) {
            int iA = tfi.a(BaseApplication.getContext());
            while (true) {
                int[] iArr = this.i;
                if (i2 >= iArr.length) {
                    break;
                }
                if (iA == iArr[i2]) {
                    return i2;
                }
                i2++;
            }
        } else if (i == 1) {
            int iD = tfi.d(BaseApplication.getContext());
            while (true) {
                int[] iArr2 = this.bb;
                if (i2 < iArr2.length) {
                    if (iD == iArr2[i2]) {
                        return i2;
                    }
                    i2++;
                }
            }
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        if (i == 112) {
            this.q.setVisibility(0);
            this.ab.setVisibility(0);
            this.q.setOnClickListener(this);
            ai();
            return;
        }
        if (i == 113) {
            this.q.setVisibility(8);
            this.ab.setVisibility(8);
        } else {
            LogUtil.j("Track_TrackVoiceSettingsView", "showSportMusic, listenStatus = ", Integer.valueOf(i));
        }
    }

    private void ai() {
        int iE = tfi.e(BaseApplication.getContext());
        this.ar = iE;
        if (iE == 0) {
            this.aa.setText(R.string.IDS_hwh_motiontrack_music);
        } else {
            this.aa.setText(R.string.IDS_hwh_motiontrack_listen_book);
        }
    }

    static class e extends BaseHandler<TrackVoiceSettingsView> {
        WeakReference<TrackVoiceSettingsView> d;

        e(TrackVoiceSettingsView trackVoiceSettingsView) {
            super(trackVoiceSettingsView);
            this.d = new WeakReference<>(trackVoiceSettingsView);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(TrackVoiceSettingsView trackVoiceSettingsView, Message message) {
            TrackVoiceSettingsView trackVoiceSettingsView2;
            if (message == null || (trackVoiceSettingsView2 = this.d.get()) == null) {
                return;
            }
            switch (message.what) {
                case 111:
                    trackVoiceSettingsView2.am();
                    break;
                case 112:
                    trackVoiceSettingsView2.b(112);
                    break;
                case CreativeType.WINDOW_IMAGE_WITH_DOWNLOAD_BUTTON /* 113 */:
                    trackVoiceSettingsView2.b(CreativeType.WINDOW_IMAGE_WITH_DOWNLOAD_BUTTON);
                    break;
                case 115:
                    trackVoiceSettingsView2.ae();
                    break;
            }
        }
    }

    public class ListenTypeAdapter extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String[] f25835a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Context f25837c;
        private int d;
        private boolean e;

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        public ListenTypeAdapter(String[] strArr, Context context, int i, boolean z) {
            if (strArr != null) {
                this.f25835a = (String[]) strArr.clone();
            }
            this.f25837c = context;
            this.d = i;
            this.e = z;
        }

        public void c(int i, d dVar) {
            if (dVar == null || dVar.f25839a == null) {
                LogUtil.j("Track_TrackVoiceSettingsView", "updateCheckedItem viewHolder is null");
                return;
            }
            if (this.e) {
                int i2 = this.d;
                if (i2 == 0 && i == 0) {
                    TrackVoiceSettingsView.this.ao = 0;
                    dVar.f25839a.setChecked(true);
                    return;
                } else if (i2 == 1 && i == 1) {
                    TrackVoiceSettingsView.this.ao = 1;
                    dVar.f25839a.setChecked(true);
                    return;
                } else {
                    dVar.f25839a.setChecked(false);
                    return;
                }
            }
            int i3 = this.d;
            if (i3 == 0 && i == 0) {
                TrackVoiceSettingsView.this.ar = 0;
                dVar.f25839a.setChecked(true);
            } else if (i3 == 1 && i == 1) {
                TrackVoiceSettingsView.this.ar = 1;
                dVar.f25839a.setChecked(true);
            } else {
                dVar.f25839a.setChecked(false);
            }
        }

        @Override // android.widget.Adapter
        public int getCount() {
            String[] strArr = this.f25835a;
            if (strArr == null) {
                LogUtil.j("Track_TrackVoiceSettingsView", "getCount: mType is null");
                return 0;
            }
            return strArr.length;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            String[] strArr = this.f25835a;
            if (strArr == null) {
                LogUtil.j("Track_TrackVoiceSettingsView", "getItem: mType is null");
                return "";
            }
            if (i >= 0 && i < strArr.length) {
                return strArr[i];
            }
            return strArr[0];
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            d dVar;
            if (view == null) {
                view = View.inflate(this.f25837c, R.layout.custom_list_item_single_choice, null);
                dVar = new d();
                dVar.f25839a = (CheckedTextView) view.findViewById(R.id.text1);
                dVar.f25840b = (HealthDivider) view.findViewById(R.id.divide_line);
                view.setTag(dVar);
            } else {
                if (!(view.getTag() instanceof d)) {
                    LogUtil.a("Track_TrackVoiceSettingsView", "!view.getTag() instanceof ViewHolder");
                    return view;
                }
                dVar = (d) view.getTag();
            }
            String[] strArr = this.f25835a;
            if (strArr == null) {
                LogUtil.j("Track_TrackVoiceSettingsView", "getView: mType is null");
                return view;
            }
            if (i >= 0 && i < strArr.length) {
                if (this.f25835a[i].equals(this.f25837c.getResources().getString(this.e ? R.string.IDS_motiontrack_decrease_music : R.string.IDS_hwh_motiontrack_music)) && dVar.f25840b != null) {
                    dVar.f25840b.setVisibility(0);
                }
                if (dVar.f25839a != null) {
                    dVar.f25839a.setText(this.f25835a[i]);
                }
                c(i, dVar);
            }
            return view;
        }

        public void d(int i) {
            this.d = i;
            notifyDataSetChanged();
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        CheckedTextView f25839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthDivider f25840b;

        d() {
        }
    }
}
