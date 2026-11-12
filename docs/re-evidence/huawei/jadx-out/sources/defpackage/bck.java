package defpackage;

import android.database.Cursor;
import com.huawei.android.hicloud.sync.c.a.b.e;
import com.huawei.android.hicloud.sync.service.aidl.CtagInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class bck extends e<CtagInfo> {
    public void a(List<CtagInfo> list) throws Exception {
        bcw.a("CtagOperator", "replaceData begin");
        if (list == null || list.isEmpty()) {
            return;
        }
        bcw.a("CtagOperator", "replaceData, request: " + list.toString());
        ArrayList<String[]> arrayList = new ArrayList<>();
        for (CtagInfo ctagInfo : list) {
            if (ctagInfo != null) {
                arrayList.add(d(ctagInfo));
            }
        }
        a("REPLACE INTO ctag(ctag_name,ctag_value, sync_token) VALUES(?,?,?)", arrayList);
    }

    private String[] d(CtagInfo ctagInfo) {
        String ctagName = ctagInfo.getCtagName();
        String ctagValue = ctagInfo.getCtagValue();
        String syncToken = ctagInfo.getSyncToken();
        if (syncToken == null) {
            syncToken = "";
        }
        return new String[]{ctagName, ctagValue, syncToken};
    }

    public void c() throws Exception {
        bcw.a("CtagOperator", "deleteAll ");
        a("DELETE FROM ctag ", (String[]) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.huawei.android.hicloud.sync.c.a.b.e
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public CtagInfo a(Cursor cursor) {
        CtagInfo ctagInfo = new CtagInfo();
        ctagInfo.setCtagName(cursor.getString(0));
        ctagInfo.setCtagValue(cursor.getString(1));
        if (cursor.getColumnCount() == 3) {
            ctagInfo.setSyncToken(cursor.getString(2));
        }
        return ctagInfo;
    }
}
