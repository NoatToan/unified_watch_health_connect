package ew0;

import androidx.lifecycle.v1;
import o53.s0;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f66192b;

    public /* synthetic */ a(m mVar, int i14) {
        this.f66191a = i14;
        this.f66192b = mVar;
    }

    @Override // e23.a
    public final Object invoke() {
        Object value;
        int i14 = this.f66191a;
        m mVar = this.f66192b;
        switch (i14) {
            case 0:
                mVar.getClass();
                ge1.b.T(v1.a(mVar), null, null, new o(mVar, null), 3);
                break;
            case 1:
                mVar.getClass();
                w9.a aVarA = v1.a(mVar);
                x53.c cVar = s0.f129406a;
                ge1.b.T(aVarA, x53.b.f189152a, null, new n(mVar, null), 2);
                break;
            default:
                p2 p2Var = mVar.f66249p;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, new d0(false, ((d0) value).f66201b)));
                break;
        }
        return Unit.INSTANCE;
    }
}
