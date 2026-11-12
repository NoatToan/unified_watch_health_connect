package com.scwang.smartrefresh.layout.internal.pathview;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes18.dex */
public class PathsView extends View {
    public PathsDrawable mPathsDrawable;

    public PathsView(Context context) {
        super(context);
        this.mPathsDrawable = new PathsDrawable();
        a(context, null, 0);
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        this.mPathsDrawable = new PathsDrawable();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.mPathsDrawable.draw(canvas);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (getTag() instanceof String) {
            parserPaths(getTag().toString());
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.mPathsDrawable.setBounds(getPaddingLeft(), getPaddingTop(), Math.max((i3 - i) - getPaddingRight(), getPaddingLeft()), Math.max((i4 - i2) - getPaddingTop(), getPaddingTop()));
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSize(this.mPathsDrawable.width() + getPaddingLeft() + getPaddingRight(), i), View.resolveSize(this.mPathsDrawable.height() + getPaddingTop() + getPaddingBottom(), i2));
    }

    public void parserColors(int... iArr) {
        this.mPathsDrawable.parserColors(iArr);
    }

    public void parserPaths(String... strArr) {
        this.mPathsDrawable.parserPaths(strArr);
    }

    public PathsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mPathsDrawable = new PathsDrawable();
        a(context, attributeSet, 0);
    }

    public PathsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mPathsDrawable = new PathsDrawable();
        a(context, attributeSet, i);
    }
}
