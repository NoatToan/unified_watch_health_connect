package q92;

import java.io.IOException;
import java.util.Iterator;
import o53.b0;
import okhttp3.Response;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lq92/a0;", "Ls92/c;", "<anonymous>", "(Lo53/b0;)Lq92/a0;"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.garmin.android.consent.data.ConsentRepository$getConsent$2", f = "ConsentRepository.kt", l = {97}, m = "invokeSuspend")
public final class j extends v13.i implements e23.p<b0, t13.d<? super a0<? extends s92.c>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f143663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f143664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f143665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f143666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s92.l f143667e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lq92/a0;", "Ls92/c;", "<anonymous>", "()Lq92/a0;"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.garmin.android.consent.data.ConsentRepository$getConsent$2$1", f = "ConsentRepository.kt", l = {99}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.l<t13.d<? super a0<? extends s92.c>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f143668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f143669b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x f143670c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ s92.l f143671d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ b0 f143672e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, x xVar, s92.l lVar, b0 b0Var, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f143669b = fVar;
            this.f143670c = xVar;
            this.f143671d = lVar;
            this.f143672e = b0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f143669b, this.f143670c, this.f143671d, this.f143672e, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super a0<? extends s92.c>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object next;
            String str;
            s92.c cVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f143668a;
            s92.l lVar = this.f143671d;
            x xVar = this.f143670c;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f143668a = 1;
                r92.a aVar2 = this.f143669b.f143628a;
                if (lVar == null) {
                    obj = aVar2.d(xVar.f143819a, this);
                } else {
                    d.f143617c.getClass();
                    xVar.getClass();
                    Iterator<T> it = d.f143621g.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((d) next).f143623b != xVar);
                    d dVar = (d) next;
                    String str2 = lVar.f158101a;
                    if (dVar == null || (str = dVar.f143622a) == null) {
                        str = xVar.f143819a;
                    }
                    obj = aVar2.h(str2, str, this);
                }
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            c83.a0 a0Var = (c83.a0) obj;
            Response response = a0Var.f25745a;
            if (response.isSuccessful() && (cVar = (s92.c) a0Var.f25746b) != null) {
                p92.o.f136619a.getClass();
                p92.o.m().e(xVar, cVar, lVar);
                p92.y.f136664a.getClass();
                p92.y.a.a("ConsentRepository", "getConsent(" + xVar + ") successfully " + cVar);
                return new a0.b(cVar);
            }
            IOException iOException = new IOException("Error fetching consent " + xVar + " code[" + response.code() + "] " + response.message());
            p92.y.f136664a.getClass();
            p92.y.a.d("ConsentRepository", iOException);
            return new a0.a(iOException);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(x xVar, f fVar, s92.l lVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f143665c = xVar;
        this.f143666d = fVar;
        this.f143667e = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j jVar = new j(this.f143665c, this.f143666d, this.f143667e, dVar);
        jVar.f143664b = obj;
        return jVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super a0<? extends s92.c>> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f143663a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        a aVar2 = new a(this.f143666d, this.f143665c, this.f143667e, (b0) this.f143664b, null);
        String str = "Error fetching consent " + this.f143665c;
        this.f143663a = 1;
        Object objA = u92.b.a(aVar2, str, this);
        return objA == aVar ? aVar : objA;
    }
}
