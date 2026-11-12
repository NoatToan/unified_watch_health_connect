package defpackage;

import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes7.dex */
public class rv6 {
    public static void a(Dialog dialog) {
        View viewFindViewById;
        ViewGroup viewGroup;
        if (dialog == null || (viewFindViewById = dialog.getWindow().findViewById(vsi.T)) == null || (viewGroup = (ViewGroup) viewFindViewById.findViewById(vsi.q0)) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        new ViewGroup.MarginLayoutParams(layoutParams).bottomMargin = 0;
        viewGroup.setLayoutParams(layoutParams);
    }
}
