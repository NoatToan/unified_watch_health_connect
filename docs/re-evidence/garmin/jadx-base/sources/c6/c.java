package c6;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import lc.u0;
import o4.g1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import q4.g;
import q4.j;
import q4.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lc6/c;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "Lq4/g;", "drawStyle", "<init>", "(Lq4/g;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f24606a;

    public c(g gVar) {
        this.f24606a = gVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            j jVar = j.f142560a;
            g gVar = this.f24606a;
            if (s.g(gVar, jVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(gVar instanceof k)) {
                u0.r();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            textPaint.setStrokeWidth(((k) gVar).f142562a);
            textPaint.setStrokeMiter(((k) gVar).f142563b);
            textPaint.setStrokeJoin(d.b(((k) gVar).f142565d));
            textPaint.setStrokeCap(d.a(((k) gVar).f142564c));
            g1 g1Var = ((k) gVar).f142566e;
            textPaint.setPathEffect(g1Var != null ? ((o4.k) g1Var).f128879b : null);
        }
    }
}
