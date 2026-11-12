package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class uf4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f35702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.constraintlayout.widget.a f35703b;
    public int c = -1;
    public int d = -1;
    public SparseArray<a> e = new SparseArray<>();
    public SparseArray<androidx.constraintlayout.widget.a> f = new SparseArray<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f35704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<b> f35705b = new ArrayList<>();
        public int c;
        public androidx.constraintlayout.widget.a d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), u4j.Xa);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == u4j.Ya) {
                    this.f35704a = typedArrayObtainStyledAttributes.getResourceId(index, this.f35704a);
                } else if (index == u4j.Za) {
                    this.c = typedArrayObtainStyledAttributes.getResourceId(index, this.c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                    context.getResources().getResourceName(this.c);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
                        this.d = aVar;
                        aVar.r(context, this.c);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public void a(b bVar) {
            this.f35705b.add(bVar);
        }

        public int b(float f, float f2) {
            for (int i = 0; i < this.f35705b.size(); i++) {
                if (this.f35705b.get(i).a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f35706a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f35707b;
        public float c;
        public float d;
        public int e;
        public androidx.constraintlayout.widget.a f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f35706a = Float.NaN;
            this.f35707b = Float.NaN;
            this.c = Float.NaN;
            this.d = Float.NaN;
            this.e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), u4j.Hb);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == u4j.Ib) {
                    this.e = typedArrayObtainStyledAttributes.getResourceId(index, this.e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.e);
                    context.getResources().getResourceName(this.e);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
                        this.f = aVar;
                        aVar.r(context, this.e);
                    }
                } else if (index == u4j.Jb) {
                    this.d = typedArrayObtainStyledAttributes.getDimension(index, this.d);
                } else if (index == u4j.Kb) {
                    this.f35707b = typedArrayObtainStyledAttributes.getDimension(index, this.f35707b);
                } else if (index == u4j.Lb) {
                    this.c = typedArrayObtainStyledAttributes.getDimension(index, this.c);
                } else if (index == u4j.Mb) {
                    this.f35706a = typedArrayObtainStyledAttributes.getDimension(index, this.f35706a);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public boolean a(float f, float f2) {
            if (!Float.isNaN(this.f35706a) && f < this.f35706a) {
                return false;
            }
            if (!Float.isNaN(this.f35707b) && f2 < this.f35707b) {
                return false;
            }
            if (Float.isNaN(this.c) || f <= this.c) {
                return Float.isNaN(this.d) || f2 <= this.d;
            }
            return false;
        }
    }

    public uf4(Context context, ConstraintLayout constraintLayout, int i) {
        this.f35702a = constraintLayout;
        a(context, i);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            int eventType = xml.getEventType();
            a aVar = null;
            while (true) {
                byte b2 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (!name.equals("ConstraintSet")) {
                                b2 = -1;
                            } else {
                                b2 = 4;
                            }
                            break;
                        case 80204913:
                            if (!name.equals("State")) {
                                b2 = -1;
                            } else {
                                b2 = 2;
                            }
                            break;
                        case 1382829617:
                            if (!name.equals("StateSet")) {
                                b2 = -1;
                            }
                            break;
                        case 1657696882:
                            if (!name.equals("layoutDescription")) {
                                b2 = -1;
                            } else {
                                b2 = 0;
                            }
                            break;
                        case 1901439077:
                            if (!name.equals("Variant")) {
                                b2 = -1;
                            } else {
                                b2 = 3;
                            }
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    if (b2 == 2) {
                        aVar = new a(context, xml);
                        this.e.put(aVar.f35704a, aVar);
                    } else if (b2 == 3) {
                        b bVar = new b(context, xml);
                        if (aVar != null) {
                            aVar.a(bVar);
                        }
                    } else if (b2 == 4) {
                        b(context, xml);
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    public final void b(Context context, XmlPullParser xmlPullParser) {
        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1 && attributeValue.length() > 1) {
                    identifier = Integer.parseInt(attributeValue.substring(1));
                }
                aVar.M(context, xmlPullParser);
                this.f.put(identifier, aVar);
                return;
            }
        }
    }

    public void c(xf4 xf4Var) {
    }

    public void d(int i, float f, float f2) {
        int iB;
        int i2 = this.c;
        if (i2 == i) {
            a aVarValueAt = i == -1 ? this.e.valueAt(0) : this.e.get(i2);
            int i3 = this.d;
            if ((i3 == -1 || !aVarValueAt.f35705b.get(i3).a(f, f2)) && this.d != (iB = aVarValueAt.b(f, f2))) {
                androidx.constraintlayout.widget.a aVar = iB == -1 ? this.f35703b : aVarValueAt.f35705b.get(iB).f;
                if (iB != -1) {
                    int i4 = aVarValueAt.f35705b.get(iB).e;
                }
                if (aVar == null) {
                    return;
                }
                this.d = iB;
                aVar.i(this.f35702a);
                return;
            }
            return;
        }
        this.c = i;
        a aVar2 = this.e.get(i);
        int iB2 = aVar2.b(f, f2);
        androidx.constraintlayout.widget.a aVar3 = iB2 == -1 ? aVar2.d : aVar2.f35705b.get(iB2).f;
        if (iB2 != -1) {
            int i5 = aVar2.f35705b.get(iB2).e;
        }
        if (aVar3 != null) {
            this.d = iB2;
            aVar3.i(this.f35702a);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("NO Constraint set found ! id=");
        sb.append(i);
        sb.append(", dim =");
        sb.append(f);
        sb.append(", ");
        sb.append(f2);
    }
}
