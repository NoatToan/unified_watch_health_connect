package com.google.android.exoplayer2.source.dash;

import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.source.dash.BaseUrlExclusionList;
import com.google.android.exoplayer2.source.dash.manifest.BaseUrl;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class BaseUrlExclusionList {
    private final Map<String, Long> a;
    private final Map<Integer, Long> b;
    private final Map<List<Pair<String, Integer>>, BaseUrl> c;
    private final Random d;

    public BaseUrlExclusionList() {
        this(new Random());
    }

    private static <T> void b(T toExclude, long excludeUntilMs, Map<T, Long> currentExclusions) {
        if (currentExclusions.containsKey(toExclude)) {
            excludeUntilMs = Math.max(excludeUntilMs, ((Long) Util.castNonNull(currentExclusions.get(toExclude))).longValue());
        }
        currentExclusions.put(toExclude, Long.valueOf(excludeUntilMs));
    }

    private List<BaseUrl> c(List<BaseUrl> baseUrls) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        e(jElapsedRealtime, this.a);
        e(jElapsedRealtime, this.b);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < baseUrls.size(); i++) {
            BaseUrl baseUrl = baseUrls.get(i);
            if (!this.a.containsKey(baseUrl.serviceLocation) && !this.b.containsKey(Integer.valueOf(baseUrl.priority))) {
                arrayList.add(baseUrl);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(BaseUrl a, BaseUrl b) {
        int iCompare = Integer.compare(a.priority, b.priority);
        return iCompare != 0 ? iCompare : a.serviceLocation.compareTo(b.serviceLocation);
    }

    private static <T> void e(long nowMs, Map<T, Long> exclusions) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<T, Long> entry : exclusions.entrySet()) {
            if (entry.getValue().longValue() <= nowMs) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            exclusions.remove(arrayList.get(i));
        }
    }

    private BaseUrl f(List<BaseUrl> candidates) {
        int i = 0;
        for (int i2 = 0; i2 < candidates.size(); i2++) {
            i += candidates.get(i2).weight;
        }
        int iNextInt = this.d.nextInt(i);
        int i3 = 0;
        for (int i4 = 0; i4 < candidates.size(); i4++) {
            BaseUrl baseUrl = candidates.get(i4);
            i3 += baseUrl.weight;
            if (iNextInt < i3) {
                return baseUrl;
            }
        }
        return (BaseUrl) Iterables.getLast(candidates);
    }

    public static int getPriorityCount(List<BaseUrl> baseUrls) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < baseUrls.size(); i++) {
            hashSet.add(Integer.valueOf(baseUrls.get(i).priority));
        }
        return hashSet.size();
    }

    public void exclude(BaseUrl baseUrlToExclude, long exclusionDurationMs) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + exclusionDurationMs;
        b(baseUrlToExclude.serviceLocation, jElapsedRealtime, this.a);
        b(Integer.valueOf(baseUrlToExclude.priority), jElapsedRealtime, this.b);
    }

    public int getPriorityCountAfterExclusion(List<BaseUrl> baseUrls) {
        HashSet hashSet = new HashSet();
        List<BaseUrl> listC = c(baseUrls);
        for (int i = 0; i < listC.size(); i++) {
            hashSet.add(Integer.valueOf(listC.get(i).priority));
        }
        return hashSet.size();
    }

    public void reset() {
        this.a.clear();
        this.b.clear();
        this.c.clear();
    }

    @Nullable
    public BaseUrl selectBaseUrl(List<BaseUrl> baseUrls) {
        List<BaseUrl> listC = c(baseUrls);
        if (listC.size() < 2) {
            return (BaseUrl) Iterables.getFirst(listC, null);
        }
        Collections.sort(listC, new Comparator() { // from class: tr
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return BaseUrlExclusionList.d((BaseUrl) obj, (BaseUrl) obj2);
            }
        });
        ArrayList arrayList = new ArrayList();
        int i = listC.get(0).priority;
        for (int i2 = 0; i2 < listC.size(); i2++) {
            BaseUrl baseUrl = listC.get(i2);
            if (i != baseUrl.priority) {
                if (arrayList.size() != 1) {
                    break;
                }
                return listC.get(0);
            }
            arrayList.add(new Pair(baseUrl.serviceLocation, Integer.valueOf(baseUrl.weight)));
        }
        BaseUrl baseUrl2 = this.c.get(arrayList);
        if (baseUrl2 != null) {
            return baseUrl2;
        }
        BaseUrl baseUrlF = f(listC.subList(0, arrayList.size()));
        this.c.put(arrayList, baseUrlF);
        return baseUrlF;
    }

    @VisibleForTesting
    public BaseUrlExclusionList(Random random) {
        this.c = new HashMap();
        this.d = random;
        this.a = new HashMap();
        this.b = new HashMap();
    }
}
