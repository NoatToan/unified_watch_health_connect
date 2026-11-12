package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.SparseArray;
import android.util.Xml;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray<a> f6337b = new SparseArray<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<b> f6339b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6340c;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f6340c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.f6328t);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i14 = 0; i14 < indexCount; i14++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i14);
                if (index == 0) {
                    this.f6338a = typedArrayObtainStyledAttributes.getResourceId(index, this.f6338a);
                } else if (index == 1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f6340c);
                    this.f6340c = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    TtmlNode.TAG_LAYOUT.equals(resourceTypeName);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f6341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f6342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f6343c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f6344d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f6345e;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f6341a = Float.NaN;
            this.f6342b = Float.NaN;
            this.f6343c = Float.NaN;
            this.f6344d = Float.NaN;
            this.f6345e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.f6332x);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i14 = 0; i14 < indexCount; i14++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i14);
                if (index == 0) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f6345e);
                    this.f6345e = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    TtmlNode.TAG_LAYOUT.equals(resourceTypeName);
                } else if (index == 1) {
                    this.f6344d = typedArrayObtainStyledAttributes.getDimension(index, this.f6344d);
                } else if (index == 2) {
                    this.f6342b = typedArrayObtainStyledAttributes.getDimension(index, this.f6342b);
                } else if (index == 3) {
                    this.f6343c = typedArrayObtainStyledAttributes.getDimension(index, this.f6343c);
                } else if (index == 4) {
                    this.f6341a = typedArrayObtainStyledAttributes.getDimension(index, this.f6341a);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public final boolean a(float f14, float f15) {
            float f16 = this.f6341a;
            if (!Float.isNaN(f16) && f14 < f16) {
                return false;
            }
            float f17 = this.f6342b;
            if (!Float.isNaN(f17) && f15 < f17) {
                return false;
            }
            float f18 = this.f6343c;
            if (!Float.isNaN(f18) && f14 > f18) {
                return false;
            }
            float f19 = this.f6344d;
            return Float.isNaN(f19) || f15 <= f19;
        }
    }

    public k(Context context, XmlPullParser xmlPullParser) {
        this.f6336a = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.f6329u);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i14 = 0; i14 < indexCount; i14++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i14);
            if (index == 0) {
                this.f6336a = typedArrayObtainStyledAttributes.getResourceId(index, this.f6336a);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        try {
            int eventType = xmlPullParser.getEventType();
            a aVar = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                aVar = new a(context, xmlPullParser);
                                this.f6337b.put(aVar.f6338a, aVar);
                            }
                            break;
                        case 1301459538:
                            name.equals("LayoutDescription");
                            break;
                        case 1382829617:
                            name.equals("StateSet");
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b bVar = new b(context, xmlPullParser);
                                if (aVar != null) {
                                    aVar.f6339b.add(bVar);
                                }
                            }
                            break;
                    }
                } else if (eventType == 3 && "StateSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    public final int a(int i14) {
        float f14 = -1;
        int i15 = 0;
        SparseArray<a> sparseArray = this.f6337b;
        if (-1 == i14) {
            a aVarValueAt = i14 == -1 ? sparseArray.valueAt(0) : sparseArray.get(-1);
            if (aVarValueAt != null) {
                ArrayList<b> arrayList = aVarValueAt.f6339b;
                while (true) {
                    if (i15 >= arrayList.size()) {
                        i15 = -1;
                        break;
                    }
                    if (arrayList.get(i15).a(f14, f14)) {
                        break;
                    }
                    i15++;
                }
                if (-1 != i15) {
                    return i15 == -1 ? aVarValueAt.f6340c : arrayList.get(i15).f6345e;
                }
            }
        } else {
            a aVar = sparseArray.get(i14);
            if (aVar != null) {
                ArrayList<b> arrayList2 = aVar.f6339b;
                while (i15 < arrayList2.size()) {
                    if (arrayList2.get(i15).a(f14, f14)) {
                        return i15 == -1 ? aVar.f6340c : arrayList2.get(i15).f6345e;
                    }
                    i15++;
                }
                i15 = -1;
                if (i15 == -1) {
                }
            }
        }
        return -1;
    }
}
