package miuix.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.d3j;
import defpackage.dti;
import defpackage.eii;
import defpackage.g7i;
import defpackage.imi;
import defpackage.n5j;
import defpackage.pwk;

/* JADX INFO: loaded from: classes3.dex */
public class CommentPreference extends BasePreference {
    public CharSequence e;

    public CommentPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, d3j.f15040a);
    }

    @Override // miuix.preference.BasePreference, androidx.preference.Preference
    public void onBindViewHolder(g7i g7iVar) {
        super.onBindViewHolder(g7iVar);
        TextView textView = (TextView) g7iVar.itemView.findViewById(dti.e);
        if (textView != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
            int i = getContext().obtainStyledAttributes(new int[]{eii.n}).getInt(0, 1);
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize((i == 2 || (pwk.a() > 1 && i == 1)) ? imi.d : imi.e);
            layoutParams.setMargins(0, dimensionPixelSize, 0, dimensionPixelSize);
            textView.setText(this.e);
        }
    }

    public CommentPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eii.d);
    }

    public CommentPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.e = "";
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n5j.S, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(n5j.T, 0);
        if (resourceId != 0) {
            this.e = context.getString(resourceId);
        } else {
            this.e = typedArrayObtainStyledAttributes.getText(n5j.T);
        }
        i(typedArrayObtainStyledAttributes.getBoolean(n5j.y, false));
        h(typedArrayObtainStyledAttributes.getBoolean(n5j.x, false));
        k(typedArrayObtainStyledAttributes.getBoolean(n5j.z, false));
        typedArrayObtainStyledAttributes.recycle();
    }
}
