package com.xmlywind.sdk.common.e;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import com.autonavi.amap.mapcore.tools.GlMapUtil;

/* JADX INFO: loaded from: classes22.dex */
class e extends com.xmlywind.volley.toolbox.k {
    private final int a;

    public e(com.xmlywind.volley.m mVar, Context context, com.xmlywind.volley.toolbox.k.b bVar) {
        int iMin;
        super(mVar, bVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            iMin = GlMapUtil.DEVICE_DISPLAY_DPI_HIGH;
        } else {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            iMin = Math.min(point.x, point.y);
        }
        this.a = iMin;
    }

    @Override // com.xmlywind.volley.toolbox.k
    public com.xmlywind.volley.toolbox.k.c a(String str, com.xmlywind.volley.toolbox.k.d dVar) {
        return super.a(str, dVar, this.a, 0);
    }
}
