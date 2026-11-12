package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes5.dex */
public class n8f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f27652a = {R.attr.theme, pii.g0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f27653b = {pii.K};

    public static int a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f27652a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    public static int b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f27653b, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static Context c(Context context, AttributeSet attributeSet, int i, int i2) {
        int iB = b(context, attributeSet, i, i2);
        boolean z = (context instanceof ui4) && ((ui4) context).c() == iB;
        if (iB == 0 || z) {
            return context;
        }
        ui4 ui4Var = new ui4(context, iB);
        int iA = a(context, attributeSet);
        if (iA != 0) {
            ui4Var.getTheme().applyStyle(iA, true);
        }
        return ui4Var;
    }
}
