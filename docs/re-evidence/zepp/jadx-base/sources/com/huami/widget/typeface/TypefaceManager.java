package com.huami.widget.typeface;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class TypefaceManager {
    private final Map<Font, WeakReference<Typeface>> a;

    public static class b {
        private static final TypefaceManager a = new TypefaceManager();

        private b() {
        }
    }

    private static boolean a() {
        return Locale.getDefault().getLanguage().equals(Locale.CHINESE.getLanguage());
    }

    public static TypefaceManager get() {
        return b.a;
    }

    public void applyTypeface(@Nullable TextView textView, @Nullable String str) {
        applyTypeface(textView, Font.from(str));
    }

    @Nullable
    public Typeface getTypeface(@Nullable Context context, @Nullable String str) {
        return getTypeface(context, Font.from(str));
    }

    private TypefaceManager() {
        this.a = new HashMap();
    }

    public void applyTypeface(@Nullable TextView textView, @Nullable Font font) {
        if (textView == null || font == null) {
            return;
        }
        if (!a()) {
            if (font == Font.LT) {
                return;
            }
            if (font == Font.LT_BOLD) {
                textView.setTypeface(null, 1);
                return;
            }
        }
        Typeface typeface = getTypeface(textView.getContext(), font);
        if (typeface != null) {
            textView.setTypeface(typeface);
        }
    }

    @Nullable
    public Typeface getTypeface(@Nullable Context context, @Nullable Font font) {
        Typeface typefaceCreateFromAsset = null;
        if (context != null && font != null) {
            if (this.a.containsKey(font) && (typefaceCreateFromAsset = this.a.get(font).get()) != null) {
                return typefaceCreateFromAsset;
            }
            try {
                typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), font.getPath());
            } catch (Exception unused) {
            }
            if (typefaceCreateFromAsset != null) {
                this.a.put(font, new WeakReference<>(typefaceCreateFromAsset));
            }
        }
        return typefaceCreateFromAsset;
    }

    public void applyTypeface(@Nullable TextView textView, @Nullable AttributeSet attributeSet) {
        if (textView == null || attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = textView.getContext().obtainStyledAttributes(attributeSet, new int[]{android.R.attr.fontFamily});
        applyTypeface(textView, typedArrayObtainStyledAttributes.getString(0));
        typedArrayObtainStyledAttributes.recycle();
    }
}
