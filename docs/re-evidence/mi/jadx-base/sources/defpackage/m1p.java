package defpackage;

import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface m1p {
    default CoroutineDispatcher a() {
        return ExecutorsKt.from(d());
    }

    default void b(Runnable runnable) {
        d().execute(runnable);
    }

    Executor c();

    mwl d();
}
