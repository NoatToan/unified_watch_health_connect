package miuix.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.eii;
import defpackage.pwk;

/* JADX INFO: loaded from: classes3.dex */
public class PreferenceCategoryLayout extends FrameLayout {
    public PreferenceCategoryLayout(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{eii.n, eii.x});
        int i = typedArrayObtainStyledAttributes.getInt(0, 1);
        if (i != 2 && (pwk.a() <= 1 || i != 1)) {
            setBackground(typedArrayObtainStyledAttributes.getDrawable(1));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public PreferenceCategoryLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PreferenceCategoryLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
