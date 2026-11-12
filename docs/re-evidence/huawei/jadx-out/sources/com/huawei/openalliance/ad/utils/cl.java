package com.huawei.openalliance.ad.utils;

import android.content.Context;
import com.huawei.openalliance.ad.constant.RTCMethods;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import com.huawei.openalliance.ad.na;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes41.dex */
public class cl {
    private static void a(final Context context, final Map<String, String> map, final String[] strArr, final CountDownLatch countDownLatch) {
        o.f(new Runnable() { // from class: com.huawei.openalliance.ad.utils.cl.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    na.a(context).a(RTCMethods.QUERY_FIRST_OPEN_FLAG, bk.b(map), new RemoteCallResultCallback<String>() { // from class: com.huawei.openalliance.ad.utils.cl.1.1
                        @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
                        public void onRemoteCallResult(String str, CallResult<String> callResult) {
                            hw.a("PreCheckUtil", "preCheck: sync method execute call");
                            if (callResult == null || callResult.getCode() != 200) {
                                hw.a("PreCheckUtil", "preCheck: query first open info error, result is null : %s, result code is : %s", Boolean.valueOf(callResult == null), Integer.valueOf(callResult == null ? -2 : callResult.getCode()));
                            } else {
                                hw.a("PreCheckUtil", "preCheck: sync ca code:" + callResult.getCode() + " result: " + callResult.getData());
                                if (!dg.b(callResult.getData())) {
                                    strArr[0] = callResult.getData();
                                }
                            }
                            countDownLatch.countDown();
                        }
                    }, String.class);
                } catch (Throwable th) {
                    countDownLatch.countDown();
                    hw.c("PreCheckUtil", "preCheck: sync ca failed: %s", th.getClass().getSimpleName());
                }
            }
        });
    }

    public static void a(final Context context, final Map<String, String> map, final long j, final List<String> list, final String str) {
        o.h(new Runnable() { // from class: com.huawei.openalliance.ad.utils.cl.2
            @Override // java.lang.Runnable
            public void run() {
                new com.huawei.openalliance.ad.analysis.c(context).a(bk.b(map), j, bk.b(list), str);
            }
        });
    }

    public static List<String> a(Context context, Map<String, String> map, List<String> list) {
        if (br.a(map) || bm.a(list)) {
            hw.a("PreCheckUtil", "checkMap or contentIds is blank");
            a(context, map, -1L, list, null);
            return new ArrayList();
        }
        String[] strArr = new String[1];
        CountDownLatch countDownLatch = new CountDownLatch(1);
        long jC = as.c();
        a(context, map, strArr, countDownLatch);
        if (!countDownLatch.await(200L, TimeUnit.MILLISECONDS)) {
            hw.c("PreCheckUtil", "preCheck: await do failed!");
        }
        long jC2 = as.c() - jC;
        if (!dg.b(strArr[0])) {
            list.retainAll((List) bk.b(strArr[0], List.class, new Class[0]));
        } else if (hw.a()) {
            hw.a("PreCheckUtil", "get the value from ppskit is empty, duration is : %s", Long.valueOf(jC2));
        }
        a(context, map, jC2, list, null);
        return list;
    }
}
