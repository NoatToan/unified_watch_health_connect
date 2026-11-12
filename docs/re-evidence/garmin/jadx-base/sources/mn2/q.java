package mn2;

import c83.a0;
import com.garmin.feature.garminpay.providers.felica.exception.server.FNValidateException;
import com.garmin.feature.garminpay.providers.unionpay.exception.NetworkException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.slf4j.Logger;
import tn2.r0;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class q implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119832a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f119833b;

    public /* synthetic */ q(a0 a0Var) {
        this.f119833b = a0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() throws NetworkException, IOException, FNValidateException {
        byte[] bArrCopyOfRange;
        switch (this.f119832a) {
            case 0:
                Logger logger = t.f119847a;
                a0 a0Var = this.f119833b;
                int iCode = a0Var.f25745a.code();
                Response response = a0Var.f25745a;
                logger.debug("Received " + iCode + " for:\n" + response.request().url());
                String str = response.headers().get("X-Rate-Limit-Remaining");
                if (str != null) {
                    logger.debug("X-Rate-Limit-Remaining: ".concat(str));
                }
                if (response.code() != 200) {
                    throw new NetworkException(NetworkException.a.CARD_IMAGE, e0.f(response.code(), "Unexpected HTTP code: ", "!"));
                }
                ResponseBody responseBody = (ResponseBody) a0Var.f25746b;
                if (responseBody == null) {
                    throw new NetworkException(NetworkException.a.CARD_IMAGE, "No body!");
                }
                try {
                    byte[] bArrBytes = responseBody.bytes();
                    responseBody.close();
                    String str2 = response.headers().get("Original-Image-Size");
                    str2.getClass();
                    int i14 = Integer.parseInt(str2);
                    com.garmin.device.nfc.h hVar = new com.garmin.device.nfc.h(com.garmin.device.nfc.h.c.TAG_CARD_IMAGE, bArrBytes);
                    com.garmin.device.nfc.h hVarG = com.garmin.device.nfc.h.g(i14);
                    wq2.b.f186635a.getClass();
                    bArrBytes.getClass();
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
                        messageDigest.update(bArrBytes);
                        bArrCopyOfRange = Arrays.copyOfRange(messageDigest.digest(), 0, 8);
                        break;
                    } catch (NoSuchAlgorithmException unused) {
                        bArrCopyOfRange = null;
                    }
                    if (bArrCopyOfRange == null) {
                        bArrCopyOfRange = new byte[]{0, 1, 2, 3, 4, 5, 6, 7};
                    }
                    return new com.garmin.device.nfc.h[]{hVar, hVarG, new com.garmin.device.nfc.h(com.garmin.device.nfc.h.c.TAG_CARD_IMAGE_HASH, bArrCopyOfRange)};
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        jg.b.l(responseBody, th3);
                        throw th4;
                    }
                }
            default:
                a0 a0Var2 = this.f119833b;
                T t7 = a0Var2.f25746b;
                t7.getClass();
                pn2.p pVar = (pn2.p) t7;
                tn2.i iVar = new tn2.i(a0Var2);
                if (!iVar.d()) {
                    throw iVar.c();
                }
                pn2.d dVarD = pVar.d();
                if (dVarD != null) {
                    return r0.d.a(dVarD);
                }
                throw new FNValidateException("Payload is null");
        }
    }

    public /* synthetic */ q(a0 a0Var, r0.e eVar) {
        this.f119833b = a0Var;
    }
}
