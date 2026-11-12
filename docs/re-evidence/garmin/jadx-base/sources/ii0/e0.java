package ii0;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;
import yc.z0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.presentation.OthersFriendListKt$OthersFriendList$2$1", f = "OthersFriendList.kt", l = {54}, m = "invokeSuspend", v = 2)
public final class e0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f93590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zc.d<p003ji0.m> f93591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e2.i0 f93592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f93593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f93594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f93595f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(zc.d<p003ji0.m> dVar, e2.i0 i0Var, p1<Boolean> p1Var, p1<Boolean> p1Var2, p1<Boolean> p1Var3, t13.d<? super e0> dVar2) {
        super(2, dVar2);
        this.f93591b = dVar;
        this.f93592c = i0Var;
        this.f93593d = p1Var;
        this.f93594e = p1Var2;
        this.f93595f = p1Var3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e0(this.f93591b, this.f93592c, this.f93593d, this.f93594e, this.f93595f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0075  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f93590a;
        p1<Boolean> p1Var = this.f93594e;
        zc.d<p003ji0.m> dVar = this.f93591b;
        if (i14 == 0) {
            o13.r.b(obj);
            if (!p005kotlin.jvm.internal.s.g(dVar.d().f196385a, z0.b.f196664b)) {
                this.f93593d.setValue(Boolean.FALSE);
                if (p1Var.getF182175a().booleanValue()) {
                    this.f93590a = 1;
                    e2.i0.a aVar2 = e2.i0.f62432x;
                    if (this.f93592c.l(0, 0, this) == aVar) {
                        return aVar;
                    }
                }
            }
            z0 z0Var = dVar.d().f196385a;
            z0.b bVar = z0.b.f196664b;
            this.f93595f.setValue(Boolean.valueOf(!p005kotlin.jvm.internal.s.g(z0Var, bVar) || p005kotlin.jvm.internal.s.g(dVar.d().f196387c, bVar) || p005kotlin.jvm.internal.s.g(dVar.d().f196386b, bVar)));
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        p1Var.setValue(Boolean.FALSE);
        z0 z0Var2 = dVar.d().f196385a;
        z0.b bVar2 = z0.b.f196664b;
        this.f93595f.setValue(Boolean.valueOf(!p005kotlin.jvm.internal.s.g(z0Var2, bVar2) || p005kotlin.jvm.internal.s.g(dVar.d().f196387c, bVar2) || p005kotlin.jvm.internal.s.g(dVar.d().f196386b, bVar2)));
        return Unit.INSTANCE;
    }
}
