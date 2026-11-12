package j20;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.contacts.emergency.EmergencyContactViewModel$saveAndValidateContact$1", f = "EmergencyContactViewModel.kt", l = {297, 298, 317, 318}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f96583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f96584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.contacts.emergency.d f96585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f96586d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.garmin.android.apps.connectmobile.contacts.emergency.d dVar, boolean z14, t13.d<? super m> dVar2) {
        super(2, dVar2);
        this.f96585c = dVar;
        this.f96586d = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        m mVar = new m(this.f96585c, this.f96586d, dVar);
        mVar.f96584b = obj;
        return mVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:47:0x0101  */
    /* JADX WARN: Code duplicated, block: B:63:0x015f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0194  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (r0 == r6) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009d, code lost:
    
        if (r0 == r6) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013c, code lost:
    
        if (r0 == r6) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0156, code lost:
    
        if (r0 == r6) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objH;
        Object objF;
        Object objQ;
        Object objH2;
        v2 v2Var;
        v2 v2Var2;
        b0 b0Var = (b0) this.f96584b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f96583a;
        com.garmin.android.apps.connectmobile.contacts.emergency.d dVar = this.f96585c;
        if (i14 == 0) {
            o13.r.b(obj);
            l20.a aVar2 = dVar.f32646e;
            hl.a aVar3 = dVar.f32645d;
            String contactId = aVar2.getContactId();
            if (contactId != null && contactId.length() != 0) {
                l20.c cVar = dVar.f32647f;
                if (cVar != null) {
                    if (!g22.n.d(cVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String())) {
                        a2 a2Var = a2.SAFETY_FEATURES;
                        i2.f36769a.getClass();
                        i2.a.b(a2Var, "EmergencyContactViewModel", "[saveAndValidateContact] Called when contactInfoDTO hasn't been edited");
                    } else if (p005kotlin.jvm.internal.s.g(aVar3, hl.a.c.f84256b)) {
                        m20.z zVar = dVar.T;
                        l20.a aVar4 = dVar.f32646e;
                        this.f96584b = b0Var;
                        this.f96583a = 3;
                        objH2 = zVar.h(aVar4, this);
                    } else {
                        if (!(aVar3 instanceof hl.a.b)) {
                            u0.r();
                            return null;
                        }
                        re0.o oVar = dVar.X;
                        long j8 = ((hl.a.b) aVar3).f84252b;
                        String contactId2 = dVar.f32646e.getContactId();
                        if (contactId2 == null) {
                            contactId2 = "";
                        }
                        l20.a aVar5 = dVar.f32646e;
                        this.f96584b = b0Var;
                        this.f96583a = 4;
                        objQ = oVar.q(j8, contactId2, aVar5, this);
                    }
                    y0<g3<o13.u<l20.a, l20.c, Boolean>>> y0Var = dVar.f32652k;
                    g3.a aVar6 = g3.f35298f;
                    o13.u uVar = new o13.u(dVar.f32646e, dVar.f32647f, Boolean.FALSE);
                    aVar6.getClass();
                    y0Var.j(g3.a.d(uVar));
                    if (!this.f96586d) {
                        dVar.f32655n = null;
                        dVar.P4();
                    }
                } else {
                    a2 a2Var2 = a2.SAFETY_FEATURES;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var2, "EmergencyContactViewModel", "[saveAndValidateContact] Posting LiveData to prevent infinite running man. This should not happen.");
                    dVar.f32652k.j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                }
            } else if (p005kotlin.jvm.internal.s.g(aVar3, hl.a.c.f84256b)) {
                m20.z zVar2 = dVar.T;
                l20.a aVar7 = dVar.f32646e;
                this.f96584b = b0Var;
                this.f96583a = 1;
                objF = zVar2.f(aVar7, this);
            } else {
                if (!(aVar3 instanceof hl.a.b)) {
                    u0.r();
                    return null;
                }
                re0.o oVar2 = dVar.X;
                long j14 = ((hl.a.b) aVar3).f84252b;
                l20.a aVar8 = dVar.f32646e;
                this.f96584b = b0Var;
                this.f96583a = 2;
                objH = oVar2.h(j14, aVar8, this);
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            objF = obj;
            v2Var = (v2) objF;
            if (v2Var instanceof v2.b) {
                l20.a aVar9 = (l20.a) ((v2.b) v2Var).f47386a;
                dVar.f32646e = aVar9;
                l20.c cVar2 = dVar.f32647f;
                cVar2.getClass();
                String str = cVar2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                str.getClass();
                l20.c cVarH = aVar9.h(str);
                dVar.f32647f = cVarH;
                y0<g3<o13.u<l20.a, l20.c, Boolean>>> y0Var2 = dVar.f32652k;
                g3.a aVar10 = g3.f35298f;
                o13.u uVar2 = new o13.u(dVar.f32646e, cVarH, Boolean.FALSE);
                aVar10.getClass();
                y0Var2.j(g3.a.d(uVar2));
                dVar.P4();
            } else {
                dVar.f32652k.j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                a2 a2Var3 = a2.SAFETY_FEATURES;
                String strF = b71.i.f("[saveAndValidateContact] Could not create contact! Result = ", v2Var);
                i2.f36769a.getClass();
                i2.a.f(a2Var3, "EmergencyContactViewModel", strF);
            }
        } else if (i14 == 2) {
            o13.r.b(obj);
            objH = obj;
            v2Var = (v2) objH;
            if (v2Var instanceof v2.b) {
                l20.a aVar11 = (l20.a) ((v2.b) v2Var).f47386a;
                dVar.f32646e = aVar11;
                l20.c cVar3 = dVar.f32647f;
                cVar3.getClass();
                String str2 = cVar3.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                str2.getClass();
                l20.c cVarH2 = aVar11.h(str2);
                dVar.f32647f = cVarH2;
                y0<g3<o13.u<l20.a, l20.c, Boolean>>> y0Var3 = dVar.f32652k;
                g3.a aVar12 = g3.f35298f;
                o13.u uVar3 = new o13.u(dVar.f32646e, cVarH2, Boolean.FALSE);
                aVar12.getClass();
                y0Var3.j(g3.a.d(uVar3));
                dVar.P4();
            } else {
                dVar.f32652k.j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                a2 a2Var4 = a2.SAFETY_FEATURES;
                String strF2 = b71.i.f("[saveAndValidateContact] Could not create contact! Result = ", v2Var);
                i2.f36769a.getClass();
                i2.a.f(a2Var4, "EmergencyContactViewModel", strF2);
            }
        } else if (i14 == 3) {
            o13.r.b(obj);
            objH2 = obj;
            v2Var2 = (v2) objH2;
            if (v2Var2 instanceof v2.b) {
                l20.a aVar13 = (l20.a) ((v2.b) v2Var2).f47386a;
                dVar.f32646e = aVar13;
                l20.c cVar4 = dVar.f32647f;
                cVar4.getClass();
                String str3 = cVar4.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                str3.getClass();
                dVar.f32647f = aVar13.h(str3);
            } else {
                a2 a2Var5 = a2.SAFETY_FEATURES;
                String strF3 = b71.i.f("[saveAndValidateContact] Could not update contact! Result = ", v2Var2);
                i2.f36769a.getClass();
                i2.a.p(a2Var5, "EmergencyContactViewModel", strF3);
            }
            y0<g3<o13.u<l20.a, l20.c, Boolean>>> y0Var4 = dVar.f32652k;
            g3.a aVar14 = g3.f35298f;
            o13.u uVar4 = new o13.u(dVar.f32646e, dVar.f32647f, Boolean.FALSE);
            aVar14.getClass();
            y0Var4.j(g3.a.d(uVar4));
            if (!this.f96586d) {
                dVar.f32655n = null;
                dVar.P4();
            }
        } else {
            if (i14 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            objQ = obj;
            v2Var2 = (v2) objQ;
            if (v2Var2 instanceof v2.b) {
                l20.a aVar15 = (l20.a) ((v2.b) v2Var2).f47386a;
                dVar.f32646e = aVar15;
                l20.c cVar5 = dVar.f32647f;
                cVar5.getClass();
                String str4 = cVar5.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
                str4.getClass();
                dVar.f32647f = aVar15.h(str4);
            } else {
                a2 a2Var6 = a2.SAFETY_FEATURES;
                String strF4 = b71.i.f("[saveAndValidateContact] Could not update contact! Result = ", v2Var2);
                i2.f36769a.getClass();
                i2.a.p(a2Var6, "EmergencyContactViewModel", strF4);
            }
            y0<g3<o13.u<l20.a, l20.c, Boolean>>> y0Var5 = dVar.f32652k;
            g3.a aVar16 = g3.f35298f;
            o13.u uVar5 = new o13.u(dVar.f32646e, dVar.f32647f, Boolean.FALSE);
            aVar16.getClass();
            y0Var5.j(g3.a.d(uVar5));
            if (!this.f96586d) {
                dVar.f32655n = null;
                dVar.P4();
            }
        }
        return Unit.INSTANCE;
    }
}
