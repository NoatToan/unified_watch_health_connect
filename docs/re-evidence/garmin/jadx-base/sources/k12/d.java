package k12;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import lc.u0;
import o53.i0;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000fB/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lk12/d;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lk12/a;", "Li12/b;", "usersApiService", "Leo1/a;", "socialProfileAPI", "Lac0/c;", "devicesApiService", "Lf12/l;", "userSettings", "La22/e;", "userApiService", "<init>", "(Li12/b;Leo1/a;Lac0/c;Lf12/l;La22/e;)V", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements com.garmin.android.apps.connectmobile.f0, k12.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f102315g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i12.b f102316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eo1.a f102317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ac0.c f102318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f12.l f102319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a22.e f102320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Logger f102321f;

    public d(i12.b bVar, eo1.a aVar, ac0.c cVar, f12.l lVar, a22.e eVar) {
        bVar.getClass();
        aVar.getClass();
        cVar.getClass();
        lVar.getClass();
        eVar.getClass();
        this.f102316a = bVar;
        this.f102317b = aVar;
        this.f102318c = cVar;
        this.f102319d = lVar;
        this.f102320e = eVar;
        this.f102321f = gt2.c.b(a2.USER.f28756a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // k12.a
    public final Object a(long j8, v13.c cVar) {
        o oVar;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i14 = oVar.f102362c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar.f102362c = i14 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object objAwait = oVar.f102360a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = oVar.f102362c;
        Logger logger = this.f102321f;
        try {
            if (i15 == 0) {
                o13.r.b(objAwait);
                i0<List<com.garmin.android.apps.connectmobile.smartscale.model.e>> i0VarX = this.f102316a.x(j8);
                oVar.f102362c = 1;
                objAwait = i0VarX.await(oVar);
                if (objAwait == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objAwait);
            }
            List list = (List) objAwait;
            logger.debug("UsersRepo - getAllInvitedWeightScaleUsers() -> SUCCESS =[" + list + "].");
            return list;
        } catch (HttpException e4) {
            logger.error(o2.c.e(e4.code(), "UsersRepo - getAllInvitedWeightScaleUsers() -> server error response code=[", "] message=[", e4.message(), "]."));
            return null;
        } catch (Throwable th3) {
            logger.error("UsersRepo - getAllInvitedWeightScaleUsers() -> server error message=[" + th3 + "].");
            return null;
        }
    }

    @Override // k12.a
    public final c83.d<j12.m> b(String str, String str2) {
        str.getClass();
        return this.f102316a.w(str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k12.a
    public final Object c(String str, v13.c cVar) {
        p pVar;
        v2.b bVar;
        int i14;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i15 = pVar.f102365c;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                pVar.f102365c = i15 - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, cVar);
            }
        } else {
            pVar = new p(this, cVar);
        }
        Object objJ = pVar.f102363a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = pVar.f102365c;
        if (i16 == 0) {
            o13.r.b(objJ);
            q qVar = new q(this, str, null);
            pVar.f102365c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, qVar, pVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        return ((v2Var instanceof v2.b) && (i14 = (bVar = (v2.b) v2Var).f47387b) == 204 && !(bVar.f47386a instanceof com.garmin.android.apps.connectmobile.devices.model.m)) ? new v2.a(new Exception("204 No Content. Empty response body. kotlin.Unit cannot be cast to DeviceRegistrationDetailsDTO"), new Integer(i14), null, 4, null) : v2Var;
    }

    @Override // k12.a
    public final Object d(String str, com.garmin.android.apps.connectmobile.userprofile.model.r rVar, m12.w wVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new d0(this, str, rVar, null), wVar);
    }

    @Override // k12.a
    public final Object f(String str, List list, m12.c.d dVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new y(this, str, list, null), dVar);
    }

    @Override // k12.a
    public final Object g(String str, da1.a aVar, g12.s.a aVar2) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new n(this, str, aVar, null), aVar2);
    }

    @Override // k12.a
    public final Object h(String str, w13.c cVar, uu.z zVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new t(this, str, 6, false, cVar, null), zVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // k12.a
    public final Object i(v13.c cVar) {
        v vVar;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i14 = vVar.f102386c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                vVar.f102386c = i14 - Integer.MIN_VALUE;
            } else {
                vVar = new v(this, cVar);
            }
        } else {
            vVar = new v(this, cVar);
        }
        Object objJ = vVar.f102384a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = vVar.f102386c;
        if (i15 == 0) {
            o13.r.b(objJ);
            w wVar = new w(this, null);
            vVar.f102386c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(this, wVar, vVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return v2Var;
            }
            u0.r();
            return null;
        }
        String garminGUID = ((j12.l) ((v2.b) v2Var).f47386a).getGarminGUID();
        if (garminGUID != null && (!d53.w.J(garminGUID))) {
            this.f102319d.M3(garminGUID);
        }
        return v2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k12.a
    public final Object j(String str, List list, v13.c cVar) {
        f0 f0Var;
        if (cVar instanceof f0) {
            f0Var = (f0) cVar;
            int i14 = f0Var.f102337c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                f0Var.f102337c = i14 - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(this, cVar);
            }
        } else {
            f0Var = new f0(this, cVar);
        }
        Object objAwait = f0Var.f102335a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = f0Var.f102337c;
        Logger logger = this.f102321f;
        try {
            if (i15 == 0) {
                o13.r.b(objAwait);
                i0<List<j12.h>> i0VarO = this.f102316a.o(str, list);
                f0Var.f102337c = 1;
                objAwait = i0VarO.await(f0Var);
                if (objAwait == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objAwait);
            }
            List list2 = (List) objAwait;
            logger.debug("UsersRepo - userUploadProfilePicture() -> SUCCESS.");
            return list2;
        } catch (HttpException e4) {
            logger.error(o2.c.e(e4.code(), "UsersRepo - userUploadProfilePicture() -> server error response code=[", "] message=[", e4.message(), "]."));
            return null;
        } catch (Throwable th3) {
            logger.error("UsersRepo - userUploadProfilePicture() -> server error message=[" + th3 + "].");
            return null;
        }
    }

    @Override // k12.a
    public final Object k(String str, List list, List list2, com.garmin.android.apps.connectmobile.userprofile.j jVar) {
        return com.garmin.android.apps.connectmobile.f0.J(this, new u(this, str, list, list2, null), jVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lk12/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static d a(a aVar) {
            ez0.b bVar = ez0.b.f67468a;
            ez0.c cVar = ez0.c.GC;
            i12.b bVar2 = (i12.b) ez0.b.a(bVar, cVar, i12.b.class, new c83.h.a[0], null, null, null, 120);
            eo1.a aVar2 = (eo1.a) KoinJavaComponent.get$default(eo1.a.class, null, null, 6, null);
            ac0.c cVar2 = (ac0.c) ez0.b.a(bVar, cVar, ac0.c.class, new c83.h.a[0], null, null, null, 120);
            f12.l lVar = (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
            a22.e eVar = (a22.e) ez0.b.a(bVar, cVar, a22.e.class, new c83.h.a[0], null, null, null, 120);
            aVar.getClass();
            bVar2.getClass();
            aVar2.getClass();
            cVar2.getClass();
            lVar.getClass();
            eVar.getClass();
            return new d(bVar2, aVar2, cVar2, lVar, eVar);
        }

        private a() {
        }
    }
}
