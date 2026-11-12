package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.health.connect.client.records.OvulationTestRecord;
import com.bumptech.glide.Priority;
import com.dylanvann.fastimage.FastImageCacheControl;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.miui.tsmclient.database.DatabaseConstants;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.passport.jsb.PassportJsbWebViewPageConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class fa9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Drawable f17592a = new ColorDrawable(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<String, FastImageCacheControl> f17593b = new a();
    public static final Map<String, Priority> c = new b();
    public static final Map<String, ImageView.ScaleType> d = new c();

    public class a extends HashMap<String, FastImageCacheControl> {
        public a() {
            put("immutable", FastImageCacheControl.IMMUTABLE);
            put(PassportJsbWebViewPageConfig.ActionBarConfig.VAL_ACTION_BAR_STYLE_WEB, FastImageCacheControl.WEB);
            put("cacheOnly", FastImageCacheControl.CACHE_ONLY);
        }
    }

    public class b extends HashMap<String, Priority> {
        public b() {
            put("low", Priority.LOW);
            put("normal", Priority.NORMAL);
            put(OvulationTestRecord.Result.HIGH, Priority.HIGH);
        }
    }

    public class c extends HashMap<String, ImageView.ScaleType> {
        public c() {
            put("contain", ImageView.ScaleType.FIT_CENTER);
            put("cover", ImageView.ScaleType.CENTER_CROP);
            put("stretch", ImageView.ScaleType.FIT_XY);
            put("center", ImageView.ScaleType.CENTER_INSIDE);
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17594a;

        static {
            int[] iArr = new int[FastImageCacheControl.values().length];
            f17594a = iArr;
            try {
                iArr[FastImageCacheControl.WEB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17594a[FastImageCacheControl.CACHE_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17594a[FastImageCacheControl.IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static FastImageCacheControl a(ReadableMap readableMap) {
        return (FastImageCacheControl) h(DatabaseConstants.TABLE_CACHE, "immutable", f17593b, readableMap);
    }

    public static dmb b(ReadableMap readableMap) {
        dmb dmbVar = dmb.f15684b;
        if (!readableMap.hasKey("headers")) {
            return dmbVar;
        }
        ReadableMap map = readableMap.getMap("headers");
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
        nee.a aVar = new nee.a();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            aVar.b(strNextKey, map.getString(strNextKey));
        }
        return aVar.c();
    }

    public static ea9 c(Context context, ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        return new ea9(context, readableMap.getString(SportRecordBundleKey.BUNDLE_PARAM_URI), b(readableMap));
    }

    public static vok d(Context context, ea9 ea9Var, ReadableMap readableMap) {
        Priority priorityE = e(readableMap);
        FastImageCacheControl fastImageCacheControlA = a(readableMap);
        jy6 jy6Var = jy6.e;
        int i = d.f17594a[fastImageCacheControlA.ordinal()];
        boolean z = true;
        boolean z2 = false;
        if (i == 1) {
            jy6Var = jy6.f23239b;
            z2 = true;
            z = false;
        } else if (i != 2) {
            z = false;
        }
        vok vokVarX = new vok().e(jy6Var).Q(z).f0(z2).Y(priorityE).X(f17592a);
        return ea9Var.f() ? vokVarX.a(vok.n0(xi1.c(context))) : vokVarX;
    }

    public static Priority e(ReadableMap readableMap) {
        return (Priority) h("priority", "normal", c, readableMap);
    }

    public static ImageView.ScaleType f(String str) {
        return (ImageView.ScaleType) g("resizeMode", "cover", d, str);
    }

    public static <T> T g(String str, String str2, Map<String, T> map, String str3) {
        if (str3 != null) {
            str2 = str3;
        }
        T t = map.get(str2);
        if (t != null) {
            return t;
        }
        throw new JSApplicationIllegalArgumentException("FastImage, invalid " + str + " : " + str2);
    }

    public static <T> T h(String str, String str2, Map<String, T> map, ReadableMap readableMap) {
        String string = null;
        if (readableMap != null) {
            try {
                string = readableMap.getString(str);
            } catch (NoSuchKeyException unused) {
            }
        }
        return (T) g(str, str2, map, string);
    }
}
