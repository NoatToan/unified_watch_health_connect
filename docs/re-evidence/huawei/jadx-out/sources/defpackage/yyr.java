package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/NotImplementedError;", "Ljava/lang/Error;", "Lkotlin/Error;", "message", "", "<init>", "(Ljava/lang/String;)V", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class yyr extends Error {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yyr(String str) {
        super(str);
        zcp.c(str, "");
    }

    public /* synthetic */ yyr(String str, int i, zcm zcmVar) {
        this((i & 1) != 0 ? "An operation is not implemented." : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public yyr() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
