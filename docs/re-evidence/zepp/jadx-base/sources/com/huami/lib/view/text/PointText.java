package com.huami.lib.view.text;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huami.lib.view.R;

/* JADX INFO: loaded from: classes10.dex */
public class PointText extends RelativeLayout {
    private static final String c = PointText.class.getSimpleName();
    private View a;
    private TextView b;

    public PointText(Context context) {
        this(context, null);
    }

    public void set(int i, String str) {
        ((GradientDrawable) this.a.getBackground()).setColor(i);
        this.b.setText(str);
    }

    public PointText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.point_text_layout, this);
        this.a = findViewById(R.id.point_text_img);
        this.b = (TextView) findViewById(R.id.point_text);
    }
}
