package com.google.android.exoplayer2.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.span.LanguageFeatureSpan;
import com.google.android.exoplayer2.util.Assertions;
import com.google.common.base.Predicate;

/* JADX INFO: loaded from: classes3.dex */
final class c0 {
    private c0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean c(Object obj) {
        return !(obj instanceof LanguageFeatureSpan);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean d(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    public static void e(Cue.Builder cue) {
        cue.clearWindowColor();
        if (cue.getText() instanceof Spanned) {
            if (!(cue.getText() instanceof Spannable)) {
                cue.setText(SpannableString.valueOf(cue.getText()));
            }
            g((Spannable) Assertions.checkNotNull(cue.getText()), new Predicate() { // from class: com.google.android.exoplayer2.ui.a0
                @Override // com.google.common.base.Predicate
                public final boolean apply(Object obj) {
                    return c0.c(obj);
                }
            });
        }
        f(cue);
    }

    public static void f(Cue.Builder cue) {
        cue.setTextSize(-3.4028235E38f, Integer.MIN_VALUE);
        if (cue.getText() instanceof Spanned) {
            if (!(cue.getText() instanceof Spannable)) {
                cue.setText(SpannableString.valueOf(cue.getText()));
            }
            g((Spannable) Assertions.checkNotNull(cue.getText()), new Predicate() { // from class: com.google.android.exoplayer2.ui.b0
                @Override // com.google.common.base.Predicate
                public final boolean apply(Object obj) {
                    return c0.d(obj);
                }
            });
        }
    }

    private static void g(Spannable spannable, Predicate<Object> removeFilter) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (removeFilter.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static float h(int textSizeType, float textSize, int rawViewHeight, int viewHeightMinusPadding) {
        float f;
        if (textSize == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (textSizeType == 0) {
            f = viewHeightMinusPadding;
        } else {
            if (textSizeType != 1) {
                if (textSizeType != 2) {
                    return -3.4028235E38f;
                }
                return textSize;
            }
            f = rawViewHeight;
        }
        return textSize * f;
    }
}
