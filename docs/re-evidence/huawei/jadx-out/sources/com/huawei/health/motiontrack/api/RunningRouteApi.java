package com.huawei.health.motiontrack.api;

import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import defpackage.gck;
import defpackage.gcp;
import defpackage.gcq;
import defpackage.gcr;
import defpackage.gcv;
import defpackage.gcw;
import defpackage.gcx;
import defpackage.gcy;
import defpackage.gcz;
import defpackage.gda;
import defpackage.gdb;
import defpackage.gdc;
import defpackage.gdd;
import defpackage.gde;
import defpackage.gdf;
import defpackage.gdg;
import defpackage.gdh;
import defpackage.gdi;
import defpackage.gdj;
import defpackage.gdk;
import defpackage.gdm;

/* JADX INFO: loaded from: classes7.dex */
public interface RunningRouteApi {
    void addHotPathParticipateInfo(gck gckVar, UiCallback<CloudCommonReponse> uiCallback);

    @Deprecated
    void deleteFeedbackByPathId(gcp gcpVar, UiCallback<CloudCommonReponse> uiCallback);

    @Deprecated
    void deleteFeedbackInfo(gcq gcqVar, UiCallback<CloudCommonReponse> uiCallback);

    void feedbackHotPathInfo(gcr gcrVar, UiCallback<CloudCommonReponse> uiCallback);

    void getAllCityInfoList(gcv gcvVar, UiCallback<gcx> uiCallback);

    void getCityInfoList(gcw gcwVar, UiCallback<gda> uiCallback);

    void getCityInfoWithGps(gcy gcyVar, UiCallback<gdc> uiCallback);

    @Deprecated
    void getFeedbackInfos(gcz gczVar, UiCallback<gdb> uiCallback);

    void getHotPathDetail(gdh gdhVar, UiCallback<gde> uiCallback);

    void getHotPathDetail(String str, UiCallback<gdm> uiCallback);

    void getHotPathDetail(boolean z, String str, UiCallback<gdm> uiCallback);

    void getHotPathParticipateInfo(gdd gddVar, UiCallback<gdf> uiCallback);

    void getHotPathParticipateInfos(gdg gdgVar, UiCallback<gdi> uiCallback);

    void getHotPaths(gdk gdkVar, UiCallback<gdj> uiCallback);

    void removeLocationUpdates();

    void requestLocationUpdates(ILocationChangeListener iLocationChangeListener);

    void requestLocationUpdates(ILocationChangeListener iLocationChangeListener, int i);
}
