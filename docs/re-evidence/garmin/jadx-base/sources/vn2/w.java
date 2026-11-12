package vn2;

import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.R;
import java.util.Arrays;
import org.slf4j.Logger;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class w implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f178961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0.e f178962c;

    public /* synthetic */ w(b0 b0Var, z0.e eVar, int i14) {
        this.f178960a = i14;
        this.f178961b = b0Var;
        this.f178962c = eVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f178960a;
        final int i15 = 2;
        final int i16 = 0;
        final b0 b0Var = this.f178961b;
        final z0.e eVar = this.f178962c;
        switch (i14) {
            case 0:
                androidx.appcompat.app.e.a aVar = (androidx.appcompat.app.e.a) obj;
                Logger logger = b0.f178864c;
                aVar.getClass();
                aVar.setTitle(R.string.wallet_remove_card);
                aVar.setMessage(w5.r.v(R.string.wallet_suica_message_remove_card, b0Var.f0().getDeviceName()));
                final int i17 = 1;
                aVar.setPositiveButton(R.string.lbl_remove, new DialogInterface.OnClickListener() { // from class: vn2.z
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i18) {
                        int i19 = i17;
                        z0.e eVar2 = eVar;
                        b0 b0Var2 = b0Var;
                        switch (i19) {
                            case 0:
                                Logger logger2 = b0.f178864c;
                                b0Var2.g0(eVar2);
                                break;
                            case 1:
                                Logger logger3 = b0.f178864c;
                                b0Var2.g0(eVar2);
                                break;
                            default:
                                Logger logger4 = b0.f178864c;
                                b0Var2.g0(eVar2);
                                break;
                        }
                    }
                });
                aVar.setNegativeButton(R.string.lbl_cancel, new ty1.o(27));
                aVar.setCancelable(false);
                break;
            case 1:
                androidx.appcompat.app.e.a aVar2 = (androidx.appcompat.app.e.a) obj;
                Logger logger2 = b0.f178864c;
                aVar2.getClass();
                aVar2.setTitle(R.string.wallet_remove_card);
                aVar2.setMessage(w5.r.v(R.string.wallet_suica_message_remove_card_without_refund, b0Var.f0().getDeviceName()));
                aVar2.setPositiveButton(R.string.lbl_remove, new DialogInterface.OnClickListener() { // from class: vn2.z
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i18) {
                        int i19 = i15;
                        z0.e eVar2 = eVar;
                        b0 b0Var2 = b0Var;
                        switch (i19) {
                            case 0:
                                Logger logger3 = b0.f178864c;
                                b0Var2.g0(eVar2);
                                break;
                            case 1:
                                Logger logger4 = b0.f178864c;
                                b0Var2.g0(eVar2);
                                break;
                            default:
                                Logger logger5 = b0.f178864c;
                                b0Var2.g0(eVar2);
                                break;
                        }
                    }
                });
                aVar2.setNegativeButton(R.string.lbl_cancel, new ty1.o(27));
                aVar2.setCancelable(false);
                break;
            case 2:
                androidx.appcompat.app.e.a aVar3 = (androidx.appcompat.app.e.a) obj;
                Logger logger3 = b0.f178864c;
                aVar3.getClass();
                aVar3.setTitle(R.string.wallet_remove_card);
                p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                aVar3.setMessage(String.format("%s\n%s", Arrays.copyOf(new Object[]{w5.r.v(R.string.wallet_suica_message_remove_card_with_refund, ((z0.e.b) eVar).f178980b), w5.r.v(R.string.wallet_suica_message_remove_card, b0Var.f0().getDeviceName())}, 2)));
                aVar3.setPositiveButton(R.string.lbl_remove, new DialogInterface.OnClickListener() { // from class: vn2.z
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i18) {
                        int i19 = i16;
                        z0.e eVar2 = eVar;
                        b0 b0Var2 = b0Var;
                        switch (i19) {
                            case 0:
                                Logger logger4 = b0.f178864c;
                                b0Var2.g0(eVar2);
                                break;
                            case 1:
                                Logger logger5 = b0.f178864c;
                                b0Var2.g0(eVar2);
                                break;
                            default:
                                Logger logger6 = b0.f178864c;
                                b0Var2.g0(eVar2);
                                break;
                        }
                    }
                });
                aVar3.setNeutralButton(R.string.wallet_garmin_account, new sa2.b(b0Var, 21));
                aVar3.setNegativeButton(R.string.lbl_cancel, new ty1.o(27));
                aVar3.setCancelable(false);
                break;
            default:
                z0.e eVar2 = (z0.e) obj;
                Logger logger4 = b0.f178864c;
                eVar2.getClass();
                eVar.getClass();
                if (eVar2.getClass().equals(eVar.getClass())) {
                    b0Var.f0().B(eVar2, new b0.c(b0Var)).k(l13.a.f108327b).h(r03.a.a()).i(new y(new t(b0Var, 26), 10), new v(b0Var, i15));
                } else {
                    b0Var.getView().i();
                    b0Var.getView().e();
                    b0Var.getView().hideProgressOverlay();
                    b0Var.i0(eVar2);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ w(z0.e eVar, b0 b0Var, int i14) {
        this.f178960a = i14;
        this.f178962c = eVar;
        this.f178961b = b0Var;
    }
}
