package com.garmin.android.apps.connectmobile.connectiq;

import android.os.Bundle;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;

/* JADX INFO: loaded from: classes7.dex */
public class ConnectIQActivitiesAndAppsActivity extends z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f31704d = 0;

    @Override // com.garmin.android.apps.connectmobile.connectiq.z, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm_connect_iq_activities_and_apps);
        super.initActionBar(true, R.string.device_settings_activities_apps_more);
        final int i14 = 0;
        ((GCMComplexOneLineButton) findViewById(R.id.custom_bttn_apps)).setOnClickListener(new View.OnClickListener(this) { // from class: com.garmin.android.apps.connectmobile.connectiq.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConnectIQActivitiesAndAppsActivity f31853b;

            {
                this.f31853b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i15 = i14;
                ConnectIQActivitiesAndAppsActivity connectIQActivitiesAndAppsActivity = this.f31853b;
                switch (i15) {
                    case 0:
                        int i16 = ConnectIQActivitiesAndAppsActivity.f31704d;
                        if (connectIQActivitiesAndAppsActivity.ca()) {
                            long j8 = connectIQActivitiesAndAppsActivity.f32112b;
                            l lVar = l.APPS;
                            ConnectIQDownloadListActivity.f31779o.getClass();
                            ConnectIQDownloadListActivity.a.a(connectIQActivitiesAndAppsActivity, j8, lVar);
                        }
                        break;
                    default:
                        int i17 = ConnectIQActivitiesAndAppsActivity.f31704d;
                        if (connectIQActivitiesAndAppsActivity.ca()) {
                            long j14 = connectIQActivitiesAndAppsActivity.f32112b;
                            l lVar2 = l.DATA_FIELDS;
                            ConnectIQDownloadListActivity.f31779o.getClass();
                            ConnectIQDownloadListActivity.a.a(connectIQActivitiesAndAppsActivity, j14, lVar2);
                        }
                        break;
                }
            }
        });
        final int i15 = 1;
        findViewById(R.id.custom_bttn_datafields).setOnClickListener(new View.OnClickListener(this) { // from class: com.garmin.android.apps.connectmobile.connectiq.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConnectIQActivitiesAndAppsActivity f31853b;

            {
                this.f31853b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i16 = i15;
                ConnectIQActivitiesAndAppsActivity connectIQActivitiesAndAppsActivity = this.f31853b;
                switch (i16) {
                    case 0:
                        int i17 = ConnectIQActivitiesAndAppsActivity.f31704d;
                        if (connectIQActivitiesAndAppsActivity.ca()) {
                            long j8 = connectIQActivitiesAndAppsActivity.f32112b;
                            l lVar = l.APPS;
                            ConnectIQDownloadListActivity.f31779o.getClass();
                            ConnectIQDownloadListActivity.a.a(connectIQActivitiesAndAppsActivity, j8, lVar);
                        }
                        break;
                    default:
                        int i18 = ConnectIQActivitiesAndAppsActivity.f31704d;
                        if (connectIQActivitiesAndAppsActivity.ca()) {
                            long j14 = connectIQActivitiesAndAppsActivity.f32112b;
                            l lVar2 = l.DATA_FIELDS;
                            ConnectIQDownloadListActivity.f31779o.getClass();
                            ConnectIQDownloadListActivity.a.a(connectIQActivitiesAndAppsActivity, j14, lVar2);
                        }
                        break;
                }
            }
        });
    }
}
