package com.xiaomi.fitness.common.utils;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¨\u0006\u0003"}, d2 = {"convertToSafeUriAboveN", "Landroid/net/Uri;", "originalUri", "common_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UriExtKt {
    @SuppressLint({"QueryPermissionsNeeded"})
    @Nullable
    public static final Uri convertToSafeUriAboveN(@NotNull Uri originalUri) {
        Intrinsics.checkNotNullParameter(originalUri, "originalUri");
        String path = originalUri.getPath();
        if (path == null || StringsKt__StringsKt.isBlank(path)) {
            return null;
        }
        Intent intent = new Intent();
        Uri uriForFile = FileProvider.getUriForFile(ApplicationExtKt.getApplication(), ApplicationExtKt.getApplication().getPackageName() + ".fileProvider", new File(path));
        List<ResolveInfo> listQueryIntentActivities = ApplicationExtKt.getApplication().getPackageManager().queryIntentActivities(intent, 65536);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "queryIntentActivities(...)");
        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
        while (it.hasNext()) {
            ApplicationExtKt.getApplication().grantUriPermission(it.next().activityInfo.packageName, uriForFile, 3);
        }
        return uriForFile;
    }
}
