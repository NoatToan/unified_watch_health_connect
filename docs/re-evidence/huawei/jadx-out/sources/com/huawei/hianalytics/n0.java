package com.huawei.hianalytics;

import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.framework.config.EvtHeaderAttributeCollector;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 implements EvtHeaderAttributeCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f11587a;

    public n0(JSONObject jSONObject) {
        this.f11587a = jSONObject;
    }

    @Override // com.huawei.hianalytics.framework.config.EvtHeaderAttributeCollector
    public final JSONObject doCollector(JSONObject jSONObject, int i) {
        if (this.f11587a == null) {
            return null;
        }
        if (jSONObject != null) {
            try {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    this.f11587a.put(next, jSONObject.getString(next));
                }
            } catch (Exception unused) {
                HiLog.e("HAHC", "json exception");
            }
        }
        this.f11587a.put("hmac", "");
        return this.f11587a;
    }
}
