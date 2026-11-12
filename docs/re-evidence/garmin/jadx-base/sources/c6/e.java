package c6;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import c32.k;
import n4.g;
import o4.p1;
import p005kotlin.Metadata;
import p3.c2;
import p3.d0;
import p3.p0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc6/e;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "Lo4/p1;", "shaderBrush", "", "alpha", "<init>", "(Lo4/p1;F)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f24607e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1 f24608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f24609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c2 f24610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d0 f24611d;

    public e(p1 p1Var, float f14) {
        this.f24608a = p1Var;
        this.f24609b = f14;
        g.f123559b.getClass();
        this.f24610c = p0.n(g.a(g.f123560c));
        this.f24611d = p0.f(new k(this, 2));
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        lg.d.G(textPaint, this.f24609b);
        textPaint.setShader((Shader) this.f24611d.getF182175a());
    }
}
