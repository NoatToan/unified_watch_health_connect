package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.room.a0;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.garmin.android.gncs.NotificationConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.l;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import n23.j;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f6391k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f6393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f6394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f6395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f6398g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f6399h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f6400i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f6401j;

    public static class a {
        private a() {
        }

        public static IconCompat a(Icon icon) {
            icon.getClass();
            int type = icon.getType();
            if (type == 2) {
                return IconCompat.c(null, icon.getResPackage(), icon.getResId());
            }
            if (type == 4) {
                Uri uri = icon.getUri();
                PorterDuff.Mode mode = IconCompat.f6391k;
                uri.getClass();
                String string = uri.toString();
                string.getClass();
                IconCompat iconCompat = new IconCompat(4);
                iconCompat.f6393b = string;
                return iconCompat;
            }
            if (type != 6) {
                IconCompat iconCompat2 = new IconCompat(-1);
                iconCompat2.f6393b = icon;
                return iconCompat2;
            }
            Uri uri2 = icon.getUri();
            PorterDuff.Mode mode2 = IconCompat.f6391k;
            uri2.getClass();
            String string2 = uri2.toString();
            string2.getClass();
            IconCompat iconCompat3 = new IconCompat(6);
            iconCompat3.f6393b = string2;
            return iconCompat3;
        }
    }

    public static class b {
        private b() {
        }

        public static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f6392a = -1;
        this.f6394c = null;
        this.f6395d = null;
        this.f6396e = 0;
        this.f6397f = 0;
        this.f6398g = null;
        this.f6399h = f6391k;
        this.f6400i = null;
    }

    public static IconCompat b(Bundle bundle) {
        int i14 = bundle.getInt(NotificationConstants.KEY_DATA_MIME_TYPE);
        IconCompat iconCompat = new IconCompat(i14);
        iconCompat.f6396e = bundle.getInt("int1");
        iconCompat.f6397f = bundle.getInt("int2");
        iconCompat.f6401j = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.f6398g = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.f6399h = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i14) {
            case -1:
            case 1:
            case 5:
                iconCompat.f6393b = bundle.getParcelable("obj");
                return iconCompat;
            case 0:
            default:
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.f6393b = bundle.getString("obj");
                return iconCompat;
            case 3:
                iconCompat.f6393b = bundle.getByteArray("obj");
                return iconCompat;
        }
    }

    public static IconCompat c(Resources resources, String str, int i14) {
        str.getClass();
        if (i14 == 0) {
            h.s("Drawable resource ID must not be 0");
            return null;
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f6396e = i14;
        if (resources != null) {
            try {
                iconCompat.f6393b = resources.getResourceName(i14);
            } catch (Resources.NotFoundException unused) {
                h.s("Icon resource cannot be found");
                return null;
            }
        } else {
            iconCompat.f6393b = str;
        }
        iconCompat.f6401j = str;
        return iconCompat;
    }

    public final int d() {
        int i14 = this.f6392a;
        if (i14 == -1) {
            return ((Icon) this.f6393b).getResId();
        }
        if (i14 == 2) {
            return this.f6396e;
        }
        l.n(this, "called getResId() on ");
        return 0;
    }

    public final Uri e() {
        int i14 = this.f6392a;
        if (i14 == -1) {
            return ((Icon) this.f6393b).getUri();
        }
        if (i14 == 4 || i14 == 6) {
            return Uri.parse((String) this.f6393b);
        }
        l.n(this, "called getUri() on ");
        return null;
    }

    public final Icon f(Context context) {
        Icon iconCreateWithBitmap;
        String resPackage;
        InputStream inputStreamOpenInputStream;
        int i14 = this.f6392a;
        switch (i14) {
            case -1:
                return (Icon) this.f6393b;
            case 0:
            default:
                h.s("Unknown type");
                return null;
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) this.f6393b);
                break;
            case 2:
                if (i14 == -1) {
                    resPackage = ((Icon) this.f6393b).getResPackage();
                } else {
                    if (i14 != 2) {
                        l.n(this, "called getResPackage() on ");
                        return null;
                    }
                    String str = this.f6401j;
                    resPackage = (str == null || TextUtils.isEmpty(str)) ? ((String) this.f6393b).split(":", -1)[0] : this.f6401j;
                }
                iconCreateWithBitmap = Icon.createWithResource(resPackage, this.f6396e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) this.f6393b, this.f6396e, this.f6397f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) this.f6393b);
                break;
            case 5:
                iconCreateWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) this.f6393b);
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    iconCreateWithBitmap = b.a(e());
                } else {
                    if (context == null) {
                        j.A(e(), "Context is required to resolve the file uri of the icon: ");
                        return null;
                    }
                    Uri uriE = e();
                    String scheme = uriE.getScheme();
                    if (FirebaseAnalytics.Param.CONTENT.equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriE);
                        } catch (Exception unused) {
                            uriE.toString();
                            inputStreamOpenInputStream = null;
                        }
                    } else {
                        try {
                            inputStreamOpenInputStream = new FileInputStream(new File((String) this.f6393b));
                        } catch (FileNotFoundException unused2) {
                            uriE.toString();
                            inputStreamOpenInputStream = null;
                        }
                    }
                    if (inputStreamOpenInputStream == null) {
                        a0.s(e(), "Cannot load adaptive icon from uri: ");
                        return null;
                    }
                    iconCreateWithBitmap = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                }
                break;
        }
        ColorStateList colorStateList = this.f6398g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f6399h;
        if (mode != f6391k) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public final String toString() {
        String str;
        if (this.f6392a == -1) {
            return String.valueOf(this.f6393b);
        }
        StringBuilder sb3 = new StringBuilder("Icon(typ=");
        switch (this.f6392a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb3.append(str);
        switch (this.f6392a) {
            case 1:
            case 5:
                sb3.append(" size=");
                sb3.append(((Bitmap) this.f6393b).getWidth());
                sb3.append("x");
                sb3.append(((Bitmap) this.f6393b).getHeight());
                break;
            case 2:
                sb3.append(" pkg=");
                sb3.append(this.f6401j);
                sb3.append(" id=");
                sb3.append(String.format("0x%08x", Integer.valueOf(d())));
                break;
            case 3:
                sb3.append(" len=");
                sb3.append(this.f6396e);
                if (this.f6397f != 0) {
                    sb3.append(" off=");
                    sb3.append(this.f6397f);
                }
                break;
            case 4:
            case 6:
                sb3.append(" uri=");
                sb3.append(this.f6393b);
                break;
        }
        if (this.f6398g != null) {
            sb3.append(" tint=");
            sb3.append(this.f6398g);
        }
        if (this.f6399h != f6391k) {
            sb3.append(" mode=");
            sb3.append(this.f6399h);
        }
        sb3.append(")");
        return sb3.toString();
    }

    public IconCompat(int i14) {
        this.f6394c = null;
        this.f6395d = null;
        this.f6396e = 0;
        this.f6397f = 0;
        this.f6398g = null;
        this.f6399h = f6391k;
        this.f6400i = null;
        this.f6392a = i14;
    }
}
