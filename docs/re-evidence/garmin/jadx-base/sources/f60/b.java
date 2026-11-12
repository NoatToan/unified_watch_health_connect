package f60;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"Lf60/b;", "", "", "message", "<init>", "(Ljava/lang/String;)V", "throwable", "(Ljava/lang/Throwable;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class b extends Throwable {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Throwable th3) {
        this(th3.getMessage());
        th3.getClass();
    }

    public b(String str) {
        super(str);
    }
}
