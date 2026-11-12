package com.huawei.openalliance.ad;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.inter.data.VideoInfo;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class h extends j {
    @Override // com.huawei.openalliance.ad.j, com.huawei.openalliance.ad.g
    public void a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        int i;
        if (hw.a()) {
            hw.a("JsbAdClick", "start");
        }
        JSONObject jSONObject = new JSONObject(str);
        int iOptInt = jSONObject.optInt("adType", -1);
        ContentRecord contentRecordB = b(context, str);
        if (contentRecordB != null) {
            MetaData metaDataJ = contentRecordB.j();
            if (metaDataJ != null) {
                HashMap map = new HashMap();
                map.put("appId", metaDataJ.n());
                map.put("thirdId", metaDataJ.m());
                if (iOptInt == 3 && contentRecordB.T() != null) {
                    VideoInfo videoInfo = new VideoInfo(contentRecordB.T());
                    map.put(MapKeyNames.LINKED_CUSTOM_SHOW_ID, contentRecordB.l());
                    map.put(MapKeyNames.LINKED_CUSTOM_RETURN_VIDEO_DIRECT, videoInfo.f() ? "true" : "false");
                    map.put(MapKeyNames.LINKED_CUSTOM_VIDEO_SOUND_SWITCH, videoInfo.getSoundSwitch());
                    map.put(MapKeyNames.LINKED_CUSTOM_VIDEO_PROGRESS, String.valueOf(videoInfo.b()));
                    map.put(MapKeyNames.LINKED_SPLASH_MEDIA_PATH, contentRecordB.B());
                }
                String strOptString = jSONObject.optString("type");
                if (!TextUtils.isEmpty(strOptString)) {
                    hw.b("JsbAdClick", "got action type: %s", strOptString);
                    bq.a(str, contentRecordB);
                }
                com.huawei.openalliance.ad.uriaction.interfaces.a aVarA = tu.a(a(context), contentRecordB, map);
                if (aVarA.a()) {
                    MaterialClickInfo materialClickInfoF = f(str);
                    Integer numD = d(str);
                    boolean z = materialClickInfoF.k() == null && materialClickInfoF.l() == null;
                    if (numD != null && 13 == numD.intValue() && z) {
                        materialClickInfoF.h(1);
                    }
                    if (a(context, contentRecordB)) {
                        a(aVarA, context, contentRecordB, iOptInt, numD, materialClickInfoF, jSONObject);
                        i = 1000;
                    } else {
                        hw.b("JsbAdClick", "ad is not in whitelist");
                        i = 3004;
                    }
                } else {
                    hw.b("JsbAdClick", "fail open land page");
                    i = 3003;
                }
            } else {
                i = 1000;
            }
        } else {
            hw.b("JsbAdClick", "ad not exist");
            i = 3002;
        }
        a(remoteCallResultCallback, this.f19295a, i, null, true);
    }

    private void a(com.huawei.openalliance.ad.uriaction.interfaces.a aVar, Context context, ContentRecord contentRecord, int i, Integer num, MaterialClickInfo materialClickInfo, JSONObject jSONObject) {
        pc pcVar = new pc(context, sw.a(context, i), contentRecord);
        com.huawei.openalliance.ad.processor.eventbeans.b.a aVar2 = new com.huawei.openalliance.ad.processor.eventbeans.b.a();
        aVar2.b(aVar.c()).a(num).a(h(jSONObject.optString("versionCode"))).a(jSONObject.optString("versionCode")).a(materialClickInfo);
        pcVar.a(aVar2.a());
    }

    public h() {
        super("pps.action.click");
    }
}
