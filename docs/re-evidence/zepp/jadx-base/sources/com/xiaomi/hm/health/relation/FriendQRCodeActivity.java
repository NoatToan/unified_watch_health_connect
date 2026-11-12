package com.xiaomi.hm.health.relation;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import com.huami.android.zxing.CaptureActivity;
import com.huami.lib.qrcode.QRCodeActivity;
import com.huami.lib.qrcode.gallery.QRCodeGalleryActivity;
import com.huami.utils.easypermission.EasyPermissions;
import com.huami.utils.easypermission.PermissionDialogFragmentCompat;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016R\u0016\u0010\u000e\u001a\u00020\t8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/relation/FriendQRCodeActivity;", "Lcom/huami/lib/qrcode/QRCodeActivity;", "", "shouldShowGalleryEntryPoint", "", "showPermissionDescriptionDialog", "", "requestCode", "", "", "perms", "onPermissionsDenied", "h", "Ljava/lang/String;", "REQUEST_KEY_PHOTO", "<init>", "()V", "relatives_release"}, k = 1, mv = {1, 5, 1})
@SuppressLint({"RestrictedApi"})
public final class FriendQRCodeActivity extends QRCodeActivity {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final String REQUEST_KEY_PHOTO = CaptureActivity.REQUEST_KEY_PHOTO;

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.lib.qrcode.QRCodeActivity
    public void onPermissionsDenied(int requestCode, @NonNull @NotNull List<String> perms) {
        if (EasyPermissions.somePermissionPermanentlyDenied(this, perms)) {
            new PermissionDialogFragmentCompat.Builder().setMessage(getString(R.string.relatives_qrcode_photo_permission_text)).setRequestKey(this.REQUEST_KEY_PHOTO).create().show(getSupportFragmentManager(), "");
        }
    }

    @Override // com.huami.lib.qrcode.QRCodeActivity
    public boolean shouldShowGalleryEntryPoint() {
        return true;
    }

    @Override // com.huami.lib.qrcode.QRCodeActivity
    public void showPermissionDescriptionDialog() {
        EasyPermissions.requestPermissions(this, getString(R.string.relatives_qrcode_photo_permission_text), QRCodeGalleryActivity.REQUEST_PERMISSION_CODE_STORAGE, this.REQUEST_KEY_PHOTO, "android.permission.WRITE_EXTERNAL_STORAGE");
    }
}
