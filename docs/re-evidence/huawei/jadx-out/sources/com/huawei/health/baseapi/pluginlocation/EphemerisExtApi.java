package com.huawei.health.baseapi.pluginlocation;

import defpackage.grg;
import defpackage.grh;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes25.dex */
public interface EphemerisExtApi {
    grh getEphRequest(List<String> list);

    Map<String, String> getEphResponse(grg grgVar);
}
