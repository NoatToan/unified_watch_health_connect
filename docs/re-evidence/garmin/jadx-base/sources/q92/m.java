package q92;

import java.io.IOException;
import o53.b0;
import okhttp3.Response;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lq92/a0;", "Ls92/k;", "<anonymous>", "(Lo53/b0;)Lq92/a0;"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.garmin.android.consent.data.ConsentRepository$getDataSyncIndicator$2", f = "ConsentRepository.kt", l = {586}, m = "invokeSuspend")
public final class m extends v13.i implements e23.p<b0, t13.d<? super a0<? extends s92.k>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f143693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f143694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f143695c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lq92/a0;", "Ls92/k;", "<anonymous>", "()Lq92/a0;"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "com.garmin.android.consent.data.ConsentRepository$getDataSyncIndicator$2$1", f = "ConsentRepository.kt", l = {588}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.l<t13.d<? super a0<? extends s92.k>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f143696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f143697b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b0 f143698c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, b0 b0Var, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f143697b = fVar;
            this.f143698c = b0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f143697b, this.f143698c, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super a0<? extends s92.k>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            s92.k kVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f143696a;
            if (i14 == 0) {
                o13.r.b(obj);
                r92.a aVar2 = this.f143697b.f143628a;
                this.f143696a = 1;
                obj = aVar2.m(this);
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
            if (!response.isSuccessful() || (kVar = (s92.k) a0Var.f25746b) == null) {
                IOException iOException = new IOException(sn.a.e(response.code(), "Error fetching data sync indicators code[", "] ", response.message()));
                p92.y.f136664a.getClass();
                p92.y.a.d("ConsentRepository", iOException);
                return new a0.a(iOException);
            }
            p92.o.f136619a.getClass();
            p92.o.m().b(kVar.getSyncDeviceData());
            p92.y.f136664a.getClass();
            p92.y.a.a("ConsentRepository", "getDataSyncIndicator() successfully " + kVar);
            return new a0.b(kVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(f fVar, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f143695c = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        m mVar = new m(this.f143695c, dVar);
        mVar.f143694b = obj;
        return mVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super a0<? extends s92.k>> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f143693a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        a aVar2 = new a(this.f143695c, (b0) this.f143694b, null);
        this.f143693a = 1;
        Object objA = u92.b.a(aVar2, "Error fetching data sync indicators", this);
        return objA == aVar ? aVar : objA;
    }
}
