package com.xiaomi.fitness.share.view;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/share/view/WrapEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WrapEditText extends AppCompatEditText {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapEditText(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        addTextChangedListener(new TextWatcher() { // from class: com.xiaomi.fitness.share.view.WrapEditText.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                Editable text;
                int lineCount = WrapEditText.this.getLineCount();
                int maxLines = WrapEditText.this.getMaxLines();
                if (1 > maxLines || maxLines >= lineCount || (text = WrapEditText.this.getText()) == null || text.length() == 0 || WrapEditText.this.getLayout() == null) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                int maxLines2 = WrapEditText.this.getMaxLines();
                int i = 0;
                int i2 = 0;
                while (i < maxLines2) {
                    int lineEnd = WrapEditText.this.getLayout().getLineEnd(i);
                    Editable text2 = WrapEditText.this.getText();
                    sb.append(text2 != null ? text2.subSequence(i2, lineEnd).toString() : null);
                    i++;
                    i2 = lineEnd;
                }
                WrapEditText.this.removeTextChangedListener(this);
                WrapEditText.this.setText(sb.toString());
                WrapEditText.this.setSelection(sb.length());
                WrapEditText.this.addTextChangedListener(this);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapEditText(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        addTextChangedListener(new TextWatcher() { // from class: com.xiaomi.fitness.share.view.WrapEditText.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                Editable text;
                int lineCount = WrapEditText.this.getLineCount();
                int maxLines = WrapEditText.this.getMaxLines();
                if (1 > maxLines || maxLines >= lineCount || (text = WrapEditText.this.getText()) == null || text.length() == 0 || WrapEditText.this.getLayout() == null) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                int maxLines2 = WrapEditText.this.getMaxLines();
                int i = 0;
                int i2 = 0;
                while (i < maxLines2) {
                    int lineEnd = WrapEditText.this.getLayout().getLineEnd(i);
                    Editable text2 = WrapEditText.this.getText();
                    sb.append(text2 != null ? text2.subSequence(i2, lineEnd).toString() : null);
                    i++;
                    i2 = lineEnd;
                }
                WrapEditText.this.removeTextChangedListener(this);
                WrapEditText.this.setText(sb.toString());
                WrapEditText.this.setSelection(sb.length());
                WrapEditText.this.addTextChangedListener(this);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapEditText(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        addTextChangedListener(new TextWatcher() { // from class: com.xiaomi.fitness.share.view.WrapEditText.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                Editable text;
                int lineCount = WrapEditText.this.getLineCount();
                int maxLines = WrapEditText.this.getMaxLines();
                if (1 > maxLines || maxLines >= lineCount || (text = WrapEditText.this.getText()) == null || text.length() == 0 || WrapEditText.this.getLayout() == null) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                int maxLines2 = WrapEditText.this.getMaxLines();
                int i2 = 0;
                int i3 = 0;
                while (i2 < maxLines2) {
                    int lineEnd = WrapEditText.this.getLayout().getLineEnd(i2);
                    Editable text2 = WrapEditText.this.getText();
                    sb.append(text2 != null ? text2.subSequence(i3, lineEnd).toString() : null);
                    i2++;
                    i3 = lineEnd;
                }
                WrapEditText.this.removeTextChangedListener(this);
                WrapEditText.this.setText(sb.toString());
                WrapEditText.this.setSelection(sb.length());
                WrapEditText.this.addTextChangedListener(this);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }
        });
    }
}
