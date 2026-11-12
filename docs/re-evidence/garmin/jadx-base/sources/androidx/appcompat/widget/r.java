package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes.dex */
public class r extends RatingBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f5231a;

    public r(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        r0.a(getContext(), this);
        q qVar = new q(this);
        this.f5231a = qVar;
        qVar.a(attributeSet, i14);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i14, int i15) {
        super.onMeasure(i14, i15);
        Bitmap bitmap = this.f5231a.f5212b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i14, 0), getMeasuredHeight());
        }
    }

    public r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ratingBarStyle);
    }

    public r(Context context) {
        this(context, null);
    }
}
