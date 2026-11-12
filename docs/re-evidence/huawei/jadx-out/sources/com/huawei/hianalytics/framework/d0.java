package com.huawei.hianalytics.framework;

import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.core.storage.CommonHeaderEx;
import com.huawei.hianalytics.core.storage.Event;
import com.huawei.hianalytics.core.storage.IStorageHandler;
import com.huawei.hianalytics.framework.config.CipherType;
import com.huawei.hianalytics.framework.config.DeviceAttributeCollector;
import com.huawei.hianalytics.framework.config.EvtHeaderAttributeCollector;
import com.huawei.hianalytics.framework.config.IMandatoryParameters;
import com.huawei.hianalytics.framework.config.RomAttributeCollector;
import com.huawei.secure.android.common.encrypt.aes.AesCbc;
import com.huawei.secure.android.common.encrypt.aes.AesGcm;
import com.huawei.secure.android.common.encrypt.utils.HexUtil;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 {
    public static final Charset i = StandardCharsets.UTF_8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeviceAttributeCollector f11508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EvtHeaderAttributeCollector f11509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RomAttributeCollector f11510c;
    public final String d;
    public final String e;
    public final byte[] f;
    public final int g;
    public final int h;

    public d0(DeviceAttributeCollector deviceAttributeCollector, EvtHeaderAttributeCollector evtHeaderAttributeCollector, RomAttributeCollector romAttributeCollector, String str, String str2, String str3, int i2, int i3) {
        this.f11508a = deviceAttributeCollector;
        this.f11509b = evtHeaderAttributeCollector;
        this.f11510c = romAttributeCollector;
        this.f = HexUtil.hexStr2ByteArray(str);
        this.d = str2;
        this.e = str3;
        this.g = i2;
        this.h = i3;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0078  */
    public final JSONObject a(ArrayList arrayList, boolean z, int i2) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        IStorageHandler iStorageHandlerC;
        Iterator it;
        Event event;
        String str;
        String str2;
        String string;
        String strSubstring;
        String strSubstring2;
        String str3 = "TAG: ";
        String str4 = ", TYPE: ";
        if (arrayList.isEmpty()) {
            HiLog.w("UploadEvtModel", "no events, tag: " + this.d);
            return null;
        }
        if (this.f11509b == null || this.f11508a == null || this.f11510c == null) {
            HiLog.w("UploadEvtModel", "no attribute, tag: " + this.d);
            return null;
        }
        IStorageHandler iStorageHandlerC2 = j.c(this.d);
        String evtExHashCode = ((Event) arrayList.get(0)).getEvtExHashCode();
        if (TextUtils.isEmpty(evtExHashCode) || "noExHashFlag".equals(evtExHashCode) || iStorageHandlerC2 == null) {
            jSONObjectOptJSONObject = null;
            jSONObjectOptJSONObject2 = null;
        } else {
            CommonHeaderEx commonHeaderEx = iStorageHandlerC2.readCommonHeaderEx(evtExHashCode);
            if (TextUtils.isEmpty(commonHeaderEx.getCommonHeaderEx())) {
                jSONObjectOptJSONObject = null;
                jSONObjectOptJSONObject2 = null;
            } else {
                JSONObject jSONObject = new JSONObject(commonHeaderEx.getCommonHeaderEx());
                jSONObjectOptJSONObject = jSONObject.optJSONObject("headerEx");
                jSONObjectOptJSONObject2 = jSONObject.optJSONObject("commonEx");
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObjectDoCollector = this.f11509b.doCollector(jSONObjectOptJSONObject, i2);
        if (jSONObjectDoCollector == null) {
            HiLog.w("UploadEvtModel", "header is null");
            return null;
        }
        jSONObject2.put("header", jSONObjectDoCollector);
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObjectDoCollector2 = this.f11508a.doCollector(jSONObjectOptJSONObject2);
        if (j.c("HmsProfiler") != null && TextUtils.equals("ha_default_collection", this.d) && TextUtils.equals("oper", this.e)) {
            String udid = j.b("ha_default_collection").getUdid();
            if (!TextUtils.isEmpty(udid)) {
                try {
                    jSONObjectDoCollector2.put("udid", udid);
                } catch (JSONException unused) {
                    HiLog.w("UploadEvtModel", "getUDID failed");
                }
            }
        }
        jSONObjectDoCollector2.put(Event.EventConstants.PROPERTIES, this.f11510c.doCollector());
        jSONObject3.put("events_common", jSONObjectDoCollector2);
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList2 = new ArrayList();
        long absTime = j.b(this.d).getAbsTime();
        int i3 = 1;
        boolean z2 = (this.h == 0 || this.g == 500) ? false : true;
        Iterator it2 = arrayList.iterator();
        int i4 = 0;
        while (it2.hasNext()) {
            Event event2 = (Event) it2.next();
            if (!z2 || (i4 = i4 + 1) < this.g) {
                it = it2;
            } else {
                try {
                    it = it2;
                    try {
                        SystemClock.sleep(this.h);
                        HiLog.d("UploadEvtModel", str3 + this.d + str4 + this.e + ", Task will sleep " + this.h + " ms after handle " + this.g + " events");
                    } catch (Exception unused2) {
                        HiLog.d("UploadEvtModel", str3 + this.d + str4 + this.e + ", Task fail to sleep");
                    }
                } catch (Exception unused3) {
                    it = it2;
                }
                i4 = 0;
            }
            try {
                event = event2.m1340clone();
                event.setEvttime(String.valueOf(Long.parseLong(event2.getEvttime()) + absTime));
            } catch (CloneNotSupportedException unused4) {
                HiLog.e("UploadEvtModel", "event clone exception");
                event = new Event(event2.getId(), event2.getEvtid(), event2.getEvttype(), event2.getContent(), String.valueOf(Long.parseLong(event2.getEvttime()) + absTime), event2.getServicetag(), event2.getSessionid(), event2.getSessionname(), event2.getEvtExHashCode(), event2.getProcessname(), event2.getIsEncrypted(), event2.getSubCount());
            }
            String content = event.getContent();
            String str5 = str3;
            if (z || event.getIsEncrypted() != i3) {
                str = str4;
                str2 = "";
            } else {
                IMandatoryParameters iMandatoryParameters = b.e.f11498a;
                if (iMandatoryParameters == null) {
                    str = str4;
                } else {
                    String cipherType = iMandatoryParameters.getCipherType();
                    cipherType.getClass();
                    str = str4;
                    if (cipherType.equals(CipherType.AES_CBC)) {
                        str2 = "";
                        content = AesCbc.decrypt(content, iMandatoryParameters.getLoadWorkKey());
                    } else if (cipherType.equals(CipherType.AES_GCM)) {
                        if (content == null || content.length() < 24) {
                            HiLog.e("CryptoHandler", "IV is invalid");
                            strSubstring = "";
                        } else {
                            strSubstring = content.substring(0, 24);
                        }
                        if (content != null) {
                            str2 = "";
                            if (content.length() >= 24) {
                                strSubstring2 = content.substring(24);
                            }
                            content = AesGcm.decrypt(strSubstring2, iMandatoryParameters.getLoadWorkKey(), HexUtil.hexStr2ByteArray(strSubstring));
                        } else {
                            str2 = "";
                        }
                        strSubstring2 = str2;
                        content = AesGcm.decrypt(strSubstring2, iMandatoryParameters.getLoadWorkKey(), HexUtil.hexStr2ByteArray(strSubstring));
                    }
                }
                content = "";
                str2 = content;
            }
            if (absTime == 0) {
                string = content;
            } else if (TextUtils.isEmpty(content)) {
                string = str2;
            } else {
                try {
                    JSONObject jSONObject4 = new JSONObject(content);
                    jSONObject4.put(Event.EventConstants.ABS_TIME, String.valueOf(absTime));
                    string = jSONObject4.toString();
                } catch (JSONException unused5) {
                    HiLog.e("UploadEvtModel", "handle content exception");
                    string = content;
                }
            }
            event.setContent(string);
            if (!event.appendToJsonArray(jSONArray)) {
                arrayList2.add(event);
                HiLog.sw("UploadEvtModel", "custom event is empty, tag: " + this.d);
            }
            it2 = it;
            str3 = str5;
            str4 = str;
            i3 = 1;
        }
        if (!arrayList2.isEmpty() && (iStorageHandlerC = j.c(this.d)) != null) {
            iStorageHandlerC.deleteEvents(arrayList2);
        }
        if (jSONArray.length() == 0) {
            HiLog.i("UploadEvtModel", "send data is empty, tag: " + this.d);
            return null;
        }
        jSONObject3.put(Event.EventConstants.EVENTS, jSONArray);
        byte[] bArrA = z.a(jSONObject3.toString().getBytes(i));
        jSONObject2.put("event", j.b(this.d).isUploadEncrypted(this.e) ? HexUtil.byteArray2HexStr(AesGcm.encrypt(bArrA, this.f)) : HexUtil.byteArray2HexStr(bArrA));
        return jSONObject2;
    }
}
