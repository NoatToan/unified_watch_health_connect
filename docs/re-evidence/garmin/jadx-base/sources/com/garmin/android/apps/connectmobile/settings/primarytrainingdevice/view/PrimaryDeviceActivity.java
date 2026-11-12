package com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.view;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.view.PrimaryDeviceActivity;
import e23.l;
import gj1.f;
import gj1.i;
import ij1.g;
import java.util.Iterator;
import java.util.List;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.j0;
import z10.p3;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/primarytrainingdevice/view/PrimaryDeviceActivity;", "Lz10/p3;", "Lry1/a;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PrimaryDeviceActivity extends p3 implements ry1.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f43662f = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w1 f43663c = new w1(s0.f105811a.b(g.class), new d(this), new c(this), new e(null, this));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.view.a f43664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MenuItem f43665e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f43666a;

        public b(l lVar) {
            lVar.getClass();
            this.f43666a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f43666a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f43666a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f43667a;

        public c(b.g gVar) {
            this.f43667a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f43667a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f43668a;

        public d(b.g gVar) {
            this.f43668a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f43668a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f43669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f43670b;

        public e(e23.a aVar, b.g gVar) {
            this.f43669a = aVar;
            this.f43670b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f43669a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f43670b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public PrimaryDeviceActivity() {
        com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.view.a.f43671l.getClass();
        this.f43664d = new com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.view.a();
    }

    @Override // z10.p3
    public final Fragment ca() {
        return this.f43664d;
    }

    @Override // z10.p3
    public final String da() {
        String string = getString(R.string.primary_wearable);
        string.getClass();
        return string;
    }

    @Override // ry1.a
    public final void g(int i14, String str) {
        updateActionBar(str, 2);
    }

    @Override // z10.p3
    public final boolean ia() {
        return true;
    }

    public final g ka() {
        return (g) this.f43663c.getValue();
    }

    public final void la() {
        List<gj1.a> listF;
        boolean z14;
        boolean z15;
        f fVar;
        gj1.g trainingStatusOnlyDevices;
        List<gj1.b> listB;
        i wearableDevices;
        List<gj1.b> listB2;
        g3<f> g3VarD = ka().y4().d();
        f fVar2 = g3VarD != null ? g3VarD.f35301b : null;
        if (fVar2 == null || (listF = fVar2.f()) == null) {
            listF = j0.f134944a;
        }
        if (listF != null && listF.isEmpty()) {
            z14 = false;
            break;
        }
        Iterator<T> it = listF.iterator();
        while (true) {
            if (!it.hasNext()) {
                z14 = false;
                break;
            }
            gj1.a aVar = (gj1.a) it.next();
            if (gl.b.G(aVar) && s.g(aVar.getPrimaryTrainingCapable(), Boolean.TRUE)) {
                z14 = true;
                break;
            }
        }
        g3<f> g3VarD2 = ka().y4().d();
        f fVar3 = g3VarD2 != null ? g3VarD2.f35301b : null;
        if (fVar3 != null && (wearableDevices = fVar3.getWearableDevices()) != null && (listB2 = wearableDevices.b()) != null && !listB2.isEmpty()) {
            Iterator<T> it3 = listB2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z15 = false;
                    break;
                } else if (s.g(((gj1.b) it3.next()).getLhaBackupCapable(), Boolean.FALSE)) {
                    z15 = true;
                    break;
                }
            }
        } else {
            z15 = false;
            break;
        }
        g3<f> g3VarD3 = ka().y4().d();
        boolean z16 = (g3VarD3 == null || (fVar = g3VarD3.f35301b) == null || (trainingStatusOnlyDevices = fVar.getTrainingStatusOnlyDevices()) == null || (listB = trainingStatusOnlyDevices.b()) == null || !(listB.isEmpty() ^ true)) ? false : true;
        Bundle bundle = new Bundle();
        bundle.putInt("GCM_extra_primary_device_ui_state", ka().f93835b.ordinal());
        bundle.putBoolean("GCM_extra_primary_device_has_pw_ptd", z14);
        bundle.putBoolean("GCM_extra_primary_device_has_partial_comptible", z15);
        bundle.putBoolean("GCM_extra_primary_device_has_incomptible", z16);
        HelpActivity.a.e(HelpActivity.f36653a, this, ro0.l.PRIMARY_TRAINING_DEVICE, null, bundle, 4);
    }

    @Override // z10.p3, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        l2.a aVar = l2.f37135b;
        Intent intent = getIntent();
        aVar.getClass();
        Bundle bundleA = l2.a.a(intent);
        boolean z14 = bundleA != null ? bundleA.getBoolean("extras_is_navigating_from_primary_wearable") : false;
        if (bundleA != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) bundleA.getParcelable("extras_register_device_dto", f.class);
            } else {
                Parcelable parcelable2 = bundleA.getParcelable("extras_register_device_dto");
                if (!(parcelable2 instanceof f)) {
                    parcelable2 = null;
                }
                parcelable = (f) parcelable2;
            }
            f fVar = (f) parcelable;
            if (fVar != null) {
                y0<g3<f>> y0VarY4 = ka().y4();
                g3.f35298f.getClass();
                y0VarY4.m(g3.a.d(fVar));
            }
        }
        g gVarKa = ka();
        ej1.b bVar = z14 ? ej1.b.WEARABLE_DEVICE : ej1.b.TRAINING_DEVICE;
        bVar.getClass();
        gVarKa.f93835b = bVar;
        final int i14 = 0;
        ka().f93845l.f(this, new b(new l(this) { // from class: ij1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PrimaryDeviceActivity f93820b;

            {
                this.f93820b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i15 = i14;
                PrimaryDeviceActivity primaryDeviceActivity = this.f93820b;
                switch (i15) {
                    case 0:
                        String str = (String) obj;
                        PrimaryDeviceActivity.a aVar2 = PrimaryDeviceActivity.f43662f;
                        if (s.g(str, "PrimaryDeviceFragment")) {
                            v supportFragmentManager = primaryDeviceActivity.getSupportFragmentManager();
                            androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
                            com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.view.a.f43671l.getClass();
                            aVarB.l(R.id.content_frame, new com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.view.a(), str);
                            aVarB.e();
                        }
                        break;
                    default:
                        Boolean bool = (Boolean) obj;
                        PrimaryDeviceActivity.a aVar3 = PrimaryDeviceActivity.f43662f;
                        if (bool != null) {
                            boolean zBooleanValue = bool.booleanValue();
                            MenuItem menuItem = primaryDeviceActivity.f43665e;
                            if (menuItem != null) {
                                menuItem.setVisible(zBooleanValue);
                            }
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        final int i15 = 1;
        ka().f93844k.f(this, new b(new l(this) { // from class: ij1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PrimaryDeviceActivity f93820b;

            {
                this.f93820b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i15;
                PrimaryDeviceActivity primaryDeviceActivity = this.f93820b;
                switch (i16) {
                    case 0:
                        String str = (String) obj;
                        PrimaryDeviceActivity.a aVar2 = PrimaryDeviceActivity.f43662f;
                        if (s.g(str, "PrimaryDeviceFragment")) {
                            v supportFragmentManager = primaryDeviceActivity.getSupportFragmentManager();
                            androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
                            com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.view.a.f43671l.getClass();
                            aVarB.l(R.id.content_frame, new com.garmin.android.apps.connectmobile.settings.primarytrainingdevice.view.a(), str);
                            aVarB.e();
                        }
                        break;
                    default:
                        Boolean bool = (Boolean) obj;
                        PrimaryDeviceActivity.a aVar3 = PrimaryDeviceActivity.f43662f;
                        if (bool != null) {
                            boolean zBooleanValue = bool.booleanValue();
                            MenuItem menuItem = primaryDeviceActivity.f43665e;
                            if (menuItem != null) {
                                menuItem.setVisible(zBooleanValue);
                            }
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.primary_device_menu, menu);
        this.f43665e = menu != null ? menu.findItem(R.id.help) : null;
        return true;
    }

    @Override // z10.p3, com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.help) {
            return super.onOptionsItemSelected(menuItem);
        }
        la();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/primarytrainingdevice/view/PrimaryDeviceActivity$a;", "", "<init>", "()V", "", "EXTRAS_IS_NAVIGATING_FROM_PRIMARY_WEARABLE", "Ljava/lang/String;", "EXTRAS_REGISTER_DEVICE_DTO", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, boolean z14, f fVar) {
            Bundle bundle = new Bundle(2);
            bundle.putParcelable("extras_register_device_dto", fVar);
            bundle.putBoolean("extras_is_navigating_from_primary_wearable", z14);
            Intent intent = new Intent(context, (Class<?>) PrimaryDeviceActivity.class);
            com.airbnb.lottie.animation.keyframe.a.q(l2.f37135b, intent, bundle);
            return intent;
        }

        private a() {
        }
    }
}
