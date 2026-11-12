package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
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
import defpackage.ba7;
import defpackage.ir5;
import defpackage.n8g;
import defpackage.nqi;
import defpackage.u4j;
import defpackage.yco;
import defpackage.zzd;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MotionLayout f1945a;
    public MotionEvent n;
    public MotionLayout.h q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1948r;
    public final d s;
    public float t;
    public float u;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yco f1946b = null;
    public b c = null;
    public boolean d = false;
    public ArrayList<b> e = new ArrayList<>();
    public b f = null;
    public ArrayList<b> g = new ArrayList<>();
    public SparseArray<androidx.constraintlayout.widget.a> h = new SparseArray<>();
    public HashMap<String, Integer> i = new HashMap<>();
    public SparseIntArray j = new SparseIntArray();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1947k = false;
    public int l = 400;
    public int m = 0;
    public boolean o = false;
    public boolean p = false;

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.a$a, reason: collision with other inner class name */
    public class InterpolatorC0017a implements Interpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ba7 f1949a;

        public InterpolatorC0017a(a aVar, ba7 ba7Var) {
            this.f1949a = ba7Var;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (float) this.f1949a.a(f);
        }
    }

    public a(Context context, MotionLayout motionLayout, int i) {
        this.f1945a = motionLayout;
        this.s = new d(motionLayout);
        K(context, i);
        this.h.put(nqi.f28262a, new androidx.constraintlayout.widget.a());
        this.i.put("motion_base", Integer.valueOf(nqi.f28262a));
    }

    public static String a0(String str) {
        if (str == null) {
            return "";
        }
        int iIndexOf = str.indexOf(47);
        return iIndexOf < 0 ? str : str.substring(iIndexOf + 1);
    }

    public float A() {
        b bVar = this.c;
        if (bVar == null || bVar.l == null) {
            return 0.0f;
        }
        return this.c.l.l();
    }

    public float B() {
        b bVar = this.c;
        if (bVar == null || bVar.l == null) {
            return 0.0f;
        }
        return this.c.l.m();
    }

    public float C() {
        b bVar = this.c;
        if (bVar == null || bVar.l == null) {
            return 0.0f;
        }
        return this.c.l.n();
    }

    public float D() {
        b bVar = this.c;
        if (bVar == null || bVar.l == null) {
            return 0.0f;
        }
        return this.c.l.o();
    }

    public float E() {
        b bVar = this.c;
        if (bVar != null) {
            return bVar.i;
        }
        return 0.0f;
    }

    public int F() {
        b bVar = this.c;
        if (bVar == null) {
            return -1;
        }
        return bVar.d;
    }

    public b G(int i) {
        for (b bVar : this.e) {
            if (bVar.f1950a == i) {
                return bVar;
            }
        }
        return null;
    }

    public List<b> H(int i) {
        int iY = y(i);
        ArrayList arrayList = new ArrayList();
        for (b bVar : this.e) {
            if (bVar.d == iY || bVar.c == iY) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public final boolean I(int i) {
        int i2 = this.j.get(i);
        int size = this.j.size();
        while (i2 > 0) {
            if (i2 == i) {
                return true;
            }
            int i3 = size - 1;
            if (size < 0) {
                return true;
            }
            i2 = this.j.get(i2);
            size = i3;
        }
        return false;
    }

    public final boolean J() {
        return this.q != null;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ab  */
    public final void K(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            int eventType = xml.getEventType();
            b bVar = null;
            while (true) {
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    if (this.f1947k) {
                        System.out.println("parsing = " + name);
                    }
                    switch (name) {
                        case "MotionScene":
                            O(context, xml);
                            break;
                        case "Transition":
                            ArrayList<b> arrayList = this.e;
                            bVar = new b(this, context, xml);
                            arrayList.add(bVar);
                            if (this.c == null && !bVar.f1951b) {
                                this.c = bVar;
                                if (bVar.l != null) {
                                    this.c.l.x(this.f1948r);
                                }
                            }
                            if (!bVar.f1951b) {
                                break;
                            } else {
                                if (bVar.c == -1) {
                                    this.f = bVar;
                                } else {
                                    this.g.add(bVar);
                                }
                                this.e.remove(bVar);
                                break;
                            }
                            break;
                        case "OnSwipe":
                            if (bVar == null) {
                                String resourceEntryName = context.getResources().getResourceEntryName(i);
                                int lineNumber = xml.getLineNumber();
                                StringBuilder sb = new StringBuilder();
                                sb.append(" OnSwipe (");
                                sb.append(resourceEntryName);
                                sb.append(".xml:");
                                sb.append(lineNumber);
                                sb.append(")");
                            }
                            if (bVar == null) {
                                break;
                            } else {
                                bVar.l = new androidx.constraintlayout.motion.widget.b(context, this.f1945a, xml);
                                break;
                            }
                            break;
                        case "OnClick":
                            if (bVar == null) {
                                break;
                            } else {
                                bVar.u(context, xml);
                                break;
                            }
                            break;
                        case "StateSet":
                            this.f1946b = new yco(context, xml);
                            break;
                        case "ConstraintSet":
                            L(context, xml);
                            break;
                        case "include":
                        case "Include":
                            N(context, xml);
                            break;
                        case "KeyFrameSet":
                            zzd zzdVar = new zzd(context, xml);
                            if (bVar == null) {
                                break;
                            } else {
                                bVar.f1952k.add(zzdVar);
                                break;
                            }
                            break;
                        case "ViewTransition":
                            this.s.a(new c(context, xml));
                            break;
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

    public final int L(Context context, XmlPullParser xmlPullParser) {
        androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
        aVar.a0(false);
        int attributeCount = xmlPullParser.getAttributeCount();
        int iR = -1;
        int iR2 = -1;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            if (this.f1947k) {
                System.out.println("id string = " + attributeValue);
            }
            attributeName.hashCode();
            switch (attributeName) {
                case "deriveConstraintsFrom":
                    iR2 = r(context, attributeValue);
                    break;
                case "constraintRotate":
                    try {
                        aVar.d = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.hashCode();
                        switch (attributeValue) {
                            case "x_left":
                                aVar.d = 4;
                                break;
                            case "left":
                                aVar.d = 2;
                                break;
                            case "none":
                                aVar.d = 0;
                                break;
                            case "right":
                                aVar.d = 1;
                                break;
                            case "x_right":
                                aVar.d = 3;
                                break;
                        }
                    }
                    break;
                case "id":
                    iR = r(context, attributeValue);
                    this.i.put(a0(attributeValue), Integer.valueOf(iR));
                    aVar.f2017b = ir5.c(context, iR);
                    break;
            }
        }
        if (iR != -1) {
            if (this.f1945a.x != 0) {
                aVar.d0(true);
            }
            aVar.M(context, xmlPullParser);
            if (iR2 != -1) {
                this.j.put(iR, iR2);
            }
            this.h.put(iR, aVar);
        }
        return iR;
    }

    public final int M(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return L(context, xml);
                }
            }
            return -1;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    public final void N(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), u4j.gc);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == u4j.hc) {
                M(context, typedArrayObtainStyledAttributes.getResourceId(index, -1));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void O(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), u4j.ja);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == u4j.ka) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.l);
                this.l = i2;
                if (i2 < 8) {
                    this.l = 8;
                }
            } else if (index == u4j.la) {
                this.m = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void P(float f, float f2) {
        b bVar = this.c;
        if (bVar == null || bVar.l == null) {
            return;
        }
        this.c.l.u(f, f2);
    }

    public void Q(float f, float f2) {
        b bVar = this.c;
        if (bVar == null || bVar.l == null) {
            return;
        }
        this.c.l.v(f, f2);
    }

    public void R(MotionEvent motionEvent, int i, MotionLayout motionLayout) {
        MotionLayout.h hVar;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.q == null) {
            this.q = this.f1945a.T();
        }
        this.q.a(motionEvent);
        if (i != -1) {
            int action = motionEvent.getAction();
            boolean z = false;
            if (action == 0) {
                this.t = motionEvent.getRawX();
                this.u = motionEvent.getRawY();
                this.n = motionEvent;
                this.o = false;
                if (this.c.l != null) {
                    RectF rectFF = this.c.l.f(this.f1945a, rectF);
                    if (rectFF != null && !rectFF.contains(this.n.getX(), this.n.getY())) {
                        this.n = null;
                        this.o = true;
                        return;
                    }
                    RectF rectFP = this.c.l.p(this.f1945a, rectF);
                    if (rectFP == null || rectFP.contains(this.n.getX(), this.n.getY())) {
                        this.p = false;
                    } else {
                        this.p = true;
                    }
                    this.c.l.w(this.t, this.u);
                    return;
                }
                return;
            }
            if (action == 2 && !this.o) {
                float rawY = motionEvent.getRawY() - this.u;
                float rawX = motionEvent.getRawX() - this.t;
                if ((rawX == 0.0d && rawY == 0.0d) || (motionEvent2 = this.n) == null) {
                    return;
                }
                b bVarI = i(i, rawX, rawY, motionEvent2);
                if (bVarI != null) {
                    motionLayout.setTransition(bVarI);
                    RectF rectFP2 = this.c.l.p(this.f1945a, rectF);
                    if (rectFP2 != null && !rectFP2.contains(this.n.getX(), this.n.getY())) {
                        z = true;
                    }
                    this.p = z;
                    this.c.l.z(this.t, this.u);
                }
            }
        }
        if (this.o) {
            return;
        }
        b bVar = this.c;
        if (bVar != null && bVar.l != null && !this.p) {
            this.c.l.s(motionEvent, this.q, i, this);
        }
        this.t = motionEvent.getRawX();
        this.u = motionEvent.getRawY();
        if (motionEvent.getAction() != 1 || (hVar = this.q) == null) {
            return;
        }
        hVar.recycle();
        this.q = null;
        int i2 = motionLayout.f;
        if (i2 != -1) {
            h(motionLayout, i2);
        }
    }

    public final void S(int i, MotionLayout motionLayout) {
        androidx.constraintlayout.widget.a aVar = this.h.get(i);
        aVar.c = aVar.f2017b;
        int i2 = this.j.get(i);
        if (i2 > 0) {
            S(i2, motionLayout);
            androidx.constraintlayout.widget.a aVar2 = this.h.get(i2);
            if (aVar2 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("ERROR! invalid deriveConstraintsFrom: @id/");
                sb.append(ir5.c(this.f1945a.getContext(), i2));
                return;
            } else {
                aVar.c += "/" + aVar2.c;
                aVar.U(aVar2);
            }
        } else {
            aVar.c += "  layout";
            aVar.T(motionLayout);
        }
        aVar.h(aVar);
    }

    public void T(MotionLayout motionLayout) {
        for (int i = 0; i < this.h.size(); i++) {
            int iKeyAt = this.h.keyAt(i);
            if (I(iKeyAt)) {
                return;
            }
            S(iKeyAt, motionLayout);
        }
    }

    public void U(int i, androidx.constraintlayout.widget.a aVar) {
        this.h.put(i, aVar);
    }

    public void V(int i) {
        b bVar = this.c;
        if (bVar != null) {
            bVar.E(i);
        } else {
            this.l = i;
        }
    }

    public void W(boolean z) {
        this.f1948r = z;
        b bVar = this.c;
        if (bVar == null || bVar.l == null) {
            return;
        }
        this.c.l.x(this.f1948r);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0039  */
    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0096  */
    /* JADX WARN: Code duplicated, block: B:48:0x006d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0075 A[SYNTHETIC] */
    public void X(int i, int i2) {
        int iC;
        int iC2;
        b bVar;
        Iterator<b> it;
        b bVar2;
        b bVar3;
        b next;
        yco ycoVar = this.f1946b;
        if (ycoVar != null) {
            iC = ycoVar.c(i, -1, -1);
            if (iC == -1) {
                iC = i;
            }
            iC2 = this.f1946b.c(i2, -1, -1);
            if (iC2 == -1) {
            }
            bVar = this.c;
            if (bVar == null && bVar.c == i2 && this.c.d == i) {
                return;
            }
            it = this.e.iterator();
            while (true) {
                if (it.hasNext()) {
                    bVar2 = this.f;
                    for (b bVar4 : this.g) {
                        if (bVar4.c == i2) {
                            bVar2 = bVar4;
                        }
                    }
                    bVar3 = new b(this, bVar2);
                    bVar3.d = iC;
                    bVar3.c = iC2;
                    if (iC != -1) {
                        this.e.add(bVar3);
                    }
                    this.c = bVar3;
                    return;
                }
                next = it.next();
                if ((next.c != iC2 && next.d == iC) || (next.c == i2 && next.d == i)) {
                    break;
                }
            }
            this.c = next;
            if (next != null || next.l == null) {
            }
            this.c.l.x(this.f1948r);
            return;
        }
        iC = i;
        iC2 = i2;
        bVar = this.c;
        if (bVar == null) {
        }
        it = this.e.iterator();
        while (true) {
            if (it.hasNext()) {
                bVar2 = this.f;
                while (r3.hasNext()) {
                    if (bVar4.c == i2) {
                        bVar2 = bVar4;
                    }
                }
                bVar3 = new b(this, bVar2);
                bVar3.d = iC;
                bVar3.c = iC2;
                if (iC != -1) {
                    this.e.add(bVar3);
                }
                this.c = bVar3;
                return;
            }
            next = it.next();
            if (next.c != iC2) {
            }
        }
        this.c = next;
        if (next != null) {
        }
    }

    public void Y(b bVar) {
        this.c = bVar;
        if (bVar == null || bVar.l == null) {
            return;
        }
        this.c.l.x(this.f1948r);
    }

    public void Z() {
        b bVar = this.c;
        if (bVar == null || bVar.l == null) {
            return;
        }
        this.c.l.A();
    }

    public boolean b0() {
        Iterator<b> it = this.e.iterator();
        while (it.hasNext()) {
            if (it.next().l != null) {
                return true;
            }
        }
        b bVar = this.c;
        return (bVar == null || bVar.l == null) ? false : true;
    }

    public void c0(int i, View... viewArr) {
        this.s.i(i, viewArr);
    }

    public void f(MotionLayout motionLayout, int i) {
        for (b bVar : this.e) {
            if (bVar.m.size() > 0) {
                Iterator it = bVar.m.iterator();
                while (it.hasNext()) {
                    ((b.ViewOnClickListenerC0018a) it.next()).c(motionLayout);
                }
            }
        }
        for (b bVar2 : this.g) {
            if (bVar2.m.size() > 0) {
                Iterator it2 = bVar2.m.iterator();
                while (it2.hasNext()) {
                    ((b.ViewOnClickListenerC0018a) it2.next()).c(motionLayout);
                }
            }
        }
        for (b bVar3 : this.e) {
            if (bVar3.m.size() > 0) {
                Iterator it3 = bVar3.m.iterator();
                while (it3.hasNext()) {
                    ((b.ViewOnClickListenerC0018a) it3.next()).a(motionLayout, i, bVar3);
                }
            }
        }
        for (b bVar4 : this.g) {
            if (bVar4.m.size() > 0) {
                Iterator it4 = bVar4.m.iterator();
                while (it4.hasNext()) {
                    ((b.ViewOnClickListenerC0018a) it4.next()).a(motionLayout, i, bVar4);
                }
            }
        }
    }

    public boolean g(int i, n8g n8gVar) {
        return this.s.d(i, n8gVar);
    }

    public boolean h(MotionLayout motionLayout, int i) {
        b bVar;
        if (J() || this.d) {
            return false;
        }
        for (b bVar2 : this.e) {
            if (bVar2.n != 0 && ((bVar = this.c) != bVar2 || !bVar.D(2))) {
                if (i == bVar2.d && (bVar2.n == 4 || bVar2.n == 2)) {
                    MotionLayout.l lVar = MotionLayout.l.FINISHED;
                    motionLayout.setState(lVar);
                    motionLayout.setTransition(bVar2);
                    if (bVar2.n == 4) {
                        motionLayout.c0();
                        motionLayout.setState(MotionLayout.l.SETUP);
                        motionLayout.setState(MotionLayout.l.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.G(true);
                        motionLayout.setState(MotionLayout.l.SETUP);
                        motionLayout.setState(MotionLayout.l.MOVING);
                        motionLayout.setState(lVar);
                        motionLayout.U();
                    }
                    return true;
                }
                if (i == bVar2.c && (bVar2.n == 3 || bVar2.n == 1)) {
                    MotionLayout.l lVar2 = MotionLayout.l.FINISHED;
                    motionLayout.setState(lVar2);
                    motionLayout.setTransition(bVar2);
                    if (bVar2.n == 3) {
                        motionLayout.e0();
                        motionLayout.setState(MotionLayout.l.SETUP);
                        motionLayout.setState(MotionLayout.l.MOVING);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.G(true);
                        motionLayout.setState(MotionLayout.l.SETUP);
                        motionLayout.setState(MotionLayout.l.MOVING);
                        motionLayout.setState(lVar2);
                        motionLayout.U();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public b i(int i, float f, float f2, MotionEvent motionEvent) {
        if (i == -1) {
            return this.c;
        }
        List<b> listH = H(i);
        RectF rectF = new RectF();
        float f3 = 0.0f;
        b bVar = null;
        for (b bVar2 : listH) {
            if (!bVar2.o && bVar2.l != null) {
                bVar2.l.x(this.f1948r);
                RectF rectFP = bVar2.l.p(this.f1945a, rectF);
                if (rectFP == null || motionEvent == null || rectFP.contains(motionEvent.getX(), motionEvent.getY())) {
                    RectF rectFF = bVar2.l.f(this.f1945a, rectF);
                    if (rectFF == null || motionEvent == null || rectFF.contains(motionEvent.getX(), motionEvent.getY())) {
                        float fA = bVar2.l.a(f, f2);
                        if (bVar2.l.l && motionEvent != null) {
                            float x = motionEvent.getX() - bVar2.l.i;
                            float y = motionEvent.getY() - bVar2.l.j;
                            fA = ((float) (Math.atan2(f2 + y, f + x) - Math.atan2(x, y))) * 10.0f;
                        }
                        float f4 = fA * (bVar2.c == i ? -1.0f : 1.1f);
                        if (f4 > f3) {
                            bVar = bVar2;
                            f3 = f4;
                        }
                    }
                }
            }
        }
        return bVar;
    }

    public int j() {
        b bVar = this.c;
        if (bVar != null) {
            return bVar.p;
        }
        return -1;
    }

    public int k() {
        b bVar = this.c;
        if (bVar == null || bVar.l == null) {
            return 0;
        }
        return this.c.l.d();
    }

    public androidx.constraintlayout.widget.a l(int i) {
        return m(i, -1, -1);
    }

    public androidx.constraintlayout.widget.a m(int i, int i2, int i3) {
        int iC;
        if (this.f1947k) {
            PrintStream printStream = System.out;
            printStream.println("id " + i);
            printStream.println("size " + this.h.size());
        }
        yco ycoVar = this.f1946b;
        if (ycoVar != null && (iC = ycoVar.c(i, i2, i3)) != -1) {
            i = iC;
        }
        if (this.h.get(i) != null) {
            return this.h.get(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Warning could not find ConstraintSet id/");
        sb.append(ir5.c(this.f1945a.getContext(), i));
        sb.append(" In MotionScene");
        SparseArray<androidx.constraintlayout.widget.a> sparseArray = this.h;
        return sparseArray.get(sparseArray.keyAt(0));
    }

    public int[] n() {
        int size = this.h.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = this.h.keyAt(i);
        }
        return iArr;
    }

    public ArrayList<b> o() {
        return this.e;
    }

    public int p() {
        b bVar = this.c;
        return bVar != null ? bVar.h : this.l;
    }

    public int q() {
        b bVar = this.c;
        if (bVar == null) {
            return -1;
        }
        return bVar.c;
    }

    public final int r(Context context, String str) {
        int identifier;
        if (str.contains("/")) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
            if (this.f1947k) {
                System.out.println("id getMap res = " + identifier);
            }
        } else {
            identifier = -1;
        }
        return (identifier != -1 || str.length() <= 1) ? identifier : Integer.parseInt(str.substring(1));
    }

    public Interpolator s() {
        int i = this.c.e;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(this.f1945a.getContext(), this.c.g);
        }
        if (i == -1) {
            return new InterpolatorC0017a(this, ba7.c(this.c.f));
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i == 5) {
            return new OvershootInterpolator();
        }
        if (i != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public void t(n8g n8gVar) {
        b bVar = this.c;
        if (bVar != null) {
            Iterator it = bVar.f1952k.iterator();
            while (it.hasNext()) {
                ((zzd) it.next()).b(n8gVar);
            }
        } else {
            b bVar2 = this.f;
            if (bVar2 != null) {
                Iterator it2 = bVar2.f1952k.iterator();
                while (it2.hasNext()) {
                    ((zzd) it2.next()).b(n8gVar);
                }
            }
        }
    }

    public float u() {
        b bVar = this.c;
        if (bVar == null || bVar.l == null) {
            return 0.0f;
        }
        return this.c.l.g();
    }

    public float v() {
        b bVar = this.c;
        if (bVar == null || bVar.l == null) {
            return 0.0f;
        }
        return this.c.l.h();
    }

    public boolean w() {
        b bVar = this.c;
        if (bVar == null || bVar.l == null) {
            return false;
        }
        return this.c.l.i();
    }

    public float x(float f, float f2) {
        b bVar = this.c;
        if (bVar == null || bVar.l == null) {
            return 0.0f;
        }
        return this.c.l.j(f, f2);
    }

    public final int y(int i) {
        int iC;
        yco ycoVar = this.f1946b;
        return (ycoVar == null || (iC = ycoVar.c(i, -1, -1)) == -1) ? i : iC;
    }

    public int z() {
        b bVar = this.c;
        if (bVar == null || bVar.l == null) {
            return 0;
        }
        return this.c.l.k();
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f1951b;
        public int c;
        public int d;
        public int e;
        public String f;
        public int g;
        public int h;
        public float i;
        public final a j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public ArrayList<zzd> f1952k;
        public androidx.constraintlayout.motion.widget.b l;
        public ArrayList<ViewOnClickListenerC0018a> m;
        public int n;
        public boolean o;
        public int p;
        public int q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f1953r;

        /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.a$b$a, reason: collision with other inner class name */
        public static class ViewOnClickListenerC0018a implements View.OnClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f1954a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f1955b;
            public int c;

            public ViewOnClickListenerC0018a(Context context, b bVar, XmlPullParser xmlPullParser) {
                this.f1955b = -1;
                this.c = 17;
                this.f1954a = bVar;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), u4j.qa);
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i);
                    if (index == u4j.sa) {
                        this.f1955b = typedArrayObtainStyledAttributes.getResourceId(index, this.f1955b);
                    } else if (index == u4j.ra) {
                        this.c = typedArrayObtainStyledAttributes.getInt(index, this.c);
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }

            public void a(MotionLayout motionLayout, int i, b bVar) {
                boolean z;
                View viewFindViewById;
                int i2 = this.f1955b;
                View view = motionLayout;
                if (i2 != -1) {
                    viewFindViewById = motionLayout.findViewById(i2);
                }
                if (view == null) {
                    view = viewFindViewById;
                    StringBuilder sb = new StringBuilder();
                    sb.append("OnClick could not find id ");
                    sb.append(this.f1955b);
                    return;
                }
                int i3 = bVar.d;
                int i4 = bVar.c;
                if (i3 == -1) {
                    view = viewFindViewById;
                    view.setOnClickListener(this);
                    return;
                }
                int i5 = this.c;
                boolean z2 = false;
                if ((i5 & 1) == 0 || i != i3) {
                    view = viewFindViewById;
                    z = false;
                } else {
                    z = true;
                }
                boolean z3 = ((i5 & 1) != 0 && i == i3) | z | ((i5 & 256) != 0 && i == i3) | ((i5 & 16) != 0 && i == i4);
                if ((i5 & 4096) != 0 && i == i4) {
                    z2 = true;
                }
                if (z3 || z2) {
                    view.setOnClickListener(this);
                }
            }

            public boolean b(b bVar, MotionLayout motionLayout) {
                b bVar2 = this.f1954a;
                if (bVar2 == bVar) {
                    return true;
                }
                int i = bVar2.c;
                int i2 = this.f1954a.d;
                if (i2 == -1) {
                    return motionLayout.f != i;
                }
                int i3 = motionLayout.f;
                return i3 == i2 || i3 == i;
            }

            public void c(MotionLayout motionLayout) {
                int i = this.f1955b;
                if (i == -1) {
                    return;
                }
                View viewFindViewById = motionLayout.findViewById(i);
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(null);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(" (*)  could not find id ");
                sb.append(this.f1955b);
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MotionLayout motionLayout = this.f1954a.j.f1945a;
                if (motionLayout.S()) {
                    if (this.f1954a.d == -1) {
                        int currentState = motionLayout.getCurrentState();
                        if (currentState == -1) {
                            motionLayout.f0(this.f1954a.c);
                            return;
                        }
                        b bVar = new b(this.f1954a.j, this.f1954a);
                        bVar.d = currentState;
                        bVar.c = this.f1954a.c;
                        motionLayout.setTransition(bVar);
                        motionLayout.c0();
                        return;
                    }
                    b bVar2 = this.f1954a.j.c;
                    int i = this.c;
                    boolean z = false;
                    boolean z2 = ((i & 1) == 0 && (i & 256) == 0) ? false : true;
                    boolean z3 = ((i & 16) == 0 && (i & 4096) == 0) ? false : true;
                    if (z2 && z3) {
                        b bVar3 = this.f1954a.j.c;
                        b bVar4 = this.f1954a;
                        if (bVar3 != bVar4) {
                            motionLayout.setTransition(bVar4);
                        }
                        if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                            z3 = false;
                            z = z2;
                        }
                    } else {
                        z = z2;
                    }
                    if (b(bVar2, motionLayout)) {
                        if (z && (this.c & 1) != 0) {
                            motionLayout.setTransition(this.f1954a);
                            motionLayout.c0();
                            return;
                        }
                        if (z3 && (this.c & 16) != 0) {
                            motionLayout.setTransition(this.f1954a);
                            motionLayout.e0();
                        } else if (z && (this.c & 256) != 0) {
                            motionLayout.setTransition(this.f1954a);
                            motionLayout.setProgress(1.0f);
                        } else {
                            if (!z3 || (this.c & 4096) == 0) {
                                return;
                            }
                            motionLayout.setTransition(this.f1954a);
                            motionLayout.setProgress(0.0f);
                        }
                    }
                }
            }
        }

        public b(a aVar, b bVar) {
            this.f1950a = -1;
            this.f1951b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = 400;
            this.i = 0.0f;
            this.f1952k = new ArrayList<>();
            this.l = null;
            this.m = new ArrayList<>();
            this.n = 0;
            this.o = false;
            this.p = -1;
            this.q = 0;
            this.f1953r = 0;
            this.j = aVar;
            this.h = aVar.l;
            if (bVar != null) {
                this.p = bVar.p;
                this.e = bVar.e;
                this.f = bVar.f;
                this.g = bVar.g;
                this.h = bVar.h;
                this.f1952k = bVar.f1952k;
                this.i = bVar.i;
                this.q = bVar.q;
            }
        }

        public int A() {
            return this.d;
        }

        public androidx.constraintlayout.motion.widget.b B() {
            return this.l;
        }

        public boolean C() {
            return !this.o;
        }

        public boolean D(int i) {
            return (i & this.f1953r) != 0;
        }

        public void E(int i) {
            this.h = Math.max(i, 8);
        }

        public void F(int i, String str, int i2) {
            this.e = i;
            this.f = str;
            this.g = i2;
        }

        public void G(int i) {
            androidx.constraintlayout.motion.widget.b bVarB = B();
            if (bVarB != null) {
                bVarB.y(i);
            }
        }

        public void H(int i) {
            this.p = i;
        }

        public void t(zzd zzdVar) {
            this.f1952k.add(zzdVar);
        }

        public void u(Context context, XmlPullParser xmlPullParser) {
            this.m.add(new ViewOnClickListenerC0018a(context, this, xmlPullParser));
        }

        public final void v(a aVar, Context context, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                if (index == u4j.yb) {
                    this.c = typedArray.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.a aVar2 = new androidx.constraintlayout.widget.a();
                        aVar2.L(context, this.c);
                        aVar.h.append(this.c, aVar2);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.c = aVar.M(context, this.c);
                    }
                } else if (index == u4j.zb) {
                    this.d = typedArray.getResourceId(index, this.d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.d);
                    if ("layout".equals(resourceTypeName2)) {
                        androidx.constraintlayout.widget.a aVar3 = new androidx.constraintlayout.widget.a();
                        aVar3.L(context, this.d);
                        aVar.h.append(this.d, aVar3);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.d = aVar.M(context, this.d);
                    }
                } else if (index == u4j.Cb) {
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 == 1) {
                        int resourceId = typedArray.getResourceId(index, -1);
                        this.g = resourceId;
                        if (resourceId != -1) {
                            this.e = -2;
                        }
                    } else if (i2 == 3) {
                        String string = typedArray.getString(index);
                        this.f = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.g = typedArray.getResourceId(index, -1);
                                this.e = -2;
                            } else {
                                this.e = -1;
                            }
                        }
                    } else {
                        this.e = typedArray.getInteger(index, this.e);
                    }
                } else if (index == u4j.Ab) {
                    int i3 = typedArray.getInt(index, this.h);
                    this.h = i3;
                    if (i3 < 8) {
                        this.h = 8;
                    }
                } else if (index == u4j.Eb) {
                    this.i = typedArray.getFloat(index, this.i);
                } else if (index == u4j.xb) {
                    this.n = typedArray.getInteger(index, this.n);
                } else if (index == u4j.wb) {
                    this.f1950a = typedArray.getResourceId(index, this.f1950a);
                } else if (index == u4j.Fb) {
                    this.o = typedArray.getBoolean(index, this.o);
                } else if (index == u4j.Db) {
                    this.p = typedArray.getInteger(index, -1);
                } else if (index == u4j.Bb) {
                    this.q = typedArray.getInteger(index, 0);
                } else if (index == u4j.Gb) {
                    this.f1953r = typedArray.getInteger(index, 0);
                }
            }
            if (this.d == -1) {
                this.f1951b = true;
            }
        }

        public final void w(a aVar, Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u4j.vb);
            v(aVar, context, typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
        }

        public int x() {
            return this.n;
        }

        public int y() {
            return this.c;
        }

        public int z() {
            return this.q;
        }

        public b(int i, a aVar, int i2, int i3) {
            this.f1950a = -1;
            this.f1951b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = 400;
            this.i = 0.0f;
            this.f1952k = new ArrayList<>();
            this.l = null;
            this.m = new ArrayList<>();
            this.n = 0;
            this.o = false;
            this.p = -1;
            this.q = 0;
            this.f1953r = 0;
            this.f1950a = i;
            this.j = aVar;
            this.d = i2;
            this.c = i3;
            this.h = aVar.l;
            this.q = aVar.m;
        }

        public b(a aVar, Context context, XmlPullParser xmlPullParser) {
            this.f1950a = -1;
            this.f1951b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = 400;
            this.i = 0.0f;
            this.f1952k = new ArrayList<>();
            this.l = null;
            this.m = new ArrayList<>();
            this.n = 0;
            this.o = false;
            this.p = -1;
            this.q = 0;
            this.f1953r = 0;
            this.h = aVar.l;
            this.q = aVar.m;
            this.j = aVar;
            w(aVar, context, Xml.asAttributeSet(xmlPullParser));
        }
    }
}
