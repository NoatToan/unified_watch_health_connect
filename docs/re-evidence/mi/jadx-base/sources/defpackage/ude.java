package defpackage;

import android.R;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public class ude {
    public static void a(Resources resources, View view, int i) {
        TextView textView;
        if (view == null || resources == null || (textView = (TextView) view.findViewById(R.id.input)) == null) {
            return;
        }
        float dimensionPixelSize = resources.getDimensionPixelSize(dmi.q0);
        float f = resources.getDisplayMetrics().density;
        float f2 = dimensionPixelSize / f;
        float textSize = textView.getTextSize() / f;
        float f3 = i;
        if (textSize <= f3 || f2 <= f3) {
            return;
        }
        textView.setTextSize(1, f3);
    }
}
