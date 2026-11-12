package yt;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import i3.ve;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class u implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eu.g f199398b;

    public /* synthetic */ u(eu.g gVar, int i14) {
        this.f199397a = i14;
        this.f199398b = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f199397a;
        eu.g gVar = this.f199398b;
        Object[] objArr = 0;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    wf.f.a aVar = new wf.f.a((Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b));
                    aVar.f184930c = gVar.f66085b;
                    wf.c cVar = wf.c.DISABLED;
                    aVar.f184942o = cVar;
                    aVar.f184943p = cVar;
                    jf.r.a(aVar.a(), null, null, null, null, null, null, mVar, 48, 2044);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    o4.d0.f128823b.getClass();
                    ve.a(x2.d(h4.r.S, 1.0f), null, o4.d0.f128831j, 0L, 0.0f, 0.0f, null, z3.f.c(55857492, new u(gVar, objArr == true ? 1 : 0), mVar2), mVar2, 12583302, 122);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
