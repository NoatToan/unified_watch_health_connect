package e20;

import c83.a0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import e23.p;
import o13.r;
import o53.b0;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ld20/a;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.consent.repo.ConsentRepo$getParentalApprovalRequest$2", f = "ConsentRepo.kt", l = {44}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, t13.d<? super v2<? extends d20.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f62589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e20.a f62590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f62591c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ld20/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.consent.repo.ConsentRepo$getParentalApprovalRequest$2$result$1", f = "ConsentRepo.kt", l = {45}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements l<t13.d<? super a0<d20.a>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f62592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e20.a f62593b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f62594c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e20.a aVar, String str, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f62593b = aVar;
            this.f62594c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f62593b, this.f62594c, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super a0<d20.a>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f62592a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            i0<a0<d20.a>> i0VarK = this.f62593b.f62588a.k(this.f62594c, "CONSENT");
            this.f62592a = 1;
            Object objAwait = i0VarK.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e20.a aVar, String str, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f62590b = aVar;
        this.f62591c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b(this.f62590b, this.f62591c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super v2<? extends d20.a>> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        v2.b bVar;
        int i14;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f62589a;
        if (i15 == 0) {
            r.b(obj);
            String str = this.f62591c;
            e20.a aVar2 = this.f62590b;
            a aVar3 = new a(aVar2, str, null);
            this.f62589a = 1;
            aVar2.getClass();
            obj = f0.J(aVar2, aVar3, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        v2 v2Var = (v2) obj;
        return ((v2Var instanceof v2.b) && (i14 = (bVar = (v2.b) v2Var).f47387b) == 204) ? new v2.b(null, i14, bVar.f47388c, null, 8, null) : v2Var;
    }
}
