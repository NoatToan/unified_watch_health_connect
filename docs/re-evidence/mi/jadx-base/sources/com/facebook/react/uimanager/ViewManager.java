package com.facebook.react.uimanager;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.yoga.YogaMeasureMode;
import defpackage.aqd;
import defpackage.bdo;
import defpackage.bvq;
import defpackage.edj;
import defpackage.g9p;
import defpackage.mdj;
import defpackage.oej;
import defpackage.yej;
import defpackage.zuq;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ViewManager<T extends View, C extends oej> extends BaseJavaModule {
    private final T createView(g9p g9pVar, aqd aqdVar) {
        return (T) createView(g9pVar, null, null, aqdVar);
    }

    public void addEventEmitters(g9p g9pVar, T t) {
    }

    public C createShadowNodeInstance() {
        throw new RuntimeException("ViewManager subclasses must implement createShadowNodeInstance()");
    }

    public abstract T createViewInstance(g9p g9pVar);

    public T createViewInstance(g9p g9pVar, yej yejVar, bdo bdoVar) {
        Object objUpdateState;
        T t = (T) createViewInstance(g9pVar);
        if (yejVar != null) {
            updateProperties(t, yejVar);
        }
        if (bdoVar != null && (objUpdateState = updateState(t, yejVar, bdoVar)) != null) {
            updateExtraData(t, objUpdateState);
        }
        return t;
    }

    public Map<String, Integer> getCommandsMap() {
        return null;
    }

    public zuq<T> getDelegate() {
        return null;
    }

    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedViewConstants() {
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    public Map<String, String> getNativeProps() {
        return bvq.e(getClass(), getShadowNodeClass());
    }

    public abstract Class<? extends C> getShadowNodeClass();

    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        return 0L;
    }

    public void onAfterUpdateTransaction(T t) {
    }

    public void onDropViewInstance(T t) {
    }

    @Deprecated
    public void receiveCommand(T t, int i, ReadableArray readableArray) {
    }

    public abstract void updateExtraData(T t, Object obj);

    public Object updateLocalData(T t, yej yejVar, yej yejVar2) {
        return null;
    }

    public void updateProperties(T t, yej yejVar) {
        if (edj.e) {
            getDelegate();
        }
        bvq.g(this, t, yejVar);
        onAfterUpdateTransaction(t);
    }

    public Object updateState(T t, yej yejVar, bdo bdoVar) {
        return null;
    }

    public C createShadowNodeInstance(ReactApplicationContext reactApplicationContext) {
        return (C) createShadowNodeInstance();
    }

    public void receiveCommand(T t, String str, ReadableArray readableArray) {
    }

    public T createView(g9p g9pVar, yej yejVar, bdo bdoVar, aqd aqdVar) {
        T t = (T) createViewInstance(g9pVar, yejVar, bdoVar);
        addEventEmitters(g9pVar, t);
        if (t instanceof mdj) {
            ((mdj) t).setOnInterceptTouchEventListener(aqdVar);
        }
        return t;
    }
}
