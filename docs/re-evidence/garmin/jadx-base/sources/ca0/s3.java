package ca0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class s3 extends p005kotlin.jvm.internal.q implements e23.l<b63.v, Unit> {
    public s3(Object obj) {
        super(1, obj, kb0.r.class, "onEditWakeTimeChanged", "onEditWakeTimeChanged(Lkotlinx/datetime/LocalTime;)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(b63.v vVar) {
        Object value;
        mb0.f fVar;
        b63.v vVar2 = vVar;
        vVar2.getClass();
        kb0.r rVar = (kb0.r) this.receiver;
        rVar.getClass();
        r53.p2 p2Var = rVar.f103807a;
        do {
            value = p2Var.getValue();
            fVar = (mb0.f) value;
        } while (!p2Var.b(value, mb0.f.a(fVar, null, null, mb0.d.a(fVar.f117732c, null, null, vVar2, null, 23), null, null, 27)));
        return Unit.INSTANCE;
    }
}
