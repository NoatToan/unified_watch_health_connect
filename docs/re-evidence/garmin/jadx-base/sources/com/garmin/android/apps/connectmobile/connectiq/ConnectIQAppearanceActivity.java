package com.garmin.android.apps.connectmobile.connectiq;

import android.os.Bundle;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes7.dex */
public class ConnectIQAppearanceActivity extends z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f31763d = 0;

    @Override // com.garmin.android.apps.connectmobile.connectiq.z, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm_connect_iq_appearance);
        super.initActionBar(true, R.string.appearance_title);
        final int i14 = 0;
        findViewById(R.id.custom_bttn_watchfaces).setOnClickListener(new View.OnClickListener(this) { // from class: com.garmin.android.apps.connectmobile.connectiq.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConnectIQAppearanceActivity f31902b;

            {
                this.f31902b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i15 = i14;
                ConnectIQAppearanceActivity connectIQAppearanceActivity = this.f31902b;
                switch (i15) {
                    case 0:
                        int i16 = ConnectIQAppearanceActivity.f31763d;
                        if (connectIQAppearanceActivity.ca()) {
                            long j8 = connectIQAppearanceActivity.f32112b;
                            l lVar = l.WATCH_FACES;
                            ConnectIQDownloadListActivity.f31779o.getClass();
                            ConnectIQDownloadListActivity.a.a(connectIQAppearanceActivity, j8, lVar);
                        }
                        break;
                    default:
                        int i17 = ConnectIQAppearanceActivity.f31763d;
                        if (connectIQAppearanceActivity.ca()) {
                            long j14 = connectIQAppearanceActivity.f32112b;
                            l lVar2 = l.WIDGETS;
                            ConnectIQDownloadListActivity.f31779o.getClass();
                            ConnectIQDownloadListActivity.a.a(connectIQAppearanceActivity, j14, lVar2);
                        }
                        break;
                }
            }
        });
        final int i15 = 1;
        findViewById(R.id.custom_bttn_widgets).setOnClickListener(new View.OnClickListener(this) { // from class: com.garmin.android.apps.connectmobile.connectiq.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConnectIQAppearanceActivity f31902b;

            {
                this.f31902b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i16 = i15;
                ConnectIQAppearanceActivity connectIQAppearanceActivity = this.f31902b;
                switch (i16) {
                    case 0:
                        int i17 = ConnectIQAppearanceActivity.f31763d;
                        if (connectIQAppearanceActivity.ca()) {
                            long j8 = connectIQAppearanceActivity.f32112b;
                            l lVar = l.WATCH_FACES;
                            ConnectIQDownloadListActivity.f31779o.getClass();
                            ConnectIQDownloadListActivity.a.a(connectIQAppearanceActivity, j8, lVar);
                        }
                        break;
                    default:
                        int i18 = ConnectIQAppearanceActivity.f31763d;
                        if (connectIQAppearanceActivity.ca()) {
                            long j14 = connectIQAppearanceActivity.f32112b;
                            l lVar2 = l.WIDGETS;
                            ConnectIQDownloadListActivity.f31779o.getClass();
                            ConnectIQDownloadListActivity.a.a(connectIQAppearanceActivity, j14, lVar2);
                        }
                        break;
                }
            }
        });
    }
}
