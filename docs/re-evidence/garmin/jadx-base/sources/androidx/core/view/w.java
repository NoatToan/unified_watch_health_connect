package androidx.core.view;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public interface w {
    void onNestedPreScroll(View view2, int i14, int i15, int[] iArr, int i16);

    void onNestedScroll(View view2, int i14, int i15, int i16, int i17, int i18);

    void onNestedScrollAccepted(View view2, View view3, int i14, int i15);

    boolean onStartNestedScroll(View view2, View view3, int i14, int i15);

    void onStopNestedScroll(View view2, int i14);
}
