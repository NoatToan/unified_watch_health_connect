package defpackage;

import com.huawei.hwdevice.phoneprocess.mgr.hwcontactsyncmgr.contacts.sync.utils.Bean;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mtq {
    public static String e(mtc mtcVar) {
        return mte.e(mtcVar);
    }

    public static List<String> c(List<Bean> list) {
        LogUtil.a("ContactVcardUtils", "generateVcards: start");
        if (list == null || list.isEmpty()) {
            LogUtil.j("ContactVcardUtils", "list is null or empty.");
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        List listC = mtv.c(list, 100);
        StringBuilder sb = new StringBuilder();
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            for (Bean bean : (List) it.next()) {
                if (bean instanceof mtc) {
                    sb.append(e((mtc) bean));
                }
            }
            arrayList.add(sb.toString());
            sb.delete(0, sb.length());
        }
        LogUtil.a("ContactVcardUtils", "generateVcards: end, vcard size: ", Integer.valueOf(arrayList.size()));
        return arrayList;
    }
}
