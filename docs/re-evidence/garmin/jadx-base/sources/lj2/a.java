package lj2;

import com.garmin.android.apps.connectmobile.R;
import f4.u;
import p005kotlin.Unit;
import p3.n1;
import p3.p1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nj2.a f113053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f113054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f113055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n1 f113056e;

    public /* synthetic */ a(u uVar, nj2.a aVar, n1 n1Var, p1 p1Var) {
        this.f113052a = 0;
        this.f113054c = uVar;
        this.f113053b = aVar;
        this.f113056e = n1Var;
        this.f113055d = p1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f113052a) {
            case 0:
                mj2.d.f119092a.getClass();
                u uVar = this.f113054c;
                int iA = mj2.d.a(uVar);
                nj2.a aVar = this.f113053b;
                n1 n1Var = this.f113056e;
                if (iA == 1) {
                    nj2.a.b bVar = nj2.a.b.ADDRESS_LINE_2;
                    uVar.put(bVar, Boolean.TRUE);
                    aVar.L4(bVar, true);
                    n1Var.t(R.string.cm_add_address_3_optional);
                } else if (iA == 2) {
                    nj2.a.b bVar2 = nj2.a.b.ADDRESS_LINE_3;
                    uVar.put(bVar2, Boolean.TRUE);
                    aVar.L4(bVar2, true);
                    n1Var.t(R.string.cm_add_address_4_optional);
                } else if (iA == 3) {
                    nj2.a.b bVar3 = nj2.a.b.ADDRESS_LINE_4;
                    uVar.put(bVar3, Boolean.TRUE);
                    aVar.L4(bVar3, true);
                    this.f113055d.setValue(Boolean.FALSE);
                }
                break;
            case 1:
                nj2.a.b bVar4 = nj2.a.b.ADDRESS_LINE_2;
                nj2.a aVar2 = this.f113053b;
                aVar2.y4(bVar4);
                this.f113055d.setValue(Boolean.TRUE);
                this.f113054c.put(bVar4, Boolean.FALSE);
                aVar2.L4(bVar4, false);
                this.f113056e.t(R.string.cm_add_address_2_optional);
                break;
            case 2:
                nj2.a.b bVar5 = nj2.a.b.ADDRESS_LINE_3;
                nj2.a aVar3 = this.f113053b;
                aVar3.y4(bVar5);
                this.f113055d.setValue(Boolean.TRUE);
                this.f113054c.put(bVar5, Boolean.FALSE);
                aVar3.L4(bVar5, false);
                this.f113056e.t(R.string.cm_add_address_3_optional);
                break;
            default:
                nj2.a.b bVar6 = nj2.a.b.ADDRESS_LINE_4;
                nj2.a aVar4 = this.f113053b;
                aVar4.y4(bVar6);
                this.f113055d.setValue(Boolean.TRUE);
                this.f113054c.put(bVar6, Boolean.FALSE);
                aVar4.L4(bVar6, false);
                this.f113056e.t(R.string.cm_add_address_4_optional);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ a(nj2.a aVar, u uVar, p1 p1Var, n1 n1Var, int i14) {
        this.f113052a = i14;
        this.f113053b = aVar;
        this.f113054c = uVar;
        this.f113055d = p1Var;
        this.f113056e = n1Var;
    }
}
