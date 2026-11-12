package com.xiaomi.onetrack.util;

import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import com.facebook.yrn.manager.YRNOptionsConfig;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.motion.recognition.schedule.SceneRecogBroadcastReceiver;
import com.xiaomi.onetrack.OneTrack;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f13928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f13929b;
    final /* synthetic */ String c;
    final /* synthetic */ d d;

    public g(d dVar, String str, String str2, String str3) {
        this.d = dVar;
        this.f13928a = str;
        this.f13929b = str2;
        this.c = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        try {
            if (TextUtils.isEmpty(this.f13928a)) {
                return;
            }
            if (this.f13928a.contains("http://") || this.f13928a.contains("https://")) {
                str = this.f13928a + "/api/open/device/writeBack";
            } else {
                str = "https://" + this.f13928a + "/api/open/device/writeBack";
            }
            HashMap map = new HashMap();
            map.put(YRNOptionsConfig.INSTANCE_ID, o.a().b());
            map.put(OneTrack.Param.IMEI_MD5, DeviceUtil.b(this.d.j));
            map.put("oaid", com.xiaomi.onetrack.util.oaid.a.a().a(this.d.j));
            map.put(CloudContract.COL_PROJECT_ID, this.f13929b);
            map.put(SceneRecogBroadcastReceiver.FROM_USER, this.c);
            String strB = com.xiaomi.onetrack.g.b.b(str, map, false);
            if (!TextUtils.isEmpty(strB) && !"".equals(strB)) {
                this.d.b(strB);
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            Bundle bundle = new Bundle();
            bundle.putString("hint", "注册信息失败，请检查是网络环境是否在内网");
            messageObtain.setData(bundle);
            this.d.f13925k.sendMessage(messageObtain);
        } catch (Exception e) {
            p.b(d.f13923a, e.getMessage());
        }
    }
}
