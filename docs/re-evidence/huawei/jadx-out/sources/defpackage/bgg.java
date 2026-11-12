package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes23.dex */
public final class bgg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ColorStateList f1085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Shader f1086b;
    private int e;

    private bgg(Shader shader, ColorStateList colorStateList, int i) {
        this.f1086b = shader;
        this.f1085a = colorStateList;
        this.e = i;
    }

    static bgg e(int i) {
        return new bgg(null, null, i);
    }

    public Shader c() {
        return this.f1086b;
    }

    public void d(Shader shader) {
        this.f1086b = shader;
    }

    public int a() {
        return this.e;
    }

    public void c(int i) {
        this.e = i;
    }

    public boolean e() {
        return this.f1086b != null;
    }

    public boolean b() {
        ColorStateList colorStateList;
        return this.f1086b == null && (colorStateList = this.f1085a) != null && colorStateList.isStateful();
    }

    public boolean c(int[] iArr) {
        if (!b()) {
            return false;
        }
        ColorStateList colorStateList = this.f1085a;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.e) {
            return false;
        }
        this.e = colorForState;
        return true;
    }

    public boolean d() {
        return e() || this.e != 0;
    }
}
