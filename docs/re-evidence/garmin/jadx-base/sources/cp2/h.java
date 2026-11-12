package cp2;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.core.view.s;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcp2/h;", "Landroidx/core/view/s;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f54961a;

    public h(g gVar) {
        this.f54961a = gVar;
    }

    @Override // androidx.core.view.s
    public final void M1(Menu menu) {
        int size = menu.size();
        for (int i14 = 0; i14 < size; i14++) {
            menu.removeItem(menu.getItem(i14).getItemId());
        }
    }

    @Override // androidx.core.view.s
    public final void Y3(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        menu.removeItem(2);
        menu.removeItem(1);
        MenuItem menuItemAdd = menu.add(0, 3, 0, R.string.add_card_button);
        if (menuItemAdd != null) {
            menuItemAdd.setIcon(R.drawable.ic_plus_light);
            menuItemAdd.setShowAsActionFlags(2);
        }
    }

    @Override // androidx.core.view.s
    @SuppressLint({"NotifyDataSetChanged"})
    public final boolean w5(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 3) {
            return false;
        }
        yq2.a aVar = this.f54961a.f54956b;
        if (aVar != null) {
            aVar.a0();
            return true;
        }
        p005kotlin.jvm.internal.s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        throw null;
    }
}
