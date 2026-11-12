package ra2;

import c83.a0;
import o13.r;
import p005kotlin.Metadata;
import qa2.j;
import qa2.k;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lra2/b;", "", "Lra2/g;", "reportsApiService", "<init>", "(Lra2/g;)V", "a", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wa2.b f151481b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f151482a;

    static {
        new a(null);
        f151481b = new wa2.b("ReportsApiHelper", null, 2, null);
    }

    public b(g gVar) {
        gVar.getClass();
        this.f151482a = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, v13.c cVar) {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f151485c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f151485c = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objC = cVar2.f151483a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f151485c;
        try {
            if (i15 == 0) {
                r.b(objC);
                g gVar = this.f151482a;
                cVar2.f151485c = 1;
                objC = gVar.c(str, cVar2);
                if (objC == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objC);
            }
            return Boolean.valueOf(((a0) objC).f25745a.isSuccessful());
        } catch (Exception e4) {
            f151481b.a("Exception sending acknowledgement " + e4.getMessage());
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, v13.c cVar) {
        d dVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f151488c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f151488c = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object obj = dVar.f151486a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f151488c;
        wa2.b bVar = f151481b;
        try {
            if (i15 != 0) {
                if (i15 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            bVar.getClass();
            g gVar = this.f151482a;
            dVar.f151488c = 1;
            Object objA = gVar.a(str, dVar);
            return objA == aVar ? aVar : objA;
        } catch (Exception e4) {
            bVar.a("Exception fetching response " + e4.getMessage());
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object c(String str, String str2, String str3, String str4, Object obj, v13.c cVar) {
        e eVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f151491c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f151491c = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        e eVar2 = eVar;
        Object obj2 = eVar2.f151489a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar2.f151491c;
        wa2.b bVar = f151481b;
        try {
            if (i15 != 0) {
                if (i15 == 1 || i15 == 2) {
                    r.b(obj2);
                    return obj2;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj2);
            bVar.getClass();
            g gVar = this.f151482a;
            if (obj != null) {
                eVar2.f151491c = 1;
                Object objB = gVar.b(str, str2, str3, str4, obj, eVar2);
                if (objB != aVar) {
                    return objB;
                }
            } else {
                wa2.a.f183799a.getClass();
                j jVar = new j(null, null, null, wa2.a.C3407a.d(), 7, null);
                eVar2.f151491c = 2;
                Object objB2 = gVar.b(str, str2, str3, str4, jVar, eVar2);
                if (objB2 != aVar) {
                    return objB2;
                }
            }
            return aVar;
        } catch (HttpException e4) {
            bVar.a("Http Exception fetching response " + e4.getMessage());
            if (e4.code() == 429) {
                return new qa2.b("", 0, k.TOO_MANY_REQUESTS.f143942a);
            }
            return null;
        } catch (Exception e14) {
            bVar.a("Exception fetching response " + e14.getMessage());
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, v13.c cVar) {
        f fVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f151494c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f151494c = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object obj = fVar.f151492a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f151494c;
        wa2.b bVar = f151481b;
        try {
            if (i15 != 0) {
                if (i15 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            bVar.getClass();
            g gVar = this.f151482a;
            fVar.f151494c = 1;
            Object objD = gVar.d(str, fVar);
            return objD == aVar ? aVar : objD;
        } catch (Exception e4) {
            bVar.a("Exception fetching response " + e4.getMessage());
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lra2/b$a;", "", "<init>", "()V", "Lwa2/b;", "logger", "Lwa2/b;", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
