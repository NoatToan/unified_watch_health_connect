package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import defpackage.mii;
import defpackage.p3j;
import defpackage.p5q;

/* JADX INFO: loaded from: classes.dex */
public abstract class DialogPreference extends Preference {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f2703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f2704b;
    public Drawable c;
    public CharSequence d;
    public CharSequence e;
    public int f;

    public interface a {
        <T extends Preference> T findPreference(CharSequence charSequence);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p3j.j, i, i2);
        String strO = p5q.o(typedArrayObtainStyledAttributes, p3j.t, p3j.f29964k);
        this.f2703a = strO;
        if (strO == null) {
            this.f2703a = getTitle();
        }
        this.f2704b = p5q.o(typedArrayObtainStyledAttributes, p3j.s, p3j.l);
        this.c = p5q.c(typedArrayObtainStyledAttributes, p3j.q, p3j.m);
        this.d = p5q.o(typedArrayObtainStyledAttributes, p3j.v, p3j.n);
        this.e = p5q.o(typedArrayObtainStyledAttributes, p3j.u, p3j.o);
        this.f = p5q.n(typedArrayObtainStyledAttributes, p3j.f29965r, p3j.p, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public Drawable e() {
        return this.c;
    }

    public int h() {
        return this.f;
    }

    public CharSequence i() {
        return this.f2704b;
    }

    public CharSequence k() {
        return this.f2703a;
    }

    public CharSequence l() {
        return this.e;
    }

    public CharSequence m() {
        return this.d;
    }

    @Override // androidx.preference.Preference
    public void onClick() {
        getPreferenceManager().p(this);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p5q.a(context, mii.f26216b, R.attr.dialogPreferenceStyle));
    }
}
