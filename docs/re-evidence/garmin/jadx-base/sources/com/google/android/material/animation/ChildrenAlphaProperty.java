package com.google.android.material.animation;

import android.util.Property;
import android.view.ViewGroup;
import com.google.android.material.R;

/* JADX INFO: loaded from: classes14.dex */
public class ChildrenAlphaProperty extends Property<ViewGroup, Float> {
    public static final Property<ViewGroup, Float> CHILDREN_ALPHA = new ChildrenAlphaProperty("childrenAlpha");

    private ChildrenAlphaProperty(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    public Float get(ViewGroup viewGroup) {
        Float f14 = (Float) viewGroup.getTag(R.id.mtrl_internal_children_alpha_tag);
        return f14 != null ? f14 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public void set(ViewGroup viewGroup, Float f14) {
        float fFloatValue = f14.floatValue();
        viewGroup.setTag(R.id.mtrl_internal_children_alpha_tag, f14);
        int childCount = viewGroup.getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            viewGroup.getChildAt(i14).setAlpha(fFloatValue);
        }
    }
}
