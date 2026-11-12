package miuix.internal.view;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;
import defpackage.dmi;
import defpackage.z2j;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(api = 21)
public class RadioButtonAnimatedStateListDrawable extends CheckBoxAnimatedStateListDrawable {
    public int h;

    public static class a extends miuix.internal.view.a.C1033a {
        @Override // miuix.internal.view.a.C1033a
        public Drawable a(Resources resources, Resources.Theme theme, miuix.internal.view.a.C1033a c1033a) {
            return new RadioButtonAnimatedStateListDrawable(resources, theme, c1033a);
        }
    }

    public RadioButtonAnimatedStateListDrawable() {
        this.h = 19;
    }

    @Override // miuix.internal.view.CheckBoxAnimatedStateListDrawable, miuix.internal.view.a
    public miuix.internal.view.a.C1033a a() {
        return new a();
    }

    @Override // miuix.internal.view.CheckBoxAnimatedStateListDrawable
    public int b() {
        return z2j.m;
    }

    @Override // miuix.internal.view.CheckBoxAnimatedStateListDrawable
    public boolean e() {
        return true;
    }

    @Override // miuix.internal.view.CheckBoxAnimatedStateListDrawable
    public void i(int i, int i2, int i3, int i4) {
        int i5 = this.h;
        super.i(i + i5, i2 + i5, i3 - i5, i4 - i5);
    }

    @Override // miuix.internal.view.CheckBoxAnimatedStateListDrawable
    public void j(Rect rect) {
        int i = this.h;
        rect.inset(i, i);
        super.j(rect);
    }

    public RadioButtonAnimatedStateListDrawable(Resources resources, Resources.Theme theme, miuix.internal.view.a.C1033a c1033a) {
        super(resources, theme, c1033a);
        this.h = 19;
        if (resources != null) {
            this.h = resources.getDimensionPixelSize(dmi.n0);
        }
    }
}
