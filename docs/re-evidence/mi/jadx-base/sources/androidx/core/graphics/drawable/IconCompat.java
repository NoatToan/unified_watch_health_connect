package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.health.connect.client.records.metadata.DeviceTypes;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import defpackage.g6i;
import defpackage.l4h;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f2072k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int f2073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f2074b;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public byte[] c;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Parcelable d;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int e;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int f;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public ColorStateList g;
    public PorterDuff.Mode h;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String i;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String j;

    @RequiresApi(23)
    public static class a {
        public static IconCompat a(Object obj) {
            g6i.g(obj);
            int iD = d(obj);
            if (iD == 2) {
                return IconCompat.k(null, c(obj), b(obj));
            }
            if (iD == 4) {
                return IconCompat.h(e(obj));
            }
            if (iD == 6) {
                return IconCompat.e(e(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f2074b = obj;
            return iconCompat;
        }

        public static int b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return 0;
            }
        }

        public static String c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }

        public static int d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                return -1;
            } catch (NoSuchMethodException unused2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to get icon type ");
                sb2.append(obj);
                return -1;
            } catch (InvocationTargetException unused3) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unable to get icon type ");
                sb3.append(obj);
                return -1;
            }
        }

        public static Uri e(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }

        public static Drawable f(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        public static Icon g(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            switch (iconCompat.f2073a) {
                case -1:
                    return (Icon) iconCompat.f2074b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f2074b);
                    break;
                case 2:
                    iconCreateWithBitmap = Icon.createWithResource(iconCompat.n(), iconCompat.e);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f2074b, iconCompat.e, iconCompat.f);
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f2074b);
                    break;
                case 5:
                    iconCreateWithBitmap = b.b((Bitmap) iconCompat.f2074b);
                    break;
                case 6:
                    if (Build.VERSION.SDK_INT >= 30) {
                        iconCreateWithBitmap = d.a(iconCompat.p());
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.p());
                        }
                        InputStream inputStreamQ = iconCompat.q(context);
                        if (inputStreamQ == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.p());
                        }
                        iconCreateWithBitmap = b.b(BitmapFactory.decodeStream(inputStreamQ));
                    }
                    break;
            }
            ColorStateList colorStateList = iconCompat.g;
            if (colorStateList != null) {
                iconCreateWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.h;
            if (mode != IconCompat.f2072k) {
                iconCreateWithBitmap.setTintMode(mode);
            }
            return iconCreateWithBitmap;
        }
    }

    @RequiresApi(26)
    public static class b {
        public static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        public static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    @RequiresApi(28)
    public static class c {
        public static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        public static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        public static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        public static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    @RequiresApi(30)
    public static class d {
        public static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public IconCompat() {
        this.f2073a = -1;
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = f2072k;
        this.i = null;
    }

    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static IconCompat b(Icon icon) {
        return a.a(icon);
    }

    @VisibleForTesting
    public static Bitmap c(Bitmap bitmap, boolean z) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f = iMin;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat d(Bitmap bitmap) {
        l4h.c(bitmap);
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.f2074b = bitmap;
        return iconCompat;
    }

    public static IconCompat e(Uri uri) {
        l4h.c(uri);
        return f(uri.toString());
    }

    public static IconCompat f(String str) {
        l4h.c(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f2074b = str;
        return iconCompat;
    }

    public static IconCompat g(Bitmap bitmap) {
        l4h.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f2074b = bitmap;
        return iconCompat;
    }

    public static IconCompat h(Uri uri) {
        l4h.c(uri);
        return i(uri.toString());
    }

    public static IconCompat i(String str) {
        l4h.c(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f2074b = str;
        return iconCompat;
    }

    public static IconCompat j(Context context, int i) {
        l4h.c(context);
        return k(context.getResources(), context.getPackageName(), i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static IconCompat k(Resources resources, String str, int i) {
        l4h.c(str);
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.e = i;
        if (resources != null) {
            try {
                iconCompat.f2074b = resources.getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f2074b = str;
        }
        iconCompat.j = str;
        return iconCompat;
    }

    public static String w(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return DeviceTypes.UNKNOWN;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Bitmap l() {
        int i = this.f2073a;
        if (i == -1) {
            Object obj = this.f2074b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i == 1) {
            return (Bitmap) this.f2074b;
        }
        if (i == 5) {
            return c((Bitmap) this.f2074b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public int m() {
        int i = this.f2073a;
        if (i == -1) {
            return a.b(this.f2074b);
        }
        if (i == 2) {
            return this.e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String n() {
        int i = this.f2073a;
        if (i == -1) {
            return a.c(this.f2074b);
        }
        if (i == 2) {
            String str = this.j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f2074b).split(":", -1)[0] : this.j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int o() {
        int i = this.f2073a;
        return i == -1 ? a.d(this.f2074b) : i;
    }

    public Uri p() {
        int i = this.f2073a;
        if (i == -1) {
            return a.e(this.f2074b);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f2074b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public InputStream q(Context context) {
        Uri uriP = p();
        String scheme = uriP.getScheme();
        if (MiuiCursorConstants.CONTENT.equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriP);
            } catch (Exception unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to load image from URI: ");
                sb.append(uriP);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f2074b));
        } catch (FileNotFoundException unused2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to load image from path: ");
            sb2.append(uriP);
            return null;
        }
    }

    public void r() {
        this.h = PorterDuff.Mode.valueOf(this.i);
        switch (this.f2073a) {
            case -1:
                Parcelable parcelable = this.d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f2074b = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.d;
                if (parcelable2 != null) {
                    this.f2074b = parcelable2;
                    return;
                }
                byte[] bArr = this.c;
                this.f2074b = bArr;
                this.f2073a = 3;
                this.e = 0;
                this.f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.c, Charset.forName(HTTP.UTF_16));
                this.f2074b = str;
                if (this.f2073a == 2 && this.j == null) {
                    this.j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f2074b = this.c;
                return;
        }
    }

    public void s(boolean z) {
        this.i = this.h.name();
        switch (this.f2073a) {
            case -1:
                if (z) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.d = (Parcelable) this.f2074b;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z) {
                    this.d = (Parcelable) this.f2074b;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f2074b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.c = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.c = ((String) this.f2074b).getBytes(Charset.forName(HTTP.UTF_16));
                return;
            case 3:
                this.c = (byte[]) this.f2074b;
                return;
            case 4:
            case 6:
                this.c = this.f2074b.toString().getBytes(Charset.forName(HTTP.UTF_16));
                return;
        }
    }

    public Bundle t() {
        Bundle bundle = new Bundle();
        switch (this.f2073a) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.f2074b);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.f2074b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.f2074b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f2074b);
                break;
        }
        bundle.putInt("type", this.f2073a);
        bundle.putInt("int1", this.e);
        bundle.putInt("int2", this.f);
        bundle.putString("string1", this.j);
        ColorStateList colorStateList = this.g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.h;
        if (mode != f2072k) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    public String toString() {
        if (this.f2073a == -1) {
            return String.valueOf(this.f2074b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(w(this.f2073a));
        switch (this.f2073a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f2074b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f2074b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.e);
                if (this.f != 0) {
                    sb.append(" off=");
                    sb.append(this.f);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f2074b);
                break;
        }
        if (this.g != null) {
            sb.append(" tint=");
            sb.append(this.g);
        }
        if (this.h != f2072k) {
            sb.append(" mode=");
            sb.append(this.h);
        }
        sb.append(")");
        return sb.toString();
    }

    @RequiresApi(23)
    @Deprecated
    public Icon u() {
        return v(null);
    }

    @RequiresApi(23)
    public Icon v(Context context) {
        return a.g(this, context);
    }

    public IconCompat(int i) {
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = f2072k;
        this.i = null;
        this.f2073a = i;
    }
}
