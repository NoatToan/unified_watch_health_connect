package com.xiaomi.fitness.util;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import defpackage.im9;
import defpackage.j1j;
import java.io.File;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\u0005J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/util/FileNativeShareUtil;", "", "<init>", "()V", "TAG", "", "shareFileViaMore", "", LifecycleConstantKt.TYPE_ACTIVITY, "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "filePath", "grantPermission", "path", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FileNativeShareUtil {

    @NotNull
    public static final FileNativeShareUtil INSTANCE = new FileNativeShareUtil();

    @NotNull
    public static final String TAG = "FileNativeShareUtil";

    private FileNativeShareUtil() {
    }

    private final String grantPermission(String path) {
        Application app = AppUtil.getApp();
        Uri uriForFile = FileProvider.getUriForFile(app, im9.B(), new File(path));
        app.grantUriPermission(ApplicationExtKt.getApplication().getPackageName(), uriForFile, 1);
        String string = uriForFile.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final void shareFileViaMore(@NotNull WeakReference<Activity> activity, @NotNull String filePath) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setFlags(1);
        if (filePath.length() == 0 || !new File(filePath).isFile()) {
            Logger.i(TAG, "shareFileViaMore filePath is error");
            return;
        }
        String strGrantPermission = grantPermission(filePath);
        try {
            intent.putExtra("android.intent.extra.STREAM", Uri.parse(strGrantPermission));
            intent.setType(HTTP.PLAIN_TEXT_TYPE);
            Activity activity2 = activity.get();
            Intrinsics.checkNotNull(activity2);
            activity2.startActivity(Intent.createChooser(intent, ResourceExtKt.getString(j1j.k2)));
        } catch (Exception unused) {
            Logger.i(TAG, "parse failed. pathResult=" + strGrantPermission);
            ToastExtKt.toastShort(ApplicationExtKt.getApplication(), j1j.common_not_support);
        }
    }
}
