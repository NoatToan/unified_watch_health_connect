package com.garmin.android.apps.connectmobile.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import c22.c;
import com.garmin.android.apps.connectmobile.R;
import r22.j1;

/* JADX INFO: loaded from: classes10.dex */
public class GCMComplexTutorialInstructionView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GCMTutorialView f47443a;

    public GCMComplexTutorialInstructionView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.f47443a = null;
        LayoutInflater.from(context).inflate(R.layout.gcm_complex_tutorial_instruction_view, (ViewGroup) this, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j1.f149705g, i14, 0);
        ImageView imageView = (ImageView) findViewById(R.id.gcm_icon_bullet);
        imageView.setBackgroundDrawable(typedArrayObtainStyledAttributes.getDrawable(0));
        c.a(imageView, context, R.dimen.icon_default, 1.0f, 1.8f);
        GCMTutorialView gCMTutorialView = (GCMTutorialView) findViewById(R.id.gcm_instructions);
        this.f47443a = gCMTutorialView;
        gCMTutorialView.setTutorial(typedArrayObtainStyledAttributes.getString(1));
        typedArrayObtainStyledAttributes.recycle();
    }

    public GCMTutorialView getLabelRight() {
        return this.f47443a;
    }

    public GCMComplexTutorialInstructionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GCMComplexTutorialInstructionView(Context context) {
        this(context, null, 0);
    }
}
