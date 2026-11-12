package ha1;

import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.core.view.s;
import com.garmin.android.apps.connectmobile.R;
import ew1.h1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lha1/b;", "Landroidx/core/view/s;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f82671a;

    public b(a aVar) {
        this.f82671a = aVar;
    }

    @Override // androidx.core.view.s
    public final void Y3(Menu menu, MenuInflater menuInflater) {
        zl.a.f(menu, menuInflater, R.menu.activity_image_gallery_menu, menu);
    }

    @Override // androidx.core.view.s
    public final void Z4(Menu menu) {
        Drawable icon;
        Drawable drawableMutate;
        a aVar = this.f82671a;
        if (!aVar.f82659a) {
            menu.removeGroup(R.id.menu_group_edit_only);
            return;
        }
        aVar.f82666h = menu.findItem(R.id.menu_item_reorder);
        aVar.f82664f = menu.findItem(R.id.menu_item_select);
        aVar.f82665g = menu.findItem(R.id.menu_item_delete);
        aVar.f82667i = menu.findItem(R.id.menu_item_save);
        int color = a7.b.getColor(aVar, R.color.gcm_icon_primary);
        MenuItem menuItem = aVar.f82665g;
        if (menuItem == null || (icon = menuItem.getIcon()) == null || (drawableMutate = icon.mutate()) == null) {
            return;
        }
        drawableMutate.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_ATOP));
    }

    @Override // androidx.core.view.s
    public final boolean w5(MenuItem menuItem) {
        menuItem.getClass();
        a aVar = this.f82671a;
        if (aVar.ea()) {
            int itemId = menuItem.getItemId();
            if (itemId == R.id.menu_item_reorder) {
                aVar.ia(true);
                aVar.f82663e = false;
                return true;
            }
            if (itemId == R.id.menu_item_select) {
                aVar.updateActionBar(aVar.getString(R.string.title_select_photos), 3);
                aVar.W2(true);
                aVar.I0(false);
                return true;
            }
            if (itemId == R.id.menu_item_delete) {
                new androidx.appcompat.app.e.a(aVar).setMessage(R.string.delete_selected_photos_message).setPositiveButton(R.string.lbl_delete, new h1(aVar, 12)).setNegativeButton(R.string.lbl_cancel, (DialogInterface.OnClickListener) null).create().show();
                return true;
            }
            if (itemId == R.id.menu_item_save) {
                aVar.f82662d = true;
                aVar.f82663e = true;
                aVar.ha();
                aVar.ia(false);
            }
        }
        return true;
    }
}
