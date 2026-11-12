package com.huawei.ui.homehealth.runcard;

import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.numberpicker.HealthMultiNumberPicker;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.homehealth.R;
import defpackage.lmf;
import defpackage.njy;
import defpackage.qrs;
import defpackage.tfi;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class SportAssistBaseVoiceSettingsActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomTitleBar f25773a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f25775c;
    private CustomViewDialog e;
    private HealthSwitchButton k;
    private RelativeLayout l;
    private int[] m;
    private HealthSwitchButton p;
    private HealthSwitchButton r;
    private HealthSwitchButton s;
    private boolean h = true;
    private boolean i = true;
    private boolean j = true;
    private boolean g = true;
    private RelativeLayout n = null;
    private HealthTextView o = null;
    private ImageView f = null;
    private List<String> d = new ArrayList(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, ArrayList<String>> f25774b = new HashMap(10);

    /* JADX INFO: Access modifiers changed from: private */
    public int c(int i) {
        return i == 0 ? 2 : 1;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("Track_SportAssistBaseVoiceSettingsActivity", "onCreate");
        setContentView(R.layout.track_sport_base_voice_settings_frag);
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.titlebar_track_sport_base_voice_setting);
        this.f25773a = customTitleBar;
        customTitleBar.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.SportAssistBaseVoiceSettingsActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SportAssistBaseVoiceSettingsActivity.this.finish();
            }
        });
        e();
        c();
    }

    private void e() {
        i();
        a();
    }

    private void c() {
        f();
        d();
    }

    private void i() {
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.layout_track_voice_interval_setting);
        this.n = relativeLayout;
        BaseActivity.cancelLayoutById(relativeLayout);
        this.n.setOnClickListener(this);
        this.o = (HealthTextView) findViewById(R.id.txt_track_voice_interval_value);
        this.f = (ImageView) findViewById(R.id.img_track_voice_interval_value);
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            this.f.setImageResource(R.drawable.common_ui_arrow_left);
        } else {
            this.f.setImageResource(R.drawable.common_ui_arrow_right);
        }
    }

    private void f() {
        this.f25775c = new int[]{500, 1000, 2000, 3000};
        this.m = new int[]{5, 10, 15, 20};
        b();
        int iC = tfi.c(BaseApplication.getContext());
        if (iC == 0) {
            tfi.f(BaseApplication.getContext(), 2);
            tfi.c(BaseApplication.getContext(), 1000);
            d(2, 1);
            return;
        }
        d(tfi.c(BaseApplication.getContext()), b(iC));
    }

    private void a() {
        HealthSwitchButton healthSwitchButton = (HealthSwitchButton) findViewById(R.id.switch_track_voice_setting_distance);
        this.k = healthSwitchButton;
        healthSwitchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.homehealth.runcard.SportAssistBaseVoiceSettingsActivity.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SportAssistBaseVoiceSettingsActivity.this.h = z;
                SportAssistBaseVoiceSettingsActivity.this.k.setChecked(SportAssistBaseVoiceSettingsActivity.this.h);
                SportAssistBaseVoiceSettingsActivity sportAssistBaseVoiceSettingsActivity = SportAssistBaseVoiceSettingsActivity.this;
                sportAssistBaseVoiceSettingsActivity.c("voice_distance", sportAssistBaseVoiceSettingsActivity.h);
                LogUtil.a("Track_SportAssistBaseVoiceSettingsActivity", "mIsVoiceDistanceEnable is ", Boolean.valueOf(SportAssistBaseVoiceSettingsActivity.this.h));
            }
        });
        HealthSwitchButton healthSwitchButton2 = (HealthSwitchButton) findViewById(R.id.switch_track_voice_setting_duration);
        this.r = healthSwitchButton2;
        healthSwitchButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.homehealth.runcard.SportAssistBaseVoiceSettingsActivity.3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SportAssistBaseVoiceSettingsActivity.this.i = z;
                SportAssistBaseVoiceSettingsActivity.this.r.setChecked(SportAssistBaseVoiceSettingsActivity.this.i);
                SportAssistBaseVoiceSettingsActivity sportAssistBaseVoiceSettingsActivity = SportAssistBaseVoiceSettingsActivity.this;
                sportAssistBaseVoiceSettingsActivity.c("voice_speed_time", sportAssistBaseVoiceSettingsActivity.i);
                LogUtil.a("Track_SportAssistBaseVoiceSettingsActivity", "mIsVoiceDurationEnable is ", Boolean.valueOf(SportAssistBaseVoiceSettingsActivity.this.i));
            }
        });
        this.s = (HealthSwitchButton) findViewById(R.id.switch_track_voice_setting_pace);
        this.l = (RelativeLayout) findViewById(R.id.switch_track_voice_setting_pace_layout);
        this.s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.homehealth.runcard.SportAssistBaseVoiceSettingsActivity.2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SportAssistBaseVoiceSettingsActivity.this.j = z;
                SportAssistBaseVoiceSettingsActivity.this.s.setChecked(SportAssistBaseVoiceSettingsActivity.this.j);
                SportAssistBaseVoiceSettingsActivity sportAssistBaseVoiceSettingsActivity = SportAssistBaseVoiceSettingsActivity.this;
                sportAssistBaseVoiceSettingsActivity.c("voice_pace", sportAssistBaseVoiceSettingsActivity.j);
                LogUtil.a("Track_SportAssistBaseVoiceSettingsActivity", "mIsVoicePaceEnable is ", Boolean.valueOf(SportAssistBaseVoiceSettingsActivity.this.j));
            }
        });
        HealthSwitchButton healthSwitchButton3 = (HealthSwitchButton) findViewById(R.id.switch_track_voice_setting_heart_rate);
        this.p = healthSwitchButton3;
        healthSwitchButton3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.homehealth.runcard.SportAssistBaseVoiceSettingsActivity.4
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SportAssistBaseVoiceSettingsActivity.this.g = z;
                SportAssistBaseVoiceSettingsActivity.this.p.setChecked(SportAssistBaseVoiceSettingsActivity.this.g);
                SportAssistBaseVoiceSettingsActivity sportAssistBaseVoiceSettingsActivity = SportAssistBaseVoiceSettingsActivity.this;
                sportAssistBaseVoiceSettingsActivity.c("voice_heart_rate", sportAssistBaseVoiceSettingsActivity.g);
                LogUtil.a("Track_SportAssistBaseVoiceSettingsActivity", "mIsVoiceHeartRateEnable is ", Boolean.valueOf(SportAssistBaseVoiceSettingsActivity.this.g));
            }
        });
    }

    private void d() {
        this.h = d("voice_distance");
        this.i = d("voice_speed_time");
        this.j = d("voice_pace");
        this.g = d("voice_heart_rate");
        this.k.setChecked(this.h);
        this.r.setChecked(this.i);
        this.s.setChecked(this.j);
        this.p.setChecked(this.g);
        LogUtil.a("Track_SportAssistBaseVoiceSettingsActivity", "initVoiceContentData , mIsVoiceDistanceEnable is ", Boolean.valueOf(this.h), " , mIsVoiceDurationEnable is ", Boolean.valueOf(this.i), " , mIsVoicePaceEnable is ", Boolean.valueOf(this.j), " , mIsVoiceHeartRateEnable is ", Boolean.valueOf(this.g));
    }

    private void h() {
        int iC = tfi.c(BaseApplication.getContext());
        int i = 0;
        int i2 = 1;
        if (iC == 1) {
            int iD = tfi.d(BaseApplication.getContext());
            while (true) {
                int[] iArr = this.m;
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
                int[] iArr2 = this.f25775c;
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
        c(i, i2);
    }

    private void c(int i, int i2) {
        final HealthMultiNumberPicker healthMultiNumberPicker = new HealthMultiNumberPicker(BaseApplication.getContext());
        healthMultiNumberPicker.setPickerCount(2, new boolean[]{false, false});
        List<String> list = this.d;
        healthMultiNumberPicker.setDisplayedValues(0, (String[]) list.toArray(new String[list.size()]), 0);
        if (njy.e(this.d, i)) {
            LogUtil.j("Track_SportAssistBaseVoiceSettingsActivity", "buildTrackVoiceIntervalSettingDialog firstLocation is out of mDataKey");
            return;
        }
        ArrayList<String> arrayList = this.f25774b.get(this.d.get(i));
        healthMultiNumberPicker.setDisplayedValues(1, (String[]) arrayList.toArray(new String[arrayList.size()]), 1);
        healthMultiNumberPicker.c(new int[]{i, i2}, arrayList.size());
        healthMultiNumberPicker.setOnValueChangeListener(new HealthMultiNumberPicker.OnValueChangeListener() { // from class: com.huawei.ui.homehealth.runcard.SportAssistBaseVoiceSettingsActivity.7
            @Override // com.huawei.ui.commonui.numberpicker.HealthMultiNumberPicker.OnValueChangeListener
            public void onValueChange(int i3, HealthMultiNumberPicker healthMultiNumberPicker2, int i4, int i5) {
                if (i3 == 0) {
                    if (i5 < SportAssistBaseVoiceSettingsActivity.this.d.size() && SportAssistBaseVoiceSettingsActivity.this.f25774b.containsKey(SportAssistBaseVoiceSettingsActivity.this.d.get(i5))) {
                        ArrayList arrayList2 = (ArrayList) SportAssistBaseVoiceSettingsActivity.this.f25774b.get(SportAssistBaseVoiceSettingsActivity.this.d.get(i5));
                        healthMultiNumberPicker2.setDisplayedValues(1, (String[]) arrayList2.toArray(new String[arrayList2.size()]), 1);
                    } else {
                        LogUtil.j("Track_SportAssistBaseVoiceSettingsActivity", "the voice type is not valid");
                    }
                }
            }
        });
        final CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this);
        builder.b(R.string.IDS_hwh_motiontrack_voice_interval).d((View) healthMultiNumberPicker).d(com.huawei.plugindevice.R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.SportAssistBaseVoiceSettingsActivity.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int[] selectedLocations = healthMultiNumberPicker.getSelectedLocations();
                SportAssistBaseVoiceSettingsActivity.this.d(SportAssistBaseVoiceSettingsActivity.this.c(selectedLocations[0]), selectedLocations[1]);
            }
        }).c(com.huawei.plugindevice.R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.runcard.SportAssistBaseVoiceSettingsActivity.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                builder.c(true);
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        this.e = customViewDialogD;
        customViewDialogD.show();
    }

    private void b() {
        this.d.add(getResources().getString(R.string.IDS_hwh_motiontrack_voice_interval_distance));
        this.d.add(getResources().getString(R.string.IDS_hwh_motiontrack_voice_interval_time));
        ArrayList<String> arrayList = new ArrayList<>(10);
        ArrayList<String> arrayList2 = new ArrayList<>(10);
        try {
            int[] iArr = this.m;
            if (iArr != null && iArr.length > 0) {
                for (int i : iArr) {
                    arrayList.add(getResources().getString(R.string.IDS_hw_show_set_target_sport_time_unit, UnitUtil.e(i, 1, 0)));
                }
            }
            int[] iArr2 = this.f25775c;
            if (iArr2 != null && iArr2.length > 0) {
                for (int i2 = 0; i2 < this.f25775c.length; i2++) {
                    if (i2 == 0) {
                        arrayList2.add(getResources().getString(R.string.IDS_hw_show_sport_kms_string, UnitUtil.e(((double) this.f25775c[i2]) / 1000.0d, 1, 1)));
                    } else {
                        arrayList2.add(getResources().getString(R.string.IDS_hw_show_sport_kms_string, UnitUtil.e(((double) this.f25775c[i2]) / 1000.0d, 1, 0)));
                    }
                }
            }
        } catch (IndexOutOfBoundsException e) {
            LogUtil.j("Track_SportAssistBaseVoiceSettingsActivity", "IndexOutOfBoundsException ", e.getMessage());
        }
        this.f25774b.put(this.d.get(0), arrayList2);
        this.f25774b.put(this.d.get(1), arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, int i2) {
        tfi.f(BaseApplication.getContext(), i);
        try {
            if (i == 1) {
                int[] iArr = this.m;
                if (iArr != null) {
                    if (iArr.length > i2) {
                        this.o.setText(this.f25774b.get(this.d.get(1)).get(i2));
                    }
                    if (i2 >= this.m.length || i2 < 0) {
                        tfi.j(BaseApplication.getContext(), this.m[0]);
                    } else {
                        tfi.j(BaseApplication.getContext(), this.m[i2]);
                    }
                }
                this.l.setVisibility(8);
                return;
            }
            int[] iArr2 = this.f25775c;
            if (iArr2 != null) {
                if (iArr2.length > i2) {
                    this.o.setText(this.f25774b.get(this.d.get(0)).get(i2));
                }
                if (i2 >= this.f25775c.length || i2 < 0) {
                    tfi.c(BaseApplication.getContext(), this.f25775c[0]);
                } else {
                    tfi.c(BaseApplication.getContext(), this.f25775c[i2]);
                }
            }
            this.l.setVisibility(0);
        } catch (IndexOutOfBoundsException e) {
            LogUtil.j("Track_SportAssistBaseVoiceSettingsActivity", "updateVoiceInterval IndexOutOfBoundsException ", e.getMessage());
        }
    }

    private int b(int i) {
        int i2 = 0;
        if (i == 2) {
            int iA = tfi.a(BaseApplication.getContext());
            while (true) {
                int[] iArr = this.f25775c;
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
                int[] iArr2 = this.m;
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

    private boolean d(String str) {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(20002), str);
        if (TextUtils.isEmpty(strE)) {
            LogUtil.a("Track_SportAssistBaseVoiceSettingsActivity", "TextUtils.isEmpty(sharedPreference)");
            return true;
        }
        try {
            return Integer.parseInt(strE) == 1;
        } catch (NumberFormatException unused) {
            LogUtil.a("Track_SportAssistBaseVoiceSettingsActivity", "sharedPreference NumberFormatException");
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, boolean z) {
        String string;
        if (z) {
            string = Integer.toString(1);
        } else {
            string = Integer.toString(0);
        }
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(20002), str, string, new StorageParams());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            LogUtil.a("Track_SportAssistBaseVoiceSettingsActivity", "onClick view == null");
            return;
        }
        if (qrs.c(600)) {
            LogUtil.e("Track_SportAssistBaseVoiceSettingsActivity", "onClick is Fast");
            return;
        }
        HashMap map = new HashMap(1);
        map.put("click", 1);
        if (view.getId() == R.id.layout_track_voice_interval_setting) {
            h();
            map.put("type", 2);
        }
        lmf.d().c(this, AnalyticsValue.MOTION_TRACK_1040023.value(), map, 0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
