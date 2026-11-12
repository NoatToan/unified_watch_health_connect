package com.airbnb.lottie.manager;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.Nullable;
import com.airbnb.lottie.FontAssetDelegate;
import com.airbnb.lottie.model.MutablePair;
import com.airbnb.lottie.utils.Logger;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class FontAssetManager {
    private final AssetManager d;

    @Nullable
    private FontAssetDelegate e;
    private final MutablePair<String> a = new MutablePair<>();
    private final Map<MutablePair<String>, Typeface> b = new HashMap();
    private final Map<String, Typeface> c = new HashMap();
    private String f = ".ttf";

    public FontAssetManager(Drawable.Callback callback, @Nullable FontAssetDelegate fontAssetDelegate) {
        this.e = fontAssetDelegate;
        if (callback instanceof View) {
            this.d = ((View) callback).getContext().getAssets();
        } else {
            Logger.warning("LottieDrawable must be inside of a view for images to work.");
            this.d = null;
        }
    }

    private Typeface a(String str) {
        String fontPath;
        Typeface typeface = this.c.get(str);
        if (typeface != null) {
            return typeface;
        }
        FontAssetDelegate fontAssetDelegate = this.e;
        Typeface typefaceFetchFont = fontAssetDelegate != null ? fontAssetDelegate.fetchFont(str) : null;
        FontAssetDelegate fontAssetDelegate2 = this.e;
        if (fontAssetDelegate2 != null && typefaceFetchFont == null && (fontPath = fontAssetDelegate2.getFontPath(str)) != null) {
            typefaceFetchFont = Typeface.createFromAsset(this.d, fontPath);
        }
        if (typefaceFetchFont == null) {
            typefaceFetchFont = Typeface.createFromAsset(this.d, "fonts/" + str + this.f);
        }
        this.c.put(str, typefaceFetchFont);
        return typefaceFetchFont;
    }

    private Typeface b(Typeface typeface, String str) {
        int i;
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        if (zContains && zContains2) {
            i = 3;
        } else if (zContains) {
            i = 2;
        } else {
            i = zContains2 ? 1 : 0;
        }
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }

    public Typeface getTypeface(String str, String str2) {
        this.a.set(str, str2);
        Typeface typeface = this.b.get(this.a);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceB = b(a(str), str2);
        this.b.put(this.a, typefaceB);
        return typefaceB;
    }

    public void setDefaultFontFileExtension(String str) {
        this.f = str;
    }

    public void setDelegate(@Nullable FontAssetDelegate fontAssetDelegate) {
        this.e = fontAssetDelegate;
    }
}
