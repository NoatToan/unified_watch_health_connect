package com.xiaomi.hm.health.bodyfat.view;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes19.dex */
public class SDAdaptiveTextView extends AppCompatTextView {
    public SDAdaptiveTextView(Context context) {
        super(context);
    }

    private String a(TextView textView) {
        String string = textView.getText().toString();
        TextPaint paint = textView.getPaint();
        float width = (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight();
        String[] strArrSplit = string.replaceAll(StringUtils.CR, "").split("\n");
        StringBuilder sb = new StringBuilder();
        for (String str : strArrSplit) {
            if (paint.measureText(str) <= width) {
                sb.append(str);
            } else {
                int i = 0;
                float fMeasureText = 0.0f;
                while (i != str.length()) {
                    char cCharAt = str.charAt(i);
                    fMeasureText += paint.measureText(String.valueOf(cCharAt));
                    if (fMeasureText <= width) {
                        sb.append(cCharAt);
                    } else {
                        sb.append("\n");
                        i--;
                        fMeasureText = 0.0f;
                    }
                    i++;
                }
            }
        }
        return sb.toString();
    }

    public void setAdaptiveText(String str) {
        setText(str);
        setText(a(this));
    }

    public SDAdaptiveTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SDAdaptiveTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
