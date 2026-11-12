package com.huami.watch.companion.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huami.watch.companion.R;

/* JADX INFO: loaded from: classes16.dex */
public class NfcItemView extends RelativeLayout {
    public NfcItemView(Context context) {
        this(context, null);
    }

    public NfcItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NfcItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.NfcItemView, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.NfcItemView_nfc_title);
        String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.NfcItemView_nfc_info);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.NfcItemView_nfc_icon);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(context).inflate(R.layout.view_nfc_item, (ViewGroup) this, true);
        TextView textView = (TextView) findViewById(R.id.nfc_title);
        ImageView imageView = (ImageView) findViewById(R.id.nfc_icon);
        TextView textView2 = (TextView) findViewById(R.id.nfc_info);
        textView.setText(string);
        imageView.setImageDrawable(drawable);
        if (TextUtils.isEmpty(string2)) {
            return;
        }
        textView2.setText(string2);
        textView2.setVisibility(0);
    }
}
