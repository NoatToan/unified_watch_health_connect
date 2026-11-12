package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import androidx.media3.common.C;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.ui.main.stories.health.request.InvoiceDetailInfo;
import com.huawei.ui.main.stories.health.request.InvoiceRequestInfo;
import health.compact.a.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class vdf {
    public static void a(String str, Handler handler) {
        c(str, handler, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }

    public static void d(String str, Handler handler) {
        c(str, handler, 6000L);
    }

    public static void c(final String str, final Handler handler, long j) {
        handler.postDelayed(new Runnable() { // from class: vdi
            @Override // java.lang.Runnable
            public final void run() {
                vdf.e(str, handler);
            }
        }, j);
    }

    public static void e(String str, final Handler handler) {
        vdb.c(str, new UiCallback<List<InvoiceRequestInfo>>() { // from class: vdf.3
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str2) {
                Message.obtain(handler, 2).sendToTarget();
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(List<InvoiceRequestInfo> list) {
                if (njy.e(list)) {
                    LogUtil.d("InvoiceUtil", "query results is null");
                    Message.obtain(handler, 2).sendToTarget();
                    return;
                }
                InvoiceRequestInfo invoiceRequestInfo = list.get(0);
                InvoiceDetailInfo invoiceDetailInfoB = vdf.b(list);
                Message messageObtain = Message.obtain(handler, invoiceRequestInfo.getRequestStatus().intValue());
                Bundle bundle = new Bundle();
                bundle.putLong("invoiceTime", invoiceDetailInfoB.getInvoiceTime());
                bundle.putInt("customerType", invoiceRequestInfo.getCustomerType());
                bundle.putString("invoiceType", invoiceRequestInfo.getInvoiceType());
                messageObtain.setData(bundle);
                messageObtain.sendToTarget();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InvoiceDetailInfo b(List<InvoiceRequestInfo> list) {
        LogUtil.b("InvoiceUtil", "parseQueryResult");
        InvoiceDetailInfo invoiceDetailInfo = new InvoiceDetailInfo();
        invoiceDetailInfo.setInvoiceStatus(0);
        if (!njy.e(list)) {
            List<InvoiceDetailInfo> invoiceList = list.get(0).getInvoiceList();
            if (!njy.e(invoiceList)) {
                return invoiceList.get(0);
            }
        }
        return invoiceDetailInfo;
    }
}
