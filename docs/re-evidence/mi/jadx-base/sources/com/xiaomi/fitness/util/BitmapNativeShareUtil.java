package com.xiaomi.fitness.util;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.xiaomi.fitness.ShareUtil;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import defpackage.im9;
import defpackage.j1j;
import java.io.File;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/util/BitmapNativeShareUtil;", "", "<init>", "()V", "TAG", "", "shareBitmapViaMore", "", LifecycleConstantKt.TYPE_ACTIVITY, "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "bitmap", "Landroid/graphics/Bitmap;", "grantPermission", "path", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BitmapNativeShareUtil {

    @NotNull
    public static final BitmapNativeShareUtil INSTANCE = new BitmapNativeShareUtil();

    @NotNull
    public static final String TAG = "BitmapNativeShareUtil";

    private BitmapNativeShareUtil() {
    }

    private final String grantPermission(String path) {
        Application app = AppUtil.getApp();
        Uri uriForFile = FileProvider.getUriForFile(app, im9.B(), new File(path));
        app.grantUriPermission(ApplicationExtKt.getApplication().getPackageName(), uriForFile, 1);
        String string = uriForFile.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final void shareBitmapViaMore(@NotNull WeakReference<Activity> activity, @NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setFlags(1);
        Uri uriSaveImageToTmp = ShareUtil.INSTANCE.saveImageToTmp(bitmap);
        if ((uriSaveImageToTmp != null ? uriSaveImageToTmp.getPath() : null) == null) {
            Logger.i(TAG, "shareBitmapViaMore filePrefixUri?.path == null");
            return;
        }
        String path = uriSaveImageToTmp.getPath();
        Intrinsics.checkNotNull(path);
        String strGrantPermission = grantPermission(path);
        try {
            intent.putExtra("android.intent.extra.STREAM", Uri.parse(strGrantPermission));
            intent.setType("image/*");
            Activity activity2 = activity.get();
            Intrinsics.checkNotNull(activity2);
            activity2.startActivity(Intent.createChooser(intent, ResourceExtKt.getString(j1j.k2)));
        } catch (Exception unused) {
            Logger.i(TAG, "parse failed. pathResult=" + strGrantPermission);
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), j1j.common_not_support);
        }
    }
}
