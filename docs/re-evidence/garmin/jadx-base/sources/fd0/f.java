package fd0;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.core.view.s;
import androidx.fragment.app.m;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.targetedselection.k;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfd0/f;", "Landroidx/core/view/s;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f70471a;

    public f(k kVar) {
        this.f70471a = kVar;
    }

    @Override // androidx.core.view.s
    public final void Y3(Menu menu, MenuInflater menuInflater) {
        zl.a.f(menu, menuInflater, R.menu.targeted_device_selection, menu);
    }

    @Override // androidx.core.view.s
    public final void Z4(Menu menu) {
        MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_done);
        if (menuItemFindItem != null) {
            menuItemFindItem.setEnabled(this.f70471a.f34609j);
        }
    }

    @Override // androidx.core.view.s
    public final boolean w5(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        k kVar = this.f70471a;
        if (itemId == R.id.menu_item_done) {
            kVar.z6().z4(kVar.w6(), kVar.f34576c, kVar.f34578e);
            return true;
        }
        k.a aVar = k.f34608l;
        m mVarRequireActivity = kVar.requireActivity();
        Intent intent = new Intent();
        intent.putExtra("extra_start_workout", false);
        Unit unit = Unit.INSTANCE;
        mVarRequireActivity.setResult(0, intent);
        mVarRequireActivity.finish();
        return true;
    }
}
