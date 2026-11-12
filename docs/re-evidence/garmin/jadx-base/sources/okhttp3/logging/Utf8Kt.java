package okhttp3.logging;

import java.io.EOFException;
import p005kotlin.Metadata;
import w63.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw63/e;", "", "isProbablyUtf8", "(Lw63/e;)Z", "okhttp-logging-interceptor"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class Utf8Kt {
    public static final boolean isProbablyUtf8(e eVar) {
        eVar.getClass();
        try {
            e eVar2 = new e();
            long j8 = eVar.f183349b;
            long j14 = 64;
            if (j8 <= 64) {
                j14 = j8;
            }
            eVar.f(0L, eVar2, j14);
            int i14 = 0;
            while (i14 < 16) {
                i14++;
                if (eVar2.F1()) {
                    return true;
                }
                int iZ = eVar2.z();
                if (!Character.isISOControl(iZ) || Character.isWhitespace(iZ)) {
                }
                return false;
            }
            return true;
        } catch (EOFException unused) {
        }
    }
}
