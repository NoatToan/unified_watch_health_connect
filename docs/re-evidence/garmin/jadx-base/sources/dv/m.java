package dv;

import c83.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.apps.connectmobile.w2;
import gw.g0;
import lc.u0;
import o13.r;
import o53.i0;
import o53.s;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zb0.c0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Ldv/m;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lzb0/c0;", "settingsApiService", "<init>", "(Lzb0/c0;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m implements f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f61336b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f61337a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.bic.SetupWizardRepo", f = "SetupWizardRepo.kt", l = {55}, m = "saveDeviceSettings", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f61338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f61339b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f61341d;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f61339b = obj;
            this.f61341d |= Integer.MIN_VALUE;
            return m.this.a(0L, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.bic.SetupWizardRepo$saveDeviceSettings$result$1", f = "SetupWizardRepo.kt", l = {55}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.l<t13.d<? super a0<Unit>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f61342a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f61344c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f61345d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j8, String str, t13.d<? super c> dVar) {
            super(1, dVar);
            this.f61344c = j8;
            this.f61345d = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return m.this.new c(this.f61344c, this.f61345d, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super a0<Unit>> dVar) {
            return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f61342a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            i0<a0<Unit>> i0VarA = m.this.f61337a.a(this.f61344c, this.f61345d);
            this.f61342a = 1;
            Object objAwait = i0VarA.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    public m(c0 c0Var) {
        c0Var.getClass();
        this.f61337a = c0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(long j8, String str, t13.d<? super Boolean> dVar) {
        b bVar;
        String str2;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f61341d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f61341d = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        b bVar2 = bVar;
        Object objJ = bVar2.f61339b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar2.f61341d;
        if (i15 == 0) {
            r.b(objJ);
            a2 a2Var = a2.BIC;
            String strN = fb1.c.n("Saving device settings to GC JSON delta = ", str);
            i2.f36769a.getClass();
            i2.a.b(a2Var, "SetupWizardRepo", strN);
            c cVar = new c(j8, str, null);
            bVar2.f61338a = str;
            bVar2.f61341d = 1;
            objJ = f0.J(this, cVar, bVar2);
            if (objJ == aVar) {
                return aVar;
            }
            str2 = str;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = bVar2.f61338a;
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            a2 a2Var2 = a2.BIC;
            String strN2 = fb1.c.n("Success saving device settings to GC: ", str2);
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "SetupWizardRepo", strN2);
            return Boolean.TRUE;
        }
        if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        w2.b((v2.a) v2Var, a2.BIC, "SetupWizardRepo", "Error saving device settings to GC: " + str2);
        return Boolean.FALSE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(UserSettingsDTO userSettingsDTO, JSONObject jSONObject, v13.c cVar) {
        o oVar;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i14 = oVar.f61351c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar.f61351c = i14 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object obj = oVar.f61349a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = oVar.f61351c;
        try {
            if (i15 == 0) {
                r.b(obj);
                i2.f36769a.getClass();
                i2.a.b(a2.BIC, "SetupWizardRepo", "Saving user settings to GC JSON delta = " + jSONObject);
                o53.r<UserSettingsDTO> rVarK = new g0(null, userSettingsDTO, jSONObject).k();
                oVar.f61351c = 1;
                if (((s) rVarK).C(oVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Boolean.TRUE;
        } catch (Throwable th3) {
            a2 a2Var = a2.BIC;
            String strP = am.j.p("Error saving user settings to GC ", th3);
            i2.f36769a.getClass();
            i2.a.f(a2Var, "SetupWizardRepo", strP);
            return Boolean.FALSE;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ldv/m$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static m a(a aVar) {
            c0 c0Var = (c0) ez0.b.a(ez0.b.f67468a, ez0.c.GC, c0.class, new c83.h.a[0], null, null, null, 120);
            aVar.getClass();
            c0Var.getClass();
            return new m(c0Var);
        }

        private a() {
        }
    }
}
