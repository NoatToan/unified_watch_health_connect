package androidx.lifecycle;

import androidx.lifecycle.u1;
import androidx.lifecycle.viewmodel.CreationExtras;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BC\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/w1;", "Landroidx/lifecycle/u1;", "VM", "Lo13/l;", "Lk23/d;", "viewModelClass", "Lkotlin/Function0;", "Landroidx/lifecycle/y1;", "storeProducer", "Landroidx/lifecycle/x1$c;", "factoryProducer", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extrasProducer", "<init>", "(Lk23/d;Le23/a;Le23/a;Le23/a;)V", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w1<VM extends u1> implements o13.l<VM> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k23.d<VM> f8065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<y1> f8066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.a<x1.c> f8067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.a<CreationExtras> f8068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public VM f8069e;

    /* JADX WARN: Multi-variable type inference failed */
    public w1(k23.d<VM> dVar, e23.a<? extends y1> aVar, e23.a<? extends x1.c> aVar2, e23.a<? extends CreationExtras> aVar3) {
        dVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        this.f8065a = dVar;
        this.f8066b = aVar;
        this.f8067c = aVar2;
        this.f8068d = aVar3;
    }

    @Override // o13.l
    public final Object getValue() {
        VM vm3 = this.f8069e;
        if (vm3 != null) {
            return vm3;
        }
        y1 y1VarInvoke = this.f8066b.invoke();
        x1.c cVarInvoke = this.f8067c.invoke();
        CreationExtras creationExtrasInvoke = this.f8068d.invoke();
        x1.f8070b.getClass();
        VM vm4 = (VM) x1.b.a(y1VarInvoke, cVarInvoke, creationExtrasInvoke).b(this.f8065a);
        this.f8069e = vm4;
        return vm4;
    }

    @Override // o13.l
    public final boolean isInitialized() {
        return this.f8069e != null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w1(k23.d<VM> dVar, e23.a<? extends y1> aVar, e23.a<? extends x1.c> aVar2) {
        this(dVar, aVar, aVar2, null, 8, null);
        dVar.getClass();
        aVar.getClass();
        aVar2.getClass();
    }

    public /* synthetic */ w1(k23.d dVar, e23.a aVar, e23.a aVar2, e23.a aVar3, int i14, p005kotlin.jvm.internal.j jVar) {
        this(dVar, aVar, aVar2, (i14 & 8) != 0 ? new ak0.t(7) : aVar3);
    }
}
