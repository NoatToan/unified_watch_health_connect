package xg2;

import e23.p;
import j23.l;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p0;
import p3.x3;
import r53.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.ui.states.components.DistanceCalibrationPickerKt$ScrollableNumberPicker$2$1", f = "DistanceCalibrationPicker.kt", l = {163}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f190952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x3<Integer> f190953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f190954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f190955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l<Integer, Unit> f190956e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<Integer, Unit> f190957a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super Integer, Unit> lVar) {
            this.f190957a = lVar;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            this.f190957a.invoke(new Integer(((Number) obj).intValue()));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lr53/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements r53.i<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r53.i f190958a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f190959b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l f190960c;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r53.j f190961a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f190962b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l f190963c;

            /* JADX INFO: renamed from: xg2.g$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @v13.e(c = "com.garmin.android.livesessionview.ui.states.components.DistanceCalibrationPickerKt$ScrollableNumberPicker$2$1$invokeSuspend$$inlined$map$1$2", f = "DistanceCalibrationPicker.kt", l = {50}, m = "emit", v = 2)
            public static final class C3554a extends v13.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f190964a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f190965b;

                public C3554a(t13.d dVar) {
                    super(dVar);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    this.f190964a = obj;
                    this.f190965b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(r53.j jVar, int i14, l lVar) {
                this.f190961a = jVar;
                this.f190962b = i14;
                this.f190963c = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                C3554a c3554a;
                if (dVar instanceof C3554a) {
                    c3554a = (C3554a) dVar;
                    int i14 = c3554a.f190965b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c3554a.f190965b = i14 - Integer.MIN_VALUE;
                    } else {
                        c3554a = new C3554a(dVar);
                    }
                } else {
                    c3554a = new C3554a(dVar);
                }
                Object obj2 = c3554a.f190964a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i15 = c3554a.f190965b;
                if (i15 == 0) {
                    r.b(obj2);
                    Integer num = new Integer((((Number) obj).intValue() - this.f190962b) + this.f190963c.f96796a);
                    c3554a.f190965b = 1;
                    if (this.f190961a.emit(num, c3554a) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public b(r53.i iVar, int i14, l lVar) {
            this.f190958a = iVar;
            this.f190959b = i14;
            this.f190960c = lVar;
        }

        @Override // r53.i
        public final Object collect(r53.j<? super Integer> jVar, t13.d dVar) {
            Object objCollect = this.f190958a.collect(new a(jVar, this.f190959b, this.f190960c), dVar);
            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(x3<Integer> x3Var, int i14, l lVar, e23.l<? super Integer, Unit> lVar2, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f190953b = x3Var;
        this.f190954c = i14;
        this.f190955d = lVar;
        this.f190956e = lVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f190953b, this.f190954c, this.f190955d, this.f190956e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f190952a;
        if (i14 == 0) {
            r.b(obj);
            r53.i iVarS = s.s(new b(p0.s(new by1.h(this.f190953b, 14)), this.f190954c, this.f190955d));
            a aVar2 = new a(this.f190956e);
            this.f190952a = 1;
            if (iVarS.collect(aVar2, this) == aVar) {
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
