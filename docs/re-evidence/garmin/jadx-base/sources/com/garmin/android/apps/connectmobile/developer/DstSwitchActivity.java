package com.garmin.android.apps.connectmobile.developer;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioGroup;
import android.widget.TimePicker;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import java.util.Calendar;
import java.util.Date;
import vs2.d;

/* JADX INFO: loaded from: classes8.dex */
@TargetApi(21)
public class DstSwitchActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DatePicker f33607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TimePicker f33608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Button f33609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Button f33610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RadioGroup f33611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f33612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f33613g;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            Calendar calendar = Calendar.getInstance();
            DstSwitchActivity dstSwitchActivity = DstSwitchActivity.this;
            calendar.set(dstSwitchActivity.f33607a.getYear(), dstSwitchActivity.f33607a.getMonth(), dstSwitchActivity.f33607a.getDayOfMonth(), dstSwitchActivity.f33608b.getHour(), dstSwitchActivity.f33608b.getMinute());
            long timeInMillis = calendar.getTimeInMillis();
            GCMSettingManager.f41536b.edit().putLong(GCMSettingManager.f41535a.getString(R.string.key_dst_override_datetime), timeInMillis).apply();
            d.f179939a = timeInMillis;
            boolean z14 = dstSwitchActivity.f33611e.getCheckedRadioButtonId() == R.id.dst_start;
            com.nimbusds.jose.shaded.gson.internal.a.o(GCMSettingManager.f41535a, R.string.key_dst_override_for_start, GCMSettingManager.f41536b.edit(), z14);
            d.f179940b = z14;
            Toast.makeText(dstSwitchActivity, "DST overridden.  Sync device to pick up overridden value.", 1).show();
            dstSwitchActivity.f33610d.setEnabled(true);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            GCMSettingManager.f41536b.edit().putLong(GCMSettingManager.f41535a.getString(R.string.key_dst_override_datetime), -1L).apply();
            d.f179939a = -1L;
            com.nimbusds.jose.shaded.gson.internal.a.o(GCMSettingManager.f41535a, R.string.key_dst_override_for_start, GCMSettingManager.f41536b.edit(), true);
            d.f179940b = true;
            DstSwitchActivity dstSwitchActivity = DstSwitchActivity.this;
            dstSwitchActivity.f33610d.setEnabled(false);
            dstSwitchActivity.ca(System.currentTimeMillis());
            Toast.makeText(dstSwitchActivity, "DST Override reset, sync device to restore real values.", 1).show();
        }
    }

    public final void ca(long j8) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j8));
        int i14 = calendar.get(9) == 1 ? 12 : 0;
        this.f33607a.updateDate(calendar.get(1), calendar.get(2), calendar.get(5));
        this.f33608b.setCurrentHour(Integer.valueOf(calendar.get(10) + i14));
        this.f33608b.setCurrentMinute(Integer.valueOf(calendar.get(12)));
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dst_switch_activity);
        this.f33607a = (DatePicker) findViewById(R.id.date_picker);
        this.f33608b = (TimePicker) findViewById(R.id.time_picker);
        this.f33609c = (Button) findViewById(R.id.override);
        this.f33610d = (Button) findViewById(R.id.reset);
        this.f33611e = (RadioGroup) findViewById(R.id.start_end);
        this.f33609c.setOnClickListener(new a());
        this.f33610d.setOnClickListener(new b());
        this.f33612f = GCMSettingManager.f41536b.getLong(GCMSettingManager.f41535a.getString(R.string.key_dst_override_datetime), -1L);
        boolean z14 = GCMSettingManager.f41536b.getBoolean(GCMSettingManager.f41535a.getString(R.string.key_dst_override_for_start), true);
        this.f33613g = z14;
        long j8 = this.f33612f;
        d.f179939a = j8;
        d.f179940b = z14;
        if (j8 != -1) {
            ca(j8);
        } else {
            ca(System.currentTimeMillis());
            this.f33610d.setEnabled(false);
        }
        boolean z15 = this.f33613g;
        RadioGroup radioGroup = this.f33611e;
        if (z15) {
            radioGroup.check(R.id.dst_start);
        } else {
            radioGroup.check(R.id.dst_end);
        }
    }
}
