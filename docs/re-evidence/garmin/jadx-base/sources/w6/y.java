package w6;

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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.garmin.android.apps.connectmobile.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f183080a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f183084e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f183085f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.constraintlayout.widget.d.a f183086g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f183089j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f183090k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Context f183094o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f183081b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f183082c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f183083d = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f183087h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f183088i = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f183091l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f183092m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f183093n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f183095p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f183096q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f183097r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f183098s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f183099t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f183100u = -1;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f183101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f183102b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final n f183103c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f183104d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final z f183106f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Interpolator f183107g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f183109i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f183110j;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f183113m;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final o6.d f183105e = new o6.d();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f183108h = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Rect f183112l = new Rect();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f183111k = System.nanoTime();

        public a(z zVar, n nVar, int i14, int i15, int i16, Interpolator interpolator, int i17, int i18) {
            this.f183113m = false;
            this.f183106f = zVar;
            this.f183103c = nVar;
            this.f183104d = i15;
            if (zVar.f183117d == null) {
                zVar.f183117d = new ArrayList<>();
            }
            zVar.f183117d.add(this);
            this.f183107g = interpolator;
            this.f183101a = i17;
            this.f183102b = i18;
            if (i16 == 3) {
                this.f183113m = true;
            }
            this.f183110j = i14 == 0 ? Float.MAX_VALUE : 1.0f / i14;
            a();
        }

        public final void a() {
            boolean z14 = this.f183108h;
            int i14 = this.f183102b;
            int i15 = this.f183101a;
            Interpolator interpolator = this.f183107g;
            n nVar = this.f183103c;
            z zVar = this.f183106f;
            if (z14) {
                long jNanoTime = System.nanoTime();
                long j8 = jNanoTime - this.f183111k;
                this.f183111k = jNanoTime;
                float f14 = this.f183109i - (((float) (j8 * 1.0E-6d)) * this.f183110j);
                this.f183109i = f14;
                if (f14 < 0.0f) {
                    this.f183109i = 0.0f;
                }
                float interpolation = this.f183109i;
                if (interpolator != null) {
                    interpolation = interpolator.getInterpolation(interpolation);
                }
                boolean zC = nVar.c(interpolation, jNanoTime, nVar.f182889b, this.f183105e);
                if (this.f183109i <= 0.0f) {
                    if (i15 != -1) {
                        nVar.f182889b.setTag(i15, Long.valueOf(System.nanoTime()));
                    }
                    if (i14 != -1) {
                        nVar.f182889b.setTag(i14, null);
                    }
                    zVar.f183118e.add(this);
                }
                if (this.f183109i > 0.0f || zC) {
                    zVar.f183114a.invalidate();
                    return;
                }
                return;
            }
            long jNanoTime2 = System.nanoTime();
            long j14 = jNanoTime2 - this.f183111k;
            this.f183111k = jNanoTime2;
            float f15 = (((float) (j14 * 1.0E-6d)) * this.f183110j) + this.f183109i;
            this.f183109i = f15;
            if (f15 >= 1.0f) {
                this.f183109i = 1.0f;
            }
            float interpolation2 = this.f183109i;
            if (interpolator != null) {
                interpolation2 = interpolator.getInterpolation(interpolation2);
            }
            boolean zC2 = nVar.c(interpolation2, jNanoTime2, nVar.f182889b, this.f183105e);
            if (this.f183109i >= 1.0f) {
                if (i15 != -1) {
                    nVar.f182889b.setTag(i15, Long.valueOf(System.nanoTime()));
                }
                if (i14 != -1) {
                    nVar.f182889b.setTag(i14, null);
                }
                if (!this.f183113m) {
                    zVar.f183118e.add(this);
                }
            }
            if (this.f183109i < 1.0f || zC2) {
                zVar.f183114a.invalidate();
            }
        }

        public final void b() {
            this.f183108h = true;
            int i14 = this.f183104d;
            if (i14 != -1) {
                this.f183110j = i14 == 0 ? Float.MAX_VALUE : 1.0f / i14;
            }
            this.f183106f.f183114a.invalidate();
            this.f183111k = System.nanoTime();
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008f A[Catch: IOException | XmlPullParserException -> 0x00ac, IOException | XmlPullParserException -> 0x00ac, TryCatch #0 {IOException | XmlPullParserException -> 0x00ac, blocks: (B:3:0x0024, B:11:0x0035, B:11:0x0035, B:33:0x00a6, B:33:0x00a6, B:14:0x0041, B:14:0x0041, B:15:0x0049, B:15:0x0049, B:32:0x008f, B:32:0x008f, B:17:0x004d, B:17:0x004d, B:22:0x005e, B:22:0x005e, B:20:0x0056, B:20:0x0056, B:23:0x0066, B:23:0x0066, B:25:0x006c, B:25:0x006c, B:26:0x0070, B:26:0x0070, B:28:0x0078, B:28:0x0078, B:29:0x0080, B:29:0x0080, B:31:0x0088, B:31:0x0088), top: B:37:0x0024 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public y(Context context, XmlPullParser xmlPullParser) {
        this.f183094o = context;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (!name.equals("ConstraintOverride")) {
                                StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
                                stackTraceElement.getFileName();
                                stackTraceElement.getLineNumber();
                                stackTraceElement.getMethodName();
                                xmlPullParser.getLineNumber();
                            } else {
                                this.f183086g = androidx.constraintlayout.widget.d.d(context, xmlPullParser);
                            }
                            break;
                        case -1239391468:
                            if (!name.equals("KeyFrameSet")) {
                                StackTraceElement stackTraceElement2 = new Throwable().getStackTrace()[1];
                                stackTraceElement2.getFileName();
                                stackTraceElement2.getLineNumber();
                                stackTraceElement2.getMethodName();
                                xmlPullParser.getLineNumber();
                            } else {
                                this.f183085f = new g(context, xmlPullParser);
                            }
                            break;
                        case 61998586:
                            if (!name.equals("ViewTransition")) {
                                StackTraceElement stackTraceElement3 = new Throwable().getStackTrace()[1];
                                stackTraceElement3.getFileName();
                                stackTraceElement3.getLineNumber();
                                stackTraceElement3.getMethodName();
                                xmlPullParser.getLineNumber();
                            } else {
                                d(context, xmlPullParser);
                            }
                            break;
                        case 366511058:
                            if (!name.equals("CustomMethod")) {
                                StackTraceElement stackTraceElement4 = new Throwable().getStackTrace()[1];
                                stackTraceElement4.getFileName();
                                stackTraceElement4.getLineNumber();
                                stackTraceElement4.getMethodName();
                                xmlPullParser.getLineNumber();
                            } else {
                                androidx.constraintlayout.widget.a.d(context, xmlPullParser, this.f183086g.f6205g);
                            }
                            break;
                        case 1791837707:
                            if (!name.equals("CustomAttribute")) {
                                StackTraceElement stackTraceElement5 = new Throwable().getStackTrace()[1];
                                stackTraceElement5.getFileName();
                                stackTraceElement5.getLineNumber();
                                stackTraceElement5.getMethodName();
                                xmlPullParser.getLineNumber();
                            } else {
                                androidx.constraintlayout.widget.a.d(context, xmlPullParser, this.f183086g.f6205g);
                            }
                            break;
                        default:
                            StackTraceElement stackTraceElement6 = new Throwable().getStackTrace()[1];
                            stackTraceElement6.getFileName();
                            stackTraceElement6.getLineNumber();
                            stackTraceElement6.getMethodName();
                            xmlPullParser.getLineNumber();
                            break;
                    }
                } else if (eventType == 3 && "ViewTransition".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    public final void a(z zVar, q qVar, int i14, androidx.constraintlayout.widget.d dVar, View... viewArr) {
        Interpolator interpolatorLoadInterpolator;
        Interpolator interpolator;
        if (this.f183082c) {
            return;
        }
        int i15 = this.f183084e;
        g gVar = this.f183085f;
        int i16 = 0;
        if (i15 == 2) {
            View view2 = viewArr[0];
            n nVar = new n(view2);
            r rVar = nVar.f182893f;
            rVar.f182997c = 0.0f;
            rVar.f182998d = 0.0f;
            nVar.H = true;
            rVar.d(view2.getX(), view2.getY(), view2.getWidth(), view2.getHeight());
            nVar.f182894g.d(view2.getX(), view2.getY(), view2.getWidth(), view2.getHeight());
            l lVar = nVar.f182895h;
            lVar.getClass();
            view2.getX();
            view2.getY();
            view2.getWidth();
            view2.getHeight();
            lVar.b(view2);
            l lVar2 = nVar.f182896i;
            lVar2.getClass();
            view2.getX();
            view2.getY();
            view2.getWidth();
            view2.getHeight();
            lVar2.b(view2);
            ArrayList<d> arrayList = gVar.f182819a.get(-1);
            if (arrayList != null) {
                nVar.f182910w.addAll(arrayList);
            }
            nVar.f(qVar.getWidth(), qVar.getHeight(), System.nanoTime());
            int i17 = this.f183087h;
            int i18 = this.f183088i;
            int i19 = this.f183081b;
            Context context = qVar.getContext();
            int i24 = this.f183091l;
            if (i24 == -2) {
                interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, this.f183093n);
            } else if (i24 == -1) {
                interpolatorLoadInterpolator = new x(this, o6.c.c(this.f183092m));
            } else if (i24 == 0) {
                interpolatorLoadInterpolator = new AccelerateDecelerateInterpolator();
            } else if (i24 == 1) {
                interpolatorLoadInterpolator = new AccelerateInterpolator();
            } else if (i24 == 2) {
                interpolatorLoadInterpolator = new DecelerateInterpolator();
            } else if (i24 == 4) {
                interpolatorLoadInterpolator = new BounceInterpolator();
            } else {
                if (i24 != 5) {
                    if (i24 != 6) {
                        interpolator = null;
                    } else {
                        interpolatorLoadInterpolator = new AnticipateInterpolator();
                    }
                    new a(zVar, nVar, i17, i18, i19, interpolator, this.f183095p, this.f183096q);
                    return;
                }
                interpolatorLoadInterpolator = new OvershootInterpolator();
            }
            interpolator = interpolatorLoadInterpolator;
            new a(zVar, nVar, i17, i18, i19, interpolator, this.f183095p, this.f183096q);
            return;
        }
        androidx.constraintlayout.widget.d.a aVar = this.f183086g;
        if (i15 == 1) {
            int[] constraintSetIds = qVar.getConstraintSetIds();
            int i25 = 0;
            while (i25 < constraintSetIds.length) {
                int i26 = constraintSetIds[i25];
                if (i26 != i14) {
                    s sVar = qVar.f182919a;
                    androidx.constraintlayout.widget.d dVarB = sVar == null ? null : sVar.b(i26);
                    int length = viewArr.length;
                    for (int i27 = i16; i27 < length; i27++) {
                        androidx.constraintlayout.widget.d.a aVarL = dVarB.l(viewArr[i27].getId());
                        if (aVar != null) {
                            androidx.constraintlayout.widget.d.a.C0084a c0084a = aVar.f6206h;
                            if (c0084a != null) {
                                c0084a.e(aVarL);
                            }
                            aVarL.f6205g.putAll(aVar.f6205g);
                        }
                    }
                }
                i25++;
                i16 = 0;
            }
        }
        androidx.constraintlayout.widget.d dVar2 = new androidx.constraintlayout.widget.d();
        HashMap<Integer, androidx.constraintlayout.widget.d.a> map = dVar2.f6198g;
        map.clear();
        for (Integer num : dVar.f6198g.keySet()) {
            androidx.constraintlayout.widget.d.a aVar2 = dVar.f6198g.get(num);
            if (aVar2 != null) {
                map.put(num, aVar2.clone());
            }
        }
        for (View view3 : viewArr) {
            androidx.constraintlayout.widget.d.a aVarL2 = dVar2.l(view3.getId());
            if (aVar != null) {
                androidx.constraintlayout.widget.d.a.C0084a c0084a2 = aVar.f6206h;
                if (c0084a2 != null) {
                    c0084a2.e(aVarL2);
                }
                aVarL2.f6205g.putAll(aVar.f6205g);
            }
        }
        qVar.C(i14, dVar2);
        qVar.C(R.id.view_transition, dVar);
        qVar.setState(R.id.view_transition, -1, -1);
        s.b bVar = new s.b(-1, qVar.f182919a, R.id.view_transition, i14);
        for (View view4 : viewArr) {
            int i28 = this.f183087h;
            if (i28 != -1) {
                bVar.f183039h = Math.max(i28, 8);
            }
            bVar.f183047p = this.f183083d;
            int i29 = this.f183091l;
            String str = this.f183092m;
            int i30 = this.f183093n;
            bVar.f183036e = i29;
            bVar.f183037f = str;
            bVar.f183038g = i30;
            int id3 = view4.getId();
            if (gVar != null) {
                ArrayList<d> arrayList2 = gVar.f182819a.get(-1);
                g gVar2 = new g();
                Iterator<d> it = arrayList2.iterator();
                while (it.hasNext()) {
                    d dVarClone = it.next().clone();
                    dVarClone.f182779b = id3;
                    gVar2.b(dVarClone);
                }
                bVar.f183042k.add(gVar2);
            }
        }
        qVar.setTransition(bVar);
        vg1.d dVar3 = new vg1.d(8, this, viewArr);
        qVar.n(1.0f);
        qVar.f182920a1 = dVar3;
    }

    public final boolean b(View view2) {
        int i14 = this.f183097r;
        boolean z14 = i14 == -1 || view2.getTag(i14) != null;
        int i15 = this.f183098s;
        return z14 && (i15 == -1 || view2.getTag(i15) == null);
    }

    public final boolean c(View view2) {
        String str;
        if (view2 == null) {
            return false;
        }
        if ((this.f183089j == -1 && this.f183090k == null) || !b(view2)) {
            return false;
        }
        if (view2.getId() == this.f183089j) {
            return true;
        }
        return this.f183090k != null && (view2.getLayoutParams() instanceof ConstraintLayout.b) && (str = ((ConstraintLayout.b) view2.getLayoutParams()).Y) != null && str.matches(this.f183090k);
    }

    public final void d(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.i.f6333y);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i14 = 0; i14 < indexCount; i14++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i14);
            if (index == 0) {
                this.f183080a = typedArrayObtainStyledAttributes.getResourceId(index, this.f183080a);
            } else if (index == 8) {
                if (q.f182918k1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f183089j);
                    this.f183089j = resourceId;
                    if (resourceId == -1) {
                        this.f183090k = typedArrayObtainStyledAttributes.getString(index);
                    }
                } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                    this.f183090k = typedArrayObtainStyledAttributes.getString(index);
                } else {
                    this.f183089j = typedArrayObtainStyledAttributes.getResourceId(index, this.f183089j);
                }
            } else if (index == 9) {
                this.f183081b = typedArrayObtainStyledAttributes.getInt(index, this.f183081b);
            } else if (index == 12) {
                this.f183082c = typedArrayObtainStyledAttributes.getBoolean(index, this.f183082c);
            } else if (index == 10) {
                this.f183083d = typedArrayObtainStyledAttributes.getInt(index, this.f183083d);
            } else if (index == 4) {
                this.f183087h = typedArrayObtainStyledAttributes.getInt(index, this.f183087h);
            } else if (index == 13) {
                this.f183088i = typedArrayObtainStyledAttributes.getInt(index, this.f183088i);
            } else if (index == 14) {
                this.f183084e = typedArrayObtainStyledAttributes.getInt(index, this.f183084e);
            } else if (index == 7) {
                int i15 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i15 == 1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.f183093n = resourceId2;
                    if (resourceId2 != -1) {
                        this.f183091l = -2;
                    }
                } else if (i15 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f183092m = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.f183091l = -1;
                    } else {
                        this.f183093n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f183091l = -2;
                    }
                } else {
                    this.f183091l = typedArrayObtainStyledAttributes.getInteger(index, this.f183091l);
                }
            } else if (index == 11) {
                this.f183095p = typedArrayObtainStyledAttributes.getResourceId(index, this.f183095p);
            } else if (index == 3) {
                this.f183096q = typedArrayObtainStyledAttributes.getResourceId(index, this.f183096q);
            } else if (index == 6) {
                this.f183097r = typedArrayObtainStyledAttributes.getResourceId(index, this.f183097r);
            } else if (index == 5) {
                this.f183098s = typedArrayObtainStyledAttributes.getResourceId(index, this.f183098s);
            } else if (index == 2) {
                this.f183100u = typedArrayObtainStyledAttributes.getResourceId(index, this.f183100u);
            } else if (index == 1) {
                this.f183099t = typedArrayObtainStyledAttributes.getInteger(index, this.f183099t);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final String toString() {
        return "ViewTransition(" + w6.a.b(this.f183080a, this.f183094o) + ")";
    }
}
