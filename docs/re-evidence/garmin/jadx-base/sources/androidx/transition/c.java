package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.garmin.android.apps.connectmobile.R;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class c extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f11055b = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f11056c = new a(PointF.class, "topLeft");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f11057d = new b(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0156c f11058e = new C0156c(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f11059f = new d(PointF.class, "topLeft");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f11060g = new e(PointF.class, ModelSourceWrapper.POSITION);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j f11061h = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11062a;

    public class a extends Property<i, PointF> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            iVar2.getClass();
            iVar2.f11079a = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            iVar2.f11080b = iRound;
            int i14 = iVar2.f11084f + 1;
            iVar2.f11084f = i14;
            if (i14 == iVar2.f11085g) {
                x.a(iVar2.f11083e, iVar2.f11079a, iRound, iVar2.f11081c, iVar2.f11082d);
                iVar2.f11084f = 0;
                iVar2.f11085g = 0;
            }
        }
    }

    public class b extends Property<i, PointF> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            iVar2.getClass();
            iVar2.f11081c = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            iVar2.f11082d = iRound;
            int i14 = iVar2.f11085g + 1;
            iVar2.f11085g = i14;
            if (iVar2.f11084f == i14) {
                x.a(iVar2.f11083e, iVar2.f11079a, iVar2.f11080b, iVar2.f11081c, iRound);
                iVar2.f11084f = 0;
                iVar2.f11085g = 0;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.transition.c$c, reason: collision with other inner class name */
    public class C0156c extends Property<View, PointF> {
        public C0156c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view2) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view2, PointF pointF) {
            View view3 = view2;
            PointF pointF2 = pointF;
            x.a(view3, view3.getLeft(), view3.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    public class d extends Property<View, PointF> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view2) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view2, PointF pointF) {
            View view3 = view2;
            PointF pointF2 = pointF;
            x.a(view3, Math.round(pointF2.x), Math.round(pointF2.y), view3.getRight(), view3.getBottom());
        }
    }

    public class e extends Property<View, PointF> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view2) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view2, PointF pointF) {
            View view3 = view2;
            PointF pointF2 = pointF;
            int iRound = Math.round(pointF2.x);
            int iRound2 = Math.round(pointF2.y);
            x.a(view3, iRound, iRound2, view3.getWidth() + iRound, view3.getHeight() + iRound2);
        }
    }

    public class f extends AnimatorListenerAdapter {
        private final i mViewBounds;

        public f(c cVar, i iVar) {
            this.mViewBounds = iVar;
        }
    }

    public static class h extends o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f11077a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ViewGroup f11078b;

        public h(ViewGroup viewGroup) {
            this.f11078b = viewGroup;
        }

        @Override // androidx.transition.o, androidx.transition.m.h
        public final void onTransitionCancel(m mVar) {
            w.a(this.f11078b, false);
            this.f11077a = true;
        }

        @Override // androidx.transition.o, androidx.transition.m.h
        public final void onTransitionEnd(m mVar) {
            if (!this.f11077a) {
                w.a(this.f11078b, false);
            }
            mVar.removeListener(this);
        }

        @Override // androidx.transition.o, androidx.transition.m.h
        public final void onTransitionPause(m mVar) {
            w.a(this.f11078b, false);
        }

        @Override // androidx.transition.o, androidx.transition.m.h
        public final void onTransitionResume(m mVar) {
            w.a(this.f11078b, true);
        }
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f11079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f11080b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f11081c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f11082d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final View f11083e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f11084f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f11085g;

        public i(View view2) {
            this.f11083e = view2;
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11062a = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f11123b);
        boolean z14 = b7.j.e((XmlResourceParser) attributeSet, "resizeClip") ? typedArrayObtainStyledAttributes.getBoolean(0, false) : false;
        typedArrayObtainStyledAttributes.recycle();
        this.f11062a = z14;
    }

    @Override // androidx.transition.m
    public final void captureEndValues(t tVar) {
        captureValues(tVar);
    }

    @Override // androidx.transition.m
    public final void captureStartValues(t tVar) {
        Rect rect;
        captureValues(tVar);
        if (!this.f11062a || (rect = (Rect) tVar.f11164b.getTag(R.id.transition_clip)) == null) {
            return;
        }
        tVar.f11163a.put("android:changeBounds:clip", rect);
    }

    public final void captureValues(t tVar) {
        View view2 = tVar.f11164b;
        HashMap map = tVar.f11163a;
        if (!view2.isLaidOut() && view2.getWidth() == 0 && view2.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom()));
        map.put("android:changeBounds:parent", tVar.f11164b.getParent());
        if (this.f11062a) {
            map.put("android:changeBounds:clip", view2.getClipBounds());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [android.animation.Animator] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.animation.AnimatorSet] */
    /* JADX WARN: Type inference failed for: r22v0, types: [androidx.transition.c, androidx.transition.m] */
    /* JADX WARN: Type inference failed for: r2v10, types: [android.animation.Animator[]] */
    /* JADX WARN: Type inference failed for: r4v16, types: [android.animation.Animator, android.animation.AnimatorSet] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // androidx.transition.m
    public final Animator createAnimator(ViewGroup viewGroup, t tVar, t tVar2) {
        int i14;
        int i15;
        Rect rect;
        ?? animatorSet;
        ?? OfObject;
        ObjectAnimator objectAnimatorOfObject;
        if (tVar == null) {
            return null;
        }
        HashMap map = tVar.f11163a;
        if (tVar2 == null) {
            return null;
        }
        HashMap map2 = tVar2.f11163a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = tVar2.f11164b;
        Rect rect2 = (Rect) map.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) map2.get("android:changeBounds:bounds");
        int i16 = rect2.left;
        int i17 = rect3.left;
        int i18 = rect2.top;
        int i19 = rect3.top;
        int i24 = rect2.right;
        int i25 = rect3.right;
        int i26 = rect2.bottom;
        int i27 = rect3.bottom;
        int i28 = i24 - i16;
        int i29 = i26 - i18;
        int i30 = i25 - i17;
        int i34 = i27 - i19;
        Rect rect4 = (Rect) map.get("android:changeBounds:clip");
        Rect rect5 = (Rect) map2.get("android:changeBounds:clip");
        if ((i28 == 0 || i29 == 0) && (i30 == 0 || i34 == 0)) {
            i14 = 0;
        } else {
            i14 = (i16 == i17 && i18 == i19) ? 0 : 1;
            if (i24 != i25 || i26 != i27) {
                i14++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i14++;
        }
        int i35 = i14;
        if (i35 <= 0) {
            return null;
        }
        boolean z14 = this.f11062a;
        e eVar = f11060g;
        if (z14) {
            x.a(view2, i16, i18, i16 + Math.max(i28, i30), i18 + Math.max(i29, i34));
            ObjectAnimator objectAnimatorOfObject2 = (i16 == i17 && i18 == i19) ? null : ObjectAnimator.ofObject(view2, eVar, (TypeConverter) null, getPathMotion().getPath(i16, i18, i17, i19));
            boolean z15 = rect4 == null;
            if (z15) {
                i15 = 0;
                rect = new Rect(0, 0, i28, i29);
            } else {
                i15 = 0;
                rect = rect4;
            }
            int i36 = rect5 == null ? 1 : i15;
            Rect rect6 = i36 != 0 ? new Rect(i15, i15, i30, i34) : rect5;
            if (rect.equals(rect6)) {
                animatorSet = 0;
            } else {
                view2.setClipBounds(rect);
                objectAnimatorOfObject = ObjectAnimator.ofObject(view2, "clipBounds", f11061h, rect, rect6);
                g gVar = new g(view2, rect, z15, rect6, i36, i16, i18, i24, i26, i17, i19, i25, i27);
                objectAnimatorOfObject.addListener(gVar);
                addListener(gVar);
            }
            if (objectAnimatorOfObject2 == null) {
                animatorSet = objectAnimatorOfObject;
                OfObject = animatorSet;
            } else if (animatorSet == 0) {
                OfObject = objectAnimatorOfObject2;
            } else {
                ?? animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(new Animator[]{objectAnimatorOfObject2, animatorSet});
                OfObject = animatorSet2;
            }
        } else {
            x.a(view2, i16, i18, i24, i26);
            if (i35 != 2) {
                OfObject = (i16 == i17 && i18 == i19) ? ObjectAnimator.ofObject(view2, f11058e, (TypeConverter) null, getPathMotion().getPath(i24, i26, i25, i27)) : ObjectAnimator.ofObject(view2, f11059f, (TypeConverter) null, getPathMotion().getPath(i16, i18, i17, i19));
            } else if (i28 == i30 && i29 == i34) {
                OfObject = ObjectAnimator.ofObject(view2, eVar, (TypeConverter) null, getPathMotion().getPath(i16, i18, i17, i19));
            } else {
                i iVar = new i(view2);
                ObjectAnimator objectAnimatorOfObject3 = ObjectAnimator.ofObject(iVar, f11056c, (TypeConverter) null, getPathMotion().getPath(i16, i18, i17, i19));
                ObjectAnimator objectAnimatorOfObject4 = ObjectAnimator.ofObject(iVar, f11057d, (TypeConverter) null, getPathMotion().getPath(i24, i26, i25, i27));
                animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorOfObject3, objectAnimatorOfObject4);
                animatorSet.addListener(new f(this, iVar));
                animatorSet = objectAnimatorOfObject;
                OfObject = animatorSet;
            }
        }
        if (view2.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view2.getParent();
            w.a(viewGroup4, true);
            getRootTransition().addListener(new h(viewGroup4));
        }
        return OfObject;
    }

    @Override // androidx.transition.m
    public final String[] getTransitionProperties() {
        return f11055b;
    }

    @Override // androidx.transition.m
    public final boolean isSeekingSupported() {
        return true;
    }

    public c() {
        this.f11062a = false;
    }

    public static class g extends AnimatorListenerAdapter implements m.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f11063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rect f11064b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f11065c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Rect f11066d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f11067e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f11068f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f11069g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f11070h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f11071i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f11072j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f11073k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f11074l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f11075m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f11076n;

        public g(View view2, Rect rect, boolean z14, Rect rect2, boolean z15, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25) {
            this.f11063a = view2;
            this.f11064b = rect;
            this.f11065c = z14;
            this.f11066d = rect2;
            this.f11067e = z15;
            this.f11068f = i14;
            this.f11069g = i15;
            this.f11070h = i16;
            this.f11071i = i17;
            this.f11072j = i18;
            this.f11073k = i19;
            this.f11074l = i24;
            this.f11075m = i25;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z14) {
            if (this.f11076n) {
                return;
            }
            Rect rect = null;
            if (z14) {
                if (!this.f11065c) {
                    rect = this.f11064b;
                }
            } else if (!this.f11067e) {
                rect = this.f11066d;
            }
            View view2 = this.f11063a;
            view2.setClipBounds(rect);
            if (z14) {
                x.a(view2, this.f11068f, this.f11069g, this.f11070h, this.f11071i);
            } else {
                x.a(view2, this.f11072j, this.f11073k, this.f11074l, this.f11075m);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z14) {
            int i14 = this.f11070h;
            int i15 = this.f11068f;
            int i16 = this.f11074l;
            int i17 = this.f11072j;
            int iMax = Math.max(i14 - i15, i16 - i17);
            int i18 = this.f11071i;
            int i19 = this.f11069g;
            int i24 = this.f11075m;
            int i25 = this.f11073k;
            int iMax2 = Math.max(i18 - i19, i24 - i25);
            if (z14) {
                i15 = i17;
            }
            if (z14) {
                i19 = i25;
            }
            View view2 = this.f11063a;
            x.a(view2, i15, i19, iMax + i15, iMax2 + i19);
            view2.setClipBounds(z14 ? this.f11066d : this.f11064b);
        }

        @Override // androidx.transition.m.h
        public final void onTransitionCancel(m mVar) {
            this.f11076n = true;
        }

        @Override // androidx.transition.m.h
        public final void onTransitionEnd(m mVar) {
        }

        @Override // androidx.transition.m.h
        public final void onTransitionPause(m mVar) {
            View view2 = this.f11063a;
            view2.setTag(R.id.transition_clip, view2.getClipBounds());
            view2.setClipBounds(this.f11067e ? null : this.f11066d);
        }

        @Override // androidx.transition.m.h
        public final void onTransitionResume(m mVar) {
            View view2 = this.f11063a;
            Rect rect = (Rect) view2.getTag(R.id.transition_clip);
            view2.setTag(R.id.transition_clip, null);
            view2.setClipBounds(rect);
        }

        @Override // androidx.transition.m.h
        public final void onTransitionStart(m mVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }
    }
}
