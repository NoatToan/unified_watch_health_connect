package re2;

import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lve2/d;", "<anonymous>", "(Lo53/b0;)Lve2/d;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.AuthenticationHelper$refreshUserProfile$2", f = "AuthenticationHelper.kt", l = {1993, 1999, 1999, 2007, 2011}, m = "invokeSuspend")
public final class s extends v13.i implements e23.p<o53.b0, t13.d<? super ve2.d>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f152330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f152331b;

    public s(t13.d<? super s> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s(dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super ve2.d> dVar) {
        return new s(dVar).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0092  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ce, code lost:
    
        if (r12 == r0) goto L46;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        b bVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f152331b;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                b bVar2 = b.f152215a;
                b.c cVar = b.c.DEFAULT;
                bVar2.getClass();
                b.K("refreshUserProfile", cVar, null);
                bVar2.I("refreshUserProfile");
                bVar2.L();
                b.M(sc2.a.f158478d);
                te2.k0 k0Var = new te2.k0();
                this.f152331b = 1;
                if (k0Var.c(this) == aVar) {
                }
                return aVar;
            }
            if (i14 != 1) {
                if (i14 == 2) {
                    bVar = this.f152330a;
                    o13.r.b(obj);
                    this.f152330a = null;
                    this.f152331b = 3;
                    obj = b.e(bVar, (ve2.e) obj, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 3) {
                        if (i14 == 4) {
                            o13.r.b(obj);
                            return (ve2.d) obj;
                        }
                        if (i14 == 5) {
                            o13.r.b(obj);
                            return (ve2.d) obj;
                        }
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return (ve2.d) obj;
            }
            o13.r.b(obj);
            bVar = b.f152215a;
            bVar.getClass();
            ve2.q qVar = b.m().f177761b;
            sc2.a aVar2 = sc2.a.f158477c;
            boolean zA = qVar.a(aVar2);
            if (zA && !b.m().f177766g) {
                this.f152330a = bVar;
                this.f152331b = 2;
                obj = b.q(this);
                if (obj != aVar) {
                    this.f152330a = null;
                    this.f152331b = 3;
                    obj = b.e(bVar, (ve2.e) obj, this);
                    if (obj == aVar) {
                    }
                    return (ve2.d) obj;
                }
            } else {
                if (zA) {
                    b.M(aVar2);
                    b.f152216b.debug("refreshUserProfile");
                    this.f152331b = 4;
                    x53.c cVar2 = s0.f129406a;
                    obj = ge1.b.e0(x53.b.f189152a, new t(1, null), this);
                    if (obj == aVar) {
                    }
                    return (ve2.d) obj;
                }
                b.M(sc2.a.f158478d);
                b.f152216b.debug("refreshUserProfile");
                this.f152331b = 5;
                x53.c cVar3 = s0.f129406a;
                obj = ge1.b.e0(x53.b.f189152a, new v(null), this);
            }
            return aVar;
        } catch (Exception e4) {
            b.f152216b.error("refreshUserProfile", (Throwable) e4);
            throw e4;
        }
    }
}
