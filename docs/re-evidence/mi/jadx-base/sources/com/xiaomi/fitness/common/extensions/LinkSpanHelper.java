package com.xiaomi.fitness.common.extensions;

import android.content.Context;
import android.text.Html;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public class LinkSpanHelper {

    public static class CosForegroundColorSpan extends URLSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f11801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f11802b;

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(this.f11801a);
            textPaint.setTextSize(this.f11802b);
        }
    }

    public static class SizeSpanWithUnderline extends URLSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f11803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f11804b;
        public final float c;

        public SizeSpanWithUnderline(String str, a aVar, int i, float f) {
            super(str);
            this.f11803a = aVar;
            this.f11804b = i;
            this.c = f;
        }

        @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
        public void onClick(View view) {
            this.f11803a.onLinkClicked(view, getURL());
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(true);
            textPaint.setColor(this.f11804b);
            textPaint.setTextSize(this.c);
        }
    }

    public static class UrlSpanNoUnderline extends URLSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f11805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f11806b;

        public UrlSpanNoUnderline(String str, a aVar, int i) {
            super(str);
            this.f11805a = aVar;
            this.f11806b = i;
        }

        @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
        public void onClick(View view) {
            this.f11805a.onLinkClicked(view, getURL());
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            textPaint.setColor(this.f11806b);
        }
    }

    public static class UrlSpanWithUnderline extends URLSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f11807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f11808b;

        public UrlSpanWithUnderline(String str, a aVar, int i) {
            super(str);
            this.f11807a = aVar;
            this.f11808b = i;
        }

        @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
        public void onClick(View view) {
            this.f11807a.onLinkClicked(view, getURL());
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(true);
            textPaint.setColor(this.f11808b);
        }
    }

    public interface a {
        void onLinkClicked(View view, String str);
    }

    public static Spannable a(Context context, String str, Integer num, a aVar) {
        Spannable spannable = (Spannable) Html.fromHtml(str);
        int color = context.getResources().getColor(num.intValue());
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            int spanStart = spannable.getSpanStart(uRLSpan);
            int spanEnd = spannable.getSpanEnd(uRLSpan);
            spannable.removeSpan(uRLSpan);
            spannable.setSpan(new UrlSpanNoUnderline(uRLSpan.getURL(), aVar, color), spanStart, spanEnd, spannable.getSpanFlags(uRLSpan));
        }
        return spannable;
    }

    public static Spannable b(Context context, String str, Integer num, a aVar) {
        Spannable spannable = (Spannable) Html.fromHtml(str);
        int color = context.getResources().getColor(num.intValue());
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            int spanStart = spannable.getSpanStart(uRLSpan);
            int spanEnd = spannable.getSpanEnd(uRLSpan);
            spannable.removeSpan(uRLSpan);
            spannable.setSpan(new UrlSpanWithUnderline(uRLSpan.getURL(), aVar, color), spanStart, spanEnd, spannable.getSpanFlags(uRLSpan));
        }
        return spannable;
    }
}
