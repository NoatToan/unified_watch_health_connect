package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class ugo {
    public static List<ugv> c() {
        ArrayList arrayList = new ArrayList(10);
        b(arrayList);
        return arrayList;
    }

    public static int b(List<ugv> list) {
        int iB = b(list, "");
        LogUtil.a("DataMediaFilesHelper", "downloadWorkoutMediaFiles totalLength:", Integer.valueOf(iB));
        return iB;
    }

    private static int b(List<ugv> list, String str) {
        LogUtil.a("DataMediaFilesHelper", "parseMultiLanguageLength 1");
        int iE = 0;
        for (ugx ugxVar : uhb.a(ugw.a(str))) {
            if (!ugw.a(ugxVar.c(), ugw.b(ugw.c(ugxVar.c())), ugxVar.a())) {
                LogUtil.a("DataMediaFilesHelper", "parseMultiLanguageLength 2");
                iE = (int) (((long) iE) + ugxVar.e());
                if (list != null) {
                    ugv ugvVar = new ugv();
                    ugvVar.c(ugxVar.a());
                    ugvVar.b(ugw.d(ugxVar.c()));
                    ugvVar.d(ugxVar.e());
                    list.add(ugvVar);
                }
            }
        }
        return iE;
    }
}
