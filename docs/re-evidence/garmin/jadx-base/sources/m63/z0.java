package m63;

import java.lang.ref.SoftReference;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lm63/z0;", "T", "", "<init>", "()V", "Ljava/lang/ref/SoftReference;", "reference", "Ljava/lang/ref/SoftReference;", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z0<T> {
    public volatile SoftReference<T> reference = new SoftReference<>(null);

    public final synchronized T a(e23.a<? extends T> aVar) {
        T t7 = this.reference.get();
        if (t7 != null) {
            return t7;
        }
        T tInvoke = aVar.invoke();
        this.reference = new SoftReference<>(tInvoke);
        return tInvoke;
    }
}
