package pr2;

import android.content.DialogInterface;
import com.garmin.feature.garminpay.ui.passcode.PasscodeEntryActivity;
import e23.p;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import ps2.n;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PasscodeEntryActivity f139640b;

    public /* synthetic */ b(PasscodeEntryActivity passcodeEntryActivity, int i14) {
        this.f139639a = i14;
        this.f139640b = passcodeEntryActivity;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f139639a;
        PasscodeEntryActivity passcodeEntryActivity = this.f139640b;
        DialogInterface dialogInterface = (DialogInterface) obj;
        ((Integer) obj2).getClass();
        PasscodeEntryActivity.a aVar = PasscodeEntryActivity.f52121n;
        switch (i14) {
            case 0:
                dialogInterface.getClass();
                passcodeEntryActivity.fa(0);
                dialogInterface.dismiss();
                qr2.d dVar = passcodeEntryActivity.f52126j;
                if (dVar == null) {
                    s.m("passcodeViewModel");
                    throw null;
                }
                if (dVar.f146946k.d() == qr2.d.c.LOCKED_WALLET) {
                    passcodeEntryActivity.finish();
                }
                return Unit.INSTANCE;
            case 1:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                qr2.d dVar2 = passcodeEntryActivity.f52126j;
                if (dVar2 == null) {
                    s.m("passcodeViewModel");
                    throw null;
                }
                dVar2.f146947l.m(Boolean.TRUE);
                qr2.d.f146935v.debug("Attempting reset wallet");
                n nVar = dVar2.f146940e;
                if (nVar != null) {
                    nVar.n().k(l13.a.f108327b).h(r03.a.a()).i(new ps2.d(new qr2.c(dVar2, 0), 18), new qr2.b(dVar2, 1));
                }
                return Unit.INSTANCE;
            case 2:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                passcodeEntryActivity.fa(0);
                passcodeEntryActivity.finish();
                return Unit.INSTANCE;
            case 3:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                passcodeEntryActivity.da();
                return Unit.INSTANCE;
            case 4:
                dialogInterface.getClass();
                qr2.d dVar3 = passcodeEntryActivity.f52126j;
                if (dVar3 == null) {
                    s.m("passcodeViewModel");
                    throw null;
                }
                qr2.d.c cVar = qr2.d.c.LOCKED_WALLET;
                cVar.getClass();
                dVar3.A4(cVar, null);
                if (dVar3.f146946k.d() == cVar) {
                    dVar3.f146944i = true;
                }
                dialogInterface.dismiss();
                return Unit.INSTANCE;
            default:
                dialogInterface.getClass();
                dialogInterface.dismiss();
                qr2.d dVar4 = passcodeEntryActivity.f52126j;
                if (dVar4 == null) {
                    s.m("passcodeViewModel");
                    throw null;
                }
                qr2.d.c cVar2 = qr2.d.c.CREATE_NEW_PASSCODE;
                cVar2.getClass();
                dVar4.A4(cVar2, null);
                if (dVar4.f146946k.d() == qr2.d.c.LOCKED_WALLET) {
                    dVar4.f146944i = true;
                }
                return Unit.INSTANCE;
        }
    }
}
