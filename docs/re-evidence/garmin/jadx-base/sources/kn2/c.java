package kn2;

import c83.a0;
import com.google.mlkit.common.MlKitException;
import e13.m;
import java.util.HashMap;
import java.util.concurrent.Callable;
import lc.u0;
import ln2.e;
import lq2.d;
import mn2.o;
import mn2.t;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import r1.q2;
import sd2.f;
import wr2.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lkn2/c;", "Ljava/util/concurrent/Callable;", "Lkn2/b;", "Lzi2/a;", "connectEnvironment", "", "unitId", "", "productNumber", "", "compress", "maxWidth", "maxHeight", "", "url", "<init>", "(Lzi2/a;JIZIILjava/lang/String;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements Callable<b> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f105691g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f105692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f105693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f105694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f105695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f105696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f105697f;

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f105691g = gt2.b.f79005a.h("PAY#WalletItemCiqImageRetriever");
    }

    public c(zi2.a aVar, long j8, int i14, boolean z14, int i15, int i16, String str) {
        aVar.getClass();
        str.getClass();
        this.f105692a = j8;
        this.f105693b = i14;
        this.f105694c = z14;
        this.f105695d = i15;
        this.f105696e = i16;
        this.f105697f = str;
    }

    @Override // java.util.concurrent.Callable
    public final b call() throws Exception {
        byte[] bArrBytes;
        int length;
        i.f186861a.getClass();
        d dVar = new d(this.f105692a, 1);
        int i14 = w03.b.f181178a;
        HashMap mapB = t.b((f) new m(dVar).c());
        e.f113687a.getClass();
        c83.d<ResponseBody> dVarA = ((o) e.c().b(o.class)).a(mapB, this.f105692a, this.f105693b, this.f105694c, this.f105695d, this.f105696e, this.f105697f);
        HttpUrl httpUrlUrl = dVarA.request().url();
        Logger logger = f105691g;
        logger.debug("Full GCS Url: " + httpUrlUrl);
        a0<ResponseBody> a0VarExecute = dVarA.execute();
        Response response = a0VarExecute.f25745a;
        String str = response.headers().get("X-Rate-Limit-Remaining");
        if (str != null) {
            logger.debug("X-Rate-Limit-Remaining: ".concat(str));
        }
        switch (response.code()) {
            case 200:
            case 201:
            case 202:
            case MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE /* 203 */:
            case MlKitException.CODE_SCANNER_TASK_IN_PROGRESS /* 204 */:
            case MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR /* 205 */:
            case MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR /* 206 */:
                ResponseBody responseBody = a0VarExecute.f25746b;
                if (responseBody != null) {
                    try {
                        bArrBytes = responseBody.bytes();
                        break;
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            jg.b.l(responseBody, th3);
                            throw th4;
                        }
                    }
                } else {
                    bArrBytes = null;
                }
                jg.b.l(responseBody, null);
                if (bArrBytes == null) {
                    String str2 = "Received " + response.code() + " but response didn't have image for:\n" + httpUrlUrl;
                    logger.error(str2);
                    q2.u(str2);
                    return null;
                }
                boolean z14 = this.f105694c;
                if (z14) {
                    String str3 = response.headers().get("Original-Image-Size");
                    str3.getClass();
                    length = Integer.parseInt(str3);
                } else {
                    if (z14) {
                        u0.r();
                        return null;
                    }
                    length = bArrBytes.length;
                }
                return new b(z14, length, bArrBytes);
            default:
                int iCode = response.code();
                ResponseBody responseBody2 = a0VarExecute.f25747c;
                String str4 = "Received " + iCode + " for:\n" + httpUrlUrl + "\n" + (responseBody2 != null ? responseBody2.string() : null);
                logger.error(str4);
                q2.u(str4);
                return null;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lkn2/c$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "", "HEADER_RATE_LIMIT_REMAINING", "Ljava/lang/String;", "HEADER_ORIGINAL_IMAGE_SIZE", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ c(zi2.a aVar, long j8, int i14, boolean z14, int i15, int i16, String str, int i17, j jVar) {
        this(aVar, j8, i14, (i17 & 8) != 0 ? true : z14, i15, i16, str);
    }
}
