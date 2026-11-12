package o53;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lo53/m1;", "Lo53/p1;", "Lo53/t;", "Lo53/l1;", "parent", "<init>", "(Lo53/l1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class m1 extends p1 implements t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f129372c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(l1 l1Var) {
        super(true);
        boolean z14 = true;
        d0(l1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p1.f129382b;
        o oVar = (o) atomicReferenceFieldUpdater.get(this);
        p pVar = oVar instanceof p ? (p) oVar : null;
        if (pVar == null) {
            z14 = false;
            break;
        }
        p1 p1VarH = pVar.h();
        while (!p1VarH.getF129372c()) {
            o oVar2 = (o) atomicReferenceFieldUpdater.get(p1VarH);
            p pVar2 = oVar2 instanceof p ? (p) oVar2 : null;
            if (pVar2 == null) {
                z14 = false;
                break;
            }
            p1VarH = pVar2.h();
        }
        this.f129372c = z14;
    }

    @Override // o53.p1
    /* JADX INFO: renamed from: Y, reason: from getter */
    public final boolean getF129372c() {
        return this.f129372c;
    }

    @Override // o53.p1
    public final boolean Z() {
        return true;
    }

    @Override // o53.t
    public final boolean complete() {
        return g0(Unit.INSTANCE);
    }
}
