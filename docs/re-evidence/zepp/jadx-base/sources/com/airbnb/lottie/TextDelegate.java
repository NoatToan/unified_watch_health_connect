package com.airbnb.lottie;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class TextDelegate {
    private final Map<String, String> a;

    @Nullable
    private final LottieAnimationView b;

    @Nullable
    private final LottieDrawable c;
    private boolean d;

    @VisibleForTesting
    public TextDelegate() {
        this.a = new HashMap();
        this.d = true;
        this.b = null;
        this.c = null;
    }

    private void a() {
        LottieAnimationView lottieAnimationView = this.b;
        if (lottieAnimationView != null) {
            lottieAnimationView.invalidate();
        }
        LottieDrawable lottieDrawable = this.c;
        if (lottieDrawable != null) {
            lottieDrawable.invalidateSelf();
        }
    }

    public String getText(String str) {
        return str;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final String getTextInternal(String str) {
        if (this.d && this.a.containsKey(str)) {
            return this.a.get(str);
        }
        String text = getText(str);
        if (this.d) {
            this.a.put(str, text);
        }
        return text;
    }

    public void invalidateAllText() {
        this.a.clear();
        a();
    }

    public void invalidateText(String str) {
        this.a.remove(str);
        a();
    }

    public void setCacheText(boolean z) {
        this.d = z;
    }

    public void setText(String str, String str2) {
        this.a.put(str, str2);
        a();
    }

    public TextDelegate(LottieAnimationView lottieAnimationView) {
        this.a = new HashMap();
        this.d = true;
        this.b = lottieAnimationView;
        this.c = null;
    }

    public TextDelegate(LottieDrawable lottieDrawable) {
        this.a = new HashMap();
        this.d = true;
        this.c = lottieDrawable;
        this.b = null;
    }
}
