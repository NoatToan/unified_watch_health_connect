package pj1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.safetyfeatures.BaseSafetyFeaturesViewModel$saveEccContacts$1", f = "BaseSafetyFeaturesViewModel.kt", l = {72, 73}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f137931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tj1.e f137932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hl.a f137933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f137934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l<v2<Unit>, Unit> f137935e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(tj1.e eVar, hl.a aVar, e eVar2, e23.l<? super v2<Unit>, Unit> lVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f137932b = eVar;
        this.f137933c = aVar;
        this.f137934d = eVar2;
        this.f137935e = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f137932b, this.f137933c, this.f137934d, this.f137935e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0083, code lost:
    
        if (r2 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a0, code lost:
    
        if (r2 == r1) goto L25;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v2<Unit> v2Var;
        Object objC;
        Object objJ;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f137931a;
        e eVar = this.f137934d;
        hl.a aVar2 = this.f137933c;
        if (i14 == 0) {
            o13.r.b(obj);
            tj1.e eVar2 = this.f137932b;
            if (eVar2 != null) {
                if (p005kotlin.jvm.internal.s.g(aVar2, hl.a.c.f84256b)) {
                    m20.z zVar = (m20.z) eVar.f137901c.getValue();
                    this.f137931a = 1;
                    zVar.getClass();
                    objJ = com.garmin.android.apps.connectmobile.contacts.b.e() ? f0.J(zVar, new m20.t((m20.a0) ez0.b.a(ez0.b.f67468a, ez0.c.GC, m20.a0.class, new c83.h.a[0], null, null, null, 120), eVar2, null), this) : f0.J(zVar, new m20.u((m20.g) ez0.b.a(ez0.b.f67468a, ez0.c.GC, m20.g.class, new c83.h.a[0], null, null, null, 120), eVar2, null), this);
                } else {
                    if (!(aVar2 instanceof hl.a.b)) {
                        u0.r();
                        return null;
                    }
                    re0.o oVar = (re0.o) eVar.f137902d.getValue();
                    long j8 = ((hl.a.b) aVar2).f84252b;
                    this.f137931a = 2;
                    objC = oVar.c(j8, eVar2, this);
                }
                return aVar;
            }
            v2Var = null;
        } else if (i14 == 1) {
            o13.r.b(obj);
            objJ = obj;
            v2Var = (v2) objJ;
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objC = obj;
            v2Var = (v2) objC;
        }
        if (p005kotlin.jvm.internal.s.g(aVar2, hl.a.c.f84256b) && (v2Var instanceof v2.b)) {
            int i15 = e.f137898o;
            eVar.getClass();
            eq0.a.C1382a c1382a = eq0.a.f65038b;
            eq0.a aVarA = c1382a.a();
            aVarA.getClass();
            com.garmin.android.library.backgroundtaskmanagement.c.d(new fq0.g(aVarA), null);
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.SAFETY_FEATURES;
            aVar3.getClass();
            i2.a.b(a2Var, "SafetyUtils", "Sending emergency contacts to devices");
            eq0.a aVarA2 = c1382a.a();
            aVarA2.getClass();
            com.garmin.android.library.backgroundtaskmanagement.c.d(new fq0.f(aVarA2), null);
            yr1.e.c("EmergencyContacts", SupportedCapability.CONTACTS_SUPPORT);
        }
        this.f137935e.invoke(v2Var);
        return Unit.INSTANCE;
    }
}
