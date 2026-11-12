package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class Guideline extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6148a;

    public Guideline(Context context) {
        super(context);
        this.f6148a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i14, int i15) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z14) {
        this.f6148a = z14;
    }

    public void setGuidelineBegin(int i14) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f6148a && bVar.f6096a == i14) {
            return;
        }
        bVar.f6096a = i14;
        setLayoutParams(bVar);
    }

    public void setGuidelineEnd(int i14) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f6148a && bVar.f6098b == i14) {
            return;
        }
        bVar.f6098b = i14;
        setLayoutParams(bVar);
    }

    public void setGuidelinePercent(float f14) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f6148a && bVar.f6100c == f14) {
            return;
        }
        bVar.f6100c = f14;
        setLayoutParams(bVar);
    }

    @Override // android.view.View
    public void setVisibility(int i14) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6148a = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.f6148a = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i14, int i15) {
        super(context, attributeSet, i14);
        this.f6148a = true;
        super.setVisibility(8);
    }
}
