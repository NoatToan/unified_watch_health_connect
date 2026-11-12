package fm2;

import e23.p;
import java.util.Collection;
import o13.r;
import o53.b0;
import ok2.a0;
import ok2.w;
import ok2.y;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.pairing.impl.gdi.PairingGdiAdapter$startSync$1", f = "PairingGdiAdapter.kt", l = {106}, m = "invokeSuspend")
public final class f extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rs2.c f72134b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(rs2.c cVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f72134b = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f72134b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f72133a;
        if (i14 == 0) {
            r.b(obj);
            w wVarA = a0.f132585h.a().a(this.f72134b.getF92741e());
            if (wVarA != null) {
                y yVar = new y((Collection) null, (Collection) null, y.d.BLOCKED, (y.d) null, false, 27, (j) null);
                this.f72133a = 1;
                obj = wVarA.q(yVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        return Unit.INSTANCE;
    }
}
