package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes.dex */
public class t extends SeekBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f5239a;

    public t(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        r0.a(getContext(), this);
        u uVar = new u(this);
        this.f5239a = uVar;
        uVar.a(attributeSet, i14);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        u uVar = this.f5239a;
        SeekBar seekBar = uVar.f5242d;
        Drawable drawable = uVar.f5243e;
        if (drawable != null && drawable.isStateful() && drawable.setState(seekBar.getDrawableState())) {
            seekBar.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f5239a.f5243e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f5239a.d(canvas);
    }

    public t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public t(Context context) {
        this(context, null);
    }
}
