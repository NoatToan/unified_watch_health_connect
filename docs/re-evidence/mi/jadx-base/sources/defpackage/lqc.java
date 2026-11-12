package defpackage;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public interface lqc {
    void bindViewWithContentInset(View view);

    Rect getContentInset();

    void onContentInsetChanged(Rect rect);

    void onDispatchNestedScrollOffset(int[] iArr);

    boolean requestDispatchContentInset();
}
