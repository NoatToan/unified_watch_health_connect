package defpackage;

import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.ElementTypesAreNonnullByDefault;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ParametricNullness;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class arb<V> extends AbstractFuture.TrustedFuture<V> {
    public static <V> arb<V> a() {
        return new arb<>();
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public boolean set(@ParametricNullness V v) {
        return super.set(v);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public boolean setException(Throwable th) {
        return super.setException(th);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public boolean setFuture(ListenableFuture<? extends V> listenableFuture) {
        return super.setFuture(listenableFuture);
    }

    private arb() {
    }
}
