package cp2;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.core.view.s;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.ui.addcard.fragment.FitPayAddressManagementFragment;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcp2/d;", "Landroidx/core/view/s;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FitPayAddressManagementFragment f54927a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f54928a;

        static {
            int[] iArr = new int[fo2.j.values().length];
            try {
                iArr[fo2.j.EMPTY_MODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fo2.j.SELECT_MODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fo2.j.EDIT_MODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f54928a = iArr;
        }
    }

    public d(FitPayAddressManagementFragment fitPayAddressManagementFragment) {
        this.f54927a = fitPayAddressManagementFragment;
    }

    @Override // androidx.core.view.s
    public final void Y3(Menu menu, MenuInflater menuInflater) {
        menu.getClass();
        menuInflater.getClass();
        FitPayAddressManagementFragment fitPayAddressManagementFragment = this.f54927a;
        fo2.j jVar = fitPayAddressManagementFragment.f51432r;
        int i14 = fitPayAddressManagementFragment.f51431q;
        int i15 = fitPayAddressManagementFragment.f51430p;
        int i16 = a.f54928a[jVar.ordinal()];
        if (i16 == 1) {
            menu.removeItem(i14);
            menu.removeItem(i15);
            return;
        }
        if (i16 == 2) {
            MenuItem menuItemAdd = menu.add(0, i14, 0, R.string.lbl_edit);
            if (menuItemAdd != null) {
                menuItemAdd.setShowAsActionFlags(2);
                return;
            }
            return;
        }
        if (i16 != 3) {
            u0.r();
            return;
        }
        MenuItem menuItemAdd2 = menu.add(0, i15, 0, R.string.lbl_done);
        if (menuItemAdd2 != null) {
            menuItemAdd2.setShowAsActionFlags(2);
        }
    }

    @Override // androidx.core.view.s
    @SuppressLint({"NotifyDataSetChanged"})
    public final boolean w5(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        FitPayAddressManagementFragment fitPayAddressManagementFragment = this.f54927a;
        if (itemId == fitPayAddressManagementFragment.f51431q) {
            fitPayAddressManagementFragment.f51432r = fo2.j.EDIT_MODE;
            fitPayAddressManagementFragment.G6();
            fitPayAddressManagementFragment.w6(false);
            return true;
        }
        if (itemId != fitPayAddressManagementFragment.f51430p) {
            return false;
        }
        fitPayAddressManagementFragment.f51432r = fo2.j.SELECT_MODE;
        fitPayAddressManagementFragment.G6();
        fp2.c cVar = fp2.c.f73188a;
        if (fitPayAddressManagementFragment.f51424j == null) {
            p005kotlin.jvm.internal.s.m("fitPayAddressListAdapter");
            throw null;
        }
        List<fj2.a> list = bp2.c.f19440g;
        cVar.getClass();
        fitPayAddressManagementFragment.w6(fp2.c.a(list) != null);
        return true;
    }
}
