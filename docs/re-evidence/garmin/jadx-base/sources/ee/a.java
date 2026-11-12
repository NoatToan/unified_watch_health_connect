package ee;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes7.dex */
public class a {
    private a() {
    }

    public static View a(int i14, View view2) {
        if (!(view2 instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view2;
        int childCount = viewGroup.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View viewFindViewById = viewGroup.getChildAt(i15).findViewById(i14);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }
}
