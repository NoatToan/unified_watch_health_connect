package ho;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lho/c;", "Landroidx/lifecycle/u1;", "Lco/g;", "getAllActivityTypesUseCase", "<init>", "(Lco/g;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final co.g f84592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o13.t f84593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f84594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b2 f84595d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lho/j;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.history.presentation.filtering.ActivitySelectionViewModel$uiState$1", f = "ActivitySelectionViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<r53.j<? super j>, t13.d<? super Unit>, Object> {
        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super j> jVar, t13.d<? super Unit> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            c.x4(c.this);
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public c(co.g gVar) {
        gVar.getClass();
        this.f84592a = gVar;
        this.f84593b = o13.m.b(new h62.j(this, 10));
        p2 p2VarA = q2.a(new j(null, false, 3, null));
        this.f84594c = p2VarA;
        this.f84595d = r53.s.K(new r53.v(new b(null), p2VarA), v1.a(this), k2.a.a(k2.f150703a, 2), new j(null, false, 3, null));
    }

    public static final void x4(c cVar) {
        Object value;
        i53.f fVarJ = i53.a.j(h0.S0((i53.f) cVar.f84593b.getValue(), 5));
        p2 p2Var = cVar.f84594c;
        do {
            value = p2Var.getValue();
            ((j) value).getClass();
            fVarJ.getClass();
        } while (!p2Var.b(value, new j(fVarJ, false)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lho/c$a;", "", "<init>", "()V", "", "MAX_ALLOWED_ACTIVITY_TYPES", "I", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
