package v30;

import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.k2;
import p3.p0;
import r53.c2;
import r53.j;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp3/k2;", "Lq82/b$a;", "", "<anonymous>", "(Lp3/k2;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.components.climbs.components.EndlessPagerRangeControlState$observePageChangesAsState$1$1", f = "EndlessPagerRangeControlState.kt", l = {30}, m = "invokeSuspend", v = 2)
public final class e extends i implements p<k2<q82.b.a>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f175404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f175405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f175406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f175407d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k2<q82.b.a> f175408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f175409b;

        public a(k2<q82.b.a> k2Var, f fVar) {
            this.f175408a = k2Var;
            this.f175409b = fVar;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            this.f175408a.setValue(new q82.b.a(this.f175409b.f175412c.a(new Integer(((Number) obj).intValue())), false, false));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, int i14, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f175406c = fVar;
        this.f175407d = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f175406c, this.f175407d, dVar);
        eVar.f175405b = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(k2<q82.b.a> k2Var, t13.d<? super Unit> dVar) {
        return ((e) create(k2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        k2 k2Var = (k2) this.f175405b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f175404a;
        if (i14 == 0) {
            r.b(obj);
            f fVar = this.f175406c;
            c2 c2VarS = p0.s(new ag0.a(fVar, this.f175407d, 13));
            a aVar2 = new a(k2Var, fVar);
            this.f175405b = null;
            this.f175404a = 1;
            if (c2VarS.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
