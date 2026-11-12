package com.huawei.openalliance.ad;

import android.content.Context;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes41.dex */
public class uc {
    public static void a(Context context, int i, com.huawei.openalliance.ad.views.i iVar, ImageView imageView, int i2, int i3) {
        int viewWith;
        int viewWith2;
        hw.b("PPSDialogUtil", "getRealOrientation orientation %s", Integer.valueOf(i));
        if (context == null || iVar == null || imageView == null) {
            hw.c("PPSDialogUtil", "param is invalid, return");
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) iVar.getLayoutParams();
        int iAbs = Math.abs((int) imageView.getX());
        int iA = com.huawei.openalliance.ad.utils.as.a(context, 36.0f);
        int i4 = (iA >> 1) + iAbs;
        double d = ((double) iA) * 0.5d;
        int viewWidthPercent = (int) ((((double) (i2 * (1.0f - iVar.getViewWidthPercent()))) * 0.5d) + ((double) com.huawei.openalliance.ad.utils.as.a(context, 16.0f)) + d);
        int viewWidthPercent2 = (int) (((((double) i2) * ((((double) iVar.getViewWidthPercent()) * 0.5d) + 0.5d)) - ((double) com.huawei.openalliance.ad.utils.as.a(context, 16.0f))) - d);
        hw.a("PPSDialogUtil", "locationX: %s, locationX2: %s", Integer.valueOf(viewWidthPercent), Integer.valueOf(viewWidthPercent2));
        hw.a("PPSDialogUtil", "curImgX: %s, curImgWidth: %s, curImgCenter: %s", Integer.valueOf(iAbs), Integer.valueOf(iA), Integer.valueOf(i4));
        if (1 != i && 9 != i) {
            layoutParams.removeRule(14);
            iVar.setLayoutParams(layoutParams);
            if (i4 >= i2 / 3) {
                if (i4 < (i2 * 2) / 3) {
                    viewWith2 = i4 - (iVar.getViewWith() >> 1);
                } else {
                    iAbs = iAbs + iA + com.huawei.openalliance.ad.utils.as.a(context, 16.0f);
                    viewWith = iVar.getViewWith();
                }
                iVar.setPaddingStart(viewWith2 - com.huawei.openalliance.ad.utils.as.a(context, i3));
                return;
            }
            viewWith = com.huawei.openalliance.ad.utils.as.a(context, 16.0f);
            viewWith2 = iAbs - viewWith;
            iVar.setPaddingStart(viewWith2 - com.huawei.openalliance.ad.utils.as.a(context, i3));
            return;
        }
        if (i4 < viewWidthPercent) {
            hw.a("PPSDialogUtil", "curImgCenter < locationX");
            layoutParams.removeRule(14);
            iVar.setLayoutParams(layoutParams);
            iVar.setPaddingStart((iAbs - com.huawei.openalliance.ad.utils.as.a(context, 16.0f)) - com.huawei.openalliance.ad.utils.as.a(context, i3));
            return;
        }
        if (i4 <= viewWidthPercent2) {
            hw.a("PPSDialogUtil", "locationX =< curImgCenter =< locationX2");
            layoutParams.addRule(14);
            iVar.setLayoutParams(layoutParams);
        } else {
            hw.a("PPSDialogUtil", "curImgCenter > locationX2");
            layoutParams.removeRule(14);
            iVar.setLayoutParams(layoutParams);
            int iA2 = ((iAbs + iA) + com.huawei.openalliance.ad.utils.as.a(context, 16.0f)) - iVar.getViewWith();
            hw.a("PPSDialogUtil", "paddingStart: %s", Integer.valueOf(iA2));
            iVar.setPaddingStart(iA2 - com.huawei.openalliance.ad.utils.as.a(context, i3));
        }
    }

    public static void a(Context context, int i, com.huawei.openalliance.ad.views.i iVar, ImageView imageView, int i2) {
        a(context, i, iVar, imageView, i2, 0);
    }
}
