package defpackage;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class esu {
    public static void c(phz phzVar) {
        String str = phzVar.a() + "_version";
        String strG = phzVar.g();
        StorageParams storageParams = new StorageParams();
        storageParams.e(0);
        SharedPreferenceManager.e(dxw.d(), String.valueOf(1003), str, strG, storageParams);
    }

    public static List<String> d(List<phz> list) {
        ArrayList arrayList = new ArrayList(10);
        try {
            Iterator<phz> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a());
            }
            if (CommonUtil.cj()) {
                return a(arrayList);
            }
        } catch (ConcurrentModificationException unused) {
            LogUtil.e("DownloadDeviceResourceUtil", "occur a Exception");
        }
        return arrayList;
    }

    private static List<String> a(List<String> list) {
        list.add(BaseApplication.getContext().getSharedPreferences("data", 0).getString("productId", ""));
        return list;
    }
}
