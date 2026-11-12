package ca0;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.navigation.UserProfileNavKt$userProfileGraph$1$18$1$1", f = "UserProfileNav.kt", l = {402}, m = "invokeSuspend", v = 2)
public final class n3 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ab0.a f26386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kb0.r f26387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c4.n f26388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a<q90.c> f26389e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(ab0.a aVar, kb0.r rVar, c4.n nVar, e23.a<q90.c> aVar2, t13.d<? super n3> dVar) {
        super(2, dVar);
        this.f26386b = aVar;
        this.f26387c = rVar;
        this.f26388d = nVar;
        this.f26389e = aVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n3(this.f26386b, this.f26387c, this.f26388d, this.f26389e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n3) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f26385a;
        if (i14 == 0) {
            o13.r.b(obj);
            r53.l1 l1Var = new r53.l1(this.f26386b.f2518k);
            this.f26385a = 1;
            obj = r53.s.x(l1Var, this);
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
        z80.l lVar = (z80.l) obj;
        z80.m mVar = lVar.f203078g;
        int i15 = mVar != null ? mVar.f203085a : 79200;
        int i16 = mVar != null ? mVar.f203086b : 21600;
        String str = this.f26388d.f26174b;
        z80.f fVar = this.f26389e.invoke().f143497e;
        Boolean bool = fVar != null ? fVar.f203049g : null;
        List<z80.j> list = lVar.f203079h;
        if (list == null) {
            list = p13.j0.f134944a;
        }
        this.f26387c.B4(i15, i16, str, bool, list);
        return Unit.INSTANCE;
    }
}
