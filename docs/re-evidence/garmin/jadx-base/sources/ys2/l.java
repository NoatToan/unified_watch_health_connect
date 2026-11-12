package ys2;

import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.gfdi.file.write.SendFileToDeviceTask$sendData$2", f = "SendFileToDeviceTask.kt", l = {}, m = "invokeSuspend")
public final class l extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f199234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Integer f199235b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, Integer num, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f199234a = oVar;
        this.f199235b = num;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f199234a, this.f199235b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o oVar = this.f199234a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        try {
            e23.p<Integer, Integer, Unit> pVar = oVar.f199250g;
            if (pVar != null) {
                Integer num = this.f199235b;
                pVar.invoke(new Integer(num != null ? num.intValue() : oVar.f199245b.getSize()), new Integer(oVar.f199245b.getSize()));
            }
        } catch (Exception unused) {
        }
        return Unit.INSTANCE;
    }
}
