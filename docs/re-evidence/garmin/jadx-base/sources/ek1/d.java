package ek1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lek1/d;", "", "Lnk1/g;", "repository", "<init>", "(Lnk1/g;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f64430b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nk1.g f64431a;

    static {
        new a(null);
        nk1.g.a aVar = nk1.g.f126421b;
    }

    public d(nk1.g gVar) {
        gVar.getClass();
        this.f64431a = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:31:0x0085  */
    /* JADX WARN: Code duplicated, block: B:34:0x0094  */
    /* JADX WARN: Code duplicated, block: B:36:0x0098  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(String str, hk1.w wVar, v13.c cVar) {
        e eVar;
        d dVar;
        String str2;
        d dVar2;
        v2 v2Var;
        v2 v2Var2;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f64437f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f64437f = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objJ = eVar.f64435d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f64437f;
        if (i15 != 0) {
            if (i15 == 1) {
                dVar2 = eVar.f64434c;
                wVar = eVar.f64433b;
                str2 = eVar.f64432a;
                o13.r.b(objJ);
                v2Var = (v2) objJ;
                dVar2.getClass();
                if (v2Var instanceof v2.b) {
                    v2.b bVar = (v2.b) v2Var;
                    ((Unit) bVar.f47386a).getClass();
                    String str3 = ((hk1.w.a) wVar).f84207a;
                    return new v2.b(new hk1.q.a(str3 != null ? str3 : "", str2), bVar.f47387b, null, null, 12, null);
                }
                if (v2Var instanceof v2.a) {
                    v2.a aVar2 = (v2.a) v2Var;
                    return new v2.a(aVar2.f47383a, aVar2.f47384b, aVar2.f47385c);
                }
                u0.r();
                return null;
            }
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dVar = eVar.f64434c;
            o13.r.b(objJ);
            v2Var2 = (v2) objJ;
            dVar.getClass();
            if (v2Var2 instanceof v2.b) {
                v2.b bVar2 = (v2.b) v2Var2;
                hk1.a aVar3 = (hk1.a) bVar2.f47386a;
                aVar3.getClass();
                return new v2.b(new hk1.q.c(aVar3), bVar2.f47387b, null, null, 12, null);
            }
            if (v2Var2 instanceof v2.a) {
                v2.a aVar4 = (v2.a) v2Var2;
                return new v2.a(aVar4.f47383a, aVar4.f47384b, aVar4.f47385c);
            }
            u0.r();
            return null;
        }
        o13.r.b(objJ);
        boolean z14 = wVar instanceof hk1.w.a;
        nk1.g gVar = this.f64431a;
        if (z14) {
            hk1.w.a aVar5 = (hk1.w.a) wVar;
            String str4 = aVar5.f84207a;
            if (str4 == null) {
                str4 = "";
            }
            eVar.f64432a = str;
            eVar.f64433b = aVar5;
            eVar.f64434c = this;
            eVar.f64437f = 1;
            objJ = f0.J(gVar, new nk1.i(gVar, str4, str, null), eVar);
            if (objJ != aVar) {
                str2 = str;
                dVar2 = this;
                v2Var = (v2) objJ;
                dVar2.getClass();
                if (v2Var instanceof v2.b) {
                    v2.b bVar3 = (v2.b) v2Var;
                    ((Unit) bVar3.f47386a).getClass();
                    String str5 = ((hk1.w.a) wVar).f84207a;
                    return new v2.b(new hk1.q.a(str5 != null ? str5 : "", str2), bVar3.f47387b, null, null, 12, null);
                }
                if (v2Var instanceof v2.a) {
                    v2.a aVar6 = (v2.a) v2Var;
                    return new v2.a(aVar6.f47383a, aVar6.f47384b, aVar6.f47385c);
                }
                u0.r();
                return null;
            }
        } else {
            if (!(wVar instanceof hk1.w.b)) {
                return new v2.a(new Exception("Unsupported third party data"), null, null, 6, null);
            }
            eVar.f64432a = null;
            eVar.f64433b = null;
            eVar.f64434c = this;
            eVar.f64437f = 2;
            objJ = f0.J(gVar, new nk1.n(gVar, (hk1.w.b) wVar, null), eVar);
            if (objJ != aVar) {
                dVar = this;
                v2Var2 = (v2) objJ;
                dVar.getClass();
                if (v2Var2 instanceof v2.b) {
                    v2.b bVar4 = (v2.b) v2Var2;
                    hk1.a aVar7 = (hk1.a) bVar4.f47386a;
                    aVar7.getClass();
                    return new v2.b(new hk1.q.c(aVar7), bVar4.f47387b, null, null, 12, null);
                }
                if (v2Var2 instanceof v2.a) {
                    v2.a aVar8 = (v2.a) v2Var2;
                    return new v2.a(aVar8.f47383a, aVar8.f47384b, aVar8.f47385c);
                }
                u0.r();
                return null;
            }
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00be  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00df  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(hk1.w wVar, String str, String str2, List list, jk1.h.a aVar, jk1.g gVar, jk1.g gVar2, v13.c cVar) {
        f fVar;
        e23.l lVar;
        e23.l lVar2;
        e23.l lVar3;
        Object obj;
        e23.l lVar4;
        e23.l lVar5;
        e23.l lVar6;
        v2 v2Var;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f64446i;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f64446i = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objA = fVar.f64444g;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f64446i;
        if (i15 == 0) {
            o13.r.b(objA);
            fVar.f64438a = str2;
            fVar.f64439b = list;
            fVar.f64440c = aVar;
            fVar.f64441d = gVar;
            fVar.f64442e = gVar2;
            fVar.f64446i = 1;
            objA = a(str, wVar, fVar);
            if (objA != obj2) {
            }
            lVar3 = aVar;
            lVar2 = gVar;
            lVar = gVar2;
            return obj2;
        }
        if (i15 == 1) {
            e23.l lVar7 = fVar.f64442e;
            e23.l lVar8 = fVar.f64441d;
            e23.l lVar9 = fVar.f64440c;
            list = fVar.f64439b;
            str2 = fVar.f64438a;
            o13.r.b(objA);
            lVar3 = lVar9;
            lVar2 = lVar8;
            lVar = lVar7;
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = fVar.f64443f;
            e23.l lVar10 = fVar.f64442e;
            e23.l lVar11 = fVar.f64441d;
            e23.l lVar12 = fVar.f64440c;
            o13.r.b(objA);
            lVar6 = lVar10;
            lVar5 = lVar11;
            lVar4 = lVar12;
        }
        v2Var = (v2) objA;
        if (v2Var instanceof v2.b) {
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "AuthorizeThirdPartyUseCase", "connectThirdPartyApp -> updateConsumerPermission SUCCESS");
            lVar5.invoke((String) lVar4.invoke(((v2.b) obj).f47386a));
        } else {
            if (v2Var instanceof v2.a) {
                u0.r();
                return null;
            }
            String strN = fb1.c.n("connectThirdPartyApp -> updateConsumerPermission FAILED ", ((v2.a) v2Var).f47383a.toString());
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var2, "AuthorizeThirdPartyUseCase", strN);
            lVar6.invoke(v2Var);
        }
        return Unit.INSTANCE;
        lVar3 = aVar;
        lVar2 = gVar;
        lVar = gVar2;
        obj = (v2) objA;
        if (obj instanceof v2.b) {
            i2.a aVar4 = i2.f36769a;
            a2 a2Var3 = a2.GENERAL;
            aVar4.getClass();
            i2.a.b(a2Var3, "AuthorizeThirdPartyUseCase", "connectThirdPartyApp -> authorizeOAuthTokenAsync SUCCESS");
            if (list == null) {
                list = j0.f134944a;
            }
            hk1.o oVar = new hk1.o(list);
            fVar.f64438a = null;
            fVar.f64439b = null;
            fVar.f64440c = lVar3;
            fVar.f64441d = lVar2;
            fVar.f64442e = lVar;
            fVar.f64443f = (v2.b) obj;
            fVar.f64446i = 2;
            nk1.g gVar3 = this.f64431a;
            objA = f0.J(gVar3, new nk1.p(gVar3, str2, oVar, null), fVar);
            if (objA != obj2) {
                lVar4 = lVar3;
                lVar5 = lVar2;
                lVar6 = lVar;
                v2Var = (v2) objA;
                if (v2Var instanceof v2.b) {
                    i2.a aVar5 = i2.f36769a;
                    a2 a2Var4 = a2.GENERAL;
                    aVar5.getClass();
                    i2.a.b(a2Var4, "AuthorizeThirdPartyUseCase", "connectThirdPartyApp -> updateConsumerPermission SUCCESS");
                    lVar5.invoke((String) lVar4.invoke(((v2.b) obj).f47386a));
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    String strN2 = fb1.c.n("connectThirdPartyApp -> updateConsumerPermission FAILED ", ((v2.a) v2Var).f47383a.toString());
                    i2.a aVar6 = i2.f36769a;
                    a2 a2Var5 = a2.GENERAL;
                    aVar6.getClass();
                    i2.a.f(a2Var5, "AuthorizeThirdPartyUseCase", strN2);
                    lVar6.invoke(v2Var);
                }
            }
            lVar3 = aVar;
            lVar2 = gVar;
            lVar = gVar2;
            return obj2;
        }
        if (!(obj instanceof v2.a)) {
            u0.r();
            return null;
        }
        String strN3 = fb1.c.n("connectThirdPartyApp -> authorizeOAuthTokenAsync FAILED ", ((v2.a) obj).f47383a.toString());
        i2.a aVar7 = i2.f36769a;
        a2 a2Var6 = a2.GENERAL;
        aVar7.getClass();
        i2.a.f(a2Var6, "AuthorizeThirdPartyUseCase", strN3);
        lVar.invoke(obj);
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lek1/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
