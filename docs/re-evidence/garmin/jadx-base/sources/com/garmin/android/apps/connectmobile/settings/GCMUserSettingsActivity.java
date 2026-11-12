package com.garmin.android.apps.connectmobile.settings;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.core.view.j;
import androidx.lifecycle.x1;
import c22.t3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.model.StepLengthDTO;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.usersettings.stride.StrideLengthSettingsActivity;
import cw.q;
import ew1.h1;
import f12.l;
import fw.p;
import g.h;
import gg1.a0;
import gg1.b0;
import gg1.c0;
import gg1.d0;
import gg1.e0;
import gg1.g0;
import gg1.s;
import gg1.t;
import gg1.v;
import gg1.w;
import gg1.x;
import gg1.y;
import gg1.z;
import gw.l0;
import java.util.ArrayList;
import java.util.Iterator;
import o53.f0;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.jvm.internal.s0;
import pk1.u;
import wi1.i;
import z10.d1;

/* JADX INFO: loaded from: classes10.dex */
public class GCMUserSettingsActivity extends com.garmin.android.apps.connectmobile.c implements yk1.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f41539t = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public UserSettingsDTO f41543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public JSONObject f41544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public StepLengthDTO f41545f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public StepLengthDTO f41546g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i f41547h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public g0 f41551l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public f.c<Intent> f41552m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41540a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41541b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f41542c = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f41548i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f41549j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f41550k = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f41553n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a f41554o = new a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f41555p = new b();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f41556q = new c();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final s f41557r = new s(this, 0);

    public class a implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b {
        public a() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            GCMUserSettingsActivity gCMUserSettingsActivity = GCMUserSettingsActivity.this;
            gCMUserSettingsActivity.f41548i = -1L;
            int i14 = gCMUserSettingsActivity.f41540a - 1;
            gCMUserSettingsActivity.f41540a = i14;
            if (i14 == 0) {
                gCMUserSettingsActivity.fa();
                gCMUserSettingsActivity.hideProgressOverlay();
            }
            if (cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS || gCMUserSettingsActivity.f41543d == null) {
                i2.f(a2.SETTINGS, "GCMUserSettingsActivity", cVar.name());
                Toast.makeText(gCMUserSettingsActivity, gCMUserSettingsActivity.getString(R.string.txt_error_occurred), 1).show();
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
            GCMUserSettingsActivity gCMUserSettingsActivity = GCMUserSettingsActivity.this;
            gCMUserSettingsActivity.f41543d = (UserSettingsDTO) obj;
            gCMUserSettingsActivity.f41544e = GCMSettingManager.s().t1();
        }
    }

    public class b implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b {
        public b() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            GCMUserSettingsActivity gCMUserSettingsActivity = GCMUserSettingsActivity.this;
            gCMUserSettingsActivity.f41549j = -1L;
            int i14 = gCMUserSettingsActivity.f41541b - 1;
            gCMUserSettingsActivity.f41541b = i14;
            if (i14 == 0) {
                gCMUserSettingsActivity.hideProgressOverlay();
                gCMUserSettingsActivity.finish();
            }
            if (cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                i2.f(a2.SETTINGS, "GCMUserSettingsActivity", "Error saving user personal information to GC [" + cVar.name() + "].");
                if (cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.NO_NETWORK) {
                    Toast.makeText(gCMUserSettingsActivity, R.string.txt_error_occurred, 0).show();
                }
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
        }
    }

    public class c implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b {
        public c() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            GCMUserSettingsActivity gCMUserSettingsActivity = GCMUserSettingsActivity.this;
            gCMUserSettingsActivity.f41550k = -1L;
            int i14 = gCMUserSettingsActivity.f41540a - 1;
            gCMUserSettingsActivity.f41540a = i14;
            if (i14 == 0) {
                gCMUserSettingsActivity.fa();
                gCMUserSettingsActivity.hideProgressOverlay();
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            u uVar = (u) GCMUserSettingsActivity.this.getSupportFragmentManager().F(R.id.content_frame);
            if (uVar == null || !uVar.isAdded()) {
                return;
            }
            uVar.I6();
        }
    }

    public static /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41562a;

        static {
            int[] iArr = new int[p.values().length];
            f41562a = iArr;
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41562a[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41562a[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static StepLengthDTO ca() {
        StepLengthDTO stepLengthDTO = new StepLengthDTO();
        l.f68084a.getClass();
        stepLengthDTO.f43517a = l.a.a().U1();
        stepLengthDTO.f43518b = "running";
        double dO = GCMSettingManager.o();
        if (dO <= 0.0d) {
            dO = 0.0d;
        }
        stepLengthDTO.f43519c = dO;
        if (GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_running_measured_distance_unit), 0) == 0) {
            stepLengthDTO.f43520d = "foot";
        } else {
            stepLengthDTO.f43520d = "meter";
        }
        stepLengthDTO.f43521e = Math.max(GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_running_total_steps), 0), 0);
        float f14 = GCMSettingManager.f41536b.getFloat(GCMSettingManager.f41535a.getString(R.string.key_running_stride_length), 0.0f);
        stepLengthDTO.f43522f = f14 > 0.0f ? f14 : 0.0d;
        return stepLengthDTO;
    }

    public static StepLengthDTO da() {
        StepLengthDTO stepLengthDTO = new StepLengthDTO();
        l.f68084a.getClass();
        stepLengthDTO.f43517a = l.a.a().U1();
        stepLengthDTO.f43518b = "walking";
        double dV = GCMSettingManager.v();
        if (dV <= 0.0d) {
            dV = 0.0d;
        }
        stepLengthDTO.f43519c = dV;
        if (GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_walking_measured_distance_unit), 0) == 0) {
            stepLengthDTO.f43520d = "foot";
        } else {
            stepLengthDTO.f43520d = "meter";
        }
        stepLengthDTO.f43521e = Math.max(GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_walking_total_steps), 0), 0);
        float f14 = GCMSettingManager.f41536b.getFloat(GCMSettingManager.f41535a.getString(R.string.key_walking_stride_length), 0.0f);
        stepLengthDTO.f43522f = f14 > 0.0f ? f14 : 0.0d;
        return stepLengthDTO;
    }

    public static i ea() {
        i iVar = new i();
        iVar.q(Integer.valueOf(((f12.b) KoinJavaComponent.get(f12.b.class)).getUserProfilePk()));
        double dW = GCMSettingManager.w();
        if (dW <= 0.0d) {
            dW = 0.0d;
        }
        iVar.j(dW);
        iVar.o(GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_wheelchair_measured_distance_unit), 0));
        iVar.m(Integer.valueOf(Math.max(GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_wheelchair_total_pushes), 0), 0)));
        float f14 = GCMSettingManager.f41536b.getFloat(GCMSettingManager.f41535a.getString(R.string.key_wheelchair_stroke_length), 0.0f);
        iVar.k(f14 > 0.0f ? f14 : 0.0d);
        return iVar;
    }

    public final void fa() {
        runOnUiThread(new d());
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        if (i14 == 70 && i15 == -1) {
            fa();
        }
        super.onActivityResult(i14, i15, intent);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        Object next;
        Object next2;
        Object next3;
        if (this.f41542c || this.f41540a > 0) {
            finish();
            return;
        }
        UserSettingsDTO userSettingsDTOS = GCMSettingManager.s();
        JSONObject jSONObjectB = t3.b(userSettingsDTOS.t1(), this.f41544e);
        i2.a(a2.SETTINGS, "GCMUserSettingsActivity", "User Settings JSON delta = " + jSONObjectB);
        if (jSONObjectB != null) {
            showProgressOverlay();
            this.f41542c = true;
            this.f41541b++;
            this.f41549j = q.N().O(userSettingsDTOS, jSONObjectB, this.f41555p);
            setResult(-1);
        }
        ArrayList arrayList = this.f41553n;
        if (arrayList == null) {
            next = null;
            break;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!"WALKING".equalsIgnoreCase(((al1.b) next).f3756a));
        al1.b bVar = (al1.b) next;
        ArrayList arrayList2 = this.f41553n;
        if (arrayList2 == null) {
            next2 = null;
            break;
        }
        Iterator it3 = arrayList2.iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
        } while (!"RUNNING".equalsIgnoreCase(((al1.b) next2).f3756a));
        al1.b bVar2 = (al1.b) next2;
        ArrayList arrayList3 = this.f41553n;
        if (arrayList3 == null) {
            next3 = null;
            break;
        }
        Iterator it4 = arrayList3.iterator();
        do {
            if (!it4.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it4.next();
        } while (!"WHEELCHAIR_PUSHING".equalsIgnoreCase(((al1.b) next3).f3756a));
        al1.b bVar3 = (al1.b) next3;
        s sVar = this.f41557r;
        if (bVar != null) {
            String str = bVar.f3757b;
            if ("delete".equalsIgnoreCase(str)) {
                this.f41541b++;
                g0 g0Var = this.f41551l;
                g0Var.getClass();
                f0.N(new x(g0Var, null)).f(this, sVar);
            }
            if ("create".equalsIgnoreCase(str) || "update".equalsIgnoreCase(str)) {
                s sVar2 = new s(this, 1);
                this.f41541b++;
                boolean zEqualsIgnoreCase = "create".equalsIgnoreCase(str);
                g0 g0Var2 = this.f41551l;
                if (zEqualsIgnoreCase) {
                    StepLengthDTO stepLengthDTODa = da();
                    g0Var2.getClass();
                    f0.N(new gg1.u(g0Var2, stepLengthDTODa, null)).f(this, sVar2);
                } else {
                    StepLengthDTO stepLengthDTODa2 = da();
                    g0Var2.getClass();
                    f0.N(new a0(g0Var2, stepLengthDTODa2, null)).f(this, sVar2);
                }
            }
        }
        if (bVar2 != null) {
            String str2 = bVar2.f3757b;
            if ("delete".equalsIgnoreCase(str2)) {
                this.f41541b++;
                g0 g0Var3 = this.f41551l;
                g0Var3.getClass();
                f0.N(new w(g0Var3, null)).f(this, sVar);
            }
            if ("create".equalsIgnoreCase(str2) || "update".equalsIgnoreCase(str2)) {
                s sVar3 = new s(this, 2);
                this.f41541b++;
                boolean zEqualsIgnoreCase2 = "create".equalsIgnoreCase(str2);
                g0 g0Var4 = this.f41551l;
                if (zEqualsIgnoreCase2) {
                    StepLengthDTO stepLengthDTOCa = ca();
                    g0Var4.getClass();
                    f0.N(new t(g0Var4, stepLengthDTOCa, null)).f(this, sVar3);
                } else {
                    StepLengthDTO stepLengthDTOCa2 = ca();
                    g0Var4.getClass();
                    f0.N(new z(g0Var4, stepLengthDTOCa2, null)).f(this, sVar3);
                }
            }
        }
        if (bVar3 != null) {
            String str3 = bVar3.f3757b;
            if ("delete".equalsIgnoreCase(str3)) {
                this.f41541b++;
                g0 g0Var5 = this.f41551l;
                g0Var5.getClass();
                f0.N(new y(g0Var5, null)).f(this, sVar);
            }
            if ("create".equalsIgnoreCase(str3) || "update".equalsIgnoreCase(str3)) {
                s sVar4 = new s(this, 3);
                this.f41541b++;
                boolean zEqualsIgnoreCase3 = "create".equalsIgnoreCase(str3);
                g0 g0Var6 = this.f41551l;
                if (zEqualsIgnoreCase3) {
                    i iVarEa = ea();
                    g0Var6.getClass();
                    f0.N(new v(g0Var6, iVarEa, null)).f(this, sVar4);
                } else {
                    i iVarEa2 = ea();
                    g0Var6.getClass();
                    f0.N(new b0(g0Var6, iVarEa2, null)).f(this, sVar4);
                }
            }
        }
        if (this.f41541b == 0) {
            finish();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.common_layout);
        this.f41551l = (g0) new x1(this).b(s0.f105811a.b(g0.class));
        if (d1.f()) {
            d1.o(this, new h1(this, 8));
        }
        androidx.fragment.app.v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
        u.E.getClass();
        u uVar = new u();
        uVar.setArguments(new Bundle());
        aVarB.l(R.id.content_frame, uVar, null);
        aVarB.d(null);
        aVarB.e();
        initActionBar(true, R.string.devices_settings_user_settings);
        if (bundle != null && bundle.containsKey("userSettingsKey") && bundle.containsKey("runningStepLengthKey") && bundle.containsKey("walkingStepLengthKey")) {
            UserSettingsDTO userSettingsDTO = (UserSettingsDTO) bundle.getParcelable("userSettingsKey");
            this.f41543d = userSettingsDTO;
            this.f41544e = userSettingsDTO.t1();
            this.f41546g = (StepLengthDTO) bundle.getParcelable("runningStepLengthKey");
            this.f41545f = (StepLengthDTO) bundle.getParcelable("walkingStepLengthKey");
            this.f41547h = (i) bundle.getParcelable("wheelchairPushLengthKey");
        } else {
            showProgressOverlay();
            this.f41540a++;
            this.f41548i = q.N().M(this.f41554o);
            this.f41540a++;
            g0 g0Var = this.f41551l;
            g0Var.getClass();
            f0.N(new d0(g0Var, null)).f(this, new s(this, 5));
            this.f41540a++;
            q qVarN = q.N();
            qVarN.getClass();
            this.f41550k = com.garmin.android.library.backgroundtaskmanagement.c.d(new l0(qVarN), this.f41556q);
            this.f41540a++;
            g0 g0Var2 = this.f41551l;
            g0Var2.getClass();
            f0.N(new c0(g0Var2, null)).f(this, new s(this, 7));
            this.f41540a++;
            g0 g0Var3 = this.f41551l;
            g0Var3.getClass();
            f0.N(new gg1.f0(g0Var3, null)).f(this, new s(this, 6));
            this.f41540a++;
            g0 g0Var4 = this.f41551l;
            g0Var4.getClass();
            f0.N(new e0(g0Var4, null)).f(this, new s(this, 4));
        }
        this.f41552m = registerForActivityResult(new h(), new a61.i(this, 22));
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, z6.e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("userSettingsKey", this.f41543d);
        bundle.putParcelable("runningStepLengthKey", this.f41546g);
        bundle.putParcelable("walkingStepLengthKey", this.f41545f);
        bundle.putParcelable("wheelchairPushLengthKey", this.f41547h);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        com.garmin.android.library.backgroundtaskmanagement.c cVar = com.garmin.android.library.backgroundtaskmanagement.c.f50123c;
        if (cVar.e(Long.valueOf(this.f41548i))) {
            cVar.a(this.f41548i);
        }
        if (cVar.e(Long.valueOf(this.f41549j))) {
            cVar.a(this.f41549j);
        }
        if (cVar.e(Long.valueOf(this.f41550k))) {
            cVar.a(this.f41550k);
        }
    }

    @Override // yk1.a
    public final void q0() {
        f.c<Intent> cVar = this.f41552m;
        StrideLengthSettingsActivity.f44198b.getClass();
        Intent intent = new Intent(this, (Class<?>) StrideLengthSettingsActivity.class);
        intent.putExtra("START_DESTINATION_EXTRA", "HomeSettingsScreen");
        cVar.a(intent, null);
    }
}
