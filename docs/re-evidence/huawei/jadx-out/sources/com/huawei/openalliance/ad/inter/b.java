package com.huawei.openalliance.ad.inter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.openalliance.ad.activity.SafeIntent;
import com.huawei.openalliance.ad.beans.metadata.Monitor;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.constant.RTCMethods;
import com.huawei.openalliance.ad.constant.SpKeys;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.gk;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.LinkedSplashAd;
import com.huawei.openalliance.ad.inter.listeners.IExSplashCallback;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import com.huawei.openalliance.ad.na;
import com.huawei.openalliance.ad.ph;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.ds;
import com.huawei.openalliance.ad.utils.o;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class b extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f19143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private gk f19144b;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Log.d("ExLinkedSplashReceiver", "onReceive.");
        if (intent == null) {
            return;
        }
        try {
            SafeIntent safeIntent = new SafeIntent(intent);
            if (Constants.ACTION_EXSPLASH_START_LINKED.equals(safeIntent.getAction())) {
                a(context, safeIntent);
            }
        } catch (JSONException unused) {
            hw.c("ExLinkedSplashReceiver", "reqExLinkedVideo JSONException");
            a();
        } catch (Throwable th) {
            hw.c("ExLinkedSplashReceiver", "reqLinkedVideo exception: %s", th.getClass().getSimpleName());
        }
    }

    private void b(JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("landpage_app_prompt");
        int iOptInt2 = jSONObject.optInt("splash_skip_area");
        String strOptString = jSONObject.optString("scheme_info");
        String strOptString2 = jSONObject.optString(MapKeyNames.GLOBAL_SWITCH);
        String strOptString3 = jSONObject.optString(MapKeyNames.LANDPAGE_APP_WHITE_LIST);
        String strOptString4 = jSONObject.optString(MapKeyNames.LANDPAGE_APP_PROMPT_MAP);
        String strOptString5 = jSONObject.optString(MapKeyNames.LANDPAGE_WEB_BLACK_LIST);
        if (hw.a()) {
            hw.a("ExLinkedSplashReceiver", "landPageAppPrompt:%s", Integer.valueOf(iOptInt));
            hw.a("ExLinkedSplashReceiver", "splashSkipArea=%s", Integer.valueOf(iOptInt2));
            hw.a("ExLinkedSplashReceiver", "schemeInfo=%s", ds.a(strOptString));
            hw.a("ExLinkedSplashReceiver", "globalSwitch=%s", ds.a(strOptString2));
            hw.a("ExLinkedSplashReceiver", "lpWhiteList=%s", ds.a(strOptString3));
            hw.a("ExLinkedSplashReceiver", "promptMapString=%s", ds.a(strOptString4));
            hw.a("ExLinkedSplashReceiver", "lpWebBlackList=%s", ds.a(strOptString5));
        }
        gk gkVar = this.f19144b;
        if (gkVar != null) {
            gkVar.j(iOptInt);
            this.f19144b.b(iOptInt2);
            this.f19144b.p(strOptString2);
            if (!TextUtils.isEmpty(strOptString)) {
                List list = (List) bk.b(strOptString, List.class, String.class);
                hw.a("ExLinkedSplashReceiver", " schemeInfo info=%s", Boolean.valueOf(list.isEmpty()));
                this.f19144b.a(new HashSet(list));
            }
            if (!TextUtils.isEmpty(strOptString3)) {
                List<String> list2 = (List) bk.b(strOptString3, List.class, String.class);
                if (TextUtils.isEmpty(strOptString4)) {
                    this.f19144b.a(list2, (Map<String, Boolean>) null);
                } else {
                    this.f19144b.a(list2, (Map<String, Boolean>) bk.b(strOptString4, Map.class, String.class, Boolean.class));
                }
            }
            if (TextUtils.isEmpty(strOptString5)) {
                return;
            }
            this.f19144b.c((List<String>) bk.b(strOptString5, List.class, String.class));
        }
    }

    private void b(CallResult<String> callResult) {
        try {
            ContentRecord contentRecordA = a(new JSONObject(callResult.getData()));
            if (contentRecordA == null) {
                hw.c("ExLinkedSplashReceiver", "content is null");
                a();
            } else {
                contentRecordA.b(true);
                LinkedSplashAd linkedSplashAdA = ph.a(this.f19143a, contentRecordA);
                linkedSplashAdA.e(true);
                a(linkedSplashAdA);
            }
        } catch (JSONException unused) {
            hw.c("ExLinkedSplashReceiver", "reqLinkedVideo onRemoteCallResult JSONException ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, LinkedSplashAd linkedSplashAd) {
        String contentId;
        String slotId;
        if (z) {
            return;
        }
        hw.c("ExLinkedSplashReceiver", "isCanDisplay false, start show normal splash. ");
        a();
        if (linkedSplashAd != null) {
            contentId = linkedSplashAd.getContentId();
            slotId = linkedSplashAd.getSlotId();
        } else {
            contentId = null;
            slotId = null;
        }
        new com.huawei.openalliance.ad.analysis.c(this.f19143a).a(this.f19143a.getPackageName(), 1, slotId, contentId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CallResult<String> callResult) {
        if (callResult.getCode() == 200) {
            hw.b("ExLinkedSplashReceiver", "reqExLinkedVideo success");
            b(callResult);
        } else {
            hw.c("ExLinkedSplashReceiver", "call reqExLinked failed");
            a();
        }
    }

    private void a(final LinkedSplashAd linkedSplashAd) {
        final IExSplashCallback iExSplashCallbackF = HiAd.a(this.f19143a).f();
        if (iExSplashCallbackF != null) {
            o.d(new Runnable() { // from class: com.huawei.openalliance.ad.inter.b.2
                @Override // java.lang.Runnable
                public void run() {
                    boolean zCanDisplayLinkedVideo = iExSplashCallbackF.canDisplayLinkedVideo(linkedSplashAd);
                    hw.b("ExLinkedSplashReceiver", "onReceive, isCanDisplay: %s", Boolean.valueOf(zCanDisplayLinkedVideo));
                    b.this.a(zCanDisplayLinkedVideo, linkedSplashAd);
                }
            });
        } else {
            hw.c("ExLinkedSplashReceiver", "exSplashCallback is null");
            a();
        }
    }

    private void a(Context context, String str, String str2, String str3) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("content_id", str);
        jSONObject.put("package_name", this.f19143a.getPackageName());
        jSONObject.put(MapKeyNames.IS_OLD_FAT, true);
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put("slotid", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            jSONObject.put("unique_id", str3);
        }
        na.a(context).a(RTCMethods.REQ_LINKED_VIDEO, jSONObject.toString(), new RemoteCallResultCallback<String>() { // from class: com.huawei.openalliance.ad.inter.b.1
            @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
            public void onRemoteCallResult(String str4, CallResult<String> callResult) {
                b.this.a(callResult);
            }
        }, String.class);
    }

    private void a(Context context, SafeIntent safeIntent) throws JSONException {
        hw.b("ExLinkedSplashReceiver", "receiver exlinkedsplash action");
        long longExtra = safeIntent.getLongExtra(SpKeys.EXSPLASH_SLOGAN_START_TIME, 0L);
        int intExtra = safeIntent.getIntExtra(SpKeys.EXSPLASH_SLOGAN_SHOW_TIME, 0);
        String stringExtra = safeIntent.getStringExtra(SpKeys.LINKED_CONTENT_ID);
        String stringExtra2 = safeIntent.getStringExtra("linked_content_slotId");
        String stringExtra3 = safeIntent.getStringExtra("unique_id");
        hw.b("ExLinkedSplashReceiver", "onReceive, EXSPLASH_START_LINKED, uniqueId: %s", stringExtra3);
        int intExtra2 = safeIntent.getIntExtra(SpKeys.EXSPLASH_REDUNDANCY_TIME, 0);
        hw.a("ExLinkedSplashReceiver", "ExLinkedSplashReceiver, startTime: %s, showTime: %s, contentId: %s", Long.valueOf(longExtra), Integer.valueOf(intExtra), stringExtra);
        context.removeStickyBroadcast(safeIntent);
        gk gkVar = this.f19144b;
        if (gkVar != null) {
            gkVar.g(longExtra);
            this.f19144b.h(intExtra);
            this.f19144b.o(stringExtra);
            this.f19144b.i(intExtra2);
        }
        a(context, stringExtra, stringExtra2, stringExtra3);
    }

    private void a() {
        na.a(this.f19143a).a(RTCMethods.SHOW_SPLASH, null, null, null);
    }

    private ContentRecord a(JSONObject jSONObject) {
        ContentRecord contentRecord;
        try {
            String strOptString = jSONObject.optString(MapKeyNames.PARAM_FROM_SERVER);
            String strOptString2 = jSONObject.optString(MapKeyNames.THIRD_MONITORS);
            String strOptString3 = jSONObject.optString(MapKeyNames.CONTENT_RECORD);
            String strOptString4 = jSONObject.optString(MapKeyNames.LANDPAGE_WHITELIST);
            if (hw.a()) {
                hw.a("ExLinkedSplashReceiver", " paramJsonObjString content= %s", ds.a(strOptString));
                hw.a("ExLinkedSplashReceiver", " thirdMonitors content= %s", ds.a(strOptString2));
                hw.a("ExLinkedSplashReceiver", " whiteList content= %s", ds.a(strOptString4));
            }
            contentRecord = (ContentRecord) bk.b(strOptString3, ContentRecord.class, new Class[0]);
            try {
                if (hw.a()) {
                    hw.a("ExLinkedSplashReceiver", " adContent content= %s", ds.a(strOptString3));
                }
                if (contentRecord != null) {
                    contentRecord.l(strOptString);
                    if (!TextUtils.isEmpty(strOptString2)) {
                        contentRecord.c((List<Monitor>) bk.b(strOptString2, List.class, Monitor.class));
                    }
                    contentRecord.w(strOptString4);
                    b(jSONObject);
                }
                return contentRecord;
            } catch (Throwable th) {
                th = th;
                hw.c("ExLinkedSplashReceiver", "handleResponse exception: %s", th.getClass().getSimpleName());
                return contentRecord;
            }
        } catch (Throwable th2) {
            th = th2;
            contentRecord = null;
        }
    }

    public b(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f19143a = applicationContext;
        this.f19144b = fp.b(applicationContext);
    }
}
