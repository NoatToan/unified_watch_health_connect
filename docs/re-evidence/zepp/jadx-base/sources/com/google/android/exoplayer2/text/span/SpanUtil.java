package com.google.android.exoplayer2.text.span;

import android.text.Spannable;

/* JADX INFO: loaded from: classes3.dex */
public final class SpanUtil {
    private SpanUtil() {
    }

    public static void addOrReplaceSpan(Spannable spannable, Object span, int start, int end, int spanFlags) {
        for (Object obj : spannable.getSpans(start, end, span.getClass())) {
            if (spannable.getSpanStart(obj) == start && spannable.getSpanEnd(obj) == end && spannable.getSpanFlags(obj) == spanFlags) {
                spannable.removeSpan(obj);
            }
        }
        spannable.setSpan(span, start, end, spanFlags);
    }
}
