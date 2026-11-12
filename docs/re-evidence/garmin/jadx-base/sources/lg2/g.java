package lg2;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.e2;
import r53.p2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.ui.buttons.ButtonsViewModel$onStartClick$1", f = "ButtonsViewModel.kt", l = {109, 112, 118}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f112315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public lg2.a f112316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f112317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lg2.a f112318d;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.livesessionview.ui.buttons.ButtonsViewModel$onStartClick$1$1$1", f = "ButtonsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<Boolean, t13.d<? super Boolean>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ boolean f112319a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f112319a = ((Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(Boolean bool, t13.d<? super Boolean> dVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((a) create(bool2, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            boolean z14 = this.f112319a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return Boolean.valueOf(z14);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(lg2.a aVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f112318d = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f112318d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0071  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
    
        if (r1.emit(r3, r8) == r0) goto L29;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objP;
        Object obj2;
        lg2.a aVar;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f112317c;
        lg2.a aVar3 = this.f112318d;
        if (i14 == 0) {
            o13.r.b(obj);
            aVar3.E4(true);
            fg2.f fVarB4 = aVar3.B4();
            this.f112317c = 1;
            objP = fVarB4.p(this);
            if (objP != aVar2) {
            }
            return aVar2;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            objP = ((o13.q) obj).f128597a;
        } else {
            if (i14 == 2) {
                aVar = this.f112316b;
                obj2 = this.f112315a;
                o13.r.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    aVar.E4(false);
                }
                objP = obj2;
                if (o13.q.b(objP) != null) {
                    e2 e2Var = aVar3.f112266m;
                    Boolean bool = Boolean.TRUE;
                    this.f112315a = objP;
                    this.f112316b = aVar3;
                    this.f112317c = 3;
                }
                return Unit.INSTANCE;
            }
            if (i14 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar3 = this.f112316b;
            o13.r.b(obj);
        }
        aVar3.E4(false);
        return Unit.INSTANCE;
        int i15 = o13.q.f128596b;
        if (objP instanceof o13.q.b) {
            if (o13.q.b(objP) != null) {
                e2 e2Var2 = aVar3.f112266m;
                Boolean bool2 = Boolean.TRUE;
                this.f112315a = objP;
                this.f112316b = aVar3;
                this.f112317c = 3;
            }
            return Unit.INSTANCE;
        }
        p2 p2Var = aVar3.B4().f71478b.f131784m;
        a aVar4 = new a(null);
        this.f112315a = objP;
        this.f112316b = aVar3;
        this.f112317c = 2;
        Object objW = r53.s.w(p2Var, aVar4, this);
        if (objW != aVar2) {
            obj2 = objP;
            obj = objW;
            aVar = aVar3;
            if (((Boolean) obj).booleanValue()) {
                aVar.E4(false);
            }
            objP = obj2;
            if (o13.q.b(objP) != null) {
                e2 e2Var3 = aVar3.f112266m;
                Boolean bool3 = Boolean.TRUE;
                this.f112315a = objP;
                this.f112316b = aVar3;
                this.f112317c = 3;
            }
            return Unit.INSTANCE;
        }
        return aVar2;
    }
}
