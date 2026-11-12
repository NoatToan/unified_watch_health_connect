package d21;

import b63.v;
import e23.l;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class e implements l<v, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e21.a f57293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e21.a.c f57294b;

    public e(e21.a aVar, e21.a.c cVar) {
        this.f57293a = aVar;
        this.f57294b = cVar;
    }

    @Override // e23.l
    public final Unit invoke(v vVar) {
        Object value;
        v vVar2 = vVar;
        vVar2.getClass();
        String str = this.f57294b.f62616a;
        e21.a aVar = this.f57293a;
        aVar.getClass();
        qd1.b bVar = aVar.f62613f;
        if (bVar != null) {
            List<qd1.a> list = bVar.f144479a;
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            for (qd1.a aVarA : list) {
                if (str.equals(aVarA.f144476b)) {
                    aVarA = qd1.a.a(aVarA, false, null, vVar2, 11);
                }
                arrayList.add(aVarA);
            }
            qd1.b bVar2 = aVar.f62613f;
            aVar.f62613f = bVar2 != null ? qd1.b.a(bVar2, arrayList) : null;
            p2 p2Var = aVar.f62611d;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, e21.a.d.a((e21.a.d) value, null, null, aVar.x4(arrayList), 3)));
        }
        return Unit.INSTANCE;
    }
}
