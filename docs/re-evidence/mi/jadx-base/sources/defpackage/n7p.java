package defpackage;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.views.text.TextTransform;

/* JADX INFO: loaded from: classes4.dex */
public class n7p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f27628a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f27629b = Float.NaN;
    public float c = Float.NaN;
    public float d = Float.NaN;
    public float e = Float.NaN;
    public float f = Float.NaN;
    public TextTransform g = TextTransform.UNSET;

    public n7p a(n7p n7pVar) {
        n7p n7pVar2 = new n7p();
        n7pVar2.f27628a = this.f27628a;
        n7pVar2.f27629b = !Float.isNaN(n7pVar.f27629b) ? n7pVar.f27629b : this.f27629b;
        n7pVar2.c = !Float.isNaN(n7pVar.c) ? n7pVar.c : this.c;
        n7pVar2.d = !Float.isNaN(n7pVar.d) ? n7pVar.d : this.d;
        n7pVar2.e = !Float.isNaN(n7pVar.e) ? n7pVar.e : this.e;
        n7pVar2.f = !Float.isNaN(n7pVar.f) ? n7pVar.f : this.f;
        TextTransform textTransform = n7pVar.g;
        if (textTransform == TextTransform.UNSET) {
            textTransform = this.g;
        }
        n7pVar2.g = textTransform;
        return n7pVar2;
    }

    public boolean b() {
        return this.f27628a;
    }

    public int c() {
        float f = !Float.isNaN(this.f27629b) ? this.f27629b : 14.0f;
        return (int) (this.f27628a ? Math.ceil(exh.e(f, f())) : Math.ceil(exh.c(f)));
    }

    public float d() {
        if (Float.isNaN(this.d)) {
            return Float.NaN;
        }
        return (this.f27628a ? exh.e(this.d, f()) : exh.c(this.d)) / c();
    }

    public float e() {
        if (Float.isNaN(this.c)) {
            return Float.NaN;
        }
        float fE = this.f27628a ? exh.e(this.c, f()) : exh.c(this.c);
        if (Float.isNaN(this.f)) {
            return fE;
        }
        float f = this.f;
        return f > fE ? f : fE;
    }

    public float f() {
        if (Float.isNaN(this.e)) {
            return 0.0f;
        }
        return this.e;
    }

    public float g() {
        return this.f27629b;
    }

    public float h() {
        return this.f;
    }

    public float i() {
        return this.d;
    }

    public float j() {
        return this.c;
    }

    public float k() {
        return this.e;
    }

    public TextTransform l() {
        return this.g;
    }

    public void m(boolean z) {
        this.f27628a = z;
    }

    public void n(float f) {
        this.f27629b = f;
    }

    public void o(float f) {
        this.f = f;
    }

    public void p(float f) {
        this.d = f;
    }

    public void q(float f) {
        this.c = f;
    }

    public void r(float f) {
        if (f != 0.0f && f < 1.0f) {
            throw new JSApplicationIllegalArgumentException("maxFontSizeMultiplier must be NaN, 0, or >= 1");
        }
        this.e = f;
    }

    public void s(TextTransform textTransform) {
        this.g = textTransform;
    }

    public String toString() {
        return "TextAttributes {\n  getAllowFontScaling(): " + b() + "\n  getFontSize(): " + g() + "\n  getEffectiveFontSize(): " + c() + "\n  getHeightOfTallestInlineViewOrImage(): " + h() + "\n  getLetterSpacing(): " + i() + "\n  getEffectiveLetterSpacing(): " + d() + "\n  getLineHeight(): " + j() + "\n  getEffectiveLineHeight(): " + e() + "\n  getTextTransform(): " + l() + "\n  getMaxFontSizeMultiplier(): " + k() + "\n  getEffectiveMaxFontSizeMultiplier(): " + f() + "\n}";
    }
}
