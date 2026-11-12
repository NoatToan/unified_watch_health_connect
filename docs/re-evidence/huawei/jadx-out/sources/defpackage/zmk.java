package defpackage;

import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0004HÂ\u0003J\u0017\u0010\u0007\u001a\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004HÆ\u0001J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/internal/ThreadLocalKey;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/internal/ThreadLocalElement;", "threadLocal", "Ljava/lang/ThreadLocal;", "(Ljava/lang/ThreadLocal;)V", "component1", "copy", "equals", "", "other", "", WatchFaceConstant.HASHCODE, "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class zmk implements CoroutineContext.Key<zmj<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadLocal<?> f54301a;

    public zmk(ThreadLocal<?> threadLocal) {
        this.f54301a = threadLocal;
    }

    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f54301a + g4.l;
    }

    public int hashCode() {
        return this.f54301a.hashCode();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof zmk) && zcp.b(this.f54301a, ((zmk) other).f54301a);
    }
}
