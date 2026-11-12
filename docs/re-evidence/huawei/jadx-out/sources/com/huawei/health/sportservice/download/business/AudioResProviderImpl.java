package com.huawei.health.sportservice.download.business;

import android.content.Context;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsport.multilingualaudio.AudioResProviderInterface;
import defpackage.fdy;
import defpackage.pqj;
import defpackage.pql;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class AudioResProviderImpl implements AudioResProviderInterface {
    @Override // com.huawei.haf.router.facade.template.ServiceProvider
    public void init(Context context) {
    }

    @Override // com.huawei.pluginsport.multilingualaudio.AudioResProviderInterface
    public pql getAudioResPath(String str, String str2, String str3) {
        LogUtil.a("AudioResProviderImpl", "language= ", str, " speaker= ", str2, " moduleName= ", str3);
        pql pqlVar = new pql();
        String strD = pqj.b().d(pqj.e());
        String strD2 = fdy.d(str3, str + "_" + strD, (String) null);
        String strD3 = fdy.d("Common", str + "_" + strD, (String) null);
        StringBuilder sb = new StringBuilder();
        sb.append(strD3);
        sb.append(File.separator);
        pqlVar.c(sb.toString());
        pqlVar.d(strD2 + File.separator);
        pqlVar.a(strD3 + ".json");
        pqlVar.e(strD2 + ".json");
        return pqlVar;
    }
}
