package com.xiaomi.fitness.service;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.core.content.FileProvider;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.im9;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/service/RectifiedUriFileProvider;", "Landroidx/core/content/FileProvider;", "<init>", "()V", "sFileProviderMap", "Ljava/util/HashMap;", "", "openFile", "Landroid/os/ParcelFileDescriptor;", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "mode", "getSpecificPath", "path", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RectifiedUriFileProvider extends FileProvider {
    private HashMap<String, String> sFileProviderMap;

    private final String getSpecificPath(String path) {
        HashMap<String, String> map = null;
        if (this.sFileProviderMap == null) {
            this.sFileProviderMap = new HashMap<>();
            String str = "content://" + im9.B();
            HashMap<String, String> map2 = this.sFileProviderMap;
            if (map2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sFileProviderMap");
                map2 = null;
            }
            Context context = getContext();
            Intrinsics.checkNotNull(context);
            File externalFilesDir = context.getExternalFilesDir(null);
            Intrinsics.checkNotNull(externalFilesDir);
            map2.put(str + "/Download", externalFilesDir.getAbsolutePath());
        }
        HashMap<String, String> map3 = this.sFileProviderMap;
        if (map3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sFileProviderMap");
            map3 = null;
        }
        Iterator<Map.Entry<String, String>> it = map3.entrySet().iterator();
        String str2 = null;
        while (it.hasNext()) {
            String key = it.next().getKey();
            if (StringsKt__StringsJVMKt.startsWith$default(path, key, false, 2, null) && (str2 == null || key.length() > str2.length())) {
                str2 = key;
            }
        }
        if (str2 == null || str2.length() == 0) {
            return null;
        }
        HashMap<String, String> map4 = this.sFileProviderMap;
        if (map4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sFileProviderMap");
        } else {
            map = map4;
        }
        String str3 = map.get(str2);
        CharSequence charSequenceSubSequence = path.subSequence(str2.length(), path.length());
        StringBuilder sb = new StringBuilder();
        sb.append((Object) str3);
        sb.append((Object) charSequenceSubSequence);
        return sb.toString();
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    @Nullable
    public ParcelFileDescriptor openFile(@NotNull Uri uri, @NotNull String mode) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(mode, "mode");
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Logger.d("RectifiedUriFileProvider", "openFile: uriPath = " + string);
        Context context = getContext();
        Intrinsics.checkNotNull(context);
        if (!RectifiedUriFileProviderKt.needRectifyUriForFile(context) || string.length() <= 0) {
            return super.openFile(uri, mode);
        }
        String specificPath = getSpecificPath(string);
        if (specificPath == null || specificPath.length() == 0) {
            return super.openFile(uri, mode);
        }
        Logger.d("RectifiedUriFileProvider", "openFile: fullPath = " + specificPath);
        return ParcelFileDescriptor.open(new File(specificPath), ParcelFileDescriptor.parseMode(mode));
    }
}
