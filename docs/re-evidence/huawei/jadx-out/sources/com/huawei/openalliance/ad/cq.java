package com.huawei.openalliance.ad;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import com.huawei.openalliance.ad.beans.inner.CountryCodeBean;
import com.huawei.openalliance.ad.constant.OsType;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class cq extends cf {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static cr f18367c;
    private static final byte[] d = new byte[0];
    private CountryCodeBean e;

    @Override // com.huawei.openalliance.ad.cf, com.huawei.openalliance.ad.cr
    public boolean d() {
        return a();
    }

    @Override // com.huawei.openalliance.ad.cf, com.huawei.openalliance.ad.cr
    public boolean a(Context context) {
        boolean zHasSystemFeature;
        String str;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            zHasSystemFeature = ((Integer) cls.getMethod("getInt", String.class, Integer.TYPE).invoke(cls, "ro.miui.notch", 0)).intValue() != 0;
        } catch (Throwable th) {
            hw.c("ThirdDeviceImpl", "isNotchEnable mi Throwable:" + th.getClass().getSimpleName());
        }
        hw.a("ThirdDeviceImpl", "isNotchEnable xiaomi, hasNotch = %s", Boolean.valueOf(zHasSystemFeature));
        if (!zHasSystemFeature) {
            try {
                zHasSystemFeature = context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
            } catch (Throwable th2) {
                hw.c("ThirdDeviceImpl", "isNotchEnable oppo Throwable:" + th2.getClass().getSimpleName());
            }
        }
        hw.a("ThirdDeviceImpl", "isNotchEnable oppo, hasNotch = %s", Boolean.valueOf(zHasSystemFeature));
        if (!zHasSystemFeature) {
            try {
                Class<?> clsLoadClass = context.getClassLoader().loadClass("android.util.FtFeature");
                Method method = clsLoadClass.getMethod("isFeatureSupport", Integer.TYPE);
                ((Boolean) method.invoke(clsLoadClass, 32)).booleanValue();
                zHasSystemFeature = ((Boolean) method.invoke(clsLoadClass, 8)).booleanValue();
            } catch (ClassNotFoundException unused) {
                str = "hasNotchAtVivo ClassNotFoundException";
                hw.d("Notch", str);
            } catch (NoSuchMethodException unused2) {
                str = "hasNotchAtVivo NoSuchMethodException";
                hw.d("Notch", str);
            } catch (Exception unused3) {
                str = "hasNotchAtVivo Exception";
                hw.d("Notch", str);
            }
        }
        hw.a("ThirdDeviceImpl", "isNotchEnable vivo, hasNotch = %s", Boolean.valueOf(zHasSystemFeature));
        return zHasSystemFeature;
    }

    @Override // com.huawei.openalliance.ad.cf, com.huawei.openalliance.ad.cr
    public boolean a() {
        String strB = com.huawei.openalliance.ad.utils.da.a().b();
        if (TextUtils.isEmpty(strB)) {
            strB = this.e.a();
        }
        return "CN".equalsIgnoreCase(strB);
    }

    @Override // com.huawei.openalliance.ad.cf, com.huawei.openalliance.ad.cr
    public int a(View view) {
        int identifier;
        DisplayCutout displayCutout;
        int dimensionPixelSize = -1;
        if (view == null) {
            return -1;
        }
        try {
            if (Build.VERSION.SDK_INT >= 28 && view.getRootWindowInsets() != null && (displayCutout = view.getRootWindowInsets().getDisplayCutout()) != null) {
                List boundingRects = displayCutout.getBoundingRects();
                if (!com.huawei.openalliance.ad.utils.bm.a(boundingRects)) {
                    dimensionPixelSize = ((Rect) boundingRects.get(0)).height();
                }
            }
            if (dimensionPixelSize < 0 && (identifier = this.f18346a.getResources().getIdentifier("notch_height", "dimen", OsType.ANDROID)) > 0) {
                dimensionPixelSize = this.f18346a.getResources().getDimensionPixelSize(identifier);
            }
            if (dimensionPixelSize < 0) {
                int identifier2 = this.f18346a.getResources().getIdentifier("status_bar_height", "dimen", OsType.ANDROID);
                if (identifier2 > 0) {
                    dimensionPixelSize = this.f18346a.getResources().getDimensionPixelSize(identifier2);
                }
                if (dimensionPixelSize == 0) {
                    return 110;
                }
            }
            return dimensionPixelSize;
        } catch (Throwable th) {
            hw.b("ThirdDeviceImpl", "getNotchHeight err: %s", th.getClass().getSimpleName());
            return dimensionPixelSize;
        }
    }

    private static cr c(Context context) {
        cr crVar;
        synchronized (d) {
            if (f18367c == null) {
                f18367c = new cq(context);
            }
            crVar = f18367c;
        }
        return crVar;
    }

    public static cr b(Context context) {
        return c(context);
    }

    protected cq(Context context) {
        super(context);
        this.e = new CountryCodeBean(context);
    }
}
