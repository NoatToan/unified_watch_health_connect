package com.garmin.android.apps.connectmobile.settings.activityoptions;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import c22.b1;
import com.garmin.android.apps.connectmobile.R;
import hg1.j;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes10.dex */
public class a implements DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.e f41709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.activityoptions.b f41710b;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.activityoptions.a$a, reason: collision with other inner class name */
    public class ViewOnClickListenerC0791a implements View.OnClickListener {
        public ViewOnClickListenerC0791a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            double dB;
            a aVar = a.this;
            com.garmin.android.apps.connectmobile.settings.activityoptions.b bVar = aVar.f41710b;
            com.garmin.android.apps.connectmobile.settings.activityoptions.b bVar2 = aVar.f41710b;
            String string = bVar.f41718f.getText().toString();
            try {
                dB = Double.parseDouble(string);
            } catch (NumberFormatException unused) {
                dB = b1.b(string);
            }
            Context context = bVar2.f41713a;
            j jVar = bVar2.f41715c;
            if (jVar == null) {
                int i14 = (int) dB;
                bVar2.f41718f.setText(String.valueOf(i14));
                int i15 = bVar2.f41716d;
                if (i15 == -1) {
                    int i16 = bVar2.f41717e;
                    if (i16 == 1) {
                        return;
                    }
                    if (i14 < 30 || i14 >= i16) {
                        AppCompatEditText appCompatEditText = bVar2.f41718f;
                        appCompatEditText.setSelection(appCompatEditText.getText().length());
                        bVar2.f41719g.setText(context.getString(R.string.hr_alerts_setting_invalid_custom_hr_message));
                        return;
                    }
                } else if (i14 <= i15 || i14 > 250) {
                    AppCompatEditText appCompatEditText2 = bVar2.f41718f;
                    appCompatEditText2.setSelection(appCompatEditText2.getText().length());
                    bVar2.f41719g.setText(context.getString(R.string.hr_alerts_setting_invalid_custom_hr_message));
                    return;
                }
            } else if (jVar == j.ALERT_TYPE_CALORIES) {
                int i17 = (int) dB;
                bVar2.f41718f.setText(String.valueOf(i17));
                if (i17 < 50 || i17 > 5000) {
                    AppCompatEditText appCompatEditText3 = bVar2.f41718f;
                    appCompatEditText3.setSelection(appCompatEditText3.getText().length());
                    bVar2.f41719g.setText(context.getString(R.string.run_mode_alerts_setting_invalid_calories_message));
                    return;
                }
            } else if (jVar == j.ALERT_TYPE_DISTANCE) {
                double dDoubleValue = new BigDecimal(Double.toString(dB)).setScale(2, RoundingMode.HALF_UP).doubleValue();
                bVar2.f41718f.setText(String.valueOf(dDoubleValue));
                if (dDoubleValue < 0.2d || dDoubleValue > 99.99d) {
                    AppCompatEditText appCompatEditText4 = bVar2.f41718f;
                    appCompatEditText4.setSelection(appCompatEditText4.getText().length());
                    bVar2.f41719g.setText(context.getString(R.string.run_mode_alerts_setting_invalid_distance_message, Double.valueOf(0.2d), Double.valueOf(99.99d)));
                    return;
                }
            } else if (jVar == j.ALERT_TYPE_REP_COUNTING) {
                int i18 = (int) dB;
                bVar2.f41718f.setText(String.valueOf(i18));
                if (i18 < 1 || i18 > 999) {
                    AppCompatEditText appCompatEditText5 = bVar2.f41718f;
                    appCompatEditText5.setSelection(appCompatEditText5.getText().length());
                    bVar2.f41719g.setText(R.string.run_options_rep_count_validation_error_txt);
                    return;
                }
            } else {
                if (jVar != j.ALERT_TYPE_SWIM_DISTANCE) {
                    return;
                }
                bVar2.f41718f.setText(String.valueOf(dB));
                if (dB < 25.0d || dB > 9975.0d || dB % 25.0d != 0.0d) {
                    AppCompatEditText appCompatEditText6 = bVar2.f41718f;
                    appCompatEditText6.setSelection(appCompatEditText6.getText().length());
                    bVar2.f41719g.setText(context.getString(R.string.msg_incorrect_distance_increments, String.valueOf(25), String.valueOf(9975), String.valueOf(25)));
                    return;
                }
            }
            bVar2.f41714b.e(dB);
            aVar.f41709a.dismiss();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            a.this.f41709a.dismiss();
        }
    }

    public a(com.garmin.android.apps.connectmobile.settings.activityoptions.b bVar, androidx.appcompat.app.e eVar) {
        this.f41710b = bVar;
        this.f41709a = eVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        androidx.appcompat.app.e eVar = this.f41709a;
        eVar.e(-1).setOnClickListener(new ViewOnClickListenerC0791a());
        eVar.e(-2).setOnClickListener(new b());
    }
}
