package kotlin;

import b4.d;
import e23.a;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class s2 extends w implements a<p005kotlin.Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r2.b f91476a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(r2.b bVar) {
        super(0);
        this.f91476a = bVar;
    }

    @Override // e23.a
    public final p005kotlin.Unit invoke() {
        d dVar = this.f91476a.f91426a.f91399a;
        if (!dVar.f15692b) {
            if (dVar.f15693c) {
                c4.a.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
            }
            dVar.a();
            dVar.f15693c = true;
        }
        return p005kotlin.Unit.INSTANCE;
    }
}
