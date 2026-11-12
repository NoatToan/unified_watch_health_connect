package defpackage;

import android.content.Context;
import com.huawei.ads.adsrec.c0;
import com.huawei.ads.adsrec.db.table.MaterialSummaryRecord;
import com.huawei.ads.adsrec.e;
import com.huawei.ads.fund.util.ListUtil;
import com.huawei.openplatform.abl.log.HiAdLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class axk implements c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Set<String>> f751b = new HashMap();

    @Override // com.huawei.ads.adsrec.c0
    public void a(Context context, ayc aycVar, axi axiVar) {
        if (context == null || aycVar == null || axiVar == null) {
            HiAdLog.w("SplashAdFilter", "valid args");
            return;
        }
        List<axm> listI = axiVar.i();
        if (ListUtil.isEmpty(listI)) {
            return;
        }
        e(context, aycVar);
        for (axm axmVar : listI) {
            List<axh> listB = axmVar.b();
            if (!ListUtil.isEmpty(listB)) {
                ArrayList arrayList = new ArrayList();
                for (axh axhVar : listB) {
                    if (axhVar != null && (axhVar.r() == 0 || a(axmVar.j(), axhVar.i()))) {
                        arrayList.add(axhVar);
                    }
                }
                axmVar.b(arrayList);
            }
        }
    }

    private boolean a(String str, String str2) {
        Set<String> set = this.f751b.get(str);
        if (set != null && !set.isEmpty()) {
            return set.contains(str2);
        }
        HiAdLog.w("SplashAdFilter", "not such material with slot:%s", str);
        return false;
    }

    private boolean e(MaterialSummaryRecord materialSummaryRecord, int i) {
        materialSummaryRecord.g();
        materialSummaryRecord.e();
        if (materialSummaryRecord.g() > 0 && materialSummaryRecord.e() > 0) {
            if (i == 1) {
                return materialSummaryRecord.g() <= materialSummaryRecord.e();
            }
            if (materialSummaryRecord.g() > materialSummaryRecord.e()) {
                return true;
            }
        }
        return false;
    }

    private void e(Context context, ayc aycVar) {
        String str;
        Integer numK = aycVar.k();
        if (numK == null) {
            str = "orientation empty";
        } else {
            List<MaterialSummaryRecord> listB = new e(context).b(aycVar.e(), String.valueOf(aycVar.g()));
            if (!ListUtil.isEmpty(listB)) {
                for (MaterialSummaryRecord materialSummaryRecord : listB) {
                    if (e(materialSummaryRecord, numK.intValue())) {
                        String strC = materialSummaryRecord.c();
                        Set<String> hashSet = this.f751b.get(strC);
                        if (hashSet == null) {
                            hashSet = new HashSet<>();
                            this.f751b.put(strC, hashSet);
                        }
                        hashSet.add(materialSummaryRecord.d());
                    }
                }
                return;
            }
            str = "materialSummaryRecords empty";
        }
        HiAdLog.w("SplashAdFilter", str);
    }
}
