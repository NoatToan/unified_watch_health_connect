package com.facebook.yrn.manager.uimodule;

import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.ReactEventEmitter;
import com.facebook.yrn.manager.YRNBizInstance;
import defpackage.sk1;
import defpackage.wxq;

/* JADX INFO: loaded from: classes4.dex */
public class YRNReactEventEmitter extends ReactEventEmitter {
    private final SparseArray<RCTEventEmitter> mEventEmitters;
    private YRNViewTagMappingManager mMappingManager;
    private final ReactApplicationContext mReactContext;

    public YRNReactEventEmitter(YRNViewTagMappingManager yRNViewTagMappingManager, ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mEventEmitters = new SparseArray<>();
        this.mReactContext = reactApplicationContext;
        this.mMappingManager = yRNViewTagMappingManager;
    }

    private YRNBizInstance getBizInstanceByReactTag(int i) {
        YRNViewTagMappingManager yRNViewTagMappingManager = this.mMappingManager;
        if (yRNViewTagMappingManager != null) {
            return yRNViewTagMappingManager.getBizInstanceForViewTag(i);
        }
        return null;
    }

    private RCTEventEmitter getEventEmitter(int i) {
        RCTEventEmitter rCTEventEmitter = this.mEventEmitters.get(wxq.a(i));
        return rCTEventEmitter == null ? (RCTEventEmitter) this.mReactContext.getJSModule(RCTEventEmitter.class) : rCTEventEmitter;
    }

    private boolean onInterceptEventToBiz(int i, String str, WritableMap writableMap) {
        YRNBizInstance bizInstanceByReactTag = getBizInstanceByReactTag(i);
        if (bizInstanceByReactTag == null) {
            return false;
        }
        bizInstanceByReactTag.enqueueJSCall(RCTEventEmitter.class.getSimpleName(), "receiveEvent", Arguments.fromJavaArgs(new Object[]{Integer.valueOf(i), str, writableMap}));
        return true;
    }

    private boolean onInterceptTouchToBiz(String str, WritableArray writableArray, WritableArray writableArray2) {
        sk1.a(writableArray.size() > 0);
        YRNBizInstance bizInstanceByReactTag = getBizInstanceByReactTag(writableArray.getMap(0).getInt("target"));
        if (bizInstanceByReactTag == null) {
            return false;
        }
        bizInstanceByReactTag.enqueueJSCall(RCTEventEmitter.class.getSimpleName(), "receiveTouches", Arguments.fromJavaArgs(new Object[]{str, writableArray, writableArray2}));
        return true;
    }

    @Override // com.facebook.react.uimanager.events.ReactEventEmitter, com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i, String str, WritableMap writableMap) {
        if (onInterceptEventToBiz(i, str, writableMap)) {
            return;
        }
        getEventEmitter(i).receiveEvent(i, str, writableMap);
    }

    @Override // com.facebook.react.uimanager.events.ReactEventEmitter, com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        sk1.a(writableArray.size() > 0);
        if (onInterceptTouchToBiz(str, writableArray, writableArray2)) {
            return;
        }
        getEventEmitter(writableArray.getMap(0).getInt("target")).receiveTouches(str, writableArray, writableArray2);
    }
}
