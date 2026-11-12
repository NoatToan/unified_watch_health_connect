package com.huami.app.amazfit.wxapi;

import com.huami.watch.companion.util.ThirdPartUtil;

/* JADX INFO: loaded from: classes5.dex */
public class WXEntryActivity extends com.huami.watch.hmwatchmanager.wxapi.WXEntryActivity {
    @Override // com.huami.watch.hmwatchmanager.wxapi.WXEntryActivity
    public String provideAppId() {
        return ThirdPartUtil.getWeixinId();
    }
}
