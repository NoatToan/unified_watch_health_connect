package fj;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import b7.g;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f71822a = true;

    private b() {
    }

    public static Drawable a(Context context, Context context2, int i14, Resources.Theme theme) {
        try {
            if (f71822a) {
                return b(context2, i14, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e4) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e4;
            }
            return a7.b.getDrawable(context2, i14);
        } catch (NoClassDefFoundError unused2) {
            f71822a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal<TypedValue> threadLocal = g.f16255a;
        return resources.getDrawable(i14, theme);
    }

    public static Drawable b(Context context, int i14, Resources.Theme theme) {
        if (theme != null) {
            m.d dVar = new m.d(context, theme);
            dVar.a(theme.getResources().getConfiguration());
            context = dVar;
        }
        return j.a.a(context, i14);
    }
}
