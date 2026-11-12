package defpackage;

import android.database.Cursor;
import com.huawei.android.hicloud.sync.c.a.b.e;

/* JADX INFO: loaded from: classes23.dex */
public class bco extends e<bcb> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.huawei.android.hicloud.sync.c.a.b.e
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public bcb a(Cursor cursor) {
        bcb bcbVar = new bcb();
        bcbVar.a(cursor.getInt(0));
        bcbVar.b(cursor.getLong(1));
        bcbVar.d(cursor.getLong(2));
        bcbVar.d(cursor.getInt(3));
        bcbVar.e(cursor.getString(4));
        return bcbVar;
    }
}
