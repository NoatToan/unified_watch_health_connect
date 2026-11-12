package px2;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import com.garmin.gfdi.protobuf.ProtobufException;
import com.garmin.proto.generated.GDIGarminHealth;
import com.garmin.proto.generated.GDISaMD;
import com.garmin.samd.exception.FileTransferNotReadyException;
import com.garmin.samd.exception.GHSDuplicateUploadException;
import com.garmin.samd.exception.GHSEnvironmentNotSupportedException;
import com.garmin.samd.exception.GHSInvalidFITArchiveException;
import com.garmin.samd.exception.GHSInvalidFITFileException;
import com.garmin.samd.exception.GHSSaMDIdMismatchException;
import com.garmin.samd.exception.GHSServerException;
import com.garmin.samd.exception.GHSServerNotAvailableException;
import com.garmin.samd.exception.InvalidFileTransferProtobufRequestException;
import com.garmin.samd.exception.InvalidOAuth2DIBearerTokenException;
import com.garmin.samd.exception.MFATokenNotBoundException;
import com.garmin.samd.exception.NetworkException;
import com.garmin.samd.exception.UserDoesNotConsentToUploadException;
import java.util.concurrent.atomic.AtomicBoolean;
import jx2.s;
import jx2.v;
import o13.r;
import o13.t;
import o53.b0;
import o53.s0;
import o53.z;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lpx2/f;", "Lpx2/a;", "Ldt2/g;", "messenger", "Lrs2/c;", "deviceInfo", "Lorg/slf4j/Logger;", "logger", "Lo53/b0;", "protobufHandlerScope", "Lzj2/e;", "dataTransfer", "<init>", "(Ldt2/g;Lrs2/c;Lorg/slf4j/Logger;Lo53/b0;Lzj2/e;)V", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class f extends px2.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Logger f141794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f141795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zj2.e f141796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f141797e;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljx2/s;", "invoke", "()Ljx2/s;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends w implements e23.a<s> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ rs2.c f141798a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(rs2.c cVar) {
            super(0);
            this.f141798a = cVar;
        }

        @Override // e23.a
        public final s invoke() {
            return new s(this.f141798a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(dt2.g gVar, rs2.c cVar, Logger logger, b0 b0Var, zj2.e eVar) {
        super(gVar);
        gVar.getClass();
        cVar.getClass();
        logger.getClass();
        b0Var.getClass();
        this.f141794b = logger;
        this.f141795c = b0Var;
        this.f141796d = eVar;
        this.f141797e = o13.m.b(new a(cVar));
    }

    public final GDIGarminHealth.Service.Builder d(GDIGarminHealth.FileTransferRequest fileTransferRequest, GDISaMD.SaMDCommonFailures saMDCommonFailures, boolean z14) {
        GDIGarminHealth.Service.Builder fileXferResponse;
        GDIGarminHealth.Service.Builder fileXferCompleteNotification;
        fileTransferRequest.getClass();
        Logger logger = this.f141794b;
        if (z14) {
            if (saMDCommonFailures == null) {
                logger.debug("handleMsg -> sending success 'GDIGarminHealth.FileTransferCompleteNotification'");
                fileXferCompleteNotification = GDIGarminHealth.Service.newBuilder().setFileXferCompleteNotification(GDIGarminHealth.FileTransferCompleteNotification.newBuilder().setFileName(fileTransferRequest.getFileName()));
            } else {
                logger.warn("handleMsg -> sending failure 'GDIGarminHealth.FileTransferCompleteNotification' " + saMDCommonFailures.name());
                fileXferCompleteNotification = GDIGarminHealth.Service.newBuilder().setFileXferCompleteNotification(GDIGarminHealth.FileTransferCompleteNotification.newBuilder().setFileName(fileTransferRequest.getFileName()).setFailure(saMDCommonFailures));
            }
            fileXferCompleteNotification.getClass();
            return fileXferCompleteNotification;
        }
        if (saMDCommonFailures == null) {
            logger.debug("handleMsg -> sending success 'GDIGarminHealth.FileTransferResponse'");
            fileXferResponse = GDIGarminHealth.Service.newBuilder().setFileXferResponse(GDIGarminHealth.FileTransferResponse.newBuilder());
        } else {
            logger.warn("handleMsg -> sending failure 'GDIGarminHealth.FileTransferResponse' " + saMDCommonFailures.name());
            fileXferResponse = GDIGarminHealth.Service.newBuilder().setFileXferResponse(GDIGarminHealth.FileTransferResponse.newBuilder().setFailure(saMDCommonFailures));
        }
        fileXferResponse.getClass();
        return fileXferResponse;
    }

    public final GDIGarminHealth.Service.Builder e(String str, GDISaMD.SaMDCommonFailures saMDCommonFailures) {
        GDIGarminHealth.EmbeddedHealthTokenResponse.Builder builderNewBuilder = GDIGarminHealth.EmbeddedHealthTokenResponse.newBuilder();
        if (saMDCommonFailures != null) {
            this.f141794b.warn("createEmbeddedHealthTokenResponse -> " + saMDCommonFailures.name());
            builderNewBuilder.setFailure(saMDCommonFailures);
        } else {
            str.getClass();
            builderNewBuilder.setToken(str);
        }
        GDIGarminHealth.Service.Builder tokenResponse = GDIGarminHealth.Service.newBuilder().setTokenResponse(builderNewBuilder);
        tokenResponse.getClass();
        return tokenResponse;
    }

    public final GDIGarminHealth.Service.Builder f(GDISaMD.SaMDCommonFailures saMDCommonFailures) {
        Unit unit;
        GDIGarminHealth.Service.Builder builderNewBuilder = GDIGarminHealth.Service.newBuilder();
        GDIGarminHealth.FileTransferPrecheckResponse.Builder builderNewBuilder2 = GDIGarminHealth.FileTransferPrecheckResponse.newBuilder();
        builderNewBuilder2.setGarminHealthServiceFileTransferSupport(true);
        Logger logger = this.f141794b;
        if (saMDCommonFailures != null) {
            logger.warn("createFileTransferPrecheckResponse -> " + saMDCommonFailures.name());
            builderNewBuilder2.setFailure(saMDCommonFailures);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            logger.debug("createFileTransferPrecheckResponse");
        }
        builderNewBuilder.setFileXferPrecheckResponse(builderNewBuilder2);
        return builderNewBuilder;
    }

    public final s g() {
        return (s) this.f141797e.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c6, code lost:
    
        if (r7 == r1) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    @SuppressLint({"VisibleForTests"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(long j8, dt2.k kVar, v13.c cVar) {
        g gVar;
        f fVar;
        String str;
        GDISaMD.SaMDCommonFailures saMDCommonFailures;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f141803e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f141803e = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objJ = gVar.f141801c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f141803e;
        try {
            try {
                if (i15 != 0) {
                    if (i15 == 1) {
                        kVar = gVar.f141800b;
                        fVar = gVar.f141799a;
                        try {
                            r.b(objJ);
                        } catch (GHSEnvironmentNotSupportedException e4) {
                            e = e4;
                            str = null;
                            com.airbnb.lottie.animation.keyframe.a.A("handleMsg: GDIGarminHealth.EmbeddedHealthTokenRequest: ", e.getMessage(), fVar.f141794b);
                            saMDCommonFailures = GDISaMD.SaMDCommonFailures.OTHER;
                            GDIGarminHealth.Service.Builder builderE = fVar.e(str, saMDCommonFailures);
                            gVar.f141799a = fVar;
                            gVar.f141800b = null;
                            gVar.f141803e = 2;
                            Object objC = px2.a.c(builderE, kVar, gVar);
                            j8 = objC;
                        } catch (GHSServerException unused) {
                            str = null;
                            saMDCommonFailures = GDISaMD.SaMDCommonFailures.GHS_SERVER;
                            GDIGarminHealth.Service.Builder builderE2 = fVar.e(str, saMDCommonFailures);
                            gVar.f141799a = fVar;
                            gVar.f141800b = null;
                            gVar.f141803e = 2;
                            Object objC2 = px2.a.c(builderE2, kVar, gVar);
                            j8 = objC2;
                        } catch (InvalidOAuth2DIBearerTokenException unused2) {
                            str = null;
                            saMDCommonFailures = GDISaMD.SaMDCommonFailures.NO_APP_AUTHORIZATION;
                            GDIGarminHealth.Service.Builder builderE3 = fVar.e(str, saMDCommonFailures);
                            gVar.f141799a = fVar;
                            gVar.f141800b = null;
                            gVar.f141803e = 2;
                            Object objC3 = px2.a.c(builderE3, kVar, gVar);
                            j8 = objC3;
                        } catch (MFATokenNotBoundException unused3) {
                            str = null;
                            saMDCommonFailures = GDISaMD.SaMDCommonFailures.NO_APP_AUTHORIZATION;
                            GDIGarminHealth.Service.Builder builderE4 = fVar.e(str, saMDCommonFailures);
                            gVar.f141799a = fVar;
                            gVar.f141800b = null;
                            gVar.f141803e = 2;
                            Object objC4 = px2.a.c(builderE4, kVar, gVar);
                            j8 = objC4;
                        } catch (NetworkException unused4) {
                            str = null;
                            saMDCommonFailures = GDISaMD.SaMDCommonFailures.NO_NETWORK_CONNECTION;
                            GDIGarminHealth.Service.Builder builderE5 = fVar.e(str, saMDCommonFailures);
                            gVar.f141799a = fVar;
                            gVar.f141800b = null;
                            gVar.f141803e = 2;
                            Object objC5 = px2.a.c(builderE5, kVar, gVar);
                            j8 = objC5;
                        } catch (UserDoesNotConsentToUploadException unused5) {
                            str = null;
                            saMDCommonFailures = GDISaMD.SaMDCommonFailures.NO_UPLOAD_CONSENT;
                            GDIGarminHealth.Service.Builder builderE6 = fVar.e(str, saMDCommonFailures);
                            gVar.f141799a = fVar;
                            gVar.f141800b = null;
                            gVar.f141803e = 2;
                            Object objC6 = px2.a.c(builderE6, kVar, gVar);
                            j8 = objC6;
                        } catch (Throwable unused6) {
                            str = null;
                            saMDCommonFailures = GDISaMD.SaMDCommonFailures.OTHER;
                            GDIGarminHealth.Service.Builder builderE7 = fVar.e(str, saMDCommonFailures);
                            gVar.f141799a = fVar;
                            gVar.f141800b = null;
                            gVar.f141803e = 2;
                            Object objC7 = px2.a.c(builderE7, kVar, gVar);
                            j8 = objC7;
                        }
                    } else {
                        if (i15 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        f fVar2 = gVar.f141799a;
                        r.b(objJ);
                        j8 = fVar2;
                    }
                    return Unit.INSTANCE;
                }
                r.b(objJ);
                this.f141794b.debug("handleMsg: GDIGarminHealth.EmbeddedHealthTokenRequest...");
                try {
                    jx2.b bVar = new jx2.b();
                    gVar.f141799a = this;
                    gVar.f141800b = kVar;
                    gVar.f141803e = 1;
                    objJ = bVar.j(j8, gVar);
                    if (objJ != aVar) {
                        fVar = this;
                    }
                } catch (GHSEnvironmentNotSupportedException e14) {
                    e = e14;
                    fVar = this;
                    str = null;
                    com.airbnb.lottie.animation.keyframe.a.A("handleMsg: GDIGarminHealth.EmbeddedHealthTokenRequest: ", e.getMessage(), fVar.f141794b);
                    saMDCommonFailures = GDISaMD.SaMDCommonFailures.OTHER;
                    GDIGarminHealth.Service.Builder builderE8 = fVar.e(str, saMDCommonFailures);
                    gVar.f141799a = fVar;
                    gVar.f141800b = null;
                    gVar.f141803e = 2;
                    Object objC8 = px2.a.c(builderE8, kVar, gVar);
                    j8 = objC8;
                } catch (GHSServerException unused7) {
                    fVar = this;
                    str = null;
                    saMDCommonFailures = GDISaMD.SaMDCommonFailures.GHS_SERVER;
                    GDIGarminHealth.Service.Builder builderE9 = fVar.e(str, saMDCommonFailures);
                    gVar.f141799a = fVar;
                    gVar.f141800b = null;
                    gVar.f141803e = 2;
                    Object objC9 = px2.a.c(builderE9, kVar, gVar);
                    j8 = objC9;
                } catch (InvalidOAuth2DIBearerTokenException unused8) {
                    fVar = this;
                    str = null;
                    saMDCommonFailures = GDISaMD.SaMDCommonFailures.NO_APP_AUTHORIZATION;
                    GDIGarminHealth.Service.Builder builderE10 = fVar.e(str, saMDCommonFailures);
                    gVar.f141799a = fVar;
                    gVar.f141800b = null;
                    gVar.f141803e = 2;
                    Object objC10 = px2.a.c(builderE10, kVar, gVar);
                    j8 = objC10;
                } catch (MFATokenNotBoundException unused9) {
                    fVar = this;
                    str = null;
                    saMDCommonFailures = GDISaMD.SaMDCommonFailures.NO_APP_AUTHORIZATION;
                    GDIGarminHealth.Service.Builder builderE11 = fVar.e(str, saMDCommonFailures);
                    gVar.f141799a = fVar;
                    gVar.f141800b = null;
                    gVar.f141803e = 2;
                    Object objC11 = px2.a.c(builderE11, kVar, gVar);
                    j8 = objC11;
                } catch (NetworkException unused10) {
                    fVar = this;
                    str = null;
                    saMDCommonFailures = GDISaMD.SaMDCommonFailures.NO_NETWORK_CONNECTION;
                    GDIGarminHealth.Service.Builder builderE12 = fVar.e(str, saMDCommonFailures);
                    gVar.f141799a = fVar;
                    gVar.f141800b = null;
                    gVar.f141803e = 2;
                    Object objC12 = px2.a.c(builderE12, kVar, gVar);
                    j8 = objC12;
                } catch (UserDoesNotConsentToUploadException unused11) {
                    fVar = this;
                    str = null;
                    saMDCommonFailures = GDISaMD.SaMDCommonFailures.NO_UPLOAD_CONSENT;
                    GDIGarminHealth.Service.Builder builderE13 = fVar.e(str, saMDCommonFailures);
                    gVar.f141799a = fVar;
                    gVar.f141800b = null;
                    gVar.f141803e = 2;
                    Object objC13 = px2.a.c(builderE13, kVar, gVar);
                    j8 = objC13;
                } catch (Throwable unused12) {
                    fVar = this;
                    str = null;
                    saMDCommonFailures = GDISaMD.SaMDCommonFailures.OTHER;
                    GDIGarminHealth.Service.Builder builderE14 = fVar.e(str, saMDCommonFailures);
                    gVar.f141799a = fVar;
                    gVar.f141800b = null;
                    gVar.f141803e = 2;
                    Object objC14 = px2.a.c(builderE14, kVar, gVar);
                    j8 = objC14;
                }
                return aVar;
                if (d53.w.J(str)) {
                    saMDCommonFailures = GDISaMD.SaMDCommonFailures.OTHER;
                    fVar.f141794b.error("handleMsg: GDIGarminHealth.EmbeddedHealthTokenRequest -> null or blank token");
                } else {
                    saMDCommonFailures = null;
                }
            } catch (GHSEnvironmentNotSupportedException e15) {
                e = e15;
                com.airbnb.lottie.animation.keyframe.a.A("handleMsg: GDIGarminHealth.EmbeddedHealthTokenRequest: ", e.getMessage(), fVar.f141794b);
                saMDCommonFailures = GDISaMD.SaMDCommonFailures.OTHER;
            } catch (GHSServerException unused13) {
                saMDCommonFailures = GDISaMD.SaMDCommonFailures.GHS_SERVER;
            } catch (InvalidOAuth2DIBearerTokenException unused14) {
                saMDCommonFailures = GDISaMD.SaMDCommonFailures.NO_APP_AUTHORIZATION;
            } catch (MFATokenNotBoundException unused15) {
                saMDCommonFailures = GDISaMD.SaMDCommonFailures.NO_APP_AUTHORIZATION;
            } catch (NetworkException unused16) {
                saMDCommonFailures = GDISaMD.SaMDCommonFailures.NO_NETWORK_CONNECTION;
            } catch (UserDoesNotConsentToUploadException unused17) {
                saMDCommonFailures = GDISaMD.SaMDCommonFailures.NO_UPLOAD_CONSENT;
            } catch (Throwable unused18) {
                saMDCommonFailures = GDISaMD.SaMDCommonFailures.OTHER;
            }
            str = (String) objJ;
            GDIGarminHealth.Service.Builder builderE15 = fVar.e(str, saMDCommonFailures);
            gVar.f141799a = fVar;
            gVar.f141800b = null;
            gVar.f141803e = 2;
            Object objC15 = px2.a.c(builderE15, kVar, gVar);
            j8 = objC15;
        } catch (ProtobufException e16) {
            j8.f141794b.error("handle: GDIGarminHealth.EmbeddedHealthTokenRequest", (Throwable) e16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0227 A[Catch: all -> 0x0209, TryCatch #6 {all -> 0x0209, blocks: (B:83:0x01f6, B:86:0x01ff, B:88:0x0203, B:92:0x020e, B:94:0x0212, B:95:0x0215, B:97:0x0219, B:98:0x021c, B:100:0x0220, B:101:0x0223, B:103:0x0227, B:105:0x022c, B:107:0x0230, B:108:0x0233, B:110:0x0237, B:111:0x023a, B:113:0x023e, B:118:0x0253, B:120:0x0257, B:121:0x025a, B:123:0x025e, B:124:0x0261, B:126:0x0265, B:127:0x0268), top: B:196:0x01f6 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x022c A[Catch: all -> 0x0209, TryCatch #6 {all -> 0x0209, blocks: (B:83:0x01f6, B:86:0x01ff, B:88:0x0203, B:92:0x020e, B:94:0x0212, B:95:0x0215, B:97:0x0219, B:98:0x021c, B:100:0x0220, B:101:0x0223, B:103:0x0227, B:105:0x022c, B:107:0x0230, B:108:0x0233, B:110:0x0237, B:111:0x023a, B:113:0x023e, B:118:0x0253, B:120:0x0257, B:121:0x025a, B:123:0x025e, B:124:0x0261, B:126:0x0265, B:127:0x0268), top: B:196:0x01f6 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0230 A[ADDED_TO_REGION, Catch: all -> 0x0209, REMOVE, TryCatch #6 {all -> 0x0209, blocks: (B:83:0x01f6, B:86:0x01ff, B:88:0x0203, B:92:0x020e, B:94:0x0212, B:95:0x0215, B:97:0x0219, B:98:0x021c, B:100:0x0220, B:101:0x0223, B:103:0x0227, B:105:0x022c, B:107:0x0230, B:108:0x0233, B:110:0x0237, B:111:0x023a, B:113:0x023e, B:118:0x0253, B:120:0x0257, B:121:0x025a, B:123:0x025e, B:124:0x0261, B:126:0x0265, B:127:0x0268), top: B:196:0x01f6 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0233 A[Catch: all -> 0x0209, TryCatch #6 {all -> 0x0209, blocks: (B:83:0x01f6, B:86:0x01ff, B:88:0x0203, B:92:0x020e, B:94:0x0212, B:95:0x0215, B:97:0x0219, B:98:0x021c, B:100:0x0220, B:101:0x0223, B:103:0x0227, B:105:0x022c, B:107:0x0230, B:108:0x0233, B:110:0x0237, B:111:0x023a, B:113:0x023e, B:118:0x0253, B:120:0x0257, B:121:0x025a, B:123:0x025e, B:124:0x0261, B:126:0x0265, B:127:0x0268), top: B:196:0x01f6 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x023e A[Catch: all -> 0x0209, TRY_LEAVE, TryCatch #6 {all -> 0x0209, blocks: (B:83:0x01f6, B:86:0x01ff, B:88:0x0203, B:92:0x020e, B:94:0x0212, B:95:0x0215, B:97:0x0219, B:98:0x021c, B:100:0x0220, B:101:0x0223, B:103:0x0227, B:105:0x022c, B:107:0x0230, B:108:0x0233, B:110:0x0237, B:111:0x023a, B:113:0x023e, B:118:0x0253, B:120:0x0257, B:121:0x025a, B:123:0x025e, B:124:0x0261, B:126:0x0265, B:127:0x0268), top: B:196:0x01f6 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x0253 A[Catch: all -> 0x0209, TRY_ENTER, TryCatch #6 {all -> 0x0209, blocks: (B:83:0x01f6, B:86:0x01ff, B:88:0x0203, B:92:0x020e, B:94:0x0212, B:95:0x0215, B:97:0x0219, B:98:0x021c, B:100:0x0220, B:101:0x0223, B:103:0x0227, B:105:0x022c, B:107:0x0230, B:108:0x0233, B:110:0x0237, B:111:0x023a, B:113:0x023e, B:118:0x0253, B:120:0x0257, B:121:0x025a, B:123:0x025e, B:124:0x0261, B:126:0x0265, B:127:0x0268), top: B:196:0x01f6 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x0257 A[Catch: all -> 0x0209, TryCatch #6 {all -> 0x0209, blocks: (B:83:0x01f6, B:86:0x01ff, B:88:0x0203, B:92:0x020e, B:94:0x0212, B:95:0x0215, B:97:0x0219, B:98:0x021c, B:100:0x0220, B:101:0x0223, B:103:0x0227, B:105:0x022c, B:107:0x0230, B:108:0x0233, B:110:0x0237, B:111:0x023a, B:113:0x023e, B:118:0x0253, B:120:0x0257, B:121:0x025a, B:123:0x025e, B:124:0x0261, B:126:0x0265, B:127:0x0268), top: B:196:0x01f6 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x025a A[Catch: all -> 0x0209, TryCatch #6 {all -> 0x0209, blocks: (B:83:0x01f6, B:86:0x01ff, B:88:0x0203, B:92:0x020e, B:94:0x0212, B:95:0x0215, B:97:0x0219, B:98:0x021c, B:100:0x0220, B:101:0x0223, B:103:0x0227, B:105:0x022c, B:107:0x0230, B:108:0x0233, B:110:0x0237, B:111:0x023a, B:113:0x023e, B:118:0x0253, B:120:0x0257, B:121:0x025a, B:123:0x025e, B:124:0x0261, B:126:0x0265, B:127:0x0268), top: B:196:0x01f6 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x025e A[Catch: all -> 0x0209, TryCatch #6 {all -> 0x0209, blocks: (B:83:0x01f6, B:86:0x01ff, B:88:0x0203, B:92:0x020e, B:94:0x0212, B:95:0x0215, B:97:0x0219, B:98:0x021c, B:100:0x0220, B:101:0x0223, B:103:0x0227, B:105:0x022c, B:107:0x0230, B:108:0x0233, B:110:0x0237, B:111:0x023a, B:113:0x023e, B:118:0x0253, B:120:0x0257, B:121:0x025a, B:123:0x025e, B:124:0x0261, B:126:0x0265, B:127:0x0268), top: B:196:0x01f6 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0261 A[Catch: all -> 0x0209, TryCatch #6 {all -> 0x0209, blocks: (B:83:0x01f6, B:86:0x01ff, B:88:0x0203, B:92:0x020e, B:94:0x0212, B:95:0x0215, B:97:0x0219, B:98:0x021c, B:100:0x0220, B:101:0x0223, B:103:0x0227, B:105:0x022c, B:107:0x0230, B:108:0x0233, B:110:0x0237, B:111:0x023a, B:113:0x023e, B:118:0x0253, B:120:0x0257, B:121:0x025a, B:123:0x025e, B:124:0x0261, B:126:0x0265, B:127:0x0268), top: B:196:0x01f6 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0265 A[Catch: all -> 0x0209, TryCatch #6 {all -> 0x0209, blocks: (B:83:0x01f6, B:86:0x01ff, B:88:0x0203, B:92:0x020e, B:94:0x0212, B:95:0x0215, B:97:0x0219, B:98:0x021c, B:100:0x0220, B:101:0x0223, B:103:0x0227, B:105:0x022c, B:107:0x0230, B:108:0x0233, B:110:0x0237, B:111:0x023a, B:113:0x023e, B:118:0x0253, B:120:0x0257, B:121:0x025a, B:123:0x025e, B:124:0x0261, B:126:0x0265, B:127:0x0268), top: B:196:0x01f6 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0268 A[Catch: all -> 0x0209, TRY_LEAVE, TryCatch #6 {all -> 0x0209, blocks: (B:83:0x01f6, B:86:0x01ff, B:88:0x0203, B:92:0x020e, B:94:0x0212, B:95:0x0215, B:97:0x0219, B:98:0x021c, B:100:0x0220, B:101:0x0223, B:103:0x0227, B:105:0x022c, B:107:0x0230, B:108:0x0233, B:110:0x0237, B:111:0x023a, B:113:0x023e, B:118:0x0253, B:120:0x0257, B:121:0x025a, B:123:0x025e, B:124:0x0261, B:126:0x0265, B:127:0x0268), top: B:196:0x01f6 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x0279 A[Catch: ProtobufException -> 0x0296, TryCatch #8 {ProtobufException -> 0x0296, blocks: (B:129:0x026b, B:131:0x0279, B:137:0x029d), top: B:200:0x026b }] */
    /* JADX WARN: Code duplicated, block: B:133:0x028e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0290  */
    /* JADX WARN: Code duplicated, block: B:137:0x029d A[Catch: ProtobufException -> 0x0296, TRY_LEAVE, TryCatch #8 {ProtobufException -> 0x0296, blocks: (B:129:0x026b, B:131:0x0279, B:137:0x029d), top: B:200:0x026b }] */
    /* JADX WARN: Code duplicated, block: B:143:0x02bd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:164:0x031e  */
    /* JADX WARN: Code duplicated, block: B:199:0x0370 A[ExcSplitCross -> B:181:0x0370, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x0370 A[ExcSplitCross -> B:181:0x0370, PHI: r2 r3 r6 r7 r9 r11 r12
      0x0370: PHI (r2v29 ??) = (r2v54 ??), (r2v55 ??), (r2v56 ??), (r2v57 ??), (r2v58 ??) binds: [B:65:0x019d, B:51:0x012e, B:56:0x0160, B:79:0x01e8, B:74:0x01ca] A[DONT_GENERATE, DONT_INLINE]
      0x0370: PHI (r3v24 ??) = (r3v46 ??), (r3v47 ??), (r3v48 ??), (r3v26 ??), (r3v49 ??) binds: [B:65:0x019d, B:51:0x012e, B:56:0x0160, B:79:0x01e8, B:74:0x01ca] A[DONT_GENERATE, DONT_INLINE]
      0x0370: PHI (r6v28 ??) = (r6v49 ??), (r6v50 ??), (r6v51 ??), (r6v52 ??), (r6v32 ??) binds: [B:65:0x019d, B:51:0x012e, B:56:0x0160, B:79:0x01e8, B:74:0x01ca] A[DONT_GENERATE, DONT_INLINE]
      0x0370: PHI (r7v17 ??) = 
      (r7v29 ?? I:??[int, float, short, byte, char])
      (r7v30 ?? I:??[int, float, short, byte, char])
      (r7v31 ?? I:??[int, float, short, byte, char])
      (r7v37 ??)
      (r7v38 ??)
     binds: [B:65:0x019d, B:51:0x012e, B:56:0x0160, B:79:0x01e8, B:74:0x01ca] A[DONT_GENERATE, DONT_INLINE]
      0x0370: PHI (r9v20 ??) = (r9v34 ??), (r9v0 ??), (r9v35 ??), (r9v36 ??), (r9v37 ??) binds: [B:65:0x019d, B:51:0x012e, B:56:0x0160, B:79:0x01e8, B:74:0x01ca] A[DONT_GENERATE, DONT_INLINE]
      0x0370: PHI (r11v21 int) = (r11v30 int), (r11v32 int), (r11v44 int), (r11v45 int), (r11v46 int) binds: [B:65:0x019d, B:51:0x012e, B:56:0x0160, B:79:0x01e8, B:74:0x01ca] A[DONT_GENERATE, DONT_INLINE]
      0x0370: PHI (r12v25 ??) = (r12v33 ??), (r12v34 ??), (r12v35 ??), (r12v36 ??), (r12v37 ??) binds: [B:65:0x019d, B:51:0x012e, B:56:0x0160, B:79:0x01e8, B:74:0x01ca] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0160  */
    /* JADX WARN: Code duplicated, block: B:57:0x0162 A[Catch: all -> 0x0167, PHI: r0 r2 r3 r6 r11 r12 r13
      0x0162: PHI (r0v58 java.lang.Object) = (r0v57 java.lang.Object), (r0v1 java.lang.Object) binds: [B:55:0x015e, B:43:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x0162: PHI (r2v25 int) = (r2v60 int), (r2v61 int) binds: [B:55:0x015e, B:43:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x0162: PHI (r3v19 ??) = (r3v52 ??), (r3v21 ??) binds: [B:55:0x015e, B:43:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x0162: PHI (r6v22 ??) = (r6v55 ??), (r6v56 ??) binds: [B:55:0x015e, B:43:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x0162: PHI (r11v15 int) = (r11v51 int), (r11v18 int) binds: [B:55:0x015e, B:43:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x0162: PHI (r12v21 ??) = (r12v38 ??), (r12v39 ??) binds: [B:55:0x015e, B:43:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x0162: PHI (r13v7 ??) = (r13v18 ??), (r13v19 ??) binds: [B:55:0x015e, B:43:0x00d4] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {all -> 0x0167, blocks: (B:68:0x01a4, B:57:0x0162, B:54:0x0135), top: B:193:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01b5 A[Catch: ProtobufException -> 0x01d0, TryCatch #12 {ProtobufException -> 0x01d0, blocks: (B:70:0x01a7, B:72:0x01b5, B:78:0x01d5), top: B:210:0x01a7 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d5 A[Catch: ProtobufException -> 0x01d0, TRY_LEAVE, TryCatch #12 {ProtobufException -> 0x01d0, blocks: (B:70:0x01a7, B:72:0x01b5, B:78:0x01d5), top: B:210:0x01a7 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:85:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ff A[Catch: all -> 0x0209, TryCatch #6 {all -> 0x0209, blocks: (B:83:0x01f6, B:86:0x01ff, B:88:0x0203, B:92:0x020e, B:94:0x0212, B:95:0x0215, B:97:0x0219, B:98:0x021c, B:100:0x0220, B:101:0x0223, B:103:0x0227, B:105:0x022c, B:107:0x0230, B:108:0x0233, B:110:0x0237, B:111:0x023a, B:113:0x023e, B:118:0x0253, B:120:0x0257, B:121:0x025a, B:123:0x025e, B:124:0x0261, B:126:0x0265, B:127:0x0268), top: B:196:0x01f6 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0203 A[Catch: all -> 0x0209, TryCatch #6 {all -> 0x0209, blocks: (B:83:0x01f6, B:86:0x01ff, B:88:0x0203, B:92:0x020e, B:94:0x0212, B:95:0x0215, B:97:0x0219, B:98:0x021c, B:100:0x0220, B:101:0x0223, B:103:0x0227, B:105:0x022c, B:107:0x0230, B:108:0x0233, B:110:0x0237, B:111:0x023a, B:113:0x023e, B:118:0x0253, B:120:0x0257, B:121:0x025a, B:123:0x025e, B:124:0x0261, B:126:0x0265, B:127:0x0268), top: B:196:0x01f6 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x020e A[Catch: all -> 0x0209, TryCatch #6 {all -> 0x0209, blocks: (B:83:0x01f6, B:86:0x01ff, B:88:0x0203, B:92:0x020e, B:94:0x0212, B:95:0x0215, B:97:0x0219, B:98:0x021c, B:100:0x0220, B:101:0x0223, B:103:0x0227, B:105:0x022c, B:107:0x0230, B:108:0x0233, B:110:0x0237, B:111:0x023a, B:113:0x023e, B:118:0x0253, B:120:0x0257, B:121:0x025a, B:123:0x025e, B:124:0x0261, B:126:0x0265, B:127:0x0268), top: B:196:0x01f6 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0212 A[ADDED_TO_REGION, Catch: all -> 0x0209, REMOVE, TryCatch #6 {all -> 0x0209, blocks: (B:83:0x01f6, B:86:0x01ff, B:88:0x0203, B:92:0x020e, B:94:0x0212, B:95:0x0215, B:97:0x0219, B:98:0x021c, B:100:0x0220, B:101:0x0223, B:103:0x0227, B:105:0x022c, B:107:0x0230, B:108:0x0233, B:110:0x0237, B:111:0x023a, B:113:0x023e, B:118:0x0253, B:120:0x0257, B:121:0x025a, B:123:0x025e, B:124:0x0261, B:126:0x0265, B:127:0x0268), top: B:196:0x01f6 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0215 A[Catch: all -> 0x0209, TryCatch #6 {all -> 0x0209, blocks: (B:83:0x01f6, B:86:0x01ff, B:88:0x0203, B:92:0x020e, B:94:0x0212, B:95:0x0215, B:97:0x0219, B:98:0x021c, B:100:0x0220, B:101:0x0223, B:103:0x0227, B:105:0x022c, B:107:0x0230, B:108:0x0233, B:110:0x0237, B:111:0x023a, B:113:0x023e, B:118:0x0253, B:120:0x0257, B:121:0x025a, B:123:0x025e, B:124:0x0261, B:126:0x0265, B:127:0x0268), top: B:196:0x01f6 }] */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02e5, code lost:
    
        if (r2.l(r4) == r5) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0302, code lost:
    
        if (r2.l(r4) == r5) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x032e, code lost:
    
        if (r9.l(r4) == r5) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x036e, code lost:
    
        if (a(r0, r4) == r5) goto L186;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00b8: MOVE (r3 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:39:0x00b6 */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0169: MOVE (r6 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r11 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:60:0x0168 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x00ba: MOVE (r2 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:40:0x00b9 */
    /* JADX WARN: Type inference failed for: r0v34, types: [com.garmin.proto.generated.GDIGarminHealth$FileTransferRequest] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v29, types: [px2.f] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v47 */
    /* JADX WARN: Type inference failed for: r11v48 */
    /* JADX WARN: Type inference failed for: r11v49 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v50 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [px2.f] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18, types: [com.garmin.proto.generated.GDIGarminHealth$FileTransferRequest, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26, types: [com.garmin.proto.generated.GDIGarminHealth$FileTransferRequest, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, px2.f] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Object, px2.a, px2.f] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.garmin.proto.generated.GDIGarminHealth$FileTransferRequest, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [jx2.s] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17, types: [px2.f] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.garmin.proto.generated.GDIGarminHealth$FileTransferRequest, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v20, types: [px2.f] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30, types: [int] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35, types: [int] */
    /* JADX WARN: Type inference failed for: r2v36, types: [int] */
    /* JADX WARN: Type inference failed for: r2v40, types: [px2.f] */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r2v59 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [dt2.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [px2.f] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25, types: [dt2.k] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v3, types: [dt2.k] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v34, types: [int] */
    /* JADX WARN: Type inference failed for: r3v36, types: [px2.f] */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.io.Serializable, java.util.concurrent.atomic.AtomicBoolean] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29, types: [java.util.concurrent.atomic.AtomicBoolean] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v40, types: [ox2.c] */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v50 */
    /* JADX WARN: Type inference failed for: r6v51 */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v54, types: [int] */
    /* JADX WARN: Type inference failed for: r6v55 */
    /* JADX WARN: Type inference failed for: r6v56 */
    /* JADX WARN: Type inference failed for: r6v57 */
    /* JADX WARN: Type inference failed for: r6v58 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, ox2.c] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v24, types: [com.garmin.proto.generated.GDIGarminHealth$FileTransferRequest] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [int] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, px2.f] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.lang.Object, px2.a, px2.f] */
    /* JADX WARN: Type inference failed for: r9v22, types: [px2.f] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v25, types: [px2.f] */
    /* JADX WARN: Type inference failed for: r9v27, types: [com.garmin.proto.generated.GDIGarminHealth$FileTransferRequest] */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.concurrent.atomic.AtomicBoolean] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(GDIGarminHealth.FileTransferRequest fileTransferRequest, dt2.k kVar, v13.c cVar) throws Throwable {
        i iVar;
        ?? r14;
        Object obj;
        ?? r15;
        boolean z14;
        ?? r16;
        Object obj2;
        ?? r17;
        boolean z15;
        ?? r18;
        ?? r19;
        ?? r24;
        ?? r25;
        Throwable th3;
        GDISaMD.SaMDCommonFailures saMDCommonFailures;
        Throwable th4;
        ?? r26;
        GDISaMD.SaMDCommonFailures saMDCommonFailures2;
        ?? r27;
        GDISaMD.SaMDCommonFailures saMDCommonFailures3;
        GDISaMD.SaMDCommonFailures saMDCommonFailures4;
        ?? r110;
        ?? r28;
        ?? r29;
        ox2.c cVar2;
        ?? r34;
        ?? r111;
        GDIGarminHealth.Service.Builder builderD;
        ?? r35;
        ?? r36;
        ox2.c cVar3;
        ?? r37;
        ?? r112;
        ?? r38;
        ?? r39;
        ?? r44;
        ?? r45;
        ?? r46;
        ?? r47;
        ?? r48;
        ?? atomicBoolean;
        int i14;
        z zVarA;
        jx2.t tVar;
        ?? r113;
        ?? r114;
        int i15;
        zj2.e eVar;
        ?? r115;
        ?? r116;
        int i16;
        int i17;
        ?? r49;
        ?? r54;
        jx2.t tVar2;
        ?? r117;
        ?? r118;
        int i18;
        ?? r55;
        ?? r56;
        int i19;
        ox2.c cVar4;
        ?? r119;
        ?? r57;
        int i24;
        ?? r58;
        ?? r120;
        ?? r59;
        ?? r64;
        GDIGarminHealth.Service.Builder builderD2;
        boolean zHasFileXferResponse;
        ?? r65;
        int i25;
        ?? r66;
        int i26;
        ?? r67;
        ?? r68;
        ?? r69;
        ?? r73;
        ?? r74 = fileTransferRequest;
        ?? r75 = kVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i27 = iVar.f141817i;
            if ((i27 & Integer.MIN_VALUE) != 0) {
                iVar.f141817i = i27 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object objE0 = iVar.f141815g;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i28 = iVar.f141817i;
        ?? r76 = 2;
         = 2;
         = 2;
         = 2;
        ?? r77 = 2;
        ?? r78 = 1;
        try {
            try {
                switch (i28) {
                    case 0:
                        r.b(objE0);
                        this.f141794b.debug("handleMsg: GDIGarminHealth.FileTransferRequest...");
                        i14 = 0;
                        i17 = 0;
                        i14 = 0;
                        i26 = 0;
                        i14 = 0;
                        atomicBoolean = new AtomicBoolean(false);
                        try {
                            if (!r74.hasXferData()) {
                                s sVarG = g();
                                iVar.f141809a = this;
                                iVar.f141810b = r74;
                                iVar.f141811c = r75;
                                iVar.f141812d = atomicBoolean;
                                iVar.f141813e = 0;
                                iVar.f141814f = 0;
                                iVar.f141817i = 3;
                                int i29 = s.f101616h;
                                sVarG.getClass();
                                gx2.b.f80060a.getClass();
                                zVarA = gx2.b.d.a();
                                tVar = new jx2.t(sVarG, r74, null, null);
                                objE0 = ge1.b.e0(zVarA, tVar, iVar);
                                if (objE0 != aVar) {
                                    r74 = r74;
                                    r75 = r75;
                                    atomicBoolean = atomicBoolean;
                                    r78 = zVarA;
                                    r119 = tVar;
                                    r113 = this;
                                    r114 = r74;
                                    i15 = 0;
                                    r68 = r75;
                                    r67 = atomicBoolean;
                                    cVar4 = (ox2.c) objE0;
                                    r74 = i15;
                                    r64 = r68;
                                    r59 = r67;
                                    i14 = i26;
                                    r119 = r114;
                                    r120 = r113;
                                    r77 = cVar4;
                                    r78 = r120;
                                    builderD2 = r78.d(r119, null, r59.get());
                                    zHasFileXferResponse = builderD2.hasFileXferResponse();
                                    if (!zHasFileXferResponse) {
                                        iVar.f141809a = r78;
                                        iVar.f141810b = r119;
                                        iVar.f141811c = r77;
                                        iVar.f141812d = null;
                                        iVar.f141813e = i14 == true ? 1 : 0;
                                        iVar.f141814f = r74;
                                        atomicBoolean = 4;
                                        iVar.f141817i = 4;
                                        if (px2.a.c(builderD2, r64, iVar) == aVar) {
                                            r74 = r74;
                                            r75 = r64;
                                            r77 = r77;
                                            r78 = r78;
                                            i14 = i14;
                                            r119 = r119;
                                        }
                                        r74 = r74;
                                        atomicBoolean = zHasFileXferResponse;
                                        r77 = r77;
                                        r78 = r78;
                                        i14 = i14;
                                        r119 = r119;
                                        r65 = r77;
                                        i25 = i14 == true ? 1 : 0;
                                        r66 = r119;
                                        r73 = r74;
                                        r69 = r78;
                                        r46 = r66;
                                        r39 = r65;
                                        saMDCommonFailures3 = null;
                                        r45 = r73;
                                        r44 = i25;
                                        r38 = r69;
                                    } else {
                                        iVar.f141809a = r78;
                                        iVar.f141810b = r119;
                                        iVar.f141811c = r77;
                                        iVar.f141812d = null;
                                        iVar.f141813e = i14 == true ? 1 : 0;
                                        iVar.f141814f = r74;
                                        r75 = 5;
                                        iVar.f141817i = 5;
                                        if (r78.a(builderD2, iVar) != aVar) {
                                            r74 = r74;
                                            atomicBoolean = zHasFileXferResponse;
                                            r77 = r77;
                                            r78 = r78;
                                            i14 = i14;
                                            r119 = r119;
                                            r65 = r77;
                                            i25 = i14 == true ? 1 : 0;
                                            r66 = r119;
                                            r73 = r74;
                                            r69 = r78;
                                            r46 = r66;
                                            r39 = r65;
                                            saMDCommonFailures3 = null;
                                            r45 = r73;
                                            r44 = i25;
                                            r38 = r69;
                                        }
                                    }
                                    if (saMDCommonFailures3 == null) {
                                    }
                                    if (r44 != 0) {
                                        iVar.f141809a = null;
                                        iVar.f141810b = null;
                                        iVar.f141811c = null;
                                        iVar.f141812d = null;
                                        iVar.f141817i = 14;
                                        break;
                                    }
                                    return Unit.INSTANCE;
                                }
                                return aVar;
                            }
                            s sVarG2 = g();
                            eVar = this.f141796d;
                            l lVar = new l(atomicBoolean, this, r75);
                            iVar.f141809a = this;
                            iVar.f141810b = r74;
                            iVar.f141811c = r75;
                            iVar.f141812d = atomicBoolean;
                            iVar.f141813e = 0;
                            iVar.f141814f = 0;
                            iVar.f141817i = 1;
                            sVarG2.getClass();
                            objE0 = s.p(eVar, r74, lVar, iVar);
                            if (objE0 != aVar) {
                                r74 = r74;
                                r75 = r75;
                                atomicBoolean = atomicBoolean;
                                r119 = eVar;
                                r115 = this;
                                r116 = r74;
                                i16 = 0;
                                r54 = r75;
                                r49 = atomicBoolean;
                                s sVarG3 = r115.g();
                                iVar.f141809a = r115;
                                iVar.f141810b = r116;
                                iVar.f141811c = r54;
                                iVar.f141812d = r49;
                                iVar.f141813e = i17 == true ? 1 : 0;
                                iVar.f141814f = i16;
                                iVar.f141817i = 2;
                                sVarG3.getClass();
                                gx2.b.f80060a.getClass();
                                z zVarA2 = gx2.b.d.a();
                                tVar2 = new jx2.t(sVarG3, r116, (byte[]) objE0, null);
                                objE0 = ge1.b.e0(zVarA2, tVar2, iVar);
                                i19 = i16;
                                r56 = r54;
                                r55 = r49;
                                i18 = i17;
                                r118 = r116;
                                r117 = r115;
                                if (objE0 != aVar) {
                                    r74 = i16;
                                    r75 = r54;
                                    atomicBoolean = r49;
                                    r78 = tVar2;
                                    i14 = i17;
                                    r119 = r116;
                                } else {
                                    cVar4 = (ox2.c) objE0;
                                    r74 = i19;
                                    r64 = r56;
                                    r59 = r55;
                                    i14 = i18;
                                    r119 = r118;
                                    r120 = r117;
                                    r77 = cVar4;
                                    r78 = r120;
                                    try {
                                        builderD2 = r78.d(r119, null, r59.get());
                                        zHasFileXferResponse = builderD2.hasFileXferResponse();
                                        if (!zHasFileXferResponse) {
                                            iVar.f141809a = r78;
                                            iVar.f141810b = r119;
                                            iVar.f141811c = r77;
                                            iVar.f141812d = null;
                                            iVar.f141813e = i14 == true ? 1 : 0;
                                            iVar.f141814f = r74;
                                            atomicBoolean = 4;
                                            iVar.f141817i = 4;
                                            if (px2.a.c(builderD2, r64, iVar) == aVar) {
                                                r74 = r74;
                                                r75 = r64;
                                                r77 = r77;
                                                r78 = r78;
                                                i14 = i14;
                                                r119 = r119;
                                            }
                                            r74 = r74;
                                            atomicBoolean = zHasFileXferResponse;
                                            r77 = r77;
                                            r78 = r78;
                                            i14 = i14;
                                            r119 = r119;
                                            r65 = r77;
                                            i25 = i14 == true ? 1 : 0;
                                            r66 = r119;
                                            r73 = r74;
                                            r69 = r78;
                                            r46 = r66;
                                            r39 = r65;
                                            saMDCommonFailures3 = null;
                                            r45 = r73;
                                            r44 = i25;
                                            r38 = r69;
                                        } else {
                                            iVar.f141809a = r78;
                                            iVar.f141810b = r119;
                                            iVar.f141811c = r77;
                                            iVar.f141812d = null;
                                            iVar.f141813e = i14 == true ? 1 : 0;
                                            iVar.f141814f = r74;
                                            r75 = 5;
                                            iVar.f141817i = 5;
                                            if (r78.a(builderD2, iVar) != aVar) {
                                                r74 = r74;
                                                atomicBoolean = zHasFileXferResponse;
                                                r77 = r77;
                                                r78 = r78;
                                                i14 = i14;
                                                r119 = r119;
                                                r65 = r77;
                                                i25 = i14 == true ? 1 : 0;
                                                r66 = r119;
                                                r73 = r74;
                                                r69 = r78;
                                                r46 = r66;
                                                r39 = r65;
                                                saMDCommonFailures3 = null;
                                                r45 = r73;
                                                r44 = i25;
                                                r38 = r69;
                                            }
                                        }
                                    } catch (ProtobufException e4) {
                                        e = e4;
                                        r57 = r77;
                                        i24 = i14;
                                        r58 = r119;
                                        r78.f141794b.error("handleMsg -> 'GDIGarminHealth.FileTransferResponse'", (Throwable) e);
                                        r73 = r74;
                                        i25 = i24;
                                        r65 = r57;
                                        r66 = r58;
                                        r69 = r78;
                                    }
                                    if (saMDCommonFailures3 == null || r45 != 0) {
                                        if (r44 != 0) {
                                            iVar.f141809a = null;
                                            iVar.f141810b = null;
                                            iVar.f141811c = null;
                                            iVar.f141812d = null;
                                            iVar.f141817i = 14;
                                            break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                    try {
                                        ?? G = r38.g();
                                        r39.getClass();
                                        iVar.f141809a = r38;
                                        iVar.f141810b = null;
                                        iVar.f141811c = null;
                                        iVar.f141812d = null;
                                        iVar.f141817i = 10;
                                        if (G.o(r46, r39, iVar) != aVar) {
                                            r48 = r38;
                                            iVar.f141809a = null;
                                            iVar.f141817i = 11;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        r47 = r38;
                                        try {
                                            r47.f141794b.error("performUploadStatusCheck", th);
                                            iVar.f141809a = null;
                                            iVar.f141810b = null;
                                            iVar.f141811c = null;
                                            iVar.f141812d = null;
                                            iVar.f141817i = 12;
                                        } catch (Throwable th6) {
                                            iVar.f141809a = th6;
                                            iVar.f141810b = null;
                                            iVar.f141811c = null;
                                            iVar.f141812d = null;
                                            iVar.f141817i = 13;
                                            if (r47.l(iVar) != aVar) {
                                                throw th6;
                                            }
                                        }
                                    }
                                }
                                break;
                            }
                            return aVar;
                            r74 = r74;
                            r75 = r75;
                            atomicBoolean = atomicBoolean;
                            r78 = zVarA;
                            r119 = tVar;
                            r74 = r74;
                            r75 = r75;
                            atomicBoolean = atomicBoolean;
                            r119 = eVar;
                            r74 = r74;
                            atomicBoolean = zHasFileXferResponse;
                            r77 = r77;
                            r78 = r78;
                            i14 = i14;
                            r119 = r119;
                            break;
                        } catch (Throwable th7) {
                            r18 = atomicBoolean;
                            r19 = i14 == true ? 1 : 0;
                            r25 = th7;
                            r17 = r74;
                            r24 = r75;
                            r76 = r77;
                            r16 = i14;
                            try {
                                if (r25 instanceof GHSDuplicateUploadException) {
                                    saMDCommonFailures3 = null;
                                    r27 = 1;
                                    r110 = 1;
                                } else {
                                    if (r25 instanceof GHSSaMDIdMismatchException) {
                                        saMDCommonFailures4 = GDISaMD.SaMDCommonFailures.SAMDID_MISMATCH;
                                    } else if (!(r25 instanceof GHSInvalidFITArchiveException)) {
                                        saMDCommonFailures4 = GDISaMD.SaMDCommonFailures.OTHER;
                                    } else {
                                        if (r25 instanceof FileTransferNotReadyException) {
                                            saMDCommonFailures2 = GDISaMD.SaMDCommonFailures.NOT_READY;
                                        } else if (!(r25 instanceof GHSServerException)) {
                                            saMDCommonFailures2 = GDISaMD.SaMDCommonFailures.GHS_SERVER;
                                        } else if (r25 instanceof MFATokenNotBoundException) {
                                            saMDCommonFailures = GDISaMD.SaMDCommonFailures.NOT_READY;
                                            try {
                                                ge1.b.T(this.f141795c, s0.f129406a, null, new j(this, null), r76);
                                                r27 = r19;
                                                saMDCommonFailures3 = saMDCommonFailures;
                                                r110 = r16;
                                            } catch (Throwable th8) {
                                                th3 = th8;
                                                try {
                                                    GDIGarminHealth.Service.Builder builderD3 = d(r17, saMDCommonFailures, r18.get());
                                                    if (builderD3.hasFileXferResponse()) {
                                                        iVar.f141809a = this;
                                                        iVar.f141810b = th3;
                                                        iVar.f141811c = null;
                                                        iVar.f141812d = null;
                                                        iVar.f141817i = 8;
                                                        if (px2.a.c(builderD3, r24, iVar) == aVar) {
                                                            break;
                                                        }
                                                        throw th3;
                                                    }
                                                    iVar.f141809a = this;
                                                    iVar.f141810b = th3;
                                                    iVar.f141811c = null;
                                                    iVar.f141812d = null;
                                                    iVar.f141817i = 9;
                                                } catch (ProtobufException e14) {
                                                    e = e14;
                                                    th4 = th3;
                                                    r26 = this;
                                                    r26.f141794b.error("handleMsg -> 'GDIGarminHealth.FileTransferResponse'", (Throwable) e);
                                                    throw th4;
                                                }
                                            }
                                            break;
                                        } else if (r25 instanceof InvalidOAuth2DIBearerTokenException) {
                                            saMDCommonFailures2 = GDISaMD.SaMDCommonFailures.NOT_READY;
                                        } else if (r25 instanceof NetworkException) {
                                            saMDCommonFailures2 = GDISaMD.SaMDCommonFailures.NO_NETWORK_CONNECTION;
                                        } else if (r25 instanceof UserDoesNotConsentToUploadException) {
                                            saMDCommonFailures2 = GDISaMD.SaMDCommonFailures.NOT_READY;
                                        } else {
                                            saMDCommonFailures2 = GDISaMD.SaMDCommonFailures.OTHER;
                                        }
                                        r27 = r19;
                                        saMDCommonFailures3 = saMDCommonFailures2;
                                        r110 = r16;
                                    }
                                    saMDCommonFailures3 = saMDCommonFailures4;
                                    r27 = 1;
                                    r110 = r16;
                                }
                                try {
                                    builderD = d(r17, saMDCommonFailures3, r18.get());
                                    if (builderD.hasFileXferResponse()) {
                                        iVar.f141809a = this;
                                        iVar.f141810b = r17;
                                        iVar.f141811c = null;
                                        iVar.f141812d = saMDCommonFailures3;
                                        iVar.f141813e = r27;
                                        iVar.f141814f = r110;
                                        iVar.f141817i = 6;
                                        if (px2.a.c(builderD, r24, iVar) == aVar) {
                                        }
                                        r35 = r17;
                                        r36 = r27;
                                        cVar3 = null;
                                        r37 = r110;
                                        r112 = this;
                                        r46 = r35;
                                        r38 = r112;
                                        r45 = r37;
                                        r44 = r36;
                                        r39 = cVar3;
                                    } else {
                                        iVar.f141809a = this;
                                        iVar.f141810b = r17;
                                        iVar.f141811c = null;
                                        iVar.f141812d = saMDCommonFailures3;
                                        iVar.f141813e = r27;
                                        iVar.f141814f = r110;
                                        iVar.f141817i = 7;
                                        if (a(builderD, iVar) != aVar) {
                                            r35 = r17;
                                            r36 = r27;
                                            cVar3 = null;
                                            r37 = r110;
                                            r112 = this;
                                            r46 = r35;
                                            r38 = r112;
                                            r45 = r37;
                                            r44 = r36;
                                            r39 = cVar3;
                                        }
                                    }
                                    break;
                                } catch (ProtobufException e15) {
                                    e = e15;
                                    r28 = r17;
                                    r29 = r27;
                                    cVar2 = null;
                                    r34 = r110;
                                    r111 = this;
                                    r111.f141794b.error("handleMsg -> 'GDIGarminHealth.FileTransferResponse'", (Throwable) e);
                                    r37 = r34;
                                    r36 = r29;
                                    cVar3 = cVar2;
                                    r35 = r28;
                                    r112 = r111;
                                }
                                if (saMDCommonFailures3 == null) {
                                }
                                if (r44 != 0) {
                                    iVar.f141809a = null;
                                    iVar.f141810b = null;
                                    iVar.f141811c = null;
                                    iVar.f141812d = null;
                                    iVar.f141817i = 14;
                                    break;
                                }
                                return Unit.INSTANCE;
                            } catch (Throwable th9) {
                                th3 = th9;
                                saMDCommonFailures = null;
                            }
                        }
                        return aVar;
                    case 1:
                        int i30 = iVar.f141814f;
                        int i34 = iVar.f141813e;
                        AtomicBoolean atomicBoolean2 = (AtomicBoolean) iVar.f141812d;
                        dt2.k kVar2 = (dt2.k) iVar.f141811c;
                        GDIGarminHealth.FileTransferRequest fileTransferRequest2 = (GDIGarminHealth.FileTransferRequest) iVar.f141810b;
                        f fVar = (f) iVar.f141809a;
                        r.b(objE0);
                        i17 = i34;
                        r54 = kVar2;
                        i16 = i30;
                        r49 = atomicBoolean2;
                        r116 = fileTransferRequest2;
                        r115 = fVar;
                        s sVarG4 = r115.g();
                        iVar.f141809a = r115;
                        iVar.f141810b = r116;
                        iVar.f141811c = r54;
                        iVar.f141812d = r49;
                        iVar.f141813e = i17 == true ? 1 : 0;
                        iVar.f141814f = i16;
                        iVar.f141817i = 2;
                        sVarG4.getClass();
                        gx2.b.f80060a.getClass();
                        z zVarA3 = gx2.b.d.a();
                        tVar2 = new jx2.t(sVarG4, r116, (byte[]) objE0, null);
                        objE0 = ge1.b.e0(zVarA3, tVar2, iVar);
                        i19 = i16;
                        r56 = r54;
                        r55 = r49;
                        i18 = i17;
                        r118 = r116;
                        r117 = r115;
                        if (objE0 != aVar) {
                            cVar4 = (ox2.c) objE0;
                            r74 = i19;
                            r64 = r56;
                            r59 = r55;
                            i14 = i18;
                            r119 = r118;
                            r120 = r117;
                            r77 = cVar4;
                            r78 = r120;
                            builderD2 = r78.d(r119, null, r59.get());
                            zHasFileXferResponse = builderD2.hasFileXferResponse();
                            if (!zHasFileXferResponse) {
                                iVar.f141809a = r78;
                                iVar.f141810b = r119;
                                iVar.f141811c = r77;
                                iVar.f141812d = null;
                                iVar.f141813e = i14 == true ? 1 : 0;
                                iVar.f141814f = r74;
                                r75 = 5;
                                iVar.f141817i = 5;
                                if (r78.a(builderD2, iVar) != aVar) {
                                    r74 = r74;
                                    atomicBoolean = zHasFileXferResponse;
                                    r77 = r77;
                                    r78 = r78;
                                    i14 = i14;
                                    r119 = r119;
                                    r65 = r77;
                                    i25 = i14 == true ? 1 : 0;
                                    r66 = r119;
                                    r73 = r74;
                                    r69 = r78;
                                    r46 = r66;
                                    r39 = r65;
                                    saMDCommonFailures3 = null;
                                    r45 = r73;
                                    r44 = i25;
                                    r38 = r69;
                                }
                                return aVar;
                            }
                            iVar.f141809a = r78;
                            iVar.f141810b = r119;
                            iVar.f141811c = r77;
                            iVar.f141812d = null;
                            iVar.f141813e = i14 == true ? 1 : 0;
                            iVar.f141814f = r74;
                            atomicBoolean = 4;
                            iVar.f141817i = 4;
                            if (px2.a.c(builderD2, r64, iVar) == aVar) {
                                r74 = r74;
                                r75 = r64;
                                r77 = r77;
                                r78 = r78;
                                i14 = i14;
                                r119 = r119;
                            }
                            r74 = r74;
                            atomicBoolean = zHasFileXferResponse;
                            r77 = r77;
                            r78 = r78;
                            i14 = i14;
                            r119 = r119;
                            r65 = r77;
                            i25 = i14 == true ? 1 : 0;
                            r66 = r119;
                            r73 = r74;
                            r69 = r78;
                            r46 = r66;
                            r39 = r65;
                            saMDCommonFailures3 = null;
                            r45 = r73;
                            r44 = i25;
                            r38 = r69;
                            if (saMDCommonFailures3 == null) {
                            }
                            if (r44 != 0) {
                                iVar.f141809a = null;
                                iVar.f141810b = null;
                                iVar.f141811c = null;
                                iVar.f141812d = null;
                                iVar.f141817i = 14;
                                break;
                            }
                            return Unit.INSTANCE;
                        }
                        r74 = i16;
                        r75 = r54;
                        atomicBoolean = r49;
                        r78 = tVar2;
                        i14 = i17;
                        r119 = r116;
                        r74 = r74;
                        r75 = r75;
                        atomicBoolean = atomicBoolean;
                        r78 = zVarA;
                        r119 = tVar;
                        r74 = r74;
                        r75 = r75;
                        atomicBoolean = atomicBoolean;
                        r119 = eVar;
                        r74 = r74;
                        atomicBoolean = zHasFileXferResponse;
                        r77 = r77;
                        r78 = r78;
                        i14 = i14;
                        r119 = r119;
                        return aVar;
                    case 2:
                        int i35 = iVar.f141814f;
                        int i36 = iVar.f141813e;
                        AtomicBoolean atomicBoolean3 = (AtomicBoolean) iVar.f141812d;
                        dt2.k kVar3 = (dt2.k) iVar.f141811c;
                        GDIGarminHealth.FileTransferRequest fileTransferRequest3 = (GDIGarminHealth.FileTransferRequest) iVar.f141810b;
                        f fVar2 = (f) iVar.f141809a;
                        r.b(objE0);
                        i18 = i36;
                        r56 = kVar3;
                        i19 = i35;
                        r55 = atomicBoolean3;
                        r118 = fileTransferRequest3;
                        r117 = fVar2;
                        cVar4 = (ox2.c) objE0;
                        r74 = i19;
                        r64 = r56;
                        r59 = r55;
                        i14 = i18;
                        r119 = r118;
                        r120 = r117;
                        r77 = cVar4;
                        r78 = r120;
                        builderD2 = r78.d(r119, null, r59.get());
                        zHasFileXferResponse = builderD2.hasFileXferResponse();
                        if (!zHasFileXferResponse) {
                            iVar.f141809a = r78;
                            iVar.f141810b = r119;
                            iVar.f141811c = r77;
                            iVar.f141812d = null;
                            iVar.f141813e = i14 == true ? 1 : 0;
                            iVar.f141814f = r74;
                            r75 = 5;
                            iVar.f141817i = 5;
                            if (r78.a(builderD2, iVar) != aVar) {
                                r74 = r74;
                                r75 = r75;
                                atomicBoolean = atomicBoolean;
                                r78 = zVarA;
                                r119 = tVar;
                                r74 = r74;
                                r75 = r75;
                                atomicBoolean = atomicBoolean;
                                r119 = eVar;
                                r74 = r74;
                                atomicBoolean = zHasFileXferResponse;
                                r77 = r77;
                                r78 = r78;
                                i14 = i14;
                                r119 = r119;
                                break;
                            } else {
                                r74 = r74;
                                atomicBoolean = zHasFileXferResponse;
                                r77 = r77;
                                r78 = r78;
                                i14 = i14;
                                r119 = r119;
                                r65 = r77;
                                i25 = i14 == true ? 1 : 0;
                                r66 = r119;
                                r73 = r74;
                                r69 = r78;
                                r46 = r66;
                                r39 = r65;
                                saMDCommonFailures3 = null;
                                r45 = r73;
                                r44 = i25;
                                r38 = r69;
                            }
                            return aVar;
                        }
                        iVar.f141809a = r78;
                        iVar.f141810b = r119;
                        iVar.f141811c = r77;
                        iVar.f141812d = null;
                        iVar.f141813e = i14 == true ? 1 : 0;
                        iVar.f141814f = r74;
                        atomicBoolean = 4;
                        iVar.f141817i = 4;
                        if (px2.a.c(builderD2, r64, iVar) == aVar) {
                            r74 = r74;
                            r75 = r64;
                            r77 = r77;
                            r78 = r78;
                            i14 = i14;
                            r119 = r119;
                            r74 = r74;
                            r75 = r75;
                            atomicBoolean = atomicBoolean;
                            r78 = zVarA;
                            r119 = tVar;
                            r74 = r74;
                            r75 = r75;
                            atomicBoolean = atomicBoolean;
                            r119 = eVar;
                            r74 = r74;
                            atomicBoolean = zHasFileXferResponse;
                            r77 = r77;
                            r78 = r78;
                            i14 = i14;
                            r119 = r119;
                            return aVar;
                        }
                        r74 = r74;
                        atomicBoolean = zHasFileXferResponse;
                        r77 = r77;
                        r78 = r78;
                        i14 = i14;
                        r119 = r119;
                        r65 = r77;
                        i25 = i14 == true ? 1 : 0;
                        r66 = r119;
                        r73 = r74;
                        r69 = r78;
                        r46 = r66;
                        r39 = r65;
                        saMDCommonFailures3 = null;
                        r45 = r73;
                        r44 = i25;
                        r38 = r69;
                        if (saMDCommonFailures3 == null) {
                        }
                        if (r44 != 0) {
                            iVar.f141809a = null;
                            iVar.f141810b = null;
                            iVar.f141811c = null;
                            iVar.f141812d = null;
                            iVar.f141817i = 14;
                            break;
                        }
                        return Unit.INSTANCE;
                    case 3:
                        int i37 = iVar.f141814f;
                        int i38 = iVar.f141813e;
                        AtomicBoolean atomicBoolean4 = (AtomicBoolean) iVar.f141812d;
                        dt2.k kVar4 = (dt2.k) iVar.f141811c;
                        GDIGarminHealth.FileTransferRequest fileTransferRequest4 = (GDIGarminHealth.FileTransferRequest) iVar.f141810b;
                        f fVar3 = (f) iVar.f141809a;
                        r.b(objE0);
                        i26 = i38;
                        r68 = kVar4;
                        i15 = i37;
                        r67 = atomicBoolean4;
                        r114 = fileTransferRequest4;
                        r113 = fVar3;
                        cVar4 = (ox2.c) objE0;
                        r74 = i15;
                        r64 = r68;
                        r59 = r67;
                        i14 = i26;
                        r119 = r114;
                        r120 = r113;
                        r77 = cVar4;
                        r78 = r120;
                        builderD2 = r78.d(r119, null, r59.get());
                        zHasFileXferResponse = builderD2.hasFileXferResponse();
                        if (!zHasFileXferResponse) {
                            iVar.f141809a = r78;
                            iVar.f141810b = r119;
                            iVar.f141811c = r77;
                            iVar.f141812d = null;
                            iVar.f141813e = i14 == true ? 1 : 0;
                            iVar.f141814f = r74;
                            r75 = 5;
                            iVar.f141817i = 5;
                            if (r78.a(builderD2, iVar) != aVar) {
                                r74 = r74;
                                r75 = r75;
                                atomicBoolean = atomicBoolean;
                                r78 = zVarA;
                                r119 = tVar;
                                r74 = r74;
                                r75 = r75;
                                atomicBoolean = atomicBoolean;
                                r119 = eVar;
                                r74 = r74;
                                atomicBoolean = zHasFileXferResponse;
                                r77 = r77;
                                r78 = r78;
                                i14 = i14;
                                r119 = r119;
                                break;
                            } else {
                                r74 = r74;
                                atomicBoolean = zHasFileXferResponse;
                                r77 = r77;
                                r78 = r78;
                                i14 = i14;
                                r119 = r119;
                                r65 = r77;
                                i25 = i14 == true ? 1 : 0;
                                r66 = r119;
                                r73 = r74;
                                r69 = r78;
                                r46 = r66;
                                r39 = r65;
                                saMDCommonFailures3 = null;
                                r45 = r73;
                                r44 = i25;
                                r38 = r69;
                            }
                            return aVar;
                        }
                        iVar.f141809a = r78;
                        iVar.f141810b = r119;
                        iVar.f141811c = r77;
                        iVar.f141812d = null;
                        iVar.f141813e = i14 == true ? 1 : 0;
                        iVar.f141814f = r74;
                        atomicBoolean = 4;
                        iVar.f141817i = 4;
                        if (px2.a.c(builderD2, r64, iVar) == aVar) {
                            r74 = r74;
                            r75 = r64;
                            r77 = r77;
                            r78 = r78;
                            i14 = i14;
                            r119 = r119;
                            r74 = r74;
                            r75 = r75;
                            atomicBoolean = atomicBoolean;
                            r78 = zVarA;
                            r119 = tVar;
                            r74 = r74;
                            r75 = r75;
                            atomicBoolean = atomicBoolean;
                            r119 = eVar;
                            r74 = r74;
                            atomicBoolean = zHasFileXferResponse;
                            r77 = r77;
                            r78 = r78;
                            i14 = i14;
                            r119 = r119;
                            return aVar;
                        }
                        r74 = r74;
                        atomicBoolean = zHasFileXferResponse;
                        r77 = r77;
                        r78 = r78;
                        i14 = i14;
                        r119 = r119;
                        r65 = r77;
                        i25 = i14 == true ? 1 : 0;
                        r66 = r119;
                        r73 = r74;
                        r69 = r78;
                        r46 = r66;
                        r39 = r65;
                        saMDCommonFailures3 = null;
                        r45 = r73;
                        r44 = i25;
                        r38 = r69;
                        if (saMDCommonFailures3 == null) {
                        }
                        if (r44 != 0) {
                            iVar.f141809a = null;
                            iVar.f141810b = null;
                            iVar.f141811c = null;
                            iVar.f141812d = null;
                            iVar.f141817i = 14;
                            break;
                        }
                        return Unit.INSTANCE;
                    case 4:
                    case 5:
                        r74 = iVar.f141814f;
                        i24 = iVar.f141813e;
                        r57 = (ox2.c) iVar.f141811c;
                        r58 = (GDIGarminHealth.FileTransferRequest) iVar.f141810b;
                        r78 = (f) iVar.f141809a;
                        try {
                            r.b(objE0);
                            r73 = r74;
                            i25 = i24;
                            r65 = r57;
                            r66 = r58;
                            r69 = r78;
                            break;
                        } catch (ProtobufException e16) {
                            e = e16;
                            r78.f141794b.error("handleMsg -> 'GDIGarminHealth.FileTransferResponse'", (Throwable) e);
                            r73 = r74;
                            i25 = i24;
                            r65 = r57;
                            r66 = r58;
                            r69 = r78;
                        }
                        r46 = r66;
                        r39 = r65;
                        saMDCommonFailures3 = null;
                        r45 = r73;
                        r44 = i25;
                        r38 = r69;
                        if (saMDCommonFailures3 == null) {
                        }
                        if (r44 != 0) {
                            iVar.f141809a = null;
                            iVar.f141810b = null;
                            iVar.f141811c = null;
                            iVar.f141812d = null;
                            iVar.f141817i = 14;
                            break;
                        }
                        return Unit.INSTANCE;
                    case 6:
                    case 7:
                        r34 = iVar.f141814f;
                        r29 = iVar.f141813e;
                        saMDCommonFailures3 = (GDISaMD.SaMDCommonFailures) iVar.f141812d;
                        cVar2 = (ox2.c) iVar.f141811c;
                        r28 = (GDIGarminHealth.FileTransferRequest) iVar.f141810b;
                        r111 = (f) iVar.f141809a;
                        try {
                            r.b(objE0);
                            r37 = r34;
                            r36 = r29;
                            cVar3 = cVar2;
                            r35 = r28;
                            r112 = r111;
                            break;
                        } catch (ProtobufException e17) {
                            e = e17;
                            r111.f141794b.error("handleMsg -> 'GDIGarminHealth.FileTransferResponse'", (Throwable) e);
                            r37 = r34;
                            r36 = r29;
                            cVar3 = cVar2;
                            r35 = r28;
                            r112 = r111;
                        }
                        r46 = r35;
                        r38 = r112;
                        r45 = r37;
                        r44 = r36;
                        r39 = cVar3;
                        if (saMDCommonFailures3 == null) {
                        }
                        if (r44 != 0) {
                            iVar.f141809a = null;
                            iVar.f141810b = null;
                            iVar.f141811c = null;
                            iVar.f141812d = null;
                            iVar.f141817i = 14;
                            break;
                        }
                        return Unit.INSTANCE;
                    case 8:
                    case 9:
                        th4 = (Throwable) iVar.f141810b;
                        r26 = (f) iVar.f141809a;
                        try {
                            r.b(objE0);
                            throw th4;
                        } catch (ProtobufException e18) {
                            e = e18;
                            r26.f141794b.error("handleMsg -> 'GDIGarminHealth.FileTransferResponse'", (Throwable) e);
                            throw th4;
                        }
                    case 10:
                        r47 = (f) iVar.f141809a;
                        try {
                            r.b(objE0);
                            r48 = r47;
                            iVar.f141809a = null;
                            iVar.f141817i = 11;
                        } catch (Throwable th10) {
                            th = th10;
                            r47.f141794b.error("performUploadStatusCheck", th);
                            iVar.f141809a = null;
                            iVar.f141810b = null;
                            iVar.f141811c = null;
                            iVar.f141812d = null;
                            iVar.f141817i = 12;
                        }
                        break;
                    case 11:
                    case 12:
                        r.b(objE0);
                        return Unit.INSTANCE;
                    case 13:
                        Throwable th11 = (Throwable) iVar.f141809a;
                        r.b(objE0);
                        throw th11;
                    case 14:
                        r.b(objE0);
                        return Unit.INSTANCE;
                    default:
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            } catch (Throwable th12) {
                r14 = z15 ? 1 : 0;
                z14 = th12;
                r15 = r75;
                r16 = r74;
                r17 = obj2;
                r25 = z14;
                r24 = r15;
                r19 = r14;
                r18 = i28;
                if (r25 instanceof GHSDuplicateUploadException) {
                    saMDCommonFailures3 = null;
                    r27 = 1;
                    r110 = 1;
                } else {
                    if (r25 instanceof GHSSaMDIdMismatchException) {
                        saMDCommonFailures4 = GDISaMD.SaMDCommonFailures.SAMDID_MISMATCH;
                    } else if (!(r25 instanceof GHSInvalidFITArchiveException) || (r25 instanceof GHSInvalidFITFileException) || (r25 instanceof InvalidFileTransferProtobufRequestException)) {
                        saMDCommonFailures4 = GDISaMD.SaMDCommonFailures.OTHER;
                    } else {
                        if (r25 instanceof FileTransferNotReadyException) {
                            saMDCommonFailures2 = GDISaMD.SaMDCommonFailures.NOT_READY;
                        } else if (!(r25 instanceof GHSServerException) || (r25 instanceof GHSServerNotAvailableException)) {
                            saMDCommonFailures2 = GDISaMD.SaMDCommonFailures.GHS_SERVER;
                        } else if (r25 instanceof MFATokenNotBoundException) {
                            saMDCommonFailures = GDISaMD.SaMDCommonFailures.NOT_READY;
                            ge1.b.T(this.f141795c, s0.f129406a, null, new j(this, null), r76);
                            r27 = r19;
                            saMDCommonFailures3 = saMDCommonFailures;
                            r110 = r16;
                        } else if (r25 instanceof InvalidOAuth2DIBearerTokenException) {
                            saMDCommonFailures2 = GDISaMD.SaMDCommonFailures.NOT_READY;
                        } else if (r25 instanceof NetworkException) {
                            saMDCommonFailures2 = GDISaMD.SaMDCommonFailures.NO_NETWORK_CONNECTION;
                        } else if (r25 instanceof UserDoesNotConsentToUploadException) {
                            saMDCommonFailures2 = GDISaMD.SaMDCommonFailures.NOT_READY;
                        } else {
                            saMDCommonFailures2 = GDISaMD.SaMDCommonFailures.OTHER;
                        }
                        r27 = r19;
                        saMDCommonFailures3 = saMDCommonFailures2;
                        r110 = r16;
                    }
                    saMDCommonFailures3 = saMDCommonFailures4;
                    r27 = 1;
                    r110 = r16;
                }
                builderD = d(r17, saMDCommonFailures3, r18.get());
                if (builderD.hasFileXferResponse()) {
                    iVar.f141809a = this;
                    iVar.f141810b = r17;
                    iVar.f141811c = null;
                    iVar.f141812d = saMDCommonFailures3;
                    iVar.f141813e = r27;
                    iVar.f141814f = r110;
                    iVar.f141817i = 7;
                    if (a(builderD, iVar) != aVar) {
                        r35 = r17;
                        r36 = r27;
                        cVar3 = null;
                        r37 = r110;
                        r112 = this;
                        r46 = r35;
                        r38 = r112;
                        r45 = r37;
                        r44 = r36;
                        r39 = cVar3;
                    }
                    return aVar;
                }
                iVar.f141809a = this;
                iVar.f141810b = r17;
                iVar.f141811c = null;
                iVar.f141812d = saMDCommonFailures3;
                iVar.f141813e = r27;
                iVar.f141814f = r110;
                iVar.f141817i = 6;
                if (px2.a.c(builderD, r24, iVar) == aVar) {
                    return aVar;
                }
                r35 = r17;
                r36 = r27;
                cVar3 = null;
                r37 = r110;
                r112 = this;
                r46 = r35;
                r38 = r112;
                r45 = r37;
                r44 = r36;
                r39 = cVar3;
                if (saMDCommonFailures3 == null) {
                }
                if (r44 != 0) {
                    iVar.f141809a = null;
                    iVar.f141810b = null;
                    iVar.f141811c = null;
                    iVar.f141812d = null;
                    iVar.f141817i = 14;
                }
                return Unit.INSTANCE;
            }
        } catch (Throwable th13) {
            r14 = r75;
            r15 = obj;
            z14 = th13;
            r16 = r74;
            r17 = obj2;
            r25 = z14;
            r24 = r15;
            r19 = r14;
            r18 = i28;
            if (r25 instanceof GHSDuplicateUploadException) {
                saMDCommonFailures3 = null;
                r27 = 1;
                r110 = 1;
            } else {
                if (r25 instanceof GHSSaMDIdMismatchException) {
                    saMDCommonFailures4 = GDISaMD.SaMDCommonFailures.SAMDID_MISMATCH;
                } else if (!(r25 instanceof GHSInvalidFITArchiveException)) {
                    saMDCommonFailures4 = GDISaMD.SaMDCommonFailures.OTHER;
                } else {
                    if (r25 instanceof FileTransferNotReadyException) {
                        saMDCommonFailures2 = GDISaMD.SaMDCommonFailures.NOT_READY;
                    } else if (!(r25 instanceof GHSServerException)) {
                        saMDCommonFailures2 = GDISaMD.SaMDCommonFailures.GHS_SERVER;
                    } else if (r25 instanceof MFATokenNotBoundException) {
                        saMDCommonFailures = GDISaMD.SaMDCommonFailures.NOT_READY;
                        ge1.b.T(this.f141795c, s0.f129406a, null, new j(this, null), r76);
                        r27 = r19;
                        saMDCommonFailures3 = saMDCommonFailures;
                        r110 = r16;
                    } else if (r25 instanceof InvalidOAuth2DIBearerTokenException) {
                        saMDCommonFailures2 = GDISaMD.SaMDCommonFailures.NOT_READY;
                    } else if (r25 instanceof NetworkException) {
                        saMDCommonFailures2 = GDISaMD.SaMDCommonFailures.NO_NETWORK_CONNECTION;
                    } else if (r25 instanceof UserDoesNotConsentToUploadException) {
                        saMDCommonFailures2 = GDISaMD.SaMDCommonFailures.NOT_READY;
                    } else {
                        saMDCommonFailures2 = GDISaMD.SaMDCommonFailures.OTHER;
                    }
                    r27 = r19;
                    saMDCommonFailures3 = saMDCommonFailures2;
                    r110 = r16;
                }
                saMDCommonFailures3 = saMDCommonFailures4;
                r27 = 1;
                r110 = r16;
            }
            builderD = d(r17, saMDCommonFailures3, r18.get());
            if (builderD.hasFileXferResponse()) {
                iVar.f141809a = this;
                iVar.f141810b = r17;
                iVar.f141811c = null;
                iVar.f141812d = saMDCommonFailures3;
                iVar.f141813e = r27;
                iVar.f141814f = r110;
                iVar.f141817i = 7;
                if (a(builderD, iVar) != aVar) {
                    r35 = r17;
                    r36 = r27;
                    cVar3 = null;
                    r37 = r110;
                    r112 = this;
                    r46 = r35;
                    r38 = r112;
                    r45 = r37;
                    r44 = r36;
                    r39 = cVar3;
                }
                return aVar;
            }
            iVar.f141809a = this;
            iVar.f141810b = r17;
            iVar.f141811c = null;
            iVar.f141812d = saMDCommonFailures3;
            iVar.f141813e = r27;
            iVar.f141814f = r110;
            iVar.f141817i = 6;
            if (px2.a.c(builderD, r24, iVar) == aVar) {
                return aVar;
            }
            r35 = r17;
            r36 = r27;
            cVar3 = null;
            r37 = r110;
            r112 = this;
            r46 = r35;
            r38 = r112;
            r45 = r37;
            r44 = r36;
            r39 = cVar3;
            if (saMDCommonFailures3 == null) {
            }
            if (r44 != 0) {
                iVar.f141809a = null;
                iVar.f141810b = null;
                iVar.f141811c = null;
                iVar.f141812d = null;
                iVar.f141817i = 14;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d0, code lost:
    
        if (r9 == r1) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [dt2.k] */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r9v0, types: [dt2.k] */
    /* JADX WARN: Type inference failed for: r9v1, types: [px2.f] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [dt2.k] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(dt2.k kVar, v13.c cVar) {
        h hVar;
        f fVar;
        GDISaMD.SaMDCommonFailures saMDCommonFailures;
        ?? r14;
        ?? r15;
        f fVar2;
        ?? r16;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f141808e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f141808e = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object obj = hVar.f141806c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f141808e;
        try {
            if (i15 == 0) {
                r.b(obj);
                this.f141794b.debug("handleMsg: GDIGarminHealth.FileTransferPrecheckRequest...");
                try {
                    s sVarG = g();
                    hVar.f141804a = this;
                    hVar.f141805b = kVar;
                    hVar.f141808e = 1;
                    sVarG.getClass();
                    gx2.b.f80060a.getClass();
                    if (ge1.b.e0(gx2.b.d.a(), new v(sVarG, true, null), hVar) != aVar) {
                        fVar = this;
                        r16 = kVar;
                        r15 = r16;
                        fVar2 = fVar;
                        saMDCommonFailures = null;
                        GDIGarminHealth.Service.Builder builderF = fVar2.f(saMDCommonFailures);
                        hVar.f141804a = fVar2;
                        hVar.f141805b = null;
                        hVar.f141808e = 2;
                        Object objC = px2.a.c(builderF, r15, hVar);
                        kVar = objC;
                    }
                } catch (FileTransferNotReadyException unused) {
                    fVar = this;
                    saMDCommonFailures = GDISaMD.SaMDCommonFailures.NOT_READY;
                    r14 = kVar;
                    r15 = r14;
                    fVar2 = fVar;
                } catch (GHSEnvironmentNotSupportedException e4) {
                    e = e4;
                    fVar = this;
                    fVar.f141794b.warn("handleMsg: GDIGarminHealth.FileTransferPrecheckRequest (GHSEnvironmentNotSupportedException) {}", e.getMessage());
                    saMDCommonFailures = GDISaMD.SaMDCommonFailures.OTHER;
                    r14 = kVar;
                    r15 = r14;
                    fVar2 = fVar;
                } catch (GHSServerNotAvailableException e14) {
                    e = e14;
                    fVar = this;
                    fVar.f141794b.warn("handleMsg: GDIGarminHealth.FileTransferPrecheckRequest (GHSServerNotAvailableException) {}", e.getMessage());
                    saMDCommonFailures = GDISaMD.SaMDCommonFailures.GHS_SERVER;
                    r14 = kVar;
                    r15 = r14;
                    fVar2 = fVar;
                } catch (InvalidOAuth2DIBearerTokenException unused2) {
                    fVar = this;
                    saMDCommonFailures = GDISaMD.SaMDCommonFailures.NO_APP_AUTHORIZATION;
                    r14 = kVar;
                    r15 = r14;
                    fVar2 = fVar;
                } catch (NetworkException unused3) {
                    fVar = this;
                    saMDCommonFailures = GDISaMD.SaMDCommonFailures.NO_NETWORK_CONNECTION;
                    r14 = kVar;
                    r15 = r14;
                    fVar2 = fVar;
                } catch (UserDoesNotConsentToUploadException unused4) {
                    fVar = this;
                    saMDCommonFailures = GDISaMD.SaMDCommonFailures.NO_UPLOAD_CONSENT;
                    r14 = kVar;
                    r15 = r14;
                    fVar2 = fVar;
                } catch (Throwable th3) {
                    th = th3;
                    fVar = this;
                    saMDCommonFailures = GDISaMD.SaMDCommonFailures.OTHER;
                    fVar.f141794b.error("handleMsg: GDIGarminHealth.FileTransferPrecheckRequest", th);
                    r14 = kVar;
                    r15 = r14;
                    fVar2 = fVar;
                }
                return aVar;
            }
            if (i15 == 1) {
                kVar = hVar.f141805b;
                fVar = hVar.f141804a;
                try {
                    r.b(obj);
                    r16 = kVar;
                    r15 = r16;
                    fVar2 = fVar;
                    saMDCommonFailures = null;
                } catch (FileTransferNotReadyException unused5) {
                    saMDCommonFailures = GDISaMD.SaMDCommonFailures.NOT_READY;
                    r14 = kVar;
                    r15 = r14;
                    fVar2 = fVar;
                } catch (GHSEnvironmentNotSupportedException e15) {
                    e = e15;
                    fVar.f141794b.warn("handleMsg: GDIGarminHealth.FileTransferPrecheckRequest (GHSEnvironmentNotSupportedException) {}", e.getMessage());
                    saMDCommonFailures = GDISaMD.SaMDCommonFailures.OTHER;
                    r14 = kVar;
                    r15 = r14;
                    fVar2 = fVar;
                } catch (GHSServerNotAvailableException e16) {
                    e = e16;
                    fVar.f141794b.warn("handleMsg: GDIGarminHealth.FileTransferPrecheckRequest (GHSServerNotAvailableException) {}", e.getMessage());
                    saMDCommonFailures = GDISaMD.SaMDCommonFailures.GHS_SERVER;
                    r14 = kVar;
                    r15 = r14;
                    fVar2 = fVar;
                } catch (InvalidOAuth2DIBearerTokenException unused6) {
                    saMDCommonFailures = GDISaMD.SaMDCommonFailures.NO_APP_AUTHORIZATION;
                    r14 = kVar;
                    r15 = r14;
                    fVar2 = fVar;
                } catch (NetworkException unused7) {
                    saMDCommonFailures = GDISaMD.SaMDCommonFailures.NO_NETWORK_CONNECTION;
                    r14 = kVar;
                    r15 = r14;
                    fVar2 = fVar;
                } catch (UserDoesNotConsentToUploadException unused8) {
                    saMDCommonFailures = GDISaMD.SaMDCommonFailures.NO_UPLOAD_CONSENT;
                    r14 = kVar;
                    r15 = r14;
                    fVar2 = fVar;
                } catch (Throwable th4) {
                    th = th4;
                    saMDCommonFailures = GDISaMD.SaMDCommonFailures.OTHER;
                    fVar.f141794b.error("handleMsg: GDIGarminHealth.FileTransferPrecheckRequest", th);
                    r14 = kVar;
                    r15 = r14;
                    fVar2 = fVar;
                }
                GDIGarminHealth.Service.Builder builderF2 = fVar2.f(saMDCommonFailures);
                hVar.f141804a = fVar2;
                hVar.f141805b = null;
                hVar.f141808e = 2;
                Object objC2 = px2.a.c(builderF2, r15, hVar);
                kVar = objC2;
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                f fVar3 = hVar.f141804a;
                r.b(obj);
                kVar = fVar3;
            }
        } catch (ProtobufException e17) {
            kVar.f141794b.error("handleMsg: GDIGarminHealth.FileTransferPrecheckRequest", (Throwable) e17);
        }
        return Unit.INSTANCE;
    }

    public final Object k(GDIGarminHealth.Service service, long j8, dt2.k kVar, v13.i iVar) {
        if (service.hasTokenRequest()) {
            service.getTokenRequest().getClass();
            Object objH = h(j8, kVar, iVar);
            if (objH == u13.a.COROUTINE_SUSPENDED) {
                return objH;
            }
        } else if (service.hasFileXferPrecheckRequest()) {
            service.getFileXferPrecheckRequest().getClass();
            Object objJ = j(kVar, iVar);
            if (objJ == u13.a.COROUTINE_SUSPENDED) {
                return objJ;
            }
        } else if (service.hasFileXferRequest()) {
            GDIGarminHealth.FileTransferRequest fileXferRequest = service.getFileXferRequest();
            fileXferRequest.getClass();
            Object objI = i(fileXferRequest, kVar, iVar);
            if (objI == u13.a.COROUTINE_SUSPENDED) {
                return objI;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(v13.c cVar) {
        m mVar;
        f fVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f141829d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f141829d = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object obj = mVar.f141827b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f141829d;
        if (i15 == 0) {
            r.b(obj);
            try {
                this.f141794b.debug("GDIGarminHealth.FileTransferReadyForNext");
                g().f101618c = SystemClock.elapsedRealtime();
                GDIGarminHealth.Service.Builder fileXferReadyForNext = GDIGarminHealth.Service.newBuilder().setFileXferReadyForNext(GDIGarminHealth.FileTransferReadyForNext.newBuilder());
                fileXferReadyForNext.getClass();
                mVar.f141826a = this;
                mVar.f141829d = 1;
                if (a(fileXferReadyForNext, mVar) == aVar) {
                    return aVar;
                }
            } catch (ProtobufException e4) {
                e = e4;
                fVar = this;
                fVar.f141794b.error("GDIGarminHealth.FileTransferReadyForNext", (Throwable) e);
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fVar = mVar.f141826a;
            try {
                r.b(obj);
            } catch (ProtobufException e14) {
                e = e14;
                fVar.f141794b.error("GDIGarminHealth.FileTransferReadyForNext", (Throwable) e);
            }
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ f(dt2.g gVar, rs2.c cVar, Logger logger, b0 b0Var, zj2.e eVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(gVar, cVar, logger, b0Var, (i14 & 16) != 0 ? null : eVar);
    }
}
