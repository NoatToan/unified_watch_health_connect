package tn2;

import android.util.Base64;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class g0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f165561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f165562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f165563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f165564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.l f165565f;

    public /* synthetic */ g0(int i14, e23.l lVar, String str, String str2, String str3, r0 r0Var) {
        this.f165560a = i14;
        this.f165561b = r0Var;
        this.f165562c = str;
        this.f165563d = str2;
        this.f165564e = str3;
        this.f165565f = lVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f165560a;
        r0 r0Var = this.f165561b;
        String str = this.f165563d;
        String str2 = this.f165562c;
        switch (i14) {
            case 0:
                r0.b bVar = (r0.b) obj;
                Logger logger = r0.f165631n;
                bVar.getClass();
                String str3 = bVar.f165645a;
                String str4 = bVar.f165646b;
                pn2.n nVar = r0Var.f165637f;
                nVar.getClass();
                qn2.t tVarB = nVar.b(str2, str, str4);
                r0Var.f165638g.getClass();
                pn2.m<qn2.t, rn2.e> mVar = new pn2.m<>(tVarB, new rn2.e(str3));
                mn2.b bVar2 = r0Var.f165633b;
                String strValueOf = String.valueOf(r0Var.f165632a.f165682c);
                pn2.a.f138690a.getClass();
                String str5 = pn2.a.e().f138762b;
                Logger logger2 = mn2.j.f119822a;
                bVar2.getClass();
                strValueOf.getClass();
                str5.getClass();
                e23.l lVar = this.f165565f;
                lVar.getClass();
                String str6 = this.f165564e;
                q03.r<c83.a0<pn2.p<rn2.r>>> rVarL = bVar2.l(strValueOf, str6, str5, mVar);
                lp2.h hVar = new lp2.h(new mn2.d(lVar, bVar2, strValueOf, str6, str5, mVar, 0), 27);
                rVarL.getClass();
                int i15 = w03.b.f181178a;
                return new e13.j(rVarL, hVar);
            case 1:
                w.f fVar = (w.f) obj;
                Logger logger3 = r0.f165631n;
                fVar.getClass();
                f fVar2 = f.f165551a;
                byte[] bArr = fVar.f165719a;
                bArr.getClass();
                fVar2.getClass();
                String strA = f.a(bArr);
                Byte b14 = fVar.f165725g;
                b14.getClass();
                String strA2 = f.a(new byte[]{b14.byteValue()});
                byte[] bArr2 = fVar.f165723e;
                bArr2.getClass();
                String strA3 = f.a(bArr2);
                String strB = qn2.u.f145900a.b();
                r0 r0Var2 = this.f165561b;
                pn2.n nVar2 = r0Var2.f165637f;
                nVar2.getClass();
                qn2.t tVarB2 = nVar2.b(strB, strA2, null);
                pn2.o oVar = r0Var2.f165638g;
                byte[] bytes = this.f165564e.getBytes(d53.c.f57667c);
                bytes.getClass();
                String strEncodeToString = Base64.encodeToString(bytes, 2);
                strEncodeToString.getClass();
                oVar.getClass();
                str2.getClass();
                str.getClass();
                pn2.m<qn2.t, qn2.e> mVar2 = new pn2.m<>(tVarB2, new qn2.e(str2, new pn2.r(null, new pn2.j(str, new pn2.q(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, strEncodeToString)), null, null, null)));
                mn2.b bVar3 = r0Var2.f165633b;
                String strValueOf2 = String.valueOf(r0Var2.f165632a.f165682c);
                pn2.a.f138690a.getClass();
                String str7 = pn2.a.e().f138762b;
                Logger logger4 = mn2.j.f119822a;
                bVar3.getClass();
                strValueOf2.getClass();
                str7.getClass();
                e23.l lVar2 = this.f165565f;
                lVar2.getClass();
                q03.r<c83.a0<pn2.p<rn2.e>>> rVarG = bVar3.g(strValueOf2, strA, str7, mVar2);
                mn2.e eVar = new mn2.e(new mn2.d(lVar2, bVar3, strValueOf2, strA, str7, mVar2, 8), 19);
                rVarG.getClass();
                int i16 = w03.b.f181178a;
                return new e13.r(new e13.j(new e13.j(rVarG, eVar), new k0(new l0(r0Var2, strA3, strB, strA, strA2, lVar2, 0), 7)), new k0(new h0(r0Var2, str2, 4), 8));
            case 2:
                r0.b bVar4 = (r0.b) obj;
                Logger logger5 = r0.f165631n;
                bVar4.getClass();
                String str8 = bVar4.f165645a;
                String str9 = bVar4.f165646b;
                pn2.n nVar3 = r0Var.f165637f;
                nVar3.getClass();
                qn2.t tVarB3 = nVar3.b(str2, str, str9);
                r0Var.f165638g.getClass();
                pn2.m<qn2.t, rn2.e> mVar3 = new pn2.m<>(tVarB3, new rn2.e(str8));
                mn2.b bVar5 = r0Var.f165633b;
                String strValueOf3 = String.valueOf(r0Var.f165632a.f165682c);
                pn2.a.f138690a.getClass();
                String str10 = pn2.a.e().f138762b;
                Logger logger6 = mn2.j.f119822a;
                bVar5.getClass();
                strValueOf3.getClass();
                str10.getClass();
                String str11 = this.f165564e;
                q03.r<c83.a0<pn2.p<rn2.q>>> rVarS = bVar5.s(strValueOf3, str11, str10, mVar3);
                mn2.e eVar2 = new mn2.e(new mn2.d(this.f165565f, bVar5, strValueOf3, str11, str10, mVar3, 3), 0);
                rVarS.getClass();
                int i17 = w03.b.f181178a;
                return new e13.j(rVarS, eVar2);
            default:
                r0.b bVar6 = (r0.b) obj;
                Logger logger7 = r0.f165631n;
                bVar6.getClass();
                String str12 = bVar6.f165645a;
                qn2.t tVarB4 = r0Var.f165637f.b(str2, str, bVar6.f165646b);
                r0Var.f165638g.getClass();
                pn2.m<qn2.t, rn2.e> mVar4 = new pn2.m<>(tVarB4, new rn2.e(str12));
                mn2.b bVar7 = r0Var.f165633b;
                String strValueOf4 = String.valueOf(r0Var.f165632a.f165682c);
                pn2.a.f138690a.getClass();
                String str13 = pn2.a.e().f138762b;
                Logger logger8 = mn2.j.f119822a;
                bVar7.getClass();
                strValueOf4.getClass();
                str13.getClass();
                String str14 = this.f165564e;
                q03.r<c83.a0<pn2.p<rn2.r>>> rVarR = bVar7.r(strValueOf4, str14, str13, mVar4);
                mn2.e eVar3 = new mn2.e(new mn2.d(this.f165565f, bVar7, strValueOf4, str14, str13, mVar4, 5), 1);
                rVarR.getClass();
                int i18 = w03.b.f181178a;
                return new e13.j(rVarR, eVar3);
        }
    }
}
