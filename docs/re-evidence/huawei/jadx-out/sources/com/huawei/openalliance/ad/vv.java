package com.huawei.openalliance.ad;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.huawei.openalliance.ad.constant.MapKeyNames;

/* JADX INFO: loaded from: classes12.dex */
public class vv extends ty {
    private static String d(View view) {
        StringBuilder sb = new StringBuilder();
        int width = view.getWidth();
        int height = view.getHeight();
        sb.append(width);
        sb.append("*");
        sb.append(height);
        String string = sb.toString();
        hw.b("ShowTrackerUtil", "adViewCreativeSize: %s", string);
        return string;
    }

    private static String c(View view) {
        ViewParent parent = view.getParent();
        for (int i = 0; i < 5 && parent != null; i++) {
            if (a(parent)) {
                return d((ViewGroup) parent);
            }
            parent = parent.getParent();
        }
        return null;
    }

    public static String b(View view) {
        if (view == null) {
            return null;
        }
        return a(view) ? c(view) : d(view);
    }

    public static String b(Bundle bundle) {
        String strOptString = com.huawei.openalliance.ad.utils.dg.b(bundle).optString(MapKeyNames.SLOT_POSITION, "");
        if (!com.huawei.openalliance.ad.utils.dg.q(strOptString)) {
            strOptString = null;
        }
        hw.a("ShowTrackerUtil", "slotPosition: %s", strOptString);
        return strOptString;
    }

    public static String a(Bundle bundle) {
        String strOptString = com.huawei.openalliance.ad.utils.dg.b(bundle).optString(MapKeyNames.CREATIVE_SIZE, "");
        if (!com.huawei.openalliance.ad.utils.dg.r(strOptString)) {
            strOptString = null;
        }
        hw.a("ShowTrackerUtil", "creativeSize: %s", strOptString);
        return strOptString;
    }
}
