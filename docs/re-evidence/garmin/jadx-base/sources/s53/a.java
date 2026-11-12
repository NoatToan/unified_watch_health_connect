package s53;

import java.util.Arrays;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.o2;
import s53.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u00060\u0003j\u0002`\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ls53/a;", "Ls53/c;", "S", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a<S extends c<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public S[] f157461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f157462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f157463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b0 f157464d;

    public final o2<Integer> f() {
        b0 b0Var;
        synchronized (this) {
            b0Var = this.f157464d;
            if (b0Var == null) {
                b0Var = new b0(this.f157462b);
                this.f157464d = b0Var;
            }
        }
        return b0Var;
    }

    public final S g() {
        S s8;
        b0 b0Var;
        synchronized (this) {
            try {
                S[] sArr = this.f157461a;
                if (sArr == null) {
                    sArr = (S[]) i();
                    this.f157461a = sArr;
                } else if (this.f157462b >= sArr.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length * 2);
                    this.f157461a = (S[]) ((c[]) objArrCopyOf);
                    sArr = (S[]) ((c[]) objArrCopyOf);
                }
                int i14 = this.f157463c;
                do {
                    s8 = sArr[i14];
                    if (s8 == null) {
                        s8 = (S) h();
                        sArr[i14] = s8;
                    }
                    i14++;
                    if (i14 >= sArr.length) {
                        i14 = 0;
                    }
                } while (!s8.a(this));
                this.f157463c = i14;
                this.f157462b++;
                b0Var = this.f157464d;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (b0Var != null) {
            b0Var.y(1);
        }
        return s8;
    }

    public abstract S h();

    public abstract c[] i();

    public final void j(S s8) {
        b0 b0Var;
        int i14;
        t13.d[] dVarArrB;
        synchronized (this) {
            try {
                int i15 = this.f157462b - 1;
                this.f157462b = i15;
                b0Var = this.f157464d;
                if (i15 == 0) {
                    this.f157463c = 0;
                }
                s8.getClass();
                dVarArrB = s8.b(this);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        for (t13.d dVar : dVarArrB) {
            if (dVar != null) {
                int i16 = o13.q.f128596b;
                dVar.resumeWith(Unit.INSTANCE);
            }
        }
        if (b0Var != null) {
            b0Var.y(-1);
        }
    }
}
