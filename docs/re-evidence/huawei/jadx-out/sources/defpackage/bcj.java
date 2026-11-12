package defpackage;

import android.database.Cursor;
import com.huawei.android.hicloud.sync.c.a.b.e;
import com.huawei.android.hicloud.sync.service.aidl.UnstructData;

/* JADX INFO: loaded from: classes23.dex */
public class bcj extends e<UnstructData> {
    public void c() throws Exception {
        bcw.a("FileOperator", "deleteAll ");
        a("DELETE FROM file ", (String[]) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.huawei.android.hicloud.sync.c.a.b.e
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public UnstructData a(Cursor cursor) {
        UnstructData unstructData = new UnstructData();
        unstructData.setId(cursor.getString(0));
        unstructData.setHash(cursor.getString(2));
        unstructData.setName(cursor.getString(3));
        if (cursor.getColumnCount() == 5) {
            unstructData.setUnstruct_uuid(cursor.getString(4));
        }
        return unstructData;
    }
}
