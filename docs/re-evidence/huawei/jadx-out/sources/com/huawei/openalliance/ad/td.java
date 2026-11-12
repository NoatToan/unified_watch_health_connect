package com.huawei.openalliance.ad;

import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.EventType;
import com.huawei.openalliance.ad.db.bean.EventRecord;

/* JADX INFO: loaded from: classes12.dex */
public class td implements qs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private EventRecord f20291a;

    @Override // com.huawei.openalliance.ad.qs.a
    public String a(String str) {
        if (TextUtils.isEmpty(str) || this.f20291a == null) {
            hw.a("VideoEventStrategy", "invalid para");
            return str;
        }
        if (EventType.VIDEOTIME.value().equals(this.f20291a.j())) {
            return (this.f20291a.al() == 0 || !str.contains("__HW_VIDEO_TIME__")) ? str : str.replace("__HW_VIDEO_TIME__", String.valueOf((int) Math.ceil(this.f20291a.al() / 1000.0d)));
        }
        hw.a("VideoEventStrategy", "event type not match playTime, is %s", this.f20291a.j());
        return str;
    }

    public td(EventRecord eventRecord) {
        this.f20291a = eventRecord;
    }
}
