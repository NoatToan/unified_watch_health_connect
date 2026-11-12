package com.huawei.android.hicloud.sync.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.huawei.android.hicloud.sync.service.aidl.CtagInfo;
import com.huawei.android.hicloud.sync.service.aidl.SyncData;
import defpackage.bcg;
import defpackage.bch;
import defpackage.bck;
import defpackage.bcw;
import defpackage.bda;
import defpackage.bdc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class DeleteTagProvider extends ContentProvider {
    private void b(JSONArray jSONArray) throws Exception {
        if (jSONArray == null) {
            bcw.c("DeleteTagProvider", "updateCtagList error: ctagJsonArray is null");
            return;
        }
        bcw.c("DeleteTagProvider", "updateCtagList: ctagJsonArray.length = " + jSONArray.length());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject != null) {
                CtagInfo ctagInfo = new CtagInfo();
                ctagInfo.setCtagName(bda.e(jSONObject, "ctag_name"));
                ctagInfo.setCtagValue(bda.e(jSONObject, "ctag_value"));
                arrayList.add(ctagInfo);
            }
        }
        bcw.c("DeleteTagProvider", "ctagInfoList : " + arrayList.toString());
        new bck().a(arrayList);
    }

    private void c(JSONArray jSONArray) throws Exception {
        if (jSONArray == null) {
            bcw.c("DeleteTagProvider", "updateEtagList error: etagJsonArray is null");
            return;
        }
        bcw.c("DeleteTagProvider", "updateEtagList: etagJsonArray.length = " + jSONArray.length());
        HashMap map = new HashMap();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject != null) {
                SyncData syncData = new SyncData();
                syncData.setLuid(bda.e(jSONObject, "luid"));
                syncData.setEtag(bda.e(jSONObject, "etag"));
                syncData.setUuid(bda.e(jSONObject, "uuid"));
                syncData.setGuid(bda.e(jSONObject, "guid"));
                syncData.setHash(bda.e(jSONObject, "hash"));
                String strE = bda.e(jSONObject, "type");
                if (map.containsKey(strE)) {
                    map.get(strE).add(syncData);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(syncData);
                    map.put(strE, arrayList);
                }
            }
        }
        d(map);
    }

    @Override // android.content.ContentProvider
    public Bundle call(String str, String str2, Bundle bundle) {
        bcw.c("DeleteTagProvider", "call: method = " + str);
        if (!bda.b(getContext(), getCallingPackage())) {
            throw new IllegalArgumentException("Application does not have permission");
        }
        try {
            if ("migrate_data".equals(str)) {
                JSONObject jSONObject = new JSONObject(bundle.getString("persistentData"));
                JSONArray jSONArray = jSONObject.getJSONArray("ctag");
                JSONArray jSONArray2 = jSONObject.getJSONArray("etag");
                b(jSONArray);
                c(jSONArray2);
            } else if ("clear_prepare".equals(str)) {
                bcw.c("DeleteTagProvider", "logout clear all prepare");
                bch.d(getContext());
                bdc.e(getContext()).c();
            }
        } catch (Exception e) {
            bcw.c("DeleteTagProvider", "call error: " + e.toString());
        }
        return super.call(str, str2, bundle);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        bcw.c("DeleteTagProvider", "delete");
        bcw.a("DeleteTagProvider", "delete, uri = " + uri);
        if (!bda.b(getContext(), getCallingPackage())) {
            bcw.d("DeleteTagProvider", "deleteTag error: not hasPermission");
            return -3;
        }
        if (uri != null) {
            String authority = uri.getAuthority();
            bcw.a("DeleteTagProvider", "delete, authority = " + authority);
            if (authority != null && authority.contains(".hicloud.deleteTagProvider")) {
                String path = uri.getPath();
                bcw.a("DeleteTagProvider", "delete, path = " + path);
                if (path != null && path.contains("delete_tag")) {
                    return bch.a(getContext());
                }
            }
        }
        throw new IllegalArgumentException("unknown_uri " + uri);
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    private void d(Map<String, List<SyncData>> map) throws Exception {
        bcg bcgVar = new bcg();
        for (Map.Entry<String, List<SyncData>> entry : map.entrySet()) {
            bcgVar.c(entry.getValue(), entry.getKey());
        }
    }
}
