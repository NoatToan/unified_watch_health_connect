package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class fnr implements m1p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nwl f17969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineDispatcher f17970b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final Executor d = new a();

    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            fnr.this.c.post(runnable);
        }
    }

    public fnr(Executor executor) {
        nwl nwlVar = new nwl(executor);
        this.f17969a = nwlVar;
        this.f17970b = ExecutorsKt.from(nwlVar);
    }

    @Override // defpackage.m1p
    public CoroutineDispatcher a() {
        return this.f17970b;
    }

    @Override // defpackage.m1p
    public Executor c() {
        return this.d;
    }

    @Override // defpackage.m1p
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public nwl d() {
        return this.f17969a;
    }
}
