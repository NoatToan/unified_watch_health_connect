package defpackage;

import android.os.Message;
import com.huawei.basichealthmodel.ui.dialog.HealthLifeTaskDialog;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes23.dex */
public class caw extends BaseHandler<HealthLifeTaskDialog.Builder> {
    public caw(HealthLifeTaskDialog.Builder builder) {
        super(builder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.haf.handler.BaseHandler
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void handleMessageWhenReferenceNotNull(HealthLifeTaskDialog.Builder builder, Message message) {
        int i = message.what;
        Object obj = message.obj;
        LogUtil.a("HL_HealthLifeTaskDialogHandler", "handleMessageWhenReferenceNotNull what ", Integer.valueOf(i), " object ", obj);
        if (i == 2000) {
            if (obj instanceof Number) {
                builder.e(((Integer) obj).intValue());
            }
        } else {
            if (i == 3000) {
                if (obj instanceof Number) {
                    builder.c(((Integer) obj).intValue());
                    return;
                }
                return;
            }
            LogUtil.j("HL_HealthLifeTaskDialogHandler", "handleMessageWhenReferenceNotNull builder ", builder, " message ", message);
        }
    }
}
