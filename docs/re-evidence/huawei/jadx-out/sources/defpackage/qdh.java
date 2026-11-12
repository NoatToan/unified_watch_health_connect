package defpackage;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.messagecenter.model.MessageConstant;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.networkclient.IRequest;
import com.huawei.networkclient.ResultCallback;
import health.compact.a.CommonUtil;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public class qdh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final qdn f46017a = new qdn();

    private static <T> void a(String str, Map<String, String> map, String str2, Class<T> cls, ResultCallback<T> resultCallback) {
        LogUtil.b("SummaryCloudUtil", "callHttpPost url ", str, " headers ", map, " body ", str2);
        try {
            oet.d().c(str, map, str2, cls, resultCallback);
        } catch (OutOfMemoryError e) {
            ReleaseLogUtil.b("R_SummaryCloudUtil", "callHttpPost error ", ExceptionUtils.c(e));
        }
    }

    private static boolean c() {
        boolean zAb = CommonUtil.ab(BaseApplication.b());
        boolean zH = Utils.h();
        ReleaseLogUtil.c("R_SummaryCloudUtil", "isVerify isNetworkConnected ", Boolean.valueOf(zAb), " isAllowLogin ", Boolean.valueOf(zH));
        return zAb && zH;
    }

    public static List<String> e() {
        List<String> listB = b();
        listB.add(MessageConstant.BLOOD_PRESSURE_TYPE);
        listB.add("emotionalHealth");
        listB.add("step");
        listB.add("heartHealth");
        listB.add("sleep");
        listB.add("running");
        listB.add("ridden");
        listB.add("readiness");
        return listB;
    }

    public static List<String> b() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add("activityRings");
        arrayList.add("calorie");
        arrayList.add("activeHour");
        arrayList.add("exerciseTimeLen");
        return arrayList;
    }

    public static void a(final IRequest iRequest, final ResponseCallback<String> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("R_SummaryCloudUtil", "getSummaryResponse callback is null");
            return;
        }
        if (iRequest == null) {
            ReleaseLogUtil.d("R_SummaryCloudUtil", "getSummaryResponse request is null");
            return;
        }
        if (!c()) {
            responseCallback.onResponse(-1, null);
        } else {
            if (HandlerExecutor.c()) {
                ThreadPoolManager.c().execute(new Runnable() { // from class: qdk
                    @Override // java.lang.Runnable
                    public final void run() {
                        qdh.a(iRequest, responseCallback);
                    }
                });
                return;
            }
            String url = iRequest.getUrl();
            qdn qdnVar = f46017a;
            a(url, qdnVar.getHeaders(), HiJsonUtil.d(qdnVar.getBody(iRequest)), String.class, new ResultCallback<String>() { // from class: qdh.4
                @Override // com.huawei.networkclient.ResultCallback
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void onSuccess(String str) {
                    LogUtil.b("SummaryCloudUtil", "getSummaryResponse response ", str);
                    if (TextUtils.isEmpty(str)) {
                        ReleaseLogUtil.d("R_SummaryCloudUtil", "getSummaryResponse response is null");
                        responseCallback.onResponse(-1, null);
                        return;
                    }
                    try {
                        responseCallback.onResponse(new JSONObject(str).optInt("resultCode"), str);
                    } catch (JSONException e) {
                        String strC = ExceptionUtils.c(e);
                        ReleaseLogUtil.d("SummaryCloudUtil", "getSummaryResponse exception ", strC);
                        responseCallback.onResponse(-1, strC);
                    }
                }

                @Override // com.huawei.networkclient.ResultCallback
                public void onFailure(Throwable th) {
                    ReleaseLogUtil.b("R_SummaryCloudUtil", "getSummaryResponse throwable ", ExceptionUtils.c(th));
                    responseCallback.onResponse(-1, null);
                }
            });
        }
    }

    public static void b(final ResponseCallback<qdw> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("R_SummaryCloudUtil", "getHighlights callback is null");
        } else {
            a(new qdv(e(), true), new ResponseCallback() { // from class: qdl
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    qdh.e(responseCallback, i, (String) obj);
                }
            });
        }
    }

    static /* synthetic */ void e(ResponseCallback responseCallback, int i, String str) {
        qdm.a(str);
        qee qeeVar = (qee) HiJsonUtil.d(str, qee.class);
        if (qeeVar == null) {
            ReleaseLogUtil.d("R_SummaryCloudUtil", "getHighlights response is null");
            responseCallback.onResponse(i, null);
        } else {
            responseCallback.onResponse(i, qeeVar.a());
        }
    }

    public static void d(final ResponseCallback<String> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("R_SummaryCloudUtil", "getHealthHighlights callback is null");
        } else {
            a(new qdv(e(), true, !Utils.o() ? 1 : 7), new ResponseCallback() { // from class: qdi
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    responseCallback.onResponse(i, (String) obj);
                }
            });
        }
    }
}
