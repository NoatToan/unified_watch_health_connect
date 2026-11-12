package com.huawei.openalliance.ad.utils;

import android.content.Context;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.openalliance.ad.constant.ConfigMapKeys;
import com.huawei.openalliance.ad.db.bean.IntentDataRecord;
import com.huawei.openalliance.ad.ff;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.hw;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class bg {

    static class a implements com.huawei.openalliance.ad.utils.dcservice.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<IntentDataRecord> f20489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Context f20490b;

        @Override // com.huawei.openalliance.ad.utils.dcservice.b
        public void a(String str) {
            hw.b("IntentDataSyncUtil", "onSuccess");
            ff.a(this.f20490b).a(this.f20489a);
            hw.a("IntentDataSyncUtil", "delete Synchronized record %s", this.f20489a);
        }

        @Override // com.huawei.openalliance.ad.utils.dcservice.b
        public void a(int i) {
            hw.b("IntentDataSyncUtil", "onError");
        }

        public a(List<IntentDataRecord> list, Context context) {
            this.f20489a = list;
            this.f20490b = context;
        }
    }

    public static void b(Context context) {
        if (!com.huawei.openalliance.ad.cc.a(context).d() || !com.huawei.openalliance.ad.cc.g(context)) {
            hw.a("IntentDataSyncUtil", "not ChinaROM or not Huawei Device");
            return;
        }
        hw.a("IntentDataSyncUtil", "intentEventIntvl %s", Integer.valueOf(fp.b(context).aB()));
        if (fp.b(context).c(ConfigMapKeys.INTENT_EVENT_INTVL, 60)) {
            hw.a("IntentDataSyncUtil", "within intent event intval");
        } else {
            fp.b(context).s(ConfigMapKeys.INTENT_EVENT_INTVL);
            a(context);
        }
    }

    public static void a(final Context context) {
        o.f(new Runnable() { // from class: com.huawei.openalliance.ad.utils.bg.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    int iAA = fp.b(context).aA();
                    hw.a("IntentDataSyncUtil", "clearIntentDataIntvl is %s", Integer.valueOf(iAA));
                    if (iAA < 0) {
                        return;
                    }
                    ff.a(context).a(System.currentTimeMillis() - (((long) iAA) * 86400000));
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("dc_service_cmd", 10003);
                    int iAz = fp.b(context).az();
                    hw.a("IntentDataSyncUtil", "intentEventLimit is %s", Integer.valueOf(iAz));
                    if (iAz <= 0) {
                        return;
                    }
                    List<IntentDataRecord> listA = ff.a(context).a(iAz);
                    hw.a("IntentDataSyncUtil", "queryLatestNRecords size is %s", Integer.valueOf(listA.size()));
                    if (listA.isEmpty()) {
                        hw.c("IntentDataSyncUtil", "intentData is empty");
                        return;
                    }
                    jSONObject.put(RemoteMessageConst.MessageBody.PARAM, bk.b(listA));
                    Context context2 = context;
                    com.huawei.openalliance.ad.utils.dcservice.a.a(context2, jSONObject, new a(listA, context2));
                } catch (Throwable th) {
                    hw.c("IntentDataSyncUtil", "syncIntentDataInner err: %s", th.getClass().getSimpleName());
                }
            }
        });
    }
}
