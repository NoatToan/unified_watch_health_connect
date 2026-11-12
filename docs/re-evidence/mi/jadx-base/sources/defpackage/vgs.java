package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.onetrack.api.c;

/* JADX INFO: loaded from: classes11.dex */
public class vgs extends bhs {
    public vgs(String str, String str2, String[] strArr, String str3) {
        super(str, str2, strArr, str3);
    }

    public static vgs j(Context context, String str, int i) {
        x9s.y("delete  messages when db size is too bigger");
        String strC = ths.b(context).c(str);
        if (TextUtils.isEmpty(strC)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("rowDataId in (select ");
        sb.append("rowDataId from " + strC);
        sb.append(" order by createTimeStamp asc");
        sb.append(" limit ?)");
        return new vgs(str, sb.toString(), new String[]{String.valueOf(i)}, "a job build to delete history message");
    }

    @Override // ths.a
    public void f(Context context, Object obj) {
        if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            long jA = iis.a(c());
            long j = ogs.f29159b;
            if (jA <= j) {
                x9s.y("db size is suitable");
                return;
            }
            long j2 = (long) ((((jA - j) * 1.2d) / j) * jLongValue);
            k(j2);
            yfs.b(context).i("begin delete " + j2 + "noUpload messages , because db size is " + jA + c.f13755a);
            super.f(context, obj);
        }
    }

    public final void k(long j) {
        String[] strArr = this.i;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        strArr[0] = String.valueOf(j);
    }
}
