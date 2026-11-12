package ao;

import java.util.ArrayList;
import java.util.List;
import o13.q;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lao/j;", "Lao/d;", "Lao/a;", "activitiesApi", "Lao/k;", "activitiesSearchPreferences", "<init>", "(Lao/a;Lao/k;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f11525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f11526b;

    public j(a aVar, k kVar) {
        aVar.getClass();
        kVar.getClass();
        this.f11525a = aVar;
        this.f11526b = kVar;
    }

    @Override // ao.d
    public final List<String> a() {
        return this.f11526b.a();
    }

    @Override // ao.d
    public final void b(String str) {
        str.getClass();
        this.f11526b.b(str);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // ao.d
    public final Object c(int i14, int i15, int i16, String str, v13.c cVar) {
        h hVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i17 = hVar.f11521c;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                hVar.f11521c = i17 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        h hVar2 = hVar;
        Object objC = hVar2.f11519a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i18 = hVar2.f11521c;
        try {
            if (i18 == 0) {
                r.b(objC);
                int i19 = q.f128596b;
                a aVar2 = this.f11525a;
                hVar2.f11521c = 1;
                objC = aVar2.c(i14, str, i15, i16, hVar2);
                if (objC == aVar) {
                    return aVar;
                }
            } else {
                if (i18 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objC);
            }
            bo.d dVar = (bo.d) objC;
            int i24 = q.f128596b;
            return dVar;
        } catch (Throwable th3) {
            int i25 = q.f128596b;
            return new q.b(th3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ao.d
    public final Object d(bo.b bVar, v13.c cVar) {
        f fVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f11515c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f11515c = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objD = fVar.f11513a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f11515c;
        try {
            if (i15 == 0) {
                r.b(objD);
                int i16 = q.f128596b;
                a aVar2 = this.f11525a;
                fVar.f11515c = 1;
                objD = aVar2.d(bVar, fVar);
                if (objD == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objD);
            }
            bo.f fVar2 = (bo.f) objD;
            int i17 = q.f128596b;
            return fVar2;
        } catch (Throwable th3) {
            int i18 = q.f128596b;
            return new q.b(th3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ao.d
    public final Object e(long j8, v13.c cVar) {
        e eVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f11512c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f11512c = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object obj = eVar.f11510a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f11512c;
        try {
            if (i15 == 0) {
                r.b(obj);
                int i16 = q.f128596b;
                a aVar2 = this.f11525a;
                eVar.f11512c = 1;
                if (aVar2.b(j8, eVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i17 = q.f128596b;
            return unit;
        } catch (Throwable th3) {
            int i18 = q.f128596b;
            return new q.b(th3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // ao.d
    public final Object f(String str, int i14, int i15, ArrayList arrayList, v13.c cVar) {
        i iVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i16 = iVar.f11524c;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                iVar.f11524c = i16 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        i iVar2 = iVar;
        Object objE = iVar2.f11522a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = iVar2.f11524c;
        try {
            if (i17 == 0) {
                r.b(objE);
                int i18 = q.f128596b;
                a aVar2 = this.f11525a;
                iVar2.f11524c = 1;
                objE = aVar2.e(str, i14, i15, arrayList, iVar2);
                if (objE == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objE);
            }
            List list = (List) objE;
            int i19 = q.f128596b;
            return list;
        } catch (Throwable th3) {
            int i24 = q.f128596b;
            return new q.b(th3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ao.d
    public final Object g(bo.b bVar, v13.c cVar) {
        g gVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f11518c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f11518c = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objF = gVar.f11516a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f11518c;
        try {
            if (i15 == 0) {
                r.b(objF);
                int i16 = q.f128596b;
                a aVar2 = this.f11525a;
                gVar.f11518c = 1;
                objF = aVar2.f(bVar, gVar);
                if (objF == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objF);
            }
            bo.d dVar = (bo.d) objF;
            int i17 = q.f128596b;
            return dVar;
        } catch (Throwable th3) {
            int i18 = q.f128596b;
            return new q.b(th3);
        }
    }
}
