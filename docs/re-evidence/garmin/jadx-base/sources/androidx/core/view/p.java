package androidx.core.view;

import java.io.Serializable;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements androidx.lifecycle.k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Serializable f6553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6554d;

    public /* synthetic */ p(Object obj, Serializable serializable, Object obj2, int i14) {
        this.f6551a = i14;
        this.f6552b = obj;
        this.f6553c = serializable;
        this.f6554d = obj2;
    }

    /* JADX WARN: Type inference failed for: r6v14, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [T, java.lang.Object] */
    @Override // androidx.lifecycle.k0
    public final void onStateChanged(androidx.lifecycle.n0 n0Var, androidx.lifecycle.b0.a aVar) {
        switch (this.f6551a) {
            case 0:
                r rVar = (r) this.f6552b;
                Runnable runnable = rVar.f6558a;
                CopyOnWriteArrayList<s> copyOnWriteArrayList = rVar.f6559b;
                androidx.lifecycle.b0.b bVar = (androidx.lifecycle.b0.b) this.f6553c;
                s sVar = (s) this.f6554d;
                androidx.lifecycle.b0.a.INSTANCE.getClass();
                if (aVar == androidx.lifecycle.b0.a.Companion.c(bVar)) {
                    copyOnWriteArrayList.add(sVar);
                    runnable.run();
                } else if (aVar == androidx.lifecycle.b0.a.ON_DESTROY) {
                    rVar.c(sVar);
                } else if (aVar == androidx.lifecycle.b0.a.Companion.a(bVar)) {
                    copyOnWriteArrayList.remove(sVar);
                    runnable.run();
                }
                break;
            case 1:
                s9.g gVar = (s9.g) this.f6552b;
                p005kotlin.jvm.internal.r0 r0Var = (p005kotlin.jvm.internal.r0) this.f6553c;
                e23.l lVar = (e23.l) this.f6554d;
                int i14 = s9.e.c.f158015a[aVar.ordinal()];
                if (i14 == 3) {
                    r0Var.f105810a = lVar.invoke(gVar);
                    break;
                } else if (i14 == 4) {
                    r0Var.f105810a = null;
                    break;
                }
                break;
            default:
                s9.h hVar = (s9.h) this.f6552b;
                p005kotlin.jvm.internal.r0 r0Var2 = (p005kotlin.jvm.internal.r0) this.f6553c;
                e23.l lVar2 = (e23.l) this.f6554d;
                int i15 = s9.e.c.f158015a[aVar.ordinal()];
                if (i15 == 1) {
                    r0Var2.f105810a = lVar2.invoke(hVar);
                    break;
                } else if (i15 == 2) {
                    s9.i iVar = (s9.i) r0Var2.f105810a;
                    if (iVar != null) {
                        iVar.a();
                    }
                    r0Var2.f105810a = null;
                    break;
                }
                break;
        }
    }
}
