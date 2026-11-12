package com.huami.watch.transport.httpsupport.StageFright;

import android.text.TextUtils;
import com.huami.watch.ota.UpdateUtils;
import com.huami.watch.transport.httpsupport.model.DataItem;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ReportListInfo {
    public static final String KEY_OF_VER = "ver";
    public static final int LOCATION_APP = 0;
    public static final int LOCATION_ASSIST = 2;
    public static final int LOCATION_SRV = 1;
    public static final int LOCATION_TOP_OF_ALL = 2;
    private static int c = 1;
    private ConcurrentHashMap<Integer, HashSet<String>> a;
    private ConcurrentHashMap<String, ConcurrentLinkedQueue<DataItem>> b;
    public boolean isKey;
    public int sum;

    public ReportListInfo() {
        this(Integer.valueOf("1").intValue());
    }

    public ReportListInfo(int i) {
        this.isKey = false;
        this.b = new ConcurrentHashMap<>();
        this.a = new ConcurrentHashMap<>();
        c = i;
    }

    private String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Integer num : this.a.keySet()) {
                if (num != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject.put(String.valueOf(num), jSONObject2);
                    ConcurrentLinkedQueue<DataItem> concurrentLinkedQueue = null;
                    Iterator<String> it2 = this.b.keySet().iterator();
                    while (it2.hasNext()) {
                        concurrentLinkedQueue = this.b.get(it2.next());
                        if (concurrentLinkedQueue != null) {
                            break;
                        }
                    }
                    if (concurrentLinkedQueue != null) {
                        for (DataItem dataItem : concurrentLinkedQueue) {
                            String str = dataItem.getOwner() + UpdateUtils.CMD_FILTER + dataItem.getAction();
                            boolean zHas = jSONObject2.has("data");
                            String strD = d(dataItem);
                            if (zHas) {
                                StringBuffer stringBuffer = new StringBuffer(jSONObject2.optString("data"));
                                stringBuffer.append(UpdateUtils.CMD_FILTER);
                                stringBuffer.append(strD);
                                jSONObject2.put("data", stringBuffer.toString());
                                jSONObject2.put("sum", jSONObject2.optInt("sum") + 1);
                            } else {
                                jSONObject2.put("who", str);
                                jSONObject2.put("sum", 1);
                                jSONObject2.put("data", strD);
                            }
                        }
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    private static void b(ReportListInfo reportListInfo, JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        int iOptInt = 0;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
            if (jSONObjectOptJSONObject != null) {
                iOptInt = jSONObjectOptJSONObject.optInt("sum");
                String strOptString = jSONObjectOptJSONObject.optString("who");
                if (!TextUtils.isEmpty(strOptString)) {
                    String[] strArrSplit = strOptString.split(UpdateUtils.CMD_FILTER);
                    String strOptString2 = jSONObjectOptJSONObject.optString("data");
                    if (!TextUtils.isEmpty(strOptString2)) {
                        for (String str : strOptString2.split(UpdateUtils.CMD_FILTER)) {
                            DataItem dataItem = new DataItem();
                            dataItem.setIdentifier(str);
                            dataItem.setOwner(strArrSplit[0]);
                            dataItem.setAction(strArrSplit[1]);
                            reportListInfo.addItem(Integer.valueOf(Integer.valueOf(next).intValue()), dataItem);
                        }
                    }
                }
            }
        }
        reportListInfo.sum = iOptInt;
    }

    private static void c(ReportListInfo reportListInfo, JSONObject jSONObject) throws JSONException {
        Iterator<String> itKeys = jSONObject.keys();
        int iOptInt = 0;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                    String strOptString = jSONObject2.optString("data");
                    if (!TextUtils.isEmpty(strOptString)) {
                        iOptInt += jSONObject2.optInt("sum");
                        String strOptString2 = jSONObject2.optString("who");
                        if (!TextUtils.isEmpty(strOptString2)) {
                            String[] strArrSplit = strOptString2.split(UpdateUtils.CMD_FILTER);
                            for (String str : strOptString.split(UpdateUtils.CMD_FILTER)) {
                                DataItem dataItem = new DataItem();
                                dataItem.setIdentifier(str);
                                dataItem.setOwner(strArrSplit[0]);
                                reportListInfo.addItem(Integer.valueOf(next), dataItem);
                            }
                        }
                    }
                }
            }
        }
        reportListInfo.sum = iOptInt;
    }

    private String d(DataItem dataItem) {
        if (!dataItem.hasFlag(16384)) {
            return dataItem.getIdentifier();
        }
        return "." + dataItem.getIdentifier();
    }

    public static ReportListInfo from(String str) {
        return from(str, false);
    }

    public static ReportListInfo from(String str, boolean z) {
        ReportListInfo reportListInfo = new ReportListInfo(c);
        reportListInfo.isKey = z;
        try {
            JSONObject jSONObject = new JSONObject(str);
            Integer numValueOf = jSONObject.has("ver") ? Integer.valueOf(jSONObject.getInt("ver")) : 0;
            if (numValueOf == null) {
                numValueOf = 0;
            }
            c = numValueOf.intValue();
            if (numValueOf.intValue() == 0) {
                b(reportListInfo, jSONObject);
            } else if (numValueOf.intValue() == 1) {
                c(reportListInfo, jSONObject);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return reportListInfo;
    }

    public static int getVersion() {
        return c;
    }

    public static boolean hasData(ReportListInfo reportListInfo) {
        boolean z;
        synchronized (ReportListInfo.class) {
            z = (reportListInfo.getThings().isEmpty() || reportListInfo.getThings().keySet().isEmpty()) ? false : true;
        }
        return z;
    }

    public static boolean isItemNeedSerial(DataItem dataItem) {
        synchronized (ReportListInfo.class) {
            if (dataItem == null) {
                return false;
            }
            return dataItem.getIdentifier().indexOf(".") != -1 || dataItem.hasFlag(16384);
        }
    }

    public static ReportListInfo translateV0TOV1(ReportListInfo reportListInfo, int i) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        if (getVersion() == i) {
            return reportListInfo;
        }
        String strFlatten = reportListInfo.flatten();
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = new JSONObject(strFlatten);
            Iterator<String> itKeys = jSONObject3.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (jSONObject2.has(next)) {
                    jSONArray = jSONObject2.optJSONArray(next);
                    if (jSONArray != null) {
                        jSONObject = jSONObject3.getJSONObject(next);
                    }
                } else {
                    jSONArray = new JSONArray();
                    jSONObject2.put(next, jSONArray);
                    jSONObject = jSONObject3.getJSONObject(next);
                }
                jSONArray.put(jSONObject);
            }
            jSONObject2.put("ver", "1");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return from(jSONObject2.toString());
    }

    public void addItem(Integer num, DataItem dataItem) {
        String strTrackWho = dataItem.trackWho();
        ConcurrentLinkedQueue<DataItem> concurrentLinkedQueue = this.b.get(strTrackWho);
        if (concurrentLinkedQueue == null) {
            concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
            this.b.put(strTrackWho, concurrentLinkedQueue);
        }
        HashSet<String> hashSet = this.a.get(num);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.a.put(num, hashSet);
        }
        concurrentLinkedQueue.add(dataItem);
        hashSet.add(strTrackWho);
    }

    public String flatten() {
        int i = c;
        if (i == 0) {
            return a();
        }
        if (i == 1) {
            return flattenV1();
        }
        return null;
    }

    public String flattenV1() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Integer num : this.a.keySet()) {
                if (num != null) {
                    JSONArray jSONArray = new JSONArray();
                    jSONObject.put(String.valueOf(num), jSONArray);
                    for (String str : this.a.get(num)) {
                        HashMap map = new HashMap();
                        JSONObject jSONObject2 = (JSONObject) map.get(str);
                        Iterator<DataItem> it2 = this.b.get(str).iterator();
                        while (it2.hasNext()) {
                            String strD = d(it2.next());
                            if (jSONObject2 == null) {
                                jSONObject2 = new JSONObject();
                                jSONObject2.put("who", str);
                                jSONObject2.put("sum", 1);
                                jSONObject2.put("data", strD);
                                jSONArray.put(jSONObject2);
                                map.put(str, jSONObject2);
                            } else {
                                StringBuffer stringBuffer = new StringBuffer(jSONObject2.optString("data"));
                                stringBuffer.append(UpdateUtils.CMD_FILTER);
                                stringBuffer.append(strD);
                                jSONObject2.put("data", stringBuffer.toString());
                                jSONObject2.put("sum", jSONObject2.optInt("sum") + 1);
                            }
                        }
                    }
                }
            }
            jSONObject.put("ver", c);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public ConcurrentHashMap<String, ConcurrentLinkedQueue<DataItem>> getThings() {
        return this.b;
    }

    public ConcurrentHashMap<Integer, HashSet<String>> getWhomMapThings() {
        return this.a;
    }
}
