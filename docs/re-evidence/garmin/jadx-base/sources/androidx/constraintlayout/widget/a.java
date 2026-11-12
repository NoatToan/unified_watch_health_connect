package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EnumC0083a f6151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f6153e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f6154f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6155g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6156h;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.a$a, reason: collision with other inner class name */
    public enum EnumC0083a {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public a(a aVar, Object obj) {
        this.f6149a = false;
        this.f6150b = aVar.f6150b;
        this.f6151c = aVar.f6151c;
        f(obj);
    }

    public static void d(Context context, XmlPullParser xmlPullParser, HashMap<String, a> map) {
        EnumC0083a enumC0083a;
        Object objValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.f6314f);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf2 = null;
        EnumC0083a enumC0083a2 = null;
        boolean z14 = false;
        for (int i14 = 0; i14 < indexCount; i14++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i14);
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z14 = true;
            } else if (index == 1) {
                objValueOf2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                enumC0083a2 = EnumC0083a.BOOLEAN_TYPE;
            } else {
                if (index == 3) {
                    enumC0083a = EnumC0083a.COLOR_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == 2) {
                    enumC0083a = EnumC0083a.COLOR_DRAWABLE_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == 7) {
                    enumC0083a = EnumC0083a.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    enumC0083a = EnumC0083a.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 5) {
                    enumC0083a = EnumC0083a.FLOAT_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == 6) {
                    enumC0083a = EnumC0083a.INT_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == 9) {
                    enumC0083a = EnumC0083a.STRING_TYPE;
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == 8) {
                    enumC0083a = EnumC0083a.REFERENCE_TYPE;
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                }
                Object obj = objValueOf;
                enumC0083a2 = enumC0083a;
                objValueOf2 = obj;
            }
        }
        if (string != null && objValueOf2 != null) {
            map.put(string, new a(string, enumC0083a2, objValueOf2, z14));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void e(View view2, HashMap<String, a> map) {
        Class<?> cls = view2.getClass();
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            a aVar = map.get(next);
            if (!aVar.f6149a) {
                next = fb1.c.n("set", next);
            }
            try {
                int iOrdinal = aVar.f6151c.ordinal();
                Class cls2 = Float.TYPE;
                Class cls3 = Integer.TYPE;
                switch (iOrdinal) {
                    case 0:
                        cls.getMethod(next, cls3).invoke(view2, Integer.valueOf(aVar.f6152d));
                        break;
                    case 1:
                        cls.getMethod(next, cls2).invoke(view2, Float.valueOf(aVar.f6153e));
                        break;
                    case 2:
                        cls.getMethod(next, cls3).invoke(view2, Integer.valueOf(aVar.f6156h));
                        break;
                    case 3:
                        Method method = cls.getMethod(next, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f6156h);
                        method.invoke(view2, colorDrawable);
                        break;
                    case 4:
                        cls.getMethod(next, CharSequence.class).invoke(view2, aVar.f6154f);
                        break;
                    case 5:
                        cls.getMethod(next, Boolean.TYPE).invoke(view2, Boolean.valueOf(aVar.f6155g));
                        break;
                    case 6:
                        cls.getMethod(next, cls2).invoke(view2, Float.valueOf(aVar.f6153e));
                        break;
                    case 7:
                        cls.getMethod(next, cls3).invoke(view2, Integer.valueOf(aVar.f6152d));
                        break;
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
    }

    public final float a() {
        switch (this.f6151c) {
            case INT_TYPE:
                return this.f6152d;
            case FLOAT_TYPE:
            case DIMENSION_TYPE:
                return this.f6153e;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                kg.f.n("Color does not have a single color to interpolate");
                return 0.0f;
            case STRING_TYPE:
                kg.f.n("Cannot interpolate String");
                return 0.0f;
            case BOOLEAN_TYPE:
                return this.f6155g ? 1.0f : 0.0f;
            default:
                return Float.NaN;
        }
    }

    public final void b(float[] fArr) {
        switch (this.f6151c) {
            case INT_TYPE:
                fArr[0] = this.f6152d;
                break;
            case FLOAT_TYPE:
                fArr[0] = this.f6153e;
                break;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                int i14 = this.f6156h;
                int i15 = (i14 >> 24) & 255;
                float fPow = (float) Math.pow(((i14 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((i14 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((i14 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i15 / 255.0f;
                break;
            case STRING_TYPE:
                kg.f.n("Color does not have a single color to interpolate");
                break;
            case BOOLEAN_TYPE:
                fArr[0] = this.f6155g ? 1.0f : 0.0f;
                break;
            case DIMENSION_TYPE:
                fArr[0] = this.f6153e;
                break;
        }
    }

    public final int c() {
        int iOrdinal = this.f6151c.ordinal();
        return (iOrdinal == 2 || iOrdinal == 3) ? 4 : 1;
    }

    public final void f(Object obj) {
        switch (this.f6151c) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.f6152d = ((Integer) obj).intValue();
                break;
            case FLOAT_TYPE:
                this.f6153e = ((Float) obj).floatValue();
                break;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                this.f6156h = ((Integer) obj).intValue();
                break;
            case STRING_TYPE:
                this.f6154f = (String) obj;
                break;
            case BOOLEAN_TYPE:
                this.f6155g = ((Boolean) obj).booleanValue();
                break;
            case DIMENSION_TYPE:
                this.f6153e = ((Float) obj).floatValue();
                break;
        }
    }

    public a(String str, EnumC0083a enumC0083a, Object obj, boolean z14) {
        this.f6150b = str;
        this.f6151c = enumC0083a;
        this.f6149a = z14;
        f(obj);
    }

    public a(String str, EnumC0083a enumC0083a) {
        this.f6149a = false;
        this.f6150b = str;
        this.f6151c = enumC0083a;
    }
}
