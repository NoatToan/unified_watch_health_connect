package com.garmin.android.apps.connectmobile.settings.devices.music;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.e;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import as2.d;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connectiq.ConnectIQDownloadListActivity;
import com.garmin.android.apps.connectmobile.settings.devices.music.MusicSetupActivity;
import com.garmin.android.apps.connectmobile.settings.devices.wifi.GCMWiFiNetworksActivity;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import e23.l;
import o13.h;
import o13.m;
import o13.n;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import rd2.j;
import sd2.f;
import ty1.f1;
import yc.l2;
import zb0.t;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/music/MusicSetupActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MusicSetupActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f43129f = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f43131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f43132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f43133d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f43130a = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f43134e = m.a(n.NONE, new c(this, null, null, new f1(this, 12)));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f43135a;

        public b(l lVar) {
            lVar.getClass();
            this.f43135a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f43135a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f43135a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<hd0.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f43136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f43137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f43138c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f43139d;

        public c(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f43136a = gVar;
            this.f43137b = qualifier;
            this.f43138c = aVar;
            this.f43139d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, hd0.b] */
        @Override // e23.a
        public final hd0.b invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f43136a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f43138c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(hd0.b.class), viewModelStore, null, defaultViewModelCreationExtras, this.f43137b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f43139d, 4, null);
        }
    }

    public static final void ea(Activity activity, long j8, String str) {
        f43129f.getClass();
        if (activity != null) {
            if (((l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null)).a(j8)) {
                activity.startActivity(a.a(activity, j8, str));
                return;
            }
            e.a aVar = new e.a(activity);
            aVar.setTitle(R.string.connect_iq_device_not_connected_title);
            aVar.setMessage(R.string.connect_iq_device_not_connected_msg);
            aVar.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
            aVar.create().show();
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, o13.l] */
    public final void ca(boolean z14) {
        if (((l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null)).a(this.f43130a)) {
            showProgressOverlay();
            ((hd0.b) this.f43134e.getValue()).y4().f(this, new b(new d(this, z14, 16)));
            return;
        }
        e.a aVar = new e.a(this);
        aVar.setTitle(R.string.connect_iq_device_not_connected_title);
        aVar.setMessage(R.string.connect_iq_device_not_connected_msg);
        aVar.setPositiveButton(R.string.lbl_ok, (DialogInterface.OnClickListener) null);
        aVar.create().show();
        da();
    }

    public final void da() {
        View view2 = this.f43132c;
        if (view2 == null) {
            s.m("layoutWifiNeeded");
            throw null;
        }
        view2.setVisibility(0);
        initActionBar(true, R.string.wifi_setup_needed);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i14 != 10 || i15 != -1) {
            if (i14 == 11) {
                ca(false);
            }
        } else {
            ConnectIQDownloadListActivity.a aVar = ConnectIQDownloadListActivity.f31779o;
            long j8 = this.f43130a;
            com.garmin.android.apps.connectmobile.connectiq.l lVar = com.garmin.android.apps.connectmobile.connectiq.l.MUSIC_PROVIDER;
            aVar.getClass();
            ConnectIQDownloadListActivity.a.a(this, j8, lVar);
            finish();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.music_setup_activity);
        initActionBar(true, R.string.device_screen_music);
        this.f43130a = getIntent().getLongExtra("GCM_deviceUnitID", -1L);
        String stringExtra = getIntent().getStringExtra("GCM_deviceName");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f43131b = stringExtra;
        j jVar = rd2.f.a().f152045a;
        long j8 = this.f43130a;
        jVar.getClass();
        this.f43133d = j.i(j8, null);
        View viewFindViewById = findViewById(R.id.layout_wifi_needed);
        viewFindViewById.getClass();
        this.f43132c = viewFindViewById;
        final int i14 = 0;
        ((Button) findViewById(R.id.setup_wifi_button)).setOnClickListener(new View.OnClickListener(this) { // from class: uh1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MusicSetupActivity f171138b;

            {
                this.f171138b = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        MusicSetupActivity.a aVar = MusicSetupActivity.f43129f;
                        GCMWiFiNetworksActivity.a aVar2 = GCMWiFiNetworksActivity.f43245f;
                        MusicSetupActivity musicSetupActivity = this.f171138b;
                        long j14 = musicSetupActivity.f43130a;
                        f fVar = musicSetupActivity.f43133d;
                        String productNumber = fVar != null ? fVar.getProductNumber() : null;
                        String str = musicSetupActivity.f43131b;
                        if (str == null) {
                            s.m("deviceName");
                            throw null;
                        }
                        f fVar2 = musicSetupActivity.f43133d;
                        aVar2.h(musicSetupActivity, 10, j14, productNumber, str, fVar2 != null ? t.d(fVar2) : null, true);
                        return;
                    default:
                        MusicSetupActivity.a aVar3 = MusicSetupActivity.f43129f;
                        ConnectIQDownloadListActivity.a aVar4 = ConnectIQDownloadListActivity.f31779o;
                        MusicSetupActivity musicSetupActivity2 = this.f171138b;
                        long j15 = musicSetupActivity2.f43130a;
                        com.garmin.android.apps.connectmobile.connectiq.l lVar = com.garmin.android.apps.connectmobile.connectiq.l.MUSIC_PROVIDER;
                        aVar4.getClass();
                        lVar.getClass();
                        Intent intent = new Intent(musicSetupActivity2, (Class<?>) ConnectIQDownloadListActivity.class);
                        intent.putExtra("CONNECT_IQ_CATEGORY", lVar);
                        intent.putExtra("CONNECT_IQ_DEVICE_UNIT_ID", j15);
                        musicSetupActivity2.startActivityForResult(intent, 11);
                        return;
                }
            }
        });
        final int i15 = 1;
        ((Button) findViewById(R.id.setup_music_button)).setOnClickListener(new View.OnClickListener(this) { // from class: uh1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MusicSetupActivity f171138b;

            {
                this.f171138b = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        MusicSetupActivity.a aVar = MusicSetupActivity.f43129f;
                        GCMWiFiNetworksActivity.a aVar2 = GCMWiFiNetworksActivity.f43245f;
                        MusicSetupActivity musicSetupActivity = this.f171138b;
                        long j14 = musicSetupActivity.f43130a;
                        f fVar = musicSetupActivity.f43133d;
                        String productNumber = fVar != null ? fVar.getProductNumber() : null;
                        String str = musicSetupActivity.f43131b;
                        if (str == null) {
                            s.m("deviceName");
                            throw null;
                        }
                        f fVar2 = musicSetupActivity.f43133d;
                        aVar2.h(musicSetupActivity, 10, j14, productNumber, str, fVar2 != null ? t.d(fVar2) : null, true);
                        return;
                    default:
                        MusicSetupActivity.a aVar3 = MusicSetupActivity.f43129f;
                        ConnectIQDownloadListActivity.a aVar4 = ConnectIQDownloadListActivity.f31779o;
                        MusicSetupActivity musicSetupActivity2 = this.f171138b;
                        long j15 = musicSetupActivity2.f43130a;
                        com.garmin.android.apps.connectmobile.connectiq.l lVar = com.garmin.android.apps.connectmobile.connectiq.l.MUSIC_PROVIDER;
                        aVar4.getClass();
                        lVar.getClass();
                        Intent intent = new Intent(musicSetupActivity2, (Class<?>) ConnectIQDownloadListActivity.class);
                        intent.putExtra("CONNECT_IQ_CATEGORY", lVar);
                        intent.putExtra("CONNECT_IQ_DEVICE_UNIT_ID", j15);
                        musicSetupActivity2.startActivityForResult(intent, 11);
                        return;
                }
            }
        });
        View view2 = this.f43132c;
        if (view2 == null) {
            s.m("layoutWifiNeeded");
            throw null;
        }
        view2.setVisibility(8);
        if (!km2.a.i(this.f43130a, null, SupportedCapability.LTE_SUPPORT.ordinal())) {
            ca(true);
            return;
        }
        ConnectIQDownloadListActivity.a aVar = ConnectIQDownloadListActivity.f31779o;
        long j14 = this.f43130a;
        com.garmin.android.apps.connectmobile.connectiq.l lVar = com.garmin.android.apps.connectmobile.connectiq.l.MUSIC_PROVIDER;
        aVar.getClass();
        ConnectIQDownloadListActivity.a.a(this, j14, lVar);
        finish();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/music/MusicSetupActivity$a;", "", "<init>", "()V", "", "SETUP_WIFI_REQUEST_CODE", "I", "SETUP_CONNECTIQ_MUSIC_REQUEST_CODE", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, long j8, String str) {
            Intent intentD = l2.d(context, MusicSetupActivity.class, "GCM_deviceUnitID", j8);
            intentD.putExtra("GCM_deviceName", str);
            return intentD;
        }

        private a() {
        }
    }
}
