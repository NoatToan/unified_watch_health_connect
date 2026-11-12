package tr2;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.ui.userwallet.PaymentCardDetailsFragment;
import java.util.Arrays;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltr2/r;", "Landroidx/core/view/s;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r implements androidx.core.view.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PaymentCardDetailsFragment f166169a;

    public r(PaymentCardDetailsFragment paymentCardDetailsFragment) {
        this.f166169a = paymentCardDetailsFragment;
    }

    @Override // androidx.core.view.s
    public final void Y3(Menu menu, MenuInflater menuInflater) {
        zl.a.f(menu, menuInflater, R.menu.menu_card_details, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_remove_card);
        PaymentCardDetailsFragment paymentCardDetailsFragment = this.f166169a;
        paymentCardDetailsFragment.f52193d = menuItemFindItem;
        if (menuItemFindItem != null) {
            paymentCardDetailsFragment.y6().getClass();
            menuItemFindItem.setVisible(false);
        }
    }

    @Override // androidx.core.view.s
    @SuppressLint({"NotifyDataSetChanged"})
    public final boolean w5(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_remove_card) {
            return false;
        }
        Logger logger = PaymentCardDetailsFragment.f52189m;
        PaymentCardDetailsFragment paymentCardDetailsFragment = this.f166169a;
        paymentCardDetailsFragment.getClass();
        PaymentCardDetailsFragment.f52189m.debug("showUserForRemoveCardDialog");
        br2.c cVar = br2.c.f19585a;
        hn2.c cVarU6 = paymentCardDetailsFragment.u6();
        String string = paymentCardDetailsFragment.getString(R.string.wallet_remove_card);
        string.getClass();
        x0 x0Var = x0.f105818a;
        String string2 = paymentCardDetailsFragment.getString(R.string.this_will_remove_your_card);
        string2.getClass();
        vr2.q qVar = paymentCardDetailsFragment.f52198i;
        if (qVar == null) {
            p005kotlin.jvm.internal.s.m("userWalletCardItemModel");
            throw null;
        }
        androidx.appcompat.app.e eVarQ = br2.c.q(cVar, cVarU6, string, String.format(string2, Arrays.copyOf(new Object[]{qVar.f179654a}, 1)), new o13.p(paymentCardDetailsFragment.getString(R.string.lbl_remove), new o(paymentCardDetailsFragment, 0)), new o13.p(paymentCardDetailsFragment.getString(R.string.lbl_cancel), new e(3)), null, false, 224);
        if (eVarQ != null) {
            eVarQ.show();
        }
        return true;
    }
}
