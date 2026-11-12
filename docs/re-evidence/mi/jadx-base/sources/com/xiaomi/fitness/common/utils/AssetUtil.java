package com.xiaomi.fitness.common.utils;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.xiaomi.fitness.common.extensions.IOExtKt;
import com.xiaomi.fitness.common.log.Logger;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import kotlin.Metadata;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ.\u0010\u000b\u001a\u0002H\f\"\u0006\b\u0000\u0010\f\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u0086\b¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/common/utils/AssetUtil;", "", "<init>", "()V", "copyAssetsDirToSDCard", "", "context", "Landroid/content/Context;", "assetsDirName", "", "sdCardPath", "read", "T", "gson", "Lcom/google/gson/Gson;", "filePath", "(Landroid/content/Context;Lcom/google/gson/Gson;Ljava/lang/String;)Ljava/lang/Object;", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AssetUtil {

    @NotNull
    public static final AssetUtil INSTANCE = new AssetUtil();

    private AssetUtil() {
    }

    public final void copyAssetsDirToSDCard(@NotNull Context context, @NotNull String assetsDirName, @NotNull String sdCardPath) throws Throwable {
        String strSubstring;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(assetsDirName, "assetsDirName");
        Intrinsics.checkNotNullParameter(sdCardPath, "sdCardPath");
        try {
            String[] list = context.getAssets().list(assetsDirName);
            if (list != null && list.length != 0) {
                if (StringsKt__StringsKt.contains$default((CharSequence) assetsDirName, (CharSequence) "/", false, 2, (Object) null)) {
                    strSubstring = assetsDirName.substring(StringsKt__StringsKt.lastIndexOf$default((CharSequence) assetsDirName, '/', 0, false, 6, (Object) null) + 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                } else {
                    strSubstring = assetsDirName;
                }
                String str = sdCardPath + File.separator + strSubstring;
                File file = new File(str);
                if (!file.exists()) {
                    file.mkdirs();
                }
                Intrinsics.checkNotNull(list);
                for (String str2 : list) {
                    copyAssetsDirToSDCard(context, assetsDirName + File.separator + str2, str);
                }
                return;
            }
            InputStream inputStreamOpen = context.getAssets().open(assetsDirName);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
            String str3 = File.separator;
            String strSubstring2 = assetsDirName.substring(StringsKt__StringsKt.lastIndexOf$default((CharSequence) assetsDirName, '/', 0, false, 6, (Object) null));
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            FileUtils.INSTANCE.copyToFile(inputStreamOpen, new File(sdCardPath + str3 + strSubstring2));
            IOExtKt.closeSilently(this, inputStreamOpen);
        } catch (Exception e) {
            Logger.e("AssetUtil", "Fail to copy files in assets", e);
        }
    }

    public final /* synthetic */ <T> T read(Context context, Gson gson, String filePath) throws JsonSyntaxException, JsonIOException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        InputStreamReader inputStreamReader = new InputStreamReader(context.getAssets().open(filePath));
        try {
            Intrinsics.reifiedOperationMarker(4, "T");
            T t = (T) gson.fromJson((Reader) inputStreamReader, (Class) Object.class);
            InlineMarker.finallyStart(1);
            IOExtKt.closeSilently(this, inputStreamReader);
            return t;
        } finally {
            InlineMarker.finallyStart(1);
            IOExtKt.closeSilently(this, inputStreamReader);
            InlineMarker.finallyEnd(1);
        }
    }
}
