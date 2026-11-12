package com.xmlywind.windad.natives;

import com.xmlywind.windad.WindAdError;

/* JADX INFO: loaded from: classes22.dex */
public interface NativeADEventListener {
    void onADClicked();

    void onADError(WindAdError windAdError);

    void onADExposed();

    void onADStatusChanged(String str);
}
