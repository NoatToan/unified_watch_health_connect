package com.huawei.hianalytics;

import android.app.usage.UsageEvents;
import android.text.TextUtils;
import com.huawei.hianalytics.core.log.HiLog;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11552a = "";

    public final HashMap a(UsageEvents usageEvents) {
        HashMap map = new HashMap();
        while (usageEvents.hasNextEvent()) {
            UsageEvents.Event event = new UsageEvents.Event();
            if (usageEvents.getNextEvent(event)) {
                String packageName = event.getPackageName();
                f fVar = (f) map.get(packageName);
                if (fVar == null) {
                    fVar = new f();
                    fVar.f11488a = packageName;
                    map.put(packageName, fVar);
                }
                if (event.getEventType() == 1) {
                    if (!TextUtils.equals(packageName, this.f11552a)) {
                        fVar.g++;
                    }
                    this.f11552a = packageName;
                }
                int eventType = event.getEventType();
                if (eventType == 1) {
                    if (fVar.f11489b == 0) {
                        fVar.f11489b = event.getTimeStamp();
                        fVar.f11490c = event.getTimeStamp();
                    }
                    fVar.e = eventType;
                    fVar.f = event.getTimeStamp();
                } else if (eventType == 2) {
                    fVar.f11490c = event.getTimeStamp();
                }
                if (fVar.e == 1 && eventType == 2) {
                    long timeStamp = event.getTimeStamp() - fVar.f;
                    if (timeStamp > 0) {
                        fVar.d += timeStamp;
                    }
                }
            } else {
                HiLog.d("UM", "get next event failed");
            }
        }
        return map;
    }
}
