package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.beans.metadata.Om;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class ly {
    public static mq a(Context context, ContentRecord contentRecord, lu luVar, boolean z) throws Throwable {
        mo moVar;
        mr mrVar;
        ms msVar;
        ms msVar2;
        if (contentRecord == null || context == null) {
            return new mb();
        }
        if (z && (luVar == null || luVar.getOpenMeasureView() == null)) {
            hw.b("AdSessionAgentFactory", "MeasureView is null");
            return new mb();
        }
        if (!lx.a()) {
            return new mb();
        }
        hw.a("AdSessionAgentFactory", "AdSessionAgent is avalible");
        lx lxVar = new lx();
        List<Om> listB = contentRecord.b(context);
        if (listB == null) {
            hw.b("AdSessionAgentFactory", "Oms is null");
            return lxVar;
        }
        if (contentRecord.T() != null || (contentRecord.U() != null && "video/mp4".equals(contentRecord.U().a()))) {
            hw.b("AdSessionAgentFactory", "Video adsession");
            moVar = mo.VIDEO;
            mrVar = mr.VIEWABLE;
            msVar = ms.NATIVE;
            msVar2 = ms.NATIVE;
        } else {
            moVar = mo.NATIVE_DISPLAY;
            mrVar = mr.VIEWABLE;
            msVar = ms.NATIVE;
            msVar2 = ms.NONE;
        }
        mm mmVarA = mm.a(moVar, mrVar, msVar, msVar2, false);
        if (mmVarA != null) {
            if (lxVar instanceof lx) {
                hw.b("AdSessionAgentFactory", "init adSessionAgent");
                lxVar.a(context, listB, mmVarA);
            }
            if (z) {
                lxVar.a(luVar.getOpenMeasureView());
            }
        }
        return lxVar;
    }
}
