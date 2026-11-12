package com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.emergencycalling;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import androidx.navigation.fragment.NavHostFragment;
import b.g;
import ca0.v1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.emergencycalling.EmergencyCallingActivity;
import e23.l;
import lc.j0;
import lc.m0;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import vj1.h;
import vj1.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/emergencycalling/EmergencyCallingActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lvj1/h;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EmergencyCallingActivity extends com.garmin.android.apps.connectmobile.c implements h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f43789d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f43790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f43791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wj1.a f43792c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f43793a;

        public b(l lVar) {
            lVar.getClass();
            this.f43793a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f43793a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f43793a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f43794a;

        public c(g gVar) {
            this.f43794a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f43794a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f43795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f43796b;

        public d(e23.a aVar, g gVar) {
            this.f43795a = aVar;
            this.f43796b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f43795a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f43796b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public EmergencyCallingActivity() {
        final int i14 = 0;
        this.f43790a = m.b(new e23.a(this) { // from class: vj1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmergencyCallingActivity f178451b;

            {
                this.f178451b = this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x0032  */
            @Override // e23.a
            public final Object invoke() {
                Parcelable parcelable;
                b bVar;
                Parcelable parcelable2;
                int i15 = i14;
                EmergencyCallingActivity emergencyCallingActivity = this.f178451b;
                switch (i15) {
                    case 0:
                        EmergencyCallingActivity.a aVar = EmergencyCallingActivity.f43789d;
                        Bundle extras = emergencyCallingActivity.getIntent().getExtras();
                        if (extras != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable = (Parcelable) extras.getParcelable("GCM_extra_screen_access_role", hl.a.class);
                            } else {
                                Parcelable parcelable3 = extras.getParcelable("GCM_extra_screen_access_role");
                                parcelable = (hl.a) (parcelable3 instanceof hl.a ? parcelable3 : null);
                            }
                            hl.a aVar2 = (hl.a) parcelable;
                            if (aVar2 != null) {
                                return aVar2;
                            }
                        }
                        return hl.a.c.f84256b;
                    default:
                        EmergencyCallingActivity.a aVar3 = EmergencyCallingActivity.f43789d;
                        Bundle extras2 = emergencyCallingActivity.getIntent().getExtras();
                        if (extras2 == null) {
                            bVar = new b(false, null, 3, null);
                        } else {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable2 = (Parcelable) extras2.getParcelable("EXTRA_CONFIGURATION", b.class);
                            } else {
                                Parcelable parcelable4 = extras2.getParcelable("EXTRA_CONFIGURATION");
                                if (!(parcelable4 instanceof b)) {
                                    parcelable4 = null;
                                }
                                parcelable2 = (b) parcelable4;
                            }
                            bVar = (b) parcelable2;
                            if (bVar == null) {
                                bVar = new b(false, null, 3, null);
                            }
                        }
                        wj1.a aVar4 = emergencyCallingActivity.f43792c;
                        if (aVar4 != null) {
                            return new j(aVar4, bVar, (hl.a) emergencyCallingActivity.f43790a.getValue());
                        }
                        s.m("data");
                        throw null;
                }
            }
        });
        final int i15 = 1;
        this.f43791b = new w1(s0.f105811a.b(i.class), new c(this), new e23.a(this) { // from class: vj1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmergencyCallingActivity f178451b;

            {
                this.f178451b = this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x0032  */
            @Override // e23.a
            public final Object invoke() {
                Parcelable parcelable;
                b bVar;
                Parcelable parcelable2;
                int i16 = i15;
                EmergencyCallingActivity emergencyCallingActivity = this.f178451b;
                switch (i16) {
                    case 0:
                        EmergencyCallingActivity.a aVar = EmergencyCallingActivity.f43789d;
                        Bundle extras = emergencyCallingActivity.getIntent().getExtras();
                        if (extras != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable = (Parcelable) extras.getParcelable("GCM_extra_screen_access_role", hl.a.class);
                            } else {
                                Parcelable parcelable3 = extras.getParcelable("GCM_extra_screen_access_role");
                                parcelable = (hl.a) (parcelable3 instanceof hl.a ? parcelable3 : null);
                            }
                            hl.a aVar2 = (hl.a) parcelable;
                            if (aVar2 != null) {
                                return aVar2;
                            }
                        }
                        return hl.a.c.f84256b;
                    default:
                        EmergencyCallingActivity.a aVar3 = EmergencyCallingActivity.f43789d;
                        Bundle extras2 = emergencyCallingActivity.getIntent().getExtras();
                        if (extras2 == null) {
                            bVar = new b(false, null, 3, null);
                        } else {
                            if (Build.VERSION.SDK_INT >= 33) {
                                parcelable2 = (Parcelable) extras2.getParcelable("EXTRA_CONFIGURATION", b.class);
                            } else {
                                Parcelable parcelable4 = extras2.getParcelable("EXTRA_CONFIGURATION");
                                if (!(parcelable4 instanceof b)) {
                                    parcelable4 = null;
                                }
                                parcelable2 = (b) parcelable4;
                            }
                            bVar = (b) parcelable2;
                            if (bVar == null) {
                                bVar = new b(false, null, 3, null);
                            }
                        }
                        wj1.a aVar4 = emergencyCallingActivity.f43792c;
                        if (aVar4 != null) {
                            return new j(aVar4, bVar, (hl.a) emergencyCallingActivity.f43790a.getValue());
                        }
                        s.m("data");
                        throw null;
                }
            }
        }, new d(null, this));
    }

    @Override // vj1.h
    public final void O5() {
        if (!ca().A) {
            i iVarCa = ca();
            if (s.g(iVarCa.f178471t, iVarCa.I4())) {
                return;
            }
        }
        setResult(0, null);
    }

    public final i ca() {
        return (i) this.f43791b.getValue();
    }

    @Override // vj1.h
    public final void j1() {
        if (!ca().A) {
            i iVarCa = ca();
            if (s.g(iVarCa.f178471t, iVarCa.I4())) {
                return;
            }
        }
        Intent intent = new Intent();
        intent.putExtra("EXTRA_SELECTED_EMERGENCY_CONTACT", ca().I4());
        setResult(-1, intent);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        wj1.a aVar;
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.emergency_calling_activity);
        initActionBar(true, getString(R.string.lbl_emergency_calling));
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            aVar = new wj1.a(null, 1, null);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras.getParcelable("EXTRA_DATA", wj1.a.class);
            } else {
                Parcelable parcelable2 = extras.getParcelable("EXTRA_DATA");
                if (!(parcelable2 instanceof wj1.a)) {
                    parcelable2 = null;
                }
                parcelable = (wj1.a) parcelable2;
            }
            aVar = (wj1.a) parcelable;
            if (aVar == null) {
                aVar = new wj1.a(null, 1, null);
            }
        }
        this.f43792c = aVar;
        setResult(0);
        Fragment fragmentF = getSupportFragmentManager().F(R.id.nav_host_fragment);
        fragmentF.getClass();
        m0 m0VarU6 = ((NavHostFragment) fragmentF).u6();
        j0 j0VarB = m0VarU6.e().b(ca().A ? R.navigation.nav_emergency_calling_wizard : R.navigation.nav_emergency_calling);
        if (!ca().A && ca().f178470r != null) {
            j0VarB.p(R.id.emergencyCallingDetailsFragment);
        }
        m0VarU6.t(j0VarB);
        m0VarU6.a(new v1(this, 2));
        ca().f178475y.f(this, new b(new uo1.a(this, 15)));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/ui/emergencycalling/EmergencyCallingActivity$a;", "", "<init>", "()V", "", "EXTRA_SELECTED_EMERGENCY_CONTACT", "Ljava/lang/String;", "EXTRA_DATA", "EXTRA_CONFIGURATION", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, wj1.a aVar, vj1.b bVar, hl.a aVar2) {
            aVar2.getClass();
            Intent intent = new Intent(context, (Class<?>) EmergencyCallingActivity.class);
            if (aVar != null) {
                intent.putExtra("EXTRA_DATA", aVar);
            }
            if (bVar != null) {
                intent.putExtra("EXTRA_CONFIGURATION", bVar);
            }
            intent.putExtra("GCM_extra_screen_access_role", aVar2);
            return intent;
        }

        private a() {
        }
    }
}
