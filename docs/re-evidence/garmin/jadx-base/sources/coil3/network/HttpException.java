package coil3.network;

import p005kotlin.Metadata;
import sf.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcoil3/network/HttpException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lsf/p;", "response", "<init>", "(Lsf/p;)V", "Lsf/p;", "getResponse", "()Lsf/p;", "coil-network-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HttpException extends RuntimeException {
    private final p response;

    public HttpException(p pVar) {
        super("HTTP " + pVar.f158814a);
        this.response = pVar;
    }

    public final p getResponse() {
        return this.response;
    }
}
