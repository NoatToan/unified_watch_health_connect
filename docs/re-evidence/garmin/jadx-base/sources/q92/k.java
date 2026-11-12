package q92;

import java.io.IOException;
import o53.b0;
import okhttp3.Response;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lq92/a0;", "Ls92/c;", "<anonymous>", "(Lo53/b0;)Lq92/a0;"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.garmin.android.consent.data.ConsentRepository$getConsentFeature$2", f = "ConsentRepository.kt", l = {31}, m = "invokeSuspend")
public final class k extends v13.i implements e23.p<b0, t13.d<? super a0<? extends s92.c>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f143673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f143674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f143675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f143676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s92.l f143677e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lq92/a0;", "Ls92/c;", "<anonymous>", "()Lq92/a0;"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.garmin.android.consent.data.ConsentRepository$getConsentFeature$2$1", f = "ConsentRepository.kt", l = {33}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.l<t13.d<? super a0<? extends s92.c>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f143678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f143679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f143680c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ s92.l f143681d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ b0 f143682e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, d dVar, s92.l lVar, b0 b0Var, t13.d<? super a> dVar2) {
            super(1, dVar2);
            this.f143679b = fVar;
            this.f143680c = dVar;
            this.f143681d = lVar;
            this.f143682e = b0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f143679b, this.f143680c, this.f143681d, this.f143682e, dVar);
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
            int i14 = this.f143678a;
            s92.l lVar = this.f143681d;
            d dVar = this.f143680c;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f143678a = 1;
                r92.a aVar2 = this.f143679b.f143628a;
                obj = lVar == null ? aVar2.a(dVar.f143622a, this) : aVar2.h(lVar.f158101a, dVar.f143622a, this);
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
                p92.o.m().e(dVar.f143623b, cVar, lVar);
                p92.y.f136664a.getClass();
                p92.y.a.a("ConsentRepository", "getConsentFeature(" + dVar + ") successfully " + cVar);
                return new a0.b(cVar);
            }
            IOException iOException = new IOException("Error fetching consent " + dVar + " code[" + response.code() + "] " + response.message());
            p92.y.f136664a.getClass();
            p92.y.a.d("ConsentRepository", iOException);
            return new a0.a(iOException);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(d dVar, f fVar, s92.l lVar, t13.d<? super k> dVar2) {
        super(2, dVar2);
        this.f143675c = dVar;
        this.f143676d = fVar;
        this.f143677e = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        k kVar = new k(this.f143675c, this.f143676d, this.f143677e, dVar);
        kVar.f143674b = obj;
        return kVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super a0<? extends s92.c>> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f143673a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        a aVar2 = new a(this.f143676d, this.f143675c, this.f143677e, (b0) this.f143674b, null);
        String str = "Error fetching consent " + this.f143675c;
        this.f143673a = 1;
        Object objA = u92.b.a(aVar2, str, this);
        return objA == aVar ? aVar : objA;
    }
}
