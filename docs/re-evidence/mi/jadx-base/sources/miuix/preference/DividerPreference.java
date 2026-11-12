package miuix.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import defpackage.d3j;
import defpackage.eii;
import defpackage.g7i;
import defpackage.n5j;
import defpackage.pwk;

/* JADX INFO: loaded from: classes3.dex */
public class DividerPreference extends BasePreference {
    public DividerPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, d3j.f15041b);
    }

    private void e(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, n5j.v);
        i(typedArrayObtainStyledAttributes.getBoolean(n5j.y, false));
        h(typedArrayObtainStyledAttributes.getBoolean(n5j.x, false));
        k(typedArrayObtainStyledAttributes.getBoolean(n5j.z, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // miuix.preference.BasePreference, androidx.preference.Preference
    public void onBindViewHolder(g7i g7iVar) {
        super.onBindViewHolder(g7iVar);
        View view = g7iVar.itemView;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{eii.n});
        boolean z = false;
        int i = typedArrayObtainStyledAttributes.getInt(0, 1);
        if (i == 2 || (pwk.a() > 1 && i == 1)) {
            z = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            return;
        }
        view.setVisibility(8);
    }

    public DividerPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eii.e);
    }

    public DividerPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        e(attributeSet);
    }
}
