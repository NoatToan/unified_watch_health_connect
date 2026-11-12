package com.huawei.indoorequip.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.health.device.datatype.IntermitentJumpData;
import com.huawei.health.sportservice.SportDataOutputApi;
import com.huawei.healthcloud.plugintrack.sportmusic.SportMusicController;
import com.huawei.healthcloud.plugintrack.ui.view.MusicControlLayout;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.R;
import com.huawei.indoorequip.activity.IndoorEquipDisplayActivity;
import com.huawei.indoorequip.datastruct.SupportDataRange;
import com.huawei.indoorequip.ui.view.SportEquipItemDrawer;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.columnlayout.HealthColumnLinearLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import defpackage.erj;
import defpackage.izw;
import defpackage.jaa;
import defpackage.ltc;
import defpackage.njy;
import defpackage.nyh;
import defpackage.nyl;
import defpackage.nyw;
import defpackage.nzc;
import defpackage.qqv;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class DataFirstPageFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f17806a;
    private HealthTextView ab;
    private View ac;
    private int ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f17807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private nyw f17808c;
    private IndoorEquipDisplayActivity d;
    private ImageView e;
    private HealthTextView f;
    private HealthColumnLinearLayout h;
    private IntermitentJumpData i;
    private HealthTextView j;
    private HealthTextView k;
    private ImageView l;
    private MusicControlLayout m;
    private ImageView o;
    private RelativeLayout p;
    private HealthProgressBar q;
    private RelativeLayout r;
    private HealthTextView s;
    private HealthProgressBar t;
    private int u;
    private SportEquipItemDrawer w;
    private HealthTextView x;
    private HealthTextView y;
    private long n = 0;
    private boolean g = false;
    private int v = 6;

    public static DataFirstPageFragment c(Bundle bundle) {
        DataFirstPageFragment dataFirstPageFragment = new DataFirstPageFragment();
        dataFirstPageFragment.setArguments(bundle);
        return dataFirstPageFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (qrs.af(this.f17807b)) {
            this.ac = layoutInflater.inflate(R.layout.data_first_page_layout_tahiti, (ViewGroup) null);
        } else {
            this.ac = layoutInflater.inflate(R.layout.data_first_page_layout, (ViewGroup) null);
        }
        a(this.ac);
        return this.ac;
    }

    private void a(View view) {
        if (isAdded() && getActivity() != null) {
            getActivity().setRequestedOrientation(1);
            if (getActivity() instanceof IndoorEquipDisplayActivity) {
                this.d = (IndoorEquipDisplayActivity) getActivity();
            }
        }
        this.u = getArguments().getInt("deviceType");
        this.v = getArguments().getInt("currentSkipperTargetType");
        this.ad = getArguments().getInt("currentSkipperTarget");
        if (this.u == 283) {
            this.i = (IntermitentJumpData) getArguments().getParcelable("type_intermittent_jump_mode_data");
        }
        LogUtil.a("Track_IDEQ_DataFirstPageFragment", "Current sport :", Integer.valueOf(this.u), "current target :", Integer.valueOf(this.v), "current  value:", Integer.valueOf(this.ad));
        c(view);
        f(view);
        f();
        this.m = (MusicControlLayout) view.findViewById(R.id.music_content_layout);
        HealthColumnLinearLayout healthColumnLinearLayout = (HealthColumnLinearLayout) view.findViewById(R.id.music_column_layout);
        this.h = healthColumnLinearLayout;
        healthColumnLinearLayout.setPadding(0, qrs.d(this.f17807b, 8.0f), 0, 0);
        this.m.setSportTypeDrawable(true, this.u);
        if (nyl.b(this.u)) {
            this.o.setVisibility(8);
            this.h.setVisibility(8);
        } else if (this.m.getTrackSharedPreferenceUtil().h(this.u) == 1 && jaa.c(this.f17807b)) {
            this.h.setVisibility(0);
            this.o.setVisibility(8);
        } else {
            this.h.setVisibility(8);
            this.o.setVisibility(0);
        }
    }

    private void f() {
        if (Utils.c() == 1 && CommonUtil.bg() && CommonUtil.bb() && this.u != 283) {
            this.l.setVisibility(0);
        } else {
            this.l.setVisibility(8);
        }
    }

    private void f(View view) {
        this.f17806a = (ImageView) view.findViewById(R.id.ie_bt_icon);
        this.e = (ImageView) view.findViewById(R.id.ie_bolt_icon);
        this.q = (HealthProgressBar) view.findViewById(R.id.hw_recycler_loading_hpb);
        ImageView imageView = (ImageView) view.findViewById(R.id.ie_music_icon);
        this.o = imageView;
        imageView.setImageDrawable(nzc.b(this.f17807b, R.drawable.ic_rope_music));
        this.f17806a.setImageDrawable(nzc.b(this.f17807b, nyh.a(this.u, true)));
        if (this.d.af()) {
            this.e.setVisibility(0);
            this.e.setImageResource(nzc.a(this.d.ah()));
        }
        this.l = (ImageView) view.findViewById(R.id.ie_miracast_icon);
    }

    private void c(View view) {
        view.findViewById(R.id.view_stub_distance).setVisibility(0);
        this.p = (RelativeLayout) view.findViewById(R.id.relativeLayout_distance_value);
        this.r = (RelativeLayout) view.findViewById(R.id.relativeLayout_distance_value_rope_skipping);
        if (this.u == 283 || "291".equals(h())) {
            this.p.setVisibility(8);
            this.r.setVisibility(0);
            this.f = (HealthTextView) view.findViewById(R.id.distance_value_rope_skipping);
            this.j = (HealthTextView) view.findViewById(R.id.distance_unit_rope_skipping);
            view.findViewById(R.id.ie_layout_map_tracking).setBackgroundResource(R.color.transparent);
            if (!qqv.c(this.f17807b)) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                layoutParams.topMargin = getResources().getDimensionPixelOffset(R.dimen.health_common_8dp);
                LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.linearlayout_view_stub);
                linearLayout.setLayoutParams(layoutParams);
                linearLayout.setOrientation(1);
            }
        } else {
            this.p.setVisibility(0);
            this.r.setVisibility(8);
            this.f = (HealthTextView) view.findViewById(R.id.distance_value);
            this.j = (HealthTextView) view.findViewById(R.id.distance_unit);
        }
        if (this.u == 283) {
            this.f.setTypeface(Typeface.createFromAsset(BaseApplication.getContext().getAssets(), "font/HarmonyOSCondensedClockProportional-Medium.ttf"));
        }
        this.w = (SportEquipItemDrawer) view.findViewById(R.id.first_display_item_drawer);
        e(view);
        d(view);
        SupportDataRange supportDataRangeK = this.d.k() != null ? this.d.k() : null;
        LogUtil.a("Track_IDEQ_DataFirstPageFragment", "initCourseView hasHeartRateDeviceConnect() :", Boolean.valueOf(this.d.ag()));
        this.f17808c = new nyw(this.f17807b, this.u, this.d.ag(), supportDataRangeK);
        int[] iArrA = nyh.a(this.u, 0, this.v, h());
        if (this.u == 264 && this.d.ag()) {
            if (!njy.d(iArrA)) {
                iArrA = Arrays.copyOf(iArrA, iArrA.length - 1);
            }
            LogUtil.a("Track_IDEQ_DataFirstPageFragment", "not show pace", Arrays.toString(iArrA));
        }
        this.f17808c.d(this.w, new HashMap(), iArrA);
    }

    public void i() {
        nyw nywVar = this.f17808c;
        if (nywVar != null) {
            nywVar.setIsShowHeartRate(true);
        }
    }

    private void e(View view) {
        if (this.u == 283) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMarginStart(0);
            layoutParams.setMarginEnd(0);
            this.w.setLayoutParams(layoutParams);
            this.s = (HealthTextView) view.findViewById(R.id.distance_value);
            this.x = (HealthTextView) view.findViewById(R.id.distance_unit);
            this.t = (HealthProgressBar) view.findViewById(R.id.progressbar_target);
            this.ab = (HealthTextView) view.findViewById(R.id.target_type);
            this.y = (HealthTextView) view.findViewById(R.id.target_value);
            this.k = (HealthTextView) view.findViewById(R.id.number_target_unit);
            this.ab.setVisibility(8);
            int i = this.v;
            if (i == 0) {
                view.findViewById(R.id.target_progress_layout).setVisibility(0);
                this.y.setText(getResources().getString(R.string.IDS_indoor_skipper_rope_time, UnitUtil.b(this.ad)));
                this.j.setVisibility(8);
                this.k.setVisibility(8);
                this.f.setText(UnitUtil.b(0));
                return;
            }
            if (i != 5) {
                if (i != 6 && i != 7) {
                    if (i == 8) {
                        b(view);
                        return;
                    } else if (i != 10 && i != 11) {
                        return;
                    }
                }
                view.findViewById(R.id.target_progress_layout).setVisibility(4);
                this.j.setVisibility(0);
                this.j.setText(this.f17807b.getResources().getQuantityString(R.plurals.IDS_indoor_skipper_number_unit_value, 0, "").trim());
                this.f.setText(UnitUtil.e(0.0d, 1, 0));
                return;
            }
            view.findViewById(R.id.target_progress_layout).setVisibility(0);
            Resources resources = this.f17807b.getResources();
            int i2 = R.plurals.IDS_indoor_skipper_number_unit_value;
            int i3 = this.ad;
            this.y.setText(getResources().getString(R.string.IDS_indoor_skipper_rope_time, resources.getQuantityString(i2, i3, Integer.valueOf(i3))));
            this.f.setText(UnitUtil.e(0.0d, 1, 0));
        }
    }

    private void d(View view) {
        String string;
        double dB;
        if (nzc.i(this.u)) {
            j(view);
            int i = this.v;
            if (i == 0) {
                view.findViewById(R.id.target_progress_layout).setVisibility(0);
                this.s.setText(UnitUtil.b(0));
                this.x.setText(getString(R.string.IDS_hw_motiontrack_segment_use_time));
                e(UnitUtil.e(((double) this.ad) / 60.0d, 1, 0), getString(R.string.IDS_motiontrack_detail_fm_heart_min));
                return;
            }
            if (i != 1) {
                if (i == 2) {
                    view.findViewById(R.id.target_progress_layout).setVisibility(0);
                    this.s.setText(UnitUtil.e(0.0d, 1, 0));
                    this.x.setText(getString(R.string.IDS_track_total_calories_kcal));
                    e(UnitUtil.e(this.ad, 1, 0), getString(R.string.IDS_band_data_sport_energy_unit));
                    return;
                }
                LogUtil.a("Track_IDEQ_DataFirstPageFragment", "initTargetLayout, mTargetType is ", Integer.valueOf(i));
                return;
            }
            view.findViewById(R.id.target_progress_layout).setVisibility(0);
            boolean zF = UnitUtil.f();
            if (zF) {
                string = getString(R.string.IDS_motiontrack_show_sport_unit_mi);
            } else {
                string = getString(R.string.IDS_motiontrack_show_sport_unit_km);
            }
            this.s.setText(UnitUtil.e(0.0d, 1, 2));
            this.x.setText(string);
            if (zF) {
                dB = ltc.d(this.ad);
            } else {
                dB = ltc.b(this.ad);
            }
            e(UnitUtil.e(dB, 1, 2), string);
        }
    }

    private void j(View view) {
        this.s = (HealthTextView) view.findViewById(R.id.distance_value);
        this.x = (HealthTextView) view.findViewById(R.id.distance_unit);
        this.t = (HealthProgressBar) view.findViewById(R.id.progressbar_target);
        view.findViewById(R.id.target_progress).setVisibility(8);
        view.findViewById(R.id.target_detail_layout).setVisibility(0);
        this.y = (HealthTextView) view.findViewById(R.id.target_value_text);
        this.k = (HealthTextView) view.findViewById(R.id.target_unit_text);
        this.ab = (HealthTextView) view.findViewById(R.id.target_type_text);
    }

    private void e(String str, String str2) {
        this.y.setText(str);
        this.k.setText(str2);
        this.ab.setText(this.u == 264 ? getString(R.string.IDS_hwh_motiontrack_sport_data_run) : getString(R.string.IDS_hwh_motiontrack_sport_data_cycle));
    }

    private void b(View view) {
        view.findViewById(R.id.target_progress_layout).setVisibility(0);
        ViewGroup.LayoutParams layoutParams = this.p.getLayoutParams();
        layoutParams.height = -2;
        this.p.setLayoutParams(layoutParams);
        this.p.setVisibility(0);
        this.x.setVisibility(8);
        this.s.setTextSize(1, 12.0f);
        this.s.setTextColor(this.f17807b.getColor(R.color.ie_text_view_color));
        this.s.setTypeface(Typeface.create(getString(R.string.textFontFamilyRegular), 0));
        this.s.setText(UnitUtil.e(1.0d, 1, 0) + "/" + UnitUtil.e(this.i.getIntermittentJumpGroups(), 1, 0));
        if (this.i.getIntermittentJumpMode() == 1) {
            this.j.setVisibility(8);
            this.f.setText(UnitUtil.b(this.i.getIntermittentJumpExerciseTime()));
            this.y.setText(getResources().getString(R.string.IDS_indoor_skipper_rope_time, UnitUtil.b(this.i.getIntermittentJumpExerciseTime())));
        } else {
            this.j.setVisibility(8);
            this.y.setText(getResources().getString(R.string.IDS_indoor_skipper_rope_time, this.f17807b.getResources().getQuantityString(R.plurals.IDS_indoor_skipper_number_unit_value, this.i.getIntermittentJumpExerciseNum(), "")));
        }
        this.ab.setVisibility(8);
        this.k.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.g = true;
        this.o.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.indoorequip.ui.DataFirstPageFragment.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Track_IDEQ_DataFirstPageFragment", "mMusicIcon onClick()", Boolean.valueOf(DataFirstPageFragment.this.isAdded()));
                if (DataFirstPageFragment.this.isAdded()) {
                    if (DataFirstPageFragment.this.d()) {
                        LogUtil.j("Track_IDEQ_DataFirstPageFragment", "onClick() too fast");
                        return;
                    }
                    if (DataFirstPageFragment.this.getActivity() != null) {
                        nzc.e(DataFirstPageFragment.this.getActivity().getApplicationContext(), "MusicBtn");
                    }
                    if (nzc.d(DataFirstPageFragment.this.getArguments().getInt("deviceType"))) {
                        if (DataFirstPageFragment.this.m != null) {
                            erj.b(DataFirstPageFragment.this.f17807b, DataFirstPageFragment.this.u);
                            DataFirstPageFragment.this.m.d();
                            LogUtil.a("Track_IDEQ_DataFirstPageFragment", "gotoMusic");
                            return;
                        }
                        return;
                    }
                    if (CommonUtil.bh() && CommonUtil.w(izw.p)) {
                        Intent intent = new Intent("android.intent.action.MUSIC_PLAYER");
                        intent.setFlags(268435456);
                        intent.setPackage(izw.p);
                        DataFirstPageFragment.this.startActivity(intent);
                        LogUtil.a("Track_IDEQ_DataFirstPageFragment", "startActivity");
                        return;
                    }
                    LogUtil.j("Track_IDEQ_DataFirstPageFragment", "Don't play music.");
                }
            }
        });
        this.l.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.indoorequip.ui.DataFirstPageFragment.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (DataFirstPageFragment.this.getActivity() != null) {
                    nzc.e(DataFirstPageFragment.this.getActivity().getApplicationContext(), "ProjectionBtn");
                }
                DataFirstPageFragment.this.d.ai();
            }
        });
    }

    public boolean d() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.n < 1000) {
            LogUtil.j("Track_IDEQ_DataFirstPageFragment", "onClick ", "click too fast");
            this.n = jCurrentTimeMillis;
            return true;
        }
        this.n = jCurrentTimeMillis;
        return false;
    }

    public void b(Map<Integer, Object> map) {
        if (map == null || !isAdded() || !this.g || this.f17808c == null) {
            LogUtil.a("Track_IDEQ_DataFirstPageFragment", "isAdded() = ", Boolean.valueOf(isAdded()), " mIsInitFinish = ", Boolean.valueOf(this.g));
            return;
        }
        int[] iArrA = nyh.a(this.u, a(map), this.v, h());
        if (this.u == 264 && this.d.ag() && !njy.d(iArrA)) {
            iArrA = Arrays.copyOf(iArrA, iArrA.length - 1);
        }
        LogUtil.a("Track_IDEQ_DataFirstPageFragment", Arrays.toString(iArrA));
        this.f17808c.d(this.w, map, iArrA);
        int iIntValue = map.get(1) == null ? 0 : ((Integer) map.get(1)).intValue();
        boolean zF = UnitUtil.f();
        int i = this.u;
        if (i == 283) {
            e(map);
            return;
        }
        if (nzc.i(i)) {
            c(map, zF);
        } else if (h().equals("291")) {
            d(map);
        } else {
            a(iIntValue, zF);
        }
    }

    public void d(int i) {
        HealthProgressBar healthProgressBar = this.t;
        if (healthProgressBar != null) {
            healthProgressBar.setProgress(i);
        }
    }

    private int a(Map<Integer, Object> map) {
        boolean zC = c(map);
        if (this.u != 283 || this.v != 8) {
            return 0;
        }
        if (zC) {
            return this.i.getIntermittentJumpMode() == 0 ? 5 : 6;
        }
        return 7;
    }

    private String h() {
        IndoorEquipDisplayActivity indoorEquipDisplayActivity = this.d;
        if (indoorEquipDisplayActivity == null || indoorEquipDisplayActivity.o() == null) {
            return "";
        }
        return this.d.o().s();
    }

    private void d(Map<Integer, Object> map) {
        this.f.setText(UnitUtil.e(a(map, 38), 1, 0));
        this.j.setText(this.f17807b.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_sport_data_time, a(map, 38)));
    }

    private void e(Map<Integer, Object> map) {
        int i = this.v;
        if (i != 0) {
            if (i != 5 && i != 6 && i != 7) {
                if (i == 8) {
                    i(map);
                    return;
                } else if (i != 10 && i != 11) {
                    LogUtil.j("Track_IDEQ_DataFirstPageFragment", "Target Type is =", Integer.valueOf(i));
                    return;
                }
            }
            this.f.setText(UnitUtil.e(a(map, 40001), 1, 0));
            this.j.setText(this.f17807b.getResources().getQuantityString(R.plurals.IDS_indoor_skipper_number_unit_value, a(map, 40001), ""));
            return;
        }
        this.f.setText(UnitUtil.b(a(map, 2)));
    }

    private void c(Map<Integer, Object> map, boolean z) {
        int iIntValue = map.get(1) == null ? 0 : ((Integer) map.get(1)).intValue();
        int iIntValue2 = map.get(6) == null ? 0 : ((Integer) map.get(6)).intValue();
        int i = this.v;
        if (i == 0) {
            this.s.setText(UnitUtil.b(a(map, 2)));
            return;
        }
        if (i == 1) {
            a(iIntValue, z);
        } else if (i == 2) {
            this.s.setText(UnitUtil.e(iIntValue2, 1, 0));
        } else {
            a(iIntValue, z);
        }
    }

    private void i(Map<Integer, Object> map) {
        String string;
        String strB;
        String string2;
        boolean zC = c(map);
        int iA = a(map, 40016);
        int iA2 = a(map, 40051);
        int iA3 = a(map, 40052);
        int iA4 = a(map, 40011);
        if (this.i.getIntermittentJumpMode() == 0) {
            if (zC) {
                strB = UnitUtil.e(iA, 1, 0);
            } else {
                strB = UnitUtil.b(iA3);
            }
            String quantityString = this.f17807b.getResources().getQuantityString(R.plurals.IDS_indoor_skipper_number_unit_value, this.i.getIntermittentJumpExerciseNum(), Integer.valueOf(this.i.getIntermittentJumpExerciseNum()));
            if (zC) {
                string2 = getResources().getString(R.string.IDS_indoor_skipper_rope_time, quantityString);
            } else {
                string2 = getResources().getString(R.string.IDS_indoor_skipper_rope_sport_rested, UnitUtil.b(this.i.getIntermittentJumpBreakTime()));
            }
            this.f.setText(strB);
            this.y.setText(string2);
        } else if (this.i.getIntermittentJumpMode() == 1) {
            this.f.setText(zC ? UnitUtil.b(iA2) : UnitUtil.b(iA3));
            HealthTextView healthTextView = this.y;
            if (zC) {
                string = getResources().getString(R.string.IDS_indoor_skipper_rope_time, UnitUtil.b(this.i.getIntermittentJumpExerciseTime()));
            } else {
                string = getResources().getString(R.string.IDS_indoor_skipper_rope_sport_rested, UnitUtil.b(this.i.getIntermittentJumpBreakTime()));
            }
            healthTextView.setText(string);
        } else {
            LogUtil.j("Track_IDEQ_DataFirstPageFragment", "other mIntermittentJumpMode is =", Integer.valueOf(this.i.getIntermittentJumpMode()));
        }
        this.s.setText(UnitUtil.e(iA4, 1, 0) + "/" + UnitUtil.e(this.i.getIntermittentJumpGroups(), 1, 0));
        this.t.setProgress(b(map, 10003));
    }

    private boolean c(Map<Integer, Object> map) {
        if (this.u != 283 || this.v != 8) {
            return true;
        }
        boolean zC = c(map, 40015);
        LogUtil.a("Track_IDEQ_DataFirstPageFragment", "mIsIntermittentJumpMotion is =", Boolean.valueOf(zC));
        return zC;
    }

    private int b(Map<Integer, Object> map, int i) {
        if (map.get(Integer.valueOf(i)) == null) {
            return 0;
        }
        return ((Integer) map.get(Integer.valueOf(i))).intValue();
    }

    private int a(Map<Integer, Object> map, int i) {
        if (map.get(Integer.valueOf(i)) == null) {
            return 0;
        }
        return ((Integer) map.get(Integer.valueOf(i))).intValue();
    }

    private boolean c(Map<Integer, Object> map, int i) {
        if (map.get(Integer.valueOf(i)) == null) {
            return false;
        }
        Object obj = map.get(Integer.valueOf(i));
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LogUtil.a("Track_IDEQ_DataFirstPageFragment", "sport type :", Integer.valueOf(this.u));
        if (this.m != null) {
            a();
        } else if (this.ac != null) {
            LogUtil.a("Track_IDEQ_DataFirstPageFragment", "reacquire mMusicControlLayout id");
            this.m = (MusicControlLayout) this.ac.findViewById(R.id.music_content_layout);
            a();
        }
        LogUtil.a("Track_IDEQ_DataFirstPageFragment", BaseDialog.LIFE_CYCLE_ON_RESUME);
    }

    public void a() {
        if (((SportDataOutputApi) Services.d("SportService", SportDataOutputApi.class)).getStatus() == 7) {
            LogUtil.a("Track_IDEQ_DataFirstPageFragment", "refreshMusicInfo while count down, return");
            return;
        }
        if (!SportMusicController.c().a() && IndoorEquipDisplayActivity.a(this.f17807b, this.u)) {
            this.m.e(this.u);
        }
        this.m.b();
        if (nyl.b(this.u)) {
            this.o.setVisibility(8);
            this.h.setVisibility(8);
        } else if (this.m.getTrackSharedPreferenceUtil().h(this.u) != 1 || !jaa.c(this.f17807b) || !nzc.d(this.u)) {
            LogUtil.a("Track_IDEQ_DataFirstPageFragment", "back music:", Integer.valueOf(this.u));
            this.o.setVisibility(0);
            this.h.setVisibility(8);
        } else {
            LogUtil.a("Track_IDEQ_DataFirstPageFragment", "ctrl music:", Integer.valueOf(this.u));
            this.o.setVisibility(8);
            this.h.setVisibility(0);
        }
    }

    public void a(int i, boolean z) {
        String string;
        if ((isAdded() && this.f == null && this.j == null) || this.f == null) {
            return;
        }
        float f = i / 1000.0f;
        if (z) {
            f *= 0.621371f;
        }
        this.f.setText(new DecimalFormat("0.00").format(f));
        HealthTextView healthTextView = this.j;
        if (z) {
            string = getResources().getQuantityString(R.plurals.ie_motiontrack_show_sport_unit_mile, i, "");
        } else {
            string = getString(R.string.ie_motiontrack_show_sport_unit_km);
        }
        healthTextView.setText(string);
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        LogUtil.a("Track_IDEQ_DataFirstPageFragment", BaseDialog.LIFE_CYCLE_ON_PAUSE);
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("Track_IDEQ_DataFirstPageFragment", "onCreate");
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        LogUtil.a("Track_IDEQ_DataFirstPageFragment", "onAttach");
        this.f17807b = context;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        LogUtil.a("Track_IDEQ_DataFirstPageFragment", "onDetach, hashCode = ", Integer.valueOf(hashCode()));
    }

    public void e() {
        if (!isAdded() || this.f17806a == null) {
            return;
        }
        this.q.setVisibility(8);
        this.f17806a.setImageDrawable(nzc.b(this.f17807b, nyh.a(this.u, false)));
    }

    public void c() {
        if (!isAdded() || this.f17806a == null) {
            return;
        }
        this.q.setVisibility(8);
        this.f17806a.setImageDrawable(nzc.b(this.f17807b, nyh.a(this.u, true)));
    }

    public void b() {
        if (!isAdded() || this.f17806a == null) {
            return;
        }
        this.q.setVisibility(0);
        this.f17806a.setImageDrawable(nzc.b(this.f17807b, nyh.a(this.u)));
    }
}
