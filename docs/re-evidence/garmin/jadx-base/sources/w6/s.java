package w6;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.apache.commons.text.lookup.StringLookupFactory;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f183012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.constraintlayout.widget.k f183013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f183014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<b> f183015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f183016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList<b> f183017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SparseArray<androidx.constraintlayout.widget.d> f183018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap<String, Integer> f183019h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SparseIntArray f183020i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f183021j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f183022k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MotionEvent f183023l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f183024m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f183025n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public q.g f183026o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f183027p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z f183028q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f183029r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f183030s;

    public class a implements Interpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o6.c f183031a;

        public a(s sVar, o6.c cVar) {
            this.f183031a = cVar;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f14) {
            return (float) this.f183031a.a(f14);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public s(Context context, q qVar, int i14) {
        this.f183013b = null;
        this.f183014c = null;
        ArrayList<b> arrayList = new ArrayList<>();
        this.f183015d = arrayList;
        this.f183016e = null;
        this.f183017f = new ArrayList<>();
        this.f183018g = new SparseArray<>();
        this.f183019h = new HashMap<>();
        this.f183020i = new SparseIntArray();
        this.f183021j = 400;
        this.f183022k = 0;
        this.f183024m = false;
        this.f183025n = false;
        this.f183012a = qVar;
        this.f183028q = new z(qVar);
        XmlResourceParser xml = context.getResources().getXml(i14);
        try {
            b bVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                h(context, xml);
                            }
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                g gVar = new g(context, xml);
                                if (bVar != null) {
                                    bVar.f183042k.add(gVar);
                                }
                            }
                            break;
                        case -687739768:
                            if (name.equals("Include")) {
                                j(context, xml);
                            }
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                y yVar = new y(context, xml);
                                z zVar = this.f183028q;
                                zVar.f183115b.add(yVar);
                                zVar.f183116c = null;
                                int i15 = yVar.f183081b;
                                if (i15 == 4) {
                                    zVar.a(yVar, true);
                                } else if (i15 == 5) {
                                    zVar.a(yVar, false);
                                }
                            }
                            break;
                        case 269306229:
                            if (name.equals("Transition")) {
                                bVar = new b(this, context, xml);
                                arrayList.add(bVar);
                                if (this.f183014c == null && !bVar.f183033b) {
                                    this.f183014c = bVar;
                                    w wVar = bVar.f183043l;
                                    if (wVar != null) {
                                        wVar.c(this.f183027p);
                                    }
                                }
                                if (bVar.f183033b) {
                                    if (bVar.f183034c == -1) {
                                        this.f183016e = bVar;
                                    } else {
                                        this.f183017f.add(bVar);
                                    }
                                    arrayList.remove(bVar);
                                }
                            }
                            break;
                        case 312750793:
                            if (name.equals("OnClick") && bVar != null && !qVar.isInEditMode()) {
                                bVar.f183044m.add(new b.a(context, bVar, xml));
                            }
                            break;
                        case 327855227:
                            if (name.equals("OnSwipe")) {
                                if (bVar == null) {
                                    context.getResources().getResourceEntryName(i14);
                                    xml.getLineNumber();
                                }
                                if (bVar != null) {
                                    bVar.f183043l = new w(context, qVar, xml);
                                }
                            }
                            break;
                        case 793277014:
                            if (name.equals("MotionScene")) {
                                k(context, xml);
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                this.f183013b = new androidx.constraintlayout.widget.k(context, xml);
                            }
                            break;
                        case 1942574248:
                            if (name.equals("include")) {
                                j(context, xml);
                            }
                            break;
                    }
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
        this.f183018g.put(R.id.motion_base, new androidx.constraintlayout.widget.d());
        this.f183019h.put("motion_base", Integer.valueOf(R.id.motion_base));
    }

    public static int c(Context context, String str) {
        int identifier;
        if (str.contains("/")) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), TtmlNode.ATTR_ID, context.getPackageName());
        } else {
            identifier = -1;
        }
        return (identifier != -1 || str.length() <= 1) ? identifier : Integer.parseInt(str.substring(1));
    }

    public final boolean a(int i14, q qVar) {
        b bVar;
        if (this.f183026o != null) {
            return false;
        }
        for (b bVar2 : this.f183015d) {
            int i15 = bVar2.f183045n;
            if (i15 != 0 && ((bVar = this.f183014c) != bVar2 || (bVar.f183049r & 2) == 0)) {
                if (i14 == bVar2.f183035d && (i15 == 4 || i15 == 2)) {
                    q.j jVar = q.j.FINISHED;
                    qVar.setState(jVar);
                    qVar.setTransition(bVar2);
                    if (bVar2.f183045n == 4) {
                        qVar.A();
                        qVar.setState(q.j.SETUP);
                        qVar.setState(q.j.MOVING);
                        return true;
                    }
                    qVar.setProgress(1.0f);
                    qVar.p(true);
                    qVar.setState(q.j.SETUP);
                    qVar.setState(q.j.MOVING);
                    qVar.setState(jVar);
                    qVar.v();
                    return true;
                }
                if (i14 == bVar2.f183034c && (i15 == 3 || i15 == 1)) {
                    q.j jVar2 = q.j.FINISHED;
                    qVar.setState(jVar2);
                    qVar.setTransition(bVar2);
                    if (bVar2.f183045n == 3) {
                        qVar.n(0.0f);
                        qVar.setState(q.j.SETUP);
                        qVar.setState(q.j.MOVING);
                        return true;
                    }
                    qVar.setProgress(0.0f);
                    qVar.p(true);
                    qVar.setState(q.j.SETUP);
                    qVar.setState(q.j.MOVING);
                    qVar.setState(jVar2);
                    qVar.v();
                    return true;
                }
            }
        }
        return false;
    }

    public final androidx.constraintlayout.widget.d b(int i14) {
        int iA;
        androidx.constraintlayout.widget.k kVar = this.f183013b;
        if (kVar != null && (iA = kVar.a(i14)) != -1) {
            i14 = iA;
        }
        SparseArray<androidx.constraintlayout.widget.d> sparseArray = this.f183018g;
        if (sparseArray.get(i14) != null) {
            return sparseArray.get(i14);
        }
        w6.a.b(i14, this.f183012a.getContext());
        return sparseArray.get(sparseArray.keyAt(0));
    }

    public final Interpolator d() {
        b bVar = this.f183014c;
        int i14 = bVar.f183036e;
        if (i14 == -2) {
            return AnimationUtils.loadInterpolator(this.f183012a.getContext(), this.f183014c.f183038g);
        }
        if (i14 == -1) {
            return new a(this, o6.c.c(bVar.f183037f));
        }
        if (i14 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i14 == 1) {
            return new AccelerateInterpolator();
        }
        if (i14 == 2) {
            return new DecelerateInterpolator();
        }
        if (i14 == 4) {
            return new BounceInterpolator();
        }
        if (i14 == 5) {
            return new OvershootInterpolator();
        }
        if (i14 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public final void e(n nVar) {
        b bVar = this.f183014c;
        if (bVar != null) {
            Iterator<g> it = bVar.f183042k.iterator();
            while (it.hasNext()) {
                it.next().a(nVar);
            }
        } else {
            b bVar2 = this.f183016e;
            if (bVar2 != null) {
                Iterator<g> it3 = bVar2.f183042k.iterator();
                while (it3.hasNext()) {
                    it3.next().a(nVar);
                }
            }
        }
    }

    public final float f() {
        w wVar;
        b bVar = this.f183014c;
        if (bVar == null || (wVar = bVar.f183043l) == null) {
            return 0.0f;
        }
        return wVar.f183072t;
    }

    public final int g() {
        b bVar = this.f183014c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f183035d;
    }

    public final int h(Context context, XmlResourceParser xmlResourceParser) {
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.f6197f = false;
        int attributeCount = xmlResourceParser.getAttributeCount();
        int iC = -1;
        int iC2 = -1;
        for (int i14 = 0; i14 < attributeCount; i14++) {
            String attributeName = xmlResourceParser.getAttributeName(i14);
            String attributeValue = xmlResourceParser.getAttributeValue(i14);
            attributeName.getClass();
            switch (attributeName) {
                case "deriveConstraintsFrom":
                    iC2 = c(context, attributeValue);
                    break;
                case "constraintRotate":
                    try {
                        dVar.f6195d = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.getClass();
                        switch (attributeValue) {
                            case "x_left":
                                dVar.f6195d = 4;
                                break;
                            case "left":
                                dVar.f6195d = 2;
                                break;
                            case "none":
                                dVar.f6195d = 0;
                                break;
                            case "right":
                                dVar.f6195d = 1;
                                break;
                            case "x_right":
                                dVar.f6195d = 3;
                                break;
                        }
                    }
                    break;
                case "id":
                    iC = c(context, attributeValue);
                    int iIndexOf = attributeValue.indexOf(47);
                    if (iIndexOf >= 0) {
                        attributeValue = attributeValue.substring(iIndexOf + 1);
                    }
                    this.f183019h.put(attributeValue, Integer.valueOf(iC));
                    dVar.f6192a = w6.a.b(iC, context);
                    break;
                case "stateLabels":
                    dVar.f6194c = attributeValue.split(",");
                    int i15 = 0;
                    while (true) {
                        String[] strArr = dVar.f6194c;
                        if (i15 < strArr.length) {
                            strArr[i15] = strArr[i15].trim();
                            i15++;
                        }
                    }
                    break;
            }
        }
        if (iC != -1) {
            int i16 = this.f183012a.f182950w;
            dVar.n(context, xmlResourceParser);
            if (iC2 != -1) {
                this.f183020i.put(iC, iC2);
            }
            this.f183018g.put(iC, dVar);
        }
        return iC;
    }

    public final int i(int i14, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i14);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return h(context, xml);
                }
            }
            return -1;
        } catch (IOException | XmlPullParserException unused) {
            return -1;
        }
    }

    public final void j(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.i.f6334z);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i14 = 0; i14 < indexCount; i14++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i14);
            if (index == 0) {
                i(typedArrayObtainStyledAttributes.getResourceId(index, -1), context);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void k(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.i.f6324p);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i14 = 0; i14 < indexCount; i14++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i14);
            if (index == 0) {
                int i15 = typedArrayObtainStyledAttributes.getInt(index, this.f183021j);
                this.f183021j = i15;
                if (i15 < 8) {
                    this.f183021j = 8;
                }
            } else if (index == 1) {
                this.f183022k = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void l(int i14, q qVar) {
        SparseArray<androidx.constraintlayout.widget.d> sparseArray = this.f183018g;
        androidx.constraintlayout.widget.d dVar = sparseArray.get(i14);
        String str = dVar.f6192a;
        HashMap<Integer, androidx.constraintlayout.widget.d.a> map = dVar.f6198g;
        dVar.f6193b = str;
        int i15 = this.f183020i.get(i14);
        if (i15 > 0) {
            l(i15, qVar);
            androidx.constraintlayout.widget.d dVar2 = sparseArray.get(i15);
            if (dVar2 == null) {
                w6.a.b(i15, this.f183012a.getContext());
                return;
            }
            HashMap<Integer, androidx.constraintlayout.widget.d.a> map2 = dVar2.f6198g;
            dVar.f6193b += "/" + dVar2.f6193b;
            for (Integer num : map2.keySet()) {
                num.getClass();
                androidx.constraintlayout.widget.d.a aVar = map2.get(num);
                if (!map.containsKey(num)) {
                    map.put(num, new androidx.constraintlayout.widget.d.a());
                }
                androidx.constraintlayout.widget.d.a aVar2 = map.get(num);
                if (aVar2 != null) {
                    androidx.constraintlayout.widget.d.b bVar = aVar2.f6203e;
                    if (!bVar.f6222b) {
                        bVar.a(aVar.f6203e);
                    }
                    androidx.constraintlayout.widget.d.C0085d c0085d = aVar2.f6201c;
                    if (!c0085d.f6276a) {
                        androidx.constraintlayout.widget.d.C0085d c0085d2 = aVar.f6201c;
                        c0085d.f6276a = c0085d2.f6276a;
                        c0085d.f6277b = c0085d2.f6277b;
                        c0085d.f6279d = c0085d2.f6279d;
                        c0085d.f6280e = c0085d2.f6280e;
                        c0085d.f6278c = c0085d2.f6278c;
                    }
                    androidx.constraintlayout.widget.d.e eVar = aVar2.f6204f;
                    if (!eVar.f6282a) {
                        eVar.a(aVar.f6204f);
                    }
                    androidx.constraintlayout.widget.d.c cVar = aVar2.f6202d;
                    if (!cVar.f6263a) {
                        cVar.a(aVar.f6202d);
                    }
                    for (String str2 : aVar.f6205g.keySet()) {
                        if (!aVar2.f6205g.containsKey(str2)) {
                            aVar2.f6205g.put(str2, aVar.f6205g.get(str2));
                        }
                    }
                }
            }
        } else {
            dVar.f6193b = am.j.o(dVar.f6193b, "  layout", new StringBuilder());
            int childCount = qVar.getChildCount();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt = qVar.getChildAt(i16);
                ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                int id3 = childAt.getId();
                if (dVar.f6197f && id3 == -1) {
                    kg.f.n("All children of ConstraintLayout must have ids to use ConstraintSet");
                    return;
                }
                if (!map.containsKey(Integer.valueOf(id3))) {
                    map.put(Integer.valueOf(id3), new androidx.constraintlayout.widget.d.a());
                }
                androidx.constraintlayout.widget.d.a aVar3 = map.get(Integer.valueOf(id3));
                if (aVar3 != null) {
                    androidx.constraintlayout.widget.d.C0085d c0085d3 = aVar3.f6201c;
                    androidx.constraintlayout.widget.d.b bVar3 = aVar3.f6203e;
                    androidx.constraintlayout.widget.d.e eVar2 = aVar3.f6204f;
                    if (!bVar3.f6222b) {
                        aVar3.c(id3, bVar2);
                        if (childAt instanceof androidx.constraintlayout.widget.b) {
                            bVar3.f6239j0 = ((androidx.constraintlayout.widget.b) childAt).getReferencedIds();
                            if (childAt instanceof Barrier) {
                                Barrier barrier = (Barrier) childAt;
                                bVar3.f6249o0 = barrier.getAllowsGoneWidget();
                                bVar3.f6233g0 = barrier.getType();
                                bVar3.f6235h0 = barrier.getMargin();
                            }
                        }
                        bVar3.f6222b = true;
                    }
                    if (!c0085d3.f6276a) {
                        c0085d3.f6277b = childAt.getVisibility();
                        c0085d3.f6279d = childAt.getAlpha();
                        c0085d3.f6276a = true;
                    }
                    if (!eVar2.f6282a) {
                        eVar2.f6282a = true;
                        eVar2.f6283b = childAt.getRotation();
                        eVar2.f6284c = childAt.getRotationX();
                        eVar2.f6285d = childAt.getRotationY();
                        eVar2.f6286e = childAt.getScaleX();
                        eVar2.f6287f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (pivotX != 0.0d || pivotY != 0.0d) {
                            eVar2.f6288g = pivotX;
                            eVar2.f6289h = pivotY;
                        }
                        eVar2.f6291j = childAt.getTranslationX();
                        eVar2.f6292k = childAt.getTranslationY();
                        eVar2.f6293l = childAt.getTranslationZ();
                        if (eVar2.f6294m) {
                            eVar2.f6295n = childAt.getElevation();
                        }
                    }
                }
            }
        }
        for (androidx.constraintlayout.widget.d.a aVar4 : map.values()) {
            if (aVar4.f6206h != null) {
                if (aVar4.f6200b == null) {
                    aVar4.f6206h.e(dVar.l(aVar4.f6199a));
                } else {
                    Iterator<Integer> it = map.keySet().iterator();
                    while (it.hasNext()) {
                        androidx.constraintlayout.widget.d.a aVarL = dVar.l(it.next().intValue());
                        String str3 = aVarL.f6203e.f6243l0;
                        if (str3 != null && aVar4.f6200b.matches(str3)) {
                            aVar4.f6206h.e(aVarL);
                            aVarL.f6205g.putAll((HashMap) aVar4.f6205g.clone());
                        }
                    }
                }
            }
        }
    }

    public final void m(q qVar) {
        int i14 = 0;
        while (true) {
            SparseArray<androidx.constraintlayout.widget.d> sparseArray = this.f183018g;
            if (i14 >= sparseArray.size()) {
                return;
            }
            int iKeyAt = sparseArray.keyAt(i14);
            SparseIntArray sparseIntArray = this.f183020i;
            int i15 = sparseIntArray.get(iKeyAt);
            int size = sparseIntArray.size();
            while (i15 > 0) {
                if (i15 == iKeyAt) {
                    return;
                }
                int i16 = size - 1;
                if (size < 0) {
                    return;
                }
                i15 = sparseIntArray.get(i15);
                size = i16;
            }
            l(iKeyAt, qVar);
            i14++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0033  */
    /* JADX WARN: Code duplicated, block: B:32:0x004d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    public final void n(int i14, int i15) {
        int iA;
        int iA2;
        b bVar;
        ArrayList<b> arrayList;
        Iterator<b> it;
        b bVar2;
        b bVar3;
        b next;
        int i16;
        w wVar;
        androidx.constraintlayout.widget.k kVar = this.f183013b;
        if (kVar != null) {
            iA = kVar.a(i14);
            if (iA == -1) {
                iA = i14;
            }
            iA2 = this.f183013b.a(i15);
            if (iA2 == -1) {
            }
            bVar = this.f183014c;
            if (bVar == null && bVar.f183034c == i15 && bVar.f183035d == i14) {
                return;
            }
            arrayList = this.f183015d;
            it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    bVar2 = this.f183016e;
                    for (b bVar4 : this.f183017f) {
                        if (bVar4.f183034c == i15) {
                            bVar2 = bVar4;
                        }
                    }
                    bVar3 = new b(this, bVar2);
                    bVar3.f183035d = iA;
                    bVar3.f183034c = iA2;
                    if (iA != -1) {
                        arrayList.add(bVar3);
                    }
                    this.f183014c = bVar3;
                    return;
                }
                next = it.next();
                i16 = next.f183034c;
                if ((i16 != iA2 && next.f183035d == iA) || (i16 == i15 && next.f183035d == i14)) {
                    break;
                }
            }
            this.f183014c = next;
            wVar = next.f183043l;
            if (wVar != null) {
                wVar.c(this.f183027p);
            }
        }
        iA = i14;
        iA2 = i15;
        bVar = this.f183014c;
        if (bVar == null) {
        }
        arrayList = this.f183015d;
        it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                bVar2 = this.f183016e;
                while (r9.hasNext()) {
                    if (bVar4.f183034c == i15) {
                        bVar2 = bVar4;
                    }
                }
                bVar3 = new b(this, bVar2);
                bVar3.f183035d = iA;
                bVar3.f183034c = iA2;
                if (iA != -1) {
                    arrayList.add(bVar3);
                }
                this.f183014c = bVar3;
                return;
            }
            next = it.next();
            i16 = next.f183034c;
            if (i16 != iA2) {
            }
        }
        this.f183014c = next;
        wVar = next.f183043l;
        if (wVar != null) {
            wVar.c(this.f183027p);
        }
    }

    public final boolean o() {
        Iterator<b> it = this.f183015d.iterator();
        while (it.hasNext()) {
            if (it.next().f183043l != null) {
                return true;
            }
        }
        b bVar = this.f183014c;
        return (bVar == null || bVar.f183043l == null) ? false : true;
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f183032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f183033b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f183034c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f183035d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f183036e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f183037f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f183038g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f183039h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final float f183040i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final s f183041j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final ArrayList<g> f183042k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public w f183043l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final ArrayList<a> f183044m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f183045n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final boolean f183046o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f183047p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f183048q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f183049r;

        public b(s sVar, Context context, XmlPullParser xmlPullParser) {
            this.f183032a = -1;
            this.f183033b = false;
            this.f183034c = -1;
            this.f183035d = -1;
            this.f183036e = 0;
            this.f183037f = null;
            this.f183038g = -1;
            this.f183039h = 400;
            this.f183040i = 0.0f;
            this.f183042k = new ArrayList<>();
            this.f183043l = null;
            this.f183044m = new ArrayList<>();
            this.f183045n = 0;
            this.f183046o = false;
            this.f183047p = -1;
            this.f183048q = 0;
            this.f183049r = 0;
            int i14 = sVar.f183021j;
            SparseArray<androidx.constraintlayout.widget.d> sparseArray = sVar.f183018g;
            this.f183039h = i14;
            this.f183048q = sVar.f183022k;
            this.f183041j = sVar;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.i.f6331w);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i15 = 0; i15 < indexCount; i15++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i15);
                if (index == 2) {
                    this.f183034c = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f183034c);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
                        dVar.m(this.f183034c, context);
                        sparseArray.append(this.f183034c, dVar);
                    } else if (StringLookupFactory.KEY_XML.equals(resourceTypeName)) {
                        this.f183034c = sVar.i(this.f183034c, context);
                    }
                } else if (index == 3) {
                    this.f183035d = typedArrayObtainStyledAttributes.getResourceId(index, this.f183035d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.f183035d);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName2)) {
                        androidx.constraintlayout.widget.d dVar2 = new androidx.constraintlayout.widget.d();
                        dVar2.m(this.f183035d, context);
                        sparseArray.append(this.f183035d, dVar2);
                    } else if (StringLookupFactory.KEY_XML.equals(resourceTypeName2)) {
                        this.f183035d = sVar.i(this.f183035d, context);
                    }
                } else if (index == 6) {
                    int i16 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i16 == 1) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f183038g = resourceId;
                        if (resourceId != -1) {
                            this.f183036e = -2;
                        }
                    } else if (i16 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f183037f = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.f183038g = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f183036e = -2;
                            } else {
                                this.f183036e = -1;
                            }
                        }
                    } else {
                        this.f183036e = typedArrayObtainStyledAttributes.getInteger(index, this.f183036e);
                    }
                } else if (index == 4) {
                    int i17 = typedArrayObtainStyledAttributes.getInt(index, this.f183039h);
                    this.f183039h = i17;
                    if (i17 < 8) {
                        this.f183039h = 8;
                    }
                } else if (index == 8) {
                    this.f183040i = typedArrayObtainStyledAttributes.getFloat(index, this.f183040i);
                } else if (index == 1) {
                    this.f183045n = typedArrayObtainStyledAttributes.getInteger(index, this.f183045n);
                } else if (index == 0) {
                    this.f183032a = typedArrayObtainStyledAttributes.getResourceId(index, this.f183032a);
                } else if (index == 9) {
                    this.f183046o = typedArrayObtainStyledAttributes.getBoolean(index, this.f183046o);
                } else if (index == 7) {
                    this.f183047p = typedArrayObtainStyledAttributes.getInteger(index, -1);
                } else if (index == 5) {
                    this.f183048q = typedArrayObtainStyledAttributes.getInteger(index, 0);
                } else if (index == 10) {
                    this.f183049r = typedArrayObtainStyledAttributes.getInteger(index, 0);
                }
            }
            if (this.f183035d == -1) {
                this.f183033b = true;
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public static class a implements View.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f183050a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f183051b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f183052c;

            public a(Context context, b bVar, XmlPullParser xmlPullParser) {
                this.f183051b = -1;
                this.f183052c = 17;
                this.f183050a = bVar;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.i.f6325q);
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                for (int i14 = 0; i14 < indexCount; i14++) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i14);
                    if (index == 1) {
                        this.f183051b = typedArrayObtainStyledAttributes.getResourceId(index, this.f183051b);
                    } else if (index == 0) {
                        this.f183052c = typedArrayObtainStyledAttributes.getInt(index, this.f183052c);
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }

            public final void a(q qVar, int i14, b bVar) {
                boolean z14;
                View viewFindViewById;
                int i15 = this.f183051b;
                View view2 = qVar;
                if (i15 != -1) {
                    viewFindViewById = qVar.findViewById(i15);
                }
                if (view2 == null) {
                    view2 = viewFindViewById;
                    return;
                }
                int i16 = bVar.f183035d;
                int i17 = bVar.f183034c;
                if (i16 == -1) {
                    view2 = viewFindViewById;
                    view2.setOnClickListener(this);
                    return;
                }
                int i18 = this.f183052c;
                int i19 = i18 & 1;
                boolean z15 = false;
                if (i19 == 0 || i14 != i16) {
                    view2 = viewFindViewById;
                    z14 = false;
                } else {
                    z14 = true;
                }
                boolean z16 = (i19 != 0 && i14 == i16) | z14 | ((i18 & 256) != 0 && i14 == i16) | ((i18 & 16) != 0 && i14 == i17);
                if ((i18 & 4096) != 0 && i14 == i17) {
                    z15 = true;
                }
                if (z16 || z15) {
                    view2.setOnClickListener(this);
                }
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                b bVar = this.f183050a;
                s sVar = bVar.f183041j;
                q qVar = sVar.f183012a;
                if (qVar.f182937j) {
                    if (bVar.f183035d == -1) {
                        int currentState = qVar.getCurrentState();
                        if (currentState == -1) {
                            qVar.B(bVar.f183034c);
                            return;
                        }
                        b bVar2 = new b(bVar.f183041j, bVar);
                        bVar2.f183035d = currentState;
                        bVar2.f183034c = bVar.f183034c;
                        qVar.setTransition(bVar2);
                        qVar.A();
                        return;
                    }
                    b bVar3 = sVar.f183014c;
                    int i14 = this.f183052c;
                    int i15 = i14 & 1;
                    boolean z14 = false;
                    boolean z15 = true;
                    boolean z16 = (i15 == 0 && (i14 & 256) == 0) ? false : true;
                    int i16 = i14 & 16;
                    if (i16 == 0 && (i14 & 4096) == 0) {
                        z15 = false;
                    }
                    if (z16 && z15) {
                        if (bVar3 != bVar) {
                            qVar.setTransition(bVar);
                        }
                        if (qVar.getCurrentState() != qVar.getEndState() && qVar.getProgress() <= 0.5f) {
                            z15 = false;
                            z14 = z16;
                        }
                    } else {
                        z14 = z16;
                    }
                    if (bVar != bVar3) {
                        int i17 = bVar.f183034c;
                        int i18 = bVar.f183035d;
                        int i19 = qVar.f182929f;
                        if (i18 == -1) {
                            if (i19 == i17) {
                                return;
                            }
                        } else if (i19 != i18 && i19 != i17) {
                            return;
                        }
                    }
                    if (z14 && i15 != 0) {
                        qVar.setTransition(bVar);
                        qVar.A();
                        return;
                    }
                    if (z15 && i16 != 0) {
                        qVar.setTransition(bVar);
                        qVar.n(0.0f);
                    } else if (z14 && (i14 & 256) != 0) {
                        qVar.setTransition(bVar);
                        qVar.setProgress(1.0f);
                    } else {
                        if (!z15 || (i14 & 4096) == 0) {
                            return;
                        }
                        qVar.setTransition(bVar);
                        qVar.setProgress(0.0f);
                    }
                }
            }

            public a(b bVar, int i14, int i15) {
                this.f183050a = bVar;
                this.f183051b = i14;
                this.f183052c = i15;
            }
        }

        public b(int i14, s sVar, int i15, int i16) {
            this.f183032a = -1;
            this.f183033b = false;
            this.f183034c = -1;
            this.f183035d = -1;
            this.f183036e = 0;
            this.f183037f = null;
            this.f183038g = -1;
            this.f183039h = 400;
            this.f183040i = 0.0f;
            this.f183042k = new ArrayList<>();
            this.f183043l = null;
            this.f183044m = new ArrayList<>();
            this.f183045n = 0;
            this.f183046o = false;
            this.f183047p = -1;
            this.f183048q = 0;
            this.f183049r = 0;
            this.f183032a = i14;
            this.f183041j = sVar;
            this.f183035d = i15;
            this.f183034c = i16;
            this.f183039h = sVar.f183021j;
            this.f183048q = sVar.f183022k;
        }

        public b(s sVar, b bVar) {
            this.f183032a = -1;
            this.f183033b = false;
            this.f183034c = -1;
            this.f183035d = -1;
            this.f183036e = 0;
            this.f183037f = null;
            this.f183038g = -1;
            this.f183039h = 400;
            this.f183040i = 0.0f;
            this.f183042k = new ArrayList<>();
            this.f183043l = null;
            this.f183044m = new ArrayList<>();
            this.f183045n = 0;
            this.f183046o = false;
            this.f183047p = -1;
            this.f183048q = 0;
            this.f183049r = 0;
            this.f183041j = sVar;
            this.f183039h = sVar.f183021j;
            if (bVar != null) {
                this.f183047p = bVar.f183047p;
                this.f183036e = bVar.f183036e;
                this.f183037f = bVar.f183037f;
                this.f183038g = bVar.f183038g;
                this.f183039h = bVar.f183039h;
                this.f183042k = bVar.f183042k;
                this.f183040i = bVar.f183040i;
                this.f183048q = bVar.f183048q;
            }
        }
    }

    public s(q qVar) {
        this.f183013b = null;
        this.f183014c = null;
        this.f183015d = new ArrayList<>();
        this.f183016e = null;
        this.f183017f = new ArrayList<>();
        this.f183018g = new SparseArray<>();
        this.f183019h = new HashMap<>();
        this.f183020i = new SparseIntArray();
        this.f183021j = 400;
        this.f183022k = 0;
        this.f183024m = false;
        this.f183025n = false;
        this.f183012a = qVar;
        this.f183028q = new z(qVar);
    }
}
