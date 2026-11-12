package ml0;

import androidx.lifecycle.v1;
import c22.m3;
import ml0.p.a;
import o53.c2;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f119205b;

    public /* synthetic */ d(p pVar, int i14) {
        this.f119204a = i14;
        this.f119205b = pVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f119204a) {
            case 0:
                p pVar = this.f119205b;
                c2 c2Var = pVar.f119268i;
                if (c2Var != null) {
                    c2Var.c(null);
                }
                pVar.f119268i = ge1.b.T(v1.a(pVar), null, null, new r(pVar, null), 3);
                return Unit.INSTANCE;
            case 1:
                return this.f119205b.f119263d.g().a() ? m3.KILOMETER : m3.MILE;
            default:
                return this.f119205b.new a();
        }
    }
}
