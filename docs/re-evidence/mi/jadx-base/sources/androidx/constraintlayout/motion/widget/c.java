package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.ba7;
import defpackage.ir5;
import defpackage.n8g;
import defpackage.nqi;
import defpackage.qzd;
import defpackage.szd;
import defpackage.u4j;
import defpackage.zzd;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1960a;
    public int e;
    public zzd f;
    public androidx.constraintlayout.widget.a.C0020a g;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f1962k;
    public Context o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1961b = -1;
    public boolean c = false;
    public int d = 0;
    public int h = -1;
    public int i = -1;
    public int l = 0;
    public String m = null;
    public int n = -1;
    public int p = -1;
    public int q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1963r = -1;
    public int s = -1;
    public int t = -1;
    public int u = -1;
    public int v = -1;

    public class a implements Interpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ba7 f1964a;

        public a(c cVar, ba7 ba7Var) {
            this.f1964a = ba7Var;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (float) this.f1964a.a(f);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f1966b;
        public long c;
        public n8g d;
        public int e;
        public int f;
        public d h;
        public Interpolator i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f1967k;
        public float l;
        public long m;
        public boolean o;
        public szd g = new szd();
        public boolean j = false;
        public Rect n = new Rect();

        public b(d dVar, n8g n8gVar, int i, int i2, int i3, Interpolator interpolator, int i4, int i5) {
            this.o = false;
            this.h = dVar;
            this.d = n8gVar;
            this.e = i;
            this.f = i2;
            long jNanoTime = System.nanoTime();
            this.c = jNanoTime;
            this.m = jNanoTime;
            this.h.b(this);
            this.i = interpolator;
            this.f1965a = i4;
            this.f1966b = i5;
            if (i3 == 3) {
                this.o = true;
            }
            this.l = i == 0 ? Float.MAX_VALUE : 1.0f / i;
            a();
        }

        public void a() {
            if (this.j) {
                c();
            } else {
                b();
            }
        }

        public void b() {
            long jNanoTime = System.nanoTime();
            long j = jNanoTime - this.m;
            this.m = jNanoTime;
            float f = this.f1967k + (((float) (j * 1.0E-6d)) * this.l);
            this.f1967k = f;
            if (f >= 1.0f) {
                this.f1967k = 1.0f;
            }
            Interpolator interpolator = this.i;
            float interpolation = interpolator == null ? this.f1967k : interpolator.getInterpolation(this.f1967k);
            n8g n8gVar = this.d;
            boolean zX = n8gVar.x(n8gVar.f27655b, interpolation, jNanoTime, this.g);
            if (this.f1967k >= 1.0f) {
                if (this.f1965a != -1) {
                    this.d.v().setTag(this.f1965a, Long.valueOf(System.nanoTime()));
                }
                if (this.f1966b != -1) {
                    this.d.v().setTag(this.f1966b, null);
                }
                if (!this.o) {
                    this.h.g(this);
                }
            }
            if (this.f1967k < 1.0f || zX) {
                this.h.e();
            }
        }

        public void c() {
            long jNanoTime = System.nanoTime();
            long j = jNanoTime - this.m;
            this.m = jNanoTime;
            float f = this.f1967k - (((float) (j * 1.0E-6d)) * this.l);
            this.f1967k = f;
            if (f < 0.0f) {
                this.f1967k = 0.0f;
            }
            Interpolator interpolator = this.i;
            float interpolation = interpolator == null ? this.f1967k : interpolator.getInterpolation(this.f1967k);
            n8g n8gVar = this.d;
            boolean zX = n8gVar.x(n8gVar.f27655b, interpolation, jNanoTime, this.g);
            if (this.f1967k <= 0.0f) {
                if (this.f1965a != -1) {
                    this.d.v().setTag(this.f1965a, Long.valueOf(System.nanoTime()));
                }
                if (this.f1966b != -1) {
                    this.d.v().setTag(this.f1966b, null);
                }
                this.h.g(this);
            }
            if (this.f1967k > 0.0f || zX) {
                this.h.e();
            }
        }

        public void d(int i, float f, float f2) {
            if (i == 1) {
                if (this.j) {
                    return;
                }
                e(true);
            } else {
                if (i != 2) {
                    return;
                }
                this.d.v().getHitRect(this.n);
                if (this.n.contains((int) f, (int) f2) || this.j) {
                    return;
                }
                e(true);
            }
        }

        public void e(boolean z) {
            int i;
            this.j = z;
            if (z && (i = this.f) != -1) {
                this.l = i == 0 ? Float.MAX_VALUE : 1.0f / i;
            }
            this.h.e();
            this.m = System.nanoTime();
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0085  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public c(Context context, XmlPullParser xmlPullParser) {
        byte b2;
        this.o = context;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (!name.equals("ConstraintOverride")) {
                                b2 = -1;
                            } else {
                                b2 = 2;
                            }
                            break;
                        case -1239391468:
                            if (!name.equals("KeyFrameSet")) {
                                b2 = -1;
                            } else {
                                b2 = 1;
                            }
                            break;
                        case 61998586:
                            if (!name.equals("ViewTransition")) {
                                b2 = -1;
                            } else {
                                b2 = 0;
                            }
                            break;
                        case 366511058:
                            if (!name.equals("CustomMethod")) {
                                b2 = -1;
                            } else {
                                b2 = 4;
                            }
                            break;
                        case 1791837707:
                            if (!name.equals("CustomAttribute")) {
                                b2 = -1;
                            } else {
                                b2 = 3;
                            }
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    if (b2 == 0) {
                        l(context, xmlPullParser);
                    } else if (b2 == 1) {
                        this.f = new zzd(context, xmlPullParser);
                    } else if (b2 == 2) {
                        this.g = androidx.constraintlayout.widget.a.m(context, xmlPullParser);
                    } else if (b2 == 3 || b2 == 4) {
                        ConstraintAttribute.i(context, xmlPullParser, this.g.g);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(ir5.a());
                        sb.append(" unknown tag ");
                        sb.append(name);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(".xml:");
                        sb2.append(xmlPullParser.getLineNumber());
                    }
                } else if (eventType == 3 && "ViewTransition".equals(xmlPullParser.getName())) {
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

    public void b(d dVar, MotionLayout motionLayout, View view) {
        n8g n8gVar = new n8g(view);
        n8gVar.B(view);
        this.f.a(n8gVar);
        n8gVar.I(motionLayout.getWidth(), motionLayout.getHeight(), this.h, System.nanoTime());
        new b(dVar, n8gVar, this.h, this.i, this.f1961b, f(motionLayout.getContext()), this.p, this.q);
    }

    public void c(d dVar, MotionLayout motionLayout, int i, androidx.constraintlayout.widget.a aVar, final View... viewArr) {
        if (this.c) {
            return;
        }
        int i2 = this.e;
        if (i2 == 2) {
            b(dVar, motionLayout, viewArr[0]);
            return;
        }
        if (i2 == 1) {
            for (int i3 : motionLayout.getConstraintSetIds()) {
                if (i3 != i) {
                    androidx.constraintlayout.widget.a aVarM = motionLayout.M(i3);
                    for (View view : viewArr) {
                        androidx.constraintlayout.widget.a.C0020a c0020aE = aVarM.E(view.getId());
                        androidx.constraintlayout.widget.a.C0020a c0020a = this.g;
                        if (c0020a != null) {
                            c0020a.d(c0020aE);
                            c0020aE.g.putAll(this.g.g);
                        }
                    }
                }
            }
        }
        androidx.constraintlayout.widget.a aVar2 = new androidx.constraintlayout.widget.a();
        aVar2.t(aVar);
        for (View view2 : viewArr) {
            androidx.constraintlayout.widget.a.C0020a c0020aE2 = aVar2.E(view2.getId());
            androidx.constraintlayout.widget.a.C0020a c0020a2 = this.g;
            if (c0020a2 != null) {
                c0020a2.d(c0020aE2);
                c0020aE2.g.putAll(this.g.g);
            }
        }
        motionLayout.j0(i, aVar2);
        motionLayout.j0(nqi.f28263b, aVar);
        motionLayout.setState(nqi.f28263b, -1, -1);
        androidx.constraintlayout.motion.widget.a.b bVar = new androidx.constraintlayout.motion.widget.a.b(-1, motionLayout.f1923a, nqi.f28263b, i);
        for (View view3 : viewArr) {
            n(bVar, view3);
        }
        motionLayout.setTransition(bVar);
        motionLayout.d0(new Runnable() { // from class: rxq
            @Override // java.lang.Runnable
            public final void run() {
                this.f33045a.j(viewArr);
            }
        });
    }

    public boolean d(View view) {
        int i = this.f1963r;
        boolean z = i == -1 || view.getTag(i) != null;
        int i2 = this.s;
        return z && (i2 == -1 || view.getTag(i2) == null);
    }

    public int e() {
        return this.f1960a;
    }

    public Interpolator f(Context context) {
        int i = this.l;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(context, this.n);
        }
        if (i == -1) {
            return new a(this, ba7.c(this.m));
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

    public int g() {
        return this.t;
    }

    public int h() {
        return this.u;
    }

    public int i() {
        return this.f1961b;
    }

    public final /* synthetic */ void j(View[] viewArr) {
        if (this.p != -1) {
            for (View view : viewArr) {
                view.setTag(this.p, Long.valueOf(System.nanoTime()));
            }
        }
        if (this.q != -1) {
            for (View view2 : viewArr) {
                view2.setTag(this.q, null);
            }
        }
    }

    public boolean k(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.j == -1 && this.f1962k == null) || !d(view)) {
            return false;
        }
        if (view.getId() == this.j) {
            return true;
        }
        return this.f1962k != null && (view.getLayoutParams() instanceof ConstraintLayout.LayoutParams) && (str = ((ConstraintLayout.LayoutParams) view.getLayoutParams()).c0) != null && str.matches(this.f1962k);
    }

    public final void l(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), u4j.Qb);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == u4j.Rb) {
                this.f1960a = typedArrayObtainStyledAttributes.getResourceId(index, this.f1960a);
            } else if (index == u4j.Zb) {
                if (MotionLayout.E0) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                    this.j = resourceId;
                    if (resourceId == -1) {
                        this.f1962k = typedArrayObtainStyledAttributes.getString(index);
                    }
                } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                    this.f1962k = typedArrayObtainStyledAttributes.getString(index);
                } else {
                    this.j = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                }
            } else if (index == u4j.ac) {
                this.f1961b = typedArrayObtainStyledAttributes.getInt(index, this.f1961b);
            } else if (index == u4j.dc) {
                this.c = typedArrayObtainStyledAttributes.getBoolean(index, this.c);
            } else if (index == u4j.bc) {
                this.d = typedArrayObtainStyledAttributes.getInt(index, this.d);
            } else if (index == u4j.Vb) {
                this.h = typedArrayObtainStyledAttributes.getInt(index, this.h);
            } else if (index == u4j.ec) {
                this.i = typedArrayObtainStyledAttributes.getInt(index, this.i);
            } else if (index == u4j.fc) {
                this.e = typedArrayObtainStyledAttributes.getInt(index, this.e);
            } else if (index == u4j.Yb) {
                int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i2 == 1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.n = resourceId2;
                    if (resourceId2 != -1) {
                        this.l = -2;
                    }
                } else if (i2 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.m = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.l = -1;
                    } else {
                        this.n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.l = -2;
                    }
                } else {
                    this.l = typedArrayObtainStyledAttributes.getInteger(index, this.l);
                }
            } else if (index == u4j.cc) {
                this.p = typedArrayObtainStyledAttributes.getResourceId(index, this.p);
            } else if (index == u4j.Ub) {
                this.q = typedArrayObtainStyledAttributes.getResourceId(index, this.q);
            } else if (index == u4j.Xb) {
                this.f1963r = typedArrayObtainStyledAttributes.getResourceId(index, this.f1963r);
            } else if (index == u4j.Wb) {
                this.s = typedArrayObtainStyledAttributes.getResourceId(index, this.s);
            } else if (index == u4j.Tb) {
                this.u = typedArrayObtainStyledAttributes.getResourceId(index, this.u);
            } else if (index == u4j.Sb) {
                this.t = typedArrayObtainStyledAttributes.getInteger(index, this.t);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public boolean m(int i) {
        int i2 = this.f1961b;
        if (i2 == 1) {
            return i == 0;
        }
        if (i2 == 2) {
            return i == 1;
        }
        return i2 == 3 && i == 0;
    }

    public final void n(androidx.constraintlayout.motion.widget.a.b bVar, View view) {
        int i = this.h;
        if (i != -1) {
            bVar.E(i);
        }
        bVar.H(this.d);
        bVar.F(this.l, this.m, this.n);
        int id = view.getId();
        zzd zzdVar = this.f;
        if (zzdVar != null) {
            ArrayList<qzd> arrayListD = zzdVar.d(-1);
            zzd zzdVar2 = new zzd();
            Iterator<qzd> it = arrayListD.iterator();
            while (it.hasNext()) {
                zzdVar2.c(it.next().clone().i(id));
            }
            bVar.t(zzdVar2);
        }
    }

    public String toString() {
        return "ViewTransition(" + ir5.c(this.o, this.f1960a) + ")";
    }
}
