package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class ga4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Shader f18769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorStateList f18770b;
    public int c;

    public ga4(Shader shader, ColorStateList colorStateList, int i) {
        this.f18769a = shader;
        this.f18770b = colorStateList;
        this.c = i;
    }

    public static ga4 a(Resources resources, int i, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.hashCode();
        if (name.equals("gradient")) {
            return d(g3b.b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return c(v44.b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    public static ga4 b(int i) {
        return new ga4(null, null, i);
    }

    public static ga4 c(ColorStateList colorStateList) {
        return new ga4(null, colorStateList, colorStateList.getDefaultColor());
    }

    public static ga4 d(Shader shader) {
        return new ga4(shader, null, 0);
    }

    public static ga4 g(Resources resources, int i, Resources.Theme theme) {
        try {
            return a(resources, i, theme);
        } catch (Exception unused) {
            return null;
        }
    }

    public int e() {
        return this.c;
    }

    public Shader f() {
        return this.f18769a;
    }

    public boolean h() {
        return this.f18769a != null;
    }

    public boolean i() {
        ColorStateList colorStateList;
        return this.f18769a == null && (colorStateList = this.f18770b) != null && colorStateList.isStateful();
    }

    public boolean j(int[] iArr) {
        if (i()) {
            ColorStateList colorStateList = this.f18770b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.c) {
                this.c = colorForState;
                return true;
            }
        }
        return false;
    }

    public void k(int i) {
        this.c = i;
    }

    public boolean l() {
        return h() || this.c != 0;
    }
}
