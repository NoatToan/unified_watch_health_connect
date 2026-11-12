package androidx.lifecycle;

import java.util.ArrayDeque;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/p;", "", "<init>", "()V", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7985c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7983a = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f7986d = new ArrayDeque();

    public final void a() {
        ArrayDeque arrayDeque = this.f7986d;
        if (this.f7985c) {
            return;
        }
        try {
            this.f7985c = true;
            while (!arrayDeque.isEmpty()) {
                if (!(this.f7984b || !this.f7983a)) {
                    break;
                }
                Runnable runnable = (Runnable) arrayDeque.poll();
                if (runnable != null) {
                    runnable.run();
                }
            }
        } finally {
            this.f7985c = false;
        }
    }
}
