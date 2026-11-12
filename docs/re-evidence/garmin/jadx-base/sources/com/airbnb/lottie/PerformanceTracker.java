package com.airbnb.lottie;

import com.airbnb.lottie.utils.MeanCalculator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class PerformanceTracker {
    private boolean enabled = false;
    private final Set<FrameListener> frameListeners = new p1.b();
    private final Map<String, MeanCalculator> layerRenderTimes = new HashMap();
    private final Comparator<k7.d<String, Float>> floatComparator = new Comparator<k7.d<String, Float>>() { // from class: com.airbnb.lottie.PerformanceTracker.1
        @Override // java.util.Comparator
        public int compare(k7.d<String, Float> dVar, k7.d<String, Float> dVar2) {
            float fFloatValue = dVar.f103263b.floatValue();
            float fFloatValue2 = dVar2.f103263b.floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    };

    public interface FrameListener {
        void onFrameRendered(float f14);
    }

    public void addFrameListener(FrameListener frameListener) {
        this.frameListeners.add(frameListener);
    }

    public void clearRenderTimes() {
        this.layerRenderTimes.clear();
    }

    public List<k7.d<String, Float>> getSortedRenderTimes() {
        if (!this.enabled) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(this.layerRenderTimes.size());
        for (Map.Entry<String, MeanCalculator> entry : this.layerRenderTimes.entrySet()) {
            arrayList.add(new k7.d(entry.getKey(), Float.valueOf(entry.getValue().getMean())));
        }
        Collections.sort(arrayList, this.floatComparator);
        return arrayList;
    }

    public void logRenderTimes() {
        if (this.enabled) {
            List<k7.d<String, Float>> sortedRenderTimes = getSortedRenderTimes();
            for (int i14 = 0; i14 < sortedRenderTimes.size(); i14++) {
                k7.d<String, Float> dVar = sortedRenderTimes.get(i14);
                String.format("\t\t%30s:%.2f", dVar.f103262a, dVar.f103263b);
            }
        }
    }

    public void recordRenderTime(String str, float f14) {
        if (this.enabled) {
            MeanCalculator meanCalculator = this.layerRenderTimes.get(str);
            if (meanCalculator == null) {
                meanCalculator = new MeanCalculator();
                this.layerRenderTimes.put(str, meanCalculator);
            }
            meanCalculator.add(f14);
            if (str.equals("__container")) {
                Iterator<FrameListener> it = this.frameListeners.iterator();
                while (it.hasNext()) {
                    it.next().onFrameRendered(f14);
                }
            }
        }
    }

    public void removeFrameListener(FrameListener frameListener) {
        this.frameListeners.remove(frameListener);
    }

    public void setEnabled(boolean z14) {
        this.enabled = z14;
    }
}
