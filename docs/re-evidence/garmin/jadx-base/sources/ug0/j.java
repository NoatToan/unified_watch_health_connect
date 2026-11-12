package ug0;

import o53.c2;
import p005kotlin.Metadata;
import p3.h0;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lug0/j;", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f170595a;

    public j(q qVar) {
        this.f170595a = qVar;
    }

    @Override // p3.h0
    public final void dispose() {
        Object value;
        q qVar = this.f170595a;
        p2 p2Var = qVar.f170631e;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, new a(null, false, null, 7, null)));
        qVar.f170632f.setValue(null);
        c2 c2Var = qVar.f170633g;
        if (c2Var != null) {
            c2Var.c(null);
        }
    }
}
