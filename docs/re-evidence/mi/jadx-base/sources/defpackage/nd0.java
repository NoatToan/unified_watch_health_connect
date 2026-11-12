package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class nd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f27800a;

    public nd0(Context context) {
        this.f27800a = context;
    }

    public static nd0 b(Context context) {
        return new nd0(context);
    }

    public boolean a() {
        return this.f27800a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f27800a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f27800a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int e() {
        return this.f27800a.getResources().getDimensionPixelSize(smi.f33790b);
    }

    public int f() {
        TypedArray typedArrayObtainStyledAttributes = this.f27800a.obtainStyledAttributes(null, z5j.f40915a, qii.c, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(z5j.j, 0);
        Resources resources = this.f27800a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(smi.f33789a));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f27800a.getResources().getBoolean(uii.f35795a);
    }

    public boolean h() {
        return true;
    }
}
