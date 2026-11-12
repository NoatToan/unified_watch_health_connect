package vs2;

import e23.p;
import java.util.Set;
import o13.r;
import o53.b0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.gfdi.event.SyncMessageManager$notifyListener$1", f = "SyncMessageManager.kt", l = {}, m = "invokeSuspend")
public final class f extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f179941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f179942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set<Integer> f179943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws2.c f179944d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, j jVar, Set<Integer> set, ws2.c cVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f179941a = iVar;
        this.f179942b = jVar;
        this.f179943c = set;
        this.f179944d = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f179941a, this.f179942b, this.f179943c, this.f179944d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        i iVar = this.f179941a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        try {
            e eVar = iVar.f179955f.get();
            if (eVar != null) {
                us2.f fVar = iVar.f179952c;
                if (fVar == null) {
                    s.m("deviceInfo");
                    throw null;
                }
                eVar.a(fVar, this.f179942b, this.f179943c, this.f179944d);
            }
        } catch (Exception e4) {
            Logger logger = iVar.f179951b;
            if (logger == null) {
                s.m("logger");
                throw null;
            }
            logger.error("Exception calling SyncMessageListener", (Throwable) e4);
        }
        return Unit.INSTANCE;
    }
}
