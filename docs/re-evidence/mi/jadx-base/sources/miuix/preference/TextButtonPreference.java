package miuix.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import defpackage.d3j;
import defpackage.eii;
import defpackage.g7i;
import defpackage.hm1;
import defpackage.n5j;
import defpackage.wki;

/* JADX INFO: loaded from: classes3.dex */
public class TextButtonPreference extends BasePreference {
    public int e;
    public View.OnClickListener f;

    public TextButtonPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n5j.w2, i, i2);
        this.e = typedArrayObtainStyledAttributes.getInt(n5j.x2, hm1.d(getContext(), R.attr.isLightTheme, true) ? context.getResources().getColor(wki.f38070b) : context.getResources().getColor(wki.f38069a));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // miuix.preference.BasePreference, androidx.preference.Preference
    public void onBindViewHolder(g7i g7iVar) {
        super.onBindViewHolder(g7iVar);
        View view = g7iVar.itemView;
        TextView textView = (TextView) view.findViewById(R.id.title);
        if (textView != null) {
            textView.setTextColor(this.e);
        }
        View.OnClickListener onClickListener = this.f;
        if (onClickListener != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f = onClickListener;
    }

    public TextButtonPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, d3j.c);
    }

    public TextButtonPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, eii.E);
    }
}
