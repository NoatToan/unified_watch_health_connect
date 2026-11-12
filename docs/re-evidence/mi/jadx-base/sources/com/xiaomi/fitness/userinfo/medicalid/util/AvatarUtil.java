package com.xiaomi.fitness.userinfo.medicalid.util;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import androidx.core.content.FileProvider;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.sport_eco.SportConstants;
import defpackage.im9;
import defpackage.o1j;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0002\u0010\tJ\u0011\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fJ\u0006\u0010\u0017\u001a\u00020\u0012J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\fJ\u000e\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\fJ\b\u0010\u001f\u001a\u00020\u0012H\u0002J\u0006\u0010 \u001a\u00020\u0012J\n\u0010!\u001a\u0004\u0018\u00010\u0012H\u0002J \u0010\"\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0014J\u0018\u0010%\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u0005H\u0002J\u0016\u0010'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020*R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/userinfo/medicalid/util/AvatarUtil;", "", "<init>", "()V", "AID_AVATAR_DIR_NAME", "", "TAG", "getCameraNecessaryPerm", "", "()[Ljava/lang/String;", "getCameraNecessaryPermDesc", "addPhotoTakenAndGetUri", "Landroid/net/Uri;", SportConstants.KEY_TIMESTAMP, "", "addCroppedAvatarFileAndGetUri", "addImgToMediaStoreMedicalIdAvatarDirAndGetUri", "getPersistentCroppedAvatarDir", "Ljava/io/File;", "deletePersistentCroppedAvatar", "", "copyCroppedAvatarToPersistentLocation", "sourceUri", "addFirstAidPersistentCroppedAvatarFileAndGetFile", "deleteImgFromMediaStore", "", "imageUri", "getExternalCameraTempAvatarUri", "context", "Landroid/content/Context;", "getExternalCameraTempAvatarUriBelowQ", "getExternalCameraTempAvatarFile", "getExternalCropTempAvatarFile", "getMedicalIdExternalFile", "getAvatar", "fileKey", "useCamera", "getAvatarFile", "fileName", "isGalleryInstalled", "packageName", "packageManager", "Landroid/content/pm/PackageManager;", "user-info_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAvatarUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AvatarUtil.kt\ncom/xiaomi/fitness/userinfo/medicalid/util/AvatarUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,264:1\n1#2:265\n*E\n"})
public final class AvatarUtil {

    @NotNull
    public static final String TAG = "AvatarUtil";

    @NotNull
    public static final AvatarUtil INSTANCE = new AvatarUtil();

    @NotNull
    private static final String AID_AVATAR_DIR_NAME = "Pictures" + File.separator + "FirstAid";

    private AvatarUtil() {
    }

    private final Uri addImgToMediaStoreMedicalIdAvatarDirAndGetUri(long timeStamp) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", timeStamp + ".jpeg");
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("relative_path", Environment.DIRECTORY_DCIM + File.separator + "MedicalId");
        }
        return im9.N() ? ApplicationExtKt.getApplication().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues) : ApplicationExtKt.getApplication().getContentResolver().insert(MediaStore.Images.Media.INTERNAL_CONTENT_URI, contentValues);
    }

    private final File getAvatarFile(Context context, String fileName) {
        return FileUtils.INSTANCE.createFileInFilesPath(context, AID_AVATAR_DIR_NAME, fileName);
    }

    private final File getExternalCameraTempAvatarFile() {
        return new File(getMedicalIdExternalFile(), "aid_temp_camera_avatar.jpg");
    }

    private final File getMedicalIdExternalFile() {
        if (Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        File externalFilesDir = ApplicationExtKt.getApplication().getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        if ((externalFilesDir != null && externalFilesDir.exists()) || externalFilesDir == null) {
            return externalFilesDir;
        }
        externalFilesDir.mkdirs();
        return externalFilesDir;
    }

    private final File getPersistentCroppedAvatarDir() {
        File externalFilesDir = ApplicationExtKt.getApplication().getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        Intrinsics.checkNotNull(externalFilesDir);
        if (!externalFilesDir.exists()) {
            externalFilesDir.mkdirs();
        }
        File file = new File(externalFilesDir, "FirstAidImage");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    @Nullable
    public final Uri addCroppedAvatarFileAndGetUri(long timeStamp) {
        return addImgToMediaStoreMedicalIdAvatarDirAndGetUri(timeStamp);
    }

    @NotNull
    public final File addFirstAidPersistentCroppedAvatarFileAndGetFile() {
        return new File(getPersistentCroppedAvatarDir(), "avatar.jpeg");
    }

    @Nullable
    public final Uri addPhotoTakenAndGetUri(long timeStamp) {
        return addImgToMediaStoreMedicalIdAvatarDirAndGetUri(timeStamp);
    }

    public final boolean copyCroppedAvatarToPersistentLocation(@NotNull Uri sourceUri) {
        Intrinsics.checkNotNullParameter(sourceUri, "sourceUri");
        File file = new File(getPersistentCroppedAvatarDir(), "avatar.jpeg");
        try {
            InputStream inputStreamOpenInputStream = ApplicationExtKt.getApplication().getContentResolver().openInputStream(sourceUri);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        Intrinsics.checkNotNull(inputStreamOpenInputStream);
                        int i = inputStreamOpenInputStream.read(bArr);
                        if (i == -1) {
                            fileOutputStream.flush();
                            CloseableKt.closeFinally(fileOutputStream, null);
                            CloseableKt.closeFinally(inputStreamOpenInputStream, null);
                            return true;
                        }
                        fileOutputStream.write(bArr, 0, i);
                        try {
                            throw th;
                        } catch (Throwable th) {
                            CloseableKt.closeFinally(inputStreamOpenInputStream, th);
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(fileOutputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        } catch (Exception e) {
            Logger.i(TAG, "copyCroppedAvatarToPersistentLocation ERROR MESSAGE=" + e.getMessage());
            return false;
        }
    }

    public final int deleteImgFromMediaStore(long timeStamp, @NotNull Uri imageUri) {
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        String str = timeStamp + ".jpeg";
        String[] strArr = {str};
        Logger.d(TAG, "deleteImgFromMediaStore selection=_display_name = ?");
        Logger.d(TAG, "deleteImgFromMediaStore fileName=" + str);
        Logger.d(TAG, "deleteImgFromMediaStore selectionArgs=" + strArr);
        int iDelete = 0;
        try {
            iDelete = ApplicationExtKt.getApplication().getContentResolver().delete(imageUri, "_display_name = ?", strArr);
            Logger.d(TAG, "deleteImgFromMediaStore succeeded. rowsDeleted=" + iDelete);
            return iDelete;
        } catch (Exception e) {
            Logger.d(TAG, "deleteImgFromMediaStore failed. Error message=" + e.getMessage());
            return iDelete;
        }
    }

    public final boolean deletePersistentCroppedAvatar() {
        File file = new File(getPersistentCroppedAvatarDir(), "avatar.jpeg");
        try {
            if (file.exists()) {
                return file.delete();
            }
            return true;
        } catch (Exception e) {
            Logger.d(TAG, "deletePersistentCroppedAvatar failed. Error message=" + e.getMessage());
            return false;
        }
    }

    @Nullable
    public final File getAvatar(@NotNull Context context, @NotNull String fileKey, boolean useCamera) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileKey, "fileKey");
        File externalCropTempAvatarFile = getExternalCropTempAvatarFile();
        File file = null;
        try {
            try {
                if (externalCropTempAvatarFile.exists()) {
                    File avatarFile = getAvatarFile(context, fileKey + ".jpg");
                    if (FileUtils.INSTANCE.copyFile(externalCropTempAvatarFile, avatarFile)) {
                        file = avatarFile;
                    }
                }
                return file;
            } catch (Exception e) {
                Logger.d(TAG, "getAvatar failed. fileKey=" + fileKey + " userCamera=" + useCamera + " error message=" + e.getMessage());
                return null;
            }
        } finally {
            externalCropTempAvatarFile.delete();
            if (useCamera) {
                File externalCameraTempAvatarFile = getExternalCameraTempAvatarFile();
                if (externalCameraTempAvatarFile.exists()) {
                    externalCameraTempAvatarFile.delete();
                }
            }
        }
    }

    @NotNull
    public final String[] getCameraNecessaryPerm() {
        return Build.VERSION.SDK_INT < 29 ? new String[]{"android.permission.CAMERA"} : new String[]{"android.permission.CAMERA"};
    }

    @NotNull
    public final String[] getCameraNecessaryPermDesc() {
        return Build.VERSION.SDK_INT < 29 ? new String[]{ResourceExtKt.getString(o1j.i), ResourceExtKt.getString(o1j.g)} : new String[]{ResourceExtKt.getString(o1j.g)};
    }

    @NotNull
    public final Uri getExternalCameraTempAvatarUri(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Uri uriForFile = FileProvider.getUriForFile(context, im9.B(), getExternalCameraTempAvatarFile());
        Intrinsics.checkNotNullExpressionValue(uriForFile, "getUriForFile(...)");
        return uriForFile;
    }

    @NotNull
    public final Uri getExternalCameraTempAvatarUriBelowQ() {
        Uri uriForFile = FileProvider.getUriForFile(ApplicationExtKt.getApplication(), im9.B(), getExternalCameraTempAvatarFile());
        Intrinsics.checkNotNull(uriForFile);
        return uriForFile;
    }

    @NotNull
    public final File getExternalCropTempAvatarFile() {
        return new File(getMedicalIdExternalFile(), "aid_temp_crop_avatar.jpg");
    }

    public final boolean isGalleryInstalled(@NotNull String packageName, @NotNull PackageManager packageManager) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        try {
            packageManager.getPackageInfo(packageName, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
