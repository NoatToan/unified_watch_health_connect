package hq;

import com.google.android.exoplayer2.C;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class s implements e23.q<r1.e0, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f85143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f85144c;

    public s(int i14, m mVar, l lVar) {
        this.f85142a = i14;
        this.f85143b = mVar;
        this.f85144c = lVar;
    }

    @Override // e23.q
    public final Unit invoke(r1.e0 e0Var, p3.m mVar, Integer num) {
        num.intValue();
        e0Var.getClass();
        x1 x1Var = p3.n.f135158a;
        m mVar2 = this.f85143b;
        String str = mVar2.f85066a;
        String str2 = mVar2.f85067b;
        String str3 = mVar2.f85068c;
        String str4 = mVar2.f85069d;
        String str5 = mVar2.f85070e;
        l lVar = this.f85144c;
        k kVar = lVar.f85061c;
        boolean z14 = lVar.f85062d;
        v.c(null, this.f85142a, str, str2, str3, str4, str5, kVar, z14, true, true, false, mVar, C.ENCODING_PCM_32BIT, 54, 1);
        return Unit.INSTANCE;
    }
}
