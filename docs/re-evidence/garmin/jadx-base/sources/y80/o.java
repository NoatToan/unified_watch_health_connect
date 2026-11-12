package y80;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.io.Serializable;
import java.util.List;
import okhttp3.Response;
import p005kotlin.Metadata;
import p008y1.y0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Ly80/o;", "Ly80/n;", "Ly80/m;", "deviceInfoAPI", "Lfj1/a;", "primaryDeviceAPI", "Lqd2/a;", "cacheManager", "Ln63/b;", "jsonParser", "Lo53/z;", "ioDispatcher", "<init>", "(Ly80/m;Lfj1/a;Lqd2/a;Ln63/b;Lo53/z;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o implements n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f195188f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f195189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fj1.a f195190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qd2.a f195191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n63.b f195192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o53.z f195193e;

    static {
        new a(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o(m mVar, fj1.a aVar, qd2.a aVar2, n63.b bVar, o53.z zVar, int i14, p005kotlin.jvm.internal.j jVar) {
        n63.b bVarA = (i14 & 8) != 0 ? n63.p.a(new y0(20)) : bVar;
        if ((i14 & 16) != 0) {
            x53.c cVar = o53.s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(mVar, aVar, aVar2, bVarA, zVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // y80.n
    public final Object a(v13.c cVar) {
        t tVar;
        Object bVar;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i14 = tVar.f195219c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                tVar.f195219c = i14 - Integer.MIN_VALUE;
            } else {
                tVar = new t(this, cVar);
            }
        } else {
            tVar = new t(this, cVar);
        }
        Object objAwait = tVar.f195217a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = tVar.f195219c;
        try {
            if (i15 == 0) {
                o13.r.b(objAwait);
                int i16 = o13.q.f128596b;
                o53.i0<c83.a0<gj1.f>> i0VarC = this.f195190b.c();
                tVar.f195219c = 1;
                objAwait = i0VarC.await(tVar);
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
            c83.a0 a0Var = (c83.a0) objAwait;
            Response response = a0Var.f25745a;
            if (!response.isSuccessful()) {
                throw new Exception("API call failed with code: " + response.code() + " and message: " + response.message());
            }
            bVar = (gj1.f) a0Var.f25746b;
            if (bVar == null) {
                throw new Exception("Response body is null");
            }
            int i17 = o13.q.f128596b;
            if (!(bVar instanceof o13.q.b)) {
                i2.f36769a.getClass();
                i2.a.b(a2.DEVICE_SETUP, "DeviceInfoRepository", "Fetched primary training devices successfully " + ((gj1.f) bVar));
            }
            Throwable thB = o13.q.b(bVar);
            if (thB != null) {
                a2 a2Var = a2.DEVICE_SETUP;
                String strP = am.j.p("Failed to fetch primary training devices ", thB);
                i2.f36769a.getClass();
                i2.a.f(a2Var, "DeviceInfoRepository", strP);
            }
            return bVar;
        } catch (Throwable th3) {
            int i18 = o13.q.f128596b;
            bVar = new o13.q.b(th3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00bd, code lost:
    
        if (r10 == r1) goto L50;
     */
    @Override // y80.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(v13.c cVar) {
        q qVar;
        o13.q.b bVar;
        int i14;
        o oVar;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i15 = qVar.f195209e;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                qVar.f195209e = i15 - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, cVar);
            }
        } else {
            qVar = new q(this, cVar);
        }
        Object objE0 = qVar.f195207c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i16 = qVar.f195209e;
        o53.z zVar = this.f195193e;
        try {
            try {
                if (i16 == 0) {
                    o13.r.b(objE0);
                    r rVar = new r(this, null);
                    qVar.f195209e = 1;
                    objE0 = ge1.b.e0(zVar, rVar, qVar);
                    if (objE0 != obj) {
                    }
                    return obj;
                }
                if (i16 != 1) {
                    if (i16 == 2) {
                        i14 = qVar.f195206b;
                        oVar = qVar.f195205a;
                        o13.r.b(objE0);
                        qVar.f195205a = null;
                        qVar.f195206b = i14;
                        qVar.f195209e = 3;
                        objE0 = ge1.b.e0(oVar.f195193e, new u(oVar, (String) objE0, null), qVar);
                    } else {
                        if (i16 != 3) {
                            if (i16 != 4) {
                                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            o13.r.b(objE0);
                            List list = (List) objE0;
                            int i17 = o13.q.f128596b;
                            return list;
                        }
                        o13.r.b(objE0);
                    }
                    List list2 = (List) objE0;
                    int i18 = o13.q.f128596b;
                    return list2;
                }
                o13.r.b(objE0);
                String str = (String) objE0;
                i14 = 0;
                if (str != null && !d53.w.J(str)) {
                    a2 a2Var = a2.DEVICE_SETUP;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "DeviceInfoRepository", "Using cached all devices info");
                    int i19 = o13.q.f128596b;
                    qVar.f195206b = 0;
                    qVar.f195209e = 4;
                    objE0 = ge1.b.e0(zVar, new u(this, str, null), qVar);
                    if (objE0 == obj) {
                    }
                    List list3 = (List) objE0;
                    int i110 = o13.q.f128596b;
                    return list3;
                }
                int i24 = o13.q.f128596b;
                qVar.f195205a = this;
                qVar.f195206b = 0;
                qVar.f195209e = 2;
                objE0 = d(qVar);
                if (objE0 != obj) {
                    oVar = this;
                    qVar.f195205a = null;
                    qVar.f195206b = i14;
                    qVar.f195209e = 3;
                    objE0 = ge1.b.e0(oVar.f195193e, new u(oVar, (String) objE0, null), qVar);
                }
                return obj;
            } catch (Throwable th3) {
                int i25 = o13.q.f128596b;
                bVar = new o13.q.b(th3);
                return bVar;
            }
        } catch (Throwable th4) {
            int i26 = o13.q.f128596b;
            bVar = new o13.q.b(th4);
            return bVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // y80.n
    public final Object c(long j8, String str, String str2, v13.c cVar) {
        s sVar;
        Object bVar;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i14 = sVar.f195216c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                sVar.f195216c = i14 - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, cVar);
            }
        } else {
            sVar = new s(this, cVar);
        }
        s sVar2 = sVar;
        Object objA = sVar2.f195214a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = sVar2.f195216c;
        try {
            if (i15 == 0) {
                o13.r.b(objA);
                a2 a2Var = a2.DEVICE_SETUP;
                String strO = am.j.o(", deviceName: ", str2, com.airbnb.lottie.animation.keyframe.a.k(j8, "Fetching device info for unitId: ", ", productNumber: ", str));
                i2.f36769a.getClass();
                i2.a.b(a2Var, "DeviceInfoRepository", strO);
                int i16 = o13.q.f128596b;
                m mVar = this.f195189a;
                if (str2 == null) {
                    str2 = "";
                }
                sVar2.f195216c = 1;
                objA = mVar.a(j8, str, str2, sVar2);
                if (objA == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objA);
            }
            bVar = (z80.d) objA;
            int i17 = o13.q.f128596b;
        } catch (Throwable th3) {
            int i18 = o13.q.f128596b;
            bVar = new o13.q.b(th3);
        }
        if (!(bVar instanceof o13.q.b)) {
            i2.f36769a.getClass();
            i2.a.b(a2.DEVICE_SETUP, "DeviceInfoRepository", "Fetched device info successfully " + ((z80.d) bVar));
        }
        Throwable thB = o13.q.b(bVar);
        if (thB != null) {
            a2 a2Var2 = a2.DEVICE_SETUP;
            String strP = am.j.p("Failed to fetch device info ", thB);
            i2.f36769a.getClass();
            i2.a.f(a2Var2, "DeviceInfoRepository", strP);
        }
        return bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable d(v13.c cVar) {
        p pVar;
        Serializable bVar;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i14 = pVar.f195199c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                pVar.f195199c = i14 - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, cVar);
            }
        } else {
            pVar = new p(this, cVar);
        }
        Object objB = pVar.f195197a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = pVar.f195199c;
        try {
            if (i15 == 0) {
                o13.r.b(objB);
                a2 a2Var = a2.DEVICE_SETUP;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "DeviceInfoRepository", "Fetching all devices info from API");
                int i16 = o13.q.f128596b;
                m mVar = this.f195189a;
                pVar.f195199c = 1;
                objB = mVar.b(pVar);
                if (objB == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objB);
            }
            bVar = (String) objB;
            int i17 = o13.q.f128596b;
        } catch (Throwable th3) {
            int i18 = o13.q.f128596b;
            bVar = new o13.q.b(th3);
        }
        if (!(bVar instanceof o13.q.b)) {
            String str = (String) bVar;
            a2 a2Var2 = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "DeviceInfoRepository", "Fetched all devices info successfully");
            qd2.a aVar2 = this.f195191c;
            if (aVar2 != null) {
                aVar2.g(qd2.a.b.ALL_DEVICES, str);
            }
        }
        Throwable thB = o13.q.b(bVar);
        if (thB != null) {
            a2 a2Var3 = a2.DEVICE_SETUP;
            String strP = am.j.p("Failed to fetch all devices info ", thB);
            i2.f36769a.getClass();
            i2.a.f(a2Var3, "DeviceInfoRepository", strP);
        }
        o13.r.b(bVar);
        return bVar;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ly80/o$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public o(m mVar, fj1.a aVar, qd2.a aVar2, n63.b bVar, o53.z zVar) {
        mVar.getClass();
        aVar.getClass();
        bVar.getClass();
        zVar.getClass();
        this.f195189a = mVar;
        this.f195190b = aVar;
        this.f195191c = aVar2;
        this.f195192d = bVar;
        this.f195193e = zVar;
    }
}
