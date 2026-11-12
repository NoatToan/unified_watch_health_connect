package v13;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lv13/b;", "Lt13/d;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements t13.d<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f174830a = new b();

    private b() {
    }

    @Override // t13.d
    /* JADX INFO: renamed from: getContext */
    public final t13.g getF129362e() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // t13.d
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
