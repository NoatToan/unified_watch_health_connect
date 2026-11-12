package com.facebook.internal;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.FacebookSdk;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fB\u0017\b\u0016\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\b\u0010\u0004\u001a\u00020\u0003H\u0002R\u0018\u0010\u0006\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0015\u0010\r\u001a\u0004\u0018\u00018\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/facebook/internal/LockOnGetVariable;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "a", "Ljava/lang/Object;", "storedValue", "Ljava/util/concurrent/CountDownLatch;", "b", "Ljava/util/concurrent/CountDownLatch;", "initLatch", "getValue", "()Ljava/lang/Object;", "value", "<init>", "(Ljava/lang/Object;)V", "Ljava/util/concurrent/Callable;", "callable", "(Ljava/util/concurrent/Callable;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class LockOnGetVariable<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private T storedValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private CountDownLatch initLatch;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "a", "()Ljava/lang/Void;"}, k = 3, mv = {1, 5, 1})
    public static final class a<V> implements Callable {
        public final /* synthetic */ Callable b;

        public a(Callable callable) {
            this.b = callable;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void call() {
            try {
                LockOnGetVariable.this.storedValue = this.b.call();
            } finally {
                CountDownLatch countDownLatch = LockOnGetVariable.this.initLatch;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
            }
        }
    }

    public LockOnGetVariable(T t) {
        this.storedValue = t;
    }

    private final void a() {
        CountDownLatch countDownLatch = this.initLatch;
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    @Nullable
    public final T getValue() {
        a();
        return this.storedValue;
    }

    public LockOnGetVariable(@NotNull Callable<T> callable) {
        this.initLatch = new CountDownLatch(1);
        FacebookSdk.getExecutor().execute(new FutureTask(new a(callable)));
    }
}
