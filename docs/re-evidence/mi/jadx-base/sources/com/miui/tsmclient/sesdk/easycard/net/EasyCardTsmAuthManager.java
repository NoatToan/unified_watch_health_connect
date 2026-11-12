package com.miui.tsmclient.sesdk.easycard.net;

import com.miui.tsmclient.sesdk.easycard.net.host.EasyCardHost;
import defpackage.b4s;

/* JADX INFO: loaded from: classes6.dex */
public class EasyCardTsmAuthManager extends b4s {
    @Override // com.miui.tsmclient.net.BaseAuthManager
    public void initHost() {
        this.mHost = new EasyCardHost();
    }
}
