package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public class g0q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k7q f18438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l7q f18439b;
    public final j6q c;
    public final a d;

    public interface a {
        void a(j6q j6qVar, boolean z);

        void b(j6q j6qVar, byte[] bArr, int i);

        void c(j6q j6qVar, boolean z);

        void d(j6q j6qVar);

        void e(j6q j6qVar, byte[] bArr, int i);

        void f();

        void g(j6q j6qVar);

        void h(j6q j6qVar, byte[] bArr, int i);
    }

    public g0q(j6q j6qVar, Context context, a aVar) {
        this.c = j6qVar;
        this.d = aVar;
        k7q k7qVar = new k7q(aVar);
        this.f18438a = k7qVar;
        this.f18439b = new l7q(k7qVar);
    }

    public void a() {
        this.f18439b.c();
    }

    public int b(j6q j6qVar, boolean z) {
        return this.f18439b.e(this.c.a(), j6qVar.b(), j6qVar.c(), j6qVar.a(), z);
    }

    public int c(j6q j6qVar, boolean z) {
        return this.f18439b.q(this.c.a(), j6qVar.b(), j6qVar.c(), j6qVar.a(), z);
    }

    public int d(j6q j6qVar, byte[] bArr) {
        return this.f18439b.r(this.c.a(), j6qVar.b(), j6qVar.c(), j6qVar.a(), bArr);
    }

    public void e() {
        this.f18439b.v();
        a aVar = this.d;
        if (aVar != null) {
            aVar.f();
        }
    }
}
