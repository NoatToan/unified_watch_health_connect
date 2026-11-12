package b7;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.garmin.android.apps.connectmobile.R;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f16238a = new ThreadLocal<>();

    private c() {
    }

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r34v0, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        float f14;
        int iA;
        float f15;
        float f16;
        TypedValue typedValue;
        resources = resources;
        attributeSet = attributeSet;
        theme = theme;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r14 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr = new int[20];
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == r14 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr2 = y6.a.f194587a;
                ?? ObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr2) : theme.obtainStyledAttributes(attributeSet, iArr2, i14, i14);
                int resourceId = ObtainAttributes.getResourceId(i14, -1);
                if (resourceId == -1) {
                    color = ObtainAttributes.getColor(i14, -65281);
                } else {
                    ThreadLocal<TypedValue> threadLocal = f16238a;
                    TypedValue typedValue2 = threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    resources.getValue(resourceId, typedValue, r14);
                    int i16 = typedValue.type;
                    if (i16 < 28 || i16 > 31) {
                        try {
                            color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = ObtainAttributes.getColor(i14, -65281);
                        }
                    } else {
                        color = ObtainAttributes.getColor(i14, -65281);
                    }
                }
                if (ObtainAttributes.hasValue(r14)) {
                    f14 = ObtainAttributes.getFloat(r14, 1.0f);
                } else {
                    f14 = ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                }
                ?? r16 = r14;
                float f17 = (Build.VERSION.SDK_INT < 31 || !ObtainAttributes.hasValue(2)) ? ObtainAttributes.getFloat(4, -1.0f) : ObtainAttributes.getFloat(2, -1.0f);
                ObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i17 = i14;
                int i18 = i17;
                while (i17 < attributeCount) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i17);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                        int i19 = i18 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i17, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i18] = attributeNameResource;
                        i18 = i19;
                    }
                    i17++;
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr3, i18);
                float f18 = 0.0f;
                boolean z14 = (f17 < 0.0f || f17 > 100.0f) ? false : r16 == true ? 1 : 0;
                if (f14 != 1.0f || z14) {
                    int iB = g7.a.b((int) ((Color.alpha(color) * f14) + 0.5f), 0, 255);
                    if (z14) {
                        a aVarA = a.a(color);
                        float f19 = aVarA.f16228a;
                        float f22 = aVarA.f16229b;
                        k kVar = k.f16266k;
                        if (f22 >= 1.0d && Math.round(f17) > 0.0d && Math.round(f17) < 100.0d) {
                            float fMin = f19 < 0.0f ? 0.0f : Math.min(360.0f, f19);
                            float fC = f22;
                            boolean z15 = r16 == true ? 1 : 0;
                            a aVar = null;
                            while (true) {
                                if (Math.abs(f18 - f22) < 0.4f) {
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    depth2 = depth2;
                                    float f24 = f17;
                                    if (aVar != null) {
                                        iA = aVar.c(kVar);
                                        break;
                                    }
                                    iA = b.a(f24);
                                    break;
                                }
                                float f25 = 1000.0f;
                                iArrTrimStateSet = iArrTrimStateSet;
                                float f26 = 0.0f;
                                float f27 = 100.0f;
                                float f28 = 1000.0f;
                                a aVar2 = null;
                                while (true) {
                                    if (Math.abs(f26 - f27) <= 0.01f) {
                                        depth2 = depth2;
                                        f17 = f17;
                                        break;
                                    }
                                    float fC2 = q6.f.c(f27, f26, 2.0f, f26);
                                    float f29 = f27;
                                    int iC = a.b(fC2, fC, fMin).c(k.f16266k);
                                    float fB = b.b(Color.red(iC));
                                    float fB2 = b.b(Color.green(iC));
                                    float fB3 = b.b(Color.blue(iC));
                                    float[] fArr = b.f16237d[r16 == true ? 1 : 0];
                                    float f34 = ((fB3 * fArr[2]) + ((fB2 * fArr[r16 == true ? 1 : 0]) + (fB * fArr[0]))) / 100.0f;
                                    float fCbrt = f34 <= 0.008856452f ? f34 * 903.2963f : (((float) Math.cbrt(f34)) * 116.0f) - 16.0f;
                                    float fAbs = Math.abs(f17 - fCbrt);
                                    if (fAbs < 0.2f) {
                                        a aVarA2 = a.a(iC);
                                        f15 = fCbrt;
                                        f16 = fC2;
                                        a aVarB = a.b(aVarA2.f16230c, aVarA2.f16229b, fMin);
                                        float f35 = aVarA2.f16231d - aVarB.f16231d;
                                        float f36 = aVarA2.f16232e - aVarB.f16232e;
                                        float f37 = aVarA2.f16233f - aVarB.f16233f;
                                        depth2 = depth2;
                                        f17 = f17;
                                        float fPow = (float) (Math.pow(Math.sqrt((f37 * f37) + (f36 * f36) + (f35 * f35)), 0.63d) * 1.41d);
                                        if (fPow <= 1.0f) {
                                            aVar2 = aVarA2;
                                            f28 = fPow;
                                            f25 = fAbs;
                                        }
                                    } else {
                                        f15 = fCbrt;
                                        f16 = fC2;
                                        depth2 = depth2;
                                        f17 = f17;
                                    }
                                    if (f25 == 0.0f && f28 == 0.0f) {
                                        break;
                                    }
                                    if (f15 < f17) {
                                        f27 = f29;
                                        f26 = f16;
                                    } else {
                                        f27 = f16;
                                    }
                                    depth2 = depth2;
                                    f17 = f17;
                                }
                                a aVar3 = aVar2;
                                if (!z15) {
                                    if (aVar3 == null) {
                                        f22 = fC;
                                    } else {
                                        aVar = aVar3;
                                        f18 = fC;
                                    }
                                    fC = q6.f.c(f22, f18, 2.0f, f18);
                                } else {
                                    if (aVar3 != null) {
                                        iA = aVar3.c(kVar);
                                        break;
                                    }
                                    fC = q6.f.c(f22, f18, 2.0f, f18);
                                    z15 = false;
                                }
                            }
                        } else {
                            iArrTrimStateSet = iArrTrimStateSet;
                            depth2 = depth2;
                            iA = b.a(f17);
                        }
                        color = iA;
                    } else {
                        iArrTrimStateSet = iArrTrimStateSet;
                        depth2 = depth2;
                    }
                    color = (16777215 & color) | (iB << 24);
                } else {
                    iArrTrimStateSet = iArrTrimStateSet;
                    depth2 = depth2;
                }
                int i24 = i15 + 1;
                if (i24 > iArr.length) {
                    int[] iArr4 = new int[i15 <= 4 ? 8 : i15 * 2];
                    System.arraycopy(iArr, 0, iArr4, 0, i15);
                    iArr = iArr4;
                }
                iArr[i15] = color;
                if (i24 > objArr.length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i15 > 4 ? i15 * 2 : 8);
                    System.arraycopy(objArr, 0, objArr2, 0, i15);
                    objArr = objArr2;
                }
                objArr[i15] = iArrTrimStateSet;
                objArr = (int[][]) objArr;
                i15 = i24;
                r14 = r16 == true ? 1 : 0;
                depth2 = depth2;
                i14 = 0;
            } else {
                int i25 = depth2;
                r14 = r14 == true ? 1 : 0;
                depth2 = i25;
                i14 = 0;
            }
        }
        int[] iArr5 = new int[i15];
        int[][] iArr6 = new int[i15][];
        System.arraycopy(iArr, 0, iArr5, 0, i15);
        System.arraycopy(objArr, 0, iArr6, 0, i15);
        return new ColorStateList(iArr6, iArr5);
    }
}
