package lc;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.util.Arrays;
import okhttp3.HttpUrl;
import org.xmlpull.v1.XmlPullParserException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Llc/n0;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Llc/w0;", "navigatorProvider", "<init>", "(Landroid/content/Context;Llc/w0;)V", "a", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f111800c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f111801d = new ThreadLocal<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f111802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f111803b;

    public n0(Context context, w0 w0Var) {
        context.getClass();
        w0Var.getClass();
        this.f111802a = context;
        this.f111803b = w0Var;
    }

    public static t c(TypedArray typedArray, Resources resources, int i14) throws XmlPullParserException {
        q0<Object> q0VarA;
        q0<Object> q0Var;
        int iValueOf;
        t.a aVar = new t.a();
        aVar.f111872b = typedArray.getBoolean(3, false);
        ThreadLocal<TypedValue> threadLocal = f111801d;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(2);
        Object objH = null;
        if (string != null) {
            q0.b bVar = q0.f111837b;
            String resourcePackageName = resources.getResourcePackageName(i14);
            bVar.getClass();
            q0VarA = q0.f111838c;
            q0VarA.getClass();
            if (!"integer".equals(string)) {
                q0VarA = q0.f111840e;
                q0VarA.getClass();
                if (!"integer[]".equals(string)) {
                    q0VarA = q0.f111841f;
                    q0VarA.getClass();
                    if (!"List<Int>".equals(string)) {
                        q0VarA = q0.f111842g;
                        q0VarA.getClass();
                        if (!"long".equals(string)) {
                            q0VarA = q0.f111843h;
                            q0VarA.getClass();
                            if (!"long[]".equals(string)) {
                                q0VarA = q0.f111844i;
                                q0VarA.getClass();
                                if (!"List<Long>".equals(string)) {
                                    q0VarA = q0.f111848m;
                                    q0VarA.getClass();
                                    if (!"boolean".equals(string)) {
                                        q0VarA = q0.f111849n;
                                        q0VarA.getClass();
                                        if (!"boolean[]".equals(string)) {
                                            q0VarA = q0.f111850o;
                                            q0VarA.getClass();
                                            if (!"List<Boolean>".equals(string)) {
                                                q0VarA = q0.f111851p;
                                                q0VarA.getClass();
                                                if (!"string".equals(string)) {
                                                    q0VarA = q0.f111852q;
                                                    q0VarA.getClass();
                                                    if (!"string[]".equals(string)) {
                                                        q0VarA = q0.f111853r;
                                                        q0VarA.getClass();
                                                        if (!"List<String>".equals(string)) {
                                                            q0VarA = q0.f111845j;
                                                            q0VarA.getClass();
                                                            if (!"float".equals(string)) {
                                                                q0VarA = q0.f111846k;
                                                                q0VarA.getClass();
                                                                if (!"float[]".equals(string)) {
                                                                    q0VarA = q0.f111847l;
                                                                    q0VarA.getClass();
                                                                    if (!"List<Float>".equals(string)) {
                                                                        q0VarA = null;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (q0VarA == null) {
                q0VarA = q0.f111839d;
                q0VarA.getClass();
                if (!"reference".equals(string)) {
                    if (string.length() == 0) {
                        q0VarA = q0.f111851p;
                    } else {
                        try {
                            String strConcat = (!d53.u.y(string, ".", false) || resourcePackageName == null) ? string : resourcePackageName.concat(string);
                            boolean zP = d53.u.p(string, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, false);
                            if (zP) {
                                strConcat = strConcat.substring(0, strConcat.length() - 2);
                            }
                            q0VarA = q0.b.a(Class.forName(strConcat), zP);
                            if (q0VarA == null) {
                                throw new IllegalArgumentException(strConcat.concat(" is not Serializable or Parcelable.").toString());
                            }
                        } catch (ClassNotFoundException e4) {
                            o2.c.p(e4);
                            return null;
                        }
                    }
                }
            }
        } else {
            q0VarA = null;
        }
        if (typedArray.getValue(1, typedValue)) {
            q0.a aVar2 = q0.f111839d;
            int i15 = typedValue.resourceId;
            if (q0VarA == aVar2) {
                if (i15 != 0) {
                    iValueOf = Integer.valueOf(i15);
                } else {
                    if (typedValue.type != 16 || typedValue.data != 0) {
                        StringBuilder sb3 = new StringBuilder("unsupported value '");
                        sb3.append((Object) typedValue.string);
                        String strB = q0VarA.b();
                        sb3.append("' for ");
                        sb3.append(strB);
                        sb3.append(". Must be a reference to a resource.");
                        throw new XmlPullParserException(sb3.toString());
                    }
                    iValueOf = 0;
                }
            } else if (i15 != 0) {
                if (q0VarA != null) {
                    StringBuilder sb4 = new StringBuilder("unsupported value '");
                    sb4.append((Object) typedValue.string);
                    String strB2 = q0VarA.b();
                    aVar2.getClass();
                    sb4.append("' for ");
                    sb4.append(strB2);
                    sb4.append(". You must use a \"reference\" type to reference other resources.");
                    throw new XmlPullParserException(sb4.toString());
                }
                iValueOf = Integer.valueOf(i15);
                q0VarA = aVar2;
            } else if (q0VarA == q0.f111851p) {
                objH = typedArray.getString(1);
            } else {
                int i16 = typedValue.type;
                if (i16 != 3) {
                    a aVar3 = f111800c;
                    if (i16 == 4) {
                        j jVar = q0.f111845j;
                        aVar3.getClass();
                        q0VarA = a.a(typedValue, q0VarA, jVar, string, "float");
                        objH = Float.valueOf(typedValue.getFloat());
                    } else if (i16 == 5) {
                        n nVar = q0.f111838c;
                        aVar3.getClass();
                        q0VarA = a.a(typedValue, q0VarA, nVar, string, "dimension");
                        objH = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                    } else if (i16 == 18) {
                        f fVar = q0.f111848m;
                        aVar3.getClass();
                        q0VarA = a.a(typedValue, q0VarA, fVar, string, "boolean");
                        objH = Boolean.valueOf(typedValue.data != 0);
                    } else {
                        if (i16 < 16 || i16 > 31) {
                            throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                        }
                        j jVar2 = q0.f111845j;
                        if (q0VarA == jVar2) {
                            aVar3.getClass();
                            q0VarA = a.a(typedValue, q0VarA, jVar2, string, "float");
                            objH = Float.valueOf(typedValue.data);
                        } else {
                            n nVar2 = q0.f111838c;
                            aVar3.getClass();
                            q0VarA = a.a(typedValue, q0VarA, nVar2, string, "integer");
                            objH = Integer.valueOf(typedValue.data);
                        }
                    }
                } else {
                    String string2 = typedValue.string.toString();
                    if (q0VarA == null) {
                        q0.f111837b.getClass();
                        string2.getClass();
                        try {
                            try {
                                try {
                                    try {
                                        q0Var = q0.f111838c;
                                        q0Var.h(string2);
                                    } catch (IllegalArgumentException unused) {
                                        q0Var = q0.f111842g;
                                        q0Var.h(string2);
                                    }
                                } catch (IllegalArgumentException unused2) {
                                    q0Var = q0.f111848m;
                                    q0Var.h(string2);
                                }
                            } catch (IllegalArgumentException unused3) {
                                q0Var = q0.f111845j;
                                q0Var.h(string2);
                            }
                        } catch (IllegalArgumentException unused4) {
                            q0Var = q0.f111851p;
                            q0Var.getClass();
                        }
                        q0VarA = q0Var;
                    }
                    objH = q0VarA.h(string2);
                }
            }
            objH = iValueOf;
        }
        if (objH != null) {
            aVar.f111873c = objH;
            aVar.f111874d = true;
        }
        if (q0VarA != null) {
            aVar.f111871a = q0VarA;
        }
        return aVar.a();
    }

    public final h0 a(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i14) throws XmlPullParserException, IOException {
        int depth;
        Context context;
        int i15;
        int depth2;
        Object obj;
        int i16 = i14;
        String name = xmlResourceParser.getName();
        name.getClass();
        h0 h0VarA = this.f111803b.c(name).a();
        Context context2 = this.f111802a;
        h0VarA.i(context2, attributeSet);
        int i17 = 1;
        int depth3 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == i17 || ((depth = xmlResourceParser.getDepth()) < depth3 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth3) {
                String name2 = xmlResourceParser.getName();
                boolean zEquals = "argument".equals(name2);
                int[] iArr = mc.a.f117762b;
                if (zEquals) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, iArr);
                    typedArrayObtainAttributes.getClass();
                    String string = typedArrayObtainAttributes.getString(0);
                    if (string == null) {
                        throw new XmlPullParserException("Arguments must have a name");
                    }
                    t tVarC = c(typedArrayObtainAttributes, resources, i16);
                    qc.j jVar = h0VarA.f111773b;
                    jVar.getClass();
                    jVar.f144345d.put(string, tVarC);
                    Unit unit = Unit.INSTANCE;
                    typedArrayObtainAttributes.recycle();
                } else if ("deepLink".equals(name2)) {
                    TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(attributeSet, mc.a.f117763c);
                    typedArrayObtainAttributes2.getClass();
                    String string2 = typedArrayObtainAttributes2.getString(3);
                    String string3 = typedArrayObtainAttributes2.getString(i17);
                    String string4 = typedArrayObtainAttributes2.getString(2);
                    if ((string2 == null || string2.length() == 0) && ((string3 == null || string3.length() == 0) && (string4 == null || string4.length() == 0))) {
                        throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
                    }
                    d0.a aVar = new d0.a();
                    if (string2 != null) {
                        String packageName = context2.getPackageName();
                        packageName.getClass();
                        aVar.f111748a = d53.u.v(string2, "${applicationId}", packageName, false);
                    }
                    if (string3 != null && string3.length() != 0) {
                        String packageName2 = context2.getPackageName();
                        packageName2.getClass();
                        aVar.b(d53.u.v(string3, "${applicationId}", packageName2, false));
                    }
                    if (string4 != null) {
                        String packageName3 = context2.getPackageName();
                        packageName3.getClass();
                        aVar.f111750c = d53.u.v(string4, "${applicationId}", packageName3, false);
                    }
                    h0VarA.a(aVar.a());
                    Unit unit2 = Unit.INSTANCE;
                    typedArrayObtainAttributes2.recycle();
                } else {
                    if ("action".equals(name2)) {
                        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, mc.a.f117761a, 0, 0);
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                        s sVar = new s(typedArrayObtainStyledAttributes.getResourceId(i17, 0), null, null, 6, null);
                        int i18 = i17;
                        o0.a aVar2 = new o0.a();
                        aVar2.f111816a = typedArrayObtainStyledAttributes.getBoolean(4, false);
                        aVar2.f111817b = typedArrayObtainStyledAttributes.getBoolean(10, false);
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(7, -1);
                        context = context2;
                        boolean z14 = typedArrayObtainStyledAttributes.getBoolean(8, false);
                        i15 = depth3;
                        boolean z15 = typedArrayObtainStyledAttributes.getBoolean(9, false);
                        aVar2.f111818c = resourceId2;
                        aVar2.f111819d = null;
                        aVar2.f111822g = z14;
                        aVar2.f111823h = z15;
                        aVar2.f111824i = typedArrayObtainStyledAttributes.getResourceId(2, -1);
                        aVar2.f111825j = typedArrayObtainStyledAttributes.getResourceId(3, -1);
                        aVar2.f111826k = typedArrayObtainStyledAttributes.getResourceId(5, -1);
                        aVar2.f111827l = typedArrayObtainStyledAttributes.getResourceId(6, -1);
                        sVar.f111864b = aVar2.a();
                        p13.k0.f134949a.getClass();
                        Bundle bundleA = h7.c.a((o13.p[]) Arrays.copyOf(new o13.p[0], 0));
                        int depth4 = xmlResourceParser.getDepth() + 1;
                        while (true) {
                            int next2 = xmlResourceParser.next();
                            if (next2 == i18 || ((depth2 = xmlResourceParser.getDepth()) < depth4 && next2 == 3)) {
                                break;
                            }
                            if (next2 == 2 && depth2 <= depth4) {
                                if ("argument".equals(xmlResourceParser.getName())) {
                                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(attributeSet, iArr);
                                    typedArrayObtainAttributes3.getClass();
                                    String string5 = typedArrayObtainAttributes3.getString(0);
                                    if (string5 == null) {
                                        throw new XmlPullParserException("Arguments must have a name");
                                    }
                                    t tVarC2 = c(typedArrayObtainAttributes3, resources, i16);
                                    boolean z16 = tVarC2.f111868c;
                                    if (z16 && z16 && (obj = tVarC2.f111870e) != null) {
                                        tVarC2.f111866a.e(bundleA, string5, obj);
                                    }
                                    Unit unit3 = Unit.INSTANCE;
                                    typedArrayObtainAttributes3.recycle();
                                }
                                i16 = i14;
                            }
                            i18 = 1;
                        }
                        if (!bundleA.isEmpty()) {
                            sVar.f111865c = bundleA;
                        }
                        h0VarA.j(resourceId, sVar);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        context = context2;
                        i15 = depth3;
                        if ("include".equals(name2) && (h0VarA instanceof j0)) {
                            TypedArray typedArrayObtainAttributes4 = resources.obtainAttributes(attributeSet, z0.f111920c);
                            typedArrayObtainAttributes4.getClass();
                            ((j0) h0VarA).f111791g.a(b(typedArrayObtainAttributes4.getResourceId(0, 0)));
                            Unit unit4 = Unit.INSTANCE;
                            typedArrayObtainAttributes4.recycle();
                        } else if (h0VarA instanceof j0) {
                            ((j0) h0VarA).f111791g.a(a(resources, xmlResourceParser, attributeSet, i14));
                        }
                    }
                    i16 = i14;
                    context2 = context;
                    depth3 = i15;
                    i17 = 1;
                }
            }
        }
        return h0VarA;
    }

    @SuppressLint({"ResourceType"})
    public final j0 b(int i14) {
        int next;
        Resources resources = this.f111802a.getResources();
        XmlResourceParser xml = resources.getXml(i14);
        xml.getClass();
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e4) {
                    throw new RuntimeException("Exception inflating " + resources.getResourceName(i14) + " line " + xml.getLineNumber(), e4);
                }
            } catch (Throwable th3) {
                xml.close();
                throw th3;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        attributeSetAsAttributeSet.getClass();
        h0 h0VarA = a(resources, xml, attributeSetAsAttributeSet, i14);
        if (h0VarA instanceof j0) {
            j0 j0Var = (j0) h0VarA;
            xml.close();
            return j0Var;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Llc/n0$a;", "", "<init>", "()V", "", "TAG_ARGUMENT", "Ljava/lang/String;", "TAG_DEEP_LINK", "TAG_ACTION", "TAG_INCLUDE", "APPLICATION_ID_PLACEHOLDER", "Ljava/lang/ThreadLocal;", "Landroid/util/TypedValue;", "sTmpValue", "Ljava/lang/ThreadLocal;", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static q0 a(TypedValue typedValue, q0 q0Var, q0 q0Var2, String str, String str2) throws XmlPullParserException {
            q0Var2.getClass();
            if (q0Var == null || q0Var == q0Var2) {
                return q0Var == null ? q0Var2 : q0Var;
            }
            StringBuilder sbI = p6.b.i("Type is ", str, " but found ", str2, ": ");
            sbI.append(typedValue.data);
            throw new XmlPullParserException(sbI.toString());
        }

        private a() {
        }
    }
}
