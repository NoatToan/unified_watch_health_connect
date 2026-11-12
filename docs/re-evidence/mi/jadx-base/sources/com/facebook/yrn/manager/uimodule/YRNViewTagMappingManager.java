package com.facebook.yrn.manager.uimodule;

import com.facebook.yrn.manager.YRNBizInstance;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
class YRNViewTagMappingManager {
    private final ConcurrentHashMap<Integer, HashSet<Integer>> mRootTag2ViewTags = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, YRNBizInstance> mViewTag2instance = new ConcurrentHashMap<>();

    public void clear() {
        this.mRootTag2ViewTags.clear();
        this.mViewTag2instance.clear();
    }

    public YRNBizInstance getBizInstanceForViewTag(int i) {
        return this.mViewTag2instance.get(Integer.valueOf(i));
    }

    public HashSet<Integer> getViewTagsForRootTag(int i) {
        return this.mRootTag2ViewTags.get(Integer.valueOf(i));
    }

    public void removeBizInstanceForViewTag(int i) {
        this.mViewTag2instance.remove(Integer.valueOf(i));
    }

    public void removeBizInstanceForViewTags(HashSet<Integer> hashSet) {
        if (hashSet == null || hashSet.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<Integer, YRNBizInstance>> it = this.mViewTag2instance.entrySet().iterator();
        while (it.hasNext()) {
            Integer key = it.next().getKey();
            if (hashSet.contains(key)) {
                this.mViewTag2instance.remove(key);
            }
        }
    }

    public void removeViewTagsForRootTag(int i) {
        this.mRootTag2ViewTags.remove(Integer.valueOf(i));
    }

    public void setBizInstanceForViewTag(int i, YRNBizInstance yRNBizInstance) {
        if (yRNBizInstance != null) {
            this.mViewTag2instance.put(Integer.valueOf(i), yRNBizInstance);
        }
    }

    public void setViewTagForRootTag(int i, int i2) {
        HashSet<Integer> hashSet = this.mRootTag2ViewTags.get(Integer.valueOf(i));
        if (hashSet == null) {
            hashSet = new HashSet<>();
        }
        hashSet.add(Integer.valueOf(i2));
        this.mRootTag2ViewTags.put(Integer.valueOf(i), hashSet);
    }
}
