package com.garmin.android.apps.connectmobile.settings.devices.common;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/common/b;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "b", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends Fragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0798b f42819d = new C0798b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f42820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SwitchCompat f42821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Button f42822c;

    public interface a {
        void c7(int i14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f42820a = (a) context;
        } catch (ClassCastException unused) {
            a2 a2Var = a2.SETTINGS;
            String strConcat = context.getClass().getSimpleName().concat("must implement BikeAlarmOptionsCallback");
            i2.f36769a.getClass();
            i2.a.k(a2Var, "BikeAlarmOptionsFragment", strConcat);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.bike_alarm_options, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f42820a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        m activity = getActivity();
        activity.getClass();
        c cVar = ((BikeAlarmSettingActivity) activity).f42585a;
        View viewFindViewById = view2.findViewById(R.id.bike_alarm_options_arm_switch);
        viewFindViewById.getClass();
        this.f42821b = (SwitchCompat) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.bike_alarm_options_sound_alarm);
        viewFindViewById2.getClass();
        this.f42822c = (Button) viewFindViewById2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            boolean z14 = arguments.getBoolean("SOUND_ALARM_KEY", false);
            if (z14) {
                u6("BIKE_ALARM_SOUND_TAG", z14);
            } else {
                u6("BIKE_ALARM_DISABLE_TAG", z14);
            }
        }
        Bundle arguments2 = getArguments();
        boolean z15 = arguments2 != null ? arguments2.getBoolean("ARM_BIKE_ALARM_KEY", false) : false;
        SwitchCompat switchCompat = this.f42821b;
        if (switchCompat == null) {
            s.m("bikeAlarmOptionsArmSwitch");
            throw null;
        }
        switchCompat.setChecked(z15);
        SwitchCompat switchCompat2 = this.f42821b;
        if (switchCompat2 == null) {
            s.m("bikeAlarmOptionsArmSwitch");
            throw null;
        }
        if (!switchCompat2.isChecked()) {
            u6("BIKE_ALARM_DISABLE_TAG", false);
        }
        SwitchCompat switchCompat3 = this.f42821b;
        if (switchCompat3 == null) {
            s.m("bikeAlarmOptionsArmSwitch");
            throw null;
        }
        switchCompat3.setOnCheckedChangeListener(new com.google.android.material.chip.a(cVar, 14));
        Button button = this.f42822c;
        if (button == null) {
            s.m("bikeAlarmOptionsSoundAlarm");
            throw null;
        }
        button.setOnClickListener(new u12.e(20, this, cVar));
        view2.findViewById(R.id.bike_alarm_options_reset_pass_code).setOnClickListener(new t61.m(this, 27));
    }

    public final void u6(String str, boolean z14) {
        Button button = this.f42822c;
        if (button == null) {
            s.m("bikeAlarmOptionsSoundAlarm");
            throw null;
        }
        button.setTag(str);
        Button button2 = this.f42822c;
        if (z14) {
            if (button2 == null) {
                s.m("bikeAlarmOptionsSoundAlarm");
                throw null;
            }
            button2.setBackgroundResource(R.color.gcm_button_danger);
            Button button3 = this.f42822c;
            if (button3 == null) {
                s.m("bikeAlarmOptionsSoundAlarm");
                throw null;
            }
            button3.setText(getString(R.string.bike_alarm_off_button_title));
            Button button4 = this.f42822c;
            if (button4 != null) {
                button4.setTextColor(a7.b.getColor(requireContext(), R.color.gcm_button_text_selector));
                return;
            } else {
                s.m("bikeAlarmOptionsSoundAlarm");
                throw null;
            }
        }
        if (button2 == null) {
            s.m("bikeAlarmOptionsSoundAlarm");
            throw null;
        }
        button2.setBackgroundResource(R.color.gcm_button_secondary);
        Button button5 = this.f42822c;
        if (button5 == null) {
            s.m("bikeAlarmOptionsSoundAlarm");
            throw null;
        }
        button5.setText(getString(R.string.bike_alarm_sound_alarm_button_title));
        Button button6 = this.f42822c;
        if (button6 != null) {
            button6.setTextColor(a7.b.getColor(requireContext(), R.color.gcm_button_secondary_text_selector));
        } else {
            s.m("bikeAlarmOptionsSoundAlarm");
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.devices.common.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/common/b$b;", "", "<init>", "()V", "", "ARM_BIKE_ALARM_KEY", "Ljava/lang/String;", "PASS_CODE_KEY", "SOUND_ALARM_KEY", "DEVICE_ID_KEY", "BIKE_ALARM_SOUND_TAG", "BIKE_ALARM_DISABLE_TAG", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0798b {
        public /* synthetic */ C0798b(j jVar) {
            this();
        }

        private C0798b() {
        }
    }
}
