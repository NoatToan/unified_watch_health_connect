package com.huawei.openalliance.ad;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hms.ads.jsb.inner.data.JsbCallBackData;
import com.huawei.openalliance.ad.activity.SafeIntent;
import com.huawei.openalliance.ad.beans.metadata.ContentExt;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.data.RewardItem;
import com.huawei.openalliance.ad.inter.listeners.IRewardAdStatusListener;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class ae extends ab {

    static class a implements IRewardAdStatusListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        RewardItem f18214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f18215b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private RemoteCallResultCallback<String> f18216c;

        @Override // com.huawei.openalliance.ad.inter.listeners.IRewardAdStatusListener
        public void onRewarded() {
            com.huawei.openalliance.ad.inter.data.i iVarB = df.b();
            if (!(iVarB instanceof com.huawei.openalliance.ad.inter.data.i)) {
                hw.c("JsbStartRewardAdActivity", "can not get reward");
                return;
            }
            if (iVarB.getRewardItem() != null) {
                this.f18214a = iVarB.getRewardItem();
            }
            j.a(this.f18216c, this.f18215b, 1000, new JsbCallBackData(this.f18214a, false, "reward.cb.reward"));
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.IRewardAdStatusListener
        public void onAdShown() {
            j.a(this.f18216c, this.f18215b, 1000, new JsbCallBackData(null, false, "reward.cb.show"));
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.IRewardAdStatusListener
        public void onAdError(int i, int i2) {
            j.a(this.f18216c, this.f18215b, 1000, new JsbCallBackData(null, false, "reward.cb.error"));
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.IRewardAdStatusListener
        public void onAdCompleted() {
            j.a(this.f18216c, this.f18215b, 1000, new JsbCallBackData(null, false, "reward.cb.completed"));
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.IRewardAdStatusListener
        public void onAdClosed() {
            j.a(this.f18216c, this.f18215b, 1000, new JsbCallBackData(null, true, "reward.cb.close"));
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.IRewardAdStatusListener
        public void onAdClicked() {
            j.a(this.f18216c, this.f18215b, 1000, new JsbCallBackData(null, false, "reward.cb.click"));
        }

        a(RemoteCallResultCallback<String> remoteCallResultCallback, String str, RewardItem rewardItem) {
            this.f18214a = rewardItem;
            this.f18216c = remoteCallResultCallback;
            this.f18215b = str;
        }
    }

    @Override // com.huawei.openalliance.ad.j, com.huawei.openalliance.ad.g
    public void a(Context context, String str, RemoteCallResultCallback<String> remoteCallResultCallback) {
        boolean zOptBoolean;
        if (hw.a()) {
            hw.a("JsbStartRewardAdActivity", "paramContent: %s", str);
        }
        ContentRecord contentRecordB = b(context, str);
        if (contentRecordB != null) {
            hw.b("JsbStartRewardAdActivity", "show reward ad: %s, apiVer: %s", contentRecordB.o(), Integer.valueOf(contentRecordB.aQ()));
            com.huawei.openalliance.ad.inter.data.i iVarA = pw.a(context, contentRecordB);
            if (iVarA != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String strOptString = jSONObject.optString(JsbMapKeyNames.H5_CUSTOM_DATA);
                    String strOptString2 = jSONObject.optString(JsbMapKeyNames.H5_USER_ID);
                    zOptBoolean = jSONObject.optBoolean("muted", true);
                    try {
                        String strOptString3 = jSONObject.optString("muted");
                        boolean zOptBoolean2 = jSONObject.optBoolean(JsbMapKeyNames.H5_REWARD_DATA_ALERTS, true);
                        RewardItem rewardItem = (RewardItem) com.huawei.openalliance.ad.utils.bk.b(jSONObject.optString(JsbMapKeyNames.REWARD_ITEM), RewardItem.class, new Class[0]);
                        if (rewardItem != null) {
                            iVarA.setRewardItem(rewardItem);
                        }
                        int iOptInt = jSONObject.optInt("audioFocusType", 1);
                        if (!TextUtils.isEmpty(strOptString)) {
                            iVarA.setCustomData(strOptString);
                        }
                        if (!TextUtils.isEmpty(strOptString2)) {
                            iVarA.setUserId(strOptString2);
                        }
                        if (iOptInt == 1 || iOptInt == 2 || iOptInt == 0) {
                            iVarA.setAudioFocusType(iOptInt);
                        }
                        zOptBoolean = com.huawei.openalliance.ad.utils.dv.a(contentRecordB, strOptString3);
                        iVarA.setMute(zOptBoolean);
                        iVarA.setMobileDataAlertSwitch(zOptBoolean2);
                        a(iVarA);
                    } catch (Throwable unused) {
                        hw.a("JsbStartRewardAdActivity", "content parse error");
                    }
                } catch (Throwable unused2) {
                    zOptBoolean = false;
                }
                iVarA.a(new a(remoteCallResultCallback, this.f19295a, iVarA.getRewardItem()));
                if (!a(context, contentRecordB, zOptBoolean, iVarA)) {
                    ca.a(a(context), iVarA);
                }
                b(remoteCallResultCallback, false);
                return;
            }
            hw.a("JsbStartRewardAdActivity", "reward is null, start activity failed");
        }
        a(remoteCallResultCallback, this.f19295a, 3002, null, true);
    }

    private boolean a(Context context, ContentRecord contentRecord, boolean z, com.huawei.openalliance.ad.inter.data.i iVar) {
        boolean z2 = (contentRecord.ah() == null || contentRecord.aH() == null || contentRecord.ah().getType() != 3) ? false : true;
        if (z2) {
            df.a(iVar);
            fk.a(context).a();
            a(context, contentRecord.I(), a(contentRecord), z);
        }
        return z2;
    }

    private void a(com.huawei.openalliance.ad.inter.data.i iVar) {
        iVar.setMediaSetVideoCfg(true);
    }

    private void a(Context context, String str, String str2, boolean z) {
        SafeIntent safeIntent = new SafeIntent(new Intent());
        safeIntent.setAction(Constants.REWARD_ACTIVITY_ACTION);
        safeIntent.putExtra("is_mute", z);
        safeIntent.putExtra("url", str);
        safeIntent.putExtra(MapKeyNames.PLAYABLE_LINK, str2);
        safeIntent.putExtra(MapKeyNames.IS_HIAD_PLAY, true);
        if (!(context instanceof Activity)) {
            safeIntent.addFlags(268435456);
        }
        context.startActivity(safeIntent);
    }

    private String a(ContentRecord contentRecord) {
        for (ContentExt contentExt : contentRecord.aH()) {
            if (MapKeyNames.PLAYABLE_LINK.equals(contentExt.a())) {
                return contentExt.b();
            }
        }
        return "";
    }

    public ae() {
        super("pps.activity.reward");
    }
}
