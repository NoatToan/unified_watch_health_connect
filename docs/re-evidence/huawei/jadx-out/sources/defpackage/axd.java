package defpackage;

import com.huawei.ads.adsrec.h0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class axd {
    public static h0 c(String str, Object... objArr) {
        List list = (List) objArr[0];
        if ("strategySortation".equals(str)) {
            return new axp(list);
        }
        if ("modelSortation".equals(str)) {
            return new axx(list, (ayc) objArr[1]);
        }
        if ("ecpmSortation".equals(str)) {
            return new ayi(list);
        }
        return "mixEcpmSortation".equals(str) ? new ayf(list, (List) objArr[1], (List) objArr[2]) : new axz(list);
    }
}
