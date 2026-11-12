package miuix.appcompat.app;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.g5j;
import defpackage.pwk;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class ButtonForegroundDrawable extends AlphaBlendingDrawable {
    public final void d(Resources resources, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, g5j.U, 0, 0) : resources.obtainAttributes(attributeSet, g5j.U);
        float f = resources.getDisplayMetrics().density;
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(g5j.W, (int) (16.0f * f));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(g5j.V, (int) (f * 36.0f));
        typedArrayObtainStyledAttributes.recycle();
        if (pwk.f()) {
            b(dimensionPixelSize);
        } else {
            b(dimensionPixelSize2);
        }
    }

    @Override // miuix.appcompat.app.AlphaBlendingDrawable, android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        d(resources, attributeSet, theme);
    }
}
