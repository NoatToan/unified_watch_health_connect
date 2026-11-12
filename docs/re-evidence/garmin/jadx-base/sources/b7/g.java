package b7;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import p1.c0;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f16255a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap<b, SparseArray<a>> f16256b = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f16257c = new Object();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ColorStateList f16258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Configuration f16259b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f16260c;

        public a(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f16258a = colorStateList;
            this.f16259b = configuration;
            this.f16260c = theme == null ? 0 : theme.hashCode();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources f16261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Resources.Theme f16262b;

        public b(Resources resources, Resources.Theme theme) {
            this.f16261a = resources;
            this.f16262b = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.f16261a.equals(bVar.f16261a) && Objects.equals(this.f16262b, bVar.f16262b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(this.f16261a, this.f16262b);
        }
    }

    public static abstract class c {
        public static Handler getHandler(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void callbackFailAsync(int i14, Handler handler) {
            getHandler(handler).post(new androidx.media3.exoplayer.d(this, i14, 1));
        }

        public final void callbackSuccessAsync(Typeface typeface, Handler handler) {
            getHandler(handler).post(new ab.j(24, this, typeface));
        }

        /* JADX INFO: renamed from: onFontRetrievalFailed, reason: merged with bridge method [inline-methods] */
        public abstract void lambda$callbackFailAsync$1(int i14);

        /* JADX INFO: renamed from: onFontRetrieved, reason: merged with bridge method [inline-methods] */
        public abstract void lambda$callbackSuccessAsync$0(Typeface typeface);
    }

    private g() {
    }

    public static Typeface a(int i14, Context context) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i14, new TypedValue(), 0, null, false, false);
    }

    public static Typeface b(Context context, int i14, TypedValue typedValue, int i15, c cVar, boolean z14, boolean z15) {
        Resources resources = context.getResources();
        resources.getValue(i14, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i14) + "\" (" + Integer.toHexString(i14) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceA = null;
        if (string.startsWith("res/")) {
            int i16 = typedValue.assetCookie;
            c0<String, Typeface> c0Var = c7.h.f25198b;
            Typeface typeface = c0Var.get(c7.h.b(resources, i14, string, i16, i15));
            if (typeface != null) {
                if (cVar != null) {
                    cVar.callbackSuccessAsync(typeface, null);
                }
                typefaceA = typeface;
            } else if (!z15) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        e.a aVarA = e.a(resources.getXml(i14), resources);
                        if (aVarA != null) {
                            typefaceA = c7.h.a(context, aVarA, resources, i14, string, typedValue.assetCookie, i15, cVar, z14);
                        } else if (cVar != null) {
                            cVar.callbackFailAsync(-3, null);
                        }
                    } else {
                        int i17 = typedValue.assetCookie;
                        Typeface typefaceE = c7.h.f25197a.e(context, resources, i14, string, i15);
                        if (typefaceE != null) {
                            c0Var.put(c7.h.b(resources, i14, string, i17, i15), typefaceE);
                        }
                        if (cVar != null) {
                            if (typefaceE != null) {
                                cVar.callbackSuccessAsync(typefaceE, null);
                            } else {
                                cVar.callbackFailAsync(-3, null);
                            }
                        }
                        typefaceA = typefaceE;
                    }
                } catch (IOException | XmlPullParserException unused) {
                    if (cVar != null) {
                        cVar.callbackFailAsync(-3, null);
                    }
                }
            }
        } else if (cVar != null) {
            cVar.callbackFailAsync(-3, null);
        }
        if (typefaceA != null || cVar != null || z15) {
            return typefaceA;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i14) + " could not be retrieved.");
    }
}
