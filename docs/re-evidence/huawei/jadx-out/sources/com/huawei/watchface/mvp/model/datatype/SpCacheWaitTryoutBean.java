package com.huawei.watchface.mvp.model.datatype;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes20.dex */
public class SpCacheWaitTryoutBean {
    private ConcurrentHashMap<String, LinkedHashMap<String, String>> tryoutWfDownUrlMap;
    private ConcurrentHashMap<String, TryoutBean> waitTryOutBeanMap;
    private List<String> waitTryOutWatchFaceIdList;

    public SpCacheWaitTryoutBean(List<String> list, ConcurrentHashMap<String, TryoutBean> concurrentHashMap, ConcurrentHashMap<String, LinkedHashMap<String, String>> concurrentHashMap2) {
        this.waitTryOutWatchFaceIdList = list;
        this.waitTryOutBeanMap = concurrentHashMap;
        this.tryoutWfDownUrlMap = concurrentHashMap2;
    }

    public ConcurrentHashMap<String, LinkedHashMap<String, String>> getTryoutWfDownUrlMap() {
        return this.tryoutWfDownUrlMap;
    }

    public ConcurrentHashMap<String, TryoutBean> getWaitTryOutBeanMap() {
        return this.waitTryOutBeanMap;
    }

    public List<String> getWaitTryOutWatchFaceIdList() {
        return this.waitTryOutWatchFaceIdList;
    }

    public void setTryoutWfDownUrlMap(ConcurrentHashMap<String, LinkedHashMap<String, String>> concurrentHashMap) {
        this.tryoutWfDownUrlMap = concurrentHashMap;
    }

    public void setWaitTryOutBeanMap(ConcurrentHashMap<String, TryoutBean> concurrentHashMap) {
        this.waitTryOutBeanMap = concurrentHashMap;
    }

    public void setWaitTryOutWatchFaceIdList(List<String> list) {
        this.waitTryOutWatchFaceIdList = list;
    }
}
