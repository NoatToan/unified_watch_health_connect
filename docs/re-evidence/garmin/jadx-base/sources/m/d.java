package m;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes.dex */
public class d extends ContextWrapper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Configuration f115424f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources.Theme f115426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutInflater f115427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Configuration f115428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Resources f115429e;

    public d(Context context, int i14) {
        super(context);
        this.f115425a = i14;
    }

    public final void a(Configuration configuration) {
        if (this.f115429e != null) {
            vb.h.z("getResources() or getAssets() has already been called");
        } else if (this.f115428d == null) {
            this.f115428d = new Configuration(configuration);
        } else {
            vb.h.z("Override configuration has already been set");
        }
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f115426b == null) {
            this.f115426b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f115426b.setTo(theme);
            }
        }
        this.f115426b.applyStyle(this.f115425a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f115429e == null) {
            Configuration configuration = this.f115428d;
            if (configuration == null) {
                this.f115429e = super.getResources();
            } else {
                if (f115424f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    f115424f = configuration2;
                }
                if (configuration.equals(f115424f)) {
                    this.f115429e = super.getResources();
                } else {
                    this.f115429e = createConfigurationContext(this.f115428d).getResources();
                }
            }
        }
        return this.f115429e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f115427c == null) {
            this.f115427c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f115427c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f115426b;
        if (theme != null) {
            return theme;
        }
        if (this.f115425a == 0) {
            this.f115425a = 2132149223;
        }
        b();
        return this.f115426b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i14) {
        if (this.f115425a != i14) {
            this.f115425a = i14;
            b();
        }
    }

    public d() {
        super(null);
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f115426b = theme;
    }
}
