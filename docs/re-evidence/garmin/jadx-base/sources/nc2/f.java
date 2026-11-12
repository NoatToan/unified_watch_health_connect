package nc2;

import org.slf4j.Logger;
import p005kotlin.Metadata;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnc2/f;", "Lnc2/d;", "<init>", "()V", "networking-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements d {
    public f() {
        Logger loggerB = nd2.c.b("NullIntegrityTokenProvider");
        loggerB.getClass();
        loggerB.warn("using 'NullIntegrityTokenProvider'");
    }

    @Override // nc2.d
    public final Object a(byte[] bArr, i iVar) {
        return new e(null, null);
    }
}
