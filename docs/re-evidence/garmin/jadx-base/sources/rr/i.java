package rr;

import c2.k3;
import com.google.android.exoplayer2.C;
import e23.l;
import e23.p;
import h4.r;
import i3.kb;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154179a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.f f154180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f154181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f154182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f154183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z3.e f154184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r f154185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k3 f154186h;

    public /* synthetic */ i(k3 k3Var, r rVar, boolean z14, k kVar, i53.f fVar, l lVar, z3.e eVar) {
        this.f154186h = k3Var;
        this.f154185g = rVar;
        this.f154182d = z14;
        this.f154181c = kVar;
        this.f154180b = fVar;
        this.f154183e = lVar;
        this.f154184f = eVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f154179a) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    kb.a(null, null, null, null, null, 0, 0L, 0L, this.f154186h, z3.f.c(1111296265, new l72.b(this.f154185g, this.f154182d, this.f154181c, this.f154180b, this.f154183e, this.f154184f, 3), mVar), mVar, C.ENCODING_PCM_32BIT, 255);
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                j.a(this.f154180b, this.f154181c, this.f154182d, this.f154183e, this.f154184f, this.f154185g, this.f154186h, (m) obj, p0.t(24577));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ i(i53.f fVar, k kVar, boolean z14, l lVar, z3.e eVar, r rVar, k3 k3Var, int i14) {
        this.f154180b = fVar;
        this.f154181c = kVar;
        this.f154182d = z14;
        this.f154183e = lVar;
        this.f154184f = eVar;
        this.f154185g = rVar;
        this.f154186h = k3Var;
    }
}
