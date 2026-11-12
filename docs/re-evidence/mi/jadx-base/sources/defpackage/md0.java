package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;

/* JADX INFO: loaded from: classes3.dex */
public class md0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f26026a;

    public md0(Context context) {
        this.f26026a = context;
    }

    public static md0 b(Context context) {
        return new md0(context);
    }

    public boolean a() {
        return this.f26026a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f26026a.getResources().getDimensionPixelSize(dmi.f);
    }

    public int d() {
        TypedArray typedArrayObtainStyledAttributes = this.f26026a.obtainStyledAttributes(null, g5j.f18626a, R.attr.actionBarTabBarStyle, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(g5j.f, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (layoutDimension > 0) {
            return layoutDimension;
        }
        TypedArray typedArrayObtainStyledAttributes2 = this.f26026a.obtainStyledAttributes(null, g5j.f18626a, R.attr.actionBarStyle, 0);
        int layoutDimension2 = typedArrayObtainStyledAttributes2.getLayoutDimension(g5j.f, 0);
        typedArrayObtainStyledAttributes2.recycle();
        return layoutDimension2;
    }

    public boolean e() {
        return hm1.d(this.f26026a, zhi.f41287a, false);
    }

    public boolean f() {
        return hm1.d(this.f26026a, zhi.n, false);
    }

    public boolean g() {
        return hm1.d(this.f26026a, zhi.p, false);
    }

    public boolean h() {
        return true;
    }
}
