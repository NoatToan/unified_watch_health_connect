package ff2;

import androidx.lifecycle.w0;
import p005kotlin.Unit;
import q53.t;
import wd2.m1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f71145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f71146b;

    public /* synthetic */ d(t tVar, int i14) {
        this.f71145a = i14;
        this.f71146b = tVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f71145a) {
            case 0:
                this.f71146b.i((a) obj);
                break;
            default:
                w0 w0VarB = ((m1) obj).b(false);
                if (w0VarB != null) {
                    t tVar = this.f71146b;
                    ge1.b.T(tVar, null, null, new kv0.j.c.a(w0VarB, tVar, null), 3);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
