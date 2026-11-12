package com.huami.watch.util;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class StringSpan {

    public static class Builder {
        private StringBuilder a = new StringBuilder("");
        private List<a> b = new ArrayList();

        public class a {
            public int a;
            public int b;
            public Object c;

            public a(int i, int i2, Object obj) {
                this.a = i;
                this.b = i2;
                this.c = obj;
            }
        }

        public Builder add(String str) {
            this.a.append(str);
            return this;
        }

        public SpannableString build() {
            SpannableString spannableString = new SpannableString(this.a);
            for (a aVar : this.b) {
                spannableString.setSpan(aVar.c, aVar.a, aVar.b, 17);
            }
            return spannableString;
        }

        public Builder add(String str, Object obj) {
            int length = this.a.length();
            this.a.append(str);
            this.b.add(new a(length, this.a.length(), obj));
            return this;
        }
    }

    public static class ClickSpan {

        public class a extends a {
            public final /* synthetic */ View.OnClickListener b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i, View.OnClickListener onClickListener) {
                super(i);
                this.b = onClickListener;
            }

            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                View.OnClickListener onClickListener = this.b;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }
        }

        public static ClickableSpan newInstance(int i, View.OnClickListener onClickListener) {
            return new a(i, onClickListener);
        }

        public static ClickableSpan red(View.OnClickListener onClickListener) {
            return newInstance(Color.parseColor("#DC2B0B"), onClickListener);
        }
    }

    public static abstract class a extends ClickableSpan {
        private int a;

        public a(int i) {
            this.a = i;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(this.a);
            textPaint.setUnderlineText(false);
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
