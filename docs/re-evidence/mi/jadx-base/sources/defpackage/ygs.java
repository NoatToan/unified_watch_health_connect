package defpackage;

import android.content.Context;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ygs extends ths.b<Long> {
    public long p;
    public String q;

    public ygs(String str, List<String> list, String str2, String[] strArr, String str3, String str4, String str5, int i, String str6) {
        super(str, list, str2, strArr, str3, str4, str5, i);
        this.p = 0L;
        this.q = str6;
    }

    public static ygs k(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("count(*)");
        return new ygs(str, arrayList, null, null, null, null, null, 0, "job to get count of all message");
    }

    @Override // ths.a
    public Object b() {
        return Long.valueOf(this.p);
    }

    @Override // ths.b
    public void j(Context context, List<Long> list) {
        if (context == null || list == null || list.size() <= 0) {
            return;
        }
        this.p = list.get(0).longValue();
    }

    @Override // ths.b
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Long i(Context context, Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }
}
