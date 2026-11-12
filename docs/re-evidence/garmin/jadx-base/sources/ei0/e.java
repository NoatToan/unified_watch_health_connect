package ei0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.follow.exception.FollowerOverLimitException;
import com.garmin.android.apps.connectmobile.follow.exception.FollowingOverLimitException;
import com.garmin.android.apps.connectmobile.follow.exception.FollowingRequestOverLimitException;
import com.garmin.android.apps.connectmobile.follow.exception.ManagedChildAccountForbiddenException;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import java.util.Locale;
import kd0.l2;
import kd0.m2;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lei0/e;", "Lei0/d;", "Lei0/c;", "followAPIService", "Lei0/w0;", "userBlockAPIService", "Lpz0/d;", "userSearchApi", "<init>", "(Lei0/c;Lei0/w0;Lpz0/d;)V", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f64195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static s92.g f64196e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f64197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f64198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pz0.d f64199c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.follow.FollowRepoImpl$getMyFollowingsCount$2", f = "FollowRepoImpl.kt", l = {341}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.l<t13.d<? super c83.a0<Integer>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f64200a;

        public b(t13.d<? super b> dVar) {
            super(1, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return e.this.new b(dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super c83.a0<Integer>> dVar) {
            return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f64200a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            o53.i0<c83.a0<Integer>> i0VarD = e.this.f64197a.d();
            this.f64200a = 1;
            Object objAwait = i0VarD.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    static {
        new a(null);
        f64195d = gt2.c.b(a2.FOLLOWER.f28756a);
    }

    public e(c cVar, w0 w0Var, pz0.d dVar) {
        cVar.getClass();
        w0Var.getClass();
        dVar.getClass();
        this.f64197a = cVar;
        this.f64198b = w0Var;
        this.f64199c = dVar;
    }

    public static v2 a(v2 v2Var) {
        Exception followingOverLimitException;
        if (!(v2Var instanceof v2.a)) {
            if (v2Var instanceof v2.b) {
                return v2Var;
            }
            lc.u0.r();
            return null;
        }
        v2.a aVar = (v2.a) v2Var;
        Integer num = aVar.f47384b;
        if (num != null && num.intValue() == 403) {
            try {
                n63.b.a aVar2 = n63.b.f123892d;
                String str = ((v2.a) v2Var).f47385c;
                if (str == null) {
                    str = "";
                }
                aVar2.getClass();
                hi0.d dVar = (hi0.d) aVar2.c(hi0.d.INSTANCE.serializer(), str);
                v2.a aVar3 = (v2.a) v2Var;
                hi0.d.c cVar = dVar.f83803c;
                if (cVar == null) {
                    cVar = dVar.f83804d;
                }
                if (cVar != null) {
                    int i14 = hi0.d.c.b.f83812a[cVar.ordinal()];
                    if (i14 == 1) {
                        followingOverLimitException = new FollowingOverLimitException();
                    } else if (i14 == 2) {
                        followingOverLimitException = new FollowerOverLimitException();
                    } else if (i14 == 3) {
                        followingOverLimitException = new FollowingRequestOverLimitException();
                    } else {
                        if (i14 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        followingOverLimitException = new ManagedChildAccountForbiddenException();
                    }
                } else {
                    followingOverLimitException = ((v2.a) v2Var).f47383a;
                }
                Integer num2 = aVar3.f47384b;
                String str2 = aVar3.f47385c;
                followingOverLimitException.getClass();
                return new v2.a(followingOverLimitException, num2, str2);
            } catch (Exception e4) {
                String strN = fb1.c.n("Failed to parse FollowRequestErrorDTO from server response: ", aVar.f47385c);
                i2.a aVar4 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar4.getClass();
                i2.a.f(a2Var, "FollowerRepoImpl", strN);
                i2.a.f(a2Var, "FollowerRepoImpl", "Error: " + e4);
            }
        }
        return v2Var;
    }

    @Override // ei0.d
    public final Object A(List list, List list2, m2 m2Var) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new o0(list, list2, this, null), m2Var);
    }

    @Override // ei0.d
    public final Object B3(Long l14, boolean z14, v13.i iVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new k(this, l14, z14, null), iVar);
    }

    @Override // ei0.d
    public final Object C0(List list, Integer num, Integer num2, qz0.d dVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new r(this, list, num, num2, null), dVar);
    }

    @Override // ei0.d
    public final Object D(String str, boolean z14, v13.i iVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new e0(this, str, z14, null), iVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ei0.d
    public final Object I3(Long l14, v13.c cVar) {
        f fVar;
        e eVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f64209d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f64209d = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objJ = fVar.f64207b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f64209d;
        if (i15 == 0) {
            o13.r.b(objJ);
            g gVar = new g(this, l14, null);
            fVar.f64206a = this;
            fVar.f64209d = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, gVar, fVar);
            if (objJ == aVar) {
                return aVar;
            }
            eVar = this;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            eVar = fVar.f64206a;
            o13.r.b(objJ);
        }
        eVar.getClass();
        return a((v2) objJ);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ei0.d
    public final Object K(v13.c cVar) {
        l lVar;
        List<s92.b> listB;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f64261c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f64261c = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object objE = lVar.f64259a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f64261c;
        if (i15 == 0) {
            o13.r.b(objE);
            p92.o oVar = p92.o.f136619a;
            q92.w wVar = q92.w.DI_CONNECT_AUTO_APPROVE_FOLLOWER;
            lVar.f64261c = 1;
            objE = oVar.e(wVar, Locale.getDefault(), lVar);
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE);
        }
        s92.g gVar = (s92.g) objE;
        f64196e = gVar;
        if (gVar == null || (listB = gVar.b()) == null) {
            return null;
        }
        return p13.h0.k0(listB, "\n", null, null, new e70.a(6), 30);
    }

    @Override // ei0.d
    public final Object O1(String str, v13.i iVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new h(this, str, null), iVar);
    }

    @Override // ei0.d
    public final Object R0(String str, String str2, List list, Integer num, Integer num2, List list2, fi0.s sVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new g0(this, str, str2, list, num, num2, list2, null), sVar);
    }

    @Override // ei0.d
    public final Object S(List list, List list2, mi0.d.a aVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new p(this, list, list2, null), aVar);
    }

    @Override // ei0.d
    public final Object T3(Long l14, li0.i iVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new j(this, l14, null), iVar);
    }

    @Override // ei0.d
    public final Object U(String str, li0.l lVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new d0(this, str, null), lVar);
    }

    @Override // ei0.d
    public final Object W2(Integer num, Integer num2, List list, w13.c cVar, v13.c cVar2) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new s(this, num, num2, list, cVar, null), cVar2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ei0.d
    public final Object Z1(v13.c cVar) {
        n nVar;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f64275c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f64275c = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object objC = nVar.f64273a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f64275c;
        if (i15 == 0) {
            o13.r.b(objC);
            p92.o oVar = p92.o.f136619a;
            q92.x xVar = q92.x.DI_CONNECT_AUTO_APPROVE_FOLLOWER;
            nVar.f64275c = 1;
            objC = oVar.c(xVar, nVar);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objC);
        }
        q92.v vVar = (q92.v) objC;
        return vVar == null ? new v2.a(new Exception("Failed to fetch consent status for DI_CONNECT_AUTO_APPROVE_FOLLOWER"), null, null, 6, null) : new v2.b(Boolean.valueOf(!vVar.b()), 200, null, null, 12, null);
    }

    @Override // ei0.d
    public final Object Z3(String str, v13.i iVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new b0(this, str, null), iVar);
    }

    @Override // ei0.d
    public final Object a3(t13.d<? super v2<Integer>> dVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new b(null), dVar);
    }

    @Override // ei0.d
    public final Object e0(String str, v13.i iVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new m0(this, str, null), iVar);
    }

    @Override // ei0.d
    public final Object e3(String str, String str2, List list, Integer num, Integer num2, List list2, fi0.s sVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new h0(this, str, str2, list, num, num2, list2, null), sVar);
    }

    @Override // ei0.d
    public final Object f2(List list, Boolean bool, w13.c cVar, v13.c cVar2) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new z(this, list, bool, cVar, null), cVar2);
    }

    @Override // ei0.d
    public final Object f3(String str, int i14, int i15, List list, fi0.u uVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new f0(this, str, i14, i15, list, null), uVar);
    }

    @Override // ei0.d
    public final Object g2(String str, li0.q qVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new n0(this, str, null), qVar);
    }

    @Override // ei0.d
    public final Object h2(Integer num, Integer num2, r12.c cVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new y(this, num, num2, null), cVar);
    }

    @Override // ei0.d
    public final Object h3(int i14, int i15, q12.b bVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new o(this, i14, i15, null), bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ei0.d
    public final Object i0(String str, v13.c cVar) {
        i0 i0Var;
        e eVar;
        if (cVar instanceof i0) {
            i0Var = (i0) cVar;
            int i14 = i0Var.f64244d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                i0Var.f64244d = i14 - Integer.MIN_VALUE;
            } else {
                i0Var = new i0(this, cVar);
            }
        } else {
            i0Var = new i0(this, cVar);
        }
        Object objJ = i0Var.f64242b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = i0Var.f64244d;
        if (i15 == 0) {
            o13.r.b(objJ);
            j0 j0Var = new j0(this, str, null);
            i0Var.f64241a = this;
            i0Var.f64244d = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, j0Var, i0Var);
            if (objJ == aVar) {
                return aVar;
            }
            eVar = this;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            eVar = i0Var.f64241a;
            o13.r.b(objJ);
        }
        eVar.getClass();
        return a((v2) objJ);
    }

    @Override // ei0.d
    public final Object i4(String str, List list, Integer num, Integer num2, w13.c cVar, v13.c cVar2) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new u(this, str, list, num, num2, cVar, null), cVar2);
    }

    @Override // ei0.d
    public final Object k0(List list, Boolean bool, List list2, mt0.a0 a0Var) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new m(this, list, bool, list2, null), a0Var);
    }

    @Override // ei0.d
    public final Object l2(List list, l2 l2Var) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new x(this, list, null), l2Var);
    }

    @Override // ei0.d
    public final Object l3(List list, qz0.c cVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new w(this, list, null), cVar);
    }

    @Override // ei0.d
    public final Object m3(String str, li0.f.c cVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new i(this, str, null), cVar);
    }

    @Override // ei0.d
    public final Object o4(List list, List list2, mi0.d.c cVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new q(this, list, list2, null), cVar);
    }

    @Override // ei0.d
    public final Object r0(List list, List list2, w13.c cVar, v13.c cVar2) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new t(this, list, list2, cVar, null), cVar2);
    }

    @Override // ei0.d
    public final Object t0(String str, List list, Integer num, Integer num2, w13.c cVar, v13.c cVar2) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new v(this, str, list, num, num2, cVar, null), cVar2);
    }

    @Override // ei0.d
    public final Object u4(hi0.i iVar, List list, fi0.j jVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new a0(this, iVar, list, null), jVar);
    }

    @Override // ei0.d
    public final Object x(String str, v13.i iVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new c0(this, str, null), iVar);
    }

    @Override // ei0.d
    public final Object x2(String str, li0.f.i iVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new l0(this, str, null), iVar);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008c  */
    /* JADX WARN: Code duplicated, block: B:39:0x009d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
    
        if (r13 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        if (r13 == r1) goto L34;
     */
    @Override // ei0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z0(boolean z14, v13.c cVar) {
        k0 k0Var;
        q92.v vVar;
        if (cVar instanceof k0) {
            k0Var = (k0) cVar;
            int i14 = k0Var.f64258d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                k0Var.f64258d = i14 - Integer.MIN_VALUE;
            } else {
                k0Var = new k0(this, cVar);
            }
        } else {
            k0Var = new k0(this, cVar);
        }
        Object objP = k0Var.f64256b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = k0Var.f64258d;
        if (i15 == 0) {
            o13.r.b(objP);
            if (f64196e == null) {
                k0Var.f64255a = z14;
                k0Var.f64258d = 1;
                if (K(k0Var) != obj) {
                }
            }
            return obj;
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(objP);
                vVar = (q92.v) objP;
                if (vVar == null) {
                }
            }
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objP);
            vVar = (q92.v) objP;
            return vVar == null ? new v2.a(new Exception("setApprovalRequired: Failed to update consent status for DI_CONNECT_AUTO_APPROVE_FOLLOWER"), null, null, 6, null) : new v2.b(Unit.INSTANCE, 200, null, null, 12, null);
        }
        z14 = k0Var.f64255a;
        o13.r.b(objP);
        s92.g gVar = f64196e;
        if (gVar == null) {
            return new v2.a(new Exception("setApprovalRequired: Consent is null, cannot set approval required status"), null, null, 6, null);
        }
        if (z14) {
            p92.o oVar = p92.o.f136619a;
            q92.x xVar = q92.x.DI_CONNECT_AUTO_APPROVE_FOLLOWER;
            k0Var.f64255a = z14;
            k0Var.f64258d = 2;
            objP = oVar.u(xVar, gVar, k0Var);
        } else {
            p92.o oVar2 = p92.o.f136619a;
            q92.x xVar2 = q92.x.DI_CONNECT_AUTO_APPROVE_FOLLOWER;
            k0Var.f64255a = z14;
            k0Var.f64258d = 3;
            objP = oVar2.p(xVar2, gVar, k0Var);
        }
        return obj;
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lei0/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "KEY_FOLLOW_APPROVAL_REQUIRED", "", "ERROR_CODE_BAD_REQUEST", "I", "Ls92/g;", "consentTextDTO", "Ls92/g;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
