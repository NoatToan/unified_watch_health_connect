package androidx.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import defpackage.cig;
import defpackage.kig;
import defpackage.x5j;
import defpackage.y5j;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final ThreadLocal<TypedValue> c = new ThreadLocal<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f2693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f2694b;

    public g(Context context, j jVar) {
        this.f2693a = context;
        this.f2694b = jVar;
    }

    public static kig a(TypedValue typedValue, kig kigVar, kig kigVar2, String str, String str2) throws XmlPullParserException {
        if (kigVar == null || kigVar == kigVar2) {
            return kigVar != null ? kigVar : kigVar2;
        }
        throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
    }

    public final d b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i) throws XmlPullParserException, IOException {
        int depth;
        d dVarA = this.f2694b.e(xmlResourceParser.getName()).a();
        dVarA.u(this.f2693a, attributeSet);
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2) {
                String name = xmlResourceParser.getName();
                if ("argument".equals(name)) {
                    g(resources, dVarA, attributeSet, i);
                } else if ("deepLink".equals(name)) {
                    h(resources, dVarA, attributeSet);
                } else if ("action".equals(name)) {
                    d(resources, dVarA, attributeSet, xmlResourceParser, i);
                } else if ("include".equals(name) && (dVarA instanceof e)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, x5j.f38729r);
                    ((e) dVarA).C(c(typedArrayObtainAttributes.getResourceId(x5j.s, 0)));
                    typedArrayObtainAttributes.recycle();
                } else if (dVarA instanceof e) {
                    ((e) dVarA).C(b(resources, xmlResourceParser, attributeSet, i));
                }
            }
        }
        return dVarA;
    }

    @SuppressLint({"ResourceType"})
    public e c(int i) {
        int next;
        Resources resources = this.f2693a.getResources();
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i) + " line " + xml.getLineNumber(), e);
                }
            } catch (Throwable th) {
                xml.close();
                throw th;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        d dVarB = b(resources, xml, attributeSetAsAttributeSet, i);
        if (dVarB instanceof e) {
            e eVar = (e) dVarB;
            xml.close();
            return eVar;
        }
        throw new IllegalArgumentException("Root element <" + name + "> did not inflate into a NavGraph");
    }

    public final void d(Resources resources, d dVar, AttributeSet attributeSet, XmlResourceParser xmlResourceParser, int i) throws XmlPullParserException, IOException {
        int depth;
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, y5j.f);
        int resourceId = typedArrayObtainAttributes.getResourceId(y5j.g, 0);
        cig cigVar = new cig(typedArrayObtainAttributes.getResourceId(y5j.h, 0));
        h.a aVar = new h.a();
        aVar.d(typedArrayObtainAttributes.getBoolean(y5j.f39818k, false));
        aVar.g(typedArrayObtainAttributes.getResourceId(y5j.n, -1), typedArrayObtainAttributes.getBoolean(y5j.o, false));
        aVar.b(typedArrayObtainAttributes.getResourceId(y5j.i, -1));
        aVar.c(typedArrayObtainAttributes.getResourceId(y5j.j, -1));
        aVar.e(typedArrayObtainAttributes.getResourceId(y5j.l, -1));
        aVar.f(typedArrayObtainAttributes.getResourceId(y5j.m, -1));
        cigVar.e(aVar.a());
        Bundle bundle = new Bundle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && "argument".equals(xmlResourceParser.getName())) {
                f(resources, bundle, attributeSet, i);
            }
        }
        if (!bundle.isEmpty()) {
            cigVar.d(bundle);
        }
        dVar.v(resourceId, cigVar);
        typedArrayObtainAttributes.recycle();
    }

    public final b e(TypedArray typedArray, Resources resources, int i) throws XmlPullParserException {
        b.a aVar = new b.a();
        aVar.c(typedArray.getBoolean(y5j.t, false));
        ThreadLocal<TypedValue> threadLocal = c;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(y5j.s);
        Object objK = null;
        kig<?> kigVarA = string != null ? kig.a(string, resources.getResourcePackageName(i)) : null;
        if (typedArray.getValue(y5j.f39819r, typedValue)) {
            kig<Integer> kigVar = kig.c;
            if (kigVarA == kigVar) {
                int i2 = typedValue.resourceId;
                if (i2 != 0) {
                    objK = Integer.valueOf(i2);
                } else {
                    if (typedValue.type != 16 || typedValue.data != 0) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + kigVarA.c() + ". Must be a reference to a resource.");
                    }
                    objK = 0;
                }
            } else {
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    if (kigVarA != null) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + kigVarA.c() + ". You must use a \"" + kigVar.c() + "\" type to reference other resources.");
                    }
                    kigVarA = kigVar;
                    objK = Integer.valueOf(i3);
                } else if (kigVarA == kig.f23885k) {
                    objK = typedArray.getString(y5j.f39819r);
                } else {
                    int i4 = typedValue.type;
                    if (i4 == 3) {
                        String string2 = typedValue.string.toString();
                        if (kigVarA == null) {
                            kigVarA = kig.d(string2);
                        }
                        objK = kigVarA.k(string2);
                    } else if (i4 == 4) {
                        kigVarA = a(typedValue, kigVarA, kig.g, string, "float");
                        objK = Float.valueOf(typedValue.getFloat());
                    } else if (i4 == 5) {
                        kigVarA = a(typedValue, kigVarA, kig.f23884b, string, "dimension");
                        objK = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                    } else if (i4 == 18) {
                        kigVarA = a(typedValue, kigVarA, kig.i, string, "boolean");
                        objK = Boolean.valueOf(typedValue.data != 0);
                    } else {
                        if (i4 < 16 || i4 > 31) {
                            throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                        }
                        kig<Float> kigVar2 = kig.g;
                        if (kigVarA == kigVar2) {
                            kigVarA = a(typedValue, kigVarA, kigVar2, string, "float");
                            objK = Float.valueOf(typedValue.data);
                        } else {
                            kigVarA = a(typedValue, kigVarA, kig.f23884b, string, "integer");
                            objK = Integer.valueOf(typedValue.data);
                        }
                    }
                }
            }
        }
        if (objK != null) {
            aVar.b(objK);
        }
        if (kigVarA != null) {
            aVar.d(kigVarA);
        }
        return aVar.a();
    }

    public final void f(Resources resources, Bundle bundle, AttributeSet attributeSet, int i) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, y5j.p);
        String string = typedArrayObtainAttributes.getString(y5j.q);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        b bVarE = e(typedArrayObtainAttributes, resources, i);
        if (bVarE.b()) {
            bVarE.c(string, bundle);
        }
        typedArrayObtainAttributes.recycle();
    }

    public final void g(Resources resources, d dVar, AttributeSet attributeSet, int i) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, y5j.p);
        String string = typedArrayObtainAttributes.getString(y5j.q);
        if (string == null) {
            throw new XmlPullParserException("Arguments must have a name");
        }
        dVar.e(string, e(typedArrayObtainAttributes, resources, i));
        typedArrayObtainAttributes.recycle();
    }

    public final void h(Resources resources, d dVar, AttributeSet attributeSet) throws XmlPullParserException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, y5j.u);
        String string = typedArrayObtainAttributes.getString(y5j.x);
        String string2 = typedArrayObtainAttributes.getString(y5j.v);
        String string3 = typedArrayObtainAttributes.getString(y5j.w);
        if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2) && TextUtils.isEmpty(string3)) {
            throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
        }
        c.a aVar = new c.a();
        if (string != null) {
            aVar.d(string.replace("${applicationId}", this.f2693a.getPackageName()));
        }
        if (!TextUtils.isEmpty(string2)) {
            aVar.b(string2.replace("${applicationId}", this.f2693a.getPackageName()));
        }
        if (string3 != null) {
            aVar.c(string3.replace("${applicationId}", this.f2693a.getPackageName()));
        }
        dVar.f(aVar.a());
        typedArrayObtainAttributes.recycle();
    }
}
