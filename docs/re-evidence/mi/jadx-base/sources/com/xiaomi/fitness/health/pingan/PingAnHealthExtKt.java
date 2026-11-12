package com.xiaomi.fitness.health.pingan;

import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Base64;
import androidx.fragment.app.FragmentActivity;
import com.fitness.permission.manager.export.IPermissionManager;
import com.fitness.permission.manager.export.PermissionExportExtKt;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.MarketUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.health.pingan.PingAnHealthExtKt;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.c0j;
import defpackage.im9;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a1\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\b0\f\u001a1\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\b0\f\u001a\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002\u001a\n\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002\u001aE\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00132!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\b0\fH\u0002\u001a\n\u0010\u0019\u001a\u0004\u0018\u00010\u0013H\u0002\u001a\u001e\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u001eH\u0002\u001a\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010 H\u0002¢\u0006\u0002\u0010!\u001a\b\u0010\"\u001a\u00020#H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"ACTION_CROP", "", "KEY_CROP", "KEY_RETURN_DATA", "MIUI_GALLERY_PACKAGE", "TYPE_IMAGES", "KEY_SCALE", "pickImageFromMediaAndPerformCallback", "", "baseActivity", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "base64Str", "takePhotoAndPerformCallback", "deleteImage", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "getCroppedImgUri", "cropImageAndPerformCallback", "cropIntent", "Landroid/content/Intent;", "croppedImgUri", "getPhotoUriTakenByCamera", "showSystemPermissionDeniedGuideWhenRetry", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "deniedPermissions", "", "getCameraNecessaryPermDesc", "", "()[Ljava/lang/String;", "checkCameraHardware", "", "health_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PingAnHealthExtKt {

    @NotNull
    private static final String ACTION_CROP = "com.android.camera.action.CROP";

    @NotNull
    private static final String KEY_CROP = "crop";

    @NotNull
    private static final String KEY_RETURN_DATA = "return-data";

    @NotNull
    private static final String KEY_SCALE = "scale";

    @NotNull
    private static final String MIUI_GALLERY_PACKAGE = "com.miui.gallery";

    @NotNull
    private static final String TYPE_IMAGES = "image/*";

    private static final boolean checkCameraHardware() {
        return ApplicationExtKt.getApplication().getPackageManager().hasSystemFeature("android.hardware.camera.any");
    }

    private static final void cropImageAndPerformCallback(Intent intent, final BaseActivity baseActivity, final Uri uri, final Function1<? super String, Unit> function1) {
        try {
            baseActivity.startForActivityResult(intent, new Function2() { // from class: uwh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PingAnHealthExtKt.cropImageAndPerformCallback$lambda$4(uri, baseActivity, function1, ((Integer) obj).intValue(), (Intent) obj2);
                }
            });
        } catch (Exception e) {
            Logger.i(PinganHealthCareWebViewActivity.TAG, "pickPhotoFromMediaStore exception=" + e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cropImageAndPerformCallback$lambda$4(Uri uri, BaseActivity baseActivity, Function1 callback, int i, Intent intent) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(baseActivity, "$baseActivity");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        boolean z = intent != null;
        Logger.i(PinganHealthCareWebViewActivity.TAG, "handleCroppedImage cropBackResultCode=" + i + " cropped=" + z);
        if (uri == null) {
            ToastExtKt.toastShort(baseActivity, c0j.common_load_fail);
        } else if (!z || i == 0) {
            Logger.i(PinganHealthCareWebViewActivity.TAG, "handleCroppedImage The user didn't crop any picture.");
        } else {
            Logger.i(PinganHealthCareWebViewActivity.TAG, "croppedImgUri=" + uri);
            InputStream inputStreamOpenInputStream = ApplicationExtKt.getApplication().getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                try {
                    String strEncodeToString = Base64.encodeToString(ByteStreamsKt.readBytes(inputStreamOpenInputStream), 0);
                    Intrinsics.checkNotNull(strEncodeToString);
                    callback.invoke2(strEncodeToString);
                    deleteImage(uri);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(inputStreamOpenInputStream, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(inputStreamOpenInputStream, th);
                        throw th2;
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    private static final void deleteImage(Uri uri) {
        try {
            Logger.i(PinganHealthCareWebViewActivity.TAG, "deleteImage succeeded. rowDeleted=" + ApplicationExtKt.getApplication().getContentResolver().delete(uri, null, null));
        } catch (Exception e) {
            Logger.i(PinganHealthCareWebViewActivity.TAG, "deleteImage failed. error=" + e);
        }
    }

    private static final String[] getCameraNecessaryPermDesc() {
        return Build.VERSION.SDK_INT < 29 ? new String[]{ResourceExtKt.getString(c0j.pq), ResourceExtKt.getString(c0j.nq)} : new String[]{ResourceExtKt.getString(c0j.nq)};
    }

    private static final Uri getCroppedImgUri() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", "cropped_image_" + System.currentTimeMillis() + ".jpeg");
        contentValues.put("relative_path", Environment.DIRECTORY_DCIM + File.separator + "PingAnHealthCare");
        return im9.N() ? ApplicationExtKt.getApplication().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues) : ApplicationExtKt.getApplication().getContentResolver().insert(MediaStore.Images.Media.INTERNAL_CONTENT_URI, contentValues);
    }

    private static final Uri getPhotoUriTakenByCamera() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", "photo_taken_" + System.currentTimeMillis() + ".jpeg");
        contentValues.put("relative_path", Environment.DIRECTORY_DCIM + File.separator + "PingAnHealthCare");
        return im9.N() ? ApplicationExtKt.getApplication().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues) : ApplicationExtKt.getApplication().getContentResolver().insert(MediaStore.Images.Media.INTERNAL_CONTENT_URI, contentValues);
    }

    public static final void pickImageFromMediaAndPerformCallback(@NotNull final BaseActivity baseActivity, @NotNull final Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(baseActivity, "baseActivity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intent data = new Intent(RomUtils.isXiaomi() ? "android.intent.action.PICK" : "android.intent.action.OPEN_DOCUMENT").setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        Intrinsics.checkNotNullExpressionValue(data, "setData(...)");
        final boolean z = RomUtils.isXiaomi() && MarketUtil.checkAppInstalled(baseActivity, MIUI_GALLERY_PACKAGE);
        if (z) {
            data.setPackage(MIUI_GALLERY_PACKAGE);
        }
        baseActivity.startForActivityResult(data, new Function2() { // from class: vwh
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PingAnHealthExtKt.pickImageFromMediaAndPerformCallback$lambda$1(z, baseActivity, callback, ((Integer) obj).intValue(), (Intent) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pickImageFromMediaAndPerformCallback$lambda$1(boolean z, BaseActivity baseActivity, Function1 callback, int i, Intent intent) {
        Uri data;
        Intrinsics.checkNotNullParameter(baseActivity, "$baseActivity");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        if (intent != null && (data = intent.getData()) != null) {
            Intent intent2 = new Intent(ACTION_CROP);
            intent2.setDataAndType(data, TYPE_IMAGES);
            intent2.addFlags(1);
            intent2.addFlags(2);
            intent2.putExtra(KEY_CROP, "true");
            intent2.putExtra(KEY_SCALE, true);
            intent2.putExtra(KEY_RETURN_DATA, false);
            Uri croppedImgUri = getCroppedImgUri();
            Logger.i(PinganHealthCareWebViewActivity.TAG, "croppedImgUri=" + croppedImgUri);
            intent2.putExtra("output", croppedImgUri);
            if (z) {
                intent2.setPackage(MIUI_GALLERY_PACKAGE);
            }
            cropImageAndPerformCallback(intent2, baseActivity, croppedImgUri, callback);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    private static final void showSystemPermissionDeniedGuideWhenRetry(final FragmentActivity fragmentActivity, final List<String> list) {
        IPermissionManager.DefaultImpls.showGuideSystemOpenPermissionWhenDeniedIfNeed$default(PermissionExportExtKt.getINSTANCE(IPermissionManager.INSTANCE), list.get(0), fragmentActivity, list, null, null, new Function0() { // from class: twh
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PingAnHealthExtKt.showSystemPermissionDeniedGuideWhenRetry$lambda$5(fragmentActivity, list);
            }
        }, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showSystemPermissionDeniedGuideWhenRetry$lambda$5(FragmentActivity fragmentActivity, List deniedPermissions) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "$fragmentActivity");
        Intrinsics.checkNotNullParameter(deniedPermissions, "$deniedPermissions");
        PermissionsUtil.INSTANCE.showSettingDialog(fragmentActivity, (String) deniedPermissions.get(0), false, null);
        return Unit.INSTANCE;
    }

    public static final void takePhotoAndPerformCallback(@NotNull final BaseActivity baseActivity, @NotNull final Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(baseActivity, "baseActivity");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        final Uri photoUriTakenByCamera = getPhotoUriTakenByCamera();
        intent.putExtra("output", photoUriTakenByCamera);
        baseActivity.startForActivityResult(intent, new Function2() { // from class: swh
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PingAnHealthExtKt.takePhotoAndPerformCallback$lambda$2(photoUriTakenByCamera, baseActivity, callback, ((Integer) obj).intValue(), (Intent) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit takePhotoAndPerformCallback$lambda$2(Uri uri, BaseActivity baseActivity, Function1 callback, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(baseActivity, "$baseActivity");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        if (intent != null) {
            return Unit.INSTANCE;
        }
        Uri croppedImgUri = getCroppedImgUri();
        Intent intentPutExtra = new Intent(ACTION_CROP).setDataAndType(uri, TYPE_IMAGES).addFlags(1).addFlags(2).putExtra(KEY_CROP, "true").putExtra(KEY_RETURN_DATA, false).putExtra("output", croppedImgUri);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        if (RomUtils.isXiaomi()) {
            intentPutExtra.setPackage(MIUI_GALLERY_PACKAGE);
        }
        cropImageAndPerformCallback(intentPutExtra, baseActivity, croppedImgUri, callback);
        return Unit.INSTANCE;
    }
}
