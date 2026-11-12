package com.xiaomi.hm.health.baseutil;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.xiaomi.hm.health.baseutil.SpanUtils;

/* JADX INFO: loaded from: classes11.dex */
public class SpanUtils {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$setText$0(View view) {
        return true;
    }

    public static void setSpan(SpannableStringBuilder spannableStringBuilder, int i, int i2, final int i3, final View.OnClickListener onClickListener) {
        spannableStringBuilder.setSpan(new ClickableSpan() { // from class: com.xiaomi.hm.health.baseutil.SpanUtils.1
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                View.OnClickListener onClickListener2 = onClickListener;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(view);
                }
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(i3);
                textPaint.setUnderlineText(true);
            }
        }, i, i2, 33);
    }

    public static void setText(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
        textView.setText(spannableStringBuilder);
        textView.setOnLongClickListener(new View.OnLongClickListener() { // from class: e5n
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return SpanUtils.lambda$setText$0(view);
            }
        });
    }
}
