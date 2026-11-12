package com.garmin.android.apps.connectmobile.settings.devices.wifi;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.v;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import di1.a0;
import ng1.t;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/GCMWiFiNetworksActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GCMWiFiNetworksActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f43245f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f43246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Group f43247b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f43249d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f43248c = o13.m.a(o13.n.NONE, new d(this, null, null, new cq0.g(this, 18)));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f43250e = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/settings/devices/wifi/GCMWiFiNetworksActivity$b", "Lla2/a;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements la2.a {
        public b() {
        }

        @Override // la2.a
        public final void onDeviceConnected(la2.b bVar) {
            long f172494b = bVar.f111632a.getF92746j();
            a aVar = GCMWiFiNetworksActivity.f43245f;
            GCMWiFiNetworksActivity gCMWiFiNetworksActivity = GCMWiFiNetworksActivity.this;
            if (f172494b == gCMWiFiNetworksActivity.ca()) {
                gCMWiFiNetworksActivity.runOnUiThread(new di1.g(gCMWiFiNetworksActivity, 0));
            }
        }

        @Override // la2.a
        public final void onDeviceConnectingFailure(la2.c cVar) {
        }

        @Override // la2.a
        public final void onDeviceDisconnected(la2.h hVar) {
            long f172494b = hVar.f111673a.getF92746j();
            a aVar = GCMWiFiNetworksActivity.f43245f;
            GCMWiFiNetworksActivity gCMWiFiNetworksActivity = GCMWiFiNetworksActivity.this;
            if (f172494b == gCMWiFiNetworksActivity.ca()) {
                gCMWiFiNetworksActivity.runOnUiThread(new di1.g(gCMWiFiNetworksActivity, 1));
            }
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f43252a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f43252a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f43252a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f43252a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<hd0.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f43253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f43254b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f43255c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f43256d;

        public d(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f43253a = gVar;
            this.f43254b = qualifier;
            this.f43255c = aVar;
            this.f43256d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, hd0.b] */
        @Override // e23.a
        public final hd0.b invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f43253a;
            y1 viewModelStore = gVar.getViewModelStore();
            e23.a aVar = this.f43255c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(hd0.b.class), viewModelStore, null, defaultViewModelCreationExtras, this.f43254b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f43256d, 4, null);
        }
    }

    public final long ca() {
        return getIntent().getLongExtra("GCM_deviceUnitID", 0L);
    }

    public final void da() {
        View view2 = this.f43246a;
        if (view2 == null) {
            s.m("networksScreenContent");
            throw null;
        }
        view2.setVisibility(0);
        Group group = this.f43247b;
        if (group != null) {
            group.setVisibility(8);
        } else {
            s.m("networksScreenLoading");
            throw null;
        }
    }

    public final void ea() {
        String stringExtra = getIntent().getStringExtra("GCM_deviceProductNbr");
        f43245f.getClass();
        if (!a.f(stringExtra)) {
            new androidx.appcompat.app.e.a(this).setMessage(getString(R.string.wifi_connection_lost_msg)).setPositiveButton(getString(R.string.lbl_dismiss), new ai1.a(this, 24)).setCancelable(false).show();
            return;
        }
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
        t.a aVar = t.f126008c;
        long jCa = ca();
        String stringExtra2 = getIntent().getStringExtra("GCM_deviceProductNbr");
        aVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putLong("GCM_deviceUnitID", jCa);
        bundle.putString("GCM_deviceProductNbr", stringExtra2);
        t tVar = new t();
        tVar.setArguments(bundle);
        aVarB.l(R.id.networks_screen_content, tVar, null);
        aVarB.e();
    }

    public final void fa() {
        View view2 = this.f43246a;
        if (view2 == null) {
            s.m("networksScreenContent");
            throw null;
        }
        view2.setVisibility(8);
        Group group = this.f43247b;
        if (group != null) {
            group.setVisibility(0);
        } else {
            s.m("networksScreenLoading");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final void ga() {
        fa();
        ((hd0.b) this.f43248c.getValue()).y4();
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.l(R.id.networks_screen_content, new a0(), null);
        aVar.e();
    }

    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, o13.l] */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.wifi_networks_screen);
        initActionBar(true, R.string.smart_scale_device_settings_wifi_networks);
        this.f43249d = getIntent().getBooleanExtra("EXTRA_CLOSE_WHEN_WIFI_STORED", false);
        View viewFindViewById = findViewById(R.id.networks_screen_content);
        viewFindViewById.getClass();
        this.f43246a = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.networks_screen_loading);
        viewFindViewById2.getClass();
        this.f43247b = (Group) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.networks_loading_image);
        viewFindViewById3.getClass();
        ImageView imageView = (ImageView) viewFindViewById3;
        zp0.c cVar = new zp0.c((androidx.fragment.app.m) this);
        String stringExtra = getIntent().getStringExtra("GCM_extra_device_image_url");
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (stringExtra.length() > 0) {
            cVar.f206565e = stringExtra;
        } else {
            cVar.f206567g = getIntent().getIntExtra("GCM_deviceImage", 2131231969);
        }
        cVar.f206570j = 2131231969;
        cVar.f206571k = 2131231969;
        cVar.h(imageView);
        View viewFindViewById4 = findViewById(R.id.networks_loading_text);
        viewFindViewById4.getClass();
        TextView textView = (TextView) viewFindViewById4;
        String stringExtra2 = getIntent().getStringExtra("GCM_deviceName");
        if (stringExtra2 == null) {
            stringExtra2 = getString(R.string.lbl_device);
            stringExtra2.getClass();
        }
        textView.setText(getString(R.string.wifi_waiting_on_device, stringExtra2));
        ((hd0.b) this.f43248c.getValue()).f83309b.f(this, new c(new com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.l(this, 21)));
        long jCa = ca();
        f43245f.getClass();
        if (a.e(jCa)) {
            ga();
        } else {
            ea();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        super.onStart();
        da2.d.b().f58886a.b(this.f43250e);
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        da2.d.b().f58886a.i(this.f43250e);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/GCMWiFiNetworksActivity$a;", "", "<init>", "()V", "", "EXTRA_CLOSE_WHEN_WIFI_STORED", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, long j8, String str, String str2, int i14) {
            Intent intentD = sn.a.d(context, context, GCMWiFiNetworksActivity.class);
            intentD.putExtra("GCM_deviceUnitID", j8);
            intentD.putExtra("GCM_deviceProductNbr", str);
            intentD.putExtra("GCM_deviceName", str2);
            intentD.putExtra("GCM_deviceImage", i14);
            return intentD;
        }

        public static Intent b(Context context, long j8, String str, String str2, String str3, boolean z14) {
            Intent intentD = sn.a.d(context, context, GCMWiFiNetworksActivity.class);
            intentD.putExtra("GCM_deviceUnitID", j8);
            intentD.putExtra("GCM_deviceProductNbr", str);
            intentD.putExtra("GCM_deviceName", str2);
            intentD.putExtra("GCM_extra_device_image_url", str3);
            intentD.putExtra("EXTRA_CLOSE_WHEN_WIFI_STORED", z14);
            return intentD;
        }

        public static void c(a aVar, Context context) {
            aVar.getClass();
            Context contextD = d(context);
            if (contextD == null) {
                contextD = context;
            }
            new androidx.appcompat.app.e.a(contextD).setMessage(context.getString(R.string.wifi_no_connection_error_msg)).setPositiveButton(context.getString(R.string.lbl_dismiss), new com.garmin.android.apps.connectmobile.connectiq.i(10)).setCancelable(false).show();
        }

        public static Activity d(Context context) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            baseContext.getClass();
            return d(baseContext);
        }

        public static boolean e(long j8) {
            return !(da2.d.b().f58886a.f111646e.a(j8).length == 0);
        }

        public static boolean f(String str) {
            return u0.n(str, u0.P5, u0.S5);
        }

        public final void g(Context context, long j8, String str, String str2, String str3) {
            context.getClass();
            if (e(j8) || f(str)) {
                context.startActivity(b(context, j8, str, str2, str3, false));
            } else {
                c(this, context);
            }
        }

        public final void h(Activity activity, int i14, long j8, String str, String str2, String str3, boolean z14) {
            activity.getClass();
            if (e(j8) || f(str)) {
                activity.startActivityForResult(b(activity, j8, str, str2, str3, z14), i14);
            } else {
                c(this, activity);
            }
        }

        public final void i(Context context, long j8, String str, int i14) {
            context.getClass();
            if (!e(j8) && !f(null)) {
                c(this, context);
                return;
            }
            Intent intentA = a(context, j8, null, str, i14);
            intentA.addFlags(268468224);
            context.startActivity(intentA);
        }

        private a() {
        }
    }
}
