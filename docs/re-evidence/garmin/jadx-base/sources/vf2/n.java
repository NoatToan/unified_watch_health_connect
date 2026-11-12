package vf2;

import com.garmin.proto.generated.GDIDataTypes;
import p005kotlin.Metadata;
import p13.j0;
import p13.x;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lvf2/n;", "Lvf2/q;", "Lvf2/k;", "exerciseMapSource", "<init>", "(Lvf2/k;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends q {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(k kVar) {
        super(kVar);
        kVar.getClass();
    }

    @Override // vf2.q
    public final Object a(int i14, int i15, v13.c cVar) {
        throw new o13.o("An operation is not implemented: Not yet implemented");
    }

    @Override // vf2.q
    public final Object b(String str, fg2.j jVar) {
        return j0.f134944a;
    }

    @Override // vf2.q
    public final Object c(String str, long j8, String str2, GDIDataTypes.UUID uuid, t13.d<? super p> dVar) {
        return new p("Mock Workout", null, kg.f.c(), x.k(new v(0, "Step 0", new Integer(5), new Integer(21), null, new Double(2000.0d), null, null, new Integer(0), null, new Integer(0), null, new Float(75.0f), null, null, null, null, null, null, 518864, null), new v(1, "Step 1", new Integer(5), new Integer(21), null, new Double(1000.0d), null, null, new Integer(0), null, new Integer(0), null, new Float(75.0f), null, null, null, null, null, null, 518864, null), new v(2, "Step 0", new Integer(5), new Integer(21), null, new Double(2000.0d), null, null, new Integer(0), null, new Integer(0), null, new Float(75.0f), null, null, null, null, null, null, 518864, null)), x.k(new o(0, 0, 0, 0, null), new o(1, 1, 2, 1, null)), 2, null);
    }
}
