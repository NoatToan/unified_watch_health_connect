package com.airbnb.lottie;

import androidx.collection.ArraySet;
import androidx.core.util.Pair;
import defpackage.ja;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public class PerformanceTracker {
    private boolean e = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<FrameListener> f1920b = new ArraySet();
    private final Map<String, ja> d = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Comparator<Pair<String, Float>> f1921c = new Comparator<Pair<String, Float>>() { // from class: com.airbnb.lottie.PerformanceTracker.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float fFloatValue = pair.second.floatValue();
            float fFloatValue2 = pair2.second.floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    };

    public interface FrameListener {
        void onFrameRendered(float f);
    }

    public void e(boolean z) {
        this.e = z;
    }

    public void c(String str, float f) {
        if (this.e) {
            ja jaVar = this.d.get(str);
            if (jaVar == null) {
                jaVar = new ja();
                this.d.put(str, jaVar);
            }
            jaVar.b(f);
            if (str.equals("__container")) {
                Iterator<FrameListener> it = this.f1920b.iterator();
                while (it.hasNext()) {
                    it.next().onFrameRendered(f);
                }
            }
        }
    }
}
