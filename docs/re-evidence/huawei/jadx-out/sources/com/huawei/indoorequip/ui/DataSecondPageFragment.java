package com.huawei.indoorequip.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.huawei.healthcloud.plugintrack.model.SportDetailChartDataType;
import com.huawei.healthcloud.plugintrack.sportmusic.SportMusicController;
import com.huawei.healthcloud.plugintrack.ui.view.MusicControlLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.R;
import com.huawei.indoorequip.activity.IndoorEquipDisplayActivity;
import com.huawei.indoorequip.magnet.RealTimeDynamicChartView;
import com.huawei.indoorequip.ui.view.SportEquipItemDrawer;
import com.huawei.indoorequip.viewmodel.BaseRealTimeDynamicChartViewModel;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.columnlayout.HealthColumnLinearLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import defpackage.erj;
import defpackage.gzv;
import defpackage.izw;
import defpackage.jaa;
import defpackage.nyh;
import defpackage.nyl;
import defpackage.nyw;
import defpackage.nzc;
import defpackage.nzh;
import defpackage.nzi;
import defpackage.nzj;
import defpackage.nzn;
import defpackage.nzq;
import defpackage.nzu;
import defpackage.nzv;
import defpackage.nzw;
import defpackage.nzx;
import defpackage.qrr;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.Utils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class DataSecondPageFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f17810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthColumnLinearLayout f17811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f17812c;
    private nyw d;
    private IndoorEquipDisplayActivity g;
    private Context h;
    private HealthColumnLinearLayout j;
    private MusicControlLayout k;
    private ImageView l;
    private ImageView m;
    private HealthProgressBar n;
    private int s;
    private SportEquipItemDrawer t;
    private long i = 0;
    private float f = 0.0f;
    private Map<SportDetailChartDataType, BaseRealTimeDynamicChartViewModel> e = new HashMap();
    private Handler o = new Handler() { // from class: com.huawei.indoorequip.ui.DataSecondPageFragment.4
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            super.handleMessage(message);
            if (message.what != 7) {
                return;
            }
            if (DataSecondPageFragment.this.isAdded()) {
                if (message.obj instanceof HashMap) {
                    DataSecondPageFragment.this.c((HashMap) message.obj);
                    return;
                }
                return;
            }
            LogUtil.e("Track_IDEQ_DataSecondPageFragment", "updateUi, isAdded = false");
        }
    };

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.data_second_page_layout, (ViewGroup) null);
        if (isAdded() && getActivity() != null) {
            getActivity().setRequestedOrientation(1);
            if (getActivity() instanceof IndoorEquipDisplayActivity) {
                this.g = (IndoorEquipDisplayActivity) getActivity();
            }
        }
        int iL = this.g.l();
        this.s = iL;
        LogUtil.a("Track_IDEQ_DataSecondPageFragment", "Current sport :", Integer.valueOf(iL));
        c(viewInflate);
        this.t = (SportEquipItemDrawer) viewInflate.findViewById(R.id.second_pager_drawer);
        this.f17811b = (HealthColumnLinearLayout) viewInflate.findViewById(R.id.vertical_layout_chart);
        this.d = new nyw(getContext(), false);
        this.f17812c = (ImageView) viewInflate.findViewById(R.id.ie_bt_icon);
        this.f17810a = (ImageView) viewInflate.findViewById(R.id.ie_bolt_icon);
        this.n = (HealthProgressBar) viewInflate.findViewById(R.id.hw_recycler_loading_hpb);
        this.k = (MusicControlLayout) viewInflate.findViewById(R.id.music_content_layout);
        HealthColumnLinearLayout healthColumnLinearLayout = (HealthColumnLinearLayout) viewInflate.findViewById(R.id.music_column_layout);
        this.j = healthColumnLinearLayout;
        healthColumnLinearLayout.setPadding(0, qrs.d(this.h, 8.0f), 0, 0);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.ie_music_icon);
        this.m = imageView;
        imageView.setImageDrawable(nzc.b(this.h, R.drawable.ic_rope_music));
        this.f17812c.setImageDrawable(nzc.b(this.h, nyh.a(this.s, true)));
        if (this.g.af()) {
            this.f17810a.setVisibility(0);
            this.f17810a.setImageResource(nzc.a(this.g.ah()));
            LogUtil.a("Track_IDEQ_DataSecondPageFragment", "mIndoorEquipDisplayActivity.connectBoltNumber()", Integer.valueOf(this.g.ah()));
        }
        i();
        this.l = (ImageView) viewInflate.findViewById(R.id.ie_miracast_icon);
        if (Utils.c() == 1 && CommonUtil.bg() && CommonUtil.bb()) {
            this.l.setVisibility(0);
            return viewInflate;
        }
        this.l.setVisibility(8);
        return viewInflate;
    }

    private void i() {
        this.k.setSportTypeDrawable(true, this.s);
        if (nyl.b(this.s)) {
            this.m.setVisibility(8);
            this.j.setVisibility(8);
        } else if (this.k.getTrackSharedPreferenceUtil().h(this.s) == 1 && jaa.c(this.h)) {
            this.m.setVisibility(8);
            this.j.setVisibility(0);
        } else {
            this.m.setVisibility(0);
            this.j.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.m.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.indoorequip.ui.DataSecondPageFragment.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (DataSecondPageFragment.this.isAdded()) {
                    if (DataSecondPageFragment.this.c()) {
                        LogUtil.j("Track_IDEQ_DataSecondPageFragment", "onClick() too fast");
                        return;
                    }
                    if (DataSecondPageFragment.this.getActivity() != null) {
                        nzc.e(DataSecondPageFragment.this.getActivity().getApplicationContext(), "MusicBtn");
                    }
                    if (nzc.d(DataSecondPageFragment.this.s)) {
                        if (DataSecondPageFragment.this.k != null) {
                            erj.b(DataSecondPageFragment.this.h, DataSecondPageFragment.this.s);
                            DataSecondPageFragment.this.k.d();
                            return;
                        }
                        return;
                    }
                    if (CommonUtil.bh() && CommonUtil.w(izw.p)) {
                        Intent intent = new Intent("android.intent.action.MUSIC_PLAYER");
                        intent.setFlags(268435456);
                        intent.setPackage(izw.p);
                        DataSecondPageFragment.this.startActivity(intent);
                        return;
                    }
                    LogUtil.j("Track_IDEQ_DataSecondPageFragment", "Don't play music.");
                }
            }
        });
        this.l.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.indoorequip.ui.DataSecondPageFragment.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (DataSecondPageFragment.this.getActivity() != null) {
                    nzc.e(DataSecondPageFragment.this.getActivity().getApplicationContext(), "ProjectionBtn");
                }
                DataSecondPageFragment.this.g.ai();
            }
        });
    }

    public boolean c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.i < 1000) {
            LogUtil.j("Track_IDEQ_DataSecondPageFragment", "onClick ", "click too fast");
            this.i = jCurrentTimeMillis;
            return true;
        }
        this.i = jCurrentTimeMillis;
        return false;
    }

    private void c(View view) {
        SportDetailChartDataType[] sportDetailChartDataTypeArrE = nyh.e(this.s, this.g.af(), b());
        if (sportDetailChartDataTypeArrE == null) {
            return;
        }
        LogUtil.a("Track_IDEQ_DataSecondPageFragment", "sport chart:", Arrays.toString(sportDetailChartDataTypeArrE));
        for (SportDetailChartDataType sportDetailChartDataType : sportDetailChartDataTypeArrE) {
            BaseRealTimeDynamicChartViewModel baseRealTimeDynamicChartViewModelD = d(view, sportDetailChartDataType);
            if (baseRealTimeDynamicChartViewModelD != null) {
                baseRealTimeDynamicChartViewModelD.updateConfiguration(this.h);
                this.e.put(sportDetailChartDataType, baseRealTimeDynamicChartViewModelD);
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.indoorequip.ui.DataSecondPageFragment$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17814a;

        static {
            int[] iArr = new int[SportDetailChartDataType.values().length];
            f17814a = iArr;
            try {
                iArr[SportDetailChartDataType.STEP_RATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17814a[SportDetailChartDataType.GROUND_CONTACT_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17814a[SportDetailChartDataType.GROUND_IMPACT_ACCELERATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17814a[SportDetailChartDataType.ACTIVE_PEAK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17814a[SportDetailChartDataType.REALTIME_PACE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17814a[SportDetailChartDataType.PADDLE_FREQUENCY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17814a[SportDetailChartDataType.CADENCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f17814a[SportDetailChartDataType.POWER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f17814a[SportDetailChartDataType.SPEED_RATE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    private BaseRealTimeDynamicChartViewModel d(View view, SportDetailChartDataType sportDetailChartDataType) {
        switch (AnonymousClass2.f17814a[sportDetailChartDataType.ordinal()]) {
            case 1:
                nzw nzwVar = new nzw(c(view, R.id.step_rate_chart));
                nzwVar.setDefaultOrdinateY();
                return nzwVar;
            case 2:
                nzh nzhVar = new nzh(c(view, R.id.touchdown_magnet));
                nzhVar.setDefaultOrdinateY();
                return nzhVar;
            case 3:
                nzi nziVar = new nzi(c(view, R.id.ground_impact_magnet));
                nziVar.setDefaultOrdinateY();
                return nziVar;
            case 4:
                nzn nznVar = new nzn(c(view, R.id.ground_shock_peak));
                nznVar.setDefaultOrdinateY();
                return nznVar;
            case 5:
                nzu nzuVar = new nzu(c(view, R.id.rt_pace_chart));
                nzuVar.setDefaultOrdinateY();
                return nzuVar;
            case 6:
                nzq nzqVar = new nzq(c(view, R.id.paddle_freq_magnet), b());
                nzqVar.setDefaultOrdinateY();
                return nzqVar;
            case 7:
                nzj nzjVar = new nzj(c(view, R.id.cadence_chart));
                if (this.s == 273) {
                    nzjVar.setOrdinateY(0, 120);
                    return nzjVar;
                }
                nzjVar.setDefaultOrdinateY();
                return nzjVar;
            case 8:
                nzx nzxVar = new nzx(c(view, R.id.power_chart));
                nzxVar.setDefaultOrdinateY();
                return nzxVar;
            case 9:
                nzv nzvVar = new nzv(c(view, R.id.speed_rate_chart));
                nzvVar.setDefaultOrdinateY();
                return nzvVar;
            default:
                return null;
        }
    }

    private RealTimeDynamicChartView c(View view, int i) {
        RealTimeDynamicChartView realTimeDynamicChartView = (RealTimeDynamicChartView) view.findViewById(i);
        realTimeDynamicChartView.setVisibility(0);
        b(realTimeDynamicChartView);
        return realTimeDynamicChartView;
    }

    private void b(RealTimeDynamicChartView realTimeDynamicChartView) {
        if (qrs.af(this.h)) {
            HealthTextView healthTextView = (HealthTextView) realTimeDynamicChartView.findViewById(R.id.title);
            HealthTextView healthTextView2 = (HealthTextView) realTimeDynamicChartView.findViewById(R.id.value);
            healthTextView.setTextSize(0, getResources().getDimension(R.dimen.health_common_14dp));
            healthTextView.setTypeface(qrr.g());
            healthTextView2.setTextSize(0, getResources().getDimension(R.dimen.health_common_30dp));
        }
    }

    public void b(Map<Integer, Object> map) {
        Handler handler;
        if (map == null || !isAdded() || (handler = this.o) == null) {
            return;
        }
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.what = 7;
        messageObtainMessage.obj = map;
        this.o.sendMessage(messageObtainMessage);
    }

    public void a() {
        if (!isAdded() || this.f17812c == null) {
            return;
        }
        this.n.setVisibility(8);
        this.f17812c.setImageDrawable(nzc.b(this.h, nyh.a(this.s, false)));
    }

    public void d() {
        if (!isAdded() || this.f17812c == null) {
            return;
        }
        this.n.setVisibility(8);
        this.f17812c.setImageDrawable(nzc.b(this.h, nyh.a(this.s, true)));
    }

    public void e() {
        if (!isAdded() || this.f17812c == null) {
            return;
        }
        this.n.setVisibility(0);
        this.f17812c.setImageDrawable(nzc.b(this.h, nyh.a(this.s)));
    }

    private void g() {
        this.f = 0.0f;
        this.d.b(this.t, new HashMap(), nyh.a(264, 1, -1, b()));
        if (this.e.get(SportDetailChartDataType.GROUND_CONTACT_TIME) != null) {
            this.e.get(SportDetailChartDataType.GROUND_CONTACT_TIME).pushNewData(0, 0.0f);
        }
        if (this.e.get(SportDetailChartDataType.GROUND_IMPACT_ACCELERATION) != null) {
            this.e.get(SportDetailChartDataType.GROUND_IMPACT_ACCELERATION).pushNewData(0, 0.0f);
        }
        if (this.e.get(SportDetailChartDataType.ACTIVE_PEAK) != null) {
            this.e.get(SportDetailChartDataType.ACTIVE_PEAK).pushNewData(0, 0.0f);
        }
    }

    private void a(Map<Integer, Object> map) {
        if (this.s == 264 && ((gzv) map.get(20002)) == null) {
            LogUtil.e("Track_IDEQ_DataSecondPageFragment", "updateUi, runningPosture == null");
            g();
            return;
        }
        for (Map.Entry<SportDetailChartDataType, BaseRealTimeDynamicChartViewModel> entry : this.e.entrySet()) {
            SportDetailChartDataType key = entry.getKey();
            BaseRealTimeDynamicChartViewModel value = entry.getValue();
            if (value == null) {
                LogUtil.e("Track_IDEQ_DataSecondPageFragment", "updateChartUi,chartViewModel == null", key.toString());
            } else {
                e(map, key, value);
            }
        }
    }

    private void e(Map<Integer, Object> map, SportDetailChartDataType sportDetailChartDataType, BaseRealTimeDynamicChartViewModel baseRealTimeDynamicChartViewModel) {
        switch (AnonymousClass2.f17814a[sportDetailChartDataType.ordinal()]) {
            case 1:
                baseRealTimeDynamicChartViewModel.pushNewData(e(map, 4), this.f);
                break;
            case 2:
                baseRealTimeDynamicChartViewModel.pushNewData(((gzv) map.get(20002)).a(), this.f);
                break;
            case 3:
                baseRealTimeDynamicChartViewModel.pushNewData(((gzv) map.get(20002)).d(), this.f);
                break;
            case 4:
                baseRealTimeDynamicChartViewModel.pushNewData(((gzv) map.get(20002)).o(), this.f);
                break;
            case 5:
                b(map, baseRealTimeDynamicChartViewModel);
                break;
            case 6:
                d(map, baseRealTimeDynamicChartViewModel);
                break;
            case 7:
                baseRealTimeDynamicChartViewModel.pushNewData(e(map, 31));
                break;
            case 8:
                baseRealTimeDynamicChartViewModel.pushNewData(e(map, 7));
                break;
            case 9:
                baseRealTimeDynamicChartViewModel.pushNewData(e(map, 3) / 100.0f);
                break;
        }
    }

    private int e(Map<Integer, Object> map, int i) {
        if (map == null || !map.containsKey(Integer.valueOf(i))) {
            return 0;
        }
        Object obj = map.get(Integer.valueOf(i));
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    private void b(Map<Integer, Object> map, BaseRealTimeDynamicChartViewModel baseRealTimeDynamicChartViewModel) {
        int iIntValue;
        Object obj = map.get(14);
        if (obj instanceof Integer) {
            iIntValue = ((Integer) obj).intValue();
        } else {
            LogUtil.a("Track_IDEQ_DataSecondPageFragment", "pushPaceFreq() other paceFreq = ", obj);
            iIntValue = 0;
        }
        baseRealTimeDynamicChartViewModel.pushNewData(iIntValue);
    }

    private void d(Map<Integer, Object> map, BaseRealTimeDynamicChartViewModel baseRealTimeDynamicChartViewModel) {
        float fIntValue;
        Object obj = map.get(26);
        if (obj instanceof Float) {
            fIntValue = ((Float) obj).floatValue();
        } else if (obj instanceof Integer) {
            fIntValue = ((Integer) obj).intValue();
        } else {
            LogUtil.a("Track_IDEQ_DataSecondPageFragment", "pushPaddleFreq() other paddleFreq = ", obj);
            fIntValue = 0.0f;
        }
        baseRealTimeDynamicChartViewModel.pushNewData(fIntValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Map<Integer, Object> map) {
        if (map == null || this.d == null) {
            LogUtil.e("Track_IDEQ_DataSecondPageFragment", "updateUi, indoorEquipDataStructForShow == null");
            return;
        }
        int[] iArrA = nyh.a(this.s, 1, -1, b());
        if (iArrA != null && iArrA.length > 0) {
            this.d.b(this.t, map, iArrA);
        }
        if (this.s == 264) {
            this.f = ((Integer) map.get(3)).intValue() / 100.0f;
        }
        a(map);
    }

    private String b() {
        IndoorEquipDisplayActivity indoorEquipDisplayActivity = this.g;
        if (indoorEquipDisplayActivity == null || indoorEquipDisplayActivity.o() == null) {
            return "";
        }
        return this.g.o().s();
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        LogUtil.a("Track_IDEQ_DataSecondPageFragment", BaseDialog.LIFE_CYCLE_ON_PAUSE);
        HealthColumnLinearLayout healthColumnLinearLayout = this.f17811b;
        if (healthColumnLinearLayout != null) {
            healthColumnLinearLayout.setVisibility(4);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        LogUtil.a("Track_IDEQ_DataSecondPageFragment", BaseDialog.LIFE_CYCLE_ON_RESUME);
        HealthColumnLinearLayout healthColumnLinearLayout = this.f17811b;
        if (healthColumnLinearLayout != null) {
            healthColumnLinearLayout.setVisibility(0);
        }
        if (this.k != null) {
            if (!SportMusicController.c().a() && IndoorEquipDisplayActivity.a(this.h, this.s)) {
                this.k.e(this.s);
            }
            this.k.b();
            if (nyl.b(this.s)) {
                this.m.setVisibility(8);
                this.j.setVisibility(8);
            } else if (this.k.getTrackSharedPreferenceUtil().h(this.s) == 1 && jaa.c(this.h) && nzc.d(this.s)) {
                this.m.setVisibility(8);
                this.j.setVisibility(0);
            } else {
                this.m.setVisibility(0);
                this.j.setVisibility(8);
            }
        }
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        LogUtil.a("Track_IDEQ_DataSecondPageFragment", "onAttach");
        this.h = context;
    }
}
