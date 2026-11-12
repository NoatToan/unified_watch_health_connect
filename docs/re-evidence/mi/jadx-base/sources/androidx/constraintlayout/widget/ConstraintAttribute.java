package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import com.mi.health.course.export.data.CourseConfigModel;
import defpackage.u4j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f1997b;
    public AttributeType c;
    public int d;
    public float e;
    public String f;
    public boolean g;
    public int h;

    public enum AttributeType {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1998a;

        static {
            int[] iArr = new int[AttributeType.values().length];
            f1998a = iArr;
            try {
                iArr[AttributeType.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1998a[AttributeType.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1998a[AttributeType.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1998a[AttributeType.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1998a[AttributeType.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1998a[AttributeType.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1998a[AttributeType.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1998a[AttributeType.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public ConstraintAttribute(String str, AttributeType attributeType, Object obj, boolean z) {
        this.f1997b = str;
        this.c = attributeType;
        this.f1996a = z;
        k(obj);
    }

    public static HashMap<String, ConstraintAttribute> b(HashMap<String, ConstraintAttribute> map, View view) {
        HashMap<String, ConstraintAttribute> map2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            ConstraintAttribute constraintAttribute = map.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    map2.put(str, new ConstraintAttribute(constraintAttribute, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    map2.put(str, new ConstraintAttribute(constraintAttribute, cls.getMethod("getMap" + str, new Class[0]).invoke(view, new Object[0])));
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
        return map2;
    }

    public static void i(Context context, XmlPullParser xmlPullParser, HashMap<String, ConstraintAttribute> map) {
        AttributeType attributeType;
        Object objValueOf;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), u4j.s5);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        Object objValueOf2 = null;
        AttributeType attributeType2 = null;
        boolean z = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == u4j.t5) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == u4j.D5) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z = true;
            } else if (index == u4j.u5) {
                objValueOf2 = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                attributeType2 = AttributeType.BOOLEAN_TYPE;
            } else {
                if (index == u4j.w5) {
                    attributeType = AttributeType.COLOR_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == u4j.v5) {
                    attributeType = AttributeType.COLOR_DRAWABLE_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == u4j.A5) {
                    attributeType = AttributeType.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == u4j.x5) {
                    attributeType = AttributeType.DIMENSION_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == u4j.y5) {
                    attributeType = AttributeType.FLOAT_TYPE;
                    objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == u4j.z5) {
                    attributeType = AttributeType.INT_TYPE;
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == u4j.C5) {
                    attributeType = AttributeType.STRING_TYPE;
                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == u4j.B5) {
                    attributeType = AttributeType.REFERENCE_TYPE;
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    objValueOf = Integer.valueOf(resourceId);
                }
                Object obj = objValueOf;
                attributeType2 = attributeType;
                objValueOf2 = obj;
            }
        }
        if (string != null && objValueOf2 != null) {
            map.put(string, new ConstraintAttribute(string, attributeType2, objValueOf2, z));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void j(View view, HashMap<String, ConstraintAttribute> map) {
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            ConstraintAttribute constraintAttribute = map.get(str);
            String str2 = constraintAttribute.f1996a ? str : CourseConfigModel.DevCmd.CMD_ACTION_SET + str;
            try {
                switch (a.f1998a[constraintAttribute.c.ordinal()]) {
                    case 1:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.d));
                        break;
                    case 2:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(constraintAttribute.g));
                        break;
                    case 3:
                        cls.getMethod(str2, CharSequence.class).invoke(view, constraintAttribute.f);
                        break;
                    case 4:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.h));
                        break;
                    case 5:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(constraintAttribute.h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 6:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.d));
                        break;
                    case 7:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.e));
                        break;
                    case 8:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.e));
                        break;
                }
            } catch (IllegalAccessException e) {
                StringBuilder sb = new StringBuilder();
                sb.append(" Custom Attribute \"");
                sb.append(str);
                sb.append("\" not found on ");
                sb.append(cls.getName());
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.getMessage();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(" Custom Attribute \"");
                sb2.append(str);
                sb2.append("\" not found on ");
                sb2.append(cls.getName());
                StringBuilder sb3 = new StringBuilder();
                sb3.append(cls.getName());
                sb3.append(" must have a method ");
                sb3.append(str2);
            } catch (InvocationTargetException e3) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(" Custom Attribute \"");
                sb4.append(str);
                sb4.append("\" not found on ");
                sb4.append(cls.getName());
                e3.printStackTrace();
            }
        }
    }

    public void a(View view) {
        String str;
        Class<?> cls = view.getClass();
        String str2 = this.f1997b;
        if (this.f1996a) {
            str = str2;
        } else {
            str = CourseConfigModel.DevCmd.CMD_ACTION_SET + str2;
        }
        try {
            switch (a.f1998a[this.c.ordinal()]) {
                case 1:
                case 6:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(this.d));
                    break;
                case 2:
                    cls.getMethod(str, Boolean.TYPE).invoke(view, Boolean.valueOf(this.g));
                    break;
                case 3:
                    cls.getMethod(str, CharSequence.class).invoke(view, this.f);
                    break;
                case 4:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf(this.h));
                    break;
                case 5:
                    Method method = cls.getMethod(str, Drawable.class);
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(this.h);
                    method.invoke(view, colorDrawable);
                    break;
                case 7:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(this.e));
                    break;
                case 8:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(this.e));
                    break;
                default:
                    break;
            }
        } catch (IllegalAccessException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(" Custom Attribute \"");
            sb.append(str2);
            sb.append("\" not found on ");
            sb.append(cls.getName());
            e.printStackTrace();
        } catch (NoSuchMethodException e2) {
            e2.getMessage();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" Custom Attribute \"");
            sb2.append(str2);
            sb2.append("\" not found on ");
            sb2.append(cls.getName());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cls.getName());
            sb3.append(" must have a method ");
            sb3.append(str);
        } catch (InvocationTargetException e3) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(" Custom Attribute \"");
            sb4.append(str2);
            sb4.append("\" not found on ");
            sb4.append(cls.getName());
            e3.printStackTrace();
        }
    }

    public String c() {
        return this.f1997b;
    }

    public AttributeType d() {
        return this.c;
    }

    public float e() {
        switch (a.f1998a[this.c.ordinal()]) {
            case 2:
                return this.g ? 1.0f : 0.0f;
            case 3:
                throw new RuntimeException("Cannot interpolate String");
            case 4:
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                return this.d;
            case 7:
                return this.e;
            case 8:
                return this.e;
            default:
                return Float.NaN;
        }
    }

    public void f(float[] fArr) {
        switch (a.f1998a[this.c.ordinal()]) {
            case 2:
                fArr[0] = this.g ? 1.0f : 0.0f;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int i = this.h;
                int i2 = (i >> 24) & 255;
                float fPow = (float) Math.pow(((i >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((i >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((i & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i2 / 255.0f;
                return;
            case 6:
                fArr[0] = this.d;
                return;
            case 7:
                fArr[0] = this.e;
                return;
            case 8:
                fArr[0] = this.e;
                return;
            default:
                return;
        }
    }

    public boolean g() {
        int i = a.f1998a[this.c.ordinal()];
        return (i == 1 || i == 2 || i == 3) ? false : true;
    }

    public int h() {
        int i = a.f1998a[this.c.ordinal()];
        return (i == 4 || i == 5) ? 4 : 1;
    }

    public void k(Object obj) {
        switch (a.f1998a[this.c.ordinal()]) {
            case 1:
            case 6:
                this.d = ((Integer) obj).intValue();
                break;
            case 2:
                this.g = ((Boolean) obj).booleanValue();
                break;
            case 3:
                this.f = (String) obj;
                break;
            case 4:
            case 5:
                this.h = ((Integer) obj).intValue();
                break;
            case 7:
                this.e = ((Float) obj).floatValue();
                break;
            case 8:
                this.e = ((Float) obj).floatValue();
                break;
        }
    }

    public ConstraintAttribute(ConstraintAttribute constraintAttribute, Object obj) {
        this.f1996a = false;
        this.f1997b = constraintAttribute.f1997b;
        this.c = constraintAttribute.c;
        k(obj);
    }
}
