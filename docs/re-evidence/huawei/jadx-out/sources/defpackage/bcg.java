package defpackage;

import android.database.Cursor;
import com.huawei.android.hicloud.sync.c.a.b.e;
import com.huawei.android.hicloud.sync.service.aidl.SyncData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class bcg extends e<SyncData> {
    public void c(List<SyncData> list, String str) throws Exception {
        bcw.a("EtagOperator", "batchReplace begin ");
        if (list == null || list.isEmpty()) {
            return;
        }
        bcw.a("EtagOperator", "batchReplace , request = " + list.size());
        ArrayList<String[]> arrayList = new ArrayList<>();
        Iterator<SyncData> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b(it.next(), str));
        }
        a("REPLACE INTO etag(luid,type,etag,uuid,guid,hash,recycle_status) VALUES(?,?,?,?,?,?,?)", arrayList);
    }

    private String[] b(SyncData syncData, String str) {
        String[] strArr = new String[7];
        strArr[0] = syncData.getLuid();
        strArr[1] = str;
        strArr[2] = syncData.getEtag();
        if (syncData.getUuid() == null) {
            strArr[3] = "";
        } else {
            strArr[3] = syncData.getUuid();
        }
        strArr[4] = syncData.getGuid();
        if (syncData.getHash() == null) {
            strArr[5] = "";
        } else {
            strArr[5] = syncData.getHash();
        }
        strArr[6] = "" + syncData.getRecycleStatus();
        return strArr;
    }

    public void e() throws Exception {
        bcw.a("EtagOperator", "deleteAll ");
        a("DELETE FROM etag ", (String[]) null);
    }

    public int b(Map<String, String> map, String str) {
        bcw.c("EtagOperator", "batUpdate4Luid begin type = " + str);
        ArrayList<String[]> arrayList = new ArrayList<>();
        if (map == null || map.isEmpty()) {
            return -2;
        }
        bcw.c("EtagOperator", "luidMapSize = " + map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bcw.c("EtagOperator", "[ luidMap.oldluid = " + entry.getKey() + " luidMap.newluid = " + entry.getValue() + " ]");
            arrayList.add(new String[]{entry.getValue(), entry.getKey(), str});
        }
        bcw.c("EtagOperator", "argsListSize = " + arrayList.size());
        return a("update etag set luid = ? where luid = ? and type = ?", arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.huawei.android.hicloud.sync.c.a.b.e
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SyncData a(Cursor cursor) {
        SyncData syncData = new SyncData();
        syncData.setLuid(cursor.getString(0));
        syncData.setEtag(cursor.getString(1));
        syncData.setUuid(cursor.getString(2));
        syncData.setGuid(cursor.getString(3));
        syncData.setHash(cursor.getString(4));
        syncData.setRecycleStatus(cursor.getInt(5));
        return syncData;
    }
}
