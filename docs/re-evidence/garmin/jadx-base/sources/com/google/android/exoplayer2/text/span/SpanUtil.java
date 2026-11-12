package com.google.android.exoplayer2.text.span;

import android.text.Spannable;

/* JADX INFO: loaded from: classes14.dex */
public final class SpanUtil {
    private SpanUtil() {
    }

    public static void addOrReplaceSpan(Spannable spannable, Object obj, int i14, int i15, int i16) {
        for (Object obj2 : spannable.getSpans(i14, i15, obj.getClass())) {
            if (spannable.getSpanStart(obj2) == i14 && spannable.getSpanEnd(obj2) == i15 && spannable.getSpanFlags(obj2) == i16) {
                spannable.removeSpan(obj2);
            }
        }
        spannable.setSpan(obj, i14, i15, i16);
    }
}
