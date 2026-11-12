package util;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import defpackage.im9;
import defpackage.r72;
import defpackage.yii;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nJ\b\u0010\b\u001a\u0004\u0018\u00010\u0005J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lutil/WechatFileUtil;", "", "<init>", "()V", "QR_DIR", "", "defaultHighColorId", "", "getQRDirPath", "externalStorage", "", "getMediaStoreImageUri", "Landroid/net/Uri;", "fileName", "dir", "showToastShort", "", "msg", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WechatFileUtil {

    @NotNull
    public static final String QR_DIR = "qr";

    @NotNull
    public static final WechatFileUtil INSTANCE = new WechatFileUtil();
    private static final int defaultHighColorId = yii.common_btn_normal_dark_bg_color;

    private WechatFileUtil() {
    }

    @Nullable
    public final Uri getMediaStoreImageUri(@Nullable String fileName, @NotNull String dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", fileName);
        if (Build.VERSION.SDK_INT >= 29) {
            String str = Environment.DIRECTORY_DCIM;
            String str2 = File.separator;
            contentValues.put("relative_path", str + str2 + "MiWatch" + str2 + dir);
        }
        return im9.N() ? ApplicationExtKt.getApplication().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues) : ApplicationExtKt.getApplication().getContentResolver().insert(MediaStore.Images.Media.INTERNAL_CONTENT_URI, contentValues);
    }

    @Nullable
    public final String getQRDirPath(boolean externalStorage) {
        return externalStorage ? im9.g(QR_DIR) : getQRDirPath();
    }

    public final void showToastShort(int msg) {
        ToastExtKt.toastShort(ApplicationExtKt.getApplication(), msg);
    }

    @Nullable
    public final String getQRDirPath() {
        return r72.f(QR_DIR);
    }
}
