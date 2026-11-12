package c83;

import o53.s0;
import p005kotlin.KotlinNullPointerException;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes11.dex */
public final class m {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements e23.l<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c83.d<T> f25806a;

        public a(c83.d<T> dVar) {
            this.f25806a = dVar;
        }

        @Override // e23.l
        public final Unit invoke(Throwable th3) {
            this.f25806a.cancel();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"c83/m$b", "Lc83/f;", "retrofit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o53.j<T> f25807a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(o53.j<? super T> jVar) {
            this.f25807a = jVar;
        }

        @Override // c83.f
        public final void a(c83.d<T> dVar, Throwable th3) {
            dVar.getClass();
            th3.getClass();
            int i14 = o13.q.f128596b;
            this.f25807a.resumeWith(new o13.q.b(th3));
        }

        @Override // c83.f
        public final void c(c83.d<T> dVar, a0<T> a0Var) {
            dVar.getClass();
            boolean zIsSuccessful = a0Var.f25745a.isSuccessful();
            o53.j<T> jVar = this.f25807a;
            if (!zIsSuccessful) {
                int i14 = o13.q.f128596b;
                jVar.resumeWith(new o13.q.b(new HttpException(a0Var)));
                return;
            }
            T t7 = a0Var.f25746b;
            if (t7 != null) {
                int i15 = o13.q.f128596b;
                jVar.resumeWith(t7);
                return;
            }
            Object objTag = dVar.request().tag(l.class);
            objTag.getClass();
            l lVar = (l) objTag;
            KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException("Response from " + lVar.f25802a.getName() + '.' + lVar.f25804c.getName() + " was null but response body type was declared as non-null");
            int i16 = o13.q.f128596b;
            jVar.resumeWith(new o13.q.b(kotlinNullPointerException));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c implements e23.l<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c83.d<T> f25808a;

        public c(c83.d<T> dVar) {
            this.f25808a = dVar;
        }

        @Override // e23.l
        public final Unit invoke(Throwable th3) {
            this.f25808a.cancel();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¨\u0006\u0002"}, d2 = {"c83/m$d", "Lc83/f;", "retrofit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d<T> implements f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o53.j<T> f25809a;

        /* JADX WARN: Multi-variable type inference failed */
        public d(o53.j<? super T> jVar) {
            this.f25809a = jVar;
        }

        @Override // c83.f
        public final void a(c83.d<T> dVar, Throwable th3) {
            dVar.getClass();
            th3.getClass();
            int i14 = o13.q.f128596b;
            this.f25809a.resumeWith(new o13.q.b(th3));
        }

        @Override // c83.f
        public final void c(c83.d<T> dVar, a0<T> a0Var) {
            dVar.getClass();
            boolean zIsSuccessful = a0Var.f25745a.isSuccessful();
            o53.j<T> jVar = this.f25809a;
            if (zIsSuccessful) {
                int i14 = o13.q.f128596b;
                jVar.resumeWith(a0Var.f25746b);
            } else {
                int i15 = o13.q.f128596b;
                jVar.resumeWith(new o13.q.b(new HttpException(a0Var)));
            }
        }
    }

    public static final <T> Object a(c83.d<T> dVar, t13.d<? super T> dVar2) throws Throwable {
        o53.k kVar = new o53.k(u13.f.b(dVar2), 1);
        kVar.q();
        kVar.r(new a(dVar));
        dVar.q0(new b(kVar));
        Object objP = kVar.p();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objP;
    }

    public static final <T> Object b(c83.d<T> dVar, t13.d<? super T> dVar2) throws Throwable {
        o53.k kVar = new o53.k(u13.f.b(dVar2), 1);
        kVar.q();
        kVar.r(new c(dVar));
        dVar.q0(new d(kVar));
        Object objP = kVar.p();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objP;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final u13.a c(t13.d dVar, Throwable th3) {
        p pVar;
        if (dVar instanceof p) {
            pVar = (p) dVar;
            int i14 = pVar.f25813b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                pVar.f25813b = i14 - Integer.MIN_VALUE;
            } else {
                pVar = new p(dVar);
            }
        } else {
            pVar = new p(dVar);
        }
        Object obj = pVar.f25812a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = pVar.f25813b;
        if (i15 == 0) {
            o13.r.b(obj);
            pVar.f25813b = 1;
            s0.f129406a.dispatch(pVar.getF129302c(), new q(pVar, th3));
            return aVar;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o2.c.f();
        return null;
    }
}
