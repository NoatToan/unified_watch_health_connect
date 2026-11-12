package com.huawei.hms.ads.dynamicloader;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes10.dex */
public class a extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f12780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Resources.Theme f12781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LayoutInflater f12782c;

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f12780a != i) {
            this.f12780a = i;
            a();
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f12781b;
        if (theme != null) {
            return theme;
        }
        int i = this.f12780a;
        int i2 = getApplicationInfo().targetSdkVersion;
        if (i == 0) {
            if (i2 < 11) {
                i = R.style.Theme;
            } else if (i2 >= 14) {
                i = i2 < 24 ? R.style.Theme.DeviceDefault : R.style.Theme.DeviceDefault.Light.DarkActionBar;
            } else {
                i = R.style.Theme.Holo;
            }
        }
        this.f12780a = i;
        a();
        return this.f12781b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return super.getSystemService(str);
        }
        if (this.f12782c == null) {
            this.f12782c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f12782c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    private void a() {
        if (this.f12781b == null) {
            this.f12781b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f12781b.setTo(theme);
            }
        }
        this.f12781b.applyStyle(this.f12780a, true);
    }

    public a(Context context) {
        super(context);
    }
}
