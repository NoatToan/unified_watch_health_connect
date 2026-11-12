package com.huawei.health.device.wifi.entity.builder;

import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.huawei.health.device.wifi.entity.utils.JsonParser;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import defpackage.dyg;
import defpackage.ebl;
import defpackage.ebu;
import defpackage.ecb;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseBuilder implements Serializable {
    private static final int COMMON_LENGTH = 2;
    private static final int REQUEST_TIMEOUT = 5000;
    private static final String TAG = "BaseBuilder";
    private static final long serialVersionUID = -2536229911637793283L;
    private String uri = "";
    private long defaultTime = 5000;

    public abstract String makeRequestStream();

    public abstract ebl makeResponseEntity(String str);

    public ebl makeResponseEntity(String str, String str2) {
        return null;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public String getUri() {
        return this.uri;
    }

    public void setDefaultTime(long j) {
        this.defaultTime = j;
    }

    public long getDefaultTime() {
        return this.defaultTime;
    }

    public byte[] makeRequestByte() {
        return new byte[0];
    }

    public ebl makeResponseEntity(byte[] bArr) {
        return new ebl();
    }

    protected ebu parseResponseEntity(String str, String str2) {
        ebu ebuVar = new ebu();
        if (!TextUtils.isEmpty(str)) {
            Map<String, Object> mapA = JsonParser.a(str);
            try {
                if (mapA.containsKey("errcode") && (mapA.get("errcode") instanceof Integer)) {
                    ebuVar.a(((Integer) mapA.get("errcode")).intValue());
                }
                if (mapA.containsKey("devId") && (mapA.get("devId") instanceof String)) {
                    ebuVar.a((String) mapA.get("devId"));
                }
                if (mapA.containsKey(BleConstants.DEV_INFO)) {
                    ebuVar.d(parserObjToDevInfo(mapA.get(BleConstants.DEV_INFO).toString()));
                } else {
                    ebuVar.d((ebu.e) null);
                }
                if (str2 != null) {
                    dyg.e(true, TAG, "address: ", str2);
                    ebuVar.d(str2);
                } else if (mapA.containsKey("baseUrl") && (mapA.get("baseUrl") instanceof String)) {
                    ebuVar.d((String) mapA.get("baseUrl"));
                } else {
                    dyg.a(true, TAG, "address is null and baseUrl is not right");
                }
                if (mapA.containsKey("services")) {
                    ebuVar.b(parserObjToServiceInfo(mapA.get("services").toString()));
                    return ebuVar;
                }
            } catch (ClassCastException e) {
                dyg.c(true, TAG, e.getMessage());
            }
        }
        return ebuVar;
    }

    protected ebu parseResponseEntity(String str) {
        ebu ebuVar = new ebu();
        if (TextUtils.isEmpty(str)) {
            LogUtil.j(TAG, "parseResponseEntity stream is empty");
            return ebuVar;
        }
        Map<String, Object> mapA = JsonParser.a(str);
        try {
            if (mapA.containsKey("errcode")) {
                Object obj = mapA.get("errcode");
                if (obj instanceof Integer) {
                    ebuVar.a(((Integer) obj).intValue());
                }
            }
            if (mapA.containsKey("devId")) {
                Object obj2 = mapA.get("devId");
                if (obj2 instanceof String) {
                    ebuVar.a((String) obj2);
                }
            }
            if (mapA.containsKey(BleConstants.DEV_INFO)) {
                ebuVar.d(parserObjToDevInfo(mapA.get(BleConstants.DEV_INFO).toString()));
            } else {
                ebuVar.d((ebu.e) null);
            }
            if (mapA.containsKey("baseUrl")) {
                Object obj3 = mapA.get("baseUrl");
                if (obj3 instanceof String) {
                    ebuVar.d((String) obj3);
                }
            }
            if (mapA.containsKey("services")) {
                ebuVar.b(parserObjToServiceInfo(mapA.get("services").toString()));
                return ebuVar;
            }
        } catch (ClassCastException e) {
            dyg.c(true, TAG, e.getMessage());
        }
        return ebuVar;
    }

    private ebu.e parserObjToDevInfo(String str) {
        dyg.e(false, TAG, "parserObjToDevInfo: obj is ", str);
        ebu.e eVar = new ebu.e();
        if (str != null && str.length() > 1) {
            HashMap map = new HashMap(16);
            String strSubstring = str.substring(1, str.length() - 1);
            dyg.e(false, TAG, "parserObjToDevInfo: str substring is ", strSubstring);
            for (String str2 : strSubstring.split(",")) {
                String[] strArrSplit = str2.split("=");
                if (strArrSplit.length == 2) {
                    dyg.e(false, TAG, "parserObjToDevInfo: cell[0] is " + strArrSplit[0].trim() + ", cell[1] is " + strArrSplit[1].trim());
                    map.put(strArrSplit[0].trim(), strArrSplit[1].trim());
                }
            }
            try {
                ecb.d(map, eVar);
                return eVar;
            } catch (ClassCastException e) {
                dyg.c(true, TAG, e.getMessage());
            } catch (NumberFormatException e2) {
                dyg.c(true, TAG, e2.getMessage());
            }
        }
        return eVar;
    }

    private List<ebu.c> parserObjToServiceInfo(String str) {
        int i = 16;
        ArrayList arrayList = new ArrayList(16);
        if (str != null && str.length() > 0) {
            dyg.e(false, TAG, "parserObjToServiceInfo: obj is ", str);
            String strReplaceAll = str.replaceAll("(?:\\{|\\}|\\[|\\])", "");
            dyg.e(false, TAG, "parserObjToServiceInfo: service is ", strReplaceAll);
            String[] strArrSplit = strReplaceAll.split(",");
            int length = strArrSplit.length;
            if (length > 1 && length % 2 == 0) {
                int i2 = 0;
                while (i2 < length) {
                    ebu.c cVar = new ebu.c();
                    HashMap map = new HashMap(i);
                    String strTrim = strArrSplit[i2].trim();
                    String strTrim2 = strArrSplit[i2 + 1].trim();
                    dyg.e(false, TAG, "parserObjToServiceInfo: stCell is ", strTrim2);
                    String[] strArrSplit2 = strTrim.split("=");
                    if (strArrSplit2.length == 2) {
                        dyg.e(false, TAG, "parserObjToServiceInfo: cell[0] is ", strArrSplit2[0].trim(), ", cell[1] is " + strArrSplit2[1]);
                        map.put(strArrSplit2[0].trim(), strArrSplit2[1].trim());
                    }
                    String[] strArrSplit3 = strTrim2.split("=");
                    if (strArrSplit2.length > 0) {
                        dyg.e(false, TAG, "parserObjToServiceInfo: celll[0] is ", strArrSplit3[0].trim());
                        map.put(strArrSplit3[0].trim(), "");
                    }
                    if (map.containsKey(CmcdConfiguration.KEY_STREAM_TYPE) && (map.get(CmcdConfiguration.KEY_STREAM_TYPE) instanceof String)) {
                        cVar.d((String) map.get(CmcdConfiguration.KEY_STREAM_TYPE));
                    }
                    if (map.containsKey(CmcdConfiguration.KEY_SESSION_ID) && (map.get(CmcdConfiguration.KEY_STREAM_TYPE) instanceof String)) {
                        cVar.c((String) map.get(CmcdConfiguration.KEY_SESSION_ID));
                    }
                    arrayList.add(cVar);
                    i2 += 2;
                    i = 16;
                }
            }
        }
        return arrayList;
    }
}
