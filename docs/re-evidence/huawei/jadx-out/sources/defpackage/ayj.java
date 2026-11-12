package defpackage;

import android.content.Context;
import com.huawei.ads.adsrec.e;
import com.huawei.ads.adsrec.u0;
import com.huawei.openplatform.abl.log.HiAdLog;

/* JADX INFO: loaded from: classes4.dex */
public final class ayj {
    public static axm a(Context context, String str, String str2, int i) {
        HiAdLog.i("SingleSlotLR", "recall %s slot: %s adType: %d", str, str2, Integer.valueOf(i));
        e eVar = new e(context);
        axm axmVarA = eVar.a(str, str2);
        ayt aytVarC = new u0(context).c(str, str2);
        if (aytVarC != null) {
            axmVarA.b(eVar.a(aytVarC));
        }
        axmVarA.a(axmVarA.h() ? 204 : 200);
        return axmVarA;
    }
}
