package com.huawei.health.h5pro.service.theme;

import android.content.res.Resources;
import android.util.TypedValue;
import androidx.core.view.ViewCompat;
import com.huawei.health.h5pro.service.H5ProServiceLiveTerm;
import com.huawei.health.h5pro.service.anotation.H5ProMethod;
import com.huawei.health.h5pro.service.anotation.H5ProService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@H5ProService(liveTerm = H5ProServiceLiveTerm.WEB_VIEW, name = "theme")
public class ThemeSvc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f6980a = new int[0];
    private static final int[] e = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Resources f6981c;

    public ThemeSvc(Resources resources) {
        this.f6981c = resources;
    }

    private float e(float f) {
        return TypedValue.applyDimension(1, f, this.f6981c.getDisplayMetrics());
    }

    @H5ProMethod
    public ArrayList<Map<String, String>> getAttrs() {
        ArrayList<Map<String, String>> arrayList = new ArrayList<>();
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = f6980a;
            if (i2 >= iArr.length) {
                break;
            }
            HashMap map = new HashMap();
            map.put("k", "--" + this.f6981c.getResourceEntryName(iArr[i2]));
            map.put("v", String.format("#%06X", Integer.valueOf(this.f6981c.getColor(iArr[i2]) & ViewCompat.MEASURED_SIZE_MASK)));
            arrayList.add(map);
            i2++;
        }
        while (true) {
            int[] iArr2 = e;
            if (i >= iArr2.length) {
                return arrayList;
            }
            HashMap map2 = new HashMap();
            map2.put("k", "--" + this.f6981c.getResourceEntryName(iArr2[i]));
            map2.put("v", Float.valueOf(e(this.f6981c.getDimension(iArr2[i]))).toString() + "px");
            arrayList.add(map2);
            i++;
        }
    }
}
