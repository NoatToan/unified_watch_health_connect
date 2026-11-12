package kn1;

import h5.e2;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p008y1.p2;
import z2.z;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f105650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f105651b;

    public /* synthetic */ c(m0 m0Var, int i14) {
        this.f105650a = i14;
        this.f105651b = m0Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    @Override // e23.l
    public final Object invoke(Object obj) {
        boolean z14;
        switch (this.f105650a) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    m0 m0Var = this.f105651b;
                    if (!m0Var.f105804a) {
                        ht.a.f85464a.getClass();
                        ht.a.a(null, "SleepScoreFactorsClicked");
                        m0Var.f105804a = true;
                    }
                }
                return Unit.INSTANCE;
            case 1:
                e2 e2Var = (e2) obj;
                m0 m0Var2 = this.f105651b;
                if (m0Var2.f105804a) {
                    z14 = true;
                } else {
                    e2Var.getClass();
                    if (((p2) e2Var).f193554b) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                }
                m0Var2.f105804a = z14;
                return Boolean.valueOf(!z14);
            default:
                if (((z) obj).f201853f.f157280a.f157265a.f157138b.length() > 0) {
                    this.f105651b.f105804a = false;
                }
                return Unit.INSTANCE;
        }
    }
}
