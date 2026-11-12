package com.huawei.health.motiontrack.api;

import android.app.Activity;
import android.content.Context;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.ui.commonui.model.ICityLatLonCallBack;
import defpackage.qol;

/* JADX INFO: loaded from: classes7.dex */
public interface LocationApi {
    void getLocation(Context context, ICityLatLonCallBack iCityLatLonCallBack, UiCallback uiCallback);

    qol getUserLocation(Activity activity);
}
