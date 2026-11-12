package xs2;

import e23.p;
import o13.u;
import o53.b0;
import o53.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import rs2.x;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo53/b0;", "Lo13/u;", "", "", "Lrs2/x;", "<anonymous>", "(Lo53/b0;)Lo13/u;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.gfdi.file.read.ReadFileFromDeviceTask$awaitIncomingData$2", f = "ReadFileFromDeviceTask.kt", l = {122}, m = "invokeSuspend")
public final class e extends v13.i implements p<b0, t13.d<? super u<? extends Integer, ? extends byte[], ? extends x>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f192106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r<u<Integer, byte[], x>> f192107b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r<u<Integer, byte[], x>> rVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f192107b = rVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f192107b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super u<? extends Integer, ? extends byte[], ? extends x>> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f192106a;
        if (i14 == 0) {
            o13.r.b(obj);
            this.f192106a = 1;
            Object objAwait = this.f192107b.await(this);
            return objAwait == aVar ? aVar : objAwait;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            return obj;
        }
        vb.h.z("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
