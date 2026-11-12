package com.garmin.android.apps.connectmobile.bikesensors.test;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatButton;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.bikesensors.test.TestBikeAlarmNotificationActivity;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.settings.devices.common.a;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import java.util.ArrayList;
import java.util.Iterator;
import rd2.f;
import rd2.j;

/* JADX INFO: loaded from: classes7.dex */
public class TestBikeAlarmNotificationActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f30902a;

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        long unitID;
        super.onCreate(bundle);
        setContentView(R.layout.activity_test_bike_alarm_notification);
        initActionBar(true, "Test Bike Alarm Notifications");
        f.a().f152045a.getClass();
        ArrayList arrayListE = j.e();
        if (arrayListE != null) {
            Iterator it = arrayListE.iterator();
            while (true) {
                if (!it.hasNext()) {
                    unitID = 0;
                    break;
                }
                sd2.f fVar = (sd2.f) it.next();
                if (fVar != null && km2.a.i(fVar.getUnitID(), null, SupportedCapability.ANTI_THEFT_ALARM.ordinal())) {
                    unitID = fVar.getUnitID();
                    break;
                }
            }
        } else {
            unitID = 0;
            break;
        }
        if (unitID == 0) {
            Toast.makeText(this, getString(R.string.device_none_compatible), 0).show();
            finish();
            return;
        }
        this.f30902a = new a(getApplicationContext(), unitID);
        AppCompatButton appCompatButton = (AppCompatButton) findViewById(R.id.test_notification_one);
        AppCompatButton appCompatButton2 = (AppCompatButton) findViewById(R.id.test_notification_two);
        AppCompatButton appCompatButton3 = (AppCompatButton) findViewById(R.id.test_notification_three);
        AppCompatButton appCompatButton4 = (AppCompatButton) findViewById(R.id.test_notification_four);
        AppCompatButton appCompatButton5 = (AppCompatButton) findViewById(R.id.test_notification_five);
        final int i14 = 0;
        appCompatButton.setOnClickListener(new View.OnClickListener(this) { // from class: bw.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TestBikeAlarmNotificationActivity f21561b;

            {
                this.f21561b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        this.f21561b.onNotificationOneClicked(view2);
                        break;
                    case 1:
                        this.f21561b.onNotificationTwoClicked(view2);
                        break;
                    case 2:
                        this.f21561b.onNotificationThreeClicked(view2);
                        break;
                    case 3:
                        this.f21561b.onNotificationFourClicked(view2);
                        break;
                    default:
                        this.f21561b.onNotificationFiveClicked(view2);
                        break;
                }
            }
        });
        final int i15 = 1;
        appCompatButton2.setOnClickListener(new View.OnClickListener(this) { // from class: bw.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TestBikeAlarmNotificationActivity f21561b;

            {
                this.f21561b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        this.f21561b.onNotificationOneClicked(view2);
                        break;
                    case 1:
                        this.f21561b.onNotificationTwoClicked(view2);
                        break;
                    case 2:
                        this.f21561b.onNotificationThreeClicked(view2);
                        break;
                    case 3:
                        this.f21561b.onNotificationFourClicked(view2);
                        break;
                    default:
                        this.f21561b.onNotificationFiveClicked(view2);
                        break;
                }
            }
        });
        final int i16 = 2;
        appCompatButton3.setOnClickListener(new View.OnClickListener(this) { // from class: bw.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TestBikeAlarmNotificationActivity f21561b;

            {
                this.f21561b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        this.f21561b.onNotificationOneClicked(view2);
                        break;
                    case 1:
                        this.f21561b.onNotificationTwoClicked(view2);
                        break;
                    case 2:
                        this.f21561b.onNotificationThreeClicked(view2);
                        break;
                    case 3:
                        this.f21561b.onNotificationFourClicked(view2);
                        break;
                    default:
                        this.f21561b.onNotificationFiveClicked(view2);
                        break;
                }
            }
        });
        final int i17 = 3;
        appCompatButton4.setOnClickListener(new View.OnClickListener(this) { // from class: bw.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TestBikeAlarmNotificationActivity f21561b;

            {
                this.f21561b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        this.f21561b.onNotificationOneClicked(view2);
                        break;
                    case 1:
                        this.f21561b.onNotificationTwoClicked(view2);
                        break;
                    case 2:
                        this.f21561b.onNotificationThreeClicked(view2);
                        break;
                    case 3:
                        this.f21561b.onNotificationFourClicked(view2);
                        break;
                    default:
                        this.f21561b.onNotificationFiveClicked(view2);
                        break;
                }
            }
        });
        final int i18 = 4;
        appCompatButton5.setOnClickListener(new View.OnClickListener(this) { // from class: bw.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TestBikeAlarmNotificationActivity f21561b;

            {
                this.f21561b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i18) {
                    case 0:
                        this.f21561b.onNotificationOneClicked(view2);
                        break;
                    case 1:
                        this.f21561b.onNotificationTwoClicked(view2);
                        break;
                    case 2:
                        this.f21561b.onNotificationThreeClicked(view2);
                        break;
                    case 3:
                        this.f21561b.onNotificationFourClicked(view2);
                        break;
                    default:
                        this.f21561b.onNotificationFiveClicked(view2);
                        break;
                }
            }
        });
    }

    public void onNotificationFiveClicked(View view2) {
        this.f30902a.b(a.EnumC0797a.BIKE_ALARM_ACTIVATED);
    }

    public void onNotificationFourClicked(View view2) {
        this.f30902a.b(a.EnumC0797a.CONNECTION_ESTABLISHED);
    }

    public void onNotificationOneClicked(View view2) {
        this.f30902a.b(a.EnumC0797a.BIKE_ALARM_ON);
    }

    public void onNotificationThreeClicked(View view2) {
        this.f30902a.b(a.EnumC0797a.CONNECTION_LOST);
    }

    public void onNotificationTwoClicked(View view2) {
        this.f30902a.b(a.EnumC0797a.BIKE_ALARM_OFF);
    }
}
