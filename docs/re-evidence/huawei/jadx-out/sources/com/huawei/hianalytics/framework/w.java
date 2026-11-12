package com.huawei.hianalytics.framework;

import android.text.TextUtils;
import com.huawei.hianalytics.core.common.EnvUtils;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.core.storage.Event;
import com.huawei.hianalytics.core.storage.IStorageHandler;
import com.huawei.hianalytics.core.transport.TransportHandlerFactory;
import com.huawei.hianalytics.core.transport.Utils;
import com.huawei.hianalytics.framework.config.DeviceAttributeCollector;
import com.huawei.hianalytics.framework.config.ICallback;
import com.huawei.hianalytics.framework.config.ICollectorConfig;
import com.huawei.hianalytics.framework.config.IMandatoryParameters;
import com.huawei.hianalytics.framework.data.WorkKeyHandler;
import com.huawei.hianalytics.framework.policy.IStoragePolicy;
import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f11534c;
    public final ICollectorConfig d;
    public final ICallback e;
    public boolean f;
    public final String g;
    public final int h;
    public final int i;

    public w(String str, String str2, List list, ICallback iCallback, String str3, int i, int i2) {
        this.f11532a = str;
        this.f11533b = str2;
        this.f11534c = list;
        this.e = iCallback;
        this.g = str3;
        this.d = j.b(str);
        this.h = i;
        this.i = i2;
    }

    public final void a() {
        IStorageHandler iStorageHandlerC;
        HashMap map = new HashMap();
        for (int i = 0; i < this.f11534c.size(); i++) {
            if (TextUtils.isEmpty(((Event) this.f11534c.get(i)).getEvtExHashCode())) {
                Event event = (Event) this.f11534c.get(i);
                List arrayList = (List) map.get("noExHashFlag");
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(event);
                map.put("noExHashFlag", arrayList);
            } else {
                Event event2 = (Event) this.f11534c.get(i);
                String evtExHashCode = ((Event) this.f11534c.get(i)).getEvtExHashCode();
                List arrayList2 = (List) map.get(evtExHashCode);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(event2);
                map.put(evtExHashCode, arrayList2);
            }
        }
        if (map.size() <= 0) {
            return;
        }
        IStoragePolicy iStoragePolicyD = j.d(this.f11532a);
        Iterator it = map.entrySet().iterator();
        boolean z = true;
        while (it.hasNext()) {
            List<Event> list = (List) ((Map.Entry) it.next()).getValue();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            int decryptMaxBatchSize = iStoragePolicyD.getDecryptMaxBatchSize(this.f11533b);
            int subCount = 0;
            boolean z2 = true;
            for (Event event3 : list) {
                boolean z3 = z;
                if (iStoragePolicyD.decide(IStoragePolicy.PolicyType.STORAGE_CYCLE, this.f11533b, Utils.parseStringToLong(event3.getEvttime()))) {
                    arrayList3.add(event3);
                } else {
                    if (event3.getSubCount() + subCount > decryptMaxBatchSize) {
                        if (a(arrayList4, EncryptUtil.generateSecureRandomStr(16), this.f, subCount) == 0) {
                            z2 = false;
                        }
                        arrayList4 = new ArrayList();
                        subCount = 0;
                    }
                    arrayList4.add(event3);
                    subCount += event3.getSubCount();
                }
                z = z3;
            }
            boolean z4 = z;
            if (arrayList4.size() > 0 && a(arrayList4, EncryptUtil.generateSecureRandomStr(16), this.f, subCount) == 0) {
                z2 = false;
            }
            if (z2 && !"ha_default_collection".equals(this.f11532a)) {
                g gVarA = j.a(this.f11532a);
                String str = this.f11533b;
                gVarA.e.remove(str + "_send_retry_flag");
            }
            if (arrayList3.size() > 0 && (iStorageHandlerC = j.c(this.f11532a)) != null) {
                iStorageHandlerC.deleteEvents(arrayList3);
            }
            z = !z2 ? false : z4;
        }
        boolean z5 = z;
        if (this.f) {
            return;
        }
        if (!z5) {
            j.a(this.f11532a).a(this.f11533b);
            return;
        }
        g gVarA2 = j.a(this.f11532a);
        String str2 = this.f11533b;
        Integer num = (Integer) gVarA2.d.get(str2);
        if (num == null || num.intValue() == 0) {
            return;
        }
        gVarA2.f11520c.put(str2, 30000L);
        gVarA2.d.put(str2, 0);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0060  */
    /* JADX WARN: Code duplicated, block: B:12:0x0063  */
    /* JADX WARN: Code duplicated, block: B:9:0x003e  */
    public final int a(ArrayList arrayList, String str, boolean z, int i) throws Throwable {
        String encrypted;
        String str2;
        JSONObject jSONObject;
        d0 d0Var;
        byte[] bArrA;
        int i2;
        ArrayList arrayList2;
        IStorageHandler iStorageHandlerC;
        String str3 = this.f11533b;
        String str4 = this.g;
        this.d.requestConfig();
        if (this.d.isUploadEncrypted(str3)) {
            WorkKeyHandler.getHandler().refreshKey(this.f11532a, str3);
            if (WorkKeyHandler.getHandler().getEncrypted() == null || WorkKeyHandler.getHandler().getEncrypted().isEmpty()) {
                d0Var = null;
            } else {
                String appId = this.d.getAppId();
                String pkgName = this.d.getPkgName();
                DeviceAttributeCollector deviceAttribute = this.d.getDeviceAttribute(str3);
                encrypted = WorkKeyHandler.getHandler().getEncrypted();
                if (this.d.isUploadEncrypted(str3)) {
                    str2 = "3";
                } else {
                    encrypted = "";
                    str2 = "0";
                }
                String str5 = this.f11532a;
                String str6 = "hmshi" + str3 + "qrt";
                long jCurrentTimeMillis = System.currentTimeMillis();
                long absTime = this.d.getAbsTime();
                jSONObject = new JSONObject();
                try {
                    jSONObject.put("protocol_version", str2);
                    jSONObject.put("compress_mode", "1");
                    jSONObject.put("serviceid", str6);
                    jSONObject.put("appid", appId);
                    jSONObject.put("packageName", pkgName);
                    jSONObject.put("chifer", encrypted);
                    jSONObject.put("timestamp", String.valueOf(absTime + jCurrentTimeMillis));
                    jSONObject.put("servicetag", str5);
                    try {
                        jSONObject.put("requestid", str);
                    } catch (JSONException unused) {
                        jSONObject = null;
                    }
                } catch (JSONException unused2) {
                }
                d0Var = new d0(deviceAttribute, this.d.getEvtCustomHeader(str3, jSONObject), this.d.getRomAttribute(str3, str4), WorkKeyHandler.getHandler().getWorkKey(), this.f11532a, str3, this.h, this.i);
            }
        } else {
            String appId2 = this.d.getAppId();
            String pkgName2 = this.d.getPkgName();
            DeviceAttributeCollector deviceAttribute2 = this.d.getDeviceAttribute(str3);
            encrypted = WorkKeyHandler.getHandler().getEncrypted();
            if (this.d.isUploadEncrypted(str3)) {
                str2 = "3";
            } else {
                encrypted = "";
                str2 = "0";
            }
            String str7 = this.f11532a;
            String str8 = "hmshi" + str3 + "qrt";
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            long absTime2 = this.d.getAbsTime();
            jSONObject = new JSONObject();
            jSONObject.put("protocol_version", str2);
            jSONObject.put("compress_mode", "1");
            jSONObject.put("serviceid", str8);
            jSONObject.put("appid", appId2);
            jSONObject.put("packageName", pkgName2);
            jSONObject.put("chifer", encrypted);
            jSONObject.put("timestamp", String.valueOf(absTime2 + jCurrentTimeMillis2));
            jSONObject.put("servicetag", str7);
            jSONObject.put("requestid", str);
            d0Var = new d0(deviceAttribute2, this.d.getEvtCustomHeader(str3, jSONObject), this.d.getRomAttribute(str3, str4), WorkKeyHandler.getHandler().getWorkKey(), this.f11532a, str3, this.h, this.i);
        }
        IMandatoryParameters iMandatoryParameters = b.e.f11498a;
        if (d0Var == null) {
            HiLog.sw("ReportProcessor", "evt model is null, tag: " + this.f11532a + ", type: " + this.f11533b);
            if (z && (iStorageHandlerC = j.c(this.f11532a)) != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Event event = (Event) it.next();
                    String content = event.getContent();
                    if (j.b(this.f11532a).isLocalEncrypted(this.f11533b)) {
                        event.setContent(c.a(content, iMandatoryParameters));
                        event.setIsEncrypted(1);
                    } else {
                        event.setContent(content);
                        event.setIsEncrypted(0);
                    }
                    IStoragePolicy iStoragePolicyD = j.d(this.f11532a);
                    if (iStoragePolicyD == null) {
                        HiLog.e("ReportProcessor", "storage handler is null. tag: " + this.f11532a + ", type: " + this.f11533b);
                    } else if (iStoragePolicyD.decide(IStoragePolicy.PolicyType.STORAGE_LENGTH, this.f11533b)) {
                        HiLog.e("ReportProcessor", "db file reach max size, tag: " + this.f11532a + ", type: " + this.f11533b);
                        iStorageHandlerC.deleteAll();
                        x.a(Boolean.TRUE, this.e, iStorageHandlerC, event, 0);
                    } else {
                        long eventSize = iStorageHandlerC.readEventSize(this.f11532a);
                        if (eventSize == 0) {
                            x.a(Boolean.TRUE, this.e, iStorageHandlerC, event, 0);
                        } else if (eventSize > 5000) {
                            HiLog.e("ReportProcessor", "evt size reach max size, tag: " + this.f11532a + ", type: " + this.f11533b);
                            iStorageHandlerC.deleteByTag(this.f11532a);
                            x.a(Boolean.TRUE, this.e, iStorageHandlerC, event, 0);
                        } else {
                            x.a(Boolean.TRUE, this.e, iStorageHandlerC, event, 0);
                        }
                    }
                }
            }
            return 1;
        }
        try {
            JSONObject jSONObjectA = d0Var.a(arrayList, z, i);
            if (jSONObjectA == null) {
                HiLog.sw("ReportProcessor", "events is null, tag: " + this.f11532a + ", type: " + this.f11533b);
                bArrA = new byte[0];
            } else {
                bArrA = z.a(jSONObjectA.toString().getBytes(StandardCharsets.UTF_8));
            }
        } catch (JSONException unused3) {
            HiLog.sw("ReportProcessor", "JsonException, tag: " + this.f11532a + ", type: " + this.f11533b);
            bArrA = new byte[0];
        }
        if (bArrA.length == 0) {
            HiLog.sw("ReportProcessor", "request body is empty, tag: " + this.f11532a + ", type: " + this.f11533b);
            return 1;
        }
        if (iMandatoryParameters.checkDebugModeEnabled()) {
            d dVar = new d(bArrA, this.f11532a, this.f11533b, str, arrayList);
            dVar.f = this.e;
            dVar.g = z;
            dVar.run();
            return 1;
        }
        y yVar = new y(bArrA, this.f11532a, this.f11533b, str, arrayList);
        yVar.f = this.e;
        yVar.g = z;
        HiLog.i("SendTask", "send data running, TAG: " + yVar.f11536b + ", TYPE: " + yVar.d);
        String strA = a.a(yVar.f11536b, yVar.d);
        if (!TextUtils.isEmpty(strA)) {
            if (e.a(EnvUtils.getAppContext())) {
                b bVar = b.e;
                ICollectorConfig iCollectorConfig = (ICollectorConfig) bVar.f11499b.get(yVar.f11536b);
                String str9 = yVar.f11537c;
                ICollectorConfig iCollectorConfig2 = (ICollectorConfig) bVar.f11499b.get(yVar.f11536b);
                String appVer = bVar.f11498a.getAppVer();
                String model = bVar.f11498a.getModel();
                HashMap map = new HashMap();
                map.put("App-Id", iCollectorConfig2.getAppId());
                map.put("App-Ver", appVer);
                map.put("Sdk-Name", "hianalytics");
                map.put("Sdk-Ver", "3.2.14.504");
                map.put("Device-Type", model);
                map.put("servicetag", yVar.f11536b);
                map.put("Request-Id", str9);
                Map<String, String> httpHeader = iCollectorConfig.getHttpHeader(yVar.d);
                if (httpHeader != null) {
                    map.putAll(httpHeader);
                }
                byte[] bArr = yVar.f11535a;
                ICollectorConfig iCollectorConfig3 = (ICollectorConfig) bVar.f11499b.get(yVar.f11536b);
                int metricPolicy = iCollectorConfig3 == null ? 1 : iCollectorConfig3.getMetricPolicy(yVar.d);
                ICollectorConfig iCollectorConfig4 = (ICollectorConfig) bVar.f11499b.get(yVar.f11536b);
                int httpCode = TransportHandlerFactory.create(strA, map, bArr, metricPolicy, iCollectorConfig4 == null ? false : iCollectorConfig4.getShortLinkEnabled(yVar.d)).execute().getHttpCode();
                try {
                    if (httpCode == 200) {
                        if (yVar.g) {
                            HiLog.si("SendTask", "send event type: " + yVar.d + ", tag: " + yVar.f11536b + ", resultCode: " + httpCode + ", reqID: " + yVar.f11537c);
                        } else {
                            IStorageHandler iStorageHandlerC2 = j.c(yVar.f11536b);
                            if (iStorageHandlerC2 != null && (arrayList2 = yVar.e) != null && arrayList2.size() > 0) {
                                HiLog.i("SendTask", "storageHandler delete success events, tag: " + yVar.f11536b + ", type: " + yVar.d);
                                iStorageHandlerC2.deleteEvents(yVar.e);
                                IMandatoryParameters iMandatoryParameters2 = bVar.f11498a;
                                if (iMandatoryParameters2.isFlashKey() && iStorageHandlerC2.readEventsAllSize() == 0) {
                                    iMandatoryParameters2.refreshKey(EncryptUtil.generateSecureRandomStr(16), 1);
                                    iStorageHandlerC2.deleteCommonHeaderExAll();
                                }
                            }
                            i2 = 1;
                        }
                    } else {
                        if (!yVar.g) {
                            yVar.a(httpCode);
                            HiLog.si("SendTask", "send event type: " + yVar.d + ", tag: " + yVar.f11536b + ", resultCode: " + httpCode + ", reqID: " + yVar.f11537c);
                        } else {
                            IMandatoryParameters iMandatoryParameters3 = bVar.f11498a;
                            IStorageHandler iStorageHandlerC3 = j.c(yVar.f11536b);
                            if (iStorageHandlerC3 == null) {
                                HiLog.si("SendTask", "send event type: " + yVar.d + ", tag: " + yVar.f11536b + ", resultCode: " + httpCode + ", reqID: " + yVar.f11537c);
                            } else {
                                for (Event event2 : yVar.e) {
                                    String content2 = event2.getContent();
                                    if (j.b(yVar.f11536b).isLocalEncrypted(yVar.d)) {
                                        event2.setContent(c.a(content2, iMandatoryParameters3));
                                        event2.setIsEncrypted(1);
                                    } else {
                                        event2.setContent(content2);
                                        event2.setIsEncrypted(0);
                                    }
                                    yVar.a(iStorageHandlerC3, event2, httpCode);
                                }
                                i2 = 0;
                            }
                        }
                        return 0;
                    }
                    HiLog.si("SendTask", "send event type: " + yVar.d + ", tag: " + yVar.f11536b + ", resultCode: " + httpCode + ", reqID: " + yVar.f11537c);
                    return i2;
                } catch (Throwable th) {
                    HiLog.si("SendTask", "send event type: " + yVar.d + ", tag: " + yVar.f11536b + ", resultCode: " + httpCode + ", reqID: " + yVar.f11537c);
                    throw th;
                }
            }
            HiLog.w("SendTask", "network is unavailable");
            HiLog.w("SendTask", "network is not available for sending, skipping network request. tag: " + yVar.f11536b);
            return 0;
        }
        HiLog.w("SendTask", "no report address, tag: " + yVar.f11536b + ", type: " + yVar.d);
        return 1;
    }
}
