package com.xiaomi.hm.health.ui.sportfitness.fragment;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.DialogFragment;
import cn.com.smartdevices.bracelet.rom.AliveUtils;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.view.SystemBarTintSupport;
import com.huami.lib.view.ViewUtils;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.mifit.sportlib.core.GPSDataController;
import com.huami.mifit.sportlib.utils.FunctionSwitcher;
import com.huami.moving.datacenter.SportConfigDbClient;
import com.huami.moving.ui.event.EventSportSetting;
import com.huami.moving.ui.utils.BeatUtil;
import com.huami.moving.ui.utils.DataFormatter;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.moving.ui.view.PaceNotiSeekBar;
import com.huami.moving.webapi.ConfigAPI;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Runconfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.bolt.BoltSpeakersHelper;
import com.xiaomi.hm.health.manager.UnitManager;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.training.ui.activity.MaxHrRemindHelpActivity;
import com.xiaomi.hm.health.training.ui.widget.HeartRateSeekBar;
import com.xiaomi.hm.health.ui.sportfitness.utils.SportPaceSpeedValue;
import de.greenrobot.event.EventBus;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public class ExerciseSettingFragment extends DialogFragment implements View.OnClickListener {
    public static final int AGE_MAX_HR = 220;
    private static final int P = 1024;
    public static final int PACE_MIN_UNIT = 5;
    private static final int Q = 220;
    private static final int R = 180;
    private static final int S = 150;
    public static final float SPEED_MIN_UNIT = 0.5f;
    private static final int T = 120;
    public static final String TAG = "ExerciseSettingFragment";
    private TextView A;
    private TextView B;
    private LinearLayout C;
    private ListTile D;
    private ListTile E;
    private ListTile F;
    private ListTile G;
    private int H;
    private long I;
    private SportPaceSpeedValue J;
    private SportPaceSpeedValue K;
    private boolean L;
    private BoltSpeakersHelper M;
    private boolean N = false;
    private boolean O = false;
    private Runconfig a;
    private View b;
    private ListTile c;
    private ListTile d;
    private ListTile e;
    private ListTile f;
    private HeartRateSeekBar g;
    private View h;
    private View i;
    private TextView j;
    private TextView k;
    private TextView l;
    private ListTile m;
    private PaceNotiSeekBar n;
    private View o;
    private TextView p;
    private TextView q;
    private ListTile r;
    private PaceNotiSeekBar s;
    private View t;
    private TextView u;
    private TextView v;
    private ListTile w;
    private HeartRateSeekBar x;
    private View y;
    private View z;

    public class a extends ClickableSpan {
        public a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            ExerciseSettingFragment.this.t0();
        }
    }

    public class b implements HeartRateSeekBar.OnSeekBarChangeListener {
        public b() {
        }

        @Override // com.xiaomi.hm.health.training.ui.widget.HeartRateSeekBar.OnSeekBarChangeListener
        public void onProgressChanged(final HeartRateSeekBar seekBar, float progress) {
            int iU = ExerciseSettingFragment.this.U(seekBar, progress);
            ExerciseSettingFragment.this.D0(iU);
            ExerciseSettingFragment.this.j.setText(String.valueOf(iU));
            ExerciseSettingFragment exerciseSettingFragment = ExerciseSettingFragment.this;
            exerciseSettingFragment.E0(exerciseSettingFragment.g, ExerciseSettingFragment.this.h);
        }

        @Override // com.xiaomi.hm.health.training.ui.widget.HeartRateSeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(HeartRateSeekBar seekBar) {
        }

        @Override // com.xiaomi.hm.health.training.ui.widget.HeartRateSeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(HeartRateSeekBar seekBar) {
            ExerciseSettingFragment.this.a.setRemindHeartRate(Integer.valueOf(ExerciseSettingFragment.this.U(seekBar, seekBar.getProgress())));
            ExerciseSettingFragment.this.C0();
        }
    }

    public class c implements HeartRateSeekBar.OnSeekBarChangeListener {
        public c() {
        }

        @Override // com.xiaomi.hm.health.training.ui.widget.HeartRateSeekBar.OnSeekBarChangeListener
        public void onProgressChanged(final HeartRateSeekBar seekBar, float progress) {
            int iT = ExerciseSettingFragment.this.T(seekBar, progress);
            ExerciseSettingFragment.this.B0(iT);
            ExerciseSettingFragment.this.A.setText(String.valueOf(iT));
            ExerciseSettingFragment exerciseSettingFragment = ExerciseSettingFragment.this;
            exerciseSettingFragment.E0(exerciseSettingFragment.x, ExerciseSettingFragment.this.y);
        }

        @Override // com.xiaomi.hm.health.training.ui.widget.HeartRateSeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(HeartRateSeekBar seekBar) {
        }

        @Override // com.xiaomi.hm.health.training.ui.widget.HeartRateSeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(HeartRateSeekBar seekBar) {
            int iT = ExerciseSettingFragment.this.T(seekBar, seekBar.getProgress());
            ExerciseSettingFragment.this.a.setBeatValue(Integer.valueOf(iT));
            ExerciseSettingFragment.this.C0();
            if (ExerciseSettingFragment.this.I > 0) {
                BeatUtil.beatOn((int) ((60.0f / iT) * 1000.0f));
            }
        }
    }

    public class d implements PaceNotiSeekBar.OnSeekBarChangeListener {
        public d() {
        }

        @Override // com.huami.moving.ui.view.PaceNotiSeekBar.OnSeekBarChangeListener
        public void onProgressChanged(final PaceNotiSeekBar seekBar, float progress) {
            if (ExerciseSettingFragment.this.H == 9) {
                ExerciseSettingFragment.this.p.setText(String.format(Locale.getDefault(), "%.1f", Float.valueOf(ExerciseSettingFragment.this.Q(progress, false))));
            } else {
                ExerciseSettingFragment.this.p.setText(DataFormatter.formatTimeInSportFormForPace(ExerciseSettingFragment.this.P(progress, false)));
            }
            ExerciseSettingFragment exerciseSettingFragment = ExerciseSettingFragment.this;
            exerciseSettingFragment.F0(exerciseSettingFragment.n, ExerciseSettingFragment.this.p);
        }

        @Override // com.huami.moving.ui.view.PaceNotiSeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(PaceNotiSeekBar seekBar) {
        }

        @Override // com.huami.moving.ui.view.PaceNotiSeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(PaceNotiSeekBar seekBar) {
            ExerciseSettingFragment.this.z0(ExerciseSettingFragment.this.H == 9 ? 3600.0f / ExerciseSettingFragment.this.Q(seekBar.getProgress(), false) : ExerciseSettingFragment.this.P(seekBar.getProgress(), false));
            ExerciseSettingFragment.this.C0();
        }
    }

    public class e implements PaceNotiSeekBar.OnSeekBarChangeListener {
        public e() {
        }

        @Override // com.huami.moving.ui.view.PaceNotiSeekBar.OnSeekBarChangeListener
        public void onProgressChanged(final PaceNotiSeekBar seekBar, float progress) {
            if (ExerciseSettingFragment.this.H == 9) {
                ExerciseSettingFragment.this.u.setText(String.format(Locale.getDefault(), "%.1f", Float.valueOf(ExerciseSettingFragment.this.Q(progress, true))));
            } else {
                ExerciseSettingFragment.this.u.setText(DataFormatter.formatTimeInSportFormForPace(ExerciseSettingFragment.this.P(progress, true)));
            }
            ExerciseSettingFragment exerciseSettingFragment = ExerciseSettingFragment.this;
            exerciseSettingFragment.F0(exerciseSettingFragment.s, ExerciseSettingFragment.this.u);
        }

        @Override // com.huami.moving.ui.view.PaceNotiSeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(PaceNotiSeekBar seekBar) {
        }

        @Override // com.huami.moving.ui.view.PaceNotiSeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(PaceNotiSeekBar seekBar) {
            float fQ = ExerciseSettingFragment.this.H == 9 ? 3600.0f / ExerciseSettingFragment.this.Q(seekBar.getProgress(), true) : ExerciseSettingFragment.this.P(seekBar.getProgress(), true);
            ExerciseSettingFragment.this.y0(fQ);
            if (GPSDataController.getInstance().isRealStarting()) {
                new BigDecimal(String.valueOf(1000.0f / fQ)).setScale(2, 1);
            }
            ExerciseSettingFragment.this.C0();
        }
    }

    public class f implements Runnable {
        public final /* synthetic */ HeartRateSeekBar a;
        public final /* synthetic */ View b;

        public f(final HeartRateSeekBar val$seekBar, final View val$contianer) {
            this.a = val$seekBar;
            this.b = val$contianer;
        }

        @Override // java.lang.Runnable
        public void run() {
            ExerciseSettingFragment.this.E0(this.a, this.b);
        }
    }

    public class g implements Runnable {
        public final /* synthetic */ PaceNotiSeekBar a;
        public final /* synthetic */ TextView b;

        public g(final PaceNotiSeekBar val$seekBar, final TextView val$paceValue) {
            this.a = val$seekBar;
            this.b = val$paceValue;
        }

        @Override // java.lang.Runnable
        public void run() {
            ExerciseSettingFragment.this.F0(this.a, this.b);
        }
    }

    private void A0() {
        new AlertDialogFragment.Builder(getContext()).setCancelable(true).setTitle(R.string.bolt_pair_speakers_disconnect).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: iw1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) throws IllegalAccessException, InvocationTargetException {
                this.a.s0(dialogInterface, i);
            }
        }).show(requireActivity().getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B0(int beatValue) {
        int i;
        if (beatValue < 180 || beatValue > 220) {
            i = (beatValue < 150 || beatValue >= 180) ? R.string.sport_config_beat_first_stage : R.string.sport_config_beat_advance_stage;
        } else {
            i = R.string.sport_config_beat_high_stage;
        }
        this.B.setText(getString(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C0() {
        SportConfigDbClient.saveConfig(this.a, 1);
        EventBus.getDefault().post(new EventSportSetting());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D0(int heartRate) {
        int i;
        int i2;
        int iV = V();
        float f2 = iV;
        float f3 = 0.6f * f2;
        float f4 = 0.7f * f2;
        float f5 = 0.8f * f2;
        float f6 = f2 * 0.9f;
        float f7 = heartRate;
        if (f7 >= f6 && heartRate <= iV) {
            i = R.string.hr_section_anaerobic_limit;
            i2 = R.color.hr_tape_anaerobic_limit;
        } else if (f7 >= f5 && f7 < f6) {
            i = R.string.hr_section_stamina_strengthen;
            i2 = R.color.hr_tape_stamina_strength;
        } else if (f7 >= f4 && f7 < f5) {
            i = R.string.hr_section_heart_lung_strengthen;
            i2 = R.color.hr_tape_lung_strength;
        } else if (f7 < f3 || f7 >= f4) {
            i = R.string.hr_section_warm_up;
            i2 = R.color.hr_tape_warm_up;
        } else {
            i = R.string.hr_section_fat_burn;
            i2 = R.color.hr_tape_fat_burn;
        }
        ContextCompat.getColor(getContext(), i2);
        this.k.setText(getString(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E0(HeartRateSeekBar seekBar, View contianer) {
        int i;
        float progress = seekBar.getProgress() / seekBar.getMax();
        int width = seekBar.getWidth();
        int i2 = (int) (width * 1.0f * progress);
        int screenWidth = ViewUtils.isRTL() ? ViewUtils.getScreenWidth(getActivity()) - contianer.getRight() : contianer.getLeft();
        int width2 = contianer.getWidth() / 2;
        if (i2 >= width2) {
            if (i2 > width - width2) {
                i = screenWidth + width;
                width2 *= 2;
            } else {
                i = screenWidth + i2;
            }
            screenWidth = i - width2;
        }
        contianer.setX(screenWidth);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F0(PaceNotiSeekBar seekBar, TextView paceValue) {
        int i;
        float progress = seekBar.getProgress() / seekBar.getMax();
        int width = seekBar.getWidth();
        int i2 = (int) (width * 1.0f * progress);
        int screenWidth = ViewUtils.isRTL() ? ViewUtils.getScreenWidth(getActivity()) - paceValue.getRight() : paceValue.getLeft();
        int width2 = paceValue.getWidth() / 2;
        if (i2 >= width2) {
            if (i2 > width - width2) {
                i = screenWidth + width;
                width2 *= 2;
            } else {
                i = screenWidth + i2;
            }
            screenWidth = i - width2;
        }
        paceValue.setX(screenWidth);
    }

    private void M(String anaId, boolean opened) {
        String str;
        CountEventBuilder countEventBuilder = new CountEventBuilder(anaId);
        HashMap map = new HashMap();
        int i = this.H;
        if (i == 1) {
            str = SportAnalytics.ParamValue.SportType.OUTDOOR_RUNNING;
        } else if (i == 8) {
            str = SportAnalytics.ParamValue.SportType.TREADMILL;
        } else if (i == 6) {
            str = "Walking";
        } else {
            str = i == 9 ? SportAnalytics.ParamValue.SportType.OUTDOOR_CYCLING : "";
        }
        map.put(SportAnalytics.ParamKey.SPORTS_PAGE, str);
        map.put("Status", opened ? SportAnalytics.ParamValue.OPEN : "Close");
        countEventBuilder.putExtras(map);
        Analytics.recordEvent(countEventBuilder);
    }

    private float N(float beat) {
        return (beat - 120.0f) / 100.0f;
    }

    private int O(int pace, boolean isAutoPause) {
        float f2;
        float f3;
        if (isAutoPause) {
            int iW = W(pace, this.J);
            SportPaceSpeedValue sportPaceSpeedValue = this.J;
            f2 = iW - (sportPaceSpeedValue.minValue * 60);
            f3 = sportPaceSpeedValue.unit;
        } else {
            int iW2 = W(pace, this.K);
            SportPaceSpeedValue sportPaceSpeedValue2 = this.K;
            f2 = iW2 - (sportPaceSpeedValue2.minValue * 60);
            f3 = sportPaceSpeedValue2.unit;
        }
        return (int) (f2 / f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int P(float progress, boolean isAutoPause) {
        int i;
        int i2;
        if (isAutoPause) {
            SportPaceSpeedValue sportPaceSpeedValue = this.J;
            i = ((int) progress) * ((int) sportPaceSpeedValue.unit);
            i2 = sportPaceSpeedValue.minValue;
        } else {
            SportPaceSpeedValue sportPaceSpeedValue2 = this.K;
            i = ((int) progress) * ((int) sportPaceSpeedValue2.unit);
            i2 = sportPaceSpeedValue2.minValue;
        }
        return i + (i2 * 60);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float Q(float progress, boolean isAutoPause) {
        float f2;
        int i;
        if (isAutoPause) {
            SportPaceSpeedValue sportPaceSpeedValue = this.J;
            f2 = ((int) progress) * sportPaceSpeedValue.unit;
            i = sportPaceSpeedValue.minValue;
        } else {
            SportPaceSpeedValue sportPaceSpeedValue2 = this.K;
            f2 = ((int) progress) * sportPaceSpeedValue2.unit;
            i = sportPaceSpeedValue2.minValue;
        }
        return f2 + i;
    }

    private int R(int pace, boolean isAutoPause) {
        float f2;
        float f3;
        double d2;
        float f4;
        float f5;
        float fX = X(pace * 1.0f);
        if (ViewUtils.isRTL()) {
            if (isAutoPause) {
                SportPaceSpeedValue sportPaceSpeedValue = this.J;
                f4 = fX - sportPaceSpeedValue.minValue;
                f5 = sportPaceSpeedValue.unit;
            } else {
                SportPaceSpeedValue sportPaceSpeedValue2 = this.K;
                f4 = fX - sportPaceSpeedValue2.minValue;
                f5 = sportPaceSpeedValue2.unit;
            }
            d2 = 100.0f - (f4 / f5);
        } else {
            if (isAutoPause) {
                SportPaceSpeedValue sportPaceSpeedValue3 = this.J;
                f2 = fX - sportPaceSpeedValue3.minValue;
                f3 = sportPaceSpeedValue3.unit;
            } else {
                SportPaceSpeedValue sportPaceSpeedValue4 = this.K;
                f2 = fX - sportPaceSpeedValue4.minValue;
                f3 = sportPaceSpeedValue4.unit;
            }
            d2 = f2 / f3;
        }
        return (int) Math.round(d2);
    }

    private void S() {
        startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 1024);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int T(HeartRateSeekBar seekBar, float progress) {
        return (int) (((progress / seekBar.getMax()) * 100.0f) + 120.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int U(HeartRateSeekBar seekBar, float progress) {
        float max = progress / seekBar.getMax();
        float fV = V();
        float f2 = 0.5f * fV;
        return (int) (f2 + ((fV - f2) * max));
    }

    private int V() {
        return 220 - HMPersonInfo.getInstance().getUserInfo().getAge();
    }

    private int W(int pace, SportPaceSpeedValue barValue) {
        double d2;
        if (this.L) {
            d2 = pace;
            if (pace < barValue.minValue * 60) {
                HMLog.d(TAG, "pace too small", new Object[0]);
                d2 = barValue.minValue * 60;
            }
        } else {
            double d3 = ((double) pace) * 1.609344d;
            float f2 = barValue.unit;
            d2 = ((int) ((d3 / ((double) f2)) + 0.5d)) * f2;
        }
        return (int) d2;
    }

    private float X(float pace) {
        float f2;
        float f3 = (float) (((double) (pace > 0.0f ? 3600.0f / pace : 0.0f)) * (this.L ? 1.0d : 0.6213712d));
        float fRound = Math.round(f3 * 100.0f) / 100.0f;
        float f4 = (int) fRound;
        float f5 = fRound - f4;
        if (f5 < 0.25f) {
            return f4;
        }
        if (0.25f <= f5 && f5 < 0.75f) {
            f2 = 0.5f;
        } else {
            if (0.75f > f5) {
                return f3;
            }
            f2 = 1.0f;
        }
        return f4 + f2;
    }

    private float Y(int hr) {
        float fV = V();
        float f2 = 0.5f * fV;
        return (hr - f2) / (fV - f2);
    }

    private void Z() {
        this.r.setVisibility(0);
        this.t.setVisibility(0);
        this.r.setOnClickListener(this);
        this.r.setChecked(this.a.getAutoPauseEnable().booleanValue());
        this.r.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: rw1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.g0(compoundButton, z);
            }
        });
        x0(this.s, this.u, this.a.getAutoPauseEnable().booleanValue());
        this.v.setText(this.L ? R.string.running_detail_pace1 : R.string.running_detail_pace_br1);
        this.s.setOnSeekBarChangeListener(new e());
        if (this.H == 9) {
            this.s.setMax(this.J.maxProgress);
            this.s.setProgress(R(this.a.getAutoPausePace().intValue(), true));
        } else {
            this.s.setMax(this.J.maxProgress);
            this.s.setProgress(O(this.a.getAutoPausePace().intValue(), true));
        }
        v0(this.s, this.u);
    }

    private void a0() {
        if (DataTypeSource.isIndoorRun(this.H)) {
            this.r.setVisibility(8);
        }
        this.t.setVisibility(8);
        this.r.setOnClickListener(this);
        this.r.setChecked(this.a.getAutoPauseEnable().booleanValue());
        this.r.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: sw1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.h0(compoundButton, z);
            }
        });
    }

    private void b0() {
        int i = this.H;
        if (i == 9 || i == 6) {
            this.w.setVisibility(8);
            this.b.findViewById(R.id.space_below_beat).setVisibility(8);
            return;
        }
        this.w.setVisibility(0);
        this.z.setVisibility(0);
        this.w.setOnClickListener(this);
        this.w.setChecked(this.a.getBeatEnable().booleanValue());
        this.w.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ow1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.i0(compoundButton, z);
            }
        });
        this.x.setOnSeekBarChangeListener(new c());
        this.x.setMax(100.0f);
        HeartRateSeekBar heartRateSeekBar = this.x;
        heartRateSeekBar.setProgress(heartRateSeekBar.getMax() * N(this.a.getBeatValue().intValue()));
        u0(this.x, this.y);
        w0(true, this.w.isChecked());
    }

    private void c0() {
        this.a = SportConfigDbClient.getConfig(this.H);
    }

    private void d0(final boolean hasBandHrDevice) {
        this.l.setText(getString(R.string.hr_range_format, ""));
        this.f.setVisibility(0);
        this.i.setVisibility(0);
        this.f.setEnabled(hasBandHrDevice);
        this.f.setOnClickListener(this);
        this.f.setChecked(this.a.getRemindHREnable().booleanValue());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getContext().getString(R.string.max_hr_warning));
        spannableStringBuilder.append((CharSequence) "zw");
        Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.max_hr_help, null);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        spannableStringBuilder.setSpan(new ImageSpan(drawable, 1), spannableStringBuilder.length() - 2, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new a(), spannableStringBuilder.length() - 2, spannableStringBuilder.length(), 33);
        this.f.setTitle(spannableStringBuilder);
        ((TextView) this.f.findViewById(R.id.rainbow_tile_title)).setMovementMethod(LinkMovementMethod.getInstance());
        this.f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: uw1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.j0(hasBandHrDevice, compoundButton, z);
            }
        });
        this.g.setOnSeekBarChangeListener(new b());
        this.g.setMax(100.0f);
        HeartRateSeekBar heartRateSeekBar = this.g;
        heartRateSeekBar.setProgress(heartRateSeekBar.getMax() * Y(this.a.getRemindHeartRate().intValue()));
        u0(this.g, this.h);
        w0(false, hasBandHrDevice & this.f.isChecked());
    }

    private void e0() {
        LinearLayout linearLayout = (LinearLayout) this.b.findViewById(R.id.sport_internal_set_layout);
        this.C = linearLayout;
        if (FunctionSwitcher.isSupportSuperUser) {
            linearLayout.setVisibility(0);
            this.D = (ListTile) this.b.findViewById(R.id.draw_gps_line_switcher);
            this.E = (ListTile) this.b.findViewById(R.id.create_test_point_switcher);
            this.F = (ListTile) this.b.findViewById(R.id.security_center);
            this.G = (ListTile) this.b.findViewById(R.id.super_hide_mode);
            this.D.setOnClickListener(this);
            this.E.setOnClickListener(this);
            this.F.setOnClickListener(this);
            this.G.setOnClickListener(this);
            this.D.setVisibility(0);
            this.D.setChecked(DataTypeSource.isDrawRealGPSLine());
            this.D.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: jw1
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    DataTypeSource.setIsDrawRealGPSLine(z);
                }
            });
            this.E.setVisibility(0);
            this.E.setChecked(DataTypeSource.isCreateTestPoint());
            this.E.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: kw1
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    DataTypeSource.setCreateTestPoint(z);
                }
            });
            this.F.setVisibility(AliveUtils.getInstance().supportAutoStart(getContext()) ? 0 : 8);
            this.G.setVisibility(AliveUtils.getInstance().supportPowerManager(getContext()) ? 0 : 8);
            if (this.m.getVisibility() == 8) {
                this.b.findViewById(R.id.space_below_pace_noti_bar).setVisibility(8);
            }
        }
    }

    private void f0() {
        if (this.H == 6) {
            this.b.findViewById(R.id.space_below_seek_bar).setVisibility(8);
            return;
        }
        this.m.setVisibility(0);
        this.o.setVisibility(0);
        this.m.setOnClickListener(this);
        this.m.setChecked(this.a.getRemindPaceEnable().booleanValue());
        this.m.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: tw1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.m0(compoundButton, z);
            }
        });
        x0(this.n, this.p, this.a.getRemindPaceEnable().booleanValue());
        if (this.H == 9) {
            this.q.setText(this.L ? R.string.running_detail_speed : R.string.running_detail_speed_br);
        } else {
            this.q.setText(this.L ? R.string.running_detail_pace1 : R.string.running_detail_pace_br1);
        }
        this.n.setOnSeekBarChangeListener(new d());
        if (this.H == 9) {
            SportPaceSpeedValue sportPaceSpeedValue = this.K;
            if (sportPaceSpeedValue != null) {
                this.n.setMax(sportPaceSpeedValue.maxProgress);
            }
            this.n.setProgress(R(this.a.getRemindPace().intValue(), false));
        } else {
            SportPaceSpeedValue sportPaceSpeedValue2 = this.K;
            if (sportPaceSpeedValue2 != null) {
                this.n.setMax(sportPaceSpeedValue2.maxProgress);
            }
            this.n.setProgress(O(this.a.getRemindPace().intValue(), false));
        }
        v0(this.n, this.p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g0(CompoundButton compoundButton, boolean z) {
        this.a.setAutoPauseEnable(Boolean.valueOf(z));
        x0(this.s, this.u, z);
        C0();
        if (GPSDataController.getInstance().isRealStarting()) {
            GPSDataController.getInstance().setAutoPauseEnabled(z);
        }
        M(SportAnalytics.RUN_SET_AUTO_PAUSE, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h0(CompoundButton compoundButton, boolean z) {
        this.a.setAutoPauseEnable(Boolean.valueOf(z));
        C0();
        if (GPSDataController.getInstance().isRealStarting()) {
            GPSDataController.getInstance().setAutoPauseEnabled(z);
            if (z) {
                new BigDecimal(String.valueOf(1000.0f / this.a.getAutoPausePace().intValue())).setScale(2, 1);
            }
        }
        M(SportAnalytics.RUN_SET_AUTO_PAUSE, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i0(CompoundButton compoundButton, boolean z) {
        this.a.setBeatEnable(Boolean.valueOf(z));
        C0();
        w0(true, z);
        M(SportAnalytics.RUN_SET_STEP_FREQ, z);
        if (this.I > 0) {
            if (z) {
                BeatUtil.beatOn((int) ((60.0f / this.a.getBeatValue().intValue()) * 1000.0f));
            } else {
                BeatUtil.stop();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0101  */
    /* JADX WARN: Code duplicated, block: B:25:0x010d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0111  */
    /* JADX WARN: Code duplicated, block: B:29:0x011f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0132  */
    private void initView() {
        int i;
        c0();
        ContextCompat.getColor(getContext(), R.color.cl_switch_checked);
        ContextCompat.getColor(getContext(), R.color.cl_switch_unchecked);
        this.b.findViewById(R.id.common_title_left_button).setOnClickListener(this);
        int i2 = this.H;
        boolean z = true;
        if (i2 == 1) {
            TextView textView = (TextView) this.b.findViewById(R.id.common_title_text);
            if (this.H == 1) {
                i = R.string.sport_config_title_outdoor_run;
            } else {
                i = R.string.sport_config_title_treadmill_run;
            }
            textView.setText(getString(i));
            if (this.L) {
                this.J = new SportPaceSpeedValue(this.H, 5.0f, 5, 12);
                this.K = new SportPaceSpeedValue(this.H, 5.0f, 3, 10);
            } else {
                this.J = new SportPaceSpeedValue(this.H, 5.0f, 5, 20);
                this.K = new SportPaceSpeedValue(this.H, 5.0f, 5, 16);
            }
        } else if (i2 == 6) {
            ((TextView) this.b.findViewById(R.id.common_title_text)).setText(getString(R.string.sport_config_title_walk));
            if (this.L) {
                this.J = new SportPaceSpeedValue(this.H, 5.0f, 8, 15);
            } else {
                this.J = new SportPaceSpeedValue(this.H, 5.0f, 13, 24);
            }
            this.K = new SportPaceSpeedValue(this.H, 5.0f, 1, 1);
        } else if (i2 == 25) {
            ((TextView) this.b.findViewById(R.id.common_title_text)).setText(getString(R.string.sport_config_title_treadmill));
            if (this.L) {
                this.J = new SportPaceSpeedValue(this.H, 5.0f, 5, 12);
                this.K = new SportPaceSpeedValue(this.H, 5.0f, 3, 10);
            } else {
                this.J = new SportPaceSpeedValue(this.H, 5.0f, 5, 20);
                this.K = new SportPaceSpeedValue(this.H, 5.0f, 5, 16);
            }
        } else if (i2 == 8) {
            TextView textView2 = (TextView) this.b.findViewById(R.id.common_title_text);
            if (this.H == 1) {
                i = R.string.sport_config_title_outdoor_run;
            } else {
                i = R.string.sport_config_title_treadmill_run;
            }
            textView2.setText(getString(i));
            if (this.L) {
                this.J = new SportPaceSpeedValue(this.H, 5.0f, 5, 12);
                this.K = new SportPaceSpeedValue(this.H, 5.0f, 3, 10);
            } else {
                this.J = new SportPaceSpeedValue(this.H, 5.0f, 5, 20);
                this.K = new SportPaceSpeedValue(this.H, 5.0f, 5, 16);
            }
        } else if (i2 == 9) {
            ((TextView) this.b.findViewById(R.id.common_title_text)).setText(getString(R.string.sport_config_title_outdoor_cycling));
            if (this.L) {
                this.J = new SportPaceSpeedValue(this.H, 0.5f, 5, 20);
                this.K = new SportPaceSpeedValue(this.H, 0.5f, 10, 40);
            } else {
                this.J = new SportPaceSpeedValue(this.H, 0.5f, 3, 12);
                this.K = new SportPaceSpeedValue(this.H, 0.5f, 6, 25);
            }
        }
        RelativeLayout relativeLayout = (RelativeLayout) this.b.findViewById(R.id.setting_title_layout);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
        layoutParams.topMargin = ViewUtils.getStatusBarHeight(getContext());
        relativeLayout.setLayoutParams(layoutParams);
        this.c = (ListTile) this.b.findViewById(R.id.audio_play_switcher);
        this.d = (ListTile) this.b.findViewById(R.id.screen_on_switcher);
        if (this.H == 25) {
            ListTile listTile = (ListTile) this.b.findViewById(R.id.treadmill_sound_state);
            this.e = listTile;
            listTile.setVisibility(0);
            this.e.setTips(R.string.connect_status_disconnect);
            this.e.setEnabled(false);
        }
        this.r = (ListTile) this.b.findViewById(R.id.auto_pause_switcher);
        this.s = (PaceNotiSeekBar) this.b.findViewById(R.id.auto_pause_seek_bar_pace);
        this.t = this.b.findViewById(R.id.auto_pause_pace_seek_bar_container);
        this.u = (TextView) this.b.findViewById(R.id.auto_pause_pace_value);
        this.v = (TextView) this.b.findViewById(R.id.auto_pause_pace_unit);
        this.f = (ListTile) this.b.findViewById(R.id.max_hr_notify_switcher);
        this.g = (HeartRateSeekBar) this.b.findViewById(R.id.seek_bar_max_hr);
        this.h = this.b.findViewById(R.id.hr_value_container);
        this.i = this.b.findViewById(R.id.hr_seek_bar_container);
        this.j = (TextView) this.b.findViewById(R.id.hr_value);
        this.l = (TextView) this.b.findViewById(R.id.hr_section_title);
        this.k = (TextView) this.b.findViewById(R.id.hr_section);
        this.w = (ListTile) this.b.findViewById(R.id.beat_switcher);
        this.x = (HeartRateSeekBar) this.b.findViewById(R.id.beat_bar);
        this.y = this.b.findViewById(R.id.beat_value_container);
        this.z = this.b.findViewById(R.id.beat_bar_container);
        this.A = (TextView) this.b.findViewById(R.id.beat_value);
        this.B = (TextView) this.b.findViewById(R.id.beat_section);
        this.m = (ListTile) this.b.findViewById(R.id.pace_notify_switcher);
        this.n = (PaceNotiSeekBar) this.b.findViewById(R.id.seek_bar_pace);
        this.o = this.b.findViewById(R.id.pace_seek_bar_container);
        this.p = (TextView) this.b.findViewById(R.id.pace_value);
        this.q = (TextView) this.b.findViewById(R.id.pace_unit);
        if (this.H == 9) {
            this.m.setTitle(getString(R.string.sport_set_speed_notify));
            this.m.setSubtitle(getString(R.string.sport_config_speed_notify_tip));
            this.r.setSubtitle(getString(R.string.sport_config_speed_autopause_tip));
        }
        if (DataTypeSource.isIndoorRun(this.H)) {
            this.r.setVisibility(8);
            this.t.setVisibility(8);
        }
        this.c.setChecked(this.a.getVoicePlayEnable().booleanValue());
        this.c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: qw1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                this.a.n0(compoundButton, z2);
            }
        });
        this.d.setChecked(this.a.getKeepScreenOn().booleanValue());
        this.d.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: pw1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                this.a.o0(compoundButton, z2);
            }
        });
        this.c.setOnClickListener(this);
        this.d.setOnClickListener(this);
        int[] configChooseDevices = SportConfigDbClient.getConfigChooseDevices(this.H);
        int length = configChooseDevices.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                z = false;
                break;
            }
            int i4 = configChooseDevices[i3];
            if (HMDeviceSource.fromValue(i4).getType() == HMDeviceType.MILI || HMDeviceSource.fromValue(i4).getType() == HMDeviceType.HEADSET) {
                break;
            } else {
                i3++;
            }
        }
        a0();
        d0(z);
        f0();
        b0();
        e0();
        if (this.C.getVisibility() == 8 && this.m.getVisibility() == 8 && this.f.getVisibility() == 8) {
            this.b.findViewById(R.id.space_below_choose_map).setVisibility(8);
        }
        if (this.H == 25) {
            this.r.setVisibility(8);
            this.t.setVisibility(8);
            this.b.findViewById(R.id.space_below_auto_pause_seek_bar).setVisibility(8);
            this.m.setVisibility(8);
            this.o.setVisibility(8);
            this.b.findViewById(R.id.space_below_seek_bar).setVisibility(8);
            this.w.setVisibility(8);
            this.z.setVisibility(8);
            this.b.findViewById(R.id.space_below_beat).setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j0(boolean z, CompoundButton compoundButton, boolean z2) {
        this.a.setRemindHREnable(Boolean.valueOf(z2));
        C0();
        w0(false, z & z2);
        M(SportAnalytics.RUN_SET_HEART_RATE_REMINDER, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m0(CompoundButton compoundButton, boolean z) {
        this.a.setRemindPaceEnable(Boolean.valueOf(z));
        x0(this.n, this.p, z);
        C0();
        if (this.H == 9) {
            M(SportAnalytics.RUN_SET_SPEED_REMINDER, z);
        } else {
            M(SportAnalytics.RUN_SET_PACE_REMINDER, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n0(CompoundButton compoundButton, boolean z) {
        this.a.setVoicePlayEnable(Boolean.valueOf(z));
        C0();
        M(SportAnalytics.RUN_SET_VOICE, z);
    }

    public static ExerciseSettingFragment newInstance(int sportType, long trackId) {
        ExerciseSettingFragment exerciseSettingFragment = new ExerciseSettingFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("sportType", sportType);
        bundle.putLong("trackId", trackId);
        exerciseSettingFragment.setArguments(bundle);
        return exerciseSettingFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o0(CompoundButton compoundButton, boolean z) {
        this.a.setKeepScreenOn(Boolean.valueOf(z));
        C0();
        M(SportAnalytics.RUN_SET_KEEP_LIGHT, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p0(View view) {
        A0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q0(View view) throws IllegalAccessException, InvocationTargetException {
        if (!HMDeviceManager.getInstance().isBluetoothEnable()) {
            S();
        } else {
            this.N = true;
            this.M.connect();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit r0(Integer num) {
        HMLog.i(TAG, "connect state: " + num, new Object[0]);
        this.e.setEnabled(true);
        this.O = num.intValue() == 2;
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            this.e.setTips(R.string.device_tip_connecting);
            this.e.setOnClickListener(null);
        } else if (iIntValue != 2) {
            if (this.N) {
                IconToast.showError(getContext(), getString(R.string.connect_failed));
                this.N = false;
            }
            this.e.setTips(R.string.connect_status_disconnect);
            this.e.setOnClickListener(new View.OnClickListener() { // from class: nw1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws IllegalAccessException, InvocationTargetException {
                    this.a.q0(view);
                }
            });
        } else {
            this.N = false;
            this.e.setTips(R.string.connect_status_connect);
            this.e.setOnClickListener(new View.OnClickListener() { // from class: mw1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.p0(view);
                }
            });
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s0(DialogInterface dialogInterface, int i) throws IllegalAccessException, InvocationTargetException {
        this.M.disconnect();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0() {
        startActivity(new Intent(getContext(), (Class<?>) MaxHrRemindHelpActivity.class));
    }

    private void u0(HeartRateSeekBar seekBar, View contianer) {
        seekBar.post(new f(seekBar, contianer));
    }

    private void v0(PaceNotiSeekBar seekBar, TextView paceValue) {
        seekBar.post(new g(seekBar, paceValue));
    }

    private void w0(boolean isBeat, boolean isChecked) {
        if (isBeat) {
            this.x.setEnabled(isChecked);
            this.x.setAlpha(isChecked ? 1.0f : 0.3f);
            this.A.setAlpha(isChecked ? 1.0f : 0.3f);
            this.B.setVisibility(isChecked ? 0 : 8);
        } else {
            this.g.setEnabled(isChecked);
            this.g.setAlpha(isChecked ? 1.0f : 0.3f);
            this.j.setAlpha(isChecked ? 1.0f : 0.3f);
            this.k.setVisibility(isChecked ? 0 : 8);
            this.l.setVisibility(isChecked ? 0 : 8);
        }
        if (isChecked) {
            if (isBeat) {
                u0(this.x, this.y);
            } else {
                u0(this.g, this.h);
            }
        }
    }

    private void x0(PaceNotiSeekBar seekBar, TextView paceValue, boolean isChecked) {
        seekBar.setEnabled(isChecked);
        seekBar.setAlpha(isChecked ? 1.0f : 0.3f);
        paceValue.setAlpha(isChecked ? 1.0f : 0.3f);
        if (isChecked) {
            v0(seekBar, paceValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y0(float pace) {
        if (!UnitManager.getInstance().isMetric()) {
            pace = (float) (((double) pace) / 1.609344d);
        }
        this.a.setAutoPausePace(Integer.valueOf((int) pace));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z0(float pace) {
        if (!UnitManager.getInstance().isMetric()) {
            pace = (float) (((double) pace) / 1.609344d);
        }
        this.a.setRemindPace(Integer.valueOf(Math.round(pace)));
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) throws IllegalAccessException, InvocationTargetException {
        if (requestCode != 1024 || this.O) {
            return;
        }
        this.N = true;
        this.M.connect();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.security_center) {
            AliveUtils.getInstance().goAutoStart(getContext());
        } else if (id == R.id.super_hide_mode) {
            AliveUtils.getInstance().goPowerManager(getContext());
        } else if (id == R.id.common_title_left_button) {
            dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, SystemBarTintSupport.isSupport(getActivity()) ? R.style.DimPanelTintNoAnimDialog : R.style.DimPanelDialog);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.b = inflater.inflate(R.layout.fragment_exercise_setting, container, false);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.H = arguments.getInt("sportType");
            this.I = arguments.getLong("trackId");
        }
        this.L = UnitManager.getInstance().isMetric();
        initView();
        if (this.H == 25) {
            this.M = BoltSpeakersHelper.INSTANCE.newInstance(requireContext(), HMDeviceManager.getInstance().getBoundDeviceAddress(HMDeviceType.TREADMILL), new Function1() { // from class: lw1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return this.a.r0((Integer) obj);
                }
            });
        }
        return this.b;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        ConfigAPI.syncRunConfigs();
        super.onDestroy();
        EventBus.getDefault().post(new EventSportSetting(true));
        if (this.H == 25) {
            this.M.unregister();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }
}
