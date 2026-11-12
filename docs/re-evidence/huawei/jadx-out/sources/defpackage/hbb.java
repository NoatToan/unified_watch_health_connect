package defpackage;

import android.content.Context;
import android.os.SystemClock;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.sport.utils.ResultUtil;
import com.huawei.health.sportservice.download.cloud.VoiceDataApi;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import health.compact.a.LogAnonymous;
import health.compact.a.ReleaseLogUtil;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class hbb implements VoiceDataApi {
    @Override // com.huawei.health.sportservice.download.cloud.VoiceDataApi
    /* JADX INFO: renamed from: getVoiceBroadcastList, reason: merged with bridge method [inline-methods] */
    public void b(final Context context, final List<hbj> list, final UiCallback<List<hbh>> uiCallback) {
        if (njy.e(list)) {
            LogUtil.j("Suggestion_VoiceDataImpl", "getVoiceBroadcastList: ");
            if (uiCallback != null) {
                uiCallback.onFailure(-1, "broadcastInfoList is empty");
                return;
            }
            return;
        }
        if (HandlerExecutor.d()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: hbc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36343b.b(context, list, uiCallback);
                }
            });
            return;
        }
        ReleaseLogUtil.c("Suggestion_VoiceDataImpl", " getVoiceBroadcastList begin.");
        chj chjVar = new chj();
        hbi hbiVar = new hbi();
        hbiVar.b(list);
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        oet.d().c(hbiVar.getUrl(), chjVar.getHeaders(), ofe.c(chjVar.getBody(hbiVar)), hbg.class, new ResultCallback<hbg>() { // from class: hbb.2
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(hbg hbgVar) {
                ReleaseLogUtil.c("Suggestion_VoiceDataImpl", " getVoiceBroadcastList data=", hbgVar);
                if (hbgVar == null || hbgVar.getResultCode() == null || hbgVar.getResultCode().intValue() != 0) {
                    hbb.d(uiCallback);
                    if (hbgVar == null || hbgVar.getResultCode() == null) {
                        return;
                    }
                    hbb.this.b(hbgVar.getResultCode().intValue(), jElapsedRealtime);
                    return;
                }
                hbb.a(hbgVar.b(), uiCallback);
                hbb.this.d(jElapsedRealtime);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                ReleaseLogUtil.c("Suggestion_VoiceDataImpl", "getVoiceBroadcastList failed. throwable= ", LogAnonymous.b(th));
                hbb.d(uiCallback);
                hbb.this.b(9999, jElapsedRealtime);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void a(T t, UiCallback<T> uiCallback) {
        if (uiCallback != null) {
            uiCallback.onSuccess(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void d(UiCallback<T> uiCallback) {
        if (uiCallback != null) {
            uiCallback.onFailure(-2, ResultUtil.c(9999));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
        if (jElapsedRealtime >= 5000) {
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(4);
            linkedHashMap.put("module", "3");
            linkedHashMap.put("status", "0");
            linkedHashMap.put(OpAnalyticsConstants.DELAY, String.valueOf(jElapsedRealtime));
            linkedHashMap.put(OpAnalyticsConstants.ERROR_CODE, String.valueOf(200));
            OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_REQUEST_MODULE_85030001.value(), linkedHashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(4);
        linkedHashMap.put("module", "3");
        linkedHashMap.put("status", "1");
        linkedHashMap.put(OpAnalyticsConstants.DELAY, String.valueOf(jElapsedRealtime - j));
        linkedHashMap.put(OpAnalyticsConstants.ERROR_CODE, String.valueOf(i));
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_REQUEST_MODULE_85030001.value(), linkedHashMap);
    }
}
