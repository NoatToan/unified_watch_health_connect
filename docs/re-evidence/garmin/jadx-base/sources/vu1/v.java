package vu1;

import c22.j0;
import c22.t3;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.b0;
import org.joda.time.DateTime;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTDashBoardViewModel$updatePlanWith$1", f = "FBTDashBoardViewModel.kt", l = {191, 198}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f180383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f180384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f180385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f180386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f180387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tw1.p f180388f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(boolean z14, o oVar, long j8, tw1.p pVar, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f180385c = z14;
        this.f180386d = oVar;
        this.f180387e = j8;
        this.f180388f = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        v vVar = new v(this.f180385c, this.f180386d, this.f180387e, this.f180388f, dVar);
        vVar.f180384b = obj;
        return vVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003b  */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r13 == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        if (r13 == r1) goto L20;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f180384b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f180383a;
        boolean zBooleanValue = true;
        o oVar = this.f180386d;
        if (i14 == 0) {
            o13.r.b(obj);
            if (!this.f180385c) {
                if (zBooleanValue) {
                    oVar.d5().m(g3.a.c(g3.f35298f));
                    kv1.b bVar = oVar.I;
                    this.f180384b = b0Var;
                    this.f180383a = 2;
                    bVar.getClass();
                    obj = f0.J(bVar, new kv1.p(bVar, this.f180387e, this.f180388f, null), this);
                }
                return Unit.INSTANCE;
            }
            this.f180384b = b0Var;
            this.f180383a = 1;
            obj = oVar.h5(this);
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        v2 v2Var = (v2) obj;
        if (v2Var instanceof v2.b) {
            String strB = p005kotlin.jvm.internal.s.g(this.f180388f.getStatusKey(), "Paused") ? j0.b(DateTime.now(), "yyyy-MM-dd", null) : null;
            oVar.c5();
            wt1.a aVar2 = (wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null);
            UserSettingsDTO userSettings = aVar2.getUserSettings();
            UserSettingsDTO userSettingsDTOC = userSettings.C();
            wi1.j jVar = userSettings.f43524b;
            if (jVar != null) {
                jVar.f185557v = strB;
            }
            JSONObject jSONObjectB = t3.b(userSettings.t1(), userSettingsDTOC.t1());
            if (jSONObjectB != null) {
                oVar.L0.add(Long.valueOf(aVar2.a(userSettings, jSONObjectB, oVar.M0)));
            }
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            v2.a aVar3 = (v2.a) v2Var;
            String str = "Failed to update plan status. " + aVar3.f47385c + ": " + aVar3.f47383a;
            i2.a aVar4 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar4.getClass();
            i2.a.f(a2Var, "FBTDashBoardViewModel", str);
            oVar.d5().m(g3.a.a(g3.f35298f, aVar3.f47385c, aVar3.f47383a, null, null, 12));
        }
        return Unit.INSTANCE;
        zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue) {
            oVar.d5().m(g3.a.c(g3.f35298f));
            kv1.b bVar2 = oVar.I;
            this.f180384b = b0Var;
            this.f180383a = 2;
            bVar2.getClass();
            obj = f0.J(bVar2, new kv1.p(bVar2, this.f180387e, this.f180388f, null), this);
        }
        return Unit.INSTANCE;
    }
}
