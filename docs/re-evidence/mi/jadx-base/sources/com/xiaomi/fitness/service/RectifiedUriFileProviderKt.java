package com.xiaomi.fitness.service;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.im9;
import defpackage.ni4;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\"\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"TAG", "", "SCHEMA", "NAME_DOWNLOAD", "needRectifyUriForFile", "", "context", "Landroid/content/Context;", "getRectifiedUriForFile", "Landroid/net/Uri;", PluginPackageConstant.PLUGIN_TYPE_APK, "Ljava/io/File;", "providerPath", "share_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RectifiedUriFileProviderKt {

    @NotNull
    public static final String NAME_DOWNLOAD = "Download";

    @NotNull
    private static final String SCHEMA = "content";

    @NotNull
    private static final String TAG = "RectifiedUriFileProvider";

    @Nullable
    public static final Uri getRectifiedUriForFile(@NotNull Context context, @NotNull File apk, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apk, "apk");
        String strB = im9.B();
        if (!needRectifyUriForFile(context)) {
            return FileProvider.getUriForFile(context, strB, apk);
        }
        File externalFilesDir = context.getExternalFilesDir(null);
        Intrinsics.checkNotNull(externalFilesDir);
        String path = externalFilesDir.getPath();
        String absolutePath = apk.getAbsolutePath();
        Intrinsics.checkNotNull(absolutePath);
        String strSubstring = absolutePath.substring(path.length() + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return new Uri.Builder().scheme("content").authority(strB).encodedPath(Uri.encode(str) + "/" + Uri.encode(strSubstring, "/")).build();
    }

    public static final boolean needRectifyUriForFile(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File[] fileArrG = ni4.g(context, null);
        Intrinsics.checkNotNullExpressionValue(fileArrG, "getExternalFilesDirs(...)");
        File externalFilesDir = context.getExternalFilesDir(null);
        return (externalFilesDir == null || Intrinsics.areEqual(fileArrG[0].getPath(), externalFilesDir.getPath())) ? false : true;
    }
}
