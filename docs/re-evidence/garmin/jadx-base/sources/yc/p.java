package yc;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lyc/e4;", "", "<anonymous>", "(Lyc/e4;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.paging.CancelableChannelFlowKt$cancelableChannelFlow$1", f = "CancelableChannelFlow.kt", l = {33}, m = "invokeSuspend")
public final class p extends v13.i implements e23.p<e4<Object>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f196306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f196307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o53.l1 f196308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.p<e4<Object>, t13.d<? super Unit>, Object> f196309d;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends p005kotlin.jvm.internal.w implements e23.l<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e4<Object> f196310a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e4<Object> e4Var) {
            super(1);
            this.f196310a = e4Var;
        }

        @Override // e23.l
        public final Unit invoke(Throwable th3) {
            this.f196310a.q(null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(o53.l1 l1Var, e23.p<? super e4<Object>, ? super t13.d<? super Unit>, ? extends Object> pVar, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f196308c = l1Var;
        this.f196309d = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        p pVar = new p(this.f196308c, this.f196309d, dVar);
        pVar.f196307b = obj;
        return pVar;
    }

    @Override // e23.p
    public final Object invoke(e4<Object> e4Var, t13.d<? super Unit> dVar) {
        return ((p) create(e4Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f196306a;
        if (i14 == 0) {
            o13.r.b(obj);
            e4<Object> e4Var = (e4) this.f196307b;
            this.f196308c.J(new a(e4Var));
            this.f196306a = 1;
            if (this.f196309d.invoke(e4Var, this) == aVar) {
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
