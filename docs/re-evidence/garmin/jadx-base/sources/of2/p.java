package of2;

import java.util.UUID;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.communication.LSVSession$notifySessionEndedByUser$1", f = "LSVSession.kt", l = {439, 440}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f131893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f131894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rf2.e f131895c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(b bVar, rf2.e eVar, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f131894b = bVar;
        this.f131895c = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p(this.f131894b, this.f131895c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if (r6.invoke(r1, r5) == r0) goto L17;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f131893a;
        b bVar = this.f131894b;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f131893a = 1;
            int i15 = b.f131721p;
            if (bVar.e(this.f131895c, this) != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
        e23.p<? super UUID, ? super t13.d<? super Unit>, ? extends Object> pVar = bVar.f131724c;
        if (pVar != null) {
            UUID uuid = ((b0) bVar.f131736o.getValue()).f131744a;
            this.f131893a = 2;
        }
        return Unit.INSTANCE;
    }
}
