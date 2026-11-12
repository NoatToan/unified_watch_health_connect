package defpackage;

import android.util.Property;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes5.dex */
public class mv3 extends Property<ViewGroup, Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Property<ViewGroup, Float> f27243a = new mv3("childrenAlpha");

    public mv3(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(ViewGroup viewGroup) {
        Float f = (Float) viewGroup.getTag(iqi.O);
        return f != null ? f : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(ViewGroup viewGroup, Float f) {
        float fFloatValue = f.floatValue();
        viewGroup.setTag(iqi.O, f);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(fFloatValue);
        }
    }
}
