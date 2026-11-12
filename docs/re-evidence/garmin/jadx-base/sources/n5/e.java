package n5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b7.j;
import g6.f;
import java.io.IOException;
import java.util.List;
import o4.d0;
import o4.f0;
import o4.h1;
import o4.q;
import o4.t1;
import o4.u1;
import o4.v1;
import o4.w;
import o4.x;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p005kotlin.Unit;
import p3.n;
import p3.x1;
import u4.h;
import u4.m;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:111:0x0323  */
    /* JADX WARN: Code duplicated, block: B:113:0x0327 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0329  */
    /* JADX WARN: Code duplicated, block: B:115:0x0331  */
    /* JADX WARN: Code duplicated, block: B:120:0x0347  */
    /* JADX WARN: Code duplicated, block: B:122:0x034b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x034d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0355  */
    /* JADX WARN: Code duplicated, block: B:128:0x036d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0370  */
    /* JADX WARN: Code duplicated, block: B:132:0x0378  */
    /* JADX WARN: Code duplicated, block: B:93:0x0296  */
    public static final b.a a(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i14) throws XmlPullParserException, IOException {
        long jB;
        int i15;
        int i16;
        int i17;
        b7.d dVarC;
        int iD;
        Shader shader;
        w t1Var;
        Shader shader2;
        w t1Var2;
        int i18;
        int i19;
        int i24;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        int i25 = 2;
        v4.a aVar = new v4.a(xmlResourceParser, 0, 2, null);
        v4.b.f175513a.getClass();
        TypedArray typedArrayF = j.f(resources, theme, attributeSetAsAttributeSet, v4.b.f175514b);
        aVar.b(typedArrayF.getChangingConfigurations());
        int i26 = v4.b.f175515c;
        XmlPullParser xmlPullParser = aVar.f175510a;
        boolean z14 = !j.e(xmlPullParser, "autoMirrored") ? false : typedArrayF.getBoolean(i26, false);
        aVar.b(typedArrayF.getChangingConfigurations());
        float fA = aVar.a(typedArrayF, "viewportWidth", v4.b.f175520h, 0.0f);
        float fA2 = aVar.a(typedArrayF, "viewportHeight", v4.b.f175519g, 0.0f);
        if (fA <= 0.0f) {
            throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        }
        if (fA2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
        float dimension = typedArrayF.getDimension(v4.b.f175521i, 0.0f);
        aVar.b(typedArrayF.getChangingConfigurations());
        float dimension2 = typedArrayF.getDimension(v4.b.f175516d, 0.0f);
        aVar.b(typedArrayF.getChangingConfigurations());
        int i27 = v4.b.f175517e;
        if (typedArrayF.hasValue(i27)) {
            TypedValue typedValue = new TypedValue();
            typedArrayF.getValue(i27, typedValue);
            if (typedValue.type == 2) {
                d0.f128823b.getClass();
                jB = d0.f128832k;
            } else {
                ColorStateList colorStateListB = j.b(typedArrayF, xmlPullParser, theme, i27);
                aVar.b(typedArrayF.getChangingConfigurations());
                if (colorStateListB != null) {
                    jB = f0.b(colorStateListB.getDefaultColor());
                } else {
                    d0.f128823b.getClass();
                    jB = d0.f128832k;
                }
            }
        } else {
            d0.f128823b.getClass();
            jB = d0.f128832k;
        }
        long j8 = jB;
        int i28 = typedArrayF.getInt(v4.b.f175518f, -1);
        aVar.b(typedArrayF.getChangingConfigurations());
        if (i28 == -1) {
            q.f128930b.getClass();
            i15 = q.f128935g;
        } else if (i28 == 3) {
            q.f128930b.getClass();
            i15 = q.f128933e;
        } else if (i28 == 5) {
            q.f128930b.getClass();
            i15 = q.f128935g;
        } else if (i28 != 9) {
            switch (i28) {
                case 14:
                    q.f128930b.getClass();
                    i15 = q.f128943o;
                    break;
                case 15:
                    q.f128930b.getClass();
                    i15 = q.f128944p;
                    break;
                case 16:
                    q.f128930b.getClass();
                    i15 = q.f128942n;
                    break;
                default:
                    q.f128930b.getClass();
                    i15 = q.f128935g;
                    break;
            }
        } else {
            q.f128930b.getClass();
            i15 = q.f128939k;
        }
        float f14 = dimension / resources.getDisplayMetrics().density;
        f.a aVar2 = f.f75994b;
        float f15 = dimension2 / resources.getDisplayMetrics().density;
        typedArrayF.recycle();
        int i29 = 3;
        int i30 = -1;
        u4.d.a aVar3 = new u4.d.a(null, f14, f15, fA, fA2, j8, i15, z14, 1, null);
        int i34 = 0;
        while (xmlResourceParser.getEventType() != 1 && (xmlResourceParser.getDepth() >= 1 || xmlResourceParser.getEventType() != i29)) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == i25) {
                String name = xmlPullParser.getName();
                if (name != null) {
                    int iHashCode = name.hashCode();
                    h hVar = aVar.f175512c;
                    if (iHashCode == -1649314686) {
                        u4.d.a aVar4 = aVar3;
                        if (name.equals("clip-path")) {
                            v4.b.f175513a.getClass();
                            TypedArray typedArrayF2 = j.f(resources, theme, attributeSetAsAttributeSet, v4.b.F);
                            aVar.b(typedArrayF2.getChangingConfigurations());
                            String string = typedArrayF2.getString(0);
                            aVar.b(typedArrayF2.getChangingConfigurations());
                            String str = string == null ? "" : string;
                            String string2 = typedArrayF2.getString(v4.b.G);
                            aVar.b(typedArrayF2.getChangingConfigurations());
                            List listA = string2 == null ? m.f168519a : h.a(hVar, string2);
                            typedArrayF2.recycle();
                            aVar3 = aVar4;
                            aVar3.a(str, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, listA);
                            i34++;
                        } else {
                            aVar3 = aVar4;
                        }
                    } else if (iHashCode == 3433509) {
                        u4.d.a aVar5 = aVar3;
                        if (name.equals("path")) {
                            v4.b.f175513a.getClass();
                            TypedArray typedArrayF3 = j.f(resources, theme, attributeSetAsAttributeSet, v4.b.f175530r);
                            aVar.b(typedArrayF3.getChangingConfigurations());
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                vb.h.s("No path data available");
                                return null;
                            }
                            String string3 = typedArrayF3.getString(0);
                            aVar.b(typedArrayF3.getChangingConfigurations());
                            String str2 = string3 == null ? "" : string3;
                            String string4 = typedArrayF3.getString(v4.b.f175533u);
                            aVar.b(typedArrayF3.getChangingConfigurations());
                            List listA2 = string4 == null ? m.f168519a : h.a(hVar, string4);
                            b7.d dVarC2 = j.c(typedArrayF3, xmlPullParser, theme, "fillColor", v4.b.f175532t);
                            aVar.b(typedArrayF3.getChangingConfigurations());
                            float fA3 = aVar.a(typedArrayF3, "fillAlpha", v4.b.f175531s, 1.0f);
                            int iD2 = j.d(typedArrayF3, xmlPullParser, "strokeLineCap", v4.b.f175536x, i30);
                            aVar.b(typedArrayF3.getChangingConfigurations());
                            u1.f129010b.getClass();
                            if (iD2 == 0) {
                                i16 = 0;
                            } else {
                                if (iD2 == 1) {
                                    i24 = u1.f129011c;
                                } else if (iD2 != 2) {
                                    i16 = 0;
                                } else {
                                    i24 = u1.f129012d;
                                }
                                i16 = i24;
                            }
                            int iD3 = j.d(typedArrayF3, xmlPullParser, "strokeLineJoin", v4.b.f175537y, i30);
                            aVar.b(typedArrayF3.getChangingConfigurations());
                            v1.f129019b.getClass();
                            if (iD3 != 0) {
                                if (iD3 != 1) {
                                    if (iD3 == 2) {
                                        i19 = v1.f129021d;
                                    }
                                    float fA4 = aVar.a(typedArrayF3, "strokeMiterLimit", v4.b.f175538z, 4.0f);
                                    dVarC = j.c(typedArrayF3, xmlPullParser, theme, "strokeColor", v4.b.f175535w);
                                    aVar.b(typedArrayF3.getChangingConfigurations());
                                    float fA5 = aVar.a(typedArrayF3, "strokeAlpha", v4.b.f175534v, 1.0f);
                                    float fA6 = aVar.a(typedArrayF3, "strokeWidth", v4.b.A, 1.0f);
                                    float fA7 = aVar.a(typedArrayF3, "trimPathEnd", v4.b.B, 1.0f);
                                    float fA8 = aVar.a(typedArrayF3, "trimPathOffset", v4.b.C, 0.0f);
                                    float fA9 = aVar.a(typedArrayF3, "trimPathStart", v4.b.D, 0.0f);
                                    iD = j.d(typedArrayF3, xmlPullParser, "fillType", v4.b.E, 0);
                                    aVar.b(typedArrayF3.getChangingConfigurations());
                                    typedArrayF3.recycle();
                                    shader = dVarC2.f16239a;
                                    if (shader != null && dVarC2.f16241c == 0) {
                                        t1Var = null;
                                    } else if (shader != null) {
                                        t1Var = new x(shader);
                                    } else {
                                        t1Var = new t1(f0.b(dVarC2.f16241c), null);
                                    }
                                    shader2 = dVarC.f16239a;
                                    if (shader2 != null && dVarC.f16241c == 0) {
                                        t1Var2 = null;
                                    } else if (shader2 != null) {
                                        t1Var2 = new x(shader2);
                                    } else {
                                        t1Var2 = new t1(f0.b(dVarC.f16241c), null);
                                    }
                                    h1.f128863b.getClass();
                                    if (iD == 0) {
                                        i18 = 0;
                                    } else {
                                        i18 = h1.f128864c;
                                    }
                                    if (aVar5.f168396k) {
                                        e5.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    ((u4.d.a.C3159a) am.j.f(1, aVar5.f168394i)).f168406j.add(new u4.q(str2, listA2, i18, t1Var, fA3, t1Var2, fA5, fA6, i16, i17, fA4, fA9, fA7, fA8, null));
                                } else {
                                    i19 = v1.f129020c;
                                }
                                i17 = i19;
                                float fA10 = aVar.a(typedArrayF3, "strokeMiterLimit", v4.b.f175538z, 4.0f);
                                dVarC = j.c(typedArrayF3, xmlPullParser, theme, "strokeColor", v4.b.f175535w);
                                aVar.b(typedArrayF3.getChangingConfigurations());
                                float fA11 = aVar.a(typedArrayF3, "strokeAlpha", v4.b.f175534v, 1.0f);
                                float fA12 = aVar.a(typedArrayF3, "strokeWidth", v4.b.A, 1.0f);
                                float fA13 = aVar.a(typedArrayF3, "trimPathEnd", v4.b.B, 1.0f);
                                float fA14 = aVar.a(typedArrayF3, "trimPathOffset", v4.b.C, 0.0f);
                                float fA15 = aVar.a(typedArrayF3, "trimPathStart", v4.b.D, 0.0f);
                                iD = j.d(typedArrayF3, xmlPullParser, "fillType", v4.b.E, 0);
                                aVar.b(typedArrayF3.getChangingConfigurations());
                                typedArrayF3.recycle();
                                shader = dVarC2.f16239a;
                                if (shader != null) {
                                    t1Var = null;
                                } else if (shader != null) {
                                    t1Var = new x(shader);
                                } else {
                                    t1Var = new t1(f0.b(dVarC2.f16241c), null);
                                }
                                shader2 = dVarC.f16239a;
                                if (shader2 != null) {
                                    t1Var2 = null;
                                } else if (shader2 != null) {
                                    t1Var2 = new x(shader2);
                                } else {
                                    t1Var2 = new t1(f0.b(dVarC.f16241c), null);
                                }
                                h1.f128863b.getClass();
                                if (iD == 0) {
                                    i18 = 0;
                                } else {
                                    i18 = h1.f128864c;
                                }
                                if (aVar5.f168396k) {
                                    e5.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                ((u4.d.a.C3159a) am.j.f(1, aVar5.f168394i)).f168406j.add(new u4.q(str2, listA2, i18, t1Var, fA3, t1Var2, fA11, fA12, i16, i17, fA10, fA15, fA13, fA14, null));
                            }
                            i17 = 0;
                            float fA16 = aVar.a(typedArrayF3, "strokeMiterLimit", v4.b.f175538z, 4.0f);
                            dVarC = j.c(typedArrayF3, xmlPullParser, theme, "strokeColor", v4.b.f175535w);
                            aVar.b(typedArrayF3.getChangingConfigurations());
                            float fA17 = aVar.a(typedArrayF3, "strokeAlpha", v4.b.f175534v, 1.0f);
                            float fA18 = aVar.a(typedArrayF3, "strokeWidth", v4.b.A, 1.0f);
                            float fA19 = aVar.a(typedArrayF3, "trimPathEnd", v4.b.B, 1.0f);
                            float fA110 = aVar.a(typedArrayF3, "trimPathOffset", v4.b.C, 0.0f);
                            float fA111 = aVar.a(typedArrayF3, "trimPathStart", v4.b.D, 0.0f);
                            iD = j.d(typedArrayF3, xmlPullParser, "fillType", v4.b.E, 0);
                            aVar.b(typedArrayF3.getChangingConfigurations());
                            typedArrayF3.recycle();
                            shader = dVarC2.f16239a;
                            if (shader != null) {
                                t1Var = null;
                            } else if (shader != null) {
                                t1Var = new x(shader);
                            } else {
                                t1Var = new t1(f0.b(dVarC2.f16241c), null);
                            }
                            shader2 = dVarC.f16239a;
                            if (shader2 != null) {
                                t1Var2 = null;
                            } else if (shader2 != null) {
                                t1Var2 = new x(shader2);
                            } else {
                                t1Var2 = new t1(f0.b(dVarC.f16241c), null);
                            }
                            h1.f128863b.getClass();
                            if (iD == 0) {
                                i18 = 0;
                            } else {
                                i18 = h1.f128864c;
                            }
                            if (aVar5.f168396k) {
                                e5.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                            }
                            ((u4.d.a.C3159a) am.j.f(1, aVar5.f168394i)).f168406j.add(new u4.q(str2, listA2, i18, t1Var, fA3, t1Var2, fA17, fA18, i16, i17, fA16, fA111, fA19, fA110, null));
                        }
                        aVar3 = aVar5;
                    } else if (iHashCode == 98629247 && name.equals("group")) {
                        v4.b.f175513a.getClass();
                        TypedArray typedArrayF4 = j.f(resources, theme, attributeSetAsAttributeSet, v4.b.f175522j);
                        aVar.b(typedArrayF4.getChangingConfigurations());
                        float fA20 = aVar.a(typedArrayF4, "rotation", v4.b.f175525m, 0.0f);
                        float f16 = typedArrayF4.getFloat(v4.b.f175523k, 0.0f);
                        aVar.b(typedArrayF4.getChangingConfigurations());
                        float f17 = typedArrayF4.getFloat(v4.b.f175524l, 0.0f);
                        aVar.b(typedArrayF4.getChangingConfigurations());
                        float fA21 = aVar.a(typedArrayF4, "scaleX", v4.b.f175526n, 1.0f);
                        float fA22 = aVar.a(typedArrayF4, "scaleY", v4.b.f175527o, 1.0f);
                        float fA23 = aVar.a(typedArrayF4, "translateX", v4.b.f175528p, 0.0f);
                        float fA24 = aVar.a(typedArrayF4, "translateY", v4.b.f175529q, 0.0f);
                        String string5 = typedArrayF4.getString(0);
                        aVar.b(typedArrayF4.getChangingConfigurations());
                        String str3 = string5 == null ? "" : string5;
                        typedArrayF4.recycle();
                        aVar3.a(str3, fA20, f16, f17, fA21, fA22, fA23, fA24, m.f168519a);
                    }
                }
                xmlResourceParser.next();
                i25 = 2;
                i29 = 3;
                i30 = -1;
            } else if (eventType == i29 && "group".equals(xmlPullParser.getName())) {
                int i35 = i34 + 1;
                for (int i36 = 0; i36 < i35; i36++) {
                    aVar3.d();
                }
                i34 = 0;
            }
            xmlResourceParser.next();
            i25 = 2;
            i29 = 3;
            i30 = -1;
        }
        return new b.a(aVar3.c(), i14 | aVar.f175511b);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x006a  */
    /* JADX WARN: Code duplicated, block: B:23:0x007a  */
    public static final u4.d b(int i14, p3.m mVar, int i15) {
        TypedValue typedValue;
        XmlResourceParser xml;
        int next;
        x1 x1Var = n.f135158a;
        Context context = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
        Resources resources = (Resources) mVar.A(AndroidCompositionLocals_androidKt.f6043c);
        Resources.Theme theme = context.getTheme();
        boolean zB = ((((i15 & 112) ^ 48) > 32 && mVar.k(i14)) || (i15 & 48) == 32) | mVar.B(resources) | mVar.B(theme) | mVar.B(resources.getConfiguration());
        Object objQ = mVar.q();
        if (zB) {
            typedValue = new TypedValue();
            resources.getValue(i14, typedValue, true);
            xml = resources.getXml(i14);
            next = xml.next();
            while (next != 2) {
                next = xml.next();
            }
            if (next == 2) {
                throw new XmlPullParserException("No start tag found");
            }
            Unit unit = Unit.INSTANCE;
            objQ = a(theme, resources, xml, typedValue.changingConfigurations).f123714a;
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                typedValue = new TypedValue();
                resources.getValue(i14, typedValue, true);
                xml = resources.getXml(i14);
                next = xml.next();
                while (next != 2 && next != 1) {
                    next = xml.next();
                }
                if (next == 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                Unit unit2 = Unit.INSTANCE;
                objQ = a(theme, resources, xml, typedValue.changingConfigurations).f123714a;
                mVar.K(objQ);
            }
        }
        return (u4.d) objQ;
    }
}
