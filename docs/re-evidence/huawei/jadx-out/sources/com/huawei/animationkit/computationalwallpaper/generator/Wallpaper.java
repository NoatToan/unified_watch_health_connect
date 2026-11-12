package com.huawei.animationkit.computationalwallpaper.generator;

import android.graphics.Bitmap;
import android.os.Parcelable;
import defpackage.bdo;
import java.io.File;

/* JADX INFO: loaded from: classes23.dex */
public interface Wallpaper extends Parcelable {
    WatchFaceClock getClock();

    String getTag();

    void save(File file) throws bdo;

    Bitmap toBitmap();
}
