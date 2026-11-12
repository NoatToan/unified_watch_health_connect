package q92;

import java.io.IOException;
import o53.b0;
import okhttp3.Response;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lq92/a0;", "Ls92/a;", "<anonymous>", "(Lo53/b0;)Lq92/a0;"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.garmin.android.consent.data.ConsentRepository$getDeviceUploadConsent$2", f = "ConsentRepository.kt", l = {532}, m = "invokeSuspend")
public final class n extends v13.i implements e23.p<b0, t13.d<? super a0<? extends s92.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f143699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f143700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f143701c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lq92/a0;", "Ls92/a;", "<anonymous>", "()Lq92/a0;"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.garmin.android.consent.data.ConsentRepository$getDeviceUploadConsent$2$1", f = "ConsentRepository.kt", l = {534}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.l<t13.d<? super a0<? extends s92.a>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f143702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f143703b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b0 f143704c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, b0 b0Var, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f143703b = fVar;
            this.f143704c = b0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f143703b, this.f143704c, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super a0<? extends s92.a>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            s92.a aVar;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f143702a;
            if (i14 == 0) {
                o13.r.b(obj);
                r92.a aVar3 = this.f143703b.f143628a;
                this.f143702a = 1;
                obj = aVar3.l(this);
                if (obj == aVar2) {
                    return aVar2;
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
            if (!response.isSuccessful() || (aVar = (s92.a) a0Var.f25746b) == null) {
                IOException iOException = new IOException(sn.a.e(response.code(), "Error fetching device upload consent data code[", "] ", response.message()));
                p92.y.f136664a.getClass();
                p92.y.a.d("ConsentRepository", iOException);
                return new a0.a(iOException);
            }
            p92.o.f136619a.getClass();
            p92.o.m().b(aVar.getValue());
            p92.y.f136664a.getClass();
            p92.y.a.a("ConsentRepository", "getDeviceUploadConsent() successfully " + aVar);
            return new a0.b(aVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(f fVar, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f143701c = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        n nVar = new n(this.f143701c, dVar);
        nVar.f143700b = obj;
        return nVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super a0<? extends s92.a>> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f143699a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        a aVar2 = new a(this.f143701c, (b0) this.f143700b, null);
        this.f143699a = 1;
        Object objA = u92.b.a(aVar2, "Error fetching device upload consent data", this);
        return objA == aVar ? aVar : objA;
    }
}
