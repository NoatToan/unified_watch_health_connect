package androidx.lifecycle;

import android.os.Handler;
import android.os.Looper;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/r1;", "", "Landroidx/lifecycle/n0;", "provider", "<init>", "(Landroidx/lifecycle/n0;)V", "a", "lifecycle-service"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f8003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f8004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f8005c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/lifecycle/r1$a;", "Ljava/lang/Runnable;", "Landroidx/lifecycle/o0;", "registry", "Landroidx/lifecycle/b0$a;", "event", "<init>", "(Landroidx/lifecycle/o0;Landroidx/lifecycle/b0$a;)V", "lifecycle-service"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o0 f8006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b0.a f8007b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f8008c;

        public a(o0 o0Var, b0.a aVar) {
            o0Var.getClass();
            aVar.getClass();
            this.f8006a = o0Var;
            this.f8007b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f8008c) {
                return;
            }
            this.f8006a.g(this.f8007b);
            this.f8008c = true;
        }
    }

    public r1(n0 n0Var) {
        n0Var.getClass();
        this.f8003a = new o0(n0Var);
        this.f8004b = new Handler(Looper.getMainLooper());
    }

    public final void a(b0.a aVar) {
        a aVar2 = this.f8005c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.f8003a, aVar);
        this.f8005c = aVar3;
        this.f8004b.postAtFrontOfQueue(aVar3);
    }
}
