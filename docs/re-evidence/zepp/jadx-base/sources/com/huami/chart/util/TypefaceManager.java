package com.huami.chart.util;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class TypefaceManager {
    private static final TypefaceManager c = new TypefaceManager();
    private final HashMap<TextStyle, WeakReference<Typeface>> a = new HashMap<>();
    private final HashSet<TextStyleExtractor> b = new HashSet<>();

    public interface TextStyle {
        String getFontName();

        String getName();
    }

    public static abstract class TextStyleExtractor {
        public TextStyle getTextStyle(String str) {
            for (TextStyle textStyle : getTextStyles()) {
                if (textStyle.getName().equals(str)) {
                    return textStyle;
                }
            }
            return null;
        }

        public abstract TextStyle[] getTextStyles();
    }

    private TypefaceManager() {
    }

    public static void addTextStyleExtractors(TextStyleExtractor textStyleExtractor) {
        c.b.add(textStyleExtractor);
    }

    public static TypefaceManager getInstance() {
        return c;
    }

    public void applyTypeface(TextView textView, Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.fontFamily});
        applyTypeface(textView, typedArrayObtainStyledAttributes.getString(0));
        typedArrayObtainStyledAttributes.recycle();
    }

    public Typeface getTypeface(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            Iterator<TextStyleExtractor> it2 = this.b.iterator();
            while (it2.hasNext()) {
                TextStyle textStyle = it2.next().getTextStyle(str);
                if (textStyle != null) {
                    return getTypeface(context, textStyle);
                }
            }
        }
        return null;
    }

    public void applyTypeface(TextView textView, String str) {
        Typeface typeface = getTypeface(textView.getContext(), str);
        if (typeface != null) {
            textView.setTypeface(typeface);
        }
    }

    public Typeface getTypeface(Context context, TextStyle textStyle) {
        Typeface typefaceCreateFromAsset = null;
        if (textStyle == null) {
            return null;
        }
        if (this.a.containsKey(textStyle) && (typefaceCreateFromAsset = this.a.get(textStyle).get()) != null) {
            return typefaceCreateFromAsset;
        }
        try {
            typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), textStyle.getFontName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (typefaceCreateFromAsset != null) {
            this.a.put(textStyle, new WeakReference<>(typefaceCreateFromAsset));
        }
        return typefaceCreateFromAsset;
    }

    public void applyTypeface(TextView textView, TextStyle textStyle) {
        Typeface typeface = getTypeface(textView.getContext(), textStyle);
        if (typeface != null) {
            textView.setTypeface(typeface);
        }
    }
}
