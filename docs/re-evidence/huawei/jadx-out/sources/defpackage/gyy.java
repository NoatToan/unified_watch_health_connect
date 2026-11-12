package defpackage;

import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import health.compact.a.GRSManager;
import health.compact.a.Utils;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes31.dex */
public class gyy {

    public static class c {
        public static boolean d() {
            return Utils.o();
        }
    }

    public static class a {
        public static void a(String str, final GrsQueryCallback grsQueryCallback) {
            if (grsQueryCallback == null) {
                return;
            }
            GRSManager.c(btx.c()).d(str, new GrsQueryCallback() { // from class: gyy.a.5
                @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                public void onCallBackSuccess(String str2) {
                    LogUtil.e("Suggestion_CommonUtilSug", "GRSManagerSug onCallBackSuccess url = ", str2);
                    if (str2 == null) {
                        LogUtil.c("Suggestion_CommonUtilSug", "GRSManagerSug onCallBackSuccess url == null");
                        grsQueryCallback.onCallBackFail(-1);
                    } else if (str2.startsWith("http://") || str2.startsWith("https://")) {
                        grsQueryCallback.onCallBackSuccess(str2);
                    } else {
                        LogUtil.c("Suggestion_CommonUtilSug", "GRSManagerSug onCallBackSuccess url not http:// or https://");
                        grsQueryCallback.onCallBackFail(-99);
                    }
                }

                @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
                public void onCallBackFail(int i) {
                    LogUtil.c("Suggestion_CommonUtilSug", "GRSManagerSug onCallBackFail errorCode = ", Integer.valueOf(i));
                    grsQueryCallback.onCallBackFail(i);
                }
            });
        }
    }
}
