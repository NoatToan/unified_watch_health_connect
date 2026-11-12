package nh;

import android.os.ConditionVariable;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f126138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConditionVariable f126139b;

    public o(Runnable runnable, ConditionVariable conditionVariable) {
        this.f126138a = runnable;
        this.f126139b = conditionVariable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable = this.f126139b;
        try {
            this.f126138a.run();
        } finally {
            conditionVariable.open();
        }
    }
}
