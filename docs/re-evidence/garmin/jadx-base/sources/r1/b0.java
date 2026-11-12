package r1;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp3/k2;", "", "", "<anonymous>", "(Lp3/k2;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1", f = "AnimatedVisibility.kt", l = {736}, m = "invokeSuspend", v = 1)
public final class b0 extends v13.i implements e23.p<p3.k2<Boolean>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f149007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f149008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s1.t1<r0> f149009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x3<e23.p<r0, r0, Boolean>> f149010d;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a extends p005kotlin.jvm.internal.w implements e23.a<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s1.t1<r0> f149011a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s1.t1<r0> t1Var) {
            super(0);
            this.f149011a = t1Var;
        }

        @Override // e23.a
        public final Boolean invoke() {
            s1.t1<r0> t1Var = this.f149011a;
            r0 r0VarA = t1Var.f155744a.a();
            r0 r0Var = r0.PostExit;
            return Boolean.valueOf(r0VarA == r0Var && t1Var.f155747d.getF182175a() == r0Var);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "emit", "(ZLt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class b<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p3.k2<Boolean> f149012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s1.t1<r0> f149013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x3<e23.p<r0, r0, Boolean>> f149014c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(p3.k2<Boolean> k2Var, s1.t1<r0> t1Var, x3<? extends e23.p<? super r0, ? super r0, Boolean>> x3Var) {
            this.f149012a = k2Var;
            this.f149013b = t1Var;
            this.f149014c = x3Var;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            boolean zBooleanValue;
            if (((Boolean) obj).booleanValue()) {
                e23.p f182175a = this.f149014c.getF182175a();
                s1.t1<r0> t1Var = this.f149013b;
                zBooleanValue = ((Boolean) f182175a.invoke(t1Var.f155744a.a(), t1Var.f155747d.getF182175a())).booleanValue();
            } else {
                zBooleanValue = false;
            }
            this.f149012a.setValue(Boolean.valueOf(zBooleanValue));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b0(s1.t1<r0> t1Var, x3<? extends e23.p<? super r0, ? super r0, Boolean>> x3Var, t13.d<? super b0> dVar) {
        super(2, dVar);
        this.f149009c = t1Var;
        this.f149010d = x3Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b0 b0Var = new b0(this.f149009c, this.f149010d, dVar);
        b0Var.f149008b = obj;
        return b0Var;
    }

    @Override // e23.p
    public final Object invoke(p3.k2<Boolean> k2Var, t13.d<? super Unit> dVar) {
        return ((b0) create(k2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f149007a;
        if (i14 == 0) {
            o13.r.b(obj);
            p3.k2 k2Var = (p3.k2) this.f149008b;
            s1.t1<r0> t1Var = this.f149009c;
            r53.c2 c2VarS = p3.p0.s(new a(t1Var));
            b bVar = new b(k2Var, t1Var, this.f149010d);
            this.f149007a = 1;
            if (c2VarS.collect(bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
