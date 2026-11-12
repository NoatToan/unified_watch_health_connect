package yt0;

import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lyt0/j0;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lyt0/s0;", "Llt0/d;", "challengesApiService", "Lyt0/i0;", "translationsRepo", "<init>", "(Llt0/d;Lyt0/i0;)V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j0 implements com.garmin.android.apps.connectmobile.f0, s0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f199514c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lt0.d f199515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f199516b;

    static {
        new a(null);
    }

    public j0(lt0.d dVar, i0 i0Var) {
        dVar.getClass();
        i0Var.getClass();
        this.f199515a = dVar;
        this.f199516b = i0Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0099  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // yt0.s0
    public final Object a(int i14, int i15, List list, List list2, v13.c cVar) {
        k0 k0Var;
        int i16;
        int i17;
        Object obj;
        com.garmin.android.apps.connectmobile.leaderboard.model.c0 c0Var;
        com.garmin.android.apps.connectmobile.badges.service.model.i iVar;
        List<com.garmin.android.apps.connectmobile.leaderboard.model.a0> listH;
        com.garmin.android.apps.connectmobile.badges.service.model.g gVarB;
        if (cVar instanceof k0) {
            k0Var = (k0) cVar;
            int i18 = k0Var.f199528g;
            if ((i18 & Integer.MIN_VALUE) != 0) {
                k0Var.f199528g = i18 - Integer.MIN_VALUE;
            } else {
                k0Var = new k0(this, cVar);
            }
        } else {
            k0Var = new k0(this, cVar);
        }
        k0 k0Var2 = k0Var;
        Object objJ = k0Var2.f199526e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i19 = k0Var2.f199528g;
        if (i19 == 0) {
            o13.r.b(objJ);
            l0 l0Var = new l0(this, i14, i15, list, list2, null);
            k0Var2.f199522a = i14;
            k0Var2.f199523b = i15;
            k0Var2.f199528g = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, l0Var, k0Var2);
            if (objJ != aVar) {
                i16 = i14;
                i17 = i15;
            }
            return aVar;
        }
        if (i19 == 1) {
            int i24 = k0Var2.f199523b;
            int i25 = k0Var2.f199522a;
            o13.r.b(objJ);
            i17 = i24;
            i16 = i25;
        } else {
            if (i19 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0Var = k0Var2.f199525d;
            obj = k0Var2.f199524c;
            o13.r.b(objJ);
        }
        iVar = (com.garmin.android.apps.connectmobile.badges.service.model.i) objJ;
        listH = c0Var.h();
        if (listH != null) {
            for (com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var : listH) {
                if (iVar != null) {
                    gVarB = iVar.b(a0Var.getBadgeKey());
                } else {
                    gVarB = null;
                }
                a0Var.k0(gVarB);
            }
        }
        return (com.garmin.android.apps.connectmobile.leaderboard.model.c0) obj;
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            return null;
        }
        Object obj2 = ((v2.b) v2Var).f47386a;
        com.garmin.android.apps.connectmobile.leaderboard.model.c0 c0Var2 = (com.garmin.android.apps.connectmobile.leaderboard.model.c0) obj2;
        k0Var2.f199524c = obj2;
        k0Var2.f199525d = c0Var2;
        k0Var2.f199522a = i16;
        k0Var2.f199523b = i17;
        k0Var2.f199528g = 2;
        Object objA = this.f199516b.a(k0Var2);
        if (objA != aVar) {
            obj = obj2;
            objJ = objA;
            c0Var = c0Var2;
            iVar = (com.garmin.android.apps.connectmobile.badges.service.model.i) objJ;
            listH = c0Var.h();
            if (listH != null) {
                while (r2.hasNext()) {
                    if (iVar != null) {
                        gVarB = iVar.b(a0Var.getBadgeKey());
                    } else {
                        gVarB = null;
                    }
                    a0Var.k0(gVarB);
                }
            }
            return (com.garmin.android.apps.connectmobile.leaderboard.model.c0) obj;
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // yt0.s0
    public final Object b(List list, v13.c cVar) {
        m0 m0Var;
        if (cVar instanceof m0) {
            m0Var = (m0) cVar;
            int i14 = m0Var.f199547c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                m0Var.f199547c = i14 - Integer.MIN_VALUE;
            } else {
                m0Var = new m0(this, cVar);
            }
        } else {
            m0Var = new m0(this, cVar);
        }
        Object objC = m0Var.f199545a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = m0Var.f199547c;
        if (i15 == 0) {
            o13.r.b(objC);
            n0 n0Var = new n0(this, list, null);
            m0Var.f199547c = 1;
            objC = C(n0Var, m0Var);
            if (objC != obj) {
            }
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(objC);
                return objC;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(objC);
        m0Var.f199547c = 2;
        Object objD = d((v2) objC, m0Var);
        return objD == obj ? obj : objD;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0099  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // yt0.s0
    public final Object c(int i14, int i15, List list, List list2, v13.c cVar) {
        o0 o0Var;
        int i16;
        int i17;
        Object obj;
        com.garmin.android.apps.connectmobile.leaderboard.model.c0 c0Var;
        com.garmin.android.apps.connectmobile.badges.service.model.i iVar;
        List<com.garmin.android.apps.connectmobile.leaderboard.model.a0> listB;
        com.garmin.android.apps.connectmobile.badges.service.model.g gVarB;
        if (cVar instanceof o0) {
            o0Var = (o0) cVar;
            int i18 = o0Var.f199568g;
            if ((i18 & Integer.MIN_VALUE) != 0) {
                o0Var.f199568g = i18 - Integer.MIN_VALUE;
            } else {
                o0Var = new o0(this, cVar);
            }
        } else {
            o0Var = new o0(this, cVar);
        }
        o0 o0Var2 = o0Var;
        Object objJ = o0Var2.f199566e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i19 = o0Var2.f199568g;
        if (i19 == 0) {
            o13.r.b(objJ);
            p0 p0Var = new p0(this, i14, i15, list, list2, null);
            o0Var2.f199562a = i14;
            o0Var2.f199563b = i15;
            o0Var2.f199568g = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, p0Var, o0Var2);
            if (objJ != aVar) {
                i16 = i14;
                i17 = i15;
            }
            return aVar;
        }
        if (i19 == 1) {
            int i24 = o0Var2.f199563b;
            int i25 = o0Var2.f199562a;
            o13.r.b(objJ);
            i17 = i24;
            i16 = i25;
        } else {
            if (i19 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0Var = o0Var2.f199565d;
            obj = o0Var2.f199564c;
            o13.r.b(objJ);
        }
        iVar = (com.garmin.android.apps.connectmobile.badges.service.model.i) objJ;
        listB = c0Var.b();
        if (listB != null) {
            for (com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var : listB) {
                if (iVar != null) {
                    gVarB = iVar.b(a0Var.getBadgeKey());
                } else {
                    gVarB = null;
                }
                a0Var.k0(gVarB);
            }
        }
        return (com.garmin.android.apps.connectmobile.leaderboard.model.c0) obj;
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            return null;
        }
        Object obj2 = ((v2.b) v2Var).f47386a;
        com.garmin.android.apps.connectmobile.leaderboard.model.c0 c0Var2 = (com.garmin.android.apps.connectmobile.leaderboard.model.c0) obj2;
        o0Var2.f199564c = obj2;
        o0Var2.f199565d = c0Var2;
        o0Var2.f199562a = i16;
        o0Var2.f199563b = i17;
        o0Var2.f199568g = 2;
        Object objA = this.f199516b.a(o0Var2);
        if (objA != aVar) {
            obj = obj2;
            objJ = objA;
            c0Var = c0Var2;
            iVar = (com.garmin.android.apps.connectmobile.badges.service.model.i) objJ;
            listB = c0Var.b();
            if (listB != null) {
                while (r2.hasNext()) {
                    if (iVar != null) {
                        gVarB = iVar.b(a0Var.getBadgeKey());
                    } else {
                        gVarB = null;
                    }
                    a0Var.k0(gVarB);
                }
            }
            return (com.garmin.android.apps.connectmobile.leaderboard.model.c0) obj;
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object d(v2 v2Var, v13.c cVar) {
        q0 q0Var;
        com.garmin.android.apps.connectmobile.leaderboard.model.c0 c0Var;
        v2 v2Var2;
        com.garmin.android.apps.connectmobile.leaderboard.model.c0 c0Var2;
        if (cVar instanceof q0) {
            q0Var = (q0) cVar;
            int i14 = q0Var.f199584e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                q0Var.f199584e = i14 - Integer.MIN_VALUE;
            } else {
                q0Var = new q0(this, cVar);
            }
        } else {
            q0Var = new q0(this, cVar);
        }
        Object obj = q0Var.f199582c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = q0Var.f199584e;
        if (i15 == 0) {
            o13.r.b(obj);
            v2.b bVar = v2Var instanceof v2.b ? (v2.b) v2Var : null;
            if (bVar == null || (c0Var = (com.garmin.android.apps.connectmobile.leaderboard.model.c0) bVar.f47386a) == null) {
                return v2Var;
            }
            q0Var.f199580a = v2Var;
            q0Var.f199581b = c0Var;
            q0Var.f199584e = 1;
            Object objA = this.f199516b.a(q0Var);
            if (objA == aVar) {
                return aVar;
            }
            v2Var2 = v2Var;
            c0Var2 = c0Var;
            obj = objA;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0Var2 = q0Var.f199581b;
            v2Var2 = q0Var.f199580a;
            o13.r.b(obj);
        }
        com.garmin.android.apps.connectmobile.badges.service.model.i iVar = (com.garmin.android.apps.connectmobile.badges.service.model.i) obj;
        List<com.garmin.android.apps.connectmobile.leaderboard.model.a0> listB = c0Var2.b();
        if (listB != null) {
            for (com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var : listB) {
                a0Var.k0(iVar != null ? iVar.b(a0Var.getBadgeKey()) : null);
            }
        }
        List<com.garmin.android.apps.connectmobile.leaderboard.model.a0> listD = c0Var2.d();
        if (listD != null) {
            for (com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var2 : listD) {
                a0Var2.k0(iVar != null ? iVar.b(a0Var2.getBadgeKey()) : null);
            }
        }
        List<com.garmin.android.apps.connectmobile.leaderboard.model.a0> listG = c0Var2.g();
        if (listG != null) {
            for (com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var3 : listG) {
                a0Var3.k0(iVar != null ? iVar.b(a0Var3.getBadgeKey()) : null);
                a0Var3.n0(iVar != null ? iVar.f30586b : null);
            }
        }
        return v2Var2;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyt0/j0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
