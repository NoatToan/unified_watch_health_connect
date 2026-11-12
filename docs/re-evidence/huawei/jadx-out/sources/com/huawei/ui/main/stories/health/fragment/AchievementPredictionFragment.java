package com.huawei.ui.main.stories.health.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.model.unite.GetRunLevelRsp;
import com.huawei.hwcommonmodel.fitnessdatatype.Vo2maxDetail;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.interactors.healthdata.RunningLevelCurrentData;
import com.huawei.ui.main.stories.health.interactors.healthdata.RunningStateIndexData;
import defpackage.ieg;
import defpackage.izn;
import defpackage.jxk;
import defpackage.jyd;
import defpackage.lls;
import defpackage.lua;
import defpackage.nkb;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.wka;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class AchievementPredictionFragment extends BaseFragment {
    private static final TypeToken<Map<String, int[]>> e = new TypeToken<Map<String, int[]>>() { // from class: com.huawei.ui.main.stories.health.fragment.AchievementPredictionFragment.1
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f27859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f27860b;
    private HealthTextView d;
    private HealthTextView f;
    private HealthTextView g;
    private HealthTextView i;
    private HealthTextView j;
    private int k;
    private HealthTextView l;
    private View m;
    private HealthTextView n;
    private HealthTextView o;
    private Map<Integer, int[]> h = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f27861c = new c(this);

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.m = layoutInflater.inflate(R.layout.fragment_achievement_prediction_child, viewGroup, false);
        a();
        d();
        return this.m;
    }

    private void a() {
        HealthSubHeader healthSubHeader = (HealthSubHeader) qsp.a(this.m, R.id.achievements_title_text);
        healthSubHeader.setSubHeaderBackgroundColor(ContextCompat.getColor(BaseApplication.b(), com.huawei.health.servicesui.R.color.common_transparent));
        healthSubHeader.setPaddingStartEnd(0.0f, 0.0f);
        healthSubHeader.setHeadTitleTypeface(jxk.d(), 1);
        b((HealthTextView) qsp.a(this.m, R.id.running_race_5km), (HealthTextView) qsp.a(this.m, R.id.running_race_10km));
        this.j = (HealthTextView) qsp.a(this.m, R.id.running_race_score);
        this.f27859a = (HealthTextView) qsp.a(this.m, R.id.running_race_5km_value);
        this.i = (HealthTextView) qsp.a(this.m, R.id.running_race_10km_value);
        this.d = (HealthTextView) qsp.a(this.m, R.id.running_half_marathon_value);
        this.f27860b = (HealthTextView) qsp.a(this.m, R.id.running_marathon_value);
        this.o = (HealthTextView) qsp.a(this.m, R.id.running_race_pace);
        this.g = (HealthTextView) qsp.a(this.m, R.id.running_race_5km_pace);
        this.n = (HealthTextView) qsp.a(this.m, R.id.running_race_10km_pace);
        this.f = (HealthTextView) qsp.a(this.m, R.id.running_half_marathon_pace);
        this.l = (HealthTextView) qsp.a(this.m, R.id.running_marathon_pace);
    }

    private void d() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            LogUtil.j("AchievementPredictionChildFragment", "initData arguments is null");
            return;
        }
        this.k = arguments.getInt("vo2max_value", 0);
        Parcelable parcelable = arguments.getParcelable("running_level_data");
        if (parcelable instanceof RunningStateIndexData) {
            RunningStateIndexData runningStateIndexData = (RunningStateIndexData) parcelable;
            if (b(runningStateIndexData)) {
                c(runningStateIndexData);
                d(runningStateIndexData.getRunningLevelCurrentData());
                ReleaseLogUtil.d("AchievementPredictionChildFragment", "running state index data from last page ,", runningStateIndexData.toString());
                return;
            }
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: uuf
            @Override // java.lang.Runnable
            public final void run() {
                this.f50578b.c();
            }
        });
    }

    public /* synthetic */ void c() {
        int iB = ieg.b(new Date(System.currentTimeMillis()));
        new jyd().c(BaseApplication.b(), iB, iB, 0, (IBaseResponseCallback) new e(this));
    }

    private void b(HealthTextView healthTextView, HealthTextView healthTextView2) {
        healthTextView.setText(String.format(Locale.ENGLISH, "%s %2s", UnitUtil.e(5.0d, 1, 0), BaseApplication.b().getString(R.string.IDS_band_data_sport_distance_unit)));
        healthTextView2.setText(String.format(Locale.ENGLISH, "%s %2s", UnitUtil.e(10.0d, 1, 0), BaseApplication.b().getString(R.string.IDS_band_data_sport_distance_unit)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(RunningStateIndexData runningStateIndexData) {
        RunningLevelCurrentData runningLevelCurrentData = runningStateIndexData.getRunningLevelCurrentData();
        c(UnitUtil.e(runningLevelCurrentData.getTimeForFiveKm()), UnitUtil.e(runningLevelCurrentData.getTimeForTenKm()), UnitUtil.e(runningLevelCurrentData.getHalfMarathon()), UnitUtil.e(runningLevelCurrentData.getMarathon()));
        b(runningLevelCurrentData.getKm5Pace(), runningLevelCurrentData.getKm10Pace(), runningLevelCurrentData.getHalfMarathonPace(), runningLevelCurrentData.getMarathonPace());
    }

    private void b(int i, int i2, int i3, int i4) {
        if (i <= 0 && i2 <= 0 && i3 <= 0 && i4 <= 0) {
            e(8);
        } else {
            b(izn.a(i), izn.a(i2), izn.a(i3), izn.a(i4));
            e(0);
        }
    }

    private void b(String str, String str2, String str3, String str4) {
        this.g.setText(str);
        this.n.setText(str2);
        this.f.setText(str3);
        this.l.setText(str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        LogUtil.a("AchievementPredictionChildFragment", "enter CalculateAchievementByOxygen");
        int[] iArrD = d(this.k);
        int i = this.k;
        ReleaseLogUtil.d("AchievementPredictionChildFragment", "maximum oxygen uptake is ", Integer.valueOf(i), "calculate results is ", Arrays.toString(iArrD));
        if (iArrD != null && iArrD.length == 4) {
            c(UnitUtil.e(iArrD[0]), UnitUtil.e(iArrD[1]), UnitUtil.e(iArrD[2]), UnitUtil.e(iArrD[3]));
            e(8);
        } else {
            i();
        }
    }

    private int[] d(int i) {
        if (this.h.isEmpty()) {
            g();
        }
        if (i < 0 || i > 100) {
            LogUtil.j("AchievementPredictionChildFragment", "getRunningPerformancePrediction invalid vo2MaxValue: ", Integer.valueOf(i));
            return new int[0];
        }
        return this.h.get(Integer.valueOf(i));
    }

    private void g() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            LogUtil.e("AchievementPredictionChildFragment", "Activity is null, cannot load data");
            return;
        }
        try {
            InputStream inputStreamOpen = activity.getAssets().open("racepredict/racepredict.json");
            try {
                for (Map.Entry entry : ((Map) lls.e(inputStreamOpen, e)).entrySet()) {
                    this.h.put(Integer.valueOf(qrs.a((String) entry.getKey())), (int[]) entry.getValue());
                }
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
            } catch (Throwable th) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
            LogUtil.e("AchievementPredictionChildFragment", "Failed to load race predict data", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        String string = getString(R.string.IDS_rq_no_forecast);
        c(string, string, string, string);
        this.j.setText(qre.f(R.string.IDS_pace_range_achievement));
        e(8);
    }

    private void e(int i) {
        this.o.setVisibility(i);
        this.g.setVisibility(i);
        this.n.setVisibility(i);
        this.f.setVisibility(i);
        this.l.setVisibility(i);
    }

    private void c(String str, String str2, String str3, String str4) {
        this.f27859a.setText(str);
        this.i.setText(str2);
        this.d.setText(str3);
        this.f27860b.setText(str4);
        this.j.setText(qre.f(R.string.IDS_workout_data_time));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(RunningStateIndexData runningStateIndexData) {
        RunningLevelCurrentData runningLevelCurrentData;
        return runningStateIndexData != null && (runningLevelCurrentData = runningStateIndexData.getRunningLevelCurrentData()) != null && runningLevelCurrentData.getTimeForFiveKm() > 0 && runningLevelCurrentData.getTimeForTenKm() > 0 && runningLevelCurrentData.getHalfMarathon() > 0 && runningLevelCurrentData.getMarathon() > 0;
    }

    private boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("AchievementPredictionChildFragment", "hasDataFromLocalCache data is null or empty");
            return false;
        }
        String[] strArrSplit = str.split(Constants.LINK);
        return ((strArrSplit.length != 4 && strArrSplit.length != 8) || TextUtils.isEmpty(strArrSplit[0]) || TextUtils.isEmpty(strArrSplit[1]) || TextUtils.isEmpty(strArrSplit[2]) || TextUtils.isEmpty(strArrSplit[3])) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(RunningLevelCurrentData runningLevelCurrentData) {
        StringBuilder sb = new StringBuilder();
        sb.append(UnitUtil.e(runningLevelCurrentData.getTimeForFiveKm()));
        sb.append(Constants.LINK);
        sb.append(UnitUtil.e(runningLevelCurrentData.getTimeForTenKm()));
        sb.append(Constants.LINK);
        sb.append(UnitUtil.e(runningLevelCurrentData.getHalfMarathon()));
        sb.append(Constants.LINK);
        sb.append(UnitUtil.e(runningLevelCurrentData.getMarathon()));
        int km5Pace = runningLevelCurrentData.getKm5Pace();
        int km10Pace = runningLevelCurrentData.getKm10Pace();
        int halfMarathonPace = runningLevelCurrentData.getHalfMarathonPace();
        int marathonPace = runningLevelCurrentData.getMarathonPace();
        sb.append(Constants.LINK);
        sb.append(km5Pace);
        sb.append(Constants.LINK);
        sb.append(km10Pace);
        sb.append(Constants.LINK);
        sb.append(halfMarathonPace);
        sb.append(Constants.LINK);
        sb.append(marathonPace);
        lua.a(Integer.toString(10105), "achievement_prediction_data", sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        String strH = lua.h(Integer.toString(10105), "achievement_prediction_data");
        if (e(strH)) {
            String[] strArrSplit = strH.split(Constants.LINK);
            c(strArrSplit[0], strArrSplit[1], strArrSplit[2], strArrSplit[3]);
            if (strArrSplit.length == 8) {
                b(qrs.a(strArrSplit[4]), qrs.a(strArrSplit[5]), qrs.a(strArrSplit[6]), qrs.a(strArrSplit[7]));
            } else {
                e(8);
            }
            ReleaseLogUtil.d("AchievementPredictionChildFragment", "running state index data from sp ,", strArrSplit);
            return;
        }
        if (this.k > 0) {
            ReleaseLogUtil.d("AchievementPredictionChildFragment", "maximum oxygen uptake from previous page");
            b();
        } else {
            nkb.d().e(new a(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Handler handler = this.f27861c;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    static class c extends BaseHandler<AchievementPredictionFragment> {
        c(AchievementPredictionFragment achievementPredictionFragment) {
            super(achievementPredictionFragment);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(AchievementPredictionFragment achievementPredictionFragment, Message message) {
            switch (message.what) {
                case 101:
                    if (!(message.obj instanceof GetRunLevelRsp)) {
                        achievementPredictionFragment.e();
                    } else {
                        RunningStateIndexData runningStateIndexDataC = wka.c((GetRunLevelRsp) message.obj);
                        if (achievementPredictionFragment.b(runningStateIndexDataC)) {
                            achievementPredictionFragment.c(runningStateIndexDataC);
                            achievementPredictionFragment.d(runningStateIndexDataC.getRunningLevelCurrentData());
                            ReleaseLogUtil.d("AchievementPredictionChildFragment", "running state index data from cloud ,", runningStateIndexDataC.toString());
                        } else {
                            achievementPredictionFragment.e();
                        }
                    }
                    break;
                case 102:
                    achievementPredictionFragment.e();
                    break;
                case 103:
                    if (message.obj instanceof Vo2maxDetail) {
                        achievementPredictionFragment.k = ((Vo2maxDetail) message.obj).getVo2maxValue();
                        achievementPredictionFragment.b();
                        ReleaseLogUtil.d("AchievementPredictionChildFragment", "maximum oxygen uptake from data platform");
                    } else {
                        achievementPredictionFragment.i();
                    }
                    break;
                case 104:
                    achievementPredictionFragment.i();
                    break;
                default:
                    LogUtil.j("AchievementPredictionChildFragment", "achievementPredictionHandler switch default");
                    break;
            }
        }
    }

    static class e implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<AchievementPredictionFragment> f27862c;

        e(AchievementPredictionFragment achievementPredictionFragment) {
            this.f27862c = new WeakReference<>(achievementPredictionFragment);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            AchievementPredictionFragment achievementPredictionFragment = this.f27862c.get();
            if (achievementPredictionFragment == null || achievementPredictionFragment.f27861c == null) {
                LogUtil.j("AchievementPredictionChildFragment", "MyRunningData onResponse fragment or mHandler is null");
                return;
            }
            if (i != 200) {
                achievementPredictionFragment.f27861c.sendEmptyMessage(102);
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.obj = obj;
            messageObtain.what = 101;
            achievementPredictionFragment.f27861c.sendMessage(messageObtain);
        }
    }

    static class a implements IBaseResponseCallback {
        WeakReference<AchievementPredictionFragment> e;

        a(AchievementPredictionFragment achievementPredictionFragment) {
            this.e = new WeakReference<>(achievementPredictionFragment);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            AchievementPredictionFragment achievementPredictionFragment = this.e.get();
            if (achievementPredictionFragment == null || achievementPredictionFragment.f27861c == null) {
                LogUtil.j("AchievementPredictionChildFragment", "MaximumOxygenUptakeData onResponse fragment or mHandler is null");
                return;
            }
            if (i != 0) {
                achievementPredictionFragment.f27861c.sendEmptyMessage(104);
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.obj = obj;
            messageObtain.what = 103;
            achievementPredictionFragment.f27861c.sendMessage(messageObtain);
        }
    }
}
