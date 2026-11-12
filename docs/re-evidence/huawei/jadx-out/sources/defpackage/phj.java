package defpackage;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.messagecenter.model.IpushBase;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginmessagecenter.manager.MCNotificationManager;
import health.compact.a.utils.StringUtils;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes42.dex */
public class phj implements IpushBase {
    @Override // com.huawei.health.messagecenter.model.IpushBase
    public List<String> getPushType() {
        return Arrays.asList("toWallet");
    }

    @Override // com.huawei.health.messagecenter.model.IpushBase
    public void processPushMsg(Context context, String str) {
        MessageObject messageObjectE = e(str);
        if (messageObjectE == null) {
            return;
        }
        LogUtil.a("WalletMarketMsgHandler", "send wallet market msg");
        MCNotificationManager.showNotification(BaseApplication.b(), messageObjectE);
    }

    private MessageObject e(String str) {
        if (StringUtils.g(str)) {
            LogUtil.e("WalletMarketMsgHandler", "createNotifyMsg： msg cannot be null or empty.");
            return null;
        }
        try {
            phi phiVar = (phi) new Gson().fromJson(str, phi.class);
            if (!phiVar.d()) {
                return null;
            }
            MessageObject messageObject = new MessageObject();
            try {
                messageObject.setType(phiVar.b());
                messageObject.setMsgContent(phiVar.c());
                messageObject.setDetailUri(phiVar.a());
                messageObject.setMsgTitle(phiVar.e());
                messageObject.setPosition(3);
                messageObject.setReadFlag(0);
                messageObject.setMsgId("123456");
                return messageObject;
            } catch (JsonSyntaxException unused) {
                return messageObject;
            }
        } catch (JsonSyntaxException unused2) {
            return null;
        }
    }
}
