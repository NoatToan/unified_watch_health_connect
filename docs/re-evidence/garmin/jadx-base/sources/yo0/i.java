package yo0;

import androidx.lifecycle.u1;
import java.util.concurrent.ConcurrentLinkedDeque;
import o53.c2;
import o53.s0;
import o53.z;
import p005kotlin.Metadata;
import r22.v0;
import zo0.o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lyo0/i;", "Landroidx/lifecycle/u1;", "Lzo0/o;", "dialogHandlerProvider", "subscriptionDialogHandlerProvider", "Lo53/z;", "backgroundDispatcher", "<init>", "(Lzo0/o;Lzo0/o;Lo53/z;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f198394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f198395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f198396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c2 f198397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c2 f198398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConcurrentLinkedDeque<v0> f198399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConcurrentLinkedDeque<v0> f198400g;

    public i(o oVar, o oVar2, z zVar) {
        oVar.getClass();
        oVar2.getClass();
        zVar.getClass();
        this.f198394a = oVar;
        this.f198395b = oVar2;
        this.f198396c = zVar;
        this.f198399f = new ConcurrentLinkedDeque<>();
        this.f198400g = new ConcurrentLinkedDeque<>();
    }

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        super.onCleared();
        c2 c2Var = this.f198397d;
        if (c2Var != null) {
            c2Var.c(null);
        }
        c2 c2Var2 = this.f198398e;
        if (c2Var2 != null) {
            c2Var2.c(null);
        }
    }

    public i() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i(o oVar, o oVar2, z zVar, int i14, p005kotlin.jvm.internal.j jVar) {
        oVar = (i14 & 1) != 0 ? new a() : oVar;
        oVar2 = (i14 & 2) != 0 ? new n() : oVar2;
        if ((i14 & 4) != 0) {
            x53.c cVar = s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(oVar, oVar2, zVar);
    }
}
