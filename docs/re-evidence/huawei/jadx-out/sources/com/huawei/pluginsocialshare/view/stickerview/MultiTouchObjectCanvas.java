package com.huawei.pluginsocialshare.view.stickerview;

import defpackage.ppf;
import defpackage.ppm;

/* JADX INFO: loaded from: classes42.dex */
public interface MultiTouchObjectCanvas<T> {
    void canvasTouched(ppf ppfVar);

    void deselectAll();

    T getDraggableObjectAtPoint(ppf ppfVar);

    void getPositionAndScale(T t, ppm ppmVar);

    boolean pointInObjectGrabArea(ppf ppfVar, T t);

    void selectObject(T t, ppf ppfVar);

    boolean setPositionAndScale(T t, ppm ppmVar, ppf ppfVar);
}
