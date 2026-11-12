package vs2;

import com.garmin.gfdi.ResponseStatusException;
import com.google.mlkit.common.MlKitException;
import e23.p;
import java.io.IOException;
import o13.r;
import o53.b0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import rs2.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.gfdi.event.SyncMessageManager$sendSystemEvent$1", f = "SyncMessageManager.kt", l = {MlKitException.CODE_SCANNER_TASK_IN_PROGRESS}, m = "invokeSuspend")
public final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f179948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f179949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f179950c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, k kVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f179949b = iVar;
        this.f179950c = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f179949b, this.f179950c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f179948a;
        k kVar = this.f179950c;
        i iVar = this.f179949b;
        try {
            if (i14 == 0) {
                r.b(obj);
                v vVar = iVar.f179953d;
                if (vVar == null) {
                    s.m("messenger");
                    throw null;
                }
                byte[] bArr = {kVar.f179981a, 0};
                this.f179948a = 1;
                if (vVar.b(5030, bArr, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        } catch (ResponseStatusException e4) {
            Logger logger = iVar.f179951b;
            if (logger == null) {
                s.m("logger");
                throw null;
            }
            logger.warn("Failed to send " + kVar + " system event", (Throwable) e4);
        } catch (IOException e14) {
            Logger logger2 = iVar.f179951b;
            if (logger2 == null) {
                s.m("logger");
                throw null;
            }
            logger2.warn("Failed to send " + kVar + " system event", (Throwable) e14);
        }
        return Unit.INSTANCE;
    }
}
