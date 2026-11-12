package nf;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.TypedValue;
import d53.t;
import d53.w;
import dg.u;
import hf.y;
import java.io.IOException;
import lf.q;
import lf.r;
import org.xmlpull.v1.XmlPullParserException;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import v.e0;
import w63.b0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lnf/n;", "Lnf/j;", "Lhf/y;", "data", "Lwf/m;", "options", "<init>", "(Lhf/y;Lwf/m;)V", "a", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f125760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wf.m f125761b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lnf/n$a;", "Lnf/j$a;", "Lhf/y;", "<init>", "()V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements j.a<y> {
        @Override // nf.j.a
        public final j a(y yVar, wf.m mVar, hf.j jVar) {
            y yVar2 = yVar;
            if (s.g(yVar2.f83620c, "android.resource")) {
                return new n(yVar2, mVar);
            }
            return null;
        }
    }

    public n(y yVar, wf.m mVar) {
        this.f125760a = yVar;
        this.f125761b = mVar;
    }

    @Override // nf.j
    public final Object a(t13.d<? super i> dVar) throws XmlPullParserException, IOException {
        Integer numI;
        Drawable drawable;
        y yVar = this.f125760a;
        String str = yVar.f83621d;
        if (str != null) {
            if (w.J(str)) {
                str = null;
            }
            if (str != null) {
                String str2 = (String) h0.n0(gg.b.C(yVar));
                if (str2 == null || (numI = t.i(str2)) == null) {
                    com.google.firebase.messaging.l.n(yVar, "Invalid android.resource URI: ");
                    return null;
                }
                int iIntValue = numI.intValue();
                wf.m mVar = this.f125761b;
                Context context = mVar.f184996a;
                Resources resources = str.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(str);
                TypedValue typedValue = new TypedValue();
                resources.getValue(iIntValue, typedValue, true);
                CharSequence charSequence = typedValue.string;
                dg.n nVar = dg.n.f59492a;
                String string = charSequence.toString();
                nVar.getClass();
                String strB = dg.n.b(string);
                if (!s.g(strB, "text/xml")) {
                    TypedValue typedValue2 = new TypedValue();
                    return new o(new r(new b0(w5.r.y(resources.openRawResource(iIntValue, typedValue2))), mVar.f185001f, new q(str, iIntValue, typedValue2.density)), strB, lf.e.DISK);
                }
                if (str.equals(context.getPackageName())) {
                    drawable = j.a.a(context, iIntValue);
                    if (drawable == null) {
                        e0.n(am.j.h(iIntValue, "Invalid resource ID: "));
                        return null;
                    }
                } else {
                    XmlResourceParser xml = resources.getXml(iIntValue);
                    int next = xml.next();
                    while (next != 2 && next != 1) {
                        next = xml.next();
                    }
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found.");
                    }
                    Resources.Theme theme = context.getTheme();
                    ThreadLocal<TypedValue> threadLocal = b7.g.f16255a;
                    drawable = resources.getDrawable(iIntValue, theme);
                    if (drawable == null) {
                        e0.n(am.j.h(iIntValue, "Invalid resource ID: "));
                        return null;
                    }
                }
                Bitmap.Config[] configArr = u.f59504a;
                boolean z14 = (drawable instanceof VectorDrawable) || (drawable instanceof androidx.vectordrawable.graphics.drawable.f);
                if (z14) {
                    dg.e eVar = dg.e.f59476a;
                    Bitmap.Config config = (Bitmap.Config) hf.g.b(mVar, wf.h.f184986b);
                    xf.g gVar = mVar.f184997b;
                    xf.f fVar = mVar.f184998c;
                    boolean z15 = mVar.f184999d == xf.c.INEXACT;
                    eVar.getClass();
                    drawable = new BitmapDrawable(context.getResources(), dg.e.a(drawable, config, gVar, fVar, z15));
                }
                return new l(hf.m.b(drawable), z14, lf.e.DISK);
            }
        }
        com.google.firebase.messaging.l.n(yVar, "Invalid android.resource URI: ");
        return null;
    }
}
