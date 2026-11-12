package com.garmin.android.apps.connectmobile.settings.devices;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.lifecycle.x1;
import c22.t3;
import ch1.b2;
import ch1.f1;
import ch1.f2;
import ch1.i0;
import ch1.i3;
import ch1.k1;
import ch1.l3;
import ch1.p4;
import ch1.r1;
import ch1.u2;
import ch1.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.g1;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.devices.vivosmart4.VivoSmart4HighHeartRateSettings;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import ig1.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import ng1.m;
import ng1.n;
import ng1.n0;
import ng1.o0;
import ng1.p0;
import ng1.q0;
import ng1.r0;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.jvm.internal.s0;
import zb0.d0;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a extends ng1.j implements Observer, p0, r0, n0, q0, o0 {
    public static final /* synthetic */ int Z0 = 0;
    public com.garmin.android.apps.connectmobile.devices.model.f A;
    public com.garmin.android.apps.connectmobile.devices.model.f B;
    public com.garmin.android.apps.connectmobile.devices.model.f C;
    public com.garmin.android.apps.connectmobile.devices.model.f D;
    public LinearLayout E;
    public JSONObject H0;
    public ch1.a I0;
    public u2 J0;
    public d80.f K0;
    public d80.f L0;
    public d80.f M0;
    public d80.f N0;
    public d80.f O0;
    public m P;
    public d80.f P0;
    public d80.f Q0;
    public d80.f R0;
    public d80.f S0;
    public com.garmin.android.apps.connectmobile.settings.devices.c T;
    public d80.f T0;
    public String U0;
    public u0 V0;
    public boolean W0;
    public com.garmin.android.apps.connectmobile.settings.devices.b X;
    public oc1.d X0;
    public l Y;
    public ng1.l Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public UserSettingsDTO f42504k0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public x2 f42508x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public o f42509y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.devices.model.f f42510z;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f42505t = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public nr0.a f42506v = new nr0.a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f42507w = new ArrayList();
    public ArrayList<String> F = new ArrayList<>();
    public final ng1.k I = new ng1.k(this, 0);
    public final b Y0 = new b();

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.devices.a$a, reason: collision with other inner class name */
    public class C0795a implements d80.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.devices.model.f f42511a;

        public C0795a(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
            this.f42511a = fVar;
        }

        @Override // d80.b
        public final void a(lj0.b bVar) {
            a2 a2Var = a2.SETTINGS;
            hb.a.q(bVar.f112957a, new StringBuilder("Error saving elliptical threshold to options to GC ["), "].", a2Var, "BaseActivityTrackingAndAutoActivity");
            boolean zA = bVar.a();
            int i14 = a.Z0;
            a aVar = a.this;
            aVar.displayFailedMessage(zA);
            aVar.hideProgressOverlay();
            aVar.finish();
        }

        @Override // d80.b
        public final void b(Object obj, d80.b.a aVar) {
            i2.a(a2.SETTINGS, "BaseActivityTrackingAndAutoActivity", "Saving elliptical threshold: ".concat(String.valueOf(this.f42511a.D())));
        }
    }

    public class b implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b {
        public b() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            com.garmin.android.library.backgroundtaskmanagement.b.c cVar2 = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
            a aVar = a.this;
            if (cVar == cVar2) {
                aVar.X0.x4(aVar.f125976b, "BaseActivityTrackingAndAutoActivity");
                ((l80.b) KoinJavaComponent.get(l80.b.class)).n(aVar, aVar.f125976b, "BaseActivityTrackingAndAutoActivity");
                Toast.makeText(aVar, aVar.getText(R.string.msg_settings_saved_successfully), 0).show();
            } else {
                g1.b(aVar, cVar);
            }
            aVar.hideProgressOverlay();
            aVar.finish();
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42514a;

        static {
            int[] iArr = new int[u0.values().length];
            f42514a = iArr;
            try {
                iArr[u0.f203699b2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42514a[u0.f203705c2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42514a[u0.T1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42514a[u0.f203773m4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42514a[u0.f203728g2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f42514a[u0.f203717e2.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f42514a[u0.f203722f2.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f42514a[u0.f203735h2.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f42514a[u0.f203742i2.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f42514a[u0.f203749j2.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f42514a[u0.f203757k2.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f42514a[u0.f203764l2.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f42514a[u0.f203792p2.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f42514a[u0.f203798q2.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f42514a[u0.f203804r2.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f42514a[u0.f203809s2.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f42514a[u0.f203815t2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f42514a[u0.f203820u2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f42514a[u0.f203826v2.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f42514a[u0.f203832w2.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f42514a[u0.Z1.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f42514a[u0.f203711d2.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f42514a[u0.Y1.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
        }
    }

    public class d implements d80.b {
        public d() {
        }

        @Override // d80.b
        public final void a(lj0.b bVar) {
            a2 a2Var = a2.SETTINGS;
            hb.a.q(bVar.f112957a, new StringBuilder("Error fetching device settings from GC ["), "].", a2Var, "BaseActivityTrackingAndAutoActivity");
            boolean zA = bVar.a();
            int i14 = a.Z0;
            a aVar = a.this;
            aVar.displayFailedMessage(zA);
            aVar.finish();
        }

        @Override // d80.b
        public final void b(Object obj, d80.b.a aVar) {
            a aVar2 = a.this;
            aVar2.A = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
            if (obj == null) {
                a(lj0.b.f112956j);
            } else {
                aVar2.ka();
            }
        }
    }

    public class e implements d80.b {
        public e() {
        }

        @Override // d80.b
        public final void a(lj0.b bVar) {
            a2 a2Var = a2.SETTINGS;
            hb.a.q(bVar.f112957a, new StringBuilder("Error fetching device settings from GC ["), "].", a2Var, "BaseActivityTrackingAndAutoActivity");
            boolean zA = bVar.a();
            int i14 = a.Z0;
            a aVar = a.this;
            aVar.displayFailedMessage(zA);
            aVar.finish();
        }

        @Override // d80.b
        public final void b(Object obj, d80.b.a aVar) {
            a aVar2 = a.this;
            aVar2.B = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
            if (obj == null) {
                a(lj0.b.f112956j);
            } else {
                aVar2.ma();
            }
        }
    }

    public class f implements d80.b {
        public f() {
        }

        @Override // d80.b
        public final void a(lj0.b bVar) {
            a2 a2Var = a2.SETTINGS;
            hb.a.q(bVar.f112957a, new StringBuilder("Error fetching device settings from GC ["), "].", a2Var, "BaseActivityTrackingAndAutoActivity");
            boolean zA = bVar.a();
            int i14 = a.Z0;
            a aVar = a.this;
            aVar.displayFailedMessage(zA);
            aVar.finish();
        }

        @Override // d80.b
        public final void b(Object obj, d80.b.a aVar) {
            a aVar2 = a.this;
            aVar2.C = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
            if (obj == null) {
                a(lj0.b.f112956j);
            } else {
                aVar2.la();
            }
        }
    }

    public class g implements d80.b {
        public g() {
        }

        @Override // d80.b
        public final void a(lj0.b bVar) {
            a2 a2Var = a2.SETTINGS;
            hb.a.q(bVar.f112957a, new StringBuilder("Error fetching device settings from GC ["), "].", a2Var, "BaseActivityTrackingAndAutoActivity");
            boolean zA = bVar.a();
            int i14 = a.Z0;
            a aVar = a.this;
            aVar.displayFailedMessage(zA);
            aVar.finish();
        }

        @Override // d80.b
        public final void b(Object obj, d80.b.a aVar) {
            com.garmin.android.apps.connectmobile.devices.model.f fVar = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
            a aVar2 = a.this;
            aVar2.D = fVar;
            if (obj == null) {
                a(lj0.b.f112956j);
                return;
            }
            i2.a(a2.SETTINGS, "BaseActivityTrackingAndAutoActivity", "Fetching elliptical threshold: ".concat(String.valueOf(fVar.D())));
            aVar2.hideProgressOverlay();
            aVar2.oa();
        }
    }

    public class h implements d80.b {
        public h() {
        }

        @Override // d80.b
        public final void a(lj0.b bVar) {
            a2 a2Var = a2.SETTINGS;
            hb.a.q(bVar.f112957a, new StringBuilder("Error saving running threshold to options to GC ["), "].", a2Var, "BaseActivityTrackingAndAutoActivity");
            boolean zA = bVar.a();
            int i14 = a.Z0;
            a aVar = a.this;
            aVar.displayFailedMessage(zA);
            aVar.hideProgressOverlay();
            aVar.finish();
        }

        @Override // d80.b
        public final void b(Object obj, d80.b.a aVar) {
        }
    }

    public class i implements d80.b {
        public i() {
        }

        @Override // d80.b
        public final void a(lj0.b bVar) {
            a2 a2Var = a2.SETTINGS;
            hb.a.q(bVar.f112957a, new StringBuilder("Error saving running threshold to options to GC ["), "].", a2Var, "BaseActivityTrackingAndAutoActivity");
            boolean zA = bVar.a();
            int i14 = a.Z0;
            a aVar = a.this;
            aVar.displayFailedMessage(zA);
            aVar.hideProgressOverlay();
            aVar.finish();
        }

        @Override // d80.b
        public final void b(Object obj, d80.b.a aVar) {
        }
    }

    public class j implements d80.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.devices.model.f f42521a;

        public j(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
            this.f42521a = fVar;
        }

        @Override // d80.b
        public final void a(lj0.b bVar) {
            a2 a2Var = a2.SETTINGS;
            hb.a.q(bVar.f112957a, new StringBuilder("Error saving cycling threshold to options to GC ["), "].", a2Var, "BaseActivityTrackingAndAutoActivity");
            boolean zA = bVar.a();
            int i14 = a.Z0;
            a aVar = a.this;
            aVar.displayFailedMessage(zA);
            aVar.hideProgressOverlay();
            aVar.finish();
        }

        @Override // d80.b
        public final void b(Object obj, d80.b.a aVar) {
            i2.a(a2.SETTINGS, "BaseActivityTrackingAndAutoActivity", "Saving cycling threshold: ".concat(String.valueOf(this.f42521a.D())));
        }
    }

    public class k implements d80.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.devices.model.f f42523a;

        public k(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
            this.f42523a = fVar;
        }

        @Override // d80.b
        public final void a(lj0.b bVar) {
            a2 a2Var = a2.SETTINGS;
            hb.a.q(bVar.f112957a, new StringBuilder("Error saving swimming threshold to options to GC ["), "].", a2Var, "BaseActivityTrackingAndAutoActivity");
            boolean zA = bVar.a();
            int i14 = a.Z0;
            a aVar = a.this;
            aVar.displayFailedMessage(zA);
            aVar.hideProgressOverlay();
            aVar.finish();
        }

        @Override // d80.b
        public final void b(Object obj, d80.b.a aVar) {
            i2.a(a2.SETTINGS, "BaseActivityTrackingAndAutoActivity", "Saving swimming threshold: ".concat(String.valueOf(this.f42523a.D())));
        }
    }

    public class l implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<nr0.a> {
        public l() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            a aVar = a.this;
            g1.b(aVar, cVar);
            aVar.hideProgressOverlay();
            aVar.f42507w.remove(Long.valueOf(j8));
            a.pa(aVar.f42505t, aVar.f125985k);
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, nr0.a aVar) {
            nr0.a aVar2 = aVar;
            a aVar3 = a.this;
            aVar3.f42506v = aVar2;
            DeviceSettingsDTO deviceSettingsDTO = aVar3.f125985k;
            if (deviceSettingsDTO != null) {
                deviceSettingsDTO.f33879j1 = aVar2;
            }
        }
    }

    public static void pa(ArrayList arrayList, DeviceSettingsDTO deviceSettingsDTO) {
        if (deviceSettingsDTO == null || arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            fb2.e eVar = (fb2.e) it.next();
            eVar.m(eVar.k(deviceSettingsDTO));
        }
    }

    public static boolean qa(u0 u0Var) {
        int i14 = c.f42514a[u0Var.ordinal()];
        if (i14 != 1 && i14 != 2) {
            switch (i14) {
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    @Override // ng1.q0
    public final void R8(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        String strH = fVar.h();
        com.garmin.android.apps.connectmobile.settings.devices.e eVarN = com.garmin.android.apps.connectmobile.settings.devices.e.N();
        long j8 = this.f125976b;
        com.garmin.android.apps.connectmobile.settings.devices.e.a aVar = com.garmin.android.apps.connectmobile.settings.devices.e.a.SWIMMING;
        k kVar = new k(fVar);
        eVarN.getClass();
        this.S0 = com.garmin.android.apps.connectmobile.settings.devices.e.P(j8, aVar, strH, kVar);
    }

    @Override // ng1.n0
    public final void c8(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        String strH = fVar.h();
        com.garmin.android.apps.connectmobile.settings.devices.e eVarN = com.garmin.android.apps.connectmobile.settings.devices.e.N();
        long j8 = this.f125976b;
        com.garmin.android.apps.connectmobile.settings.devices.e.a aVar = com.garmin.android.apps.connectmobile.settings.devices.e.a.CYCLING;
        j jVar = new j(fVar);
        eVarN.getClass();
        this.R0 = com.garmin.android.apps.connectmobile.settings.devices.e.P(j8, aVar, strH, jVar);
    }

    @Override // ng1.j
    public int ea() {
        return 0;
    }

    @Override // android.app.Activity
    public final void finish() {
        ch1.a aVar = this.I0;
        if (aVar != null) {
            aVar.n();
            this.I0 = null;
        }
        x2 x2Var = this.f42508x;
        if (x2Var != null) {
            x2Var.n();
            this.f42508x = null;
        }
        o oVar = this.f42509y;
        if (oVar != null) {
            oVar.n();
            this.f42509y = null;
        }
        getIntent().putExtra("GCM_deviceSettings", this.f125985k);
        setResult(-1, getIntent());
        super.finish();
    }

    @Override // ng1.o0
    public final void k9(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        String strH = fVar.h();
        com.garmin.android.apps.connectmobile.settings.devices.e eVarN = com.garmin.android.apps.connectmobile.settings.devices.e.N();
        long j8 = this.f125976b;
        com.garmin.android.apps.connectmobile.settings.devices.e.a aVar = com.garmin.android.apps.connectmobile.settings.devices.e.a.ELLIPTICAL;
        C0795a c0795a = new C0795a(fVar);
        eVarN.getClass();
        this.T0 = com.garmin.android.apps.connectmobile.settings.devices.e.P(j8, aVar, strH, c0795a);
    }

    public final void ka() {
        if (hb2.i.a(this)) {
            showProgressOverlay();
            if (!this.F.contains("BIKE")) {
                ma();
                return;
            }
            com.garmin.android.apps.connectmobile.settings.devices.e eVarN = com.garmin.android.apps.connectmobile.settings.devices.e.N();
            long j8 = this.f125976b;
            com.garmin.android.apps.connectmobile.settings.devices.e.a aVar = com.garmin.android.apps.connectmobile.settings.devices.e.a.CYCLING;
            com.garmin.android.apps.connectmobile.settings.devices.e.b bVar = com.garmin.android.apps.connectmobile.settings.devices.e.b.GENERIC;
            e eVar = new e();
            eVarN.getClass();
            this.M0 = com.garmin.android.apps.connectmobile.settings.devices.e.M(j8, aVar, bVar, eVar);
        }
    }

    public final void la() {
        if (hb2.i.a(this)) {
            showProgressOverlay();
            if (!this.F.contains("ELLIPTICAL")) {
                hideProgressOverlay();
                oa();
                return;
            }
            com.garmin.android.apps.connectmobile.settings.devices.e eVarN = com.garmin.android.apps.connectmobile.settings.devices.e.N();
            long j8 = this.f125976b;
            com.garmin.android.apps.connectmobile.settings.devices.e.a aVar = com.garmin.android.apps.connectmobile.settings.devices.e.a.FITNESS_EQUIPMENT;
            com.garmin.android.apps.connectmobile.settings.devices.e.b bVar = com.garmin.android.apps.connectmobile.settings.devices.e.b.ELLIPTICAL;
            g gVar = new g();
            eVarN.getClass();
            this.O0 = com.garmin.android.apps.connectmobile.settings.devices.e.M(j8, aVar, bVar, gVar);
        }
    }

    public final void ma() {
        if (hb2.i.a(this)) {
            showProgressOverlay();
            if (!this.F.contains("SWIM")) {
                la();
                return;
            }
            com.garmin.android.apps.connectmobile.settings.devices.e eVarN = com.garmin.android.apps.connectmobile.settings.devices.e.N();
            long j8 = this.f125976b;
            com.garmin.android.apps.connectmobile.settings.devices.e.a aVar = com.garmin.android.apps.connectmobile.settings.devices.e.a.SWIMMING;
            com.garmin.android.apps.connectmobile.settings.devices.e.b bVar = com.garmin.android.apps.connectmobile.settings.devices.e.b.GENERIC;
            f fVar = new f();
            eVarN.getClass();
            this.N0 = com.garmin.android.apps.connectmobile.settings.devices.e.M(j8, aVar, bVar, fVar);
        }
    }

    public final void na() {
        if (hb2.i.a(this)) {
            showProgressOverlay();
            if (!this.F.contains("WALK")) {
                ka();
                return;
            }
            com.garmin.android.apps.connectmobile.settings.devices.e.b bVar = qa(this.f125980f) ? com.garmin.android.apps.connectmobile.settings.devices.e.b.ALL : com.garmin.android.apps.connectmobile.settings.devices.e.b.GENERIC;
            com.garmin.android.apps.connectmobile.settings.devices.e eVarN = com.garmin.android.apps.connectmobile.settings.devices.e.N();
            long j8 = this.f125976b;
            com.garmin.android.apps.connectmobile.settings.devices.e.a aVar = com.garmin.android.apps.connectmobile.settings.devices.e.a.WALKING;
            d dVar = new d();
            eVarN.getClass();
            this.L0 = com.garmin.android.apps.connectmobile.settings.devices.e.M(j8, aVar, bVar, dVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0085 A[FALL_THROUGH] */
    public final void oa() {
        this.I0 = new ch1.a(this);
        this.J0 = new u2(this);
        this.f42508x = new x2(this);
        this.f42509y = new o(this, this.f42510z, this.A, this.B, this.C, this.D, this.I, this, this, this, this, this, this.F);
        this.E = (LinearLayout) findViewById(R.id.device_settings_move_iq_group_btn);
        DeviceSettingsDTO deviceSettingsDTO = this.f125985k;
        if (deviceSettingsDTO == null || !this.I0.g(this, deviceSettingsDTO)) {
            this.I0.m(false);
        } else {
            this.I0.addObserver(this);
            if (c.f42514a[this.V0.ordinal()] != 12) {
                this.I0.m(true);
            }
            int iOrdinal = this.f125980f.ordinal();
            if (iOrdinal != 228) {
                switch (iOrdinal) {
                    default:
                        if (this.f125980f != u0.M5) {
                            this.f42509y.g(this, this.f125985k);
                            this.E.addView(this.f42509y.f93305d);
                            break;
                        }
                    case 217:
                    case 218:
                    case 219:
                    case 220:
                    case 221:
                    case 222:
                    case 223:
                    case 224:
                        this.f42508x.g(this, this.f125985k);
                        this.E.addView(this.f42508x.a());
                        break;
                }
            } else {
                this.f42508x.g(this, this.f125985k);
                this.E.addView(this.f42508x.a());
            }
        }
        ArrayList<fb2.e> arrayList = this.f42505t;
        arrayList.clear();
        arrayList.add(new i3(this));
        if (this.V0 == u0.f203705c2) {
            arrayList.add(new l3(this));
            arrayList.add(new r1(this, this.W0));
        }
        u0 u0Var = this.V0;
        int[] iArr = c.f42514a;
        if (iArr[u0Var.ordinal()] != 12) {
            arrayList.add(this.J0);
        }
        arrayList.add(new p4(this, new ng1.k(this, 1)));
        switch (iArr[this.V0.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                arrayList.add(new b2(this));
                break;
            default:
                arrayList.add(new f2(this, new ng1.k(this, 2)));
                break;
        }
        if (iArr[this.V0.ordinal()] != 12) {
            arrayList.add(new f1(this, new ng1.k(this, 3)));
        }
        arrayList.add(new k1(this));
        arrayList.add(new i0(this));
        if (this.f125985k != null) {
            for (fb2.e eVar : arrayList) {
                boolean zG = eVar.g(this, this.f125985k);
                eVar.addObserver(this);
                eVar.m(zG);
            }
        }
        if (this.f125985k != null) {
            if (c.f42514a[this.V0.ordinal()] != 12) {
                this.J0.z(this.f125985k);
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        DeviceSettingsDTO deviceSettingsDTO;
        super.onActivityResult(i14, i15, intent);
        if (i14 == 10 && i15 == -1) {
            if (intent == null || intent.getExtras() == null) {
                deviceSettingsDTO = null;
            } else {
                deviceSettingsDTO = (DeviceSettingsDTO) intent.getExtras().get("GCM_deviceSettings");
                intent.getBooleanExtra("GCM_updatedPAT", false);
            }
            if (deviceSettingsDTO != null) {
                this.f125985k = deviceSettingsDTO;
                pa(this.f42505t, deviceSettingsDTO);
            }
        }
        if (i14 == 15 && i15 == -1 && intent != null) {
            "android.intent.action.EDIT".equalsIgnoreCase(intent.getAction());
        }
        if (intent != null && i14 == 20 && i15 == -1) {
            ((d0) KoinJavaComponent.get(d0.class)).getClass();
            this.f42504k0 = (UserSettingsDTO) intent.getParcelableExtra("GCM_user_settings");
            this.f42506v.g(intent.getIntExtra("INTENSITY_MINUTES_GOAL", 150));
            ra(this.f42506v);
        }
    }

    @Override // ng1.j, com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        UserSettingsDTO userSettingsDTO = this.f42504k0;
        JSONObject jSONObjectB = userSettingsDTO != null ? t3.b(userSettingsDTO.t1(), this.H0) : null;
        if (jSONObjectB != null) {
            if (this.f42504k0 != null) {
                showProgressOverlay();
                this.f42507w.add(Long.valueOf(((d0) KoinJavaComponent.get(d0.class)).a(this.f42504k0, jSONObjectB, this.Y0)));
            }
            yr1.e.g(this.f125976b, -1L, this, "BaseActivityTrackingAndAutoActivity");
        }
    }

    @Override // ng1.j, ng1.p, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getExtras() != null) {
            this.f125985k = (DeviceSettingsDTO) getIntent().getExtras().getParcelable("GCM_deviceSettings");
            String stringExtra = getIntent().getStringExtra("GCM_deviceSettingsTitle");
            this.V0 = (u0) getIntent().getSerializableExtra("GCM_deviceEnumValue");
            this.f125976b = getIntent().getLongExtra("GCM_extra_device_connected_unit_id", -1L);
            this.U0 = getIntent().getStringExtra("GCM_deviceProductNbr");
            this.W0 = getIntent().getBooleanExtra("GCM_low_hr_alert_capable", false);
            if (this.f125976b == -1) {
                this.f125976b = getIntent().getLongExtra("GCM_deviceUnitID", -1L);
            }
            u0 u0Var = this.V0;
            if (u0Var == null) {
                u0Var = (u0) u0.f203782n6.get(this.U0);
            }
            this.V0 = u0Var;
            if (u0Var == null) {
                finish();
                return;
            }
            if (this.F == null) {
                this.F = new ArrayList<>();
            }
            this.F.clear();
            this.F.add("RUN");
            this.F.add("WALK");
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = getString(R.string.activity_tracking_title);
            }
            initActionBar(true, stringExtra);
        }
        if (this.f125985k == null) {
            i2.f(a2.SETTINGS, "BaseActivityTrackingAndAutoActivity", "Invalid device settings object while entering device settings time, date, system screen!");
            finish();
            return;
        }
        this.X0 = (oc1.d) new x1(this).b(s0.f105811a.b(oc1.d.class));
        if (hb2.i.a(this)) {
            showProgressOverlay();
            if (this.F.contains("RUN")) {
                com.garmin.android.apps.connectmobile.settings.devices.e.b bVar = qa(this.f125980f) ? com.garmin.android.apps.connectmobile.settings.devices.e.b.ALL : com.garmin.android.apps.connectmobile.settings.devices.e.b.GENERIC;
                com.garmin.android.apps.connectmobile.settings.devices.e eVarN = com.garmin.android.apps.connectmobile.settings.devices.e.N();
                long j8 = this.f125976b;
                com.garmin.android.apps.connectmobile.settings.devices.e.a aVar = com.garmin.android.apps.connectmobile.settings.devices.e.a.RUNNING;
                n nVar = new n(this);
                eVarN.getClass();
                this.K0 = com.garmin.android.apps.connectmobile.settings.devices.e.M(j8, aVar, bVar, nVar);
            } else {
                na();
            }
        }
        this.Z = new ng1.l(this);
        showProgressOverlay();
        this.f42507w.add(Long.valueOf(((d0) KoinJavaComponent.get(d0.class)).i(this.Z)));
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f42505t;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((fb2.e) it.next()).n();
            }
        }
        arrayList.clear();
    }

    @Override // ng1.j, com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // ng1.j, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        nr0.a aVar = this.f42506v;
        if (aVar.f127608b == null && aVar.f127607a == null && !aVar.f()) {
            this.P = new m(this);
            showProgressOverlay();
            fr0.a aVarM = fr0.a.M();
            m mVar = this.P;
            aVarM.getClass();
            this.f42507w.add(Long.valueOf(com.garmin.android.library.backgroundtaskmanagement.c.d(new gr0.f(true, true, true, aVarM), mVar)));
        }
    }

    @Override // ng1.p, com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        com.garmin.android.library.backgroundtaskmanagement.c.f50123c.c(this.f42507w);
        d80.f fVar = this.K0;
        if (fVar != null) {
            fVar.a();
        }
        d80.f fVar2 = this.L0;
        if (fVar2 != null) {
            fVar2.a();
        }
        d80.f fVar3 = this.M0;
        if (fVar3 != null) {
            fVar3.a();
        }
        d80.f fVar4 = this.N0;
        if (fVar4 != null) {
            fVar4.a();
        }
        d80.f fVar5 = this.O0;
        if (fVar5 != null) {
            fVar5.a();
        }
        d80.f fVar6 = this.P0;
        if (fVar6 != null) {
            fVar6.a();
        }
        d80.f fVar7 = this.Q0;
        if (fVar7 != null) {
            fVar7.a();
        }
        d80.f fVar8 = this.R0;
        if (fVar8 != null) {
            fVar8.a();
        }
        d80.f fVar9 = this.S0;
        if (fVar9 != null) {
            fVar9.a();
        }
        d80.f fVar10 = this.T0;
        if (fVar10 != null) {
            fVar10.a();
        }
    }

    @Override // ng1.p0
    public final void r7(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        String strH = fVar.h();
        h hVar = new h();
        com.garmin.android.apps.connectmobile.settings.devices.e eVarN = com.garmin.android.apps.connectmobile.settings.devices.e.N();
        boolean zQa = qa(this.f125980f);
        long j8 = this.f125976b;
        if (!zQa) {
            com.garmin.android.apps.connectmobile.settings.devices.e.a aVar = com.garmin.android.apps.connectmobile.settings.devices.e.a.RUNNING;
            eVarN.getClass();
            this.P0 = com.garmin.android.apps.connectmobile.settings.devices.e.P(j8, aVar, strH, hVar);
        } else {
            com.garmin.android.apps.connectmobile.settings.devices.e.a aVar2 = com.garmin.android.apps.connectmobile.settings.devices.e.a.RUNNING;
            com.garmin.android.apps.connectmobile.settings.devices.e.b bVar = com.garmin.android.apps.connectmobile.settings.devices.e.b.ALL;
            eVarN.getClass();
            this.P0 = com.garmin.android.apps.connectmobile.settings.devices.e.O(j8, aVar2, bVar, strH, hVar);
        }
    }

    public final void ra(nr0.a aVar) {
        this.Y = new l();
        showProgressOverlay();
        fr0.a aVarM = fr0.a.M();
        l lVar = this.Y;
        aVarM.getClass();
        aVar.getClass();
        this.f42507w.add(Long.valueOf(com.garmin.android.library.backgroundtaskmanagement.c.d(new gr0.a(aVar, 2, aVarM), lVar)));
    }

    @Override // ng1.r0
    public final void u2(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        String strH = fVar.h();
        i iVar = new i();
        com.garmin.android.apps.connectmobile.settings.devices.e eVarN = com.garmin.android.apps.connectmobile.settings.devices.e.N();
        boolean zQa = qa(this.f125980f);
        long j8 = this.f125976b;
        if (!zQa) {
            com.garmin.android.apps.connectmobile.settings.devices.e.a aVar = com.garmin.android.apps.connectmobile.settings.devices.e.a.WALKING;
            eVarN.getClass();
            this.Q0 = com.garmin.android.apps.connectmobile.settings.devices.e.P(j8, aVar, strH, iVar);
        } else {
            com.garmin.android.apps.connectmobile.settings.devices.e.a aVar2 = com.garmin.android.apps.connectmobile.settings.devices.e.a.WALKING;
            com.garmin.android.apps.connectmobile.settings.devices.e.b bVar = com.garmin.android.apps.connectmobile.settings.devices.e.b.ALL;
            eVarN.getClass();
            this.Q0 = com.garmin.android.apps.connectmobile.settings.devices.e.O(j8, aVar2, bVar, strH, iVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0030 A[FALL_THROUGH] */
    @Override // ng1.p, java.util.Observer
    public final void update(Observable observable, Object obj) {
        DeviceSettingsDTO deviceSettingsDTO;
        nr0.a aVar;
        if (obj != null) {
            d0 d0Var = (d0) KoinJavaComponent.get(d0.class);
            if ((observable instanceof ch1.a) && (obj instanceof Boolean)) {
                DeviceSettingsDTO deviceSettingsDTO2 = this.f125985k;
                u0 u0Var = this.f125980f;
                u0 u0Var2 = u0.f203733h;
                int iOrdinal = u0Var.ordinal();
                if (iOrdinal != 228) {
                    switch (iOrdinal) {
                        default:
                            if (this.f125980f != u0.M5) {
                                this.f42509y.k(deviceSettingsDTO2);
                                break;
                            }
                        case 217:
                        case 218:
                        case 219:
                        case 220:
                        case 221:
                        case 222:
                        case 223:
                        case 224:
                            this.f42508x.k(deviceSettingsDTO2);
                            break;
                    }
                } else {
                    this.f42508x.k(deviceSettingsDTO2);
                }
                DeviceSettingsDTO deviceSettingsDTO3 = this.f125985k;
                if (deviceSettingsDTO3 != null) {
                    this.J0.z(deviceSettingsDTO3);
                }
            } else {
                if (observable instanceof i0) {
                    d0Var.M(this, this.U0);
                    return;
                }
                if (observable instanceof i3) {
                    d0Var.X(this, this.f125985k, this.f125949q, this.U0);
                    return;
                }
                if (!(observable instanceof r1)) {
                    if (!(observable instanceof b2) || (deviceSettingsDTO = this.f125985k) == null || (aVar = deviceSettingsDTO.f33879j1) == null) {
                        return;
                    }
                    d0Var.u(this, this.f42504k0, aVar.b());
                    return;
                }
                DeviceSettingsDTO deviceSettingsDTO4 = this.f125985k;
                if (deviceSettingsDTO4 != null) {
                    boolean z14 = this.W0;
                    long j8 = this.f125976b;
                    String str = this.U0;
                    VivoSmart4HighHeartRateSettings.f43225d.getClass();
                    VivoSmart4HighHeartRateSettings.a.a(this, z14, deviceSettingsDTO4, j8, str);
                }
            }
        }
    }
}
