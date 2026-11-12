package androidx.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public class s extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<m> f11154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m[] f11159f;

    public class a extends o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f11160a;

        public a(s sVar, m mVar) {
            this.f11160a = mVar;
        }

        @Override // androidx.transition.o, androidx.transition.m.h
        public final void onTransitionEnd(m mVar) {
            this.f11160a.runAnimators();
            mVar.removeListener(this);
        }
    }

    public class b extends o {
        public b() {
        }

        @Override // androidx.transition.o, androidx.transition.m.h
        public final void onTransitionCancel(m mVar) {
            s sVar = s.this;
            sVar.f11154a.remove(mVar);
            if (sVar.hasAnimators()) {
                return;
            }
            sVar.notifyListeners(m.i.J, false);
            sVar.mEnded = true;
            sVar.notifyListeners(m.i.H, false);
        }
    }

    public static class c extends o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s f11162a;

        public c(s sVar) {
            this.f11162a = sVar;
        }

        @Override // androidx.transition.o, androidx.transition.m.h
        public final void onTransitionEnd(m mVar) {
            s sVar = this.f11162a;
            int i14 = sVar.f11156c - 1;
            sVar.f11156c = i14;
            if (i14 == 0) {
                sVar.f11157d = false;
                sVar.end();
            }
            mVar.removeListener(this);
        }

        @Override // androidx.transition.o, androidx.transition.m.h
        public final void onTransitionStart(m mVar) {
            s sVar = this.f11162a;
            if (sVar.f11157d) {
                return;
            }
            sVar.start();
            sVar.f11157d = true;
        }
    }

    public s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11154a = new ArrayList<>();
        this.f11155b = true;
        this.f11157d = false;
        this.f11158e = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f11126e);
        f(b7.j.d(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(m mVar) {
        this.f11154a.add(mVar);
        mVar.mParent = this;
        long j8 = this.mDuration;
        if (j8 >= 0) {
            mVar.setDuration(j8);
        }
        if ((this.f11158e & 1) != 0) {
            mVar.setInterpolator(getInterpolator());
        }
        if ((this.f11158e & 2) != 0) {
            mVar.setPropagation(getPropagation());
        }
        if ((this.f11158e & 4) != 0) {
            mVar.setPathMotion(getPathMotion());
        }
        if ((this.f11158e & 8) != 0) {
            mVar.setEpicenterCallback(getEpicenterCallback());
        }
    }

    @Override // androidx.transition.m
    public final m addListener(m.h hVar) {
        return (s) super.addListener(hVar);
    }

    @Override // androidx.transition.m
    public final m addTarget(View view2) {
        for (int i14 = 0; i14 < this.f11154a.size(); i14++) {
            this.f11154a.get(i14).addTarget(view2);
        }
        return (s) super.addTarget(view2);
    }

    public final m b(int i14) {
        if (i14 < 0 || i14 >= this.f11154a.size()) {
            return null;
        }
        return this.f11154a.get(i14);
    }

    public final void c(m mVar) {
        this.f11154a.remove(mVar);
        mVar.mParent = null;
    }

    @Override // androidx.transition.m
    public final void cancel() {
        super.cancel();
        m[] mVarArrG = g();
        int size = this.f11154a.size();
        for (int i14 = 0; i14 < size; i14++) {
            mVarArrG[i14].cancel();
        }
        Arrays.fill(mVarArrG, (Object) null);
        this.f11159f = mVarArrG;
    }

    @Override // androidx.transition.m
    public final void captureEndValues(t tVar) {
        if (isValidTarget(tVar.f11164b)) {
            for (m mVar : this.f11154a) {
                if (mVar.isValidTarget(tVar.f11164b)) {
                    mVar.captureEndValues(tVar);
                    tVar.f11165c.add(mVar);
                }
            }
        }
    }

    @Override // androidx.transition.m
    public final void capturePropagationValues(t tVar) {
        super.capturePropagationValues(tVar);
        int size = this.f11154a.size();
        for (int i14 = 0; i14 < size; i14++) {
            this.f11154a.get(i14).capturePropagationValues(tVar);
        }
    }

    @Override // androidx.transition.m
    public final void captureStartValues(t tVar) {
        if (isValidTarget(tVar.f11164b)) {
            for (m mVar : this.f11154a) {
                if (mVar.isValidTarget(tVar.f11164b)) {
                    mVar.captureStartValues(tVar);
                    tVar.f11165c.add(mVar);
                }
            }
        }
    }

    @Override // androidx.transition.m
    /* JADX INFO: renamed from: clone */
    public final m mo6clone() {
        s sVar = (s) super.mo6clone();
        sVar.f11154a = new ArrayList<>();
        int size = this.f11154a.size();
        for (int i14 = 0; i14 < size; i14++) {
            m mVarMo6clone = this.f11154a.get(i14).mo6clone();
            sVar.f11154a.add(mVarMo6clone);
            mVarMo6clone.mParent = sVar;
        }
        return sVar;
    }

    @Override // androidx.transition.m
    public final void createAnimators(ViewGroup viewGroup, u uVar, u uVar2, ArrayList<t> arrayList, ArrayList<t> arrayList2) {
        long startDelay = getStartDelay();
        int size = this.f11154a.size();
        for (int i14 = 0; i14 < size; i14++) {
            m mVar = this.f11154a.get(i14);
            if (startDelay > 0 && (this.f11155b || i14 == 0)) {
                long startDelay2 = mVar.getStartDelay();
                if (startDelay2 > 0) {
                    mVar.setStartDelay(startDelay2 + startDelay);
                } else {
                    mVar.setStartDelay(startDelay);
                }
            }
            mVar.createAnimators(viewGroup, uVar, uVar2, arrayList, arrayList2);
        }
    }

    public final void d(long j8) {
        ArrayList<m> arrayList;
        super.setDuration(j8);
        if (this.mDuration < 0 || (arrayList = this.f11154a) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            this.f11154a.get(i14).setDuration(j8);
        }
    }

    @Override // androidx.transition.m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final s setInterpolator(TimeInterpolator timeInterpolator) {
        this.f11158e |= 1;
        ArrayList<m> arrayList = this.f11154a;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                this.f11154a.get(i14).setInterpolator(timeInterpolator);
            }
        }
        return (s) super.setInterpolator(timeInterpolator);
    }

    @Override // androidx.transition.m
    public final m excludeTarget(View view2, boolean z14) {
        for (int i14 = 0; i14 < this.f11154a.size(); i14++) {
            this.f11154a.get(i14).excludeTarget(view2, z14);
        }
        return super.excludeTarget(view2, z14);
    }

    public final void f(int i14) {
        if (i14 == 0) {
            this.f11155b = true;
        } else {
            if (i14 != 1) {
                throw new AndroidRuntimeException(am.j.h(i14, "Invalid parameter for TransitionSet ordering: "));
            }
            this.f11155b = false;
        }
    }

    @Override // androidx.transition.m
    public final void forceToEnd(ViewGroup viewGroup) {
        super.forceToEnd(viewGroup);
        m[] mVarArrG = g();
        int size = this.f11154a.size();
        for (int i14 = 0; i14 < size; i14++) {
            mVarArrG[i14].forceToEnd(viewGroup);
        }
        Arrays.fill(mVarArrG, (Object) null);
        this.f11159f = mVarArrG;
    }

    public final m[] g() {
        m[] mVarArr = this.f11159f;
        this.f11159f = null;
        if (mVarArr == null) {
            mVarArr = new m[this.f11154a.size()];
        }
        return (m[]) this.f11154a.toArray(mVarArr);
    }

    @Override // androidx.transition.m
    public final boolean hasAnimators() {
        for (int i14 = 0; i14 < this.f11154a.size(); i14++) {
            if (this.f11154a.get(i14).hasAnimators()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.transition.m
    public final boolean isSeekingSupported() {
        int size = this.f11154a.size();
        for (int i14 = 0; i14 < size; i14++) {
            if (!this.f11154a.get(i14).isSeekingSupported()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.transition.m
    public final void pause(View view2) {
        super.pause(view2);
        int size = this.f11154a.size();
        for (int i14 = 0; i14 < size; i14++) {
            this.f11154a.get(i14).pause(view2);
        }
    }

    @Override // androidx.transition.m
    public final void prepareAnimatorsForSeeking() {
        this.mTotalDuration = 0L;
        b bVar = new b();
        for (int i14 = 0; i14 < this.f11154a.size(); i14++) {
            m mVar = this.f11154a.get(i14);
            mVar.addListener(bVar);
            mVar.prepareAnimatorsForSeeking();
            long totalDurationMillis = mVar.getTotalDurationMillis();
            boolean z14 = this.f11155b;
            long j8 = this.mTotalDuration;
            if (z14) {
                this.mTotalDuration = Math.max(j8, totalDurationMillis);
            } else {
                mVar.mSeekOffsetInParent = j8;
                this.mTotalDuration = j8 + totalDurationMillis;
            }
        }
    }

    @Override // androidx.transition.m
    public final m removeListener(m.h hVar) {
        return (s) super.removeListener(hVar);
    }

    @Override // androidx.transition.m
    public final m removeTarget(int i14) {
        for (int i15 = 0; i15 < this.f11154a.size(); i15++) {
            this.f11154a.get(i15).removeTarget(i14);
        }
        return (s) super.removeTarget(i14);
    }

    @Override // androidx.transition.m
    public final void resume(View view2) {
        super.resume(view2);
        m[] mVarArrG = g();
        int size = this.f11154a.size();
        for (int i14 = 0; i14 < size; i14++) {
            mVarArrG[i14].resume(view2);
        }
        Arrays.fill(mVarArrG, (Object) null);
        this.f11159f = mVarArrG;
    }

    @Override // androidx.transition.m
    public final void runAnimators() {
        ArrayList<m> arrayList;
        if (this.f11154a.isEmpty()) {
            start();
            end();
            return;
        }
        c cVar = new c(this);
        Iterator<m> it = this.f11154a.iterator();
        while (it.hasNext()) {
            it.next().addListener(cVar);
        }
        this.f11156c = this.f11154a.size();
        if (this.f11155b) {
            Iterator<m> it3 = this.f11154a.iterator();
            while (it3.hasNext()) {
                it3.next().runAnimators();
            }
            return;
        }
        int i14 = 1;
        while (true) {
            int size = this.f11154a.size();
            arrayList = this.f11154a;
            if (i14 >= size) {
                break;
            }
            arrayList.get(i14 - 1).addListener(new a(this, this.f11154a.get(i14)));
            i14++;
        }
        m mVar = arrayList.get(0);
        if (mVar != null) {
            mVar.runAnimators();
        }
    }

    @Override // androidx.transition.m
    public final void setCanRemoveViews(boolean z14) {
        super.setCanRemoveViews(z14);
        int size = this.f11154a.size();
        for (int i14 = 0; i14 < size; i14++) {
            this.f11154a.get(i14).setCanRemoveViews(z14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // androidx.transition.m
    public final void setCurrentPlayTimeMillis(long j8, long j14) {
        long j15;
        long totalDurationMillis = getTotalDurationMillis();
        long j16 = 0;
        if (this.mParent != null) {
            if (j8 < 0 && j14 < 0) {
                return;
            }
            if (j8 > totalDurationMillis && j14 > totalDurationMillis) {
                return;
            }
        }
        boolean z14 = j8 < j14;
        if ((j8 >= 0 && j14 < 0) || (j8 <= totalDurationMillis && j14 > totalDurationMillis)) {
            this.mEnded = false;
            notifyListeners(m.i.G, z14);
        }
        if (!this.f11155b) {
            int size = 1;
            while (true) {
                int size2 = this.f11154a.size();
                ArrayList<m> arrayList = this.f11154a;
                if (size >= size2) {
                    size = arrayList.size();
                    break;
                } else if (arrayList.get(size).mSeekOffsetInParent > j14) {
                    break;
                } else {
                    size++;
                }
            }
            int i14 = size - 1;
            if (j8 >= j14) {
                while (true) {
                    if (i14 < this.f11154a.size()) {
                        m mVar = this.f11154a.get(i14);
                        long j17 = mVar.mSeekOffsetInParent;
                        j15 = j16;
                        long j18 = j8 - j17;
                        if (j18 < j15) {
                            break;
                        }
                        mVar.setCurrentPlayTimeMillis(j18, j14 - j17);
                        i14++;
                        j16 = j15;
                    }
                }
            } else {
                j15 = 0;
                while (i14 >= 0) {
                    m mVar2 = this.f11154a.get(i14);
                    long j19 = mVar2.mSeekOffsetInParent;
                    long j24 = j8 - j19;
                    mVar2.setCurrentPlayTimeMillis(j24, j14 - j19);
                    if (j24 >= 0) {
                        break;
                    } else {
                        i14--;
                    }
                }
            }
            if (this.mParent != null) {
                if ((j8 > totalDurationMillis || j14 > totalDurationMillis) && (j8 >= 0 || j14 < j15)) {
                    return;
                }
                if (j8 > totalDurationMillis) {
                    this.mEnded = true;
                }
                notifyListeners(m.i.H, z14);
            }
        }
        for (int i15 = 0; i15 < this.f11154a.size(); i15++) {
            this.f11154a.get(i15).setCurrentPlayTimeMillis(j8, j14);
        }
        j15 = j16;
        if (this.mParent != null) {
            if (j8 > totalDurationMillis) {
                return;
            } else {
                return;
            }
            if (j8 > totalDurationMillis) {
                this.mEnded = true;
            }
            notifyListeners(m.i.H, z14);
        }
    }

    @Override // androidx.transition.m
    public final /* bridge */ /* synthetic */ m setDuration(long j8) {
        d(j8);
        return this;
    }

    @Override // androidx.transition.m
    public final void setEpicenterCallback(m.f fVar) {
        super.setEpicenterCallback(fVar);
        this.f11158e |= 8;
        int size = this.f11154a.size();
        for (int i14 = 0; i14 < size; i14++) {
            this.f11154a.get(i14).setEpicenterCallback(fVar);
        }
    }

    @Override // androidx.transition.m
    public final void setPathMotion(h hVar) {
        super.setPathMotion(hVar);
        this.f11158e |= 4;
        if (this.f11154a != null) {
            for (int i14 = 0; i14 < this.f11154a.size(); i14++) {
                this.f11154a.get(i14).setPathMotion(hVar);
            }
        }
    }

    @Override // androidx.transition.m
    public final void setPropagation(q qVar) {
        super.setPropagation(qVar);
        this.f11158e |= 2;
        int size = this.f11154a.size();
        for (int i14 = 0; i14 < size; i14++) {
            this.f11154a.get(i14).setPropagation(qVar);
        }
    }

    @Override // androidx.transition.m
    public final m setStartDelay(long j8) {
        return (s) super.setStartDelay(j8);
    }

    @Override // androidx.transition.m
    public final String toString(String str) {
        String string = super.toString(str);
        for (int i14 = 0; i14 < this.f11154a.size(); i14++) {
            StringBuilder sbI = sn.a.i(string, "\n");
            sbI.append(this.f11154a.get(i14).toString(str + "  "));
            string = sbI.toString();
        }
        return string;
    }

    @Override // androidx.transition.m
    public final m excludeTarget(String str, boolean z14) {
        for (int i14 = 0; i14 < this.f11154a.size(); i14++) {
            this.f11154a.get(i14).excludeTarget(str, z14);
        }
        return super.excludeTarget(str, z14);
    }

    @Override // androidx.transition.m
    public final m addTarget(int i14) {
        for (int i15 = 0; i15 < this.f11154a.size(); i15++) {
            this.f11154a.get(i15).addTarget(i14);
        }
        return (s) super.addTarget(i14);
    }

    @Override // androidx.transition.m
    public final m removeTarget(View view2) {
        for (int i14 = 0; i14 < this.f11154a.size(); i14++) {
            this.f11154a.get(i14).removeTarget(view2);
        }
        return (s) super.removeTarget(view2);
    }

    @Override // androidx.transition.m
    public final m excludeTarget(int i14, boolean z14) {
        for (int i15 = 0; i15 < this.f11154a.size(); i15++) {
            this.f11154a.get(i15).excludeTarget(i14, z14);
        }
        return super.excludeTarget(i14, z14);
    }

    @Override // androidx.transition.m
    public final m addTarget(String str) {
        for (int i14 = 0; i14 < this.f11154a.size(); i14++) {
            this.f11154a.get(i14).addTarget(str);
        }
        return (s) super.addTarget(str);
    }

    @Override // androidx.transition.m
    public final m removeTarget(Class cls) {
        for (int i14 = 0; i14 < this.f11154a.size(); i14++) {
            this.f11154a.get(i14).removeTarget((Class<?>) cls);
        }
        return (s) super.removeTarget((Class<?>) cls);
    }

    @Override // androidx.transition.m
    public final m excludeTarget(Class<?> cls, boolean z14) {
        for (int i14 = 0; i14 < this.f11154a.size(); i14++) {
            this.f11154a.get(i14).excludeTarget(cls, z14);
        }
        return super.excludeTarget(cls, z14);
    }

    @Override // androidx.transition.m
    public final m addTarget(Class cls) {
        for (int i14 = 0; i14 < this.f11154a.size(); i14++) {
            this.f11154a.get(i14).addTarget((Class<?>) cls);
        }
        return (s) super.addTarget((Class<?>) cls);
    }

    @Override // androidx.transition.m
    public final m removeTarget(String str) {
        for (int i14 = 0; i14 < this.f11154a.size(); i14++) {
            this.f11154a.get(i14).removeTarget(str);
        }
        return (s) super.removeTarget(str);
    }

    public s() {
        this.f11154a = new ArrayList<>();
        this.f11155b = true;
        this.f11157d = false;
        this.f11158e = 0;
    }
}
