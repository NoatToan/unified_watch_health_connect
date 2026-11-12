package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.messagecenter.model.IpushBase;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.AuthorizationUtils;
import health.compact.a.Utils;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class unj implements IpushBase {
    @Override // com.huawei.health.messagecenter.model.IpushBase
    public List<String> getPushType() {
        return null;
    }

    @Override // com.huawei.health.messagecenter.model.IpushBase
    public void processPushMsg(Context context, String str) {
        LogUtil.a("GuidePageMessageReceiver", "message:", str);
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("GuidePageMessageReceiver", "message is emyty");
            return;
        }
        if (qrs.t() || qrs.ah(BaseApplication.getContext())) {
            LogUtil.j("GuidePageMessageReceiver", "isMateX");
            return;
        }
        if (!Utils.h()) {
            LogUtil.j("GuidePageMessageReceiver", "is not allow");
        } else if (!AuthorizationUtils.c(BaseApplication.getContext())) {
            LogUtil.j("GuidePageMessageReceiver", "not Available or not Authorize");
        } else {
            unl.e(str);
        }
    }
}
