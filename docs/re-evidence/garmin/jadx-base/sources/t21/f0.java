package t21;

import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import l72.r1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class f0 implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f161863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l22.b f161864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j02.h0 f161865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f161866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u21.i f161867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.p f161868f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f161869g;

    public f0(List list, l22.b bVar, j02.h0 h0Var, e23.l lVar, u21.i iVar, e23.p pVar, float f14) {
        this.f161863a = list;
        this.f161864b = bVar;
        this.f161865c = h0Var;
        this.f161866d = lVar;
        this.f161867e = iVar;
        this.f161868f = pVar;
        this.f161869g = f14;
    }

    @Override // e23.r
    public final Unit invoke(e2.d dVar, Integer num, p3.m mVar, Integer num2) {
        int i14;
        e2.d dVar2 = dVar;
        int iIntValue = num.intValue();
        p3.m mVar2 = mVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i14 = (mVar2.B(dVar2) ? 4 : 2) | iIntValue2;
        } else {
            i14 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i14 |= mVar2.k(iIntValue) ? 32 : 16;
        }
        if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            s21.m mVar3 = (s21.m) this.f161863a.get(iIntValue);
            mVar2.C(614385109);
            if (mVar3 instanceof s21.m.b) {
                mVar2.C(614351070);
                r1.b(gl1.y.Q(mVar2, ((s21.m.b) mVar3).f156148b), null, mVar2, 0, 2);
                mVar2.f();
            } else {
                if (!(mVar3 instanceof s21.m.c)) {
                    throw n23.j.m(mVar2, -395823122);
                }
                mVar2.C(614583601);
                s21.n nVar = ((s21.m.c) mVar3).f156150b;
                String strQ = gl1.y.Q(mVar2, nVar.f156151a ? R.string.lbl_remove : R.string.lbl_add);
                String strQ2 = gl1.y.Q(mVar2, R.string.move_up);
                String strQ3 = gl1.y.Q(mVar2, R.string.move_down);
                b11.n.a aVar = b11.n.f14341e;
                String str = nVar.f156152b;
                String str2 = nVar.f156153c;
                if (str2 == null) {
                    str2 = "";
                }
                aVar.getClass();
                String strB = b11.n.a.b(str, str2, this.f161864b);
                b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
                c0235a.f16962a.put("onClickLabel", strQ);
                j02.d0.a(dVar2, this.f161865c, mVar3.f156147a, null, nVar.f156151a, null, z3.f.c(205103214, new b0(nVar, this.f161866d, mVar3, this.f161867e, this.f161868f, strQ, strQ2, strQ3, c0235a.b(), strB, this.f161869g), mVar2), mVar2, (i14 & 14) | 1572864, 20);
                mVar2.f();
            }
            mVar2.f();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
