package com.xmlywind.windad.natives;

import android.content.Context;
import android.view.View;
import com.xmlywind.windad.natives.NativeADData;

/* JADX INFO: loaded from: classes22.dex */
public interface WindNativeAdRender<T extends NativeADData> {
    View createView(Context context, int i);

    void renderAdView(View view, T t);
}
