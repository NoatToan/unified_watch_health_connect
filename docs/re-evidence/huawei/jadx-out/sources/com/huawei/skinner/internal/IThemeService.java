package com.huawei.skinner.internal;

import android.graphics.drawable.Drawable;
import defpackage.pyr;

/* JADX INFO: loaded from: classes43.dex */
public interface IThemeService {
    int getCurrentAccentColor();

    int getCustomThemeColor();

    pyr getThemeInfo();

    Drawable themeBackground();

    void updateThemeInfo(pyr pyrVar);
}
