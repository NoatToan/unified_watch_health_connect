package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes3.dex */
public class rr1 extends ContextThemeWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Configuration f32813a;

    public rr1(Context context, int i) {
        super(context, i);
    }

    public Configuration a() {
        ContextThemeWrapper contextThemeWrapper = this;
        while (contextThemeWrapper.getBaseContext() instanceof ContextThemeWrapper) {
            contextThemeWrapper = (ContextThemeWrapper) contextThemeWrapper.getBaseContext();
        }
        return contextThemeWrapper.getResources().getConfiguration();
    }

    public Configuration b() {
        return this.f32813a;
    }

    public void c() {
        getResources().getConfiguration().setTo(this.f32813a);
        getResources().getDisplayMetrics().density = this.f32813a.densityDpi / 160.0f;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        Configuration configuration = this.f32813a;
        displayMetrics.densityDpi = configuration.densityDpi;
        float f = configuration.fontScale;
        DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
        float f2 = getResources().getDisplayMetrics().density;
        if (f == 0.0f) {
            f = 1.0f;
        }
        displayMetrics2.scaledDensity = f2 * f;
    }

    public void d(Configuration configuration) {
        this.f32813a = configuration;
    }
}
