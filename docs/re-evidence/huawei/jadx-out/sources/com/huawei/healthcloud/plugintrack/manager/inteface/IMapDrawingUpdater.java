package com.huawei.healthcloud.plugintrack.manager.inteface;

import defpackage.jpg;
import defpackage.jpi;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public interface IMapDrawingUpdater {
    void addEndMarker(jpg jpgVar);

    void addStartMarker(jpg jpgVar);

    void drawFirstLocation(jpg jpgVar);

    void drawLineToMap(List<jpi> list);

    void drawPauseLine(jpg jpgVar, jpg jpgVar2);

    void drawRecoveryLine(jpg jpgVar, jpg jpgVar2);

    void forceDrawLineToMap();

    void pauseSportClear();

    void releaseMap();

    void updateCpMarker(int[] iArr);
}
