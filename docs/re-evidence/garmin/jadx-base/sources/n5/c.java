package n5;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ResourceResolutionException;
import d53.w;
import java.lang.ref.WeakReference;
import o4.f;
import o4.v0;
import org.xmlpull.v1.XmlPullParserException;
import p005kotlin.jvm.internal.s;
import p1.i0;
import p3.m;
import p3.n;
import p3.x1;
import u4.o;
import u4.p;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:56:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static final t4.d a(int i14, m mVar, int i15) {
        TypedValue typedValueB;
        boolean z14;
        x1 x1Var = n.f135158a;
        Context context = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
        Resources resources = (Resources) mVar.A(AndroidCompositionLocals_androidKt.f6043c);
        d dVar = (d) mVar.A(AndroidCompositionLocals_androidKt.f6045e);
        synchronized (dVar) {
            typedValueB = dVar.f123718a.b(i14);
            z14 = true;
            if (typedValueB == null) {
                typedValueB = new TypedValue();
                resources.getValue(i14, typedValueB, true);
                i0<TypedValue> i0Var = dVar.f123718a;
                int iD = i0Var.d(i14);
                Object[] objArr = i0Var.f134774c;
                Object obj = objArr[iD];
                i0Var.f134773b[iD] = i14;
                objArr[iD] = typedValueB;
            }
        }
        CharSequence charSequence = typedValueB.string;
        if (charSequence != null && w.C(charSequence, ".xml")) {
            mVar.C(-1771798434);
            Resources.Theme theme = context.getTheme();
            int i16 = typedValueB.changingConfigurations;
            b bVar = (b) mVar.A(AndroidCompositionLocals_androidKt.f6044d);
            b.C2320b c2320b = new b.C2320b(theme, i14);
            WeakReference<b.a> weakReference = bVar.f123713a.get(c2320b);
            b.a aVarA = weakReference != null ? weakReference.get() : null;
            if (aVarA == null) {
                XmlResourceParser xml = resources.getXml(i14);
                int next = xml.next();
                while (next != 2 && next != 1) {
                    next = xml.next();
                }
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!s.g(xml.getName(), "vector")) {
                    h.s("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                    return null;
                }
                aVarA = e.a(theme, resources, xml, i16);
                bVar.f123713a.put(c2320b, new WeakReference<>(aVarA));
            }
            o oVarB = p.b(aVarA.f123714a, mVar);
            mVar.f();
            return oVarB;
        }
        mVar.C(-1771643000);
        Object theme2 = context.getTheme();
        boolean zB = mVar.B(charSequence);
        if ((((i15 & 14) ^ 6) <= 4 || !mVar.k(i14)) && (i15 & 6) != 4) {
            z14 = false;
        }
        boolean zB2 = zB | z14 | mVar.B(theme2);
        Object objQ = mVar.q();
        if (zB2) {
            int i17 = v0.f129017a;
            Drawable drawable = resources.getDrawable(i14, null);
            drawable.getClass();
            objQ = new f(((BitmapDrawable) drawable).getBitmap());
            mVar.K(objQ);
        } else {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                try {
                    int i18 = v0.f129017a;
                    Drawable drawable2 = resources.getDrawable(i14, null);
                    drawable2.getClass();
                    objQ = new f(((BitmapDrawable) drawable2).getBitmap());
                    mVar.K(objQ);
                } catch (Exception e4) {
                    throw new ResourceResolutionException("Error attempting to load resource: " + ((Object) charSequence), e4);
                }
            }
        }
        t4.a aVar = new t4.a((v0) objQ, 0L, 0L, 6, null);
        mVar.f();
        return aVar;
    }
}
