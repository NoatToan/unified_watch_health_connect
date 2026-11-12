package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.core.view.g1;
import androidx.core.view.s0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes7.dex */
public abstract class m implements Cloneable {
    static final boolean DBG = false;
    private static final String LOG_TAG = "Transition";
    private static final int MATCH_FIRST = 1;
    public static final int MATCH_ID = 3;
    private static final String MATCH_ID_STR = "id";
    public static final int MATCH_INSTANCE = 1;
    private static final String MATCH_INSTANCE_STR = "instance";
    public static final int MATCH_ITEM_ID = 4;
    private static final String MATCH_ITEM_ID_STR = "itemId";
    private static final int MATCH_LAST = 4;
    public static final int MATCH_NAME = 2;
    private static final String MATCH_NAME_STR = "name";
    private ArrayList<t> mEndValuesList;
    private f mEpicenterCallback;
    private h[] mListenersCache;
    private p1.a<String, String> mNameOverrides;
    q mPropagation;
    g mSeekController;
    long mSeekOffsetInParent;
    private ArrayList<t> mStartValuesList;
    long mTotalDuration;
    private static final Animator[] EMPTY_ANIMATOR_ARRAY = new Animator[0];
    private static final int[] DEFAULT_MATCH_ORDER = {2, 1, 3, 4};
    private static final androidx.transition.h STRAIGHT_PATH_MOTION = new a();
    private static ThreadLocal<p1.a<Animator, d>> sRunningAnimators = new ThreadLocal<>();
    private String mName = getClass().getName();
    private long mStartDelay = -1;
    long mDuration = -1;
    private TimeInterpolator mInterpolator = null;
    ArrayList<Integer> mTargetIds = new ArrayList<>();
    ArrayList<View> mTargets = new ArrayList<>();
    private ArrayList<String> mTargetNames = null;
    private ArrayList<Class<?>> mTargetTypes = null;
    private ArrayList<Integer> mTargetIdExcludes = null;
    private ArrayList<View> mTargetExcludes = null;
    private ArrayList<Class<?>> mTargetTypeExcludes = null;
    private ArrayList<String> mTargetNameExcludes = null;
    private ArrayList<Integer> mTargetIdChildExcludes = null;
    private ArrayList<View> mTargetChildExcludes = null;
    private ArrayList<Class<?>> mTargetTypeChildExcludes = null;
    private u mStartValues = new u();
    private u mEndValues = new u();
    s mParent = null;
    private int[] mMatchOrder = DEFAULT_MATCH_ORDER;
    boolean mCanRemoveViews = false;
    ArrayList<Animator> mCurrentAnimators = new ArrayList<>();
    private Animator[] mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
    int mNumInstances = 0;
    private boolean mPaused = false;
    boolean mEnded = false;
    private m mCloneParent = null;
    private ArrayList<h> mListeners = null;
    ArrayList<Animator> mAnimators = new ArrayList<>();
    private androidx.transition.h mPathMotion = STRAIGHT_PATH_MOTION;

    public class a extends androidx.transition.h {
        @Override // androidx.transition.h
        public final Path getPath(float f14, float f15, float f16, float f17) {
            Path path = new Path();
            path.moveTo(f14, f15);
            path.lineTo(f16, f17);
            return path;
        }
    }

    public class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1.a f11129a;

        public b(p1.a aVar) {
            this.f11129a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f11129a.remove(animator);
            m.this.mCurrentAnimators.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            m.this.mCurrentAnimators.add(animator);
        }
    }

    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            m.this.end();
            animator.removeListener(this);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f11132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f11133b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final t f11134c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final WindowId f11135d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final m f11136e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Animator f11137f;

        public d(View view2, String str, m mVar, WindowId windowId, t tVar, Animator animator) {
            this.f11132a = view2;
            this.f11133b = str;
            this.f11134c = tVar;
            this.f11135d = windowId;
            this.f11136e = mVar;
            this.f11137f = animator;
        }
    }

    public static class e {
        private e() {
        }

        public static ArrayList a(Object obj, ArrayList arrayList) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.contains(obj)) {
                arrayList.add(obj);
            }
            return arrayList;
        }

        public static ArrayList b(Object obj, ArrayList arrayList) {
            if (arrayList != null) {
                arrayList.remove(obj);
                if (arrayList.isEmpty()) {
                    return null;
                }
            }
            return arrayList;
        }
    }

    public static abstract class f {
        public abstract Rect a();
    }

    public class g extends o implements r, androidx.dynamicanimation.animation.b.r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f11139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f11140c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public androidx.dynamicanimation.animation.e f11142e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Runnable f11144g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f11138a = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f11141d = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final v f11143f = new v();

        public g() {
        }

        @Override // androidx.dynamicanimation.animation.b.r
        public final void a(float f14) {
            m mVar = m.this;
            long jMax = Math.max(-1L, Math.min(mVar.getTotalDurationMillis() + 1, Math.round(f14)));
            mVar.setCurrentPlayTimeMillis(jMax, this.f11138a);
            this.f11138a = jMax;
        }

        @Override // androidx.transition.r
        public final long b() {
            return m.this.getTotalDurationMillis();
        }

        @Override // androidx.transition.r
        public final void c() {
            if (this.f11139b) {
                f();
                this.f11142e.d(m.this.getTotalDurationMillis() + 1);
            } else {
                this.f11141d = 1;
                this.f11144g = null;
            }
        }

        @Override // androidx.transition.r
        public final void d(long j8) {
            if (this.f11142e != null) {
                vb.h.z("setCurrentPlayTimeMillis() called after animation has been started");
                return;
            }
            long j14 = this.f11138a;
            if (j8 == j14 || !this.f11139b) {
                return;
            }
            if (!this.f11140c) {
                m mVar = m.this;
                if (j8 != 0 || j14 <= 0) {
                    long totalDurationMillis = mVar.getTotalDurationMillis();
                    if (j8 == totalDurationMillis && this.f11138a < totalDurationMillis) {
                        j8 = 1 + totalDurationMillis;
                    }
                } else {
                    j8 = -1;
                }
                long j15 = this.f11138a;
                if (j8 != j15) {
                    mVar.setCurrentPlayTimeMillis(j8, j15);
                    this.f11138a = j8;
                }
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            v vVar = this.f11143f;
            int i14 = (vVar.f11172c + 1) % 20;
            vVar.f11172c = i14;
            vVar.f11170a[i14] = jCurrentAnimationTimeMillis;
            vVar.f11171b[i14] = j8;
        }

        @Override // androidx.transition.r
        public final void e(Runnable runnable) {
            this.f11144g = runnable;
            if (!this.f11139b) {
                this.f11141d = 2;
            } else {
                f();
                this.f11142e.d(0.0f);
            }
        }

        /* JADX WARN: Code duplicated, block: B:32:0x00a5  */
        public final void f() {
            float[] fArr;
            float f14;
            float fSqrt;
            if (this.f11142e != null) {
                return;
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float f15 = this.f11138a;
            v vVar = this.f11143f;
            int i14 = vVar.f11172c;
            float[] fArr2 = vVar.f11171b;
            long[] jArr = vVar.f11170a;
            int i15 = 20;
            int i16 = (i14 + 1) % 20;
            vVar.f11172c = i16;
            jArr[i16] = jCurrentAnimationTimeMillis;
            fArr2[i16] = f15;
            this.f11142e = new androidx.dynamicanimation.animation.e(new androidx.dynamicanimation.animation.d());
            androidx.dynamicanimation.animation.f fVar = new androidx.dynamicanimation.animation.f();
            fVar.f7016b = 1.0f;
            int i17 = 0;
            fVar.f7017c = false;
            fVar.a(200.0f);
            androidx.dynamicanimation.animation.e eVar = this.f11142e;
            eVar.f7012s = fVar;
            eVar.f6996b = this.f11138a;
            eVar.f6997c = true;
            ArrayList<androidx.dynamicanimation.animation.b.r> arrayList = eVar.f7006l;
            if (eVar.f7000f) {
                org.apache.commons.lang3.e.w("Error: Update listeners must be added beforethe animation.");
                return;
            }
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            androidx.dynamicanimation.animation.e eVar2 = this.f11142e;
            int i18 = vVar.f11172c;
            if (i18 == 0 && jArr[i18] == Long.MIN_VALUE) {
                fSqrt = 0.0f;
            } else {
                long j8 = jArr[i18];
                long j14 = j8;
                while (true) {
                    long j15 = jArr[i18];
                    if (j15 == Long.MIN_VALUE) {
                        fArr = fArr2;
                        f14 = 0.0f;
                        break;
                    }
                    fArr = fArr2;
                    f14 = 0.0f;
                    float f16 = j8 - j15;
                    float fAbs = Math.abs(j15 - j14);
                    if (f16 > 100.0f || fAbs > 40.0f) {
                        break;
                    }
                    if (i18 == 0) {
                        i18 = 20;
                    }
                    i18--;
                    i17++;
                    if (i17 >= 20) {
                        break;
                    }
                    j14 = j15;
                    fArr2 = fArr;
                }
                if (i17 < 2) {
                    fSqrt = f14;
                } else {
                    int i19 = vVar.f11172c;
                    float f17 = 1000.0f;
                    if (i17 == 2) {
                        int i24 = i19 == 0 ? 19 : i19 - 1;
                        float f18 = jArr[i19] - jArr[i24];
                        if (f18 == f14) {
                            fSqrt = f14;
                        } else {
                            fSqrt = 1000.0f * ((fArr[i19] - fArr[i24]) / f18);
                        }
                    } else {
                        int i25 = ((i19 - i17) + 21) % 20;
                        int i26 = (i19 + 21) % 20;
                        long j16 = jArr[i25];
                        float f19 = fArr[i25];
                        int i27 = i25 + 1;
                        int i28 = i27 % 20;
                        float f22 = f14;
                        while (i28 != i26) {
                            long j17 = jArr[i28];
                            int i29 = i15;
                            long j18 = j16;
                            float f24 = j17 - j18;
                            if (f24 == f14) {
                                j16 = j18;
                            } else {
                                float f25 = fArr[i28];
                                float f26 = (f25 - f19) / f24;
                                float fAbs2 = (Math.abs(f26) * (f26 - ((float) (Math.sqrt(Math.abs(f22) * 2.0f) * ((double) Math.signum(f22)))))) + f22;
                                i28 = i28;
                                if (i28 == i27) {
                                    fAbs2 *= 0.5f;
                                }
                                f22 = fAbs2;
                                f19 = f25;
                                j16 = j17;
                            }
                            i28 = (i28 + 1) % i29;
                            f17 = f17;
                            i15 = i29;
                        }
                        fSqrt = ((float) (Math.sqrt(Math.abs(f22) * 2.0f) * ((double) Math.signum(f22)))) * f17;
                    }
                }
            }
            eVar2.f6995a = fSqrt;
            this.f11142e.f7001g = m.this.getTotalDurationMillis() + 1;
            androidx.dynamicanimation.animation.e eVar3 = this.f11142e;
            eVar3.f7002h = -1.0f;
            eVar3.f7004j = 4.0f;
            androidx.dynamicanimation.animation.b.q qVar = new androidx.dynamicanimation.animation.b.q() { // from class: androidx.transition.n
                @Override // androidx.dynamicanimation.animation.b.q
                public final void a(float f27) {
                    m.g gVar = this.f11146a;
                    m mVar = m.this;
                    androidx.room.a0 a0Var = m.i.H;
                    if (f27 >= 1.0f) {
                        mVar.notifyListeners(a0Var, false);
                        return;
                    }
                    long totalDurationMillis = mVar.getTotalDurationMillis();
                    m mVarB = ((s) mVar).b(0);
                    m mVar2 = mVarB.mCloneParent;
                    mVarB.mCloneParent = null;
                    mVar.setCurrentPlayTimeMillis(-1L, gVar.f11138a);
                    mVar.setCurrentPlayTimeMillis(totalDurationMillis, -1L);
                    gVar.f11138a = totalDurationMillis;
                    Runnable runnable = gVar.f11144g;
                    if (runnable != null) {
                        runnable.run();
                    }
                    mVar.mAnimators.clear();
                    if (mVar2 != null) {
                        mVar2.notifyListeners(a0Var, true);
                    }
                }
            };
            ArrayList<androidx.dynamicanimation.animation.b.q> arrayList2 = eVar3.f7005k;
            if (arrayList2.contains(qVar)) {
                return;
            }
            arrayList2.add(qVar);
        }

        @Override // androidx.transition.r
        public final boolean isReady() {
            return this.f11139b;
        }

        @Override // androidx.transition.o, androidx.transition.m.h
        public final void onTransitionCancel(m mVar) {
            this.f11140c = true;
        }
    }

    public interface h {
        void onTransitionCancel(m mVar);

        void onTransitionEnd(m mVar);

        default void onTransitionEnd(m mVar, boolean z14) {
            onTransitionEnd(mVar);
        }

        void onTransitionPause(m mVar);

        void onTransitionResume(m mVar);

        void onTransitionStart(m mVar);

        default void onTransitionStart(m mVar, boolean z14) {
            onTransitionStart(mVar);
        }
    }

    public interface i {
        public static final androidx.room.a0 G = new androidx.room.a0(2);
        public static final androidx.room.a0 H = new androidx.room.a0(3);
        public static final androidx.room.a0 J = new androidx.room.a0(4);
        public static final androidx.room.a0 K = new androidx.room.a0(5);
        public static final androidx.room.a0 L = new androidx.room.a0(6);

        void a(h hVar, m mVar, boolean z14);
    }

    public m(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f11122a);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long jD = b7.j.d(typedArrayObtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (jD >= 0) {
            setDuration(jD);
        }
        long j8 = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startDelay") != null ? typedArrayObtainStyledAttributes.getInt(2, -1) : -1;
        if (j8 > 0) {
            setStartDelay(j8);
        }
        int resourceId = xmlResourceParser.getAttributeValue("http://schemas.android.com/apk/res/android", "interpolator") != null ? typedArrayObtainStyledAttributes.getResourceId(0, 0) : 0;
        if (resourceId > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        }
        String string = b7.j.e(xmlResourceParser, "matchOrder") ? typedArrayObtainStyledAttributes.getString(3) : null;
        if (string != null) {
            setMatchOrder(parseMatchOrder(string));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void addUnmatched(p1.a<View, t> aVar, p1.a<View, t> aVar2) {
        for (int i14 = 0; i14 < aVar.f134761c; i14++) {
            t tVarK = aVar.k(i14);
            if (isValidTarget(tVarK.f11164b)) {
                this.mStartValuesList.add(tVarK);
                this.mEndValuesList.add(null);
            }
        }
        for (int i15 = 0; i15 < aVar2.f134761c; i15++) {
            t tVarK2 = aVar2.k(i15);
            if (isValidTarget(tVarK2.f11164b)) {
                this.mEndValuesList.add(tVarK2);
                this.mStartValuesList.add(null);
            }
        }
    }

    private static void addViewValues(u uVar, View view2, t tVar) {
        p1.a<View, t> aVar = uVar.f11166a;
        p1.a<String, View> aVar2 = uVar.f11169d;
        SparseArray<View> sparseArray = uVar.f11167b;
        p1.z<View> zVar = uVar.f11168c;
        aVar.put(view2, tVar);
        int id3 = view2.getId();
        if (id3 >= 0) {
            if (sparseArray.indexOfKey(id3) >= 0) {
                sparseArray.put(id3, null);
            } else {
                sparseArray.put(id3, view2);
            }
        }
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        String transitionName = view2.getTransitionName();
        if (transitionName != null) {
            if (aVar2.containsKey(transitionName)) {
                aVar2.put(transitionName, null);
            } else {
                aVar2.put(transitionName, view2);
            }
        }
        if (view2.getParent() instanceof ListView) {
            ListView listView = (ListView) view2.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view2));
                if (zVar.c(itemIdAtPosition) < 0) {
                    view2.setHasTransientState(true);
                    zVar.f(itemIdAtPosition, view2);
                    return;
                }
                View viewB = zVar.b(itemIdAtPosition);
                if (viewB != null) {
                    viewB.setHasTransientState(false);
                    zVar.f(itemIdAtPosition, null);
                }
            }
        }
    }

    private static boolean alreadyContains(int[] iArr, int i14) {
        int i15 = iArr[i14];
        for (int i16 = 0; i16 < i14; i16++) {
            if (iArr[i16] == i15) {
                return true;
            }
        }
        return false;
    }

    private void captureHierarchy(View view2, boolean z14) {
        if (view2 == null) {
            return;
        }
        int id3 = view2.getId();
        ArrayList<Integer> arrayList = this.mTargetIdExcludes;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id3))) {
            ArrayList<View> arrayList2 = this.mTargetExcludes;
            if (arrayList2 == null || !arrayList2.contains(view2)) {
                ArrayList<Class<?>> arrayList3 = this.mTargetTypeExcludes;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        if (this.mTargetTypeExcludes.get(i14).isInstance(view2)) {
                            return;
                        }
                    }
                }
                if (view2.getParent() instanceof ViewGroup) {
                    t tVar = new t(view2);
                    if (z14) {
                        captureStartValues(tVar);
                    } else {
                        captureEndValues(tVar);
                    }
                    tVar.f11165c.add(this);
                    capturePropagationValues(tVar);
                    if (z14) {
                        addViewValues(this.mStartValues, view2, tVar);
                    } else {
                        addViewValues(this.mEndValues, view2, tVar);
                    }
                }
                if (view2 instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.mTargetIdChildExcludes;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id3))) {
                        ArrayList<View> arrayList5 = this.mTargetChildExcludes;
                        if (arrayList5 == null || !arrayList5.contains(view2)) {
                            ArrayList<Class<?>> arrayList6 = this.mTargetTypeChildExcludes;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i15 = 0; i15 < size2; i15++) {
                                    if (this.mTargetTypeChildExcludes.get(i15).isInstance(view2)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view2;
                            for (int i16 = 0; i16 < viewGroup.getChildCount(); i16++) {
                                captureHierarchy(viewGroup.getChildAt(i16), z14);
                            }
                        }
                    }
                }
            }
        }
    }

    private ArrayList<Integer> excludeId(ArrayList<Integer> arrayList, int i14, boolean z14) {
        if (i14 > 0) {
            return z14 ? e.a(Integer.valueOf(i14), arrayList) : e.b(Integer.valueOf(i14), arrayList);
        }
        return arrayList;
    }

    private static <T> ArrayList<T> excludeObject(ArrayList<T> arrayList, T t7, boolean z14) {
        if (t7 != null) {
            return z14 ? e.a(t7, arrayList) : e.b(t7, arrayList);
        }
        return arrayList;
    }

    private ArrayList<Class<?>> excludeType(ArrayList<Class<?>> arrayList, Class<?> cls, boolean z14) {
        if (cls != null) {
            return z14 ? e.a(cls, arrayList) : e.b(cls, arrayList);
        }
        return arrayList;
    }

    private ArrayList<View> excludeView(ArrayList<View> arrayList, View view2, boolean z14) {
        if (view2 != null) {
            return z14 ? e.a(view2, arrayList) : e.b(view2, arrayList);
        }
        return arrayList;
    }

    private static p1.a<Animator, d> getRunningAnimators() {
        p1.a<Animator, d> aVar = sRunningAnimators.get();
        if (aVar != null) {
            return aVar;
        }
        p1.a<Animator, d> aVar2 = new p1.a<>();
        sRunningAnimators.set(aVar2);
        return aVar2;
    }

    private static boolean isValidMatch(int i14) {
        return i14 >= 1 && i14 <= 4;
    }

    private static boolean isValueChanged(t tVar, t tVar2, String str) {
        Object obj = tVar.f11163a.get(str);
        Object obj2 = tVar2.f11163a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void matchIds(p1.a<View, t> aVar, p1.a<View, t> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view2;
        int size = sparseArray.size();
        for (int i14 = 0; i14 < size; i14++) {
            View viewValueAt = sparseArray.valueAt(i14);
            if (viewValueAt != null && isValidTarget(viewValueAt) && (view2 = sparseArray2.get(sparseArray.keyAt(i14))) != null && isValidTarget(view2)) {
                t tVar = aVar.get(viewValueAt);
                t tVar2 = aVar2.get(view2);
                if (tVar != null && tVar2 != null) {
                    this.mStartValuesList.add(tVar);
                    this.mEndValuesList.add(tVar2);
                    aVar.remove(viewValueAt);
                    aVar2.remove(view2);
                }
            }
        }
    }

    private void matchInstances(p1.a<View, t> aVar, p1.a<View, t> aVar2) {
        t tVarRemove;
        for (int i14 = aVar.f134761c - 1; i14 >= 0; i14--) {
            View viewG = aVar.g(i14);
            if (viewG != null && isValidTarget(viewG) && (tVarRemove = aVar2.remove(viewG)) != null && isValidTarget(tVarRemove.f11164b)) {
                this.mStartValuesList.add(aVar.i(i14));
                this.mEndValuesList.add(tVarRemove);
            }
        }
    }

    private void matchItemIds(p1.a<View, t> aVar, p1.a<View, t> aVar2, p1.z<View> zVar, p1.z<View> zVar2) {
        View viewB;
        int iH = zVar.h();
        for (int i14 = 0; i14 < iH; i14++) {
            View viewI = zVar.i(i14);
            if (viewI != null && isValidTarget(viewI) && (viewB = zVar2.b(zVar.e(i14))) != null && isValidTarget(viewB)) {
                t tVar = aVar.get(viewI);
                t tVar2 = aVar2.get(viewB);
                if (tVar != null && tVar2 != null) {
                    this.mStartValuesList.add(tVar);
                    this.mEndValuesList.add(tVar2);
                    aVar.remove(viewI);
                    aVar2.remove(viewB);
                }
            }
        }
    }

    private void matchNames(p1.a<View, t> aVar, p1.a<View, t> aVar2, p1.a<String, View> aVar3, p1.a<String, View> aVar4) {
        View view2;
        int i14 = aVar3.f134761c;
        for (int i15 = 0; i15 < i14; i15++) {
            View viewK = aVar3.k(i15);
            if (viewK != null && isValidTarget(viewK) && (view2 = aVar4.get(aVar3.g(i15))) != null && isValidTarget(view2)) {
                t tVar = aVar.get(viewK);
                t tVar2 = aVar2.get(view2);
                if (tVar != null && tVar2 != null) {
                    this.mStartValuesList.add(tVar);
                    this.mEndValuesList.add(tVar2);
                    aVar.remove(viewK);
                    aVar2.remove(view2);
                }
            }
        }
    }

    private void matchStartAndEnd(u uVar, u uVar2) {
        p1.a<View, t> aVar = new p1.a<>(uVar.f11166a);
        p1.a<View, t> aVar2 = new p1.a<>(uVar2.f11166a);
        int i14 = 0;
        while (true) {
            int[] iArr = this.mMatchOrder;
            if (i14 >= iArr.length) {
                addUnmatched(aVar, aVar2);
                return;
            }
            int i15 = iArr[i14];
            if (i15 == 1) {
                matchInstances(aVar, aVar2);
            } else if (i15 == 2) {
                matchNames(aVar, aVar2, uVar.f11169d, uVar2.f11169d);
            } else if (i15 == 3) {
                matchIds(aVar, aVar2, uVar.f11167b, uVar2.f11167b);
            } else if (i15 == 4) {
                matchItemIds(aVar, aVar2, uVar.f11168c, uVar2.f11168c);
            }
            i14++;
        }
    }

    private void notifyFromTransition(m mVar, i iVar, boolean z14) {
        m mVar2 = this.mCloneParent;
        if (mVar2 != null) {
            mVar2.notifyFromTransition(mVar, iVar, z14);
        }
        ArrayList<h> arrayList = this.mListeners;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.mListeners.size();
        h[] hVarArr = this.mListenersCache;
        if (hVarArr == null) {
            hVarArr = new h[size];
        }
        this.mListenersCache = null;
        h[] hVarArr2 = (h[]) this.mListeners.toArray(hVarArr);
        for (int i14 = 0; i14 < size; i14++) {
            iVar.a(hVarArr2[i14], mVar, z14);
            hVarArr2[i14] = null;
        }
        this.mListenersCache = hVarArr2;
    }

    private static int[] parseMatchOrder(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i14 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String strTrim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(strTrim)) {
                iArr[i14] = 3;
            } else if (MATCH_INSTANCE_STR.equalsIgnoreCase(strTrim)) {
                iArr[i14] = 1;
            } else if ("name".equalsIgnoreCase(strTrim)) {
                iArr[i14] = 2;
            } else if (MATCH_ITEM_ID_STR.equalsIgnoreCase(strTrim)) {
                iArr[i14] = 4;
            } else {
                if (!strTrim.isEmpty()) {
                    throw new InflateException(am.j.m("Unknown match type in matchOrder: '", strTrim, "'"));
                }
                int[] iArr2 = new int[iArr.length - 1];
                System.arraycopy(iArr, 0, iArr2, 0, i14);
                i14--;
                iArr = iArr2;
            }
            i14++;
        }
        return iArr;
    }

    private void runAnimator(Animator animator, p1.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            animate(animator);
        }
    }

    public m addListener(h hVar) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList<>();
        }
        this.mListeners.add(hVar);
        return this;
    }

    public m addTarget(String str) {
        if (this.mTargetNames == null) {
            this.mTargetNames = new ArrayList<>();
        }
        this.mTargetNames.add(str);
        return this;
    }

    public void animate(Animator animator) {
        if (animator == null) {
            end();
            return;
        }
        if (getDuration() >= 0) {
            animator.setDuration(getDuration());
        }
        if (getStartDelay() >= 0) {
            animator.setStartDelay(animator.getStartDelay() + getStartDelay());
        }
        if (getInterpolator() != null) {
            animator.setInterpolator(getInterpolator());
        }
        animator.addListener(new c());
        animator.start();
    }

    public void cancel() {
        int size = this.mCurrentAnimators.size();
        Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        for (int i14 = size - 1; i14 >= 0; i14--) {
            Animator animator = animatorArr[i14];
            animatorArr[i14] = null;
            animator.cancel();
        }
        this.mAnimatorCache = animatorArr;
        notifyListeners(i.J, false);
    }

    public abstract void captureEndValues(t tVar);

    public void capturePropagationValues(t tVar) {
        String[] strArrB;
        if (this.mPropagation == null || tVar.f11163a.isEmpty() || (strArrB = this.mPropagation.b()) == null) {
            return;
        }
        for (String str : strArrB) {
            if (!tVar.f11163a.containsKey(str)) {
                this.mPropagation.a();
                return;
            }
        }
    }

    public abstract void captureStartValues(t tVar);

    public void captureValues(ViewGroup viewGroup, boolean z14) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        p1.a<String, String> aVar;
        clearValues(z14);
        if ((this.mTargetIds.size() > 0 || this.mTargets.size() > 0) && (((arrayList = this.mTargetNames) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetTypes) == null || arrayList2.isEmpty()))) {
            for (int i14 = 0; i14 < this.mTargetIds.size(); i14++) {
                View viewFindViewById = viewGroup.findViewById(this.mTargetIds.get(i14).intValue());
                if (viewFindViewById != null) {
                    t tVar = new t(viewFindViewById);
                    if (z14) {
                        captureStartValues(tVar);
                    } else {
                        captureEndValues(tVar);
                    }
                    tVar.f11165c.add(this);
                    capturePropagationValues(tVar);
                    if (z14) {
                        addViewValues(this.mStartValues, viewFindViewById, tVar);
                    } else {
                        addViewValues(this.mEndValues, viewFindViewById, tVar);
                    }
                }
            }
            for (int i15 = 0; i15 < this.mTargets.size(); i15++) {
                View view2 = this.mTargets.get(i15);
                t tVar2 = new t(view2);
                if (z14) {
                    captureStartValues(tVar2);
                } else {
                    captureEndValues(tVar2);
                }
                tVar2.f11165c.add(this);
                capturePropagationValues(tVar2);
                if (z14) {
                    addViewValues(this.mStartValues, view2, tVar2);
                } else {
                    addViewValues(this.mEndValues, view2, tVar2);
                }
            }
        } else {
            captureHierarchy(viewGroup, z14);
        }
        if (z14 || (aVar = this.mNameOverrides) == null) {
            return;
        }
        int i16 = aVar.f134761c;
        ArrayList arrayList3 = new ArrayList(i16);
        for (int i17 = 0; i17 < i16; i17++) {
            arrayList3.add(this.mStartValues.f11169d.remove(this.mNameOverrides.g(i17)));
        }
        for (int i18 = 0; i18 < i16; i18++) {
            View view3 = (View) arrayList3.get(i18);
            if (view3 != null) {
                this.mStartValues.f11169d.put(this.mNameOverrides.k(i18), view3);
            }
        }
    }

    public void clearValues(boolean z14) {
        if (z14) {
            this.mStartValues.f11166a.clear();
            this.mStartValues.f11167b.clear();
            this.mStartValues.f11168c.a();
        } else {
            this.mEndValues.f11166a.clear();
            this.mEndValues.f11167b.clear();
            this.mEndValues.f11168c.a();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public m mo6clone() {
        try {
            m mVar = (m) super.clone();
            mVar.mAnimators = new ArrayList<>();
            mVar.mStartValues = new u();
            mVar.mEndValues = new u();
            mVar.mStartValuesList = null;
            mVar.mEndValuesList = null;
            mVar.mSeekController = null;
            mVar.mCloneParent = this;
            mVar.mListeners = null;
            return mVar;
        } catch (CloneNotSupportedException e4) {
            o2.c.p(e4);
            return null;
        }
    }

    public Animator createAnimator(ViewGroup viewGroup, t tVar, t tVar2) {
        return null;
    }

    public void createAnimators(ViewGroup viewGroup, u uVar, u uVar2, ArrayList<t> arrayList, ArrayList<t> arrayList2) {
        int i14;
        View view2;
        t tVar;
        Animator animator;
        View view3;
        Animator animator2;
        t tVar2;
        p1.a<Animator, d> runningAnimators = getRunningAnimators();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z14 = getRootTransition().mSeekController != null;
        long jMin = Long.MAX_VALUE;
        int i15 = 0;
        while (i15 < size) {
            t tVar3 = arrayList.get(i15);
            t tVar4 = arrayList2.get(i15);
            if (tVar3 != null && !tVar3.f11165c.contains(this)) {
                tVar3 = null;
            }
            if (tVar4 != null && !tVar4.f11165c.contains(this)) {
                tVar4 = null;
            }
            if ((tVar3 != null || tVar4 != null) && (tVar3 == null || tVar4 == null || isTransitionRequired(tVar3, tVar4))) {
                Animator animatorCreateAnimator = createAnimator(viewGroup, tVar3, tVar4);
                if (animatorCreateAnimator != null) {
                    if (tVar4 != null) {
                        View view4 = tVar4.f11164b;
                        String[] transitionProperties = getTransitionProperties();
                        if (transitionProperties != null && transitionProperties.length > 0) {
                            t tVar5 = new t(view4);
                            t tVar6 = uVar2.f11166a.get(view4);
                            i14 = size;
                            if (tVar6 != null) {
                                int i16 = 0;
                                while (i16 < transitionProperties.length) {
                                    String str = transitionProperties[i16];
                                    tVar5.f11163a.put(str, tVar6.f11163a.get(str));
                                    i16++;
                                    transitionProperties = transitionProperties;
                                    tVar6 = tVar6;
                                }
                            }
                            int i17 = runningAnimators.f134761c;
                            int i18 = 0;
                            while (true) {
                                if (i18 >= i17) {
                                    view3 = view4;
                                    tVar2 = tVar5;
                                    animator2 = animatorCreateAnimator;
                                    break;
                                }
                                d dVar = runningAnimators.get(runningAnimators.g(i18));
                                if (dVar.f11134c != null && dVar.f11132a == view4) {
                                    view3 = view4;
                                    if (dVar.f11133b.equals(getName()) && dVar.f11134c.equals(tVar5)) {
                                        tVar2 = tVar5;
                                        animator2 = null;
                                        break;
                                    }
                                } else {
                                    view3 = view4;
                                }
                                i18++;
                                view4 = view3;
                            }
                        } else {
                            view3 = view4;
                            i14 = size;
                            animator2 = animatorCreateAnimator;
                            tVar2 = null;
                        }
                        animator = animator2;
                        tVar = tVar2;
                        view2 = view3;
                    } else {
                        i14 = size;
                        view2 = tVar3.f11164b;
                        tVar = null;
                    }
                    if (animator != null) {
                        animator = animatorCreateAnimator;
                        q qVar = this.mPropagation;
                        if (qVar != null) {
                            long jC = qVar.c();
                            sparseIntArray.put(this.mAnimators.size(), (int) jC);
                            jMin = Math.min(jC, jMin);
                        }
                        long j8 = jMin;
                        d dVar2 = new d(view2, getName(), this, viewGroup.getWindowId(), tVar, animator);
                        Animator animator3 = animator;
                        if (z14) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(animator);
                            animator3 = animatorSet;
                        }
                        runningAnimators.put(animator3, dVar2);
                        this.mAnimators.add(animator3);
                        jMin = j8;
                    } else {
                        animator = animatorCreateAnimator;
                    }
                }
                i15++;
                size = i14;
            }
            i14 = size;
            i15++;
            size = i14;
        }
        if (sparseIntArray.size() != 0) {
            for (int i19 = 0; i19 < sparseIntArray.size(); i19++) {
                d dVar3 = runningAnimators.get(this.mAnimators.get(sparseIntArray.keyAt(i19)));
                dVar3.f11137f.setStartDelay(dVar3.f11137f.getStartDelay() + (((long) sparseIntArray.valueAt(i19)) - jMin));
            }
        }
    }

    public r createSeekController() {
        g gVar = new g();
        this.mSeekController = gVar;
        addListener(gVar);
        return this.mSeekController;
    }

    public void end() {
        int i14 = this.mNumInstances - 1;
        this.mNumInstances = i14;
        if (i14 == 0) {
            notifyListeners(i.H, false);
            for (int i15 = 0; i15 < this.mStartValues.f11168c.h(); i15++) {
                View viewI = this.mStartValues.f11168c.i(i15);
                if (viewI != null) {
                    viewI.setHasTransientState(false);
                }
            }
            for (int i16 = 0; i16 < this.mEndValues.f11168c.h(); i16++) {
                View viewI2 = this.mEndValues.f11168c.i(i16);
                if (viewI2 != null) {
                    viewI2.setHasTransientState(false);
                }
            }
            this.mEnded = true;
        }
    }

    public m excludeChildren(View view2, boolean z14) {
        this.mTargetChildExcludes = excludeView(this.mTargetChildExcludes, view2, z14);
        return this;
    }

    public m excludeTarget(View view2, boolean z14) {
        this.mTargetExcludes = excludeView(this.mTargetExcludes, view2, z14);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void forceToEnd(ViewGroup viewGroup) {
        p1.a<Animator, d> runningAnimators = getRunningAnimators();
        int i14 = runningAnimators.f134761c;
        if (viewGroup == null || i14 == 0) {
            return;
        }
        WindowId windowId = viewGroup.getWindowId();
        p1.a aVar = new p1.a(runningAnimators);
        runningAnimators.clear();
        for (int i15 = i14 - 1; i15 >= 0; i15--) {
            d dVar = (d) aVar.k(i15);
            if (dVar.f11132a != null && windowId.equals(dVar.f11135d)) {
                ((Animator) aVar.g(i15)).end();
            }
        }
    }

    public long getDuration() {
        return this.mDuration;
    }

    public Rect getEpicenter() {
        f fVar = this.mEpicenterCallback;
        if (fVar == null) {
            return null;
        }
        return fVar.a();
    }

    public f getEpicenterCallback() {
        return this.mEpicenterCallback;
    }

    public TimeInterpolator getInterpolator() {
        return this.mInterpolator;
    }

    public t getMatchedTransitionValues(View view2, boolean z14) {
        s sVar = this.mParent;
        if (sVar != null) {
            return sVar.getMatchedTransitionValues(view2, z14);
        }
        ArrayList<t> arrayList = z14 ? this.mStartValuesList : this.mEndValuesList;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size) {
                i14 = -1;
                break;
            }
            t tVar = arrayList.get(i14);
            if (tVar == null) {
                return null;
            }
            if (tVar.f11164b == view2) {
                break;
            }
            i14++;
        }
        if (i14 >= 0) {
            return (z14 ? this.mEndValuesList : this.mStartValuesList).get(i14);
        }
        return null;
    }

    public String getName() {
        return this.mName;
    }

    public androidx.transition.h getPathMotion() {
        return this.mPathMotion;
    }

    public q getPropagation() {
        return this.mPropagation;
    }

    public final m getRootTransition() {
        s sVar = this.mParent;
        return sVar != null ? sVar.getRootTransition() : this;
    }

    public long getStartDelay() {
        return this.mStartDelay;
    }

    public List<Integer> getTargetIds() {
        return this.mTargetIds;
    }

    public List<String> getTargetNames() {
        return this.mTargetNames;
    }

    public List<Class<?>> getTargetTypes() {
        return this.mTargetTypes;
    }

    public List<View> getTargets() {
        return this.mTargets;
    }

    public final long getTotalDurationMillis() {
        return this.mTotalDuration;
    }

    public String[] getTransitionProperties() {
        return null;
    }

    public t getTransitionValues(View view2, boolean z14) {
        s sVar = this.mParent;
        if (sVar != null) {
            return sVar.getTransitionValues(view2, z14);
        }
        return (z14 ? this.mStartValues : this.mEndValues).f11166a.get(view2);
    }

    public boolean hasAnimators() {
        return !this.mCurrentAnimators.isEmpty();
    }

    public boolean isSeekingSupported() {
        return false;
    }

    public boolean isTransitionRequired(t tVar, t tVar2) {
        if (tVar != null && tVar2 != null) {
            String[] transitionProperties = getTransitionProperties();
            if (transitionProperties != null) {
                for (String str : transitionProperties) {
                    if (isValueChanged(tVar, tVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = tVar.f11163a.keySet().iterator();
                while (it.hasNext()) {
                    if (isValueChanged(tVar, tVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean isValidTarget(View view2) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id3 = view2.getId();
        ArrayList<Integer> arrayList3 = this.mTargetIdExcludes;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id3))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.mTargetExcludes;
        if (arrayList4 != null && arrayList4.contains(view2)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.mTargetTypeExcludes;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i14 = 0; i14 < size; i14++) {
                if (this.mTargetTypeExcludes.get(i14).isInstance(view2)) {
                    return false;
                }
            }
        }
        if (this.mTargetNameExcludes != null) {
            WeakHashMap<View, g1> weakHashMap = s0.f6563a;
            if (view2.getTransitionName() != null && this.mTargetNameExcludes.contains(view2.getTransitionName())) {
                return false;
            }
        }
        if ((this.mTargetIds.size() == 0 && this.mTargets.size() == 0 && (((arrayList = this.mTargetTypes) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetNames) == null || arrayList2.isEmpty()))) || this.mTargetIds.contains(Integer.valueOf(id3)) || this.mTargets.contains(view2)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.mTargetNames;
        if (arrayList6 != null) {
            WeakHashMap<View, g1> weakHashMap2 = s0.f6563a;
            if (arrayList6.contains(view2.getTransitionName())) {
                return true;
            }
        }
        if (this.mTargetTypes != null) {
            for (int i15 = 0; i15 < this.mTargetTypes.size(); i15++) {
                if (this.mTargetTypes.get(i15).isInstance(view2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void notifyListeners(i iVar, boolean z14) {
        notifyFromTransition(this, iVar, z14);
    }

    public void pause(View view2) {
        if (this.mEnded) {
            return;
        }
        int size = this.mCurrentAnimators.size();
        Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        for (int i14 = size - 1; i14 >= 0; i14--) {
            Animator animator = animatorArr[i14];
            animatorArr[i14] = null;
            animator.pause();
        }
        this.mAnimatorCache = animatorArr;
        notifyListeners(i.K, false);
        this.mPaused = true;
    }

    public void playTransition(ViewGroup viewGroup) {
        d dVar;
        this.mStartValuesList = new ArrayList<>();
        this.mEndValuesList = new ArrayList<>();
        matchStartAndEnd(this.mStartValues, this.mEndValues);
        p1.a<Animator, d> runningAnimators = getRunningAnimators();
        int i14 = runningAnimators.f134761c;
        WindowId windowId = viewGroup.getWindowId();
        ArrayList arrayList = new ArrayList();
        for (int i15 = i14 - 1; i15 >= 0; i15--) {
            Animator animatorG = runningAnimators.g(i15);
            if (animatorG != null && (dVar = runningAnimators.get(animatorG)) != null) {
                m mVar = dVar.f11136e;
                View view2 = dVar.f11132a;
                if (view2 != null && windowId.equals(dVar.f11135d)) {
                    t tVar = dVar.f11134c;
                    t transitionValues = getTransitionValues(view2, true);
                    t matchedTransitionValues = getMatchedTransitionValues(view2, true);
                    if (transitionValues == null && matchedTransitionValues == null) {
                        matchedTransitionValues = this.mEndValues.f11166a.get(view2);
                    }
                    if ((transitionValues != null || matchedTransitionValues != null) && mVar.isTransitionRequired(tVar, matchedTransitionValues)) {
                        if (mVar.getRootTransition().mSeekController != null) {
                            animatorG.cancel();
                            mVar.mCurrentAnimators.remove(animatorG);
                            runningAnimators.i(i15);
                            if (mVar.mCurrentAnimators.size() == 0) {
                                arrayList.add(mVar);
                            }
                        } else if (animatorG.isRunning() || animatorG.isStarted()) {
                            animatorG.cancel();
                        } else {
                            runningAnimators.i(i15);
                        }
                    }
                }
            }
        }
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            m mVar2 = (m) arrayList.get(i16);
            mVar2.notifyListeners(i.J, false);
            if (!mVar2.mEnded) {
                mVar2.mEnded = true;
                mVar2.notifyListeners(i.H, false);
            }
        }
        createAnimators(viewGroup, this.mStartValues, this.mEndValues, this.mStartValuesList, this.mEndValuesList);
        if (this.mSeekController == null) {
            runAnimators();
            return;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            prepareAnimatorsForSeeking();
            g gVar = this.mSeekController;
            m mVar3 = m.this;
            long j8 = mVar3.getTotalDurationMillis() == 0 ? 1L : 0L;
            mVar3.setCurrentPlayTimeMillis(j8, gVar.f11138a);
            gVar.f11138a = j8;
            g gVar2 = this.mSeekController;
            gVar2.f11139b = true;
            int i17 = gVar2.f11141d;
            if (i17 == 1) {
                gVar2.f11141d = 0;
                gVar2.c();
            } else if (i17 == 2) {
                gVar2.f11141d = 0;
                gVar2.e(gVar2.f11144g);
            }
        }
    }

    public void prepareAnimatorsForSeeking() {
        p1.a<Animator, d> runningAnimators = getRunningAnimators();
        this.mTotalDuration = 0L;
        int i14 = 0;
        while (true) {
            int size = this.mAnimators.size();
            ArrayList<Animator> arrayList = this.mAnimators;
            if (i14 >= size) {
                arrayList.clear();
                return;
            }
            Animator animator = arrayList.get(i14);
            d dVar = runningAnimators.get(animator);
            if (animator != null && dVar != null) {
                Animator animator2 = dVar.f11137f;
                if (getDuration() >= 0) {
                    animator2.setDuration(getDuration());
                }
                if (getStartDelay() >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + getStartDelay());
                }
                if (getInterpolator() != null) {
                    animator2.setInterpolator(getInterpolator());
                }
                this.mCurrentAnimators.add(animator);
                this.mTotalDuration = Math.max(this.mTotalDuration, animator.getTotalDuration());
            }
            i14++;
        }
    }

    public m removeListener(h hVar) {
        m mVar;
        ArrayList<h> arrayList = this.mListeners;
        if (arrayList != null) {
            if (!arrayList.remove(hVar) && (mVar = this.mCloneParent) != null) {
                mVar.removeListener(hVar);
            }
            if (this.mListeners.size() == 0) {
                this.mListeners = null;
            }
        }
        return this;
    }

    public m removeTarget(int i14) {
        if (i14 != 0) {
            this.mTargetIds.remove(Integer.valueOf(i14));
        }
        return this;
    }

    public void resume(View view2) {
        if (this.mPaused) {
            if (!this.mEnded) {
                int size = this.mCurrentAnimators.size();
                Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
                this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
                for (int i14 = size - 1; i14 >= 0; i14--) {
                    Animator animator = animatorArr[i14];
                    animatorArr[i14] = null;
                    animator.resume();
                }
                this.mAnimatorCache = animatorArr;
                notifyListeners(i.L, false);
            }
            this.mPaused = false;
        }
    }

    public void runAnimators() {
        start();
        p1.a<Animator, d> runningAnimators = getRunningAnimators();
        for (Animator animator : this.mAnimators) {
            if (runningAnimators.containsKey(animator)) {
                start();
                runAnimator(animator, runningAnimators);
            }
        }
        this.mAnimators.clear();
        end();
    }

    public void setCanRemoveViews(boolean z14) {
        this.mCanRemoveViews = z14;
    }

    public void setCurrentPlayTimeMillis(long j8, long j14) {
        long totalDurationMillis = getTotalDurationMillis();
        int i14 = 0;
        boolean z14 = j8 < j14;
        if ((j14 < 0 && j8 >= 0) || (j14 > totalDurationMillis && j8 <= totalDurationMillis)) {
            this.mEnded = false;
            notifyListeners(i.G, z14);
        }
        int size = this.mCurrentAnimators.size();
        Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        while (i14 < size) {
            Animator animator = animatorArr[i14];
            animatorArr[i14] = null;
            ((AnimatorSet) animator).setCurrentPlayTime(Math.min(Math.max(0L, j8), animator.getTotalDuration()));
            i14++;
            totalDurationMillis = totalDurationMillis;
        }
        long j15 = totalDurationMillis;
        this.mAnimatorCache = animatorArr;
        if ((j8 <= j15 || j14 > j15) && (j8 >= 0 || j14 < 0)) {
            return;
        }
        if (j8 > j15) {
            this.mEnded = true;
        }
        notifyListeners(i.H, z14);
    }

    public m setDuration(long j8) {
        this.mDuration = j8;
        return this;
    }

    public void setEpicenterCallback(f fVar) {
        this.mEpicenterCallback = fVar;
    }

    public m setInterpolator(TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
        return this;
    }

    public void setMatchOrder(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.mMatchOrder = DEFAULT_MATCH_ORDER;
            return;
        }
        for (int i14 = 0; i14 < iArr.length; i14++) {
            if (!isValidMatch(iArr[i14])) {
                vb.h.s("matches contains invalid value");
                return;
            } else {
                if (alreadyContains(iArr, i14)) {
                    vb.h.s("matches contains a duplicate value");
                    return;
                }
            }
        }
        this.mMatchOrder = (int[]) iArr.clone();
    }

    public void setPathMotion(androidx.transition.h hVar) {
        if (hVar == null) {
            this.mPathMotion = STRAIGHT_PATH_MOTION;
        } else {
            this.mPathMotion = hVar;
        }
    }

    public void setPropagation(q qVar) {
        this.mPropagation = qVar;
    }

    public m setStartDelay(long j8) {
        this.mStartDelay = j8;
        return this;
    }

    public void start() {
        if (this.mNumInstances == 0) {
            notifyListeners(i.G, false);
            this.mEnded = false;
        }
        this.mNumInstances++;
    }

    public String toString(String str) {
        StringBuilder sb3 = new StringBuilder(str);
        sb3.append(getClass().getSimpleName());
        sb3.append("@");
        sb3.append(Integer.toHexString(hashCode()));
        sb3.append(": ");
        if (this.mDuration != -1) {
            sb3.append("dur(");
            sb3.append(this.mDuration);
            sb3.append(") ");
        }
        if (this.mStartDelay != -1) {
            sb3.append("dly(");
            sb3.append(this.mStartDelay);
            sb3.append(") ");
        }
        if (this.mInterpolator != null) {
            sb3.append("interp(");
            sb3.append(this.mInterpolator);
            sb3.append(") ");
        }
        if (this.mTargetIds.size() > 0 || this.mTargets.size() > 0) {
            sb3.append("tgts(");
            if (this.mTargetIds.size() > 0) {
                for (int i14 = 0; i14 < this.mTargetIds.size(); i14++) {
                    if (i14 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(this.mTargetIds.get(i14));
                }
            }
            if (this.mTargets.size() > 0) {
                for (int i15 = 0; i15 < this.mTargets.size(); i15++) {
                    if (i15 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(this.mTargets.get(i15));
                }
            }
            sb3.append(")");
        }
        return sb3.toString();
    }

    public m excludeChildren(int i14, boolean z14) {
        this.mTargetIdChildExcludes = excludeId(this.mTargetIdChildExcludes, i14, z14);
        return this;
    }

    public m excludeTarget(int i14, boolean z14) {
        this.mTargetIdExcludes = excludeId(this.mTargetIdExcludes, i14, z14);
        return this;
    }

    public m excludeChildren(Class<?> cls, boolean z14) {
        this.mTargetTypeChildExcludes = excludeType(this.mTargetTypeChildExcludes, cls, z14);
        return this;
    }

    public m excludeTarget(String str, boolean z14) {
        this.mTargetNameExcludes = excludeObject(this.mTargetNameExcludes, str, z14);
        return this;
    }

    public m excludeTarget(Class<?> cls, boolean z14) {
        this.mTargetTypeExcludes = excludeType(this.mTargetTypeExcludes, cls, z14);
        return this;
    }

    public m removeTarget(View view2) {
        this.mTargets.remove(view2);
        return this;
    }

    public m removeTarget(String str) {
        ArrayList<String> arrayList = this.mTargetNames;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    public m removeTarget(Class<?> cls) {
        ArrayList<Class<?>> arrayList = this.mTargetTypes;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    public m addTarget(int i14) {
        if (i14 != 0) {
            this.mTargetIds.add(Integer.valueOf(i14));
        }
        return this;
    }

    public m addTarget(View view2) {
        this.mTargets.add(view2);
        return this;
    }

    public m addTarget(Class<?> cls) {
        if (this.mTargetTypes == null) {
            this.mTargetTypes = new ArrayList<>();
        }
        this.mTargetTypes.add(cls);
        return this;
    }

    public String toString() {
        return toString("");
    }

    public m() {
    }
}
