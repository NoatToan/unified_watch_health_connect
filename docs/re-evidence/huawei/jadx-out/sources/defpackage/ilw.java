package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.tradeservice.cloud.OrderManager;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.iap.Iap;
import com.huawei.hms.iap.IapApiException;
import com.huawei.hms.iap.entity.InAppPurchaseData;
import com.huawei.hms.iap.entity.OwnedPurchasesReq;
import com.huawei.hms.iap.entity.OwnedPurchasesResult;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.trade.datatype.OrderBriefInfo;
import health.compact.a.CommonUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONException;

/* JADX INFO: loaded from: classes32.dex */
public class ilw {
    private static volatile ilw d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f37789a = BaseApplication.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f37790b = "";

    private ilw() {
    }

    public static ilw c() {
        if (d == null) {
            synchronized (ilw.class) {
                if (d == null) {
                    d = new ilw();
                }
            }
        }
        return d;
    }

    public void e(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f37790b) && this.f37790b.equals(LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1011))) {
            LogUtil.j("TradeService_PayService", "startRetrievingOrders same huid");
        } else {
            ThreadPoolManager.c().c("TradeService_PayService", null);
            ThreadPoolManager.c().b("TradeService_PayService", new Runnable() { // from class: ilw.1
                @Override // java.lang.Runnable
                public void run() {
                    ilw.this.b();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (CommonUtil.ca()) {
            return;
        }
        if (Utils.k()) {
            LogUtil.a("TradeService_PayService", "retrievingOrders isOverseaNoCloudVersion !!");
            return;
        }
        if (!LoginInit.getInstance(this.f37789a).getIsLogined()) {
            LogUtil.a("TradeService_PayService", "retrievingOrders login in first !!");
            return;
        }
        LogUtil.a("TradeService_PayService", "retrievingOrders enter");
        this.f37790b = LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1011);
        long jA = a();
        final long jE = e(jA);
        OrderManager.orderQueryHistory(jE, jA, 0L, new IBaseResponseCallback() { // from class: ilw.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == 0 && (obj instanceof List)) {
                    StringBuilder sb = new StringBuilder("retrievingOrders last month order size = ");
                    List list = (List) obj;
                    sb.append(list.size());
                    LogUtil.a("TradeService_PayService", sb.toString());
                    ilw.this.d(jE, 1, list);
                    ilw.this.d(jE, 2, list);
                }
            }
        });
        d(0L, 0, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final long j, int i, final List<OrderBriefInfo> list) {
        LogUtil.a("TradeService_PayService", "getIapOrder：getIapOrder enter [" + i + "]");
        OwnedPurchasesReq ownedPurchasesReq = new OwnedPurchasesReq();
        ownedPurchasesReq.setPriceType(i);
        ownedPurchasesReq.setSignatureAlgorithm("SHA256WithRSA/PSS");
        Task<OwnedPurchasesResult> taskObtainOwnedPurchases = Iap.getIapClient(this.f37789a, ily.b()).obtainOwnedPurchases(ownedPurchasesReq);
        if (taskObtainOwnedPurchases == null) {
            LogUtil.e("TradeService_PayService", "getIapOrder：create task failed !!");
        } else {
            taskObtainOwnedPurchases.addOnSuccessListener(new OnSuccessListener<OwnedPurchasesResult>() { // from class: ilw.3
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(OwnedPurchasesResult ownedPurchasesResult) {
                    if (ownedPurchasesResult == null || ownedPurchasesResult.getInAppPurchaseDataList() == null) {
                        return;
                    }
                    LogUtil.a("TradeService_PayService", "getIapOrder from iap size = " + ownedPurchasesResult.getInAppPurchaseDataList().size());
                    for (int i2 = 0; i2 < ownedPurchasesResult.getInAppPurchaseDataList().size(); i2++) {
                        try {
                            ilw.this.a(ownedPurchasesResult.getInAppPurchaseDataList().get(i2), ownedPurchasesResult.getInAppSignature().get(i2), j, (List<OrderBriefInfo>) list);
                        } catch (JSONException unused) {
                            LogUtil.e("TradeService_PayService", "getIapOrder：JSONException");
                        }
                    }
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: ilw.5
                @Override // com.huawei.hmf.tasks.OnFailureListener
                public void onFailure(Exception exc) {
                    if (exc instanceof IapApiException) {
                        IapApiException iapApiException = (IapApiException) exc;
                        Status status = iapApiException.getStatus();
                        LogUtil.e("TradeService_PayService", "getIapOrder：createPurchaseIntent returnCode = " + iapApiException.getStatusCode() + ", status = " + status);
                        return;
                    }
                    LogUtil.e("TradeService_PayService", "getIapOrder：Exception：" + exc.getClass().getSimpleName());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, long j, List<OrderBriefInfo> list) throws JSONException {
        InAppPurchaseData inAppPurchaseData = new InAppPurchaseData(str);
        if (inAppPurchaseData.getPurchaseState() != 0) {
            LogUtil.j("TradeService_PayService", "checkOrder iap order is not purchased " + inAppPurchaseData.getOrderID());
        } else {
            if (inAppPurchaseData.getPurchaseTime() < j || c(inAppPurchaseData, list)) {
                return;
            }
            LogUtil.a("TradeService_PayService", "checkOrder health order: " + inAppPurchaseData.getDeveloperPayload() + " iap order: " + inAppPurchaseData.getOrderID());
            OrderManager.orderRedelivery(inAppPurchaseData.getDeveloperPayload(), str, str2, new IBaseResponseCallback() { // from class: ilw.2
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.j("TradeService_PayService", "checkOrder：orderRedelivery errorCode = " + i);
                }
            });
        }
    }

    private boolean c(InAppPurchaseData inAppPurchaseData, List<OrderBriefInfo> list) {
        if (njy.e(list)) {
            return false;
        }
        Iterator<OrderBriefInfo> it = list.iterator();
        while (it.hasNext()) {
            if (inAppPurchaseData.getOrderID().equals(it.next().getOrderId())) {
                return true;
            }
        }
        return false;
    }

    private long a() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("GMT"));
        return calendar.getTimeInMillis();
    }

    private long e(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("GMT"));
        calendar.setTimeInMillis(j);
        calendar.add(2, -1);
        return calendar.getTimeInMillis();
    }

    public void c(String str, final IBaseResponseCallback iBaseResponseCallback) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("TradeService_PayService", "productIdList is empty.");
            iBaseResponseCallback.a(-1, "");
            return;
        }
        final List list = (List) new Gson().fromJson(str, new TypeToken<List<String>>() { // from class: com.huawei.health.tradeservice.pay.TradePayService$6
        }.getType());
        if (njy.e(list)) {
            iBaseResponseCallback.a(-1, "");
            return;
        }
        OwnedPurchasesReq ownedPurchasesReq = new OwnedPurchasesReq();
        ownedPurchasesReq.setPriceType(2);
        ownedPurchasesReq.setSignatureAlgorithm("SHA256WithRSA/PSS");
        Task<OwnedPurchasesResult> taskObtainOwnedPurchases = Iap.getIapClient(BaseApplication.b(), ily.b()).obtainOwnedPurchases(ownedPurchasesReq);
        if (taskObtainOwnedPurchases == null) {
            LogUtil.e("TradeService_PayService", "getIapOrder：create task failed !!");
            iBaseResponseCallback.a(-1, "");
        } else {
            ReleaseLogUtil.d("R_TradeService_PayService", "start obtainOwnedPurchases.");
            taskObtainOwnedPurchases.addOnSuccessListener(ThreadPoolManager.c(), new OnSuccessListener<OwnedPurchasesResult>() { // from class: ilw.6
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(OwnedPurchasesResult ownedPurchasesResult) {
                    ReleaseLogUtil.d("R_TradeService_PayService", "obtainOwnedPurchases onSuccess.");
                    Map<String, String> mapD = ilw.this.d(ownedPurchasesResult, list);
                    iBaseResponseCallback.a(0, new Gson().toJson(mapD));
                }
            }).addOnFailureListener(ThreadPoolManager.c(), new OnFailureListener() { // from class: ilw.8
                @Override // com.huawei.hmf.tasks.OnFailureListener
                public void onFailure(Exception exc) {
                    if (exc instanceof IapApiException) {
                        IapApiException iapApiException = (IapApiException) exc;
                        LogUtil.e("TradeService_PayService", "getProductState：returnCode = " + iapApiException.getStatusCode() + ", status = " + iapApiException.getStatus());
                    } else {
                        LogUtil.e("TradeService_PayService", "getProductState：Exception：" + exc.getClass().getSimpleName());
                    }
                    iBaseResponseCallback.a(-1, "");
                }
            });
        }
    }

    public Map<String, String> d(OwnedPurchasesResult ownedPurchasesResult, List<String> list) {
        HashMap map = new HashMap();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            map.put(it.next(), "0");
        }
        if (ownedPurchasesResult == null || ownedPurchasesResult.getInAppPurchaseDataList() == null) {
            LogUtil.a("TradeService_PayService", "no product info result.");
            return map;
        }
        LogUtil.a("TradeService_PayService", "getProductState from iap size = " + ownedPurchasesResult.getInAppPurchaseDataList().size());
        for (int i = 0; i < ownedPurchasesResult.getInAppPurchaseDataList().size(); i++) {
            try {
                InAppPurchaseData inAppPurchaseData = new InAppPurchaseData(ownedPurchasesResult.getInAppPurchaseDataList().get(i));
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    b(it2.next(), inAppPurchaseData, map);
                }
            } catch (JSONException unused) {
                LogUtil.e("TradeService_PayService", "getProductState：Exception.");
            }
        }
        LogUtil.d("TradeService_PayService", "getProductState finish. onRespone: ", map.toString());
        return map;
    }

    private void b(String str, InAppPurchaseData inAppPurchaseData, Map<String, String> map) {
        if (TextUtils.equals(str, inAppPurchaseData.getProductId())) {
            if (inAppPurchaseData.isAutoRenewing()) {
                if (inAppPurchaseData.isSubValid()) {
                    map.put(str, "3");
                    return;
                } else {
                    map.put(str, "2");
                    return;
                }
            }
            map.put(str, "1");
        }
    }
}
