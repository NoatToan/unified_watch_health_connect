package i3;

import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.material3.DateInputKt$DateInputTextField$5$1", f = "DateInput.kt", l = {}, m = "invokeSuspend")
public final class z2 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Long f90519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l3.e0 f90520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l3.k0 f90521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Locale f90522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3.p1<x5.l0> f90523e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(Long l14, l3.e0 e0Var, l3.k0 k0Var, Locale locale, p3.p1<x5.l0> p1Var, t13.d<? super z2> dVar) {
        super(2, dVar);
        this.f90519a = l14;
        this.f90520b = e0Var;
        this.f90521c = k0Var;
        this.f90522d = locale;
        this.f90523e = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new z2(this.f90519a, this.f90520b, this.f90521c, this.f90522d, this.f90523e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((z2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        long jL;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        Long l14 = this.f90519a;
        if (l14 != null) {
            String strA = this.f90520b.a(l14.longValue(), this.f90521c.f109298c, this.f90522d);
            if (strA.length() == 0) {
                s5.w0.f157315b.getClass();
                jL = s5.w0.f157316c;
            } else {
                jL = og.a.l(strA.length(), strA.length());
            }
            x5.l0 l0Var = new x5.l0(strA, jL, (s5.w0) null, 4, (p005kotlin.jvm.internal.j) null);
            c2.l2 l2Var = w2.f90061a;
            this.f90523e.setValue(l0Var);
        }
        return Unit.INSTANCE;
    }
}
