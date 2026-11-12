package defpackage;

import android.text.TextUtils;
import com.huawei.android.hicloud.sync.service.aidl.SyncData;
import com.huawei.android.hicloud.sync.service.aidl.UnstructData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class bcl {
    public static ArrayList<String> a(JSONArray jSONArray) throws JSONException {
        ArrayList<String> arrayList = new ArrayList<>();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(String.valueOf(i));
            }
        }
        return arrayList;
    }

    public static bcq<Integer, List<String>> c(JSONArray jSONArray) throws JSONException {
        bcq<Integer, List<String>> bcqVar = new bcq<>();
        if (jSONArray == null) {
            return bcqVar;
        }
        HashMap map = new HashMap();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject != null) {
                int iB = bda.b(jSONObject, "errorCode");
                map.put(Integer.valueOf(iB), bda.a(bda.e(jSONObject, "idList")));
            }
        }
        bcqVar.e(map);
        return bcqVar;
    }

    public static ArrayList<UnstructData> d(JSONArray jSONArray) throws JSONException {
        ArrayList<UnstructData> arrayList = new ArrayList<>();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    UnstructData unstructData = new UnstructData();
                    unstructData.setId(bda.e(jSONObject, "id"));
                    unstructData.setUnstruct_uuid(bda.e(jSONObject, "unstruct_uuid"));
                    unstructData.setName(bda.e(jSONObject, "name"));
                    unstructData.setHash(bda.e(jSONObject, "hash"));
                    arrayList.add(unstructData);
                }
            }
        }
        return arrayList;
    }

    public static ArrayList<SyncData> e(JSONArray jSONArray) throws JSONException {
        ArrayList<SyncData> arrayList = new ArrayList<>();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    SyncData syncData = new SyncData();
                    syncData.setLuid(bda.e(jSONObject, "luid"));
                    syncData.setGuid(bda.e(jSONObject, "guid"));
                    syncData.setUnstruct_uuid(bda.e(jSONObject, "unstruct_uuid"));
                    syncData.setEtag(bda.e(jSONObject, "etag"));
                    syncData.setData(bda.e(jSONObject, "data"));
                    syncData.setUuid(bda.e(jSONObject, "uuid"));
                    syncData.setStatus(bda.b(jSONObject, "status"));
                    syncData.setHash(bda.e(jSONObject, "hash"));
                    JSONArray jSONArrayC = bda.c(jSONObject, "downFileList");
                    JSONArray jSONArrayC2 = bda.c(jSONObject, "deleteFileList");
                    JSONArray jSONArrayC3 = bda.c(jSONObject, "filelist");
                    syncData.setDownFileList(d(jSONArrayC));
                    syncData.setDeleteFileList(d(jSONArrayC2));
                    syncData.setFileList(d(jSONArrayC3));
                    syncData.setRecycleStatus(jSONObject.optInt("recycleStatus"));
                    syncData.setRecycleTime(jSONObject.optLong("recycleTime"));
                    if (bcn.a() >= 107) {
                        if (!TextUtils.isEmpty(jSONObject.optString("extensionData"))) {
                            syncData.setExtensionData(jSONObject.optString("extensionData"));
                        }
                        if (!TextUtils.isEmpty(jSONObject.optString("extraParam"))) {
                            syncData.setExtraParam(jSONObject.optString("extraParam"));
                        }
                    }
                    arrayList.add(syncData);
                }
            }
        }
        return arrayList;
    }

    public static ArrayList<SyncData> b(String str) throws Exception {
        bcw.a("SyncLogicUtil", "parseParceDataFromJson");
        ArrayList<SyncData> arrayList = new ArrayList<>();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    SyncData syncData = new SyncData();
                    syncData.setGuid(jSONObject.getString("guid"));
                    syncData.setData(jSONObject.getString("data"));
                    syncData.setUnstruct_uuid(jSONObject.getString("unstructUuid"));
                    syncData.setRecycleStatus(jSONObject.optInt("recycleStatus"));
                    syncData.setRecycleTime(jSONObject.optLong("recycleTime"));
                    if (bcn.a() >= 107) {
                        if (!TextUtils.isEmpty(jSONObject.optString("extensionData"))) {
                            syncData.setExtensionData(jSONObject.optString("extensionData"));
                        }
                        if (!TextUtils.isEmpty(jSONObject.optString("extraParam"))) {
                            syncData.setExtraParam(jSONObject.optString("extraParam"));
                        }
                    }
                    arrayList.add(syncData);
                }
            }
            return arrayList;
        } catch (JSONException e) {
            bcw.d("SyncLogicUtil", "parseQueryResultParceDataFromJson error : JSONException " + e.getMessage());
            throw e;
        }
    }
}
