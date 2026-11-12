package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public class ui4 extends ContextWrapper {
    public static Configuration f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f35780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources.Theme f35781b;
    public LayoutInflater c;
    public Configuration d;
    public Resources e;

    @RequiresApi(17)
    public static class a {
        public static Context a(ui4 ui4Var, Configuration configuration) {
            return ui4Var.createConfigurationContext(configuration);
        }
    }

    public ui4() {
        super(null);
    }

    @RequiresApi(26)
    public static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f = configuration2;
        }
        return configuration.equals(f);
    }

    public void a(Configuration configuration) {
        if (this.e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final Resources b() {
        if (this.e == null) {
            Configuration configuration = this.d;
            if (configuration == null || e(configuration)) {
                this.e = super.getResources();
            } else {
                this.e = a.a(this, this.d).getResources();
            }
        }
        return this.e;
    }

    public int c() {
        return this.f35780a;
    }

    public final void d() {
        boolean z = this.f35781b == null;
        if (z) {
            this.f35781b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f35781b.setTo(theme);
            }
        }
        f(this.f35781b, this.f35780a, z);
    }

    public void f(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.c == null) {
            this.c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f35781b;
        if (theme != null) {
            return theme;
        }
        if (this.f35780a == 0) {
            this.f35780a = n3j.e;
        }
        d();
        return this.f35781b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f35780a != i) {
            this.f35780a = i;
            d();
        }
    }

    public ui4(Context context, int i) {
        super(context);
        this.f35780a = i;
    }

    public ui4(Context context, Resources.Theme theme) {
        super(context);
        this.f35781b = theme;
    }
}
