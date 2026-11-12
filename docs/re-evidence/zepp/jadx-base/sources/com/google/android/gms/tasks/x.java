package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
final class x<TResult> {
    private final Object a = new Object();

    @GuardedBy("mLock")
    private Queue<w<TResult>> b;

    @GuardedBy("mLock")
    private boolean c;

    public final void a(@NonNull w<TResult> wVar) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new ArrayDeque();
            }
            this.b.add(wVar);
        }
    }

    public final void b(@NonNull Task<TResult> task) {
        w<TResult> wVarPoll;
        synchronized (this.a) {
            if (this.b != null && !this.c) {
                this.c = true;
                while (true) {
                    synchronized (this.a) {
                        wVarPoll = this.b.poll();
                        if (wVarPoll == null) {
                            this.c = false;
                            return;
                        }
                    }
                    wVarPoll.a(task);
                }
            }
        }
    }
}
