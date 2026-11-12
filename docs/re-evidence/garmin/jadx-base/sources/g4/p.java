package g4;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lg4/p;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "message", "<init>", "(Ljava/lang/String;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75748a;

    public p(String str) {
        super(str);
        this.f75748a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f75748a;
    }
}
