package s1;

import java.util.concurrent.CancellationException;
import okhttp3.internal.http.StatusLine;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Ls1/r;", "V", "Ls1/i;", "<anonymous>", "()Ls1/i;"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = {StatusLine.HTTP_PERM_REDIRECT}, m = "invokeSuspend", v = 1)
public final class a extends v13.i implements e23.l<t13.d<? super i<Object, r>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m f155450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p005kotlin.jvm.internal.m0 f155451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f155452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b<Object, r> f155453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f155454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g<Object, r> f155455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f155456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e23.l<b<Object, r>, Unit> f155457h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(b<Object, r> bVar, Object obj, g<Object, r> gVar, long j8, e23.l<? super b<Object, r>, Unit> lVar, t13.d<? super a> dVar) {
        super(1, dVar);
        this.f155453d = bVar;
        this.f155454e = obj;
        this.f155455f = gVar;
        this.f155456g = j8;
        this.f155457h = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new a(this.f155453d, this.f155454e, this.f155455f, this.f155456g, this.f155457h, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super i<Object, r>> dVar) {
        return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        m mVar;
        p005kotlin.jvm.internal.m0 m0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f155452c;
        b<Object, r> bVar = this.f155453d;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                bVar.f155489c.f155629c = (V) bVar.f155487a.a().invoke(this.f155454e);
                bVar.f155491e.setValue(this.f155455f.getTargetValue());
                bVar.f155490d.setValue(Boolean.TRUE);
                m<Object, V> mVar2 = bVar.f155489c;
                m mVar3 = new m(mVar2.f155627a, mVar2.f155628b.getF182175a(), v.c(mVar2.f155629c), mVar2.f155630d, Long.MIN_VALUE, mVar2.f155632f);
                p005kotlin.jvm.internal.m0 m0Var2 = new p005kotlin.jvm.internal.m0();
                g<Object, r> gVar = this.f155455f;
                long j8 = this.f155456g;
                mt0.e0 e0Var = new mt0.e0(bVar, mVar3, this.f155457h, m0Var2, 23);
                this.f155450a = mVar3;
                this.f155451b = m0Var2;
                this.f155452c = 1;
                if (q1.b(mVar3, gVar, j8, e0Var, this) == aVar) {
                    return aVar;
                }
                mVar = mVar3;
                m0Var = m0Var2;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m0Var = this.f155451b;
                mVar = this.f155450a;
                o13.r.b(obj);
            }
            h hVar = m0Var.f105804a ? h.BoundReached : h.Finished;
            b.a(bVar);
            return new i(mVar, hVar);
        } catch (CancellationException e4) {
            b.a(bVar);
            throw e4;
        }
    }
}
