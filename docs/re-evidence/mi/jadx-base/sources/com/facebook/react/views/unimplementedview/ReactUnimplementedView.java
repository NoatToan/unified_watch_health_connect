package com.facebook.react.views.unimplementedview;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes4.dex */
public class ReactUnimplementedView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AppCompatTextView f7587a;

    public ReactUnimplementedView(Context context) {
        super(context);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        this.f7587a = appCompatTextView;
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        this.f7587a.setGravity(17);
        this.f7587a.setTextColor(-1);
        setBackgroundColor(1442775040);
        setGravity(1);
        setOrientation(1);
        addView(this.f7587a);
    }

    public void setName(String str) {
        this.f7587a.setText("'" + str + "' is not Fabric compatible yet.");
    }
}
