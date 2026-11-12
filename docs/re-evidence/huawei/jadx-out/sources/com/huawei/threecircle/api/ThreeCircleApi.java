package com.huawei.threecircle.api;

import com.huawei.basefitnessadvice.callback.UiCallback;
import defpackage.qhd;
import defpackage.qhf;
import defpackage.qhl;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public interface ThreeCircleApi {
    void checkUpdateForThreeCircle();

    String getPromptMessage(qhl qhlVar, Map<String, String> map);

    void queryEncourage(String str, int i, UiCallback<qhd> uiCallback);

    qhl queryRules(String str, String str2);

    void querySummary(String str, int i, UiCallback<qhf> uiCallback);
}
