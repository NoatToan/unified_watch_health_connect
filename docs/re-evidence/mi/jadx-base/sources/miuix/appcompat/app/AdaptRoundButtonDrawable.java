package miuix.appcompat.app;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.g5j;
import defpackage.pwk;
import java.io.IOException;
import miuix.smooth.SmoothContainerDrawable2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class AdaptRoundButtonDrawable extends SmoothContainerDrawable2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f26293k;
    public float l;

    @Override // miuix.smooth.SmoothContainerDrawable2, android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        o(resources, attributeSet, theme);
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        if (pwk.f()) {
            j(this.f26293k);
        } else {
            j(this.l);
        }
    }

    public final void o(Resources resources, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray typedArrayG = SmoothContainerDrawable2.g(resources, theme, attributeSet, g5j.U);
        float f = resources.getDisplayMetrics().density;
        this.f26293k = typedArrayG.getDimension(g5j.W, 16.0f * f);
        this.l = typedArrayG.getDimension(g5j.V, f * 36.0f);
        typedArrayG.recycle();
    }
}
