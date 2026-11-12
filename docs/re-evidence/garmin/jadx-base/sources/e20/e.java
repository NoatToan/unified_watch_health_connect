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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ld20/a;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.consent.repo.ConsentRepo$sendParentalApprovalRequest$2", f = "ConsentRepo.kt", l = {55}, m = "invokeSuspend", v = 2)
public final class e extends i implements p<b0, t13.d<? super v2<? extends d20.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f62602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e20.a f62603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d20.e f62604c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ld20/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.consent.repo.ConsentRepo$sendParentalApprovalRequest$2$1", f = "ConsentRepo.kt", l = {55}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements l<t13.d<? super a0<d20.a>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f62605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e20.a f62606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d20.e f62607c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e20.a aVar, d20.e eVar, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f62606b = aVar;
            this.f62607c = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(this.f62606b, this.f62607c, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super a0<d20.a>> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f62605a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            i0<a0<d20.a>> i0VarI = this.f62606b.f62588a.i("CONSENT", this.f62607c);
            this.f62605a = 1;
            Object objAwait = i0VarI.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(e20.a aVar, d20.e eVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f62603b = aVar;
        this.f62604c = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f62603b, this.f62604c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super v2<? extends d20.a>> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f62602a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        d20.e eVar = this.f62604c;
        e20.a aVar2 = this.f62603b;
        a aVar3 = new a(aVar2, eVar, null);
        this.f62602a = 1;
        aVar2.getClass();
        Object objJ = f0.J(aVar2, aVar3, this);
        return objJ == aVar ? aVar : objJ;
    }
}
