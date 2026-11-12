package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
public final class l47 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f24629a = true;

    public static Drawable a(Context context, int i, Resources.Theme theme) {
        return c(context, context, i, theme);
    }

    public static Drawable b(Context context, Context context2, int i) {
        return c(context, context2, i, null);
    }

    public static Drawable c(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f24629a) {
                return e(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return ni4.e(context2, i);
        } catch (NoClassDefFoundError unused2) {
            f24629a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return d(context2, i, theme);
    }

    public static Drawable d(Context context, int i, Resources.Theme theme) {
        return jrk.f(context.getResources(), i, theme);
    }

    public static Drawable e(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            ui4 ui4Var = new ui4(context, theme);
            ui4Var.a(theme.getResources().getConfiguration());
            context = ui4Var;
        }
        return of1.b(context, i);
    }
}
