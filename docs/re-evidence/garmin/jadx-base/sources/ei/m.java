package ei;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;
import p13.h0;
import vh.n0;
import vh.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\u0010\t\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00060\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvh/n0$a;", "D", "Lo13/p;", "", "", "Lci/n;", "", "invoke", "()Lo13/p;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
public final class m extends w implements e23.a<o13.p<? extends Map<String, ? extends ci.n>, ? extends Set<? extends String>>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n0<Object> f64132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f64133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f64134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f64135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ci.a f64136e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n0<Object> n0Var, Object obj, z zVar, h hVar, ci.a aVar) {
        super(0);
        this.f64132a = n0Var;
        this.f64133b = obj;
        this.f64134c = zVar;
        this.f64135d = hVar;
        this.f64136e = aVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, vh.n0$a] */
    @Override // e23.a
    public final o13.p<? extends Map<String, ? extends ci.n>, ? extends Set<? extends String>> invoke() {
        h hVar = this.f64135d;
        LinkedHashMap linkedHashMapB = ci.l.b(this.f64132a, this.f64133b, this.f64134c, hVar.f64114a);
        return new o13.p<>(linkedHashMapB, ((di.f) hVar.f64118e.getValue()).e(h0.b1(linkedHashMapB.values()), this.f64136e));
    }
}
