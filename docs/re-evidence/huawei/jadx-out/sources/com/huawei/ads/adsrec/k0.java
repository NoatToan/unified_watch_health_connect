package com.huawei.ads.adsrec;

import android.content.Context;
import com.huawei.ads.fund.util.ListUtil;
import com.huawei.openplatform.abl.log.HiAdLog;
import defpackage.axi;
import defpackage.axm;
import defpackage.ayc;
import defpackage.ayj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class k0 implements g0 {
    private Context d;

    @Override // com.huawei.ads.adsrec.g0
    public <T> axi a(ayc aycVar, axi axiVar) {
        return null;
    }

    @Override // com.huawei.ads.adsrec.g0
    public <T> axi a(ayc aycVar, T t) {
        HiAdLog.i("LocalRecallTask", "recall");
        if (aycVar == null) {
            HiAdLog.i("LocalRecallTask", "adRecallParam is null");
            return null;
        }
        axi axiVar = new axi(aycVar.e(), new e(this.d).b(aycVar.e()));
        axiVar.c(aycVar.b());
        List<String> listC = aycVar.c();
        if (ListUtil.isEmpty(listC)) {
            HiAdLog.i("LocalRecallTask", "empty slotIds");
            return axiVar;
        }
        ArrayList arrayList = new ArrayList(listC.size());
        Iterator<String> it = listC.iterator();
        while (it.hasNext()) {
            axm axmVarA = ayj.a(this.d, aycVar.e(), it.next(), aycVar.g());
            if (axmVarA != null) {
                axmVarA.j();
                arrayList.add(axmVarA);
            }
        }
        axiVar.e(arrayList);
        axiVar.b(200);
        return axiVar;
    }

    public k0(Context context) {
        this.d = context.getApplicationContext();
    }
}
