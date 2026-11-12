package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.view.g1;
import androidx.core.view.s0;
import com.google.android.material.R;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RelativeCornerSize;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes14.dex */
class RadialViewGroup extends ConstraintLayout {
    static final int LEVEL_1 = 1;
    static final int LEVEL_2 = 2;
    static final float LEVEL_RADIUS_RATIO = 0.66f;
    private static final String SKIP_TAG = "skip";
    private MaterialShapeDrawable background;
    private int radius;
    private final Runnable updateLayoutParametersRunnable;

    public RadialViewGroup(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        Drawable drawableCreateBackground = createBackground();
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        setBackground(drawableCreateBackground);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RadialViewGroup, i14, 0);
        this.radius = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.RadialViewGroup_materialCircleRadius, 0);
        this.updateLayoutParametersRunnable = new b(this, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void addConstraints(List<View> list, d dVar, int i14) {
        Iterator<View> it = list.iterator();
        float size = 0.0f;
        while (it.hasNext()) {
            int id3 = it.next().getId();
            int i15 = R.id.circle_center;
            d.b bVar = dVar.k(id3).f6203e;
            bVar.A = i15;
            bVar.B = i14;
            bVar.C = size;
            size += 360.0f / list.size();
        }
    }

    private Drawable createBackground() {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.background = materialShapeDrawable;
        materialShapeDrawable.setCornerSize(new RelativeCornerSize(0.5f));
        this.background.setFillColor(ColorStateList.valueOf(-1));
        return this.background;
    }

    private static boolean shouldSkipView(View view2) {
        return SKIP_TAG.equals(view2.getTag());
    }

    private void updateLayoutParamsAsync() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.updateLayoutParametersRunnable);
            handler.post(this.updateLayoutParametersRunnable);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view2, int i14, ViewGroup.LayoutParams layoutParams) {
        super.addView(view2, i14, layoutParams);
        if (view2.getId() == -1) {
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            view2.setId(View.generateViewId());
        }
        updateLayoutParamsAsync();
    }

    public int getLeveledRadius(int i14) {
        int i15 = this.radius;
        return i14 == 2 ? Math.round(i15 * LEVEL_RADIUS_RATIO) : i15;
    }

    public int getRadius() {
        return this.radius;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        updateLayoutParams();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view2) {
        super.onViewRemoved(view2);
        updateLayoutParamsAsync();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i14) {
        this.background.setFillColor(ColorStateList.valueOf(i14));
    }

    public void setRadius(int i14) {
        this.radius = i14;
        updateLayoutParams();
    }

    public void updateLayoutParams() {
        d dVar = new d();
        dVar.f(this);
        HashMap map = new HashMap();
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getId() != R.id.circle_center && !shouldSkipView(childAt)) {
                int i15 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i15 == null) {
                    i15 = 1;
                }
                if (!map.containsKey(i15)) {
                    map.put(i15, new ArrayList());
                }
                ((List) map.get(i15)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            addConstraints((List) entry.getValue(), dVar, getLeveledRadius(((Integer) entry.getKey()).intValue()));
        }
        dVar.b(this);
    }

    public RadialViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadialViewGroup(Context context) {
        this(context, null);
    }
}
