package ro1;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.social.share.UCropImageActivity;
import com.yalantis.ucrop.view.GestureCropImageView;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lro1/r0;", "Landroidx/core/view/s;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r0 implements androidx.core.view.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UCropImageActivity f154001a;

    public r0(UCropImageActivity uCropImageActivity) {
        this.f154001a = uCropImageActivity;
    }

    @Override // androidx.core.view.s
    public final void Y3(Menu menu, MenuInflater menuInflater) {
        zl.a.f(menu, menuInflater, R.menu.share_image_crop, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.crop_image_menu_rotate_left);
        menuItemFindItem.getClass();
        UCropImageActivity uCropImageActivity = this.f154001a;
        uCropImageActivity.f44634k = menuItemFindItem;
        Drawable icon = menuItemFindItem.getIcon();
        if (icon != null) {
            icon.setTintList(ColorStateList.valueOf(a7.b.getColor(uCropImageActivity, R.color.gcm_icon_primary)));
        }
        MenuItem menuItem = uCropImageActivity.f44634k;
        if (menuItem == null) {
            p005kotlin.jvm.internal.s.m("rotateImageMenuItem");
            throw null;
        }
        menuItem.setIcon(icon);
        MenuItem menuItem2 = uCropImageActivity.f44634k;
        if (menuItem2 == null) {
            p005kotlin.jvm.internal.s.m("rotateImageMenuItem");
            throw null;
        }
        menuItem2.setVisible(true);
        MenuItem menuItemFindItem2 = menu.findItem(R.id.menu_item_next);
        menuItemFindItem2.getClass();
        uCropImageActivity.f44635l = menuItemFindItem2;
    }

    @Override // androidx.core.view.s
    public final boolean w5(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        UCropImageActivity uCropImageActivity = this.f154001a;
        if (itemId == R.id.menu_item_next) {
            uCropImageActivity.showProgressOverlay();
            MenuItem menuItem2 = uCropImageActivity.f44634k;
            if (menuItem2 == null) {
                p005kotlin.jvm.internal.s.m("rotateImageMenuItem");
                throw null;
            }
            menuItem2.setEnabled(false);
            MenuItem menuItem3 = uCropImageActivity.f44635l;
            if (menuItem3 == null) {
                p005kotlin.jvm.internal.s.m("nextMenuItem");
                throw null;
            }
            menuItem3.setEnabled(false);
            GestureCropImageView gestureCropImageView = uCropImageActivity.f44625b;
            if (gestureCropImageView != null) {
                gestureCropImageView.cropAndSaveImage(Bitmap.CompressFormat.PNG, 100, new q0(uCropImageActivity));
                return true;
            }
        } else {
            if (itemId != R.id.crop_image_menu_rotate_left) {
                return false;
            }
            GestureCropImageView gestureCropImageView2 = uCropImageActivity.f44625b;
            if (gestureCropImageView2 != null) {
                gestureCropImageView2.postRotate(-90.0f);
            }
        }
        return true;
    }
}
