package com.huawei.openalliance.ad;

import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.ClickDestination;
import com.huawei.openalliance.ad.constant.EventType;
import com.huawei.openalliance.ad.db.bean.EventRecord;

/* JADX INFO: loaded from: classes12.dex */
public class sr implements qs.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private EventRecord f20281a;

    @Override // com.huawei.openalliance.ad.qs.a
    public String a(String str) {
        if (TextUtils.isEmpty(str) || this.f20281a == null) {
            hw.a("appsFlyer", "invalid para");
            return str;
        }
        if (!EventType.CLICK.value().equals(this.f20281a.j())) {
            hw.a("appsFlyer", "event type not match %s", this.f20281a.j());
            return str;
        }
        String strC = this.f20281a.c();
        if (!b(strC)) {
            hw.a("appsFlyer", "click destination not match app or harmonyApp or download, is %s", strC);
            return str;
        }
        if (str.indexOf("af_engagement_type") == -1) {
            hw.a("appsFlyer", "af key not exist");
            return str;
        }
        if (str.indexOf("click_to_store") != -1) {
            return str.replace("click_to_store", "click_to_download");
        }
        hw.a("appsFlyer", "af value replacement not exist");
        return str;
    }

    private boolean b(String str) {
        return "app".equals(str) || ClickDestination.HARMONY_APP.equals(str) || "download".equals(str);
    }

    public sr(EventRecord eventRecord) {
        this.f20281a = eventRecord;
    }
}
