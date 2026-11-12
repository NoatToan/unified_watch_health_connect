package vr2;

import org.slf4j.Logger;
import p005kotlin.jvm.internal.r0;
import zn2.g1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class h implements u03.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f179595a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f179596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f179597c;

    public /* synthetic */ h(r0 r0Var, i iVar) {
        this.f179596b = r0Var;
        this.f179597c = iVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.util.List] */
    @Override // u03.a
    public final void run() {
        ?? H;
        int i14 = this.f179595a;
        i iVar = this.f179597c;
        r0 r0Var = this.f179596b;
        switch (i14) {
            case 0:
                g1 g1Var = iVar.f179607j;
                if (g1Var != null && (H = g1Var.f205527b.f205521a.h()) != 0) {
                    r0Var.f105810a = H;
                    break;
                }
                break;
            default:
                Logger logger = i.C;
                for (fs2.a aVar : (Iterable) r0Var.f105810a) {
                    is2.b bVar = aVar.f73427b;
                    if (bVar != null) {
                        iVar.f179601d.add(yr2.m.a(bVar).a(aVar));
                    }
                }
                break;
        }
    }

    public /* synthetic */ h(i iVar, r0 r0Var) {
        this.f179597c = iVar;
        this.f179596b = r0Var;
    }
}
