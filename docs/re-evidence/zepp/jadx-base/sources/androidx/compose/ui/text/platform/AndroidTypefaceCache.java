package androidx.compose.ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.TypedValue;
import androidx.collection.LruCache;
import androidx.compose.ui.text.font.AndroidAssetFont;
import androidx.compose.ui.text.font.AndroidFileDescriptorFont;
import androidx.compose.ui.text.font.AndroidFileFont;
import androidx.compose.ui.text.font.AndroidFont;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.ResourceFont;
import androidx.core.content.res.ResourcesCompat;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\"\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidTypefaceCache;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroidx/compose/ui/text/font/Font;", "font", "Landroid/graphics/Typeface;", "getOrCreate", "", "getKey", "Landroidx/collection/LruCache;", "cache", "Landroidx/collection/LruCache;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 5, 1})
public final class AndroidTypefaceCache {

    @NotNull
    public static final AndroidTypefaceCache INSTANCE = new AndroidTypefaceCache();

    @NotNull
    private static final LruCache<String, Typeface> cache = new LruCache<>(16);

    private AndroidTypefaceCache() {
    }

    @Nullable
    public final String getKey(@NotNull Context context, @NotNull Font font) {
        if (font instanceof ResourceFont) {
            TypedValue typedValue = new TypedValue();
            context.getResources().getValue(((ResourceFont) font).getResId(), typedValue, true);
            CharSequence charSequence = typedValue.string;
            return Intrinsics.stringPlus("res:", charSequence != null ? charSequence.toString() : null);
        }
        if (font instanceof AndroidAssetFont) {
            return Intrinsics.stringPlus("asset:", ((AndroidAssetFont) font).getPath());
        }
        if ((font instanceof AndroidFileFont) || (font instanceof AndroidFileDescriptorFont)) {
            return null;
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus("Unknown font type: ", font));
    }

    @NotNull
    public final Typeface getOrCreate(@NotNull Context context, @NotNull Font font) {
        Typeface typefaceInternal;
        Typeface typeface;
        String key = getKey(context, font);
        if (key != null && (typeface = cache.get(key)) != null) {
            return typeface;
        }
        if (font instanceof ResourceFont) {
            typefaceInternal = Build.VERSION.SDK_INT >= 26 ? AndroidResourceFontLoaderHelper.INSTANCE.create(context, ((ResourceFont) font).getResId()) : ResourcesCompat.getFont(context, ((ResourceFont) font).getResId());
        } else {
            if (!(font instanceof AndroidFont)) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("Unknown font type: ", font));
            }
            typefaceInternal = ((AndroidFont) font).getTypefaceInternal();
        }
        if (key != null) {
            cache.put(key, typefaceInternal);
        }
        return typefaceInternal;
    }
}
