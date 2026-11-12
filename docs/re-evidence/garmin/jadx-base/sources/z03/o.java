package z03;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends q03.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q03.f f200791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u03.f<? super Throwable, ? extends q03.f> f200792b;

    public static final class a extends AtomicReference<s03.b> implements q03.d, s03.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q03.d f200793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u03.f<? super Throwable, ? extends q03.f> f200794b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f200795c;

        public a(q03.d dVar, u03.f<? super Throwable, ? extends q03.f> fVar) {
            this.f200793a = dVar;
            this.f200794b = fVar;
        }

        @Override // q03.d
        public final void a(s03.b bVar) {
            v03.c.d(this, bVar);
        }

        @Override // s03.b
        public final boolean b() {
            return v03.c.c(get());
        }

        @Override // s03.b
        public final void dispose() {
            v03.c.a(this);
        }

        @Override // q03.d
        public final void onComplete() {
            this.f200793a.onComplete();
        }

        @Override // q03.d
        public final void onError(Throwable th3) {
            boolean z14 = this.f200795c;
            q03.d dVar = this.f200793a;
            if (z14) {
                dVar.onError(th3);
                return;
            }
            this.f200795c = true;
            try {
                q03.f fVarMo330apply = this.f200794b.mo330apply(th3);
                w03.b.a(fVarMo330apply, "The errorMapper returned a null CompletableSource");
                fVarMo330apply.a(this);
            } catch (Throwable th4) {
                t03.a.a(th4);
                dVar.onError(new CompositeException(th3, th4));
            }
        }
    }

    public o(q03.f fVar, u03.f<? super Throwable, ? extends q03.f> fVar2) {
        this.f200791a = fVar;
        this.f200792b = fVar2;
    }

    @Override // q03.b
    public final void j(q03.d dVar) {
        a aVar = new a(dVar, this.f200792b);
        dVar.a(aVar);
        this.f200791a.a(aVar);
    }
}
