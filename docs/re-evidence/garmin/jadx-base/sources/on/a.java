package on;

import c83.a0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.model.DeviceAppInfoDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import com.garmin.android.lib.networking.exceptions.NoNetworkException;
import java.io.IOException;
import java.util.List;
import o13.r;
import o53.i0;
import o53.s0;
import okhttp3.Response;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import pc0.q;
import pc0.t;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lon/a;", "Lqn/a;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lon/k;", "service", "Lpc0/j;", "devicesRepo", "<init>", "(Lon/k;Lpc0/j;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements qn.a, f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f132994d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f132995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pc0.j f132996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Logger f132997c;

    static {
        new C2523a(null);
    }

    public a(k kVar, pc0.j jVar) {
        kVar.getClass();
        jVar.getClass();
        this.f132995a = kVar;
        this.f132996b = jVar;
        this.f132997c = gt2.c.b(a2.GENERAL.f28756a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qn.a
    public final Object a(int i14, int i15, v13.c cVar) {
        e eVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i16 = eVar.f133014c;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                eVar.f133014c = i16 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objJ = eVar.f133012a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i17 = eVar.f133014c;
        if (i17 == 0) {
            r.b(objJ);
            f fVar = new f(this, i14, i15, null);
            eVar.f133014c = 1;
            objJ = f0.J(this, fVar, eVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            return (List) ((v2.b) v2Var).f47386a;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // qn.a
    public final Object b(String str, String str2, v13.c cVar) {
        d dVar;
        sn.h hVar;
        a0 a0Var;
        sn.b bVar;
        sn.f deviceMetaData;
        sn.h hVar2;
        sn.b bVar2;
        a0 a0Var2;
        Response response;
        String str3 = str;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f133011g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f133011g = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objAwait = dVar.f133009e;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f133011g;
        k kVar = this.f132995a;
        Logger logger = this.f132997c;
        try {
            if (i15 == 0) {
                r.b(objAwait);
                i0<a0<sn.h>> i0VarC = kVar.c(str3, str2);
                dVar.f133005a = str3;
                dVar.f133011g = 1;
                objAwait = i0VarC.await(dVar);
                if (objAwait == obj) {
                }
                return obj;
            }
            if (i15 == 1) {
                str3 = dVar.f133005a;
                r.b(objAwait);
            } else {
                if (i15 == 2) {
                    hVar = dVar.f133007c;
                    a0Var = dVar.f133006b;
                    r.b(objAwait);
                    bVar = (sn.b) ((a0) objAwait).f25746b;
                    if (hVar != null && (deviceMetaData = hVar.getDeviceMetaData()) != null) {
                        dVar.f133005a = null;
                        dVar.f133006b = a0Var;
                        dVar.f133007c = hVar;
                        dVar.f133008d = bVar;
                        dVar.f133011g = 3;
                        if (g(deviceMetaData, dVar) != obj) {
                            hVar2 = hVar;
                            bVar2 = bVar;
                            a0Var2 = a0Var;
                        }
                        return obj;
                    }
                    response = a0Var.f25745a;
                    if (!response.isSuccessful() && hVar != null) {
                        hVar.f160401p = bVar;
                        return new v2.b(hVar, response.code(), null, null, 12, null);
                    }
                    logger.error("BaseRepository -  -> server error response code=[" + response.code() + "] message=[" + response.message() + "].");
                    return new v2.a(new IOException("Error Occurred during getting safe Api result, , Response [" + a0Var + "]"), new Integer(response.code()), null, 4, null);
                }
                if (i15 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar2 = dVar.f133008d;
                hVar2 = dVar.f133007c;
                a0Var2 = dVar.f133006b;
                r.b(objAwait);
            }
            bVar = bVar2;
            a0Var = a0Var2;
            hVar = hVar2;
            response = a0Var.f25745a;
            if (!response.isSuccessful()) {
            }
            logger.error("BaseRepository -  -> server error response code=[" + response.code() + "] message=[" + response.message() + "].");
            return new v2.a(new IOException("Error Occurred during getting safe Api result, , Response [" + a0Var + "]"), new Integer(response.code()), null, 4, null);
            a0 a0Var3 = (a0) objAwait;
            sn.h hVar3 = (sn.h) a0Var3.f25746b;
            i0<a0<sn.b>> i0VarB = kVar.b(str3);
            dVar.f133005a = null;
            dVar.f133006b = a0Var3;
            dVar.f133007c = hVar3;
            dVar.f133011g = 2;
            Object objAwait2 = i0VarB.await(dVar);
            if (objAwait2 != obj) {
                objAwait = objAwait2;
                hVar = hVar3;
                a0Var = a0Var3;
                bVar = (sn.b) ((a0) objAwait).f25746b;
                if (hVar != null) {
                    dVar.f133005a = null;
                    dVar.f133006b = a0Var;
                    dVar.f133007c = hVar;
                    dVar.f133008d = bVar;
                    dVar.f133011g = 3;
                    if (g(deviceMetaData, dVar) != obj) {
                        hVar2 = hVar;
                        bVar2 = bVar;
                        a0Var2 = a0Var;
                        bVar = bVar2;
                        a0Var = a0Var2;
                        hVar = hVar2;
                    }
                }
                response = a0Var.f25745a;
                if (!response.isSuccessful()) {
                }
                logger.error("BaseRepository -  -> server error response code=[" + response.code() + "] message=[" + response.message() + "].");
                return new v2.a(new IOException("Error Occurred during getting safe Api result, , Response [" + a0Var + "]"), new Integer(response.code()), null, 4, null);
            }
            return obj;
        } catch (NoNetworkException e4) {
            logger.error("$BaseRepository -  -> Network not available error message=[" + e4 + "].");
            return new v2.a(e4, null, null, 6, null);
        } catch (HttpException e14) {
            logger.error(o2.c.e(e14.code(), "BaseRepository - -> server error response code=[", "] message=[", e14.message(), "]."));
            return new v2.a(new IOException("Error Occurred during getting safe Api result, , ERROR [" + e14 + "]"), new Integer(e14.code()), null, 4, null);
        } catch (Throwable th3) {
            logger.error("BaseRepository -$  -> error message=[" + th3 + "].");
            return new v2.a(new IOException("Error Occurred during getting safe Api result, ERROR [" + th3 + "]"), null, null, 6, null);
        }
    }

    @Override // qn.a
    public final Object c(String str, String str2, String str3, com.garmin.android.apps.connectmobile.activities.health.presentation.i.a aVar) {
        return f0.J(this, new i(this, str, str2, str3, null), aVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qn.a
    public final Object d(String str, String str2, String str3, v13.c cVar) {
        g gVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f133021c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f133021c = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objJ = gVar.f133019a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f133021c;
        if (i15 == 0) {
            r.b(objJ);
            h hVar = new h(this, str, str2, str3, null);
            gVar.f133021c = 1;
            objJ = f0.J(this, hVar, gVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        return (v2) objJ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qn.a
    public final Object f(String str, String str2, v13.c cVar) {
        b bVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f133000c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f133000c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objJ = bVar.f132998a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f133000c;
        if (i15 == 0) {
            r.b(objJ);
            c cVar2 = new c(this, str, str2, null);
            bVar.f133000c = 1;
            objJ = f0.J(this, cVar2, bVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        return (v2) objJ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0087, code lost:
    
        if (r12 == r2) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(sn.f fVar, v13.c cVar) throws Throwable {
        j jVar;
        DeviceAppInfoDTO deviceAppInfoDTO;
        pc0.j jVar2 = this.f132996b;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f133035d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f133035d = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object objE0 = jVar.f133033b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f133035d;
        Logger logger = this.f132997c;
        try {
            if (i15 == 0) {
                r.b(objE0);
                long deviceId = fVar.getDeviceId();
                jVar.f133032a = fVar;
                jVar.f133035d = 1;
                pc0.j.a aVar2 = pc0.j.f137223i;
                x53.c cVar2 = s0.f129406a;
                objE0 = ge1.b.e0(x53.b.f189152a, new q(deviceId, null), jVar);
                if (objE0 != aVar) {
                }
                return aVar;
            }
            if (i15 == 1) {
                fVar = jVar.f133032a;
                r.b(objE0);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fVar = jVar.f133032a;
                r.b(objE0);
            }
            v2 v2Var = (v2) objE0;
            if ((v2Var instanceof v2.b) && (deviceAppInfoDTO = (DeviceAppInfoDTO) ((v2.b) v2Var).f47386a) != null) {
                fVar.g(deviceAppInfoDTO.f33854b);
                fVar.h(deviceAppInfoDTO.f33855c);
            }
            return Unit.INSTANCE;
            sd2.f fVar2 = (sd2.f) objE0;
            if (fVar2 != null) {
                fVar.g(fVar2.getDisplayName());
                fVar.h(fVar2.getImageURL());
            } else {
                Long deviceVersionId = fVar.getDeviceVersionId();
                if (deviceVersionId != null) {
                    long jLongValue = deviceVersionId.longValue();
                    jVar.f133032a = fVar;
                    jVar.f133035d = 2;
                    objE0 = jVar2.C(new t(jVar2, jLongValue, null), jVar);
                } else {
                    logger.error("BaseRepository -  could not fetch device info: missing device version id].");
                }
            }
        } catch (Exception e4) {
            com.airbnb.lottie.animation.keyframe.a.z("BaseRepository -  could not fetch device info: ", e4.getMessage(), "].", logger);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: on.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lon/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2523a {
        public /* synthetic */ C2523a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C2523a() {
        }
    }
}
