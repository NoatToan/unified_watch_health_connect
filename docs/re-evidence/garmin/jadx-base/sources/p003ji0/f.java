package p003ji0;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.m1;
import p3.p1;
import p3.x3;
import t13.d;
import u13.a;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.follow.presentation.common.CollapsingLazyColumnKt$CollapsingLazyColumn$1$1", f = "CollapsingLazyColumn.kt", l = {}, m = "invokeSuspend", v = 2)
public final class f extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f98777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f98778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x3<Integer> f98779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m1 f98780d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, p1<Boolean> p1Var, x3<Integer> x3Var, m1 m1Var, d<? super f> dVar) {
        super(2, dVar);
        this.f98777a = aVar;
        this.f98778b = p1Var;
        this.f98779c = x3Var;
        this.f98780d = m1Var;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new f(this.f98777a, this.f98778b, this.f98779c, this.f98780d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        r.b(obj);
        p1<Boolean> p1Var = this.f98778b;
        if (p1Var.getF182175a().booleanValue()) {
            p1Var.setValue(Boolean.FALSE);
        } else {
            this.f98777a.f98765a.t(Math.max(this.f98779c.getF182175a().intValue(), (int) this.f98780d.getFloatValue()));
        }
        return Unit.INSTANCE;
    }
}
