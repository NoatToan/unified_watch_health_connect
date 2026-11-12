package com.garmin.android.apps.connectmobile.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import r22.j1;

/* JADX INFO: loaded from: classes10.dex */
public class GCMTutorialView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f47458a;

    public GCMTutorialView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.gcm_tutorial_view, (ViewGroup) this, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j1.f149711m);
        TextView textView = (TextView) findViewById(R.id.tutorial_view);
        this.f47458a = textView;
        textView.setText(typedArrayObtainStyledAttributes.getString(0));
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setTutorial(String str) {
        TextView textView = this.f47458a;
        if (str != null) {
            textView.setText(str);
        } else {
            textView.setText("");
        }
    }
}
