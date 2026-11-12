package com.huawei.openalliance.ad.utils.dcservice;

import android.content.Context;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.openalliance.ad.constant.ConfigMapKeys;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.constant.RTCMethods;
import com.huawei.openalliance.ad.db.bean.SdkCfgSha256Record;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.gk;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.GameData;
import com.huawei.openalliance.ad.inter.listeners.ISyncPlayedGameListener;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import com.huawei.openalliance.ad.na;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.o;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class a {

    /* JADX INFO: renamed from: com.huawei.openalliance.ad.utils.dcservice.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: classes41.dex */
    static class C0235a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ISyncPlayedGameListener f20627a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Context f20628b;

        @Override // com.huawei.openalliance.ad.utils.dcservice.b
        public void a(String str) {
            String str2;
            try {
                hw.b("DcServiceCmdManager", "data is %s.", str);
                PlayedGameRsp playedGameRsp = (PlayedGameRsp) bk.b(this.f20628b, str, PlayedGameRsp.class, new Class[0]);
                if (playedGameRsp != null && playedGameRsp.a() != null) {
                    fp.b(this.f20628b).D(str);
                    List<GameData> listA = playedGameRsp.a();
                    if (bm.a(listA)) {
                        hw.b("DcServiceCmdManager", "query game list from dc success. but no data.");
                        str2 = "0";
                    } else {
                        ISyncPlayedGameListener iSyncPlayedGameListener = this.f20627a;
                        if (iSyncPlayedGameListener != null) {
                            iSyncPlayedGameListener.onResult(listA);
                        }
                        str2 = "" + listA.size();
                    }
                    a(true, str2);
                    return;
                }
                hw.b("DcServiceCmdManager", "handle game cmd onSuccess, result is invalid.");
            } catch (Throwable th) {
                hw.c("DcServiceCmdManager", "handle game cmd onSuccess err: %s", th.getClass().getSimpleName());
            }
        }

        @Override // com.huawei.openalliance.ad.utils.dcservice.b
        public void a(int i) {
            a(false, "" + i);
        }

        private void a(boolean z, final String str) {
            final long jCurrentTimeMillis = System.currentTimeMillis() - fp.b(this.f20628b).cJ();
            hw.a("DcServiceCmdManager", "reportResult, isSuccess: %s, extraInfo: %s, queryTime: %s", Boolean.valueOf(z), str, Long.valueOf(jCurrentTimeMillis));
            final String str2 = z ? "1" : "0";
            o.f(new Runnable() { // from class: com.huawei.openalliance.ad.utils.dcservice.a.a.1
                @Override // java.lang.Runnable
                public void run() {
                    new com.huawei.openalliance.ad.analysis.c(C0235a.this.f20628b.getApplicationContext()).b("" + jCurrentTimeMillis, str2, str);
                }
            });
        }

        public C0235a(ISyncPlayedGameListener iSyncPlayedGameListener, Context context) {
            this.f20627a = iSyncPlayedGameListener;
            this.f20628b = context.getApplicationContext();
        }
    }

    public static void a(final ISyncPlayedGameListener iSyncPlayedGameListener, final Context context, final int i) {
        if (context == null || iSyncPlayedGameListener == null) {
            return;
        }
        o.f(new Runnable() { // from class: com.huawei.openalliance.ad.utils.dcservice.a.3
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("dc_service_cmd", 10002);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("size", i);
                    jSONObject.put(RemoteMessageConst.MessageBody.PARAM, jSONObject2);
                    a.a(context, jSONObject, new C0235a(iSyncPlayedGameListener, context));
                } catch (JSONException unused) {
                    hw.c("DcServiceCmdManager", "queryPlayedGame JSONException");
                } catch (Throwable th) {
                    hw.c("DcServiceCmdManager", "queryPlayedGame err: %s", th.getClass().getSimpleName());
                }
            }
        });
    }

    public static void a(Context context, JSONObject jSONObject, final b bVar) {
        na.a(context).a(RTCMethods.DC_BRIDGE, jSONObject.toString(), new RemoteCallResultCallback<String>() { // from class: com.huawei.openalliance.ad.utils.dcservice.a.1
            @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
            public void onRemoteCallResult(String str, CallResult<String> callResult) {
                try {
                    if (callResult == null) {
                        hw.a("DcServiceCmdManager", "query DC_BRIDGE from hms no result");
                        return;
                    }
                    if (callResult.getCode() == 200) {
                        hw.a("DcServiceCmdManager", "query DC_BRIDGE from hms success!");
                        b bVar2 = bVar;
                        if (bVar2 != null) {
                            bVar2.a(callResult.getData());
                            return;
                        }
                        return;
                    }
                    hw.b("DcServiceCmdManager", "failed to query DC_BRIDGE from hms");
                    b bVar3 = bVar;
                    if (bVar3 != null) {
                        bVar3.a(callResult.getCode());
                    }
                } catch (Throwable th) {
                    hw.d("DcServiceCmdManager", "get DC_BRIDGE from hms err : %s", th.getClass().getSimpleName());
                }
            }
        }, String.class);
    }

    public static void a(final Context context, final c cVar) {
        if (context == null || cVar == null) {
            return;
        }
        o.f(new Runnable() { // from class: com.huawei.openalliance.ad.utils.dcservice.a.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if ("com.huawei.hwid".equals(cVar.f())) {
                        hw.b("DcServiceCmdManager", "package is hms package name");
                        return;
                    }
                    hw.b("DcServiceCmdManager", "enter send redirection match record");
                    gk gkVarB = fp.b(context);
                    String strB = gkVarB.b(ConfigMapKeys.REDIRECTION_APP_LIST, "");
                    String strB2 = gkVarB.b(ConfigMapKeys.REDIRECTION_MEDIA_LIST, "");
                    hw.a("DcServiceCmdManager", "redirectionAppList from configMap : %s; redirectionMediaList from configMap : %s", strB, strB2);
                    List<String> listA = dg.a(strB, ",");
                    List<String> listA2 = dg.a(strB2, ",");
                    boolean z = false;
                    boolean z2 = !bm.a(listA) && listA.contains(cVar.f());
                    if (!bm.a(listA2) && listA2.contains(context.getPackageName())) {
                        z = true;
                    }
                    if (!z2 && !z) {
                        hw.b("DcServiceCmdManager", "package is not in package list, appPkgName: %s, mediaPkgName: %s", cVar.f(), context.getPackageName());
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("dc_service_cmd", 10001);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("taskId", cVar.e());
                    jSONObject2.put("slotId", cVar.c());
                    jSONObject2.put("requestId", cVar.d());
                    jSONObject2.put("contentId", cVar.b());
                    jSONObject2.put(SdkCfgSha256Record.PKGNAME, cVar.f());
                    jSONObject2.put("callerPkgName", context.getPackageName());
                    jSONObject2.put("activityName", cVar.g());
                    jSONObject2.put("triggerTime", System.currentTimeMillis());
                    jSONObject2.put(MapKeyNames.PARAM_FROM_SERVER, cVar.h());
                    hw.a("DcServiceCmdManager", "send direction match record : %s", jSONObject2.toString());
                    jSONObject.put(RemoteMessageConst.MessageBody.PARAM, jSONObject2);
                    a.a(context, jSONObject, (b) null);
                } catch (JSONException e) {
                    hw.d("DcServiceCmdManager", "json exception sendRedirectionMatchRecord : %s", e.getClass().getSimpleName());
                }
            }
        });
    }
}
