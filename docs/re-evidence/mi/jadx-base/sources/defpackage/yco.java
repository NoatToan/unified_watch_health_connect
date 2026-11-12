package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class yco {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40046a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f40047b = -1;
    public int c = -1;
    public SparseArray<a> d = new SparseArray<>();
    public SparseArray<androidx.constraintlayout.widget.a> e = new SparseArray<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f40048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<b> f40049b = new ArrayList<>();
        public int c;
        public boolean d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.c = -1;
            this.d = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), u4j.Xa);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == u4j.Ya) {
                    this.f40048a = typedArrayObtainStyledAttributes.getResourceId(index, this.f40048a);
                } else if (index == u4j.Za) {
                    this.c = typedArrayObtainStyledAttributes.getResourceId(index, this.c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                    context.getResources().getResourceName(this.c);
                    if ("layout".equals(resourceTypeName)) {
                        this.d = true;
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public void a(b bVar) {
            this.f40049b.add(bVar);
        }

        public int b(float f, float f2) {
            for (int i = 0; i < this.f40049b.size(); i++) {
                if (this.f40049b.get(i).a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f40050a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f40051b;
        public float c;
        public float d;
        public int e;
        public boolean f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f40050a = Float.NaN;
            this.f40051b = Float.NaN;
            this.c = Float.NaN;
            this.d = Float.NaN;
            this.e = -1;
            this.f = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), u4j.Hb);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == u4j.Ib) {
                    this.e = typedArrayObtainStyledAttributes.getResourceId(index, this.e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.e);
                    context.getResources().getResourceName(this.e);
                    if ("layout".equals(resourceTypeName)) {
                        this.f = true;
                    }
                } else if (index == u4j.Jb) {
                    this.d = typedArrayObtainStyledAttributes.getDimension(index, this.d);
                } else if (index == u4j.Kb) {
                    this.f40051b = typedArrayObtainStyledAttributes.getDimension(index, this.f40051b);
                } else if (index == u4j.Lb) {
                    this.c = typedArrayObtainStyledAttributes.getDimension(index, this.c);
                } else if (index == u4j.Mb) {
                    this.f40050a = typedArrayObtainStyledAttributes.getDimension(index, this.f40050a);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public boolean a(float f, float f2) {
            if (!Float.isNaN(this.f40050a) && f < this.f40050a) {
                return false;
            }
            if (!Float.isNaN(this.f40051b) && f2 < this.f40051b) {
                return false;
            }
            if (Float.isNaN(this.c) || f <= this.c) {
                return Float.isNaN(this.d) || f2 <= this.d;
            }
            return false;
        }
    }

    public yco(Context context, XmlPullParser xmlPullParser) {
        b(context, xmlPullParser);
    }

    public int a(int i, int i2, float f, float f2) {
        a aVar = this.d.get(i2);
        if (aVar == null) {
            return i2;
        }
        if (f == -1.0f || f2 == -1.0f) {
            if (aVar.c == i) {
                return i;
            }
            Iterator<b> it = aVar.f40049b.iterator();
            while (it.hasNext()) {
                if (i == it.next().e) {
                    return i;
                }
            }
            return aVar.c;
        }
        b bVar = null;
        for (b bVar2 : aVar.f40049b) {
            if (bVar2.a(f, f2)) {
                if (i == bVar2.e) {
                    return i;
                }
                bVar = bVar2;
            }
        }
        return bVar != null ? bVar.e : aVar.c;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x007c  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void b(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), u4j.cb);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == u4j.db) {
                this.f40046a = typedArrayObtainStyledAttributes.getResourceId(index, this.f40046a);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        try {
            int eventType = xmlPullParser.getEventType();
            a aVar = null;
            while (true) {
                byte b2 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xmlPullParser.getName();
                } else if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                b2 = 2;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case 1301459538:
                            if (name.equals("LayoutDescription")) {
                                b2 = 0;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case 1382829617:
                            if (!name.equals("StateSet")) {
                                b2 = -1;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b2 = 3;
                            } else {
                                b2 = -1;
                            }
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    if (b2 == 2) {
                        aVar = new a(context, xmlPullParser);
                        this.d.put(aVar.f40048a, aVar);
                    } else if (b2 == 3) {
                        b bVar = new b(context, xmlPullParser);
                        if (aVar != null) {
                            aVar.a(bVar);
                        }
                    }
                } else if (eventType == 3 && "StateSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    public int c(int i, int i2, int i3) {
        return d(-1, i, i2, i3);
    }

    public int d(int i, int i2, float f, float f2) {
        int iB;
        if (i != i2) {
            a aVar = this.d.get(i2);
            if (aVar == null) {
                return -1;
            }
            int iB2 = aVar.b(f, f2);
            return iB2 == -1 ? aVar.c : aVar.f40049b.get(iB2).e;
        }
        a aVarValueAt = i2 == -1 ? this.d.valueAt(0) : this.d.get(this.f40047b);
        if (aVarValueAt == null) {
            return -1;
        }
        if ((this.c == -1 || !aVarValueAt.f40049b.get(i).a(f, f2)) && i != (iB = aVarValueAt.b(f, f2))) {
            return iB == -1 ? aVarValueAt.c : aVarValueAt.f40049b.get(iB).e;
        }
        return i;
    }
}
