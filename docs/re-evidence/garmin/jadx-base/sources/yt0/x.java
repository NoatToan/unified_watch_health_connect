package yt0;

import c22.b3;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.library.backgroundtaskmanagement.BizOperationException;
import java.io.IOException;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lyt0/x;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lyt0/r0;", "Llt0/c;", "badgeChallengesApi", "Lyt0/i0;", "translationsRepo", "<init>", "(Llt0/c;Lyt0/i0;)V", "a", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x implements com.garmin.android.apps.connectmobile.f0, r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lt0.c f199619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f199620b;

    static {
        new a(null);
    }

    public x(lt0.c cVar, i0 i0Var) {
        cVar.getClass();
        i0Var.getClass();
        this.f199619a = cVar;
        this.f199620b = i0Var;
    }

    @Override // yt0.r0
    public final Object a(long j8, pt0.s sVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new f0(this, j8, null), sVar);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0093  */
    /* JADX WARN: Code duplicated, block: B:32:0x009b  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // yt0.r0
    public final Object b(int i14, int i15, boolean z14, v13.c cVar) {
        c0 c0Var;
        int i16;
        int i17;
        boolean z15;
        v2 v2Var;
        com.garmin.android.apps.connectmobile.badges.service.model.i iVar;
        com.garmin.android.apps.connectmobile.badges.service.model.g gVarB;
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i18 = c0Var.f199445g;
            if ((i18 & Integer.MIN_VALUE) != 0) {
                c0Var.f199445g = i18 - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(this, cVar);
            }
        } else {
            c0Var = new c0(this, cVar);
        }
        c0 c0Var2 = c0Var;
        Object objJ = c0Var2.f199443e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i19 = c0Var2.f199445g;
        if (i19 == 0) {
            o13.r.b(objJ);
            d0 d0Var = new d0(this, i14, i15, z14, null);
            c0Var2.f199439a = i14;
            c0Var2.f199440b = i15;
            c0Var2.f199441c = z14;
            c0Var2.f199445g = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, d0Var, c0Var2);
            if (objJ != aVar) {
                i16 = i14;
                i17 = i15;
                z15 = z14;
            }
            return aVar;
        }
        if (i19 == 1) {
            boolean z16 = c0Var2.f199441c;
            i17 = c0Var2.f199440b;
            int i24 = c0Var2.f199439a;
            o13.r.b(objJ);
            z15 = z16;
            i16 = i24;
        } else {
            if (i19 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2Var = c0Var2.f199442d;
            o13.r.b(objJ);
        }
        iVar = (com.garmin.android.apps.connectmobile.badges.service.model.i) objJ;
        for (com.garmin.android.apps.connectmobile.leaderboard.model.p pVar : (Iterable) ((v2.b) v2Var).f47386a) {
            if (iVar != null) {
                gVarB = iVar.b(pVar.getBadgeKey());
            } else {
                gVarB = null;
            }
            pVar.e1(gVarB);
        }
        return v2Var;
        v2 v2Var2 = (v2) objJ;
        if (!(v2Var2 instanceof v2.b)) {
            return v2Var2;
        }
        c0Var2.f199442d = (v2.b) v2Var2;
        c0Var2.f199439a = i16;
        c0Var2.f199440b = i17;
        c0Var2.f199441c = z15;
        c0Var2.f199445g = 2;
        Object objA = this.f199620b.a(c0Var2);
        if (objA != aVar) {
            v2Var = v2Var2;
            objJ = objA;
            iVar = (com.garmin.android.apps.connectmobile.badges.service.model.i) objJ;
            while (r3.hasNext()) {
                if (iVar != null) {
                    gVarB = iVar.b(pVar.getBadgeKey());
                } else {
                    gVarB = null;
                }
                pVar.e1(gVarB);
            }
            return v2Var;
        }
        return aVar;
    }

    @Override // yt0.r0
    public final Object c(String str, DateTime dateTime, v13.i iVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new y(this, str, dateTime, null), iVar);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0081  */
    /* JADX WARN: Code duplicated, block: B:30:0x0089  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // yt0.r0
    public final Object d(int i14, int i15, v13.c cVar) {
        a0 a0Var;
        v2 v2Var;
        com.garmin.android.apps.connectmobile.badges.service.model.i iVar;
        com.garmin.android.apps.connectmobile.badges.service.model.g gVarB;
        com.garmin.android.apps.connectmobile.badges.service.model.o oVar;
        if (cVar instanceof a0) {
            a0Var = (a0) cVar;
            int i16 = a0Var.f199419f;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                a0Var.f199419f = i16 - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(this, cVar);
            }
        } else {
            a0Var = new a0(this, cVar);
        }
        Object objJ = a0Var.f199417d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = a0Var.f199419f;
        if (i17 == 0) {
            o13.r.b(objJ);
            b0 b0Var = new b0(this, i14, i15, null);
            a0Var.f199414a = i14;
            a0Var.f199415b = i15;
            a0Var.f199419f = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, b0Var, a0Var);
            if (objJ != aVar) {
            }
            return aVar;
        }
        if (i17 == 1) {
            i15 = a0Var.f199415b;
            i14 = a0Var.f199414a;
            o13.r.b(objJ);
        } else {
            if (i17 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v2Var = a0Var.f199416c;
            o13.r.b(objJ);
        }
        iVar = (com.garmin.android.apps.connectmobile.badges.service.model.i) objJ;
        for (com.garmin.android.apps.connectmobile.leaderboard.model.p pVar : (Iterable) ((v2.b) v2Var).f47386a) {
            if (iVar != null) {
                gVarB = iVar.b(pVar.getBadgeKey());
            } else {
                gVarB = null;
            }
            pVar.e1(gVarB);
            if (iVar != null) {
                oVar = iVar.f30586b;
            } else {
                oVar = null;
            }
            pVar.h1(oVar);
        }
        return v2Var;
        v2 v2Var2 = (v2) objJ;
        if (!(v2Var2 instanceof v2.b)) {
            return v2Var2;
        }
        a0Var.f199416c = (v2.b) v2Var2;
        a0Var.f199414a = i14;
        a0Var.f199415b = i15;
        a0Var.f199419f = 2;
        Object objA = this.f199620b.a(a0Var);
        if (objA != aVar) {
            objJ = objA;
            v2Var = v2Var2;
            iVar = (com.garmin.android.apps.connectmobile.badges.service.model.i) objJ;
            while (r9.hasNext()) {
                if (iVar != null) {
                    gVarB = iVar.b(pVar.getBadgeKey());
                } else {
                    gVarB = null;
                }
                pVar.e1(gVarB);
                if (iVar != null) {
                    oVar = iVar.f30586b;
                } else {
                    oVar = null;
                }
                pVar.h1(oVar);
            }
            return v2Var;
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b4 A[Catch: all -> 0x003d, HttpException -> 0x0040, TryCatch #3 {HttpException -> 0x0040, all -> 0x003d, blocks: (B:13:0x0038, B:31:0x00a3, B:33:0x00b4, B:35:0x00c2), top: B:47:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c2 A[Catch: all -> 0x003d, HttpException -> 0x0040, TRY_LEAVE, TryCatch #3 {HttpException -> 0x0040, all -> 0x003d, blocks: (B:13:0x0038, B:31:0x00a3, B:33:0x00b4, B:35:0x00c2), top: B:47:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x00c2, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // yt0.r0
    public final Object f(String str, v13.c cVar) {
        e0 e0Var;
        String strJ;
        Object objB;
        o53.i0<c83.a0<com.garmin.android.apps.connectmobile.leaderboard.model.p>> i0Var;
        w wVar;
        com.garmin.android.apps.connectmobile.badges.service.model.i iVar;
        String str2;
        w wVar2;
        com.garmin.android.apps.connectmobile.badges.service.model.i iVar2;
        com.garmin.android.apps.connectmobile.leaderboard.model.p pVar;
        if (cVar instanceof e0) {
            e0Var = (e0) cVar;
            int i14 = e0Var.f199474h;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                e0Var.f199474h = i14 - Integer.MIN_VALUE;
            } else {
                e0Var = new e0(this, cVar);
            }
        } else {
            e0Var = new e0(this, cVar);
        }
        Object objAwait = e0Var.f199472f;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = e0Var.f199474h;
        try {
            if (i15 == 0) {
                o13.r.b(objAwait);
                w wVar3 = new w();
                String strA = b3.a();
                strJ = androidx.room.a0.j("getBadgeChallengeDetails(", str, "), translations= ", strA);
                o53.i0<c83.a0<com.garmin.android.apps.connectmobile.leaderboard.model.p>> i0VarD = this.f199619a.d(str);
                e0Var.f199467a = wVar3;
                e0Var.f199468b = strJ;
                e0Var.f199469c = i0VarD;
                e0Var.f199474h = 1;
                objB = this.f199620b.b(strA, "", e0Var);
                if (objB != aVar) {
                    i0Var = i0VarD;
                    wVar = wVar3;
                }
                return aVar;
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wVar = e0Var.f199471e;
                iVar2 = e0Var.f199470d;
                str2 = e0Var.f199468b;
                wVar2 = e0Var.f199467a;
                try {
                    o13.r.b(objAwait);
                    wVar.f199611a = (com.garmin.android.apps.connectmobile.leaderboard.model.p) ((c83.a0) objAwait).f25746b;
                    wVar2.f199612b = iVar2;
                    wVar2.a();
                    pVar = wVar2.f199611a;
                    if (pVar != null) {
                        return new v2.b(pVar, 200, null, null, 12, null);
                    }
                    i2.f36769a.getClass();
                    i2.a.f(a2.CHALLENGES, "BadgeChallengesRepository", str2 + " -> challengeDetailsCall failed.");
                    return new v2.a(new BizOperationException(com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA), null, null, 6, null);
                } catch (HttpException e4) {
                    e = e4;
                    a2 a2Var = a2.CHALLENGES;
                    String str3 = str2 + " -> server error response code=[" + e.code() + "] message=[" + e.message() + "].";
                    i2.f36769a.getClass();
                    i2.a.f(a2Var, "BadgeChallengesRepository", str3);
                    return new v2.a(new IOException(fb1.c.n("Error Occurred during getting Api result: ", str2)), null, null, 6, null);
                } catch (Throwable th3) {
                    th = th3;
                    i2.f36769a.getClass();
                    i2.a.f(a2.CHALLENGES, "BadgeChallengesRepository", str2 + " -> server error message=[" + th + "].");
                    return new v2.a(new IOException(fb1.c.n("Error Occurred during getting Api result: ", str2)), null, null, 6, null);
                }
            }
            o53.i0<c83.a0<com.garmin.android.apps.connectmobile.leaderboard.model.p>> i0Var2 = e0Var.f199469c;
            String str4 = e0Var.f199468b;
            w wVar4 = e0Var.f199467a;
            o13.r.b(objAwait);
            strJ = str4;
            objB = objAwait;
            i0Var = i0Var2;
            wVar = wVar4;
            e0Var.f199467a = wVar;
            e0Var.f199468b = strJ;
            e0Var.f199469c = null;
            e0Var.f199470d = iVar;
            e0Var.f199471e = wVar;
            e0Var.f199474h = 2;
            objAwait = i0Var.await(e0Var);
            if (objAwait != aVar) {
                wVar2 = wVar;
                iVar2 = iVar;
                str2 = strJ;
                wVar.f199611a = (com.garmin.android.apps.connectmobile.leaderboard.model.p) ((c83.a0) objAwait).f25746b;
                wVar2.f199612b = iVar2;
                wVar2.a();
                pVar = wVar2.f199611a;
                if (pVar != null) {
                    return new v2.b(pVar, 200, null, null, 12, null);
                }
                i2.f36769a.getClass();
                i2.a.f(a2.CHALLENGES, "BadgeChallengesRepository", str2 + " -> challengeDetailsCall failed.");
                return new v2.a(new BizOperationException(com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA), null, null, 6, null);
            }
            return aVar;
        } catch (HttpException e14) {
            e = e14;
            str2 = strJ;
            a2 a2Var2 = a2.CHALLENGES;
            String str5 = str2 + " -> server error response code=[" + e.code() + "] message=[" + e.message() + "].";
            i2.f36769a.getClass();
            i2.a.f(a2Var2, "BadgeChallengesRepository", str5);
            return new v2.a(new IOException(fb1.c.n("Error Occurred during getting Api result: ", str2)), null, null, 6, null);
        } catch (Throwable th4) {
            th = th4;
            str2 = strJ;
            i2.f36769a.getClass();
            i2.a.f(a2.CHALLENGES, "BadgeChallengesRepository", str2 + " -> server error message=[" + th + "].");
            return new v2.a(new IOException(fb1.c.n("Error Occurred during getting Api result: ", str2)), null, null, 6, null);
        }
        iVar = (com.garmin.android.apps.connectmobile.badges.service.model.i) objB;
    }

    @Override // yt0.r0
    public final Object g(String str, v13.i iVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new z(this, str, null), iVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyt0/x$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
