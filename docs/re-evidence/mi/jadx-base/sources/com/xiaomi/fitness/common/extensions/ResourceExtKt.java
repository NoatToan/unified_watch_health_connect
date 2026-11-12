package com.xiaomi.fitness.common.extensions;

import android.content.Context;
import android.graphics.drawable.Drawable;
import defpackage.ni4;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u001a\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\n\u001a\u0014\u0010\u000b\u001a\u00020\f*\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u0004\u001a\u0014\u0010\u000e\u001a\u00020\u0004*\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u0004\u001a\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0004\u001a)\u0010\u0013\u001a\u00020\u00012\b\b\u0001\u0010\u0014\u001a\u00020\u00042\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\t\"\u00020\u0007¢\u0006\u0002\u0010\u0016\u001a\u0010\u0010\u0013\u001a\u00020\u00012\b\b\u0001\u0010\u0014\u001a\u00020\u0004\u001a\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u001a\u001a\u00020\u0004¨\u0006\u001b"}, d2 = {"getQuantityString", "", "Landroid/content/Context;", "resId", "", "quantity", "obj", "", "getStringArray", "", "(Landroid/content/Context;I)[Ljava/lang/String;", "getDimen", "", "dimenRes", "getResourceColor", "colorRes", "getResourceDrawable", "Landroid/graphics/drawable/Drawable;", "drawableRes", "getString", "stringRes", "formatArgs", "(I[Ljava/lang/Object;)Ljava/lang/String;", "openAsset", "Ljava/io/InputStream;", "filePath", "assetMode", "common_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ResourceExtKt {
    public static final float getDimen(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return context.getResources().getDimension(i);
    }

    @NotNull
    public static final String getQuantityString(@NotNull Context context, int i, int i2, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        String quantityString = context.getResources().getQuantityString(i, i2, obj);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    public static final int getResourceColor(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return ni4.c(context, i);
    }

    @Nullable
    public static final Drawable getResourceDrawable(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return ni4.e(context, i);
    }

    @NotNull
    public static final String getString(int i, @NotNull Object... formatArgs) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        String string = ApplicationExtKt.getApplication().getString(i, Arrays.copyOf(formatArgs, formatArgs.length));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @NotNull
    public static final String[] getStringArray(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        String[] stringArray = context.getResources().getStringArray(i);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        return stringArray;
    }

    @NotNull
    public static final InputStream openAsset(@NotNull String filePath, int i) throws IOException {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        InputStream inputStreamOpen = ApplicationExtKt.getApplication().getAssets().open(filePath, i);
        Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
        return inputStreamOpen;
    }

    public static /* synthetic */ InputStream openAsset$default(String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 2;
        }
        return openAsset(str, i);
    }

    @NotNull
    public static final String getString(int i) {
        String string = ApplicationExtKt.getApplication().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }
}
