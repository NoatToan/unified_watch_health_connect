package xz2;

import android.R;
import android.content.Context;
import android.util.TypedValue;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes3.dex */
public class m extends ImageView {
    public m(Context context) {
        super(context);
        int identifier = context.getResources().getIdentifier("selectableItemBackgroundBorderless", "attr", context.getPackageName());
        identifier = identifier == 0 ? R.attr.selectableItemBackgroundBorderless : identifier;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(identifier, typedValue, true);
        setBackgroundResource(typedValue.resourceId);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z14) {
        super.setEnabled(z14);
        setAlpha(z14 ? 1.0f : 0.1f);
    }
}
