package ohos.ace.adapter;

import android.content.Context;

/* JADX INFO: loaded from: classes20.dex */
public class WindowViewBuilder {
    public static WindowViewAospInterface makeWindowViewAosp(Context context, int i, boolean z) {
        if (z) {
            return new WindowViewAospSurface(context, i);
        }
        return new WindowViewAospTexture(context, i);
    }

    public static WindowViewInterface makeWindowView(Context context, boolean z) {
        if (z) {
            return new WindowViewSurface(context);
        }
        return new WindowViewTexture(context);
    }
}
