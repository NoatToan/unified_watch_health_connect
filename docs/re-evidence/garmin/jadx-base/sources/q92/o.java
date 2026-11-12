package q92;

import java.io.IOException;
import o53.b0;
import okhttp3.Response;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lq92/a0;", "Ls92/c;", "<anonymous>", "(Lo53/b0;)Lq92/a0;"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.garmin.android.consent.data.ConsentRepository$optInFeature$2", f = "ConsentRepository.kt", l = {53}, m = "invokeSuspend")
public final class o extends v13.i implements e23.p<b0, t13.d<? super a0<? extends s92.c>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f143705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f143706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f143707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f143708d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lq92/a0;", "Ls92/c;", "<anonymous>", "()Lq92/a0;"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.garmin.android.consent.data.ConsentRepository$optInFeature$2$1", f = "ConsentRepository.kt", l = {55}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.l<t13.d<? super a0<? extends s92.c>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f143709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f143710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f143711c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b0 f143712d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, d dVar, b0 b0Var, t13.d<? super a> dVar2) {
            super(1, dVar2);
            this.f143710b = fVar;
            this.f143711c = dVar;
            this.f143712d = b0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f143710b, this.f143711c, this.f143712d, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super a0<? extends s92.c>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            s92.c cVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f143709a;
            d dVar = this.f143711c;
            if (i14 == 0) {
                o13.r.b(obj);
                r92.a aVar2 = this.f143710b.f143628a;
                String str = dVar.f143622a;
                this.f143709a = 1;
                obj = aVar2.j(str, this);
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
                p92.o.m().e(dVar.f143623b, cVar, null);
                p92.y.f136664a.getClass();
                p92.y.a.a("ConsentRepository", "optInFeature(" + dVar + ") successfully " + cVar);
                return new a0.b(cVar);
            }
            IOException iOException = new IOException("Error opt in to " + dVar + " code[" + response.code() + "] " + response.message());
            p92.y.f136664a.getClass();
            p92.y.a.d("ConsentRepository", iOException);
            return new a0.a(iOException);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(d dVar, f fVar, t13.d<? super o> dVar2) {
        super(2, dVar2);
        this.f143707c = dVar;
        this.f143708d = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o oVar = new o(this.f143707c, this.f143708d, dVar);
        oVar.f143706b = obj;
        return oVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super a0<? extends s92.c>> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f143705a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        b0 b0Var = (b0) this.f143706b;
        f fVar = this.f143708d;
        d dVar = this.f143707c;
        this.f143705a = 1;
        Object objA = u92.b.a(new a(fVar, dVar, b0Var, null), "Error opt in to " + dVar, this);
        return objA == aVar ? aVar : objA;
    }
}
