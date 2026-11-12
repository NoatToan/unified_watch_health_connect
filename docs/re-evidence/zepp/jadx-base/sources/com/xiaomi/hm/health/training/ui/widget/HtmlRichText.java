package com.xiaomi.hm.health.training.ui.widget;

import android.content.Context;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.xiaomi.hm.health.training.utils.URLImageGetter;

/* JADX INFO: loaded from: classes22.dex */
public class HtmlRichText extends AppCompatTextView implements View.OnAttachStateChangeListener {
    private OnRichTextImageClickListener a;
    private URLImageGetter b;

    public interface OnRichTextImageClickListener {
        void urlClicked(String str, String str2);
    }

    public class a extends ClickableSpan {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            if (HtmlRichText.this.a != null) {
                HtmlRichText.this.a.urlClicked(this.a, this.b);
            }
        }
    }

    public HtmlRichText(Context context) {
        this(context, null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.b.recycle();
    }

    public void setOnRichTextImageClickListener(OnRichTextImageClickListener onRichTextImageClickListener) {
        this.a = onRichTextImageClickListener;
    }

    public void setRichText(String str) {
        URLImageGetter uRLImageGetter = new URLImageGetter(getContext(), this);
        this.b = uRLImageGetter;
        Spanned spannedFromHtml = Html.fromHtml(str, uRLImageGetter, null);
        SpannableStringBuilder spannableStringBuilder = spannedFromHtml instanceof SpannableStringBuilder ? (SpannableStringBuilder) spannedFromHtml : new SpannableStringBuilder(spannedFromHtml);
        for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
            String url = uRLSpan.getURL();
            int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
            int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
            char[] cArr = new char[spanEnd - spanStart];
            spannableStringBuilder.getChars(spanStart, spanEnd, cArr, 0);
            a aVar = new a(url, new String(cArr));
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableStringBuilder.getSpans(spanStart, spanEnd, ClickableSpan.class);
            if (clickableSpanArr != null && clickableSpanArr.length != 0) {
                for (ClickableSpan clickableSpan : clickableSpanArr) {
                    spannableStringBuilder.removeSpan(clickableSpan);
                }
            }
            spannableStringBuilder.setSpan(aVar, spanStart, spanEnd, 33);
        }
        super.setText(spannedFromHtml);
    }

    public HtmlRichText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HtmlRichText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setMovementMethod(LinkMovementMethod.getInstance());
        setLinksClickable(true);
        setAutoLinkMask(1);
    }
}
