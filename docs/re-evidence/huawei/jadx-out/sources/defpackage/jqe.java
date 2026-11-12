package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.fragment.HeartRateFrag;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.chart.HealthRingChart;
import com.huawei.ui.commonui.chart.HealthRingChartAdapter;
import health.compact.a.LanguageUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;

/* JADX INFO: loaded from: classes10.dex */
public class jqe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f38822a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f38824c;
    private final boolean e;
    private final int[] d = new int[7];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f38823b = new int[7];

    static /* synthetic */ boolean a(int i) {
        return i == 0;
    }

    static /* synthetic */ boolean c(int i) {
        return i < 0;
    }

    public jqe(Context context, MotionPathSimplify motionPathSimplify, boolean z, boolean z2) {
        this.f38822a = context;
        this.f38824c = z;
        this.e = z2;
        ReleaseLogUtil.d("Track_PowerZoneManager", "PowerZoneManager isHidePowerZone:", Boolean.valueOf(z), "isHideAnalogPower:", Boolean.valueOf(z2));
        c(motionPathSimplify, z, z2);
    }

    private void c(MotionPathSimplify motionPathSimplify, boolean z, boolean z2) {
        if (motionPathSimplify == null || motionPathSimplify.requestSportType() != 259) {
            LogUtil.j("Track_PowerZoneManager", "initDuration motionPathSimplify == null");
            return;
        }
        if (!z) {
            this.d[0] = motionPathSimplify.getExtendDataInt("recoveryTime", 0);
            this.d[1] = motionPathSimplify.getExtendDataInt("aerobicTime", 0);
            this.d[2] = motionPathSimplify.getExtendDataInt("rhythmTime", 0);
            this.d[3] = motionPathSimplify.getExtendDataInt("lactateTime", 0);
            this.d[4] = motionPathSimplify.getExtendDataInt(HwExerciseConstants.JSON_NAME_MAX_OXYGEN_TIME, 0);
            this.d[5] = motionPathSimplify.getExtendDataInt(HwExerciseConstants.JSON_NAME_ANAEROBIC_TIME, 0);
            this.d[6] = motionPathSimplify.getExtendDataInt("spurtTime", 0);
        }
        if (!z2) {
            this.f38823b[0] = motionPathSimplify.getExtendDataInt("analogRecoveryTime", 0);
            this.f38823b[1] = motionPathSimplify.getExtendDataInt("analogAerobicTime", 0);
            this.f38823b[2] = motionPathSimplify.getExtendDataInt("analogRhythmTime", 0);
            this.f38823b[3] = motionPathSimplify.getExtendDataInt("analogLactateTime", 0);
            this.f38823b[4] = motionPathSimplify.getExtendDataInt("analogMaxOxygenTime", 0);
            this.f38823b[5] = motionPathSimplify.getExtendDataInt("analogAnaerobicTime", 0);
            this.f38823b[6] = motionPathSimplify.getExtendDataInt("analogSpurtTime", 0);
        }
        LogUtil.a("Track_PowerZoneManager", "initDuration mRealPowerDuration:", qqt.b(this.d), " mAnalogPowerDuration:", qqt.b(this.f38823b));
    }

    private boolean e(int[] iArr) {
        return Arrays.stream(iArr).anyMatch(new IntPredicate() { // from class: jqf
            @Override // java.util.function.IntPredicate
            public final boolean test(int i) {
                return jqe.c(i);
            }
        }) || Arrays.stream(iArr).allMatch(new IntPredicate() { // from class: jqd
            @Override // java.util.function.IntPredicate
            public final boolean test(int i) {
                return jqe.a(i);
            }
        });
    }

    public void b(View view) {
        if (view == null) {
            return;
        }
        c(view);
        d(view);
    }

    private void d(View view) {
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.analog_power_ring_show_layout);
        if (linearLayout == null) {
            return;
        }
        a(linearLayout, (HealthRingChart) linearLayout.findViewById(R.id.ring_view), this.f38823b, this.e);
    }

    private void c(View view) {
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.power_ring_show_layout);
        if (linearLayout == null) {
            return;
        }
        a(linearLayout, (HealthRingChart) linearLayout.findViewById(R.id.ring_view), this.d, this.f38824c);
    }

    private void a(LinearLayout linearLayout, HealthRingChart healthRingChart, int[] iArr, boolean z) {
        if (z || e(iArr)) {
            ReleaseLogUtil.d("Track_PowerZoneManager", "initPowerDataView hide", Boolean.valueOf(z));
        } else {
            d(linearLayout, healthRingChart, iArr);
        }
    }

    private void d(LinearLayout linearLayout, HealthRingChart healthRingChart, int[] iArr) {
        List<qjp> listA = a(iArr);
        HealthRingChartAdapter healthRingChartAdapter = new HealthRingChartAdapter(this.f38822a, new qjm().b(false).c(true), listA);
        healthRingChartAdapter.d(new HealthRingChartAdapter.DataFormatter() { // from class: jqh
            @Override // com.huawei.ui.commonui.chart.HealthRingChartAdapter.DataFormatter
            public final String format(qjp qjpVar) {
                return this.e.b(qjpVar);
            }
        });
        linearLayout.setVisibility(0);
        healthRingChart.setAdapter(healthRingChartAdapter);
        if (LanguageUtil.o(this.f38822a)) {
            healthRingChart.setDesc(qre.f(R.string.IDS_power_zone));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String b(qjp qjpVar) {
        return HeartRateFrag.e((int) qjpVar.f(), this.f38822a);
    }

    private List<qjp> a(int[] iArr) {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(qre.f(R.string.IDS_power_zone_level_sprinting));
        arrayList.add(qre.f(R.string.IDS_power_zone_level_noOxygen));
        arrayList.add(qre.f(R.string.IDS_power_zone_level_maxOxygen));
        arrayList.add(qre.f(R.string.IDS_power_zone_level_lacticacid));
        arrayList.add(qre.f(R.string.IDS_power_zone_level_rhythm));
        arrayList.add(qre.f(R.string.IDS_power_zone_level_aerobic));
        arrayList.add(qre.f(R.string.IDS_power_zone_level_begin));
        ArrayList arrayList2 = new ArrayList(7);
        for (int length = iArr.length - 1; length >= 0; length--) {
            arrayList2.add(Integer.valueOf(iArr[length]));
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(Integer.valueOf(qre.e(this.f38822a, R.color.track_power_spurt_time_start)));
        arrayList3.add(Integer.valueOf(qre.e(this.f38822a, R.color.track_power_anaerobic_time_start)));
        arrayList3.add(Integer.valueOf(qre.e(this.f38822a, R.color.track_power_max_oxygen_time_start)));
        arrayList3.add(Integer.valueOf(qre.e(this.f38822a, R.color.track_power_lactate_time_start)));
        arrayList3.add(Integer.valueOf(qre.e(this.f38822a, R.color.track_power_rhythm_time_start)));
        arrayList3.add(Integer.valueOf(qre.e(this.f38822a, R.color.track_power_aerobic_time_start)));
        arrayList3.add(Integer.valueOf(qre.e(this.f38822a, R.color.track_power_recovery_time_start)));
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(Integer.valueOf(qre.e(this.f38822a, R.color.track_power_spurt_time_end)));
        arrayList4.add(Integer.valueOf(qre.e(this.f38822a, R.color.track_power_anaerobic_time_end)));
        arrayList4.add(Integer.valueOf(qre.e(this.f38822a, R.color.track_power_max_oxygen_time_end)));
        arrayList4.add(Integer.valueOf(qre.e(this.f38822a, R.color.track_power_lactate_time_end)));
        arrayList4.add(Integer.valueOf(qre.e(this.f38822a, R.color.track_power_rhythm_time_end)));
        arrayList4.add(Integer.valueOf(qre.e(this.f38822a, R.color.track_power_aerobic_time_end)));
        arrayList4.add(Integer.valueOf(qre.e(this.f38822a, R.color.track_power_recovery_time_end)));
        int size = arrayList.size();
        ArrayList arrayList5 = new ArrayList(size);
        int i = 0;
        while (i < size) {
            arrayList5.add(new qjp((String) arrayList.get(i), ((Integer) arrayList2.get(i)).intValue(), i < arrayList4.size() ? ((Integer) arrayList4.get(i)).intValue() : qre.e(this.f38822a, R.color.track_power_recovery_time_end), i < arrayList3.size() ? ((Integer) arrayList3.get(i)).intValue() : qre.e(this.f38822a, R.color.track_power_recovery_time_start)));
            i++;
        }
        return arrayList5;
    }
}
