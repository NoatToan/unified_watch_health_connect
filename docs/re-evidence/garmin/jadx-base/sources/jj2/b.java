package jj2;

import android.content.DialogInterface;
import com.garmin.customermanagementlib.ui.CustomerManagementLibMainActivity;
import d4.l;
import e23.p;
import je0.o;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p1;
import p3.x1;
import x72.e;
import z3.f;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f98967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CustomerManagementLibMainActivity f98968b;

    public /* synthetic */ b(CustomerManagementLibMainActivity customerManagementLibMainActivity, int i14) {
        this.f98967a = i14;
        this.f98968b = customerManagementLibMainActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f98967a) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                CustomerManagementLibMainActivity.a aVar = CustomerManagementLibMainActivity.f50711h;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    Object[] objArr = new Object[0];
                    l lVar = x72.p.f189487a;
                    Object objQ = mVar.q();
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new o(6);
                        mVar.K(objQ);
                    }
                    p1 p1VarF = d4.a.f(objArr, lVar, (e23.a) objQ, mVar, 384);
                    CustomerManagementLibMainActivity customerManagementLibMainActivity = this.f98968b;
                    String stringExtra = customerManagementLibMainActivity.getIntent().getStringExtra("EXTRA_ROUTE");
                    if (stringExtra == null) {
                        stringExtra = "AddressesListRoute";
                    }
                    x72.a.a((e) p1VarF.getF182175a(), null, null, f.c(2015897425, new c(stringExtra, customerManagementLibMainActivity.getIntent().getStringExtra("EXTRA_APP_BAR_TITLE"), customerManagementLibMainActivity.getIntent().getStringExtra("EXTRA_ADDRESS_ID"), customerManagementLibMainActivity, 0), mVar), mVar, 3072);
                } else {
                    mVar.e();
                }
                break;
            default:
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                CustomerManagementLibMainActivity.a aVar2 = CustomerManagementLibMainActivity.f50711h;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                CustomerManagementLibMainActivity customerManagementLibMainActivity2 = this.f98968b;
                customerManagementLibMainActivity2.setResult(0);
                customerManagementLibMainActivity2.finish();
                break;
        }
        return Unit.INSTANCE;
    }
}
