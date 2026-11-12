package com.huawei.health.threeCircle.remind.model;

import android.os.Bundle;
import defpackage.ikp;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public interface OnRemindHandle {
    void destroy();

    boolean isActiveTrigger();

    void onTrigger(Bundle bundle, Map<String, Integer> map, ikp ikpVar);

    void onTrigger(Map<String, Integer> map, ikp ikpVar);

    void registerAlarm();
}
