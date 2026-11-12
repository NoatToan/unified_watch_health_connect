package com.xiaomi.hm.health.baseutil;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.xiaomi.hm.health.baseutil.SpanUtils;

/* JADX INFO: loaded from: classes19.dex */
public class SpanUtils {

    public class a extends ClickableSpan {
        public final /* synthetic */ int a;
        public final /* synthetic */ View.OnClickListener b;

        public a(int i, View.OnClickListener onClickListener) {
            this.a = i;
            this.b = onClickListener;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            View.OnClickListener onClickListener = this.b;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(this.a);
            textPaint.setUnderlineText(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean b(View view) {
        return true;
    }

    public static void setSpan(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, View.OnClickListener onClickListener) {
        spannableStringBuilder.setSpan(new a(i3, onClickListener), i, i2, 33);
    }

    public static void setText(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
        textView.setText(spannableStringBuilder);
        textView.setOnLongClickListener(new View.OnLongClickListener() { // from class: h77
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return SpanUtils.b(view);
            }
        });
    }
}
