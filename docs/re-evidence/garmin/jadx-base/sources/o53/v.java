package o53;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u000b\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¨\u0006\n"}, d2 = {"Lo53/v;", "", "", "cause", "", "handled", "<init>", "(Ljava/lang/Throwable;Z)V", "Lh53/a;", "_handled", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f129415b = AtomicIntegerFieldUpdater.newUpdater(v.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f129416a;

    public /* synthetic */ v(Throwable th3, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(th3, (i14 & 2) != 0 ? false : z14);
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f129416a + ']';
    }

    public v(Throwable th3, boolean z14) {
        this.f129416a = th3;
        this._handled$volatile = z14 ? 1 : 0;
    }
}
