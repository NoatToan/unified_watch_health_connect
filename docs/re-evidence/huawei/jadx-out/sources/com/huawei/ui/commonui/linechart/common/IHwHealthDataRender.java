package com.huawei.ui.commonui.linechart.common;

import defpackage.qmj;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public interface IHwHealthDataRender {
    void disableFocusArea();

    void focusArea(List<qmj> list);

    boolean hasData();

    boolean isUsePaintAsBackground();

    void usePaintAsBackground(boolean z);
}
