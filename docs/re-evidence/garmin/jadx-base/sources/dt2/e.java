package dt2;

import com.garmin.gfdi.ResponseStatusException;
import e23.p;
import java.io.IOException;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import rs2.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.gfdi.protobuf.ProtobufHandler$sendCancellation$1", f = "ProtobufHandler.kt", l = {526}, m = "invokeSuspend")
public final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f61192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f61193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f61194c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, byte[] bArr, t13.d<? super e> dVar2) {
        super(2, dVar2);
        this.f61193b = dVar;
        this.f61194c = bArr;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f61193b, this.f61194c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f61192a;
        d dVar = this.f61193b;
        try {
            if (i14 == 0) {
                r.b(obj);
                v vVar = dVar.f61147b;
                if ((vVar instanceof us2.b) && ((us2.b) vVar).f172464g.get() == us2.b.a.ENDED) {
                    return Unit.INSTANCE;
                }
                v vVar2 = dVar.f61147b;
                byte[] bArr = this.f61194c;
                this.f61192a = 1;
                if (vVar2.b(5045, bArr, this) == aVar) {
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
            dVar.f61153h.warn("Failed to send protobuf cancellation", (Throwable) e4);
        } catch (IOException e14) {
            dVar.f61153h.warn("Failed to send protobuf cancellation", (Throwable) e14);
        } catch (Throwable unused) {
        }
        return Unit.INSTANCE;
    }
}
