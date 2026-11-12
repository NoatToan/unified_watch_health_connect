package q92;

import java.io.IOException;
import o53.b0;
import okhttp3.Response;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lq92/a0;", "Ls92/a;", "<anonymous>", "(Lo53/b0;)Lq92/a0;"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.garmin.android.consent.data.ConsentRepository$updateDeviceUploadConsent$2", f = "ConsentRepository.kt", l = {558}, m = "invokeSuspend")
public final class s extends v13.i implements e23.p<b0, t13.d<? super a0<? extends s92.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f143750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f143751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f143752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f143753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f143754e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lq92/a0;", "Ls92/a;", "<anonymous>", "()Lq92/a0;"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.garmin.android.consent.data.ConsentRepository$updateDeviceUploadConsent$2$1", f = "ConsentRepository.kt", l = {}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.l<t13.d<? super a0<? extends s92.a>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f143755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f143756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f143757c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b0 f143758d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z14, f fVar, boolean z15, b0 b0Var, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f143755a = z14;
            this.f143756b = fVar;
            this.f143757c = z15;
            this.f143758d = b0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f143755a, this.f143756b, this.f143757c, this.f143758d, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super a0<? extends s92.a>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            s92.a aVar2 = new s92.a(null, false, 3, null);
            boolean z14 = this.f143757c;
            aVar2.d(z14);
            c83.a0<s92.a> a0VarExecute = this.f143756b.f143628a.o(aVar2, this.f143755a ? "SYSTEM" : null).execute();
            Response response = a0VarExecute.f25745a;
            if (response.isSuccessful()) {
                p92.o.f136619a.getClass();
                p92.o.m().b(z14);
                s92.a aVar3 = a0VarExecute.f25746b;
                if (aVar3 != null) {
                    p92.y.f136664a.getClass();
                    p92.y.a.a("ConsentRepository", "updateDeviceUploadConsent() successfully " + aVar3);
                    return new a0.b(aVar3);
                }
            }
            IOException iOException = new IOException(sn.a.e(response.code(), "Error updating device upload consent code[", "] ", response.message()));
            p92.y.f136664a.getClass();
            p92.y.a.d("ConsentRepository", iOException);
            return new a0.a(iOException);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(boolean z14, f fVar, boolean z15, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f143752c = z14;
        this.f143753d = fVar;
        this.f143754e = z15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        s sVar = new s(this.f143752c, this.f143753d, this.f143754e, dVar);
        sVar.f143751b = obj;
        return sVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super a0<? extends s92.a>> dVar) {
        return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f143750a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        a aVar2 = new a(this.f143752c, this.f143753d, this.f143754e, (b0) this.f143751b, null);
        this.f143750a = 1;
        Object objA = u92.b.a(aVar2, "Error updating device upload consent", this);
        return objA == aVar ? aVar : objA;
    }
}
