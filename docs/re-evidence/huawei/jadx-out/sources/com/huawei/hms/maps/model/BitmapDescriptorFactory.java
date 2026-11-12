package com.huawei.hms.maps.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.RemoteException;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.maps.mad;
import com.huawei.hms.maps.mag;
import com.huawei.hms.maps.maj;
import com.huawei.hms.maps.mar;
import com.huawei.hms.maps.mas;
import com.huawei.hms.maps.model.internal.IBitmapDescriptorDelegate;
import com.huawei.hms.maps.utils.LogM;

/* JADX INFO: loaded from: classes10.dex */
public final class BitmapDescriptorFactory {
    public static final float HUE_AZURE = 210.0f;
    public static final float HUE_BLUE = 240.0f;
    public static final float HUE_CYAN = 180.0f;
    public static final float HUE_GREEN = 120.0f;
    public static final float HUE_MAGENTA = 300.0f;
    public static final float HUE_ORANGE = 30.0f;
    public static final float HUE_RED = 0.0f;
    public static final float HUE_ROSE = 330.0f;
    public static final float HUE_VIOLET = 270.0f;
    public static final float HUE_YELLOW = 60.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static IBitmapDescriptorDelegate f14213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Context f14214b;

    public static BitmapDescriptor defaultMarker() {
        IBitmapDescriptorDelegate iBitmapDescriptorDelegate = f14213a;
        if (iBitmapDescriptorDelegate == null) {
            LogM.w("BitmapDescriptorFactory", "defaultMarker null == IBitmapDescriptorDelegate");
            return null;
        }
        try {
            IObjectWrapper iObjectWrapperDefaultMarker = iBitmapDescriptorDelegate.defaultMarker();
            if (iObjectWrapperDefaultMarker != null) {
                return new BitmapDescriptor(iObjectWrapperDefaultMarker);
            }
            LogM.w("BitmapDescriptorFactory", "defaultMarker null == objectWrapper");
            return null;
        } catch (RemoteException unused) {
            LogM.e("BitmapDescriptorFactory", "defaultMarker error");
        }
    }

    public static BitmapDescriptor defaultMarker(float f) {
        IBitmapDescriptorDelegate iBitmapDescriptorDelegate = f14213a;
        if (iBitmapDescriptorDelegate == null) {
            LogM.w("BitmapDescriptorFactory", "defaultMarker hue null == IBitmapDescriptorDelegate");
            return null;
        }
        try {
            IObjectWrapper iObjectWrapperDefaultMarkerWithHue = iBitmapDescriptorDelegate.defaultMarkerWithHue(f);
            if (iObjectWrapperDefaultMarkerWithHue != null) {
                return new BitmapDescriptor(iObjectWrapperDefaultMarkerWithHue);
            }
            LogM.w("BitmapDescriptorFactory", "defaultMarker hue null == objectWrapper");
            return null;
        } catch (RemoteException unused) {
            LogM.e("BitmapDescriptorFactory", "defaultMarkerWithHue error");
        }
    }

    public static void setIBitmapDescriptorDelegate(IBitmapDescriptorDelegate iBitmapDescriptorDelegate) {
        f14213a = iBitmapDescriptorDelegate;
    }

    public static void setContext(Context context) {
        if (f14214b == null) {
            f14214b = context == null ? null : context.getApplicationContext();
        }
    }

    public static BitmapDescriptor fromResource(int i) {
        Bitmap bitmapA;
        try {
            bitmapA = new mas(i).a(f14214b);
        } catch (NullPointerException unused) {
            LogM.e("BitmapDescriptorFactory", "the sContext is null");
            bitmapA = null;
        }
        return new BitmapDescriptor(ObjectWrapper.wrap(bitmapA));
    }

    public static BitmapDescriptor fromPath(String str) {
        Bitmap bitmapA;
        try {
            bitmapA = new mar(str).a(f14214b);
        } catch (NullPointerException unused) {
            LogM.e("BitmapDescriptorFactory", "the sContext is null");
            bitmapA = null;
        }
        return new BitmapDescriptor(ObjectWrapper.wrap(bitmapA));
    }

    public static BitmapDescriptor fromFile(String str) {
        Bitmap bitmapA;
        try {
            bitmapA = new maj(str).a(f14214b);
        } catch (NullPointerException unused) {
            LogM.e("BitmapDescriptorFactory", "the sContext is null");
            bitmapA = null;
        }
        return new BitmapDescriptor(ObjectWrapper.wrap(bitmapA));
    }

    public static BitmapDescriptor fromBitmap(Bitmap bitmap) {
        Bitmap bitmapA;
        try {
            bitmapA = new mag(bitmap).a(f14214b);
        } catch (NullPointerException unused) {
            LogM.e("BitmapDescriptorFactory", "the sContext is null");
            bitmapA = null;
        }
        return new BitmapDescriptor(ObjectWrapper.wrap(bitmapA));
    }

    public static BitmapDescriptor fromAsset(String str) {
        Bitmap bitmapA;
        try {
            bitmapA = new mad(str).a(f14214b);
        } catch (NullPointerException unused) {
            LogM.e("BitmapDescriptorFactory", "the sContext is null");
            bitmapA = null;
        }
        return new BitmapDescriptor(ObjectWrapper.wrap(bitmapA));
    }
}
