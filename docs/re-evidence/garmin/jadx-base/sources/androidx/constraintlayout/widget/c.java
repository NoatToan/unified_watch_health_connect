package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f6174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6175b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6176c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray<a> f6177d = new SparseArray<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray<d> f6178e = new SparseArray<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<b> f6180b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f6181c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final d f6182d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f6181c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.f6328t);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i14 = 0; i14 < indexCount; i14++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i14);
                if (index == 0) {
                    this.f6179a = typedArrayObtainStyledAttributes.getResourceId(index, this.f6179a);
                } else if (index == 1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f6181c);
                    this.f6181c = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f6182d = dVar;
                        dVar.f((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f6183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f6184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f6185c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f6186d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f6187e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final d f6188f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f6183a = Float.NaN;
            this.f6184b = Float.NaN;
            this.f6185c = Float.NaN;
            this.f6186d = Float.NaN;
            this.f6187e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.f6332x);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i14 = 0; i14 < indexCount; i14++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i14);
                if (index == 0) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f6187e);
                    this.f6187e = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f6188f = dVar;
                        dVar.f((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                } else if (index == 1) {
                    this.f6186d = typedArrayObtainStyledAttributes.getDimension(index, this.f6186d);
                } else if (index == 2) {
                    this.f6184b = typedArrayObtainStyledAttributes.getDimension(index, this.f6184b);
                } else if (index == 3) {
                    this.f6185c = typedArrayObtainStyledAttributes.getDimension(index, this.f6185c);
                } else if (index == 4) {
                    this.f6183a = typedArrayObtainStyledAttributes.getDimension(index, this.f6183a);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public final boolean a(float f14, float f15) {
            float f16 = this.f6183a;
            if (!Float.isNaN(f16) && f14 < f16) {
                return false;
            }
            float f17 = this.f6184b;
            if (!Float.isNaN(f17) && f15 < f17) {
                return false;
            }
            float f18 = this.f6185c;
            if (!Float.isNaN(f18) && f14 > f18) {
                return false;
            }
            float f19 = this.f6186d;
            return Float.isNaN(f19) || f15 <= f19;
        }
    }

    public c(Context context, ConstraintLayout constraintLayout, int i14) {
        String str;
        this.f6174a = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i14);
        try {
            a aVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                a(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                a aVar2 = new a(context, xml);
                                this.f6177d.put(aVar2.f6179a, aVar2);
                                aVar = aVar2;
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b bVar = new b(context, xml);
                                if (aVar != null) {
                                    aVar.f6180b.add(bVar);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    public final void a(Context context, XmlResourceParser xmlResourceParser) {
        d dVar = new d();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i14 = 0; i14 < attributeCount; i14++) {
            String attributeName = xmlResourceParser.getAttributeName(i14);
            String attributeValue = xmlResourceParser.getAttributeValue(i14);
            if (attributeName != null && attributeValue != null && TtmlNode.ATTR_ID.equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), TtmlNode.ATTR_ID, context.getPackageName()) : -1;
                if (identifier == -1 && attributeValue.length() > 1) {
                    identifier = Integer.parseInt(attributeValue.substring(1));
                }
                dVar.n(context, xmlResourceParser);
                this.f6178e.put(identifier, dVar);
                return;
            }
        }
    }

    public final void b(float f14, float f15, int i14) {
        int i15 = this.f6175b;
        int i16 = 0;
        ConstraintLayout constraintLayout = this.f6174a;
        SparseArray<a> sparseArray = this.f6177d;
        if (i15 != i14) {
            this.f6175b = i14;
            a aVar = sparseArray.get(i14);
            ArrayList<b> arrayList = aVar.f6180b;
            while (true) {
                if (i16 >= arrayList.size()) {
                    i16 = -1;
                    break;
                } else if (arrayList.get(i16).a(f14, f15)) {
                    break;
                } else {
                    i16++;
                }
            }
            ArrayList<b> arrayList2 = aVar.f6180b;
            d dVar = i16 == -1 ? aVar.f6182d : arrayList2.get(i16).f6188f;
            if (i16 != -1) {
                int i17 = arrayList2.get(i16).f6187e;
            }
            if (dVar == null) {
                return;
            }
            this.f6176c = i16;
            dVar.b(constraintLayout);
            return;
        }
        a aVarValueAt = i14 == -1 ? sparseArray.valueAt(0) : sparseArray.get(i15);
        int i18 = this.f6176c;
        if (i18 == -1 || !aVarValueAt.f6180b.get(i18).a(f14, f15)) {
            ArrayList<b> arrayList3 = aVarValueAt.f6180b;
            while (true) {
                if (i16 >= arrayList3.size()) {
                    i16 = -1;
                    break;
                } else if (arrayList3.get(i16).a(f14, f15)) {
                    break;
                } else {
                    i16++;
                }
            }
            ArrayList<b> arrayList4 = aVarValueAt.f6180b;
            if (this.f6176c == i16) {
                return;
            }
            d dVar2 = i16 == -1 ? null : arrayList4.get(i16).f6188f;
            if (i16 != -1) {
                int i19 = arrayList4.get(i16).f6187e;
            }
            if (dVar2 == null) {
                return;
            }
            this.f6176c = i16;
            dVar2.b(constraintLayout);
        }
    }
}
