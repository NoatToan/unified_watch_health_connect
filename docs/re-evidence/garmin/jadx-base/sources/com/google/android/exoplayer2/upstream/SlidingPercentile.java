package com.google.android.exoplayer2.upstream;

import am.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes14.dex */
public class SlidingPercentile {
    private static final Comparator<Sample> INDEX_COMPARATOR;
    private static final int MAX_RECYCLED_SAMPLES = 5;
    private static final int SORT_ORDER_BY_INDEX = 1;
    private static final int SORT_ORDER_BY_VALUE = 0;
    private static final int SORT_ORDER_NONE = -1;
    private static final Comparator<Sample> VALUE_COMPARATOR;
    private final int maxWeight;
    private int nextSampleIndex;
    private int recycledSampleCount;
    private int totalWeight;
    private final Sample[] recycledSamples = new Sample[5];
    private final ArrayList<Sample> samples = new ArrayList<>();
    private int currentSortOrder = -1;

    public static class Sample {
        public int index;
        public float value;
        public int weight;

        private Sample() {
        }
    }

    static {
        final int i14 = 0;
        INDEX_COMPARATOR = new Comparator() { // from class: com.google.android.exoplayer2.upstream.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                SlidingPercentile.Sample sample = (SlidingPercentile.Sample) obj;
                SlidingPercentile.Sample sample2 = (SlidingPercentile.Sample) obj2;
                switch (i14) {
                    case 0:
                        return SlidingPercentile.lambda$static$0(sample, sample2);
                    default:
                        return SlidingPercentile.lambda$static$1(sample, sample2);
                }
            }
        };
        final int i15 = 1;
        VALUE_COMPARATOR = new Comparator() { // from class: com.google.android.exoplayer2.upstream.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                SlidingPercentile.Sample sample = (SlidingPercentile.Sample) obj;
                SlidingPercentile.Sample sample2 = (SlidingPercentile.Sample) obj2;
                switch (i15) {
                    case 0:
                        return SlidingPercentile.lambda$static$0(sample, sample2);
                    default:
                        return SlidingPercentile.lambda$static$1(sample, sample2);
                }
            }
        };
    }

    public SlidingPercentile(int i14) {
        this.maxWeight = i14;
    }

    private void ensureSortedByIndex() {
        if (this.currentSortOrder != 1) {
            Collections.sort(this.samples, INDEX_COMPARATOR);
            this.currentSortOrder = 1;
        }
    }

    private void ensureSortedByValue() {
        if (this.currentSortOrder != 0) {
            Collections.sort(this.samples, VALUE_COMPARATOR);
            this.currentSortOrder = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(Sample sample, Sample sample2) {
        return sample.index - sample2.index;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$1(Sample sample, Sample sample2) {
        return Float.compare(sample.value, sample2.value);
    }

    public void addSample(int i14, float f14) {
        Sample sample;
        ensureSortedByIndex();
        int i15 = this.recycledSampleCount;
        if (i15 > 0) {
            Sample[] sampleArr = this.recycledSamples;
            int i16 = i15 - 1;
            this.recycledSampleCount = i16;
            sample = sampleArr[i16];
        } else {
            sample = new Sample();
        }
        int i17 = this.nextSampleIndex;
        this.nextSampleIndex = i17 + 1;
        sample.index = i17;
        sample.weight = i14;
        sample.value = f14;
        this.samples.add(sample);
        this.totalWeight += i14;
        while (true) {
            int i18 = this.totalWeight;
            int i19 = this.maxWeight;
            if (i18 <= i19) {
                return;
            }
            int i24 = i18 - i19;
            Sample sample2 = this.samples.get(0);
            int i25 = sample2.weight;
            if (i25 <= i24) {
                this.totalWeight -= i25;
                this.samples.remove(0);
                int i26 = this.recycledSampleCount;
                if (i26 < 5) {
                    Sample[] sampleArr2 = this.recycledSamples;
                    this.recycledSampleCount = i26 + 1;
                    sampleArr2[i26] = sample2;
                }
            } else {
                sample2.weight = i25 - i24;
                this.totalWeight -= i24;
            }
        }
    }

    public float getPercentile(float f14) {
        ensureSortedByValue();
        float f15 = f14 * this.totalWeight;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int size = this.samples.size();
            ArrayList<Sample> arrayList = this.samples;
            if (i14 >= size) {
                if (arrayList.isEmpty()) {
                    return Float.NaN;
                }
                return ((Sample) j.f(1, this.samples)).value;
            }
            Sample sample = arrayList.get(i14);
            i15 += sample.weight;
            if (i15 >= f15) {
                return sample.value;
            }
            i14++;
        }
    }

    public void reset() {
        this.samples.clear();
        this.currentSortOrder = -1;
        this.nextSampleIndex = 0;
        this.totalWeight = 0;
    }
}
