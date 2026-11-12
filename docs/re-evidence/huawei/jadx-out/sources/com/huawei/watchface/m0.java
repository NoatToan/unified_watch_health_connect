package com.huawei.watchface;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.huawei.watchface.utils.ColorPickerUtil;
import com.huawei.watchface.utils.HwLog;

/* JADX INFO: loaded from: classes45.dex */
public abstract class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f30298a = "m0";

    public static int a(Bitmap bitmap, Rect rect) {
        if (bitmap == null || rect == null) {
            HwLog.w(f30298a, "obtainWidgetColor -- bitmap or rect is null!");
            return -1;
        }
        int iA = ColorPickerUtil.a(bitmap, rect);
        HwLog.i(f30298a, "pickedColor ===  " + iA);
        return iA;
    }
}
