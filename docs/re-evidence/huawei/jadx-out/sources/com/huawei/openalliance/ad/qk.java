package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.metadata.ApkInfo;
import com.huawei.openalliance.ad.beans.metadata.Content;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class qk implements qj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f20126a;

    @Override // com.huawei.openalliance.ad.qj
    public int b() {
        return 3;
    }

    @Override // com.huawei.openalliance.ad.qj
    public boolean a(final String str, final int i, final int i2, final Content content) {
        if (content == null) {
            return false;
        }
        if (hw.a()) {
            hw.a("PreCheckFilter", "filterContents adType: %d contentid: %s", Integer.valueOf(i), content.g());
        }
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.qk.1
            @Override // java.lang.Runnable
            public void run() {
                qk.this.b(str, i, i2, content);
            }
        });
        return false;
    }

    public int a(MetaData metaData) {
        if (metaData == null) {
            return -1;
        }
        String strO = metaData.o();
        return !TextUtils.isEmpty(strO) ? a(metaData, strO) : c(metaData);
    }

    private int d(MetaData metaData) {
        ApkInfo apkInfoS;
        if (metaData == null || (apkInfoS = metaData.s()) == null || TextUtils.isEmpty(apkInfoS.a())) {
            return 3;
        }
        boolean zA = com.huawei.openalliance.ad.utils.k.a(this.f20126a, apkInfoS.a());
        if (!TextUtils.isEmpty(apkInfoS.N())) {
            a(apkInfoS.N(), zA);
        }
        return zA ? 1 : 2;
    }

    private pc c(String str, int i, int i2, Content content) {
        ContentRecord contentRecordA = pn.a(str, content, i, null);
        if (contentRecordA == null) {
            hw.b("PreCheckFilter", "contentRecord is null");
            return null;
        }
        contentRecordA.o(i2);
        Context context = this.f20126a;
        pc pcVar = new pc(context, sw.a(context, i));
        pcVar.a(contentRecordA);
        return pcVar;
    }

    private int c(MetaData metaData) {
        int iD = d(metaData);
        if (iD != 1) {
            return iD != 2 ? 9 : 6;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, int i, int i2, Content content) {
        pc pcVarC;
        MetaData metaDataC = content.c();
        if (metaDataC == null || (pcVarC = c(str, i, i2, content)) == null) {
            return;
        }
        pcVarC.a(a(metaDataC), b(metaDataC));
    }

    private String b(MetaData metaData) {
        ApkInfo apkInfoS = metaData.s();
        return apkInfoS != null ? com.huawei.openalliance.ad.utils.d.a(this.f20126a, apkInfoS.a()) : "";
    }

    private void a(String str, boolean z) {
        List<String> listV = com.huawei.openalliance.ad.utils.d.v(this.f20126a);
        if (z) {
            if (listV.contains(str)) {
                return;
            }
            listV.add(str);
            com.huawei.openalliance.ad.utils.d.a(this.f20126a, listV);
            hw.a("PreCheckFilter", "add app to insApp file ,PkgNameEncoded: %s", str);
            return;
        }
        if (listV.contains(str)) {
            listV.remove(str);
            com.huawei.openalliance.ad.utils.d.a(this.f20126a, listV);
            hw.a("PreCheckFilter", "remove app to insApp file ,PkgNameEncoded: %s", str);
        }
    }

    private int a(MetaData metaData, String str) {
        ApkInfo apkInfoS;
        int iD = d(metaData);
        if (com.huawei.openalliance.ad.utils.k.a(this.f20126a, str, (metaData == null || (apkInfoS = metaData.s()) == null) ? null : apkInfoS.a(), (com.huawei.openalliance.ad.utils.dcservice.c) null, false) == null) {
            if (iD != 1) {
                return iD != 2 ? 7 : 2;
            }
            return 3;
        }
        if (iD != 1) {
            return iD != 2 ? 8 : 5;
        }
        return 4;
    }

    qk(Context context) {
        this.f20126a = context.getApplicationContext();
    }
}
