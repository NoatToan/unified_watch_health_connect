package com.garmin.android.apps.connectmobile.connectiq;

import android.os.Bundle;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connectiq/DefaultConnectIQActivitiesAndAppsActivity;", "Lcom/garmin/android/apps/connectmobile/connectiq/z;", "<init>", "()V", "a", "Lcom/garmin/android/apps/connectmobile/view/view_3_0/GCMComplexOneLineButton;", "customAppsButton", "customDataFields", "customWidgetsButton", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class DefaultConnectIQActivitiesAndAppsActivity extends z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f31808d = 0;

    static {
        new a(null);
        p005kotlin.jvm.internal.s0.f105811a.b(DefaultConnectIQActivitiesAndAppsActivity.class).D().getClass();
    }

    @Override // com.garmin.android.apps.connectmobile.connectiq.z, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm_connect_iq_activities_and_apps);
        super.initActionBar(true, R.string.device_settings_activities_apps_more);
        ag0.a aVar = new ag0.a(this, R.id.custom_bttn_apps, 1);
        o13.n nVar = o13.n.NONE;
        o13.l lVarA = o13.m.a(nVar, aVar);
        boolean zI = km2.a.i(this.f32112b, null, SupportedCapability.CONNECTIQ_WATCH_APP_DOWNLOAD.ordinal());
        ((GCMComplexOneLineButton) lVarA.getValue()).setEnabled(ca());
        ((GCMComplexOneLineButton) lVarA.getValue()).setVisibility(zI ? 0 : 8);
        final int i14 = 0;
        ((GCMComplexOneLineButton) lVarA.getValue()).setOnClickListener(new View.OnClickListener(this) { // from class: com.garmin.android.apps.connectmobile.connectiq.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DefaultConnectIQActivitiesAndAppsActivity f31940b;

            {
                this.f31940b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i15 = i14;
                DefaultConnectIQActivitiesAndAppsActivity defaultConnectIQActivitiesAndAppsActivity = this.f31940b;
                switch (i15) {
                    case 0:
                        int i16 = DefaultConnectIQActivitiesAndAppsActivity.f31808d;
                        if (defaultConnectIQActivitiesAndAppsActivity.ca()) {
                            ConnectIQDownloadListActivity.a aVar2 = ConnectIQDownloadListActivity.f31779o;
                            long j8 = defaultConnectIQActivitiesAndAppsActivity.f32112b;
                            l lVar = l.APPS;
                            aVar2.getClass();
                            ConnectIQDownloadListActivity.a.a(defaultConnectIQActivitiesAndAppsActivity, j8, lVar);
                        }
                        break;
                    case 1:
                        int i17 = DefaultConnectIQActivitiesAndAppsActivity.f31808d;
                        if (defaultConnectIQActivitiesAndAppsActivity.ca()) {
                            ConnectIQDownloadListActivity.a aVar3 = ConnectIQDownloadListActivity.f31779o;
                            long j14 = defaultConnectIQActivitiesAndAppsActivity.f32112b;
                            l lVar2 = l.DATA_FIELDS;
                            aVar3.getClass();
                            ConnectIQDownloadListActivity.a.a(defaultConnectIQActivitiesAndAppsActivity, j14, lVar2);
                        }
                        break;
                    default:
                        int i18 = DefaultConnectIQActivitiesAndAppsActivity.f31808d;
                        if (defaultConnectIQActivitiesAndAppsActivity.ca()) {
                            ConnectIQDownloadListActivity.a aVar4 = ConnectIQDownloadListActivity.f31779o;
                            long j15 = defaultConnectIQActivitiesAndAppsActivity.f32112b;
                            l lVar3 = l.WIDGETS;
                            aVar4.getClass();
                            ConnectIQDownloadListActivity.a.a(defaultConnectIQActivitiesAndAppsActivity, j15, lVar3);
                        }
                        break;
                }
            }
        });
        o13.l lVarA2 = o13.m.a(nVar, new ag0.a(this, R.id.custom_bttn_datafields, 1));
        boolean zI2 = km2.a.i(this.f32112b, null, SupportedCapability.CONNECTIQ_DATA_FIELD_DOWNLOAD.ordinal());
        ((GCMComplexOneLineButton) lVarA2.getValue()).setEnabled(ca());
        ((GCMComplexOneLineButton) lVarA2.getValue()).setVisibility(zI2 ? 0 : 8);
        final int i15 = 1;
        ((GCMComplexOneLineButton) lVarA2.getValue()).setOnClickListener(new View.OnClickListener(this) { // from class: com.garmin.android.apps.connectmobile.connectiq.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DefaultConnectIQActivitiesAndAppsActivity f31940b;

            {
                this.f31940b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i16 = i15;
                DefaultConnectIQActivitiesAndAppsActivity defaultConnectIQActivitiesAndAppsActivity = this.f31940b;
                switch (i16) {
                    case 0:
                        int i17 = DefaultConnectIQActivitiesAndAppsActivity.f31808d;
                        if (defaultConnectIQActivitiesAndAppsActivity.ca()) {
                            ConnectIQDownloadListActivity.a aVar2 = ConnectIQDownloadListActivity.f31779o;
                            long j8 = defaultConnectIQActivitiesAndAppsActivity.f32112b;
                            l lVar = l.APPS;
                            aVar2.getClass();
                            ConnectIQDownloadListActivity.a.a(defaultConnectIQActivitiesAndAppsActivity, j8, lVar);
                        }
                        break;
                    case 1:
                        int i18 = DefaultConnectIQActivitiesAndAppsActivity.f31808d;
                        if (defaultConnectIQActivitiesAndAppsActivity.ca()) {
                            ConnectIQDownloadListActivity.a aVar3 = ConnectIQDownloadListActivity.f31779o;
                            long j14 = defaultConnectIQActivitiesAndAppsActivity.f32112b;
                            l lVar2 = l.DATA_FIELDS;
                            aVar3.getClass();
                            ConnectIQDownloadListActivity.a.a(defaultConnectIQActivitiesAndAppsActivity, j14, lVar2);
                        }
                        break;
                    default:
                        int i19 = DefaultConnectIQActivitiesAndAppsActivity.f31808d;
                        if (defaultConnectIQActivitiesAndAppsActivity.ca()) {
                            ConnectIQDownloadListActivity.a aVar4 = ConnectIQDownloadListActivity.f31779o;
                            long j15 = defaultConnectIQActivitiesAndAppsActivity.f32112b;
                            l lVar3 = l.WIDGETS;
                            aVar4.getClass();
                            ConnectIQDownloadListActivity.a.a(defaultConnectIQActivitiesAndAppsActivity, j15, lVar3);
                        }
                        break;
                }
            }
        });
        o13.l lVarA3 = o13.m.a(nVar, new ag0.a(this, R.id.custom_bttn_widgets, 1));
        boolean zI3 = km2.a.i(this.f32112b, null, SupportedCapability.CONNECTIQ_WIDGET_DOWNLOAD.ordinal());
        ((GCMComplexOneLineButton) lVarA3.getValue()).setEnabled(ca());
        ((GCMComplexOneLineButton) lVarA3.getValue()).setVisibility(zI3 ? 0 : 8);
        final int i16 = 2;
        ((GCMComplexOneLineButton) lVarA3.getValue()).setOnClickListener(new View.OnClickListener(this) { // from class: com.garmin.android.apps.connectmobile.connectiq.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DefaultConnectIQActivitiesAndAppsActivity f31940b;

            {
                this.f31940b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i17 = i16;
                DefaultConnectIQActivitiesAndAppsActivity defaultConnectIQActivitiesAndAppsActivity = this.f31940b;
                switch (i17) {
                    case 0:
                        int i18 = DefaultConnectIQActivitiesAndAppsActivity.f31808d;
                        if (defaultConnectIQActivitiesAndAppsActivity.ca()) {
                            ConnectIQDownloadListActivity.a aVar2 = ConnectIQDownloadListActivity.f31779o;
                            long j8 = defaultConnectIQActivitiesAndAppsActivity.f32112b;
                            l lVar = l.APPS;
                            aVar2.getClass();
                            ConnectIQDownloadListActivity.a.a(defaultConnectIQActivitiesAndAppsActivity, j8, lVar);
                        }
                        break;
                    case 1:
                        int i19 = DefaultConnectIQActivitiesAndAppsActivity.f31808d;
                        if (defaultConnectIQActivitiesAndAppsActivity.ca()) {
                            ConnectIQDownloadListActivity.a aVar3 = ConnectIQDownloadListActivity.f31779o;
                            long j14 = defaultConnectIQActivitiesAndAppsActivity.f32112b;
                            l lVar2 = l.DATA_FIELDS;
                            aVar3.getClass();
                            ConnectIQDownloadListActivity.a.a(defaultConnectIQActivitiesAndAppsActivity, j14, lVar2);
                        }
                        break;
                    default:
                        int i110 = DefaultConnectIQActivitiesAndAppsActivity.f31808d;
                        if (defaultConnectIQActivitiesAndAppsActivity.ca()) {
                            ConnectIQDownloadListActivity.a aVar4 = ConnectIQDownloadListActivity.f31779o;
                            long j15 = defaultConnectIQActivitiesAndAppsActivity.f32112b;
                            l lVar3 = l.WIDGETS;
                            aVar4.getClass();
                            ConnectIQDownloadListActivity.a.a(defaultConnectIQActivitiesAndAppsActivity, j15, lVar3);
                        }
                        break;
                }
            }
        });
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connectiq/DefaultConnectIQActivitiesAndAppsActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
