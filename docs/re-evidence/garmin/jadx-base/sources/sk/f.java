package sk;

import com.google.common.util.concurrent.FutureCallback;
import java.util.concurrent.CountDownLatch;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes7.dex */
public class f implements FutureCallback<Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f159535a;

    public f(h hVar, CountDownLatch countDownLatch) {
        this.f159535a = countDownLatch;
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onFailure(Throwable th3) {
        this.f159535a.countDown();
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onSuccess(@NullableDecl Void r14) {
        this.f159535a.countDown();
    }
}
