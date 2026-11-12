package m20;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lm20/p0;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.contacts.network.PhoneNumberRepo$phoneNumberValidate$2", f = "PhoneNumberRepo.kt", l = {14}, m = "invokeSuspend", v = 2)
public final class m0 extends v13.i implements e23.l<t13.d<? super c83.a0<p0>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f115992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n0 f115993c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(String str, n0 n0Var, t13.d<? super m0> dVar) {
        super(1, dVar);
        this.f115992b = str;
        this.f115993c = n0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new m0(this.f115992b, this.f115993c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<p0>> dVar) {
        return ((m0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115991a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<p0>> i0VarA = this.f115993c.f115996a.a(new o0(this.f115992b));
        this.f115991a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
