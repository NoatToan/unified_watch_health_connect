package defpackage;

import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes20.dex */
public class xed {
    public static void d(ViewParent viewParent) {
        if (viewParent != null && (viewParent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) viewParent;
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
    }
}
