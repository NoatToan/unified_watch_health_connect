package com.huawei.ui.main.stories.fitness.activity.active.provider;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.knit.data.MinorProvider;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.ui.commonui.listener.OnClickSectionListener;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.active.KnitActiveHoursActivity;
import com.huawei.ui.main.stories.fitness.activity.calorie.FitnessCalorieDetailActivity;
import com.huawei.ui.main.stories.fitness.activity.sportintensity.FitnessSportIntensityDetailActivity;
import com.huawei.ui.main.stories.fitness.activity.sportintensity.SportIntensityExplain;
import defpackage.fsj;
import defpackage.fsy;
import defpackage.iov;
import defpackage.lsl;
import defpackage.ltb;
import defpackage.njy;
import defpackage.qdm;
import defpackage.qgm;
import defpackage.qgt;
import defpackage.qgv;
import defpackage.qho;
import defpackage.qpx;
import defpackage.qre;
import defpackage.qrf;
import defpackage.qrs;
import defpackage.ujq;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class ActiveRecordWeekProvider extends MinorProvider<fsj> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f26561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private fsj f26563c;
    private SectionBean f;
    private final Context d = BaseApplication.b();
    private boolean e = true;
    private boolean i = true;

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    public boolean isActive(Context context) {
        return this.e && !qdm.q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.health.knit.data.MinorProvider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onSetSectionBeanData(SectionBean sectionBean, fsj fsjVar) {
        if (fsjVar != null) {
            this.f26563c = fsjVar;
            this.e = fsjVar.ag();
        }
        super.onSetSectionBeanData(sectionBean, fsjVar);
    }

    @Override // com.huawei.health.knit.data.MinorProvider, com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: loadData */
    public void b(Context context, SectionBean sectionBean) {
        Map.Entry<Long, Integer> entry;
        super.b(context, sectionBean);
        this.f = sectionBean;
        fsj fsjVar = this.f26563c;
        List<Map.Entry<Long, Integer>> listC = fsjVar != null ? c(fsjVar.af()) : null;
        if (!njy.b(listC) || (entry = listC.get(0)) == null || lsl.a(entry.getKey().longValue(), System.currentTimeMillis()) <= 3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("900200007");
            qgv.a(arrayList, 1, new b());
        }
    }

    @Override // com.huawei.health.knit.data.BaseKnitDataProvider, com.huawei.health.knit.data.KnitDataProvider
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void parseParams(Context context, HashMap<String, Object> map, fsj fsjVar) {
        super.parseParams(context, map, fsjVar);
        if (context == null || map == null || fsjVar == null) {
            ReleaseLogUtil.d("R_ActiveRecordWeekProvider", "parseParams context ", context, " outParams ", map, " data ", fsjVar);
            return;
        }
        this.f26563c = fsjVar;
        this.f26562b = lsl.z(fsjVar.f());
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(b(this.f26563c));
        arrayList.add(c(this.f26563c));
        arrayList.add(e(this.f26563c));
        map.put("VIEW_LIST", arrayList);
        map.put("CLICK_EVENT_LISTENER", c(context));
    }

    private OnClickSectionListener c(final Context context) {
        return new OnClickSectionListener() { // from class: com.huawei.ui.main.stories.fitness.activity.active.provider.ActiveRecordWeekProvider.4
            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(String str) {
                ReleaseLogUtil.c("R_ActiveRecordWeekProvider", "getClickSectionListener onClick subView ", str);
                ActiveRecordWeekProvider.this.d(context, str);
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i) {
                ReleaseLogUtil.c("R_ActiveRecordWeekProvider", "getClickSectionListener onClick position ", Integer.valueOf(i));
                if (!qrs.r()) {
                    ActiveRecordWeekProvider.this.b(context, i);
                } else {
                    ReleaseLogUtil.d("R_ActiveRecordWeekProvider", "getClickSectionListener onClick isFastClick position ", Integer.valueOf(i));
                }
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, int i2) {
                ReleaseLogUtil.c("R_ActiveRecordWeekProvider", "getClickSectionListener onClick index ", Integer.valueOf(i), " position ", Integer.valueOf(i2));
            }

            @Override // com.huawei.ui.commonui.listener.OnClickSectionListener
            public void onClick(int i, String str) {
                ReleaseLogUtil.c("R_ActiveRecordWeekProvider", "getClickSectionListener onClick index ", Integer.valueOf(i), " subView ", str);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ReleaseLogUtil.c("R_ActiveRecordWeekProvider", "getClickSectionListener onClick view ", view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.hashCode();
        if (!str.equals("GOAL_BUTTON")) {
            if (str.equals("RIGHT_ICON_CLICK_EVENT")) {
                iov.d(context, new Intent(this.d, (Class<?>) SportIntensityExplain.class));
                return;
            } else {
                ReleaseLogUtil.d("R_ActiveRecordWeekProvider", "setClick default subViewType ", str);
                return;
            }
        }
        qgm.c("900200007", this.f26561a * 1000, new ResponseCallback() { // from class: tuq
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                ObserverManagerUtil.e("observer_refresh_active_record_provider", "");
            }
        });
        fsj fsjVar = this.f26563c;
        if (fsjVar != null) {
            int iC = fsjVar.c();
            int i = this.f26561a;
            ujq.e(4, 1, ujq.b(iC, i, 4, i), this.f26561a);
            qpx.e(this.d, R.string.IDS_active_heat_target_toast);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context, int i) {
        Intent intent = new Intent();
        if (i == 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("intent_key_query_start_time", ltb.m(ltb.d()));
            intent.putExtra("bundle_key_data", bundle);
            intent.setClass(this.d, FitnessCalorieDetailActivity.class);
            fsj fsjVar = this.f26563c;
            if (fsjVar != null) {
                intent.putExtra("today_current_colories_total", fsjVar.b() * 1000);
                intent.putExtra("default_time_millis", this.f26563c.f());
            }
            iov.d(context, intent);
            ujq.d();
            ujq.a(1, 4);
            return;
        }
        if (i == 1) {
            intent.setClass(this.d, FitnessSportIntensityDetailActivity.class);
            fsj fsjVar2 = this.f26563c;
            if (fsjVar2 != null) {
                intent.putExtra("today_current_middle_and_high_total", fsjVar2.g());
                intent.putExtra("default_time_millis", this.f26563c.f());
            }
            iov.d(context, intent);
            ujq.b(4);
            ujq.a(1, 2);
            return;
        }
        if (i == 2) {
            fsj fsjVar3 = this.f26563c;
            if (fsjVar3 == null) {
                KnitActiveHoursActivity.e(context);
            } else {
                KnitActiveHoursActivity.a(context, fsjVar3.f());
            }
            ujq.b(3);
            ujq.a(1, 3);
            return;
        }
        ReleaseLogUtil.d("R_ActiveRecordWeekProvider", "setClick default position ", Integer.valueOf(i));
    }

    private List<Map.Entry<Long, Integer>> c(Map<Long, Integer> map) {
        if (map == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(map.entrySet());
        Collections.sort(arrayList, new Comparator<Map.Entry<Long, Integer>>() { // from class: com.huawei.ui.main.stories.fitness.activity.active.provider.ActiveRecordWeekProvider.3
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int compare(Map.Entry<Long, Integer> entry, Map.Entry<Long, Integer> entry2) {
                return Long.compare(entry != null ? entry.getKey().longValue() : 0L, entry2 != null ? entry2.getKey().longValue() : 0L);
            }
        });
        return arrayList;
    }

    private List<Integer> b(Map<Long, Integer> map) {
        ArrayList arrayList = new ArrayList(7);
        for (Map.Entry<Long, Integer> entry : c(map)) {
            if (entry != null) {
                arrayList.add(entry.getValue());
            }
        }
        for (int size = arrayList.size(); size < 8; size++) {
            arrayList.add(0);
        }
        return arrayList;
    }

    private fsy b(fsj fsjVar) {
        fsy fsyVar = new fsy(fsjVar.f(), R.drawable.svg_icon_caloric_trend_card, qre.f(R.string.IDS_active_caloric), 0);
        fsyVar.c(b(fsjVar, fsyVar));
        int iB = fsjVar.b();
        fsyVar.b(d(c(iB), UnitUtil.e(iB, 1, 0)));
        int iN = fsjVar.n();
        fsyVar.e(d(c(iN), UnitUtil.e(iN, 1, 0)));
        fsyVar.b(fsjVar.c());
        fsyVar.d(b(fsjVar.af()));
        fsyVar.d(ContextCompat.getColor(this.d, R.color.active_caloric_default));
        fsyVar.e(ContextCompat.getColor(this.d, R.color.active_caloric_focus));
        fsyVar.a(ContextCompat.getColor(this.d, R.color.active_caloric_target));
        return fsyVar;
    }

    private fsy c(fsj fsjVar) {
        fsy fsyVar = new fsy(fsjVar.f(), R.drawable.svg_icon_workout_trend_card, qre.f(R.string.IDS_active_workout), R.drawable.ic_health_toolbar_help);
        fsyVar.c(a(fsjVar));
        fsyVar.c(0);
        int iG = fsjVar.g();
        fsyVar.b(d(b(iG), UnitUtil.e(iG, 1, 0)));
        int iM = fsjVar.m();
        fsyVar.e(d(b(iM), UnitUtil.e(iM, 1, 0)));
        fsyVar.b(fsjVar.i());
        fsyVar.d(b(fsjVar.ah()));
        fsyVar.d(ContextCompat.getColor(this.d, R.color.active_workout_default));
        fsyVar.e(ContextCompat.getColor(this.d, R.color.active_workout_focus));
        fsyVar.a(ContextCompat.getColor(this.d, R.color.active_workout_target));
        return fsyVar;
    }

    private fsy e(fsj fsjVar) {
        fsy fsyVar = new fsy(fsjVar.f(), R.drawable.svg_icon_hour_trend_card, qho.e(R.string.IDS_active_hours), 0);
        fsyVar.c(d(fsjVar));
        fsyVar.c(0);
        int iP = fsjVar.p();
        fsyVar.b(d(d(iP), UnitUtil.e(iP, 1, 0)));
        int iK = fsjVar.k();
        fsyVar.e(d(d(iK), UnitUtil.e(iK, 1, 0)));
        fsyVar.b(fsjVar.q());
        fsyVar.d(b(fsjVar.aa()));
        fsyVar.d(ContextCompat.getColor(this.d, R.color.active_hours_default));
        fsyVar.e(ContextCompat.getColor(this.d, R.color.active_time_color));
        fsyVar.a(ContextCompat.getColor(this.d, R.color.active_hours_target));
        return fsyVar;
    }

    private CharSequence d(String str, String str2) {
        SpannableString spannableString = new SpannableString(str);
        int iIndexOf = str.indexOf(str2);
        if (iIndexOf <= -1) {
            ReleaseLogUtil.d("R_ActiveRecordWeekProvider", "getValue index ", Integer.valueOf(iIndexOf));
            return spannableString;
        }
        int length = iIndexOf + str2.length();
        int length2 = str.length();
        spannableString.setSpan(new AbsoluteSizeSpan(12, true), length, length2, 17);
        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this.d, R.color.textColorSecondary)), length, length2, 17);
        spannableString.setSpan(new TypefaceSpan(qre.f(R.string.textFontFamilyRegular)), length, length2, 17);
        return spannableString;
    }

    private CharSequence b(fsj fsjVar, fsy fsyVar) {
        int iC = fsjVar.c();
        int i = this.f26561a;
        if (i > 0 && i != iC && !this.f26562b) {
            fsyVar.c(1);
            if (this.i) {
                ujq.a(2);
                this.i = false;
            }
            return qre.a(R.string.IDS_active_week_heat_target_change, c(iC), c(this.f26561a));
        }
        fsyVar.c(0);
        int iB = fsjVar.b();
        int iSubtractExact = Math.subtractExact(iB, fsjVar.n());
        String strC = c(Math.abs(iSubtractExact));
        if (this.f26562b) {
            if (iSubtractExact >= 50) {
                return qre.f(R.string.IDS_active_week_heat_tip_history_1);
            }
            if (iSubtractExact > 0) {
                return qre.a(R.string.IDS_active_week_heat_tip_history_2, strC);
            }
            if (iSubtractExact == 0) {
                return qre.f(R.string.IDS_active_week_heat_tip_history_4);
            }
            return qre.a(R.string.IDS_active_week_heat_tip_history_3, strC);
        }
        if (iB < iC) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(Integer.valueOf(R.string.IDS_active_week_heat_tip_1));
            arrayList.add(Integer.valueOf(R.string.IDS_active_week_heat_tip_2));
            return qre.a(((Integer) arrayList.get(qrf.d(arrayList.size()))).intValue(), c(Math.subtractExact(iC, iB)));
        }
        if (iSubtractExact >= 50) {
            return qre.f(R.string.IDS_active_week_heat_tip_done_1);
        }
        if (iSubtractExact > 0) {
            return qre.a(R.string.IDS_active_week_heat_tip_done_2, strC);
        }
        if (iSubtractExact == 0) {
            return qre.f(R.string.IDS_active_week_heat_tip_done_4);
        }
        return qre.a(R.string.IDS_active_week_heat_tip_done_3, strC);
    }

    private CharSequence a(fsj fsjVar) {
        int iG = fsjVar.g();
        int iSubtractExact = Math.subtractExact(iG, fsjVar.m());
        String strE = e(Math.abs(iSubtractExact));
        if (this.f26562b) {
            if (iSubtractExact >= 20) {
                return qre.f(R.string.IDS_active_week_workout_tip_history_1);
            }
            if (iSubtractExact > 0) {
                return qre.a(R.string.IDS_active_week_workout_tip_history_2, strE);
            }
            if (iSubtractExact == 0) {
                return qre.f(R.string.IDS_active_week_workout_tip_history_4);
            }
            return qre.a(R.string.IDS_active_week_workout_tip_history_3, strE);
        }
        int i = fsjVar.i();
        if (iG >= i) {
            Map<Long, Integer> mapAh = fsjVar.ah();
            int iIntValue = 0;
            if (mapAh != null) {
                for (Map.Entry<Long, Integer> entry : mapAh.entrySet()) {
                    if (entry != null) {
                        iIntValue += entry.getValue().intValue();
                    }
                }
            }
            if (iIntValue >= 150) {
                return qre.a(R.string.IDS_active_week_workout_tip_done_1, e(150));
            }
            if (iSubtractExact >= 20) {
                return qre.a(R.string.IDS_active_week_workout_tip_done_2, b(iIntValue), b(150), b(75));
            }
            if (iSubtractExact > 0) {
                return qre.a(R.string.IDS_active_week_workout_tip_done_3, b(Math.abs(iSubtractExact)), b(iIntValue), b(150), b(75));
            }
            if (iSubtractExact == 0) {
                return qre.a(R.string.IDS_active_week_workout_tip_done_5, b(iIntValue), b(150), b(75));
            }
            return qre.a(R.string.IDS_active_week_workout_tip_done_4, strE, e(iIntValue), e(150), e(75));
        }
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(Integer.valueOf(R.string.IDS_active_week_workout_tip_1));
        arrayList.add(Integer.valueOf(R.string.IDS_active_week_workout_tip_5));
        ArrayList arrayList2 = new ArrayList(4);
        int iSubtractExact2 = Math.subtractExact(i, iG);
        String strE2 = e(iSubtractExact2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(qre.a(((Integer) it.next()).intValue(), strE2));
        }
        arrayList2.add(a(R.plurals.IDS_active_week_workout_tip_2, iSubtractExact2));
        arrayList2.add(a(R.plurals.IDS_active_week_workout_tip_3, iSubtractExact2));
        return (CharSequence) arrayList2.get(qrf.d(arrayList2.size()));
    }

    private CharSequence d(fsj fsjVar) {
        int iA = fsjVar.a();
        String strA = a(iA);
        if (this.f26562b) {
            if (iA >= 5) {
                return qre.a(R.string.IDS_active_week_hour_tip_history_1, strA);
            }
            if (iA >= 2) {
                return qre.a(R.string.IDS_active_week_hour_tip_history_2, strA);
            }
            if (iA > 0) {
                return qre.a(R.string.IDS_active_week_hour_tip_history_3, strA);
            }
            return qre.f(R.string.IDS_active_week_hour_tip_history_4);
        }
        int iP = fsjVar.p();
        int iQ = fsjVar.q();
        if (iP >= iQ) {
            return qre.a(R.string.IDS_active_week_hour_tip_done, strA);
        }
        int iSubtractExact = Math.subtractExact(iQ, iP);
        if (iSubtractExact > Math.subtractExact(24, Calendar.getInstance().get(11))) {
            return qre.f(R.string.IDS_active_week_hour_tip_4);
        }
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(qre.a(R.string.IDS_active_week_hour_tip_2, d(iSubtractExact)));
        arrayList.add(a(R.plurals.IDS_active_week_hour_tip_1, iSubtractExact));
        return (CharSequence) arrayList.get(qrf.d(arrayList.size()));
    }

    private String c(int i) {
        return a(R.plurals.IDS_caloric_diff_kcals, i);
    }

    private String a(int i) {
        return a(R.plurals.IDS_physiology_day, i);
    }

    private String d(int i) {
        return a(R.plurals.IDS_hour_unit, i);
    }

    private String e(int i) {
        return a(R.plurals.IDS_min_unit, i);
    }

    private String b(int i) {
        return a(R.plurals.IDS_min_insert_unit, i);
    }

    private String a(int i, int i2) {
        return qre.e(i, i2, UnitUtil.e(i2, 1, 0));
    }

    static class b implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<ActiveRecordWeekProvider> f26565a;

        private b(ActiveRecordWeekProvider activeRecordWeekProvider) {
            this.f26565a = new WeakReference<>(activeRecordWeekProvider);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            ActiveRecordWeekProvider activeRecordWeekProvider = this.f26565a.get();
            if (activeRecordWeekProvider == null) {
                ReleaseLogUtil.d("R_ActiveRecordWeekProvider", "InternalCallback onResponse provider is null");
                return;
            }
            if (i != 0) {
                ReleaseLogUtil.d("R_ActiveRecordWeekProvider", "InternalCallback onResponse errorCode ", Integer.valueOf(i));
                return;
            }
            if (!(obj instanceof HashMap)) {
                ReleaseLogUtil.d("R_ActiveRecordWeekProvider", "InternalCallback onResponse object ", obj);
                return;
            }
            qgt qgtVar = (qgt) ((HashMap) obj).get("900200007");
            if (qgtVar == null) {
                ReleaseLogUtil.d("R_ActiveRecordWeekProvider", "InternalCallback onResponse goalModel is null");
                return;
            }
            if (qgtVar.c() == 0) {
                return;
            }
            activeRecordWeekProvider.f26561a = qgtVar.d() / 1000;
            if (activeRecordWeekProvider.f == null || activeRecordWeekProvider.f26563c == null) {
                return;
            }
            activeRecordWeekProvider.f.c(activeRecordWeekProvider.f26563c);
        }
    }
}
