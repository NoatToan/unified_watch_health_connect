package com.garmin.android.apps.connectmobile.connectiq;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.v1;
import androidx.lifecycle.x1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtobufRequestManager;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.wifi.GCMWiFiNetworksActivity;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.proto.generated.GDIConnectIQInstalledApps;
import com.garmin.proto.generated.GDIConnectIQInstalledAppsExtension;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.ByteString;
import java.util.ArrayList;
import java.util.Locale;
import java.util.UUID;
import org.apache.commons.lang3.StringUtils;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes7.dex */
public class ConnectIQAppDetailsActivity extends com.garmin.android.apps.connectmobile.c implements pi2.c {
    public static final /* synthetic */ int C = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f31706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ConnectIQAppDetailsActivity f31707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f31708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o10.b f31709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f31710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f31711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f31712h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f31713i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f31714j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Button f31715k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Button f31716l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Button f31717m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f31718n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f31719o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public sd2.f f31720p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public y10.b f31722r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler f31705a = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f31721q = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a f31723t = new a();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b f31724v = new b();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c f31725w = new c();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final d f31726x = new d();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e f31727y = new e();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final f f31728z = new f();
    public final g A = new g();
    public final n B = new n();

    public class a implements View.OnClickListener {
        public a() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0032  */
        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            Intent intent;
            ConnectIQAppDetailsActivity connectIQAppDetailsActivity = ConnectIQAppDetailsActivity.this;
            long j8 = connectIQAppDetailsActivity.f31712h;
            String str = connectIQAppDetailsActivity.f31709e.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID java.lang.String();
            int i14 = ConnectIQDeviceRedirectActivity.f31766i;
            com.garmin.android.apps.connectmobile.l.g().getClass();
            if (com.garmin.android.apps.connectmobile.l.i()) {
                com.garmin.android.apps.connectmobile.l.g().getClass();
                if (TextUtils.isEmpty(com.garmin.android.apps.connectmobile.l.f())) {
                    intent = new Intent(connectIQAppDetailsActivity, (Class<?>) ConnectIQAppStoreActivity.class);
                } else {
                    intent = new Intent(connectIQAppDetailsActivity, (Class<?>) ConnectIQDeviceRedirectActivity.class);
                }
            } else {
                intent = new Intent(connectIQAppDetailsActivity, (Class<?>) ConnectIQAppStoreActivity.class);
            }
            intent.putExtra("GCM_deviceUnitID", j8);
            intent.putExtra("CONNECT_IQ_APP_ID", str);
            intent.putExtra("deepLinkType", ConnectIQDeviceRedirectActivity.a.DETAILS.ordinal());
            connectIQAppDetailsActivity.startActivity(intent);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            ConnectIQAppDetailsActivity connectIQAppDetailsActivity = ConnectIQAppDetailsActivity.this;
            if (connectIQAppDetailsActivity.f31710f <= 0 || connectIQAppDetailsActivity.f31711g <= connectIQAppDetailsActivity.f31709e.getSize()) {
                androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(connectIQAppDetailsActivity.f31707c);
                if (connectIQAppDetailsActivity.f31710f == 0) {
                    aVar.setMessage(R.string.connect_iq_no_slots_available_msg).setTitle(R.string.lbl_not_enough_space);
                } else {
                    aVar.setMessage(R.string.connect_iq_no_space_available_msg).setTitle(R.string.lbl_not_enough_space);
                }
                final int i14 = 0;
                aVar.setNegativeButton(R.string.lbl_close, new DialogInterface.OnClickListener(this) { // from class: com.garmin.android.apps.connectmobile.connectiq.h

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ConnectIQAppDetailsActivity.b f31877b;

                    {
                        this.f31877b = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i15) {
                        switch (i14) {
                            case 0:
                                dialogInterface.dismiss();
                                ConnectIQAppDetailsActivity connectIQAppDetailsActivity2 = ConnectIQAppDetailsActivity.this;
                                connectIQAppDetailsActivity2.f31707c.setResult(0);
                                connectIQAppDetailsActivity2.f31707c.finish();
                                break;
                            default:
                                dialogInterface.dismiss();
                                ConnectIQAppDetailsActivity connectIQAppDetailsActivity3 = ConnectIQAppDetailsActivity.this;
                                Intent intent = new Intent(connectIQAppDetailsActivity3, (Class<?>) ConnectIQStorageManagementActivity.class);
                                intent.putExtra("CONNECT_IQ_DEVICE_UNIT_ID", connectIQAppDetailsActivity3.f31712h);
                                connectIQAppDetailsActivity3.startActivityForResult(intent, 1);
                                break;
                        }
                    }
                });
                final int i15 = 1;
                aVar.setPositiveButton(R.string.connect_iq_category_storage_mgt, new DialogInterface.OnClickListener(this) { // from class: com.garmin.android.apps.connectmobile.connectiq.h

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ConnectIQAppDetailsActivity.b f31877b;

                    {
                        this.f31877b = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i16) {
                        switch (i15) {
                            case 0:
                                dialogInterface.dismiss();
                                ConnectIQAppDetailsActivity connectIQAppDetailsActivity2 = ConnectIQAppDetailsActivity.this;
                                connectIQAppDetailsActivity2.f31707c.setResult(0);
                                connectIQAppDetailsActivity2.f31707c.finish();
                                break;
                            default:
                                dialogInterface.dismiss();
                                ConnectIQAppDetailsActivity connectIQAppDetailsActivity3 = ConnectIQAppDetailsActivity.this;
                                Intent intent = new Intent(connectIQAppDetailsActivity3, (Class<?>) ConnectIQStorageManagementActivity.class);
                                intent.putExtra("CONNECT_IQ_DEVICE_UNIT_ID", connectIQAppDetailsActivity3.f31712h);
                                connectIQAppDetailsActivity3.startActivityForResult(intent, 1);
                                break;
                        }
                    }
                });
                aVar.create().show();
                return;
            }
            long j8 = connectIQAppDetailsActivity.f31712h;
            if (j8 <= 0 || !hk0.p.k(j8)) {
                return;
            }
            long j14 = connectIQAppDetailsActivity.f31712h;
            String str = connectIQAppDetailsActivity.f31709e.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID java.lang.String();
            String name = connectIQAppDetailsActivity.f31709e.getName();
            int internalVersion = connectIQAppDetailsActivity.f31709e.getInternalVersion();
            StringBuilder sbI = sn.a.i(name, StringUtils.SPACE);
            sbI.append(connectIQAppDetailsActivity.getResources().getString(R.string.lbl_installing));
            String string = sbI.toString();
            if (!connectIQAppDetailsActivity.isFinishing()) {
                connectIQAppDetailsActivity.showProgressOverlay(string);
                connectIQAppDetailsActivity.requestProgressOverlayFocus(string);
                connectIQAppDetailsActivity.f31718n.setImportantForAccessibility(4);
            }
            y10.b bVar = connectIQAppDetailsActivity.f31722r;
            Context applicationContext = connectIQAppDetailsActivity.getApplicationContext();
            bVar.getClass();
            applicationContext.getClass();
            str.getClass();
            ge1.b.T(v1.a(bVar), null, null, new y10.c(bVar, applicationContext, j14, str, internalVersion, null), 3);
        }
    }

    public class c implements View.OnClickListener {

        public class a implements b0.h {
            public a() {
            }

            public final void a(String str) {
                StringBuilder sb3 = new StringBuilder("Launch Music App fail for ");
                c cVar = c.this;
                sb3.append(ConnectIQAppDetailsActivity.this.f31709e.getName());
                sb3.append(" Reason: ");
                sb3.append(str);
                i2.d("ConnectIQAppDetailsActivity", sb3.toString());
                ConnectIQAppDetailsActivity connectIQAppDetailsActivity = ConnectIQAppDetailsActivity.this;
                connectIQAppDetailsActivity.hideProgressOverlay();
                connectIQAppDetailsActivity.ea(false, false);
                new androidx.appcompat.app.e.a(connectIQAppDetailsActivity).setTitle(connectIQAppDetailsActivity.getString(R.string.connect_iq_device_is_busy, connectIQAppDetailsActivity.f31720p.getProductDisplayName())).setMessage(R.string.connect_iq_music_setup_try_again).setNegativeButton(R.string.lbl_ok, new ai1.a(this, 12)).setCancelable(false).show();
            }
        }

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            ConnectIQAppDetailsActivity connectIQAppDetailsActivity = ConnectIQAppDetailsActivity.this;
            connectIQAppDetailsActivity.showProgressOverlay();
            int i14 = ConnectIQAppDetailsActivity.C;
            connectIQAppDetailsActivity.ea(false, false);
            b0 b0VarE = b0.e();
            UUID uuidFromString = UUID.fromString(connectIQAppDetailsActivity.f31709e.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID java.lang.String());
            GDIConnectIQInstalledApps.LaunchAppRequest.StartUpMode startUpMode = GDIConnectIQInstalledApps.LaunchAppRequest.StartUpMode.APP_STARTUP_MODE_MEDIA_SYNC_CONFIGURATION;
            a aVar = new a();
            b0VarE.getClass();
            i2.d("ConnectIQRequestManager", "#launchApp " + startUpMode.toString() + ", " + uuidFromString.toString());
            GDIConnectIQInstalledApps.LaunchAppRequest.Builder builderNewBuilder = GDIConnectIQInstalledApps.LaunchAppRequest.newBuilder();
            builderNewBuilder.setAppUuid(ByteString.copyFrom(p0.d(uuidFromString)));
            builderNewBuilder.setAppStartupMode(startUpMode);
            GDIConnectIQInstalledApps.ConnectIQInstalledAppsService.Builder builderNewBuilder2 = GDIConnectIQInstalledApps.ConnectIQInstalledAppsService.newBuilder();
            builderNewBuilder2.setLaunchAppRequest(builderNewBuilder);
            GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
            builderNewBuilder3.setExtension(GDIConnectIQInstalledAppsExtension.connectIqInstalledAppsService, builderNewBuilder2.build());
            ProtobufRequestManager.getInstance().initiateRequest(builderNewBuilder3.build(), b0VarE.f31823a, new h0(b0VarE, aVar, uuidFromString));
        }
    }

    public class d implements View.OnClickListener {

        public class a implements lm2.i.b<bm2.f> {
            public a() {
            }

            @Override // lm2.i.b
            public final void a(bm2.f fVar) {
                bm2.f fVar2 = fVar;
                ConnectIQAppDetailsActivity connectIQAppDetailsActivity = ConnectIQAppDetailsActivity.this;
                int i14 = ConnectIQAppDetailsActivity.C;
                connectIQAppDetailsActivity.ea(true, true);
                if (fVar2 != null) {
                    GCMWiFiNetworksActivity.f43245f.g(connectIQAppDetailsActivity, connectIQAppDetailsActivity.f31712h, connectIQAppDetailsActivity.f31720p.getProductNumber(), connectIQAppDetailsActivity.f31720p.getProductDisplayName(), fVar2.getF143520j());
                }
            }

            @Override // lm2.i.b
            public final void onFailure(Throwable th3) {
            }
        }

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            ConnectIQAppDetailsActivity connectIQAppDetailsActivity = ConnectIQAppDetailsActivity.this;
            connectIQAppDetailsActivity.showProgressOverlay();
            int i14 = ConnectIQAppDetailsActivity.C;
            connectIQAppDetailsActivity.ea(true, false);
            if (connectIQAppDetailsActivity.f31720p != null) {
                lm2.i iVarF = lm2.h.f();
                connectIQAppDetailsActivity.f31720p.getUnitID();
                ((im2.c) iVarF).e(connectIQAppDetailsActivity.f31720p.getProductNumber(), connectIQAppDetailsActivity.f31720p.getApplicationKey(), new a());
            }
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            ConnectIQAppDetailsActivity connectIQAppDetailsActivity = ConnectIQAppDetailsActivity.this;
            long j8 = connectIQAppDetailsActivity.f31712h;
            if (j8 <= 0 || !hk0.p.k(j8)) {
                return;
            }
            int i14 = 0;
            if (!connectIQAppDetailsActivity.f31709e.getDisabled()) {
                new androidx.appcompat.app.e.a(connectIQAppDetailsActivity).setMessage(connectIQAppDetailsActivity.getString(R.string.connect_iq_confirm_uninstall, connectIQAppDetailsActivity.f31709e.getName())).setPositiveButton(R.string.lbl_yes, new ai1.a(this, 13)).setNegativeButton(R.string.lbl_no, new com.garmin.android.apps.connectmobile.connectiq.i(0)).setCancelable(false).show();
                return;
            }
            b0 b0VarE = b0.e();
            i iVar = new i(connectIQAppDetailsActivity, i14);
            UUID uuidFromString = UUID.fromString(connectIQAppDetailsActivity.f31709e.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID java.lang.String());
            int i15 = h.f31738a[connectIQAppDetailsActivity.f31706b.ordinal()];
            if (i15 == 1) {
                int nativeAppSourceId = connectIQAppDetailsActivity.f31709e.getNativeAppSourceId();
                b0VarE.getClass();
                b0VarE.b(nativeAppSourceId, GDIConnectIQInstalledApps.AppType.WATCH_APP, uuidFromString, iVar);
                return;
            }
            if (i15 == 2) {
                int nativeAppSourceId2 = connectIQAppDetailsActivity.f31709e.getNativeAppSourceId();
                b0VarE.getClass();
                b0VarE.b(nativeAppSourceId2, GDIConnectIQInstalledApps.AppType.AUDIO_CONTENT_PROVIDER, uuidFromString, iVar);
                return;
            }
            if (i15 == 3) {
                int nativeAppSourceId3 = connectIQAppDetailsActivity.f31709e.getNativeAppSourceId();
                b0VarE.getClass();
                b0VarE.b(nativeAppSourceId3, GDIConnectIQInstalledApps.AppType.DATA_FIELD, uuidFromString, iVar);
            } else if (i15 == 4) {
                int nativeAppSourceId4 = connectIQAppDetailsActivity.f31709e.getNativeAppSourceId();
                b0VarE.getClass();
                b0VarE.b(nativeAppSourceId4, GDIConnectIQInstalledApps.AppType.WATCH_FACE, uuidFromString, iVar);
            } else {
                if (i15 != 5) {
                    return;
                }
                int nativeAppSourceId5 = connectIQAppDetailsActivity.f31709e.getNativeAppSourceId();
                b0VarE.getClass();
                b0VarE.b(nativeAppSourceId5, GDIConnectIQInstalledApps.AppType.WIDGET, uuidFromString, iVar);
            }
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            ConnectIQAppDetailsActivity connectIQAppDetailsActivity = ConnectIQAppDetailsActivity.this;
            new androidx.appcompat.app.e.a(connectIQAppDetailsActivity).setMessage(connectIQAppDetailsActivity.getString(R.string.connect_iq_confirm_uninstall, connectIQAppDetailsActivity.f31709e.getName())).setPositiveButton(R.string.lbl_yes, new ai1.a(this, 14)).setNegativeButton(R.string.lbl_no, new com.garmin.android.apps.connectmobile.connectiq.i(0)).setCancelable(false).show();
        }
    }

    public class g implements Handler.Callback {
        public g() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(ConnectIQAppDetailsActivity.this.f31707c);
            aVar.setMessage(R.string.connect_iq_it_error).setTitle(R.string.dialog_title_error);
            aVar.setPositiveButton(R.string.lbl_close, new ai1.a(this, 15));
            aVar.create().show();
            return true;
        }
    }

    public static /* synthetic */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f31739b;

        static {
            int[] iArr = new int[y10.g0.values().length];
            f31739b = iArr;
            try {
                iArr[y10.g0.APP_INSTALLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31739b[y10.g0.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[l.values().length];
            f31738a = iArr2;
            try {
                iArr2[l.APPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31738a[l.MUSIC_PROVIDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31738a[l.DATA_FIELDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31738a[l.WATCH_FACES.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31738a[l.WIDGETS.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static void ca(ConnectIQAppDetailsActivity connectIQAppDetailsActivity, UUID uuid) {
        connectIQAppDetailsActivity.getClass();
        GDIConnectIQInstalledApps.AppType appType = GDIConnectIQInstalledApps.AppType.UNKNOWN_APP_TYPE;
        int i14 = h.f31738a[connectIQAppDetailsActivity.f31706b.ordinal()];
        if (i14 == 1) {
            appType = GDIConnectIQInstalledApps.AppType.WATCH_APP;
        } else if (i14 == 2) {
            appType = GDIConnectIQInstalledApps.AppType.AUDIO_CONTENT_PROVIDER;
        } else if (i14 == 3) {
            appType = GDIConnectIQInstalledApps.AppType.DATA_FIELD;
        } else if (i14 == 4) {
            appType = GDIConnectIQInstalledApps.AppType.WATCH_FACE;
        } else if (i14 == 5) {
            appType = GDIConnectIQInstalledApps.AppType.WIDGET;
        }
        b0.e().a(uuid, appType, new j(connectIQAppDetailsActivity, 0));
    }

    @l73.k(threadMode = ThreadMode.MAIN)
    public void ciqOAuthRequestReceived(n10.a aVar) {
        new androidx.appcompat.app.e.a(this.f31707c).setTitle(this.f31707c.getString(R.string.connect_iq_name)).setMessage(String.format(this.f31707c.getString(R.string.connect_iq_sign_in_request), aVar.f122204a.getAppName())).setCancelable(false).setPositiveButton(R.string.txt_sign_in_button, new ag0.d(11, this, aVar)).setNegativeButton(R.string.lbl_cancel, (DialogInterface.OnClickListener) null).show();
    }

    public final void da(SupportedCapability supportedCapability, com.garmin.android.apps.connectmobile.connectiq.g gVar) {
        boolean zI = km2.a.i(this.f31712h, null, supportedCapability.ordinal());
        long j8 = this.f31712h;
        if (!zI) {
            i2.d("ConnectIQAppDetailsActivity", j8 + " does not support capability " + supportedCapability.name());
            hideProgressOverlay();
        }
        i2.d("ConnectIQAppDetailsActivity", j8 + " supports capability " + supportedCapability.name());
        switch (gVar.f31872a) {
            case 0:
                ConnectIQAppDetailsActivity connectIQAppDetailsActivity = gVar.f31873b;
                connectIQAppDetailsActivity.da(SupportedCapability.LAUNCH_REMOTE_CIQ_APP_SUPPORT, new com.garmin.android.apps.connectmobile.connectiq.g(connectIQAppDetailsActivity, 1));
                break;
            default:
                ConnectIQAppDetailsActivity connectIQAppDetailsActivity2 = gVar.f31873b;
                i2.d("ConnectIQAppDetailsActivity", "retrieveStoredWiFiNetworks @" + System.currentTimeMillis());
                y10.b bVar = connectIQAppDetailsActivity2.f31722r;
                long j14 = connectIQAppDetailsActivity2.f31712h;
                bVar.getClass();
                a2 a2Var = a2.DEVICES;
                String strF = androidx.room.a0.f(j14, "retrieveNetworks deviceId[", "]");
                i2.f36769a.getClass();
                i2.a.b(a2Var, "ConnectIQAppDetailsViewModel", strF);
                androidx.lifecycle.y0 y0Var = new androidx.lifecycle.y0();
                ge1.b.T(v1.a(bVar), null, null, new y10.e(j14, y0Var, null), 3);
                y0Var.f(connectIQAppDetailsActivity2, new com.garmin.android.apps.connectmobile.connectiq.f(connectIQAppDetailsActivity2, 1));
                break;
        }
    }

    public final void ea(boolean z14, boolean z15) {
        this.f31717m.setEnabled(z15);
        this.f31717m.setTextAppearance(R.style.PrimaryActionButtonStyle);
        Button button = this.f31717m;
        if (z14) {
            button.setText(R.string.startup_set_up_wi_fi);
            this.f31717m.setOnClickListener(this.f31726x);
            this.f31719o.setText(R.string.connect_iq_setup_wifi_hint);
        } else {
            button.setText(getString(R.string.connect_iq_manage_music, this.f31720p.getProductDisplayName()));
            this.f31717m.setOnClickListener(this.f31725w);
            this.f31719o.setText(getString(R.string.connect_iq_manage_music_hint, this.f31720p.getProductDisplayName(), this.f31709e.getName()));
        }
        this.f31717m.setVisibility(0);
        this.f31719o.setVisibility(0);
        this.f31715k.setTextAppearance(R.style.SecondaryActionButtonStyle);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i14 == 0) {
            if (i15 == 999) {
                this.f31707c.setResult(999);
                this.f31707c.finish();
                return;
            }
            return;
        }
        if (i14 == 1) {
            this.f31707c.setResult(-1);
            this.f31707c.finish();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        this.f31707c.setResult(0);
        this.f31707c.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        l lVar;
        this.f31707c = this;
        super.onCreate(bundle);
        setContentView(R.layout.gcm_connect_iq_app_details);
        this.f31705a = new Handler(this.A);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f31709e = (o10.b) extras.getParcelable("CONNECT_IQ_APP");
            this.f31711g = extras.getLong("SPACE_AVAIL");
            this.f31710f = extras.getLong("SLOTS_AVAIL");
            this.f31714j = extras.getString("DEVICE_MAC_ADDRESS");
            long j8 = extras.getLong("CONNECT_IQ_DEVICE_UNIT_ID", -1L);
            this.f31712h = j8;
            if (j8 < 1 || TextUtils.isEmpty(this.f31714j)) {
                i2.i("ConnectIQAppDetailsActivity", "Invalid unit id or mac address. Finishing activity.");
                finish();
                return;
            }
            this.f31713i = extras.getString("CONNECT_IQ_DEVICE_SKU");
        }
        y10.b bVar = (y10.b) new x1(this).b(p005kotlin.jvm.internal.s0.f105811a.b(y10.b.class));
        this.f31722r = bVar;
        if (bVar.f193778b == null) {
            bVar.f193778b = new androidx.lifecycle.y0<>();
        }
        androidx.lifecycle.y0<y10.l0> y0Var = bVar.f193778b;
        if (y0Var == null) {
            p005kotlin.jvm.internal.s.m("connectIQLiveData");
            throw null;
        }
        y0Var.f(this, new com.garmin.android.apps.connectmobile.connectiq.f(this, 0));
        b0.e().f31823a = this.f31712h;
        rd2.j jVar = rd2.f.a().f152045a;
        long j14 = this.f31712h;
        jVar.getClass();
        this.f31720p = rd2.j.i(j14, null);
        String str = this.f31709e.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String();
        l[] lVarArrValues = l.values();
        int length = lVarArrValues.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                lVar = l.UNKNOWN;
                break;
            }
            lVar = lVarArrValues[i14];
            if (lVar.f31894a.equals(str)) {
                break;
            } else {
                i14++;
            }
        }
        this.f31706b = lVar;
        super.initActionBar(true, getString(lVar.f31895b));
        i.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.s(true);
        }
        ImageView imageView = (ImageView) findViewById(R.id.icon);
        zp0.c cVar = new zp0.c((androidx.fragment.app.m) this);
        cVar.f206565e = this.f31709e.getIconUrl();
        cVar.f206570j = 2131232266;
        cVar.h(imageView);
        this.f31718n = findViewById(R.id.scroll_container);
        TextView textView = (TextView) findViewById(R.id.name);
        TextView textView2 = (TextView) findViewById(R.id.version);
        TextView textView3 = (TextView) findViewById(R.id.developer);
        this.f31719o = (TextView) findViewById(R.id.music_sync_hint);
        this.f31715k = (Button) findViewById(R.id.install);
        this.f31716l = (Button) findViewById(R.id.update);
        this.f31717m = (Button) findViewById(R.id.music_sync);
        Button button = (Button) findViewById(R.id.view_in_app_store);
        a aVar = this.f31723t;
        button.setOnClickListener(aVar);
        if (this.f31709e.getHasSettings() && this.f31709e.getInstalled()) {
            Button button2 = (Button) findViewById(R.id.settings);
            button2.setVisibility(0);
            button2.setOnClickListener(new a32.b(this, 27));
        }
        textView.setText(this.f31709e.getName());
        String developerName = this.f31709e.getDeveloperName();
        if (developerName.isEmpty()) {
            int nativeAppSourceId = this.f31709e.getNativeAppSourceId();
            Parcelable.Creator<com.garmin.android.apps.connectmobile.connectiq.e> creator = com.garmin.android.apps.connectmobile.connectiq.e.CREATOR;
            if (nativeAppSourceId != -1 && this.f31709e.getNativeAppSourceId() != 0) {
                textView3.setText(String.format(getResources().getString(R.string.connect_iq_by), getResources().getString(R.string.garmin_name)));
            }
        } else {
            textView3.setText(String.format(getResources().getString(R.string.connect_iq_by), developerName));
        }
        textView2.setText(this.f31709e.getUpdateAvailable() ? getString(R.string.msg_garmin_device_software_update_available) : this.f31709e.getVersionName());
        boolean updateAvailable = this.f31709e.getUpdateAvailable();
        b bVar2 = this.f31724v;
        if (updateAvailable) {
            textView2.setTextColor(getColor(android.R.color.holo_red_dark));
            this.f31716l.setVisibility(0);
            boolean permissionsChanged = this.f31709e.getPermissionsChanged();
            Button button3 = this.f31716l;
            if (permissionsChanged) {
                button3.setOnClickListener(aVar);
            } else {
                button3.setOnClickListener(bVar2);
            }
            this.f31715k.setTextAppearance(R.style.SecondaryActionButtonStyle);
        } else {
            this.f31715k.setTextAppearance(R.style.PrimaryActionButtonStyle);
        }
        boolean installed = this.f31709e.getInstalled();
        e eVar = this.f31727y;
        if (installed) {
            boolean zEqualsIgnoreCase = "7cd38736-510a-4480-8801-0dfe2f5944af".equalsIgnoreCase(this.f31709e.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID java.lang.String());
            this.f31715k.setVisibility(zEqualsIgnoreCase ? 8 : 0);
            this.f31715k.setEnabled(!zEqualsIgnoreCase);
            this.f31715k.setText(R.string.lbl_uninstall);
            int nativeAppSourceId2 = this.f31709e.getNativeAppSourceId();
            Parcelable.Creator<com.garmin.android.apps.connectmobile.connectiq.e> creator2 = com.garmin.android.apps.connectmobile.connectiq.e.CREATOR;
            if (nativeAppSourceId2 == 0 || this.f31709e.getNativeAppSourceId() == -1) {
                this.f31715k.setOnClickListener(this.f31728z);
            } else {
                Button button4 = this.f31715k;
                if (zEqualsIgnoreCase) {
                    button4.setOnClickListener(null);
                } else {
                    button4.setOnClickListener(eVar);
                }
            }
        } else {
            this.f31715k.setText(R.string.lbl_install);
            int nativeAppSourceId3 = this.f31709e.getNativeAppSourceId();
            Parcelable.Creator<com.garmin.android.apps.connectmobile.connectiq.e> creator3 = com.garmin.android.apps.connectmobile.connectiq.e.CREATOR;
            Button button5 = this.f31715k;
            if (nativeAppSourceId3 == -1) {
                button5.setOnClickListener(bVar2);
            } else {
                button5.setOnClickListener(eVar);
            }
        }
        if (this.f31709e.getNativeAppSourceId() != -1) {
            button.setVisibility(8);
        }
        TextView textView4 = (TextView) findViewById(R.id.deviceFirmwareUpdateNeededLabel);
        DeviceProfile deviceProfileB = hk0.p.b(this.f31712h);
        if (deviceProfileB == null || this.f31709e.getMinFirmwareVersion() == null || deviceProfileB.getF92745i() >= this.f31709e.getMinFirmwareVersion().longValue()) {
            textView4.setVisibility(8);
            this.f31715k.setEnabled(true);
            this.f31715k.setTextAppearance(R.style.PrimaryActionButtonStyle);
            this.f31716l.setEnabled(true);
            this.f31716l.setTextAppearance(R.style.PrimaryActionButtonStyle);
            return;
        }
        textView4.setText(getString(R.string.toy_store_minimum_firmware_message, deviceProfileB.getDeviceFullName()));
        textView4.setVisibility(0);
        this.f31715k.setEnabled(false);
        this.f31715k.setTextAppearance(R.style.SecondaryActionButtonStyle);
        this.f31716l.setEnabled(false);
        this.f31716l.setTextAppearance(R.style.SecondaryActionButtonStyle);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        this.f31707c.setResult(0);
        return super.onNavigateUp();
    }

    @Override // com.garmin.android.apps.connectmobile.c, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (this.f31708d) {
            n nVar = this.B;
            nVar.getClass();
            da2.d.b().f58886a.i(nVar);
            this.f31708d = false;
        }
        oi2.a.f132270a.getClass();
        oi2.a.C2513a.c(this);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!this.f31708d) {
            this.B.a(this.f31707c, this.f31712h);
            this.f31708d = true;
        }
        if (this.f31706b == l.MUSIC_PROVIDER && this.f31709e.getInstalled()) {
            showProgressOverlay();
            da(SupportedCapability.WIFI_SETUP, new com.garmin.android.apps.connectmobile.connectiq.g(this, 0));
        }
        oi2.a.f132270a.getClass();
        oi2.a.C2513a.b(this);
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (!isFinishing()) {
            hideProgressOverlay();
            this.f31718n.setImportantForAccessibility(1);
        }
        com.garmin.android.library.backgroundtaskmanagement.c cVar = com.garmin.android.library.backgroundtaskmanagement.c.f50123c;
        ArrayList arrayList = this.f31721q;
        cVar.c(arrayList);
        arrayList.clear();
    }

    public class i implements b0.f {
        private i() {
        }

        @Override // com.garmin.android.apps.connectmobile.connectiq.b0.f
        public final void a() {
            ConnectIQAppDetailsActivity connectIQAppDetailsActivity = ConnectIQAppDetailsActivity.this;
            ConnectIQAppDetailsActivity connectIQAppDetailsActivity2 = connectIQAppDetailsActivity.f31707c;
            if (connectIQAppDetailsActivity2 == null || connectIQAppDetailsActivity2.isFinishing()) {
                return;
            }
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(connectIQAppDetailsActivity.f31707c);
            aVar.setMessage(R.string.connect_iq_installation_failed_title).setTitle(R.string.dialog_title_error);
            aVar.setPositiveButton(R.string.lbl_close, new ai1.a(this, 16));
            aVar.create().show();
        }

        @Override // com.garmin.android.apps.connectmobile.connectiq.b0.f
        public final void b() {
            ConnectIQAppDetailsActivity connectIQAppDetailsActivity = ConnectIQAppDetailsActivity.this;
            connectIQAppDetailsActivity.f31707c.setResult(-1);
            connectIQAppDetailsActivity.f31707c.finish();
        }

        public /* synthetic */ i(ConnectIQAppDetailsActivity connectIQAppDetailsActivity, int i14) {
            this();
        }
    }

    public class j implements b0.e {
        private j() {
        }

        @Override // com.garmin.android.apps.connectmobile.connectiq.b0.e
        public final void a() {
            ConnectIQAppDetailsActivity connectIQAppDetailsActivity = ConnectIQAppDetailsActivity.this;
            ConnectIQAppDetailsActivity connectIQAppDetailsActivity2 = connectIQAppDetailsActivity.f31707c;
            if (connectIQAppDetailsActivity2 == null || connectIQAppDetailsActivity2.isFinishing()) {
                return;
            }
            connectIQAppDetailsActivity.f31707c.setResult(-1);
            connectIQAppDetailsActivity.f31707c.finish();
        }

        @Override // com.garmin.android.apps.connectmobile.connectiq.b0.e
        public final void b() {
            ConnectIQAppDetailsActivity connectIQAppDetailsActivity = ConnectIQAppDetailsActivity.this;
            ConnectIQAppDetailsActivity connectIQAppDetailsActivity2 = connectIQAppDetailsActivity.f31707c;
            if (connectIQAppDetailsActivity2 == null || connectIQAppDetailsActivity2.isFinishing()) {
                return;
            }
            androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(connectIQAppDetailsActivity.f31707c);
            String string = connectIQAppDetailsActivity.getString(R.string.connect_iq_delete_error);
            String str = connectIQAppDetailsActivity.f31709e.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String();
            for (l lVar : l.values()) {
                if (lVar.f31894a.equals(str)) {
                    connectIQAppDetailsActivity.f31706b = lVar;
                    aVar.setMessage(String.format(string, connectIQAppDetailsActivity.getString(lVar.f31895b).toLowerCase(Locale.getDefault()))).setTitle(R.string.dialog_title_error);
                    aVar.setPositiveButton(R.string.lbl_close, new ai1.a(this, 17));
                    aVar.create().show();
                }
            }
            lVar = l.UNKNOWN;
            connectIQAppDetailsActivity.f31706b = lVar;
            aVar.setMessage(String.format(string, connectIQAppDetailsActivity.getString(lVar.f31895b).toLowerCase(Locale.getDefault()))).setTitle(R.string.dialog_title_error);
            aVar.setPositiveButton(R.string.lbl_close, new ai1.a(this, 17));
            aVar.create().show();
        }

        public /* synthetic */ j(ConnectIQAppDetailsActivity connectIQAppDetailsActivity, int i14) {
            this();
        }
    }
}
