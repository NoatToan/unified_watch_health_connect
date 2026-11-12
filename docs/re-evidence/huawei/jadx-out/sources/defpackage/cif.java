package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX INFO: loaded from: classes4.dex */
public class cif {
    public static Intent d() {
        if (!cic.d(chm.c(), "com.tencent.mm")) {
            cib.b("WeiXinUtil", "weixin not install");
            return null;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.tencent.mm", "com.tencent.mm.ui.LauncherUI"));
        intent.putExtra("LauncherUI.From.Scaner.Shortcut", true);
        intent.setFlags(335544320);
        intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
        cib.b("WeiXinUtil", "openWeiXinScan");
        return intent;
    }
}
