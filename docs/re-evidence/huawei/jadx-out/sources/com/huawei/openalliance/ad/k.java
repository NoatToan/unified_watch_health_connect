package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class k extends j {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    @Override // com.huawei.openalliance.ad.j, com.huawei.openalliance.ad.g
    public void a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        String str2;
        int i;
        byte b2;
        if (hw.a()) {
            hw.a("JsbClickComplianceEle", "start");
        }
        String strOptString = new JSONObject(str).optString(JsbMapKeyNames.H5_COMPLIANCE_TYPE, "");
        hw.b("JsbClickComplianceEle", "type:" + strOptString);
        ContentRecord contentRecordB = b(context, str);
        if (contentRecordB != null) {
            AppInfo appInfoAg = contentRecordB.ag();
            if (appInfoAg != null) {
                strOptString.hashCode();
                switch (strOptString) {
                    case "privacyUrl":
                        b2 = 0;
                        break;
                    case "permissionInWeb":
                        b2 = 1;
                        break;
                    case "permissionUrl":
                        b2 = 2;
                        break;
                    case "privacyInWeb":
                        b2 = 3;
                        break;
                    case "appDetailUrl":
                        b2 = 4;
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                if (b2 == 0) {
                    appInfoAg.showPrivacyPolicy(a(context));
                } else if (b2 == 1) {
                    appInfoAg.showPermissionPageInWeb(a(context));
                } else if (b2 == 2) {
                    appInfoAg.showPermissionPage(a(context));
                } else if (b2 == 3) {
                    appInfoAg.showPrivacyPolicyInWeb(a(context));
                } else if (b2 == 4) {
                    com.huawei.openalliance.ad.inter.data.e eVarA = pl.a(context, contentRecordB, true);
                    MaterialClickInfo materialClickInfo = (MaterialClickInfo) com.huawei.openalliance.ad.utils.bk.b(str, MaterialClickInfo.class, new Class[0]);
                    if (materialClickInfo == null || !com.huawei.openalliance.ad.utils.dg.r(materialClickInfo.f()) || materialClickInfo.b() == null) {
                        eVarA.showAppDetailPage(a(context));
                    } else {
                        eVarA.a(a(context), materialClickInfo);
                    }
                }
                i = 1000;
            } else {
                str2 = "appInfo not exist";
            }
            a(remoteCallResultCallback, this.f19295a, i, null, true);
        }
        str2 = "ad not exist";
        hw.a("JsbClickComplianceEle", str2);
        i = 3002;
        a(remoteCallResultCallback, this.f19295a, i, null, true);
    }

    public k() {
        super("pps.click.complianceele");
    }
}
