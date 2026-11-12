package fe2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.domain.ClassicSession$initPublisher$1", f = "ClassicSession.kt", l = {302}, m = "invokeSuspend", v = 2)
public final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f70689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f70690b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f70690b = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f70690b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f70689a;
        b bVar = this.f70690b;
        if (i14 == 0) {
            o13.r.b(obj);
            xd2.a1 a1Var = bVar.f70634b;
            long j8 = bVar.f70633a;
            this.f70689a = 1;
            obj = a1Var.z(j8, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        be2.e eVar = (be2.e) obj;
        String str = eVar.f17749b;
        ae2.e0.a.C0042a c0042a = ae2.e0.a.f2836b;
        String str2 = eVar.f17750c;
        c0042a.getClass();
        ae2.e0.a aVarA = ae2.e0.a.C0042a.a(str2);
        if (aVarA == null) {
            aVarA = new ae2.e0.a.b();
        }
        ae2.e0 e0Var = new ae2.e0(str, aVarA, null, null, null, 28, null);
        bVar.getClass();
        bVar.f70637e = e0Var;
        return Unit.INSTANCE;
    }
}
