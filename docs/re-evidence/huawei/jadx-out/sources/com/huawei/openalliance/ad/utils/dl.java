package com.huawei.openalliance.ad.utils;

import android.content.Context;
import com.huawei.openalliance.ad.beans.tags.TagCfgModel;
import com.huawei.openalliance.ad.constant.RTCMethods;
import com.huawei.openalliance.ad.constant.TagConstants;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.fv;
import com.huawei.openalliance.ad.go;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import com.huawei.openalliance.ad.na;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class dl {
    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, String str) {
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray(TagConstants.TAG_LIST_KEY);
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (dg.b(jSONObjectOptJSONObject.toString())) {
                        hw.a("TagSyncUtil", "tag obj is empty , no need to save");
                    } else {
                        go goVarA = fv.a(context);
                        String strOptString = jSONObjectOptJSONObject.optString("type");
                        String strOptString2 = jSONObjectOptJSONObject.optString("value");
                        goVarA.a(strOptString, strOptString2);
                        long jOptLong = jSONObjectOptJSONObject.optLong("updateTime");
                        goVarA.a(strOptString, jOptLong);
                        int iOptInt = jSONObjectOptJSONObject.optInt(TagConstants.TRIGGER_MODE);
                        goVarA.a(strOptString, iOptInt);
                        hw.a("TagSyncUtil", "save tag to sp, type: %s, tagValue is : %s, updateTime is : %s, triggerMode is : %s", strOptString, strOptString2, Long.valueOf(jOptLong), Integer.valueOf(iOptInt));
                    }
                }
                return;
            }
            hw.a("TagSyncUtil", "tag array is empty, no need to save");
        } catch (Throwable th) {
            hw.c("TagSyncUtil", "saveTagData error: %s", th.getClass().getSimpleName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<String> b(Context context, List<TagCfgModel> list) {
        ArrayList arrayList = new ArrayList();
        for (TagCfgModel tagCfgModel : list) {
            String strA = tagCfgModel.a();
            long jE = fv.a(context).e(strA);
            long j = Integer.parseInt(tagCfgModel.c());
            hw.a("TagSyncUtil", "sync tag: %s, interval: %s", strA, Long.valueOf(j));
            if (j < 0) {
                hw.b("TagSyncUtil", "sync tag interval less than zero");
            } else if (as.c() - jE <= j * 60000) {
                hw.a("TagSyncUtil", "query tag %s , intvl not satisfied", strA);
            } else {
                arrayList.add(strA);
            }
        }
        return arrayList;
    }

    public static void a(final Context context) {
        o.f(new Runnable() { // from class: com.huawei.openalliance.ad.utils.dl.1
            @Override // java.lang.Runnable
            public void run() {
                String str;
                List<TagCfgModel> listCF = fp.b(context).cF();
                if (bm.a(listCF)) {
                    str = "no tag need to sync";
                } else {
                    List<String> listB = dl.b(context, listCF);
                    if (!bm.a(listB)) {
                        fv.a(context).a(listB, as.c());
                        hw.a("TagSyncUtil", "do sync tag, need sync tag list is : %s", listB);
                        try {
                            na.a(context).a(RTCMethods.QUERY_USER_TAG, bm.a(listB, ","), new RemoteCallResultCallback<String>() { // from class: com.huawei.openalliance.ad.utils.dl.1.1
                                @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
                                public void onRemoteCallResult(String str2, CallResult<String> callResult) {
                                    if (callResult == null || callResult.getCode() != 200) {
                                        return;
                                    }
                                    hw.b("TagSyncUtil", "sync tag method execute success");
                                    if (dg.b(callResult.getData())) {
                                        hw.a("TagSyncUtil", "sync tag data is empty");
                                    } else {
                                        dl.b(context, callResult.getData());
                                    }
                                }
                            }, String.class);
                            return;
                        } catch (Throwable th) {
                            hw.c("TagSyncUtil", "sync tag failed: %s", th.getClass().getSimpleName());
                            return;
                        }
                    }
                    str = "interval failed, no need to sync tag";
                }
                hw.b("TagSyncUtil", str);
            }
        });
    }
}
