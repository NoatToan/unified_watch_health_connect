package vc;

import e23.p;
import hz0.w;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.c2;
import p3.z1;
import s1.a1;
import s1.b2;
import s1.l;
import s1.t1;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$8$1", f = "NavDisplay.kt", l = {484, 504}, m = "invokeSuspend", v = 1)
public final class e extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f176955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f176956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1<uc.c<Object>> f176957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc.c<Object> f176958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t1<uc.c<Object>> f176959e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$8$1$1$1", f = "NavDisplay.kt", l = {512, 516}, m = "invokeSuspend", v = 1)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f176960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f176961b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f176962c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a1<uc.c<Object>> f176963d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ uc.c<Object> f176964e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f14, float f15, a1<uc.c<Object>> a1Var, uc.c<Object> cVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f176961b = f14;
            this.f176962c = f15;
            this.f176963d = a1Var;
            this.f176964e = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f176961b, this.f176962c, this.f176963d, this.f176964e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
        
            if (r2.q(r7.f176964e, r7) == r0) goto L20;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f176960a;
            a1<uc.c<Object>> a1Var = this.f176963d;
            float f14 = this.f176961b;
            float f15 = this.f176962c;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                } else {
                    if (i14 != 2) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
            r.b(obj);
            if (f14 != f15) {
                this.f176960a = 1;
                if (a1Var.n(f14, a1Var.f155462b.getF182175a(), this) != aVar) {
                }
                return aVar;
            }
            if (f14 == f15) {
                this.f176960a = 2;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a1<uc.c<Object>> a1Var, uc.c<Object> cVar, t1<uc.c<Object>> t1Var, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f176957c = a1Var;
        this.f176958d = cVar;
        this.f176959e = t1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f176957c, this.f176958d, this.f176959e, dVar);
        eVar.f176956b = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (s1.a1.k(r11, r12, r15) == r6) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b3, code lost:
    
        if (s1.q1.c(r2, r8, r0, r3, r15, 4) == r6) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b5, code lost:
    
        return r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f176955a;
        if (i14 == 0) {
            r.b(obj);
            b0 b0Var = (b0) this.f176956b;
            a1<uc.c<Object>> a1Var = this.f176957c;
            c2 c2Var = a1Var.f155463c;
            z1 z1Var = a1Var.f155468h;
            T f182175a = c2Var.getF182175a();
            uc.c<Object> cVar = this.f176958d;
            if (s.g(f182175a, cVar)) {
                t1<uc.c<Object>> t1Var = this.f176959e;
                long jG = t1Var.g() / ((long) 1000000);
                o13.p pVar = s.g(t1Var.f155747d.getF182175a(), cVar) ? new o13.p(new Float(1.0f), new Integer((int) ((1.0f - z1Var.getFloatValue()) * jG))) : new o13.p(new Float(0.0f), new Integer((int) (z1Var.getFloatValue() * jG)));
                float fFloatValue = ((Number) pVar.f128594a).floatValue();
                int iIntValue = ((Number) pVar.f128595b).intValue();
                float floatValue = z1Var.getFloatValue();
                b2 b2VarD = l.d(iIntValue, 0, null, 6);
                w wVar = new w(fFloatValue, 5, b0Var, a1Var, cVar);
                this.f176955a = 2;
            } else {
                this.f176955a = 1;
            }
        } else {
            if (i14 != 1 && i14 != 2) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
