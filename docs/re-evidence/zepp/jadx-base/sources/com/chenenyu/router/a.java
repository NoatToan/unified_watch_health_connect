package com.chenenyu.router;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.util.SparseArray;
import androidx.annotation.AnimRes;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import com.chenenyu.router.util.RLog;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
abstract class a implements IRouter {
    public RouteRequest a;

    @Override // com.chenenyu.router.IRouter
    public IRouter activityOptionsBundle(Bundle bundle) {
        this.a.setActivityOptionsBundle(bundle);
        return this;
    }

    @Override // com.chenenyu.router.IRouter
    public IRouter addFlags(int i) {
        this.a.addFlags(i);
        return this;
    }

    @Override // com.chenenyu.router.IRouter
    public IRouter addInterceptors(String... strArr) {
        this.a.addInterceptors(strArr);
        return this;
    }

    @Override // com.chenenyu.router.IRouter
    public IRouter anim(@AnimRes int i, @AnimRes int i2) {
        this.a.setEnterAnim(i);
        this.a.setExitAnim(i2);
        return this;
    }

    @Override // com.chenenyu.router.IRouter
    public IRouter build(Uri uri) {
        this.a = new RouteRequest(uri);
        Bundle bundle = new Bundle();
        bundle.putString(Router.RAW_URI, uri == null ? null : uri.toString());
        this.a.setExtras(bundle);
        return this;
    }

    @Override // com.chenenyu.router.IRouter
    public IRouter callback(RouteCallback routeCallback) {
        this.a.setRouteCallback(routeCallback);
        return this;
    }

    @Override // com.chenenyu.router.IRouter
    public void go(Context context, RouteCallback routeCallback) {
        this.a.setRouteCallback(routeCallback);
        go(context);
    }

    @Override // com.chenenyu.router.IRouter
    public IRouter requestCode(int i) {
        this.a.setRequestCode(i);
        return this;
    }

    @Override // com.chenenyu.router.IRouter
    public IRouter setAction(String str) {
        this.a.setAction(str);
        return this;
    }

    @Override // com.chenenyu.router.IRouter
    public IRouter setData(Uri uri) {
        this.a.setData(uri);
        return this;
    }

    @Override // com.chenenyu.router.IRouter
    public IRouter setDataAndType(Uri uri, String str) {
        this.a.setData(uri);
        this.a.setType(str);
        return this;
    }

    @Override // com.chenenyu.router.IRouter
    public IRouter setType(String str) {
        this.a.setType(str);
        return this;
    }

    @Override // com.chenenyu.router.IRouter
    public IRouter skipImplicitMatcher() {
        this.a.setSkipImplicitMatcher(true);
        return this;
    }

    @Override // com.chenenyu.router.IRouter
    public IRouter skipInterceptors() {
        this.a.setSkipInterceptors(true);
        return this;
    }

    @Override // com.chenenyu.router.IRouter
    public IRouter with(Bundle bundle) {
        if (bundle != null && !bundle.isEmpty()) {
            Bundle extras = this.a.getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            extras.putAll(bundle);
            this.a.setExtras(extras);
        }
        return this;
    }

    @Override // com.chenenyu.router.IRouter
    public IRouter skipInterceptors(String... strArr) {
        this.a.removeInterceptors(strArr);
        return this;
    }

    @Override // com.chenenyu.router.IRouter
    public void go(Fragment fragment, RouteCallback routeCallback) {
        this.a.setRouteCallback(routeCallback);
        go(fragment);
    }

    @Override // com.chenenyu.router.IRouter
    public IRouter build(@NonNull RouteRequest routeRequest) {
        this.a = routeRequest;
        Bundle extras = routeRequest.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.putString(Router.RAW_URI, routeRequest.getUri().toString());
        this.a.setExtras(extras);
        return this;
    }

    @Override // com.chenenyu.router.IRouter
    @RequiresApi(21)
    public IRouter with(PersistableBundle persistableBundle) {
        if (persistableBundle != null && !persistableBundle.isEmpty()) {
            Bundle extras = this.a.getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            extras.putAll(persistableBundle);
            this.a.setExtras(extras);
        }
        return this;
    }

    @Override // com.chenenyu.router.IRouter
    public IRouter with(String str, Object obj) {
        if (obj == null) {
            RLog.w("Ignored: The extra value is null.");
            return this;
        }
        Bundle extras = this.a.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        if (obj instanceof Bundle) {
            extras.putBundle(str, (Bundle) obj);
        } else if (obj instanceof Byte) {
            extras.putByte(str, ((Byte) obj).byteValue());
        } else if (obj instanceof Short) {
            extras.putShort(str, ((Short) obj).shortValue());
        } else if (obj instanceof Integer) {
            extras.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            extras.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof Character) {
            extras.putChar(str, ((Character) obj).charValue());
        } else if (obj instanceof Boolean) {
            extras.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            extras.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            extras.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof String) {
            extras.putString(str, (String) obj);
        } else if (obj instanceof CharSequence) {
            extras.putCharSequence(str, (CharSequence) obj);
        } else if (obj instanceof byte[]) {
            extras.putByteArray(str, (byte[]) obj);
        } else if (obj instanceof short[]) {
            extras.putShortArray(str, (short[]) obj);
        } else if (obj instanceof int[]) {
            extras.putIntArray(str, (int[]) obj);
        } else if (obj instanceof long[]) {
            extras.putLongArray(str, (long[]) obj);
        } else if (obj instanceof char[]) {
            extras.putCharArray(str, (char[]) obj);
        } else if (obj instanceof boolean[]) {
            extras.putBooleanArray(str, (boolean[]) obj);
        } else if (obj instanceof float[]) {
            extras.putFloatArray(str, (float[]) obj);
        } else if (obj instanceof double[]) {
            extras.putDoubleArray(str, (double[]) obj);
        } else if (obj instanceof String[]) {
            extras.putStringArray(str, (String[]) obj);
        } else if (obj instanceof CharSequence[]) {
            extras.putCharSequenceArray(str, (CharSequence[]) obj);
        } else if (obj instanceof IBinder) {
            if (Build.VERSION.SDK_INT >= 18) {
                extras.putBinder(str, (IBinder) obj);
            } else {
                RLog.e("putBinder() requires api 18.");
            }
        } else if (obj instanceof SparseArray) {
            extras.putSparseParcelableArray(str, (SparseArray) obj);
        } else if (obj instanceof Parcelable) {
            extras.putParcelable(str, (Parcelable) obj);
        } else if (obj instanceof Parcelable[]) {
            extras.putParcelableArray(str, (Parcelable[]) obj);
        } else if (obj instanceof Serializable) {
            extras.putSerializable(str, (Serializable) obj);
        } else {
            RLog.w("Unknown object type: " + obj.getClass().getName());
        }
        this.a.setExtras(extras);
        return this;
    }
}
