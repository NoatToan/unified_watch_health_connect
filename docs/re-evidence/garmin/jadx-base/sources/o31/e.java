package o31;

import am.j;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateOptions;
import e23.p;
import ht2.n;
import o13.q;
import o13.r;
import o53.b0;
import o53.c0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import v13.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.inappupdate.InAppUpdateManager$autoCheckLatestVersion$1", f = "InAppUpdateManager.kt", l = {121, 121, 132}, m = "invokeSuspend", v = 2)
public final class e extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f128780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f128781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f128782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f128783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f128784e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, e23.a<Unit> aVar, t13.d<? super e> dVar2) {
        super(2, dVar2);
        this.f128783d = dVar;
        this.f128784e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f128783d, this.f128784e, dVar);
        eVar.f128782c = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0067  */
    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0072  */
    /* JADX WARN: Code duplicated, block: B:56:0x014d  */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x0072, please report this as an issue */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        n nVar;
        Object objA;
        Throwable thB;
        com.garmin.inappupdate.e eVar;
        com.garmin.inappupdate.e eVar2;
        Object bVar;
        b0 b0Var = (b0) this.f128782c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f128781b;
        d dVar = this.f128783d;
        e23.a<Unit> aVar2 = this.f128784e;
        if (i14 == 0) {
            r.b(obj);
            nVar = n.f85666a;
            this.f128782c = b0Var;
            this.f128780a = nVar;
            this.f128781b = 1;
            obj = ge1.b.e0(dVar.f128766c, new g(dVar, null), this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            nVar = (n) this.f128780a;
            r.b(obj);
        } else {
            if (i14 == 2) {
                r.b(obj);
                objA = ((q) obj).f128597a;
                thB = q.b(objA);
                if (thB == null) {
                    String strP = j.p("Remote config -> In-app update check failed: ", thB);
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar3.getClass();
                    i2.a.f(a2Var, "InAppUpdateManager", strP);
                    aVar2.invoke();
                    return Unit.INSTANCE;
                }
                eVar = (com.garmin.inappupdate.e) objA;
                if (!c0.g(b0Var)) {
                    return Unit.INSTANCE;
                }
                i2.a aVar4 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar4.getClass();
                i2.a.b(a2Var2, "InAppUpdateManager", "Remote config -> In-app update check successful update: " + eVar);
                if (eVar == null && eVar.f52422a != com.garmin.inappupdate.d.NONE) {
                    i2.a.b(a2Var2, "InAppUpdateManager", "Remote config -> In-app update available: " + eVar);
                    this.f128782c = b0Var;
                    this.f128780a = eVar;
                    this.f128781b = 3;
                    Object objA2 = d.a(dVar, eVar, this);
                    if (objA2 != aVar) {
                        eVar2 = eVar;
                        obj = objA2;
                    }
                    return aVar;
                }
                aVar2.invoke();
                return Unit.INSTANCE;
            }
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            eVar2 = (com.garmin.inappupdate.e) this.f128780a;
            r.b(obj);
        }
        AppUpdateInfo appUpdateInfo = (AppUpdateInfo) obj;
        if (!c0.g(b0Var)) {
            return Unit.INSTANCE;
        }
        if (appUpdateInfo != null) {
            try {
                int i15 = q.f128596b;
                dVar.f128765b.u2(eVar2.f52422a.f52420a, "in_app_update_started_prompt_type");
                AppUpdateManager appUpdateManagerB = dVar.b();
                f.c<f.i> cVar = dVar.f128768e;
                if (cVar == null) {
                    s.m("inAppUpdateLauncher");
                    throw null;
                }
                bVar = Boolean.valueOf(appUpdateManagerB.startUpdateFlowForResult(appUpdateInfo, cVar, AppUpdateOptions.newBuilder(eVar2.f52422a.f52420a).build()));
                Throwable thB2 = q.b(bVar);
                if (thB2 != null) {
                    String strP2 = j.p("Failed to start in-app update flow: ", thB2);
                    i2.a aVar5 = i2.f36769a;
                    a2 a2Var3 = a2.GENERAL;
                    aVar5.getClass();
                    i2.a.f(a2Var3, "InAppUpdateManager", strP2);
                    aVar2.invoke();
                }
                if (!(bVar instanceof q.b)) {
                    i2.a aVar6 = i2.f36769a;
                    a2 a2Var4 = a2.GENERAL;
                    aVar6.getClass();
                    i2.a.b(a2Var4, "InAppUpdateManager", "In-app update flow started successfully");
                }
                q.a(bVar);
            } catch (Throwable th3) {
                int i16 = q.f128596b;
                bVar = new q.b(th3);
            }
        } else {
            String str = "No in-app update available or not allowed for promptType: " + eVar2.f52422a;
            i2.a aVar7 = i2.f36769a;
            a2 a2Var5 = a2.GENERAL;
            aVar7.getClass();
            i2.a.b(a2Var5, "InAppUpdateManager", str);
            aVar2.invoke();
        }
        return Unit.INSTANCE;
        this.f128782c = b0Var;
        this.f128780a = null;
        this.f128781b = 2;
        objA = nVar.a((ht2.g) obj, this);
        if (objA != aVar) {
            thB = q.b(objA);
            if (thB == null) {
                String strP3 = j.p("Remote config -> In-app update check failed: ", thB);
                i2.a aVar8 = i2.f36769a;
                a2 a2Var6 = a2.GENERAL;
                aVar8.getClass();
                i2.a.f(a2Var6, "InAppUpdateManager", strP3);
                aVar2.invoke();
                return Unit.INSTANCE;
            }
            eVar = (com.garmin.inappupdate.e) objA;
            if (!c0.g(b0Var)) {
                return Unit.INSTANCE;
            }
            i2.a aVar9 = i2.f36769a;
            a2 a2Var7 = a2.GENERAL;
            aVar9.getClass();
            i2.a.b(a2Var7, "InAppUpdateManager", "Remote config -> In-app update check successful update: " + eVar);
            if (eVar == null) {
            }
            aVar2.invoke();
            return Unit.INSTANCE;
        }
        return aVar;
    }
}
