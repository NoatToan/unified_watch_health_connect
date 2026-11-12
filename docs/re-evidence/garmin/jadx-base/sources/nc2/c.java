package nc2;

import android.content.Context;
import android.os.RemoteException;
import androidx.core.view.j;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import com.google.android.play.core.integrity.model.StandardIntegrityErrorCode;
import java.security.MessageDigest;
import mh1.x;
import mt0.b2;
import o13.r;
import o53.m0;
import o53.s;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnc2/c;", "Lnc2/d;", "<init>", "()V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f125372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f125373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f125374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f125375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f125376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f125377f;

    public c() {
        Logger loggerB = nd2.c.b("GoogleIntegrityTokenProvider");
        loggerB.getClass();
        this.f125372a = loggerB;
        this.f125376e = 3;
        this.f125377f = 1000L;
    }

    @Override // nc2.d
    public final Object a(byte[] bArr, i iVar) {
        return e(bArr, true, 0, iVar);
    }

    public final void b(StandardIntegrityException standardIntegrityException) {
        this.f125372a.error("token generation failure, error " + ge1.b.r(standardIntegrityException) + ", remedy: none, incorrect implementation", (Throwable) standardIntegrityException);
    }

    public final void c(StandardIntegrityException standardIntegrityException) {
        this.f125372a.error("token generation failure, error " + ge1.b.r(standardIntegrityException) + ", remedy: reinstall play store", (Throwable) standardIntegrityException);
    }

    public final void d() {
        this.f125373b = gl.b.b();
        Context context = this.f125374c;
        if (context != null) {
            IntegrityManagerFactory.createStandard(context).prepareIntegrityToken(StandardIntegrityManager.PrepareIntegrityTokenRequest.builder().setCloudProjectNumber(this.f125375d).build()).addOnSuccessListener(new b2(new x(this, 23), 7)).addOnFailureListener(new b2(this, 8));
        } else {
            p005kotlin.jvm.internal.s.m("appContext");
            throw null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object e(byte[] bArr, boolean z14, int i14, v13.c cVar) throws Exception {
        a aVar;
        StandardIntegrityException standardIntegrityException;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i15 = aVar.f125365f;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                aVar.f125365f = i15 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        a aVar2 = aVar;
        Object objC = aVar2.f125363d;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i16 = aVar2.f125365f;
        Logger logger = this.f125372a;
        try {
            try {
                if (i16 != 0) {
                    if (i16 == 1) {
                        i14 = aVar2.f125362c;
                        z14 = aVar2.f125361b;
                        bArr = aVar2.f125360a;
                        r.b(objC);
                    } else {
                        if (i16 != 2) {
                            if (i16 == 3) {
                                r.b(objC);
                                return objC;
                            }
                            if (i16 == 4) {
                                r.b(objC);
                                return objC;
                            }
                            if (i16 == 5) {
                                r.b(objC);
                                return objC;
                            }
                            h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i17 = aVar2.f125362c;
                        boolean z15 = aVar2.f125361b;
                        byte[] bArr2 = aVar2.f125360a;
                        r.b(objC);
                    }
                    String str = ((StandardIntegrityManager.StandardIntegrityToken) objC).token();
                    logger.debug("successfully obtained integrity token");
                    return new e(str, null);
                }
                r.b(objC);
                try {
                    s sVar = this.f125373b;
                    if (sVar == null) {
                        p005kotlin.jvm.internal.s.m("deferred");
                        throw null;
                    }
                    aVar2.f125360a = bArr;
                    aVar2.f125361b = z14;
                    aVar2.f125362c = i14;
                    aVar2.f125365f = 1;
                    objC = sVar.C(aVar2);
                    if (objC == obj) {
                    }
                    return obj;
                } catch (StandardIntegrityException e4) {
                    standardIntegrityException = e4;
                    int errorCode = standardIntegrityException.getErrorCode();
                    if (errorCode != -100 && errorCode != -12 && errorCode != -3) {
                        if (errorCode == -2 || errorCode == -1) {
                            c(standardIntegrityException);
                        } else if (errorCode != 0) {
                            switch (errorCode) {
                                case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                                    if (!z14) {
                                        b(standardIntegrityException);
                                    } else {
                                        logger.error("invalid or expired StandardIntegrityTokenProvider, initializing new provider and retrying token request.");
                                        d();
                                        aVar2.f125360a = null;
                                        aVar2.f125365f = 4;
                                        Object objE = e(bArr, false, 0, aVar2);
                                        if (objE != obj) {
                                            return objE;
                                        }
                                    }
                                    break;
                                case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                                    break;
                                case -17:
                                    b(standardIntegrityException);
                                    break;
                                case -16:
                                    b(standardIntegrityException);
                                    break;
                                case -15:
                                    logger.error("token generation failure, error " + ge1.b.r(standardIntegrityException) + ", remedy: reinstall play services", (Throwable) standardIntegrityException);
                                    break;
                                case -14:
                                    c(standardIntegrityException);
                                    break;
                                default:
                                    switch (errorCode) {
                                        case -9:
                                            c(standardIntegrityException);
                                            break;
                                        case -8:
                                            break;
                                        case -7:
                                            logger.error("fatal token generation failure, error ".concat(ge1.b.r(standardIntegrityException)), (Throwable) standardIntegrityException);
                                            break;
                                        case -6:
                                            logger.error("token generation failure, error " + ge1.b.r(standardIntegrityException) + ", remedy: reinstall play services", (Throwable) standardIntegrityException);
                                            break;
                                        case -5:
                                            logger.error("fatal token generation failure, error ".concat(ge1.b.r(standardIntegrityException)), (Throwable) standardIntegrityException);
                                            break;
                                        default:
                                            logger.error("token generation failure, error ".concat(ge1.b.r(standardIntegrityException)), (Throwable) standardIntegrityException);
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            logger.error("token generation failure, error NO_ERROR", (Throwable) standardIntegrityException);
                        }
                        return new e(null, ge1.b.r(standardIntegrityException));
                    }
                    int i18 = this.f125376e;
                    if (i14 >= i18) {
                        logger.error("{} max retries reached for error {}", new Integer(i18), ge1.b.r(standardIntegrityException));
                        return new e(null, ge1.b.r(standardIntegrityException));
                    }
                    String strR = ge1.b.r(standardIntegrityException);
                    aVar2.f125360a = null;
                    aVar2.f125365f = 3;
                    Object objF = f(bArr, z14, i14, strR, aVar2);
                    if (objF != obj) {
                        return objF;
                    }
                }
                byte[] bArrDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256).digest(bArr);
                StandardIntegrityManager.StandardIntegrityTokenRequest.Builder builder = StandardIntegrityManager.StandardIntegrityTokenRequest.builder();
                b23.a.C0218a c0218a = b23.a.f15486f;
                bArrDigest.getClass();
                Task<StandardIntegrityManager.StandardIntegrityToken> taskRequest = ((StandardIntegrityManager.StandardIntegrityTokenProvider) objC).request(builder.setRequestHash(b23.a.b(c0218a, bArrDigest)).build());
                taskRequest.getClass();
                aVar2.f125360a = bArr;
                aVar2.f125361b = z14;
                aVar2.f125362c = i14;
                aVar2.f125365f = 2;
                objC = xy2.b.j(taskRequest, aVar2);
                if (objC == obj) {
                    return obj;
                }
                String str2 = ((StandardIntegrityManager.StandardIntegrityToken) objC).token();
                logger.debug("successfully obtained integrity token");
                return new e(str2, null);
            } catch (RemoteException e14) {
                int i19 = this.f125376e;
                if (i14 >= i19) {
                    logger.error("RemoteException during token request, " + i19 + " max retries reached", (Throwable) e14);
                    return new e(null, "RemoteException");
                }
                aVar2.f125360a = null;
                aVar2.f125365f = 5;
                Object objF2 = f(bArr, z14, i14, "RemoteException, likely due to Play Services issues", aVar2);
                if (objF2 != obj) {
                    return objF2;
                }
            }
        } catch (StandardIntegrityException e15) {
            standardIntegrityException = e15;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(byte[] bArr, boolean z14, int i14, String str, v13.c cVar) throws Exception {
        b bVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i15 = bVar.f125371f;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                bVar.f125371f = i15 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object obj = bVar.f125369d;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i16 = bVar.f125371f;
        if (i16 == 0) {
            r.b(obj);
            long j8 = this.f125377f * ((long) (1 << i14));
            int i17 = this.f125376e;
            StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(j8, "token generation failure, ", str, "; retrying token request in ");
            j.m(i14 + 1, i17, "ms (attempt ", " of ", sbJ);
            sbJ.append(")");
            this.f125372a.error(sbJ.toString());
            bVar.f125366a = bArr;
            bVar.f125367b = z14;
            bVar.f125368c = i14;
            bVar.f125371f = 1;
            if (m0.b(j8, bVar) != obj2) {
            }
        }
        if (i16 != 1) {
            if (i16 == 2) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i14 = bVar.f125368c;
        z14 = bVar.f125367b;
        bArr = bVar.f125366a;
        r.b(obj);
        bVar.f125366a = null;
        bVar.f125371f = 2;
        Object objE = e(bArr, z14, i14 + 1, bVar);
        return objE == obj2 ? obj2 : objE;
    }
}
