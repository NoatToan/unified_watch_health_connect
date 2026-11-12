package il2;

import e23.p;
import o13.r;
import o53.b0;
import o53.s;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lal2/c;", "<anonymous>", "(Lo53/b0;)Lal2/c;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.filetransfer.legacy.LegacySyncManager$requestSync$syncRequestListener$1$await$2", f = "LegacySyncManager.kt", l = {156}, m = "invokeSuspend")
public final class d extends v13.i implements p<b0, t13.d<? super al2.c>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f94037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a.d f94038b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a.d dVar, t13.d<? super d> dVar2) {
        super(2, dVar2);
        this.f94038b = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f94038b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super al2.c> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f94037a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        s sVar = this.f94038b.f94022b;
        this.f94037a = 1;
        Object objC = sVar.C(this);
        return objC == aVar ? aVar : objC;
    }
}
