package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.AnyRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class TypedArrayUtils {
    private static final String NAMESPACE = "http://schemas.android.com/apk/res/android";

    private TypedArrayUtils() {
    }

    public static int getAttr(@NonNull Context context, int attr, int fallbackAttr) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(attr, typedValue, true);
        return typedValue.resourceId != 0 ? attr : fallbackAttr;
    }

    public static boolean getBoolean(@NonNull TypedArray a, @StyleableRes int index, @StyleableRes int fallbackIndex, boolean defaultValue) {
        return a.getBoolean(index, a.getBoolean(fallbackIndex, defaultValue));
    }

    @Nullable
    public static Drawable getDrawable(@NonNull TypedArray a, @StyleableRes int index, @StyleableRes int fallbackIndex) {
        Drawable drawable = a.getDrawable(index);
        return drawable == null ? a.getDrawable(fallbackIndex) : drawable;
    }

    public static int getInt(@NonNull TypedArray a, @StyleableRes int index, @StyleableRes int fallbackIndex, int defaultValue) {
        return a.getInt(index, a.getInt(fallbackIndex, defaultValue));
    }

    public static boolean getNamedBoolean(@NonNull TypedArray a, @NonNull XmlPullParser parser, @NonNull String attrName, @StyleableRes int resId, boolean defaultValue) {
        return !hasAttribute(parser, attrName) ? defaultValue : a.getBoolean(resId, defaultValue);
    }

    @ColorInt
    public static int getNamedColor(@NonNull TypedArray a, @NonNull XmlPullParser parser, @NonNull String attrName, @StyleableRes int resId, @ColorInt int defaultValue) {
        return !hasAttribute(parser, attrName) ? defaultValue : a.getColor(resId, defaultValue);
    }

    @Nullable
    public static ColorStateList getNamedColorStateList(@NonNull TypedArray a, @NonNull XmlPullParser parser, @Nullable Resources.Theme theme, @NonNull String attrName, @StyleableRes int resId) {
        if (!hasAttribute(parser, attrName)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        a.getValue(resId, typedValue);
        int i = typedValue.type;
        if (i != 2) {
            return (i < 28 || i > 31) ? ColorStateListInflaterCompat.inflate(a.getResources(), a.getResourceId(resId, 0), theme) : getNamedColorStateListFromInt(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + resId + ": " + typedValue);
    }

    @NonNull
    private static ColorStateList getNamedColorStateListFromInt(@NonNull TypedValue value) {
        return ColorStateList.valueOf(value.data);
    }

    public static ComplexColorCompat getNamedComplexColor(@NonNull TypedArray a, @NonNull XmlPullParser parser, @Nullable Resources.Theme theme, @NonNull String attrName, @StyleableRes int resId, @ColorInt int defaultValue) {
        if (hasAttribute(parser, attrName)) {
            TypedValue typedValue = new TypedValue();
            a.getValue(resId, typedValue);
            int i = typedValue.type;
            if (i >= 28 && i <= 31) {
                return ComplexColorCompat.from(typedValue.data);
            }
            ComplexColorCompat complexColorCompatInflate = ComplexColorCompat.inflate(a.getResources(), a.getResourceId(resId, 0), theme);
            if (complexColorCompatInflate != null) {
                return complexColorCompatInflate;
            }
        }
        return ComplexColorCompat.from(defaultValue);
    }

    public static float getNamedFloat(@NonNull TypedArray a, @NonNull XmlPullParser parser, @NonNull String attrName, @StyleableRes int resId, float defaultValue) {
        return !hasAttribute(parser, attrName) ? defaultValue : a.getFloat(resId, defaultValue);
    }

    public static int getNamedInt(@NonNull TypedArray a, @NonNull XmlPullParser parser, @NonNull String attrName, @StyleableRes int resId, int defaultValue) {
        return !hasAttribute(parser, attrName) ? defaultValue : a.getInt(resId, defaultValue);
    }

    @AnyRes
    public static int getNamedResourceId(@NonNull TypedArray a, @NonNull XmlPullParser parser, @NonNull String attrName, @StyleableRes int resId, @AnyRes int defaultValue) {
        return !hasAttribute(parser, attrName) ? defaultValue : a.getResourceId(resId, defaultValue);
    }

    @Nullable
    public static String getNamedString(@NonNull TypedArray a, @NonNull XmlPullParser parser, @NonNull String attrName, @StyleableRes int resId) {
        if (hasAttribute(parser, attrName)) {
            return a.getString(resId);
        }
        return null;
    }

    @AnyRes
    public static int getResourceId(@NonNull TypedArray a, @StyleableRes int index, @StyleableRes int fallbackIndex, @AnyRes int defaultValue) {
        return a.getResourceId(index, a.getResourceId(fallbackIndex, defaultValue));
    }

    @Nullable
    public static String getString(@NonNull TypedArray a, @StyleableRes int index, @StyleableRes int fallbackIndex) {
        String string = a.getString(index);
        return string == null ? a.getString(fallbackIndex) : string;
    }

    @Nullable
    public static CharSequence getText(@NonNull TypedArray a, @StyleableRes int index, @StyleableRes int fallbackIndex) {
        CharSequence text = a.getText(index);
        return text == null ? a.getText(fallbackIndex) : text;
    }

    @Nullable
    public static CharSequence[] getTextArray(@NonNull TypedArray a, @StyleableRes int index, @StyleableRes int fallbackIndex) {
        CharSequence[] textArray = a.getTextArray(index);
        return textArray == null ? a.getTextArray(fallbackIndex) : textArray;
    }

    public static boolean hasAttribute(@NonNull XmlPullParser parser, @NonNull String attrName) {
        return parser.getAttributeValue(NAMESPACE, attrName) != null;
    }

    @NonNull
    public static TypedArray obtainAttributes(@NonNull Resources res, @Nullable Resources.Theme theme, @NonNull AttributeSet set, @NonNull int[] attrs) {
        return theme == null ? res.obtainAttributes(set, attrs) : theme.obtainStyledAttributes(set, attrs, 0, 0);
    }

    @Nullable
    public static TypedValue peekNamedValue(@NonNull TypedArray a, @NonNull XmlPullParser parser, @NonNull String attrName, int resId) {
        if (hasAttribute(parser, attrName)) {
            return a.peekValue(resId);
        }
        return null;
    }
}
