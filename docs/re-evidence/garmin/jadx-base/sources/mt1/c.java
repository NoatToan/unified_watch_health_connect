package mt1;

import e23.l;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;
import r53.b2;
import r53.p2;
import r53.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.navigation.GarminTrailsNavHostKt$GarminTrailsNavHost$3$1", f = "GarminTrailsNavHost.kt", l = {110}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f120959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qt1.a f120960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l<Boolean, Unit> f120961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x3<Boolean> f120962d;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "backstackEmpty", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.navigation.GarminTrailsNavHostKt$GarminTrailsNavHost$3$1$1", f = "GarminTrailsNavHost.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<Boolean, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ boolean f120963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<Boolean, Unit> f120964b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ qt1.a f120965c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x3<Boolean> f120966d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super Boolean, Unit> lVar, qt1.a aVar, x3<Boolean> x3Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f120964b = lVar;
            this.f120965c = aVar;
            this.f120966d = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f120964b, this.f120965c, this.f120966d, dVar);
            aVar.f120963a = ((Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(Boolean bool, t13.d<? super Unit> dVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((a) create(bool2, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            boolean z14 = this.f120963a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (z14) {
                Boolean f182175a = this.f120966d.getF182175a();
                f182175a.booleanValue();
                this.f120964b.invoke(f182175a);
                p2 p2Var = this.f120965c.f147493f.f179871a;
                do {
                    value = p2Var.getValue();
                    ((Boolean) value).getClass();
                } while (!p2Var.b(value, Boolean.FALSE));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(qt1.a aVar, l<? super Boolean, Unit> lVar, x3<Boolean> x3Var, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f120960b = aVar;
        this.f120961c = lVar;
        this.f120962d = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f120960b, this.f120961c, this.f120962d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f120959a;
        if (i14 == 0) {
            r.b(obj);
            qt1.a aVar2 = this.f120960b;
            b2 b2Var = aVar2.D;
            a aVar3 = new a(this.f120961c, aVar2, this.f120962d, null);
            this.f120959a = 1;
            if (s.k(b2Var, aVar3, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
