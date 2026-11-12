package defpackage;

import android.content.Context;
import android.net.Uri;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class bpa extends dfj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Uri f4448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ReadableMap f4449b;
    public final AbstractDraweeControllerBuilder c;
    public final Object d;
    public float e = Float.NaN;
    public float f = Float.NaN;
    public int g = 0;

    public bpa(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, Object obj) {
        this.c = abstractDraweeControllerBuilder;
        this.d = obj;
    }

    public static Uri e(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return new Uri.Builder().scheme("res").path(String.valueOf(context.getResources().getIdentifier(str.toLowerCase(Locale.getDefault()).replace("-", RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR), "drawable", context.getPackageName()))).build();
    }

    @Override // defpackage.dfj
    public d8p a() {
        return new cpa(getThemedContext().getResources(), (int) Math.ceil(this.f), (int) Math.ceil(this.e), this.g, f(), d(), c(), b());
    }

    public Object b() {
        return this.d;
    }

    public AbstractDraweeControllerBuilder c() {
        return this.c;
    }

    public ReadableMap d() {
        return this.f4449b;
    }

    public Uri f() {
        return this.f4448a;
    }

    @Override // defpackage.pej, defpackage.oej
    public boolean isVirtual() {
        return true;
    }

    @iej(name = "headers")
    public void setHeaders(ReadableMap readableMap) {
        this.f4449b = readableMap;
    }

    @Override // defpackage.cbe
    public void setHeight(Dynamic dynamic) {
        if (dynamic.getType() != ReadableType.Number) {
            throw new JSApplicationIllegalArgumentException("Inline images must not have percentage based height");
        }
        this.f = (float) dynamic.asDouble();
    }

    @iej(name = "src")
    public void setSource(ReadableArray readableArray) {
        Uri uriE = null;
        String string = (readableArray == null || readableArray.size() == 0) ? null : readableArray.getMap(0).getString(SportRecordBundleKey.BUNDLE_PARAM_URI);
        if (string != null) {
            try {
                Uri uri = Uri.parse(string);
                try {
                    if (uri.getScheme() != null) {
                        uriE = uri;
                    }
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
            }
            if (uriE == null) {
                uriE = e(getThemedContext(), string);
            }
        }
        if (uriE != this.f4448a) {
            markUpdated();
        }
        this.f4448a = uriE;
    }

    @iej(name = "tintColor")
    public void setTintColor(int i) {
        this.g = i;
    }

    @Override // defpackage.cbe
    public void setWidth(Dynamic dynamic) {
        if (dynamic.getType() != ReadableType.Number) {
            throw new JSApplicationIllegalArgumentException("Inline images must not have percentage based width");
        }
        this.e = (float) dynamic.asDouble();
    }
}
