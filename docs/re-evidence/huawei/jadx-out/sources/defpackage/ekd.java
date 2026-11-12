package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class ekd {
    public static dru b(elh elhVar) {
        LogUtil.a("ChangeClassType", " changeHuaweiDeviceClass()");
        dru druVar = new dru();
        druVar.c(elhVar);
        druVar.d(0);
        return druVar;
    }

    public static ArrayList<dru> d(ArrayList<elh> arrayList) {
        LogUtil.a("ChangeClassType", " changeHuaweiDeviceClassList()");
        ArrayList<dru> arrayList2 = new ArrayList<>();
        if (arrayList != null) {
            for (elh elhVar : arrayList) {
                dru druVar = new dru();
                druVar.c(elhVar);
                druVar.d(0);
                druVar.d(elhVar.j());
                arrayList2.add(druVar);
            }
        }
        return arrayList2;
    }
}
