package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class sw5 implements h1l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f34048a = ikb.a(Looper.getMainLooper());

    @Override // defpackage.h1l
    public void a(Runnable runnable) {
        this.f34048a.removeCallbacks(runnable);
    }

    @Override // defpackage.h1l
    public void b(long j, Runnable runnable) {
        this.f34048a.postDelayed(runnable, j);
    }
}
