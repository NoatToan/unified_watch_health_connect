package defpackage;

import android.content.Context;
import com.huawei.ads.adsrec.e0;
import com.huawei.ads.adsrec.k;
import com.huawei.ads.adsrec.s;
import com.huawei.openplatform.abl.log.HiAdLog;

/* JADX INFO: loaded from: classes4.dex */
public class aya extends k {
    @Override // com.huawei.ads.adsrec.r0
    public <T> axi a(ayc aycVar, T t) {
        HiAdLog.i("CROS", "recall");
        return new s(this.f4755a).a(aycVar, t);
    }

    @Override // com.huawei.ads.adsrec.r0
    public <T> axi a(ayc aycVar, axi axiVar) {
        HiAdLog.i("CROS", "recall via api");
        return new s(this.f4755a).a(aycVar, axiVar);
    }

    public aya(Context context, e0 e0Var) {
        super(context, e0Var);
    }
}
